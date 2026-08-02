package com.unity3d.services;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.om.OmFinishSession;
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
@b6l(c = "com.unity3d.services.UnityAdsSDK$finishOMIDSession$1", f = "UnityAdsSDK.kt", l = {238}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UnityAdsSDK$finishOMIDSession$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Lazy<GetAdObject> $getAdObject$delegate;
    final /* synthetic */ Lazy<OmFinishSession> $omFinishSession$delegate;
    final /* synthetic */ yvj $omidScope;
    final /* synthetic */ String $opportunityId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnityAdsSDK$finishOMIDSession$1(String str, yvj yvjVar, Lazy<? extends GetAdObject> lazy, Lazy<? extends OmFinishSession> lazy2, spj<? super UnityAdsSDK$finishOMIDSession$1> spjVar) {
        super(2, spjVar);
        this.$opportunityId = str;
        this.$omidScope = yvjVar;
        this.$getAdObject$delegate = lazy;
        this.$omFinishSession$delegate = lazy2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new UnityAdsSDK$finishOMIDSession$1(this.$opportunityId, this.$omidScope, this.$getAdObject$delegate, this.$omFinishSession$delegate, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GetAdObject finishOMIDSession$lambda$20;
        OmFinishSession finishOMIDSession$lambda$21;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            a.a(obj);
            finishOMIDSession$lambda$20 = UnityAdsSDK.finishOMIDSession$lambda$20(this.$getAdObject$delegate);
            AdObject invoke = finishOMIDSession$lambda$20.invoke(this.$opportunityId);
            if (invoke != null) {
                finishOMIDSession$lambda$21 = UnityAdsSDK.finishOMIDSession$lambda$21(this.$omFinishSession$delegate);
                this.label = 1;
                if (finishOMIDSession$lambda$21.invoke(invoke, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(obj);
        }
        zvj.c(this.$omidScope, null);
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((UnityAdsSDK$finishOMIDSession$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
