package com.unity3d.services.core.request.metrics;

import com.safedk.android.utils.j;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.properties.InitializationStatusReader;
import io.sentry.SentryEvent;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: MetricSender.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ.\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!H\u0016J\u0016\u0010\"\u001a\u00020\u001a2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020!0$H\u0016J\u0006\u0010%\u001a\u00020\u001aR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n \u0018*\u0004\u0018\u00010\u00110\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/unity3d/services/core/request/metrics/MetricSender;", "Lcom/unity3d/services/core/request/metrics/MetricSenderBase;", "Lcom/unity3d/services/core/di/IServiceComponent;", j.c, "Lcom/unity3d/services/core/configuration/Configuration;", "initializationStatusReader", "Lcom/unity3d/services/core/properties/InitializationStatusReader;", SentryEvent.JsonKeys.LOGGER, "Lcom/unity3d/ads/core/log/Logger;", "(Lcom/unity3d/services/core/configuration/Configuration;Lcom/unity3d/services/core/properties/InitializationStatusReader;Lcom/unity3d/ads/core/log/Logger;)V", "commonTags", "Lcom/unity3d/services/core/request/metrics/MetricCommonTags;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "httpClientProvider", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "metricEndPoint", "", "getMetricEndPoint", "()Ljava/lang/String;", "metricSampleRate", "scope", "Lkotlinx/coroutines/CoroutineScope;", "sessionToken", "kotlin.jvm.PlatformType", "sendEvent", "", "event", "value", "tags", "", "sendMetric", "metric", "Lcom/unity3d/services/core/request/metrics/Metric;", "sendMetrics", "metrics", "", "shutdown", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public class MetricSender extends MetricSenderBase implements IServiceComponent {
    private final MetricCommonTags commonTags;
    private final ISDKDispatchers dispatchers;
    private final HttpClientProvider httpClientProvider;
    private final Logger logger;
    private final String metricEndPoint;
    private final String metricSampleRate;
    private final CoroutineScope scope;
    private final String sessionToken;

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSender(Configuration configuration, InitializationStatusReader initializationStatusReader, Logger logger) {
        super(initializationStatusReader);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(initializationStatusReader, "initializationStatusReader");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
        MetricCommonTags metricCommonTags = new MetricCommonTags();
        metricCommonTags.updateWithConfig(configuration);
        this.commonTags = metricCommonTags;
        this.metricSampleRate = String.valueOf(MathKt.roundToInt(configuration.getMetricSampleRate()));
        this.sessionToken = configuration.getSessionToken();
        MetricSender metricSender = this;
        ISDKDispatchers iSDKDispatchers = (ISDKDispatchers) metricSender.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class));
        this.dispatchers = iSDKDispatchers;
        this.httpClientProvider = (HttpClientProvider) metricSender.getServiceProvider().getRegistry().getService("", Reflection.getOrCreateKotlinClass(HttpClientProvider.class));
        this.scope = CoroutineScopeKt.CoroutineScope(iSDKDispatchers.getIo());
        this.metricEndPoint = configuration.getMetricsUrl();
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public String getMetricEndPoint() {
        return this.metricEndPoint;
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(String event, String value, Map<String, String> tags) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(tags, "tags");
        if (event.length() == 0) {
            Logger.DefaultImpls.trace$default(this.logger, "Metric event not sent due to being null or empty: " + event, null, 2, null);
        } else {
            sendMetrics(CollectionsKt.listOf(new Metric(event, value, tags)));
        }
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetric(Metric metric) {
        Intrinsics.checkNotNullParameter(metric, "metric");
        sendMetrics(CollectionsKt.listOf(metric));
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetrics(List<Metric> metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        if (metrics.isEmpty()) {
            Logger.DefaultImpls.trace$default(this.logger, "Metrics event not send due to being empty", null, 2, null);
            return;
        }
        String metricEndPoint = getMetricEndPoint();
        if (metricEndPoint == null || StringsKt.isBlank(metricEndPoint)) {
            Logger.DefaultImpls.trace$default(this.logger, "Metrics: " + metrics + " was not sent to null or empty endpoint: " + getMetricEndPoint(), null, 2, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(this.scope, new MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE, this, metrics), null, new MetricSender$sendMetrics$1(this, metrics, null), 2, null);
        }
    }

    public final void shutdown() {
        this.commonTags.shutdown();
    }
}
