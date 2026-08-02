package com.unity3d.ads.core.domain;

import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.spj;

/* compiled from: AndroidGetUniversalRequestForPayLoad.kt */
/* loaded from: classes14.dex */
public final class AndroidGetUniversalRequestForPayLoad implements GetUniversalRequestForPayLoad {
    private final GetUniversalRequestSharedData getUniversalRequestSharedData;

    public AndroidGetUniversalRequestForPayLoad(GetUniversalRequestSharedData getUniversalRequestSharedData) {
        this.getUniversalRequestSharedData = getUniversalRequestSharedData;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(UniversalRequestOuterClass.UniversalRequest.Payload payload, spj<? super UniversalRequestOuterClass.UniversalRequest> spjVar) {
        AndroidGetUniversalRequestForPayLoad$invoke$1 androidGetUniversalRequestForPayLoad$invoke$1;
        int i;
        UniversalRequestKt.Dsl dsl;
        UniversalRequestKt.Dsl dsl2;
        UniversalRequestOuterClass.UniversalRequest.Payload payload2;
        UniversalRequestKt.Dsl dsl3;
        if (spjVar instanceof AndroidGetUniversalRequestForPayLoad$invoke$1) {
            androidGetUniversalRequestForPayLoad$invoke$1 = (AndroidGetUniversalRequestForPayLoad$invoke$1) spjVar;
            int i2 = androidGetUniversalRequestForPayLoad$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidGetUniversalRequestForPayLoad$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidGetUniversalRequestForPayLoad$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidGetUniversalRequestForPayLoad$invoke$1.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    UniversalRequestKt.Dsl _create = UniversalRequestKt.Dsl.Companion._create(UniversalRequestOuterClass.UniversalRequest.newBuilder());
                    GetUniversalRequestSharedData getUniversalRequestSharedData = this.getUniversalRequestSharedData;
                    androidGetUniversalRequestForPayLoad$invoke$1.L$0 = payload;
                    androidGetUniversalRequestForPayLoad$invoke$1.L$1 = _create;
                    androidGetUniversalRequestForPayLoad$invoke$1.L$2 = _create;
                    androidGetUniversalRequestForPayLoad$invoke$1.L$3 = _create;
                    androidGetUniversalRequestForPayLoad$invoke$1.label = 1;
                    Object invoke = getUniversalRequestSharedData.invoke(androidGetUniversalRequestForPayLoad$invoke$1);
                    if (invoke == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    dsl = _create;
                    dsl2 = dsl;
                    obj = invoke;
                    payload2 = payload;
                    dsl3 = dsl2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dsl3 = (UniversalRequestKt.Dsl) androidGetUniversalRequestForPayLoad$invoke$1.L$3;
                    dsl = (UniversalRequestKt.Dsl) androidGetUniversalRequestForPayLoad$invoke$1.L$2;
                    dsl2 = (UniversalRequestKt.Dsl) androidGetUniversalRequestForPayLoad$invoke$1.L$1;
                    payload2 = (UniversalRequestOuterClass.UniversalRequest.Payload) androidGetUniversalRequestForPayLoad$invoke$1.L$0;
                    kotlin.a.a(obj);
                }
                dsl3.setSharedData((UniversalRequestOuterClass.UniversalRequest.SharedData) obj);
                dsl.setPayload(payload2);
                return dsl2._build();
            }
        }
        androidGetUniversalRequestForPayLoad$invoke$1 = new AndroidGetUniversalRequestForPayLoad$invoke$1(this, spjVar);
        Object obj2 = androidGetUniversalRequestForPayLoad$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidGetUniversalRequestForPayLoad$invoke$1.label;
        if (i != 0) {
        }
        dsl3.setSharedData((UniversalRequestOuterClass.UniversalRequest.SharedData) obj2);
        dsl.setPayload(payload2);
        return dsl2._build();
    }
}
