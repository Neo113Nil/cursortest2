package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qum extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ ovm s;
    public final /* synthetic */ ViewGroup t;
    public final /* synthetic */ View u;
    public final /* synthetic */ Function0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qum(ovm ovmVar, ViewGroup viewGroup, View view, Function0 function0, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = ovmVar;
        this.t = viewGroup;
        this.u = view;
        this.v = function0;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new qum(this.s, this.t, this.u, this.v, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qum) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object fadeInCancellable$default;
        Object obj2 = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            this.r = 1;
            if (this.s.a.a(erm.PLACEHOLDER)) {
                View view = this.u;
                ViewParent parent = view.getParent();
                ViewGroup viewGroup = this.t;
                if (!Intrinsics.c(parent, viewGroup) && viewGroup != null) {
                    ViewParent parent2 = view.getParent();
                    ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(view);
                    }
                    viewGroup.addView(view);
                }
                if (Intrinsics.c(view.getParent(), viewGroup) && viewGroup != null) {
                    viewGroup.bringChildToFront(view);
                }
                view.setVisibility(0);
                float alpha = view.getAlpha();
                Function0 function0 = this.v;
                if (alpha == 1.0f) {
                    function0.invoke();
                    fadeInCancellable$default = Unit.a;
                } else {
                    fadeInCancellable$default = evl.fadeInCancellable$default(view, 300L, null, new vdl(4, function0), new ufl(13, view, function0), this, 2, null);
                    if (fadeInCancellable$default != obj2) {
                        fadeInCancellable$default = Unit.a;
                    }
                }
            } else {
                fadeInCancellable$default = Unit.a;
            }
            if (fadeInCancellable$default == obj2) {
                return obj2;
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
