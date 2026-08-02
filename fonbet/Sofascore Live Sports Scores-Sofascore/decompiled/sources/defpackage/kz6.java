package defpackage;

import android.content.Context;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.teammanagement.transfers.selectreplacement.FantasyTransfersSelectReplacementDialogFragment;
import com.sofascore.results.fantasy.ui.components.FantasyLeaderboardStatistic;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerMissingData;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class kz6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kz6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 4;
        utc utcVar = utc.a;
        a99 a99Var = nf3.a;
        int i3 = 1;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ao2.j((FantasyPlayerMissingData) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ktm.h((f27) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                pco.j((FantasyLeaderboardStatistic) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                hkg.m((j67) obj4, (xtc) obj3, (of3) obj, aba.K(49));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ktm.k((d47) obj4, (j37) obj3, (of3) obj, aba.K(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                zm2.c((e57) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                c5n.g((r57) obj4, (j37) obj3, (of3) obj, aba.K(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                c5n.f((j67) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                break;
            case 8:
                e67 e67Var = (e67) obj4;
                Function1 function1 = (Function1) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    String str = e67Var.c;
                    boolean g = av8Var.g(function1);
                    Object O = av8Var.O();
                    if (g || O == a99Var) {
                        O = new k46(13, function1);
                        av8Var.n0(O);
                    }
                    Function1 function12 = (Function1) O;
                    boolean g2 = av8Var.g(function1);
                    Object O2 = av8Var.O();
                    if (g2 || O2 == a99Var) {
                        O2 = new rt6(20, function1);
                        av8Var.n0(O2);
                    }
                    oea.e(str, function12, (Function0) O2, null, null, s6a.N(R.drawable.ic_close, 6, av8Var), av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                gz8.g((yc7) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                z8e.a((zd7) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                l6g.m((yd7) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                v9g.j((FantasyPlayerUiModel) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                wkn.i((List) obj4, (xtc) obj3, (of3) obj, aba.K(49));
                break;
            case 14:
                ((Integer) obj2).getClass();
                oyn.i((gf7) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                break;
            case 15:
                ksa ksaVar = (ksa) obj4;
                ll7 ll7Var = (ll7) obj3;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    xtc f0 = l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    t3e B = l98.B(8.0f, 2);
                    ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                    boolean g3 = av8Var2.g(ll7Var);
                    Object O3 = av8Var2.O();
                    if (g3 || O3 == a99Var) {
                        O3 = new x16(ll7Var, 23);
                        av8Var2.n0(O3);
                    }
                    v8a.c(f0, ksaVar, B, ng0Var, null, null, false, null, (Function1) O3, av8Var2, 24966, 488);
                } else {
                    av8Var2.W();
                }
                break;
            case 16:
                ll7 ll7Var2 = (ll7) obj4;
                Function1 function13 = (Function1) obj3;
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    xtc d = bkh.d(utcVar, 1.0f);
                    Boolean valueOf = Boolean.valueOf(ll7Var2.g || ll7Var2.f);
                    Object O4 = av8Var3.O();
                    if (O4 == a99Var) {
                        O4 = new gl7(i3);
                        av8Var3.n0(O4);
                    }
                    l98.b(valueOf, d, (Function1) O4, null, null, null, yqo.H(-1769912942, av8Var3, new rsh(i2, ll7Var2, function13)), av8Var3, 1573296, 56);
                } else {
                    av8Var3.W();
                }
                break;
            case 17:
                ((Integer) obj2).getClass();
                n9e.i((rm7) obj4, (ksa) obj3, (of3) obj, aba.K(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                n9e.k((qm7) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                n9e.j((tm7) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                break;
            case 20:
                e1d e1dVar = (e1d) obj4;
                ao7 ao7Var = (ao7) obj3;
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Integer) obj2).intValue();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    vl7 vl7Var = ((vn7) e1dVar.getValue()).n;
                    if (vl7Var == null) {
                        av8Var4.d0(-981237341);
                        av8Var4.s(false);
                    } else {
                        av8Var4.d0(-981237340);
                        boolean i4 = av8Var4.i(ao7Var);
                        Object O5 = av8Var4.O();
                        if (i4 || O5 == a99Var) {
                            O5 = new sn7(ao7Var, 1);
                            av8Var4.n0(O5);
                        }
                        Function0 function0 = (Function0) O5;
                        boolean i5 = av8Var4.i(ao7Var);
                        Object O6 = av8Var4.O();
                        if (i5 || O6 == a99Var) {
                            O6 = new hl7(ao7Var, 5);
                            av8Var4.n0(O6);
                        }
                        iz8.j(vl7Var, function0, (Function2) O6, false, false, av8Var4, 0, 24);
                        av8Var4.s(false);
                    }
                } else {
                    av8Var4.W();
                }
                break;
            case 21:
                FantasyTransfersSelectReplacementDialogFragment fantasyTransfersSelectReplacementDialogFragment = (FantasyTransfersSelectReplacementDialogFragment) obj4;
                cdi cdiVar = (cdi) obj3;
                of3 of3Var5 = (of3) obj;
                int intValue5 = ((Integer) obj2).intValue();
                av8 av8Var5 = (av8) of3Var5;
                if (!av8Var5.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    av8Var5.W();
                } else if (fantasyTransfersSelectReplacementDialogFragment.w().g.d == FantasyCompetitionType.SEASON) {
                    av8Var5.d0(-1364871914);
                    o1j.m(((vn7) cdiVar.getValue()).c, Integer.valueOf(((vn7) cdiVar.getValue()).d), null, av8Var5, 0);
                    av8Var5.s(false);
                } else {
                    av8Var5.d0(-1364633586);
                    av8Var5.s(false);
                }
                break;
            case 22:
                ((Integer) obj2).getClass();
                ktm.q((o68) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                c5n.j((tx6) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                u6h.z((q80) obj4, (xtc) obj3, (of3) obj, aba.K(49));
                break;
            case 25:
                qn2 qn2Var = (qn2) obj4;
                mlh mlhVar = (mlh) obj3;
                int intValue6 = ((Integer) obj).intValue();
                if (obj2 instanceof qe3) {
                    ((i1d) qn2Var.f).b((qe3) obj2);
                } else if (!(obj2 instanceof e4g)) {
                    if (obj2 instanceof ev8) {
                        dy0.D(mlhVar, intValue6, obj2);
                        qn2Var.i((ev8) obj2);
                    } else if (obj2 instanceof eqf) {
                        dy0.D(mlhVar, intValue6, obj2);
                        ((eqf) obj2).c();
                    }
                }
                break;
            case 26:
                na9 na9Var = (na9) obj4;
                ua9 ua9Var = (ua9) obj3;
                of3 of3Var6 = (of3) obj;
                int intValue7 = ((Integer) obj2).intValue();
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Context context = (Context) av8Var6.k(nz.b);
                    xtc w = kda.w(utcVar);
                    String str2 = na9Var.o;
                    boolean z = na9Var.m;
                    boolean i6 = av8Var6.i(na9Var) | av8Var6.i(context);
                    Object O7 = av8Var6.O();
                    if (i6 || O7 == a99Var) {
                        O7 = new uf8(i2, na9Var, context);
                        av8Var6.n0(O7);
                    }
                    fcp.T(ua9Var, str2, z, (Function1) O7, w, av8Var6, 0);
                } else {
                    av8Var6.W();
                }
                break;
            case 27:
                sxa sxaVar = (sxa) obj4;
                nb9 nb9Var = (nb9) obj3;
                of3 of3Var7 = (of3) obj;
                int intValue8 = ((Integer) obj2).intValue();
                av8 av8Var7 = (av8) of3Var7;
                if (av8Var7.T(intValue8 & 1, (intValue8 & 3) != 2)) {
                    xtc c0 = l98.c0(utcVar, 8.0f, 4.0f);
                    hrh hrhVar = hrh.m;
                    boolean i7 = av8Var7.i(nb9Var);
                    Object O8 = av8Var7.O();
                    if (i7 || O8 == a99Var) {
                        O8 = new yx7(nb9Var, 18);
                        av8Var7.n0(O8);
                    }
                    q5a.c(sxaVar, (Function1) O8, c0, hrhVar, true, null, null, av8Var7, 28032, 96);
                } else {
                    av8Var7.W();
                }
                break;
            case 28:
                ((Integer) obj2).getClass();
                dy0.l((le9) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            default:
                ((Integer) obj2).getClass();
                fz8.q((qp9) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ kz6(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
