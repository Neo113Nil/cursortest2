package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ra6 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wa6 b;

    public /* synthetic */ ra6(wa6 wa6Var, int i) {
        this.a = i;
        this.b = wa6Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String valueOf;
        String valueOf2;
        int i = this.a;
        utc utcVar = utc.a;
        wa6 wa6Var = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    String str = wa6Var.k;
                    bx7 bx7Var = wa6Var.l;
                    l98.r(str, bx7Var.c, bx7Var.b, bx7Var.d, av8Var, 0);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 1:
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    bx7 bx7Var2 = wa6Var.l;
                    fy7 fy7Var = bx7Var2.h;
                    fy7 fy7Var2 = bx7Var2.g;
                    if (fy7Var2 != null && fy7Var != null) {
                        Integer num = bx7Var2.m;
                        String str2 = (num == null || (valueOf2 = String.valueOf(num.intValue())) == null) ? "" : valueOf2;
                        Integer num2 = bx7Var2.q;
                        int intValue3 = num2 != null ? num2.intValue() : 0;
                        Integer num3 = bx7Var2.n;
                        String str3 = (num3 == null || (valueOf = String.valueOf(num3.intValue())) == null) ? "" : valueOf;
                        String str4 = bx7Var2.k;
                        l98.k(fy7Var2, fy7Var, str2, str3, intValue3, str4 == null ? "" : str4, fy7Var2 != null ? fy7Var2.h : null, fy7Var != null ? fy7Var.h : null, bx7Var2.r, wa6Var.k, null, bx7Var2.s, null, null, 0L, 0L, av8Var2, 0, 0, 62464);
                    }
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 2:
                of3 of3Var3 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    u23 a = t23.a(ww9.d, uxf.p, av8Var3, 48);
                    int hashCode = Long.hashCode(av8Var3.T);
                    aee m = av8Var3.m();
                    xtc C = fqj.C(av8Var3, utcVar);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var);
                    } else {
                        av8Var3.q0();
                    }
                    waa.K(av8Var3, a, hf3.g);
                    waa.K(av8Var3, m, hf3.f);
                    waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var3, hf3.k);
                    waa.K(av8Var3, C, hf3.d);
                    nq8.h(av8Var3, bkh.e(utcVar, 4.0f));
                    av8Var3.d0(-1765976761);
                    gv9 gv9Var = wa6Var.m;
                    String str5 = wa6Var.k;
                    int i2 = 0;
                    for (Object obj4 : gv9Var) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            b.q();
                            throw null;
                        }
                        s4c s4cVar = (s4c) obj4;
                        if (Intrinsics.c(s4cVar.a, "Ball possession")) {
                            av8Var3.d0(1796532754);
                            fcp.F(s4cVar, str5, av8Var3, 0);
                            av8Var3.s(false);
                        } else if (str5.equals(Sports.BASKETBALL) && i2 == 0) {
                            av8Var3.d0(1796537589);
                            fcp.I(s4cVar, av8Var3, 0);
                            av8Var3.s(false);
                        } else {
                            av8Var3.d0(1796540108);
                            fcp.V(s4cVar, str5, av8Var3, 0);
                            av8Var3.s(false);
                        }
                        nq8.h(av8Var3, bkh.e(utcVar, 16.0f));
                        i2 = i3;
                    }
                    av8Var3.s(false);
                    fz8.m(R.string.view_all_stats, 0L, av8Var3, 0, 2);
                    av8Var3.s(true);
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 3:
                of3 of3Var4 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue5 & 1, (intValue5 & 17) != 16)) {
                    u23 a2 = t23.a(ww9.d, uxf.p, av8Var4, 48);
                    int hashCode2 = Long.hashCode(av8Var4.T);
                    aee m2 = av8Var4.m();
                    xtc C2 = fqj.C(av8Var4, utcVar);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var4.h0();
                    if (av8Var4.S) {
                        av8Var4.l(zg3Var2);
                    } else {
                        av8Var4.q0();
                    }
                    waa.K(av8Var4, a2, hf3.g);
                    waa.K(av8Var4, m2, hf3.f);
                    waa.K(av8Var4, Integer.valueOf(hashCode2), hf3.j);
                    waa.J(av8Var4, hf3.k);
                    waa.K(av8Var4, C2, hf3.d);
                    nq8.h(av8Var4, bkh.e(utcVar, 4.0f));
                    av8Var4.d0(1081312047);
                    gv9 gv9Var2 = wa6Var.m;
                    String str6 = wa6Var.k;
                    int i4 = 0;
                    for (Object obj5 : gv9Var2) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            b.q();
                            throw null;
                        }
                        s4c s4cVar2 = (s4c) obj5;
                        if (str6.equals(Sports.BASKETBALL) && i4 == 0) {
                            av8Var4.d0(1522697457);
                            fcp.I(s4cVar2, av8Var4, 0);
                            av8Var4.s(false);
                        } else {
                            av8Var4.d0(1522795386);
                            fcp.V(s4cVar2, str6, av8Var4, 0);
                            av8Var4.s(false);
                        }
                        nq8.h(av8Var4, bkh.e(utcVar, 16.0f));
                        i4 = i5;
                    }
                    av8Var4.s(false);
                    av8Var4.s(true);
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            default:
                of3 of3Var5 = (of3) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue6 & 1, (intValue6 & 17) != 16)) {
                    Integer valueOf3 = wa6Var.k.equals(Sports.TENNIS) ? Integer.valueOf(R.string.tennis_more_match_stats) : null;
                    fz8.m(valueOf3 != null ? valueOf3.intValue() : R.string.more_team_stats, 0L, av8Var5, 0, 2);
                } else {
                    av8Var5.W();
                }
                return Unit.a;
        }
    }
}
