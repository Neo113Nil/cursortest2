package com.unity3d.services.core.di;

import android.content.Context;
import com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.ByteStringSerializer;
import com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.extensions.ContextExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.SDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.properties.ClientProperties;
import gatewayprotocol.v1.AdOperationsConfigurationKt;
import gatewayprotocol.v1.DiagnosticEventsConfigurationKt;
import gatewayprotocol.v1.FeatureFlagsKt;
import gatewayprotocol.v1.NativeConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.RequestPolicyKt;
import gatewayprotocol.v1.RequestRetryPolicyKt;
import gatewayprotocol.v1.RequestTimeoutPolicyKt;
import java.io.File;
import java.util.Collections;
import xsna.b4q0;
import xsna.bdn;
import xsna.c4q0;
import xsna.eyx;
import xsna.fuk;
import xsna.fvk;
import xsna.gvk;
import xsna.gyx;
import xsna.ie00;
import xsna.iyx;
import xsna.m84;
import xsna.ovj;
import xsna.pvj;
import xsna.s3q0;
import xsna.vvj;
import xsna.wgl;
import xsna.whn0;
import xsna.wle;
import xsna.yvj;
import xsna.zvj;

/* compiled from: UnityAdsModule.kt */
/* loaded from: classes14.dex */
public final class UnityAdsModule {
    private final NativeConfigurationOuterClass.AdOperationsConfiguration getDefaultAdOperations() {
        AdOperationsConfigurationKt.Dsl _create = AdOperationsConfigurationKt.Dsl.Companion._create(NativeConfigurationOuterClass.AdOperationsConfiguration.newBuilder());
        _create.setLoadTimeoutMs(30000);
        _create.setShowTimeoutMs(10000);
        _create.setGetTokenTimeoutMs(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
        return _create._build();
    }

    private final NativeConfigurationOuterClass.RequestPolicy getDefaultRequestPolicy() {
        RequestPolicyKt.Dsl _create = RequestPolicyKt.Dsl.Companion._create(NativeConfigurationOuterClass.RequestPolicy.newBuilder());
        _create.setRetryPolicy(getDefaultRequestRetryPolicy());
        _create.setTimeoutPolicy(getDefaultRequestTimeoutPolicy());
        return _create._build();
    }

    private final NativeConfigurationOuterClass.RequestRetryPolicy getDefaultRequestRetryPolicy() {
        RequestRetryPolicyKt.Dsl _create = RequestRetryPolicyKt.Dsl.Companion._create(NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder());
        _create.setMaxDuration(UnityAdsConstants.RequestPolicy.RETRY_MAX_DURATION);
        _create.setRetryWaitBase(500);
        _create.setRetryJitterPct(0.1f);
        _create.setShouldStoreLocally(false);
        _create.setRetryMaxInterval(2500);
        _create.setRetryScalingFactor(2.0f);
        return _create._build();
    }

    private final NativeConfigurationOuterClass.RequestTimeoutPolicy getDefaultRequestTimeoutPolicy() {
        RequestTimeoutPolicyKt.Dsl _create = RequestTimeoutPolicyKt.Dsl.Companion._create(NativeConfigurationOuterClass.RequestTimeoutPolicy.newBuilder());
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

    private final ByteStringDataSource provideByteStringDataSource(fvk<ByteStringStoreOuterClass.ByteStringStore> fvkVar) {
        return new AndroidByteStringDataSource(fvkVar);
    }

    private final fvk<ByteStringStoreOuterClass.ByteStringStore> provideByteStringDataStore(Context context, ovj ovjVar, String str) {
        return gvk.a(new ByteStringSerializer(), null, null, zvj.a(ovjVar.plus(whn0.a())), new m84(20, context, str), 4);
    }

    private final JsonStorage provideJsonStorage(StorageManager.StorageType storageType) {
        if (StorageManager.init(ClientProperties.getApplicationContext())) {
            return StorageManager.getStorage(storageType);
        }
        throw new IllegalStateException("StorageManager failed to initialize");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 publicApiJob$lambda$1$lambda$0(DiagnosticEventRepository diagnosticEventRepository, Throwable th) {
        try {
            diagnosticEventRepository.flush();
        } catch (Throwable th2) {
            DeviceLog.error("Failed to flush diagnostic events", th2);
        }
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File webViewConfigurationDataStore$lambda$3(Context context) {
        return ContextExtensionsKt.unityAdsDataStoreFile(context, ServiceProvider.DATA_STORE_WEBVIEW_CONFIG);
    }

    public final Context androidContext() {
        return ClientProperties.getApplicationContext();
    }

    public final ByteStringDataSource auidDataStore(fvk<ByteStringStoreOuterClass.ByteStringStore> fvkVar) {
        return provideByteStringDataSource(fvkVar);
    }

    public final ovj defaultDispatcher() {
        return bdn.b;
    }

    public final NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration() {
        NativeConfigurationKt.Dsl _create = NativeConfigurationKt.Dsl.Companion._create(NativeConfigurationOuterClass.NativeConfiguration.newBuilder());
        _create.setAdOperations(getDefaultAdOperations());
        _create.setInitPolicy(getDefaultRequestPolicy());
        _create.setAdPolicy(getDefaultRequestPolicy());
        _create.setOtherPolicy(getDefaultRequestPolicy());
        _create.setOperativeEventPolicy(getDefaultRequestPolicy());
        DiagnosticEventsConfigurationKt.Dsl _create2 = DiagnosticEventsConfigurationKt.Dsl.Companion._create(NativeConfigurationOuterClass.DiagnosticEventsConfiguration.newBuilder());
        _create2.setEnabled(true);
        _create2.setMaxBatchSize(10);
        _create2.setMaxBatchIntervalMs(30000);
        _create2.setTtmEnabled(false);
        _create.setDiagnosticEvents(_create2._build());
        FeatureFlagsKt.Dsl _create3 = FeatureFlagsKt.Dsl.Companion._create(NativeConfigurationOuterClass.FeatureFlags.newBuilder());
        _create3.setBoldSdkNextSessionEnabled(true);
        _create.setFeatureFlags(_create3._build());
        _create.setMaxExtrasSizeKb(4);
        return _create._build();
    }

    public final ByteStringDataSource gatewayCacheDataStore(fvk<ByteStringStoreOuterClass.ByteStringStore> fvkVar) {
        return provideByteStringDataSource(fvkVar);
    }

    public final fvk<ByteStringStoreOuterClass.ByteStringStore> gatewayDataStore(Context context, ovj ovjVar) {
        return provideByteStringDataStore(context, ovjVar, ServiceProvider.DATA_STORE_GATEWAY_CACHE);
    }

    public final yvj getTokenCoroutineScope(ISDKDispatchers iSDKDispatchers, pvj pvjVar, eyx eyxVar) {
        return zvj.a(eyxVar.plus(iSDKDispatchers.getDefault()).plus(new vvj(ServiceProvider.NAMED_GET_TOKEN_SCOPE)).plus(pvjVar));
    }

    public final fvk<ByteStringStoreOuterClass.ByteStringStore> glInfoDataStore(Context context, ovj ovjVar, fuk<ByteStringStoreOuterClass.ByteStringStore> fukVar) {
        return gvk.a(new ByteStringSerializer(), null, Collections.singletonList(fukVar), zvj.a(ovjVar.plus(whn0.a())), new b4q0(context, 0), 2);
    }

    public final fvk<ByteStringStoreOuterClass.ByteStringStore> iapTransactionDataStore(Context context, ovj ovjVar) {
        return provideByteStringDataStore(context, ovjVar, ServiceProvider.DATA_STORE_IAP_TRANSACTION);
    }

    public final ByteStringDataSource idfiDataStore(fvk<ByteStringStoreOuterClass.ByteStringStore> fvkVar) {
        return provideByteStringDataSource(fvkVar);
    }

    public final yvj ilrdCoroutineScope(ISDKDispatchers iSDKDispatchers, pvj pvjVar, eyx eyxVar) {
        return zvj.a(eyxVar.plus(iSDKDispatchers.getDefault()).plus(new vvj(ServiceProvider.NAMED_ILRD_SCOPE)).plus(pvjVar));
    }

    public final yvj initCoroutineScope(ISDKDispatchers iSDKDispatchers, pvj pvjVar, eyx eyxVar) {
        return zvj.a(eyxVar.plus(iSDKDispatchers.getDefault()).plus(new vvj(ServiceProvider.NAMED_INIT_SCOPE)).plus(pvjVar));
    }

    public final ovj ioDispatcher() {
        bdn bdnVar = bdn.a;
        return wgl.c;
    }

    public final yvj lifecycleCoroutineScope(ISDKDispatchers iSDKDispatchers, pvj pvjVar, eyx eyxVar) {
        return zvj.a(eyxVar.plus(iSDKDispatchers.getDefault()).plus(new vvj(ServiceProvider.NAMED_LIFECYCLE_SCOPE)).plus(pvjVar));
    }

    public final yvj loadCoroutineScope(ISDKDispatchers iSDKDispatchers, pvj pvjVar, eyx eyxVar) {
        return zvj.a(eyxVar.plus(iSDKDispatchers.getDefault()).plus(new vvj(ServiceProvider.NAMED_LOAD_SCOPE)).plus(pvjVar));
    }

    public final ovj mainDispatcher() {
        bdn bdnVar = bdn.a;
        return ie00.a;
    }

    public final JsonStorage memoryJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.MEMORY);
    }

    public final fvk<ByteStringStoreOuterClass.ByteStringStore> nativeConfigurationDataStore(Context context, ovj ovjVar) {
        return provideByteStringDataStore(context, ovjVar, ServiceProvider.DATA_STORE_NATIVE_CONFIG);
    }

    public final yvj offerwallSignalsCoroutineScope(ISDKDispatchers iSDKDispatchers, pvj pvjVar, eyx eyxVar) {
        return zvj.a(eyxVar.plus(iSDKDispatchers.getDefault()).plus(new vvj(ServiceProvider.NAMED_OFFERWALL_SCOPE)).plus(pvjVar));
    }

    public final yvj omidCoroutineScope(ISDKDispatchers iSDKDispatchers, pvj pvjVar, eyx eyxVar) {
        return zvj.a(eyxVar.plus(iSDKDispatchers.getDefault()).plus(new vvj(ServiceProvider.NAMED_OMID_SCOPE)).plus(pvjVar));
    }

    public final fvk<ByteStringStoreOuterClass.ByteStringStore> privacyDataStore(Context context, ovj ovjVar) {
        return provideByteStringDataStore(context, ovjVar, ServiceProvider.DATA_STORE_PRIVACY);
    }

    public final fvk<ByteStringStoreOuterClass.ByteStringStore> privacyFsmDataStore(Context context, ovj ovjVar) {
        return provideByteStringDataStore(context, ovjVar, ServiceProvider.DATA_STORE_PRIVACY_FSM);
    }

    public final JsonStorage privateJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PRIVATE);
    }

