package defpackage;

import android.content.Context;
import android.view.Window;
import androidx.compose.runtime.e;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class osc extends a3 implements e25 {
    public final Window k;
    public final e1d l;
    public boolean m;

    public osc(Context context, Window window) {
        super(context, null, 6, 0);
        this.k = window;
        this.l = e.f(sd3.a);
    }

    @Override // defpackage.a3
    public final void a(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(576708319);
        int i2 = (av8Var.i(this) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            ((Function2) ((eoh) this.l).getValue()).invoke(av8Var, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new faa(this, i, 27);
        }
    }

    @Override // defpackage.a3
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.m;
    }

    @Override // defpackage.e25
    public final Window getWindow() {
        return this.k;
    }
}
