package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import defpackage.a70;
import defpackage.lu3;
import defpackage.r0d;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.AdRequestKt;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096B¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 ¨\u0006!"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetAdRequest;", "Lcom/unity3d/ads/core/domain/GetAdRequest;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "campaignRepository", "Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;", "webViewConfigurationDataSource", "Lcom/unity3d/ads/core/data/repository/TcfRepository;", "tcfRepository", "<init>", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/CampaignRepository;Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;Lcom/unity3d/ads/core/data/repository/TcfRepository;)V", "", "placement", "Lcom/google/protobuf/ByteString;", "impressionOpportunity", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "size", "Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;", "loadConfiguration", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "invoke", "(Ljava/lang/String;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;", "Lcom/unity3d/ads/core/data/repository/TcfRepository;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidGetAdRequest implements GetAdRequest {

    @NotNull
    private final CampaignRepository campaignRepository;

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final TcfRepository tcfRepository;

    @NotNull
    private final WebviewConfigurationDataSource webViewConfigurationDataSource;

    public AndroidGetAdRequest(@NotNull GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, @NotNull SessionRepository sessionRepository, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull CampaignRepository campaignRepository, @NotNull WebviewConfigurationDataSource webviewConfigurationDataSource, @NotNull TcfRepository tcfRepository) {
        getUniversalRequestForPayLoad.getClass();
        sessionRepository.getClass();
        deviceInfoRepository.getClass();
        campaignRepository.getClass();
        webviewConfigurationDataSource.getClass();
        tcfRepository.getClass();
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.campaignRepository = campaignRepository;
        this.webViewConfigurationDataSource = webviewConfigurationDataSource;
        this.tcfRepository = tcfRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0158 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.domain.GetAdRequest
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull String str, @NotNull ByteString byteString, @Nullable AdRequestOuterClass.BannerSize bannerSize, @Nullable LoadConfigurationInternal loadConfigurationInternal, @NotNull rq3<? super UniversalRequestOuterClass.UniversalRequest> rq3Var) {
        AndroidGetAdRequest$invoke$1 androidGetAdRequest$invoke$1;
        lu3 lu3Var;
        int i;
        AdRequestKt.Dsl _create;
        Object staticDeviceInfo;
        String str2;
        ByteString byteString2;
        AdRequestKt.Dsl dsl;
        final AdRequestKt.Dsl dsl2;
        Object obj;
        AdRequestOuterClass.BannerSize bannerSize2;
        AdRequestKt.Dsl dsl3;
        AdRequestKt.Dsl dsl4;
        String tcfString;
        if (rq3Var instanceof AndroidGetAdRequest$invoke$1) {
            androidGetAdRequest$invoke$1 = (AndroidGetAdRequest$invoke$1) rq3Var;
            int i2 = androidGetAdRequest$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidGetAdRequest$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = androidGetAdRequest$invoke$1.result;
                lu3Var = lu3.a;
                i = androidGetAdRequest$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj2);
                    AdRequestKt.Dsl.Companion companion = AdRequestKt.Dsl.INSTANCE;
                    AdRequestOuterClass.AdRequest.Builder newBuilder = AdRequestOuterClass.AdRequest.newBuilder();
                    newBuilder.getClass();
                    _create = companion._create(newBuilder);
                    _create.setSessionCounters(this.sessionRepository.getSessionCounters());
                    DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                    androidGetAdRequest$invoke$1.L$0 = str;
                    androidGetAdRequest$invoke$1.L$1 = byteString;
                    androidGetAdRequest$invoke$1.L$2 = bannerSize;
                    androidGetAdRequest$invoke$1.L$3 = loadConfigurationInternal;
                    androidGetAdRequest$invoke$1.L$4 = _create;
                    androidGetAdRequest$invoke$1.L$5 = _create;
                    androidGetAdRequest$invoke$1.L$6 = _create;
                    androidGetAdRequest$invoke$1.label = 1;
                    staticDeviceInfo = deviceInfoRepository.staticDeviceInfo(androidGetAdRequest$invoke$1);
                    if (staticDeviceInfo != lu3Var) {
                        str2 = str;
                        byteString2 = byteString;
                        dsl = _create;
                        dsl2 = dsl;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            y6a.M(obj2);
                            return obj2;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dsl4 = (AdRequestKt.Dsl) androidGetAdRequest$invoke$1.L$4;
                    dsl2 = (AdRequestKt.Dsl) androidGetAdRequest$invoke$1.L$3;
                    dsl3 = (AdRequestKt.Dsl) androidGetAdRequest$invoke$1.L$2;
                    loadConfigurationInternal = (LoadConfigurationInternal) androidGetAdRequest$invoke$1.L$1;
                    bannerSize2 = (AdRequestOuterClass.BannerSize) androidGetAdRequest$invoke$1.L$0;
                    y6a.M(obj2);
                    dsl4.setWebviewVersion(((WebviewConfigurationStore.WebViewConfigurationStore) obj2).getVersion());
                    dsl2.setCampaignState(this.campaignRepository.getCampaignState());
                    if (bannerSize2 != null) {
                        dsl2.setAdRequestType(AdRequestOuterClass.AdRequestType.AD_REQUEST_TYPE_FULLSCREEN);
                    } else {
                        dsl2.setAdRequestType(AdRequestOuterClass.AdRequestType.AD_REQUEST_TYPE_BANNER);
                        dsl2.setBannerSize(bannerSize2);
                    }
                    tcfString = this.tcfRepository.getTcfString();
                    if (tcfString != null) {
                        dsl2.setTcf(ByteStringsKt.toByteStringUtf8(tcfString));
                    }
                    if (loadConfigurationInternal != null) {
                        String mediationAdUnitId = loadConfigurationInternal.getMediationAdUnitId();
                        if (mediationAdUnitId != null) {
                            new r0d(dsl2) { // from class: com.unity3d.ads.core.domain.AndroidGetAdRequest$invoke$request$1$2$2
                                @Override // kotlin.reflect.KProperty0
                                public Object get() {
                                    return ((AdRequestKt.Dsl) this.receiver).getMediationAdUnitId();
                                }

                                @Override // kotlin.reflect.KMutableProperty0
                                public void set(Object obj3) {
                                    ((AdRequestKt.Dsl) this.receiver).setMediationAdUnitId((String) obj3);
                                }
                            }.set(mediationAdUnitId);
                        }
                        dsl2.putAllExtras(dsl2.getExtrasMap(), loadConfigurationInternal.getExtras());
                    }
                    AdRequestOuterClass.AdRequest _build = dsl3._build();
                    UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                    UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
                    UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder2 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                    newBuilder2.getClass();
                    UniversalRequestKt.PayloadKt.Dsl _create2 = companion2._create(newBuilder2);
                    _create2.setAdRequest(_build);
                    UniversalRequestOuterClass.UniversalRequest.Payload _build2 = _create2._build();
                    GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = this.getUniversalRequestForPayLoad;
                    androidGetAdRequest$invoke$1.L$0 = null;
                    androidGetAdRequest$invoke$1.L$1 = null;
                    androidGetAdRequest$invoke$1.L$2 = null;
                    androidGetAdRequest$invoke$1.L$3 = null;
                    androidGetAdRequest$invoke$1.L$4 = null;
                    androidGetAdRequest$invoke$1.label = 3;
                    Object invoke = getUniversalRequestForPayLoad.invoke(_build2, androidGetAdRequest$invoke$1);
                    return invoke != lu3Var ? lu3Var : invoke;
                }
                dsl = (AdRequestKt.Dsl) androidGetAdRequest$invoke$1.L$6;
                dsl2 = (AdRequestKt.Dsl) androidGetAdRequest$invoke$1.L$5;
                AdRequestKt.Dsl dsl5 = (AdRequestKt.Dsl) androidGetAdRequest$invoke$1.L$4;
                loadConfigurationInternal = (LoadConfigurationInternal) androidGetAdRequest$invoke$1.L$3;
                AdRequestOuterClass.BannerSize bannerSize3 = (AdRequestOuterClass.BannerSize) androidGetAdRequest$invoke$1.L$2;
                byteString2 = (ByteString) androidGetAdRequest$invoke$1.L$1;
                str2 = (String) androidGetAdRequest$invoke$1.L$0;
                y6a.M(obj2);
                _create = dsl5;
                bannerSize = bannerSize3;
                staticDeviceInfo = obj2;
                dsl.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) staticDeviceInfo);
                dsl2.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
                dsl2.setImpressionOpportunityId(byteString2);
                dsl2.setPlacementId(str2);
                dsl2.setRequestImpressionConfiguration(true);
                WebviewConfigurationDataSource webviewConfigurationDataSource = this.webViewConfigurationDataSource;
                androidGetAdRequest$invoke$1.L$0 = bannerSize;
                androidGetAdRequest$invoke$1.L$1 = loadConfigurationInternal;
                androidGetAdRequest$invoke$1.L$2 = _create;
                androidGetAdRequest$invoke$1.L$3 = dsl2;
                androidGetAdRequest$invoke$1.L$4 = dsl2;
                androidGetAdRequest$invoke$1.L$5 = null;
                androidGetAdRequest$invoke$1.L$6 = null;
                androidGetAdRequest$invoke$1.label = 2;
                obj = webviewConfigurationDataSource.get(androidGetAdRequest$invoke$1);
                if (obj != lu3Var) {
                    bannerSize2 = bannerSize;
                    dsl3 = _create;
                    obj2 = obj;
                    dsl4 = dsl2;
                    dsl4.setWebviewVersion(((WebviewConfigurationStore.WebViewConfigurationStore) obj2).getVersion());
                    dsl2.setCampaignState(this.campaignRepository.getCampaignState());
                    if (bannerSize2 != null) {
                    }
                    tcfString = this.tcfRepository.getTcfString();
                    if (tcfString != null) {
                    }
                    if (loadConfigurationInternal != null) {
                    }
                    AdRequestOuterClass.AdRequest _build3 = dsl3._build();
                    UniversalRequestKt universalRequestKt2 = UniversalRequestKt.INSTANCE;
                    UniversalRequestKt.PayloadKt.Dsl.Companion companion22 = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
                    UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder22 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                    newBuilder22.getClass();
                    UniversalRequestKt.PayloadKt.Dsl _create22 = companion22._create(newBuilder22);
                    _create22.setAdRequest(_build3);
                    UniversalRequestOuterClass.UniversalRequest.Payload _build22 = _create22._build();
                    GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2 = this.getUniversalRequestForPayLoad;
                    androidGetAdRequest$invoke$1.L$0 = null;
                    androidGetAdRequest$invoke$1.L$1 = null;
                    androidGetAdRequest$invoke$1.L$2 = null;
                    androidGetAdRequest$invoke$1.L$3 = null;
                    androidGetAdRequest$invoke$1.L$4 = null;
                    androidGetAdRequest$invoke$1.label = 3;
                    Object invoke2 = getUniversalRequestForPayLoad2.invoke(_build22, androidGetAdRequest$invoke$1);
                    if (invoke2 != lu3Var) {
                    }
                }
            }
        }
        androidGetAdRequest$invoke$1 = new AndroidGetAdRequest$invoke$1(this, rq3Var);
        Object obj22 = androidGetAdRequest$invoke$1.result;
        lu3Var = lu3.a;
        i = androidGetAdRequest$invoke$1.label;
        if (i != 0) {
        }
        dsl.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) staticDeviceInfo);
        dsl2.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
        dsl2.setImpressionOpportunityId(byteString2);
        dsl2.setPlacementId(str2);
        dsl2.setRequestImpressionConfiguration(true);
        WebviewConfigurationDataSource webviewConfigurationDataSource2 = this.webViewConfigurationDataSource;
        androidGetAdRequest$invoke$1.L$0 = bannerSize;
        androidGetAdRequest$invoke$1.L$1 = loadConfigurationInternal;
        androidGetAdRequest$invoke$1.L$2 = _create;
        androidGetAdRequest$invoke$1.L$3 = dsl2;
        androidGetAdRequest$invoke$1.L$4 = dsl2;
        androidGetAdRequest$invoke$1.L$5 = null;
        androidGetAdRequest$invoke$1.L$6 = null;
        androidGetAdRequest$invoke$1.label = 2;
        obj = webviewConfigurationDataSource2.get(androidGetAdRequest$invoke$1);
        if (obj != lu3Var) {
        }
    }
}
