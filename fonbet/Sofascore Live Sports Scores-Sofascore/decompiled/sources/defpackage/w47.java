package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.n;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.model.database.DbFeedPostFeedback;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.fantasy.FantasyLeagueGameType;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.fantasy.competition.articles.FantasyNewsArticlesActivity;
import com.sofascore.results.fantasy.competition.managerprofile.FantasyManagerProfileActivity;
import com.sofascore.results.fantasy.competition.team.player.FantasyFootballPlayerBottomSheet;
import com.sofascore.results.fantasy.onboarding.FantasyOnboardingActivity;
import com.sofascore.results.fantasy.shared.FantasySubstitutionsSquadInfoDisplayModeBottomSheet;
import com.sofascore.results.fantasy.teammanagement.player.FantasyFootballPlayerSubstitutionsBottomSheet;
import com.sofascore.results.fantasy.teammanagement.transfers.FantasyTransfersFragment;
import com.sofascore.results.fantasy.teammanagement.transfers.selectreplacement.FantasyTransfersSelectReplacementDialogFragment;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.fantasy.userteam.FantasyUserSquadActivity;
import com.sofascore.results.fantasy.walkthrough.createteam.selectreplacement.FantasyWalkthroughSelectReplacementDialogFragment;
import com.sofascore.results.main.MainActivity;
import com.sofascore.results.main.favorites.FavoriteEntitiesFragment;
import com.sofascore.results.main.favorites.FavoriteEventsFragment;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.view.follownotification.FollowActionButton;
import com.sofascore.results.view.follownotification.FollowButton;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class w47 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w47(int i, Context context, Object obj) {
        this.a = i;
        this.c = obj;
        this.b = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r29v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v106 */
    /* JADX WARN: Type inference failed for: r2v107 */
    /* JADX WARN: Type inference failed for: r2v110 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        gv9 gv9Var;
        Object obj2;
        Object value;
        int i;
        rq3 rq3Var;
        FantasyRoundPlayerUiModel b;
        Object value2;
        SharedPreferences d;
        int i2 = 12;
        int i3 = 6;
        char c = 4;
        int i4 = 2;
        int i5 = 0;
        rq3 rq3Var2 = null;
        int i6 = 1;
        int i7 = 3;
        switch (this.a) {
            case 0:
                Context context = (Context) this.b;
                e57 e57Var = (e57) this.c;
                u47 u47Var = (u47) obj;
                u47Var.getClass();
                if (u47Var instanceof s47) {
                    int i8 = FantasyUserSquadActivity.N;
                    ev6 ev6Var = e57Var.o;
                    s47 s47Var = (s47) u47Var;
                    p4h.y(context, ev6Var.c, ev6Var.d, s47Var.a, Integer.valueOf(s47Var.b));
                } else {
                    e57Var.getClass();
                    if (u47Var instanceof r47) {
                        z47 z47Var = (z47) e57Var.l().a();
                        if (z47Var != null && (gv9Var = z47Var.a) != null) {
                            Iterator it = gv9Var.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (((mj7) obj2).a == ((r47) u47Var).a) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            mj7 mj7Var = (mj7) obj2;
                            if (mj7Var != null) {
                                rq3 rq3Var3 = null;
                                e57Var.n(null, new x16(mj7Var, 14));
                                g9i g9iVar = e57Var.q;
                                if (g9iVar != null) {
                                    g9iVar.e(null);
                                }
                                e57Var.q = xw3.L(un0.z(e57Var), null, null, new a57(e57Var, mj7Var, rq3Var3, 2), 3);
                            }
                        }
                    } else {
                        rq3 rq3Var4 = null;
                        if (u47Var.equals(t47.a)) {
                            ynb.m(e57Var, new r3(e57Var, rq3Var4, i2));
                        }
                    }
                }
                return Unit.a;
            case 1:
                t77 t77Var = (t77) this.b;
                gv9 gv9Var2 = (gv9) this.c;
                z47 z47Var2 = (z47) obj;
                z47Var2.getClass();
                return z47.a(z47Var2, null, t77Var, gv9Var2, false, 3);
            case 2:
                j67 j67Var = (j67) this.b;
                Function1 function1 = (Function1) this.c;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                esa.d(esaVar, null, null, new tc3(-1964748086, new b47(j67Var, function1, 1), true), 3);
                esa.d(esaVar, null, null, new tc3(1141539969, new b47(j67Var, function1, 2), true), 3);
                esa.d(esaVar, null, null, new tc3(1264443906, new y47(15, function1), true), 3);
                return Unit.a;
            case 3:
                Context context2 = (Context) this.b;
                FantasyManagerProfileActivity fantasyManagerProfileActivity = (FantasyManagerProfileActivity) this.c;
                anh anhVar = (anh) obj;
                int i9 = FantasyManagerProfileActivity.N;
                anhVar.getClass();
                int i10 = ze3.C;
                CoordinatorLayout coordinatorLayout = fantasyManagerProfileActivity.Q().a;
                coordinatorLayout.getClass();
                ze3 I = fkf.I(context2, coordinatorLayout, anhVar);
                if (I != null) {
                    I.i();
                }
                return Unit.a;
            case 4:
                e1d e1dVar = (e1d) this.b;
                FantasyNewsArticlesActivity fantasyNewsArticlesActivity = (FantasyNewsArticlesActivity) this.c;
                esa esaVar2 = (esa) obj;
                int i11 = FantasyNewsArticlesActivity.M;
                esaVar2.getClass();
                gv9 gv9Var3 = ((m87) e1dVar.getValue()).b;
                esaVar2.a(gv9Var3.size(), new j87(0, new e87(2), gv9Var3), new j87(1, new e87(3), gv9Var3), new tc3(802480018, new aj(i3, gv9Var3, fantasyNewsArticlesActivity), true));
                return Unit.a;
            case 5:
                wd8 wd8Var = (wd8) this.b;
                Function1 function12 = (Function1) this.c;
                FantasyLeagueGameType fantasyLeagueGameType = (FantasyLeagueGameType) obj;
                fantasyLeagueGameType.getClass();
                wd8.a(wd8Var);
                function12.invoke(fantasyLeagueGameType);
                return Unit.a;
            case 6:
                Window window = (Window) this.b;
                View view = (View) this.c;
                ((o55) obj).getClass();
                bal balVar = new bal(window, view);
                boolean y = balVar.a.y();
                balVar.b(false);
                return new db7(balVar, y);
            case 7:
                int i12 = 0;
                mb7 mb7Var = (mb7) this.b;
                Function1 function13 = (Function1) this.c;
                yoa yoaVar = (yoa) obj;
                yoaVar.getClass();
                yoaVar.j("screen_header", new e87(i3), "screen_header", n9e.a);
                Pair[] pairArr = {new Pair(mb7Var.b, FantasyCompetitionType.SEASON), new Pair(mb7Var.c, FantasyCompetitionType.WEEKLY)};
                int i13 = 0;
                while (i13 < 2) {
                    Pair pair = pairArr[i13];
                    gv9 gv9Var4 = (gv9) pair.a;
                    FantasyCompetitionType fantasyCompetitionType = (FantasyCompetitionType) pair.b;
                    if (!gv9Var4.isEmpty()) {
                        yoaVar.j(fantasyCompetitionType + "-competitions_header", new e87(7), "competitions_header", new tc3(-1482427697, new qm4(16, fantasyCompetitionType, function13), true));
                        yoaVar.l(gv9Var4.size(), new j87(2, new x16(fantasyCompetitionType, 17), gv9Var4), new j87(3, new e87(8), gv9Var4), new tc3(-1117249557, new jb7(gv9Var4, function13, i12), true));
                    }
                    i13++;
                    i12 = 0;
                }
                return Unit.a;
            case 8:
                Function1 function14 = (Function1) this.b;
                FantasyCompetitionType fantasyCompetitionType2 = (FantasyCompetitionType) this.c;
                ((FantasyCompetitionType) obj).getClass();
                function14.invoke(new eb7(fantasyCompetitionType2));
                return Unit.a;
            case 9:
                Function1 function15 = (Function1) this.b;
                yc7 yc7Var = (yc7) this.c;
                kc7 kc7Var = (kc7) obj;
                kc7Var.getClass();
                if (kc7Var instanceof hc7) {
                    function15.invoke(((hc7) kc7Var).a);
                } else {
                    yc7Var.n(kc7Var);
                }
                return Unit.a;
            case 10:
                Context context3 = (Context) this.b;
                if7 if7Var = (if7) this.c;
                int i14 = if7Var.d;
                bf7 bf7Var = (bf7) obj;
                bf7Var.getClass();
                if (bf7Var.equals(ze7.a)) {
                    nj7[] nj7VarArr = nj7.a;
                    context3.getClass();
                    nv.A(context3, "open_rules", null);
                    StringBuilder sb = new StringBuilder("https://www.sofascore.com/fantasy/rules");
                    sb.append("?competitionId=" + i14);
                    sb.append("#pricing");
                    p4h.w(context3, sb.toString());
                } else if (bf7Var instanceof ye7) {
                    ef7 ef7Var = ((ye7) bf7Var).a;
                    fdi fdiVar = if7Var.f;
                    do {
                        value = fdiVar.getValue();
                    } while (!fdiVar.k(value, gf7.a((gf7) value, ef7Var, null, null, null, 61)));
                } else {
                    if (!(bf7Var instanceof af7)) {
                        zzl.b();
                        return null;
                    }
                    int i15 = PlayerActivity.Z;
                    jle.q(context3, ((af7) bf7Var).a, 0, null, null, false, Integer.valueOf(i14), null, 444);
                }
                return Unit.a;
            case 11:
                ku3 ku3Var = (ku3) this.b;
                qug qugVar = (qug) this.c;
                if (((Boolean) obj).booleanValue()) {
                    xw3.L(ku3Var, null, null, new ww6(qugVar, null, i6), 3);
                }
                return Unit.a;
            case 12:
                ml7 ml7Var = (ml7) this.b;
                Activity activity = (Activity) this.c;
                al7 al7Var = (al7) obj;
                al7Var.getClass();
                if (al7Var.equals(vk7.a)) {
                    ml7Var.l();
                } else if (al7Var.equals(wk7.a)) {
                    fdi fdiVar2 = ml7Var.m;
                    do {
                        value2 = fdiVar2.getValue();
                    } while (!fdiVar2.k(value2, ll7.a((ll7) value2, null, null, null, false, false, false, false, 383)));
                    Application application = ml7Var.b;
                    application.getClass();
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = application.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences = d;
                    }
                    SharedPreferences.Editor i16 = dmi.i(sharedPreferences, "PREF_SUBSTITUTIONS_INFO_DISMISSED", true);
                    Unit unit = Unit.a;
                    i16.apply();
                } else if (al7Var.equals(xk7.a)) {
                    ml7Var.getClass();
                    xw3.L(un0.z(ml7Var), null, null, new hs6(ml7Var, rq3Var2, 27), 3);
                } else if (!al7Var.equals(zk7.a)) {
                    if (!(al7Var instanceof yk7)) {
                        zzl.b();
                        return null;
                    }
                    yk7 yk7Var = (yk7) al7Var;
                    yy6 yy6Var = yk7Var.a.c;
                    int i17 = yy6Var == null ? -1 : il7.a[yy6Var.ordinal()];
                    if (i17 != -1) {
                        if (i17 == 1) {
                            FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = yk7Var.a;
                            ml7Var.getClass();
                            FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 = ml7Var.t;
                            if (fantasyRoundPlayerUiModel2 == null) {
                                fantasyRoundPlayerUiModel2 = fantasyRoundPlayerUiModel;
                            }
                            FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel3 = ml7Var.s;
                            FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel4 = fantasyRoundPlayerUiModel3 == null ? fantasyRoundPlayerUiModel : fantasyRoundPlayerUiModel3;
                            ?? r6 = (fantasyRoundPlayerUiModel4.k && fantasyRoundPlayerUiModel2.k) == true || (fantasyRoundPlayerUiModel4.b == fantasyRoundPlayerUiModel2.b) == true;
                            fdi fdiVar3 = ml7Var.m;
                            while (true) {
                                Object value3 = fdiVar3.getValue();
                                ll7 ll7Var = (ll7) value3;
                                gv9<FantasyRoundPlayerUiModel> gv9Var5 = ll7Var.c;
                                char c2 = c;
                                ArrayList arrayList = new ArrayList(k13.r(gv9Var5, 10));
                                for (FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel5 : gv9Var5) {
                                    int i18 = i5;
                                    int i19 = fantasyRoundPlayerUiModel5.a;
                                    int i20 = i6;
                                    if (i19 == fantasyRoundPlayerUiModel2.a) {
                                        rq3Var = rq3Var2;
                                        b = FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel5, null, fantasyRoundPlayerUiModel4.d, false, fantasyRoundPlayerUiModel4.k, fantasyRoundPlayerUiModel4.m, null, null, 536865783);
                                    } else {
                                        rq3Var = rq3Var2;
                                        b = i19 == fantasyRoundPlayerUiModel4.a ? FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel5, null, r6 != false ? fantasyRoundPlayerUiModel2.d : Integer.MAX_VALUE, false, fantasyRoundPlayerUiModel2.k, fantasyRoundPlayerUiModel2.m, null, null, 536865783) : fantasyRoundPlayerUiModel5;
                                    }
                                    arrayList.add(b);
                                    i5 = i18;
                                    i6 = i20;
                                    rq3Var2 = rq3Var;
                                }
                                int i21 = i5;
                                ?? r29 = rq3Var2;
                                int i22 = i6;
                                if (r6 == true) {
                                    i = i7;
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        Object next = it2.next();
                                        if (((FantasyRoundPlayerUiModel) next).k) {
                                            arrayList2.add(next);
                                        }
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it3 = arrayList.iterator();
                                    while (it3.hasNext()) {
                                        Object next2 = it3.next();
                                        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel6 = (FantasyRoundPlayerUiModel) next2;
                                        int i23 = i7;
                                        if (fantasyRoundPlayerUiModel6.b == rz6.h && !fantasyRoundPlayerUiModel6.k) {
                                            arrayList3.add(next2);
                                        }
                                        i7 = i23;
                                    }
                                    i = i7;
                                    ArrayList arrayList4 = new ArrayList();
                                    Iterator it4 = arrayList.iterator();
                                    while (it4.hasNext()) {
                                        Object next3 = it4.next();
                                        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel7 = (FantasyRoundPlayerUiModel) next3;
                                        if (fantasyRoundPlayerUiModel7.b == rz6.i && !fantasyRoundPlayerUiModel7.k) {
                                            arrayList4.add(next3);
                                        }
                                    }
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator it5 = arrayList.iterator();
                                    while (it5.hasNext()) {
                                        Object next4 = it5.next();
                                        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel8 = (FantasyRoundPlayerUiModel) next4;
                                        ArrayList arrayList6 = arrayList4;
                                        if (fantasyRoundPlayerUiModel8.b == rz6.j && !fantasyRoundPlayerUiModel8.k) {
                                            arrayList5.add(next4);
                                        }
                                        arrayList4 = arrayList6;
                                    }
                                    ArrayList arrayList7 = arrayList4;
                                    ArrayList arrayList8 = new ArrayList();
                                    Iterator it6 = arrayList.iterator();
                                    while (it6.hasNext()) {
                                        Object next5 = it6.next();
                                        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel9 = (FantasyRoundPlayerUiModel) next5;
                                        if (fantasyRoundPlayerUiModel9.b == rz6.k && !fantasyRoundPlayerUiModel9.k) {
                                            arrayList8.add(next5);
                                        }
                                    }
                                    List[] listArr = new List[5];
                                    listArr[i21] = arrayList3;
                                    listArr[i22] = arrayList7;
                                    listArr[2] = arrayList5;
                                    listArr[i] = arrayList8;
                                    listArr[c2] = arrayList2;
                                    List j = b.j(listArr);
                                    ArrayList arrayList9 = new ArrayList(k13.r(j, 10));
                                    Iterator it7 = j.iterator();
                                    while (it7.hasNext()) {
                                        List H0 = CollectionsKt.H0((List) it7.next(), new se7(8));
                                        ArrayList arrayList10 = new ArrayList(k13.r(H0, 10));
                                        int i24 = i21;
                                        for (Object obj3 : H0) {
                                            int i25 = i24 + 1;
                                            if (i24 < 0) {
                                                b.q();
                                                throw r29;
                                            }
                                            arrayList10.add(FantasyRoundPlayerUiModel.b((FantasyRoundPlayerUiModel) obj3, null, i25, false, false, false, null, null, 536870903));
                                            i24 = i25;
                                        }
                                        arrayList9.add(arrayList10);
                                    }
                                    arrayList = k13.s(arrayList9);
                                }
                                if (fdiVar3.k(value3, ll7.a(ll7Var, null, l6g.W(arrayList), null, false, false, false, false, PglCryptUtils.UNKNOWN_ERR))) {
                                    ml7Var.k();
                                    ml7Var.l();
                                } else {
                                    c = c2;
                                    i5 = i21;
                                    i6 = i22;
                                    rq3Var2 = r29;
                                    i7 = i;
                                }
                            }
                        } else if (i17 == 2 || i17 == 3) {
                            ml7Var.l();
                        }
                    } else if (activity != null) {
                        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel10 = yk7Var.a;
                        ho7 ho7Var = ml7Var.g;
                        mj7 mj7Var2 = ho7Var.a;
                        int i26 = mj7Var2.a;
                        int i27 = mj7Var2.j;
                        FantasyCompetitionType fantasyCompetitionType3 = ml7Var.r;
                        boolean z = ho7Var.g;
                        boolean z2 = ml7Var.h.A;
                        fantasyCompetitionType3.getClass();
                        FantasyFootballPlayerSubstitutionsBottomSheet fantasyFootballPlayerSubstitutionsBottomSheet = new FantasyFootballPlayerSubstitutionsBottomSheet();
                        fantasyFootballPlayerSubstitutionsBottomSheet.setArguments(fz8.C(fz8.F(SearchResponseKt.PLAYER_ENTITY, fantasyRoundPlayerUiModel10), fz8.G("competitionType", fantasyCompetitionType3), fz8.J("tripleCaptain", z), fz8.D(i27, "competitionId"), fz8.D(i26, "roundId"), fz8.J("assetsRestricted", z2)));
                        AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
                        if (appCompatActivity != null) {
                            wca.x(appCompatActivity.getLifecycle()).b(new r1(fantasyFootballPlayerSubstitutionsBottomSheet, appCompatActivity, rq3Var2, i7));
                        }
                    }
                } else if (activity != null) {
                    FantasySubstitutionsSquadInfoDisplayModeBottomSheet fantasySubstitutionsSquadInfoDisplayModeBottomSheet = new FantasySubstitutionsSquadInfoDisplayModeBottomSheet();
                    AppCompatActivity appCompatActivity2 = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
                    if (appCompatActivity2 != null) {
                        wca.x(appCompatActivity2.getLifecycle()).b(new r1(fantasySubstitutionsSquadInfoDisplayModeBottomSheet, appCompatActivity2, rq3Var2, i7));
                    }
                }
                return Unit.a;
            case 13:
                ct8 ct8Var = (ct8) this.b;
                nl7 nl7Var = (nl7) this.c;
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel11 = (FantasyRoundPlayerUiModel) obj;
                fantasyRoundPlayerUiModel11.getClass();
                ct8Var.invoke(fantasyRoundPlayerUiModel11, Integer.valueOf(nl7Var.b.a.a), nl7Var.b.a.b);
                return Unit.a;
            case 14:
                FantasyTransfersFragment fantasyTransfersFragment = (FantasyTransfersFragment) this.b;
                vn7 vn7Var = (vn7) this.c;
                MenuItem menuItem = fantasyTransfersFragment.u;
                if (menuItem != null) {
                    menuItem.setVisible(vn7Var.j);
                }
                return Unit.a;
            case 15:
                Context context4 = (Context) this.b;
                FantasyTransfersSelectReplacementDialogFragment fantasyTransfersSelectReplacementDialogFragment = (FantasyTransfersSelectReplacementDialogFragment) this.c;
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel12 = (FantasyRoundPlayerUiModel) obj;
                fantasyRoundPlayerUiModel12.getClass();
                FragmentActivity O = hkg.O(context4);
                if (O != null) {
                    int i28 = ((gk7) fantasyTransfersSelectReplacementDialogFragment.A.getValue()).w;
                    FantasyCompetitionType fantasyCompetitionType4 = fantasyTransfersSelectReplacementDialogFragment.w().g.d;
                    int i29 = fantasyTransfersSelectReplacementDialogFragment.w().f.a.a;
                    boolean z3 = fantasyTransfersSelectReplacementDialogFragment.w().g.A;
                    fantasyCompetitionType4.getClass();
                    FantasyFootballPlayerBottomSheet fantasyFootballPlayerBottomSheet = new FantasyFootballPlayerBottomSheet();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable(SearchResponseKt.PLAYER_ENTITY, fantasyRoundPlayerUiModel12);
                    bundle.putBoolean("tripleCaptain", false);
                    bundle.putInt("competitionId", i28);
                    bundle.putSerializable("competitionType", fantasyCompetitionType4);
                    bundle.putInt("roundId", i29);
                    bundle.putBoolean("assetsRestricted", z3);
                    fantasyFootballPlayerBottomSheet.setArguments(bundle);
                    AppCompatActivity appCompatActivity3 = O instanceof AppCompatActivity ? (AppCompatActivity) O : null;
                    if (appCompatActivity3 != null) {
                        wca.x(appCompatActivity3.getLifecycle()).b(new r1(fantasyFootballPlayerBottomSheet, appCompatActivity3, rq3Var2, i7));
                    }
                }
                return Unit.a;
            case 16:
                Context context5 = (Context) this.b;
                ro7 ro7Var = (ro7) this.c;
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel13 = (FantasyRoundPlayerUiModel) obj;
                fantasyRoundPlayerUiModel13.getClass();
                FragmentActivity O2 = hkg.O(context5);
                if (O2 != null) {
                    po7 po7Var = (po7) ro7Var;
                    ho7 ho7Var2 = po7Var.b;
                    mj7 mj7Var3 = ho7Var2.a;
                    int i30 = mj7Var3.j;
                    ev6 ev6Var2 = po7Var.a.c;
                    FantasyCompetitionType fantasyCompetitionType5 = ev6Var2.d;
                    int i31 = mj7Var3.a;
                    boolean z4 = ho7Var2.g;
                    boolean z5 = ev6Var2.A;
                    fantasyCompetitionType5.getClass();
                    FantasyFootballPlayerBottomSheet fantasyFootballPlayerBottomSheet2 = new FantasyFootballPlayerBottomSheet();
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable(SearchResponseKt.PLAYER_ENTITY, fantasyRoundPlayerUiModel13);
                    bundle2.putBoolean("tripleCaptain", z4);
                    bundle2.putInt("competitionId", i30);
                    bundle2.putSerializable("competitionType", fantasyCompetitionType5);
                    bundle2.putInt("roundId", i31);
                    bundle2.putBoolean("assetsRestricted", z5);
                    fantasyFootballPlayerBottomSheet2.setArguments(bundle2);
                    AppCompatActivity appCompatActivity4 = O2 instanceof AppCompatActivity ? (AppCompatActivity) O2 : null;
                    if (appCompatActivity4 != null) {
                        wca.x(appCompatActivity4.getLifecycle()).b(new r1(fantasyFootballPlayerBottomSheet2, appCompatActivity4, rq3Var2, i7));
                    }
                }
                return Unit.a;
            case 17:
                FantasyWalkthroughSelectReplacementDialogFragment fantasyWalkthroughSelectReplacementDialogFragment = (FantasyWalkthroughSelectReplacementDialogFragment) this.c;
                Context context6 = (Context) this.b;
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel14 = (FantasyRoundPlayerUiModel) obj;
                fantasyRoundPlayerUiModel14.getClass();
                vp7 w = fantasyWalkthroughSelectReplacementDialogFragment.w();
                ev6 ev6Var3 = w.g;
                mj7 mj7Var4 = ev6Var3.j;
                if (mj7Var4 == null || mj7Var4.a != w.h) {
                    mj7Var4 = ev6Var3.i;
                }
                FragmentActivity O3 = hkg.O(context6);
                if (O3 != null) {
                    int i32 = fantasyWalkthroughSelectReplacementDialogFragment.w().g.c;
                    FantasyCompetitionType fantasyCompetitionType6 = fantasyWalkthroughSelectReplacementDialogFragment.w().g.d;
                    int i33 = mj7Var4.a;
                    boolean z6 = fantasyWalkthroughSelectReplacementDialogFragment.w().g.A;
                    fantasyCompetitionType6.getClass();
                    FantasyFootballPlayerBottomSheet fantasyFootballPlayerBottomSheet3 = new FantasyFootballPlayerBottomSheet();
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable(SearchResponseKt.PLAYER_ENTITY, fantasyRoundPlayerUiModel14);
                    bundle3.putBoolean("tripleCaptain", false);
                    bundle3.putInt("competitionId", i32);
                    bundle3.putSerializable("competitionType", fantasyCompetitionType6);
                    bundle3.putInt("roundId", i33);
                    bundle3.putBoolean("assetsRestricted", z6);
                    fantasyFootballPlayerBottomSheet3.setArguments(bundle3);
                    AppCompatActivity appCompatActivity5 = O3 instanceof AppCompatActivity ? (AppCompatActivity) O3 : null;
                    if (appCompatActivity5 != null) {
                        wca.x(appCompatActivity5.getLifecycle()).b(new r1(fantasyFootballPlayerBottomSheet3, appCompatActivity5, rq3Var2, i7));
                    }
                }
                return Unit.a;
            case 18:
                a6e a6eVar = (a6e) this.b;
                ema emaVar = (ema) this.c;
                f4g f4gVar = (f4g) obj;
                f4gVar.getClass();
                float l = a6eVar.l();
                float intBitsToFloat = (Float.intBitsToFloat((int) (f4gVar.r >> 32)) + f4gVar.e0(8.0f)) * (a6eVar.k() + l);
                if (emaVar == ema.b) {
                    intBitsToFloat = -intBitsToFloat;
                }
                f4gVar.w(intBitsToFloat);
                float abs = ((double) Math.abs(l)) < 0.5d ? (Math.abs(l) * 2.0f * (-0.19999999f)) + 1.0f : 0.8f + ((1.0f - (Math.abs(l) * 2.0f)) * (-0.19999999f));
                f4gVar.k(abs);
                f4gVar.l(abs);
                return Unit.a;
            case 19:
                Activity activity2 = (Activity) this.c;
                Context context7 = (Context) this.b;
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                if (activityResult.a == -1) {
                    ia0 ia0Var = ia0.q;
                    if (ok3.p().e().getFantasyUser()) {
                        if (activity2 != null) {
                            activity2.finish();
                        }
                        boolean z7 = MainActivity.n0;
                        f8h.z(context7, fz8.C(fz8.H("open_action", "select_fantasy_tab")), 4);
                    } else {
                        int i34 = FantasyOnboardingActivity.M;
                        uic.x(context7, null, 6);
                    }
                }
                return Unit.a;
            case 20:
                RecyclerView recyclerView = (RecyclerView) this.b;
                FavoriteEntitiesFragment favoriteEntitiesFragment = (FavoriteEntitiesFragment) this.c;
                ((View) obj).getClass();
                n layoutManager = recyclerView.getLayoutManager();
                GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
                if (gridLayoutManager != null) {
                    Context requireContext = favoriteEntitiesFragment.requireContext();
                    requireContext.getClass();
                    gridLayoutManager.scrollToPositionWithOffset(0, -ao2.s(1, requireContext));
                }
                return Unit.a;
            case 21:
                FavoriteEventsFragment favoriteEventsFragment = (FavoriteEventsFragment) this.b;
                mqi mqiVar = favoriteEventsFragment.t;
                otk otkVar = favoriteEventsFragment.r;
                xs7 xs7Var = (xs7) this.c;
                List list = (List) obj;
                list.getClass();
                ws7 ws7Var = xs7Var.b;
                List list2 = ws7Var.a;
                List list3 = ws7Var.b;
                cs7 cs7Var = favoriteEventsFragment.u;
                if (cs7Var == null) {
                    Intrinsics.i("eventsAdapter");
                    throw null;
                }
                int itemCount = cs7Var.getItemCount();
                if (itemCount == 0) {
                    favoriteEventsFragment.H(list, false);
                    cs7 cs7Var2 = favoriteEventsFragment.u;
                    if (cs7Var2 == null) {
                        Intrinsics.i("eventsAdapter");
                        throw null;
                    }
                    cs7Var2.N(favoriteEventsFragment.C);
                }
                if (list.isEmpty()) {
                    ia0 ia0Var2 = ia0.q;
                    udl h = ok3.p().h();
                    Collection collection = h.j;
                    if (collection == null) {
                        collection = (Set) td4.t0(g.a, new ndl(h, rq3Var2, i4));
                    }
                    if (collection.isEmpty() && ok3.p().h().e().isEmpty()) {
                        if (favoriteEventsFragment.z) {
                            krk krkVar = favoriteEventsFragment.l;
                            krkVar.getClass();
                            RecyclerView recyclerView2 = ((go8) krkVar).c;
                            qs7 qs7Var = (qs7) mqiVar.getValue();
                            cs7 cs7Var3 = favoriteEventsFragment.u;
                            if (cs7Var3 == null) {
                                Intrinsics.i("eventsAdapter");
                                throw null;
                            }
                            recyclerView2.setAdapter(new nh3(new l[]{qs7Var, cs7Var3, favoriteEventsFragment.D(), favoriteEventsFragment.C()}));
                        }
                        cs7 cs7Var4 = favoriteEventsFragment.u;
                        if (cs7Var4 == null) {
                            Intrinsics.i("eventsAdapter");
                            throw null;
                        }
                        cs7Var4.F(list);
                        ((qs7) mqiVar.getValue()).G((String) favoriteEventsFragment.E().n.getValue(), km5.a);
                        ((zqb) otkVar.getValue()).a0 = true;
                        favoriteEventsFragment.z = false;
                    } else {
                        if (!favoriteEventsFragment.z) {
                            krk krkVar2 = favoriteEventsFragment.l;
                            krkVar2.getClass();
                            RecyclerView recyclerView3 = ((go8) krkVar2).c;
                            cs7 cs7Var5 = favoriteEventsFragment.u;
                            if (cs7Var5 == null) {
                                Intrinsics.i("eventsAdapter");
                                throw null;
                            }
                            recyclerView3.setAdapter(new nh3(new l[]{cs7Var5, favoriteEventsFragment.D(), favoriteEventsFragment.C()}));
                        }
                        cs7 cs7Var6 = favoriteEventsFragment.u;
                        if (cs7Var6 == null) {
                            Intrinsics.i("eventsAdapter");
                            throw null;
                        }
                        cs7Var6.F(a.c(pzh.d));
                        ((zqb) otkVar.getValue()).a0 = true;
                        favoriteEventsFragment.z = true;
                    }
                } else {
                    if (!favoriteEventsFragment.z) {
                        krk krkVar3 = favoriteEventsFragment.l;
                        krkVar3.getClass();
                        RecyclerView recyclerView4 = ((go8) krkVar3).c;
                        cs7 cs7Var7 = favoriteEventsFragment.u;
                        if (cs7Var7 == null) {
                            Intrinsics.i("eventsAdapter");
                            throw null;
                        }
                        recyclerView4.setAdapter(new nh3(new l[]{cs7Var7, favoriteEventsFragment.D(), favoriteEventsFragment.C()}));
                    }
                    favoriteEventsFragment.H(list, favoriteEventsFragment.y);
                    cs7 cs7Var8 = favoriteEventsFragment.u;
                    if (cs7Var8 == null) {
                        Intrinsics.i("eventsAdapter");
                        throw null;
                    }
                    cs7Var8.N(favoriteEventsFragment.C);
                    cs7 cs7Var9 = favoriteEventsFragment.u;
                    if (cs7Var9 == null) {
                        Intrinsics.i("eventsAdapter");
                        throw null;
                    }
                    cs7Var9.F(list);
                    cs7 cs7Var10 = favoriteEventsFragment.u;
                    if (cs7Var10 == null) {
                        Intrinsics.i("eventsAdapter");
                        throw null;
                    }
                    ?? r2 = itemCount != cs7Var10.getItemCount();
                    if (favoriteEventsFragment.y || r2 != false) {
                        favoriteEventsFragment.y = false;
                    }
                    ((zqb) otkVar.getValue()).a0 = false;
                    favoriteEventsFragment.z = true;
                }
                FavoriteEventsFragment.F(favoriteEventsFragment.D(), list2);
                FavoriteEventsFragment.F(favoriteEventsFragment.C(), list3);
                return Unit.a;
            case 22:
                dx7 dx7Var = (dx7) this.b;
                DbFeedPostFeedback dbFeedPostFeedback = (DbFeedPostFeedback) this.c;
                glg glgVar = (glg) obj;
                glgVar.getClass();
                dx7Var.b.a0(glgVar, dbFeedPostFeedback);
                return Unit.a;
            case 23:
                Context context8 = (Context) this.b;
                znh znhVar = (znh) this.c;
                dma dmaVar = (dma) obj;
                dmaVar.getClass();
                znhVar.i(ao2.G((int) (dmaVar.e() & 4294967295L), context8));
                return Unit.a;
            case 24:
                ((wzc) this.b).c((i7a) this.c);
                return Unit.a;
            case 25:
                FollowActionButton followActionButton = (FollowActionButton) this.b;
                Team team = (Team) this.c;
                ((Boolean) obj).getClass();
                int i35 = FollowActionButton.g;
                Context context9 = followActionButton.getContext();
                context9.getClass();
                zic.T(context9, team);
                return Unit.a;
            case 26:
                FollowActionButton followActionButton2 = (FollowActionButton) this.b;
                Player player = (Player) this.c;
                ((Boolean) obj).getClass();
                int i36 = FollowActionButton.g;
                Context context10 = followActionButton2.getContext();
                context10.getClass();
                zic.S(context10, player);
                return Unit.a;
            case 27:
                FollowButton followButton = (FollowButton) this.b;
                Team team2 = (Team) this.c;
                ((Boolean) obj).getClass();
                int i37 = FollowButton.i;
                Context context11 = followButton.getContext();
                context11.getClass();
                zic.T(context11, team2);
                return Unit.a;
            case 28:
                FollowButton followButton2 = (FollowButton) this.b;
                Player player2 = (Player) this.c;
                ((Boolean) obj).getClass();
                int i38 = FollowButton.i;
                Context context12 = followButton2.getContext();
                context12.getClass();
                zic.S(context12, player2);
                return Unit.a;
            default:
                gv9 gv9Var6 = (gv9) this.c;
                Context context13 = (Context) this.b;
                esa esaVar3 = (esa) obj;
                esaVar3.getClass();
                esaVar3.a(gv9Var6.size(), new j87(19, new gl7(18), gv9Var6), new xo(gv9Var6, i2), new tc3(802480018, new bj(i4, context13, gv9Var6), true));
                return Unit.a;
        }
    }

    public /* synthetic */ w47(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
