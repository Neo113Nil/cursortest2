package com.unity3d.ads.core.domain;

import defpackage.a70;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetInitializationRequest;", "Lcom/unity3d/ads/core/domain/GetInitializationRequest;", "Lcom/unity3d/ads/core/domain/GetInitializationRequestPayload;", "getInitializationRequestPayload", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "getUniversalRequestForPayLoad", "<init>", "(Lcom/unity3d/ads/core/domain/GetInitializationRequestPayload;Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;)V", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "invoke", "(Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetInitializationRequestPayload;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidGetInitializationRequest implements GetInitializationRequest {

    @NotNull
    private final GetInitializationRequestPayload getInitializationRequestPayload;

    @NotNull
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    public AndroidGetInitializationRequest(@NotNull GetInitializationRequestPayload getInitializationRequestPayload, @NotNull GetUniversalRequestForPayLoad getUniversalRequestForPayLoad) {
        getInitializationRequestPayload.getClass();
        getUniversalRequestForPayLoad.getClass();
        this.getInitializationRequestPayload = getInitializationRequestPayload;
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r6 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.unity3d.ads.core.domain.GetInitializationRequest
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull rq3<? super UniversalRequestOuterClass.UniversalRequest> rq3Var) {
        AndroidGetInitializationRequest$invoke$1 androidGetInitializationRequest$invoke$1;
        int i;
        if (rq3Var instanceof AndroidGetInitializationRequest$invoke$1) {
            androidGetInitializationRequest$invoke$1 = (AndroidGetInitializationRequest$invoke$1) rq3Var;
            int i2 = androidGetInitializationRequest$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidGetInitializationRequest$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidGetInitializationRequest$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i = androidGetInitializationRequest$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    GetInitializationRequestPayload getInitializationRequestPayload = this.getInitializationRequestPayload;
                    androidGetInitializationRequest$invoke$1.label = 1;
                    obj = getInitializationRequestPayload.invoke(androidGetInitializationRequest$invoke$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
                UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                newBuilder.getClass();
                UniversalRequestKt.PayloadKt.Dsl _create = companion._create(newBuilder);
                _create.setInitializationRequest((InitializationRequestOuterClass.InitializationRequest) obj);
                UniversalRequestOuterClass.UniversalRequest.Payload _build = _create._build();
                GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = this.getUniversalRequestForPayLoad;
                androidGetInitializationRequest$invoke$1.label = 2;
                Object invoke = getUniversalRequestForPayLoad.invoke(_build, androidGetInitializationRequest$invoke$1);
                return invoke != lu3Var ? lu3Var : invoke;
            }
        }
        androidGetInitializationRequest$invoke$1 = new AndroidGetInitializationRequest$invoke$1(this, rq3Var);
        Object obj2 = androidGetInitializationRequest$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidGetInitializationRequest$invoke$1.label;
        if (i != 0) {
        }
        UniversalRequestKt universalRequestKt2 = UniversalRequestKt.INSTANCE;
        UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder2 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        newBuilder2.getClass();
        UniversalRequestKt.PayloadKt.Dsl _create2 = companion2._create(newBuilder2);
        _create2.setInitializationRequest((InitializationRequestOuterClass.InitializationRequest) obj2);
        UniversalRequestOuterClass.UniversalRequest.Payload _build2 = _create2._build();
        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2 = this.getUniversalRequestForPayLoad;
        androidGetInitializationRequest$invoke$1.label = 2;
        Object invoke2 = getUniversalRequestForPayLoad2.invoke(_build2, androidGetInitializationRequest$invoke$1);
        if (invoke2 != lu3Var2) {
        }
    }
}
