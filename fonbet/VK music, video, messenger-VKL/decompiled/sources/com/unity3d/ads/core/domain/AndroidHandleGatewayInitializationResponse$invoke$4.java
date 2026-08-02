package com.unity3d.ads.core.domain;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: AndroidHandleGatewayInitializationResponse.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse$invoke$4", f = "AndroidHandleGatewayInitializationResponse.kt", l = {92}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidHandleGatewayInitializationResponse$invoke$4 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ AndroidHandleGatewayInitializationResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayInitializationResponse$invoke$4(AndroidHandleGatewayInitializationResponse androidHandleGatewayInitializationResponse, spj<? super AndroidHandleGatewayInitializationResponse$invoke$4> spjVar) {
        super(2, spjVar);
        this.this$0 = androidHandleGatewayInitializationResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidHandleGatewayInitializationResponse$invoke$4(this.this$0, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TriggerInitializationCompletedRequest triggerInitializationCompletedRequest;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            triggerInitializationCompletedRequest = this.this$0.triggerInitializationCompletedRequest;
            this.label = 1;
            if (triggerInitializationCompletedRequest.invoke(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((AndroidHandleGatewayInitializationResponse$invoke$4) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
