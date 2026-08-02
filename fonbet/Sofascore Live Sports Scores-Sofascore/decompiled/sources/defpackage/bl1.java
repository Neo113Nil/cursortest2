package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class bl1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bl1(fy7 fy7Var, boolean z, xtc xtcVar, boolean z2, int i) {
        this.a = 4;
        this.e = fy7Var;
        this.b = z;
        this.f = xtcVar;
        this.c = z2;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                o02.e((ml1) obj4, this.b, this.c, (Function1) obj3, (of3) obj, aba.K(1 | i2));
                break;
            case 1:
                ((Integer) obj2).getClass();
                rd0.g((Double) obj4, (Double) obj3, this.b, this.c, (of3) obj, aba.K(1 | i2));
                break;
            case 2:
                ((Integer) obj2).getClass();
                s02.w((mj7) obj4, this.b, this.c, (xtc) obj3, (of3) obj, aba.K(1 | i2));
                break;
            case 3:
                ((Integer) obj2).getClass();
                jq7.b(this.b, this.c, (Function1) obj3, (xtc) obj4, (of3) obj, aba.K(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                gz8.i((fy7) obj4, this.b, (xtc) obj3, this.c, (of3) obj, aba.K(1 | i2));
                break;
            case 5:
                ((Integer) obj2).intValue();
                aza.a(aba.K(1 | i2), (of3) obj, (vnb) obj4, (Function1) obj3, this.b, this.c);
                break;
            case 6:
                lrh lrhVar = (lrh) obj4;
                final Function0 function0 = (Function0) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    xtc a = bkh.a(utc.a, 32.0f, 32.0f);
                    n7g a2 = o7g.a(8.0f);
                    t3e t3eVar = q72.a;
                    final boolean z = this.b;
                    p72 a3 = q72.a(lrhVar.b(z, av8Var), 0L, 0L, 0L, av8Var, 14);
                    qz1 H = fcp.H(lrhVar.a(z, av8Var), 1.5f);
                    t3e t3eVar2 = new t3e(4.0f, 4.0f, 4.0f, 4.0f);
                    boolean h = av8Var.h(true) | av8Var.h(z);
                    final boolean z2 = this.c;
                    boolean h2 = h | av8Var.h(z2) | av8Var.g(function0);
                    Object O = av8Var.O();
                    if (h2 || O == nf3.a) {
                        O = new Function0() { // from class: crh
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                if (!z || z2) {
                                    function0.invoke();
                                }
                                return Unit.a;
                            }
                        };
                        av8Var.n0(O);
                    }
                    iz8.e((Function0) O, a, false, a2, a3, null, H, t3eVar2, null, yqo.H(-1059589933, av8Var, new duh(i2, lrhVar, z)), av8Var, 817889280, 292);
                } else {
                    av8Var.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                w3a.h((String) obj4, this.b, this.c, (y1h) obj3, (of3) obj, aba.K(i2 | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ bl1(lrh lrhVar, boolean z, boolean z2, Function0 function0, int i) {
        this.a = 6;
        this.e = lrhVar;
        this.b = z;
        this.c = z2;
        this.f = function0;
        this.d = i;
    }

    public /* synthetic */ bl1(Double d, Double d2, boolean z, boolean z2, int i) {
        this.a = 1;
        this.e = d;
        this.f = d2;
        this.b = z;
        this.c = z2;
        this.d = i;
    }

    public /* synthetic */ bl1(Object obj, boolean z, boolean z2, Object obj2, int i, int i2) {
        this.a = i2;
        this.e = obj;
        this.b = z;
        this.c = z2;
        this.f = obj2;
        this.d = i;
    }

    public /* synthetic */ bl1(boolean z, boolean z2, Function1 function1, xtc xtcVar, int i) {
        this.a = 3;
        this.b = z;
        this.c = z2;
        this.f = function1;
        this.e = xtcVar;
        this.d = i;
    }
}
