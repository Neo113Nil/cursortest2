package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.AdRefreshState;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.kea;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import defpackage.zu4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/data/model/AdObjectState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@il4(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$1$1", f = "AndroidAdRefresh.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidAdRefresh$invoke$3$1$1$1 extends hoi implements Function2<AdObjectState, rq3<? super Unit>, Object> {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ zu4 $refreshTask;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAdRefresh$invoke$3$1$1$1(zu4 zu4Var, AdObject adObject, rq3<? super AndroidAdRefresh$invoke$3$1$1$1> rq3Var) {
        super(2, rq3Var);
        this.$refreshTask = zu4Var;
        this.$adObject = adObject;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new AndroidAdRefresh$invoke$3$1$1$1(this.$refreshTask, this.$adObject, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AdObjectState adObjectState, rq3<? super Unit> rq3Var) {
        return ((AndroidAdRefresh$invoke$3$1$1$1) create(adObjectState, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        ((kea) this.$refreshTask).e(null);
        AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData = this.$adObject.getWebViewLessLoadingRequiredData();
        if (webViewLessLoadingRequiredData != null) {
            webViewLessLoadingRequiredData.setAdRefreshState(AdRefreshState.REUSE_DURING_RELOAD);
        }
        return Unit.a;
    }
}
