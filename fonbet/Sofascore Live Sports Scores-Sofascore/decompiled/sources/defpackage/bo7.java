package defpackage;

import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class bo7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bo7(Function0 function0, long j, e1d e1dVar, int i) {
        this.a = 1;
        this.b = function0;
        this.c = j;
        this.e = e1dVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        Object obj3 = this.e;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                wnn.n((Function0) obj4, (xtc) obj3, this.c, (of3) obj, aba.K(1), this.d);
                break;
            case 1:
                Function0 function0 = (Function0) obj4;
                e1d e1dVar = (e1d) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    long D = lz.D(R.color.n_lv_4, av8Var);
                    Object O = av8Var.O();
                    a99 a99Var = nf3.a;
                    if (O == a99Var) {
                        O = mz1.e(av8Var);
                    }
                    wzc wzcVar = (wzc) O;
                    Object[] objArr = new Object[0];
                    Object O2 = av8Var.O();
                    if (O2 == a99Var) {
                        O2 = o67.w;
                        av8Var.n0(O2);
                    }
                    p28 p28Var = new p28(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), 5);
                    utc utcVar = utc.a;
                    xtc c0 = l98.c0(tol.y(utcVar, true, true, true, D, wzcVar, p28Var, av8Var, 0), 16.0f, 12.0f);
                    u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, c0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var, a, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var, C, f50Var3);
                    xtc c02 = l98.c0(n9e.q(utcVar, lz.D(R.color.primary_default, av8Var), o7g.a(12.0f)), 26.0f, 8.0f);
                    k1c c = e12.c(uxf.c, false);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, c02);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, c, f50Var);
                    waa.K(av8Var, m2, ff3Var);
                    bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C2, f50Var3);
                    String v = oea.v(R.string.referral_program_progress_tooltip, av8Var);
                    yf8 yf8Var = xth.a;
                    udj.c(v, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 131066);
                    av8Var.s(true);
                    xtc z = haa.v(utcVar, 180.0f).z(new we9(uxf.p));
                    Object O3 = av8Var.O();
                    if (O3 == a99Var) {
                        O3 = new fw6(14, e1dVar);
                        av8Var.n0(O3);
                    }
                    xtc A = un0.A(z, (Function1) O3);
                    long j = this.c;
                    boolean f = av8Var.f(j);
                    Object O4 = av8Var.O();
                    if (f || O4 == a99Var) {
                        O4 = new zaa(j, i2, e1dVar);
                        av8Var.n0(O4);
                    }
                    kq9.b(s6a.N(R.drawable.ic_container_pointer, 6, av8Var), null, s02.M(A, (Function1) O4), lz.D(R.color.primary_default, av8Var), av8Var, 48, 0);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                i2a.m((q80) obj4, (xtc) obj3, this.c, (of3) obj, aba.K(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                i9a.k((mhj) obj4, (r13) obj3, this.c, (of3) obj, aba.K(i2 | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ bo7(Object obj, Object obj2, long j, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.e = obj2;
        this.c = j;
        this.d = i;
    }

    public /* synthetic */ bo7(Function0 function0, xtc xtcVar, long j, int i, int i2) {
        this.a = 0;
        this.b = function0;
        this.e = xtcVar;
        this.c = j;
        this.d = i2;
    }
}
