package com.unity3d.ads.core.domain;

import gatewayprotocol.v1.InitializationDataKt;
import gatewayprotocol.v1.InitializationDataOuterClass;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.spj;

/* compiled from: AndroidGetInitializationData.kt */
/* loaded from: classes14.dex */
public final class AndroidGetInitializationData implements GetInitializationData {
    private final GetInitializationRequestPayload getInitializeRequestPayload;
    private final GetUniversalRequestSharedData getUniversalRequestSharedData;

    public AndroidGetInitializationData(GetInitializationRequestPayload getInitializationRequestPayload, GetUniversalRequestSharedData getUniversalRequestSharedData) {
        this.getInitializeRequestPayload = getInitializationRequestPayload;
        this.getUniversalRequestSharedData = getUniversalRequestSharedData;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.unity3d.ads.core.domain.GetInitializationData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(spj<? super InitializationDataOuterClass.InitializationData> spjVar) {
        AndroidGetInitializationData$invoke$1 androidGetInitializationData$invoke$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        InitializationDataKt.Dsl _create;
        InitializationDataKt.Dsl dsl;
        InitializationDataKt.Dsl dsl2;
        InitializationDataKt.Dsl dsl3;
        InitializationDataKt.Dsl dsl4;
        if (spjVar instanceof AndroidGetInitializationData$invoke$1) {
            androidGetInitializationData$invoke$1 = (AndroidGetInitializationData$invoke$1) spjVar;
            int i2 = androidGetInitializationData$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidGetInitializationData$invoke$1.label = i2 - Integer.MIN_VALUE;
                obj = androidGetInitializationData$invoke$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidGetInitializationData$invoke$1.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    _create = InitializationDataKt.Dsl.Companion._create(InitializationDataOuterClass.InitializationData.newBuilder());
                    GetInitializationRequestPayload getInitializationRequestPayload = this.getInitializeRequestPayload;
                    androidGetInitializationData$invoke$1.L$0 = _create;
                    androidGetInitializationData$invoke$1.L$1 = _create;
                    androidGetInitializationData$invoke$1.L$2 = _create;
                    androidGetInitializationData$invoke$1.label = 1;
                    obj = getInitializationRequestPayload.invoke(androidGetInitializationData$invoke$1);
                    if (obj != coroutineSingletons) {
                        dsl = _create;
                        dsl2 = dsl;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dsl4 = (InitializationDataKt.Dsl) androidGetInitializationData$invoke$1.L$1;
                    dsl3 = (InitializationDataKt.Dsl) androidGetInitializationData$invoke$1.L$0;
                    kotlin.a.a(obj);
                    dsl4.setSharedData((UniversalRequestOuterClass.UniversalRequest.SharedData) obj);
                    return dsl3._build();
                }
                InitializationDataKt.Dsl dsl5 = (InitializationDataKt.Dsl) androidGetInitializationData$invoke$1.L$2;
                dsl = (InitializationDataKt.Dsl) androidGetInitializationData$invoke$1.L$1;
                InitializationDataKt.Dsl dsl6 = (InitializationDataKt.Dsl) androidGetInitializationData$invoke$1.L$0;
                kotlin.a.a(obj);
                dsl2 = dsl5;
                _create = dsl6;
                dsl2.setInitializationRequest((InitializationRequestOuterClass.InitializationRequest) obj);
                GetUniversalRequestSharedData getUniversalRequestSharedData = this.getUniversalRequestSharedData;
                androidGetInitializationData$invoke$1.L$0 = _create;
                androidGetInitializationData$invoke$1.L$1 = dsl;
                androidGetInitializationData$invoke$1.L$2 = null;
                androidGetInitializationData$invoke$1.label = 2;
                obj = getUniversalRequestSharedData.invoke(androidGetInitializationData$invoke$1);
                if (obj != coroutineSingletons) {
                    dsl3 = _create;
                    dsl4 = dsl;
                    dsl4.setSharedData((UniversalRequestOuterClass.UniversalRequest.SharedData) obj);
                    return dsl3._build();
                }
                return coroutineSingletons;
            }
        }
        androidGetInitializationData$invoke$1 = new AndroidGetInitializationData$invoke$1(this, spjVar);
        obj = androidGetInitializationData$invoke$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidGetInitializationData$invoke$1.label;
        if (i != 0) {
        }
        dsl2.setInitializationRequest((InitializationRequestOuterClass.InitializationRequest) obj);
        GetUniversalRequestSharedData getUniversalRequestSharedData2 = this.getUniversalRequestSharedData;
        androidGetInitializationData$invoke$1.L$0 = _create;
        androidGetInitializationData$invoke$1.L$1 = dsl;
        androidGetInitializationData$invoke$1.L$2 = null;
        androidGetInitializationData$invoke$1.label = 2;
        obj = getUniversalRequestSharedData2.invoke(androidGetInitializationData$invoke$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
