package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.Menu;
import androidx.appcompat.app.AppCompatActivity;
import com.ironsource.W3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.local_persistance.BrandingTournament;
import com.sofascore.model.chat.Message;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.results.R;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import com.sofascore.results.fantasy.competition.FantasyCompetitionActivity;
import com.sofascore.results.fantasy.onboarding.FantasyOnboardingActivity;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.league.fragment.awards.LeagueAwardsFragment;
import com.sofascore.results.league.fragment.details.compose.LeaguePlayerUpdatesBottomSheet;
import com.sofascore.results.league.fragment.draft.LeagueDraftFragment;
import com.sofascore.results.league.fragment.events.LeagueEventsFragment;
import com.sofascore.results.league.fragment.rankings.LeaguePowerRankingsFragment;
import com.sofascore.results.league.fragment.transactions.LeagueTransactionsFragment;
import com.sofascore.results.main.fantasy.MainFantasyFragment;
import com.sofascore.results.main.matches.redesign.filter.MatchesFilterBottomSheetDialog;
import com.sofascore.results.matchOfTheWeek.MatchOfTheWeekBottomSheet;
import com.sofascore.results.mma.fighter.statistics.MmaFighterStatisticsFragment;
import com.sofascore.results.mma.organisation.rankings.MmaOrganisationRankingsFragment;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class faa implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ faa(l39 l39Var, lg0 lg0Var) {
        this.a = 1;
        this.b = lg0Var;
    }

    private final Object a(Object obj, Object obj2) {
        MmaOrganisationRankingsFragment mmaOrganisationRankingsFragment = (MmaOrganisationRankingsFragment) this.b;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
            List<zl2> list = (List) ((eoh) mmaOrganisationRankingsFragment.w).getValue();
            ArrayList arrayList = new ArrayList(k13.r(list, 10));
            for (zl2 zl2Var : list) {
                arrayList.add(new oxh(zl2Var, zl2Var.a, null, null, null, false, 252));
            }
            gv9 W = l6g.W(arrayList);
            oxh oxhVar = new oxh(new zl2("Quick Find", -1), mmaOrganisationRankingsFragment.requireContext().getString(R.string.quick_find), null, null, null, false, 252);
            boolean i = av8Var.i(mmaOrganisationRankingsFragment);
            Object O = av8Var.O();
            if (i || O == nf3.a) {
                O = new xpc(mmaOrganisationRankingsFragment, 4);
                av8Var.n0(O);
            }
            r4a.j(W, oxhVar, (Function1) O, null, null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, W3.l);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        if (r1.containsKey(r7) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        if (r1.containsKey(r7) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object b(Object obj, Object obj2) {
        efh efhVar;
        dfh dfhVar = (dfh) this.b;
        c7a c7aVar = (c7a) obj;
        float g = an3.g(((an3) obj2).a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        efh efhVar2 = efh.a;
        linkedHashMap.put(efhVar2, Float.valueOf(g));
        float f = g / 2.0f;
        if (((int) (c7aVar.a & 4294967295L)) > f && !dfhVar.a) {
            linkedHashMap.put(efh.c, Float.valueOf(f));
        }
        int i = (int) (c7aVar.a & 4294967295L);
        if (i != 0) {
            linkedHashMap.put(efh.b, Float.valueOf(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, g - i)));
        }
        Unit unit = Unit.a;
        ptb ptbVar = new ptb(linkedHashMap);
        int ordinal = ((efh) ((ay4) dfhVar.d.e).getValue()).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                efhVar = efh.b;
            } else {
                if (ordinal != 2) {
                    zzl.b();
                    return null;
                }
                efhVar = efh.c;
                if (!linkedHashMap.containsKey(efhVar)) {
                    efhVar = efh.b;
                }
                efhVar2 = efhVar;
            }
        }
        return new Pair(ptbVar, efhVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:301:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x086d  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        v7b v7bVar;
        kya kyaVar;
        kya kyaVar2;
        oxh oxhVar;
        boolean i;
        Object O;
        Object obj3;
        String t;
        long j;
        char c;
        long j2;
        long j3;
        long j4;
        oxh oxhVar2 = null;
        Object obj4 = null;
        int i2 = 3;
        int i3 = 2;
        final int i4 = 1;
        switch (this.a) {
            case 0:
                daa daaVar = (daa) this.b;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    utc utcVar = utc.a;
                    xtc d = bkh.d(utcVar, 1.0f);
                    l8g a = k8g.a(ww9.b, uxf.m, av8Var, 48);
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
                    xtc h = ljg.h(4.0f, bkh.l(utcVar, 40.0f), lz.D(R.color.surface_1, av8Var), 4.0f);
                    bx7 bx7Var = daaVar.j;
                    Integer num = bx7Var.c;
                    if (num == null) {
                        num = bx7Var.b;
                    }
                    td4.y(num.intValue(), 0, 12, av8Var, h, null, false);
                    xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 56.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                    u23 a2 = t23.a(ww9.d, uxf.p, av8Var, 48);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, f0);
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
                    String str = bx7Var.d;
                    String str2 = (str == null && (str = bx7Var.e) == null) ? "" : str;
                    yf8 yf8Var = xth.a;
                    udj.c(str2, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 110586);
                    String str3 = bx7Var.i;
                    udj.c(str3 == null ? "" : str3, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var, 0, 24960, 110586);
                    av8Var.s(true);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 1:
                lg0 lg0Var = (lg0) this.b;
                kx4 kx4Var = (kx4) obj;
                an3 an3Var = (an3) obj2;
                if (an3.h(an3Var.a) == Integer.MAX_VALUE) {
                    u3a.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int h2 = an3.h(an3Var.a);
                int e0 = h2 - (kx4Var.e0(lg0Var.e()) * 2);
                int i5 = e0 / 3;
                int i6 = e0 % 3;
                ArrayList arrayList = new ArrayList(3);
                int i7 = 0;
                while (i7 < 3) {
                    arrayList.add(Integer.valueOf((i7 < i6 ? 1 : 0) + i5));
                    i7++;
                }
                int[] R0 = CollectionsKt.R0(arrayList);
                int[] iArr = new int[R0.length];
                lg0Var.j(kx4Var, h2, R0, ema.a, iArr);
                return new wj9(9, R0, iArr);
            case 2:
                ((Integer) obj2).getClass();
                qea.d((dta) this.b, (of3) obj, aba.K(1));
                return Unit.a;
            case 3:
                ((Integer) obj2).getClass();
                qea.a((a3a) this.b, (of3) obj, aba.K(1));
                return Unit.a;
            case 4:
                LeagueActivity leagueActivity = (LeagueActivity) this.b;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                if (booleanValue) {
                    Menu menu = leagueActivity.d0;
                    if (menu != null) {
                        menu.performIdentifierAction(R.id.share, 0);
                    }
                    nv.u0(leagueActivity, null, "cup_tree_popup");
                } else {
                    a99 a99Var = LeagueActivity.h0;
                }
                if (booleanValue2) {
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = leagueActivity.getApplicationContext();
                        synchronized (uic.i) {
                            sharedPreferences = a5f.d(applicationContext);
                            uic.j = sharedPreferences;
                        }
                        sharedPreferences.getClass();
                    }
                    SharedPreferences.Editor i8 = dmi.i(sharedPreferences, "PREF_SCREENSHOT_DO_NOT_SHOW_AGAIN", true);
                    Unit unit = Unit.a;
                    i8.apply();
                    nv.z0(leagueActivity, kv.CLICK, "screenshot_popup", "popup");
                }
                return Unit.a;
            case 5:
                LeagueAwardsFragment leagueAwardsFragment = (LeagueAwardsFragment) this.b;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    xtc J = lz.J(utc.a, jaa.L(av8Var2), null);
                    nua nuaVar = (nua) leagueAwardsFragment.t.getValue();
                    boolean z = ((yta) leagueAwardsFragment.r.getValue()).l;
                    boolean i9 = av8Var2.i(leagueAwardsFragment);
                    Object O2 = av8Var2.O();
                    if (i9 || O2 == nf3.a) {
                        O2 = new sr8(leagueAwardsFragment, 17);
                        av8Var2.n0(O2);
                    }
                    aik.e(nuaVar, z, (Function0) O2, J, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 6:
                LeagueDraftFragment leagueDraftFragment = (LeagueDraftFragment) this.b;
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    fwa fwaVar = (fwa) leagueDraftFragment.s.getValue();
                    BrandingTournament brandingTournament = ((yta) leagueDraftFragment.r.getValue()).q;
                    if (brandingTournament != null) {
                        Context requireContext = leagueDraftFragment.requireContext();
                        requireContext.getClass();
                        v7bVar = tz9.B(requireContext, brandingTournament.getBackgroundColor(), brandingTournament.getBackgroundGradientColor());
                    } else {
                        v7bVar = null;
                    }
                    tz9.f(fwaVar, v7bVar, lz.J(utc.a, jaa.L(av8Var3), null), av8Var3, 0);
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 7:
                LeagueEventsFragment leagueEventsFragment = (LeagueEventsFragment) this.b;
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Integer) obj2).intValue();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    e1d x = rfo.x(leagueEventsFragment.G().m, av8Var4, 0);
                    e1d x2 = rfo.x(leagueEventsFragment.G().o, av8Var4, 0);
                    gv9 gv9Var = (gv9) x.getValue();
                    if (((kya) x2.getValue()) != null) {
                        Iterator<E> it = ((gv9) x.getValue()).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                Object obj5 = ((kya) ((oxh) next).a).a;
                                kya kyaVar3 = (kya) x2.getValue();
                                if (Intrinsics.c(obj5, kyaVar3 != null ? kyaVar3.a : null)) {
                                    obj4 = next;
                                }
                            }
                        }
                        oxhVar2 = (oxh) obj4;
                    } else {
                        zwa G = leagueEventsFragment.G();
                        int ordinal = G.p.ordinal();
                        if (ordinal == 1) {
                            kyaVar = (jya) G.r.getValue();
                        } else if (ordinal == 2) {
                            kyaVar = (iya) G.s.getValue();
                        } else if (ordinal != 5) {
                            kyaVar2 = null;
                            if (kyaVar2 != null) {
                                oxhVar = new oxh(kyaVar2, leagueEventsFragment.getString(kyaVar2.b()), null, null, null, false, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
                                i = av8Var4.i(leagueEventsFragment);
                                O = av8Var4.O();
                                if (!i || O == nf3.a) {
                                    O = new nwa(leagueEventsFragment, r8 ? 1 : 0);
                                    av8Var4.n0(O);
                                }
                                r4a.j(gv9Var, oxhVar, (Function1) O, null, !((Boolean) leagueEventsFragment.u.getValue()).booleanValue() ? rxh.i : sxh.i, false, new t3e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var4, 12582912, 872);
                            }
                        } else {
                            kyaVar = (hya) G.t.getValue();
                        }
                        kyaVar2 = kyaVar;
                        if (kyaVar2 != null) {
                        }
                    }
                    oxhVar = oxhVar2;
                    i = av8Var4.i(leagueEventsFragment);
                    O = av8Var4.O();
                    if (!i) {
                    }
                    O = new nwa(leagueEventsFragment, r8 ? 1 : 0);
                    av8Var4.n0(O);
                    r4a.j(gv9Var, oxhVar, (Function1) O, null, !((Boolean) leagueEventsFragment.u.getValue()).booleanValue() ? rxh.i : sxh.i, false, new t3e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var4, 12582912, 872);
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 8:
                ((Integer) obj2).getClass();
                ((lxa) this.b).a(aba.K(1), (of3) obj);
                return Unit.a;
            case 9:
                ((Integer) obj2).getClass();
                o6a.a((p4b) this.b, (of3) obj, aba.K(1));
                return Unit.a;
            case 10:
                LeaguePlayerUpdatesBottomSheet leaguePlayerUpdatesBottomSheet = (LeaguePlayerUpdatesBottomSheet) this.b;
                of3 of3Var5 = (of3) obj;
                int intValue5 = ((Integer) obj2).intValue();
                a99 a99Var2 = nf3.a;
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    e1d x3 = rfo.x(((kva) leaguePlayerUpdatesBottomSheet.x.getValue()).y, av8Var5, 0);
                    utc utcVar2 = utc.a;
                    u23 a3 = t23.a(ww9.d, uxf.o, av8Var5, 0);
                    int hashCode3 = Long.hashCode(av8Var5.T);
                    aee m3 = av8Var5.m();
                    xtc C3 = fqj.C(av8Var5, utcVar2);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var5.h0();
                    if (av8Var5.S) {
                        av8Var5.l(zg3Var2);
                    } else {
                        av8Var5.q0();
                    }
                    waa.K(av8Var5, a3, hf3.g);
                    waa.K(av8Var5, m3, hf3.f);
                    waa.K(av8Var5, Integer.valueOf(hashCode3), hf3.j);
                    waa.J(av8Var5, hf3.k);
                    waa.K(av8Var5, C3, hf3.d);
                    xtc e = fn0.e(1.0f, bkh.d(utcVar2, 1.0f), false);
                    boolean g = av8Var5.g(x3);
                    Object O3 = av8Var5.O();
                    Object obj6 = O3;
                    if (g || O3 == a99Var2) {
                        cl1 cl1Var = new cl1(x3, 6);
                        av8Var5.n0(cl1Var);
                        obj6 = cl1Var;
                    }
                    v8a.a(e, null, null, null, null, null, false, null, (Function1) obj6, av8Var5, 0, 510);
                    String v = oea.v(R.string.close, av8Var5);
                    boolean i10 = av8Var5.i(leaguePlayerUpdatesBottomSheet);
                    Object O4 = av8Var5.O();
                    Object obj7 = O4;
                    if (i10 || O4 == a99Var2) {
                        sr8 sr8Var = new sr8(leaguePlayerUpdatesBottomSheet, 24);
                        av8Var5.n0(sr8Var);
                        obj7 = sr8Var;
                    }
                    mha.h(v, (Function0) obj7, bkh.d(l98.b0(utcVar2, 16.0f), 1.0f), null, null, false, false, false, 0L, 0, 0, av8Var5, 384, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                    av8Var5.s(true);
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            case 11:
                LeaguePowerRankingsFragment leaguePowerRankingsFragment = (LeaguePowerRankingsFragment) this.b;
                of3 of3Var6 = (of3) obj;
                int intValue6 = ((Integer) obj2).intValue();
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(intValue6 & 1, (intValue6 & 3) != 2)) {
                    aza.b((eza) leaguePowerRankingsFragment.s.getValue(), ((Boolean) leaguePowerRankingsFragment.u.getValue()).booleanValue(), av8Var6, 0);
                } else {
                    av8Var6.W();
                }
                return Unit.a;
            case 12:
                hza hzaVar = (hza) this.b;
                int intValue7 = ((Integer) obj).intValue();
                int intValue8 = ((Integer) obj2).intValue();
                Iterator it2 = hzaVar.h.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj3 = it2.next();
                        jza jzaVar = (jza) obj3;
                        if (jzaVar.a.a != intValue7 || jzaVar.b.getId() != intValue8) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                jza jzaVar2 = (jza) obj3;
                if (jzaVar2 != null) {
                    Event event = jzaVar2.b;
                    Context context = hzaVar.getContext();
                    context.getClass();
                    Integer valueOf2 = Integer.valueOf(event.getId());
                    Player player = jzaVar2.c;
                    List c2 = a.c(new xoe(player, jzaVar2.b, jzaVar2.d, null, player.getTeam(), 1, null));
                    String sportSlug = event.getSportSlug();
                    String type = event.getStatus().getType();
                    int m4 = yid.m(o3a.F(event.getTournament()));
                    Boolean hasXg = event.getHasXg();
                    long startTimestamp = event.getStartTimestamp();
                    c2.getClass();
                    sportSlug.getClass();
                    PlayerEventStatisticsModal playerEventStatisticsModal = new PlayerEventStatisticsModal();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj8 : c2) {
                        if (!((xoe) obj8).a.getDisabled()) {
                            arrayList2.add(obj8);
                        }
                    }
                    playerEventStatisticsModal.setArguments(fz8.C(fz8.G("DATA", new hzd(valueOf2, null, arrayList2, sportSlug, false, false, intValue7, type, m4, hasXg, startTimestamp, null, null)), fz8.H("ANALYTICS_LOCATION", null)));
                    if (context instanceof csk) {
                        context = ((csk) context).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                    if (appCompatActivity != null) {
                        me4.n(playerEventStatisticsModal, appCompatActivity, null, wca.x(appCompatActivity.getLifecycle()));
                    }
                }
                return Unit.a;
            case 13:
                LeagueTransactionsFragment leagueTransactionsFragment = (LeagueTransactionsFragment) this.b;
                otk otkVar = leagueTransactionsFragment.r;
                of3 of3Var7 = (of3) obj;
                int intValue9 = ((Integer) obj2).intValue();
                av8 av8Var7 = (av8) of3Var7;
                if (av8Var7.T(intValue9 & 1, (intValue9 & 3) != 2)) {
                    o4b o4bVar = (o4b) leagueTransactionsFragment.s.getValue();
                    int intValue10 = ((Number) leagueTransactionsFragment.t.getValue()).intValue();
                    Season season = (Season) leagueTransactionsFragment.u.getValue();
                    l6g.r(o4bVar, intValue10, season != null ? Integer.valueOf(season.getId()) : null, ((yta) otkVar.getValue()).m(), tz9.H(((yta) otkVar.getValue()).q), null, av8Var7, 0);
                } else {
                    av8Var7.W();
                }
                return Unit.a;
            case 14:
                Player player2 = (Player) this.b;
                of3 of3Var8 = (of3) obj;
                int intValue11 = ((Integer) obj2).intValue();
                av8 av8Var8 = (av8) of3Var8;
                if (av8Var8.T(intValue11 & 1, (intValue11 & 3) != 2)) {
                    String C4 = tba.C(player2);
                    if (C4 == null || (t = StringsKt.l0(new Regex("\\b(\\p{L}\\.-?)+\\s*").replace(C4, "")).toString()) == null) {
                        t = tba.t(player2);
                    }
                    String str4 = t;
                    yf8 yf8Var2 = xth.a;
                    udj.c(str4, bkh.d(utc.a, 1.0f), lz.D(R.color.on_color_primary, av8Var8), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.n(), av8Var8, 48, 24960, 109560);
                } else {
                    av8Var8.W();
                }
                return Unit.a;
            case 15:
                ((Integer) obj2).getClass();
                m9b.j((o9b) this.b, (of3) obj, aba.K(1));
                return Unit.a;
            case 16:
                ((Integer) obj2).getClass();
                m9b.b((n9b) this.b, (of3) obj, aba.K(1));
                return Unit.a;
            case 17:
                ((Integer) obj2).getClass();
                m9b.h((t9b) this.b, (of3) obj, aba.K(1));
                return Unit.a;
            case 18:
                ((b9j) this.b).d(((dnd) obj2).a);
                return Unit.a;
            case 19:
                final MainFantasyFragment mainFantasyFragment = (MainFantasyFragment) this.b;
                of3 of3Var9 = (of3) obj;
                int intValue12 = ((Integer) obj2).intValue();
                a99 a99Var3 = nf3.a;
                av8 av8Var9 = (av8) of3Var9;
                if (!av8Var9.T(intValue12 & 1, (intValue12 & 3) != 2)) {
                    av8Var9.W();
                } else if (((Boolean) rfo.x(mainFantasyFragment.D().n, av8Var9, 0).getValue()).booleanValue()) {
                    av8Var9.d0(-376708220);
                    final Context context2 = (Context) av8Var9.k(nz.b);
                    Activity activity = (Activity) av8Var9.k(ngb.a);
                    ypb D = mainFantasyFragment.D();
                    boolean i11 = av8Var9.i(mainFantasyFragment) | av8Var9.i(context2);
                    Object O5 = av8Var9.O();
                    Object obj9 = O5;
                    if (i11 || O5 == a99Var3) {
                        final int i12 = r8 ? 1 : 0;
                        Function1 function1 = new Function1() { // from class: epb
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj10) {
                                int i13 = i12;
                                Context context3 = context2;
                                MainFantasyFragment mainFantasyFragment2 = mainFantasyFragment;
                                switch (i13) {
                                    case 0:
                                        do7 do7Var = (do7) obj10;
                                        do7Var.getClass();
                                        de deVar = mainFantasyFragment2.v;
                                        int i14 = FantasyCompetitionActivity.R;
                                        deVar.a(mx9.t(context3, do7Var, null), null);
                                        break;
                                    default:
                                        de deVar2 = mainFantasyFragment2.w;
                                        int i15 = FantasyOnboardingActivity.M;
                                        deVar2.a(uic.o(context3, (Integer) obj10, true, 8), null);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var9.n0(function1);
                        obj9 = function1;
                    }
                    Function1 function12 = (Function1) obj9;
                    boolean i13 = av8Var9.i(mainFantasyFragment) | av8Var9.i(context2);
                    Object O6 = av8Var9.O();
                    Object obj10 = O6;
                    if (i13 || O6 == a99Var3) {
                        Function1 function13 = new Function1() { // from class: epb
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj102) {
                                int i132 = i4;
                                Context context3 = context2;
                                MainFantasyFragment mainFantasyFragment2 = mainFantasyFragment;
                                switch (i132) {
                                    case 0:
                                        do7 do7Var = (do7) obj102;
                                        do7Var.getClass();
                                        de deVar = mainFantasyFragment2.v;
                                        int i14 = FantasyCompetitionActivity.R;
                                        deVar.a(mx9.t(context3, do7Var, null), null);
                                        break;
                                    default:
                                        de deVar2 = mainFantasyFragment2.w;
                                        int i15 = FantasyOnboardingActivity.M;
                                        deVar2.a(uic.o(context3, (Integer) obj102, true, 8), null);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var9.n0(function13);
                        obj10 = function13;
                    }
                    Function1 function14 = (Function1) obj10;
                    boolean i14 = av8Var9.i(context2) | av8Var9.i(mainFantasyFragment);
                    Object O7 = av8Var9.O();
                    Object obj11 = O7;
                    if (i14 || O7 == a99Var3) {
                        cpb cpbVar = new cpb(context2, mainFantasyFragment, i2);
                        av8Var9.n0(cpbVar);
                        obj11 = cpbVar;
                    }
                    Function0 function0 = (Function0) obj11;
                    boolean i15 = av8Var9.i(activity);
                    Object O8 = av8Var9.O();
                    Object obj12 = O8;
                    if (i15 || O8 == a99Var3) {
                        iq7 iq7Var = new iq7(activity, i3);
                        av8Var9.n0(iq7Var);
                        obj12 = iq7Var;
                    }
                    Function0 function02 = (Function0) obj12;
                    boolean i16 = av8Var9.i(activity);
                    Object O9 = av8Var9.O();
                    Object obj13 = O9;
                    if (i16 || O9 == a99Var3) {
                        ida idaVar = new ida(activity, 18);
                        av8Var9.n0(idaVar);
                        obj13 = idaVar;
                    }
                    Function1 function15 = (Function1) obj13;
                    boolean i17 = av8Var9.i(mainFantasyFragment) | av8Var9.i(context2);
                    Object O10 = av8Var9.O();
                    Object obj14 = O10;
                    if (i17 || O10 == a99Var3) {
                        cpb cpbVar2 = new cpb(mainFantasyFragment, context2, r8 ? 1 : 0);
                        av8Var9.n0(cpbVar2);
                        obj14 = cpbVar2;
                    }
                    Function0 function03 = (Function0) obj14;
                    boolean i18 = av8Var9.i(mainFantasyFragment) | av8Var9.i(context2);
                    Object O11 = av8Var9.O();
                    Object obj15 = O11;
                    if (i18 || O11 == a99Var3) {
                        cpb cpbVar3 = new cpb(mainFantasyFragment, context2, i4);
                        av8Var9.n0(cpbVar3);
                        obj15 = cpbVar3;
                    }
                    Function0 function04 = (Function0) obj15;
                    boolean i19 = av8Var9.i(activity);
                    Object O12 = av8Var9.O();
                    Object obj16 = O12;
                    if (i19 || O12 == a99Var3) {
                        iq7 iq7Var2 = new iq7(activity, i4);
                        av8Var9.n0(iq7Var2);
                        obj16 = iq7Var2;
                    }
                    Function0 function05 = (Function0) obj16;
                    boolean i20 = av8Var9.i(context2) | av8Var9.i(mainFantasyFragment);
                    Object O13 = av8Var9.O();
                    Object obj17 = O13;
                    if (i20 || O13 == a99Var3) {
                        cpb cpbVar4 = new cpb(context2, mainFantasyFragment, i3);
                        av8Var9.n0(cpbVar4);
                        obj17 = cpbVar4;
                    }
                    nq8.e(D, function12, function14, function0, function02, function15, function03, function04, function05, (Function0) obj17, av8Var9, 0);
                    av8Var9.s(false);
                } else {
                    av8Var9.d0(-374934214);
                    av8Var9.s(false);
                }
                return Unit.a;
            case 20:
                MatchOfTheWeekBottomSheet matchOfTheWeekBottomSheet = (MatchOfTheWeekBottomSheet) this.b;
                otk otkVar2 = matchOfTheWeekBottomSheet.C;
                of3 of3Var10 = (of3) obj;
                int intValue13 = ((Integer) obj2).intValue();
                av8 av8Var10 = (av8) of3Var10;
                if (av8Var10.T(intValue13 & 1, (intValue13 & 3) != 2)) {
                    e1d x4 = rfo.x(((axb) otkVar2.getValue()).f, av8Var10, 0);
                    hof hofVar = ((axb) otkVar2.getValue()).h;
                    boolean i21 = av8Var10.i(matchOfTheWeekBottomSheet);
                    Object O14 = av8Var10.O();
                    if (i21 || O14 == nf3.a) {
                        O14 = new hwb(matchOfTheWeekBottomSheet, r8 ? 1 : 0);
                        av8Var10.n0(O14);
                    }
                    w1a.c(hofVar, null, (Function1) O14, av8Var10, 0, 14);
                    ktm.t((vnb) x4.getValue(), null, true, onb.a, un0.i, yqo.H(1541777960, av8Var10, new bba(matchOfTheWeekBottomSheet, 10)), av8Var10, 224640, 2);
                } else {
                    av8Var10.W();
                }
                return Unit.a;
            case 21:
                MatchesFilterBottomSheetDialog matchesFilterBottomSheetDialog = (MatchesFilterBottomSheetDialog) this.b;
                otk otkVar3 = matchesFilterBottomSheetDialog.C;
                of3 of3Var11 = (of3) obj;
                int intValue14 = ((Integer) obj2).intValue();
                Object obj18 = nf3.a;
                av8 av8Var11 = (av8) of3Var11;
                if (av8Var11.T(intValue14 & 1, (intValue14 & 3) != 2)) {
                    hof hofVar2 = ((dyb) otkVar3.getValue()).h;
                    boolean i22 = av8Var11.i(matchesFilterBottomSheetDialog);
                    Object O15 = av8Var11.O();
                    Object obj19 = O15;
                    if (i22 || O15 == obj18) {
                        Object idaVar2 = new ida(matchesFilterBottomSheetDialog, 22);
                        av8Var11.n0(idaVar2);
                        obj19 = idaVar2;
                    }
                    w1a.c(hofVar2, null, (Function1) obj19, av8Var11, 0, 14);
                    av8Var11.d0(606330149);
                    ksa a4 = msa.a(0, 0, av8Var11, 0, 3);
                    matchesFilterBottomSheetDialog.F(a4, null, av8Var11, 0);
                    av8Var11.s(false);
                    dyb dybVar = (dyb) otkVar3.getValue();
                    boolean i23 = av8Var11.i(matchesFilterBottomSheetDialog);
                    Object O16 = av8Var11.O();
                    if (i23 || O16 == obj18) {
                        Object fl8Var = new fl8(0, matchesFilterBottomSheetDialog, MatchesFilterBottomSheetDialog.class, "dismiss", "dismiss()V", 0, 7);
                        av8Var11.n0(fl8Var);
                        O16 = fl8Var;
                    }
                    wnn.r(dybVar, a4, (Function0) ((KFunction) O16), av8Var11, 0);
                } else {
                    av8Var11.W();
                }
                return Unit.a;
            case 22:
                ((Integer) obj2).getClass();
                ((n4c) this.b).a(aba.K(1), (of3) obj);
                return Unit.a;
            case 23:
                fhc fhcVar = (fhc) this.b;
                Message message = (Message) obj;
                Integer num2 = (Integer) obj2;
                num2.getClass();
                message.getClass();
                fhcVar.n.invoke(Integer.valueOf(fhcVar.i.indexOf(message)), num2);
                return Unit.a;
            case 24:
                MmaFighterStatisticsFragment mmaFighterStatisticsFragment = (MmaFighterStatisticsFragment) this.b;
                of3 of3Var12 = (of3) obj;
                int intValue15 = ((Integer) obj2).intValue();
                av8 av8Var12 = (av8) of3Var12;
                if (av8Var12.T(intValue15 & 1, (intValue15 & 3) != 2)) {
                    moc mocVar = (moc) mmaFighterStatisticsFragment.t.getValue();
                    boolean i24 = av8Var12.i(mocVar);
                    Object O17 = av8Var12.O();
                    if (i24 || O17 == nf3.a) {
                        v9b v9bVar = new v9b(1, mocVar, moc.class, "setDisplayMode", "setDisplayMode(Lcom/sofascore/common/MmaStatsDisplayMode;)V", 0, 14);
                        av8Var12.n0(v9bVar);
                        O17 = v9bVar;
                    }
                    wba.a(false, (Function1) ((KFunction) O17), av8Var12, 6);
                } else {
                    av8Var12.W();
                }
                return Unit.a;
            case 25:
                return zoc.j((zoc) this.b, (of3) obj, ((Integer) obj2).intValue());
            case 26:
                return a(obj, obj2);
            case 27:
                ((Integer) obj2).getClass();
                ((osc) this.b).a(aba.K(1), (of3) obj);
                return Unit.a;
            case 28:
                return b(obj, obj2);
            default:
                tyc tycVar = (tyc) this.b;
                Set set = (Set) obj;
                synchronized (tycVar.b) {
                    try {
                        x0d x0dVar = tycVar.c;
                        lsb lsbVar = new lsb(12, set, tycVar);
                        i5k.e(1, lsbVar);
                        Object[] objArr = x0dVar.b;
                        long[] jArr = x0dVar.a;
                        int length = jArr.length - 2;
                        long j5 = -9187201950435737472L;
                        if (length >= 0) {
                            int i25 = 0;
                            c = 7;
                            j2 = 128;
                            while (true) {
                                long j6 = jArr[i25];
                                j3 = 255;
                                if ((((~j6) << 7) & j6 & j5) != j5) {
                                    int i26 = 8 - ((~(i25 - length)) >>> 31);
                                    int i27 = 0;
                                    while (i27 < i26) {
                                        if ((j6 & 255) < 128) {
                                            j4 = j5;
                                            lsbVar.invoke(objArr[(i25 << 3) + i27]);
                                        } else {
                                            j4 = j5;
                                        }
                                        j6 >>= 8;
                                        i27++;
                                        j5 = j4;
                                    }
                                    j = j5;
                                    if (i26 == 8) {
                                    }
                                } else {
                                    j = j5;
                                }
                                if (i25 != length) {
                                    i25++;
                                    j5 = j;
                                }
                            }
                        } else {
                            j = -9187201950435737472L;
                            c = 7;
                            j2 = 128;
                            j3 = 255;
                        }
                        y0d y0dVar = tycVar.e;
                        Object[] objArr2 = y0dVar.b;
                        long[] jArr2 = y0dVar.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i28 = 0;
                            while (true) {
                                long j7 = jArr2[i28];
                                if ((((~j7) << c) & j7 & j) != j) {
                                    int i29 = 8 - ((~(i28 - length2)) >>> 31);
                                    for (int i30 = 0; i30 < i29; i30++) {
                                        if ((j7 & j3) < j2) {
                                            ((l4h) objArr2[(i28 << 3) + i30]).d(Unit.a);
                                        }
                                        j7 >>= 8;
                                    }
                                    if (i29 != 8) {
                                    }
                                }
                                if (i28 != length2) {
                                    i28++;
                                }
                            }
                        }
                        tycVar.e.b();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Unit.a;
        }
    }

    public /* synthetic */ faa(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ faa(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
