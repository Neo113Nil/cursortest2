package org.chromium.net.impl;

import android.net.http.ConnectionMigrationOptions;
import android.net.http.DnsOptions;
import android.net.http.HttpEngine;
import android.net.http.QuicOptions;
import android.util.Log;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.TimeConversions;
import j$.util.DesugarDate;
import java.util.Date;
import java.util.Set;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.telemetry.ExperimentalOptions;
import org.chromium.net.telemetry.OptionalBoolean;
import retrofit2.Reflection$Java8$$ExternalSyntheticApiModelOutline0;

/* loaded from: classes10.dex */
class AndroidHttpEngineBuilderWrapper extends ICronetEngineBuilder {
    private static final String TAG = "HttpEngBuilderWrap";
    private static boolean sLibraryLoaderUnsupportedLogged;
    private static boolean sNQEUnsupportedLogged;
    private final HttpEngine.Builder mBackend;

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enableSdch(boolean value) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder setThreadPriority(int priority) {
        return this;
    }

    public AndroidHttpEngineBuilderWrapper(HttpEngine.Builder backend) {
        this.mBackend = backend;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public String getDefaultUserAgent() {
        String defaultUserAgent;
        defaultUserAgent = this.mBackend.getDefaultUserAgent();
        return defaultUserAgent;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder setUserAgent(String userAgent) {
        this.mBackend.setUserAgent(userAgent);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder setStoragePath(String value) {
        this.mBackend.setStoragePath(value);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader loader) {
        if (!sLibraryLoaderUnsupportedLogged) {
            Log.i(TAG, "Custom library loader is unsupported when HttpEngineNativeProvider is used.");
            sLibraryLoaderUnsupportedLogged = true;
        }
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enableQuic(boolean value) {
        this.mBackend.setEnableQuic(value);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enableHttp2(boolean value) {
        this.mBackend.setEnableHttp2(value);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enableBrotli(boolean value) {
        this.mBackend.setEnableBrotli(value);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enableHttpCache(int cacheMode, long maxSize) {
        this.mBackend.setEnableHttpCache(cacheMode, maxSize);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder addQuicHint(String host, int port, int alternatePort) {
        this.mBackend.addQuicHint(host, port, alternatePort);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder addPublicKeyPins(String hostName, Set<byte[]> pinsSha256, boolean includeSubdomains, Date expirationDate) {
        Instant instant;
        HttpEngine.Builder builder = this.mBackend;
        instant = DesugarDate.toInstant(expirationDate);
        builder.addPublicKeyPins(hostName, pinsSha256, includeSubdomains, TimeConversions.convert(instant));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean value) {
        this.mBackend.setEnablePublicKeyPinningBypassForLocalTrustAnchors(value);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder setExperimentalOptions(String stringOptions) {
        ExperimentalOptions experimentalOptions = new ExperimentalOptions(stringOptions);
        this.mBackend.setConnectionMigrationOptions(parseConnectionMigrationOptions(experimentalOptions));
        this.mBackend.setDnsOptions(parseDnsOptions(experimentalOptions));
        this.mBackend.setQuicOptions(parseQuicOptions(experimentalOptions));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ICronetEngineBuilder enableNetworkQualityEstimator(boolean value) {
        if (!sNQEUnsupportedLogged) {
            Log.i(TAG, "NetworkQualityEstimator is unsupported when HttpEngineNativeProvider is used");
            sNQEUnsupportedLogged = true;
        }
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public ExperimentalCronetEngine build() {
        HttpEngine build;
        build = this.mBackend.build();
        return new AndroidHttpEngineWrapper(build);
    }

    public static ConnectionMigrationOptions parseConnectionMigrationOptions(ExperimentalOptions options) {
        ConnectionMigrationOptions build;
        ConnectionMigrationOptions.Builder m15644m = Reflection$Java8$$ExternalSyntheticApiModelOutline0.m15644m();
        m15644m.setDefaultNetworkMigration(optionalBooleanToMigrationOptionState(options.getMigrateSessionsOnNetworkChangeV2Option()));
        m15644m.setPathDegradationMigration(optionalBooleanToMigrationOptionState(options.getAllowPortMigration()));
        OptionalBoolean migrateSessionsEarlyV2 = options.getMigrateSessionsEarlyV2();
        m15644m.setAllowNonDefaultNetworkUsage(optionalBooleanToMigrationOptionState(migrateSessionsEarlyV2));
        if (migrateSessionsEarlyV2 == OptionalBoolean.TRUE) {
            m15644m.setPathDegradationMigration(optionalBooleanToMigrationOptionState(OptionalBoolean.TRUE));
        }
        build = m15644m.build();
        return build;
    }

    public static DnsOptions parseDnsOptions(ExperimentalOptions options) {
        DnsOptions.StaleDnsOptions.Builder allowCrossNetworkUsage;
        DnsOptions.Builder useHttpStackDnsResolver;
        DnsOptions.Builder staleDns;
        DnsOptions.StaleDnsOptions build;
        DnsOptions.Builder staleDnsOptions;
        DnsOptions.Builder preestablishConnectionsToStaleDnsResults;
        DnsOptions build2;
        DnsOptions.StaleDnsOptions.Builder m15646m = Reflection$Java8$$ExternalSyntheticApiModelOutline0.m15646m();
        int staleDnsDelayMillisOption = options.getStaleDnsDelayMillisOption();
        if (staleDnsDelayMillisOption != -1) {
            m15646m.setFreshLookupTimeout(TimeConversions.convert(Duration.ofMillis(staleDnsDelayMillisOption)));
        }
        int staleDnsMaxExpiredTimeMillisOption = options.getStaleDnsMaxExpiredTimeMillisOption();
        if (staleDnsMaxExpiredTimeMillisOption != -1) {
            m15646m.setMaxExpiredDelay(TimeConversions.convert(Duration.ofMillis(staleDnsMaxExpiredTimeMillisOption)));
        }
        allowCrossNetworkUsage = m15646m.setAllowCrossNetworkUsage(optionalBooleanToMigrationOptionState(options.getStaleDnsAllowOtherNetworkOption()));
        allowCrossNetworkUsage.setUseStaleOnNameNotResolved(optionalBooleanToMigrationOptionState(options.getStaleDnsUseStaleOnNameNotResolvedOption()));
        DnsOptions.Builder m15645m = Reflection$Java8$$ExternalSyntheticApiModelOutline0.m15645m();
        useHttpStackDnsResolver = m15645m.setUseHttpStackDnsResolver(optionalBooleanToMigrationOptionState(options.getAsyncDnsEnableOption()));
        staleDns = useHttpStackDnsResolver.setStaleDns(optionalBooleanToMigrationOptionState(options.getStaleDnsEnableOption()));
        build = m15646m.build();
        staleDnsOptions = staleDns.setStaleDnsOptions(build);
        preestablishConnectionsToStaleDnsResults = staleDnsOptions.setPreestablishConnectionsToStaleDnsResults(optionalBooleanToMigrationOptionState(options.getRaceStaleDnsOnConnection()));
        preestablishConnectionsToStaleDnsResults.setPersistHostCache(optionalBooleanToMigrationOptionState(options.getStaleDnsPersistToDiskOption()));
        int staleDnsPersistDelayMillisOption = options.getStaleDnsPersistDelayMillisOption();
        if (staleDnsPersistDelayMillisOption != -1) {
            m15645m.setPersistHostCachePeriod(TimeConversions.convert(Duration.ofMillis(staleDnsPersistDelayMillisOption)));
        }
        build2 = m15645m.build();
        return build2;
    }

    public static QuicOptions parseQuicOptions(ExperimentalOptions options) {
        QuicOptions build;
        QuicOptions.Builder m15649m = Reflection$Java8$$ExternalSyntheticApiModelOutline0.m15649m();
        if (options.getHostWhitelist() != null) {
            for (String str : options.getHostWhitelist().split(",")) {
                m15649m.addAllowedQuicHost(str);
            }
        }
        int maxServerConfigsStoredInPropertiesOption = options.getMaxServerConfigsStoredInPropertiesOption();
        if (maxServerConfigsStoredInPropertiesOption != -1) {
            m15649m.setInMemoryServerConfigsCacheSize(maxServerConfigsStoredInPropertiesOption);
        }
        String userAgentId = options.getUserAgentId();
        if (userAgentId != null) {
            m15649m.setHandshakeUserAgent(userAgentId);
        }
        int idleConnectionTimeoutSecondsOption = options.getIdleConnectionTimeoutSecondsOption();
        if (idleConnectionTimeoutSecondsOption != -1) {
            m15649m.setIdleConnectionTimeout(TimeConversions.convert(Duration.ofSeconds(idleConnectionTimeoutSecondsOption)));
        }
        build = m15649m.build();
        return build;
    }

    /* renamed from: org.chromium.net.impl.AndroidHttpEngineBuilderWrapper$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$chromium$net$telemetry$OptionalBoolean;

        static {
            int[] iArr = new int[OptionalBoolean.values().length];
            $SwitchMap$org$chromium$net$telemetry$OptionalBoolean = iArr;
            try {
                iArr[OptionalBoolean.TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$chromium$net$telemetry$OptionalBoolean[OptionalBoolean.FALSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$chromium$net$telemetry$OptionalBoolean[OptionalBoolean.UNSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static int optionalBooleanToMigrationOptionState(OptionalBoolean value) {
        int i = AnonymousClass1.$SwitchMap$org$chromium$net$telemetry$OptionalBoolean[value.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i == 3) {
                    return 0;
                }
                throw new AssertionError("Invalid OptionalBoolean value: " + String.valueOf(value));
            }
        }
        return i2;
    }
}
