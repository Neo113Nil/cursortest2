package com.unity3d.services;

import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.TokenNumberProvider;
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
@b6l(c = "com.unity3d.services.UnityAdsSDK$getToken$2", f = "UnityAdsSDK.kt", l = {175}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UnityAdsSDK$getToken$2 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Lazy<GetAsyncHeaderBiddingToken> $getAsyncHeaderBiddingToken$delegate;
    final /* synthetic */ yvj $getTokenScope;
    final /* synthetic */ IUnityAdsTokenListener $listener;
    final /* synthetic */ TokenConfiguration $tokenConfiguration;
    final /* synthetic */ Lazy<TokenNumberProvider> $tokenNumberProvider$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnityAdsSDK$getToken$2(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener, yvj yvjVar, Lazy<? extends GetAsyncHeaderBiddingToken> lazy, Lazy<? extends TokenNumberProvider> lazy2, spj<? super UnityAdsSDK$getToken$2> spjVar) {
        super(2, spjVar);
        this.$tokenConfiguration = tokenConfiguration;
        this.$listener = iUnityAdsTokenListener;
        this.$getTokenScope = yvjVar;
        this.$getAsyncHeaderBiddingToken$delegate = lazy;
        this.$tokenNumberProvider$delegate = lazy2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new UnityAdsSDK$getToken$2(this.$tokenConfiguration, this.$listener, this.$getTokenScope, this.$getAsyncHeaderBiddingToken$delegate, this.$tokenNumberProvider$delegate, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GetAsyncHeaderBiddingToken token$lambda$11;
        TokenNumberProvider token$lambda$10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            a.a(obj);
            token$lambda$11 = UnityAdsSDK.getToken$lambda$11(this.$getAsyncHeaderBiddingToken$delegate);
            token$lambda$10 = UnityAdsSDK.getToken$lambda$10(this.$tokenNumberProvider$delegate);
            int invoke = token$lambda$10.invoke();
            TokenConfiguration tokenConfiguration = this.$tokenConfiguration;
            IUnityAdsTokenListener iUnityAdsTokenListener = this.$listener;
            this.label = 1;
            if (token$lambda$11.invoke(invoke, tokenConfiguration, iUnityAdsTokenListener, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(obj);
        }
        zvj.c(this.$getTokenScope, null);
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((UnityAdsSDK$getToken$2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
