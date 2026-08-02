package com.unity3d.ads.core.domain.events;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetByteStringId;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.OperativeEventRequestKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.spj;

/* compiled from: GetOperativeEventRequest.kt */
/* loaded from: classes14.dex */
public final class GetOperativeEventRequest {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetByteStringId generateByteStringId;
    private final SessionRepository sessionRepository;

    public GetOperativeEventRequest(GetByteStringId getByteStringId, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, CampaignRepository campaignRepository) {
        this.generateByteStringId = getByteStringId;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.campaignRepository = campaignRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(OperativeEventRequestOuterClass.OperativeEventType operativeEventType, ByteString byteString, ByteString byteString2, ByteString byteString3, String str, AdFormatOuterClass.AdFormat adFormat, spj<? super OperativeEventRequestOuterClass.OperativeEventRequest> spjVar) {
        GetOperativeEventRequest$invoke$1 getOperativeEventRequest$invoke$1;
        int i;
        OperativeEventRequestKt.Dsl dsl;
        OperativeEventRequestKt.Dsl dsl2;
        OperativeEventRequestKt.Dsl dsl3;
        if (spjVar instanceof GetOperativeEventRequest$invoke$1) {
            getOperativeEventRequest$invoke$1 = (GetOperativeEventRequest$invoke$1) spjVar;
            int i2 = getOperativeEventRequest$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getOperativeEventRequest$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getOperativeEventRequest$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getOperativeEventRequest$invoke$1.label;
                if (i != 0) {
                    a.a(obj);
                    OperativeEventRequestKt.Dsl _create = OperativeEventRequestKt.Dsl.Companion._create(OperativeEventRequestOuterClass.OperativeEventRequest.newBuilder());
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
                    if (staticDeviceInfo == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    dsl = _create;
                    dsl2 = dsl;
                    obj = staticDeviceInfo;
                    dsl3 = dsl2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dsl3 = (OperativeEventRequestKt.Dsl) getOperativeEventRequest$invoke$1.L$3;
                    dsl = (OperativeEventRequestKt.Dsl) getOperativeEventRequest$invoke$1.L$2;
                    dsl2 = (OperativeEventRequestKt.Dsl) getOperativeEventRequest$invoke$1.L$1;
                    adFormat = (AdFormatOuterClass.AdFormat) getOperativeEventRequest$invoke$1.L$0;
                    a.a(obj);
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
        getOperativeEventRequest$invoke$1 = new GetOperativeEventRequest$invoke$1(this, spjVar);
        Object obj2 = getOperativeEventRequest$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
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
