package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.results.R;
import com.sofascore.results.event.odds.model.OddsEventUIModel;
import com.sofascore.results.fantasy.competition.team.bottomsheet.FantasyOptimiseSquadBottomSheet;
import com.sofascore.results.fantasy.competition.team.player.FantasyFootballPlayerMyTeamBottomSheet;
import com.sofascore.results.fantasy.shared.FantasyCompetitionSquadInfoDisplayModeBottomSheet;
import com.sofascore.results.fantasy.teammanagement.substitutions.FantasySubstitutionsActivity;
import com.sofascore.results.fantasy.teammanagement.transfers.FantasyTransfersActivity;
import com.sofascore.results.fantasy.transfers.FantasyTransferHistoryBottomSheet;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.fantasy.walkthrough.FantasyWalkthroughActivity;
import com.sofascore.results.fantasy.weekly.FantasyEliteFaceoffRevealDialog;
import com.sofascore.results.feedback.FeedbackActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class gj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ gj(ku3 ku3Var, gv9 gv9Var, scj scjVar, String str, e1d e1dVar, e1d e1dVar2, e1d e1dVar3) {
        this.a = 7;
        this.c = ku3Var;
        this.b = gv9Var;
        this.d = scjVar;
        this.h = str;
        this.e = e1dVar;
        this.f = e1dVar2;
        this.g = e1dVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Long] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        gv9 gv9Var;
        Intent B;
        SharedPreferences d;
        Object value;
        Object obj2;
        Object value2;
        do7 do7Var;
        Object obj3;
        float f;
        int i = 2;
        int i2 = 0;
        int i3 = 1;
        rq3 rq3Var = null;
        rq3Var = null;
        int i4 = 3;
        switch (this.a) {
            case 0:
                gv9 gv9Var2 = (gv9) this.b;
                gv9 gv9Var3 = (gv9) this.c;
                Map map = (Map) this.d;
                List<String> list = (List) this.e;
                ij ijVar = (ij) this.g;
                ddi ddiVar = ijVar.l;
                String str = (String) this.h;
                List list2 = (List) this.f;
                Set<String> keySet = map.keySet();
                ArrayList arrayList = new ArrayList(k13.r(keySet, 10));
                for (String str2 : keySet) {
                    String n = rld.n(ijVar.i(), str2, ok3.s((Event) ddiVar.getValue()));
                    arrayList.add(new vt2(str2, n == null ? "" : n, false, null, null, null, null, 252));
                }
                gv9 W = l6g.W(arrayList);
                ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
                for (String str3 : list) {
                    String n2 = rld.n(ijVar.i(), str3, ok3.s((Event) ddiVar.getValue()));
                    if (n2 == null) {
                        n2 = "";
                    }
                    arrayList2.add(new s1h(str3, n2, true));
                }
                gv9 W2 = l6g.W(arrayList2);
                Event event = (Event) ddiVar.getValue();
                event.getClass();
                OddsEventUIModel oddsEventUIModel = new OddsEventUIModel(event.getId(), o3a.F(event.getTournament()), event.getStatusType(), ok3.s(event), event.shouldReverseTeams());
                String str4 = (String) CollectionsKt.firstOrNull(list);
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.c(((OddsCountryProvider) it.next()).getOddsMayDiffer(), Boolean.TRUE)) {
                            z = true;
                            return new unb(new cj(gv9Var2, gv9Var3, W, W2, oddsEventUIModel, str, str4, z));
                        }
                    }
                }
                z = false;
                return new unb(new cj(gv9Var2, gv9Var3, W, W2, oddsEventUIModel, str, str4, z));
            case 1:
                qg4 qg4Var = (qg4) this.b;
                e1d e1dVar = (e1d) this.c;
                Function1 function1 = (Function1) this.d;
                kg2 kg2Var = (kg2) this.e;
                Locale locale = (Locale) this.f;
                wg4 wg4Var = (wg4) this.g;
                e1d e1dVar2 = (e1d) this.h;
                wcj wcjVar = (wcj) obj;
                q80 q80Var = wcjVar.a;
                String str5 = q80Var.b;
                String str6 = q80Var.b;
                int length = str5.length();
                String str7 = qg4Var.c;
                if (length <= str7.length()) {
                    while (true) {
                        if (i2 >= str6.length()) {
                            e1dVar2.setValue(wcjVar);
                            String obj4 = StringsKt.l0(str6).toString();
                            if (obj4.length() != 0 && obj4.length() >= str7.length()) {
                                eg2 e = kg2Var.e(obj4, str7, locale);
                                e1dVar.setValue(wg4Var.a(e, locale));
                                if (((CharSequence) e1dVar.getValue()).length() == 0 && e != null) {
                                    rq3Var = Long.valueOf(e.d);
                                }
                                function1.invoke(rq3Var);
                            } else {
                                e1dVar.setValue("");
                                function1.invoke(null);
                            }
                        } else if (Character.isDigit(str6.charAt(i2))) {
                            i2++;
                        }
                    }
                }
                return Unit.a;
            case 2:
                Function0 function0 = (Function0) this.b;
                hp6 hp6Var = (hp6) this.c;
                Function1 function12 = (Function1) this.d;
                Context context = (Context) this.e;
                pu6 pu6Var = (pu6) this.f;
                Function0 function02 = (Function0) this.g;
                Function1 function13 = (Function1) this.h;
                kt6 kt6Var = (kt6) obj;
                kt6Var.getClass();
                if (kt6Var.equals(it6.a)) {
                    function0.invoke();
                } else if (kt6Var instanceof jt6) {
                    hp6Var.l(((jt6) kt6Var).a);
                } else if (kt6Var instanceof bt6) {
                    int i5 = FantasyWalkthroughActivity.L;
                    ev6 ev6Var = pu6Var.m().c;
                    int i6 = ((bt6) kt6Var).a;
                    context.getClass();
                    Intent intent = new Intent(context, (Class<?>) FantasyWalkthroughActivity.class);
                    intent.putExtra("competition", ev6Var);
                    intent.putExtra("roundId", i6);
                    function12.invoke(intent);
                } else if (kt6Var instanceof ht6) {
                    function02.invoke();
                    hp6Var.l(vmh.e);
                    pu6Var.A(((ht6) kt6Var).a, null);
                } else {
                    if (!(kt6Var instanceof gt6)) {
                        zzl.b();
                        return null;
                    }
                    hu6 l = pu6Var.l();
                    ho7 ho7Var = l.c;
                    do7 do7Var2 = l.b;
                    if (ho7Var == null || (gv9Var = l.f) == null || do7Var2 == null) {
                        return Unit.a;
                    }
                    ev6 ev6Var2 = do7Var2.c;
                    if (kt6Var instanceof ft6) {
                        int i7 = FantasyTransfersActivity.Q;
                        vl7 vl7Var = l.o;
                        Boolean valueOf = vl7Var != null ? Boolean.valueOf(vl7Var.c) : null;
                        Boolean bool = Boolean.TRUE;
                        boolean c = Intrinsics.c(valueOf, bool);
                        vl7 vl7Var2 = l.q;
                        boolean c2 = Intrinsics.c(vl7Var2 != null ? Boolean.valueOf(vl7Var2.c) : null, bool);
                        vl7 vl7Var3 = l.p;
                        boolean c3 = Intrinsics.c(vl7Var3 != null ? Boolean.valueOf(vl7Var3.c) : null, bool);
                        gv9 gv9Var4 = l.f;
                        Double d2 = l.i;
                        B = u6h.J(context, ev6Var2, ho7Var, c, c2, c3, gv9Var4, d2 != null ? d2.doubleValue() : 0.0d, do7Var2.h.a, Integer.valueOf(((ft6) kt6Var).a));
                    } else {
                        int i8 = FantasySubstitutionsActivity.M;
                        B = ao2.B(context, ev6Var2, ho7Var, gv9Var, pu6Var.r(), kt6Var instanceof et6 ? Integer.valueOf(((et6) kt6Var).a) : null, kt6Var instanceof dt6 ? Integer.valueOf(((dt6) kt6Var).a) : null, kt6Var instanceof ct6 ? Integer.valueOf(((ct6) kt6Var).a) : null);
                    }
                    function13.invoke(B);
                }
                return Unit.a;
            case 3:
                pu6 pu6Var2 = (pu6) this.b;
                Context context2 = (Context) this.c;
                Function1 function14 = (Function1) this.d;
                hp6 hp6Var2 = (hp6) this.e;
                Function1 function15 = (Function1) this.f;
                g9a g9aVar = (g9a) this.g;
                Activity activity = (Activity) this.h;
                at6 at6Var = (at6) obj;
                at6Var.getClass();
                rq3 rq3Var2 = null;
                if (at6Var.equals(ls6.a)) {
                    pu6Var2.getClass();
                    xw3.L(un0.z(pu6Var2), null, null, new hs6(pu6Var2, rq3Var2, i), 3);
                } else if (at6Var.equals(ts6.a)) {
                    int i9 = pu6Var2.m().c.c;
                    nj7[] nj7VarArr = nj7.a;
                    context2.getClass();
                    nv.A(context2, "open_rules", null);
                    StringBuilder sb = new StringBuilder("https://www.sofascore.com/fantasy/rules");
                    sb.append("?competitionId=" + i9);
                    sb.append("#scoring");
                    p4h.w(context2, sb.toString());
                } else if (at6Var.equals(zs6.a)) {
                    pu6.u(pu6Var2, null, 2);
                } else if (at6Var.equals(ks6.a)) {
                    pu6Var2.x(hu6.a(pu6Var2.l(), null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, false, false, null, null, null, null, null, 16773119));
                    Context i10 = pu6Var2.i();
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = i10.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences = d;
                    }
                    SharedPreferences.Editor i11 = dmi.i(sharedPreferences, "PREF_SUBSTITUTIONS_INFO_DISMISSED", true);
                    Unit unit = Unit.a;
                    i11.apply();
                } else if (at6Var.equals(us6.a)) {
                    hu6 l2 = pu6Var2.l();
                    if (l2.c != null && l2.f != null && l2.b != null) {
                        nv.A(context2, "my_team", "substitutions");
                        int i12 = FantasySubstitutionsActivity.M;
                        function14.invoke(ao2.B(context2, l2.b.c, l2.c, l2.f, pu6Var2.r(), null, null, null));
                    }
                } else if (at6Var.equals(xs6.a)) {
                    hu6 l3 = pu6Var2.l();
                    if (l3.c != null && l3.f != null && l3.b != null) {
                        nv.A(context2, "my_team", "transfers");
                        int i13 = FantasyTransfersActivity.Q;
                        ev6 ev6Var3 = l3.b.c;
                        ho7 ho7Var2 = l3.c;
                        gv9 gv9Var5 = l3.f;
                        vl7 vl7Var4 = l3.o;
                        Boolean valueOf2 = vl7Var4 != null ? Boolean.valueOf(vl7Var4.c) : null;
                        Boolean bool2 = Boolean.TRUE;
                        boolean c4 = Intrinsics.c(valueOf2, bool2);
                        vl7 vl7Var5 = l3.p;
                        boolean c5 = Intrinsics.c(vl7Var5 != null ? Boolean.valueOf(vl7Var5.c) : null, bool2);
                        vl7 vl7Var6 = l3.q;
                        boolean c6 = Intrinsics.c(vl7Var6 != null ? Boolean.valueOf(vl7Var6.c) : null, bool2);
                        int i14 = l3.b.h.a;
                        Double d3 = l3.i;
                        function14.invoke(u6h.J(context2, ev6Var3, ho7Var2, c4, c6, c5, gv9Var5, d3 != null ? d3.doubleValue() : 0.0d, i14, null));
                    }
                } else if (at6Var.equals(ms6.a)) {
                    FragmentActivity O = hkg.O(context2);
                    if (O != null) {
                        FantasyCompetitionSquadInfoDisplayModeBottomSheet fantasyCompetitionSquadInfoDisplayModeBottomSheet = new FantasyCompetitionSquadInfoDisplayModeBottomSheet();
                        AppCompatActivity appCompatActivity = O instanceof AppCompatActivity ? (AppCompatActivity) O : null;
                        if (appCompatActivity != null) {
                            wca.x(appCompatActivity.getLifecycle()).b(new r1(fantasyCompetitionSquadInfoDisplayModeBottomSheet, appCompatActivity, rq3Var2, i4));
                        }
                    }
                } else if (at6Var.equals(ys6.a)) {
                    FragmentActivity O2 = hkg.O(context2);
                    if (O2 != null) {
                        String str8 = pu6Var2.i;
                        int i15 = pu6Var2.m().c.c;
                        str8.getClass();
                        FantasyTransferHistoryBottomSheet fantasyTransferHistoryBottomSheet = new FantasyTransferHistoryBottomSheet();
                        Bundle bundle = new Bundle();
                        bundle.putString("USER_ID_EXTRA", str8);
                        bundle.putInt("competitionId", i15);
                        fantasyTransferHistoryBottomSheet.setArguments(bundle);
                        AppCompatActivity appCompatActivity2 = O2 instanceof AppCompatActivity ? (AppCompatActivity) O2 : null;
                        if (appCompatActivity2 != null) {
                            wca.x(appCompatActivity2.getLifecycle()).b(new r1(fantasyTransferHistoryBottomSheet, appCompatActivity2, rq3Var2, i4));
                        }
                    }
                } else if (at6Var.equals(os6.a)) {
                    FragmentActivity O3 = hkg.O(context2);
                    if (O3 != null) {
                        String string = context2.getString(R.string.fantasy_lineup_view_expected_fantasy_points_title);
                        string.getClass();
                        String string2 = context2.getString(R.string.fantasy_expected_fantasy_points_explained);
                        string2.getClass();
                        f7a.w(O3, string, string2, "ExpectedPointsModal", null);
                    }
                } else if (at6Var instanceof ps6) {
                    FragmentActivity O4 = hkg.O(context2);
                    if (O4 != null) {
                        ps6 ps6Var = (ps6) at6Var;
                        int i16 = ps6Var.a;
                        List list3 = ps6Var.b;
                        list3.getClass();
                        FantasyOptimiseSquadBottomSheet fantasyOptimiseSquadBottomSheet = new FantasyOptimiseSquadBottomSheet();
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("roundId", i16);
                        bundle2.putParcelableArrayList("squad", new ArrayList<>(list3));
                        fantasyOptimiseSquadBottomSheet.setArguments(bundle2);
                        AppCompatActivity appCompatActivity3 = O4 instanceof AppCompatActivity ? (AppCompatActivity) O4 : null;
                        if (appCompatActivity3 != null) {
                            wca.x(appCompatActivity3.getLifecycle()).b(new r1(fantasyOptimiseSquadBottomSheet, appCompatActivity3, rq3Var2, i4));
                        }
                    }
                } else if (at6Var instanceof rs6) {
                    FragmentActivity O5 = hkg.O(context2);
                    if (O5 != null) {
                        ev6 ev6Var4 = pu6Var2.m().c;
                        rs6 rs6Var = (rs6) at6Var;
                        int i17 = rs6Var.a;
                        int i18 = rs6Var.b;
                        FantasyEliteFaceoffRevealDialog fantasyEliteFaceoffRevealDialog = new FantasyEliteFaceoffRevealDialog();
                        fantasyEliteFaceoffRevealDialog.setArguments(fz8.C(fz8.G("competition", ev6Var4), fz8.D(i17, "roundId"), fz8.D(i18, "roundSequence")));
                        fantasyEliteFaceoffRevealDialog.p(O5.k(), "RevealDialog");
                    }
                    n9e.u(context2, new we7(pu6Var2.m().c.c, yaa.w(), 0));
                    nv.A(context2, "faceoff_reveal", "reveal_fixtures");
                    hp6Var2.k();
                } else if (at6Var instanceof ns6) {
                    int i19 = FantasyWalkthroughActivity.L;
                    ev6 ev6Var5 = pu6Var2.m().c;
                    int i20 = ((ns6) at6Var).a;
                    context2.getClass();
                    Intent intent2 = new Intent(context2, (Class<?>) FantasyWalkthroughActivity.class);
                    intent2.putExtra("competition", ev6Var5);
                    intent2.putExtra("roundId", i20);
                    function15.invoke(intent2);
                    nv.A(context2, "faceoff_reveal", "create_lineup");
                } else if (at6Var instanceof ss6) {
                    pu6.u(pu6Var2, ((ss6) at6Var).a, 1);
                } else if (at6Var instanceof vs6) {
                    vs6 vs6Var = (vs6) at6Var;
                    tl7 tl7Var = vs6Var.a;
                    boolean z2 = vs6Var.b;
                    pu6Var2.getClass();
                    if (z2 || tl7Var == tl7.f) {
                        xw3.L(un0.z(pu6Var2), null, null, new t3(pu6Var2, tl7Var, z2, rq3Var2, 8), 3);
                    }
                } else if (at6Var instanceof qs6) {
                    do7 do7Var3 = pu6Var2.l().b;
                    if (do7Var3 != null) {
                        ev6 ev6Var6 = do7Var3.c;
                        FragmentActivity O6 = hkg.O(context2);
                        if (O6 != null) {
                            qs6 qs6Var = (qs6) at6Var;
                            FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = qs6Var.a;
                            ho7 ho7Var3 = qs6Var.b;
                            mj7 mj7Var = ho7Var3.a;
                            int i21 = mj7Var.j;
                            FantasyCompetitionType fantasyCompetitionType = ev6Var6.d;
                            int i22 = mj7Var.a;
                            boolean z3 = ho7Var3.g;
                            boolean z4 = ev6Var6.A;
                            fantasyCompetitionType.getClass();
                            FantasyFootballPlayerMyTeamBottomSheet fantasyFootballPlayerMyTeamBottomSheet = new FantasyFootballPlayerMyTeamBottomSheet();
                            fantasyFootballPlayerMyTeamBottomSheet.setArguments(fz8.C(fz8.F(SearchResponseKt.PLAYER_ENTITY, fantasyRoundPlayerUiModel), fz8.G("competitionType", fantasyCompetitionType), fz8.J("tripleCaptain", z3), fz8.D(i21, "competitionId"), fz8.D(i22, "roundId"), fz8.J("assetsRestricted", z4)));
                            AppCompatActivity appCompatActivity4 = O6 instanceof AppCompatActivity ? (AppCompatActivity) O6 : null;
                            if (appCompatActivity4 != null) {
                                wca.x(appCompatActivity4.getLifecycle()).b(new r1(fantasyFootballPlayerMyTeamBottomSheet, appCompatActivity4, rq3Var2, i4));
                            }
                        }
                    }
                } else if (at6Var.equals(js6.a)) {
                    pu6Var2.v(null);
                } else {
                    if (!(at6Var instanceof ws6)) {
                        zzl.b();
                        return null;
                    }
                    ws6 ws6Var = (ws6) at6Var;
                    if (ws6Var.a.b.equals(yl7.a)) {
                        g9aVar.l(activity, AdType.Interstitial.Fantasy);
                    }
                    pu6Var2.v(ws6Var.a);
                }
                return Unit.a;
            case 4:
                Context context3 = (Context) this.b;
                Function0 function03 = (Function0) this.c;
                Function1 function16 = (Function1) this.d;
                ypb ypbVar = (ypb) this.e;
                Function0 function04 = (Function0) this.f;
                Function1 function17 = (Function1) this.g;
                Function1 function18 = (Function1) this.h;
                apb apbVar = (apb) obj;
                apbVar.getClass();
                if (apbVar.equals(wob.a)) {
                    int i23 = FeedbackActivity.M;
                    context3.getClass();
                    context3.startActivity(new Intent(context3, (Class<?>) FeedbackActivity.class));
                } else if (apbVar.equals(vob.a)) {
                    function03.invoke();
                } else if (apbVar instanceof yob) {
                    function16.invoke(((yob) apbVar).a);
                } else if (apbVar instanceof sob) {
                    mp6 mp6Var = ((sob) apbVar).a;
                    int i24 = mp6Var.a;
                    Object value3 = ypbVar.i.getValue();
                    ppb ppbVar = value3 instanceof ppb ? (ppb) value3 : null;
                    if (ppbVar != null) {
                        Iterator it2 = ppbVar.a.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj3 = it2.next();
                                if (((do7) obj3).c.c == i24) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        do7Var = (do7) obj3;
                    } else {
                        do7Var = null;
                    }
                    if (do7Var != null) {
                        function16.invoke(do7Var);
                    } else if (mp6Var.j) {
                        function04.invoke();
                    } else {
                        context3.getClass();
                        FirebaseBundle firebaseBundle = new FirebaseBundle();
                        firebaseBundle.putInt("id", i24);
                        ia0 ia0Var = ia0.q;
                        me4.d((f5d) me4.e(), "fantasy_select_competition", firebaseBundle, context3).a.e(n9e.K(firebaseBundle), null, "fantasy_select_competition", false);
                        int i25 = mpb.a[mp6Var.c.ordinal()];
                        if (i25 == 1) {
                            function17.invoke(Integer.valueOf(i24));
                        } else {
                            if (i25 != 2) {
                                zzl.b();
                                return null;
                            }
                            function18.invoke(Integer.valueOf(i24));
                        }
                    }
                } else {
                    ypbVar.getClass();
                    fdi fdiVar = ypbVar.i;
                    if (apbVar.equals(uob.a)) {
                        do {
                            value2 = fdiVar.getValue();
                        } while (!fdiVar.k(value2, opb.a));
                        g9i g9iVar = ypbVar.r;
                        if (g9iVar != null) {
                            g9iVar.e(null);
                        }
                        ypbVar.r = xw3.L(un0.z(ypbVar), null, null, new vpb(ypbVar, rq3Var, i3), 3);
                    } else if (apbVar.equals(zob.a)) {
                        if (!((Boolean) ypbVar.o.getValue()).booleanValue()) {
                            g9i g9iVar2 = ypbVar.r;
                            if (g9iVar2 != null) {
                                g9iVar2.e(null);
                            }
                            ypbVar.r = xw3.L(un0.z(ypbVar), null, null, new z40(ypbVar, rq3Var, i4), 3);
                        }
                    } else if (apbVar instanceof xob) {
                        nv.A(ypbVar.i(), "fantasy_center", ((xob) apbVar).a.a);
                        do {
                            value = fdiVar.getValue();
                            obj2 = (tpb) value;
                            ppb ppbVar2 = obj2 instanceof ppb ? (ppb) obj2 : null;
                            ppb ppbVar3 = ppbVar2 == null ? null : ppbVar2;
                            if (ppbVar3 != null) {
                                obj2 = ppb.a(ppbVar3, null, null, null, ((xob) apbVar).a, null, false, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
                            }
                        } while (!fdiVar.k(value, obj2));
                    } else if (apbVar.equals(tob.a)) {
                        xw3.L(un0.z(ypbVar), null, null, new vpb(ypbVar, rq3Var, i2), 3);
                    }
                }
                return Unit.a;
            case 5:
                vnb vnbVar = (vnb) this.b;
                Function1 function19 = (Function1) this.c;
                wla wlaVar = (wla) this.d;
                List list4 = (List) this.e;
                Context context4 = (Context) this.f;
                h4d h4dVar = (h4d) this.g;
                cdi cdiVar = (cdi) this.h;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                gv9 gv9Var6 = ((zbc) ((unb) vnbVar).a).c;
                esaVar.a(gv9Var6.size(), new j87(27, new mpa(12), gv9Var6), new xo(gv9Var6, 23), new tc3(2039820996, new xbc(gv9Var6, function19, wlaVar, list4, context4, h4dVar, cdiVar), true));
                return Unit.a;
            case 6:
                g0d g0dVar = (g0d) this.b;
                oe3 oe3Var = (oe3) this.c;
                Function1 function110 = (Function1) this.d;
                Function1 function111 = (Function1) this.e;
                Function1 function112 = (Function1) this.f;
                cdi cdiVar2 = (cdi) this.g;
                e1d e1dVar3 = (e1d) this.h;
                r60 r60Var = (r60) obj;
                if (!((List) cdiVar2.getValue()).contains(r60Var.b())) {
                    return l98.l0(zo5.b, of6.b);
                }
                String str9 = ((d6d) r60Var.b()).f;
                int b = g0dVar.b(str9);
                if (b >= 0) {
                    f = g0dVar.c[b];
                } else {
                    g0dVar.f(str9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    f = 0.0f;
                }
                if (!((d6d) r60Var.a()).f.equals(((d6d) r60Var.b()).f)) {
                    f = (((Boolean) ((eoh) oe3Var.c).getValue()).booleanValue() || ((Boolean) e1dVar3.getValue()).booleanValue()) ? f - 1.0f : f + 1.0f;
                }
                g0dVar.f(((d6d) r60Var.a()).f, f);
                return new pp3((zo5) function110.invoke(r60Var), (of6) function111.invoke(r60Var), f, (kkh) function112.invoke(r60Var));
            default:
                ku3 ku3Var = (ku3) this.c;
                gv9 gv9Var7 = (gv9) this.b;
                scj scjVar = (scj) this.d;
                String str10 = (String) this.h;
                e1d e1dVar4 = (e1d) this.e;
                e1d e1dVar5 = (e1d) this.f;
                e1d e1dVar6 = (e1d) this.g;
                ie8 ie8Var = (ie8) obj;
                ie8Var.getClass();
                boolean booleanValue = ((Boolean) e1dVar4.getValue()).booleanValue();
                e1dVar4.setValue(Boolean.valueOf(ie8Var.g()));
                if (!booleanValue && ((Boolean) e1dVar4.getValue()).booleanValue()) {
                    xw3.L(ku3Var, null, null, new w9g(scjVar, rq3Var, 11), 3);
                    if (!gv9Var7.isEmpty()) {
                        e1dVar5.setValue(Boolean.TRUE);
                    }
                }
                if (!((Boolean) e1dVar4.getValue()).booleanValue()) {
                    Boolean bool3 = Boolean.FALSE;
                    e1dVar5.setValue(bool3);
                    if (((Boolean) e1dVar6.getValue()).booleanValue()) {
                        e1dVar6.setValue(bool3);
                    } else if (!Intrinsics.c(scjVar.c().c.toString(), str10)) {
                        w1a.E(scjVar, str10);
                    }
                }
                return Unit.a;
        }
    }

    public /* synthetic */ gj(gv9 gv9Var, gv9 gv9Var2, Map map, List list, ij ijVar, String str, List list2) {
        this.a = 0;
        this.b = gv9Var;
        this.c = gv9Var2;
        this.d = map;
        this.e = list;
        this.g = ijVar;
        this.h = str;
        this.f = list2;
    }

    public /* synthetic */ gj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
    }
}
