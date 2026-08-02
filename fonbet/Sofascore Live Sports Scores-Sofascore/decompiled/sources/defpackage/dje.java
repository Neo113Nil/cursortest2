package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.e;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dje implements d1a {
    public final e1d a;

    public dje(e1d e1dVar) {
        this.a = e1dVar;
    }

    @Override // defpackage.d1a
    public final e1a a(wzc wzcVar, av8 av8Var) {
        long j;
        av8Var.d0(988743187);
        ll4 ll4Var = (ll4) av8Var.k(r5g.a);
        e1d e1dVar = this.a;
        if (((r13) e1dVar.getValue()).a != 16) {
            av8Var.d0(762841340);
            av8Var.s(false);
            j = ((r13) e1dVar.getValue()).a;
        } else {
            av8Var.d0(762899124);
            ll4Var.getClass();
            av8Var.d0(2042140174);
            j = r13.b;
            hkg.e0(j);
            av8Var.s(false);
            av8Var.s(false);
        }
        e1d g = e.g(new r13(j), av8Var);
        ll4Var.getClass();
        av8Var.d0(-1629816343);
        g5g g5gVar = ((double) hkg.e0(r13.b)) > 0.5d ? r5g.b : r5g.c;
        av8Var.s(false);
        e1d g2 = e.g(g5gVar, av8Var);
        av8Var.d0(331259447);
        ViewGroup q = v8a.q((View) av8Var.k(nz.f));
        boolean g3 = av8Var.g(this) | av8Var.g(wzcVar) | av8Var.g(q);
        Object O = av8Var.O();
        Object obj = nf3.a;
        if (g3 || O == obj) {
            O = new x20(g, g2, q);
            av8Var.n0(O);
        }
        x20 x20Var = (x20) O;
        av8Var.s(false);
        boolean g4 = av8Var.g(wzcVar) | av8Var.i(x20Var);
        Object O2 = av8Var.O();
        if (g4 || O2 == obj) {
            O2 = new v1f(wzcVar, x20Var, (rq3) null, 8);
            av8Var.n0(O2);
        }
        hz8.q(x20Var, wzcVar, (Function2) O2, av8Var);
        av8Var.s(false);
        return x20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dje) {
            return p75.b(Float.NaN, Float.NaN) && this.a.equals(((dje) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + fc6.a(Float.NaN, Boolean.hashCode(true) * 31, 31);
    }
}
