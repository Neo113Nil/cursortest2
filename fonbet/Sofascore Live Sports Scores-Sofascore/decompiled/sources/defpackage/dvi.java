package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.SeasonSpinnerData;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.DbMyTeam;
import com.sofascore.model.mvvm.model.DbMyUniqueTournament;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.PinnedTournament;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.dialog.EventListBottomSheet;
import com.sofascore.results.dialog.TeamTopPlayersCategoryBottomSheet;
import com.sofascore.results.dialog.TopStatsCategoryBottomSheet;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.league.fragment.details.view.TournamentPreviousWinnersBottomSheet;
import com.sofascore.results.league.fragment.topStats.TopPerformanceCategoryUiModel;
import com.sofascore.results.league.fragment.topStats.TopPlayerCategoryUiModel;
import com.sofascore.results.league.fragment.topStats.TopStatsCategory;
import com.sofascore.results.league.fragment.topStats.TopTeamCategoryUiModel;
import com.sofascore.results.manager.ManagerActivity;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.player.statistics.compare.search.CompareSearchModal;
import com.sofascore.results.team.TeamActivity;
import com.sofascore.results.team.lastnext.TeamEventsFragment;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class dvi implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dvi(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01cf A[Catch: all -> 0x0176, TryCatch #0 {all -> 0x0176, blocks: (B:40:0x00ce, B:41:0x011e, B:43:0x0124, B:47:0x013d, B:49:0x016a, B:53:0x01a2, B:55:0x01ad, B:59:0x01de, B:61:0x01b7, B:64:0x01c3, B:67:0x01d3, B:68:0x01cf, B:69:0x01bf, B:70:0x0179, B:73:0x0185, B:76:0x0195, B:77:0x0191, B:78:0x0181, B:79:0x0136), top: B:39:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bf A[Catch: all -> 0x0176, TryCatch #0 {all -> 0x0176, blocks: (B:40:0x00ce, B:41:0x011e, B:43:0x0124, B:47:0x013d, B:49:0x016a, B:53:0x01a2, B:55:0x01ad, B:59:0x01de, B:61:0x01b7, B:64:0x01c3, B:67:0x01d3, B:68:0x01cf, B:69:0x01bf, B:70:0x0179, B:73:0x0185, B:76:0x0195, B:77:0x0191, B:78:0x0181, B:79:0x0136), top: B:39:0x00ce }] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        iej a;
        iej a2;
        iej a3;
        aej aejVar;
        b20 j;
        gej gejVar;
        String str;
        nlg V0;
        Sport sport;
        FieldTranslations fieldTranslations;
        FieldTranslations fieldTranslations2;
        gv9 gv9Var;
        int i = this.a;
        int i2 = 14;
        int i3 = 4;
        int i4 = 2;
        int i5 = 3;
        int i6 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                return Long.valueOf(((fvi) obj3).b.b0(glgVar, (DbMyTeam) obj2));
            case 1:
                ((Function1) obj3).invoke(new awi(((Integer) obj).intValue(), ((iwi) obj2).a));
                return Unit.a;
            case 2:
                Function1 function1 = (Function1) obj3;
                jwi jwiVar = (jwi) obj2;
                YearMonth yearMonth = jwiVar.n;
                dwi dwiVar = (dwi) obj;
                dwiVar.getClass();
                if (dwiVar.equals(bwi.a)) {
                    YearMonth now = YearMonth.now();
                    now.getClass();
                    function1.invoke(now);
                } else if (dwiVar instanceof awi) {
                    awi awiVar = (awi) dwiVar;
                    YearMonth of = YearMonth.of(awiVar.b, awiVar.a);
                    of.getClass();
                    function1.invoke(of);
                } else {
                    int i7 = 13;
                    if (dwiVar.equals(zvi.a)) {
                        iwi iwiVar = (iwi) jwiVar.l().a();
                        jwiVar.n(null, new tj(jwiVar, (iwiVar != null ? iwiVar.a : yearMonth.getYear()) - 1, i7));
                    } else if (dwiVar.equals(yvi.a)) {
                        iwi iwiVar2 = (iwi) jwiVar.l().a();
                        jwiVar.n(null, new tj(jwiVar, (iwiVar2 != null ? iwiVar2.a : yearMonth.getYear()) + 1, i7));
                    } else if (dwiVar instanceof cwi) {
                        jwiVar.n(null, new tj(jwiVar, ((cwi) dwiVar).a, i7));
                    }
                }
                return Unit.a;
            case 3:
                Context context = (Context) obj3;
                xwi xwiVar = (xwi) obj2;
                List list = (List) obj;
                list.getClass();
                mqi mqiVar = bii.a;
                String string = context.getString(bii.b(xwiVar.g.getSportSlug(), false));
                string.getClass();
                int id = xwiVar.g.getId();
                EventListBottomSheet eventListBottomSheet = new EventListBottomSheet();
                eventListBottomSheet.setArguments(fz8.C(fz8.G("EVENT_IDS_EXTRA", new ArrayList(list)), fz8.H("TITLE_EXTRA", string), fz8.D(id, "ANALYTICS_ID_EXTRA"), fz8.H("ANALYTICS_NAME_EXTRA", "MultipleEventsModal")));
                if (context instanceof csk) {
                    context = ((csk) context).getBaseContext();
                }
                AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(eventListBottomSheet, appCompatActivity, null, i5));
                }
                return Unit.a;
            case 4:
                TeamEventsFragment teamEventsFragment = (TeamEventsFragment) obj3;
                UniqueTournament uniqueTournament = (UniqueTournament) obj;
                teamEventsFragment.u = true;
                ((w1i) obj2).invoke();
                xwi E = teamEventsFragment.E();
                g9i g9iVar = E.s;
                if (g9iVar != null) {
                    g9iVar.e(null);
                }
                g9i g9iVar2 = E.t;
                if (g9iVar2 != null) {
                    g9iVar2.e(null);
                }
                g9i g9iVar3 = E.u;
                if (g9iVar3 != null) {
                    g9iVar3.e(null);
                }
                ((eoh) E.q).setValue(uniqueTournament);
                E.l();
                return Unit.a;
            case 5:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                ((View) obj).getClass();
                dq8 dq8Var = (dq8) ((TeamEventsFragment) obj3).l;
                if (dq8Var != null) {
                    dq8Var.b.setTranslationY(-(appBarLayout.getTop() + appBarLayout.getTotalScrollRange()));
                }
                return Unit.a;
            case 6:
                TeamEventsFragment teamEventsFragment2 = (TeamEventsFragment) obj3;
                List list2 = (List) obj;
                list2.getClass();
                kda.p(wca.x(teamEventsFragment2.getLifecycle()), new qwi(teamEventsFragment2, list2, null, r13), new owa((s6e) obj2, 4));
                return Unit.a;
            case 7:
                Context context2 = (Context) obj3;
                g2j g2jVar = (g2j) obj2;
                h1j h1jVar = (h1j) obj;
                h1jVar.getClass();
                boolean z = h1jVar instanceof d1j;
                if (z) {
                    int i8 = ManagerActivity.R;
                    bea.M(((d1j) h1jVar).a, context2);
                } else {
                    boolean z2 = h1jVar instanceof e1j;
                    if (z2) {
                        int i9 = PlayerActivity.Z;
                        jle.q(context2, ((e1j) h1jVar).a, 0, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                    } else {
                        g2jVar.getClass();
                        int i10 = 22;
                        if (h1jVar instanceof g1j) {
                            g2jVar.n(null, new g2i(h1jVar, i10));
                        } else {
                            rq3 rq3Var = null;
                            if (h1jVar.equals(f1j.a)) {
                                ynb.m(g2jVar, new r3(g2jVar, rq3Var, i10));
                            } else if (!z && !z2) {
                                zzl.b();
                                return null;
                            }
                        }
                    }
                }
                return Unit.a;
            case 8:
                Context context3 = (Context) obj3;
                n3j n3jVar = (n3j) obj2;
                fnj fnjVar = (fnj) obj;
                fnjVar.getClass();
                if (fnjVar instanceof bnj) {
                    bnj bnjVar = (bnj) fnjVar;
                    String str2 = bnjVar.a;
                    String str3 = bnjVar.b;
                    str2.getClass();
                    str3.getClass();
                    TeamTopPlayersCategoryBottomSheet teamTopPlayersCategoryBottomSheet = new TeamTopPlayersCategoryBottomSheet();
                    Bundle bundle = new Bundle();
                    bundle.putString("CATEGORY_NAME", str2);
                    bundle.putString("STATS_TYPE", str3);
                    teamTopPlayersCategoryBottomSheet.setArguments(bundle);
                    context3.getClass();
                    if (context3 instanceof csk) {
                        context3 = ((csk) context3).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity2 = context3 instanceof AppCompatActivity ? (AppCompatActivity) context3 : null;
                    if (appCompatActivity2 != null) {
                        wca.x(appCompatActivity2.getLifecycle()).b(new r1(teamTopPlayersCategoryBottomSheet, appCompatActivity2, null, i5));
                    }
                } else {
                    n3jVar.D(fnjVar);
                }
                return Unit.a;
            case 9:
                SeasonSpinnerData seasonSpinnerData = (SeasonSpinnerData) obj;
                seasonSpinnerData.getClass();
                ((Function1) obj3).invoke(new enj(((ynj) obj2).d.a, seasonSpinnerData.getId()));
                return Unit.a;
            case 10:
                Context context4 = (Context) obj3;
                l4j l4jVar = (l4j) obj2;
                w3j w3jVar = (w3j) obj;
                w3jVar.getClass();
                if (w3jVar instanceof v3j) {
                    a99.A(LeagueActivity.h0, context4, Integer.valueOf(((v3j) w3jVar).a), 0, null, null, null, null, 4088);
                } else if (w3jVar instanceof s3j) {
                    boolean z3 = ((s3j) w3jVar).a;
                    e73 e73Var = e73.a;
                    String str4 = l4jVar.o;
                    context4.getClass();
                    str4.getClass();
                    CompareSearchModal compareSearchModal = new CompareSearchModal();
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("IS_FIRST", z3);
                    bundle2.putString("ENTITY_TYPE", "Team");
                    bundle2.putString("SPORT", str4);
                    compareSearchModal.setArguments(bundle2);
                    Unit unit = Unit.a;
                    Context baseContext = context4 instanceof csk ? ((csk) context4).getBaseContext() : context4;
                    AppCompatActivity appCompatActivity3 = baseContext instanceof AppCompatActivity ? (AppCompatActivity) baseContext : null;
                    if (appCompatActivity3 != null) {
                        wca.x(appCompatActivity3.getLifecycle()).b(new r1(compareSearchModal, appCompatActivity3, null, i5));
                    }
                } else if (w3jVar instanceof t3j) {
                    int i11 = TeamActivity.Z;
                    jle.r(context4, ((t3j) w3jVar).a, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                } else {
                    l4jVar.w(w3jVar);
                }
                return Unit.a;
            case 11:
                vnb vnbVar = (vnb) obj3;
                Function1 function12 = (Function1) obj2;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                esa.d(esaVar, "trophiesRow", null, new tc3(-708791639, new gs3(vnbVar, i4), true), 2);
                esa.d(esaVar, "emptyState", null, new tc3(1147257170, new gs3(vnbVar, i5), true), 2);
                gv9<g4j> gv9Var2 = ((i4j) ((unb) vnbVar).a).c;
                if (gv9Var2 != null) {
                    for (g4j g4jVar : gv9Var2) {
                        esa.d(esaVar, g4jVar.a, null, new tc3(-1550982843, new uri(g4jVar, 8), true), 2);
                        gv9 gv9Var3 = g4jVar.b;
                        esa.e(esaVar, gv9Var3.size(), new uo(9, gv9Var3), null, new tc3(-780687922, new c4j(gv9Var3, function12, i6), true), 4);
                        esa.d(esaVar, g4jVar.a + "divider", null, new tc3(-1963631556, new e6i(i3, g4jVar, vnbVar), true), 2);
                    }
                }
                return Unit.a;
            case 12:
                e1d e1dVar = (e1d) obj2;
                njh njhVar = (njh) obj;
                float floatValue = ((Number) ((cdi) obj3).getValue()).floatValue();
                float intBitsToFloat = Float.intBitsToFloat((int) (njhVar.a >> 32)) * floatValue;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (njhVar.a & 4294967295L)) * floatValue;
                if (Float.intBitsToFloat((int) (((njh) e1dVar.getValue()).a >> 32)) != intBitsToFloat || Float.intBitsToFloat((int) (((njh) e1dVar.getValue()).a & 4294967295L)) != intBitsToFloat2) {
                    e1dVar.setValue(new njh((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)));
                }
                return Unit.a;
            case 13:
                te2 te2Var = (te2) obj;
                return te2Var.a(new dvi(i2, ((uah) obj3).a(te2Var.a.n(), te2Var.a.getLayoutDirection(), te2Var), (eaj) obj2));
            case 14:
                qea.r((ha5) obj, (pea) obj3, ((eaj) obj2).a());
                return Unit.a;
            case 15:
                return new vx0(i2, (e1d) obj3, (wzc) obj2);
            case 16:
                p80 p80Var = (p80) obj3;
                znh znhVar = ((hbb) obj2).b;
                w7j w7jVar = (w7j) obj;
                gbb gbbVar = (gbb) p80Var.a;
                iej a4 = gbbVar.a();
                pwh pwhVar = a4 != null ? a4.a : null;
                pwh pwhVar2 = ((znhVar.h() & 1) == 0 || (a3 = gbbVar.a()) == null) ? null : a3.b;
                if (pwhVar != null) {
                    pwhVar2 = pwhVar.d(pwhVar2);
                }
                pwh pwhVar3 = ((znhVar.h() & 2) == 0 || (a2 = gbbVar.a()) == null) ? null : a2.c;
                if (pwhVar2 != null) {
                    pwhVar3 = pwhVar2.d(pwhVar3);
                }
                pwh pwhVar4 = ((znhVar.h() & 4) == 0 || (a = gbbVar.a()) == null) ? null : a.d;
                if (pwhVar3 != null) {
                    pwhVar4 = pwhVar3.d(pwhVar4);
                }
                w7jVar.b = w7jVar.a.b(new vsc(24, new asf(), p80Var, pwhVar4));
                return Unit.a;
            case 17:
                hej hejVar = (hej) obj3;
                p80 p80Var2 = (p80) obj2;
                f4g f4gVar = (f4g) obj;
                q80 q80Var = hejVar.b;
                e1d e1dVar2 = hejVar.a;
                aej aejVar2 = (aej) ((eoh) e1dVar2).getValue();
                if (Intrinsics.c(q80Var, aejVar2 != null ? aejVar2.a.a : null) && (aejVar = (aej) ((eoh) e1dVar2).getValue()) != null) {
                    eyc eycVar = aejVar.b;
                    p80 c = hej.c(p80Var2, aejVar);
                    if (c != null) {
                        int i12 = c.c;
                        int i13 = c.b;
                        j = aejVar.j(i13, i12);
                        oqf b = aejVar.b(i13);
                        j.k(((Float.floatToRawIntBits(b.b) & 4294967295L) | (Float.floatToRawIntBits(eycVar.d(i13) == eycVar.d(i12 - 1) ? Math.min(aejVar.b(r7).a, b.a) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32)) ^ (-9223372034707292160L));
                        gejVar = j == null ? new gej(j) : null;
                        if (gejVar != null) {
                            f4gVar.o(gejVar);
                            f4gVar.d(true);
                        }
                        return Unit.a;
                    }
                }
                j = null;
                if (j == null) {
                }
                if (gejVar != null) {
                }
                return Unit.a;
            case 18:
                List list3 = (List) obj3;
                List list4 = (List) obj2;
                phe pheVar = (phe) obj;
                if (list3 != null) {
                    int size = list3.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        Pair pair = (Pair) list3.get(i14);
                        phe.g(pheVar, (qhe) pair.a, ((r6a) pair.b).a);
                    }
                }
                if (list4 != null) {
                    int size2 = list4.size();
                    while (i6 < size2) {
                        Pair pair2 = (Pair) list4.get(i6);
                        qhe qheVar = (qhe) pair2.a;
                        Function0 function0 = (Function0) pair2.b;
                        phe.g(pheVar, qheVar, function0 != null ? ((r6a) function0.invoke()).a : 0L);
                        i6++;
                    }
                }
                return Unit.a;
            case 19:
                Context context5 = (Context) obj3;
                koj kojVar = (koj) obj2;
                fnj fnjVar2 = (fnj) obj;
                fnjVar2.getClass();
                if (fnjVar2 instanceof bnj) {
                    bnj bnjVar2 = (bnj) fnjVar2;
                    String str5 = bnjVar2.a;
                    String str6 = bnjVar2.b;
                    str5.getClass();
                    str6.getClass();
                    TopStatsCategoryBottomSheet topStatsCategoryBottomSheet = new TopStatsCategoryBottomSheet();
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("CATEGORY_NAME", str5);
                    bundle3.putString("STATS_TYPE", str6);
                    topStatsCategoryBottomSheet.setArguments(bundle3);
                    context5.getClass();
                    if (context5 instanceof csk) {
                        context5 = ((csk) context5).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity4 = context5 instanceof AppCompatActivity ? (AppCompatActivity) context5 : null;
                    if (appCompatActivity4 != null) {
                        wca.x(appCompatActivity4.getLifecycle()).b(new r1(topStatsCategoryBottomSheet, appCompatActivity4, null, i5));
                    }
                } else {
                    kojVar.D(fnjVar2);
                }
                return Unit.a;
            case 20:
                return ynj.a((ynj) obj, null, null, ((dnj) ((fnj) obj3)).a, true, (uza) obj2, 11);
            case 21:
                ynj ynjVar = (ynj) obj2;
                SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                ymj ymjVar = (ymj) ((fnj) obj3);
                TopStatsCategory topStatsCategory = ymjVar.a;
                if (topStatsCategory instanceof TopTeamCategoryUiModel) {
                    str = "league_top_teams";
                } else if (topStatsCategory instanceof TopPerformanceCategoryUiModel) {
                    str = "league_top_stats";
                } else {
                    if (!(topStatsCategory instanceof TopPlayerCategoryUiModel)) {
                        zzl.b();
                        return null;
                    }
                    str = "league_top_players";
                }
                boolean z4 = ymjVar.b;
                r13 = (ynjVar.d.a == 132 && Intrinsics.c(ynjVar.f.a(), Season.SubSeasonType.REGULAR_SEASON.getLabel())) ? 1 : 0;
                String str7 = "";
                String str8 = z4 ? "_MODAL" : "";
                if (r13 != 0 && z4) {
                    str7 = "_nba";
                }
                editor.putBoolean(fc6.n("PREF_", str, str8, str7), false);
                return Unit.a;
            case 22:
                return ynj.a((ynj) obj, (gv9) obj3, null, null, false, (uza) obj2, 14);
            case 23:
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                return ((irj) obj3).f.M(glgVar2, (List) obj2);
            case 24:
                glg glgVar3 = (glg) obj;
                glgVar3.getClass();
                ((irj) obj3).c.a0(glgVar3, (PinnedTournament) obj2);
                return Unit.a;
            case 25:
                String str9 = (String) obj3;
                sz8 sz8Var = ((irj) obj2).d;
                glg glgVar4 = (glg) obj;
                glgVar4.getClass();
                V0 = glgVar4.V0("SELECT * FROM pinned_tournaments_table WHERE category_sport_slug = ? ORDER BY orderIndex");
                try {
                    V0.L(1, str9);
                    int r = w1a.r(V0, "id");
                    int r2 = w1a.r(V0, "name");
                    int r3 = w1a.r(V0, "orderIndex");
                    int r4 = w1a.r(V0, "category_id");
                    int r5 = w1a.r(V0, "category_name");
                    int r6 = w1a.r(V0, "category_flag");
                    int r7 = w1a.r(V0, "category_sport_id");
                    int r8 = w1a.r(V0, "category_sport_slug");
                    int r9 = w1a.r(V0, "category_nameTranslation");
                    int r10 = w1a.r(V0, "category_shortNameTranslation");
                    int r11 = w1a.r(V0, "nameTranslation");
                    int r12 = w1a.r(V0, "shortNameTranslation");
                    ArrayList arrayList = new ArrayList();
                    while (V0.U0()) {
                        ArrayList arrayList2 = arrayList;
                        int i15 = (int) V0.getLong(r);
                        String F0 = V0.isNull(r2) ? null : V0.F0(r2);
                        int i16 = (int) V0.getLong(r3);
                        int i17 = r2;
                        int i18 = r3;
                        int i19 = (int) V0.getLong(r4);
                        String F02 = V0.F0(r5);
                        String F03 = V0.F0(r6);
                        int i20 = r;
                        Sport sport2 = new Sport((int) V0.getLong(r7), V0.F0(r8));
                        if (V0.isNull(r9) && V0.isNull(r10)) {
                            sport = sport2;
                            fieldTranslations = null;
                            Category category = new Category(i19, F02, F03, sport, fieldTranslations);
                            if (V0.isNull(r11) && V0.isNull(r12)) {
                                fieldTranslations2 = null;
                                arrayList2.add(new PinnedTournament(i15, F0, category, fieldTranslations2, i16));
                                r3 = i18;
                                r = i20;
                                arrayList = arrayList2;
                                r2 = i17;
                            }
                            fieldTranslations2 = new FieldTranslations(sz8Var.z(!V0.isNull(r11) ? null : V0.F0(r11)), sz8Var.z(!V0.isNull(r12) ? null : V0.F0(r12)));
                            arrayList2.add(new PinnedTournament(i15, F0, category, fieldTranslations2, i16));
                            r3 = i18;
                            r = i20;
                            arrayList = arrayList2;
                            r2 = i17;
                        }
                        sport = sport2;
                        fieldTranslations = new FieldTranslations(sz8Var.z(V0.isNull(r9) ? null : V0.F0(r9)), sz8Var.z(V0.isNull(r10) ? null : V0.F0(r10)));
                        Category category2 = new Category(i19, F02, F03, sport, fieldTranslations);
                        if (V0.isNull(r11)) {
                            fieldTranslations2 = null;
                            arrayList2.add(new PinnedTournament(i15, F0, category2, fieldTranslations2, i16));
                            r3 = i18;
                            r = i20;
                            arrayList = arrayList2;
                            r2 = i17;
                        }
                        fieldTranslations2 = new FieldTranslations(sz8Var.z(!V0.isNull(r11) ? null : V0.F0(r11)), sz8Var.z(!V0.isNull(r12) ? null : V0.F0(r12)));
                        arrayList2.add(new PinnedTournament(i15, F0, category2, fieldTranslations2, i16));
                        r3 = i18;
                        r = i20;
                        arrayList = arrayList2;
                        r2 = i17;
                    }
                    ArrayList arrayList3 = arrayList;
                    V0.close();
                    return arrayList3;
                } catch (Throwable th) {
                    throw th;
                }
            case 26:
                Set set = (Set) obj2;
                glg glgVar5 = (glg) obj;
                glgVar5.getClass();
                V0 = glgVar5.V0((String) obj3);
                try {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        V0.q(r13, ((Number) it.next()).intValue());
                        r13++;
                    }
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                    V0.close();
                }
            case 27:
                glg glgVar6 = (glg) obj;
                glgVar6.getClass();
                return Long.valueOf(((irj) obj3).b.b0(glgVar6, (DbMyUniqueTournament) obj2));
            case 28:
                prj prjVar = (prj) obj3;
                TournamentPreviousWinnersBottomSheet tournamentPreviousWinnersBottomSheet = (TournamentPreviousWinnersBottomSheet) obj2;
                esa esaVar2 = (esa) obj;
                esaVar2.getClass();
                if (prjVar == null || (gv9Var = prjVar.a) == null) {
                    gv9Var = rlh.b;
                }
                esaVar2.a(gv9Var.size(), null, new uk1(12, gv9Var), new tc3(2039820996, new aj(16, gv9Var, tournamentPreviousWinnersBottomSheet), true));
                return Unit.a;
            default:
                lec lecVar = (lec) obj3;
                asf asfVar = (asf) obj2;
                Object d = lecVar.d();
                if (asfVar.a || ((d == null && obj != null) || (d != null && !d.equals(obj)))) {
                    asfVar.a = false;
                    lecVar.j(obj);
                }
                return Unit.a;
        }
    }

    public /* synthetic */ dvi(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj2;
        this.c = obj3;
    }
}
