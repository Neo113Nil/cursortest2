package com.unity3d.ads.core.domain;

import defpackage.a70;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetUniversalRequestForPayLoad;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestSharedData;", "getUniversalRequestSharedData", "<init>", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestSharedData;)V", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "payload", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "invoke", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestSharedData;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidGetUniversalRequestForPayLoad implements GetUniversalRequestForPayLoad {

    @NotNull
    private final GetUniversalRequestSharedData getUniversalRequestSharedData;

    public AndroidGetUniversalRequestForPayLoad(@NotNull GetUniversalRequestSharedData getUniversalRequestSharedData) {
        getUniversalRequestSharedData.getClass();
        this.getUniversalRequestSharedData = getUniversalRequestSharedData;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull UniversalRequestOuterClass.UniversalRequest.Payload payload, @NotNull rq3<? super UniversalRequestOuterClass.UniversalRequest> rq3Var) {
        AndroidGetUniversalRequestForPayLoad$invoke$1 androidGetUniversalRequestForPayLoad$invoke$1;
        int i;
        UniversalRequestOuterClass.UniversalRequest.Payload payload2;
        UniversalRequestKt.Dsl dsl;
        UniversalRequestKt.Dsl dsl2;
        UniversalRequestKt.Dsl dsl3;
        if (rq3Var instanceof AndroidGetUniversalRequestForPayLoad$invoke$1) {
            androidGetUniversalRequestForPayLoad$invoke$1 = (AndroidGetUniversalRequestForPayLoad$invoke$1) rq3Var;
            int i2 = androidGetUniversalRequestForPayLoad$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidGetUniversalRequestForPayLoad$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidGetUniversalRequestForPayLoad$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i = androidGetUniversalRequestForPayLoad$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    UniversalRequestKt.Dsl.Companion companion = UniversalRequestKt.Dsl.INSTANCE;
                    UniversalRequestOuterClass.UniversalRequest.Builder newBuilder = UniversalRequestOuterClass.UniversalRequest.newBuilder();
                    newBuilder.getClass();
                    UniversalRequestKt.Dsl _create = companion._create(newBuilder);
                    GetUniversalRequestSharedData getUniversalRequestSharedData = this.getUniversalRequestSharedData;
                    androidGetUniversalRequestForPayLoad$invoke$1.L$0 = payload;
                    androidGetUniversalRequestForPayLoad$invoke$1.L$1 = _create;
                    androidGetUniversalRequestForPayLoad$invoke$1.L$2 = _create;
                    androidGetUniversalRequestForPayLoad$invoke$1.L$3 = _create;
                    androidGetUniversalRequestForPayLoad$invoke$1.label = 1;
                    Object invoke = getUniversalRequestSharedData.invoke(androidGetUniversalRequestForPayLoad$invoke$1);
                    if (invoke == lu3Var) {
                        return lu3Var;
                    }
                    payload2 = payload;
                    dsl = _create;
                    dsl2 = dsl;
                    obj = invoke;
                    dsl3 = dsl2;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dsl3 = (UniversalRequestKt.Dsl) androidGetUniversalRequestForPayLoad$invoke$1.L$3;
                    dsl = (UniversalRequestKt.Dsl) androidGetUniversalRequestForPayLoad$invoke$1.L$2;
                    dsl2 = (UniversalRequestKt.Dsl) androidGetUniversalRequestForPayLoad$invoke$1.L$1;
                    payload2 = (UniversalRequestOuterClass.UniversalRequest.Payload) androidGetUniversalRequestForPayLoad$invoke$1.L$0;
                    y6a.M(obj);
                }
                dsl3.setSharedData((UniversalRequestOuterClass.UniversalRequest.SharedData) obj);
                dsl.setPayload(payload2);
                return dsl2._build();
            }
        }
        androidGetUniversalRequestForPayLoad$invoke$1 = new AndroidGetUniversalRequestForPayLoad$invoke$1(this, rq3Var);
        Object obj2 = androidGetUniversalRequestForPayLoad$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidGetUniversalRequestForPayLoad$invoke$1.label;
        if (i != 0) {
        }
        dsl3.setSharedData((UniversalRequestOuterClass.UniversalRequest.SharedData) obj2);
        dsl.setPayload(payload2);
        return dsl2._build();
    }
}
