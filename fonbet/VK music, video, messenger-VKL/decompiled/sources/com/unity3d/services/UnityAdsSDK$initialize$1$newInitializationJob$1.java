package com.unity3d.services;

import com.unity3d.ads.core.domain.InitializeBoldSDK;
import kotlin.Lazy;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;
import xsna.zvj;

/* compiled from: UnityAdsSDK.kt */
@b6l(c = "com.unity3d.services.UnityAdsSDK$initialize$1$newInitializationJob$1", f = "UnityAdsSDK.kt", l = {116}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UnityAdsSDK$initialize$1$newInitializationJob$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ yvj $initScope;
    final /* synthetic */ Lazy<InitializeBoldSDK> $initializeBoldSDK$delegate;
    final /* synthetic */ String $source;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnityAdsSDK$initialize$1$newInitializationJob$1(String str, yvj yvjVar, Lazy<? extends InitializeBoldSDK> lazy, spj<? super UnityAdsSDK$initialize$1$newInitializationJob$1> spjVar) {
        super(2, spjVar);
        this.$source = str;
        this.$initScope = yvjVar;
        this.$initializeBoldSDK$delegate = lazy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new UnityAdsSDK$initialize$1$newInitializationJob$1(this.$source, this.$initScope, this.$initializeBoldSDK$delegate, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InitializeBoldSDK initialize$lambda$6$lambda$5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            a.a(obj);
            initialize$lambda$6$lambda$5 = UnityAdsSDK.initialize$lambda$6$lambda$5(this.$initializeBoldSDK$delegate);
            String str = this.$source;
            this.label = 1;
            if (initialize$lambda$6$lambda$5.invoke(str, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(obj);
        }
        zvj.c(this.$initScope, null);
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((UnityAdsSDK$initialize$1$newInitializationJob$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
