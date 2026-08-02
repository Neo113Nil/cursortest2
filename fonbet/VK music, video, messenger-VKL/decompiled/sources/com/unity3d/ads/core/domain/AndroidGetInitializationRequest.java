package com.unity3d.ads.core.domain;

import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.spj;

/* compiled from: AndroidGetInitializationRequest.kt */
/* loaded from: classes14.dex */
public final class AndroidGetInitializationRequest implements GetInitializationRequest {
    private final GetInitializationRequestPayload getInitializationRequestPayload;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    public AndroidGetInitializationRequest(GetInitializationRequestPayload getInitializationRequestPayload, GetUniversalRequestForPayLoad getUniversalRequestForPayLoad) {
        this.getInitializationRequestPayload = getInitializationRequestPayload;
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r6 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.unity3d.ads.core.domain.GetInitializationRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(spj<? super UniversalRequestOuterClass.UniversalRequest> spjVar) {
        AndroidGetInitializationRequest$invoke$1 androidGetInitializationRequest$invoke$1;
        int i;
        if (spjVar instanceof AndroidGetInitializationRequest$invoke$1) {
            androidGetInitializationRequest$invoke$1 = (AndroidGetInitializationRequest$invoke$1) spjVar;
            int i2 = androidGetInitializationRequest$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidGetInitializationRequest$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidGetInitializationRequest$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidGetInitializationRequest$invoke$1.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    GetInitializationRequestPayload getInitializationRequestPayload = this.getInitializationRequestPayload;
                    androidGetInitializationRequest$invoke$1.label = 1;
                    obj = getInitializationRequestPayload.invoke(androidGetInitializationRequest$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return obj;
                    }
                    kotlin.a.a(obj);
                }
                UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                UniversalRequestKt.PayloadKt.Dsl _create = UniversalRequestKt.PayloadKt.Dsl.Companion._create(UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder());
                _create.setInitializationRequest((InitializationRequestOuterClass.InitializationRequest) obj);
                UniversalRequestOuterClass.UniversalRequest.Payload _build = _create._build();
                GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = this.getUniversalRequestForPayLoad;
                androidGetInitializationRequest$invoke$1.label = 2;
                Object invoke = getUniversalRequestForPayLoad.invoke(_build, androidGetInitializationRequest$invoke$1);
                return invoke != coroutineSingletons ? coroutineSingletons : invoke;
            }
        }
        androidGetInitializationRequest$invoke$1 = new AndroidGetInitializationRequest$invoke$1(this, spjVar);
        Object obj2 = androidGetInitializationRequest$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidGetInitializationRequest$invoke$1.label;
        if (i != 0) {
        }
        UniversalRequestKt universalRequestKt2 = UniversalRequestKt.INSTANCE;
        UniversalRequestKt.PayloadKt.Dsl _create2 = UniversalRequestKt.PayloadKt.Dsl.Companion._create(UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder());
        _create2.setInitializationRequest((InitializationRequestOuterClass.InitializationRequest) obj2);
        UniversalRequestOuterClass.UniversalRequest.Payload _build2 = _create2._build();
        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2 = this.getUniversalRequestForPayLoad;
        androidGetInitializationRequest$invoke$1.label = 2;
        Object invoke2 = getUniversalRequestForPayLoad2.invoke(_build2, androidGetInitializationRequest$invoke$1);
        if (invoke2 != coroutineSingletons2) {
        }
    }
}
