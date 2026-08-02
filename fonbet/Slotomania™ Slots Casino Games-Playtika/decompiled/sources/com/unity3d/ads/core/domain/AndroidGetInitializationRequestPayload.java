package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader;
import com.unity3d.ads.core.data.datasource.InstallReferrerDataSource;
import com.unity3d.ads.core.data.model.InitializationConfigurationInternal;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.InitializationDeviceInfoKt;
import gatewayprotocol.v1.InitializationRequestKt;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* compiled from: AndroidGetInitializationRequestPayload.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\u0010H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetInitializationRequestPayload;", "Lcom/unity3d/ads/core/domain/GetInitializationRequestPayload;", "getClientInfo", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "legacyUserConsentRepository", "Lcom/unity3d/ads/core/data/repository/LegacyUserConsentRepository;", "mediationInitBlobMetadataReader", "Lcom/unity3d/ads/core/configuration/MediationInitBlobMetadataReader;", "installReferrerDataSource", "Lcom/unity3d/ads/core/data/datasource/InstallReferrerDataSource;", "(Lcom/unity3d/ads/core/domain/GetClientInfo;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/LegacyUserConsentRepository;Lcom/unity3d/ads/core/configuration/MediationInitBlobMetadataReader;Lcom/unity3d/ads/core/data/datasource/InstallReferrerDataSource;)V", "invoke", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AndroidGetInitializationRequestPayload implements GetInitializationRequestPayload {
    private static final String BLOB_EXTRA_KEY = "uads_init_blob";
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetClientInfo getClientInfo;
    private final InstallReferrerDataSource installReferrerDataSource;
    private final LegacyUserConsentRepository legacyUserConsentRepository;
    private final MediationInitBlobMetadataReader mediationInitBlobMetadataReader;
    private final SessionRepository sessionRepository;

    public AndroidGetInitializationRequestPayload(GetClientInfo getClientInfo, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, LegacyUserConsentRepository legacyUserConsentRepository, MediationInitBlobMetadataReader mediationInitBlobMetadataReader, InstallReferrerDataSource installReferrerDataSource) {
        Intrinsics.checkNotNullParameter(getClientInfo, "getClientInfo");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(legacyUserConsentRepository, "legacyUserConsentRepository");
        Intrinsics.checkNotNullParameter(mediationInitBlobMetadataReader, "mediationInitBlobMetadataReader");
        Intrinsics.checkNotNullParameter(installReferrerDataSource, "installReferrerDataSource");
        this.getClientInfo = getClientInfo;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.legacyUserConsentRepository = legacyUserConsentRepository;
        this.mediationInitBlobMetadataReader = mediationInitBlobMetadataReader;
        this.installReferrerDataSource = installReferrerDataSource;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x03cf, code lost:
    
        if (r1 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0359, code lost:
    
        if (r1 == r3) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0311, code lost:
    
        if (r1 == r3) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02f2, code lost:
    
        if (r1 == r3) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02ce, code lost:
    
        if (r1 != r3) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0097  */
    @Override // com.unity3d.ads.core.domain.GetInitializationRequestPayload
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(Continuation<? super InitializationRequestOuterClass.InitializationRequest> continuation) {
        AndroidGetInitializationRequestPayload$invoke$1 androidGetInitializationRequestPayload$invoke$1;
        InitializationRequestKt.Dsl _create;
        boolean z;
        AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload;
        InitializationRequestKt.Dsl dsl;
        InitializationRequestKt.Dsl dsl2;
        InitializationRequestKt.Dsl dsl3;
        AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload2;
        String analyticsUserId;
        InitializationDeviceInfoKt.Dsl _create2;
        InitializationDeviceInfoKt.Dsl dsl4;
        InitializationRequestKt.Dsl dsl5;
        InitializationRequestKt.Dsl dsl6;
        InitializationDeviceInfoKt.Dsl dsl7;
        InitializationRequestKt.Dsl dsl8;
        AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload3;
        InitializationRequestKt.Dsl dsl9;
        InitializationRequestKt.Dsl dsl10;
        InitializationDeviceInfoKt.Dsl dsl11;
        InitializationDeviceInfoKt.Dsl dsl12;
        final InitializationRequestKt.Dsl dsl13;
        InitializationRequestKt.Dsl dsl14;
        ByteString byteString;
        InitializationRequestKt.Dsl dsl15;
        InitializationRequestKt.Dsl dsl16;
        ByteString byteStringUtf8;
        Map<String, String> extras;
        Map mutableMap;
        ByteString byteStringUtf82;
        String userIdentifier;
        InitializationRequestOuterClass.InstallReferrer installReferrer;
        if (continuation instanceof AndroidGetInitializationRequestPayload$invoke$1) {
            androidGetInitializationRequestPayload$invoke$1 = (AndroidGetInitializationRequestPayload$invoke$1) continuation;
            if ((androidGetInitializationRequestPayload$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidGetInitializationRequestPayload$invoke$1.label -= Integer.MIN_VALUE;
                Object obj = androidGetInitializationRequestPayload$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (androidGetInitializationRequestPayload$invoke$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        InitializationRequestKt.Dsl.Companion companion = InitializationRequestKt.Dsl.INSTANCE;
                        InitializationRequestOuterClass.InitializationRequest.Builder newBuilder = InitializationRequestOuterClass.InitializationRequest.newBuilder();
                        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
                        _create = companion._create(newBuilder);
                        Storage storage = StorageManager.getStorage(StorageManager.StorageType.PRIVATE);
                        if (storage.readStorage()) {
                            Object obj2 = storage.get("configuration.hasInitialized");
                            Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z = true;
                                _create.setIsFirstInit(!z);
                                GetClientInfo getClientInfo = this.getClientInfo;
                                androidGetInitializationRequestPayload$invoke$1.L$0 = this;
                                androidGetInitializationRequestPayload$invoke$1.L$1 = _create;
                                androidGetInitializationRequestPayload$invoke$1.L$2 = _create;
                                androidGetInitializationRequestPayload$invoke$1.L$3 = _create;
                                androidGetInitializationRequestPayload$invoke$1.label = 1;
                                obj = getClientInfo.invoke(androidGetInitializationRequestPayload$invoke$1);
                                if (obj != coroutine_suspended) {
                                    androidGetInitializationRequestPayload = this;
                                    dsl = _create;
                                    dsl2 = dsl;
                                    _create.setClientInfo((ClientInfoOuterClass.ClientInfo) obj);
                                    DeviceInfoRepository deviceInfoRepository = androidGetInitializationRequestPayload.deviceInfoRepository;
                                    androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload;
                                    androidGetInitializationRequestPayload$invoke$1.L$1 = dsl2;
                                    androidGetInitializationRequestPayload$invoke$1.L$2 = dsl;
                                    androidGetInitializationRequestPayload$invoke$1.L$3 = dsl;
                                    androidGetInitializationRequestPayload$invoke$1.label = 2;
                                    obj = deviceInfoRepository.getIdfi(androidGetInitializationRequestPayload$invoke$1);
                                    if (obj != coroutine_suspended) {
                                        dsl3 = dsl;
                                        androidGetInitializationRequestPayload2 = androidGetInitializationRequestPayload;
                                        dsl3.setIdfi((String) obj);
                                        analyticsUserId = androidGetInitializationRequestPayload2.deviceInfoRepository.getAnalyticsUserId();
                                        if (analyticsUserId != null) {
                                            dsl.setAnalyticsUserId(analyticsUserId);
                                        }
                                        dsl.setSessionId(androidGetInitializationRequestPayload2.sessionRepository.getSessionId());
                                        InitializationDeviceInfoKt.Dsl.Companion companion2 = InitializationDeviceInfoKt.Dsl.INSTANCE;
                                        InitializationRequestOuterClass.InitializationDeviceInfo.Builder newBuilder2 = InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder();
                                        Intrinsics.checkNotNullExpressionValue(newBuilder2, "newBuilder()");
                                        _create2 = companion2._create(newBuilder2);
                                        _create2.setBundleId(androidGetInitializationRequestPayload2.deviceInfoRepository.getAppName());
                                        _create2.setDeviceModel(androidGetInitializationRequestPayload2.deviceInfoRepository.getModel());
                                        _create2.setDeviceMake(androidGetInitializationRequestPayload2.deviceInfoRepository.getManufacturer());
                                        _create2.setOsVersion(androidGetInitializationRequestPayload2.deviceInfoRepository.getOsVersion());
                                        DeviceInfoRepository deviceInfoRepository2 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                                        androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload2;
                                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl2;
                                        androidGetInitializationRequestPayload$invoke$1.L$2 = dsl;
                                        androidGetInitializationRequestPayload$invoke$1.L$3 = _create2;
                                        androidGetInitializationRequestPayload$invoke$1.L$4 = dsl;
                                        androidGetInitializationRequestPayload$invoke$1.L$5 = _create2;
                                        androidGetInitializationRequestPayload$invoke$1.L$6 = _create2;
                                        androidGetInitializationRequestPayload$invoke$1.label = 3;
                                        obj = deviceInfoRepository2.staticDeviceInfo(androidGetInitializationRequestPayload$invoke$1);
                                        if (obj != coroutine_suspended) {
                                            dsl4 = _create2;
                                            dsl5 = dsl;
                                            dsl6 = dsl2;
                                            dsl7 = dsl4;
                                            _create2.setTotalDiskSpace(((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getTotalDiskSpace());
                                            DeviceInfoRepository deviceInfoRepository3 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                                            androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload2;
                                            androidGetInitializationRequestPayload$invoke$1.L$1 = dsl6;
                                            androidGetInitializationRequestPayload$invoke$1.L$2 = dsl5;
                                            androidGetInitializationRequestPayload$invoke$1.L$3 = dsl7;
                                            androidGetInitializationRequestPayload$invoke$1.L$4 = dsl;
                                            androidGetInitializationRequestPayload$invoke$1.L$5 = dsl4;
                                            androidGetInitializationRequestPayload$invoke$1.L$6 = dsl4;
                                            androidGetInitializationRequestPayload$invoke$1.label = 4;
                                            obj = deviceInfoRepository3.staticDeviceInfo(androidGetInitializationRequestPayload$invoke$1);
                                            if (obj != coroutine_suspended) {
                                                InitializationDeviceInfoKt.Dsl dsl17 = dsl7;
                                                dsl8 = dsl;
                                                androidGetInitializationRequestPayload3 = androidGetInitializationRequestPayload2;
                                                dsl9 = dsl6;
                                                dsl10 = dsl5;
                                                dsl11 = dsl17;
                                                dsl12 = dsl4;
                                                dsl12.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getTotalRamMemory());
                                                dsl4.setCurrentUiTheme(androidGetInitializationRequestPayload3.deviceInfoRepository.getCurrentUiTheme());
                                                String networkOperator = androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                                                Intrinsics.checkNotNullExpressionValue(networkOperator, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                                                dsl4.setNetworkOperator(networkOperator);
                                                dsl4.setBatteryLevel(androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                                                dsl4.setBatteryStatus(androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                                                dsl4.setSystemBootTime(androidGetInitializationRequestPayload3.deviceInfoRepository.getSystemBootTime());
                                                String language = androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                                                Intrinsics.checkNotNullExpressionValue(language, "deviceInfoRepository.dynamicDeviceInfo.language");
                                                dsl4.setLanguage(language);
                                                dsl4.setLocalList(CollectionsKt.joinToString$default(androidGetInitializationRequestPayload3.deviceInfoRepository.getLocaleList(), ",", null, null, 0, null, null, 62, null));
                                                dsl4.setConnectionType(androidGetInitializationRequestPayload3.deviceInfoRepository.getConnectionTypeStr());
                                                dsl8.setDeviceInfo(dsl11._build());
                                                DeviceInfoRepository deviceInfoRepository4 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                                                androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload3;
                                                androidGetInitializationRequestPayload$invoke$1.L$1 = dsl9;
                                                androidGetInitializationRequestPayload$invoke$1.L$2 = dsl10;
                                                androidGetInitializationRequestPayload$invoke$1.L$3 = null;
                                                androidGetInitializationRequestPayload$invoke$1.L$4 = null;
                                                androidGetInitializationRequestPayload$invoke$1.L$5 = null;
                                                androidGetInitializationRequestPayload$invoke$1.L$6 = null;
                                                androidGetInitializationRequestPayload$invoke$1.label = 5;
                                                obj = deviceInfoRepository4.getAuidByteString(androidGetInitializationRequestPayload$invoke$1);
                                                if (obj != coroutine_suspended) {
                                                    dsl13 = dsl10;
                                                    dsl14 = dsl9;
                                                    byteString = (ByteString) obj;
                                                    if (byteString != null) {
                                                        dsl13.setAuid(byteString);
                                                    }
                                                    DeviceInfoRepository deviceInfoRepository5 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                                                    androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload3;
                                                    androidGetInitializationRequestPayload$invoke$1.L$1 = dsl14;
                                                    androidGetInitializationRequestPayload$invoke$1.L$2 = dsl13;
                                                    androidGetInitializationRequestPayload$invoke$1.label = 6;
                                                    obj = deviceInfoRepository5.getAuidString(androidGetInitializationRequestPayload$invoke$1);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                return coroutine_suspended;
                            }
                        }
                        z = false;
                        _create.setIsFirstInit(!z);
                        GetClientInfo getClientInfo2 = this.getClientInfo;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = this;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = _create;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = _create;
                        androidGetInitializationRequestPayload$invoke$1.L$3 = _create;
                        androidGetInitializationRequestPayload$invoke$1.label = 1;
                        obj = getClientInfo2.invoke(androidGetInitializationRequestPayload$invoke$1);
                        if (obj != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 1:
                        _create = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$3;
                        dsl = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl2 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        androidGetInitializationRequestPayload = (AndroidGetInitializationRequestPayload) androidGetInitializationRequestPayload$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        _create.setClientInfo((ClientInfoOuterClass.ClientInfo) obj);
                        DeviceInfoRepository deviceInfoRepository6 = androidGetInitializationRequestPayload.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl2;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = dsl;
                        androidGetInitializationRequestPayload$invoke$1.L$3 = dsl;
                        androidGetInitializationRequestPayload$invoke$1.label = 2;
                        obj = deviceInfoRepository6.getIdfi(androidGetInitializationRequestPayload$invoke$1);
                        if (obj != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 2:
                        dsl3 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$3;
                        dsl = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl2 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        androidGetInitializationRequestPayload = (AndroidGetInitializationRequestPayload) androidGetInitializationRequestPayload$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        androidGetInitializationRequestPayload2 = androidGetInitializationRequestPayload;
                        dsl3.setIdfi((String) obj);
                        analyticsUserId = androidGetInitializationRequestPayload2.deviceInfoRepository.getAnalyticsUserId();
                        if (analyticsUserId != null) {
                        }
                        dsl.setSessionId(androidGetInitializationRequestPayload2.sessionRepository.getSessionId());
                        InitializationDeviceInfoKt.Dsl.Companion companion22 = InitializationDeviceInfoKt.Dsl.INSTANCE;
                        InitializationRequestOuterClass.InitializationDeviceInfo.Builder newBuilder22 = InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder();
                        Intrinsics.checkNotNullExpressionValue(newBuilder22, "newBuilder()");
                        _create2 = companion22._create(newBuilder22);
                        _create2.setBundleId(androidGetInitializationRequestPayload2.deviceInfoRepository.getAppName());
                        _create2.setDeviceModel(androidGetInitializationRequestPayload2.deviceInfoRepository.getModel());
                        _create2.setDeviceMake(androidGetInitializationRequestPayload2.deviceInfoRepository.getManufacturer());
                        _create2.setOsVersion(androidGetInitializationRequestPayload2.deviceInfoRepository.getOsVersion());
                        DeviceInfoRepository deviceInfoRepository22 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload2;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl2;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = dsl;
                        androidGetInitializationRequestPayload$invoke$1.L$3 = _create2;
                        androidGetInitializationRequestPayload$invoke$1.L$4 = dsl;
                        androidGetInitializationRequestPayload$invoke$1.L$5 = _create2;
                        androidGetInitializationRequestPayload$invoke$1.L$6 = _create2;
                        androidGetInitializationRequestPayload$invoke$1.label = 3;
                        obj = deviceInfoRepository22.staticDeviceInfo(androidGetInitializationRequestPayload$invoke$1);
                        if (obj != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 3:
                        _create2 = (InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$6;
                        dsl4 = (InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$5;
                        dsl = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$4;
                        dsl7 = (InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$3;
                        dsl5 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl6 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        androidGetInitializationRequestPayload2 = (AndroidGetInitializationRequestPayload) androidGetInitializationRequestPayload$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        _create2.setTotalDiskSpace(((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getTotalDiskSpace());
                        DeviceInfoRepository deviceInfoRepository32 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload2;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl6;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = dsl5;
                        androidGetInitializationRequestPayload$invoke$1.L$3 = dsl7;
                        androidGetInitializationRequestPayload$invoke$1.L$4 = dsl;
                        androidGetInitializationRequestPayload$invoke$1.L$5 = dsl4;
                        androidGetInitializationRequestPayload$invoke$1.L$6 = dsl4;
                        androidGetInitializationRequestPayload$invoke$1.label = 4;
                        obj = deviceInfoRepository32.staticDeviceInfo(androidGetInitializationRequestPayload$invoke$1);
                        if (obj != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 4:
                        dsl12 = (InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$6;
                        dsl4 = (InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$5;
                        InitializationRequestKt.Dsl dsl18 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$4;
                        InitializationDeviceInfoKt.Dsl dsl19 = (InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$3;
                        InitializationRequestKt.Dsl dsl20 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        InitializationRequestKt.Dsl dsl21 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload4 = (AndroidGetInitializationRequestPayload) androidGetInitializationRequestPayload$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        dsl8 = dsl18;
                        androidGetInitializationRequestPayload3 = androidGetInitializationRequestPayload4;
                        dsl9 = dsl21;
                        dsl10 = dsl20;
                        dsl11 = dsl19;
                        dsl12.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getTotalRamMemory());
                        dsl4.setCurrentUiTheme(androidGetInitializationRequestPayload3.deviceInfoRepository.getCurrentUiTheme());
                        String networkOperator2 = androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                        Intrinsics.checkNotNullExpressionValue(networkOperator2, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                        dsl4.setNetworkOperator(networkOperator2);
                        dsl4.setBatteryLevel(androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                        dsl4.setBatteryStatus(androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                        dsl4.setSystemBootTime(androidGetInitializationRequestPayload3.deviceInfoRepository.getSystemBootTime());
                        String language2 = androidGetInitializationRequestPayload3.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                        Intrinsics.checkNotNullExpressionValue(language2, "deviceInfoRepository.dynamicDeviceInfo.language");
                        dsl4.setLanguage(language2);
                        dsl4.setLocalList(CollectionsKt.joinToString$default(androidGetInitializationRequestPayload3.deviceInfoRepository.getLocaleList(), ",", null, null, 0, null, null, 62, null));
                        dsl4.setConnectionType(androidGetInitializationRequestPayload3.deviceInfoRepository.getConnectionTypeStr());
                        dsl8.setDeviceInfo(dsl11._build());
                        DeviceInfoRepository deviceInfoRepository42 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload3;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl9;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = dsl10;
                        androidGetInitializationRequestPayload$invoke$1.L$3 = null;
                        androidGetInitializationRequestPayload$invoke$1.L$4 = null;
                        androidGetInitializationRequestPayload$invoke$1.L$5 = null;
                        androidGetInitializationRequestPayload$invoke$1.L$6 = null;
                        androidGetInitializationRequestPayload$invoke$1.label = 5;
                        obj = deviceInfoRepository42.getAuidByteString(androidGetInitializationRequestPayload$invoke$1);
                        if (obj != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 5:
                        dsl13 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl14 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        androidGetInitializationRequestPayload3 = (AndroidGetInitializationRequestPayload) androidGetInitializationRequestPayload$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        byteString = (ByteString) obj;
                        if (byteString != null) {
                        }
                        DeviceInfoRepository deviceInfoRepository52 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload3;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl14;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = dsl13;
                        androidGetInitializationRequestPayload$invoke$1.label = 6;
                        obj = deviceInfoRepository52.getAuidString(androidGetInitializationRequestPayload$invoke$1);
                        break;
                    case 6:
                        dsl13 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl14 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        androidGetInitializationRequestPayload3 = (AndroidGetInitializationRequestPayload) androidGetInitializationRequestPayload$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        String str = (String) obj;
                        String str2 = str;
                        if (str2 != null && str2.length() != 0) {
                            dsl13.setAuidString(str);
                        }
                        SessionRepository sessionRepository = androidGetInitializationRequestPayload3.sessionRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload3;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl14;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = dsl13;
                        androidGetInitializationRequestPayload$invoke$1.label = 7;
                        obj = sessionRepository.getPrivacy(androidGetInitializationRequestPayload$invoke$1);
                        break;
                    case 7:
                        dsl13 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl14 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        androidGetInitializationRequestPayload3 = (AndroidGetInitializationRequestPayload) androidGetInitializationRequestPayload$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        ByteString byteString2 = (ByteString) obj;
                        if (!byteString2.isEmpty()) {
                            dsl13.setPrivacy(byteString2);
                        }
                        SessionRepository sessionRepository2 = androidGetInitializationRequestPayload3.sessionRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload3;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl14;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = dsl13;
                        androidGetInitializationRequestPayload$invoke$1.label = 8;
                        obj = sessionRepository2.getGatewayCache(androidGetInitializationRequestPayload$invoke$1);
                        break;
                    case 8:
                        dsl13 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl14 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        androidGetInitializationRequestPayload3 = (AndroidGetInitializationRequestPayload) androidGetInitializationRequestPayload$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        ByteString byteString3 = (ByteString) obj;
                        if (!byteString3.isEmpty()) {
                            dsl13.setCache(byteString3);
                        }
                        String legacyFlowUserConsent = androidGetInitializationRequestPayload3.legacyUserConsentRepository.getLegacyFlowUserConsent();
                        if (legacyFlowUserConsent != null) {
                            dsl13.setLegacyFlowUserConsent(legacyFlowUserConsent);
                        }
                        String unityInstallationId = androidGetInitializationRequestPayload3.sessionRepository.getUnityInstallationId();
                        if (unityInstallationId != null) {
                            dsl13.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                        }
                        String unityMegaSessionId = androidGetInitializationRequestPayload3.sessionRepository.getUnityMegaSessionId();
                        if (unityMegaSessionId != null) {
                            dsl13.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                        }
                        DeviceInfoRepository deviceInfoRepository7 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = androidGetInitializationRequestPayload3;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl14;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = dsl13;
                        androidGetInitializationRequestPayload$invoke$1.label = 9;
                        obj = deviceInfoRepository7.getUnityBuildGuid(androidGetInitializationRequestPayload$invoke$1);
                        break;
                    case 9:
                        dsl13 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl14 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        androidGetInitializationRequestPayload3 = (AndroidGetInitializationRequestPayload) androidGetInitializationRequestPayload$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        String str3 = (String) obj;
                        if (str3 == null || str3.length() == 0) {
                            obj = null;
                        }
                        String str4 = (String) obj;
                        if (str4 != null) {
                            dsl13.setUnityBuildGuid(str4);
                        }
                        InitializationConfigurationInternal initializationConfiguration = androidGetInitializationRequestPayload3.sessionRepository.getInitializationConfiguration();
                        if (initializationConfiguration != null && (extras = initializationConfiguration.getExtras()) != null && (mutableMap = MapsKt.toMutableMap(extras)) != null) {
                            String str5 = (String) mutableMap.remove(BLOB_EXTRA_KEY);
                            if (str5 != null && (byteStringUtf82 = ByteStringsKt.toByteStringUtf8(str5)) != null) {
                                new MutablePropertyReference0Impl(dsl13) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$9$2
                                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                    public Object get() {
                                        return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                    }

                                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                    public void set(Object obj3) {
                                        ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj3);
                                    }
                                }.set(byteStringUtf82);
                            }
                            dsl13.putAllExtras(dsl13.getExtrasMap(), mutableMap);
                        }
                        if (!dsl13.hasUadsInitBlob()) {
                            MediationInitBlobMetadataReader mediationInitBlobMetadataReader = androidGetInitializationRequestPayload3.mediationInitBlobMetadataReader;
                            Object obj3 = mediationInitBlobMetadataReader.getJsonStorage().get(mediationInitBlobMetadataReader.getKey());
                            if (obj3 != null) {
                                Intrinsics.checkNotNullExpressionValue(obj3, "get(key)");
                                if (!(obj3 instanceof String)) {
                                    obj3 = null;
                                    break;
                                }
                            }
                            obj3 = null;
                            String str6 = (String) obj3;
                            if (str6 != null && (byteStringUtf8 = ByteStringsKt.toByteStringUtf8(str6)) != null) {
                                new MutablePropertyReference0Impl(dsl13) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$11
                                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                    public Object get() {
                                        return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                    }

                                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                    public void set(Object obj4) {
                                        ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj4);
                                    }
                                }.set(byteStringUtf8);
                            }
                        }
                        if (dsl13.getIsFirstInit()) {
                            InstallReferrerDataSource installReferrerDataSource = androidGetInitializationRequestPayload3.installReferrerDataSource;
                            androidGetInitializationRequestPayload$invoke$1.L$0 = dsl14;
                            androidGetInitializationRequestPayload$invoke$1.L$1 = dsl13;
                            androidGetInitializationRequestPayload$invoke$1.L$2 = null;
                            androidGetInitializationRequestPayload$invoke$1.label = 10;
                            obj = installReferrerDataSource.invoke(androidGetInitializationRequestPayload$invoke$1);
                            if (obj != coroutine_suspended) {
                                dsl15 = dsl13;
                                dsl16 = dsl14;
                                installReferrer = (InitializationRequestOuterClass.InstallReferrer) obj;
                                if (installReferrer != null) {
                                    dsl15.setInstallReferrer(installReferrer);
                                }
                                dsl14 = dsl16;
                                dsl13 = dsl15;
                            }
                            return coroutine_suspended;
                        }
                        userIdentifier = UnityAds.getUserIdentifier();
                        if (userIdentifier != null) {
                            dsl13.setExternalUserIdentifier(userIdentifier);
                        }
                        return dsl14._build();
                    case 10:
                        dsl15 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        dsl16 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        installReferrer = (InitializationRequestOuterClass.InstallReferrer) obj;
                        if (installReferrer != null) {
                        }
                        dsl14 = dsl16;
                        dsl13 = dsl15;
                        userIdentifier = UnityAds.getUserIdentifier();
                        if (userIdentifier != null) {
                        }
                        return dsl14._build();
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        androidGetInitializationRequestPayload$invoke$1 = new AndroidGetInitializationRequestPayload$invoke$1(this, continuation);
        Object obj4 = androidGetInitializationRequestPayload$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (androidGetInitializationRequestPayload$invoke$1.label) {
        }
    }
}
