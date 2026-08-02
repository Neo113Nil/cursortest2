package com.unity3d.ads.core.domain.events;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetByteStringId;
import defpackage.a70;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.OperativeEventRequestKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJD\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0086B¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/unity3d/ads/core/domain/events/GetOperativeEventRequest;", "", "Lcom/unity3d/ads/core/domain/GetByteStringId;", "generateByteStringId", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "campaignRepository", "<init>", "(Lcom/unity3d/ads/core/domain/GetByteStringId;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/CampaignRepository;)V", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventType;", "operativeEventType", "Lcom/google/protobuf/ByteString;", "loadTrackingToken", "opportunityId", "additionalEventData", "", "playerServerId", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "adFormat", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "invoke", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventType;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Ljava/lang/String;Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetByteStringId;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetOperativeEventRequest {

    @NotNull
    private final CampaignRepository campaignRepository;

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final GetByteStringId generateByteStringId;

    @NotNull
    private final SessionRepository sessionRepository;

    public GetOperativeEventRequest(@NotNull GetByteStringId getByteStringId, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull SessionRepository sessionRepository, @NotNull CampaignRepository campaignRepository) {
        getByteStringId.getClass();
        deviceInfoRepository.getClass();
        sessionRepository.getClass();
        campaignRepository.getClass();
        this.generateByteStringId = getByteStringId;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.campaignRepository = campaignRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(@NotNull OperativeEventRequestOuterClass.OperativeEventType operativeEventType, @NotNull ByteString byteString, @NotNull ByteString byteString2, @NotNull ByteString byteString3, @Nullable String str, @Nullable AdFormatOuterClass.AdFormat adFormat, @NotNull rq3<? super OperativeEventRequestOuterClass.OperativeEventRequest> rq3Var) {
        GetOperativeEventRequest$invoke$1 getOperativeEventRequest$invoke$1;
        int i;
        OperativeEventRequestKt.Dsl dsl;
        OperativeEventRequestKt.Dsl dsl2;
        OperativeEventRequestKt.Dsl dsl3;
        if (rq3Var instanceof GetOperativeEventRequest$invoke$1) {
            getOperativeEventRequest$invoke$1 = (GetOperativeEventRequest$invoke$1) rq3Var;
            int i2 = getOperativeEventRequest$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getOperativeEventRequest$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getOperativeEventRequest$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i = getOperativeEventRequest$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    OperativeEventRequestKt.Dsl.Companion companion = OperativeEventRequestKt.Dsl.INSTANCE;
                    OperativeEventRequestOuterClass.OperativeEventRequest.Builder newBuilder = OperativeEventRequestOuterClass.OperativeEventRequest.newBuilder();
                    newBuilder.getClass();
                    OperativeEventRequestKt.Dsl _create = companion._create(newBuilder);
                    _create.setEventId(this.generateByteStringId.invoke());
                    _create.setEventType(operativeEventType);
                    _create.setImpressionOpportunityId(byteString2);
                    _create.setTrackingToken(byteString);
                    _create.setAdditionalData(byteString3);
                    if (str != null) {
                        _create.setSid(str);
                    }
                    _create.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
                    DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                    getOperativeEventRequest$invoke$1.L$0 = adFormat;
                    getOperativeEventRequest$invoke$1.L$1 = _create;
                    getOperativeEventRequest$invoke$1.L$2 = _create;
                    getOperativeEventRequest$invoke$1.L$3 = _create;
                    getOperativeEventRequest$invoke$1.label = 1;
                    Object staticDeviceInfo = deviceInfoRepository.staticDeviceInfo(getOperativeEventRequest$invoke$1);
                    if (staticDeviceInfo == lu3Var) {
                        return lu3Var;
                    }
                    dsl = _create;
                    dsl2 = dsl;
                    obj = staticDeviceInfo;
                    dsl3 = dsl2;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dsl3 = (OperativeEventRequestKt.Dsl) getOperativeEventRequest$invoke$1.L$3;
                    dsl = (OperativeEventRequestKt.Dsl) getOperativeEventRequest$invoke$1.L$2;
                    dsl2 = (OperativeEventRequestKt.Dsl) getOperativeEventRequest$invoke$1.L$1;
                    adFormat = (AdFormatOuterClass.AdFormat) getOperativeEventRequest$invoke$1.L$0;
                    y6a.M(obj);
                }
                dsl3.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
                dsl.setSessionCounters(this.sessionRepository.getSessionCounters());
                dsl.setCampaignState(this.campaignRepository.getCampaignState());
                if (adFormat != null) {
                    dsl.setAdFormat(adFormat);
                }
                return dsl2._build();
            }
        }
        getOperativeEventRequest$invoke$1 = new GetOperativeEventRequest$invoke$1(this, rq3Var);
        Object obj2 = getOperativeEventRequest$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        i = getOperativeEventRequest$invoke$1.label;
        if (i != 0) {
        }
        dsl3.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj2);
        dsl.setSessionCounters(this.sessionRepository.getSessionCounters());
        dsl.setCampaignState(this.campaignRepository.getCampaignState());
        if (adFormat != null) {
        }
        return dsl2._build();
    }
}
