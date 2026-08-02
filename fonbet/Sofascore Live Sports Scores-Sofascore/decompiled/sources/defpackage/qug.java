package defpackage;

import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qug implements jvg {
    public static final y3g j = new y3g(9, new wqg(8), new vqg(20));
    public final znh a;
    public float f;
    public final znh b = e.c(0);
    public final znh c = e.c(0);
    public final xzc d = new xzc();
    public final znh e = e.c(Integer.MAX_VALUE);
    public final ls4 g = new ls4(new qfg(this, 7));
    public final ay4 h = goh.b(new fu5(this, 9));
    public final ay4 i = goh.b(new fu5(this, 10));

    public qug(int i) {
        this.a = e.c(i);
    }

    @Override // defpackage.jvg
    public final Object a(m1d m1dVar, Function2 function2, rq3 rq3Var) {
        Object a = this.g.a(m1dVar, function2, rq3Var);
        return a == lu3.a ? a : Unit.a;
    }

    @Override // defpackage.jvg
    public final boolean b() {
        return this.g.b();
    }

    @Override // defpackage.jvg
    public final boolean c() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // defpackage.jvg
    public final boolean d() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // defpackage.jvg
    public final float e(float f) {
        return this.g.e(f);
    }

    public final Object f(int i, j38 j38Var, hoi hoiVar) {
        Object i2 = v8a.i(this, i - this.a.h(), j38Var, hoiVar);
        return i2 == lu3.a ? i2 : Unit.a;
    }

    public final void g(int i) {
        znh znhVar = this.a;
        this.e.i(i);
        nnh w = bea.w();
        Function1 e = w != null ? w.e() : null;
        nnh C = bea.C(w);
        try {
            if (znhVar.h() > i) {
                znhVar.i(i);
            }
            Unit unit = Unit.a;
            bea.K(w, C, e);
        } catch (Throwable th) {
            bea.K(w, C, e);
            throw th;
        }
    }
}
