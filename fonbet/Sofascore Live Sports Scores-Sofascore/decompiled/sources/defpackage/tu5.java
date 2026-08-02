package defpackage;

import android.content.Context;
import android.view.View;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.profile.PlayerSubscription;
import com.sofascore.model.profile.TeamSubscription;
import com.sofascore.model.profile.UniqueTournamentSubscription;
import com.sofascore.results.R;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.mma.fighter.MmaFighterActivity;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.sofaSeason.SofaSeasonActivity;
import com.sofascore.results.team.TeamActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class tu5 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ tu5(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        utc utcVar = utc.a;
        ty8 ty8Var = ty8.a;
        Context context = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                str.getClass();
                str2.getClass();
                un0.J(context, str, str2, booleanValue);
                break;
            case 1:
                wt3.y((Integer) obj2, (View) obj, obj3);
                if (obj3 instanceof UniqueTournamentSubscription) {
                    a99.A(LeagueActivity.h0, this.b, Integer.valueOf(((UniqueTournamentSubscription) obj3).getId()), 0, null, null, null, null, 4088);
                }
                break;
            case 2:
                wt3.y((Integer) obj2, (View) obj, obj3);
                if (obj3 instanceof TeamSubscription) {
                    int i2 = TeamActivity.Z;
                    jle.r(this.b, ((TeamSubscription) obj3).getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                }
                break;
            case 3:
                wt3.y((Integer) obj2, (View) obj, obj3);
                boolean z = obj3 instanceof PlayerSubscription;
                Context context2 = this.b;
                if (z) {
                    int i3 = PlayerActivity.Z;
                    jle.q(context2, ((PlayerSubscription) obj3).getId(), 0, null, null, false, null, null, 472);
                } else if (obj3 instanceof TeamSubscription) {
                    Set set = wyh.a;
                    TeamSubscription teamSubscription = (TeamSubscription) obj3;
                    Sport sport = teamSubscription.getSport();
                    if (wyh.m(sport != null ? sport.getSlug() : null)) {
                        joa joaVar = l5i.a;
                        l5i.k(context2, teamSubscription.getType(), teamSubscription.getId());
                    } else {
                        Sport sport2 = teamSubscription.getSport();
                        if (Intrinsics.c(sport2 != null ? sport2.getSlug() : null, Sports.MMA)) {
                            int i4 = MmaFighterActivity.U;
                            f7a.x(teamSubscription.getId(), context2);
                        } else {
                            int i5 = TeamActivity.Z;
                            jle.r(context2, teamSubscription.getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        }
                    }
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                ub9 ub9Var = (ub9) obj3;
                ((View) obj).getClass();
                ub9Var.getClass();
                sb9 sb9Var = (sb9) ub9Var;
                a99.A(LeagueActivity.h0, this.b, Integer.valueOf(sb9Var.b), null, Integer.valueOf(sb9Var.c.getId()), null, null, null, 4080);
                break;
            case 5:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    xtc f0 = l98.f0(n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_1, av8Var), o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 3)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5);
                    k1c c = e12.c(uxf.g, false);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, f0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, c, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    String v = oea.v(R.string.see_all, av8Var);
                    boolean i6 = av8Var.i(context);
                    Object O = av8Var.O();
                    if (i6 || O == nf3.a) {
                        O = new nzd(context, 29);
                        av8Var.n0(O);
                    }
                    mha.h(v, (Function0) O, null, tqh.a, null, false, false, false, 0L, 0, 0, av8Var, 3072, 0, 2036);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                break;
            case 6:
                tfi tfiVar = (tfi) obj;
                long longValue = ((Long) obj2).longValue();
                int intValue2 = ((Integer) obj3).intValue();
                int i7 = SofaSeasonActivity.L;
                tfiVar.getClass();
                String a = tfiVar.a();
                String valueOf = String.valueOf(intValue2 + 1);
                context.getClass();
                a.getClass();
                valueOf.getClass();
                FirebaseBundle firebaseBundle = new FirebaseBundle();
                firebaseBundle.putString("category", a);
                firebaseBundle.putString("position", valueOf);
                firebaseBundle.putLong("timeOnScreen", longValue);
                ia0 ia0Var = ia0.q;
                me4.d((f5d) me4.e(), "season_card_impression", firebaseBundle, context).a.e(n9e.K(firebaseBundle), null, "season_card_impression", false);
                break;
            case 7:
                of3 of3Var2 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    xtc c0 = l98.c0(n9e.q(bkh.d(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 1.0f), r13.d, o7g.a(8.0f)), 16.0f, 8.0f);
                    String i8 = rld.i(context);
                    yf8 yf8Var = xth.a;
                    udj.c(i8, c0, r13.b, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.g(), av8Var2, 384, 0, 130040);
                } else {
                    av8Var2.W();
                }
                break;
            case 8:
                of3 of3Var3 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((o8g) obj).getClass();
                c5n.n(new v20(R.drawable.ic_swap_16), nq8.K(16.0f), 0, new t13(new fjj(new h1g(R.color.on_color_primary))), of3Var3, 32816, 8);
                aba.i(nq8.N(ty8Var, 2.0f), of3Var3, 0);
                String string = context.getString(R.string.change_team);
                string.getClass();
                yf8 yf8Var2 = xth.a;
                o3a.i(string, null, l98.j0(xth.b(), Integer.valueOf(R.color.on_color_primary), of3Var3), 0, of3Var3, 0, 10);
                break;
            default:
                of3 of3Var4 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((o8g) obj).getClass();
                v20 v20Var = new v20(R.drawable.ic_sofascore_logomark);
                vy8 t = c5n.t(h5a.N(nq8.K(24.0f), 4.0f), new al4(hkg.d(4281814517L), hkg.d(4281814517L)));
                long j = r13.d;
                c5n.n(v20Var, t, 0, new t13(new fjj(new al4(j, j))), of3Var4, 32816, 8);
                aba.i(nq8.N(ty8Var, 8.0f), of3Var4, 0);
                String string2 = context.getString(R.string.search_in_sofascore);
                string2.getClass();
                yf8 yf8Var3 = xth.a;
                o3a.i(string2, null, l98.j0(xth.b(), Integer.valueOf(R.color.on_color_secondary), of3Var4), 1, of3Var4, 3072, 2);
                break;
        }
        return Unit.a;
    }
}
