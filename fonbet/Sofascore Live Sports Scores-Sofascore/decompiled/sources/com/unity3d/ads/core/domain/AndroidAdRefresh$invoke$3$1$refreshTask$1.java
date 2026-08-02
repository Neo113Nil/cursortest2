package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.AdRefreshState;
import defpackage.a70;
import defpackage.fdi;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.rq3;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku3;", "Lw2g;", "", "<anonymous>", "(Lku3;)Lw2g;"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$refreshTask$1", f = "AndroidAdRefresh.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidAdRefresh$invoke$3$1$refreshTask$1 extends hoi implements Function2<ku3, rq3<? super w2g>, Object> {
    final /* synthetic */ AdObject $adObject;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidAdRefresh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAdRefresh$invoke$3$1$refreshTask$1(AndroidAdRefresh androidAdRefresh, AdObject adObject, rq3<? super AndroidAdRefresh$invoke$3$1$refreshTask$1> rq3Var) {
        super(2, rq3Var);
        this.this$0 = androidAdRefresh;
        this.$adObject = adObject;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        AndroidAdRefresh$invoke$3$1$refreshTask$1 androidAdRefresh$invoke$3$1$refreshTask$1 = new AndroidAdRefresh$invoke$3$1$refreshTask$1(this.this$0, this.$adObject, rq3Var);
        androidAdRefresh$invoke$3$1$refreshTask$1.L$0 = obj;
        return androidAdRefresh$invoke$3$1$refreshTask$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super w2g> rq3Var) {
        return ((AndroidAdRefresh$invoke$3$1$refreshTask$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object u2gVar;
        boolean canUpdateRefreshData;
        AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData;
        Object performRefresh;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        try {
            if (i == 0) {
                y6a.M(obj);
                AndroidAdRefresh androidAdRefresh = this.this$0;
                AdObject adObject = this.$adObject;
                p2g p2gVar = w2g.b;
                ByteString opportunityId = adObject.getOpportunityId();
                this.label = 1;
                performRefresh = androidAdRefresh.performRefresh(opportunityId, this);
                if (performRefresh == lu3Var) {
                    return lu3Var;
                }
            } else {
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
            }
            u2gVar = Unit.a;
            p2g p2gVar2 = w2g.b;
        } catch (Throwable th) {
            p2g p2gVar3 = w2g.b;
            u2gVar = new u2g(th);
        }
        AndroidAdRefresh androidAdRefresh2 = this.this$0;
        AdObject adObject2 = this.$adObject;
        if (w2g.a(u2gVar) != null) {
            canUpdateRefreshData = androidAdRefresh2.canUpdateRefreshData((AdObjectState) ((fdi) adObject2.getState()).getValue());
            if (canUpdateRefreshData && (webViewLessLoadingRequiredData = adObject2.getWebViewLessLoadingRequiredData()) != null) {
                webViewLessLoadingRequiredData.setAdRefreshState(AdRefreshState.REUSE_ERROR);
            }
        }
        return new w2g(u2gVar);
    }
}
