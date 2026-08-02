package com.unity3d.services.core.di;

import android.content.Context;
import com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.ByteStringSerializer;
import com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.extensions.ContextExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.SDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.properties.ClientProperties;
import defpackage.a70;
import defpackage.aea;
import defpackage.au3;
import defpackage.be4;
import defpackage.bea;
import defpackage.cu3;
import defpackage.f8h;
import defpackage.feh;
import defpackage.gu3;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.k9f;
import defpackage.ku3;
import defpackage.qdj;
import defpackage.rob;
import defpackage.s9a;
import defpackage.tz9;
import defpackage.yda;
import defpackage.ye4;
import defpackage.z45;
import gatewayprotocol.v1.AdOperationsConfigurationKt;
import gatewayprotocol.v1.DiagnosticEventsConfigurationKt;
import gatewayprotocol.v1.FeatureFlagsKt;
import gatewayprotocol.v1.NativeConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.RequestPolicyKt;
import gatewayprotocol.v1.RequestRetryPolicyKt;
import gatewayprotocol.v1.RequestTimeoutPolicyKt;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\tJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0016J%\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0016J%\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u0016J%\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u0016J%\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u0016J%\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u0016J%\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u0016J%\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u0016J\u0015\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J#\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0007¢\u0006\u0004\b'\u0010(J#\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0007¢\u0006\u0004\b)\u0010(J#\u0010*\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0007¢\u0006\u0004\b*\u0010(J#\u0010+\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0007¢\u0006\u0004\b+\u0010(J1\u0010.\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00072\f\u0010-\u001a\b\u0012\u0004\u0012\u00020&0,¢\u0006\u0004\b.\u0010/J#\u00100\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0007¢\u0006\u0004\b0\u0010(J#\u00102\u001a\b\u0012\u0004\u0012\u0002010%2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0007¢\u0006\u0004\b2\u0010(J\r\u00104\u001a\u000203¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u000203¢\u0006\u0004\b6\u00105J\r\u00107\u001a\u000203¢\u0006\u0004\b7\u00105J\r\u00109\u001a\u000208¢\u0006\u0004\b9\u0010:J\u001b\u0010=\u001a\u00020<2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020&0%¢\u0006\u0004\b=\u0010>J\u001b\u0010)\u001a\u00020<2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020&0%¢\u0006\u0004\b)\u0010>J\u001b\u0010?\u001a\u00020<2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020&0%¢\u0006\u0004\b?\u0010>J\u001b\u0010@\u001a\u00020<2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020&0%¢\u0006\u0004\b@\u0010>J\u001b\u0010*\u001a\u00020<2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020&0%¢\u0006\u0004\b*\u0010>J\u001b\u0010+\u001a\u00020<2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020&0%¢\u0006\u0004\b+\u0010>J\u001b\u0010.\u001a\u00020<2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020&0%¢\u0006\u0004\b.\u0010>J\u001b\u00100\u001a\u00020<2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020&0%¢\u0006\u0004\b0\u0010>J\u0017\u0010C\u001a\u0002032\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u001d\u0010E\u001a\u00020<2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002¢\u0006\u0004\bE\u0010>J-\u0010H\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00072\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bQ\u0010RJ\u000f\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bT\u0010U¨\u0006V"}, d2 = {"Lcom/unity3d/services/core/di/UnityAdsModule;", "", "<init>", "()V", "Landroid/content/Context;", "androidContext", "()Landroid/content/Context;", "Lau3;", "mainDispatcher", "()Lau3;", "defaultDispatcher", "ioDispatcher", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "sdkDispatchers", "()Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers", "Lcu3;", "errorHandler", "Lyda;", "parentJob", "Lku3;", "initCoroutineScope", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcu3;Lyda;)Lku3;", "loadCoroutineScope", "showCoroutineScope", "transactionCoroutineScope", "ilrdCoroutineScope", "lifecycleCoroutineScope", "getTokenCoroutineScope", "offerwallSignalsCoroutineScope", "omidCoroutineScope", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "diagnosticEventRepository", "publicApiJob", "(Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;)Lyda;", "context", "dispatcher", "Lye4;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "gatewayDataStore", "(Landroid/content/Context;Lau3;)Lye4;", "privacyDataStore", "privacyFsmDataStore", "nativeConfigurationDataStore", "Lbe4;", "fetchGLInfo", "glInfoDataStore", "(Landroid/content/Context;Lau3;Lbe4;)Lye4;", "iapTransactionDataStore", "Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;", "webViewConfigurationDataStore", "Lcom/unity3d/services/core/misc/JsonStorage;", "publicJsonStorage", "()Lcom/unity3d/services/core/misc/JsonStorage;", "privateJsonStorage", "memoryJsonStorage", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "defaultNativeConfiguration", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "dataStore", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "gatewayCacheDataStore", "(Lye4;)Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "idfiDataStore", "auidDataStore", "Lcom/unity3d/services/core/device/StorageManager$StorageType;", "storageType", "provideJsonStorage", "(Lcom/unity3d/services/core/device/StorageManager$StorageType;)Lcom/unity3d/services/core/misc/JsonStorage;", "provideByteStringDataSource", "", "dataStoreFile", "provideByteStringDataStore", "(Landroid/content/Context;Lau3;Ljava/lang/String;)Lye4;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "getDefaultAdOperations", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "getDefaultRequestPolicy", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy;", "getDefaultRequestRetryPolicy", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy;", "getDefaultRequestTimeoutPolicy", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnityAdsModule {
    private final NativeConfigurationOuterClass.AdOperationsConfiguration getDefaultAdOperations() {
        AdOperationsConfigurationKt.Dsl.Companion companion = AdOperationsConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.AdOperationsConfiguration.Builder newBuilder = NativeConfigurationOuterClass.AdOperationsConfiguration.newBuilder();
        newBuilder.getClass();
        AdOperationsConfigurationKt.Dsl _create = companion._create(newBuilder);
        _create.setLoadTimeoutMs(30000);
        _create.setShowTimeoutMs(10000);
        _create.setGetTokenTimeoutMs(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
        return _create._build();
    }

    private final NativeConfigurationOuterClass.RequestPolicy getDefaultRequestPolicy() {
        RequestPolicyKt.Dsl.Companion companion = RequestPolicyKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.RequestPolicy.Builder newBuilder = NativeConfigurationOuterClass.RequestPolicy.newBuilder();
        newBuilder.getClass();
        RequestPolicyKt.Dsl _create = companion._create(newBuilder);
        _create.setRetryPolicy(getDefaultRequestRetryPolicy());
        _create.setTimeoutPolicy(getDefaultRequestTimeoutPolicy());
        return _create._build();
    }

    private final NativeConfigurationOuterClass.RequestRetryPolicy getDefaultRequestRetryPolicy() {
        RequestRetryPolicyKt.Dsl.Companion companion = RequestRetryPolicyKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.RequestRetryPolicy.Builder newBuilder = NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder();
        newBuilder.getClass();
        RequestRetryPolicyKt.Dsl _create = companion._create(newBuilder);
        _create.setMaxDuration(UnityAdsConstants.RequestPolicy.RETRY_MAX_DURATION);
        _create.setRetryWaitBase(500);
        _create.setRetryJitterPct(0.1f);
        _create.setShouldStoreLocally(false);
        _create.setRetryMaxInterval(2500);
        _create.setRetryScalingFactor(2.0f);
        return _create._build();
    }

    private final NativeConfigurationOuterClass.RequestTimeoutPolicy getDefaultRequestTimeoutPolicy() {
        RequestTimeoutPolicyKt.Dsl.Companion companion = RequestTimeoutPolicyKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder newBuilder = NativeConfigurationOuterClass.RequestTimeoutPolicy.newBuilder();
        newBuilder.getClass();
        RequestTimeoutPolicyKt.Dsl _create = companion._create(newBuilder);
        _create.setConnectTimeoutMs(30000);
        _create.setReadTimeoutMs(30000);
        _create.setWriteTimeoutMs(30000);
        _create.setOverallTimeoutMs(30000);
        return _create._build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File glInfoDataStore$lambda$2(Context context) {
        return ContextExtensionsKt.unityAdsDataStoreFile(context, ServiceProvider.DATA_STORE_GL_INFO);
    }

    private final ByteStringDataSource provideByteStringDataSource(ye4 dataStore) {
        return new AndroidByteStringDataSource(dataStore);
    }

    private final ye4 provideByteStringDataStore(Context context, au3 dispatcher, String dataStoreFile) {
        return f8h.k(new ByteStringSerializer(), null, null, s9a.c(dispatcher.plus(tz9.o())), new feh(context, dataStoreFile, 1), 4);
    }

    private final JsonStorage provideJsonStorage(StorageManager.StorageType storageType) {
        if (!StorageManager.init(ClientProperties.getApplicationContext())) {
            a70.r("StorageManager failed to initialize");
            return null;
        }
        Storage storage = StorageManager.getStorage(storageType);
        storage.getClass();
        return storage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit publicApiJob$lambda$1$lambda$0(DiagnosticEventRepository diagnosticEventRepository, Throwable th) {
        try {
            diagnosticEventRepository.flush();
        } catch (Throwable th2) {
            DeviceLog.error("Failed to flush diagnostic events", th2);
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File webViewConfigurationDataStore$lambda$3(Context context) {
        return ContextExtensionsKt.unityAdsDataStoreFile(context, ServiceProvider.DATA_STORE_WEBVIEW_CONFIG);
    }

    @NotNull
    public final Context androidContext() {
        Context applicationContext = ClientProperties.getApplicationContext();
        applicationContext.getClass();
        return applicationContext;
    }

    @NotNull
    public final ByteStringDataSource auidDataStore(@NotNull ye4 dataStore) {
        dataStore.getClass();
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final au3 defaultDispatcher() {
        return z45.a;
    }

    @NotNull
    public final NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration() {
        NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.NativeConfiguration.Builder newBuilder = NativeConfigurationOuterClass.NativeConfiguration.newBuilder();
        newBuilder.getClass();
        NativeConfigurationKt.Dsl _create = companion._create(newBuilder);
        _create.setAdOperations(getDefaultAdOperations());
        _create.setInitPolicy(getDefaultRequestPolicy());
        _create.setAdPolicy(getDefaultRequestPolicy());
        _create.setOtherPolicy(getDefaultRequestPolicy());
        _create.setOperativeEventPolicy(getDefaultRequestPolicy());
        DiagnosticEventsConfigurationKt.Dsl.Companion companion2 = DiagnosticEventsConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder newBuilder2 = NativeConfigurationOuterClass.DiagnosticEventsConfiguration.newBuilder();
        newBuilder2.getClass();
        DiagnosticEventsConfigurationKt.Dsl _create2 = companion2._create(newBuilder2);
        _create2.setEnabled(true);
        _create2.setMaxBatchSize(10);
        _create2.setMaxBatchIntervalMs(30000);
        _create2.setTtmEnabled(false);
        _create.setDiagnosticEvents(_create2._build());
        FeatureFlagsKt.Dsl.Companion companion3 = FeatureFlagsKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.FeatureFlags.Builder newBuilder3 = NativeConfigurationOuterClass.FeatureFlags.newBuilder();
        newBuilder3.getClass();
        FeatureFlagsKt.Dsl _create3 = companion3._create(newBuilder3);
        _create3.setBoldSdkNextSessionEnabled(true);
        _create.setFeatureFlags(_create3._build());
        _create.setMaxExtrasSizeKb(4);
        return _create._build();
    }

    @NotNull
    public final ByteStringDataSource gatewayCacheDataStore(@NotNull ye4 dataStore) {
        dataStore.getClass();
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final ye4 gatewayDataStore(@NotNull Context context, @NotNull au3 dispatcher) {
        context.getClass();
        dispatcher.getClass();
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_GATEWAY_CACHE);
    }

    @NotNull
    public final ku3 getTokenCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull cu3 errorHandler, @NotNull yda parentJob) {
        dispatchers.getClass();
        errorHandler.getClass();
        parentJob.getClass();
        return s9a.c(parentJob.plus(dispatchers.getDefault()).plus(new gu3(ServiceProvider.NAMED_GET_TOKEN_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final ye4 glInfoDataStore(@NotNull Context context, @NotNull au3 dispatcher, @NotNull be4 fetchGLInfo) {
        context.getClass();
        dispatcher.getClass();
        fetchGLInfo.getClass();
        return f8h.k(new ByteStringSerializer(), null, a.c(fetchGLInfo), s9a.c(dispatcher.plus(tz9.o())), new k9f(context, 14), 2);
    }

    @NotNull
    public final ye4 iapTransactionDataStore(@NotNull Context context, @NotNull au3 dispatcher) {
        context.getClass();
        dispatcher.getClass();
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_IAP_TRANSACTION);
    }

    @NotNull
    public final ByteStringDataSource idfiDataStore(@NotNull ye4 dataStore) {
        dataStore.getClass();
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final ku3 ilrdCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull cu3 errorHandler, @NotNull yda parentJob) {
        dispatchers.getClass();
        errorHandler.getClass();
        parentJob.getClass();
        return s9a.c(parentJob.plus(dispatchers.getDefault()).plus(new gu3(ServiceProvider.NAMED_ILRD_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final ku3 initCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull cu3 errorHandler, @NotNull yda parentJob) {
        dispatchers.getClass();
        errorHandler.getClass();
        parentJob.getClass();
        return s9a.c(parentJob.plus(dispatchers.getDefault()).plus(new gu3(ServiceProvider.NAMED_INIT_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final au3 ioDispatcher() {
        hs4 hs4Var = z45.a;
        return hq4.c;
    }

    @NotNull
    public final ku3 lifecycleCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull cu3 errorHandler, @NotNull yda parentJob) {
        dispatchers.getClass();
        errorHandler.getClass();
        parentJob.getClass();
        return s9a.c(parentJob.plus(dispatchers.getDefault()).plus(new gu3(ServiceProvider.NAMED_LIFECYCLE_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final ku3 loadCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull cu3 errorHandler, @NotNull yda parentJob) {
        dispatchers.getClass();
        errorHandler.getClass();
        parentJob.getClass();
        return s9a.c(parentJob.plus(dispatchers.getDefault()).plus(new gu3(ServiceProvider.NAMED_LOAD_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final au3 mainDispatcher() {
        hs4 hs4Var = z45.a;
        return rob.a;
    }

    @NotNull
    public final JsonStorage memoryJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.MEMORY);
    }

    @NotNull
    public final ye4 nativeConfigurationDataStore(@NotNull Context context, @NotNull au3 dispatcher) {
        context.getClass();
        dispatcher.getClass();
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_NATIVE_CONFIG);
    }

    @NotNull
    public final ku3 offerwallSignalsCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull cu3 errorHandler, @NotNull yda parentJob) {
        dispatchers.getClass();
        errorHandler.getClass();
        parentJob.getClass();
        return s9a.c(parentJob.plus(dispatchers.getDefault()).plus(new gu3(ServiceProvider.NAMED_OFFERWALL_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final ku3 omidCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull cu3 errorHandler, @NotNull yda parentJob) {
        dispatchers.getClass();
        errorHandler.getClass();
        parentJob.getClass();
        return s9a.c(parentJob.plus(dispatchers.getDefault()).plus(new gu3(ServiceProvider.NAMED_OMID_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final ye4 privacyDataStore(@NotNull Context context, @NotNull au3 dispatcher) {
        context.getClass();
        dispatcher.getClass();
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_PRIVACY);
    }

    @NotNull
    public final ye4 privacyFsmDataStore(@NotNull Context context, @NotNull au3 dispatcher) {
        context.getClass();
        dispatcher.getClass();
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_PRIVACY_FSM);
    }

    @NotNull
    public final JsonStorage privateJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PRIVATE);
    }

    @NotNull
    public final yda publicApiJob(@NotNull DiagnosticEventRepository diagnosticEventRepository) {
        diagnosticEventRepository.getClass();
        aea a = bea.a();
        a.n(new qdj(diagnosticEventRepository, 12));
        return a;
    }

    @NotNull
    public final JsonStorage publicJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PUBLIC);
    }

    @NotNull
    public final ISDKDispatchers sdkDispatchers() {
        return new SDKDispatchers();
    }

    @NotNull
    public final ku3 showCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull cu3 errorHandler, @NotNull yda parentJob) {
        dispatchers.getClass();
        errorHandler.getClass();
        parentJob.getClass();
        return s9a.c(parentJob.plus(dispatchers.getDefault()).plus(new gu3(ServiceProvider.NAMED_SHOW_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final ku3 transactionCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull cu3 errorHandler, @NotNull yda parentJob) {
        dispatchers.getClass();
        errorHandler.getClass();
        parentJob.getClass();
        return s9a.c(parentJob.plus(dispatchers.getDefault()).plus(new gu3(ServiceProvider.NAMED_TRANSACTION_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final ye4 webViewConfigurationDataStore(@NotNull Context context, @NotNull au3 dispatcher) {
        context.getClass();
        dispatcher.getClass();
        return f8h.k(new WebViewConfigurationStoreSerializer(), null, null, s9a.c(dispatcher.plus(tz9.o())), new k9f(context, 15), 4);
    }

    @NotNull
    public final ByteStringDataSource iapTransactionDataStore(@NotNull ye4 dataStore) {
        dataStore.getClass();
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final ByteStringDataSource nativeConfigurationDataStore(@NotNull ye4 dataStore) {
        dataStore.getClass();
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final ByteStringDataSource privacyDataStore(@NotNull ye4 dataStore) {
        dataStore.getClass();
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final ByteStringDataSource privacyFsmDataStore(@NotNull ye4 dataStore) {
        dataStore.getClass();
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final ByteStringDataSource glInfoDataStore(@NotNull ye4 dataStore) {
        dataStore.getClass();
        return provideByteStringDataSource(dataStore);
    }
}
