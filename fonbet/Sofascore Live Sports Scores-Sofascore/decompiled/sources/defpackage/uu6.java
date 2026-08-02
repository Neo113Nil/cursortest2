package defpackage;

import android.content.Context;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.fantasy.FantasyLeagueGameType;
import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class uu6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uu6(Function0 function0, e1d e1dVar, ao7 ao7Var) {
        this.a = 18;
        this.b = function0;
        this.c = e1dVar;
        this.d = ao7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        int i = this.a;
        Function0 function0 = null;
        String str2 = null;
        Function0 function02 = null;
        utc utcVar = utc.a;
        a99 a99Var = nf3.a;
        int i2 = 1;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                rz8.j((wu6) obj5, (Function1) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                break;
            case 1:
                fv6 fv6Var = (fv6) obj5;
                gv6 gv6Var = (gv6) obj4;
                ev6 ev6Var = (ev6) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    xtc q = n9e.q(utcVar, lz.D(R.color.surface_P, av8Var), oyn.e);
                    boolean booleanValue = ((Boolean) ((eoh) fv6Var.d).getValue()).booleanValue();
                    s26 s26Var = gv6Var.l;
                    boolean z = s26Var != null;
                    if (s26Var == null) {
                        av8Var.d0(-1244201671);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-1244201670);
                        boolean g = av8Var.g(s26Var) | av8Var.i(fv6Var);
                        Object O = av8Var.O();
                        if (g || O == a99Var) {
                            O = new h84(24, s26Var, fv6Var);
                            av8Var.n0(O);
                        }
                        function0 = (Function0) O;
                        av8Var.s(false);
                    }
                    iz8.h(ev6Var, q, booleanValue, z, function0, av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                n4o.a((zo5) obj5, (of6) obj4, (tc3) obj3, (of3) obj, aba.K(3127));
                break;
            case 3:
                ((Integer) obj2).getClass();
                hz8.k((o07) obj5, (FantasyCompetitionType) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                tgj.f((il8) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(385));
                break;
            case 5:
                ((Integer) obj2).getClass();
                rd0.j((j67) obj5, (ev6) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                l98.g((osa) obj5, (e67) obj3, (Function1) obj4, (of3) obj, aba.K(9));
                break;
            case 7:
                ((Integer) obj2).getClass();
                l98.h((h67) obj5, (j37) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                hz8.m((FantasyLeagueGameType) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(385));
                break;
            case 9:
                ((Integer) obj2).getClass();
                wkn.h((FantasyCompetitionType) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                yqo.h((r9) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                kik.c((ja7) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                t62.k((d97) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(7));
                break;
            case 13:
                ((Integer) obj2).getClass();
                ww9.h((bd7) obj5, (xtc) obj3, (Function1) obj4, (of3) obj, aba.K(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                ktm.m((String) obj5, (d7e) obj4, (xtc) obj3, (of3) obj, aba.K(65));
                break;
            case 15:
                tf7 tf7Var = (tf7) obj5;
                uf7 uf7Var = (uf7) obj4;
                fo7 fo7Var = (fo7) obj3;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    xtc q2 = n9e.q(utcVar, lz.D(R.color.surface_P, av8Var2), oyn.e);
                    boolean booleanValue2 = ((Boolean) ((eoh) tf7Var.d).getValue()).booleanValue();
                    s26 s26Var2 = uf7Var.l;
                    if (s26Var2 == null) {
                        av8Var2.d0(1212520672);
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(1212520673);
                        boolean g2 = av8Var2.g(s26Var2) | av8Var2.i(tf7Var);
                        Object O2 = av8Var2.O();
                        Object obj6 = O2;
                        if (g2 || O2 == a99Var) {
                            n37 n37Var = new n37(12, (Object) tf7Var, (Function1) s26Var2);
                            av8Var2.n0(n37Var);
                            obj6 = n37Var;
                        }
                        function02 = (Function0) obj6;
                        av8Var2.s(false);
                    }
                    pd0.e(fo7Var, q2, booleanValue2, function02, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
            case 16:
                ((Integer) obj2).getClass();
                s02.i((do7) obj5, (ho7) obj4, (gv9) obj3, (of3) obj, aba.K(1));
                break;
            case 17:
                nl7 nl7Var = (nl7) obj5;
                ev6 ev6Var2 = (ev6) obj4;
                ct8 ct8Var = (ct8) obj3;
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    gv9 gv9Var = nl7Var.b.c;
                    il8 il8Var = il8.f;
                    boolean g3 = av8Var3.g(ct8Var) | av8Var3.i(nl7Var);
                    Object O3 = av8Var3.O();
                    if (g3 || O3 == a99Var) {
                        O3 = new w47(13, ct8Var, nl7Var);
                        av8Var3.n0(O3);
                    }
                    Function1 function1 = (Function1) O3;
                    Object O4 = av8Var3.O();
                    if (O4 == a99Var) {
                        O4 = new jf7(18);
                        av8Var3.n0(O4);
                    }
                    un0.k(gv9Var, ev6Var2, il8Var, false, false, true, function1, (Function0) O4, null, false, false, av8Var3, 12807552, 0, 1792);
                } else {
                    av8Var3.W();
                }
                break;
            case 18:
                Function0 function03 = (Function0) obj5;
                e1d e1dVar = (e1d) obj4;
                ao7 ao7Var = (ao7) obj3;
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Integer) obj2).intValue();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Context context = (Context) av8Var4.k(nz.b);
                    xtc q3 = n9e.q(d2a.E(bkh.d(utcVar, 1.0f), 8.0f, null, false, 0L, 30), lz.D(R.color.surface_P, av8Var4), oyn.e);
                    k1c c = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var4.T);
                    aee m = av8Var4.m();
                    xtc C = fqj.C(av8Var4, q3);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var4.h0();
                    if (av8Var4.S) {
                        av8Var4.l(zg3Var);
                    } else {
                        av8Var4.q0();
                    }
                    waa.K(av8Var4, c, hf3.g);
                    waa.K(av8Var4, m, hf3.f);
                    waa.K(av8Var4, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var4, hf3.k);
                    waa.K(av8Var4, C, hf3.d);
                    String v = oea.v(R.string.edit_transfers, av8Var4);
                    String w = oea.w(R.string.fantasy_confirm_number_of_transfers_button, new Object[]{Integer.valueOf(((vn7) e1dVar.getValue()).k)}, av8Var4);
                    boolean g4 = av8Var4.g(e1dVar) | av8Var4.i(context) | av8Var4.i(ao7Var);
                    Object O5 = av8Var4.O();
                    if (g4 || O5 == a99Var) {
                        O5 = new l97(i2, context, ao7Var, e1dVar);
                        av8Var4.n0(O5);
                    }
                    o1j.b(v, w, function03, (Function0) O5, null, false, false, false, av8Var4, 0, 240);
                    av8Var4.s(true);
                } else {
                    av8Var4.W();
                }
                break;
            case 19:
                ((Integer) obj2).getClass();
                ktm.p((ao7) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 20:
                ao7 ao7Var2 = (ao7) obj5;
                Function0 function04 = (Function0) obj4;
                cdi cdiVar = (cdi) obj3;
                of3 of3Var5 = (of3) obj;
                int intValue5 = ((Integer) obj2).intValue();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (((vn7) cdiVar.getValue()).h) {
                        str = ljg.k(av8Var5, 995482342, R.string.cancel, av8Var5, false);
                    } else {
                        av8Var5.d0(795227008);
                        av8Var5.s(false);
                        str = null;
                    }
                    if (((vn7) cdiVar.getValue()).h) {
                        av8Var5.d0(795348032);
                        av8Var5.s(false);
                    } else {
                        str2 = ljg.k(av8Var5, 995485936, R.string.review_transfers, av8Var5, false);
                    }
                    boolean i3 = av8Var5.i(ao7Var2);
                    Object O6 = av8Var5.O();
                    if (i3 || O6 == a99Var) {
                        av6 av6Var = new av6(0, ao7Var2, ao7.class, "cancelTransferIn", "cancelTransferIn()V", 0, 23);
                        av8Var5.n0(av6Var);
                        O6 = av6Var;
                    }
                    o1j.b(str, str2, (Function0) ((KFunction) O6), function04, n9e.q(d2a.E(bkh.d(utcVar, 1.0f), 8.0f, null, false, 0L, 30), lz.D(R.color.surface_P, av8Var5), oyn.e), false, ((vn7) cdiVar.getValue()).i, false, av8Var5, 0, 160);
                } else {
                    av8Var5.W();
                }
                break;
            case 21:
                ((Integer) obj2).getClass();
                rfo.f((vt7) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                tol.i((u28) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(385));
                break;
            case 23:
                ((Integer) obj2).getClass();
                dy0.i((ke9) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 24:
                ux7 ux7Var = (ux7) obj5;
                fy7 fy7Var = (fy7) obj4;
                w31 w31Var = (w31) obj3;
                of3 of3Var6 = (of3) obj;
                int intValue6 = ((Integer) obj2).intValue();
                av8 av8Var6 = (av8) of3Var6;
                if (!av8Var6.T(intValue6 & 1, (intValue6 & 3) != 2)) {
                    av8Var6.W();
                } else if (ux7Var != null) {
                    av8Var6.d0(1782137802);
                    int i4 = ux7Var.a;
                    String str3 = ux7Var.b;
                    l98.o(i4, str3 == null ? "" : str3, null, Integer.valueOf(fy7Var.a), null, w31Var.getH(), true, null, av8Var6, 1572864, 148);
                    av8Var6.s(false);
                } else {
                    av8Var6.d0(1782436549);
                    int i5 = fy7Var.a;
                    String str4 = fy7Var.b;
                    l98.u(i5, str4 == null ? "" : str4, null, w31Var.getH(), null, av8Var6, 0, 20);
                    av8Var6.s(false);
                }
                break;
            case 25:
                ((Integer) obj2).getClass();
                tz9.f((fwa) obj5, (n52) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                jca.f(obj5, (u6b) obj3, (Function1) obj4, (of3) obj, aba.K(7));
                break;
            case 27:
                ((Integer) obj2).getClass();
                m9b.d((String) obj5, (String) obj4, (gv9) obj3, (of3) obj, aba.K(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                c5n.p((Function0) obj5, (Function0) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                break;
            default:
                ((Integer) obj2).getClass();
                wnn.r((dyb) obj5, (ksa) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ uu6(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ uu6(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ uu6(int i, int i2, Object obj, Object obj2, Function1 function1) {
        this.a = i2;
        this.b = obj;
        this.d = obj2;
        this.c = function1;
    }
}
