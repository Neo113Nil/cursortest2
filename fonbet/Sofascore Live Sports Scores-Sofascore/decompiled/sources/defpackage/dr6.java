package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.inmobi.media.Ka;
import com.sofascore.local_persistance.BrandingFantasyCompetition;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.Sports;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.model.newNetwork.UniqueTournamentAwardsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentChampionsResponse;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.competition.FantasyCompetitionActivity;
import com.sofascore.results.fantasy.competition.fixtures.FantasyFdrInfoBottomSheetModal;
import com.sofascore.results.fantasy.competition.statistics.FantasyCompetitionStatisticsFragment;
import com.sofascore.results.fantasy.onboarding.FantasyOnboardingActivity;
import com.sofascore.results.fantasy.userteam.FantasyUserSquadActivity;
import com.sofascore.results.fantasy.weekly.FantasyEliteFaceoffRevealDialog;
import com.sofascore.results.fantasy.welcome.FantasyWelcomeActivity;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.main.MainActivity;
import com.sofascore.results.team.TeamActivity;
import com.sofascore.results.tracker.TrackerBottomSheet;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class dr6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dr6(d99 d99Var, String str, String str2, e5f e5fVar) {
        this.a = 15;
        this.c = str;
        this.b = str2;
        this.d = e5fVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02a8, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r0, java.lang.Boolean.TRUE) != false) goto L138;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0256 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(Object obj) {
        jqb jqbVar;
        Iterator it;
        int i;
        Integer valueOf;
        g9i g9iVar;
        Object obj2;
        boolean contains;
        MainActivity mainActivity = (MainActivity) this.c;
        Bundle bundle = (Bundle) this.b;
        asf asfVar = (asf) this.d;
        String str = (String) obj;
        boolean z = MainActivity.n0;
        mainActivity.e0();
        MenuItem menuItem = mainActivity.Q;
        int i2 = 0;
        if (menuItem != null) {
            menuItem.setVisible(false);
        }
        mainActivity.Q().j.e(mainActivity.m0);
        mainActivity.V().v.j(Boolean.FALSE);
        rik rikVar = jqb.h;
        str.getClass();
        rikVar.getClass();
        kp5 kp5Var = jqb.s;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : kp5Var) {
            jqb jqbVar2 = (jqb) obj3;
            switch (str.hashCode()) {
                case -877324069:
                    if (str.equals(Sports.TENNIS)) {
                        contains = ph0.a0(new jqb[]{jqb.i, jqb.m, jqb.o, jqb.n}).contains(jqbVar2);
                        break;
                    }
                    contains = ph0.a0(new jqb[]{jqb.i, jqb.m, jqb.o, jqb.n}).contains(jqbVar2);
                    break;
                case 108225:
                    if (str.equals(Sports.MMA)) {
                        contains = ph0.a0(new jqb[]{jqb.l, jqb.m, jqb.o, jqb.n}).contains(jqbVar2);
                        break;
                    }
                    contains = ph0.a0(new jqb[]{jqb.i, jqb.m, jqb.o, jqb.n}).contains(jqbVar2);
                    break;
                case 108869083:
                    if (str.equals(Sports.RUGBY)) {
                        contains = ph0.a0(new jqb[]{jqb.i, jqb.m, jqb.o, jqb.n}).contains(jqbVar2);
                        break;
                    }
                    contains = ph0.a0(new jqb[]{jqb.i, jqb.m, jqb.o, jqb.n}).contains(jqbVar2);
                    break;
                case 394668909:
                    if (str.equals(Sports.FOOTBALL)) {
                        contains = ph0.a0(new jqb[]{jqb.i, jqb.m, jqb.o, jqb.n}).contains(jqbVar2);
                        break;
                    }
                    contains = ph0.a0(new jqb[]{jqb.i, jqb.m, jqb.o, jqb.n}).contains(jqbVar2);
                    break;
                case 400486431:
                    if (str.equals(Sports.MOTORSPORT)) {
                        contains = ph0.a0(new jqb[]{jqb.j, jqb.m, jqb.o, jqb.n}).contains(jqbVar2);
                        break;
                    }
                    contains = ph0.a0(new jqb[]{jqb.i, jqb.m, jqb.o, jqb.n}).contains(jqbVar2);
                    break;
                case 1227428899:
                    if (str.equals(Sports.CYCLING)) {
                        contains = ph0.a0(new jqb[]{jqb.k, jqb.m, jqb.o, jqb.n}).contains(jqbVar2);
                        break;
                    }
                    contains = ph0.a0(new jqb[]{jqb.i, jqb.m, jqb.o, jqb.n}).contains(jqbVar2);
                    break;
                default:
                    contains = ph0.a0(new jqb[]{jqb.i, jqb.m, jqb.o, jqb.n}).contains(jqbVar2);
                    break;
            }
            if (contains) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            jqb jqbVar3 = (jqb) next;
            if (jqbVar3 == jqb.o) {
                qv7 qv7Var = rv7.c;
                if (!ml4.e0()) {
                    continue;
                }
            }
            if (jqbVar3 == jqb.n) {
                yea yeaVar = j58.a;
                if (!fn0.B("should_show_world_cup")) {
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = mainActivity.getApplicationContext();
                        synchronized (uic.i) {
                            sharedPreferences = a5f.d(applicationContext);
                            uic.j = sharedPreferences;
                        }
                        sharedPreferences.getClass();
                    }
                    if (sharedPreferences.getBoolean("DEV_MODE_SHOW_WORLD_CUP", false)) {
                    }
                }
            }
            arrayList2.add(next);
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        if (!y05.a(mainActivity)) {
            arrayList3.add(arrayList3.size(), jqb.p);
        }
        if (c5n.O(mainActivity)) {
            arrayList3.add(arrayList3.size(), jqb.q);
        }
        SharedPreferences sharedPreferences2 = uic.j;
        if (sharedPreferences2 == null) {
            Context applicationContext2 = mainActivity.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences2 = a5f.d(applicationContext2);
                uic.j = sharedPreferences2;
            }
            sharedPreferences2.getClass();
        }
        int i3 = 1;
        if (!sharedPreferences2.getBoolean("media_tab_impression_sent", false)) {
            nv.z0(mainActivity, kv.IMPRESSION, "render_media_tab", "main_screen");
            SharedPreferences sharedPreferences3 = uic.j;
            if (sharedPreferences3 == null) {
                Context applicationContext3 = mainActivity.getApplicationContext();
                synchronized (uic.i) {
                    sharedPreferences3 = a5f.d(applicationContext3);
                    uic.j = sharedPreferences3;
                }
                sharedPreferences3.getClass();
            }
            SharedPreferences.Editor i4 = dmi.i(sharedPreferences3, "media_tab_impression_sent", true);
            Unit unit = Unit.a;
            i4.apply();
        }
        rq3 rq3Var = null;
        if (bundle != null) {
            Integer valueOf2 = Integer.valueOf(bundle.getInt("tab_ordinal"));
            if (!mainActivity.Z) {
                valueOf2 = null;
            }
            if (valueOf2 != null) {
                int intValue = valueOf2.intValue();
                bundle.remove("tab_ordinal");
                Iterator<E> it3 = jqb.s.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj2 = it3.next();
                        if (((jqb) obj2).ordinal() == intValue) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                jqbVar = (jqb) obj2;
                dsf dsfVar = new dsf();
                it = arrayList3.iterator();
                i = 0;
                while (true) {
                    if (it.hasNext()) {
                        i = -1;
                    } else {
                        jqb jqbVar4 = (jqb) it.next();
                        jqbVar4.getClass();
                        if (jqbVar4 != jqbVar) {
                            i++;
                        }
                    }
                }
                valueOf = i != -1 ? null : Integer.valueOf(i);
                if (valueOf == null) {
                    i2 = valueOf.intValue();
                } else {
                    int currentItem = mainActivity.Q().j.getCurrentItem();
                    Integer valueOf3 = Integer.valueOf(currentItem);
                    if (currentItem >= 0 && currentItem < arrayList3.size()) {
                        int D = mainActivity.W().D((Enum) arrayList3.get(currentItem));
                        Integer valueOf4 = Integer.valueOf(D);
                        if (D == -1) {
                            valueOf4 = null;
                        }
                    }
                    valueOf3 = null;
                    if (valueOf3 != null) {
                        i2 = valueOf3.intValue();
                    }
                }
                dsfVar.a = i2;
                Intent intent = mainActivity.getIntent();
                intent.getClass();
                jqb jqbVar5 = (jqb) g7a.y(intent, "preselected_tab", jqb.class);
                iqb W = mainActivity.W();
                W.getClass();
                W.p = str;
                mainActivity.Q().j.post(new ep1(mainActivity, jqbVar5, dsfVar, arrayList3, asfVar, str, 1));
                zqb V = mainActivity.V();
                g9iVar = V.Z;
                if (g9iVar != null) {
                    g9iVar.e(null);
                }
                V.Z = xw3.L(un0.z(V), null, null, new vqb(V, str, rq3Var, i3), 3);
                return Unit.a;
            }
        }
        jqbVar = null;
        dsf dsfVar2 = new dsf();
        it = arrayList3.iterator();
        i = 0;
        while (true) {
            if (it.hasNext()) {
            }
            i++;
        }
        if (i != -1) {
        }
        if (valueOf == null) {
        }
        dsfVar2.a = i2;
        Intent intent2 = mainActivity.getIntent();
        intent2.getClass();
        jqb jqbVar52 = (jqb) g7a.y(intent2, "preselected_tab", jqb.class);
        iqb W2 = mainActivity.W();
        W2.getClass();
        W2.p = str;
        mainActivity.Q().j.post(new ep1(mainActivity, jqbVar52, dsfVar2, arrayList3, asfVar, str, 1));
        zqb V2 = mainActivity.V();
        g9iVar = V2.Z;
        if (g9iVar != null) {
        }
        V2.Z = xw3.L(un0.z(V2), null, null, new vqb(V2, str, rq3Var, i3), 3);
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04bd  */
    /* JADX WARN: Type inference failed for: r0v118, types: [p0d] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r14v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r15v14, types: [kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object obj2;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        g6b lifecycle;
        long j;
        int i = this.a;
        int i2 = 24;
        int i3 = 15;
        int i4 = 11;
        int i5 = 2;
        int i6 = 4;
        int i7 = 1;
        int i8 = 0;
        int i9 = 3;
        String j2 = null;
        Object obj3 = this.d;
        Object obj4 = this.b;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                nr6 nr6Var = (nr6) obj5;
                Context context = (Context) obj4;
                hp6 hp6Var = (hp6) obj3;
                ep6 ep6Var = (ep6) obj;
                ep6Var.getClass();
                if (!ep6Var.equals(ep6.a)) {
                    zzl.b();
                    return null;
                }
                hr6 k = nr6Var.k();
                do7 do7Var = nr6Var.h;
                mj7 mj7Var = k.e;
                if (mj7Var != null) {
                    ev6 ev6Var = do7Var.c;
                    int i10 = ev6Var.c;
                    context.getClass();
                    long longValue = ((Number) n9e.x(context, new q13(i10, i2))).longValue();
                    Long l = mj7Var.h;
                    if (longValue < (l != null ? l.longValue() : 0L)) {
                        FragmentActivity K = hkg.K(context);
                        if (K != null) {
                            int i11 = mj7Var.a;
                            int i12 = mj7Var.c;
                            FantasyEliteFaceoffRevealDialog fantasyEliteFaceoffRevealDialog = new FantasyEliteFaceoffRevealDialog();
                            fantasyEliteFaceoffRevealDialog.setArguments(fz8.C(fz8.G("competition", ev6Var), fz8.D(i11, "roundId"), fz8.D(i12, "roundSequence")));
                            fantasyEliteFaceoffRevealDialog.p(K.k(), "RevealDialog");
                        }
                        n9e.u(context, new we7(ev6Var.c, yaa.w(), 0));
                        hp6Var.k();
                    }
                }
                return Unit.a;
            case 1:
                Context context2 = (Context) obj4;
                xu6 xu6Var = (xu6) obj3;
                ev6 ev6Var2 = (ev6) obj;
                ev6Var2.getClass();
                int i13 = ev6Var2.c;
                ((Function0) obj5).invoke();
                FragmentActivity O = hkg.O(context2);
                if (O != null) {
                    O.finish();
                }
                Iterator it = ((wu6) ((eoh) xu6Var.g).getValue()).d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((do7) obj2).c.c == i13) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                do7 do7Var2 = (do7) obj2;
                if (do7Var2 != null) {
                    int i14 = FantasyCompetitionActivity.R;
                    mx9.z(context2, do7Var2.c.c, 12);
                } else {
                    FirebaseBundle firebaseBundle = new FirebaseBundle();
                    firebaseBundle.putInt("id", i13);
                    ia0 ia0Var = ia0.q;
                    me4.d((f5d) me4.e(), "fantasy_select_competition", firebaseBundle, context2).a.e(n9e.K(firebaseBundle), null, "fantasy_select_competition", false);
                    int i15 = FantasyOnboardingActivity.M;
                    uic.x(context2, Integer.valueOf(i13), 4);
                }
                return Unit.a;
            case 2:
                wu6 wu6Var = (wu6) obj5;
                Function1 function1 = (Function1) obj3;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                gv9 gv9Var = wu6Var.d;
                esaVar.a(gv9Var.size(), new zi(25, new yt6(i7), gv9Var), new zi(26, new yt6(i5), gv9Var), new tc3(802480018, new vu6(gv9Var, wu6Var, (Function1) obj4), true));
                if (!wu6Var.c.isEmpty()) {
                    esa.d(esaVar, null, new au6(3), ml4.i, 1);
                    esa.d(esaVar, null, new au6(4), new tc3(1061971085, new qm4(i4, wu6Var, function1), true), 1);
                }
                return Unit.a;
            case 3:
                FantasyCompetitionStatisticsFragment fantasyCompetitionStatisticsFragment = (FantasyCompetitionStatisticsFragment) obj5;
                e1d e1dVar = (e1d) obj4;
                e1d e1dVar2 = (e1d) obj3;
                mei meiVar = (mei) obj;
                meiVar.getClass();
                int ordinal = meiVar.ordinal();
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        FragmentActivity requireActivity = fantasyCompetitionStatisticsFragment.requireActivity();
                        requireActivity.getClass();
                        FantasyFdrInfoBottomSheetModal fantasyFdrInfoBottomSheetModal = new FantasyFdrInfoBottomSheetModal();
                        AppCompatActivity appCompatActivity = requireActivity instanceof AppCompatActivity ? (AppCompatActivity) requireActivity : null;
                        if (appCompatActivity != null) {
                            wca.x(appCompatActivity.getLifecycle()).b(new r1(fantasyFdrInfoBottomSheetModal, appCompatActivity, r14, i9));
                        }
                    } else if (meiVar == ((mei) e1dVar.getValue())) {
                        fdi fdiVar = fantasyCompetitionStatisticsFragment.D().s;
                        anf anfVar = nei.b;
                        nei neiVar = (nei) e1dVar2.getValue();
                        anfVar.getClass();
                        neiVar.getClass();
                        nei neiVar2 = nei.ASCENDING;
                        if (neiVar == neiVar2) {
                            neiVar2 = nei.DESCENDING;
                        }
                        fdiVar.getClass();
                        fdiVar.m(null, neiVar2);
                    } else {
                        fdi fdiVar2 = fantasyCompetitionStatisticsFragment.D().s;
                        nei neiVar3 = nei.DESCENDING;
                        fdiVar2.getClass();
                        fdiVar2.m(null, neiVar3);
                        fdi fdiVar3 = fantasyCompetitionStatisticsFragment.D().r;
                        fdiVar3.getClass();
                        fdiVar3.m(null, meiVar);
                    }
                }
                return Unit.a;
            case 4:
                h27 h27Var = (h27) obj5;
                ku3 ku3Var = (ku3) obj3;
                Context context3 = (Context) obj4;
                b27 b27Var = (b27) obj;
                b27Var.getClass();
                if (b27Var.equals(x17.a)) {
                    String str = ((f27) ((eoh) h27Var.f).getValue()).b;
                    if (str != null) {
                        nv.A(context3, "share", "copy_link");
                        hkg.C(context3, str, "Fantasy league code");
                    }
                } else {
                    rq3 rq3Var = null;
                    if (b27Var instanceof y17) {
                        xw3.L(ku3Var, null, null, new hs6(context3, b27Var, rq3Var, 10), 3);
                    } else if (b27Var instanceof a27) {
                        xw3.L(ku3Var, null, null, new rh4(context3, b27Var, h27Var, rq3Var, 26), 3);
                    } else {
                        if (!b27Var.equals(z17.a)) {
                            zzl.b();
                            return null;
                        }
                        zic.P(context3, R.string.fantasy_generate_new_code_title, R.string.fantasy_generate_new_code_text, R.string.fantasy_generate_code_button, new av6(0, h27Var, h27.class, "regenerateJoinCode", "regenerateJoinCode()V", 0, 7), 48);
                    }
                }
                return Unit.a;
            case 5:
                ((Function1) obj5).invoke((fo1) obj);
                xw3.L((ku3) obj4, null, null, new ck1(i6, r14, (ksa) obj3), 3);
                return Unit.a;
            case 6:
                osa osaVar = (osa) obj5;
                esa esaVar2 = (esa) obj;
                esaVar2.getClass();
                esaVar2.a(osaVar.c(), new uf8(i3, new yt6(13), osaVar), new yt6(14), new tc3(1237902302, new c61(i9, osaVar, (e67) obj4, (Function1) obj3), true));
                if (Intrinsics.c(osaVar.d().c, ofb.b)) {
                    esa.d(esaVar2, "loading_indicator", null, iz8.b, 2);
                }
                return Unit.a;
            case 7:
                Function0 function0 = (Function0) obj5;
                h67 h67Var = (h67) obj3;
                Context context4 = (Context) obj4;
                w57 w57Var = (w57) obj;
                w57Var.getClass();
                if (w57Var.equals(s57.a)) {
                    function0.invoke();
                } else if (w57Var instanceof v57) {
                    ((eoh) h67Var.h).setValue(e67.a(h67Var.k(), ((v57) w57Var).a, false, null, 27));
                } else if (w57Var instanceof u57) {
                    int i16 = FantasyUserSquadActivity.N;
                    p4h.y(context4, h67Var.g, FantasyCompetitionType.SEASON, ((u57) w57Var).a, null);
                } else {
                    if (!(w57Var instanceof t57)) {
                        zzl.b();
                        return null;
                    }
                    String string = context4.getString(R.string.fantasy_remove_team_title, ((t57) w57Var).b);
                    string.getClass();
                    String string2 = context4.getString(R.string.fantasy_remove_team_text);
                    string2.getClass();
                    String string3 = context4.getString(R.string.fantasy_remove_button);
                    string3.getClass();
                    zic.O(context4, string, string2, string3, R.color.error, null, new n37(i9, h67Var, w57Var));
                }
                return Unit.a;
            case 8:
                wb7 wb7Var = (wb7) obj5;
                Function1 function12 = (Function1) obj4;
                Function1 function13 = (Function1) obj3;
                u97 u97Var = (u97) obj;
                u97Var.getClass();
                int i17 = u97Var.a;
                if (u97Var.b == FantasyCompetitionType.WEEKLY || wb7Var.i) {
                    function12.invoke(Integer.valueOf(i17));
                } else {
                    function13.invoke(Integer.valueOf(i17));
                }
                return Unit.a;
            case 9:
                ta7 ta7Var = (ta7) obj5;
                wb7 wb7Var2 = (wb7) obj4;
                e1d e1dVar3 = (e1d) obj3;
                pa7 pa7Var = (pa7) obj;
                pa7Var.getClass();
                if (pa7Var instanceof ka7) {
                    boolean z = ((ka7) pa7Var).a;
                    fdi fdiVar4 = ta7Var.h;
                    do {
                        value4 = fdiVar4.getValue();
                    } while (!fdiVar4.k(value4, ra7.a((ra7) value4, null, null, null, false, null, null, z, false, 191)));
                    ta7Var.l();
                } else if (pa7Var instanceof la7) {
                    rn6 rn6Var = ((la7) pa7Var).a;
                    fdi fdiVar5 = ta7Var.h;
                    do {
                        value3 = fdiVar5.getValue();
                    } while (!fdiVar5.k(value3, ra7.a((ra7) value3, null, null, null, false, null, rn6Var, false, false, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE)));
                    ta7Var.l();
                } else if (pa7Var instanceof ma7) {
                    String str2 = ((ra7) e1dVar3.getValue()).c;
                    Boolean valueOf = Boolean.valueOf(((ra7) e1dVar3.getValue()).g);
                    rn6 rn6Var2 = ((ra7) e1dVar3.getValue()).f;
                    Integer valueOf2 = rn6Var2 != null ? Integer.valueOf(rn6Var2.a) : null;
                    wb7Var2.getClass();
                    str2.getClass();
                    ev6 ev6Var3 = ((pb7) wb7Var2.k.a.getValue()).f;
                    if (ev6Var3 != null) {
                        int i18 = ev6Var3.c;
                        BrandingFantasyCompetition brandingFantasyCompetition = ev6Var3.D;
                        Integer valueOf3 = brandingFantasyCompetition != null ? Integer.valueOf(brandingFantasyCompetition.getId()) : null;
                        fdi fdiVar6 = wb7Var2.j;
                        do {
                            value2 = fdiVar6.getValue();
                        } while (!fdiVar6.k(value2, pb7.a((pb7) value2, null, null, 0, 0, null, null, null, null, null, null, 0, 0.0d, 0.0d, false, null, false, null, true, null, false, null, null, 8257535)));
                        xw3.L(un0.z(wb7Var2), null, null, new ru1(wb7Var2, i18, ev6Var3, valueOf, str2, valueOf2, valueOf3, (rq3) null), 3);
                    }
                } else if (pa7Var instanceof na7) {
                    String str3 = ((na7) pa7Var).a;
                    ta7Var.getClass();
                    fdi fdiVar7 = ta7Var.h;
                    do {
                        value = fdiVar7.getValue();
                    } while (!fdiVar7.k(value, ra7.a((ra7) value, null, null, str3, false, null, null, false, false, 251)));
                    ta7Var.l();
                } else {
                    if (!pa7Var.equals(oa7.a)) {
                        zzl.b();
                        return null;
                    }
                    ta7Var.k();
                }
                return Unit.a;
            case 10:
                wb7 wb7Var3 = (wb7) obj5;
                ComponentActivity componentActivity = (ComponentActivity) obj3;
                Context context5 = (Context) obj4;
                int intValue = ((Integer) obj).intValue();
                Object obj6 = null;
                for (Object obj7 : ke0.n) {
                    if (((Activity) obj7) instanceof FantasyWelcomeActivity) {
                        obj6 = obj7;
                    }
                }
                FantasyWelcomeActivity fantasyWelcomeActivity = (FantasyWelcomeActivity) (obj6 instanceof FantasyWelcomeActivity ? obj6 : 0);
                if (fantasyWelcomeActivity != null) {
                    fantasyWelcomeActivity.finish();
                    Calendar calendar = ke0.a;
                    ke0.n.remove(fantasyWelcomeActivity);
                }
                boolean z2 = wb7Var3.h;
                jof jofVar = wb7Var3.k;
                if (!z2 || ((pb7) jofVar.a.getValue()).v == null) {
                    int i19 = FantasyCompetitionActivity.R;
                    ip6 ip6Var = ip6.c;
                    mx9.z(context5, intValue, 4);
                } else {
                    Intent intent = new Intent();
                    intent.putExtra("userCompetition", ((pb7) jofVar.a.getValue()).v);
                    Unit unit = Unit.a;
                    componentActivity.setResult(101, intent);
                }
                componentActivity.finishAfterTransition();
                return Unit.a;
            case 11:
                Context context6 = (Context) obj4;
                k7d k7dVar = (k7d) obj5;
                ?? r15 = (Function1) obj3;
                Integer num = (Integer) obj;
                int intValue2 = num.intValue();
                if (Build.VERSION.SDK_INT < 33 || eq3.b(context6, "android.permission.POST_NOTIFICATIONS") == 0) {
                    r15.invoke(num);
                } else {
                    wa7 wa7Var = new wa7(intValue2);
                    k6d k6dVar = k7dVar.b;
                    k6dVar.getClass();
                    v7d v7dVar = new v7d();
                    v7dVar.b = k7dVar.b.g().g.b;
                    v7dVar.c = false;
                    Unit unit2 = Unit.a;
                    v7dVar.c = true;
                    v7dVar.d = false;
                    Unit unit3 = Unit.a;
                    t7d t7dVar = v7dVar.a;
                    t7dVar.a = false;
                    t7dVar.b = false;
                    int i20 = v7dVar.b;
                    boolean z3 = v7dVar.c;
                    boolean z4 = v7dVar.d;
                    t7dVar.c = i20;
                    t7dVar.d = z3;
                    t7dVar.e = z4;
                    k6dVar.l(wa7Var, t7dVar.a());
                }
                return Unit.a;
            case 12:
                n29 n29Var = (n29) obj5;
                yma ymaVar = (yma) obj;
                ymaVar.getClass();
                ha5.s0(ymaVar, n29Var, new da5(ymaVar, 1));
                xw3.L((ku3) obj4, null, null, new d27(n29Var, (e1d) obj3, r14, i7), 3);
                return Unit.a;
            case 13:
                Function0 function02 = (Function0) obj5;
                vp7 vp7Var = (vp7) obj4;
                Function2 function2 = (Function2) obj3;
                np7 np7Var = (np7) obj;
                np7Var.getClass();
                if (np7Var.equals(kp7.a)) {
                    function02.invoke();
                } else if (np7Var.equals(jp7.a) || np7Var.equals(lp7.a)) {
                    smh smhVar = smh.e;
                    vp7Var.getClass();
                    xw3.L(un0.z(vp7Var), null, null, new up7(vp7Var, null, 0), 3);
                    function02.invoke();
                } else {
                    if (!(np7Var instanceof mp7)) {
                        zzl.b();
                        return null;
                    }
                    function2.invoke(((mp7) np7Var).a, Integer.valueOf(vp7Var.k().b));
                }
                return Unit.a;
            case 14:
                ip8 ip8Var = (ip8) obj5;
                Fragment fragment = (Fragment) obj4;
                d6d d6dVar = (d6d) obj3;
                u6b u6bVar = (u6b) obj;
                ArrayList arrayList = ip8Var.g;
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.c(((Pair) it2.next()).a, fragment.getTag())) {
                            if (u6bVar != null && i7 == 0) {
                                lifecycle = fragment.getViewLifecycleOwner().getLifecycle();
                                if (lifecycle.b().compareTo(e6b.c) >= 0) {
                                    lifecycle.a((t6b) ip8Var.i.invoke(d6dVar));
                                }
                            }
                            return Unit.a;
                        }
                    }
                }
                i7 = 0;
                if (u6bVar != null) {
                    lifecycle = fragment.getViewLifecycleOwner().getLifecycle();
                    if (lifecycle.b().compareTo(e6b.c) >= 0) {
                    }
                }
                return Unit.a;
            case 15:
                String str4 = (String) obj5;
                String str5 = (String) obj4;
                e5f e5fVar = (e5f) obj3;
                ?? r0 = (p0d) obj;
                e5f e5fVar2 = d99.c;
                e5f e5fVar3 = d99.d;
                String str6 = "";
                if (((String) kda.B(r0, e5fVar3, "")).equals(str4)) {
                    e5f c = d99.c(r0, str4);
                    if (c != null && !c.a.equals(str5)) {
                        d99.d(r0, str4);
                        HashSet hashSet = new HashSet((Collection) kda.B(r0, e5fVar, new HashSet()));
                        hashSet.add(str4);
                        r0.f(e5fVar, hashSet);
                    }
                } else {
                    long longValue2 = ((Long) kda.B(r0, e5fVar2, 0L)).longValue();
                    long j3 = 1;
                    if (longValue2 + 1 == 30) {
                        long longValue3 = ((Long) kda.B(r0, e5fVar2, 0L)).longValue();
                        HashSet hashSet2 = new HashSet();
                        String str7 = null;
                        for (Map.Entry entry : r0.a().entrySet()) {
                            if (entry.getValue() instanceof Set) {
                                ?? r13 = (Set) entry.getValue();
                                for (String str8 : r13) {
                                    long j4 = j3;
                                    if (str7 == null || str7.compareTo(str8) > 0) {
                                        str6 = ((e5f) entry.getKey()).a;
                                        str7 = str8;
                                        hashSet2 = r13;
                                    }
                                    j3 = j4;
                                }
                            }
                            j3 = j3;
                        }
                        j = j3;
                        HashSet hashSet3 = new HashSet(hashSet2);
                        hashSet3.remove(str7);
                        str6.getClass();
                        r0.f(new e5f(str6), hashSet3);
                        longValue2 = longValue3 - j;
                        r0.f(e5fVar2, Long.valueOf(longValue2));
                    } else {
                        j = 1;
                    }
                    HashSet hashSet4 = new HashSet((Collection) kda.B(r0, e5fVar, new HashSet()));
                    hashSet4.add(str4);
                    r0.f(e5fVar, hashSet4);
                    r0.f(e5fVar2, Long.valueOf(longValue2 + j));
                    r0.f(e5fVar3, str4);
                }
                return null;
            case 16:
                Function1 function14 = (Function1) obj3;
                ((Context) obj).getClass();
                eqk eqkVar = new eqk((Context) obj4);
                ra9 ra9Var = (ra9) ((ua9) obj5);
                Highlight highlight = ra9Var.a;
                eqkVar.k = ra9Var.b;
                boolean c2 = Intrinsics.c(highlight.getLivestream(), Boolean.TRUE);
                eqkVar.i = c2;
                bu1 bu1Var = eqkVar.d;
                ((TextView) bu1Var.g).setVisibility(c2 ? 0 : 8);
                ((TextView) bu1Var.e).setVisibility(eqkVar.i ? 8 : 0);
                mqi mqiVar = qhi.a;
                String c3 = qhi.c(highlight.getUrl(), false);
                eqkVar.f = c3;
                eqkVar.g = highlight;
                if (c3 != null && (eqkVar.m != null || eqkVar.l)) {
                    ImageView imageView = (ImageView) bu1Var.j;
                    String thumbnailUrl = highlight.getThumbnailUrl();
                    apf a = ajh.a(imageView.getContext());
                    ht9 ht9Var = new ht9(imageView.getContext());
                    ht9Var.c = thumbnailUrl;
                    vt9.f(ht9Var, imageView);
                    a.a(ht9Var.a());
                    eqkVar.setVisibility(0);
                }
                eqkVar.setOnMediaCTAButtonListener(new l77(21, function14));
                return eqkVar;
            case 17:
                String str9 = (String) obj5;
                Integer num2 = (Integer) obj4;
                e1d e1dVar4 = (e1d) obj3;
                ((lj0) obj).getClass();
                if (((String) e1dVar4.getValue()) == null) {
                    if (str9 != null) {
                        j2 = fc6.n((Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "country/", str9, "/flag");
                    } else if (num2 != null) {
                        j2 = vxd.j(num2.intValue(), (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "category/", "/image");
                    }
                    e1dVar4.setValue(j2);
                }
                return Unit.a;
            case 18:
                return Ka.a((Ka) obj5, (String) obj4, (g9i) obj3, (Throwable) obj);
            case 19:
                LeagueActivity leagueActivity = (LeagueActivity) obj4;
                List list = (List) obj3;
                Season season = (Season) obj;
                a99 a99Var = LeagueActivity.h0;
                season.getClass();
                if (season.getId() != ((Season) obj5).getId()) {
                    leagueActivity.R().p = Boolean.valueOf(((Season) list.get(0)).getId() == season.getId());
                    leagueActivity.b0 = Intrinsics.c(((Season) list.get(0)).getYear(), season.getYear());
                    leagueActivity.Q(season);
                }
                return Unit.a;
            case 20:
                nua nuaVar = (nua) obj5;
                UniqueTournamentChampionsResponse uniqueTournamentChampionsResponse = (UniqueTournamentChampionsResponse) obj4;
                UniqueTournamentAwardsResponse uniqueTournamentAwardsResponse = (UniqueTournamentAwardsResponse) obj3;
                return iua.a((iua) obj, nuaVar.u(uniqueTournamentChampionsResponse), nuaVar.v(uniqueTournamentChampionsResponse != null ? uniqueTournamentChampionsResponse.getConferenceChampions() : null), nua.w(uniqueTournamentAwardsResponse != null ? uniqueTournamentAwardsResponse.getIndividualAwards() : null), null, 8);
            case 21:
                boh bohVar = (boh) obj5;
                a7b a7bVar = (a7b) obj;
                a7bVar.getClass();
                bohVar.i(yaa.v());
                return new e06(a7bVar, (Context) obj4, (xva) obj3, bohVar, 2);
            case 22:
                Context context7 = (Context) obj4;
                eza ezaVar = (eza) obj5;
                e1d e1dVar5 = (e1d) obj3;
                sya syaVar = (sya) obj;
                syaVar.getClass();
                boolean z5 = syaVar instanceof rya;
                if (z5) {
                    int i21 = TeamActivity.Z;
                    jle.r(context7, ((rya) syaVar).a, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                } else {
                    nya nyaVar = nya.a;
                    if (syaVar.equals(nyaVar)) {
                        bza bzaVar = (bza) ((vnb) e1dVar5.getValue()).a();
                        if (bzaVar != null) {
                            gv9 gv9Var2 = bzaVar.h;
                            FragmentActivity O2 = hkg.O(context7);
                            if (O2 != null) {
                                juj jujVar = juj.a;
                                int i22 = bzaVar.a;
                                int i23 = bzaVar.b;
                                String str10 = bzaVar.c;
                                String str11 = bzaVar.d;
                                String str12 = bzaVar.e;
                                u2f u2fVar = (u2f) CollectionsKt.a0(0, gv9Var2);
                                Integer valueOf4 = u2fVar != null ? Integer.valueOf(u2fVar.a) : null;
                                u2f u2fVar2 = (u2f) CollectionsKt.a0(1, gv9Var2);
                                TrackerBottomSheet b = bgf.b(jujVar, i22, i23, str10, str11, str12, valueOf4, u2fVar2 != null ? Integer.valueOf(u2fVar2.a) : null);
                                AppCompatActivity appCompatActivity2 = O2 instanceof AppCompatActivity ? (AppCompatActivity) O2 : null;
                                if (appCompatActivity2 != null) {
                                    wca.x(appCompatActivity2.getLifecycle()).b(new r1(b, appCompatActivity2, r14, i9));
                                }
                            }
                        }
                    } else {
                        ezaVar.getClass();
                        if (syaVar.equals(pya.a)) {
                            ynb.m(ezaVar, new r3(ezaVar, null, 15));
                        } else if (syaVar instanceof qya) {
                            xw3.L(un0.z(ezaVar), null, null, new yp7(ezaVar, ((qya) syaVar).a, (rq3) r14, i2), 3);
                        } else if (!z5) {
                            if (syaVar.equals(oya.a)) {
                                ezaVar.n(null, new isa(7));
                                xw3.L(un0.z(ezaVar), null, null, new cza(ezaVar, r14, i8), 3);
                            } else if (!syaVar.equals(nyaVar)) {
                                zzl.b();
                                return null;
                            }
                        }
                    }
                }
                return Unit.a;
            case 23:
                esf esfVar = (esf) obj5;
                a7b a7bVar2 = (a7b) obj;
                a7bVar2.getClass();
                esfVar.a = yaa.v();
                return new e06(a7bVar2, (Context) obj4, (vnb) obj3, esfVar);
            case 24:
                u6b u6bVar2 = (u6b) obj5;
                ob3 ob3Var = new ob3(3, (d6b) obj4, (e1d) obj3);
                u6bVar2.getLifecycle().a(ob3Var);
                return new vx0(6, u6bVar2, ob3Var);
            case 25:
                u6b u6bVar3 = (u6b) obj5;
                fsf fsfVar = new fsf();
                us5 us5Var = new us5(2, (f7b) obj4, fsfVar, (Function1) obj3);
                u6bVar3.getLifecycle().a(us5Var);
                return new ha(u6bVar3, us5Var, fsfVar, i6);
            case 26:
                u6b u6bVar4 = (u6b) obj5;
                fsf fsfVar2 = new fsf();
                us5 us5Var2 = new us5(1, (a7b) obj4, fsfVar2, (Function1) obj3);
                u6bVar4.getLifecycle().a(us5Var2);
                return new ha(u6bVar4, us5Var2, fsfVar2, i9);
            case 27:
                keb kebVar = (keb) obj5;
                leb lebVar = new leb((e1d) obj3, 0);
                kebVar.e((u6b) obj4, lebVar);
                return new vx0(7, kebVar, lebVar);
            case 28:
                return a(obj);
            default:
                byb bybVar = (byb) obj5;
                Function1 function15 = (Function1) obj4;
                Function2 function22 = (Function2) obj3;
                esa esaVar3 = (esa) obj;
                esaVar3.getClass();
                if (bybVar.c) {
                    esa.d(esaVar3, null, null, new tc3(758477192, new yya(5, (Object) bybVar, function15), true), 3);
                }
                gv9 gv9Var3 = bybVar.b;
                esaVar3.a(gv9Var3.size(), null, new xo(gv9Var3, 22), new tc3(802480018, new aj(i4, gv9Var3, function22), true));
                return Unit.a;
        }
    }

    public /* synthetic */ dr6(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    public /* synthetic */ dr6(Context context, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = context;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ dr6(Object obj, Object obj2, Context context, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = context;
    }
}
