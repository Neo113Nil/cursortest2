package defpackage;

import android.content.Context;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.weekly.FantasyEliteFaceoffRevealDialog;
import com.sofascore.results.team.statistics.TeamSeasonStatisticsFragment;
import com.sofascore.results.wc26.widget.LaunchChangeTeamAction;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class sj implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sj(int i, Object obj, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        int i2 = 8;
        int i3 = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ksa ksaVar = (ksa) obj4;
                uj ujVar = (uj) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ujVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(ujVar) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    xtc d0 = l98.d0(bkh.c, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                    t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 5);
                    boolean e = av8Var.e(i3) | ((intValue & 14) == 4);
                    Object O = av8Var.O();
                    if (e || O == nf3.a) {
                        O = new tj(ujVar, i3, r13 ? 1 : 0);
                        av8Var.n0(O);
                    }
                    v8a.a(d0, ksaVar, C, ng0Var, null, null, false, null, (Function1) O, av8Var, 24966, 488);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 1:
                cj cjVar = (cj) obj4;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    o3a.d(this.b, Boolean.valueOf(cjVar.h), null, av8Var2, 0, 4);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 2:
                uj ujVar2 = (uj) obj4;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    o3a.d(this.b, ujVar2.b.e, null, av8Var3, 0, 4);
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 3:
                fm8 fm8Var = (fm8) obj4;
                v23 v23Var = (v23) obj;
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                v23Var.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((av8) of3Var4).g(v23Var) ? 4 : 2;
                }
                av8 av8Var4 = (av8) of3Var4;
                if (!av8Var4.T(intValue4 & 1, (intValue4 & 19) != 18)) {
                    av8Var4.W();
                } else if (fm8Var instanceof fvc) {
                    av8Var4.d0(-863021450);
                    yqo.m(v23Var, (fvc) fm8Var, av8Var4, (intValue4 & 14) | ((i3 & 8) << 3));
                    av8Var4.s(false);
                } else if (fm8Var instanceof nmj) {
                    av8Var4.d0(-863019123);
                    pco.t(v23Var, (nmj) fm8Var, av8Var4, (intValue4 & 14) | ((i3 & 8) << 3));
                    av8Var4.s(false);
                } else if (fm8Var instanceof omj) {
                    av8Var4.d0(-863016818);
                    k53.T(v23Var, (omj) fm8Var, av8Var4, (intValue4 & 14) | ((i3 & 8) << 3));
                    av8Var4.s(false);
                } else if (fm8Var instanceof dlj) {
                    av8Var4.d0(-863014899);
                    wnn.u(v23Var, (dlj) fm8Var, av8Var4, (intValue4 & 14) | ((i3 & 8) << 3));
                    av8Var4.s(false);
                } else if (fm8Var instanceof elj) {
                    av8Var4.d0(-863012978);
                    fcp.a0(v23Var, (elj) fm8Var, av8Var4, (intValue4 & 14) | ((i3 & 8) << 3));
                    av8Var4.s(false);
                } else if (fm8Var instanceof ooj) {
                    av8Var4.d0(-863011059);
                    rfo.p(v23Var, (ooj) fm8Var, av8Var4, (intValue4 & 14) | ((i3 & 8) << 3));
                    av8Var4.s(false);
                } else if (fm8Var instanceof ylj) {
                    av8Var4.d0(-863009138);
                    n4o.s(v23Var, (ylj) fm8Var, av8Var4, (intValue4 & 14) | ((i3 & 8) << 3));
                    av8Var4.s(false);
                } else if (fm8Var instanceof gmj) {
                    av8Var4.d0(-863007153);
                    c6o.u(v23Var, (gmj) fm8Var, av8Var4, (intValue4 & 14) | ((i3 & 8) << 3));
                    av8Var4.s(false);
                } else if (fm8Var instanceof v8b) {
                    av8Var4.d0(-863005076);
                    u6h.r(v23Var, (v8b) fm8Var, av8Var4, (intValue4 & 14) | ((i3 & 8) << 3));
                    av8Var4.s(false);
                } else if (fm8Var instanceof nqj) {
                    av8Var4.d0(-863003093);
                    yqo.r(v23Var, (nqj) fm8Var, av8Var4, (intValue4 & 14) | ((i3 & 8) << 3));
                    av8Var4.s(false);
                } else if (fm8Var instanceof i4f) {
                    av8Var4.d0(-863000871);
                    fkf.o(v23Var, (i4f) fm8Var, av8Var4, (intValue4 & 14) | ((i3 & 8) << 3));
                    av8Var4.s(false);
                } else if (fm8Var instanceof tkh) {
                    av8Var4.d0(-862998319);
                    s02.A(v23Var, (tkh) fm8Var, av8Var4, (intValue4 & 14) | ((i3 & 8) << 3));
                    av8Var4.s(false);
                } else if (fm8Var instanceof mmi) {
                    av8Var4.d0(-862996208);
                    ww9.r(v23Var, (mmi) fm8Var, av8Var4, (intValue4 & 14) | ((i3 & 8) << 3));
                    av8Var4.s(false);
                } else {
                    if (!(fm8Var instanceof pmi)) {
                        av8Var4.d0(-982957057);
                        av8Var4.s(false);
                        is8.c(fm8Var, "Unsupported shared card type: ");
                        return null;
                    }
                    av8Var4.d0(-862994063);
                    lz.m(v23Var, (pmi) fm8Var, av8Var4, (intValue4 & 14) | ((i3 & 8) << 3));
                    av8Var4.s(false);
                }
                return Unit.a;
            case 4:
                FantasyEliteFaceoffRevealDialog fantasyEliteFaceoffRevealDialog = (FantasyEliteFaceoffRevealDialog) obj4;
                of3 of3Var5 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 17) != 16)) {
                    uj5 uj5Var = (uj5) fantasyEliteFaceoffRevealDialog.v().k().a.get(i3);
                    boolean z = uj5Var instanceof sj5;
                    utc utcVar = utc.a;
                    if (z) {
                        av8Var5.d0(461287774);
                        sj5 sj5Var = (sj5) uj5Var;
                        yqo.i(sj5Var.a, sj5Var.b, sj5Var.c, sj5Var.d, l98.c0(utcVar, 16.0f, 4.0f), av8Var5, 24576);
                        av8Var5.s(false);
                    } else {
                        if (!(uj5Var instanceof tj5)) {
                            throw dmi.h(av8Var5, 1400348125, false);
                        }
                        av8Var5.d0(462046902);
                        tj5 tj5Var = (tj5) uj5Var;
                        yso.i(tj5Var.b, 384, av8Var5, l98.c0(utcVar, 16.0f, 4.0f), tj5Var.a);
                        av8Var5.s(false);
                    }
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            case 5:
                TeamSeasonStatisticsFragment teamSeasonStatisticsFragment = (TeamSeasonStatisticsFragment) obj4;
                of3 of3Var6 = (of3) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((n8g) obj).getClass();
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(intValue6 & 1, (intValue6 & 17) != 16)) {
                    teamSeasonStatisticsFragment.C(i3, 0, av8Var6);
                } else {
                    av8Var6.W();
                }
                return Unit.a;
            default:
                Context context = (Context) obj4;
                of3 of3Var7 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((o8g) obj).getClass();
                c5n.n(new v20(R.drawable.ic_world_cup_trophy), nq8.K(16.0f), 0, null, of3Var7, 48, 24);
                vy8 vy8Var = ty8.a;
                aba.i(nq8.N(vy8Var, 8.0f), of3Var7, 0);
                String string = context.getString(R.string.fifa_world_cup_2026);
                string.getClass();
                yf8 yf8Var = xth.a;
                o3a.i(string, null, l98.j0(xth.b(), Integer.valueOf(R.color.on_color_secondary), of3Var7), 1, of3Var7, 3072, 2);
                aba.i(o8g.a(), of3Var7, 0);
                if (i3 != 0) {
                    vy8Var = j72.x(vy8Var, new x9g(LaunchChangeTeamAction.class, zm2.A((lc[]) Arrays.copyOf(new lc[]{new lc(fz8.o, Integer.valueOf(i3))}, 1))));
                }
                nq8.g(h5a.N(vy8Var, 4.0f), 0, 0, yqo.H(728656855, of3Var7, new tu5(context, i2)), of3Var7, 3072, 6);
                return Unit.a;
        }
    }

    public /* synthetic */ sj(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
