package com.unity3d.services;

import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: UnityAdsSDK.kt */
@b6l(c = "com.unity3d.services.UnityAdsSDK$getToken$1", f = "UnityAdsSDK.kt", l = {159}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UnityAdsSDK$getToken$1 extends SuspendLambda implements wzs<yvj, spj<? super String>, Object> {
    int label;
    final /* synthetic */ UnityAdsSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$getToken$1(UnityAdsSDK unityAdsSDK, spj<? super UnityAdsSDK$getToken$1> spjVar) {
        super(2, spjVar);
        this.this$0 = unityAdsSDK;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new UnityAdsSDK$getToken$1(this.this$0, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object fetchToken;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(obj);
            return obj;
        }
        a.a(obj);
        UnityAdsSDK unityAdsSDK = this.this$0;
        this.label = 1;
        fetchToken = unityAdsSDK.fetchToken("true", this);
        return fetchToken == coroutineSingletons ? coroutineSingletons : fetchToken;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super String> spjVar) {
        return ((UnityAdsSDK$getToken$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
