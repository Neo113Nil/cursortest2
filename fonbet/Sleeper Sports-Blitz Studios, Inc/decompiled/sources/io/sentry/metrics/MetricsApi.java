package io.sentry.metrics;

import io.sentry.HostnameCache;
import io.sentry.IScope;
import io.sentry.ISpan;
import io.sentry.PropagationContext;
import io.sentry.Scopes;
import io.sentry.SentryAttribute;
import io.sentry.SentryAttributeType;
import io.sentry.SentryAttributes;
import io.sentry.SentryDate;
import io.sentry.SentryLevel;
import io.sentry.SentryLogEventAttributeValue;
import io.sentry.SentryMetricsEvent;
import io.sentry.SentryOptions;
import io.sentry.SpanContext;
import io.sentry.SpanId;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import io.sentry.util.Platform;
import io.sentry.util.TracingUtils;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class MetricsApi implements IMetricsApi {
    private final Scopes scopes;

    public MetricsApi(Scopes scopes) {
        this.scopes = scopes;
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(String str) {
        captureMetrics(SentryMetricsParameters.create(null, null), str, "counter", Double.valueOf(1.0d), null);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(String str, Double d) {
        captureMetrics(SentryMetricsParameters.create(null, null), str, "counter", d, null);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(String str, String str2) {
        captureMetrics(SentryMetricsParameters.create(null, null), str, "counter", Double.valueOf(1.0d), str2);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(String str, Double d, String str2) {
        captureMetrics(SentryMetricsParameters.create(null, null), str, "counter", d, str2);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void count(String str, Double d, String str2, SentryMetricsParameters sentryMetricsParameters) {
        captureMetrics(sentryMetricsParameters, str, "counter", d, str2);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void distribution(String str, Double d) {
        captureMetrics(SentryMetricsParameters.create(null, null), str, "distribution", d, null);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void distribution(String str, Double d, String str2) {
        captureMetrics(SentryMetricsParameters.create(null, null), str, "distribution", d, str2);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void distribution(String str, Double d, String str2, SentryMetricsParameters sentryMetricsParameters) {
        captureMetrics(sentryMetricsParameters, str, "distribution", d, str2);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void gauge(String str, Double d) {
        captureMetrics(SentryMetricsParameters.create(null, null), str, "gauge", d, null);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void gauge(String str, Double d, String str2) {
        captureMetrics(SentryMetricsParameters.create(null, null), str, "gauge", d, str2);
    }

    @Override // io.sentry.metrics.IMetricsApi
    public void gauge(String str, Double d, String str2, SentryMetricsParameters sentryMetricsParameters) {
        captureMetrics(sentryMetricsParameters, str, "gauge", d, str2);
    }

    private void captureMetrics(SentryMetricsParameters sentryMetricsParameters, String str, String str2, Double d, String str3) {
        SentryOptions options = this.scopes.getOptions();
        try {
            if (!this.scopes.isEnabled()) {
                options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'metrics' call is a no-op.", new Object[0]);
                return;
            }
            if (!options.getMetrics().isEnabled()) {
                options.getLogger().log(SentryLevel.WARNING, "Sentry Metrics is disabled and this 'metrics' call is a no-op.", new Object[0]);
                return;
            }
            if (str == null || str2 == null || d == null) {
                return;
            }
            SentryDate timestamp = sentryMetricsParameters.getTimestamp();
            if (timestamp == null) {
                timestamp = options.getDateProvider().now();
            }
            SentryDate sentryDate = timestamp;
            IScope combinedScopeView = this.scopes.getCombinedScopeView();
            PropagationContext propagationContext = combinedScopeView.getPropagationContext();
            ISpan span = combinedScopeView.getSpan();
            if (span == null) {
                TracingUtils.maybeUpdateBaggage(combinedScopeView, options);
            }
            SentryId traceId = span == null ? propagationContext.getTraceId() : span.getSpanContext().getTraceId();
            SpanId spanId = span == null ? propagationContext.getSpanId() : span.getSpanContext().getSpanId();
            SentryMetricsEvent sentryMetricsEvent = new SentryMetricsEvent(traceId, sentryDate, str, str2, d);
            sentryMetricsEvent.setSpanId(spanId);
            sentryMetricsEvent.setUnit(str3);
            sentryMetricsEvent.setAttributes(createAttributes(sentryMetricsParameters));
            this.scopes.getClient().captureMetric(sentryMetricsEvent, combinedScopeView, sentryMetricsParameters.getHint());
        } catch (Throwable th) {
            options.getLogger().log(SentryLevel.ERROR, "Error while capturing metrics event", th);
        }
    }

    private HashMap<String, SentryLogEventAttributeValue> createAttributes(SentryMetricsParameters sentryMetricsParameters) {
        HashMap<String, SentryLogEventAttributeValue> hashMap = new HashMap<>();
        String origin = sentryMetricsParameters.getOrigin();
        if (!SpanContext.DEFAULT_ORIGIN.equalsIgnoreCase(origin)) {
            hashMap.put("sentry.origin", new SentryLogEventAttributeValue(SentryAttributeType.STRING, origin));
        }
        SentryAttributes attributes = sentryMetricsParameters.getAttributes();
        if (attributes != null) {
            for (SentryAttribute sentryAttribute : attributes.getAttributes().values()) {
                Object value = sentryAttribute.getValue();
                hashMap.put(sentryAttribute.getName(), new SentryLogEventAttributeValue(sentryAttribute.getType() == null ? getType(value) : sentryAttribute.getType(), value));
            }
        }
        SdkVersion sdkVersion = this.scopes.getOptions().getSdkVersion();
        if (sdkVersion != null) {
            hashMap.put("sentry.sdk.name", new SentryLogEventAttributeValue(SentryAttributeType.STRING, sdkVersion.getName()));
            hashMap.put("sentry.sdk.version", new SentryLogEventAttributeValue(SentryAttributeType.STRING, sdkVersion.getVersion()));
        }
        String environment = this.scopes.getOptions().getEnvironment();
        if (environment != null) {
            hashMap.put("sentry.environment", new SentryLogEventAttributeValue(SentryAttributeType.STRING, environment));
        }
        SentryId replayId = this.scopes.getCombinedScopeView().getReplayId();
        if (!SentryId.EMPTY_ID.equals(replayId)) {
            hashMap.put("sentry.replay_id", new SentryLogEventAttributeValue(SentryAttributeType.STRING, replayId.toString()));
        } else {
            SentryId replayId2 = this.scopes.getOptions().getReplayController().getReplayId();
            if (!SentryId.EMPTY_ID.equals(replayId2)) {
                hashMap.put("sentry.replay_id", new SentryLogEventAttributeValue(SentryAttributeType.STRING, replayId2.toString()));
                hashMap.put("sentry._internal.replay_is_buffering", new SentryLogEventAttributeValue(SentryAttributeType.BOOLEAN, (Object) true));
            }
        }
        String release = this.scopes.getOptions().getRelease();
        if (release != null) {
            hashMap.put("sentry.release", new SentryLogEventAttributeValue(SentryAttributeType.STRING, release));
        }
        if (Platform.isJvm()) {
            setServerName(hashMap);
        }
        setUser(hashMap);
        return hashMap;
    }

    private void setServerName(HashMap<String, SentryLogEventAttributeValue> hashMap) {
        String hostname;
        SentryOptions options = this.scopes.getOptions();
        String serverName = options.getServerName();
        if (serverName != null) {
            hashMap.put("server.address", new SentryLogEventAttributeValue(SentryAttributeType.STRING, serverName));
        } else {
            if (!options.isAttachServerName() || (hostname = HostnameCache.getInstance().getHostname()) == null) {
                return;
            }
            hashMap.put("server.address", new SentryLogEventAttributeValue(SentryAttributeType.STRING, hostname));
        }
    }

    private void setUser(HashMap<String, SentryLogEventAttributeValue> hashMap) {
        User user = this.scopes.getCombinedScopeView().getUser();
        if (user == null) {
            String distinctId = this.scopes.getOptions().getDistinctId();
            if (distinctId != null) {
                hashMap.put("user.id", new SentryLogEventAttributeValue(SentryAttributeType.STRING, distinctId));
                return;
            }
            return;
        }
        String id = user.getId();
        if (id != null) {
            hashMap.put("user.id", new SentryLogEventAttributeValue(SentryAttributeType.STRING, id));
        }
        String username = user.getUsername();
        if (username != null) {
            hashMap.put("user.name", new SentryLogEventAttributeValue(SentryAttributeType.STRING, username));
        }
        String email = user.getEmail();
        if (email != null) {
            hashMap.put("user.email", new SentryLogEventAttributeValue(SentryAttributeType.STRING, email));
        }
    }

    private SentryAttributeType getType(Object obj) {
        if (obj instanceof Boolean) {
            return SentryAttributeType.BOOLEAN;
        }
        if (obj instanceof Integer) {
            return SentryAttributeType.INTEGER;
        }
        if (obj instanceof Number) {
            return SentryAttributeType.DOUBLE;
        }
        return SentryAttributeType.STRING;
    }
}
