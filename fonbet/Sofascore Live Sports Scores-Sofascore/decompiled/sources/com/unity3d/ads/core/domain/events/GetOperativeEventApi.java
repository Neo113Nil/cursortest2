package com.unity3d.ads.core.domain.events;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.a70;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JH\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0086B¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\nH\u0086B¢\u0006\u0004\b\u0013\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "", "Lcom/unity3d/ads/core/data/repository/OperativeEventRepository;", "operativeEventRepository", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventRequest;", "operativeEventRequest", "<init>", "(Lcom/unity3d/ads/core/data/repository/OperativeEventRepository;Lcom/unity3d/ads/core/domain/events/GetOperativeEventRequest;)V", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventType;", "operativeEventType", "Lcom/google/protobuf/ByteString;", "opportunityId", HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, "additionalEventData", "", "playerServerId", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "adFormat", "", "invoke", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventType;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Ljava/lang/String;Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventType;Lcom/unity3d/ads/core/data/model/AdObject;Lcom/google/protobuf/ByteString;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/OperativeEventRepository;", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventRequest;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetOperativeEventApi {

    @NotNull
    private final OperativeEventRepository operativeEventRepository;

    @NotNull
    private final GetOperativeEventRequest operativeEventRequest;

    public GetOperativeEventApi(@NotNull OperativeEventRepository operativeEventRepository, @NotNull GetOperativeEventRequest getOperativeEventRequest) {
        operativeEventRepository.getClass();
        getOperativeEventRequest.getClass();
        this.operativeEventRepository = operativeEventRepository;
        this.operativeEventRequest = getOperativeEventRequest;
    }

    public static /* synthetic */ Object invoke$default(GetOperativeEventApi getOperativeEventApi, OperativeEventRequestOuterClass.OperativeEventType operativeEventType, ByteString byteString, ByteString byteString2, ByteString byteString3, String str, AdFormatOuterClass.AdFormat adFormat, rq3 rq3Var, int i, Object obj) {
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            adFormat = null;
        }
        return getOperativeEventApi.invoke(operativeEventType, byteString, byteString2, byteString3, str, adFormat, rq3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(@NotNull OperativeEventRequestOuterClass.OperativeEventType operativeEventType, @NotNull ByteString byteString, @NotNull ByteString byteString2, @NotNull ByteString byteString3, @Nullable String str, @Nullable AdFormatOuterClass.AdFormat adFormat, @NotNull rq3<? super Unit> rq3Var) {
        GetOperativeEventApi$invoke$1 getOperativeEventApi$invoke$1;
        int i;
        if (rq3Var instanceof GetOperativeEventApi$invoke$1) {
            getOperativeEventApi$invoke$1 = (GetOperativeEventApi$invoke$1) rq3Var;
            int i2 = getOperativeEventApi$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getOperativeEventApi$invoke$1.label = i2 - Integer.MIN_VALUE;
                GetOperativeEventApi$invoke$1 getOperativeEventApi$invoke$12 = getOperativeEventApi$invoke$1;
                Object obj = getOperativeEventApi$invoke$12.result;
                lu3 lu3Var = lu3.a;
                i = getOperativeEventApi$invoke$12.label;
                if (i != 0) {
                    y6a.M(obj);
                    GetOperativeEventRequest getOperativeEventRequest = this.operativeEventRequest;
                    getOperativeEventApi$invoke$12.label = 1;
                    obj = getOperativeEventRequest.invoke(operativeEventType, byteString2, byteString, byteString3, str, adFormat, getOperativeEventApi$invoke$12);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                this.operativeEventRepository.addOperativeEvent((OperativeEventRequestOuterClass.OperativeEventRequest) obj);
                return Unit.a;
            }
        }
        getOperativeEventApi$invoke$1 = new GetOperativeEventApi$invoke$1(this, rq3Var);
        GetOperativeEventApi$invoke$1 getOperativeEventApi$invoke$122 = getOperativeEventApi$invoke$1;
        Object obj2 = getOperativeEventApi$invoke$122.result;
        lu3 lu3Var2 = lu3.a;
        i = getOperativeEventApi$invoke$122.label;
        if (i != 0) {
        }
        this.operativeEventRepository.addOperativeEvent((OperativeEventRequestOuterClass.OperativeEventRequest) obj2);
        return Unit.a;
    }

    @Nullable
    public final Object invoke(@NotNull OperativeEventRequestOuterClass.OperativeEventType operativeEventType, @NotNull AdObject adObject, @NotNull ByteString byteString, @NotNull rq3<? super Unit> rq3Var) {
        Object invoke = invoke(operativeEventType, adObject.getOpportunityId(), adObject.getTrackingToken(), byteString, adObject.getPlayerServerId(), (adObject.getAdType() == DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER ? this : null) != null ? AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER : null, rq3Var);
        return invoke == lu3.a ? invoke : Unit.a;
    }
}
