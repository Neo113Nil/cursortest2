package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.V2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandingFantasyCompetition;
import com.sofascore.model.SeasonSpinnerData;
import com.sofascore.model.Sports;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.profile.InvitedUser;
import com.sofascore.model.profile.ReferralResponse;
import com.sofascore.results.R;
import com.sofascore.results.event.odds.model.OddsEventUIModel;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.onboarding.OnboardingViewModel;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class er6 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ er6(rse rseVar, Function0 function0, qug qugVar, ksa ksaVar) {
        this.a = 17;
        this.c = rseVar;
        this.b = function0;
        this.e = qugVar;
        this.d = ksaVar;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        OddsEventUIModel oddsEventUIModel = (OddsEventUIModel) this.c;
        fgf fgfVar = (fgf) this.b;
        old oldVar = (old) this.d;
        vmd vmdVar = (vmd) this.e;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((v23) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            nld.d(oddsEventUIModel.a, oddsEventUIModel.b, oddsEventUIModel.c, oldVar, fgfVar, vmdVar, "additional", null, 0L, false, cgf.c, false, false, null, fgfVar.g, av8Var, 1572864, 6, 15232);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        gv9<fgf> gv9Var = (gv9) this.c;
        OddsEventUIModel oddsEventUIModel = (OddsEventUIModel) this.b;
        old oldVar = (old) this.d;
        vmd vmdVar = (vmd) this.e;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((v23) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            for (fgf fgfVar : gv9Var) {
                nld.d(oddsEventUIModel.a, oddsEventUIModel.b, oddsEventUIModel.c, oldVar, fgfVar, vmdVar, "additional", null, 0L, false, cgf.c, false, false, null, fgfVar.g, av8Var, 1572864, 6, 15232);
            }
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        Function2 function2 = (Function2) this.c;
        iq3 iq3Var = (iq3) this.b;
        ct8 ct8Var = (ct8) this.d;
        Function0 function0 = (Function0) this.e;
        gq3 gq3Var = (gq3) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(gq3Var) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            String str = (String) function2.invoke(av8Var, 0);
            if (StringsKt.R(str)) {
                u3a.c("Label must not be blank");
            }
            iq3Var.getClass();
            lz.c.invoke(utc.a, str, Boolean.TRUE, gq3Var, ct8Var, function0, av8Var, Integer.valueOf((intValue << 9) & 7168));
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        svb svbVar = (svb) this.c;
        ((Integer) obj3).getClass();
        ((r70) obj).getClass();
        rd0.c(svbVar.b, svbVar.c, (Function1) this.b, (Function1) this.d, (Function0) this.e, null, (of3) obj2, 0);
        return Unit.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        fci fciVar = (fci) this.c;
        Function1 function1 = (Function1) this.b;
        Function1 function12 = (Function1) this.d;
        Function0 function0 = (Function0) this.e;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((xpa) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            nq8.h(av8Var, bkh.e(utc.a, 8.0f));
            o02.i(fciVar, function1, function12, function0, av8Var, 0);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        String str;
        boolean z;
        String str2;
        q80 h;
        kx4 kx4Var;
        float f;
        xtc z2;
        boolean z3;
        BrandingFantasyCompetition brandingFantasyCompetition;
        Function1 function1 = (Function1) this.b;
        ra7 ra7Var = (ra7) this.c;
        Function1 function12 = (Function1) this.d;
        pb7 pb7Var = (pb7) this.e;
        uj7 uj7Var = (uj7) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        uj7Var.getClass();
        int i = 2;
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).e(uj7Var.ordinal()) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            int ordinal = uj7Var.ordinal();
            if (ordinal != 0) {
                Object obj4 = nf3.a;
                rq3 rq3Var = null;
                if (ordinal == 1) {
                    av8Var.d0(-1129986009);
                    boolean g = av8Var.g(function1);
                    Object O = av8Var.O();
                    if (g || O == obj4) {
                        O = new l77(8, function1);
                        av8Var.n0(O);
                    }
                    yqo.f((Function0) O, l98.d0(bkh.r(bkh.c, null, 3), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 0L, av8Var, 48, 4);
                    av8Var.s(false);
                    Unit unit = Unit.a;
                } else {
                    if (ordinal != 2) {
                        throw dmi.h(av8Var, 656285584, false);
                    }
                    av8Var.d0(-1129438797);
                    kx4 kx4Var2 = (kx4) av8Var.k(dh3.h);
                    e1d G = i2a.G(av8Var);
                    ev6 ev6Var = ra7Var.b;
                    if (ev6Var == null || (brandingFantasyCompetition = ev6Var.D) == null || (str = brandingFantasyCompetition.getTermsAndConditionsUrl()) == null || StringsKt.R(str)) {
                        str = null;
                    }
                    if (str == null) {
                        av8Var.d0(-1129353517);
                        av8Var.s(false);
                        h = null;
                        z = true;
                    } else {
                        av8Var.d0(-1129353516);
                        av8Var.d0(656307124);
                        o80 o80Var = new o80();
                        o80Var.d(oea.v(R.string.fantasy_terms_agreement_part_1, av8Var));
                        av8Var.d0(656311597);
                        z = true;
                        n80 n80Var = new n80(new fbb(str, null, 6), o80Var.a.length(), 0, 12);
                        ArrayList arrayList = o80Var.b;
                        arrayList.add(n80Var);
                        o80Var.c.add(n80Var);
                        int size = arrayList.size() - 1;
                        try {
                            av8Var.d0(656314175);
                            int g2 = o80Var.g(new pwh(lz.D(R.color.primary_default, av8Var), 0L, wg8.j, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65530));
                            try {
                                Brand brand = ra7Var.b.D.getBrand();
                                if (brand != null) {
                                    str2 = brand.getName();
                                    if (str2 == null) {
                                    }
                                    o80Var.d(oea.w(R.string.fantasy_terms_privacy_agreement_part_5, new Object[]{str2}, av8Var));
                                    Unit unit2 = Unit.a;
                                    o80Var.f(g2);
                                    av8Var.s(false);
                                    o80Var.f(size);
                                    av8Var.s(false);
                                    h = o80Var.h();
                                    av8Var.s(false);
                                    av8Var.s(false);
                                }
                                str2 = "";
                                o80Var.d(oea.w(R.string.fantasy_terms_privacy_agreement_part_5, new Object[]{str2}, av8Var));
                                Unit unit22 = Unit.a;
                                o80Var.f(g2);
                                av8Var.s(false);
                                o80Var.f(size);
                                av8Var.s(false);
                                h = o80Var.h();
                                av8Var.s(false);
                                av8Var.s(false);
                            } catch (Throwable th) {
                                o80Var.f(g2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            o80Var.f(size);
                            throw th2;
                        }
                    }
                    qug o0 = hkg.o0(av8Var);
                    cdi P = z1a.P(o0, av8Var);
                    Boolean bool = (Boolean) P.getValue();
                    bool.booleanValue();
                    boolean g3 = av8Var.g(function12) | av8Var.g(P);
                    Object O2 = av8Var.O();
                    if (g3 || O2 == obj4) {
                        O2 = new p97(function12, P, rq3Var, i);
                        av8Var.n0(O2);
                    }
                    hz8.o(av8Var, bool, (Function2) O2);
                    utc utcVar = utc.a;
                    xtc o = tol.o(utcVar);
                    p4h p4hVar = ww9.d;
                    kv1 kv1Var = uxf.o;
                    u23 a = t23.a(p4hVar, kv1Var, av8Var, 0);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, o);
                    if3.k7.getClass();
                    Function0 function0 = hf3.b;
                    av8Var.h0();
                    q80 q80Var = h;
                    if (av8Var.S) {
                        av8Var.l(function0);
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
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    boolean z4 = z;
                    xtc u0 = hkg.u0(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, z4), o0, ((Boolean) G.getValue()).booleanValue() ^ z4, 12);
                    u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 0);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, u0);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(function0);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a2, f50Var);
                    waa.K(av8Var, m2, ff3Var);
                    bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C2, f50Var3);
                    tba.e(0, 4, av8Var, null, oea.v(R.string.fantasy_choose_team_name_title, av8Var), oea.v(R.string.fantasy_choose_team_name_body, av8Var));
                    xtc c0 = l98.c0(utcVar, 16.0f, 8.0f);
                    String str3 = ra7Var.c;
                    String v = oea.v(R.string.team_name_field, av8Var);
                    String v2 = oea.v(R.string.team_name_restriction_info, av8Var);
                    t28 C3 = r4a.C(30);
                    boolean g4 = av8Var.g(function1);
                    Object O3 = av8Var.O();
                    if (g4 || O3 == obj4) {
                        O3 = new k46(20, function1);
                        av8Var.n0(O3);
                    }
                    q5a.r(str3, c0, null, (Function1) O3, null, null, null, v, null, v2, null, false, C3, 0L, 0, 0, null, 0L, 0L, 0, false, false, false, av8Var, 48, 384, 0, 16772468);
                    av8 av8Var2 = av8Var;
                    nq8.h(av8Var2, bkh.e(utcVar, 16.0f));
                    if (q80Var == null) {
                        av8Var2.d0(-1870647535);
                        av8Var2.s(false);
                        kx4Var = kx4Var2;
                    } else {
                        bf3.r(8.0f, -1870647534, av8Var2, av8Var2, utcVar);
                        kx4Var = kx4Var2;
                        xtc c02 = l98.c0(n9e.q(l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_2, av8Var2), o7g.a(8.0f)), 16.0f, 8.0f);
                        k1c c = e12.c(uxf.c, false);
                        int hashCode3 = Long.hashCode(av8Var2.T);
                        aee m3 = av8Var2.m();
                        xtc C4 = fqj.C(av8Var2, c02);
                        av8Var2.h0();
                        if (av8Var2.S) {
                            av8Var2.l(function0);
                        } else {
                            av8Var2.q0();
                        }
                        waa.K(av8Var2, c, f50Var);
                        waa.K(av8Var2, m3, ff3Var);
                        bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
                        waa.K(av8Var2, C4, f50Var3);
                        boolean z5 = ra7Var.g;
                        boolean g5 = av8Var2.g(function1);
                        Object O4 = av8Var2.O();
                        if (g5 || O4 == obj4) {
                            O4 = new k46(21, function1);
                            av8Var2.n0(O4);
                        }
                        v9g.e(z5, (Function1) O4, q80Var, null, null, av8Var2, 0, 24);
                        av8Var2 = av8Var2;
                        av8Var2.s(true);
                        Unit unit3 = Unit.a;
                        av8Var2.s(false);
                    }
                    if (ra7Var.e.isEmpty()) {
                        f = 8.0f;
                        av8Var2.d0(-1869256626);
                        av8Var2.s(false);
                    } else {
                        f = 8.0f;
                        bf3.r(8.0f, -1869745775, av8Var2, av8Var2, utcVar);
                        xtc d0 = l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        gv9 gv9Var = ra7Var.e;
                        rn6 rn6Var = ra7Var.f;
                        boolean g6 = av8Var2.g(function1);
                        Object O5 = av8Var2.O();
                        if (g6 || O5 == obj4) {
                            O5 = new k46(19, function1);
                            av8Var2.n0(O5);
                        }
                        av8 av8Var3 = av8Var2;
                        ktm.f(gv9Var, rn6Var, (Function1) O5, d0, av8Var3, 3072);
                        av8Var2 = av8Var3;
                        av8Var2.s(false);
                    }
                    Object O6 = av8Var2.O();
                    if (O6 == obj4) {
                        O6 = e.f(new p75(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                        av8Var2.n0(O6);
                    }
                    e1d e1dVar = (e1d) O6;
                    xtc d = bkh.d(l98.c0(utcVar, 16.0f, 48.0f), 1.0f);
                    if (p75.b(((p75) e1dVar.getValue()).a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                        av8Var2.d0(-28274334);
                        if (1.0f <= 0.0d) {
                            p3a.a("invalid weight; must be greater than zero");
                        }
                        goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        av8Var2.s(false);
                        z2 = d.z(goaVar);
                    } else {
                        av8Var2.d0(-1109812159);
                        xtc e = bkh.e(utcVar, ((p75) e1dVar.getValue()).a);
                        av8Var2.s(false);
                        z2 = d.z(e);
                    }
                    kx4 kx4Var3 = kx4Var;
                    boolean g7 = av8Var2.g(kx4Var3);
                    Object O7 = av8Var2.O();
                    if (g7 || O7 == obj4) {
                        z3 = true;
                        O7 = new fo6(kx4Var3, e1dVar, 1);
                        av8Var2.n0(O7);
                    } else {
                        z3 = true;
                    }
                    hkg.n(0, av8Var2, o02.h0(z2, (Function1) O7));
                    av8Var2.s(z3);
                    String v3 = oea.v(R.string.confirm, av8Var2);
                    boolean z6 = ra7Var.h;
                    boolean z7 = pb7Var.r;
                    xtc b0 = l98.b0(ml4.f0(n9e.q(d2a.E(bkh.d(ml4.Y(utcVar), 1.0f), f, null, false, 0L, 30), lz.D(R.color.surface_1, av8Var2), oyn.e)), 16.0f);
                    boolean g8 = av8Var2.g(function1);
                    Object O8 = av8Var2.O();
                    if (g8 || O8 == obj4) {
                        O8 = new l77(7, function1);
                        av8Var2.n0(O8);
                    }
                    av8 av8Var4 = av8Var2;
                    mha.h(v3, (Function0) O8, b0, kqh.a, null, z6, z7, false, 0L, 0, 0, av8Var4, 3072, 0, 1936);
                    av8Var4.s(true);
                    av8Var4.s(false);
                    Unit unit4 = Unit.a;
                }
            } else {
                av8Var.d0(-1130118937);
                s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 62, 0L, 0L, av8Var, bkh.c);
                av8Var.s(false);
                Unit unit5 = Unit.a;
            }
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel;
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 = (FantasyRoundPlayerUiModel) this.c;
        ev6 ev6Var = (ev6) this.b;
        Context context = (Context) this.d;
        mj7 mj7Var = (mj7) this.e;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((v23) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            int i = ev6Var.c;
            boolean z = ev6Var.d == FantasyCompetitionType.SEASON;
            boolean z2 = ev6Var.A;
            boolean i2 = av8Var.i(context) | av8Var.g(fantasyRoundPlayerUiModel2) | av8Var.g(ev6Var) | av8Var.g(mj7Var);
            Object O = av8Var.O();
            if (i2 || O == nf3.a) {
                fantasyRoundPlayerUiModel = fantasyRoundPlayerUiModel2;
                m61 m61Var = new m61(context, fantasyRoundPlayerUiModel, ev6Var, mj7Var, 6);
                av8Var.n0(m61Var);
                O = m61Var;
            } else {
                fantasyRoundPlayerUiModel = fantasyRoundPlayerUiModel2;
            }
            ao2.d(fantasyRoundPlayerUiModel, i, z, z2, (Function0) O, null, av8Var, 0);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        gv9<kj7> gv9Var = (gv9) this.c;
        ev6 ev6Var = (ev6) this.d;
        Function1 function1 = (Function1) this.b;
        Function0 function0 = (Function0) this.e;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((v23) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            rha.b(oea.v(R.string.fantasy_top_players_by_round, av8Var), null, 0L, av8Var, 0, 6);
            utc utcVar = utc.a;
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            av8Var.d0(1336168088);
            for (kj7 kj7Var : gv9Var) {
                av8Var.a0(-1757972, Integer.valueOf(kj7Var.a.a));
                gvd.j(kj7Var, function1, ev6Var.A, null, 16.0f, av8Var, 24576, 8);
                av8Var.s(false);
            }
            bf3.t(av8Var, false, utcVar, 8.0f, av8Var);
            xtc d = bkh.d(utcVar, 1.0f);
            k1c c = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d);
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
            String v = oea.v(R.string.fantasy_see_all_players, av8Var);
            yf8 yf8Var = xth.a;
            bea.f(v, n12.a.a(utcVar, uxf.g), xth.l(), false, function0, null, av8Var, 0, 40);
            bf3.t(av8Var, true, utcVar, 12.0f, av8Var);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        rse rseVar = (rse) this.c;
        Function0 function0 = (Function0) this.b;
        qug qugVar = (qug) this.e;
        ksa ksaVar = (ksa) this.d;
        dz6 dz6Var = (dz6) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        dz6Var.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(dz6Var) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (!av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            av8Var.W();
        } else if (dz6Var instanceof az6) {
            av8Var.d0(-707307816);
            o1j.k((az6) dz6Var, rseVar, function0, qugVar, av8Var, intValue & 14);
            av8Var.s(false);
        } else if (dz6Var instanceof cz6) {
            av8Var.d0(-706981355);
            o1j.i((cz6) dz6Var, rseVar, function0, ksaVar, av8Var, intValue & 14);
            av8Var.s(false);
        } else {
            if (!dz6Var.equals(bz6.a)) {
                throw dmi.h(av8Var, -854102988, false);
            }
            av8Var.d0(-706648663);
            s6a.f(36.0f, 4.0f, 432, 57, 0L, 0L, av8Var, null);
            av8Var.s(false);
        }
        return Unit.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        ev6 ev6Var;
        a99 a99Var;
        do7 do7Var;
        utc utcVar;
        String str;
        po7 po7Var;
        ev6 ev6Var2;
        Function1 function1;
        Function1 function12 = (Function1) this.b;
        String str2 = (String) this.c;
        Context context = (Context) this.d;
        il8 il8Var = (il8) this.e;
        ro7 ro7Var = (ro7) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ro7Var.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(ro7Var) ? 4 : 2;
        }
        int i = intValue;
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 19) != 18)) {
            boolean z = ro7Var instanceof no7;
            utc utcVar2 = utc.a;
            if (z) {
                av8Var.d0(2006736451);
                g28 g28Var = bkh.c;
                k1c c = e12.c(uxf.g, false);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, g28Var);
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
                j72.h(n9e.q(l98.b0(utcVar2, 8.0f), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f)), Integer.valueOf(R.drawable.match_shotmap), Integer.valueOf(R.string.fantasy_lineup_locked_empty_title), Integer.valueOf(R.string.fantasy_lineup_locked_empty_text), true, null, 0, 0L, av8Var, 24576, 224);
                av8Var.s(true);
                av8Var.s(false);
            } else if (ro7Var instanceof oo7) {
                av8Var.d0(2007488604);
                s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 62, 0L, 0L, av8Var, bkh.c);
                av8Var.s(false);
            } else {
                if (!(ro7Var instanceof po7)) {
                    throw dmi.h(av8Var, 1311663606, false);
                }
                av8Var.d0(2007827775);
                png pngVar = new png(8.0f, uxf.l);
                xtc f0 = l98.f0(hkg.u0(bkh.c, hkg.o0(av8Var), false, 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 7);
                u23 a = t23.a(pngVar, uxf.o, av8Var, 6);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, f0);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a, hf3.g);
                waa.K(av8Var, m2, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C2, hf3.d);
                po7 po7Var2 = (po7) ro7Var;
                ho7 ho7Var = po7Var2.b;
                do7 do7Var2 = po7Var2.a;
                fcp.Q(ho7Var, function12, po7Var2.d, po7Var2.c, n9e.q(d2a.E(utcVar2, 8.0f, null, false, 0L, 30), lz.D(R.color.surface_1, av8Var), oyn.e), av8Var, 0);
                ev6 ev6Var3 = do7Var2.c;
                int i2 = lo7.a[ev6Var3.d.ordinal()];
                a99 a99Var2 = nf3.a;
                if (i2 == 1) {
                    ev6Var = ev6Var3;
                    a99Var = a99Var2;
                    do7Var = do7Var2;
                    utcVar = utcVar2;
                    str = str2;
                    po7Var = po7Var2;
                    av8Var.d0(-1258634131);
                    ho7 ho7Var2 = po7Var.b;
                    Object O = av8Var.O();
                    if (O == a99Var) {
                        O = new gl7(4);
                        av8Var.n0(O);
                    }
                    fkf.f(ho7Var2, str, (Function1) O, null, null, av8Var, 384, 24);
                    av8Var.s(false);
                    Unit unit = Unit.a;
                } else {
                    if (i2 != 2) {
                        throw dmi.h(av8Var, -2118813689, false);
                    }
                    av8Var.d0(-1258260891);
                    gv9 gv9Var = po7Var2.g;
                    ho7 ho7Var3 = po7Var2.b;
                    boolean z2 = ev6Var3.A;
                    Object O2 = av8Var.O();
                    if (O2 == a99Var2) {
                        O2 = new go7(4);
                        av8Var.n0(O2);
                    }
                    Function0 function0 = (Function0) O2;
                    Object O3 = av8Var.O();
                    if (O3 == a99Var2) {
                        O3 = new go7(5);
                        av8Var.n0(O3);
                    }
                    po7Var = po7Var2;
                    ev6Var = ev6Var3;
                    utcVar = utcVar2;
                    do7Var = do7Var2;
                    a99Var = a99Var2;
                    l6g.l(ho7Var3, null, gv9Var, str2, function0, (Function0) O3, z2, null, av8Var, 221232);
                    str = str2;
                    av8Var.s(false);
                    Unit unit2 = Unit.a;
                }
                rz0.a(new sz0(AdType.Banner.FantasySmall, l6g.L(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL), new Pair("page", "fantasy"))), null, 0, 0, true, av8Var, 24960, 10);
                gv9 gv9Var2 = po7Var.e;
                do7 do7Var3 = do7Var;
                ev6 ev6Var4 = do7Var3.c;
                boolean z3 = ho7Var.g;
                mj7 mj7Var = ho7Var.a;
                boolean h = mj7Var.h();
                int i3 = i & 14;
                boolean i4 = av8Var.i(context) | (i3 == 4);
                Object O4 = av8Var.O();
                if (i4 || O4 == a99Var) {
                    ev6Var2 = ev6Var4;
                    O4 = new w47(16, (Object) context, (Object) ro7Var);
                    av8Var.n0(O4);
                } else {
                    ev6Var2 = ev6Var4;
                }
                Function1 function13 = (Function1) O4;
                Object O5 = av8Var.O();
                if (O5 == a99Var) {
                    function1 = function13;
                    O5 = new go7(6);
                    av8Var.n0(O5);
                } else {
                    function1 = function13;
                }
                Function0 function02 = (Function0) O5;
                a99 a99Var3 = a99Var;
                tol.j(gv9Var2, ev6Var2, function1, il8Var, function02, false, z3, h, null, false, null, av8Var, 221184, 1792);
                String v = oea.v(R.string.fantasy_learn_how_to_play, av8Var);
                po7 po7Var3 = po7Var;
                xtc d0 = l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                boolean i5 = av8Var.i(context) | (i3 == 4);
                Object O6 = av8Var.O();
                if (i5 || O6 == a99Var3) {
                    O6 = new n37(21, context, ro7Var);
                    av8Var.n0(O6);
                }
                x2a.d(v, d0, null, 0L, 0L, 0L, (Function0) O6, wkn.f, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 12582960, 0, 1852);
                dy0.a(ev6Var.d == FantasyCompetitionType.SEASON && mj7Var.a != do7Var3.h.a, null, yqo.H(-560436845, av8Var, new d67(28, ro7Var, context, str)), av8Var, 384);
                rz0.a(new sz0(AdType.Banner.FantasyBig, l6g.L(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL), new Pair("page", "fantasy"))), null, 0, 0, true, av8Var, 24576, 14);
                av8Var.s(true);
                fz8.e(po7Var3.h, null, uo5.e(s02.h0(200, 0, null, 6), 2), uo5.f(s02.h0(200, 0, null, 6), 2), null, wkn.g, av8Var, 200064, 18);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        wla wlaVar = (wla) this.c;
        List list = (List) this.b;
        Context context = (Context) this.d;
        ct8 ct8Var = (ct8) this.e;
        ((Integer) obj3).getClass();
        ((r70) obj).getClass();
        xtc f0 = l98.f0(utc.a, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 8.0f, 2);
        av8 av8Var = (av8) ((of3) obj2);
        boolean i = av8Var.i(context);
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (i || O == a99Var) {
            O = new c6(context, 24);
            av8Var.n0(O);
        }
        xtc S = tgj.S(f0, wlaVar, "primary_card", list, (Function0) O, av8Var, 390);
        boolean g = av8Var.g(ct8Var);
        Object O2 = av8Var.O();
        if (g || O2 == a99Var) {
            O2 = new xx7(ct8Var, 1);
            av8Var.n0(O2);
        }
        Function0 function0 = (Function0) O2;
        boolean g2 = av8Var.g(ct8Var);
        Object O3 = av8Var.O();
        if (g2 || O3 == a99Var) {
            O3 = new xx7(ct8Var, 2);
            av8Var.n0(O3);
        }
        ww9.j(0, av8Var, S, function0, (Function0) O3);
        return Unit.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        String a;
        q28 q28Var = (q28) this.c;
        Function0 function0 = (Function0) this.b;
        Function0 function02 = (Function0) this.d;
        Function0 function03 = (Function0) this.e;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).h(booleanValue) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (!av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            av8Var.W();
        } else if (booleanValue) {
            av8Var.d0(608224910);
            utc utcVar = utc.a;
            xtc c = bkh.c(utcVar, 1.0f);
            k1c c2 = e12.c(uxf.f, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            r9k r9kVar = q28Var.e;
            if (r9kVar == null) {
                av8Var.d0(1873510967);
                av8Var.s(false);
                a = null;
            } else {
                av8Var.d0(476077834);
                a = r9kVar.a(av8Var);
                av8Var.s(false);
            }
            if (a == null) {
                a = "";
            }
            String str = a;
            yf8 yf8Var = xth.a;
            q5a.w(str, l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), lz.D(R.color.live, av8Var), null, 0L, 0L, new p7j(2), 0L, 0, false, 0, 0, xth.g(), av8Var, 48, 0, 130040);
            av8Var.s(true);
            av8Var.s(false);
        } else {
            av8Var.d0(608873988);
            m6k.f(q28Var.f, function0, function02, function03, null, av8Var, 0);
            av8Var.s(false);
        }
        return Unit.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        vnb vnbVar = (vnb) this.c;
        qnb qnbVar = (qnb) this.b;
        ct8 ct8Var = (ct8) this.d;
        tc3 tc3Var = (tc3) this.e;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((m12) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            ktm.t(vnbVar, null, false, qnbVar, ct8Var, tc3Var, av8Var, 0, 6);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        tee teeVar = (tee) this.c;
        w41 w41Var = (w41) this.d;
        Function1 function1 = (Function1) this.b;
        e1d e1dVar = (e1d) this.e;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((m12) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            vnb vnbVar = (vnb) e1dVar.getValue();
            boolean i = av8Var.i(w41Var);
            Object O = av8Var.O();
            if (i || O == nf3.a) {
                v9b v9bVar = new v9b(1, w41Var, w41.class, "onChipSelected", "onChipSelected(Lcom/sofascore/results/media/MediaTypeFilter;)V", 0, 13);
                av8Var.n0(v9bVar);
                O = v9bVar;
            }
            ybc.a(vnbVar, teeVar, (Function1) ((KFunction) O), function1, av8Var, 0);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        boolean z;
        long f;
        ksa ksaVar;
        tee teeVar = (tee) this.c;
        Function1 function1 = (Function1) this.b;
        Object obj4 = (Function1) this.d;
        Object obj5 = (Context) this.e;
        vnb vnbVar = (vnb) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        vnbVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(vnbVar) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            boolean equals = vnbVar.equals(tnb.a);
            utc utcVar = utc.a;
            if (equals || (vnbVar instanceof snb)) {
                av8Var.d0(-810367451);
                s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 62, 0L, 0L, av8Var, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13));
                av8Var.s(false);
            } else {
                if (!(vnbVar instanceof unb)) {
                    throw dmi.h(av8Var, -810362779, false);
                }
                av8Var.d0(648710118);
                Object O = av8Var.O();
                Object obj6 = nf3.a;
                if (O == obj6) {
                    O = new wla();
                    av8Var.n0(O);
                }
                wla wlaVar = (wla) O;
                h4d D = d2a.D(teeVar, av8Var, 0);
                Object x = rfo.x(D.e, av8Var, 0);
                ksa a = msa.a(0, 0, av8Var, 0, 3);
                zbc zbcVar = (zbc) ((unb) vnbVar).a;
                gec gecVar = zbcVar.d;
                boolean z2 = zbcVar.f;
                gv9 gv9Var = zbcVar.c;
                boolean g = av8Var.g(a);
                int i = intValue;
                Object O2 = av8Var.O();
                rq3 rq3Var = null;
                if (g || O2 == obj6) {
                    z = z2;
                    O2 = new ck1(12, rq3Var, a);
                    av8Var.n0(O2);
                } else {
                    z = z2;
                }
                hz8.q(gecVar, gv9Var, (Function2) O2, av8Var);
                Object O3 = av8Var.O();
                if (O3 == obj6) {
                    O3 = new ArrayList();
                    av8Var.n0(O3);
                }
                Object obj7 = (List) O3;
                u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, utcVar);
                if3.k7.getClass();
                Function0 function0 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(function0);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a2, hf3.g);
                waa.K(av8Var, m, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C, hf3.d);
                xtc d = bkh.d(utcVar, 1.0f);
                if (z) {
                    av8Var.d0(-577291539);
                    av8Var.s(false);
                    f = r13.h;
                } else {
                    f = ljg.f(av8Var, -577290993, R.color.surface_1, av8Var, false);
                }
                xtc O4 = kda.O(n9e.q(d, f, oyn.e), "media_types_filter", av8Var);
                av8Var.d0(-577286702);
                gv9<gec> gv9Var2 = zbcVar.b;
                ArrayList arrayList = new ArrayList(k13.r(gv9Var2, 10));
                for (gec gecVar2 : gv9Var2) {
                    arrayList.add(new vt2(gecVar2, oea.v(gecVar2.a, av8Var), false, null, null, null, null, 252));
                }
                av8Var.s(false);
                gv9 W = l6g.W(arrayList);
                gec gecVar3 = zbcVar.d;
                lrh lrhVar = z ? frh.m : hrh.m;
                boolean g2 = av8Var.g(function1);
                Object O5 = av8Var.O();
                if (g2 || O5 == obj6) {
                    O5 = new uj8(17, function1);
                    av8Var.n0(O5);
                }
                trh.a(W, gecVar3, (Function1) O5, O4, null, null, lrhVar, false, false, true, null, null, av8Var, 805306368, V2.b.f);
                if (z) {
                    av8Var.d0(-715165952);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-715379976);
                    tz9.d(1.0f, 390, 8, lz.D(R.color.n_lv_4, av8Var), 0L, av8Var, bkh.d(utcVar, 1.0f));
                    av8Var.s(false);
                }
                xtc J = lz.J(b6a.s(utcVar, wlaVar).z(bkh.c), jaa.L(av8Var), null);
                t3e t3eVar = new t3e(8.0f, 8.0f, 8.0f, 72.0f);
                ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                boolean g3 = ((i & 14) == 4) | av8Var.g(obj4) | av8Var.i(wlaVar) | av8Var.i(obj7) | av8Var.i(obj5) | av8Var.g(x) | av8Var.g(D);
                Object O6 = av8Var.O();
                if (g3 || O6 == obj6) {
                    ksaVar = a;
                    Object gjVar = new gj(vnbVar, obj4, wlaVar, obj7, obj5, D, x, 5);
                    av8Var.n0(gjVar);
                    O6 = gjVar;
                } else {
                    ksaVar = a;
                }
                v8a.a(J, ksaVar, t3eVar, ng0Var, null, null, false, null, (Function1) O6, av8Var, 24576, 488);
                av8Var.s(true);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        xtc r;
        ysd ysdVar = (ysd) this.c;
        OnboardingViewModel onboardingViewModel = (OnboardingViewModel) this.b;
        c6d c6dVar = (c6d) this.d;
        e1d e1dVar = (e1d) this.e;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((hsd) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            r = m6k.r(utc.a, "IntroTab", new su(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null, null));
            boolean i = av8Var.i(ysdVar) | av8Var.i(onboardingViewModel) | av8Var.i(c6dVar);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (i || O == a99Var) {
                O = new l97(18, ysdVar, onboardingViewModel, c6dVar);
                av8Var.n0(O);
            }
            Function0 function0 = (Function0) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new fw6(19, e1dVar);
                av8Var.n0(O2);
            }
            t62.p(function0, (Function1) O2, r, av8Var, 48, 0);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3) {
        ksa ksaVar = (ksa) this.c;
        gv9 gv9Var = (gv9) this.d;
        Function1 function1 = (Function1) this.b;
        Function0 function0 = (Function0) this.e;
        of3 of3Var = (of3) obj2;
        ((Integer) obj3).getClass();
        ((r70) obj).getClass();
        long D = lz.D(R.color.onboarding_surface_1, of3Var);
        utc utcVar = utc.a;
        xtc d = bkh.d(utcVar, 1.0f);
        av8 av8Var = (av8) of3Var;
        boolean f = av8Var.f(D);
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        int i = 1;
        if (f || O == a99Var) {
            O = new prd(D, i);
            av8Var.n0(O);
        }
        xtc X = td4.X(d, (Function1) O);
        Object O2 = av8Var.O();
        if (O2 == a99Var) {
            O2 = new ild(11);
            av8Var.n0(O2);
        }
        xtc f0 = l98.f0(oyn.w(X, false, null, null, (Function0) O2, 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
        u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
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
        waa.K(av8Var, a, hf3.g);
        waa.K(av8Var, m, hf3.f);
        waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
        waa.J(av8Var, hf3.k);
        waa.K(av8Var, C, hf3.d);
        xtc d2 = bkh.d(utcVar, 1.0f);
        t3e t3eVar = new t3e(16.0f, 8.0f, 16.0f, 8.0f);
        ng0 ng0Var = new ng0(8.0f, true, new a70(6));
        boolean i2 = av8Var.i(gv9Var) | av8Var.g(function1);
        Object O3 = av8Var.O();
        int i3 = 2;
        if (i2 || O3 == a99Var) {
            O3 = new ij7(gv9Var, function1, i3);
            av8Var.n0(O3);
        }
        v8a.c(d2, ksaVar, t3eVar, ng0Var, null, null, false, null, (Function1) O3, av8Var, 24966, 488);
        xtc O4 = kda.O(l98.d0(vxd.f(utcVar, 4.0f, av8Var, utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), "continue_button", av8Var);
        String v = oea.v(R.string.button_continue, av8Var);
        boolean g = av8Var.g(function0);
        Object O5 = av8Var.O();
        if (g || O5 == a99Var) {
            O5 = new rsd(0, function0);
            av8Var.n0(O5);
        }
        mha.h(v, tol.u((Function0) O5, av8Var), O4, oqh.a, null, false, false, false, 1000L, 0, 0, av8Var, 100666368, 0, 1776);
        av8Var.s(true);
        return Unit.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        List<InvitedUser> invitedUsers;
        List<InvitedUser> invitedUsers2;
        ReferralResponse referralResponse = (ReferralResponse) this.c;
        Function1 function1 = (Function1) this.b;
        Context context = (Context) this.d;
        e1d e1dVar = (e1d) this.e;
        ytf ytfVar = (ytf) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ytfVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(ytfVar) ? 4 : 2;
        }
        int i = 0;
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            boolean z = (referralResponse != null ? referralResponse.getMyProgressAsInvitedUser() : null) != null || ytfVar.b;
            g28 g28Var = bkh.c;
            u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, g28Var);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            a99 a99Var = nf3.a;
            if (z) {
                av8Var.d0(-1147274172);
                InvitedUser myProgressAsInvitedUser = referralResponse != null ? referralResponse.getMyProgressAsInvitedUser() : null;
                boolean g = av8Var.g(function1);
                Object O = av8Var.O();
                if (g || O == a99Var) {
                    O = new vbc(13, function1);
                    av8Var.n0(O);
                }
                gz8.k(myProgressAsInvitedUser, (Function0) O, av8Var, 0);
                av8Var.s(false);
            } else if (referralResponse == null || (invitedUsers = referralResponse.getInvitedUsers()) == null || !(!invitedUsers.isEmpty())) {
                av8Var.d0(-1147238167);
                boolean i2 = av8Var.i(context) | av8Var.g(function1);
                Object O2 = av8Var.O();
                if (i2 || O2 == a99Var) {
                    O2 = new zj(context, function1, 2);
                    av8Var.n0(O2);
                }
                s02.v((Function0) O2, av8Var, 0);
                av8Var.s(false);
            } else {
                av8Var.d0(-1205396960);
                boolean z2 = ytfVar.a;
                gv9 W = l6g.W(referralResponse.getInvitedUsers());
                int invitedUsersWhoCompletedTasks = referralResponse.getInvitedUsersWhoCompletedTasks();
                Object O3 = av8Var.O();
                if (O3 == a99Var) {
                    O3 = new fw6(27, e1dVar);
                    av8Var.n0(O3);
                }
                Function1 function12 = (Function1) O3;
                boolean i3 = av8Var.i(context) | av8Var.g(function1);
                Object O4 = av8Var.O();
                if (i3 || O4 == a99Var) {
                    O4 = new zj(context, function1, 1);
                    av8Var.n0(O4);
                }
                Function0 function0 = (Function0) O4;
                boolean g2 = av8Var.g(function1);
                Object O5 = av8Var.O();
                if (g2 || O5 == a99Var) {
                    O5 = new vbc(14, function1);
                    av8Var.n0(O5);
                }
                yaa.a(z2, W, invitedUsersWhoCompletedTasks, function12, function0, (Function0) O5, av8Var, 3072);
                av8Var.s(false);
            }
            av8Var.s(true);
            xtc f0 = ml4.f0(utc.a);
            InvitedUser invitedUser = (InvitedUser) e1dVar.getValue();
            if (referralResponse != null && (invitedUsers2 = referralResponse.getInvitedUsers()) != null) {
                i = invitedUsers2.indexOf((InvitedUser) e1dVar.getValue());
            }
            int i4 = i;
            Object O6 = av8Var.O();
            if (O6 == a99Var) {
                O6 = new tra(16, e1dVar);
                av8Var.n0(O6);
            }
            waa.c(invitedUser, i4, (Function0) O6, f0, av8Var, 384);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x034e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object s(Object obj, Object obj2, Object obj3) {
        Integer num;
        boolean z;
        ArrayList arrayList;
        Iterable iterable;
        gv9 W;
        gv9 gv9Var;
        boolean z2;
        av8 av8Var;
        a99 a99Var;
        float f;
        boolean z3;
        gv9 gv9Var2;
        boolean z4;
        av8 av8Var2;
        boolean z5;
        ArrayList arrayList2;
        Iterable iterable2;
        Boolean bool;
        boolean z6;
        f6i f6iVar = (f6i) this.c;
        Function1 function1 = (Function1) this.b;
        ksa ksaVar = (ksa) this.d;
        Context context = (Context) this.e;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((m12) obj).getClass();
        av8 av8Var3 = (av8) of3Var;
        if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
            utc utcVar = utc.a;
            xtc d = bkh.d(utcVar, 1.0f);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a = t23.a(p4hVar, kv1Var, av8Var3, 0);
            int hashCode = Long.hashCode(av8Var3.T);
            aee m = av8Var3.m();
            xtc C = fqj.C(av8Var3, d);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var3, a, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var3, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var3, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var3, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var3, C, f50Var3);
            xtc q = n9e.q(l98.f0(gz8.x(bkh.d(utcVar, 1.0f), null, null, 3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 7), lz.D(R.color.surface_1, av8Var3), oyn.e);
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var3, 0);
            int hashCode2 = Long.hashCode(av8Var3.T);
            aee m2 = av8Var3.m();
            xtc C2 = fqj.C(av8Var3, q);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a2, f50Var);
            waa.K(av8Var3, m2, ff3Var);
            bf3.s(hashCode2, av8Var3, f50Var2, av8Var3, ryVar);
            waa.K(av8Var3, C2, f50Var3);
            gv9 gv9Var3 = f6iVar.b;
            c6i c6iVar = f6iVar.c;
            if (gv9Var3 != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : gv9Var3) {
                    if (hashSet.add(((c6i) obj4).a)) {
                        arrayList3.add(obj4);
                    }
                }
                num = Integer.valueOf(arrayList3.size());
            } else {
                num = null;
            }
            if (yid.m(num) > 1) {
                if (gv9Var3 != null) {
                    if (!gv9Var3.isEmpty()) {
                        Iterator<E> it = gv9Var3.iterator();
                        while (it.hasNext()) {
                            if (((c6i) it.next()).a == b6i.f) {
                                z6 = false;
                                break;
                            }
                        }
                    }
                    z6 = true;
                    bool = Boolean.valueOf(z6);
                } else {
                    bool = null;
                }
                if (Intrinsics.c(bool, Boolean.TRUE)) {
                    z = true;
                    if (gv9Var3 == null) {
                        arrayList = new ArrayList();
                        for (Object obj5 : gv9Var3) {
                            if (((c6i) obj5).a == (c6iVar != null ? c6iVar.a : null)) {
                                arrayList.add(obj5);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        av8Var3.d0(2008600682);
                        av8Var3.s(false);
                        iterable = null;
                    } else {
                        av8Var3.d0(2008600683);
                        ArrayList arrayList4 = new ArrayList(k13.r(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            a6i a6iVar = ((c6i) it2.next()).b;
                            arrayList4.add(new vt2(a6iVar, oea.v(f6iVar.h ? a6iVar.b : a6iVar.a, av8Var3), false, null, null, null, null, 252));
                        }
                        av8Var3.s(false);
                        iterable = arrayList4;
                    }
                    if (iterable == null) {
                        iterable = km5.a;
                    }
                    W = l6g.W(iterable);
                    if (W.size() <= 1) {
                        gv9Var = gv9Var3;
                        z2 = true;
                    } else {
                        gv9Var = gv9Var3;
                        z2 = false;
                    }
                    a99 a99Var2 = nf3.a;
                    if (z) {
                        av8Var = av8Var3;
                        a99Var = a99Var2;
                        f = 1.0f;
                        z3 = false;
                        av8Var.d0(2009888981);
                        av8Var.s(false);
                    } else {
                        av8Var3.d0(2009285473);
                        if (gv9Var != null) {
                            HashSet hashSet2 = new HashSet();
                            arrayList2 = new ArrayList();
                            for (Object obj6 : gv9Var) {
                                if (hashSet2.add(((c6i) obj6).a)) {
                                    arrayList2.add(obj6);
                                }
                            }
                        } else {
                            arrayList2 = null;
                        }
                        if (arrayList2 == null) {
                            av8Var3.d0(2009393569);
                            av8Var3.s(false);
                            iterable2 = null;
                        } else {
                            av8Var3.d0(2009393570);
                            ArrayList arrayList5 = new ArrayList(k13.r(arrayList2, 10));
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                b6i b6iVar = ((c6i) it3.next()).a;
                                arrayList5.add(new s1h(b6iVar, oea.v(b6iVar.a, av8Var3), true));
                            }
                            av8Var3.s(false);
                            iterable2 = arrayList5;
                        }
                        if (iterable2 == null) {
                            iterable2 = km5.a;
                        }
                        gv9 W2 = l6g.W(iterable2);
                        b6i b6iVar2 = c6iVar != null ? c6iVar.a : null;
                        boolean g = av8Var3.g(function1);
                        Object O = av8Var3.O();
                        if (g || O == a99Var2) {
                            O = new k1e(14, function1);
                            av8Var3.n0(O);
                        }
                        f = 1.0f;
                        a99Var = a99Var2;
                        l4a.a(W2, b6iVar2, (Function1) O, bkh.d(utcVar, 1.0f), null, false, av8Var3, 3072, 48);
                        av8Var = av8Var3;
                        z3 = false;
                        av8Var.s(false);
                    }
                    float f2 = f;
                    boolean z7 = z3;
                    av8 av8Var4 = av8Var;
                    fz8.b(x23.a, z2, null, null, null, null, yqo.H(1836197461, av8Var, new p34(z, z2, f6iVar, W, function1)), av8Var4, 1572870, 30);
                    av8Var4.s(true);
                    av8Var4.d0(-301951593);
                    old oldVar = f6iVar.d;
                    gv9Var2 = f6iVar.e;
                    if (gv9Var2 == null) {
                        xtc d2 = bkh.d(utcVar, f2);
                        ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                        t3e C3 = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 160.0f, 5);
                        boolean i = av8Var4.i(f6iVar) | av8Var4.g(oldVar) | av8Var4.i(gv9Var2) | av8Var4.i(context);
                        Object O2 = av8Var4.O();
                        if (i || O2 == a99Var) {
                            lwc lwcVar = new lwc(f6iVar, gv9Var2, oldVar, context, 9);
                            av8Var4.n0(lwcVar);
                            O2 = lwcVar;
                        }
                        z4 = z7;
                        z5 = true;
                        v8a.a(d2, ksaVar, C3, ng0Var, null, null, false, null, (Function1) O2, av8Var4, 24966, 488);
                        av8Var2 = av8Var4;
                        Unit unit = Unit.a;
                    } else {
                        z4 = z7;
                        av8Var2 = av8Var4;
                        z5 = true;
                    }
                    av8Var2.s(z4);
                    av8Var2.s(z5);
                }
            }
            z = false;
            if (gv9Var3 == null) {
            }
            if (arrayList != null) {
            }
            if (iterable == null) {
            }
            W = l6g.W(iterable);
            if (W.size() <= 1) {
            }
            a99 a99Var22 = nf3.a;
            if (z) {
            }
            float f22 = f;
            boolean z72 = z3;
            av8 av8Var42 = av8Var;
            fz8.b(x23.a, z2, null, null, null, null, yqo.H(1836197461, av8Var, new p34(z, z2, f6iVar, W, function1)), av8Var42, 1572870, 30);
            av8Var42.s(true);
            av8Var42.d0(-301951593);
            old oldVar2 = f6iVar.d;
            gv9Var2 = f6iVar.e;
            if (gv9Var2 == null) {
            }
            av8Var2.s(z4);
            av8Var2.s(z5);
        } else {
            av8Var3.W();
        }
        return Unit.a;
    }

    private final Object t(Object obj, Object obj2, Object obj3) {
        long j;
        int i;
        int i2;
        ArrayList arrayList = (ArrayList) this.c;
        Function1 function1 = (Function1) this.b;
        e1d e1dVar = (e1d) this.d;
        e1d e1dVar2 = (e1d) this.e;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((v23) obj).getClass();
        int i3 = 1;
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cai caiVar = (cai) it.next();
                boolean z = ((cai) e1dVar.getValue()) == caiVar;
                if (z) {
                    j = ljg.f(av8Var, 754223762, R.color.surface_2, av8Var, false);
                } else {
                    av8Var.d0(754224560);
                    av8Var.s(false);
                    j = r13.i;
                }
                xtc q = n9e.q(utc.a, j, oyn.e);
                float f = wec.a;
                if (z) {
                    i = 754244216;
                    i2 = R.color.primary_default;
                } else {
                    i = 754245006;
                    i2 = R.color.n_lv_1;
                }
                long f2 = ljg.f(av8Var, i, i2, av8Var, false);
                long j2 = r13.i;
                cfc a = wec.a((g23) av8Var.k(i23.a));
                if (f2 == 16) {
                    f2 = a.a;
                }
                long j3 = f2;
                long j4 = j2 != 16 ? j2 : a.b;
                long j5 = j2 != 16 ? j2 : a.c;
                long j6 = j2 != 16 ? j2 : a.d;
                long j7 = j2 != 16 ? j2 : a.e;
                if (j2 == 16) {
                    j2 = a.f;
                }
                cfc cfcVar = new cfc(j3, j4, j5, j6, j7, j2);
                tc3 H = yqo.H(-1109241579, av8Var, new q8i(caiVar, i3));
                boolean e = av8Var.e(caiVar.ordinal()) | av8Var.g(function1);
                Object O = av8Var.O();
                if (e || O == nf3.a) {
                    O = new m61(caiVar, function1, e1dVar, e1dVar2);
                    av8Var.n0(O);
                }
                u10.b(H, (Function0) O, q, null, false, cfcVar, null, null, av8Var, 6, 440);
            }
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object u(Object obj, Object obj2, Object obj3) {
        final boolean z;
        int i;
        int i2;
        String str;
        a99 a99Var;
        boolean z2;
        final Context context;
        final ku3 ku3Var;
        gv9 gv9Var;
        Object obj4;
        av8 av8Var;
        c3j c3jVar;
        final n52 n52Var = (n52) this.c;
        String str2 = (String) this.d;
        final Function1 function1 = (Function1) this.b;
        String str3 = (String) this.e;
        final ynj ynjVar = (ynj) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ynjVar.getClass();
        gv9 gv9Var2 = ynjVar.a;
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? ((av8) of3Var).g(ynjVar) : ((av8) of3Var).i(ynjVar) ? 4 : 2;
        }
        boolean z3 = true;
        av8 av8Var2 = (av8) of3Var;
        if (av8Var2.T(intValue & 1, (intValue & 19) != 18)) {
            Context context2 = (Context) av8Var2.k(nz.b);
            final ksa a = msa.a(0, 0, av8Var2, 0, 3);
            Object O = av8Var2.O();
            a99 a99Var2 = nf3.a;
            if (O == a99Var2) {
                O = hz8.G(g.a, av8Var2);
                av8Var2.n0(O);
            }
            ku3 ku3Var2 = (ku3) O;
            boolean z4 = n52Var != null;
            Object O2 = av8Var2.O();
            if (O2 == a99Var2) {
                O2 = e.f(Boolean.FALSE);
                av8Var2.n0(O2);
            }
            e1d e1dVar = (e1d) O2;
            boolean z5 = z4;
            int i3 = intValue & 14;
            boolean g = av8Var2.g(str2) | (i3 == 4 || ((intValue & 8) != 0 && av8Var2.i(ynjVar))) | av8Var2.g(a) | av8Var2.i(context2) | av8Var2.i(ku3Var2);
            Object O3 = av8Var2.O();
            if (g || O3 == a99Var2) {
                z = z5;
                i = intValue;
                i2 = i3;
                str = str3;
                a99Var = a99Var2;
                z2 = false;
                context = context2;
                O3 = new p7d(str2, ynjVar, a, context, ku3Var2, e1dVar, null, 1);
                ku3Var = ku3Var2;
                a = a;
                av8Var2.n0(O3);
            } else {
                str = str3;
                z2 = false;
                a99Var = a99Var2;
                context = context2;
                ku3Var = ku3Var2;
                z = z5;
                i = intValue;
                i2 = i3;
            }
            hz8.o(av8Var2, gv9Var2, (Function2) O3);
            qnj qnjVar = ynjVar.f;
            g3j g3jVar = qnjVar instanceof g3j ? (g3j) qnjVar : null;
            if (g3jVar == null) {
                rlh rlhVar = rlh.b;
                g3jVar = new g3j(rlhVar, null, rlhVar, rlhVar, null, null, rlhVar, null, rlhVar, rlhVar, null);
            }
            SeasonSpinnerData seasonSpinnerData = g3jVar.e;
            Iterator<E> it = g3jVar.g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    gv9Var = gv9Var2;
                    obj4 = null;
                    break;
                }
                obj4 = it.next();
                h3j h3jVar = ((c3j) ((oxh) obj4).a).a;
                gv9Var = gv9Var2;
                c3j c3jVar2 = g3jVar.h;
                if (h3jVar == (c3jVar2 != null ? c3jVar2.a : null)) {
                    break;
                }
                gv9Var2 = gv9Var;
            }
            final oxh oxhVar = (oxh) obj4;
            boolean g2 = av8Var2.g(seasonSpinnerData);
            Object O4 = av8Var2.O();
            if (g2 || O4 == a99Var) {
                O4 = Boolean.valueOf(ug5.t(seasonSpinnerData != null ? seasonSpinnerData.getYear() : null));
                av8Var2.n0(O4);
            }
            final boolean booleanValue = ((Boolean) O4).booleanValue();
            final gv9 gv9Var3 = ((oxhVar == null || (c3jVar = (c3j) oxhVar.a) == null) ? null : c3jVar.a) == h3j.a ? ynjVar.b : gv9Var;
            xtc d = bkh.d(utc.a, 1.0f);
            a99 a99Var3 = a99Var;
            t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 7);
            boolean h = av8Var2.h(z) | av8Var2.g(n52Var) | av8Var2.i(g3jVar) | av8Var2.g(function1);
            if (i2 != 4 && ((i & 8) == 0 || !av8Var2.i(ynjVar))) {
                z3 = z2;
            }
            boolean g3 = h | z3 | av8Var2.g(oxhVar) | av8Var2.i(context) | av8Var2.h(booleanValue) | av8Var2.g(a) | av8Var2.i(ku3Var) | av8Var2.i(gv9Var3);
            final String str4 = str;
            boolean g4 = g3 | av8Var2.g(str4);
            Object O5 = av8Var2.O();
            if (g4 || O5 == a99Var3) {
                final g3j g3jVar2 = g3jVar;
                av8Var = av8Var2;
                Function1 function12 = new Function1() { // from class: i3j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        esa esaVar = (esa) obj5;
                        esaVar.getClass();
                        boolean z6 = z;
                        n52 n52Var2 = n52Var;
                        g3j g3jVar3 = g3j.this;
                        Function1 function13 = function1;
                        boolean z7 = booleanValue;
                        ynj ynjVar2 = ynjVar;
                        oxh oxhVar2 = oxhVar;
                        Context context3 = context;
                        Object obj6 = null;
                        esa.d(esaVar, null, null, new tc3(1145292048, new ne7(z6, n52Var2, g3jVar3, function13, z7, ynjVar2, oxhVar2, context3), true), 3);
                        if (g3jVar3.i.isEmpty()) {
                            esa.d(esaVar, null, null, tol.d, 3);
                        } else {
                            y77 y77Var = new y77(z6, n52Var2, g3jVar3, ynjVar2, a, context3, ku3Var);
                            g3jVar3 = g3jVar3;
                            esa.b(esaVar, null, new tc3(2123037257, y77Var, true), 3);
                        }
                        gv9 gv9Var4 = gv9Var3;
                        int size = gv9Var4.size();
                        ltb ltbVar = new ltb();
                        AdType.Banner banner = AdType.Banner.MainScreenSmall;
                        String str5 = str4;
                        ltbVar.put(4, new sz0(banner, l6g.L(new Pair(SearchResponseKt.SPORT_ENTITY, str5))));
                        ltbVar.put(9, new sz0(banner, l6g.L(new Pair(SearchResponseKt.SPORT_ENTITY, str5))));
                        if (gv9Var4.size() > 15) {
                            ltbVar.put(14, new sz0(banner, l6g.L(new Pair(SearchResponseKt.SPORT_ENTITY, str5))));
                        }
                        tee b0 = l6g.b0(ltbVar.d());
                        int i4 = 0;
                        while (i4 < size) {
                            g3j g3jVar4 = g3jVar3;
                            String str6 = str5;
                            esaVar.f(obj6, "performance_item", new tc3(-987070095, new k3j(i4, b0, gv9Var4, g3jVar4, str6, function13), true));
                            sz0 sz0Var = (sz0) b0.get(Integer.valueOf(i4));
                            if (sz0Var != null) {
                                AdType.Banner banner2 = sz0Var.a;
                                esaVar.f(banner2 + "_" + i4 + "_null", "banner_ads_" + banner2, new tc3(1323635312, new moa(sz0Var, 4, 0), true));
                            }
                            i4++;
                            g3jVar3 = g3jVar4;
                            str5 = str6;
                            obj6 = null;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(function12);
                O5 = function12;
            } else {
                av8Var = av8Var2;
            }
            v8a.a(d, a, C, null, null, null, false, null, (Function1) O5, av8Var, 390, PglCryptUtils.BASE64_FAILED);
        } else {
            av8Var2.W();
        }
        return Unit.a;
    }

    private final Object v(Object obj, Object obj2, Object obj3) {
        Object obj4;
        pvh pvhVar = (pvh) this.c;
        q5b q5bVar = (q5b) this.b;
        wcj wcjVar = (wcj) this.d;
        nnd nndVar = (nnd) this.e;
        xtc xtcVar = (xtc) obj;
        ((Integer) obj3).getClass();
        av8 av8Var = (av8) ((of3) obj2);
        av8Var.d0(-84507373);
        boolean booleanValue = ((Boolean) av8Var.k(dh3.x)).booleanValue();
        boolean h = av8Var.h(booleanValue);
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (h || O == a99Var) {
            O = new w84(booleanValue);
            av8Var.n0(O);
        }
        w84 w84Var = (w84) O;
        boolean z = pvhVar.a != 16;
        if (((ata) ((s8l) av8Var.k(dh3.u))).b() && q5bVar.b() && pej.d(wcjVar.b) && z) {
            av8Var.d0(-707487962);
            q80 q80Var = wcjVar.a;
            pej pejVar = new pej(wcjVar.b);
            boolean i = av8Var.i(w84Var);
            Object O2 = av8Var.O();
            if (i || O2 == a99Var) {
                O2 = new w9g(w84Var, null, 27);
                av8Var.n0(O2);
            }
            hz8.q(q80Var, pejVar, (Function2) O2, av8Var);
            boolean i2 = av8Var.i(w84Var) | av8Var.i(nndVar) | av8Var.g(wcjVar) | av8Var.i(q5bVar) | av8Var.g(pvhVar);
            Object O3 = av8Var.O();
            if (i2 || O3 == a99Var) {
                ke keVar = new ke(w84Var, nndVar, wcjVar, q5bVar, pvhVar, 14);
                av8Var.n0(keVar);
                O3 = keVar;
            }
            obj4 = td4.Z(xtcVar, (Function1) O3);
            av8Var.s(false);
        } else {
            av8Var.d0(-705473241);
            av8Var.s(false);
            obj4 = utc.a;
        }
        av8Var.s(false);
        return obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:201:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x069a  */
    @Override // defpackage.ct8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        Object obj4;
        a99 a99Var;
        double d;
        Object obj5;
        Iterator p;
        boolean g;
        boolean g2;
        boolean g3;
        boolean g4;
        boolean g5;
        String w;
        era eraVar;
        xtc z4;
        Object l50Var;
        int i2 = this.a;
        int i3 = 8;
        int i4 = 25;
        boolean z5 = false;
        a99 a99Var2 = nf3.a;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.b;
        Object obj9 = this.c;
        int i5 = 1;
        switch (i2) {
            case 0:
                hr6 hr6Var = (hr6) obj9;
                Function1 function1 = (Function1) obj8;
                xhf xhfVar = (xhf) obj7;
                qug qugVar = (qug) obj6;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((p3e) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    boolean z6 = hr6Var.t;
                    g28 g28Var = bkh.c;
                    boolean g6 = av8Var.g(function1);
                    Object O = av8Var.O();
                    if (g6 || O == a99Var2) {
                        O = new is5(14, function1);
                        av8Var.n0(O);
                    }
                    x2a.h(z6, (Function0) O, g28Var, xhfVar, null, yqo.H(-1944414650, av8Var, new qm4(i3, hr6Var, xhfVar)), yqo.H(-1694313371, av8Var, new cr6(hr6Var, qugVar, function1)), av8Var, 1769856);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 1:
                hu6 hu6Var = (hu6) obj9;
                Function1 function12 = (Function1) obj8;
                String str = (String) obj7;
                il8 il8Var = (il8) obj6;
                p3e p3eVar = (p3e) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                p3eVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(p3eVar) ? 4 : 2;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    xhf J = x2a.J(av8Var2);
                    boolean z7 = hu6Var.s;
                    xtc f0 = l98.f0(bkh.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, p3eVar.a(), 7);
                    boolean g7 = av8Var2.g(function12);
                    Object O2 = av8Var2.O();
                    if (g7 || O2 == a99Var2) {
                        O2 = new rt6(6, function12);
                        av8Var2.n0(O2);
                    }
                    x2a.h(z7, (Function0) O2, f0, J, null, yqo.H(756245746, av8Var2, new qm4(10, hu6Var, J)), yqo.H(-985978095, av8Var2, new zt6(hu6Var, function12, str, il8Var, p3eVar)), av8Var2, 1769472);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 2:
                o07 o07Var = (o07) obj9;
                FantasyCompetitionType fantasyCompetitionType = (FantasyCompetitionType) obj8;
                Context context = (Context) obj7;
                Function0 function0 = (Function0) obj6;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((av8) of3Var3).h(booleanValue) ? 4 : 2;
                }
                av8 av8Var3 = (av8) of3Var3;
                if (!av8Var3.T(intValue3 & 1, (intValue3 & 19) != 18)) {
                    av8Var3.W();
                } else if (booleanValue) {
                    av8Var3.d0(415959760);
                    s6a.f(36.0f, 4.0f, 438, 56, 0L, 0L, av8Var3, bkh.c);
                    av8Var3.s(false);
                } else {
                    av8Var3.d0(416293754);
                    kj7 kj7Var = o07Var.a;
                    gv9 gv9Var = o07Var.b;
                    if (kj7Var != null) {
                        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = kj7Var.a;
                        av8Var3.d0(416329962);
                        av8Var3.d0(1398899955);
                        StringBuilder sb = new StringBuilder();
                        int i6 = n07.a[fantasyCompetitionType.ordinal()];
                        if (i6 == 1) {
                            sb.append(fantasyRoundPlayerUiModel.o);
                        } else {
                            if (i6 != 2) {
                                zzl.b();
                                return null;
                            }
                            Float f = fantasyRoundPlayerUiModel.q;
                            float floatValue = f != null ? f.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            context.getClass();
                            sb.append(String.format(dla.d(), "%.1f %s", Arrays.copyOf(new Object[]{Float.valueOf(floatValue), context.getString(R.string.fantasy_expected_fantasy_points_short)}, 2)));
                        }
                        sb.append(" · ");
                        sb.append(s02.H(fantasyRoundPlayerUiModel.b.c, null, null, av8Var3, 4));
                        String sb2 = sb.toString();
                        av8Var3.s(false);
                        xtc f02 = l98.f0(bkh.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, 5);
                        k1c c = e12.c(uxf.c, false);
                        int hashCode = Long.hashCode(av8Var3.T);
                        aee m = av8Var3.m();
                        xtc C = fqj.C(av8Var3, f02);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var3.h0();
                        if (av8Var3.S) {
                            av8Var3.l(zg3Var);
                        } else {
                            av8Var3.q0();
                        }
                        f50 f50Var = hf3.g;
                        waa.K(av8Var3, c, f50Var);
                        ff3 ff3Var = hf3.f;
                        waa.K(av8Var3, m, ff3Var);
                        Integer valueOf = Integer.valueOf(hashCode);
                        f50 f50Var2 = hf3.j;
                        waa.K(av8Var3, valueOf, f50Var2);
                        ry ryVar = hf3.k;
                        waa.J(av8Var3, ryVar);
                        f50 f50Var3 = hf3.d;
                        waa.K(av8Var3, C, f50Var3);
                        kg0 kg0Var = ww9.f;
                        kv1 kv1Var = uxf.p;
                        utc utcVar = utc.a;
                        xtc d2 = bkh.d(utcVar, 1.0f);
                        mv1 mv1Var = uxf.g;
                        n12 n12Var = n12.a;
                        xtc a = n12Var.a(d2, mv1Var);
                        u23 a2 = t23.a(kg0Var, kv1Var, av8Var3, 54);
                        int hashCode2 = Long.hashCode(av8Var3.T);
                        aee m2 = av8Var3.m();
                        xtc C2 = fqj.C(av8Var3, a);
                        av8Var3.h0();
                        if (av8Var3.S) {
                            av8Var3.l(zg3Var);
                        } else {
                            av8Var3.q0();
                        }
                        waa.K(av8Var3, a2, f50Var);
                        waa.K(av8Var3, m2, ff3Var);
                        bf3.s(hashCode2, av8Var3, f50Var2, av8Var3, ryVar);
                        waa.K(av8Var3, C2, f50Var3);
                        long j = r13.d;
                        rha.b(oea.v(R.string.fantasy_player_of_the_round, av8Var3), null, j, av8Var3, 384, 2);
                        nq8.h(av8Var3, bkh.e(utcVar, 24.0f));
                        wnn.l(fantasyRoundPlayerUiModel.a, fantasyRoundPlayerUiModel.h, o07Var.d, bkh.l(utcVar, 72.0f), null, 24.0f, false, null, av8Var3, 199680, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE);
                        nq8.h(av8Var3, bkh.e(utcVar, 8.0f));
                        String str2 = fantasyRoundPlayerUiModel.g.f;
                        yf8 yf8Var = xth.a;
                        udj.c(str2, null, j, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.h(), av8Var3, 384, 24960, 110586);
                        nq8.h(av8Var3, bkh.e(utcVar, 4.0f));
                        udj.c(sb2, null, lz.D(R.color.on_color_secondary, av8Var3), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var3, 0, 24960, 110586);
                        nq8.h(av8Var3, bkh.e(utcVar, 16.0f));
                        if (gv9Var == null) {
                            av8Var3.d0(1998022958);
                            av8Var3.s(false);
                        } else {
                            av8Var3.d0(1998022959);
                            int i7 = 0;
                            for (Object obj10 : gv9Var) {
                                int i8 = i7 + 1;
                                if (i7 < 0) {
                                    b.q();
                                    throw null;
                                }
                                qx6 qx6Var = (qx6) obj10;
                                wn1 wn1Var = qx6Var.a;
                                gv9<ae7> gv9Var2 = qx6Var.b;
                                rz8.l(wn1Var, qx6Var.c, !(gv9Var2 == null || gv9Var2.isEmpty()), qx6Var.d, o07Var.d, l98.f0(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (!(gv9Var.size() == 1 && i7 == 0) && i7 == gv9Var.size() - 1) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 16.0f, 7), r13.d, hkg.d(4280427046L), hkg.b(1931616806), hkg.d(4291500056L), false, av8Var3, 920125440, 6, 0);
                                if (gv9Var.size() == 1) {
                                    av8Var3.d0(-1657381471);
                                    if (gv9Var2 == null) {
                                        av8Var3.d0(160781952);
                                        av8Var3.s(false);
                                        z2 = false;
                                    } else {
                                        av8Var3.d0(160781953);
                                        for (ae7 ae7Var : gv9Var2) {
                                            if (Intrinsics.c(ae7Var.a, CampaignEx.JSON_KEY_STAR)) {
                                                av8Var3.d0(956402562);
                                                u6h.k(ae7Var, false, null, r13.d, av8Var3, 3120, 4);
                                                av8Var3.s(false);
                                            } else {
                                                av8Var3.d0(956754536);
                                                u6h.l(ae7Var, false, null, r13.d, av8Var3, 3120, 4);
                                                av8Var3.s(false);
                                            }
                                        }
                                        z2 = false;
                                        av8Var3.s(false);
                                        Unit unit = Unit.a;
                                    }
                                    av8Var3.s(z2);
                                } else {
                                    av8Var3.d0(161613187);
                                    av8Var3.s(false);
                                }
                                i7 = i8;
                            }
                            av8Var3.s(false);
                            Unit unit2 = Unit.a;
                        }
                        av8Var3.s(true);
                        qx9.m(oea.v(R.string.see_all_statistics, av8Var3), function0, n12Var.a(utcVar, uxf.j), r13.d, lz.D(R.color.rating_90, av8Var3), false, av8Var3, 3072, 32);
                        av8Var3.s(true);
                        z = false;
                        av8Var3.s(false);
                    } else {
                        z = false;
                        av8Var3.d0(421230101);
                        av8Var3.s(false);
                    }
                    av8Var3.s(z);
                }
                return Unit.a;
            case 3:
                Function1 function13 = (Function1) obj8;
                pb7 pb7Var = (pb7) obj9;
                Function1 function14 = (Function1) obj7;
                Context context2 = (Context) obj6;
                uj7 uj7Var = (uj7) obj;
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                uj7Var.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((av8) of3Var4).e(uj7Var.ordinal()) ? 4 : 2;
                }
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 19) != 18)) {
                    int ordinal = uj7Var.ordinal();
                    if (ordinal == 0) {
                        av8Var4.d0(-1749126032);
                        s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 62, 0L, 0L, av8Var4, bkh.c);
                        av8Var4.s(false);
                        Unit unit3 = Unit.a;
                    } else if (ordinal == 1) {
                        av8Var4.d0(-1748974535);
                        long D = lz.D(R.color.surface_P, av8Var4);
                        xtc d0 = l98.d0(bkh.r(bkh.c, null, 3), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        boolean g8 = av8Var4.g(function13);
                        Object O3 = av8Var4.O();
                        Object obj11 = O3;
                        if (g8 || O3 == a99Var2) {
                            l77 l77Var = new l77(1, function13);
                            av8Var4.n0(l77Var);
                            obj11 = l77Var;
                        }
                        yqo.f((Function0) obj11, d0, D, av8Var4, 48, 0);
                        av8Var4.s(false);
                        Unit unit4 = Unit.a;
                    } else {
                        if (ordinal != 2) {
                            throw dmi.h(av8Var4, -1718984293, false);
                        }
                        av8Var4.d0(-1748308097);
                        ev6 ev6Var = pb7Var.f;
                        mj7 mj7Var = pb7Var.g;
                        gv9 gv9Var3 = pb7Var.o;
                        if (ev6Var == null || mj7Var == null) {
                            z3 = false;
                            av8Var4.d0(-1740199613);
                            av8Var4.s(false);
                        } else {
                            av8Var4.d0(-1748227807);
                            ev6 ev6Var2 = pb7Var.f;
                            if (ev6Var2 == null) {
                                a70.r("Required value was null.");
                                return null;
                            }
                            qug o0 = hkg.o0(av8Var4);
                            cdi P = z1a.P(o0, av8Var4);
                            Boolean bool = (Boolean) P.getValue();
                            bool.booleanValue();
                            boolean g9 = av8Var4.g(function14) | av8Var4.g(P);
                            Object O4 = av8Var4.O();
                            if (g9 || O4 == a99Var2) {
                                i = 0;
                                p97 p97Var = new p97(function14, P, null, i);
                                av8Var4.n0(p97Var);
                                obj4 = p97Var;
                            } else {
                                i = 0;
                                obj4 = O4;
                            }
                            hz8.o(av8Var4, bool, (Function2) obj4);
                            p4h p4hVar = ww9.d;
                            kv1 kv1Var2 = uxf.o;
                            u23 a3 = t23.a(p4hVar, kv1Var2, av8Var4, i);
                            int hashCode3 = Long.hashCode(av8Var4.T);
                            aee m3 = av8Var4.m();
                            utc utcVar2 = utc.a;
                            xtc C3 = fqj.C(av8Var4, utcVar2);
                            if3.k7.getClass();
                            zg3 zg3Var2 = hf3.b;
                            av8Var4.h0();
                            if (av8Var4.S) {
                                av8Var4.l(zg3Var2);
                            } else {
                                av8Var4.q0();
                            }
                            f50 f50Var4 = hf3.g;
                            waa.K(av8Var4, a3, f50Var4);
                            ff3 ff3Var2 = hf3.f;
                            waa.K(av8Var4, m3, ff3Var2);
                            Integer valueOf2 = Integer.valueOf(hashCode3);
                            f50 f50Var5 = hf3.j;
                            waa.K(av8Var4, valueOf2, f50Var5);
                            ry ryVar2 = hf3.k;
                            waa.J(av8Var4, ryVar2);
                            f50 f50Var6 = hf3.d;
                            xtc u0 = hkg.u0(ljg.g(av8Var4, C3, f50Var6, 1.0f, true), o0, false, 14);
                            u23 a4 = t23.a(p4hVar, kv1Var2, av8Var4, 0);
                            int hashCode4 = Long.hashCode(av8Var4.T);
                            aee m4 = av8Var4.m();
                            xtc C4 = fqj.C(av8Var4, u0);
                            av8Var4.h0();
                            if (av8Var4.S) {
                                av8Var4.l(zg3Var2);
                            } else {
                                av8Var4.q0();
                            }
                            waa.K(av8Var4, a4, f50Var4);
                            waa.K(av8Var4, m4, ff3Var2);
                            bf3.s(hashCode4, av8Var4, f50Var5, av8Var4, ryVar2);
                            waa.K(av8Var4, C4, f50Var6);
                            tba.e(0, 4, av8Var4, null, oea.v(R.string.fantasy_create_team_title, av8Var4), oea.v(R.string.fantasy_create_team_body, av8Var4));
                            int i9 = pb7Var.k;
                            double d3 = pb7Var.l;
                            long j2 = mj7Var.d;
                            String C5 = f5p.C(context2, mj7Var.c, mj7Var.b);
                            FantasyCompetitionType fantasyCompetitionType2 = ev6Var2.d;
                            double d4 = pb7Var.m;
                            boolean g10 = av8Var4.g(function13);
                            Object O5 = av8Var4.O();
                            if (g10) {
                                a99Var = a99Var2;
                            } else {
                                a99Var = a99Var2;
                                if (O5 != a99Var) {
                                    d = d4;
                                    obj5 = O5;
                                    n4o.g(i9, d3, d, j2, C5, (Function0) obj5, fantasyCompetitionType2, null, av8Var4, 48);
                                    dy0.a(pb7Var.w == null, null, yqo.H(1508775374, av8Var4, new s16(pb7Var, 13)), av8Var4, 384);
                                    if (pb7Var.h == null) {
                                        av8Var4.d0(-487346329);
                                        tol.b(nyd.a.a(null), yqo.H(712274237, av8Var4, new jo6(pb7Var, 25)), av8Var4, 56);
                                        av8Var4.s(false);
                                    } else {
                                        av8Var4.d0(-486021110);
                                        av8Var4.s(false);
                                    }
                                    ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                                    xtc f03 = l98.f0(l98.d0(gz8.x(bkh.d(utcVar2, 1.0f), null, null, 3), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, gv9Var3.isEmpty() ? 8.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5);
                                    u23 a5 = t23.a(ng0Var, kv1Var2, av8Var4, 6);
                                    int hashCode5 = Long.hashCode(av8Var4.T);
                                    aee m5 = av8Var4.m();
                                    xtc C6 = fqj.C(av8Var4, f03);
                                    av8Var4.h0();
                                    if (av8Var4.S) {
                                        av8Var4.q0();
                                    } else {
                                        av8Var4.l(zg3Var2);
                                    }
                                    waa.K(av8Var4, a5, f50Var4);
                                    waa.K(av8Var4, m5, ff3Var2);
                                    bf3.s(hashCode5, av8Var4, f50Var5, av8Var4, ryVar2);
                                    p = ljg.p(av8Var4, C6, f50Var6, -1836029513, gv9Var3);
                                    while (p.hasNext()) {
                                        tp7 tp7Var = (tp7) p.next();
                                        kg0 kg0Var2 = ww9.f;
                                        if (tp7Var instanceof rp7) {
                                            av8Var4.d0(-1278746716);
                                            w = oea.v(tp7Var.a, av8Var4);
                                            av8Var4.s(false);
                                        } else {
                                            if (!(tp7Var instanceof sp7)) {
                                                throw dmi.h(av8Var4, -1278749913, false);
                                            }
                                            av8Var4.d0(-1278742298);
                                            int i10 = tp7Var.a;
                                            sp7 sp7Var = (sp7) tp7Var;
                                            w = oea.w(i10, new Object[]{sp7Var.b, Integer.valueOf(sp7Var.c)}, av8Var4);
                                            av8Var4.s(false);
                                        }
                                        d2a.i(w, null, 0L, kg0Var2, av8Var4, 3072, 6);
                                    }
                                    av8Var4.s(false);
                                    av8Var4.s(true);
                                    gv9 gv9Var4 = pb7Var.j;
                                    g = av8Var4.g(function13);
                                    Object O6 = av8Var4.O();
                                    Object obj12 = O6;
                                    if (!g || O6 == a99Var) {
                                        k46 k46Var = new k46(17, function13);
                                        av8Var4.n0(k46Var);
                                        obj12 = k46Var;
                                    }
                                    t62.i(gv9Var4, ev6Var2, null, (Function1) obj12, av8Var4, 0);
                                    String v = oea.v(R.string.fantasy_create_team_info_note, av8Var4);
                                    yf8 yf8Var2 = xth.a;
                                    udj.c(v, l98.f0(l98.d0(bkh.d(utcVar2, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5), lz.D(R.color.n_lv_3, av8Var4), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 3, 0, null, xth.g(), av8Var4, 48, 24960, 109560);
                                    String v2 = oea.v(R.string.fantasy_pro_tips_button, av8Var4);
                                    long D2 = lz.D(R.color.surface_2, av8Var4);
                                    ImageVector N = s6a.N(R.drawable.ic_question_mark, 6, av8Var4);
                                    xtc d02 = l98.d0(l98.d0(utcVar2, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                                    g2 = av8Var4.g(function13) | av8Var4.g(ev6Var2);
                                    Object O7 = av8Var4.O();
                                    Object obj13 = O7;
                                    if (!g2 || O7 == a99Var) {
                                        np6 np6Var = new np6(function13, ev6Var2, 1);
                                        av8Var4.n0(np6Var);
                                        obj13 = np6Var;
                                    }
                                    x2a.d(v2, d02, N, 0L, 0L, D2, (Function0) obj13, qx9.b, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var4, 12582960, 0, 1816);
                                    av8Var4.s(true);
                                    int i11 = pb7Var.k;
                                    boolean z8 = pb7Var.n;
                                    boolean z9 = !gv9Var3.isEmpty();
                                    g3 = av8Var4.g(function13);
                                    Object O8 = av8Var4.O();
                                    Object obj14 = O8;
                                    if (!g3 || O8 == a99Var) {
                                        l77 l77Var2 = new l77(3, function13);
                                        av8Var4.n0(l77Var2);
                                        obj14 = l77Var2;
                                    }
                                    Function0 function02 = (Function0) obj14;
                                    g4 = av8Var4.g(function13);
                                    Object O9 = av8Var4.O();
                                    Object obj15 = O9;
                                    if (!g4 || O9 == a99Var) {
                                        l77 l77Var3 = new l77(4, function13);
                                        av8Var4.n0(l77Var3);
                                        obj15 = l77Var3;
                                    }
                                    Function0 function03 = (Function0) obj15;
                                    g5 = av8Var4.g(function13);
                                    Object O10 = av8Var4.O();
                                    Object obj16 = O10;
                                    if (!g5 || O10 == a99Var) {
                                        l77 l77Var4 = new l77(5, function13);
                                        av8Var4.n0(l77Var4);
                                        obj16 = l77Var4;
                                    }
                                    oyn.f(i11, z8, z9, function02, function03, (Function0) obj16, null, av8Var4, 0);
                                    av8Var4.s(true);
                                    z3 = false;
                                    av8Var4.s(false);
                                }
                            }
                            d = d4;
                            l77 l77Var5 = new l77(2, function13);
                            av8Var4.n0(l77Var5);
                            obj5 = l77Var5;
                            n4o.g(i9, d3, d, j2, C5, (Function0) obj5, fantasyCompetitionType2, null, av8Var4, 48);
                            dy0.a(pb7Var.w == null, null, yqo.H(1508775374, av8Var4, new s16(pb7Var, 13)), av8Var4, 384);
                            if (pb7Var.h == null) {
                            }
                            ng0 ng0Var2 = new ng0(8.0f, true, new a70(6));
                            xtc f032 = l98.f0(l98.d0(gz8.x(bkh.d(utcVar2, 1.0f), null, null, 3), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, gv9Var3.isEmpty() ? 8.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5);
                            u23 a52 = t23.a(ng0Var2, kv1Var2, av8Var4, 6);
                            int hashCode52 = Long.hashCode(av8Var4.T);
                            aee m52 = av8Var4.m();
                            xtc C62 = fqj.C(av8Var4, f032);
                            av8Var4.h0();
                            if (av8Var4.S) {
                            }
                            waa.K(av8Var4, a52, f50Var4);
                            waa.K(av8Var4, m52, ff3Var2);
                            bf3.s(hashCode52, av8Var4, f50Var5, av8Var4, ryVar2);
                            p = ljg.p(av8Var4, C62, f50Var6, -1836029513, gv9Var3);
                            while (p.hasNext()) {
                            }
                            av8Var4.s(false);
                            av8Var4.s(true);
                            gv9 gv9Var42 = pb7Var.j;
                            g = av8Var4.g(function13);
                            Object O62 = av8Var4.O();
                            Object obj122 = O62;
                            if (!g) {
                            }
                            k46 k46Var2 = new k46(17, function13);
                            av8Var4.n0(k46Var2);
                            obj122 = k46Var2;
                            t62.i(gv9Var42, ev6Var2, null, (Function1) obj122, av8Var4, 0);
                            String v3 = oea.v(R.string.fantasy_create_team_info_note, av8Var4);
                            yf8 yf8Var22 = xth.a;
                            udj.c(v3, l98.f0(l98.d0(bkh.d(utcVar2, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5), lz.D(R.color.n_lv_3, av8Var4), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 3, 0, null, xth.g(), av8Var4, 48, 24960, 109560);
                            String v22 = oea.v(R.string.fantasy_pro_tips_button, av8Var4);
                            long D22 = lz.D(R.color.surface_2, av8Var4);
                            ImageVector N2 = s6a.N(R.drawable.ic_question_mark, 6, av8Var4);
                            xtc d022 = l98.d0(l98.d0(utcVar2, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                            g2 = av8Var4.g(function13) | av8Var4.g(ev6Var2);
                            Object O72 = av8Var4.O();
                            Object obj132 = O72;
                            if (!g2) {
                            }
                            np6 np6Var2 = new np6(function13, ev6Var2, 1);
                            av8Var4.n0(np6Var2);
                            obj132 = np6Var2;
                            x2a.d(v22, d022, N2, 0L, 0L, D22, (Function0) obj132, qx9.b, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var4, 12582960, 0, 1816);
                            av8Var4.s(true);
                            int i112 = pb7Var.k;
                            boolean z82 = pb7Var.n;
                            boolean z92 = !gv9Var3.isEmpty();
                            g3 = av8Var4.g(function13);
                            Object O82 = av8Var4.O();
                            Object obj142 = O82;
                            if (!g3) {
                            }
                            l77 l77Var22 = new l77(3, function13);
                            av8Var4.n0(l77Var22);
                            obj142 = l77Var22;
                            Function0 function022 = (Function0) obj142;
                            g4 = av8Var4.g(function13);
                            Object O92 = av8Var4.O();
                            Object obj152 = O92;
                            if (!g4) {
                            }
                            l77 l77Var32 = new l77(4, function13);
                            av8Var4.n0(l77Var32);
                            obj152 = l77Var32;
                            Function0 function032 = (Function0) obj152;
                            g5 = av8Var4.g(function13);
                            Object O102 = av8Var4.O();
                            Object obj162 = O102;
                            if (!g5) {
                            }
                            l77 l77Var42 = new l77(5, function13);
                            av8Var4.n0(l77Var42);
                            obj162 = l77Var42;
                            oyn.f(i112, z82, z92, function022, function032, (Function0) obj162, null, av8Var4, 0);
                            av8Var4.s(true);
                            z3 = false;
                            av8Var4.s(false);
                        }
                        av8Var4.s(z3);
                        Unit unit5 = Unit.a;
                    }
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 4:
                return f(obj, obj2, obj3);
            case 5:
                ll7 ll7Var = (ll7) obj9;
                p3e p3eVar2 = (p3e) obj7;
                il8 il8Var2 = (il8) obj6;
                Function1 function15 = (Function1) obj8;
                uj7 uj7Var2 = (uj7) obj;
                of3 of3Var5 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                uj7Var2.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((av8) of3Var5).e(uj7Var2.ordinal()) ? 4 : 2;
                }
                av8 av8Var5 = (av8) of3Var5;
                if (!av8Var5.T(intValue5 & 1, (intValue5 & 19) != 18)) {
                    av8Var5.W();
                } else if (il7.b[uj7Var2.ordinal()] == 1) {
                    av8Var5.d0(-751209399);
                    s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 62, 0L, 0L, av8Var5, bkh.c);
                    av8Var5.s(false);
                } else {
                    av8Var5.d0(-750915922);
                    Object O11 = av8Var5.O();
                    Object obj17 = O11;
                    if (O11 == a99Var2) {
                        ku3 G = hz8.G(g.a, av8Var5);
                        av8Var5.n0(G);
                        obj17 = G;
                    }
                    ku3 ku3Var = (ku3) obj17;
                    qug J2 = u0a.J(av8Var5);
                    ksa a6 = msa.a(0, 0, av8Var5, 0, 3);
                    Unit unit6 = Unit.a;
                    boolean g11 = av8Var5.g(ll7Var) | av8Var5.g(a6);
                    Object O12 = av8Var5.O();
                    Object obj18 = O12;
                    if (g11 || O12 == a99Var2) {
                        hs6 hs6Var = new hs6((Object) ll7Var, (Object) a6, (rq3) (z5 ? 1 : 0), i4);
                        av8Var5.n0(hs6Var);
                        obj18 = hs6Var;
                    }
                    hz8.o(av8Var5, unit6, (Function2) obj18);
                    png pngVar = new png(8.0f, uxf.l);
                    float a7 = p3eVar2.a();
                    utc utcVar3 = utc.a;
                    xtc f04 = ml4.f0(l98.f0(hkg.u0(l98.f0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a7, 7).z(bkh.c), J2, false, 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 7));
                    kv1 kv1Var3 = uxf.o;
                    u23 a8 = t23.a(pngVar, kv1Var3, av8Var5, 6);
                    int hashCode6 = Long.hashCode(av8Var5.T);
                    aee m6 = av8Var5.m();
                    xtc C7 = fqj.C(av8Var5, f04);
                    if3.k7.getClass();
                    zg3 zg3Var3 = hf3.b;
                    av8Var5.h0();
                    if (av8Var5.S) {
                        av8Var5.l(zg3Var3);
                    } else {
                        av8Var5.q0();
                    }
                    f50 f50Var7 = hf3.g;
                    waa.K(av8Var5, a8, f50Var7);
                    ff3 ff3Var3 = hf3.f;
                    waa.K(av8Var5, m6, ff3Var3);
                    Integer valueOf3 = Integer.valueOf(hashCode6);
                    f50 f50Var8 = hf3.j;
                    waa.K(av8Var5, valueOf3, f50Var8);
                    ry ryVar3 = hf3.k;
                    waa.J(av8Var5, ryVar3);
                    f50 f50Var9 = hf3.d;
                    waa.K(av8Var5, C7, f50Var9);
                    u23 a9 = t23.a(ww9.d, kv1Var3, av8Var5, 0);
                    int hashCode7 = Long.hashCode(av8Var5.T);
                    aee m7 = av8Var5.m();
                    xtc C8 = fqj.C(av8Var5, utcVar3);
                    av8Var5.h0();
                    if (av8Var5.S) {
                        av8Var5.l(zg3Var3);
                    } else {
                        av8Var5.q0();
                    }
                    waa.K(av8Var5, a9, f50Var7);
                    waa.K(av8Var5, m7, ff3Var3);
                    bf3.s(hashCode7, av8Var5, f50Var8, av8Var5, ryVar3);
                    waa.K(av8Var5, C8, f50Var9);
                    sha.a(48, 0, av8Var5, l98.d0(utcVar3, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), oea.v(R.string.fixtures, av8Var5));
                    tol.b(nyd.a.a(null), yqo.H(-877060207, av8Var5, new kz6(15, a6, ll7Var)), av8Var5, 56);
                    av8Var5.s(true);
                    boolean z10 = ll7Var.h;
                    ho7 ho7Var = ll7Var.a;
                    dy0.a(z10, null, yqo.H(-1545490019, av8Var5, new y47(17, function15)), av8Var5, 384);
                    boolean z11 = ho7Var.g;
                    mj7 mj7Var2 = ho7Var.a;
                    if (z11) {
                        av8Var5.d0(1464498667);
                        m6k.h(24960, 8, av8Var5, l98.d0(utcVar3, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), s6a.N(R.drawable.ic_triple_captain, 6, av8Var5), oea.v(R.string.fantasy_triple_captain_active_info, av8Var5), null, false);
                        av8Var5.s(false);
                    } else {
                        av8Var5.d0(1464908859);
                        av8Var5.s(false);
                    }
                    rz0.a(new sz0(AdType.Banner.FantasySmall, l6g.L(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL), new Pair("page", "fantasy"))), null, 0, 0, true, av8Var5, 24960, 10);
                    gv9 gv9Var5 = ll7Var.c;
                    ev6 ev6Var3 = ll7Var.b;
                    il8 il8Var3 = il8Var2 == null ? il8.f : il8Var2;
                    boolean z12 = !mj7Var2.d();
                    boolean z13 = ho7Var.g;
                    boolean h = mj7Var2.h();
                    boolean g12 = av8Var5.g(function15);
                    Object O13 = av8Var5.O();
                    Object obj19 = O13;
                    if (g12 || O13 == a99Var2) {
                        k46 k46Var3 = new k46(25, function15);
                        av8Var5.n0(k46Var3);
                        obj19 = k46Var3;
                    }
                    Function1 function16 = (Function1) obj19;
                    boolean g13 = av8Var5.g(function15);
                    Object O14 = av8Var5.O();
                    Object obj20 = O14;
                    if (g13 || O14 == a99Var2) {
                        l77 l77Var6 = new l77(13, function15);
                        av8Var5.n0(l77Var6);
                        obj20 = l77Var6;
                    }
                    tol.j(gv9Var5, ev6Var3, function16, il8Var3, (Function0) obj20, z12, z13, h, null, false, null, av8Var5, 0, 1792);
                    xtc d03 = l98.d0(utcVar3, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    boolean i12 = av8Var5.i(ku3Var) | av8Var5.g(J2);
                    Object O15 = av8Var5.O();
                    Object obj21 = O15;
                    if (i12 || O15 == a99Var2) {
                        w47 w47Var = new w47(11, ku3Var, J2);
                        av8Var5.n0(w47Var);
                        obj21 = w47Var;
                    }
                    ok3.e(48, av8Var5, d03, (Function1) obj21);
                    rz0.a(new sz0(AdType.Banner.FantasyBig, l6g.L(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL), new Pair("page", "fantasy"))), null, 0, 0, true, av8Var5, 24960, 10);
                    av8Var5.s(true);
                    av8Var5.s(false);
                }
                return Unit.a;
            case 6:
                return j(obj, obj2, obj3);
            case 7:
                era eraVar2 = (era) obj9;
                xtc xtcVar = (xtc) obj8;
                vqa vqaVar = (vqa) obj7;
                e1d e1dVar = (e1d) obj6;
                mpg mpgVar = (mpg) obj;
                ((Integer) obj3).getClass();
                av8 av8Var6 = (av8) ((of3) obj2);
                Object O16 = av8Var6.O();
                Object obj22 = O16;
                if (O16 == a99Var2) {
                    tqa tqaVar = new tqa(mpgVar, new v30(29, e1dVar));
                    av8Var6.n0(tqaVar);
                    obj22 = tqaVar;
                }
                tqa tqaVar2 = (tqa) obj22;
                Object O17 = av8Var6.O();
                Object obj23 = O17;
                if (O17 == a99Var2) {
                    xji xjiVar = new xji(new wj9(tqaVar2));
                    av8Var6.n0(xjiVar);
                    obj23 = xjiVar;
                }
                xji xjiVar2 = (xji) obj23;
                if (eraVar2 != null) {
                    av8Var6.d0(1743490539);
                    av8Var6.d0(887527095);
                    Object obj24 = t5f.a;
                    if (obj24 != null) {
                        av8Var6.d0(1345554384);
                    } else {
                        av8Var6.d0(1345603457);
                        View view = (View) av8Var6.k(nz.f);
                        boolean g14 = av8Var6.g(view);
                        Object O18 = av8Var6.O();
                        if (g14 || O18 == a99Var2) {
                            Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                            r5f r5fVar = tag instanceof r5f ? (r5f) tag : null;
                            if (r5fVar == null) {
                                O18 = new u20(view);
                                view.setTag(R.id.compose_prefetch_scheduler, O18);
                            } else {
                                O18 = r5fVar;
                            }
                            av8Var6.n0(O18);
                        }
                        obj24 = (r5f) O18;
                    }
                    av8Var6.s(false);
                    Object obj25 = obj24;
                    av8Var6.s(false);
                    Object[] objArr = {eraVar2, tqaVar2, xjiVar2, obj25};
                    boolean g15 = av8Var6.g(eraVar2) | av8Var6.i(tqaVar2) | av8Var6.i(xjiVar2) | av8Var6.i(obj25);
                    Object O19 = av8Var6.O();
                    if (g15 || O19 == a99Var2) {
                        eraVar = eraVar2;
                        l50Var = new l50(eraVar, tqaVar2, xjiVar2, obj25, 29);
                        av8Var6.n0(l50Var);
                    } else {
                        l50Var = O19;
                        eraVar = eraVar2;
                    }
                    hz8.h(objArr, (Function1) l50Var, av8Var6);
                    av8Var6.s(false);
                } else {
                    eraVar = eraVar2;
                    av8Var6.d0(1744076749);
                    av8Var6.s(false);
                }
                int i13 = fra.a;
                if (eraVar != null && (z4 = xtcVar.z(new kyj(eraVar))) != null) {
                    xtcVar = z4;
                }
                boolean g16 = av8Var6.g(tqaVar2) | av8Var6.g(vqaVar);
                Object O20 = av8Var6.O();
                Object obj26 = O20;
                if (g16 || O20 == a99Var2) {
                    op9 op9Var = new op9(9, tqaVar2, vqaVar);
                    av8Var6.n0(op9Var);
                    obj26 = op9Var;
                }
                rz8.s(xjiVar2, xtcVar, (Function2) obj26, av8Var6, 8);
                return Unit.a;
            case 8:
                return o(obj, obj2, obj3);
            case 9:
                return r(obj, obj2, obj3);
            case 10:
                return a(obj, obj2, obj3);
            case 11:
                return b(obj, obj2, obj3);
            case 12:
                return c(obj, obj2, obj3);
            case 13:
                return d(obj, obj2, obj3);
            case 14:
                return e(obj, obj2, obj3);
            case 15:
                return g(obj, obj2, obj3);
            case 16:
                return h(obj, obj2, obj3);
            case 17:
                return i(obj, obj2, obj3);
            case 18:
                return k(obj, obj2, obj3);
            case 19:
                return l(obj, obj2, obj3);
            case 20:
                return m(obj, obj2, obj3);
            case 21:
                return n(obj, obj2, obj3);
            case 22:
                return p(obj, obj2, obj3);
            case 23:
                return q(obj, obj2, obj3);
            case 24:
                return s(obj, obj2, obj3);
            case 25:
                return t(obj, obj2, obj3);
            case 26:
                return u(obj, obj2, obj3);
            case 27:
                return v(obj, obj2, obj3);
            default:
                w3l w3lVar = (w3l) obj9;
                Function0 function04 = (Function0) obj8;
                WeeklyChallengeViewModel weeklyChallengeViewModel = (WeeklyChallengeViewModel) obj7;
                Function0 function05 = (Function0) obj6;
                of3 of3Var6 = (of3) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var7 = (av8) of3Var6;
                if (av8Var7.T(intValue6 & 1, (intValue6 & 17) != 16)) {
                    long j3 = w3lVar.a.b.c;
                    boolean i14 = av8Var7.i(weeklyChallengeViewModel);
                    Object O21 = av8Var7.O();
                    if (i14 || O21 == a99Var2) {
                        O21 = new w4l(weeklyChallengeViewModel, i5);
                        av8Var7.n0(O21);
                    }
                    Function0 function06 = (Function0) O21;
                    boolean g17 = av8Var7.g(function05);
                    Object O22 = av8Var7.O();
                    if (g17 || O22 == a99Var2) {
                        O22 = new rsd(28, function05);
                        av8Var7.n0(O22);
                    }
                    qea.h(j3, function04, function06, (Function0) O22, null, false, av8Var7, 0, 112);
                } else {
                    av8Var7.W();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ er6(ll7 ll7Var, p3e p3eVar, il8 il8Var, Function1 function1) {
        this.a = 5;
        this.c = ll7Var;
        this.d = p3eVar;
        this.e = il8Var;
        this.b = function1;
    }

    public /* synthetic */ er6(int i, Object obj, Object obj2, Object obj3, Function1 function1) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = function1;
        this.e = obj3;
    }

    public /* synthetic */ er6(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ er6(Function1 function1, Object obj, Function1 function12, Object obj2, int i) {
        this.a = i;
        this.b = function1;
        this.c = obj;
        this.d = function12;
        this.e = obj2;
    }

    public /* synthetic */ er6(Function1 function1, String str, Context context, il8 il8Var) {
        this.a = 6;
        this.b = function1;
        this.c = str;
        this.d = context;
        this.e = il8Var;
    }

    public /* synthetic */ er6(Function2 function2, iq3 iq3Var, ct8 ct8Var, Function0 function0) {
        this.a = 12;
        this.c = function2;
        this.b = iq3Var;
        this.d = ct8Var;
        this.e = function0;
    }
}
