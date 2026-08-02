package com.sofascore.results.main;

import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.text.format.DateFormat;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.ironsource.InterfaceC4060ee;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.model.Sports;
import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.mvvm.model.UniqueTournamentDetails;
import com.sofascore.results.R;
import com.sofascore.results.calendar.CalendarView;
import com.sofascore.results.calendar.MaterialCalendarView;
import com.sofascore.results.main.MainActivity;
import com.sofascore.results.main.navigation.DynamicBottomNavigation;
import com.sofascore.results.main.search.SearchActivity;
import com.sofascore.results.main.tutorial.PulsatingFrameLayout;
import com.sofascore.results.notifications.NotificationSettingsActivity;
import com.sofascore.results.profile.UserProfileActivity;
import com.sofascore.results.sofaSeason.SofaSeasonActivity;
import com.sofascore.results.view.follownotification.FollowActionButton;
import com.sofascore.results.view.follownotification.NotificationsActionButton;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a5f;
import defpackage.a70;
import defpackage.aba;
import defpackage.abb;
import defpackage.ajh;
import defpackage.ao2;
import defpackage.apf;
import defpackage.as9;
import defpackage.asf;
import defpackage.awj;
import defpackage.b1d;
import defpackage.bea;
import defpackage.beh;
import defpackage.bii;
import defpackage.bka;
import defpackage.cd5;
import defpackage.ce;
import defpackage.ct7;
import defpackage.de;
import defpackage.djf;
import defpackage.dla;
import defpackage.dn;
import defpackage.dr6;
import defpackage.duf;
import defpackage.e6b;
import defpackage.ez0;
import defpackage.f52;
import defpackage.fg2;
import defpackage.fgd;
import defpackage.fn0;
import defpackage.fsf;
import defpackage.fuf;
import defpackage.g42;
import defpackage.g6b;
import defpackage.g7a;
import defpackage.g9a;
import defpackage.gjf;
import defpackage.gz8;
import defpackage.h0;
import defpackage.hg2;
import defpackage.hkg;
import defpackage.hob;
import defpackage.hqb;
import defpackage.hs4;
import defpackage.ht9;
import defpackage.hwg;
import defpackage.i0;
import defpackage.ia0;
import defpackage.imf;
import defpackage.in6;
import defpackage.ip1;
import defpackage.iqb;
import defpackage.ixa;
import defpackage.j41;
import defpackage.j58;
import defpackage.jca;
import defpackage.jdk;
import defpackage.joa;
import defpackage.job;
import defpackage.jqb;
import defpackage.k13;
import defpackage.k6b;
import defpackage.ke0;
import defpackage.kik;
import defpackage.kv;
import defpackage.ldk;
import defpackage.ml4;
import defpackage.mme;
import defpackage.mob;
import defpackage.mqi;
import defpackage.mwj;
import defpackage.nm5;
import defpackage.nob;
import defpackage.nq8;
import defpackage.nqb;
import defpackage.nt9;
import defpackage.nv;
import defpackage.o02;
import defpackage.od;
import defpackage.og5;
import defpackage.ok3;
import defpackage.oob;
import defpackage.otk;
import defpackage.p01;
import defpackage.p15;
import defpackage.p1f;
import defpackage.ph0;
import defpackage.pk;
import defpackage.pn3;
import defpackage.pte;
import defpackage.px0;
import defpackage.qha;
import defpackage.qob;
import defpackage.qqi;
import defpackage.qv5;
import defpackage.qv7;
import defpackage.r2;
import defpackage.rfi;
import defpackage.rfo;
import defpackage.rob;
import defpackage.rq3;
import defpackage.rqb;
import defpackage.rqn;
import defpackage.rv7;
import defpackage.s0;
import defpackage.sd;
import defpackage.sl6;
import defpackage.st9;
import defpackage.sz1;
import defpackage.u6b;
import defpackage.uf8;
import defpackage.uic;
import defpackage.un0;
import defpackage.uqb;
import defpackage.urh;
import defpackage.v38;
import defpackage.vt9;
import defpackage.w42;
import defpackage.wca;
import defpackage.woc;
import defpackage.wrf;
import defpackage.wt9;
import defpackage.wxf;
import defpackage.wyh;
import defpackage.xd;
import defpackage.xs3;
import defpackage.xw3;
import defpackage.y1d;
import defpackage.yea;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.yq5;
import defpackage.yr9;
import defpackage.ysa;
import defpackage.z1;
import defpackage.z3f;
import defpackage.z45;
import defpackage.z8e;
import defpackage.zao;
import defpackage.zdl;
import defpackage.zi7;
import defpackage.zqb;
import defpackage.zr9;
import defpackage.zzc;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/main/MainActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "f8h", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MainActivity extends Hilt_MainActivity {
    public static boolean n0;
    public final joa K;
    public final otk L;
    public final otk M;
    public final otk N;
    public final joa O;
    public rv7 P;
    public MenuItem Q;
    public MenuItem R;
    public MenuItem S;
    public MenuItem T;
    public MenuItem U;
    public MenuItem V;
    public FollowActionButton W;
    public NotificationsActionButton X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public jqb b0;
    public CalendarView c0;
    public final joa d0;
    public final de e0;
    public boolean f0;
    public final de g0;
    public final joa h0;
    public final joa i0;
    public final joa j0;
    public final bka k0;
    public final px0 l0;
    public final j41 m0;

    /* JADX WARN: Multi-variable type inference failed */
    public MainActivity() {
        final int i = 1;
        hob hobVar = new hob(this, i);
        ysa ysaVar = ysa.c;
        this.K = ypa.a(ysaVar, hobVar);
        oob oobVar = new oob(this, 0);
        fuf fufVar = duf.a;
        int i2 = 2;
        this.L = new otk(fufVar.getOrCreateKotlinClass(zqb.class), new oob(this, i), oobVar, new oob(this, i2));
        int i3 = 3;
        int i4 = 4;
        int i5 = 5;
        this.M = new otk(fufVar.getOrCreateKotlinClass(in6.class), new oob(this, i4), new oob(this, i3), new oob(this, i5));
        int i6 = 6;
        int i7 = 7;
        int i8 = 8;
        this.N = new otk(fufVar.getOrCreateKotlinClass(g9a.class), new oob(this, i7), new oob(this, i6), new oob(this, i8));
        this.O = ypa.a(ysaVar, new hob(this, i4));
        this.Z = true;
        this.d0 = ypa.a(ysaVar, new hob(this, i5));
        ce ceVar = new ce(i4);
        final Object[] objArr = 0 == true ? 1 : 0;
        this.e0 = registerForActivityResult(ceVar, new xd(this) { // from class: iob
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.xd
            public final void onActivityResult(Object obj) {
                Intent intent;
                String stringExtra;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (objArr) {
                    case 0:
                        boolean z = MainActivity.n0;
                        activityResult.getClass();
                        if (activityResult.a == 1) {
                            int i9 = l94.C;
                            MainActivity mainActivity = this.b;
                            CoordinatorLayout coordinatorLayout = mainActivity.Q().e;
                            coordinatorLayout.getClass();
                            String string = mainActivity.getString(R.string.error_message_title);
                            string.getClass();
                            l94 x = wxf.x(mainActivity, coordinatorLayout, string, mainActivity.getColor(R.color.on_color_primary), mainActivity.getColor(R.color.error), null, 2000, null, InterfaceC4060ee.c.g);
                            x.h(mainActivity.Q().g);
                            x.i();
                            break;
                        }
                        break;
                    default:
                        boolean z2 = MainActivity.n0;
                        activityResult.getClass();
                        if (activityResult.a == -1 && (intent = activityResult.b) != null && (stringExtra = intent.getStringExtra("EXTRA_SELECTED_SPORT_SLUG")) != null) {
                            MainActivity mainActivity2 = this.b;
                            mainActivity2.f0 = true;
                            mainActivity2.V().n(stringExtra);
                            break;
                        }
                        break;
                }
            }
        });
        this.g0 = registerForActivityResult(new ce(i3), new xd(this) { // from class: iob
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.xd
            public final void onActivityResult(Object obj) {
                Intent intent;
                String stringExtra;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i) {
                    case 0:
                        boolean z = MainActivity.n0;
                        activityResult.getClass();
                        if (activityResult.a == 1) {
                            int i9 = l94.C;
                            MainActivity mainActivity = this.b;
                            CoordinatorLayout coordinatorLayout = mainActivity.Q().e;
                            coordinatorLayout.getClass();
                            String string = mainActivity.getString(R.string.error_message_title);
                            string.getClass();
                            l94 x = wxf.x(mainActivity, coordinatorLayout, string, mainActivity.getColor(R.color.on_color_primary), mainActivity.getColor(R.color.error), null, 2000, null, InterfaceC4060ee.c.g);
                            x.h(mainActivity.Q().g);
                            x.i();
                            break;
                        }
                        break;
                    default:
                        boolean z2 = MainActivity.n0;
                        activityResult.getClass();
                        if (activityResult.a == -1 && (intent = activityResult.b) != null && (stringExtra = intent.getStringExtra("EXTRA_SELECTED_SPORT_SLUG")) != null) {
                            MainActivity mainActivity2 = this.b;
                            mainActivity2.f0 = true;
                            mainActivity2.V().n(stringExtra);
                            break;
                        }
                        break;
                }
            }
        });
        this.h0 = ypa.a(ysaVar, new hob(this, i6));
        this.i0 = ypa.a(ysaVar, new hob(this, i7));
        this.j0 = ypa.a(ysaVar, new hob(this, i8));
        this.k0 = new bka(this, i2);
        this.l0 = new px0(i6, this, 0 == true ? 1 : 0);
        this.m0 = new j41(this, 9);
    }

    public final od Q() {
        return (od) this.K.getValue();
    }

    public final hg2 R() {
        if (Intrinsics.c(S(), Sports.MMA)) {
            return (hqb) this.i0.getValue();
        }
        Set set = wyh.a;
        return wyh.m(S()) ? (nqb) this.j0.getValue() : U();
    }

    public final String S() {
        return (String) V().o.d();
    }

    public final g9a T() {
        return (g9a) this.N.getValue();
    }

    public final qob U() {
        return (qob) this.h0.getValue();
    }

    public final zqb V() {
        return (zqb) this.L.getValue();
    }

    public final iqb W() {
        return (iqb) this.O.getValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void X(Intent intent) {
        String stringExtra;
        String stringExtra2 = intent.getStringExtra("open_action");
        if (stringExtra2 != null) {
            switch (stringExtra2.hashCode()) {
                case -2056937530:
                    if (stringExtra2.equals("select_matches_tab")) {
                        Z(jqb.i);
                        break;
                    }
                    break;
                case -2056592327:
                    if (stringExtra2.equals("select_fantasy_tab")) {
                        Z(jqb.q);
                        break;
                    }
                    break;
                case -2032084850:
                    if (stringExtra2.equals("select_world_cup")) {
                        Z(jqb.n);
                        break;
                    }
                    break;
                case -504306182:
                    if (stringExtra2.equals("open_url")) {
                        bea.G(this, intent.getStringExtra("url"));
                        break;
                    }
                    break;
                case -460836606:
                    if (stringExtra2.equals("open_editor")) {
                        Q().j.c(W().D(jqb.m), false);
                        break;
                    }
                    break;
                case 1317433047:
                    if (stringExtra2.equals("select_featured_tournament")) {
                        qv7 qv7Var = rv7.c;
                        if (ml4.e0()) {
                            Z(jqb.o);
                            break;
                        }
                    }
                    break;
                case 1546122894:
                    if (stringExtra2.equals("open_main") && (stringExtra = intent.getStringExtra("sport_name")) != null) {
                        V().n(stringExtra);
                        int intExtra = intent.getIntExtra("unique_stage_id", 0);
                        if (intExtra != 0) {
                            V().D.j(new pn3(Integer.valueOf(intExtra)));
                        }
                        jqb jqbVar = (jqb) g7a.y(intent, "preselected_tab", jqb.class);
                        if (jqbVar != null) {
                            Q().j.post(new yq5(20, this, jqbVar));
                            break;
                        }
                    }
                    break;
                case 1646308695:
                    if (stringExtra2.equals("select_feed_tab")) {
                        Z(jqb.p);
                        break;
                    }
                    break;
            }
        }
        intent.replaceExtras((Bundle) null);
        this.Y = true;
    }

    public final void Y(hwg hwgVar) {
        hwgVar.getClass();
        Intent intent = new Intent(this, (Class<?>) SearchActivity.class);
        intent.putExtra("ENTITY_SEARCH_TYPE", hwgVar);
        int i = Build.VERSION.SDK_INT;
        de deVar = this.g0;
        if (i > 26) {
            deVar.a(intent, new sd(ActivityOptions.makeSceneTransitionAnimation(this, (TextView) Q().h.g, "search_button")));
        } else {
            deVar.a(intent, null);
        }
    }

    public final void Z(jqb jqbVar) {
        if (!this.a0) {
            this.b0 = jqbVar;
            return;
        }
        int D = W().D(jqbVar);
        Integer valueOf = Integer.valueOf(D);
        if (D == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            Q().j.c(valueOf.intValue(), false);
        }
    }

    public final void a0() {
        rqb rqbVar = (rqb) V().X.d();
        if (rqbVar != null) {
            long j = rqbVar.a;
            qob U = U();
            U.j = Long.valueOf(j);
            if (Intrinsics.c(S(), Sports.FOOTBALL)) {
                U.f = true;
                U.g = new fg2(j * 1000);
                U.h = new fg2(rqbVar.b * 1000);
                U.i = Integer.valueOf(R.drawable.bg_calendar_day_wc_26);
                return;
            }
            U.f = false;
            U.g = null;
            U.h = null;
            U.i = null;
        }
    }

    public final void b0(jqb jqbVar) {
        jqbVar.getClass();
        MenuItem menuItem = this.U;
        if (menuItem != null) {
            menuItem.setVisible(jqbVar.e);
        }
        MenuItem menuItem2 = this.V;
        if (menuItem2 != null) {
            menuItem2.setVisible(jqbVar.e);
        }
        MenuItem menuItem3 = this.Q;
        if (menuItem3 != null) {
            menuItem3.setVisible(jqbVar == jqb.m && V().b0 == ct7.c);
        }
        MenuItem menuItem4 = this.T;
        if (menuItem4 != null) {
            menuItem4.setVisible(jqbVar.f);
        }
        if (!jqbVar.d) {
            MenuItem menuItem5 = this.R;
            if (menuItem5 != null) {
                menuItem5.setVisible(false);
            }
            MenuItem menuItem6 = this.S;
            if (menuItem6 != null) {
                menuItem6.setVisible(false);
                return;
            }
            return;
        }
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        String string = sharedPreferences.getString("PREF_NOTIFICATION_STATUS", "NOTIFICATION_ENABLED");
        String str = string != null ? string : "NOTIFICATION_ENABLED";
        if (!new fgd(this).b.areNotificationsEnabled()) {
            str = "NOTIFICATION_DISABLED";
        } else if (str.equals("NOTIFICATION_DISABLED")) {
            str = "NOTIFICATION_ENABLED";
        }
        if (str.equals("NOTIFICATION_ENABLED")) {
            MenuItem menuItem7 = this.R;
            if (menuItem7 != null) {
                menuItem7.setVisible(true);
            }
            MenuItem menuItem8 = this.S;
            if (menuItem8 != null) {
                menuItem8.setVisible(false);
                return;
            }
            return;
        }
        boolean equals = str.equals("NOTIFICATION_BLOCKED");
        MenuItem menuItem9 = this.R;
        if (equals) {
            if (menuItem9 != null) {
                menuItem9.setVisible(false);
            }
            MenuItem menuItem10 = this.S;
            if (menuItem10 != null) {
                menuItem10.setVisible(true);
                return;
            }
            return;
        }
        if (menuItem9 != null) {
            menuItem9.setVisible(false);
        }
        MenuItem menuItem11 = this.S;
        if (menuItem11 != null) {
            menuItem11.setVisible(false);
        }
    }

    public final void c0(jqb jqbVar) {
        AppBarLayout appBarLayout = Q().i;
        int ordinal = jqbVar.ordinal();
        appBarLayout.setBackgroundResource(ordinal != 5 ? ordinal != 6 ? R.color.primary_variant : R.color.color_afcon : R.color.graphics_dark);
        if (job.a[jqbVar.ordinal()] == 1) {
            ((TextView) Q().h.g).setVisibility(8);
            o02 n = n();
            if (n != null) {
                n.n0(false);
            }
            o02 n2 = n();
            if (n2 != null) {
                n2.r0(null);
                return;
            }
            return;
        }
        ((TextView) Q().h.g).setVisibility(0);
        o02 n3 = n();
        if (n3 != null) {
            n3.n0(false);
        }
        o02 n4 = n();
        if (n4 != null) {
            n4.r0(null);
        }
    }

    public final void d0(UniqueTournamentDetails uniqueTournamentDetails) {
        if (W().l.size() > 0) {
            boolean z = uniqueTournamentDetails != null && W().E(Q().j.getCurrentItem()) == jqb.o;
            MenuItem menuItem = this.U;
            if (menuItem != null) {
                menuItem.setVisible(z);
            }
            MenuItem menuItem2 = this.V;
            if (menuItem2 != null) {
                menuItem2.setVisible(z);
            }
            FollowActionButton followActionButton = this.W;
            if (followActionButton != null) {
                followActionButton.setVisibility(z ? 0 : 8);
            }
            NotificationsActionButton notificationsActionButton = this.X;
            if (notificationsActionButton != null) {
                notificationsActionButton.setVisibility(z ? 0 : 8);
            }
        }
        if (uniqueTournamentDetails != null) {
            NotificationsActionButton notificationsActionButton2 = this.X;
            if (notificationsActionButton2 != null) {
                notificationsActionButton2.setVisibility(0);
            }
            NotificationsActionButton notificationsActionButton3 = this.X;
            if (notificationsActionButton3 != null) {
                FavoritesEventsData favoritesEventsData = (FavoritesEventsData) V().Y.a.getValue();
                int i = NotificationsActionButton.g;
                notificationsActionButton3.i(uniqueTournamentDetails, favoritesEventsData, false);
            }
            FollowActionButton followActionButton2 = this.W;
            if (followActionButton2 != null) {
                followActionButton2.h(uniqueTournamentDetails, (FavoritesEventsData) V().Y.a.getValue());
            }
        }
    }

    public final void e0() {
        p1f z = z();
        if (z.c.d() == null && z.f.isEmpty()) {
            w().b("empty_queue");
            String S = S();
            if (S != null) {
                v38 w = w();
                String replace = S.replace('-', '_');
                replace.getClass();
                w.b("main_screen_".concat(replace));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0125, code lost:
    
        if (r15.getBoolean("DEV_MODE_SHOW_WORLD_CUP", false) != false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f0(ArrayList arrayList) {
        Pair pair;
        int i;
        String string;
        String str;
        String string2;
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                if (!arrayList2.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        if (((sz1) it2.next()).e) {
                            break;
                        }
                    }
                }
                z = false;
                if (kik.s != z) {
                    kik.s = z;
                    Q().a.requestApplyInsets();
                }
                yea yeaVar = j58.a;
                if (!fn0.B("should_show_world_cup")) {
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = getApplicationContext();
                        synchronized (uic.i) {
                            sharedPreferences = a5f.d(applicationContext);
                            uic.j = sharedPreferences;
                        }
                        sharedPreferences.getClass();
                    }
                }
                DynamicBottomNavigation dynamicBottomNavigation = Q().b;
                zdl zdlVar = (zdl) V().p.a.getValue();
                dynamicBottomNavigation.setWorldCupTeamColor(zdlVar != null ? Integer.valueOf(zdlVar.a) : null);
                Q().b.setItems(arrayList2);
                return;
            }
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            jqb jqbVar = (jqb) next;
            boolean z2 = jqbVar == jqb.n && arrayList.size() == 5;
            iqb W = W();
            W.getClass();
            jqbVar.getClass();
            if (i2 == 0) {
                Set set = wyh.a;
                int a = wyh.a(W.p);
                pair = new Pair(Integer.valueOf(a), Integer.valueOf(a));
            } else {
                pair = new Pair(Integer.valueOf(iqb.H(jqbVar, true)), Integer.valueOf(iqb.H(jqbVar, false)));
            }
            int intValue = ((Number) pair.a).intValue();
            int intValue2 = ((Number) pair.b).intValue();
            iqb W2 = W();
            W2.getClass();
            if (i2 == 0) {
                Set set2 = wyh.a;
                Context y = W2.y();
                string = W2.p;
                y.getClass();
                Integer b = wyh.b(string);
                if (b != null && (string2 = y.getString(b.intValue())) != null) {
                    str = string2;
                    arrayList2.add(new sz1(jqbVar, str, intValue, intValue2, z2));
                    i2 = i3;
                } else if (string == null) {
                    string = "";
                }
            } else {
                if (jqbVar == jqb.i) {
                    mqi mqiVar = bii.a;
                    i = bii.b(W2.p, false);
                } else {
                    i = jqbVar.a;
                }
                string = W2.y().getString(i);
                string.getClass();
            }
            str = string;
            arrayList2.add(new sz1(jqbVar, str, intValue, intValue2, z2));
            i2 = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x03ab, code lost:
    
        if (r0.getBoolean("DEV_MODE_SHOW_WORLD_CUP", false) != false) goto L71;
     */
    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        String string;
        final MainActivity mainActivity = this;
        final int i = 0;
        og5.a(mainActivity, new qqi(0, 0, 0, new abb(16)), new qqi(0, 0, 0, new rfi(10)));
        super.onCreate(bundle);
        ia0 ia0Var = ia0.q;
        ok3.p().c().i(mainActivity, false);
        mainActivity.setContentView(mainActivity.Q().a);
        if (Build.VERSION.SDK_INT >= 29) {
            mainActivity.getWindow().setNavigationBarContrastEnforced(false);
        }
        rv7 rv7Var = mainActivity.P;
        rq3 rq3Var = null;
        if (rv7Var == null) {
            Intrinsics.i("featuredTournamentManager");
            throw null;
        }
        SharedPreferences sharedPreferences = rv7Var.a;
        final int i2 = 1;
        if (!sharedPreferences.getBoolean("featured_tournament_initial_section_sent", false)) {
            nv.z0(rv7Var.b, kv.CLICK, "special_event_screen", "fifa_club_world_cup_tab");
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.getClass();
            edit.putBoolean("featured_tournament_initial_section_sent", true);
            edit.apply();
        }
        mainActivity.Q().j.setAdapter(mainActivity.W());
        mainActivity.Q().j.setUserInputEnabled(false);
        djf djfVar = mainActivity.Q().h;
        hob hobVar = new hob(mainActivity, i);
        UnderlinedToolbar underlinedToolbar = (UnderlinedToolbar) djfVar.b;
        mainActivity.H(underlinedToolbar);
        int i3 = 8;
        ((LinearLayout) djfVar.e).setVisibility(8);
        TextView textView = (TextView) djfVar.g;
        textView.setVisibility(0);
        final int i4 = 3;
        aba.y(textView, 0, 3);
        textView.setOnClickListener(new s0(hobVar, i));
        textView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = underlinedToolbar.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        final int i5 = 4;
        int s = ao2.s(4, mainActivity);
        int marginStart = marginLayoutParams.getMarginStart();
        int i6 = marginLayoutParams.topMargin;
        int i7 = marginLayoutParams.bottomMargin;
        marginLayoutParams.setMarginStart(marginStart);
        marginLayoutParams.topMargin = i6;
        marginLayoutParams.setMarginEnd(s);
        marginLayoutParams.bottomMargin = i7;
        underlinedToolbar.setLayoutParams(marginLayoutParams);
        ((UnderlinedToolbar) djfVar.b).setContentInsetStartWithNavigation(0);
        ((UnderlinedToolbar) djfVar.b).setNavigationIcon((Drawable) null);
        ((PulsatingFrameLayout) djfVar.c).setVisibility(0);
        z8e.a0((PulsatingFrameLayout) djfVar.c, 1000L, new ixa(i3, mainActivity, djfVar));
        o02 n = mainActivity.n();
        if (n != null) {
            n.n0(false);
        }
        LinearLayout linearLayout = (LinearLayout) mainActivity.Q().h.e;
        int s2 = ao2.s(4, mainActivity);
        linearLayout.setPadding(s2, s2, s2, s2);
        LinearLayout linearLayout2 = (LinearLayout) mainActivity.Q().h.e;
        ViewGroup.LayoutParams layoutParams2 = linearLayout2.getLayoutParams();
        if (layoutParams2 == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.width = -2;
        marginLayoutParams2.setMarginStart(ao2.s(12, mainActivity));
        linearLayout2.setLayoutParams(marginLayoutParams2);
        ViewStub viewStub = mainActivity.Q().f;
        mainActivity.W();
        mainActivity.o = viewStub;
        e6b e6bVar = e6b.a;
        LinkedHashMap linkedHashMap = qv5.b;
        fuf fufVar = duf.a;
        KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(g42.class);
        Object obj = linkedHashMap.get(orCreateKotlinClass);
        final int i8 = 7;
        if (obj == null) {
            obj = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass, obj);
        }
        xw3.L(wca.x(mainActivity.getLifecycle()), null, null, new mob(mainActivity, (b1d) obj, null, this, 2), 3);
        z8e.x(mainActivity, mainActivity.V().H, new ip1(mainActivity, rq3Var, 26));
        zzc zzcVar = mainActivity.V().m0;
        p15 p15Var = new p15(new Function1(mainActivity) { // from class: gob
            public final /* synthetic */ MainActivity b;

            {
                this.b = mainActivity;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CalendarView calendarView;
                CalendarView calendarView2;
                int i9 = i5;
                MainActivity mainActivity2 = this.b;
                switch (i9) {
                    case 0:
                        List list = (List) obj2;
                        boolean z = MainActivity.n0;
                        hg2 R = mainActivity2.R();
                        list.getClass();
                        ArrayList r = R.r(list);
                        if (!r.isEmpty() && (calendarView = mainActivity2.c0) != null) {
                            nr1 nr1Var = calendarView.a;
                            if (nr1Var == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var.d).x(r);
                        }
                        return Unit.a;
                    case 1:
                        boolean z2 = MainActivity.n0;
                        qob U = mainActivity2.U();
                        ((Set) obj2).getClass();
                        U.getClass();
                        CalendarView calendarView3 = mainActivity2.c0;
                        if (calendarView3 != null) {
                            nr1 nr1Var2 = calendarView3.a;
                            if (nr1Var2 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var2.d).r();
                        }
                        return Unit.a;
                    case 2:
                        boolean z3 = MainActivity.n0;
                        ((Unit) obj2).getClass();
                        if (mainActivity2.c0 == null) {
                            CalendarView calendarView4 = mainActivity2.Q().c;
                            mainActivity2.c0 = calendarView4;
                            calendarView4.b();
                            calendarView4.setCallback(mainActivity2.k0);
                            calendarView4.setOnDisplayCallback(new hob(mainActivity2, 2));
                            calendarView4.setOnHideCallback(new hob(mainActivity2, 3));
                            calendarView4.setSelectWorldCupCallback(new ixa(9, mainActivity2, calendarView4));
                            calendarView4.setCalendarLogic(mainActivity2.R());
                        }
                        if (ke0.i) {
                            CalendarView calendarView5 = mainActivity2.c0;
                            if (calendarView5 != null) {
                                nr1 nr1Var3 = calendarView5.a;
                                if (nr1Var3 == null) {
                                    Intrinsics.i("binding");
                                    throw null;
                                }
                                ((MaterialCalendarView) nr1Var3.d).r();
                            }
                            ke0.i = false;
                        }
                        CalendarView calendarView6 = mainActivity2.c0;
                        if (calendarView6 != null) {
                            calendarView6.f = true;
                            ad2 ad2Var = qv5.a;
                            qv5.a(q42.a);
                            nr1 nr1Var4 = calendarView6.a;
                            if (nr1Var4 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            MaterialCalendarView materialCalendarView = (MaterialCalendarView) nr1Var4.d;
                            fg2 fg2Var = new fg2(ke0.a);
                            materialCalendarView.u(fg2Var, fg2Var, false, null);
                            nr1 nr1Var5 = calendarView6.a;
                            if (nr1Var5 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var5.d).r();
                            Function0 function0 = calendarView6.onDisplayCallback;
                            if (function0 != null) {
                                function0.invoke();
                            }
                            AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                            alphaAnimation.setDuration(200L);
                            alphaAnimation.setAnimationListener(new vg2(calendarView6, 0));
                            nr1 nr1Var6 = calendarView6.a;
                            if (nr1Var6 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            LinearLayout linearLayout3 = (LinearLayout) nr1Var6.c;
                            linearLayout3.getClass();
                            linearLayout3.setVisibility(0);
                            nr1 nr1Var7 = calendarView6.a;
                            if (nr1Var7 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((LinearLayout) nr1Var7.c).startAnimation(alphaAnimation);
                        }
                        return Unit.a;
                    case 3:
                        boolean z4 = MainActivity.n0;
                        ((Unit) obj2).getClass();
                        String str = (String) mainActivity2.V().o.d();
                        if (str != null) {
                            iqb W = mainActivity2.W();
                            W.getClass();
                            W.p = str;
                            mainActivity2.f0(mainActivity2.W().l);
                        }
                        return Unit.a;
                    case 4:
                        int intValue = ((Integer) obj2).intValue();
                        boolean z5 = MainActivity.n0;
                        mainActivity2.z().a(new g1f(intValue));
                        return Unit.a;
                    case 5:
                        boolean z6 = MainActivity.n0;
                        ((Unit) obj2).getClass();
                        mainActivity2.startActivity(new Intent(mainActivity2, (Class<?>) SofaSeasonActivity.class));
                        return Unit.a;
                    case 6:
                        Map map = (Map) obj2;
                        boolean z7 = MainActivity.n0;
                        qob U2 = mainActivity2.U();
                        map.getClass();
                        U2.getClass();
                        Set keySet = map.keySet();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : keySet) {
                            String str2 = (String) obj3;
                            List list2 = (List) U2.d.get(str2);
                            List list3 = (List) map.get(str2);
                            if (!Intrinsics.c(list2, list3) && ((list2 != null && !list2.isEmpty()) || (list3 != null && !list3.isEmpty()))) {
                                arrayList.add(obj3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Date parse = U2.b.parse((String) it.next());
                            parse.getClass();
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTime(parse);
                            arrayList2.add(new fg2(calendar));
                        }
                        U2.d = tub.p(map);
                        if (!arrayList2.isEmpty() && (calendarView2 = mainActivity2.c0) != null) {
                            nr1 nr1Var8 = calendarView2.a;
                            if (nr1Var8 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var8.d).x(arrayList2);
                        }
                        return Unit.a;
                    default:
                        boolean z8 = MainActivity.n0;
                        mainActivity2.a0();
                        CalendarView calendarView7 = mainActivity2.c0;
                        if (calendarView7 != null) {
                            nr1 nr1Var9 = calendarView7.a;
                            if (nr1Var9 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var9.d).r();
                        }
                        return Unit.a;
                }
            }
        }, i2);
        zzcVar.getClass();
        zzcVar.a.e(mainActivity, p15Var);
        zqb V = mainActivity.V();
        xw3.L(un0.z(V), null, null, new uqb(V, rq3Var, i2), 3);
        asf asfVar = new asf();
        zzc zzcVar2 = mainActivity.V().f0;
        final int i9 = 5;
        p15 p15Var2 = new p15(new Function1(mainActivity) { // from class: gob
            public final /* synthetic */ MainActivity b;

            {
                this.b = mainActivity;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CalendarView calendarView;
                CalendarView calendarView2;
                int i92 = i9;
                MainActivity mainActivity2 = this.b;
                switch (i92) {
                    case 0:
                        List list = (List) obj2;
                        boolean z = MainActivity.n0;
                        hg2 R = mainActivity2.R();
                        list.getClass();
                        ArrayList r = R.r(list);
                        if (!r.isEmpty() && (calendarView = mainActivity2.c0) != null) {
                            nr1 nr1Var = calendarView.a;
                            if (nr1Var == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var.d).x(r);
                        }
                        return Unit.a;
                    case 1:
                        boolean z2 = MainActivity.n0;
                        qob U = mainActivity2.U();
                        ((Set) obj2).getClass();
                        U.getClass();
                        CalendarView calendarView3 = mainActivity2.c0;
                        if (calendarView3 != null) {
                            nr1 nr1Var2 = calendarView3.a;
                            if (nr1Var2 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var2.d).r();
                        }
                        return Unit.a;
                    case 2:
                        boolean z3 = MainActivity.n0;
                        ((Unit) obj2).getClass();
                        if (mainActivity2.c0 == null) {
                            CalendarView calendarView4 = mainActivity2.Q().c;
                            mainActivity2.c0 = calendarView4;
                            calendarView4.b();
                            calendarView4.setCallback(mainActivity2.k0);
                            calendarView4.setOnDisplayCallback(new hob(mainActivity2, 2));
                            calendarView4.setOnHideCallback(new hob(mainActivity2, 3));
                            calendarView4.setSelectWorldCupCallback(new ixa(9, mainActivity2, calendarView4));
                            calendarView4.setCalendarLogic(mainActivity2.R());
                        }
                        if (ke0.i) {
                            CalendarView calendarView5 = mainActivity2.c0;
                            if (calendarView5 != null) {
                                nr1 nr1Var3 = calendarView5.a;
                                if (nr1Var3 == null) {
                                    Intrinsics.i("binding");
                                    throw null;
                                }
                                ((MaterialCalendarView) nr1Var3.d).r();
                            }
                            ke0.i = false;
                        }
                        CalendarView calendarView6 = mainActivity2.c0;
                        if (calendarView6 != null) {
                            calendarView6.f = true;
                            ad2 ad2Var = qv5.a;
                            qv5.a(q42.a);
                            nr1 nr1Var4 = calendarView6.a;
                            if (nr1Var4 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            MaterialCalendarView materialCalendarView = (MaterialCalendarView) nr1Var4.d;
                            fg2 fg2Var = new fg2(ke0.a);
                            materialCalendarView.u(fg2Var, fg2Var, false, null);
                            nr1 nr1Var5 = calendarView6.a;
                            if (nr1Var5 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var5.d).r();
                            Function0 function0 = calendarView6.onDisplayCallback;
                            if (function0 != null) {
                                function0.invoke();
                            }
                            AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                            alphaAnimation.setDuration(200L);
                            alphaAnimation.setAnimationListener(new vg2(calendarView6, 0));
                            nr1 nr1Var6 = calendarView6.a;
                            if (nr1Var6 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            LinearLayout linearLayout3 = (LinearLayout) nr1Var6.c;
                            linearLayout3.getClass();
                            linearLayout3.setVisibility(0);
                            nr1 nr1Var7 = calendarView6.a;
                            if (nr1Var7 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((LinearLayout) nr1Var7.c).startAnimation(alphaAnimation);
                        }
                        return Unit.a;
                    case 3:
                        boolean z4 = MainActivity.n0;
                        ((Unit) obj2).getClass();
                        String str = (String) mainActivity2.V().o.d();
                        if (str != null) {
                            iqb W = mainActivity2.W();
                            W.getClass();
                            W.p = str;
                            mainActivity2.f0(mainActivity2.W().l);
                        }
                        return Unit.a;
                    case 4:
                        int intValue = ((Integer) obj2).intValue();
                        boolean z5 = MainActivity.n0;
                        mainActivity2.z().a(new g1f(intValue));
                        return Unit.a;
                    case 5:
                        boolean z6 = MainActivity.n0;
                        ((Unit) obj2).getClass();
                        mainActivity2.startActivity(new Intent(mainActivity2, (Class<?>) SofaSeasonActivity.class));
                        return Unit.a;
                    case 6:
                        Map map = (Map) obj2;
                        boolean z7 = MainActivity.n0;
                        qob U2 = mainActivity2.U();
                        map.getClass();
                        U2.getClass();
                        Set keySet = map.keySet();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : keySet) {
                            String str2 = (String) obj3;
                            List list2 = (List) U2.d.get(str2);
                            List list3 = (List) map.get(str2);
                            if (!Intrinsics.c(list2, list3) && ((list2 != null && !list2.isEmpty()) || (list3 != null && !list3.isEmpty()))) {
                                arrayList.add(obj3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Date parse = U2.b.parse((String) it.next());
                            parse.getClass();
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTime(parse);
                            arrayList2.add(new fg2(calendar));
                        }
                        U2.d = tub.p(map);
                        if (!arrayList2.isEmpty() && (calendarView2 = mainActivity2.c0) != null) {
                            nr1 nr1Var8 = calendarView2.a;
                            if (nr1Var8 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var8.d).x(arrayList2);
                        }
                        return Unit.a;
                    default:
                        boolean z8 = MainActivity.n0;
                        mainActivity2.a0();
                        CalendarView calendarView7 = mainActivity2.c0;
                        if (calendarView7 != null) {
                            nr1 nr1Var9 = calendarView7.a;
                            if (nr1Var9 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var9.d).r();
                        }
                        return Unit.a;
                }
            }
        }, i2);
        zzcVar2.getClass();
        zzcVar2.a.e(mainActivity, p15Var2);
        int i10 = 28;
        int i11 = 21;
        mainActivity.V().o.e(mainActivity, new z1(21, new dr6(i10, mainActivity, bundle, asfVar)));
        mainActivity.V().t.e(mainActivity, new z1(21, new uf8(i10, mainActivity, asfVar)));
        final int i12 = 6;
        mainActivity.V().C.e(mainActivity, new z1(21, new Function1(mainActivity) { // from class: gob
            public final /* synthetic */ MainActivity b;

            {
                this.b = mainActivity;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CalendarView calendarView;
                CalendarView calendarView2;
                int i92 = i12;
                MainActivity mainActivity2 = this.b;
                switch (i92) {
                    case 0:
                        List list = (List) obj2;
                        boolean z = MainActivity.n0;
                        hg2 R = mainActivity2.R();
                        list.getClass();
                        ArrayList r = R.r(list);
                        if (!r.isEmpty() && (calendarView = mainActivity2.c0) != null) {
                            nr1 nr1Var = calendarView.a;
                            if (nr1Var == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var.d).x(r);
                        }
                        return Unit.a;
                    case 1:
                        boolean z2 = MainActivity.n0;
                        qob U = mainActivity2.U();
                        ((Set) obj2).getClass();
                        U.getClass();
                        CalendarView calendarView3 = mainActivity2.c0;
                        if (calendarView3 != null) {
                            nr1 nr1Var2 = calendarView3.a;
                            if (nr1Var2 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var2.d).r();
                        }
                        return Unit.a;
                    case 2:
                        boolean z3 = MainActivity.n0;
                        ((Unit) obj2).getClass();
                        if (mainActivity2.c0 == null) {
                            CalendarView calendarView4 = mainActivity2.Q().c;
                            mainActivity2.c0 = calendarView4;
                            calendarView4.b();
                            calendarView4.setCallback(mainActivity2.k0);
                            calendarView4.setOnDisplayCallback(new hob(mainActivity2, 2));
                            calendarView4.setOnHideCallback(new hob(mainActivity2, 3));
                            calendarView4.setSelectWorldCupCallback(new ixa(9, mainActivity2, calendarView4));
                            calendarView4.setCalendarLogic(mainActivity2.R());
                        }
                        if (ke0.i) {
                            CalendarView calendarView5 = mainActivity2.c0;
                            if (calendarView5 != null) {
                                nr1 nr1Var3 = calendarView5.a;
                                if (nr1Var3 == null) {
                                    Intrinsics.i("binding");
                                    throw null;
                                }
                                ((MaterialCalendarView) nr1Var3.d).r();
                            }
                            ke0.i = false;
                        }
                        CalendarView calendarView6 = mainActivity2.c0;
                        if (calendarView6 != null) {
                            calendarView6.f = true;
                            ad2 ad2Var = qv5.a;
                            qv5.a(q42.a);
                            nr1 nr1Var4 = calendarView6.a;
                            if (nr1Var4 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            MaterialCalendarView materialCalendarView = (MaterialCalendarView) nr1Var4.d;
                            fg2 fg2Var = new fg2(ke0.a);
                            materialCalendarView.u(fg2Var, fg2Var, false, null);
                            nr1 nr1Var5 = calendarView6.a;
                            if (nr1Var5 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var5.d).r();
                            Function0 function0 = calendarView6.onDisplayCallback;
                            if (function0 != null) {
                                function0.invoke();
                            }
                            AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                            alphaAnimation.setDuration(200L);
                            alphaAnimation.setAnimationListener(new vg2(calendarView6, 0));
                            nr1 nr1Var6 = calendarView6.a;
                            if (nr1Var6 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            LinearLayout linearLayout3 = (LinearLayout) nr1Var6.c;
                            linearLayout3.getClass();
                            linearLayout3.setVisibility(0);
                            nr1 nr1Var7 = calendarView6.a;
                            if (nr1Var7 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((LinearLayout) nr1Var7.c).startAnimation(alphaAnimation);
                        }
                        return Unit.a;
                    case 3:
                        boolean z4 = MainActivity.n0;
                        ((Unit) obj2).getClass();
                        String str = (String) mainActivity2.V().o.d();
                        if (str != null) {
                            iqb W = mainActivity2.W();
                            W.getClass();
                            W.p = str;
                            mainActivity2.f0(mainActivity2.W().l);
                        }
                        return Unit.a;
                    case 4:
                        int intValue = ((Integer) obj2).intValue();
                        boolean z5 = MainActivity.n0;
                        mainActivity2.z().a(new g1f(intValue));
                        return Unit.a;
                    case 5:
                        boolean z6 = MainActivity.n0;
                        ((Unit) obj2).getClass();
                        mainActivity2.startActivity(new Intent(mainActivity2, (Class<?>) SofaSeasonActivity.class));
                        return Unit.a;
                    case 6:
                        Map map = (Map) obj2;
                        boolean z7 = MainActivity.n0;
                        qob U2 = mainActivity2.U();
                        map.getClass();
                        U2.getClass();
                        Set keySet = map.keySet();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : keySet) {
                            String str2 = (String) obj3;
                            List list2 = (List) U2.d.get(str2);
                            List list3 = (List) map.get(str2);
                            if (!Intrinsics.c(list2, list3) && ((list2 != null && !list2.isEmpty()) || (list3 != null && !list3.isEmpty()))) {
                                arrayList.add(obj3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Date parse = U2.b.parse((String) it.next());
                            parse.getClass();
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTime(parse);
                            arrayList2.add(new fg2(calendar));
                        }
                        U2.d = tub.p(map);
                        if (!arrayList2.isEmpty() && (calendarView2 = mainActivity2.c0) != null) {
                            nr1 nr1Var8 = calendarView2.a;
                            if (nr1Var8 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var8.d).x(arrayList2);
                        }
                        return Unit.a;
                    default:
                        boolean z8 = MainActivity.n0;
                        mainActivity2.a0();
                        CalendarView calendarView7 = mainActivity2.c0;
                        if (calendarView7 != null) {
                            nr1 nr1Var9 = calendarView7.a;
                            if (nr1Var9 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var9.d).r();
                        }
                        return Unit.a;
                }
            }
        }));
        mainActivity.V().X.e(mainActivity, new z1(21, new Function1(mainActivity) { // from class: gob
            public final /* synthetic */ MainActivity b;

            {
                this.b = mainActivity;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CalendarView calendarView;
                CalendarView calendarView2;
                int i92 = i8;
                MainActivity mainActivity2 = this.b;
                switch (i92) {
                    case 0:
                        List list = (List) obj2;
                        boolean z = MainActivity.n0;
                        hg2 R = mainActivity2.R();
                        list.getClass();
                        ArrayList r = R.r(list);
                        if (!r.isEmpty() && (calendarView = mainActivity2.c0) != null) {
                            nr1 nr1Var = calendarView.a;
                            if (nr1Var == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var.d).x(r);
                        }
                        return Unit.a;
                    case 1:
                        boolean z2 = MainActivity.n0;
                        qob U = mainActivity2.U();
                        ((Set) obj2).getClass();
                        U.getClass();
                        CalendarView calendarView3 = mainActivity2.c0;
                        if (calendarView3 != null) {
                            nr1 nr1Var2 = calendarView3.a;
                            if (nr1Var2 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var2.d).r();
                        }
                        return Unit.a;
                    case 2:
                        boolean z3 = MainActivity.n0;
                        ((Unit) obj2).getClass();
                        if (mainActivity2.c0 == null) {
                            CalendarView calendarView4 = mainActivity2.Q().c;
                            mainActivity2.c0 = calendarView4;
                            calendarView4.b();
                            calendarView4.setCallback(mainActivity2.k0);
                            calendarView4.setOnDisplayCallback(new hob(mainActivity2, 2));
                            calendarView4.setOnHideCallback(new hob(mainActivity2, 3));
                            calendarView4.setSelectWorldCupCallback(new ixa(9, mainActivity2, calendarView4));
                            calendarView4.setCalendarLogic(mainActivity2.R());
                        }
                        if (ke0.i) {
                            CalendarView calendarView5 = mainActivity2.c0;
                            if (calendarView5 != null) {
                                nr1 nr1Var3 = calendarView5.a;
                                if (nr1Var3 == null) {
                                    Intrinsics.i("binding");
                                    throw null;
                                }
                                ((MaterialCalendarView) nr1Var3.d).r();
                            }
                            ke0.i = false;
                        }
                        CalendarView calendarView6 = mainActivity2.c0;
                        if (calendarView6 != null) {
                            calendarView6.f = true;
                            ad2 ad2Var = qv5.a;
                            qv5.a(q42.a);
                            nr1 nr1Var4 = calendarView6.a;
                            if (nr1Var4 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            MaterialCalendarView materialCalendarView = (MaterialCalendarView) nr1Var4.d;
                            fg2 fg2Var = new fg2(ke0.a);
                            materialCalendarView.u(fg2Var, fg2Var, false, null);
                            nr1 nr1Var5 = calendarView6.a;
                            if (nr1Var5 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var5.d).r();
                            Function0 function0 = calendarView6.onDisplayCallback;
                            if (function0 != null) {
                                function0.invoke();
                            }
                            AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                            alphaAnimation.setDuration(200L);
                            alphaAnimation.setAnimationListener(new vg2(calendarView6, 0));
                            nr1 nr1Var6 = calendarView6.a;
                            if (nr1Var6 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            LinearLayout linearLayout3 = (LinearLayout) nr1Var6.c;
                            linearLayout3.getClass();
                            linearLayout3.setVisibility(0);
                            nr1 nr1Var7 = calendarView6.a;
                            if (nr1Var7 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((LinearLayout) nr1Var7.c).startAnimation(alphaAnimation);
                        }
                        return Unit.a;
                    case 3:
                        boolean z4 = MainActivity.n0;
                        ((Unit) obj2).getClass();
                        String str = (String) mainActivity2.V().o.d();
                        if (str != null) {
                            iqb W = mainActivity2.W();
                            W.getClass();
                            W.p = str;
                            mainActivity2.f0(mainActivity2.W().l);
                        }
                        return Unit.a;
                    case 4:
                        int intValue = ((Integer) obj2).intValue();
                        boolean z5 = MainActivity.n0;
                        mainActivity2.z().a(new g1f(intValue));
                        return Unit.a;
                    case 5:
                        boolean z6 = MainActivity.n0;
                        ((Unit) obj2).getClass();
                        mainActivity2.startActivity(new Intent(mainActivity2, (Class<?>) SofaSeasonActivity.class));
                        return Unit.a;
                    case 6:
                        Map map = (Map) obj2;
                        boolean z7 = MainActivity.n0;
                        qob U2 = mainActivity2.U();
                        map.getClass();
                        U2.getClass();
                        Set keySet = map.keySet();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : keySet) {
                            String str2 = (String) obj3;
                            List list2 = (List) U2.d.get(str2);
                            List list3 = (List) map.get(str2);
                            if (!Intrinsics.c(list2, list3) && ((list2 != null && !list2.isEmpty()) || (list3 != null && !list3.isEmpty()))) {
                                arrayList.add(obj3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Date parse = U2.b.parse((String) it.next());
                            parse.getClass();
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTime(parse);
                            arrayList2.add(new fg2(calendar));
                        }
                        U2.d = tub.p(map);
                        if (!arrayList2.isEmpty() && (calendarView2 = mainActivity2.c0) != null) {
                            nr1 nr1Var8 = calendarView2.a;
                            if (nr1Var8 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var8.d).x(arrayList2);
                        }
                        return Unit.a;
                    default:
                        boolean z8 = MainActivity.n0;
                        mainActivity2.a0();
                        CalendarView calendarView7 = mainActivity2.c0;
                        if (calendarView7 != null) {
                            nr1 nr1Var9 = calendarView7.a;
                            if (nr1Var9 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var9.d).r();
                        }
                        return Unit.a;
                }
            }
        }));
        mainActivity.V().U.e(mainActivity, new z1(21, new Function1(mainActivity) { // from class: gob
            public final /* synthetic */ MainActivity b;

            {
                this.b = mainActivity;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CalendarView calendarView;
                CalendarView calendarView2;
                int i92 = i;
                MainActivity mainActivity2 = this.b;
                switch (i92) {
                    case 0:
                        List list = (List) obj2;
                        boolean z = MainActivity.n0;
                        hg2 R = mainActivity2.R();
                        list.getClass();
                        ArrayList r = R.r(list);
                        if (!r.isEmpty() && (calendarView = mainActivity2.c0) != null) {
                            nr1 nr1Var = calendarView.a;
                            if (nr1Var == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var.d).x(r);
                        }
                        return Unit.a;
                    case 1:
                        boolean z2 = MainActivity.n0;
                        qob U = mainActivity2.U();
                        ((Set) obj2).getClass();
                        U.getClass();
                        CalendarView calendarView3 = mainActivity2.c0;
                        if (calendarView3 != null) {
                            nr1 nr1Var2 = calendarView3.a;
                            if (nr1Var2 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var2.d).r();
                        }
                        return Unit.a;
                    case 2:
                        boolean z3 = MainActivity.n0;
                        ((Unit) obj2).getClass();
                        if (mainActivity2.c0 == null) {
                            CalendarView calendarView4 = mainActivity2.Q().c;
                            mainActivity2.c0 = calendarView4;
                            calendarView4.b();
                            calendarView4.setCallback(mainActivity2.k0);
                            calendarView4.setOnDisplayCallback(new hob(mainActivity2, 2));
                            calendarView4.setOnHideCallback(new hob(mainActivity2, 3));
                            calendarView4.setSelectWorldCupCallback(new ixa(9, mainActivity2, calendarView4));
                            calendarView4.setCalendarLogic(mainActivity2.R());
                        }
                        if (ke0.i) {
                            CalendarView calendarView5 = mainActivity2.c0;
                            if (calendarView5 != null) {
                                nr1 nr1Var3 = calendarView5.a;
                                if (nr1Var3 == null) {
                                    Intrinsics.i("binding");
                                    throw null;
                                }
                                ((MaterialCalendarView) nr1Var3.d).r();
                            }
                            ke0.i = false;
                        }
                        CalendarView calendarView6 = mainActivity2.c0;
                        if (calendarView6 != null) {
                            calendarView6.f = true;
                            ad2 ad2Var = qv5.a;
                            qv5.a(q42.a);
                            nr1 nr1Var4 = calendarView6.a;
                            if (nr1Var4 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            MaterialCalendarView materialCalendarView = (MaterialCalendarView) nr1Var4.d;
                            fg2 fg2Var = new fg2(ke0.a);
                            materialCalendarView.u(fg2Var, fg2Var, false, null);
                            nr1 nr1Var5 = calendarView6.a;
                            if (nr1Var5 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var5.d).r();
                            Function0 function0 = calendarView6.onDisplayCallback;
                            if (function0 != null) {
                                function0.invoke();
                            }
                            AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                            alphaAnimation.setDuration(200L);
                            alphaAnimation.setAnimationListener(new vg2(calendarView6, 0));
                            nr1 nr1Var6 = calendarView6.a;
                            if (nr1Var6 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            LinearLayout linearLayout3 = (LinearLayout) nr1Var6.c;
                            linearLayout3.getClass();
                            linearLayout3.setVisibility(0);
                            nr1 nr1Var7 = calendarView6.a;
                            if (nr1Var7 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((LinearLayout) nr1Var7.c).startAnimation(alphaAnimation);
                        }
                        return Unit.a;
                    case 3:
                        boolean z4 = MainActivity.n0;
                        ((Unit) obj2).getClass();
                        String str = (String) mainActivity2.V().o.d();
                        if (str != null) {
                            iqb W = mainActivity2.W();
                            W.getClass();
                            W.p = str;
                            mainActivity2.f0(mainActivity2.W().l);
                        }
                        return Unit.a;
                    case 4:
                        int intValue = ((Integer) obj2).intValue();
                        boolean z5 = MainActivity.n0;
                        mainActivity2.z().a(new g1f(intValue));
                        return Unit.a;
                    case 5:
                        boolean z6 = MainActivity.n0;
                        ((Unit) obj2).getClass();
                        mainActivity2.startActivity(new Intent(mainActivity2, (Class<?>) SofaSeasonActivity.class));
                        return Unit.a;
                    case 6:
                        Map map = (Map) obj2;
                        boolean z7 = MainActivity.n0;
                        qob U2 = mainActivity2.U();
                        map.getClass();
                        U2.getClass();
                        Set keySet = map.keySet();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : keySet) {
                            String str2 = (String) obj3;
                            List list2 = (List) U2.d.get(str2);
                            List list3 = (List) map.get(str2);
                            if (!Intrinsics.c(list2, list3) && ((list2 != null && !list2.isEmpty()) || (list3 != null && !list3.isEmpty()))) {
                                arrayList.add(obj3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Date parse = U2.b.parse((String) it.next());
                            parse.getClass();
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTime(parse);
                            arrayList2.add(new fg2(calendar));
                        }
                        U2.d = tub.p(map);
                        if (!arrayList2.isEmpty() && (calendarView2 = mainActivity2.c0) != null) {
                            nr1 nr1Var8 = calendarView2.a;
                            if (nr1Var8 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var8.d).x(arrayList2);
                        }
                        return Unit.a;
                    default:
                        boolean z8 = MainActivity.n0;
                        mainActivity2.a0();
                        CalendarView calendarView7 = mainActivity2.c0;
                        if (calendarView7 != null) {
                            nr1 nr1Var9 = calendarView7.a;
                            if (nr1Var9 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var9.d).r();
                        }
                        return Unit.a;
                }
            }
        }));
        mainActivity.V().S.e(mainActivity, new z1(21, new Function1(mainActivity) { // from class: gob
            public final /* synthetic */ MainActivity b;

            {
                this.b = mainActivity;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CalendarView calendarView;
                CalendarView calendarView2;
                int i92 = i2;
                MainActivity mainActivity2 = this.b;
                switch (i92) {
                    case 0:
                        List list = (List) obj2;
                        boolean z = MainActivity.n0;
                        hg2 R = mainActivity2.R();
                        list.getClass();
                        ArrayList r = R.r(list);
                        if (!r.isEmpty() && (calendarView = mainActivity2.c0) != null) {
                            nr1 nr1Var = calendarView.a;
                            if (nr1Var == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var.d).x(r);
                        }
                        return Unit.a;
                    case 1:
                        boolean z2 = MainActivity.n0;
                        qob U = mainActivity2.U();
                        ((Set) obj2).getClass();
                        U.getClass();
                        CalendarView calendarView3 = mainActivity2.c0;
                        if (calendarView3 != null) {
                            nr1 nr1Var2 = calendarView3.a;
                            if (nr1Var2 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var2.d).r();
                        }
                        return Unit.a;
                    case 2:
                        boolean z3 = MainActivity.n0;
                        ((Unit) obj2).getClass();
                        if (mainActivity2.c0 == null) {
                            CalendarView calendarView4 = mainActivity2.Q().c;
                            mainActivity2.c0 = calendarView4;
                            calendarView4.b();
                            calendarView4.setCallback(mainActivity2.k0);
                            calendarView4.setOnDisplayCallback(new hob(mainActivity2, 2));
                            calendarView4.setOnHideCallback(new hob(mainActivity2, 3));
                            calendarView4.setSelectWorldCupCallback(new ixa(9, mainActivity2, calendarView4));
                            calendarView4.setCalendarLogic(mainActivity2.R());
                        }
                        if (ke0.i) {
                            CalendarView calendarView5 = mainActivity2.c0;
                            if (calendarView5 != null) {
                                nr1 nr1Var3 = calendarView5.a;
                                if (nr1Var3 == null) {
                                    Intrinsics.i("binding");
                                    throw null;
                                }
                                ((MaterialCalendarView) nr1Var3.d).r();
                            }
                            ke0.i = false;
                        }
                        CalendarView calendarView6 = mainActivity2.c0;
                        if (calendarView6 != null) {
                            calendarView6.f = true;
                            ad2 ad2Var = qv5.a;
                            qv5.a(q42.a);
                            nr1 nr1Var4 = calendarView6.a;
                            if (nr1Var4 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            MaterialCalendarView materialCalendarView = (MaterialCalendarView) nr1Var4.d;
                            fg2 fg2Var = new fg2(ke0.a);
                            materialCalendarView.u(fg2Var, fg2Var, false, null);
                            nr1 nr1Var5 = calendarView6.a;
                            if (nr1Var5 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var5.d).r();
                            Function0 function0 = calendarView6.onDisplayCallback;
                            if (function0 != null) {
                                function0.invoke();
                            }
                            AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                            alphaAnimation.setDuration(200L);
                            alphaAnimation.setAnimationListener(new vg2(calendarView6, 0));
                            nr1 nr1Var6 = calendarView6.a;
                            if (nr1Var6 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            LinearLayout linearLayout3 = (LinearLayout) nr1Var6.c;
                            linearLayout3.getClass();
                            linearLayout3.setVisibility(0);
                            nr1 nr1Var7 = calendarView6.a;
                            if (nr1Var7 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((LinearLayout) nr1Var7.c).startAnimation(alphaAnimation);
                        }
                        return Unit.a;
                    case 3:
                        boolean z4 = MainActivity.n0;
                        ((Unit) obj2).getClass();
                        String str = (String) mainActivity2.V().o.d();
                        if (str != null) {
                            iqb W = mainActivity2.W();
                            W.getClass();
                            W.p = str;
                            mainActivity2.f0(mainActivity2.W().l);
                        }
                        return Unit.a;
                    case 4:
                        int intValue = ((Integer) obj2).intValue();
                        boolean z5 = MainActivity.n0;
                        mainActivity2.z().a(new g1f(intValue));
                        return Unit.a;
                    case 5:
                        boolean z6 = MainActivity.n0;
                        ((Unit) obj2).getClass();
                        mainActivity2.startActivity(new Intent(mainActivity2, (Class<?>) SofaSeasonActivity.class));
                        return Unit.a;
                    case 6:
                        Map map = (Map) obj2;
                        boolean z7 = MainActivity.n0;
                        qob U2 = mainActivity2.U();
                        map.getClass();
                        U2.getClass();
                        Set keySet = map.keySet();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : keySet) {
                            String str2 = (String) obj3;
                            List list2 = (List) U2.d.get(str2);
                            List list3 = (List) map.get(str2);
                            if (!Intrinsics.c(list2, list3) && ((list2 != null && !list2.isEmpty()) || (list3 != null && !list3.isEmpty()))) {
                                arrayList.add(obj3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Date parse = U2.b.parse((String) it.next());
                            parse.getClass();
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTime(parse);
                            arrayList2.add(new fg2(calendar));
                        }
                        U2.d = tub.p(map);
                        if (!arrayList2.isEmpty() && (calendarView2 = mainActivity2.c0) != null) {
                            nr1 nr1Var8 = calendarView2.a;
                            if (nr1Var8 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var8.d).x(arrayList2);
                        }
                        return Unit.a;
                    default:
                        boolean z8 = MainActivity.n0;
                        mainActivity2.a0();
                        CalendarView calendarView7 = mainActivity2.c0;
                        if (calendarView7 != null) {
                            nr1 nr1Var9 = calendarView7.a;
                            if (nr1Var9 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var9.d).r();
                        }
                        return Unit.a;
                }
            }
        }));
        zzc zzcVar3 = mainActivity.V().J;
        final int i13 = 2;
        p15 p15Var3 = new p15(new Function1(mainActivity) { // from class: gob
            public final /* synthetic */ MainActivity b;

            {
                this.b = mainActivity;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CalendarView calendarView;
                CalendarView calendarView2;
                int i92 = i13;
                MainActivity mainActivity2 = this.b;
                switch (i92) {
                    case 0:
                        List list = (List) obj2;
                        boolean z = MainActivity.n0;
                        hg2 R = mainActivity2.R();
                        list.getClass();
                        ArrayList r = R.r(list);
                        if (!r.isEmpty() && (calendarView = mainActivity2.c0) != null) {
                            nr1 nr1Var = calendarView.a;
                            if (nr1Var == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var.d).x(r);
                        }
                        return Unit.a;
                    case 1:
                        boolean z2 = MainActivity.n0;
                        qob U = mainActivity2.U();
                        ((Set) obj2).getClass();
                        U.getClass();
                        CalendarView calendarView3 = mainActivity2.c0;
                        if (calendarView3 != null) {
                            nr1 nr1Var2 = calendarView3.a;
                            if (nr1Var2 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var2.d).r();
                        }
                        return Unit.a;
                    case 2:
                        boolean z3 = MainActivity.n0;
                        ((Unit) obj2).getClass();
                        if (mainActivity2.c0 == null) {
                            CalendarView calendarView4 = mainActivity2.Q().c;
                            mainActivity2.c0 = calendarView4;
                            calendarView4.b();
                            calendarView4.setCallback(mainActivity2.k0);
                            calendarView4.setOnDisplayCallback(new hob(mainActivity2, 2));
                            calendarView4.setOnHideCallback(new hob(mainActivity2, 3));
                            calendarView4.setSelectWorldCupCallback(new ixa(9, mainActivity2, calendarView4));
                            calendarView4.setCalendarLogic(mainActivity2.R());
                        }
                        if (ke0.i) {
                            CalendarView calendarView5 = mainActivity2.c0;
                            if (calendarView5 != null) {
                                nr1 nr1Var3 = calendarView5.a;
                                if (nr1Var3 == null) {
                                    Intrinsics.i("binding");
                                    throw null;
                                }
                                ((MaterialCalendarView) nr1Var3.d).r();
                            }
                            ke0.i = false;
                        }
                        CalendarView calendarView6 = mainActivity2.c0;
                        if (calendarView6 != null) {
                            calendarView6.f = true;
                            ad2 ad2Var = qv5.a;
                            qv5.a(q42.a);
                            nr1 nr1Var4 = calendarView6.a;
                            if (nr1Var4 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            MaterialCalendarView materialCalendarView = (MaterialCalendarView) nr1Var4.d;
                            fg2 fg2Var = new fg2(ke0.a);
                            materialCalendarView.u(fg2Var, fg2Var, false, null);
                            nr1 nr1Var5 = calendarView6.a;
                            if (nr1Var5 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var5.d).r();
                            Function0 function0 = calendarView6.onDisplayCallback;
                            if (function0 != null) {
                                function0.invoke();
                            }
                            AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                            alphaAnimation.setDuration(200L);
                            alphaAnimation.setAnimationListener(new vg2(calendarView6, 0));
                            nr1 nr1Var6 = calendarView6.a;
                            if (nr1Var6 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            LinearLayout linearLayout3 = (LinearLayout) nr1Var6.c;
                            linearLayout3.getClass();
                            linearLayout3.setVisibility(0);
                            nr1 nr1Var7 = calendarView6.a;
                            if (nr1Var7 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((LinearLayout) nr1Var7.c).startAnimation(alphaAnimation);
                        }
                        return Unit.a;
                    case 3:
                        boolean z4 = MainActivity.n0;
                        ((Unit) obj2).getClass();
                        String str = (String) mainActivity2.V().o.d();
                        if (str != null) {
                            iqb W = mainActivity2.W();
                            W.getClass();
                            W.p = str;
                            mainActivity2.f0(mainActivity2.W().l);
                        }
                        return Unit.a;
                    case 4:
                        int intValue = ((Integer) obj2).intValue();
                        boolean z5 = MainActivity.n0;
                        mainActivity2.z().a(new g1f(intValue));
                        return Unit.a;
                    case 5:
                        boolean z6 = MainActivity.n0;
                        ((Unit) obj2).getClass();
                        mainActivity2.startActivity(new Intent(mainActivity2, (Class<?>) SofaSeasonActivity.class));
                        return Unit.a;
                    case 6:
                        Map map = (Map) obj2;
                        boolean z7 = MainActivity.n0;
                        qob U2 = mainActivity2.U();
                        map.getClass();
                        U2.getClass();
                        Set keySet = map.keySet();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : keySet) {
                            String str2 = (String) obj3;
                            List list2 = (List) U2.d.get(str2);
                            List list3 = (List) map.get(str2);
                            if (!Intrinsics.c(list2, list3) && ((list2 != null && !list2.isEmpty()) || (list3 != null && !list3.isEmpty()))) {
                                arrayList.add(obj3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Date parse = U2.b.parse((String) it.next());
                            parse.getClass();
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTime(parse);
                            arrayList2.add(new fg2(calendar));
                        }
                        U2.d = tub.p(map);
                        if (!arrayList2.isEmpty() && (calendarView2 = mainActivity2.c0) != null) {
                            nr1 nr1Var8 = calendarView2.a;
                            if (nr1Var8 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var8.d).x(arrayList2);
                        }
                        return Unit.a;
                    default:
                        boolean z8 = MainActivity.n0;
                        mainActivity2.a0();
                        CalendarView calendarView7 = mainActivity2.c0;
                        if (calendarView7 != null) {
                            nr1 nr1Var9 = calendarView7.a;
                            if (nr1Var9 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var9.d).r();
                        }
                        return Unit.a;
                }
            }
        }, i2);
        zzcVar3.getClass();
        zzcVar3.a.e(mainActivity, p15Var3);
        zzc zzcVar4 = mainActivity.V().R;
        p15 p15Var4 = new p15(new Function1(mainActivity) { // from class: gob
            public final /* synthetic */ MainActivity b;

            {
                this.b = mainActivity;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CalendarView calendarView;
                CalendarView calendarView2;
                int i92 = i4;
                MainActivity mainActivity2 = this.b;
                switch (i92) {
                    case 0:
                        List list = (List) obj2;
                        boolean z = MainActivity.n0;
                        hg2 R = mainActivity2.R();
                        list.getClass();
                        ArrayList r = R.r(list);
                        if (!r.isEmpty() && (calendarView = mainActivity2.c0) != null) {
                            nr1 nr1Var = calendarView.a;
                            if (nr1Var == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var.d).x(r);
                        }
                        return Unit.a;
                    case 1:
                        boolean z2 = MainActivity.n0;
                        qob U = mainActivity2.U();
                        ((Set) obj2).getClass();
                        U.getClass();
                        CalendarView calendarView3 = mainActivity2.c0;
                        if (calendarView3 != null) {
                            nr1 nr1Var2 = calendarView3.a;
                            if (nr1Var2 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var2.d).r();
                        }
                        return Unit.a;
                    case 2:
                        boolean z3 = MainActivity.n0;
                        ((Unit) obj2).getClass();
                        if (mainActivity2.c0 == null) {
                            CalendarView calendarView4 = mainActivity2.Q().c;
                            mainActivity2.c0 = calendarView4;
                            calendarView4.b();
                            calendarView4.setCallback(mainActivity2.k0);
                            calendarView4.setOnDisplayCallback(new hob(mainActivity2, 2));
                            calendarView4.setOnHideCallback(new hob(mainActivity2, 3));
                            calendarView4.setSelectWorldCupCallback(new ixa(9, mainActivity2, calendarView4));
                            calendarView4.setCalendarLogic(mainActivity2.R());
                        }
                        if (ke0.i) {
                            CalendarView calendarView5 = mainActivity2.c0;
                            if (calendarView5 != null) {
                                nr1 nr1Var3 = calendarView5.a;
                                if (nr1Var3 == null) {
                                    Intrinsics.i("binding");
                                    throw null;
                                }
                                ((MaterialCalendarView) nr1Var3.d).r();
                            }
                            ke0.i = false;
                        }
                        CalendarView calendarView6 = mainActivity2.c0;
                        if (calendarView6 != null) {
                            calendarView6.f = true;
                            ad2 ad2Var = qv5.a;
                            qv5.a(q42.a);
                            nr1 nr1Var4 = calendarView6.a;
                            if (nr1Var4 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            MaterialCalendarView materialCalendarView = (MaterialCalendarView) nr1Var4.d;
                            fg2 fg2Var = new fg2(ke0.a);
                            materialCalendarView.u(fg2Var, fg2Var, false, null);
                            nr1 nr1Var5 = calendarView6.a;
                            if (nr1Var5 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var5.d).r();
                            Function0 function0 = calendarView6.onDisplayCallback;
                            if (function0 != null) {
                                function0.invoke();
                            }
                            AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                            alphaAnimation.setDuration(200L);
                            alphaAnimation.setAnimationListener(new vg2(calendarView6, 0));
                            nr1 nr1Var6 = calendarView6.a;
                            if (nr1Var6 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            LinearLayout linearLayout3 = (LinearLayout) nr1Var6.c;
                            linearLayout3.getClass();
                            linearLayout3.setVisibility(0);
                            nr1 nr1Var7 = calendarView6.a;
                            if (nr1Var7 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((LinearLayout) nr1Var7.c).startAnimation(alphaAnimation);
                        }
                        return Unit.a;
                    case 3:
                        boolean z4 = MainActivity.n0;
                        ((Unit) obj2).getClass();
                        String str = (String) mainActivity2.V().o.d();
                        if (str != null) {
                            iqb W = mainActivity2.W();
                            W.getClass();
                            W.p = str;
                            mainActivity2.f0(mainActivity2.W().l);
                        }
                        return Unit.a;
                    case 4:
                        int intValue = ((Integer) obj2).intValue();
                        boolean z5 = MainActivity.n0;
                        mainActivity2.z().a(new g1f(intValue));
                        return Unit.a;
                    case 5:
                        boolean z6 = MainActivity.n0;
                        ((Unit) obj2).getClass();
                        mainActivity2.startActivity(new Intent(mainActivity2, (Class<?>) SofaSeasonActivity.class));
                        return Unit.a;
                    case 6:
                        Map map = (Map) obj2;
                        boolean z7 = MainActivity.n0;
                        qob U2 = mainActivity2.U();
                        map.getClass();
                        U2.getClass();
                        Set keySet = map.keySet();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : keySet) {
                            String str2 = (String) obj3;
                            List list2 = (List) U2.d.get(str2);
                            List list3 = (List) map.get(str2);
                            if (!Intrinsics.c(list2, list3) && ((list2 != null && !list2.isEmpty()) || (list3 != null && !list3.isEmpty()))) {
                                arrayList.add(obj3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Date parse = U2.b.parse((String) it.next());
                            parse.getClass();
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTime(parse);
                            arrayList2.add(new fg2(calendar));
                        }
                        U2.d = tub.p(map);
                        if (!arrayList2.isEmpty() && (calendarView2 = mainActivity2.c0) != null) {
                            nr1 nr1Var8 = calendarView2.a;
                            if (nr1Var8 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var8.d).x(arrayList2);
                        }
                        return Unit.a;
                    default:
                        boolean z8 = MainActivity.n0;
                        mainActivity2.a0();
                        CalendarView calendarView7 = mainActivity2.c0;
                        if (calendarView7 != null) {
                            nr1 nr1Var9 = calendarView7.a;
                            if (nr1Var9 == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            ((MaterialCalendarView) nr1Var9.d).r();
                        }
                        return Unit.a;
                }
            }
        }, i2);
        zzcVar4.getClass();
        zzcVar4.a.e(mainActivity, p15Var4);
        qv7 qv7Var = rv7.c;
        if (ml4.e0()) {
            z8e.x(mainActivity, mainActivity.V().Y, new nob(mainActivity, rq3Var, i));
        }
        mainActivity.getOnBackPressedDispatcher().a(mainActivity, mainActivity.l0);
        if (pk.c(mainActivity) && jca.G(mainActivity.D())) {
            mainActivity.T().l(mainActivity, AdType.Interstitial.Media);
            e6b e6bVar2 = e6b.a;
            KClass orCreateKotlinClass2 = fufVar.getOrCreateKotlinClass(f52.class);
            Object obj2 = linkedHashMap.get(orCreateKotlinClass2);
            if (obj2 == null) {
                obj2 = beh.b(0, 0, null, 7);
                linkedHashMap.put(orCreateKotlinClass2, obj2);
            }
            xw3.L(wca.x(mainActivity.getLifecycle()), null, null, new mob(mainActivity, (b1d) obj2, null, this, 0), 3);
            e6b e6bVar3 = e6b.a;
            KClass orCreateKotlinClass3 = fufVar.getOrCreateKotlinClass(w42.class);
            Object obj3 = linkedHashMap.get(orCreateKotlinClass3);
            if (obj3 == null) {
                obj3 = beh.b(0, 0, null, 7);
                linkedHashMap.put(orCreateKotlinClass3, obj3);
            }
            b1d b1dVar = (b1d) obj3;
            mainActivity = this;
            xw3.L(wca.x(getLifecycle()), null, null, new mob(mainActivity, b1dVar, null, this, 1), 3);
        }
        Bundle extras = mainActivity.getIntent().getExtras();
        Boolean bool = extras != null ? (Boolean) gz8.M(extras, "FANTASY_UNSUPPORTED_COUNTRY_ERROR", Boolean.class) : null;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.c(bool, bool2)) {
            string = mainActivity.getString(R.string.fantasy_restriction_notice_text);
        } else {
            Bundle extras2 = mainActivity.getIntent().getExtras();
            string = Intrinsics.c(extras2 != null ? (Boolean) gz8.M(extras2, "FANTASY_INVALID_CODE_ERROR", Boolean.class) : null, bool2) ? mainActivity.getString(R.string.fantasy_unable_to_verify_code) : null;
        }
        if (string != null) {
            mainActivity.Q().e.post(new yq5(i11, mainActivity, string));
        }
        boolean c = Intrinsics.c(bundle != null ? Boolean.valueOf(bundle.getBoolean("extrasConsumed", false)) : null, bool2);
        mainActivity.Y = c;
        if (c) {
            mainActivity.getIntent().replaceExtras((Bundle) null);
        }
        z8e.x(mainActivity, mainActivity.V().W, new nob(mainActivity, rq3Var, i2));
        yea yeaVar = j58.a;
        if (!fn0.B("should_show_world_cup")) {
            SharedPreferences sharedPreferences2 = uic.j;
            if (sharedPreferences2 == null) {
                Context applicationContext = mainActivity.getApplicationContext();
                synchronized (uic.i) {
                    sharedPreferences2 = a5f.d(applicationContext);
                    uic.j = sharedPreferences2;
                }
                sharedPreferences2.getClass();
            }
        }
        z8e.x(mainActivity, mainActivity.V().p, new nob(mainActivity, rq3Var, i13));
        Intent intent = mainActivity.getIntent();
        intent.getClass();
        mainActivity.X(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.MenuItem] */
    /* JADX WARN: Type inference failed for: r5v2 */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        String format;
        ImageView imageView;
        nt9 a;
        g6b lifecycle;
        menu.getClass();
        getMenuInflater().inflate(R.menu.activity_main_menu_new, menu);
        this.Q = menu.findItem(R.id.delete_finished);
        this.R = menu.findItem(R.id.menu_disable_notifications);
        this.S = menu.findItem(R.id.menu_enable_notifications);
        qv7 qv7Var = rv7.c;
        ?? r5 = 0;
        r5 = null;
        String str = null;
        if (ml4.e0()) {
            MenuItem findItem = menu.findItem(R.id.menu_add_to_favorites);
            if (findItem != null) {
                View actionView = findItem.getActionView();
                this.W = actionView != null ? (FollowActionButton) actionView.findViewById(R.id.follow_button) : null;
            } else {
                findItem = null;
            }
            this.U = findItem;
            MenuItem findItem2 = menu.findItem(R.id.menu_receive_notifications);
            if (findItem2 != null) {
                View actionView2 = findItem2.getActionView();
                this.X = actionView2 != null ? (NotificationsActionButton) actionView2.findViewById(R.id.notifications_button) : null;
            } else {
                findItem2 = null;
            }
            this.V = findItem2;
        }
        MenuItem findItem3 = menu.findItem(R.id.menu_profile);
        int i = 1;
        if (findItem3 != null) {
            View actionView3 = findItem3.getActionView();
            if (actionView3 != null && (imageView = (ImageView) actionView3.findViewById(R.id.profile_icon)) != null) {
                boolean z = as9.a;
                fsf fsfVar = new fsf();
                Context context = imageView.getContext();
                context.getClass();
                FragmentActivity K = hkg.K(context);
                AppCompatActivity appCompatActivity = K instanceof AppCompatActivity ? (AppCompatActivity) K : null;
                if (appCompatActivity != null) {
                    fsfVar.a = xw3.L(wca.x(appCompatActivity.getLifecycle()), null, null, new zi7(appCompatActivity, imageView, context, (rq3) r5, 14), 3);
                }
                if (imageView.isAttachedToWindow()) {
                    u6b w = qha.w(imageView);
                    if (w != null && (lifecycle = w.getLifecycle()) != null) {
                        lifecycle.a(new zr9(lifecycle, fsfVar, i));
                    }
                } else {
                    imageView.addOnAttachStateChangeListener(new yr9(imageView, imageView, fsfVar, i));
                }
                ia0 ia0Var = ia0.q;
                String imageUrl = ok3.p().e().getImageUrl();
                apf a2 = ajh.a(imageView.getContext());
                ht9 ht9Var = new ht9(imageView.getContext());
                ht9Var.c = imageUrl;
                vt9.f(ht9Var, imageView);
                wt9 I = rfo.I(imageView);
                if (I != null && (a = I.a()) != null) {
                    str = a.e;
                }
                z8e.Q(ht9Var, context, R.drawable.ic_profile_settings, str, Integer.valueOf(R.color.on_color_primary));
                awj[] awjVarArr = {new urh()};
                sl6 sl6Var = st9.a;
                st9.b(ht9Var, ph0.X(awjVarArr));
                a2.a(ht9Var.a());
            }
            View actionView4 = findItem3.getActionView();
            if (actionView4 != null) {
                actionView4.setOnClickListener(new cd5(this, 15));
            }
            r5 = findItem3;
        }
        this.T = r5;
        try {
            format = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(dla.d()).format(LocalTime.of(8, 0));
        } catch (RuntimeException unused) {
            format = DateTimeFormatter.ofPattern(DateFormat.is24HourFormat(this) ? "HH:mm" : "h:mm a", dla.d()).format(LocalTime.of(8, 0));
        }
        MenuItem findItem4 = menu.findItem(R.id.disableUntilEight);
        if (findItem4 != null) {
            findItem4.setTitle(getString(R.string.mute_until, format));
        }
        if (W().l.size() > 0) {
            b0((jqb) W().E(Q().j.getCurrentItem()));
        }
        return true;
    }

    @Override // com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ldk ldkVar = (ldk) this.d0.getValue();
        zao zaoVar = ldkVar.d;
        jdk jdkVar = ldkVar.e;
        synchronized (zaoVar) {
            rqn rqnVar = zaoVar.b;
            synchronized (rqnVar) {
                rqnVar.a.f("unregisterListener", new Object[0]);
                if (jdkVar == null) {
                    throw new NullPointerException("Unregistered Play Core listener should not be null.");
                }
                rqnVar.d.remove(jdkVar);
                rqnVar.a();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        X(intent);
    }

    @Override // com.sofascore.results.base.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        int i = 1;
        if (itemId == 16908332) {
            TypedValue typedValue = new TypedValue();
            gjf gjfVar = new gjf(this, getTheme().resolveAttribute(R.attr.sideSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Material3_Light_SideSheetDialog);
            gjfVar.k = true;
            gjfVar.l = true;
            gjfVar.n = true;
            gjfVar.d().i(1);
            View inflate = LayoutInflater.from(this).inflate(R.layout.quick_links_content, (ViewGroup) null, false);
            int i2 = R.id.empty_state;
            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.empty_state, inflate);
            if (linearLayout != null) {
                i2 = R.id.header;
                View B = nq8.B(R.id.header, inflate);
                if (B != null) {
                    int i3 = R.id.button;
                    ImageView imageView = (ImageView) nq8.B(R.id.button, B);
                    if (imageView != null) {
                        i3 = R.id.title;
                        if (((TextView) nq8.B(R.id.title, B)) != null) {
                            woc wocVar = new woc((ConstraintLayout) B, imageView);
                            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                            if (recyclerView != null) {
                                LinearLayout linearLayout2 = (LinearLayout) inflate;
                                z3f z3fVar = new z3f(linearLayout2, linearLayout, wocVar, recyclerView);
                                imageView.setImageResource(R.drawable.ic_edit);
                                gjfVar.setContentView(linearLayout2);
                                FrameLayout frameLayout = gjfVar.j;
                                if (frameLayout == null) {
                                    a70.r("Sheet view reference is null; sheet edge cannot be changed if the sheet view is null.");
                                    return false;
                                }
                                if (frameLayout.isLaidOut()) {
                                    a70.r("Sheet view has been laid out; sheet edge cannot be changed once the sheet has been laid out.");
                                    return false;
                                }
                                ViewGroup.LayoutParams layoutParams = gjfVar.j.getLayoutParams();
                                if (layoutParams instanceof xs3) {
                                    ((xs3) layoutParams).c = 8388611;
                                    gjfVar.g();
                                }
                                gjfVar.setCanceledOnTouchOutside(true);
                                gjfVar.setOnShowListener(new dn(gjfVar, 2));
                                nm5 nm5Var = new nm5(this, i);
                                nm5Var.a.d = new pte(this, 9);
                                z8e.b0(recyclerView, this, false, false, null, 30);
                                recyclerView.setAdapter(nm5Var);
                                nm5Var.F(gjfVar.i(imageView.isSelected()));
                                linearLayout.setVisibility(nm5Var.getItemCount() == 0 ? 0 : 8);
                                wrf.a(recyclerView, new mme(z3fVar, 14));
                                imageView.setOnClickListener(new r2(imageView, nm5Var, gjfVar, z3fVar, 4));
                                gjfVar.show();
                                return true;
                            }
                            i2 = R.id.recycler_view;
                        }
                    }
                    yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i3)));
                    return false;
                }
            }
            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            return false;
        }
        if (itemId == R.id.delete_finished) {
            boolean z = V().a0;
            AlertDialog create = new AlertDialog.Builder(this, R.style.RedesignDialog).create();
            ez0 e = ez0.e(LayoutInflater.from(this));
            TextView textView = (TextView) e.d;
            ((MaterialCheckBox) e.c).setVisibility(8);
            TextView textView2 = (TextView) e.e;
            if (z) {
                textView2.setText(getString(R.string.no_finished_events));
                textView.setVisibility(8);
                create.setButton(-1, getString(R.string.button_text_got_it), new i0(create, i));
            } else {
                textView2.setText(getString(R.string.delete_events_title));
                textView.setText(getString(R.string.delete_events_body));
                create.setButton(-1, getString(R.string.clear_all), new h0(i, this, create));
                create.setButton(-3, getString(R.string.cancel), new i0(create, 3));
            }
            create.setView((ScrollView) e.b);
            create.show();
        } else if (itemId == R.id.disableTwo) {
            wxf.y(2L, this);
            nv.z0(this, kv.CLICK, y1d.d.c, "main_screen");
            MenuItem menuItem2 = this.R;
            if (menuItem2 != null) {
                menuItem2.setVisible(false);
            }
            MenuItem menuItem3 = this.S;
            if (menuItem3 != null) {
                menuItem3.setVisible(true);
            }
        } else if (itemId == R.id.disableFour) {
            wxf.y(4L, this);
            nv.z0(this, kv.CLICK, y1d.e.c, "main_screen");
            MenuItem menuItem4 = this.R;
            if (menuItem4 != null) {
                menuItem4.setVisible(false);
            }
            MenuItem menuItem5 = this.S;
            if (menuItem5 != null) {
                menuItem5.setVisible(true);
            }
        } else if (itemId == R.id.disableUntilEight) {
            wxf.z(this, true, false);
            nv.z0(this, kv.CLICK, y1d.f.c, "main_screen");
            MenuItem menuItem6 = this.R;
            if (menuItem6 != null) {
                menuItem6.setVisible(false);
            }
            MenuItem menuItem7 = this.S;
            if (menuItem7 != null) {
                menuItem7.setVisible(true);
            }
        } else if (itemId == R.id.menu_enable_notifications) {
            wxf.f(6, this);
            Calendar calendar = ke0.a;
            ke0.g(this, getString(R.string.notifications_enabled), 0);
            MenuItem menuItem8 = this.R;
            if (menuItem8 != null) {
                menuItem8.setVisible(true);
            }
            MenuItem menuItem9 = this.S;
            if (menuItem9 != null) {
                menuItem9.setVisible(false);
            }
        } else if (itemId == R.id.menu_notification_settings) {
            nv.z0(this, kv.CLICK, "notification_settings", "main_screen");
            Intent intent = new Intent(this, (Class<?>) NotificationSettingsActivity.class);
            intent.putExtra("PRESELECTED_SETTING_NAME", (String) null);
            intent.putExtra("PRESELECTED_GROUP_NAME", (String) null);
            startActivity(intent);
        } else if (itemId == R.id.menu_profile) {
            startActivity(new Intent(this, (Class<?>) UserProfileActivity.class));
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.sofascore.results.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        ((in6) this.M.getValue()).c = false;
    }

    @Override // com.sofascore.results.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        String str;
        super.onResume();
        if (ke0.k && (str = (String) V().o.d()) != null) {
            V().n(str);
        }
        if (wxf.q(this).equals("NOTIFICATION_BLOCKED")) {
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = getApplicationContext();
                synchronized (uic.i) {
                    sharedPreferences = a5f.d(applicationContext);
                    uic.j = sharedPreferences;
                }
                sharedPreferences.getClass();
            }
            if (sharedPreferences.getLong("PREF_DISABLE_NOTIFICATION_TIME", 0L) <= System.currentTimeMillis() / 1000) {
                wxf.f(6, this);
            }
        }
        e0();
        k6b x = wca.x(getLifecycle());
        hs4 hs4Var = z45.a;
        xw3.L(x, rob.a, null, new p01(this, null, 1), 2);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putInt("tab_ordinal", W().l.size() > Q().j.getCurrentItem() ? ((jqb) W().E(Q().j.getCurrentItem())).ordinal() : 0);
        bundle.putBoolean("extrasConsumed", this.Y);
        Parcel obtain = Parcel.obtain();
        obtain.getClass();
        try {
            obtain.writeBundle(bundle);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            if (dataSize >= 512000) {
                bundle.remove("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // com.sofascore.results.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        ldk ldkVar = (ldk) this.d0.getValue();
        ldkVar.getClass();
        de deVar = this.e0;
        deVar.getClass();
        ldkVar.d.b().addOnSuccessListener(new imf(new mwj(18, ldkVar, deVar), 25));
        ((in6) this.M.getValue()).c = false;
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "MainScreen";
    }

    @Override // com.sofascore.results.base.BaseActivity
    /* renamed from: v */
    public final boolean getL() {
        return false;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
