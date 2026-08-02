package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.transfers.PlayerTransfersActivity;
import com.unity3d.services.UnityAdsConstants;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ef8 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ef8(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Pair pair;
        int i;
        boolean z;
        int i2 = this.a;
        int i3 = 14;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i2) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Number) obj3).intValue();
                Context context = (Context) obj4;
                ((v23) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    boolean i4 = av8Var.i(obj5) | av8Var.i(context);
                    Object O = av8Var.O();
                    a99 a99Var = nf3.a;
                    if (i4 || O == a99Var) {
                        O = new pi(i3, obj5, context);
                        av8Var.n0(O);
                    }
                    utc utcVar = utc.a;
                    xtc b0 = l98.b0(tol.y(utcVar, false, false, false, 0L, null, (Function0) O, av8Var, 31), 8.0f);
                    u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, b0);
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
                    boolean z2 = obj5 instanceof Player;
                    if (z2) {
                        Player player = (Player) obj5;
                        pair = new Pair(player.getSportSlug(), tba.t(player));
                    } else if (obj5 instanceof Team) {
                        Team team = (Team) obj5;
                        String sportSlug = team.getSportSlug();
                        context.getClass();
                        String p = tba.p(context, team);
                        if (qea.y(team) && team.getSport() != null) {
                            Set set = wyh.a;
                            if (!wyh.e(team.getSportSlug())) {
                                p = wv8.i(p, " ", context.getString(R.string.female_team));
                            }
                        }
                        pair = new Pair(sportSlug, p);
                    } else if (obj5 instanceof UniqueTournament) {
                        UniqueTournament uniqueTournament = (UniqueTournament) obj5;
                        pair = new Pair(uniqueTournament.getSportSlug(), tba.x(uniqueTournament));
                    } else {
                        pair = new Pair("", "");
                    }
                    String str = (String) pair.a;
                    String str2 = (String) pair.b;
                    xtc d = bkh.d(utcVar, 1.0f);
                    l8g a2 = k8g.a(ww9.h, uxf.l, av8Var, 6);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, d);
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
                    kq9.b(s6a.N(wyh.a(str), 6, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.neutral_default, av8Var), av8Var, 432, 0);
                    av8 av8Var2 = av8Var;
                    if (z2) {
                        av8Var2.d0(1207733105);
                        td4.C(((Player) obj5).getId(), bkh.l(utcVar, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 48, 12);
                        av8Var2 = av8Var2;
                        i = 0;
                        av8Var2.s(false);
                    } else if (obj5 instanceof Team) {
                        av8Var2.d0(1207736206);
                        td4.G(((Team) obj5).getId(), bkh.l(utcVar, 40.0f), false, 0L, av8Var2, 48, 12);
                        av8Var2 = av8Var2;
                        i = 0;
                        av8Var2.s(false);
                    } else if (obj5 instanceof UniqueTournament) {
                        av8Var2.d0(1207739600);
                        td4.y(((UniqueTournament) obj5).getId(), 48, 12, av8Var2, bkh.l(utcVar, 40.0f), null, false);
                        i = 0;
                        av8Var2.s(false);
                    } else {
                        i = 0;
                        av8Var2.d0(-1214698330);
                        av8Var2.s(false);
                    }
                    boolean i5 = av8Var2.i(obj5);
                    Object O2 = av8Var2.O();
                    if (i5 || O2 == a99Var) {
                        O2 = new df8(obj5, i);
                        av8Var2.n0(O2);
                    }
                    Function1 function1 = (Function1) O2;
                    boolean i6 = av8Var2.i(obj5);
                    Object O3 = av8Var2.O();
                    if (i6 || O3 == a99Var) {
                        z = true;
                        O3 = new df8(obj5, 1);
                        av8Var2.n0(O3);
                    } else {
                        z = true;
                    }
                    td4.a(function1, null, (Function1) O3, av8Var2, 0, 2);
                    av8Var2.s(z);
                    xtc f0 = l98.f0(new goa(1.0f, z), 8.0f, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                    k1c c = e12.c(uxf.c, false);
                    int hashCode3 = Long.hashCode(av8Var2.T);
                    aee m3 = av8Var2.m();
                    xtc C3 = fqj.C(av8Var2, f0);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, c, f50Var);
                    waa.K(av8Var2, m3, ff3Var);
                    bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
                    waa.K(av8Var2, C3, f50Var3);
                    xtc a3 = n12.a.a(bkh.d(utcVar, 1.0f), uxf.g);
                    String str3 = str2 == null ? "" : str2;
                    yf8 yf8Var = xth.a;
                    av8 av8Var3 = av8Var2;
                    udj.c(str3, a3, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 2, 0, null, xth.k(), av8Var3, 0, 24960, 109560);
                    av8Var3.s(true);
                    av8Var3.s(true);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                long j = ((r13) obj).a;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).f(j) ? 4 : 2;
                }
                av8 av8Var4 = (av8) of3Var2;
                if (av8Var4.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    int i7 = PlayerTransfersActivity.R;
                    ((PlayerTransfersActivity) obj5).M(j, ((ovj) obj4).a, av8Var4, intValue2 & 14);
                } else {
                    av8Var4.W();
                }
                break;
            default:
                long j2 = ((r13) obj).a;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Number) obj3).intValue();
                av8 av8Var5 = (av8) of3Var3;
                if (av8Var5.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    kq9.b(s6a.N(((jki) obj5).b.intValue(), 6, av8Var5), null, bkh.l(utc.a, 16.0f), ((jki) ((e1d) obj4).getValue()) == jki.c ? ljg.f(av8Var5, -34319023, R.color.surface_1, av8Var5, false) : ljg.f(av8Var5, -34318419, R.color.n_lv_1, av8Var5, false), av8Var5, 432, 0);
                } else {
                    av8Var5.W();
                }
                break;
        }
        return Unit.a;
    }
}
