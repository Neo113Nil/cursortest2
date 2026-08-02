package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader;
import com.unity3d.ads.core.data.datasource.GoogleAppIdDataSource;
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
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import xsna.j5g;
import xsna.spj;
import xsna.zcl;

/* compiled from: AndroidGetInitializationRequestPayload.kt */
/* loaded from: classes14.dex */
public final class AndroidGetInitializationRequestPayload implements GetInitializationRequestPayload {
    private static final String BLOB_EXTRA_KEY = "uads_init_blob";
    public static final Companion Companion = new Companion(null);
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetClientInfo getClientInfo;
    private final GoogleAppIdDataSource googleAppIdDataSource;
    private final InstallReferrerDataSource installReferrerDataSource;
    private final LegacyUserConsentRepository legacyUserConsentRepository;
    private final MediationInitBlobMetadataReader mediationInitBlobMetadataReader;
    private final SessionRepository sessionRepository;

    /* compiled from: AndroidGetInitializationRequestPayload.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidGetInitializationRequestPayload(GetClientInfo getClientInfo, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, LegacyUserConsentRepository legacyUserConsentRepository, MediationInitBlobMetadataReader mediationInitBlobMetadataReader, InstallReferrerDataSource installReferrerDataSource, GoogleAppIdDataSource googleAppIdDataSource) {
        this.getClientInfo = getClientInfo;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.legacyUserConsentRepository = legacyUserConsentRepository;
        this.mediationInitBlobMetadataReader = mediationInitBlobMetadataReader;
        this.installReferrerDataSource = installReferrerDataSource;
        this.googleAppIdDataSource = googleAppIdDataSource;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x027d, code lost:
    
        if (r1 != r3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0304, code lost:
    
        if (r1 == r3) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02be, code lost:
    
        if (r1 == r3) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02a1, code lost:
    
        if (r1 == r3) goto L137;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0071  */
    @Override // com.unity3d.ads.core.domain.GetInitializationRequestPayload
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(spj<? super InitializationRequestOuterClass.InitializationRequest> spjVar) {
        AndroidGetInitializationRequestPayload$invoke$1 androidGetInitializationRequestPayload$invoke$1;
        InitializationRequestKt.Dsl _create;
        boolean z;
        InitializationRequestKt.Dsl dsl;
        InitializationRequestKt.Dsl dsl2;
        InitializationRequestKt.Dsl dsl3;
        String analyticsUserId;
        InitializationDeviceInfoKt.Dsl _create2;
        InitializationDeviceInfoKt.Dsl dsl4;
        InitializationRequestKt.Dsl dsl5;
        InitializationRequestKt.Dsl dsl6;
        InitializationDeviceInfoKt.Dsl dsl7;
        InitializationRequestKt.Dsl dsl8;
        InitializationDeviceInfoKt.Dsl dsl9;
        final InitializationRequestKt.Dsl dsl10;
        InitializationRequestKt.Dsl dsl11;
        ByteString byteString;
        InitializationRequestKt.Dsl dsl12;
        InitializationRequestKt.Dsl dsl13;
        ByteString byteStringUtf8;
        Map<String, String> extras;
        ByteString byteStringUtf82;
        String userIdentifier;
        String googleAppId;
        InitializationRequestOuterClass.InstallReferrer installReferrer;
        if (spjVar instanceof AndroidGetInitializationRequestPayload$invoke$1) {
            androidGetInitializationRequestPayload$invoke$1 = (AndroidGetInitializationRequestPayload$invoke$1) spjVar;
            int i = androidGetInitializationRequestPayload$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidGetInitializationRequestPayload$invoke$1.label = i - Integer.MIN_VALUE;
                Object obj = androidGetInitializationRequestPayload$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                Object obj2 = null;
                switch (androidGetInitializationRequestPayload$invoke$1.label) {
                    case 0:
                        kotlin.a.a(obj);
                        _create = InitializationRequestKt.Dsl.Companion._create(InitializationRequestOuterClass.InitializationRequest.newBuilder());
                        Storage storage = StorageManager.getStorage(StorageManager.StorageType.PRIVATE);
                        if (storage.readStorage()) {
                            Object obj3 = storage.get("configuration.hasInitialized");
                            Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z = true;
                                _create.setIsFirstInit(!z);
                                GetClientInfo getClientInfo = this.getClientInfo;
                                androidGetInitializationRequestPayload$invoke$1.L$0 = _create;
                                androidGetInitializationRequestPayload$invoke$1.L$1 = _create;
                                androidGetInitializationRequestPayload$invoke$1.L$2 = _create;
                                androidGetInitializationRequestPayload$invoke$1.label = 1;
                                obj = getClientInfo.invoke(androidGetInitializationRequestPayload$invoke$1);
                                if (obj != coroutineSingletons) {
                                    dsl = _create;
                                    dsl2 = dsl;
                                    _create.setClientInfo((ClientInfoOuterClass.ClientInfo) obj);
                                    DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                                    androidGetInitializationRequestPayload$invoke$1.L$0 = dsl2;
                                    androidGetInitializationRequestPayload$invoke$1.L$1 = dsl;
                                    androidGetInitializationRequestPayload$invoke$1.L$2 = dsl;
                                    androidGetInitializationRequestPayload$invoke$1.label = 2;
                                    obj = deviceInfoRepository.getIdfi(androidGetInitializationRequestPayload$invoke$1);
                                    if (obj != coroutineSingletons) {
                                        dsl3 = dsl;
                                        dsl3.setIdfi((String) obj);
                                        analyticsUserId = this.deviceInfoRepository.getAnalyticsUserId();
                                        if (analyticsUserId != null) {
                                            dsl.setAnalyticsUserId(analyticsUserId);
                                        }
                                        dsl.setSessionId(this.sessionRepository.getSessionId());
                                        _create2 = InitializationDeviceInfoKt.Dsl.Companion._create(InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder());
                                        _create2.setBundleId(this.deviceInfoRepository.getAppName());
                                        _create2.setDeviceModel(this.deviceInfoRepository.getModel());
                                        _create2.setDeviceMake(this.deviceInfoRepository.getManufacturer());
                                        _create2.setOsVersion(this.deviceInfoRepository.getOsVersion());
                                        DeviceInfoRepository deviceInfoRepository2 = this.deviceInfoRepository;
                                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl2;
                                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl;
                                        androidGetInitializationRequestPayload$invoke$1.L$2 = _create2;
                                        androidGetInitializationRequestPayload$invoke$1.L$3 = dsl;
                                        androidGetInitializationRequestPayload$invoke$1.L$4 = _create2;
                                        androidGetInitializationRequestPayload$invoke$1.L$5 = _create2;
                                        androidGetInitializationRequestPayload$invoke$1.label = 3;
                                        obj = deviceInfoRepository2.staticDeviceInfo(androidGetInitializationRequestPayload$invoke$1);
                                        if (obj != coroutineSingletons) {
                                            dsl4 = _create2;
                                            dsl5 = dsl;
                                            dsl6 = dsl2;
                                            dsl7 = dsl4;
                                            dsl8 = dsl5;
                                            _create2.setTotalDiskSpace(((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getTotalDiskSpace());
                                            DeviceInfoRepository deviceInfoRepository3 = this.deviceInfoRepository;
                                            androidGetInitializationRequestPayload$invoke$1.L$0 = dsl6;
                                            androidGetInitializationRequestPayload$invoke$1.L$1 = dsl5;
                                            androidGetInitializationRequestPayload$invoke$1.L$2 = dsl4;
                                            androidGetInitializationRequestPayload$invoke$1.L$3 = dsl8;
                                            androidGetInitializationRequestPayload$invoke$1.L$4 = dsl7;
                                            androidGetInitializationRequestPayload$invoke$1.L$5 = dsl7;
                                            androidGetInitializationRequestPayload$invoke$1.label = 4;
                                            obj = deviceInfoRepository3.staticDeviceInfo(androidGetInitializationRequestPayload$invoke$1);
                                            if (obj != coroutineSingletons) {
                                                dsl9 = dsl7;
                                                dsl9.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getTotalRamMemory());
                                                dsl7.setCurrentUiTheme(this.deviceInfoRepository.getCurrentUiTheme());
                                                dsl7.setNetworkOperator(this.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator());
                                                dsl7.setBatteryLevel(this.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                                                dsl7.setBatteryStatus(this.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                                                dsl7.setSystemBootTime(this.deviceInfoRepository.getSystemBootTime());
                                                dsl7.setLanguage(this.deviceInfoRepository.getDynamicDeviceInfo().getLanguage());
                                                dsl7.setLocalList(j5g.g0(this.deviceInfoRepository.getLocaleList(), StringUtils.COMMA, null, null, 0, null, 62));
                                                dsl7.setConnectionType(this.deviceInfoRepository.getConnectionTypeStr());
                                                dsl7.setBundleVersion(this.deviceInfoRepository.cachedStaticDeviceInfo().getBundleVersion());
                                                dsl8.setDeviceInfo(dsl4._build());
                                                DeviceInfoRepository deviceInfoRepository4 = this.deviceInfoRepository;
                                                androidGetInitializationRequestPayload$invoke$1.L$0 = dsl6;
                                                androidGetInitializationRequestPayload$invoke$1.L$1 = dsl5;
                                                androidGetInitializationRequestPayload$invoke$1.L$2 = null;
                                                androidGetInitializationRequestPayload$invoke$1.L$3 = null;
                                                androidGetInitializationRequestPayload$invoke$1.L$4 = null;
                                                androidGetInitializationRequestPayload$invoke$1.L$5 = null;
                                                androidGetInitializationRequestPayload$invoke$1.label = 5;
                                                obj = deviceInfoRepository4.getAuidByteString(androidGetInitializationRequestPayload$invoke$1);
                                                if (obj != coroutineSingletons) {
                                                    dsl10 = dsl5;
                                                    dsl11 = dsl6;
                                                    byteString = (ByteString) obj;
                                                    if (byteString != null) {
                                                        dsl10.setAuid(byteString);
                                                    }
                                                    DeviceInfoRepository deviceInfoRepository5 = this.deviceInfoRepository;
                                                    androidGetInitializationRequestPayload$invoke$1.L$0 = dsl11;
                                                    androidGetInitializationRequestPayload$invoke$1.L$1 = dsl10;
                                                    androidGetInitializationRequestPayload$invoke$1.label = 6;
                                                    obj = deviceInfoRepository5.getAuidString(androidGetInitializationRequestPayload$invoke$1);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                return coroutineSingletons;
                            }
                        }
                        z = false;
                        _create.setIsFirstInit(!z);
                        GetClientInfo getClientInfo2 = this.getClientInfo;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = _create;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = _create;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = _create;
                        androidGetInitializationRequestPayload$invoke$1.label = 1;
                        obj = getClientInfo2.invoke(androidGetInitializationRequestPayload$invoke$1);
                        if (obj != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 1:
                        _create = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        dsl2 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$0;
                        kotlin.a.a(obj);
                        _create.setClientInfo((ClientInfoOuterClass.ClientInfo) obj);
                        DeviceInfoRepository deviceInfoRepository6 = this.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl2;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = dsl;
                        androidGetInitializationRequestPayload$invoke$1.label = 2;
                        obj = deviceInfoRepository6.getIdfi(androidGetInitializationRequestPayload$invoke$1);
                        if (obj != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 2:
                        dsl3 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        dsl2 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$0;
                        kotlin.a.a(obj);
                        dsl3.setIdfi((String) obj);
                        analyticsUserId = this.deviceInfoRepository.getAnalyticsUserId();
                        if (analyticsUserId != null) {
                        }
                        dsl.setSessionId(this.sessionRepository.getSessionId());
                        _create2 = InitializationDeviceInfoKt.Dsl.Companion._create(InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder());
                        _create2.setBundleId(this.deviceInfoRepository.getAppName());
                        _create2.setDeviceModel(this.deviceInfoRepository.getModel());
                        _create2.setDeviceMake(this.deviceInfoRepository.getManufacturer());
                        _create2.setOsVersion(this.deviceInfoRepository.getOsVersion());
                        DeviceInfoRepository deviceInfoRepository22 = this.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl2;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = _create2;
                        androidGetInitializationRequestPayload$invoke$1.L$3 = dsl;
                        androidGetInitializationRequestPayload$invoke$1.L$4 = _create2;
                        androidGetInitializationRequestPayload$invoke$1.L$5 = _create2;
                        androidGetInitializationRequestPayload$invoke$1.label = 3;
                        obj = deviceInfoRepository22.staticDeviceInfo(androidGetInitializationRequestPayload$invoke$1);
                        if (obj != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 3:
                        _create2 = (InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$5;
                        dsl7 = (InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$4;
                        dsl8 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$3;
                        dsl4 = (InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl5 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        dsl6 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$0;
                        kotlin.a.a(obj);
                        _create2.setTotalDiskSpace(((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getTotalDiskSpace());
                        DeviceInfoRepository deviceInfoRepository32 = this.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl6;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl5;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = dsl4;
                        androidGetInitializationRequestPayload$invoke$1.L$3 = dsl8;
                        androidGetInitializationRequestPayload$invoke$1.L$4 = dsl7;
                        androidGetInitializationRequestPayload$invoke$1.L$5 = dsl7;
                        androidGetInitializationRequestPayload$invoke$1.label = 4;
                        obj = deviceInfoRepository32.staticDeviceInfo(androidGetInitializationRequestPayload$invoke$1);
                        if (obj != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 4:
                        dsl9 = (InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$5;
                        dsl7 = (InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$4;
                        dsl8 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$3;
                        dsl4 = (InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl5 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        dsl6 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$0;
                        kotlin.a.a(obj);
                        dsl9.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getTotalRamMemory());
                        dsl7.setCurrentUiTheme(this.deviceInfoRepository.getCurrentUiTheme());
                        dsl7.setNetworkOperator(this.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator());
                        dsl7.setBatteryLevel(this.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                        dsl7.setBatteryStatus(this.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                        dsl7.setSystemBootTime(this.deviceInfoRepository.getSystemBootTime());
                        dsl7.setLanguage(this.deviceInfoRepository.getDynamicDeviceInfo().getLanguage());
                        dsl7.setLocalList(j5g.g0(this.deviceInfoRepository.getLocaleList(), StringUtils.COMMA, null, null, 0, null, 62));
                        dsl7.setConnectionType(this.deviceInfoRepository.getConnectionTypeStr());
                        dsl7.setBundleVersion(this.deviceInfoRepository.cachedStaticDeviceInfo().getBundleVersion());
                        dsl8.setDeviceInfo(dsl4._build());
                        DeviceInfoRepository deviceInfoRepository42 = this.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl6;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl5;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = null;
                        androidGetInitializationRequestPayload$invoke$1.L$3 = null;
                        androidGetInitializationRequestPayload$invoke$1.L$4 = null;
                        androidGetInitializationRequestPayload$invoke$1.L$5 = null;
                        androidGetInitializationRequestPayload$invoke$1.label = 5;
                        obj = deviceInfoRepository42.getAuidByteString(androidGetInitializationRequestPayload$invoke$1);
                        if (obj != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 5:
                        dsl10 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        dsl11 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$0;
                        kotlin.a.a(obj);
                        byteString = (ByteString) obj;
                        if (byteString != null) {
                        }
                        DeviceInfoRepository deviceInfoRepository52 = this.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl11;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl10;
                        androidGetInitializationRequestPayload$invoke$1.label = 6;
                        obj = deviceInfoRepository52.getAuidString(androidGetInitializationRequestPayload$invoke$1);
                        break;
                    case 6:
                        dsl10 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        dsl11 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$0;
                        kotlin.a.a(obj);
                        String str = (String) obj;
                        if (!(str == null || str.length() == 0)) {
                            dsl10.setAuidString(str);
                        }
                        SessionRepository sessionRepository = this.sessionRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl11;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl10;
                        androidGetInitializationRequestPayload$invoke$1.label = 7;
                        obj = sessionRepository.getPrivacy(androidGetInitializationRequestPayload$invoke$1);
                        break;
                    case 7:
                        dsl10 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        dsl11 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$0;
                        kotlin.a.a(obj);
                        ByteString byteString2 = (ByteString) obj;
                        if (!byteString2.isEmpty()) {
                            dsl10.setPrivacy(byteString2);
                        }
                        SessionRepository sessionRepository2 = this.sessionRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl11;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl10;
                        androidGetInitializationRequestPayload$invoke$1.label = 8;
                        obj = sessionRepository2.getGatewayCache(androidGetInitializationRequestPayload$invoke$1);
                        break;
                    case 8:
                        dsl10 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        dsl11 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$0;
                        kotlin.a.a(obj);
                        ByteString byteString3 = (ByteString) obj;
                        if (!byteString3.isEmpty()) {
                            dsl10.setCache(byteString3);
                        }
                        String legacyFlowUserConsent = this.legacyUserConsentRepository.getLegacyFlowUserConsent();
                        if (legacyFlowUserConsent != null) {
                            dsl10.setLegacyFlowUserConsent(legacyFlowUserConsent);
                        }
                        String unityInstallationId = this.sessionRepository.getUnityInstallationId();
                        if (unityInstallationId != null) {
                            dsl10.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                        }
                        String unityMegaSessionId = this.sessionRepository.getUnityMegaSessionId();
                        if (unityMegaSessionId != null) {
                            dsl10.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                        }
                        DeviceInfoRepository deviceInfoRepository7 = this.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl11;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl10;
                        androidGetInitializationRequestPayload$invoke$1.label = 9;
                        obj = deviceInfoRepository7.getUnityBuildGuid(androidGetInitializationRequestPayload$invoke$1);
                        break;
                    case 9:
                        dsl10 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        dsl11 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$0;
                        kotlin.a.a(obj);
                        String str2 = (String) obj;
                        if (str2 == null || str2.length() == 0) {
                            obj = null;
                        }
                        String str3 = (String) obj;
                        if (str3 != null) {
                            dsl10.setUnityBuildGuid(str3);
                        }
                        InitializationConfigurationInternal initializationConfiguration = this.sessionRepository.getInitializationConfiguration();
                        if (initializationConfiguration != null && (extras = initializationConfiguration.getExtras()) != null) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(extras);
                            String str4 = (String) linkedHashMap.remove("uads_init_blob");
                            if (str4 != null && (byteStringUtf82 = ByteStringsKt.toByteStringUtf8(str4)) != null) {
                                new MutablePropertyReference0Impl(dsl10) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$9$2
                                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
                                    public Object get() {
                                        return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                    }

                                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
                                    public void set(Object obj4) {
                                        ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj4);
                                    }
                                }.set(byteStringUtf82);
                            }
                            dsl10.putAllExtras(dsl10.getExtrasMap(), linkedHashMap);
                        }
                        if (!dsl10.hasUadsInitBlob()) {
                            MediationInitBlobMetadataReader mediationInitBlobMetadataReader = this.mediationInitBlobMetadataReader;
                            Object obj4 = mediationInitBlobMetadataReader.getJsonStorage().get(mediationInitBlobMetadataReader.getKey());
                            if (obj4 != null) {
                                if (!(obj4 instanceof String)) {
                                    obj4 = null;
                                }
                                if (obj4 != null) {
                                    obj2 = obj4;
                                }
                            }
                            String str5 = (String) obj2;
                            if (str5 != null && (byteStringUtf8 = ByteStringsKt.toByteStringUtf8(str5)) != null) {
                                new MutablePropertyReference0Impl(dsl10) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$11
                                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
                                    public Object get() {
                                        return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                    }

                                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
                                    public void set(Object obj5) {
                                        ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj5);
                                    }
                                }.set(byteStringUtf8);
                            }
                        }
                        if (dsl10.getIsFirstInit()) {
                            InstallReferrerDataSource installReferrerDataSource = this.installReferrerDataSource;
                            androidGetInitializationRequestPayload$invoke$1.L$0 = dsl11;
                            androidGetInitializationRequestPayload$invoke$1.L$1 = dsl10;
                            androidGetInitializationRequestPayload$invoke$1.label = 10;
                            obj = installReferrerDataSource.invoke(androidGetInitializationRequestPayload$invoke$1);
                            if (obj != coroutineSingletons) {
                                dsl12 = dsl10;
                                dsl13 = dsl11;
                                installReferrer = (InitializationRequestOuterClass.InstallReferrer) obj;
                                if (installReferrer != null) {
                                    dsl12.setInstallReferrer(installReferrer);
                                }
                                dsl11 = dsl13;
                                dsl10 = dsl12;
                            }
                            return coroutineSingletons;
                        }
                        userIdentifier = UnityAds.getUserIdentifier();
                        if (userIdentifier != null) {
                            dsl10.setExternalUserIdentifier(userIdentifier);
                        }
                        if (this.sessionRepository.getNativeConfiguration().getFeatureFlags().getCollectGoogleAppId() && (googleAppId = this.googleAppIdDataSource.getGoogleAppId()) != null) {
                            dsl10.setGoogleAppId(googleAppId);
                        }
                        return dsl11._build();
                    case 10:
                        dsl12 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        dsl13 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$0;
                        kotlin.a.a(obj);
                        installReferrer = (InitializationRequestOuterClass.InstallReferrer) obj;
                        if (installReferrer != null) {
                        }
                        dsl11 = dsl13;
                        dsl10 = dsl12;
                        userIdentifier = UnityAds.getUserIdentifier();
                        if (userIdentifier != null) {
                        }
                        if (this.sessionRepository.getNativeConfiguration().getFeatureFlags().getCollectGoogleAppId()) {
                            dsl10.setGoogleAppId(googleAppId);
                            break;
                        }
                        return dsl11._build();
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        androidGetInitializationRequestPayload$invoke$1 = new AndroidGetInitializationRequestPayload$invoke$1(this, spjVar);
        Object obj5 = androidGetInitializationRequestPayload$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        Object obj22 = null;
        switch (androidGetInitializationRequestPayload$invoke$1.label) {
        }
    }
}
