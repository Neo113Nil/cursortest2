package com.unity3d.ads.core.domain;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
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
import defpackage.a70;
import defpackage.lu3;
import defpackage.r0d;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.InitializationDeviceInfoKt;
import gatewayprotocol.v1.InitializationRequestKt;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetInitializationRequestPayload;", "Lcom/unity3d/ads/core/domain/GetInitializationRequestPayload;", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "getClientInfo", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/LegacyUserConsentRepository;", "legacyUserConsentRepository", "Lcom/unity3d/ads/core/configuration/MediationInitBlobMetadataReader;", "mediationInitBlobMetadataReader", "Lcom/unity3d/ads/core/data/datasource/InstallReferrerDataSource;", "installReferrerDataSource", "Lcom/unity3d/ads/core/data/datasource/GoogleAppIdDataSource;", "googleAppIdDataSource", "<init>", "(Lcom/unity3d/ads/core/domain/GetClientInfo;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/LegacyUserConsentRepository;Lcom/unity3d/ads/core/configuration/MediationInitBlobMetadataReader;Lcom/unity3d/ads/core/data/datasource/InstallReferrerDataSource;Lcom/unity3d/ads/core/data/datasource/GoogleAppIdDataSource;)V", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "invoke", "(Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/data/repository/LegacyUserConsentRepository;", "Lcom/unity3d/ads/core/configuration/MediationInitBlobMetadataReader;", "Lcom/unity3d/ads/core/data/datasource/InstallReferrerDataSource;", "Lcom/unity3d/ads/core/data/datasource/GoogleAppIdDataSource;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidGetInitializationRequestPayload implements GetInitializationRequestPayload {

    @NotNull
    private static final String BLOB_EXTRA_KEY = "uads_init_blob";

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final GetClientInfo getClientInfo;

    @NotNull
    private final GoogleAppIdDataSource googleAppIdDataSource;

    @NotNull
    private final InstallReferrerDataSource installReferrerDataSource;

    @NotNull
    private final LegacyUserConsentRepository legacyUserConsentRepository;

    @NotNull
    private final MediationInitBlobMetadataReader mediationInitBlobMetadataReader;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidGetInitializationRequestPayload(@NotNull GetClientInfo getClientInfo, @NotNull SessionRepository sessionRepository, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull LegacyUserConsentRepository legacyUserConsentRepository, @NotNull MediationInitBlobMetadataReader mediationInitBlobMetadataReader, @NotNull InstallReferrerDataSource installReferrerDataSource, @NotNull GoogleAppIdDataSource googleAppIdDataSource) {
        getClientInfo.getClass();
        sessionRepository.getClass();
        deviceInfoRepository.getClass();
        legacyUserConsentRepository.getClass();
        mediationInitBlobMetadataReader.getClass();
        installReferrerDataSource.getClass();
        googleAppIdDataSource.getClass();
        this.getClientInfo = getClientInfo;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.legacyUserConsentRepository = legacyUserConsentRepository;
        this.mediationInitBlobMetadataReader = mediationInitBlobMetadataReader;
        this.installReferrerDataSource = installReferrerDataSource;
        this.googleAppIdDataSource = googleAppIdDataSource;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0304, code lost:
    
        if (r1 == r3) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02be, code lost:
    
        if (r1 == r3) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02a1, code lost:
    
        if (r1 == r3) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0282, code lost:
    
        if (r1 != r3) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0272  */
    @Override // com.unity3d.ads.core.domain.GetInitializationRequestPayload
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull rq3<? super InitializationRequestOuterClass.InitializationRequest> rq3Var) {
        AndroidGetInitializationRequestPayload$invoke$1 androidGetInitializationRequestPayload$invoke$1;
        InitializationRequestKt.Dsl _create;
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
        if (rq3Var instanceof AndroidGetInitializationRequestPayload$invoke$1) {
            androidGetInitializationRequestPayload$invoke$1 = (AndroidGetInitializationRequestPayload$invoke$1) rq3Var;
            int i = androidGetInitializationRequestPayload$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidGetInitializationRequestPayload$invoke$1.label = i - Integer.MIN_VALUE;
                Object obj = androidGetInitializationRequestPayload$invoke$1.result;
                lu3 lu3Var = lu3.a;
                Object obj2 = null;
                switch (androidGetInitializationRequestPayload$invoke$1.label) {
                    case 0:
                        y6a.M(obj);
                        InitializationRequestKt.Dsl.Companion companion = InitializationRequestKt.Dsl.INSTANCE;
                        InitializationRequestOuterClass.InitializationRequest.Builder newBuilder = InitializationRequestOuterClass.InitializationRequest.newBuilder();
                        newBuilder.getClass();
                        _create = companion._create(newBuilder);
                        Storage storage = StorageManager.getStorage(StorageManager.StorageType.PRIVATE);
                        boolean z = false;
                        if (storage.readStorage()) {
                            Object obj3 = storage.get("configuration.hasInitialized");
                            Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z = true;
                            }
                        }
                        _create.setIsFirstInit(!z);
                        GetClientInfo getClientInfo = this.getClientInfo;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = _create;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = _create;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = _create;
                        androidGetInitializationRequestPayload$invoke$1.label = 1;
                        obj = getClientInfo.invoke(androidGetInitializationRequestPayload$invoke$1);
                        if (obj != lu3Var) {
                            dsl = _create;
                            dsl2 = dsl;
                            _create.setClientInfo((ClientInfoOuterClass.ClientInfo) obj);
                            DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                            androidGetInitializationRequestPayload$invoke$1.L$0 = dsl2;
                            androidGetInitializationRequestPayload$invoke$1.L$1 = dsl;
                            androidGetInitializationRequestPayload$invoke$1.L$2 = dsl;
                            androidGetInitializationRequestPayload$invoke$1.label = 2;
                            obj = deviceInfoRepository.getIdfi(androidGetInitializationRequestPayload$invoke$1);
                            if (obj != lu3Var) {
                                dsl3 = dsl;
                                dsl3.setIdfi((String) obj);
                                analyticsUserId = this.deviceInfoRepository.getAnalyticsUserId();
                                if (analyticsUserId != null) {
                                    dsl.setAnalyticsUserId(analyticsUserId);
                                }
                                dsl.setSessionId(this.sessionRepository.getSessionId());
                                InitializationDeviceInfoKt.Dsl.Companion companion2 = InitializationDeviceInfoKt.Dsl.INSTANCE;
                                InitializationRequestOuterClass.InitializationDeviceInfo.Builder newBuilder2 = InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder();
                                newBuilder2.getClass();
                                _create2 = companion2._create(newBuilder2);
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
                                if (obj != lu3Var) {
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
                                    if (obj != lu3Var) {
                                        dsl9 = dsl7;
                                        dsl9.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getTotalRamMemory());
                                        dsl7.setCurrentUiTheme(this.deviceInfoRepository.getCurrentUiTheme());
                                        String networkOperator = this.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                                        networkOperator.getClass();
                                        dsl7.setNetworkOperator(networkOperator);
                                        dsl7.setBatteryLevel(this.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                                        dsl7.setBatteryStatus(this.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                                        dsl7.setSystemBootTime(this.deviceInfoRepository.getSystemBootTime());
                                        String language = this.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                                        language.getClass();
                                        dsl7.setLanguage(language);
                                        dsl7.setLocalList(CollectionsKt.f0(this.deviceInfoRepository.getLocaleList(), BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62));
                                        dsl7.setConnectionType(this.deviceInfoRepository.getConnectionTypeStr());
                                        String bundleVersion = this.deviceInfoRepository.cachedStaticDeviceInfo().getBundleVersion();
                                        bundleVersion.getClass();
                                        dsl7.setBundleVersion(bundleVersion);
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
                                        if (obj != lu3Var) {
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
                        return lu3Var;
                    case 1:
                        _create = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        dsl2 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$0;
                        y6a.M(obj);
                        _create.setClientInfo((ClientInfoOuterClass.ClientInfo) obj);
                        DeviceInfoRepository deviceInfoRepository6 = this.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl2;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = dsl;
                        androidGetInitializationRequestPayload$invoke$1.label = 2;
                        obj = deviceInfoRepository6.getIdfi(androidGetInitializationRequestPayload$invoke$1);
                        if (obj != lu3Var) {
                        }
                        return lu3Var;
                    case 2:
                        dsl3 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        dsl2 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$0;
                        y6a.M(obj);
                        dsl3.setIdfi((String) obj);
                        analyticsUserId = this.deviceInfoRepository.getAnalyticsUserId();
                        if (analyticsUserId != null) {
                        }
                        dsl.setSessionId(this.sessionRepository.getSessionId());
                        InitializationDeviceInfoKt.Dsl.Companion companion22 = InitializationDeviceInfoKt.Dsl.INSTANCE;
                        InitializationRequestOuterClass.InitializationDeviceInfo.Builder newBuilder22 = InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder();
                        newBuilder22.getClass();
                        _create2 = companion22._create(newBuilder22);
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
                        if (obj != lu3Var) {
                        }
                        return lu3Var;
                    case 3:
                        _create2 = (InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$5;
                        dsl7 = (InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$4;
                        dsl8 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$3;
                        dsl4 = (InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl5 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        dsl6 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$0;
                        y6a.M(obj);
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
                        if (obj != lu3Var) {
                        }
                        return lu3Var;
                    case 4:
                        dsl9 = (InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$5;
                        dsl7 = (InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$4;
                        dsl8 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$3;
                        dsl4 = (InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl5 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        dsl6 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$0;
                        y6a.M(obj);
                        dsl9.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getTotalRamMemory());
                        dsl7.setCurrentUiTheme(this.deviceInfoRepository.getCurrentUiTheme());
                        String networkOperator2 = this.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                        networkOperator2.getClass();
                        dsl7.setNetworkOperator(networkOperator2);
                        dsl7.setBatteryLevel(this.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                        dsl7.setBatteryStatus(this.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                        dsl7.setSystemBootTime(this.deviceInfoRepository.getSystemBootTime());
                        String language2 = this.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                        language2.getClass();
                        dsl7.setLanguage(language2);
                        dsl7.setLocalList(CollectionsKt.f0(this.deviceInfoRepository.getLocaleList(), BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62));
                        dsl7.setConnectionType(this.deviceInfoRepository.getConnectionTypeStr());
                        String bundleVersion2 = this.deviceInfoRepository.cachedStaticDeviceInfo().getBundleVersion();
                        bundleVersion2.getClass();
                        dsl7.setBundleVersion(bundleVersion2);
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
                        if (obj != lu3Var) {
                        }
                        return lu3Var;
                    case 5:
                        dsl10 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        dsl11 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$0;
                        y6a.M(obj);
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
                        y6a.M(obj);
                        String str = (String) obj;
                        if (str != null && str.length() != 0) {
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
                        y6a.M(obj);
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
                        y6a.M(obj);
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
                        y6a.M(obj);
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
                            String str4 = (String) linkedHashMap.remove(BLOB_EXTRA_KEY);
                            if (str4 != null && (byteStringUtf82 = ByteStringsKt.toByteStringUtf8(str4)) != null) {
                                new r0d(dsl10) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$9$2
                                    @Override // kotlin.reflect.KProperty0
                                    public Object get() {
                                        return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                    }

                                    @Override // kotlin.reflect.KMutableProperty0
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
                                new r0d(dsl10) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$11
                                    @Override // kotlin.reflect.KProperty0
                                    public Object get() {
                                        return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                    }

                                    @Override // kotlin.reflect.KMutableProperty0
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
                            if (obj != lu3Var) {
                                dsl12 = dsl10;
                                dsl13 = dsl11;
                                installReferrer = (InitializationRequestOuterClass.InstallReferrer) obj;
                                if (installReferrer != null) {
                                    dsl12.setInstallReferrer(installReferrer);
                                }
                                dsl11 = dsl13;
                                dsl10 = dsl12;
                            }
                            return lu3Var;
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
                        y6a.M(obj);
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
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        androidGetInitializationRequestPayload$invoke$1 = new AndroidGetInitializationRequestPayload$invoke$1(this, rq3Var);
        Object obj5 = androidGetInitializationRequestPayload$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        Object obj22 = null;
        switch (androidGetInitializationRequestPayload$invoke$1.label) {
        }
    }
}
