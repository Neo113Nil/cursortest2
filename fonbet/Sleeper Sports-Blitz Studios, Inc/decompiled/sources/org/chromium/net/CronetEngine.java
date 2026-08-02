package org.chromium.net;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.base.metrics.ScopedSysTraceEvent;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ConnectionMigrationOptions;
import org.chromium.net.CronetProvider;
import org.chromium.net.DnsOptions;
import org.chromium.net.ExperimentalOptionsTranslator;
import org.chromium.net.QuicOptions;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.CronetLogger;
import org.chromium.net.impl.CronetLoggerFactory;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public abstract class CronetEngine {
    public static final int ACTIVE_REQUEST_COUNT_UNKNOWN = -1;
    public static final int CONNECTION_METRIC_UNKNOWN = -1;
    public static final int EFFECTIVE_CONNECTION_TYPE_2G = 3;
    public static final int EFFECTIVE_CONNECTION_TYPE_3G = 4;
    public static final int EFFECTIVE_CONNECTION_TYPE_4G = 5;
    public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE = 1;
    public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G = 2;
    public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN = 0;
    private static final String TAG = "CronetEngine";
    public static final long UNBIND_NETWORK_HANDLE = -1;

    public void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public void addRttListener(NetworkQualityRttListener listener) {
    }

    public void addThroughputListener(NetworkQualityThroughputListener listener) {
    }

    public void bindToNetwork(long networkHandle) {
    }

    public void configureNetworkQualityEstimatorForTesting(boolean useLocalHostRequests, boolean useSmallerResponses, boolean disableOfflineCheck) {
    }

    public abstract URLStreamHandlerFactory createURLStreamHandlerFactory();

    public int getActiveRequestCount() {
        return -1;
    }

    public int getDownstreamThroughputKbps() {
        return -1;
    }

    public int getEffectiveConnectionType() {
        return 0;
    }

    @Deprecated
    public abstract byte[] getGlobalMetricsDeltas();

    public int getHttpRttMs() {
        return -1;
    }

    public int getTransportRttMs() {
        return -1;
    }

    public abstract String getVersionString();

    public abstract UrlRequest.Builder newUrlRequestBuilder(String url, UrlRequest.Callback callback, Executor executor);

    public abstract URLConnection openConnection(URL url) throws IOException;

    public void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public void removeRttListener(NetworkQualityRttListener listener) {
    }

    public void removeThroughputListener(NetworkQualityThroughputListener listener) {
    }

    public abstract void shutdown();

    public void startNetLogToDisk(String dirPath, boolean logAll, int maxSize) {
    }

    public abstract void startNetLogToFile(String fileName, boolean logAll);

    public abstract void stopNetLog();

    public static class Builder {
        public static final int HTTP_CACHE_DISABLED = 0;
        public static final int HTTP_CACHE_DISK = 3;
        public static final int HTTP_CACHE_DISK_NO_HTTP = 2;
        public static final int HTTP_CACHE_IN_MEMORY = 1;
        private static final String TAG = "CronetEngine.Builder";
        protected final ICronetEngineBuilder mBuilderDelegate;
        private final List<ExperimentalOptionsTranslator.JsonPatch> mExperimentalOptionsPatches;
        protected JSONObject mParsedExperimentalOptions;

        public static abstract class LibraryLoader {
            public abstract void loadLibrary(String libName);
        }

        @Deprecated
        public Builder enableSdch(boolean value) {
            return this;
        }

        public Builder(Context context) {
            this(createBuilderDelegate(context));
        }

        public Builder(ICronetEngineBuilder builderDelegate) {
            this.mExperimentalOptionsPatches = new ArrayList();
            this.mBuilderDelegate = builderDelegate;
        }

        public String getDefaultUserAgent() {
            return this.mBuilderDelegate.getDefaultUserAgent();
        }

        public Builder setUserAgent(String userAgent) {
            this.mBuilderDelegate.setUserAgent(userAgent);
            return this;
        }

        public Builder setStoragePath(String value) {
            this.mBuilderDelegate.setStoragePath(value);
            return this;
        }

        public Builder setLibraryLoader(LibraryLoader loader) {
            this.mBuilderDelegate.setLibraryLoader(loader);
            return this;
        }

        public Builder enableQuic(boolean value) {
            this.mBuilderDelegate.enableQuic(value);
            return this;
        }

        public Builder enableHttp2(boolean value) {
            this.mBuilderDelegate.enableHttp2(value);
            return this;
        }

        public Builder enableBrotli(boolean value) {
            this.mBuilderDelegate.enableBrotli(value);
            return this;
        }

        public Builder enableHttpCache(int cacheMode, long maxSize) {
            this.mBuilderDelegate.enableHttpCache(cacheMode, maxSize);
            return this;
        }

        public Builder addQuicHint(String host, int port, int alternatePort) {
            this.mBuilderDelegate.addQuicHint(host, port, alternatePort);
            return this;
        }

        public Builder addPublicKeyPins(String hostName, Set<byte[]> pinsSha256, boolean includeSubdomains, Date expirationDate) {
            this.mBuilderDelegate.addPublicKeyPins(hostName, pinsSha256, includeSubdomains, expirationDate);
            return this;
        }

        public Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean value) {
            this.mBuilderDelegate.enablePublicKeyPinningBypassForLocalTrustAnchors(value);
            return this;
        }

        @Deprecated
        public Builder setThreadPriority(int priority) {
            this.mBuilderDelegate.setThreadPriority(priority);
            return this;
        }

        public Builder enableNetworkQualityEstimator(boolean value) {
            this.mBuilderDelegate.enableNetworkQualityEstimator(value);
            return this;
        }

        public Builder setQuicOptions(final QuicOptions quicOptions) {
            if (this.mBuilderDelegate.getSupportedConfigOptions().contains(3)) {
                this.mBuilderDelegate.setQuicOptions(quicOptions);
                return this;
            }
            this.mExperimentalOptionsPatches.add(new ExperimentalOptionsTranslator.JsonPatch() { // from class: org.chromium.net.CronetEngine$Builder$$ExternalSyntheticLambda0
                @Override // org.chromium.net.ExperimentalOptionsTranslator.JsonPatch
                public final void applyTo(JSONObject jSONObject) {
                    ExperimentalOptionsTranslator.quicOptionsToJson(jSONObject, QuicOptions.this);
                }
            });
            return this;
        }

        public Builder setQuicOptions(QuicOptions.Builder quicOptionsBuilder) {
            return setQuicOptions(quicOptionsBuilder.build());
        }

        public Builder setDnsOptions(final DnsOptions dnsOptions) {
            if (this.mBuilderDelegate.getSupportedConfigOptions().contains(2)) {
                this.mBuilderDelegate.setDnsOptions(dnsOptions);
                return this;
            }
            this.mExperimentalOptionsPatches.add(new ExperimentalOptionsTranslator.JsonPatch() { // from class: org.chromium.net.CronetEngine$Builder$$ExternalSyntheticLambda2
                @Override // org.chromium.net.ExperimentalOptionsTranslator.JsonPatch
                public final void applyTo(JSONObject jSONObject) {
                    ExperimentalOptionsTranslator.dnsOptionsToJson(jSONObject, DnsOptions.this);
                }
            });
            return this;
        }

        public Builder setDnsOptions(DnsOptions.Builder dnsOptions) {
            return setDnsOptions(dnsOptions.build());
        }

        public Builder setConnectionMigrationOptions(final ConnectionMigrationOptions connectionMigrationOptions) {
            if (this.mBuilderDelegate.getSupportedConfigOptions().contains(1)) {
                this.mBuilderDelegate.setConnectionMigrationOptions(connectionMigrationOptions);
                return this;
            }
            this.mExperimentalOptionsPatches.add(new ExperimentalOptionsTranslator.JsonPatch() { // from class: org.chromium.net.CronetEngine$Builder$$ExternalSyntheticLambda1
                @Override // org.chromium.net.ExperimentalOptionsTranslator.JsonPatch
                public final void applyTo(JSONObject jSONObject) {
                    ExperimentalOptionsTranslator.connectionMigrationOptionsToJson(jSONObject, ConnectionMigrationOptions.this);
                }
            });
            return this;
        }

        public Builder setConnectionMigrationOptions(ConnectionMigrationOptions.Builder connectionMigrationOptionsBuilder) {
            return setConnectionMigrationOptions(connectionMigrationOptionsBuilder.build());
        }

        public Builder setProxyOptions(ProxyOptions proxyOptions) {
            if (!this.mBuilderDelegate.getSupportedConfigOptions().contains(4)) {
                throw new UnsupportedOperationException("This Cronet implementation does not support ProxyOptions");
            }
            this.mBuilderDelegate.setProxyOptions(proxyOptions);
            return this;
        }

        protected ExperimentalCronetEngine buildExperimental() {
            int implApiLevel = getImplApiLevel(this.mBuilderDelegate);
            if (implApiLevel != -1 && implApiLevel < getMaximumApiLevel()) {
                Log.w(TAG, "The implementation version is lower than the API version. Calls to methods added in API " + (implApiLevel + 1) + " and newer will likely have no effect.");
            }
            maybeSetExperimentalOptions();
            return this.mBuilderDelegate.build();
        }

        private void maybeSetExperimentalOptions() {
            JSONObject applyJsonPatches = ExperimentalOptionsTranslator.applyJsonPatches(this.mParsedExperimentalOptions, this.mExperimentalOptionsPatches);
            if (applyJsonPatches != null) {
                this.mBuilderDelegate.setExperimentalOptions(applyJsonPatches.toString());
            }
        }

        public CronetEngine build() {
            return buildExperimental();
        }

        private static ICronetEngineBuilder createBuilderDelegate(Context context) {
            ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetEngine#createBuilderDelegate");
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                CronetProvider.ProviderInfo providerInfo = getEnabledCronetProviders(context, new ArrayList(CronetProvider.getAllProviderInfos(context))).get(0);
                CronetLogger createLogger = CronetLoggerFactory.createLogger(context, providerInfo.logSource);
                CronetLogger.CronetEngineBuilderInitializedInfo cronetEngineBuilderInitializedInfo = new CronetLogger.CronetEngineBuilderInitializedInfo();
                try {
                    cronetEngineBuilderInitializedInfo.creationSuccessful = false;
                    cronetEngineBuilderInitializedInfo.author = CronetLogger.CronetEngineBuilderInitializedInfo.Author.API;
                    cronetEngineBuilderInitializedInfo.source = providerInfo.logSource;
                    cronetEngineBuilderInitializedInfo.uid = Process.myUid();
                    cronetEngineBuilderInitializedInfo.apiVersion = new CronetLogger.CronetVersion(ApiVersion.getCronetVersion());
                    if (Log.isLoggable(TAG, 3)) {
                        Log.d(TAG, String.format("Using '%s' provider for creating CronetEngine.Builder.", providerInfo.provider));
                    }
                    ICronetEngineBuilder iCronetEngineBuilder = providerInfo.provider.createBuilder().mBuilderDelegate;
                    String implCronetVersion = getImplCronetVersion(iCronetEngineBuilder);
                    if (implCronetVersion != null) {
                        cronetEngineBuilderInitializedInfo.implVersion = new CronetLogger.CronetVersion(implCronetVersion);
                    }
                    cronetEngineBuilderInitializedInfo.cronetInitializationRef = iCronetEngineBuilder.getLogCronetInitializationRef();
                    cronetEngineBuilderInitializedInfo.creationSuccessful = true;
                    if (scoped != null) {
                        scoped.close();
                    }
                    return iCronetEngineBuilder;
                } finally {
                    cronetEngineBuilderInitializedInfo.engineBuilderCreatedLatencyMillis = (int) (SystemClock.uptimeMillis() - uptimeMillis);
                    createLogger.logCronetEngineBuilderInitializedInfo(cronetEngineBuilderInitializedInfo);
                }
            } catch (Throwable th) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        static List<CronetProvider.ProviderInfo> getEnabledCronetProviders(Context context, List<CronetProvider.ProviderInfo> providers) {
            if (providers.isEmpty()) {
                throw new RuntimeException("Unable to find any Cronet provider. Have you included all necessary jars?");
            }
            Iterator<CronetProvider.ProviderInfo> it = providers.iterator();
            while (it.hasNext()) {
                if (!it.next().provider.isEnabled()) {
                    it.remove();
                }
            }
            if (providers.isEmpty()) {
                throw new RuntimeException("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
            }
            Collections.sort(providers, new Comparator<CronetProvider.ProviderInfo>() { // from class: org.chromium.net.CronetEngine.Builder.1
                @Override // java.util.Comparator
                public int compare(CronetProvider.ProviderInfo p1, CronetProvider.ProviderInfo p2) {
                    if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(p1.provider.getName())) {
                        return 1;
                    }
                    if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(p2.provider.getName())) {
                        return -1;
                    }
                    return -Builder.compareVersions(p1.provider.getVersion(), p2.provider.getVersion());
                }
            });
            return providers;
        }

        static int compareVersions(String s1, String s2) {
            if (s1 == null || s2 == null) {
                throw new IllegalArgumentException("The input values cannot be null");
            }
            String[] split = s1.split("\\.");
            String[] split2 = s2.split("\\.");
            for (int i = 0; i < split.length && i < split2.length; i++) {
                try {
                    int parseInt = Integer.parseInt(split[i]);
                    int parseInt2 = Integer.parseInt(split2[i]);
                    if (parseInt != parseInt2) {
                        return Integer.signum(parseInt - parseInt2);
                    }
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Unable to convert version segments into integers: " + split[i] + " & " + split2[i], e);
                }
            }
            return Integer.signum(split.length - split2.length);
        }

        private int getMaximumApiLevel() {
            return ApiVersion.getMaximumAvailableApiLevel();
        }

        private static Method getImplVersionMethod(ICronetEngineBuilder builderDelegate, String method) {
            try {
                return builderDelegate.getClass().getClassLoader().loadClass("org.chromium.net.impl.ImplVersion").getMethod(method, null);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                return null;
            }
        }

        private static int getImplApiLevel(ICronetEngineBuilder builderDelegate) {
            try {
                Method implVersionMethod = getImplVersionMethod(builderDelegate, "getApiLevel");
                if (implVersionMethod == null) {
                    return -1;
                }
                return ((Integer) implVersionMethod.invoke(null, null)).intValue();
            } catch (ReflectiveOperationException e) {
                throw new RuntimeException("Failed to retrieve Cronet impl API level", e);
            }
        }

        private static String getImplCronetVersion(ICronetEngineBuilder builderDelegate) {
            try {
                Method implVersionMethod = getImplVersionMethod(builderDelegate, "getCronetVersion");
                if (implVersionMethod == null) {
                    return null;
                }
                return (String) implVersionMethod.invoke(null, null);
            } catch (ReflectiveOperationException e) {
                throw new RuntimeException("Failed to retrieve Cronet impl version", e);
            }
        }
    }

    public BidirectionalStream.Builder newBidirectionalStreamBuilder(String url, BidirectionalStream.Callback callback, Executor executor) {
        throw new UnsupportedOperationException("Not implemented.");
    }
}
