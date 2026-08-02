package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b0t;
import xsna.b6l;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;
import xsna.yzs;

/* compiled from: LegacyShowUseCase.kt */
@b6l(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3", f = "LegacyShowUseCase.kt", l = {191}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class LegacyShowUseCase$invoke$3 extends SuspendLambda implements yzs<lsr<? super ShowEvent>, Throwable, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $isBanner;
    final /* synthetic */ b0t<String, UnityAds.UnityAdsShowError, String, Integer, String, spj<? super s3q0>, Object> $reportShowError;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LegacyShowUseCase$invoke$3(b0t<? super String, ? super UnityAds.UnityAdsShowError, ? super String, ? super Integer, ? super String, ? super spj<? super s3q0>, ? extends Object> b0tVar, boolean z, spj<? super LegacyShowUseCase$invoke$3> spjVar) {
        super(3, spjVar);
        this.$reportShowError = b0tVar;
        this.$isBanner = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LegacyShowUseCase$invoke$3 legacyShowUseCase$invoke$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            Throwable th = (Throwable) this.L$0;
            b0t<String, UnityAds.UnityAdsShowError, String, Integer, String, spj<? super s3q0>, Object> b0tVar = this.$reportShowError;
            UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
            String shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null);
            this.label = 1;
            legacyShowUseCase$invoke$3 = this;
            if (b0tVar.invoke("uncaught_exception", unityAdsShowError, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, shortenedStackTrace$default, legacyShowUseCase$invoke$3) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            legacyShowUseCase$invoke$3 = this;
        }
        if (!legacyShowUseCase$invoke$3.$isBanner) {
            LegacyShowUseCase.isFullscreenAdShowing = false;
        }
        return s3q0.a;
    }

    @Override // xsna.yzs
    public final Object invoke(lsr<? super ShowEvent> lsrVar, Throwable th, spj<? super s3q0> spjVar) {
        LegacyShowUseCase$invoke$3 legacyShowUseCase$invoke$3 = new LegacyShowUseCase$invoke$3(this.$reportShowError, this.$isBanner, spjVar);
        legacyShowUseCase$invoke$3.L$0 = th;
        return legacyShowUseCase$invoke$3.invokeSuspend(s3q0.a);
    }
}
