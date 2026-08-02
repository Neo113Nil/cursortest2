package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.AdDataRefreshRequestKt;
import gatewayprotocol.v1.AdDataRefreshRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.spj;

/* compiled from: AndroidGetAdDataRefreshRequest.kt */
/* loaded from: classes14.dex */
public final class AndroidGetAdDataRefreshRequest implements GetAdDataRefreshRequest {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final SessionRepository sessionRepository;

    public AndroidGetAdDataRefreshRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, CampaignRepository campaignRepository) {
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.campaignRepository = campaignRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.unity3d.ads.core.domain.GetAdDataRefreshRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(ByteString byteString, ByteString byteString2, spj<? super UniversalRequestOuterClass.UniversalRequest> spjVar) {
        AndroidGetAdDataRefreshRequest$invoke$1 androidGetAdDataRefreshRequest$invoke$1;
        int i;
        ByteString byteString3;
        ByteString byteString4;
        AdDataRefreshRequestKt.Dsl dsl;
        AdDataRefreshRequestKt.Dsl dsl2;
        AdDataRefreshRequestKt.Dsl dsl3;
        if (spjVar instanceof AndroidGetAdDataRefreshRequest$invoke$1) {
            androidGetAdDataRefreshRequest$invoke$1 = (AndroidGetAdDataRefreshRequest$invoke$1) spjVar;
            int i2 = androidGetAdDataRefreshRequest$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidGetAdDataRefreshRequest$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidGetAdDataRefreshRequest$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidGetAdDataRefreshRequest$invoke$1.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    AdDataRefreshRequestKt.Dsl _create = AdDataRefreshRequestKt.Dsl.Companion._create(AdDataRefreshRequestOuterClass.AdDataRefreshRequest.newBuilder());
                    _create.setSessionCounters(this.sessionRepository.getSessionCounters());
                    DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                    androidGetAdDataRefreshRequest$invoke$1.L$0 = byteString;
                    androidGetAdDataRefreshRequest$invoke$1.L$1 = byteString2;
                    androidGetAdDataRefreshRequest$invoke$1.L$2 = _create;
                    androidGetAdDataRefreshRequest$invoke$1.L$3 = _create;
                    androidGetAdDataRefreshRequest$invoke$1.L$4 = _create;
                    androidGetAdDataRefreshRequest$invoke$1.label = 1;
                    Object staticDeviceInfo = deviceInfoRepository.staticDeviceInfo(androidGetAdDataRefreshRequest$invoke$1);
                    if (staticDeviceInfo != coroutineSingletons) {
                        byteString3 = byteString;
                        byteString4 = byteString2;
                        dsl = _create;
                        dsl2 = dsl;
                        obj = staticDeviceInfo;
                        dsl3 = dsl2;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return obj;
                }
                dsl = (AdDataRefreshRequestKt.Dsl) androidGetAdDataRefreshRequest$invoke$1.L$4;
                dsl2 = (AdDataRefreshRequestKt.Dsl) androidGetAdDataRefreshRequest$invoke$1.L$3;
                dsl3 = (AdDataRefreshRequestKt.Dsl) androidGetAdDataRefreshRequest$invoke$1.L$2;
                byteString4 = (ByteString) androidGetAdDataRefreshRequest$invoke$1.L$1;
                byteString3 = (ByteString) androidGetAdDataRefreshRequest$invoke$1.L$0;
                kotlin.a.a(obj);
                dsl.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
                dsl2.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
                dsl2.setImpressionOpportunityId(byteString3);
                dsl2.setCampaignState(this.campaignRepository.getCampaignState());
                if (!byteString4.isEmpty()) {
                    dsl2.setAdDataRefreshToken(byteString4);
                }
                AdDataRefreshRequestOuterClass.AdDataRefreshRequest _build = dsl3._build();
                UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                UniversalRequestKt.PayloadKt.Dsl _create2 = UniversalRequestKt.PayloadKt.Dsl.Companion._create(UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder());
                _create2.setAdDataRefreshRequest(_build);
                UniversalRequestOuterClass.UniversalRequest.Payload _build2 = _create2._build();
                GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = this.getUniversalRequestForPayLoad;
                androidGetAdDataRefreshRequest$invoke$1.L$0 = null;
                androidGetAdDataRefreshRequest$invoke$1.L$1 = null;
                androidGetAdDataRefreshRequest$invoke$1.L$2 = null;
                androidGetAdDataRefreshRequest$invoke$1.L$3 = null;
                androidGetAdDataRefreshRequest$invoke$1.L$4 = null;
                androidGetAdDataRefreshRequest$invoke$1.label = 2;
                Object invoke = getUniversalRequestForPayLoad.invoke(_build2, androidGetAdDataRefreshRequest$invoke$1);
                return invoke != coroutineSingletons ? coroutineSingletons : invoke;
            }
        }
        androidGetAdDataRefreshRequest$invoke$1 = new AndroidGetAdDataRefreshRequest$invoke$1(this, spjVar);
        Object obj2 = androidGetAdDataRefreshRequest$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidGetAdDataRefreshRequest$invoke$1.label;
        if (i != 0) {
        }
        dsl.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj2);
        dsl2.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
        dsl2.setImpressionOpportunityId(byteString3);
        dsl2.setCampaignState(this.campaignRepository.getCampaignState());
        if (!byteString4.isEmpty()) {
        }
        AdDataRefreshRequestOuterClass.AdDataRefreshRequest _build3 = dsl3._build();
        UniversalRequestKt universalRequestKt2 = UniversalRequestKt.INSTANCE;
        UniversalRequestKt.PayloadKt.Dsl _create22 = UniversalRequestKt.PayloadKt.Dsl.Companion._create(UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder());
        _create22.setAdDataRefreshRequest(_build3);
        UniversalRequestOuterClass.UniversalRequest.Payload _build22 = _create22._build();
        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2 = this.getUniversalRequestForPayLoad;
        androidGetAdDataRefreshRequest$invoke$1.L$0 = null;
        androidGetAdDataRefreshRequest$invoke$1.L$1 = null;
        androidGetAdDataRefreshRequest$invoke$1.L$2 = null;
        androidGetAdDataRefreshRequest$invoke$1.L$3 = null;
        androidGetAdDataRefreshRequest$invoke$1.L$4 = null;
        androidGetAdDataRefreshRequest$invoke$1.label = 2;
        Object invoke2 = getUniversalRequestForPayLoad2.invoke(_build22, androidGetAdDataRefreshRequest$invoke$1);
        if (invoke2 != coroutineSingletons2) {
        }
    }
}
