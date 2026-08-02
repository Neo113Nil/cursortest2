package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.view.SurfaceView;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.preference.Preference;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C4227o2;
import com.sofascore.model.Country;
import com.sofascore.model.Sports;
import com.sofascore.model.database.DbPlayerOfTheMatchVote;
import com.sofascore.model.mvvm.model.DbMyPlayer;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.mvvm.model.PlayerMatchesEventStatistics;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.AttributeOverviewResponse;
import com.sofascore.model.newNetwork.PlayerEventsListResponse;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerCareerStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerSeasonStatisticsInfo;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.dialog.SettingsItem;
import com.sofascore.results.onboarding.OnboardingViewModel;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.player.matches.PlayerEventsFragment;
import com.sofascore.results.player.statistics.career.modal.CareerStatsFilterModal;
import com.sofascore.results.pots.mostAwards.bottomSheet.POTSPlayerAwardsBottomSheet;
import com.sofascore.results.profile.editor.ProfileEditorTournamentsModal;
import com.sofascore.results.profile.following.ProfileFollowingFragment;
import com.sofascore.results.settings.PreferenceFragment;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ord implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ord(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x033b  */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v31, types: [km5] */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String str;
        List c;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        Object obj2;
        int i;
        int i2;
        SharedPreferences d;
        ?? r6;
        ConstraintLayout constraintLayout3;
        boolean z;
        Map<Integer, PlayerMatchesEventStatistics> statisticsMap;
        int i3 = 12;
        int i4 = 7;
        int i5 = 5;
        int i6 = 3;
        int i7 = 2;
        boolean z2 = false;
        int i8 = 0;
        z2 = false;
        rq3 rq3Var = null;
        int i9 = 1;
        switch (this.a) {
            case 0:
                cdi cdiVar = (cdi) this.b;
                znh znhVar = (znh) this.c;
                f4g f4gVar = (f4g) obj;
                f4gVar.getClass();
                f4gVar.b(((Number) cdiVar.getValue()).floatValue());
                f4gVar.y((1.0f - ((Number) cdiVar.getValue()).floatValue()) * znhVar.h());
                return Unit.a;
            case 1:
                BaseActivity baseActivity = (BaseActivity) this.b;
                OnboardingViewModel onboardingViewModel = (OnboardingViewModel) this.c;
                mrd mrdVar = (mrd) obj;
                mrdVar.getClass();
                if (!mrdVar.equals(mrd.a)) {
                    zzl.b();
                    return null;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    p4h.t(baseActivity, true, new asd(onboardingViewModel, i7), null, 56);
                }
                return Unit.a;
            case 2:
                BaseActivity baseActivity2 = (BaseActivity) this.b;
                Function0 function0 = (Function0) this.c;
                ((Boolean) obj).getClass();
                zsd zsdVar = zsd.Continue;
                zic zicVar = xsd.c;
                nv.d0(baseActivity2, C4227o2.x, "continue", 3);
                function0.invoke();
                return Unit.a;
            case 3:
                ysd ysdVar = (ysd) this.b;
                Function1 function1 = (Function1) this.c;
                yoa yoaVar = (yoa) obj;
                yoaVar.getClass();
                gv9 gv9Var = ysdVar.c;
                yoaVar.l(gv9Var.size(), null, new xo(gv9Var, 25), new tc3(-1117249557, new l46(gv9Var, ysdVar, function1, 6), true));
                return Unit.a;
            case 4:
                b1e b1eVar = (b1e) this.b;
                e1e e1eVar = (e1e) this.c;
                ((vnb) obj).getClass();
                ArrayList arrayList = dv3.a;
                List list = tv3.a;
                List<Country> H0 = CollectionsKt.H0(arrayList, tv3.b(b1eVar.i()));
                ArrayList arrayList2 = new ArrayList(k13.r(H0, 10));
                for (Country country : H0) {
                    arrayList2.add(new c1e(tv3.c(b1eVar.i(), country.getName()), country.getIso2Alpha()));
                }
                gv9 W = l6g.W(arrayList2);
                b7 K = l6g.K(new v28("All", new q9k(R.string.filter_category_all)), new v28(Gender.Male.getValue(), new q9k(R.string.filter_gender_men)), new v28(Gender.Female.getValue(), new q9k(R.string.filter_gender_women)));
                b7 K2 = l6g.K(new v28("All", new q9k(R.string.filter_category_all)), new v28("F", new n9k(R.string.football_forward, null)), new v28(PlayerKt.FOOTBALL_MIDFIELDER, new n9k(R.string.football_midfielder, null)), new v28("D", new n9k(R.string.football_defender, null)), new v28("G", new n9k(R.string.goalkeeper, null)));
                m28 m28Var = new m28("nationality", e1eVar.a, W, new q9k(R.string.nationality), true);
                m28 m28Var2 = new m28("team", e1eVar.b, rlh.b, new q9k(R.string.club), false);
                q9k q9kVar = new q9k(R.string.filter_gender);
                Gender gender = e1eVar.c;
                if (gender == null || (str = gender.getValue()) == null) {
                    str = ((v28) CollectionsKt.Y(K)).a;
                }
                u28 u28Var = new u28(InneractiveMediationDefs.KEY_GENDER, q9kVar, (gv9) K, str, (b7) null, false, 112);
                q9k q9kVar2 = new q9k(R.string.player_position);
                String str2 = e1eVar.d;
                if (str2 == null) {
                    str2 = ((v28) CollectionsKt.Y(K2)).a;
                }
                return new unb(new r0e(m28Var, m28Var2, u28Var, new u28("position", q9kVar2, (gv9) K2, str2, (b7) null, false, 112)));
            case 5:
                cdi cdiVar2 = (cdi) this.b;
                POTSPlayerAwardsBottomSheet pOTSPlayerAwardsBottomSheet = (POTSPlayerAwardsBottomSheet) this.c;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                if (((gv9) cdiVar2.getValue()).isEmpty()) {
                    esaVar.f("LoadingIndicator", "LoadingIndicator", td4.c);
                } else {
                    esaVar.f("Header", "Header", td4.d);
                }
                gv9 gv9Var2 = (gv9) cdiVar2.getValue();
                esaVar.a(gv9Var2.size(), null, new wsd(i9, new etd(i4), gv9Var2), new tc3(802480018, new aj(i3, gv9Var2, pOTSPlayerAwardsBottomSheet), true));
                return Unit.a;
            case 6:
                c3e c3eVar = (c3e) this.b;
                Function1 function12 = (Function1) this.c;
                esa esaVar2 = (esa) obj;
                esaVar2.getClass();
                gv9 gv9Var3 = c3eVar.a;
                esaVar2.a(gv9Var3.size(), new wsd(i7, new etd(r7), gv9Var3), new wsd(i6, new etd(9), gv9Var3), new tc3(802480018, new vw5(gv9Var3, function12, i5), true));
                return Unit.a;
            case 7:
                o3e o3eVar = (o3e) this.b;
                qhe qheVar = (qhe) this.c;
                phe pheVar = (phe) obj;
                boolean z3 = o3eVar.s;
                float f = o3eVar.o;
                if (z3) {
                    phe.h(pheVar, qheVar, pheVar.e0(f), pheVar.e0(o3eVar.p));
                } else {
                    pheVar.e(qheVar, pheVar.e0(f), pheVar.e0(o3eVar.p), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                return Unit.a;
            case 8:
                ((Function2) this.b).invoke(Integer.valueOf(((q5f) obj).a), Integer.valueOf(((sx2) this.c).A().b));
                return Unit.a;
            case 9:
                e1d e1dVar = (e1d) this.b;
                phe pheVar2 = (phe) obj;
                s80 s80Var = new s80((ArrayList) this.c, i6);
                pheVar2.a = true;
                s80Var.invoke(pheVar2);
                pheVar2.a = false;
                e1dVar.getValue();
                return Unit.a;
            case 10:
                q50 q50Var = (q50) this.b;
                q50 q50Var2 = (q50) this.c;
                f4g f4gVar2 = (f4g) obj;
                f4gVar2.getClass();
                f4gVar2.b(((Number) q50Var.d()).floatValue());
                f4gVar2.k(((Number) q50Var2.d()).floatValue());
                f4gVar2.l(((Number) q50Var2.d()).floatValue());
                f4gVar2.e(1);
                return Unit.a;
            case 11:
                PlayerActivity playerActivity = (PlayerActivity) this.b;
                Player player = (Player) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i10 = PlayerActivity.Z;
                if (booleanValue) {
                    p1f z4 = playerActivity.z();
                    int Y = playerActivity.Y();
                    qef qefVar = qef.PLAYER;
                    if (z4.a(new y0f(Y, qefVar))) {
                        ple X = playerActivity.X();
                        X.h.b(X.j, qefVar);
                    }
                } else {
                    Set set = aef.a;
                    x0f b = aef.b(playerActivity, player, fv.PLAYER_SCREEN);
                    if (b != null && playerActivity.z().a(b)) {
                        aef.c(playerActivity.A(), b.i);
                    }
                }
                return Unit.a;
            case 12:
                CareerStatsFilterModal.CareerStatsFilterData careerStatsFilterData = (CareerStatsFilterModal.CareerStatsFilterData) this.b;
                PlayerCareerStatistics playerCareerStatistics = (PlayerCareerStatistics) this.c;
                List<PlayerSeasonStatisticsInfo> list2 = (List) obj;
                list2.getClass();
                Team team = careerStatsFilterData.a;
                if (team != null && (c = a.c(Integer.valueOf(team.getId()))) != null) {
                    return c;
                }
                ArrayList arrayList3 = new ArrayList();
                for (PlayerSeasonStatisticsInfo playerSeasonStatisticsInfo : list2) {
                    List seasons = playerCareerStatistics.getSeasons();
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : seasons) {
                        Season season = ((PlayerSeasonStatisticsInfo) obj3).getSeason();
                        Integer valueOf = season != null ? Integer.valueOf(season.getId()) : null;
                        Season season2 = playerSeasonStatisticsInfo.getSeason();
                        if (Intrinsics.c(valueOf, season2 != null ? Integer.valueOf(season2.getId()) : null)) {
                            arrayList4.add(obj3);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        Team team2 = ((PlayerSeasonStatisticsInfo) it.next()).getTeam();
                        Integer valueOf2 = team2 != null ? Integer.valueOf(team2.getId()) : null;
                        if (valueOf2 != null) {
                            arrayList5.add(valueOf2);
                        }
                    }
                    o13.v(arrayList5, arrayList3);
                }
                return CollectionsKt.S0(CollectionsKt.V0(arrayList3));
            case 13:
                aoe aoeVar = (aoe) this.b;
                DbMyPlayer dbMyPlayer = (DbMyPlayer) this.c;
                glg glgVar = (glg) obj;
                glgVar.getClass();
                return Long.valueOf(aoeVar.b.b0(glgVar, dbMyPlayer));
            case 14:
                return moe.o((moe) this.b, (AttributeOverviewResponse) this.c, ((Integer) obj).intValue());
            case 15:
                return cpe.t((cpe) this.b, (gpe) this.c, obj);
            case 16:
                return cpe.q((cpe) this.b, (gpe) this.c, obj);
            case 17:
                PlayerEventsFragment playerEventsFragment = (PlayerEventsFragment) this.b;
                zse zseVar = (zse) this.c;
                List list3 = (List) obj;
                list3.getClass();
                playerEventsFragment.n();
                if (list3.isEmpty()) {
                    dt5 D = playerEventsFragment.D();
                    if (D != null && (constraintLayout3 = D.a) != null) {
                        constraintLayout3.setVisibility(8);
                    }
                    playerEventsFragment.C().F(a.c(playerEventsFragment.y));
                } else if (playerEventsFragment.u) {
                    dt5 D2 = playerEventsFragment.D();
                    if (D2 != null && (constraintLayout2 = D2.a) != null) {
                        constraintLayout2.setVisibility(0);
                    }
                    playerEventsFragment.C().F(list3);
                    ((u6e) playerEventsFragment.D.getValue()).f = true;
                } else {
                    dt5 D3 = playerEventsFragment.D();
                    if (D3 != null && (constraintLayout = D3.a) != null) {
                        constraintLayout.setVisibility(0);
                    }
                    playerEventsFragment.C().X(list3);
                }
                List list4 = zseVar.g;
                int size = list4 != null ? list4.size() : 0;
                if (size > 0 && playerEventsFragment.E().size() != size + 1) {
                    String string = playerEventsFragment.getString(R.string.all_competitions);
                    string.getClass();
                    List c2 = a.c(new gqe(null, string, false));
                    List<UniqueTournament> list5 = zseVar.g;
                    if (list5 != null) {
                        r6 = new ArrayList(k13.r(list5, 10));
                        for (UniqueTournament uniqueTournament : list5) {
                            Integer valueOf3 = Integer.valueOf(uniqueTournament.getId());
                            String x = tba.x(uniqueTournament);
                            if (x == null) {
                                x = "";
                            }
                            Boolean hasLiveRating = uniqueTournament.getHasLiveRating();
                            Boolean bool = Boolean.TRUE;
                            r6.add(new gqe(valueOf3, x, Intrinsics.c(hasLiveRating, bool) || Intrinsics.c(uniqueTournament.getHasRating(), bool)));
                        }
                    } else {
                        r6 = 0;
                    }
                    if (r6 == 0) {
                        r6 = km5.a;
                    }
                    ((eoh) playerEventsFragment.z).setValue(CollectionsKt.w0(r6, c2));
                    ((eoh) playerEventsFragment.A).setValue((gqe) CollectionsKt.firstOrNull(playerEventsFragment.E()));
                }
                if (playerEventsFragment.u) {
                    if (zseVar.e.isEmpty()) {
                        TypeHeaderView typeHeaderView = (TypeHeaderView) playerEventsFragment.G.getValue();
                        if (typeHeaderView != null) {
                            typeHeaderView.setVisibility(8);
                        }
                    } else if (!playerEventsFragment.G().equals(Sports.BASEBALL)) {
                        Set set2 = wyh.a;
                        if (CollectionsKt.R(wyh.k, playerEventsFragment.G())) {
                            kp5 kp5Var = playerEventsFragment.G().equals(Sports.BASKETBALL) ? is1.h : oxk.g;
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj4 : kp5Var) {
                                if (((xse) obj4) != is1.e || playerEventsFragment.H()) {
                                    arrayList6.add(obj4);
                                }
                            }
                            ArrayList arrayList7 = new ArrayList(k13.r(arrayList6, 10));
                            Iterator it2 = arrayList6.iterator();
                            while (it2.hasNext()) {
                                arrayList7.add(((xse) it2.next()).getValue());
                            }
                            TypeHeaderView typeHeaderView2 = (TypeHeaderView) playerEventsFragment.G.getValue();
                            if (typeHeaderView2 != null) {
                                Context requireContext = playerEventsFragment.requireContext();
                                requireContext.getClass();
                                SharedPreferences sharedPreferences = uic.j;
                                if (sharedPreferences == null) {
                                    Context applicationContext = requireContext.getApplicationContext();
                                    synchronized (uic.i) {
                                        d = a5f.d(applicationContext);
                                        uic.j = d;
                                    }
                                    d.getClass();
                                    sharedPreferences = d;
                                }
                                typeHeaderView2.y(arrayList7, sharedPreferences.getString("PREF_STATISTICS_HEADER_VIEW_SELECTION_TYPE_".concat(playerEventsFragment.G()), null), Boolean.TRUE);
                            }
                        }
                    }
                }
                if (playerEventsFragment.G().equals(Sports.BASEBALL)) {
                    HashMap hashMap = zseVar.e;
                    if (hashMap.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it3 = hashMap.entrySet().iterator();
                        i = 0;
                        while (it3.hasNext()) {
                            if (((PlayerMatchesEventStatistics) ((Map.Entry) it3.next()).getValue()).getPitchingInningsPitched() > 0.0d) {
                                i++;
                            }
                        }
                    }
                    HashMap hashMap2 = zseVar.e;
                    if (hashMap2.isEmpty()) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        for (Map.Entry entry : hashMap2.entrySet()) {
                            if (((PlayerMatchesEventStatistics) entry.getValue()).getBattingGamesPlayed() > 0 || ((PlayerMatchesEventStatistics) entry.getValue()).getBattingAtBats() > 0) {
                                i2++;
                            }
                        }
                    }
                    playerEventsFragment.B = i > 0;
                    playerEventsFragment.C = i2 > 0;
                    playerEventsFragment.I(Boolean.valueOf(i > i2));
                }
                ComposeView composeView = (ComposeView) playerEventsFragment.H.getValue();
                if (composeView != null) {
                    composeView.setVisibility(playerEventsFragment.E().size() > 1 ? 0 : 8);
                }
                playerEventsFragment.u = false;
                Integer num = playerEventsFragment.s;
                if (num != null && num.intValue() != 0) {
                    Iterator it4 = playerEventsFragment.E().iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj2 = it4.next();
                            if (Intrinsics.c(((gqe) obj2).a, playerEventsFragment.s)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    gqe gqeVar = (gqe) obj2;
                    if (gqeVar == null) {
                        gqeVar = (gqe) CollectionsKt.firstOrNull(playerEventsFragment.E());
                    }
                    ((eoh) playerEventsFragment.A).setValue(gqeVar);
                    playerEventsFragment.u = true;
                    playerEventsFragment.u();
                    playerEventsFragment.s = null;
                }
                return Unit.a;
            case 18:
                PlayerEventsFragment playerEventsFragment2 = (PlayerEventsFragment) this.b;
                xse xseVar = (xse) this.c;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                editor.getClass();
                editor.putString("PREF_STATISTICS_HEADER_VIEW_SELECTION_TYPE_".concat(playerEventsFragment2.G()), xseVar.getValue());
                return Unit.a;
            case 19:
                PlayerEventsFragment playerEventsFragment3 = (PlayerEventsFragment) this.b;
                s6e s6eVar = (s6e) this.c;
                use useVar = (use) obj;
                useVar.getClass();
                x2g x2gVar = useVar.b;
                if (playerEventsFragment3.G().equals(Sports.BASEBALL) && (x2gVar instanceof v2g)) {
                    Object obj5 = ((v2g) x2gVar).a;
                    Map<Integer, PlayerMatchesEventStatistics> statisticsMap2 = ((PlayerEventsListResponse) obj5).getStatisticsMap();
                    if (!statisticsMap2.isEmpty()) {
                        Iterator<Map.Entry<Integer, PlayerMatchesEventStatistics>> it5 = statisticsMap2.entrySet().iterator();
                        while (it5.hasNext()) {
                            if (it5.next().getValue().getPitchingInningsPitched() > 0.0d) {
                                z = true;
                                playerEventsFragment3.B = z;
                                statisticsMap = ((PlayerEventsListResponse) obj5).getStatisticsMap();
                                if (!statisticsMap.isEmpty()) {
                                    for (Map.Entry<Integer, PlayerMatchesEventStatistics> entry2 : statisticsMap.entrySet()) {
                                        if (entry2.getValue().getBattingGamesPlayed() > 0 || entry2.getValue().getBattingAtBats() > 0) {
                                            z2 = true;
                                        }
                                    }
                                }
                                playerEventsFragment3.C = z2;
                                playerEventsFragment3.I(null);
                            }
                        }
                    }
                    z = false;
                    playerEventsFragment3.B = z;
                    statisticsMap = ((PlayerEventsListResponse) obj5).getStatisticsMap();
                    if (!statisticsMap.isEmpty()) {
                    }
                    playerEventsFragment3.C = z2;
                    playerEventsFragment3.I(null);
                }
                kda.p(wca.x(playerEventsFragment3.getLifecycle()), new n50(playerEventsFragment3, useVar, rq3Var, i3), new owa(s6eVar, 2));
                return Unit.a;
            case 20:
                wte wteVar = (wte) this.b;
                List list6 = (List) this.c;
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                wteVar.c.J(glgVar2, list6);
                return Unit.a;
            case 21:
                wte wteVar2 = (wte) this.b;
                DbPlayerOfTheMatchVote dbPlayerOfTheMatchVote = (DbPlayerOfTheMatchVote) this.c;
                glg glgVar3 = (glg) obj;
                glgVar3.getClass();
                wteVar2.b.a0(glgVar3, dbPlayerOfTheMatchVote);
                return Unit.a;
            case 22:
                xve xveVar = (xve) this.b;
                Context context = (Context) this.c;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                View root = xveVar.getRoot();
                root.setPaddingRelative(root.getPaddingStart(), root.getPaddingTop(), root.getPaddingEnd(), booleanValue2 ? ao2.s(8, context) : 0);
                return Unit.a;
            case 23:
                ku3 ku3Var = (ku3) this.b;
                e1d e1dVar2 = (e1d) this.c;
                SurfaceView surfaceView = (SurfaceView) obj;
                surfaceView.getClass();
                if (Build.VERSION.SDK_INT == 34 && !c.o(Build.FINGERPRINT, "robolectric", true)) {
                    hs4 hs4Var = z45.a;
                    xw3.L(ku3Var, rob.a, null, new zwe(surfaceView, e1dVar2, null), 2);
                }
                return Unit.a;
            case 24:
                qx0 qx0Var = (qx0) this.b;
                te3 te3Var = (te3) this.c;
                qx0Var.a(te3Var);
                return new vx0(i3, qx0Var, te3Var);
            case 25:
                o4f o4fVar = (o4f) this.b;
                n4f n4fVar = (n4f) this.c;
                glg glgVar4 = (glg) obj;
                glgVar4.getClass();
                o4fVar.b.a0(glgVar4, n4fVar);
                return Unit.a;
            case 26:
                PreferenceFragment preferenceFragment = (PreferenceFragment) this.b;
                Preference preference = (Preference) this.c;
                SettingsItem settingsItem = (SettingsItem) obj;
                settingsItem.getClass();
                String str3 = settingsItem.a;
                fib a = fib.a(str3);
                a.getClass();
                String a2 = dla.a();
                SharedPreferences.Editor edit = preferenceFragment.o().edit();
                edit.getClass();
                edit.putString("PREF_LANGUAGE_CODE", str3);
                edit.apply();
                dla.g(a);
                String a3 = dla.a();
                Context requireContext2 = preferenceFragment.requireContext();
                requireContext2.getClass();
                nv.J(requireContext2, a2, a3);
                Context requireContext3 = preferenceFragment.requireContext();
                requireContext3.getClass();
                u0a.C(requireContext3);
                hk4.a.clear();
                hk4.b = null;
                preference.u(settingsItem.b);
                return Unit.a;
            case 27:
                pi5 pi5Var = (pi5) this.b;
                Context context2 = (Context) this.c;
                esa esaVar3 = (esa) obj;
                esaVar3.getClass();
                esa.d(esaVar3, "summary_card", null, new tc3(222934426, new pte(pi5Var, i4), true), 2);
                gv9 gv9Var4 = pi5Var.b;
                gv9 gv9Var5 = pi5Var.a;
                if (!gv9Var4.isEmpty()) {
                    esa.d(esaVar3, "edited_competitions_card", null, iz8.d, 2);
                }
                List L0 = CollectionsKt.L0(gv9Var4, 5);
                esaVar3.a(L0.size(), new wsd(i5, new eee(z2 ? (byte) 1 : (byte) 0, 18), L0), new xo(L0, 26), new tc3(2039820996, new l46(L0, pi5Var, context2, i4), true));
                if (gv9Var4.size() > 5) {
                    esa.d(esaVar3, "see_all_button", null, new tc3(1246830472, new tu5(context2, i5), true), 2);
                }
                esa.d(esaVar3, "event_opening_graph", null, new tc3(16909955, new yya(14, pi5Var, context2), true), 2);
                if (!gv9Var5.isEmpty()) {
                    esa.d(esaVar3, "most_viewed_card", null, iz8.e, 2);
                }
                esaVar3.a(gv9Var5.size(), new wsd(6, new eee(z2 ? (byte) 1 : (byte) 0, 17), gv9Var5), new xo(gv9Var5, 27), new tc3(2039820996, new yo(gv9Var5, 4), true));
                if (!gv9Var5.isEmpty()) {
                    esa.d(esaVar3, "spacer", null, iz8.f, 2);
                }
                if (pi5Var.e) {
                    esa.d(esaVar3, "torneo_info_card", null, iz8.g, 2);
                }
                return Unit.a;
            case 28:
                e1d e1dVar3 = (e1d) this.b;
                ProfileEditorTournamentsModal profileEditorTournamentsModal = (ProfileEditorTournamentsModal) this.c;
                esa esaVar4 = (esa) obj;
                esaVar4.getClass();
                vnb vnbVar = (vnb) e1dVar3.getValue();
                vnbVar.getClass();
                gv9 gv9Var6 = ((pi5) ((unb) vnbVar).a).b;
                esaVar4.a(gv9Var6.size(), null, new xo(gv9Var6, 28), new tc3(802480018, new aj(13, gv9Var6, profileEditorTournamentsModal), true));
                return Unit.a;
            default:
                ProfileFollowingFragment profileFollowingFragment = (ProfileFollowingFragment) this.b;
                mf8 mf8Var = (mf8) this.c;
                lf8 lf8Var = (lf8) obj;
                profileFollowingFragment.n();
                Context requireContext4 = profileFollowingFragment.requireContext();
                requireContext4.getClass();
                lf8Var.getClass();
                List list7 = mf8Var.m;
                List j = b.j(requireContext4.getString(R.string.profile_favourite_competitions_empty), requireContext4.getString(R.string.profile_favourite_teams_empty), requireContext4.getString(R.string.profile_favourite_athletes_empty));
                for (Object obj6 : b.j(lf8Var.c, lf8Var.b, lf8Var.a)) {
                    int i11 = i8 + 1;
                    if (i8 < 0) {
                        b.q();
                        throw null;
                    }
                    List list8 = (List) obj6;
                    if (list8.isEmpty()) {
                        r9f r9fVar = (r9f) list7.get(i8);
                        Object obj7 = j.get(i8);
                        obj7.getClass();
                        r9fVar.F(a.c(new wm5((String) obj7)));
                    } else {
                        if (((r9f) list7.get(i8)).i.isEmpty()) {
                            mf8Var.notifyItemChanged(((Number) mf8.o.get(i8)).intValue());
                        }
                        ((r9f) list7.get(i8)).F(list8);
                    }
                    i8 = i11;
                }
                return Unit.a;
        }
    }
}