    public final eyx publicApiJob(DiagnosticEventRepository diagnosticEventRepository) {
        gyx a = iyx.a();
        a.E(new c4q0(diagnosticEventRepository, 0));
        return a;
    }

    public final JsonStorage publicJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PUBLIC);
    }

    public final ISDKDispatchers sdkDispatchers() {
        return new SDKDispatchers();
    }

    public final yvj showCoroutineScope(ISDKDispatchers iSDKDispatchers, pvj pvjVar, eyx eyxVar) {
        return zvj.a(eyxVar.plus(iSDKDispatchers.getDefault()).plus(new vvj(ServiceProvider.NAMED_SHOW_SCOPE)).plus(pvjVar));
    }

    public final yvj transactionCoroutineScope(ISDKDispatchers iSDKDispatchers, pvj pvjVar, eyx eyxVar) {
        return zvj.a(eyxVar.plus(iSDKDispatchers.getDefault()).plus(new vvj(ServiceProvider.NAMED_TRANSACTION_SCOPE)).plus(pvjVar));
    }

    public final fvk<WebviewConfigurationStore.WebViewConfigurationStore> webViewConfigurationDataStore(Context context, ovj ovjVar) {
        return gvk.a(new WebViewConfigurationStoreSerializer(), null, null, zvj.a(ovjVar.plus(whn0.a())), new wle(context, 1), 4);
    }

    public final ByteStringDataSource iapTransactionDataStore(fvk<ByteStringStoreOuterClass.ByteStringStore> fvkVar) {
        return provideByteStringDataSource(fvkVar);
    }

    public final ByteStringDataSource nativeConfigurationDataStore(fvk<ByteStringStoreOuterClass.ByteStringStore> fvkVar) {
        return provideByteStringDataSource(fvkVar);
    }

    public final ByteStringDataSource privacyDataStore(fvk<ByteStringStoreOuterClass.ByteStringStore> fvkVar) {
        return provideByteStringDataSource(fvkVar);
    }

    public final ByteStringDataSource privacyFsmDataStore(fvk<ByteStringStoreOuterClass.ByteStringStore> fvkVar) {
        return provideByteStringDataSource(fvkVar);
    }

    public final ByteStringDataSource glInfoDataStore(fvk<ByteStringStoreOuterClass.ByteStringStore> fvkVar) {
        return provideByteStringDataSource(fvkVar);
    }
}
