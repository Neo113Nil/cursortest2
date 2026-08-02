package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i1n implements Function0 {
    public final /* synthetic */ asf a;
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ lj2 f;

    public i1n(asf asfVar, View view, int i, ViewPropertyAnimator viewPropertyAnimator, Function0 function0, lj2 lj2Var) {
        this.a = asfVar;
        this.b = view;
        this.c = i;
        this.d = viewPropertyAnimator;
        this.e = function0;
        this.f = lj2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        asf asfVar = this.a;
        if (!asfVar.a) {
            asfVar.a = true;
            this.b.setVisibility(this.c);
            this.d.cancel();
            Function0 function0 = this.e;
            if (function0 != null) {
                function0.invoke();
            }
            lj2 lj2Var = this.f;
            if (lj2Var.r() instanceof oed) {
                p2g p2gVar = w2g.b;
                lj2Var.resumeWith(Unit.a);
            }
        }
        return Unit.a;
    }
}
