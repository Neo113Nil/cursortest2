package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import defpackage.a70;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.AdDataRefreshRequestKt;
import gatewayprotocol.v1.AdDataRefreshRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetAdDataRefreshRequest;", "Lcom/unity3d/ads/core/domain/GetAdDataRefreshRequest;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "campaignRepository", "<init>", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/CampaignRepository;)V", "Lcom/google/protobuf/ByteString;", "opportunityId", "refreshToken", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "invoke", "(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidGetAdDataRefreshRequest implements GetAdDataRefreshRequest {

    @NotNull
    private final CampaignRepository campaignRepository;

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidGetAdDataRefreshRequest(@NotNull GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, @NotNull SessionRepository sessionRepository, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull CampaignRepository campaignRepository) {
        getUniversalRequestForPayLoad.getClass();
        sessionRepository.getClass();
        deviceInfoRepository.getClass();
        campaignRepository.getClass();
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.campaignRepository = campaignRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.domain.GetAdDataRefreshRequest
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull ByteString byteString, @NotNull ByteString byteString2, @NotNull rq3<? super UniversalRequestOuterClass.UniversalRequest> rq3Var) {
        AndroidGetAdDataRefreshRequest$invoke$1 androidGetAdDataRefreshRequest$invoke$1;
        int i;
        ByteString byteString3;
        ByteString byteString4;
        AdDataRefreshRequestKt.Dsl dsl;
        AdDataRefreshRequestKt.Dsl dsl2;
        AdDataRefreshRequestKt.Dsl dsl3;
        if (rq3Var instanceof AndroidGetAdDataRefreshRequest$invoke$1) {
            androidGetAdDataRefreshRequest$invoke$1 = (AndroidGetAdDataRefreshRequest$invoke$1) rq3Var;
            int i2 = androidGetAdDataRefreshRequest$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidGetAdDataRefreshRequest$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidGetAdDataRefreshRequest$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i = androidGetAdDataRefreshRequest$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    AdDataRefreshRequestKt.Dsl.Companion companion = AdDataRefreshRequestKt.Dsl.INSTANCE;
                    AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder newBuilder = AdDataRefreshRequestOuterClass.AdDataRefreshRequest.newBuilder();
                    newBuilder.getClass();
                    AdDataRefreshRequestKt.Dsl _create = companion._create(newBuilder);
                    _create.setSessionCounters(this.sessionRepository.getSessionCounters());
                    DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                    androidGetAdDataRefreshRequest$invoke$1.L$0 = byteString;
                    androidGetAdDataRefreshRequest$invoke$1.L$1 = byteString2;
                    androidGetAdDataRefreshRequest$invoke$1.L$2 = _create;
                    androidGetAdDataRefreshRequest$invoke$1.L$3 = _create;
                    androidGetAdDataRefreshRequest$invoke$1.L$4 = _create;
                    androidGetAdDataRefreshRequest$invoke$1.label = 1;
                    Object staticDeviceInfo = deviceInfoRepository.staticDeviceInfo(androidGetAdDataRefreshRequest$invoke$1);
                    if (staticDeviceInfo != lu3Var) {
                        byteString3 = byteString;
                        byteString4 = byteString2;
                        dsl = _create;
                        dsl2 = dsl;
                        obj = staticDeviceInfo;
                        dsl3 = dsl2;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dsl = (AdDataRefreshRequestKt.Dsl) androidGetAdDataRefreshRequest$invoke$1.L$4;
                dsl2 = (AdDataRefreshRequestKt.Dsl) androidGetAdDataRefreshRequest$invoke$1.L$3;
                dsl3 = (AdDataRefreshRequestKt.Dsl) androidGetAdDataRefreshRequest$invoke$1.L$2;
                byteString4 = (ByteString) androidGetAdDataRefreshRequest$invoke$1.L$1;
                byteString3 = (ByteString) androidGetAdDataRefreshRequest$invoke$1.L$0;
                y6a.M(obj);
                dsl.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
                dsl2.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
                dsl2.setImpressionOpportunityId(byteString3);
                dsl2.setCampaignState(this.campaignRepository.getCampaignState());
                if (!byteString4.isEmpty()) {
                    dsl2.setAdDataRefreshToken(byteString4);
                }
                AdDataRefreshRequestOuterClass.AdDataRefreshRequest _build = dsl3._build();
                UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
                UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder2 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                newBuilder2.getClass();
                UniversalRequestKt.PayloadKt.Dsl _create2 = companion2._create(newBuilder2);
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
                return invoke != lu3Var ? lu3Var : invoke;
            }
        }
        androidGetAdDataRefreshRequest$invoke$1 = new AndroidGetAdDataRefreshRequest$invoke$1(this, rq3Var);
        Object obj2 = androidGetAdDataRefreshRequest$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
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
        UniversalRequestKt.PayloadKt.Dsl.Companion companion22 = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder22 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        newBuilder22.getClass();
        UniversalRequestKt.PayloadKt.Dsl _create22 = companion22._create(newBuilder22);
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
        if (invoke2 != lu3Var2) {
        }
    }
}
