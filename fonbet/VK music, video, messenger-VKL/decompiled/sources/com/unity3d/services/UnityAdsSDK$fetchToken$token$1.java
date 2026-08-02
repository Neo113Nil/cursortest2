package com.unity3d.services;

import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
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

/* compiled from: UnityAdsSDK.kt */
@b6l(c = "com.unity3d.services.UnityAdsSDK$fetchToken$token$1", f = "UnityAdsSDK.kt", l = {200}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UnityAdsSDK$fetchToken$token$1 extends SuspendLambda implements wzs<yvj, spj<? super String>, Object> {
    final /* synthetic */ Lazy<GetHeaderBiddingToken> $getHeaderBiddingToken$delegate;
    final /* synthetic */ Lazy<TokenNumberProvider> $tokenNumberProvider$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnityAdsSDK$fetchToken$token$1(Lazy<? extends GetHeaderBiddingToken> lazy, Lazy<? extends TokenNumberProvider> lazy2, spj<? super UnityAdsSDK$fetchToken$token$1> spjVar) {
        super(2, spjVar);
        this.$getHeaderBiddingToken$delegate = lazy;
        this.$tokenNumberProvider$delegate = lazy2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new UnityAdsSDK$fetchToken$token$1(this.$getHeaderBiddingToken$delegate, this.$tokenNumberProvider$delegate, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GetHeaderBiddingToken fetchToken$lambda$13;
        TokenNumberProvider fetchToken$lambda$12;
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
        fetchToken$lambda$13 = UnityAdsSDK.fetchToken$lambda$13(this.$getHeaderBiddingToken$delegate);
        fetchToken$lambda$12 = UnityAdsSDK.fetchToken$lambda$12(this.$tokenNumberProvider$delegate);
        int invoke = fetchToken$lambda$12.invoke();
        this.label = 1;
        Object invoke$default = GetHeaderBiddingToken.DefaultImpls.invoke$default(fetchToken$lambda$13, invoke, null, this, 2, null);
        return invoke$default == coroutineSingletons ? coroutineSingletons : invoke$default;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super String> spjVar) {
        return ((UnityAdsSDK$fetchToken$token$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
