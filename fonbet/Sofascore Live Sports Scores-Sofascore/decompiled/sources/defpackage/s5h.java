package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.sofascore.model.Sports;
import com.sofascore.results.R;
import com.sofascore.results.league.fragment.details.compose.model.TeamOfTheWeekFieldUIData;
import com.sofascore.results.team.details.view.TeamAchievementsView;
import com.sofascore.results.team.details.view.TeamInfoView;
import com.sofascore.results.team.details.view.TeamRecentFormView;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class s5h implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s5h(Context context, ehk ehkVar) {
        this.a = 4;
        this.b = context;
        this.c = ehkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        pej pejVar;
        int i = this.a;
        int i2 = 21;
        a99 a99Var = nf3.a;
        utc utcVar = utc.a;
        int i3 = 1;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                bqg bqgVar = (bqg) obj3;
                obj2.getClass();
                bqgVar.getClass();
                lm5.a.getClass();
                Bundle E = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
                new eqg(E, bqgVar).l((qq3) obj4, obj2);
                break;
            case 1:
                ((Integer) obj2).getClass();
                s6a.l((pv3) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                d7a.j((xtc) obj4, (tc3) obj3, (of3) obj, aba.K(49));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((oph) obj4).a((tc3) obj3, (of3) obj, aba.K(7));
                break;
            case 4:
                Context context = (Context) obj4;
                ehk ehkVar = (ehk) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    xtc p = n9e.p(bkh.d(utcVar, 1.0f), new v7b(l6g.K(new r13(hkg.d(4279836223L)), new r13(hkg.d(4281814517L)), new r13(hkg.d(4279836223L))), null, 0L, 9187343241974906880L), o7g.a(16.0f), 4);
                    long D = lz.D(R.color.n_lv_4, av8Var);
                    Object O = av8Var.O();
                    Object obj5 = O;
                    if (O == a99Var) {
                        obj5 = mz1.e(av8Var);
                    }
                    wzc wzcVar = (wzc) obj5;
                    Object[] objArr = new Object[0];
                    Object O2 = av8Var.O();
                    Object obj6 = O2;
                    if (O2 == a99Var) {
                        mce mceVar = mce.A;
                        av8Var.n0(mceVar);
                        obj6 = mceVar;
                    }
                    xtc f0 = l98.f0(tol.y(p, true, true, true, D, wzcVar, new he7((boh) o3a.N(objArr, (Function0) obj6, av8Var, 48), context, 1), av8Var, 0), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 2);
                    av8Var.d0(-1003410150);
                    av8Var.d0(212064437);
                    av8Var.s(false);
                    kx4 kx4Var = (kx4) av8Var.k(dh3.h);
                    Object O3 = av8Var.O();
                    Object obj7 = O3;
                    if (O3 == a99Var) {
                        t1c t1cVar = new t1c(kx4Var);
                        av8Var.n0(t1cVar);
                        obj7 = t1cVar;
                    }
                    t1c t1cVar2 = (t1c) obj7;
                    Object O4 = av8Var.O();
                    Object obj8 = O4;
                    if (O4 == a99Var) {
                        am3 am3Var = new am3();
                        av8Var.n0(am3Var);
                        obj8 = am3Var;
                    }
                    am3 am3Var2 = (am3) obj8;
                    Object O5 = av8Var.O();
                    Object obj9 = O5;
                    if (O5 == a99Var) {
                        e1d f = e.f(Boolean.FALSE);
                        av8Var.n0(f);
                        obj9 = f;
                    }
                    e1d e1dVar = (e1d) obj9;
                    Object O6 = av8Var.O();
                    Object obj10 = O6;
                    if (O6 == a99Var) {
                        pm3 pm3Var = new pm3(am3Var2);
                        av8Var.n0(pm3Var);
                        obj10 = pm3Var;
                    }
                    pm3 pm3Var2 = (pm3) obj10;
                    Object O7 = av8Var.O();
                    Object obj11 = O7;
                    if (O7 == a99Var) {
                        e1d e = e.e(Unit.a, f7a.k);
                        av8Var.n0(e);
                        obj11 = e;
                    }
                    e1d e1dVar2 = (e1d) obj11;
                    boolean i4 = av8Var.i(t1cVar2) | av8Var.e(257);
                    Object O8 = av8Var.O();
                    Object obj12 = O8;
                    if (i4 || O8 == a99Var) {
                        kd3 kd3Var = new kd3(e1dVar2, t1cVar2, pm3Var2, e1dVar, 12);
                        av8Var.n0(kd3Var);
                        obj12 = kd3Var;
                    }
                    k1c k1cVar = (k1c) obj12;
                    Object O9 = av8Var.O();
                    int i5 = 12;
                    Object obj13 = O9;
                    if (O9 == a99Var) {
                        ld3 ld3Var = new ld3(e1dVar, pm3Var2, 12);
                        av8Var.n0(ld3Var);
                        obj13 = ld3Var;
                    }
                    Function0 function0 = (Function0) obj13;
                    boolean i6 = av8Var.i(t1cVar2);
                    Object O10 = av8Var.O();
                    Object obj14 = O10;
                    if (i6 || O10 == a99Var) {
                        md3 md3Var = new md3(t1cVar2, i5);
                        av8Var.n0(md3Var);
                        obj14 = md3Var;
                    }
                    s6a.h(o3h.a(f0, false, (Function1) obj14), yqo.H(1200550679, av8Var, new d24(e1dVar2, am3Var2, function0, ehkVar, 2)), k1cVar, av8Var, 48);
                    av8Var.s(false);
                } else {
                    av8Var.W();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                z1a.a((ehk) obj4, (xtc) obj3, (of3) obj, aba.K(49));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((tth) obj4).a((tc3) obj3, (of3) obj, aba.K(7));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((uth) obj4).a((tc3) obj3, (of3) obj, aba.K(7));
                break;
            case 8:
                ((Integer) obj2).getClass();
                jzh.e((zqb) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                r5i.c((xtc) obj4, (zmd) obj3, (of3) obj, aba.K(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                w3a.f((f6i) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                m8i.a((n8i) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 12:
                break;
            case 13:
                ((Integer) obj2).getClass();
                gvd.q((fui) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                break;
            case 14:
                gui guiVar = (gui) obj4;
                TeamAchievementsView teamAchievementsView = (TeamAchievementsView) obj3;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i7 = TeamAchievementsView.m;
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean i8 = av8Var2.i(teamAchievementsView);
                    Object O11 = av8Var2.O();
                    if (i8 || O11 == a99Var) {
                        chf chfVar = new chf(1, teamAchievementsView, TeamAchievementsView.class, "showTournamentScreen", "showTournamentScreen(I)V", 0, 17);
                        av8Var2.n0(chfVar);
                        O11 = chfVar;
                    }
                    Function1 function1 = (Function1) ((KFunction) O11);
                    boolean i9 = av8Var2.i(teamAchievementsView);
                    Object O12 = av8Var2.O();
                    if (i9 || O12 == a99Var) {
                        fl8 fl8Var = new fl8(0, teamAchievementsView, TeamAchievementsView.class, "showTrophyComparison", "showTrophyComparison()V", 0, 25);
                        av8Var2.n0(fl8Var);
                        O12 = fl8Var;
                    }
                    gvd.p(guiVar, function1, (Function0) ((KFunction) O12), l98.c0(utcVar, 8.0f, 4.0f), av8Var2, 3072);
                } else {
                    av8Var2.W();
                }
                break;
            case 15:
                mxi mxiVar = (mxi) obj4;
                TeamInfoView teamInfoView = (TeamInfoView) obj3;
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i10 = TeamInfoView.l;
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    boolean i11 = av8Var3.i(teamInfoView);
                    Object O13 = av8Var3.O();
                    if (i11 || O13 == a99Var) {
                        chf chfVar2 = new chf(1, teamInfoView, TeamInfoView.class, "onAction", "onAction(Lcom/sofascore/results/team/details/view/TeamInfoAction;)V", 0, 19);
                        av8Var3.n0(chfVar2);
                        O13 = chfVar2;
                    }
                    sea.f(mxiVar, (Function1) ((KFunction) O13), l98.c0(utcVar, 8.0f, 4.0f), av8Var3, 384);
                } else {
                    av8Var3.W();
                }
                break;
            case 16:
                xxi xxiVar = (xxi) obj4;
                Function1 function12 = (Function1) obj3;
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Integer) obj2).intValue();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    xtc d = bkh.d(utcVar, 1.0f);
                    TeamOfTheWeekFieldUIData teamOfTheWeekFieldUIData = xxiVar.h;
                    String str = teamOfTheWeekFieldUIData.a;
                    String str2 = teamOfTheWeekFieldUIData.a;
                    if (Intrinsics.c(str, Sports.FOOTBALL)) {
                        d = d.z(bkh.e(utcVar, 422.0f));
                    }
                    if (Intrinsics.c(str2, Sports.BASKETBALL)) {
                        d = d.z(qx9.p(utcVar, 1.089f));
                    }
                    k1c c = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var4.T);
                    aee m = av8Var4.m();
                    xtc C = fqj.C(av8Var4, d);
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
                    boolean c2 = Intrinsics.c(str2, Sports.FOOTBALL);
                    n12 n12Var = n12.a;
                    if (c2) {
                        av8Var4.d0(-1198214945);
                        wnn.o(n12Var.b(utcVar), false, lz.D(R.color.surface_1, av8Var4), false, false, av8Var4, 48, 24);
                        av8Var4.s(false);
                    } else if (Intrinsics.c(str2, Sports.BASKETBALL)) {
                        av8Var4.d0(-1198206595);
                        ktm.b(0, av8Var4);
                        av8Var4.s(false);
                    } else {
                        av8Var4.d0(1510354758);
                        av8Var4.s(false);
                    }
                    wnn.d(xxiVar.h, n12Var.b(utcVar), null, "totr_field_formation", yqo.H(-831605720, av8Var4, new y47(i2, function12)), av8Var4, 27648, 4);
                    if (xxiVar.l) {
                        av8Var4.d0(1510848061);
                        ncf.a(bkh.l(n12Var.a(utcVar, uxf.g), 32.0f), lz.D(R.color.n_lv_1, av8Var4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var4, 0, 60);
                        av8Var4.s(false);
                    } else {
                        av8Var4.d0(1511133478);
                        av8Var4.s(false);
                    }
                    av8Var4.s(true);
                } else {
                    av8Var4.W();
                }
                break;
            case 17:
                gv9 gv9Var = (gv9) obj4;
                TeamRecentFormView teamRecentFormView = (TeamRecentFormView) obj3;
                of3 of3Var5 = (of3) obj;
                int intValue5 = ((Integer) obj2).intValue();
                int i12 = TeamRecentFormView.l;
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    boolean i13 = av8Var5.i(teamRecentFormView);
                    Object O14 = av8Var5.O();
                    if (i13 || O14 == a99Var) {
                        O14 = new g2i(teamRecentFormView, i2);
                        av8Var5.n0(O14);
                    }
                    b0a.u(384, av8Var5, gv9Var, l98.c0(utcVar, 8.0f, 4.0f), (Function1) O14);
                } else {
                    av8Var5.W();
                }
                break;
            case 18:
                ((Integer) obj2).getClass();
                d2a.f((a2j) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                x2a.m((g2j) obj4, (n52) obj3, (of3) obj, aba.K(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                y6a.l((i4j) obj4, (xtc) obj3, (of3) obj, aba.K(49));
                break;
            case 21:
                ((Integer) obj2).getClass();
                y6a.a((d4j) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                y6a.c((Boolean) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                ((tla) obj4).d((Drawable) obj3, (of3) obj, aba.K(49));
                break;
            case 24:
                tbj tbjVar = (tbj) obj4;
                ku3 ku3Var = (ku3) obj3;
                d8j d8jVar = (d8j) obj;
                Context context2 = (Context) obj2;
                boolean h = tbjVar.h();
                q80 k = tbjVar.k();
                String str3 = k != null ? k.b : null;
                pej pejVar2 = tbjVar.v;
                if (pejVar2 != null) {
                    long j = pejVar2.a;
                    nnd nndVar = tbjVar.b;
                    pejVar = new pej(t6a.g(nndVar.v((int) (j >> 32)), nndVar.v((int) (j & 4294967295L))));
                } else {
                    pejVar = null;
                }
                lje.a(d8jVar, context2, h, str3, pejVar, tbjVar.i, new vsc(tbjVar, ku3Var, context2));
                break;
            case 25:
                lcj lcjVar = (lcj) obj4;
                Context context3 = (Context) obj2;
                boolean m2 = lcjVar.m();
                jwj jwjVar = lcjVar.a;
                lje.a((d8j) obj, context3, m2, jwjVar.d().c, new pej(jwjVar.d().d), lcjVar.g, new ncj(false ? 1 : 0, lcjVar, (ku3) obj3, context3));
                break;
            case 26:
                ((Integer) obj2).getClass();
                vdj.a((dfj) obj4, (tc3) obj3, (of3) obj, aba.K(49));
                break;
            case 27:
                tc3 tc3Var = (tc3) obj4;
                dsf dsfVar = (dsf) obj3;
                of3 of3Var6 = (of3) obj;
                int intValue6 = ((Integer) obj2).intValue();
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(intValue6 & 1, (intValue6 & 3) != 2)) {
                    tc3Var.invoke(new pt9(dsfVar, i3), av8Var6, 0);
                } else {
                    av8Var6.W();
                }
                break;
            case 28:
                tc3 tc3Var2 = (tc3) obj4;
                Function1 function13 = (Function1) obj3;
                of3 of3Var7 = (of3) obj;
                int intValue7 = ((Integer) obj2).intValue();
                av8 av8Var7 = (av8) of3Var7;
                if (av8Var7.T(intValue7 & 1, (intValue7 & 3) != 2)) {
                    tc3Var2.invoke(function13, av8Var7, 0);
                } else {
                    av8Var7.W();
                }
                break;
            default:
                String str4 = (String) obj4;
                Function1 function14 = (Function1) obj3;
                of3 of3Var8 = (of3) obj;
                int intValue8 = ((Integer) obj2).intValue();
                av8 av8Var8 = (av8) of3Var8;
                if (!av8Var8.T(intValue8 & 1, (intValue8 & 3) != 2)) {
                    av8Var8.W();
                } else if (str4.length() > 0) {
                    av8Var8.d0(-643151720);
                    ImageVector N = s6a.N(R.drawable.ic_close, 6, av8Var8);
                    long D2 = lz.D(R.color.n_lv_1, av8Var8);
                    xtc l = bkh.l(utcVar, 24.0f);
                    boolean g = av8Var8.g(function14);
                    Object O15 = av8Var8.O();
                    if (g || O15 == a99Var) {
                        O15 = new b4j(1, function14);
                        av8Var8.n0(O15);
                    }
                    kq9.b(N, null, tol.y(l, false, false, false, 0L, null, (Function0) O15, av8Var8, 29), D2, av8Var8, 48, 0);
                    av8Var8.s(false);
                } else {
                    av8Var8.d0(-642757152);
                    av8Var8.s(false);
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ s5h(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ s5h(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
