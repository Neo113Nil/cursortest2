package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xll implements lg3, p6b {
    public final xy a;
    public final sg3 b;
    public boolean c;
    public g6b d;
    public tc3 e = xd3.a;

    public xll(xy xyVar, sg3 sg3Var) {
        this.a = xyVar;
        this.b = sg3Var;
    }

    public final void a(Function2 function2) {
        this.a.setOnReadyForComposition(new i20(14, this, (tc3) function2));
    }

    @Override // defpackage.lg3
    public final void d() {
        if (!this.c) {
            this.c = true;
            this.a.getView().setTag(R.id.wrapped_composition_tag, null);
            g6b g6bVar = this.d;
            if (g6bVar != null) {
                g6bVar.d(this);
            }
            this.d = null;
        }
        this.b.d();
    }

    @Override // defpackage.p6b
    public final void onStateChanged(u6b u6bVar, d6b d6bVar) {
        if (d6bVar == d6b.ON_DESTROY) {
            d();
        } else {
            if (d6bVar != d6b.ON_CREATE || this.c) {
                return;
            }
            a(this.e);
        }
    }
}
