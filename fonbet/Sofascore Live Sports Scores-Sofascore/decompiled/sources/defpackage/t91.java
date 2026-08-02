package defpackage;

import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class t91 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bm1 b;

    public /* synthetic */ t91(bm1 bm1Var) {
        this.a = 1;
        this.b = bm1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        bm1 bm1Var = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                u91.b(bm1Var, (of3) obj, aba.K(1));
                return Unit.a;
            case 1:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(1 & intValue, (intValue & 3) != 2)) {
                    xtc c0 = l98.c0(n9e.q(d2a.E(utc.a, 2.0f, o7g.a(10.0f), false, 0L, 28), lz.D(R.color.surface_1, av8Var), o7g.a(10.0f)), 8.0f, 3.0f);
                    av8Var.d0(-1333208035);
                    o80 o80Var = new o80();
                    o80Var.d("#" + bm1Var.d + " ");
                    int g = o80Var.g(new pwh(lz.D(R.color.n_lv_3, av8Var), 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                    try {
                        o80Var.d("/ " + bm1Var.e);
                        Unit unit = Unit.a;
                        o80Var.f(g);
                        q80 h = o80Var.h();
                        av8Var.s(false);
                        yf8 yf8Var = xth.a;
                        udj.d(h, c0, lz.D(R.color.n_lv_1, av8Var), null, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, xth.e(), av8Var, 0, 0, 262136);
                    } catch (Throwable th) {
                        o80Var.f(g);
                        throw th;
                    }
                } else {
                    av8Var.W();
                }
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                ek1.d(bm1Var, (of3) obj, aba.K(1));
                return Unit.a;
        }
    }

    public /* synthetic */ t91(bm1 bm1Var, int i, int i2) {
        this.a = i2;
        this.b = bm1Var;
    }
}
