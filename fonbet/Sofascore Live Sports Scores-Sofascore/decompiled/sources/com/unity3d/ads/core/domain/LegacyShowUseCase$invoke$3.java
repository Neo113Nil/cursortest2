package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.b98;
import defpackage.ct8;
import defpackage.gt8;
import defpackage.hoi;
import defpackage.il4;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb98;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "", "it", "", "<anonymous>", "(Lb98;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3", f = "LegacyShowUseCase.kt", l = {191}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class LegacyShowUseCase$invoke$3 extends hoi implements ct8 {
    final /* synthetic */ boolean $isBanner;
    final /* synthetic */ gt8 $reportShowError;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyShowUseCase$invoke$3(gt8 gt8Var, boolean z, rq3<? super LegacyShowUseCase$invoke$3> rq3Var) {
        super(3, rq3Var);
        this.$reportShowError = gt8Var;
        this.$isBanner = z;
    }

    @Override // defpackage.ct8
    public final Object invoke(b98 b98Var, Throwable th, rq3<? super Unit> rq3Var) {
        LegacyShowUseCase$invoke$3 legacyShowUseCase$invoke$3 = new LegacyShowUseCase$invoke$3(this.$reportShowError, this.$isBanner, rq3Var);
        legacyShowUseCase$invoke$3.L$0 = th;
        return legacyShowUseCase$invoke$3.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        LegacyShowUseCase$invoke$3 legacyShowUseCase$invoke$3;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            Throwable th = (Throwable) this.L$0;
            gt8 gt8Var = this.$reportShowError;
            UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
            String shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null);
            this.label = 1;
            legacyShowUseCase$invoke$3 = this;
            if (gt8Var.invoke("uncaught_exception", unityAdsShowError, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, shortenedStackTrace$default, legacyShowUseCase$invoke$3) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            legacyShowUseCase$invoke$3 = this;
        }
        if (!legacyShowUseCase$invoke$3.$isBanner) {
            LegacyShowUseCase.isFullscreenAdShowing = false;
        }
        return Unit.a;
    }
}
