package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.mvvm.model.ShotMapPoint;
import com.sofascore.results.R;
import com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog;
import com.sofascore.results.event.details.bottomSheet.EventPlayerOfTheMatchVoteBottomSheet;
import com.sofascore.results.view.graph.BasketballShotmapGraph;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class cyb implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cyb(String str, ImageVector imageVector, String str2) {
        this.a = 0;
        this.b = str;
        this.d = imageVector;
        this.c = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        utc utcVar = utc.a;
        int i2 = 17;
        a99 a99Var = nf3.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj5;
                ImageVector imageVector = (ImageVector) obj3;
                String str2 = (String) obj4;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    xtc z = l98.b0(utcVar, 16.0f).z(bkh.c);
                    u23 a = t23.a(ww9.f, uxf.o, av8Var, 6);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, z);
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
                    l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, utcVar);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a2, f50Var);
                    waa.K(av8Var, m2, ff3Var);
                    bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C2, f50Var3);
                    kq9.b(imageVector, null, bkh.l(utcVar, 24.0f), lz.D(R.color.n_lv_1, av8Var), av8Var, 432, 0);
                    nq8.h(av8Var, bkh.p(utcVar, 8.0f));
                    yf8 yf8Var = xth.a;
                    udj.c(str2, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 110586);
                    av8Var.s(true);
                    nq8.h(av8Var, bkh.e(utcVar, 8.0f));
                    udj.c(str, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, xth.b(), av8Var, 0, 24960, 110586);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 1:
                q50 q50Var = (q50) obj5;
                tc3 tc3Var = (tc3) obj4;
                fm8 fm8Var = (fm8) obj3;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean i3 = av8Var2.i(q50Var);
                    Object O = av8Var2.O();
                    if (i3 || O == a99Var) {
                        O = new atc(q50Var, 1);
                        av8Var2.n0(O);
                    }
                    xtc M = s02.M(utcVar, (Function1) O);
                    k1c c = e12.c(uxf.c, false);
                    int hashCode3 = Long.hashCode(av8Var2.T);
                    aee m3 = av8Var2.m();
                    xtc C3 = fqj.C(av8Var2, M);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var2);
                    } else {
                        av8Var2.q0();
                    }
                    f50 f50Var4 = hf3.g;
                    waa.K(av8Var2, c, f50Var4);
                    ff3 ff3Var2 = hf3.f;
                    waa.K(av8Var2, m3, ff3Var2);
                    Integer valueOf2 = Integer.valueOf(hashCode3);
                    f50 f50Var5 = hf3.j;
                    waa.K(av8Var2, valueOf2, f50Var5);
                    ry ryVar2 = hf3.k;
                    waa.J(av8Var2, ryVar2);
                    f50 f50Var6 = hf3.d;
                    waa.K(av8Var2, C3, f50Var6);
                    g28 g28Var = bkh.c;
                    k1c c2 = e12.c(uxf.g, false);
                    int hashCode4 = Long.hashCode(av8Var2.T);
                    aee m4 = av8Var2.m();
                    xtc C4 = fqj.C(av8Var2, g28Var);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var2);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, c2, f50Var4);
                    waa.K(av8Var2, m4, ff3Var2);
                    bf3.s(hashCode4, av8Var2, f50Var5, av8Var2, ryVar2);
                    waa.K(av8Var2, C4, f50Var6);
                    tc3Var.invoke(fm8Var, av8Var2, 0);
                    av8Var2.s(true);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 2:
                ((Integer) obj2).getClass();
                un0.q((u6b) obj5, (Function1) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 3:
                xtc xtcVar = (xtc) obj5;
                e1d e1dVar = (e1d) obj4;
                tc3 tc3Var2 = (tc3) obj3;
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Object O2 = av8Var3.O();
                    if (O2 == a99Var) {
                        O2 = new w30(false ? 1 : 0, e1dVar);
                        av8Var3.n0(O2);
                    }
                    xtc A = un0.A(xtcVar, (Function1) O2);
                    k1c c3 = e12.c(uxf.c, true);
                    int hashCode5 = Long.hashCode(av8Var3.T);
                    aee m5 = av8Var3.m();
                    xtc C5 = fqj.C(av8Var3, A);
                    if3.k7.getClass();
                    zg3 zg3Var3 = hf3.b;
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var3);
                    } else {
                        av8Var3.q0();
                    }
                    waa.K(av8Var3, c3, hf3.g);
                    waa.K(av8Var3, m5, hf3.f);
                    waa.K(av8Var3, Integer.valueOf(hashCode5), hf3.j);
                    waa.J(av8Var3, hf3.k);
                    waa.K(av8Var3, C5, hf3.d);
                    fc6.v(0, tc3Var2, av8Var3, true);
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                ek1.a((fk1) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 5:
                ((Integer) obj2).getClass();
                o02.q((nl1) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 6:
                ((Integer) obj2).getClass();
                td4.d((tm1) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 7:
                fsf fsfVar = (fsf) obj5;
                ez0 ez0Var = (ez0) obj3;
                String str3 = (String) obj;
                ((Integer) obj2).getClass();
                str3.getClass();
                fsfVar.a = str3;
                gv9 gv9Var = ((zr1) obj4).o;
                ArrayList arrayList = new ArrayList();
                for (Object obj6 : gv9Var) {
                    if (Intrinsics.c(((ShotMapPoint) obj6).getPeriod(), fsfVar.a) || Intrinsics.c(fsfVar.a, "ALL")) {
                        arrayList.add(obj6);
                    }
                }
                ((BasketballShotmapGraph) ez0Var.d).setShotmap(arrayList);
                return Unit.a;
            case 8:
                e1d e1dVar2 = (e1d) obj5;
                p3e p3eVar = (p3e) obj4;
                tc3 tc3Var3 = (tc3) obj3;
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Integer) obj2).intValue();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    tol.b(go3.a.a(Float.valueOf(r13.d(((r13) e1dVar2.getValue()).a))), yqo.H(-869936862, av8Var4, new y72(p3eVar, tc3Var3, false ? 1 : 0)), av8Var4, 56);
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 9:
                ((Integer) obj2).getClass();
                rz8.e((br2) obj5, (qug) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 10:
                ar2 ar2Var = (ar2) obj5;
                Function1 function1 = (Function1) obj4;
                qug qugVar = (qug) obj3;
                of3 of3Var5 = (of3) obj;
                int intValue5 = ((Integer) obj2).intValue();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    gv9 gv9Var2 = ar2Var.a;
                    String str4 = ar2Var.b;
                    boolean g = av8Var5.g(function1);
                    Object O3 = av8Var5.O();
                    int i4 = 14;
                    if (g || O3 == a99Var) {
                        O3 = new vi(i4, function1);
                        av8Var5.n0(O3);
                    }
                    Function1 function12 = (Function1) O3;
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    rz8.g(0, av8Var5, gv9Var2, hkg.u0(bkh.d(new goa(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 1.0f), qugVar, false, 14), str4, function12);
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            case 11:
                ((Integer) obj2).getClass();
                rz8.o((String) obj5, (String) obj4, (String) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 12:
                ((Integer) obj2).getClass();
                ((ComposeModalBottomSheetDialog) obj5).F((ksa) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 13:
                ((Integer) obj2).getClass();
                ((ComposeModalBottomSheetDialog) obj5).G((qug) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 14:
                ((Integer) obj2).getClass();
                pd0.c((vnb) obj5, (Function1) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 15:
                ((Integer) obj2).getClass();
                l98.f((xtc) obj5, (tbj) obj4, (tc3) obj3, (of3) obj, aba.K(385));
                return Unit.a;
            case 16:
                ((Integer) obj2).getClass();
                oyn.a((s24) obj5, (Function0) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 17:
                ((Integer) obj2).getClass();
                k44.d((m44) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 18:
                n44 n44Var = (n44) obj5;
                r54 r54Var = (r54) obj4;
                Function0 function0 = (Function0) obj3;
                of3 of3Var6 = (of3) obj;
                int intValue6 = ((Integer) obj2).intValue();
                av8 av8Var6 = (av8) of3Var6;
                if (!av8Var6.T(intValue6 & 1, (intValue6 & 3) != 2)) {
                    av8Var6.W();
                } else if (n44Var instanceof l44) {
                    av8Var6.d0(-2085705975);
                    k44.g(r54Var.a, r54Var.d, function0, av8Var6, 0);
                    av8Var6.s(false);
                } else {
                    if (!(n44Var instanceof m44)) {
                        throw dmi.h(av8Var6, -2085707292, false);
                    }
                    av8Var6.d0(-2085696956);
                    m44 m44Var = (m44) n44Var;
                    k44.h(m44Var, m44Var.g, m44Var.c, av8Var6, 0);
                    av8Var6.s(false);
                }
                return Unit.a;
            case 19:
                ((Integer) obj2).getClass();
                t62.t((String) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(3505));
                return Unit.a;
            case 20:
                ((Integer) obj2).getClass();
                t62.f((q05) obj5, (Function0) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 21:
                ((Integer) obj2).getClass();
                u6h.h((xs5) obj5, (Function1) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 22:
                ((Integer) obj2).getClass();
                fqj.e((km) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 23:
                ((Integer) obj2).getClass();
                c6o.c((wkc) obj5, (xtc) obj4, (Function1) obj3, (of3) obj, aba.K(49));
                return Unit.a;
            case 24:
                ((Integer) obj2).getClass();
                c6o.k((skc) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 25:
                e1d e1dVar3 = (e1d) obj5;
                EventPlayerOfTheMatchVoteBottomSheet eventPlayerOfTheMatchVoteBottomSheet = (EventPlayerOfTheMatchVoteBottomSheet) obj4;
                znh znhVar = (znh) obj3;
                of3 of3Var7 = (of3) obj;
                int intValue7 = ((Integer) obj2).intValue();
                av8 av8Var7 = (av8) of3Var7;
                if (av8Var7.T(intValue7 & 1, (intValue7 & 3) != 2)) {
                    mte mteVar = (mte) e1dVar3.getValue();
                    if (mteVar == null) {
                        av8Var7.d0(-656823214);
                        av8Var7.s(false);
                    } else {
                        av8Var7.d0(-656823213);
                        String str5 = mteVar.b;
                        boolean i5 = av8Var7.i(eventPlayerOfTheMatchVoteBottomSheet) | av8Var7.g(mteVar) | av8Var7.g(znhVar);
                        Object O4 = av8Var7.O();
                        if (i5 || O4 == a99Var) {
                            m61 m61Var = new m61((Object) eventPlayerOfTheMatchVoteBottomSheet, (Object) mteVar, (Object) znhVar, e1dVar3, 4);
                            av8Var7.n0(m61Var);
                            O4 = m61Var;
                        }
                        Function0 function02 = (Function0) O4;
                        Object O5 = av8Var7.O();
                        Object obj7 = O5;
                        if (O5 == a99Var) {
                            v30 v30Var = new v30(i2, e1dVar3);
                            av8Var7.n0(v30Var);
                            obj7 = v30Var;
                        }
                        v9g.s(str5, function02, (Function0) obj7, null, av8Var7, 384);
                        av8Var7.s(false);
                    }
                } else {
                    av8Var7.W();
                }
                return Unit.a;
            case 26:
                ((Integer) obj2).getClass();
                hkg.g((gv9) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(385));
                return Unit.a;
            case 27:
                ((Integer) obj2).getClass();
                c6o.d((s37) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 28:
                ((Integer) obj2).getClass();
                s02.C((sd7) obj5, (mj7) obj4, (xtc) obj3, (of3) obj, aba.K(385));
                return Unit.a;
            default:
                hr6 hr6Var = (hr6) obj5;
                cdi cdiVar = (cdi) obj4;
                Function1 function13 = (Function1) obj3;
                of3 of3Var8 = (of3) obj;
                int intValue8 = ((Integer) obj2).intValue();
                av8 av8Var8 = (av8) of3Var8;
                if (av8Var8.T(intValue8 & 1, (intValue8 & 3) != 2)) {
                    int b = wzb.b(((kx4) av8Var8.k(dh3.h)).H0(16.0f));
                    boolean z2 = !hr6Var.b && ((Boolean) cdiVar.getValue()).booleanValue() && hr6Var.a.c.d == FantasyCompetitionType.SEASON;
                    i4k h0 = s02.h0(200, 0, null, 6);
                    boolean e = av8Var8.e(b);
                    Object O6 = av8Var8.O();
                    if (e || O6 == a99Var) {
                        O6 = new q13(b, 16);
                        av8Var8.n0(O6);
                    }
                    zo5 n = uo5.n(h0, (Function1) O6);
                    i4k h02 = s02.h0(200, 0, null, 6);
                    boolean e2 = av8Var8.e(b);
                    Object O7 = av8Var8.O();
                    if (e2 || O7 == a99Var) {
                        O7 = new q13(b, i2);
                        av8Var8.n0(O7);
                    }
                    fz8.e(z2, null, n, uo5.p(h02, (Function1) O7), null, yqo.H(916267151, av8Var8, new y47(11, function13)), av8Var8, 196608, 18);
                } else {
                    av8Var8.W();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ cyb(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ cyb(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
