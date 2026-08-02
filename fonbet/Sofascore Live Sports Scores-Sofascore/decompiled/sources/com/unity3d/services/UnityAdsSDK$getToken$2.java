package com.unity3d.services;

import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.TokenNumberProvider;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.joa;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.services.UnityAdsSDK$getToken$2", f = "UnityAdsSDK.kt", l = {175}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class UnityAdsSDK$getToken$2 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    final /* synthetic */ joa $getAsyncHeaderBiddingToken$delegate;
    final /* synthetic */ ku3 $getTokenScope;
    final /* synthetic */ IUnityAdsTokenListener $listener;
    final /* synthetic */ TokenConfiguration $tokenConfiguration;
    final /* synthetic */ joa $tokenNumberProvider$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$getToken$2(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener, ku3 ku3Var, joa joaVar, joa joaVar2, rq3<? super UnityAdsSDK$getToken$2> rq3Var) {
        super(2, rq3Var);
        this.$tokenConfiguration = tokenConfiguration;
        this.$listener = iUnityAdsTokenListener;
        this.$getTokenScope = ku3Var;
        this.$getAsyncHeaderBiddingToken$delegate = joaVar;
        this.$tokenNumberProvider$delegate = joaVar2;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new UnityAdsSDK$getToken$2(this.$tokenConfiguration, this.$listener, this.$getTokenScope, this.$getAsyncHeaderBiddingToken$delegate, this.$tokenNumberProvider$delegate, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((UnityAdsSDK$getToken$2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        GetAsyncHeaderBiddingToken token$lambda$11;
        TokenNumberProvider token$lambda$10;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            token$lambda$11 = UnityAdsSDK.getToken$lambda$11(this.$getAsyncHeaderBiddingToken$delegate);
            token$lambda$10 = UnityAdsSDK.getToken$lambda$10(this.$tokenNumberProvider$delegate);
            int invoke = token$lambda$10.invoke();
            TokenConfiguration tokenConfiguration = this.$tokenConfiguration;
            IUnityAdsTokenListener iUnityAdsTokenListener = this.$listener;
            this.label = 1;
            if (token$lambda$11.invoke(invoke, tokenConfiguration, iUnityAdsTokenListener, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        s9a.o(this.$getTokenScope, null);
        return Unit.a;
    }
}
