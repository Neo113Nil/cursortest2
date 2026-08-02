package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xtm extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ ovm s;
    public final /* synthetic */ View t;
    public final /* synthetic */ ViewGroup u;
    public final /* synthetic */ View v;
    public final /* synthetic */ Function0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xtm(ovm ovmVar, View view, ViewGroup viewGroup, View view2, Function0 function0, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = ovmVar;
        this.t = view;
        this.u = viewGroup;
        this.v = view2;
        this.w = function0;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new xtm(this.s, this.t, this.u, this.v, this.w, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((xtm) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3 = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            this.r = 1;
            ovm ovmVar = this.s;
            if (!ovmVar.a.a(erm.PLAYER)) {
                obj2 = Unit.a;
            } else if (this.t == null) {
                obj2 = Unit.a;
            } else {
                View view = this.v;
                if (view == null) {
                    obj2 = Unit.a;
                } else if (view.getVisibility() != 0 || view.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    obj2 = Unit.a;
                } else {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = this.u;
                    if (Intrinsics.c(parent, viewGroup) && viewGroup != null) {
                        viewGroup.bringChildToFront(view);
                    }
                    Function0 function0 = this.w;
                    obj2 = evl.fadeOutCancellable$default(view, 300L, null, 8, new ufl(12, ovmVar, function0), new mth(15, ovmVar, view, function0), this, 2, null);
                    if (obj2 != obj3) {
                        obj2 = Unit.a;
                    }
                }
            }
            if (obj2 == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
