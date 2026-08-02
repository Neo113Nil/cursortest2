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
import gatewayprotocol.v1.AdRequestKt;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import xsna.spj;

/* compiled from: AndroidGetAdRequest.kt */
/* loaded from: classes14.dex */
public final class AndroidGetAdRequest implements GetAdRequest {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final SessionRepository sessionRepository;
    private final TcfRepository tcfRepository;
    private final WebviewConfigurationDataSource webViewConfigurationDataSource;

    public AndroidGetAdRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, CampaignRepository campaignRepository, WebviewConfigurationDataSource webviewConfigurationDataSource, TcfRepository tcfRepository) {
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.campaignRepository = campaignRepository;
        this.webViewConfigurationDataSource = webviewConfigurationDataSource;
        this.tcfRepository = tcfRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0154 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.domain.GetAdRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(String str, ByteString byteString, AdRequestOuterClass.BannerSize bannerSize, LoadConfigurationInternal loadConfigurationInternal, spj<? super UniversalRequestOuterClass.UniversalRequest> spjVar) {
        AndroidGetAdRequest$invoke$1 androidGetAdRequest$invoke$1;
        CoroutineSingletons coroutineSingletons;
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
        if (spjVar instanceof AndroidGetAdRequest$invoke$1) {
            androidGetAdRequest$invoke$1 = (AndroidGetAdRequest$invoke$1) spjVar;
            int i2 = androidGetAdRequest$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidGetAdRequest$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = androidGetAdRequest$invoke$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidGetAdRequest$invoke$1.label;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    _create = AdRequestKt.Dsl.Companion._create(AdRequestOuterClass.AdRequest.newBuilder());
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
                    if (staticDeviceInfo != coroutineSingletons) {
                        str2 = str;
                        byteString2 = byteString;
                        dsl = _create;
                        dsl2 = dsl;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj2);
                        return obj2;
                    }
                    dsl4 = (AdRequestKt.Dsl) androidGetAdRequest$invoke$1.L$4;
                    dsl2 = (AdRequestKt.Dsl) androidGetAdRequest$invoke$1.L$3;
                    dsl3 = (AdRequestKt.Dsl) androidGetAdRequest$invoke$1.L$2;
                    loadConfigurationInternal = (LoadConfigurationInternal) androidGetAdRequest$invoke$1.L$1;
                    bannerSize2 = (AdRequestOuterClass.BannerSize) androidGetAdRequest$invoke$1.L$0;
                    kotlin.a.a(obj2);
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
                            new MutablePropertyReference0Impl(dsl2) { // from class: com.unity3d.ads.core.domain.AndroidGetAdRequest$invoke$request$1$2$2
                                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
                                public Object get() {
                                    return ((AdRequestKt.Dsl) this.receiver).getMediationAdUnitId();
                                }

                                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
                                public void set(Object obj3) {
                                    ((AdRequestKt.Dsl) this.receiver).setMediationAdUnitId((String) obj3);
                                }
                            }.set(mediationAdUnitId);
                        }
                        dsl2.putAllExtras(dsl2.getExtrasMap(), loadConfigurationInternal.getExtras());
                    }
                    AdRequestOuterClass.AdRequest _build = dsl3._build();
                    UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                    UniversalRequestKt.PayloadKt.Dsl _create2 = UniversalRequestKt.PayloadKt.Dsl.Companion._create(UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder());
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
                    return invoke != coroutineSingletons ? coroutineSingletons : invoke;
                }
                dsl = (AdRequestKt.Dsl) androidGetAdRequest$invoke$1.L$6;
                dsl2 = (AdRequestKt.Dsl) androidGetAdRequest$invoke$1.L$5;
                AdRequestKt.Dsl dsl5 = (AdRequestKt.Dsl) androidGetAdRequest$invoke$1.L$4;
                loadConfigurationInternal = (LoadConfigurationInternal) androidGetAdRequest$invoke$1.L$3;
                AdRequestOuterClass.BannerSize bannerSize3 = (AdRequestOuterClass.BannerSize) androidGetAdRequest$invoke$1.L$2;
                byteString2 = (ByteString) androidGetAdRequest$invoke$1.L$1;
                str2 = (String) androidGetAdRequest$invoke$1.L$0;
                kotlin.a.a(obj2);
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
                if (obj != coroutineSingletons) {
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
                    UniversalRequestKt.PayloadKt.Dsl _create22 = UniversalRequestKt.PayloadKt.Dsl.Companion._create(UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder());
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
                    if (invoke2 != coroutineSingletons) {
                    }
                }
            }
        }
        androidGetAdRequest$invoke$1 = new AndroidGetAdRequest$invoke$1(this, spjVar);
        Object obj22 = androidGetAdRequest$invoke$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
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
        if (obj != coroutineSingletons) {
        }
    }
}
