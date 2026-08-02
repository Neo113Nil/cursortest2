package com.unity3d.ads.core.domain.events;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.s3q0;
import xsna.spj;

/* compiled from: GetOperativeEventApi.kt */
/* loaded from: classes14.dex */
public final class GetOperativeEventApi {
    private final OperativeEventRepository operativeEventRepository;
    private final GetOperativeEventRequest operativeEventRequest;

    public GetOperativeEventApi(OperativeEventRepository operativeEventRepository, GetOperativeEventRequest getOperativeEventRequest) {
        this.operativeEventRepository = operativeEventRepository;
        this.operativeEventRequest = getOperativeEventRequest;
    }

    public static /* synthetic */ Object invoke$default(GetOperativeEventApi getOperativeEventApi, OperativeEventRequestOuterClass.OperativeEventType operativeEventType, ByteString byteString, ByteString byteString2, ByteString byteString3, String str, AdFormatOuterClass.AdFormat adFormat, spj spjVar, int i, Object obj) {
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            adFormat = null;
        }
        return getOperativeEventApi.invoke(operativeEventType, byteString, byteString2, byteString3, str, adFormat, spjVar);
    }

    public final Object invoke(OperativeEventRequestOuterClass.OperativeEventType operativeEventType, AdObject adObject, ByteString byteString, spj<? super s3q0> spjVar) {
        Object invoke = invoke(operativeEventType, adObject.getOpportunityId(), adObject.getTrackingToken(), byteString, adObject.getPlayerServerId(), (adObject.getAdType() == DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER ? this : null) != null ? AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER : null, spjVar);
        return invoke == CoroutineSingletons.COROUTINE_SUSPENDED ? invoke : s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(OperativeEventRequestOuterClass.OperativeEventType operativeEventType, ByteString byteString, ByteString byteString2, ByteString byteString3, String str, AdFormatOuterClass.AdFormat adFormat, spj<? super s3q0> spjVar) {
        GetOperativeEventApi$invoke$1 getOperativeEventApi$invoke$1;
        int i;
        if (spjVar instanceof GetOperativeEventApi$invoke$1) {
            getOperativeEventApi$invoke$1 = (GetOperativeEventApi$invoke$1) spjVar;
            int i2 = getOperativeEventApi$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getOperativeEventApi$invoke$1.label = i2 - Integer.MIN_VALUE;
                GetOperativeEventApi$invoke$1 getOperativeEventApi$invoke$12 = getOperativeEventApi$invoke$1;
                Object obj = getOperativeEventApi$invoke$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getOperativeEventApi$invoke$12.label;
                if (i != 0) {
                    a.a(obj);
                    GetOperativeEventRequest getOperativeEventRequest = this.operativeEventRequest;
                    getOperativeEventApi$invoke$12.label = 1;
                    obj = getOperativeEventRequest.invoke(operativeEventType, byteString2, byteString, byteString3, str, adFormat, getOperativeEventApi$invoke$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.a(obj);
                }
                this.operativeEventRepository.addOperativeEvent((OperativeEventRequestOuterClass.OperativeEventRequest) obj);
                return s3q0.a;
            }
        }
        getOperativeEventApi$invoke$1 = new GetOperativeEventApi$invoke$1(this, spjVar);
        GetOperativeEventApi$invoke$1 getOperativeEventApi$invoke$122 = getOperativeEventApi$invoke$1;
        Object obj2 = getOperativeEventApi$invoke$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getOperativeEventApi$invoke$122.label;
        if (i != 0) {
        }
        this.operativeEventRepository.addOperativeEvent((OperativeEventRequestOuterClass.OperativeEventRequest) obj2);
        return s3q0.a;
    }
}
