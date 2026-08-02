package com.sofascore.results.main.start;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.activity.result.ActivityResult;
import com.appsflyer.sdk_base.referrer.Payload;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.facebook.ads.internal.dynamicloading.FlashPreferences;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.notifications.NotificationType;
import com.sofascore.results.R;
import com.sofascore.results.ads.UpgradeSofascoreActivity;
import com.sofascore.results.bettingtips.BettingTipsActivity;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.fantasy.competition.FantasyCompetitionActivity;
import com.sofascore.results.fantasy.onboarding.FantasyOnboardingActivity;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.league.historical.LeagueHistoricalDataActivity;
import com.sofascore.results.league.service.ShortcutWorker;
import com.sofascore.results.main.MainActivity;
import com.sofascore.results.main.SurveyActivity;
import com.sofascore.results.main.search.SearchActivity;
import com.sofascore.results.main.start.StartActivity;
import com.sofascore.results.manager.ManagerActivity;
import com.sofascore.results.mma.fightNight.MmaFightNightActivity;
import com.sofascore.results.mma.fighter.MmaFighterActivity;
import com.sofascore.results.mma.organisation.MmaOrganisationActivity;
import com.sofascore.results.onboarding.OnboardingActivity;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.player.statistics.compare.SeasonComparisonActivity;
import com.sofascore.results.pots.POTSActivity;
import com.sofascore.results.profile.LoginScreenActivity;
import com.sofascore.results.profile.ProfileActivity;
import com.sofascore.results.profile.ProfileDetailsActivity;
import com.sofascore.results.ranking.RankingsActivity;
import com.sofascore.results.service.InstallReferrerWorker;
import com.sofascore.results.service.PinnedLeagueWorker;
import com.sofascore.results.service.RingtoneWorker;
import com.sofascore.results.service.StartWorker;
import com.sofascore.results.settings.SettingsActivity;
import com.sofascore.results.sofaSeason.SofaSeasonActivity;
import com.sofascore.results.stagesport.StageCategoryActivity;
import com.sofascore.results.stagesport.StageConstructorActivity;
import com.sofascore.results.stagesport.StageDetailsActivity;
import com.sofascore.results.stagesport.StageDriverActivity;
import com.sofascore.results.team.TeamActivity;
import com.sofascore.results.venue.VenueActivity;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeActivity;
import defpackage.a5f;
import defpackage.a99;
import defpackage.amf;
import defpackage.b5i;
import defpackage.bg0;
import defpackage.big;
import defpackage.boj;
import defpackage.ce;
import defpackage.de;
import defpackage.dff;
import defpackage.dg0;
import defpackage.dla;
import defpackage.duf;
import defpackage.dv3;
import defpackage.e6b;
import defpackage.eg0;
import defpackage.f3e;
import defpackage.f5d;
import defpackage.f5p;
import defpackage.f7a;
import defpackage.f8h;
import defpackage.fff;
import defpackage.fib;
import defpackage.fuf;
import defpackage.g2i;
import defpackage.g6b;
import defpackage.g7a;
import defpackage.gjf;
import defpackage.gv;
import defpackage.gz8;
import defpackage.h4i;
import defpackage.hje;
import defpackage.hpo;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.hv;
import defpackage.i58;
import defpackage.ia0;
import defpackage.ica;
import defpackage.ici;
import defpackage.iii;
import defpackage.ilg;
import defpackage.inb;
import defpackage.iz2;
import defpackage.jaa;
import defpackage.jle;
import defpackage.jmf;
import defpackage.kb0;
import defpackage.ke0;
import defpackage.ktd;
import defpackage.l4a;
import defpackage.lci;
import defpackage.ltd;
import defpackage.m2i;
import defpackage.md4;
import defpackage.mha;
import defpackage.n9e;
import defpackage.nf6;
import defpackage.nv;
import defpackage.o01;
import defpackage.o13;
import defpackage.o4i;
import defpackage.o84;
import defpackage.ok3;
import defpackage.otk;
import defpackage.p15;
import defpackage.pff;
import defpackage.prd;
import defpackage.q5a;
import defpackage.qa3;
import defpackage.qx9;
import defpackage.rd6;
import defpackage.rfi;
import defpackage.rha;
import defpackage.rq3;
import defpackage.sha;
import defpackage.t4j;
import defpackage.tol;
import defpackage.u0a;
import defpackage.ubi;
import defpackage.ug5;
import defpackage.uic;
import defpackage.un0;
import defpackage.v7a;
import defpackage.vxd;
import defpackage.wt3;
import defpackage.wxf;
import defpackage.x2a;
import defpackage.xbl;
import defpackage.xd;
import defpackage.xw3;
import defpackage.xxh;
import defpackage.y3g;
import defpackage.y4b;
import defpackage.yfa;
import defpackage.yv6;
import defpackage.z45;
import defpackage.zu3;
import defpackage.zxe;
import defpackage.zzc;
import defpackage.zzl;
import java.io.Serializable;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/main/start/StartActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "i9a", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StartActivity extends Hilt_StartActivity {
    public static final /* synthetic */ int q = 0;
    public final otk l;
    public final otk m;
    public SharedPreferences n;
    public final de o;
    public final de p;

    public StartActivity() {
        final int i = 0;
        ubi ubiVar = new ubi(this, i);
        fuf fufVar = duf.a;
        final int i2 = 1;
        this.l = new otk(fufVar.getOrCreateKotlinClass(yv6.class), new ubi(this, i2), ubiVar, new ubi(this, 2));
        int i3 = 3;
        this.m = new otk(fufVar.getOrCreateKotlinClass(lci.class), new ubi(this, 4), new ubi(this, i3), new ubi(this, 5));
        this.o = registerForActivityResult(new ce(i3), new xd(this) { // from class: tbi
            public final /* synthetic */ StartActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.xd
            public final void onActivityResult(Object obj) {
                int i4 = i;
                StartActivity startActivity = this.b;
                rq3 rq3Var = null;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i4) {
                    case 0:
                        int i5 = StartActivity.q;
                        activityResult.getClass();
                        if (activityResult.a != -1) {
                            startActivity.finish();
                            boolean z = MainActivity.n0;
                            f8h.z(startActivity, null, 6);
                            break;
                        } else {
                            yv6 q2 = startActivity.q();
                            if (q2.h != null) {
                                xw3.L(un0.z(q2), null, null, new xv6(q2, rq3Var, 0), 3);
                                break;
                            }
                        }
                        break;
                    default:
                        int i6 = StartActivity.q;
                        activityResult.getClass();
                        if (activityResult.a != 101) {
                            startActivity.finish();
                            boolean z2 = MainActivity.n0;
                            f8h.z(startActivity, null, 6);
                            break;
                        } else {
                            Intent intent = activityResult.b;
                            if (intent != null) {
                                Serializable y = g7a.y(intent, "userCompetition", do7.class);
                                if (y == null) {
                                    a70.p("Serializable userCompetition not found");
                                    break;
                                } else {
                                    startActivity.q().i = (do7) y;
                                    yv6 q3 = startActivity.q();
                                    if (q3.h != null) {
                                        xw3.L(un0.z(q3), null, null, new xv6(q3, rq3Var, 1), 3);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                }
            }
        });
        this.p = registerForActivityResult(new ce(i3), new xd(this) { // from class: tbi
            public final /* synthetic */ StartActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.xd
            public final void onActivityResult(Object obj) {
                int i4 = i2;
                StartActivity startActivity = this.b;
                rq3 rq3Var = null;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i4) {
                    case 0:
                        int i5 = StartActivity.q;
                        activityResult.getClass();
                        if (activityResult.a != -1) {
                            startActivity.finish();
                            boolean z = MainActivity.n0;
                            f8h.z(startActivity, null, 6);
                            break;
                        } else {
                            yv6 q2 = startActivity.q();
                            if (q2.h != null) {
                                xw3.L(un0.z(q2), null, null, new xv6(q2, rq3Var, 0), 3);
                                break;
                            }
                        }
                        break;
                    default:
                        int i6 = StartActivity.q;
                        activityResult.getClass();
                        if (activityResult.a != 101) {
                            startActivity.finish();
                            boolean z2 = MainActivity.n0;
                            f8h.z(startActivity, null, 6);
                            break;
                        } else {
                            Intent intent = activityResult.b;
                            if (intent != null) {
                                Serializable y = g7a.y(intent, "userCompetition", do7.class);
                                if (y == null) {
                                    a70.p("Serializable userCompetition not found");
                                    break;
                                } else {
                                    startActivity.q().i = (do7) y;
                                    yv6 q3 = startActivity.q();
                                    if (q3.h != null) {
                                        xw3.L(un0.z(q3), null, null, new xv6(q3, rq3Var, 1), 3);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                }
            }
        });
    }

    public static boolean u() {
        ia0 ia0Var = ia0.q;
        return ok3.p().e().getIsLoggedIn();
    }

    @Override // com.sofascore.results.main.start.Hilt_StartActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        y3g xxhVar = i >= 31 ? new xxh(this) : new y3g(this);
        xxhVar.v();
        xxhVar.C(new ilg(24));
        super.onCreate(bundle);
        rq3 rq3Var = null;
        if (i < 33) {
            List list = dla.a;
            dla.e = null;
        }
        ia0 ia0Var = ia0.q;
        int i2 = 0;
        ok3.p().c().i(this, false);
        u0a.D(this, false);
        SharedPreferences.Editor edit = r().edit();
        edit.getClass();
        int i3 = 1;
        edit.putBoolean("no_connection_empty_state", true);
        edit.apply();
        int i4 = 7;
        int i5 = 4;
        int i6 = 6;
        int i7 = 2;
        if (r().getBoolean("PREF_FIRST_RUN_V3", true)) {
            SharedPreferences.Editor edit2 = r().edit();
            edit2.getClass();
            edit2.putBoolean("PREF_FIRST_RUN_V3", false);
            String str = "MONDAY";
            int firstDayOfWeek = Calendar.getInstance().getFirstDayOfWeek();
            if (firstDayOfWeek == 1) {
                str = "SUNDAY";
            } else if (firstDayOfWeek == 3) {
                str = "TUESDAY";
            } else if (firstDayOfWeek == 4) {
                str = "WEDNESDAY";
            } else if (firstDayOfWeek == 5) {
                str = "THURSDAY";
            } else if (firstDayOfWeek == 6) {
                str = "FRIDAY";
            } else if (firstDayOfWeek == 7) {
                str = "SATURDAY";
            }
            edit2.putString("PREF_FIRST_DAY_OF_WEEK", str);
            edit2.putLong("PREF_FIRST_RUN_TIMESTAMP", System.currentTimeMillis());
            edit2.putInt("version_code", Integer.parseInt(iii.H(6, "260720003")));
            edit2.putString("locale_code", dla.b(this));
            edit2.putBoolean("BUZZER_MAIN_SCREEN", true);
            edit2.putBoolean("SHOW_INTRODUCTORY_MODAL_PREF", false);
            edit2.apply();
            lci s = s();
            xw3.L(un0.z(s), null, null, new ici(s, rq3Var, i3), 3);
            ktd A = mha.A(new ktd(InstallReferrerWorker.class));
            mha.y(A);
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            xbl d = xbl.d(applicationContext);
            d.getClass();
            String concat = "InstallReferrerWorker-".concat("");
            nf6 nf6Var = nf6.a;
            d.b(concat, nf6Var, (ltd) A.a());
            q5a.C(this);
            ktd A2 = mha.A(new ktd(RingtoneWorker.class));
            mha.y(A2);
            Context applicationContext2 = getApplicationContext();
            applicationContext2.getClass();
            xbl d2 = xbl.d(applicationContext2);
            d2.getClass();
            d2.b("RingtoneWorker-".concat(""), nf6Var, (ltd) A2.a());
            nv.N(this, null, "first_install");
            nv.Q(this, "first_install");
            nv.J(this, "new_user", dla.a());
        } else {
            lci s2 = s();
            xw3.L(un0.z(s2), null, null, new ici(s2, rq3Var, i2), 3);
            int i8 = r().getInt("version_code", 0);
            boolean z = i8 < Integer.parseInt(iii.H(6, "260720003"));
            boolean c = Intrinsics.c(r().getString("locale_code", ""), dla.b(this));
            if (z) {
                SharedPreferences.Editor edit3 = r().edit();
                edit3.getClass();
                edit3.putLong(FlashPreferences.SP_KEY_LAST_CONFIG_UPDATE_TIMESTAMP, System.currentTimeMillis());
                edit3.apply();
                if (i8 > 0) {
                    FirebaseBundle firebaseBundle = new FirebaseBundle();
                    firebaseBundle.putString("previous_app_version", String.valueOf(i8));
                    ((f5d) ok3.p().d().get()).c("app_update", firebaseBundle);
                    FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this);
                    firebaseAnalytics.getClass();
                    firebaseAnalytics.a.e(n9e.K(firebaseBundle), null, "app_update", false);
                }
                int i9 = gjf.p;
                l4a.J(this, false);
                if (u() && i8 < 260422) {
                    SharedPreferences.Editor edit4 = r().edit();
                    edit4.getClass();
                    edit4.putBoolean("PINNED_LEAGUES_SYNCED_BLOCKED", true);
                    edit4.apply();
                    Pair[] pairArr = {new Pair("ACTION", "BACKUP_PINNED_LEAGUES_ORDER")};
                    hpo hpoVar = new hpo(18);
                    Pair pair = pairArr[0];
                    hpoVar.B(pair.b, (String) pair.a);
                    md4 l = hpoVar.l();
                    ktd g = vxd.g(PinnedLeagueWorker.class, l);
                    Context applicationContext3 = getApplicationContext();
                    applicationContext3.getClass();
                    xbl d3 = xbl.d(applicationContext3);
                    d3.getClass();
                    d3.b("PinnedLeagueWorker-".concat(mha.o(l)), nf6.a, (ltd) g.a());
                }
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext4 = getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences = a5f.d(applicationContext4);
                        uic.j = sharedPreferences;
                    }
                    sharedPreferences.getClass();
                }
                if (sharedPreferences.getBoolean("PREF_NEW_NOTIFICATION_SETUP", false)) {
                    f5p.D(this, hq4.c, new i58(i7, rq3Var, i4));
                }
            }
            if (z || !c) {
                if (i8 < 6147) {
                    mha.F(this);
                }
                if (i8 < 250312) {
                    boolean z2 = !Intrinsics.c(r().getString("PREF_PROVIDER_ODDS", null), "None");
                    SharedPreferences.Editor edit5 = r().edit();
                    edit5.getClass();
                    edit5.putBoolean("PREF_PROVIDER_ODDS_ENABLE", z2);
                    edit5.apply();
                }
                if (i8 < 250508) {
                    q5a.C(this);
                }
                if (i8 < 250702) {
                    lci s3 = s();
                    iz2 z3 = un0.z(s3);
                    hs4 hs4Var = z45.a;
                    xw3.L(z3, hq4.c, null, new big(s3, rq3Var, 26), 2);
                }
                if (i8 < 251120) {
                    SharedPreferences.Editor edit6 = r().edit();
                    edit6.getClass();
                    edit6.putBoolean("ADD_RINGTONE_PREFv2", true);
                    edit6.apply();
                }
                if (i8 < 260212) {
                    ktd A3 = mha.A(new ktd(RingtoneWorker.class));
                    mha.y(A3);
                    Context applicationContext5 = getApplicationContext();
                    applicationContext5.getClass();
                    xbl d4 = xbl.d(applicationContext5);
                    d4.getClass();
                    d4.b("RingtoneWorker-".concat(""), nf6.a, (ltd) A3.a());
                }
                if (!c) {
                    Pair[] pairArr2 = {new Pair("ACTION", "LOCALE_CHANGE")};
                    hpo hpoVar2 = new hpo(18);
                    Pair pair2 = pairArr2[0];
                    hpoVar2.B(pair2.b, (String) pair2.a);
                    md4 l2 = hpoVar2.l();
                    ktd g2 = vxd.g(ShortcutWorker.class, l2);
                    Context applicationContext6 = getApplicationContext();
                    applicationContext6.getClass();
                    xbl d5 = xbl.d(applicationContext6);
                    d5.getClass();
                    d5.b("ShortcutWorker-".concat(mha.o(l2)), nf6.a, (ltd) g2.a());
                }
                SharedPreferences.Editor edit7 = r().edit();
                edit7.getClass();
                edit7.putInt("version_code", Integer.parseInt(iii.H(6, "260720003")));
                edit7.putString("locale_code", dla.b(this));
                edit7.apply();
                u0a.C(this);
            }
            if (i8 < 5992 && !r().getBoolean("PREF_LANGUAGE_MIGRATED", false)) {
                fib a = fib.a(r().getString("PREF_LANGUAGE_CODE", ""));
                a.getClass();
                dla.g(a);
                SharedPreferences.Editor edit8 = r().edit();
                edit8.getClass();
                edit8.putBoolean("PREF_LANGUAGE_MIGRATED", true);
                edit8.apply();
            }
            if (rha.r(this) == null) {
                rha.B(this, dv3.c());
            }
        }
        SharedPreferences sharedPreferences2 = uic.j;
        if (sharedPreferences2 == null) {
            Context applicationContext7 = getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences2 = a5f.d(applicationContext7);
                uic.j = sharedPreferences2;
            }
            sharedPreferences2.getClass();
        }
        if (!sharedPreferences2.getBoolean("PREF_NEW_NOTIFICATION_SETUP", false)) {
            hs4 hs4Var2 = z45.a;
            f5p.D(this, hq4.c, new i58(i7, rq3Var, i6));
        }
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences3 = uic.j;
        if (sharedPreferences3 == null) {
            Context applicationContext8 = getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences3 = a5f.d(applicationContext8);
                uic.j = sharedPreferences3;
            }
            sharedPreferences3.getClass();
        }
        int between = (int) ChronoUnit.DAYS.between(vxd.o(Instant.ofEpochMilli(sharedPreferences3.getLong("PREF_FIRST_RUN_TIMESTAMP", currentTimeMillis))), vxd.o(Instant.ofEpochMilli(currentTimeMillis)));
        if (between < 0 || between >= 7) {
            if (7 <= between && between < 14) {
                nv.s0(this, gv.WEEK_1);
            } else if (14 <= between && between < 21) {
                nv.s0(this, gv.WEEK_2);
            } else if (21 <= between && between < 28) {
                nv.s0(this, gv.WEEK_3);
            } else if (28 <= between && between < 35) {
                nv.s0(this, gv.WEEK_4);
            }
        }
        ktd A4 = mha.A(new ktd(StartWorker.class));
        mha.y(A4);
        Context applicationContext9 = getApplicationContext();
        applicationContext9.getClass();
        xbl d6 = xbl.d(applicationContext9);
        d6.getClass();
        d6.b("StartWorker-".concat(""), nf6.a, (ltd) A4.a());
        if (u()) {
            sha.q(this);
        }
        SharedPreferences.Editor edit9 = r().edit();
        edit9.getClass();
        edit9.putLong("last_startup_timestamp", System.currentTimeMillis());
        edit9.apply();
        SharedPreferences sharedPreferences4 = uic.j;
        if (sharedPreferences4 == null) {
            Context applicationContext10 = getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences4 = a5f.d(applicationContext10);
                uic.j = sharedPreferences4;
            }
            sharedPreferences4.getClass();
        }
        long j = sharedPreferences4.getLong("PREF_USAGE_STREAK_DAYS", 0L);
        SharedPreferences sharedPreferences5 = uic.j;
        if (sharedPreferences5 == null) {
            Context applicationContext11 = getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences5 = a5f.d(applicationContext11);
                uic.j = sharedPreferences5;
            }
            sharedPreferences5.getClass();
        }
        long j2 = sharedPreferences5.getLong("PREF_USAGE_STREAK_LAST_TIMESTAMP", 0L);
        if (j2 == 0 || ug5.w(j2)) {
            n9e.u(this, new prd(j, i5));
        } else if (!ug5.w(j2) && !ug5.u(j2)) {
            n9e.u(this, new rfi(i5));
        }
        lci s4 = s();
        iz2 z4 = un0.z(s4);
        hs4 hs4Var3 = z45.a;
        xw3.L(z4, hq4.c, null, new hje(s4, rq3Var, 10), 2);
        g6b lifecycle = getLifecycle();
        if (lifecycle.b().compareTo(e6b.e) >= 0) {
            t();
        } else {
            lifecycle.a(new o01(lifecycle, this, i7));
        }
    }

    public final yv6 q() {
        return (yv6) this.l.getValue();
    }

    public final SharedPreferences r() {
        SharedPreferences sharedPreferences = this.n;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.i("preferences");
        throw null;
    }

    public final lci s() {
        return (lci) this.m.getValue();
    }

    public final void t() {
        qa3 qa3Var;
        qa3 c;
        zzc zzcVar = s().j;
        p15 p15Var = new p15(new g2i(this, 10), 1);
        zzcVar.getClass();
        zzcVar.a.e(this, p15Var);
        if (getIntent().getAction() == null) {
            w();
            return;
        }
        String action = getIntent().getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -1986272351) {
                if (hashCode == -1173171990 && action.equals("android.intent.action.VIEW")) {
                    lci s = s();
                    Uri data = getIntent().getData();
                    if (data == null) {
                        return;
                    }
                    boolean z = dg0.a;
                    rq3 rq3Var = null;
                    if (CollectionsKt.R(eg0.a, data.getHost())) {
                        synchronized (dg0.f) {
                            try {
                                c = qx9.c();
                                bg0 bg0Var = dg0.h;
                                if (bg0Var != null) {
                                    if (SystemClock.elapsedRealtime() - dg0.i >= 5000) {
                                        bg0Var = null;
                                    }
                                    if (bg0Var != null) {
                                        c.V(bg0Var);
                                    }
                                }
                                dg0.h = null;
                                dg0.g = c;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        qa3Var = c;
                    } else {
                        qa3Var = null;
                    }
                    xw3.L(un0.z(s), null, null, new h4i(s, data, qa3Var, rq3Var, 8), 3);
                    return;
                }
            } else if (action.equals("notification_click_action")) {
                Intent intent = getIntent();
                intent.getClass();
                FirebaseBundle firebaseBundle = new FirebaseBundle();
                int intExtra = intent.getIntExtra("event_id", -1);
                if (intExtra != -1) {
                    firebaseBundle.putInt("id", intExtra);
                }
                String stringExtra = intent.getStringExtra("open");
                if (stringExtra != null) {
                    firebaseBundle.putString("type", stringExtra);
                }
                String F = nv.F(intent);
                if (F != null) {
                    firebaseBundle.putString(Payload.CAMPAIGN_ID, F);
                }
                String stringExtra2 = intent.getStringExtra("notification_type");
                if (stringExtra2 != null) {
                    firebaseBundle.putString("category", stringExtra2);
                }
                nv.N(this, firebaseBundle, "notification_click");
                mha.x(this, getIntent().getIntExtra("notification_id", 0));
                finish();
                v(false, getIntent().getExtras());
                return;
            }
        }
        w();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0798 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x07ca  */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r10v52 */
    /* JADX WARN: Type inference failed for: r10v53 */
    /* JADX WARN: Type inference failed for: r10v54 */
    /* JADX WARN: Type inference failed for: r10v55 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(boolean z, Bundle bundle) {
        Intent intent;
        boolean z2;
        Intent intent2;
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        Object obj;
        jmf jmfVar;
        Intent intent3;
        boolean z6;
        StartActivity startActivity;
        List split$default;
        boolean z7;
        boolean z8;
        Intent d;
        String str;
        String F;
        boolean z9;
        y4b y4bVar;
        Intent e;
        StartActivity startActivity2 = this;
        if (bundle == null) {
            return;
        }
        startActivity2.overridePendingTransition(R.anim.anim_fade_in_after_splash, R.anim.anim_fade_out_after_splash);
        ArrayList arrayList = new ArrayList();
        Intent intent4 = new Intent(startActivity2, (Class<?>) MainActivity.class);
        Bundle bundleExtra = startActivity2.getIntent().getBundleExtra("main_activity_bundle");
        if (bundleExtra != null) {
            intent4.putExtras(bundleExtra);
        }
        if (z) {
            arrayList.add(intent4);
        }
        String string = bundle.getString("open_action");
        if (string != null) {
            Intent intent5 = null;
            switch (string.hashCode()) {
                case -2061083735:
                    intent = intent4;
                    z2 = false;
                    if (string.equals("open_motorsport_category")) {
                        if (bundle.containsKey("category_id")) {
                            int i2 = StageCategoryActivity.R;
                            arrayList.add(yfa.o(bundle.getInt("category_id", 0), startActivity2));
                        }
                        Unit unit = Unit.a;
                        z4 = false;
                        intent2 = intent;
                        i = z4;
                        if (startActivity2.r().getBoolean("show_onboarding", true) && z) {
                            SharedPreferences.Editor edit = startActivity2.r().edit();
                            edit.getClass();
                            edit.putBoolean("show_onboarding", i);
                            edit.apply();
                            int i3 = OnboardingActivity.L;
                            Intent intent6 = new Intent(startActivity2, (Class<?>) OnboardingActivity.class);
                            intent6.putExtra("SkipMainActivityLaunch", true);
                            arrayList.add(intent6);
                        }
                        if (!z) {
                            ica icaVar = new ica(startActivity2);
                            icaVar.a(intent2);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((ArrayList) icaVar.b).add((Intent) it.next());
                            }
                            icaVar.c();
                            break;
                        } else {
                            startActivity2.startActivities((Intent[]) arrayList.toArray(new Intent[i]));
                            break;
                        }
                    }
                    break;
                case -1830319948:
                    intent = intent4;
                    if (string.equals("open_fight_night")) {
                        if (bundle.containsKey("mma_fight_night_id")) {
                            int i4 = MmaFightNightActivity.R;
                            z5 = false;
                            arrayList.add(x2a.A(startActivity2, bundle.getInt("mma_fight_night_id", 0), startActivity2.getIntent()));
                        } else {
                            z5 = false;
                        }
                        Unit unit2 = Unit.a;
                        z4 = z5;
                        intent2 = intent;
                        i = z4;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                            SharedPreferences.Editor edit2 = startActivity2.r().edit();
                            edit2.getClass();
                            edit2.putBoolean("show_onboarding", i);
                            edit2.apply();
                            int i32 = OnboardingActivity.L;
                            Intent intent62 = new Intent(startActivity2, (Class<?>) OnboardingActivity.class);
                            intent62.putExtra("SkipMainActivityLaunch", true);
                            arrayList.add(intent62);
                        }
                        if (!z) {
                        }
                    }
                    intent2 = intent;
                    z3 = false;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case -1828505262:
                    intent = intent4;
                    if (string.equals("open_rankings")) {
                        int i5 = bundle.getInt("rankings_id");
                        int i6 = RankingsActivity.O;
                        Iterator<E> it2 = amf.o.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj = it2.next();
                                if (((amf) obj).a == i5) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        amf amfVar = (amf) obj;
                        if (amfVar != null) {
                            switch (amfVar.ordinal()) {
                                case 0:
                                case 7:
                                    jmfVar = jmf.d;
                                    break;
                                case 1:
                                    jmfVar = jmf.f;
                                    break;
                                case 2:
                                    jmfVar = jmf.e;
                                    break;
                                case 3:
                                case 5:
                                    jmfVar = jmf.b;
                                    break;
                                case 4:
                                case 6:
                                    jmfVar = jmf.c;
                                    break;
                                case 8:
                                    jmfVar = jmf.g;
                                    break;
                                case 9:
                                    jmfVar = jmf.h;
                                    break;
                                default:
                                    zzl.b();
                                    break;
                            }
                            intent5 = jaa.C(startActivity2, jmfVar, null);
                        }
                        if (intent5 != null) {
                            arrayList.add(intent5);
                        }
                        intent2 = intent;
                        i = 0;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    intent2 = intent;
                    z3 = false;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case -1804201777:
                    intent3 = intent4;
                    z6 = false;
                    if (string.equals("EDITOR_SHOW_CUP_TREE")) {
                        a99 a99Var = LeagueActivity.h0;
                        Integer valueOf = Integer.valueOf(bundle.getInt("unique_tournament_id", 0));
                        int i7 = bundle.getInt("SEASON_ID", -1);
                        intent = intent3;
                        startActivity2 = this;
                        arrayList.add(a99.x(a99Var, startActivity2, valueOf, 0, i7 >= 0 ? Integer.valueOf(i7) : null, null, bundle.getBoolean("SCROLL_TO_KNOCKOUT", false) ? y4b.f : null, false, false, getIntent(), null, null, null, null, 7888));
                        intent2 = intent;
                        i = 0;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    } else {
                        startActivity2 = this;
                        intent2 = intent3;
                        z3 = z6;
                        intent2.putExtras(bundle);
                        i = z3;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    break;
                case -1540049360:
                    startActivity = startActivity2;
                    intent2 = intent4;
                    z7 = false;
                    if (string.equals("open_insights")) {
                        int i8 = bundle.getInt("event_id", 0);
                        String string2 = startActivity.r().getString("EVENT_ANALYSIS_VIEWED_IDS", null);
                        if (string2 == null || string2.length() == 0) {
                            SharedPreferences.Editor edit3 = startActivity.r().edit();
                            edit3.getClass();
                            edit3.putString("EVENT_ANALYSIS_VIEWED_IDS", String.valueOf(i8));
                            edit3.apply();
                        } else {
                            split$default = StringsKt__StringsKt.split$default(string2, new String[]{BlazeDataSourcePersonalizedType.STRING_SEPARATOR}, false, 0, 6, null);
                            ArrayList U0 = CollectionsKt.U0(split$default);
                            if (!U0.contains(String.valueOf(i8))) {
                                if (U0.size() > 20) {
                                    o13.C(U0);
                                }
                                U0.add(String.valueOf(i8));
                                SharedPreferences.Editor edit4 = startActivity.r().edit();
                                edit4.getClass();
                                edit4.putString("EVENT_ANALYSIS_VIEWED_IDS", CollectionsKt.f0(U0, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62));
                                edit4.apply();
                            }
                        }
                        intent3 = intent2;
                        startActivity2 = this;
                        arrayList.add(wxf.o(EventActivity.h0, startActivity2, bundle.getInt("event_id", 0), rd6.d, null, null, null, startActivity.getIntent(), false, 184));
                        z9 = false;
                        intent2 = intent3;
                        i = z9;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    startActivity2 = startActivity;
                    z3 = z7;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case -1232668651:
                    startActivity = startActivity2;
                    intent2 = intent4;
                    z7 = false;
                    if (string.equals("sofascore-season")) {
                        arrayList.add(new Intent(startActivity, (Class<?>) SofaSeasonActivity.class));
                        z8 = false;
                        startActivity2 = startActivity;
                        i = z8;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    startActivity2 = startActivity;
                    z3 = z7;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case -594812367:
                    startActivity = startActivity2;
                    intent2 = intent4;
                    z7 = false;
                    if (string.equals("open_fantasy")) {
                        intent2.putExtra("open_action", "select_fantasy_tab");
                        z8 = false;
                        startActivity2 = startActivity;
                        i = z8;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    startActivity2 = startActivity;
                    z3 = z7;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case -479528449:
                    startActivity = startActivity2;
                    intent2 = intent4;
                    z7 = false;
                    if (string.equals("historical_data")) {
                        int i9 = LeagueHistoricalDataActivity.Q;
                        int i10 = bundle.getInt("unique_tournament_id", 0);
                        Intent intent7 = new Intent(startActivity, (Class<?>) LeagueHistoricalDataActivity.class);
                        intent7.putExtra("uniqueTournamentId", i10);
                        intent7.putExtra("seasonId", (Serializable) null);
                        arrayList.add(intent7);
                        z8 = false;
                        startActivity2 = startActivity;
                        i = z8;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    startActivity2 = startActivity;
                    z3 = z7;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case -476534851:
                    startActivity = startActivity2;
                    intent2 = intent4;
                    z7 = false;
                    if (string.equals("open_driver")) {
                        if (bundle.containsKey("driver_id")) {
                            int i11 = StageDriverActivity.R;
                            int i12 = bundle.getInt("driver_id", 0);
                            Intent intent8 = startActivity.getIntent();
                            intent8.getClass();
                            arrayList.add(pff.e(startActivity, i12, (b5i) g7a.y(intent8, "preselected_tab", b5i.class), startActivity.getIntent()));
                        }
                        Unit unit3 = Unit.a;
                        z8 = false;
                        startActivity2 = startActivity;
                        i = z8;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    startActivity2 = startActivity;
                    z3 = z7;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case -372583480:
                    startActivity = startActivity2;
                    intent2 = intent4;
                    z7 = false;
                    if (string.equals("open_fighter")) {
                        if (bundle.containsKey("mma_fighter_id")) {
                            int i13 = MmaFighterActivity.U;
                            arrayList.add(f7a.s(startActivity, bundle.getInt("mma_fighter_id", 0), startActivity.getIntent()));
                        }
                        Unit unit4 = Unit.a;
                        z8 = false;
                        startActivity2 = startActivity;
                        i = z8;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    startActivity2 = startActivity;
                    z3 = z7;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case -335185968:
                    startActivity = startActivity2;
                    intent2 = intent4;
                    z7 = false;
                    if (string.equals("open_player_of_the_season")) {
                        int i14 = POTSActivity.O;
                        f3e f3eVar = (f3e) gz8.M(bundle, "preselected_tab", f3e.class);
                        Intent intent9 = new Intent(startActivity, (Class<?>) POTSActivity.class);
                        intent9.putExtra("InitialTab", f3eVar);
                        arrayList.add(intent9);
                        z8 = false;
                        startActivity2 = startActivity;
                        i = z8;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    startActivity2 = startActivity;
                    z3 = z7;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case -138761610:
                    intent2 = intent4;
                    z3 = false;
                    if (string.equals("open_player")) {
                        if (bundle.containsKey("player_id")) {
                            int i15 = PlayerActivity.Z;
                            d = jle.d(this, bundle.getInt("player_id", 0), (r15 & 4) != 0 ? 0 : 16, (r15 & 8) != 0 ? null : null, (zxe) gz8.M(bundle, "preselected_tab", zxe.class), false, null, (r15 & 128) != 0 ? null : startActivity2.getIntent(), null);
                            startActivity = this;
                            arrayList.add(d);
                        } else {
                            startActivity = startActivity2;
                        }
                        Unit unit5 = Unit.a;
                        z8 = false;
                        startActivity2 = startActivity;
                        i = z8;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case -59345603:
                    intent2 = intent4;
                    z3 = false;
                    if (string.equals("open_search")) {
                        arrayList.add(new Intent(startActivity2, (Class<?>) SearchActivity.class));
                        i = false;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case -44058897:
                    intent2 = intent4;
                    z3 = false;
                    if (string.equals("open_survey")) {
                        int i16 = bundle.getInt("event_id", 0);
                        if (!startActivity2.r().getBoolean("survey_" + i16, false)) {
                            SharedPreferences.Editor edit5 = startActivity2.r().edit();
                            edit5.getClass();
                            edit5.putBoolean("survey_" + i16, true);
                            edit5.apply();
                            Intent intent10 = startActivity2.getIntent();
                            FirebaseBundle firebaseBundle = new FirebaseBundle();
                            firebaseBundle.putString("action", "open");
                            if (intent10 != null && (F = nv.F(intent10)) != null) {
                                firebaseBundle.putString(Payload.CAMPAIGN_ID, F);
                            }
                            firebaseBundle.putInt("id", i16);
                            if (intent10 != null) {
                                str = nv.G(intent10).a;
                            } else {
                                hv hvVar = hv.APP;
                                str = "app";
                            }
                            firebaseBundle.putString("location", str);
                            nv.N(startActivity2, firebaseBundle, "survey");
                            int i17 = SurveyActivity.L;
                            Intent intent11 = new Intent(startActivity2, (Class<?>) SurveyActivity.class);
                            intent11.putExtra("SURVEY_ID", i16);
                            arrayList.add(intent11);
                        }
                        Unit unit6 = Unit.a;
                        i = false;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case -38530839:
                    intent3 = intent4;
                    z6 = false;
                    if (string.equals("open_fantasy_onboarding")) {
                        intent2 = intent3;
                        intent2.putExtra("open_action", "select_fantasy_tab");
                        int i18 = bundle.getInt("event_id", 0);
                        if (i18 != 0) {
                            int i19 = FantasyOnboardingActivity.M;
                            arrayList.add(uic.o(startActivity2, Integer.valueOf(i18), false, 12));
                        }
                        Unit unit7 = Unit.a;
                        i = false;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    intent2 = intent3;
                    z3 = z6;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case 42388294:
                    intent3 = intent4;
                    z6 = false;
                    if (string.equals("open_mma_organization")) {
                        if (bundle.containsKey("mma_organization_id")) {
                            int i20 = MmaOrganisationActivity.T;
                            arrayList.add(inb.x(startActivity2, bundle.getInt("mma_organization_id", 0), startActivity2.getIntent()));
                        }
                        Unit unit8 = Unit.a;
                        z9 = false;
                        intent2 = intent3;
                        i = z9;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    intent2 = intent3;
                    z3 = z6;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case 143803523:
                    intent3 = intent4;
                    z6 = false;
                    if (string.equals("open_preferences")) {
                        int i21 = SettingsActivity.L;
                        Intent intent12 = new Intent(startActivity2, (Class<?>) SettingsActivity.class);
                        intent12.putExtra("open", "openPreferences");
                        arrayList.add(intent12);
                        z9 = false;
                        intent2 = intent3;
                        i = z9;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    intent2 = intent3;
                    z3 = z6;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case 177499316:
                    intent3 = intent4;
                    z6 = false;
                    if (string.equals("open_profile")) {
                        int i22 = ProfileActivity.Q;
                        String string3 = bundle.getString("user_id");
                        Intent intent13 = new Intent(startActivity2, (Class<?>) ProfileActivity.class);
                        if (string3 == null) {
                            string3 = "";
                        }
                        intent13.putExtra("OPEN_PROFILE_ID", string3);
                        arrayList.add(intent13);
                        z9 = false;
                        intent2 = intent3;
                        i = z9;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    intent2 = intent3;
                    z3 = z6;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case 194688144:
                    intent3 = intent4;
                    z6 = false;
                    if (string.equals("open_crowdsourcing")) {
                        startActivity2.getIntent().putExtra("openCrowdsourcing", true);
                        arrayList.add(wxf.o(EventActivity.h0, startActivity2, bundle.getInt("event_id", 0), null, null, null, null, startActivity2.getIntent(), false, 188));
                        z9 = false;
                        intent2 = intent3;
                        i = z9;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    intent2 = intent3;
                    z3 = z6;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case 211444602:
                    intent3 = intent4;
                    z6 = false;
                    if (string.equals("open_weekly_challenge")) {
                        int i23 = WeeklyChallengeActivity.O;
                        arrayList.add(new Intent(startActivity2, (Class<?>) WeeklyChallengeActivity.class));
                        z9 = false;
                        intent2 = intent3;
                        i = z9;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    intent2 = intent3;
                    z3 = z6;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case 255753511:
                    intent3 = intent4;
                    z6 = false;
                    if (string.equals("open_upgrade")) {
                        arrayList.add(new Intent(startActivity2, (Class<?>) UpgradeSofascoreActivity.class));
                        z9 = false;
                        intent2 = intent3;
                        i = z9;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    intent2 = intent3;
                    z3 = z6;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case 684661044:
                    intent3 = intent4;
                    z6 = false;
                    if (string.equals("open_login")) {
                        if (!u()) {
                            int i24 = LoginScreenActivity.M;
                            Intent intent14 = startActivity2.getIntent();
                            Intent intent15 = new Intent(startActivity2, (Class<?>) LoginScreenActivity.class);
                            if (intent14 != null) {
                                intent15.putExtras(intent14);
                            }
                            intent15.addFlags(67108864);
                            arrayList.add(intent15);
                        }
                        Unit unit9 = Unit.a;
                        z9 = false;
                        intent2 = intent3;
                        i = z9;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    intent2 = intent3;
                    z3 = z6;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case 691268809:
                    intent3 = intent4;
                    z6 = false;
                    if (string.equals("open_stage")) {
                        fff fffVar = StageDetailsActivity.T;
                        int i25 = bundle.getInt("stage_id", 0);
                        Intent intent16 = startActivity2.getIntent();
                        intent16.getClass();
                        arrayList.add(fff.e(startActivity2, i25, (o4i) g7a.y(intent16, "preselected_tab", o4i.class), startActivity2.getIntent()));
                        z9 = false;
                        intent2 = intent3;
                        i = z9;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    intent2 = intent3;
                    z3 = z6;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case 693605434:
                    intent3 = intent4;
                    z6 = false;
                    if (string.equals("open_venue")) {
                        int i26 = VenueActivity.Q;
                        int i27 = bundle.getInt("venue_id");
                        Intent intent17 = new Intent(startActivity2, (Class<?>) VenueActivity.class);
                        intent17.putExtra("venue_id", i27);
                        arrayList.add(intent17);
                        z9 = false;
                        intent2 = intent3;
                        i = z9;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    intent2 = intent3;
                    z3 = z6;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case 741521436:
                    intent3 = intent4;
                    z6 = false;
                    if (string.equals("open_player_compare")) {
                        Intent intent18 = new Intent(startActivity2, (Class<?>) SeasonComparisonActivity.class);
                        intent18.putExtras(bundle);
                        arrayList.add(intent18);
                        z9 = false;
                        intent2 = intent3;
                        i = z9;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    intent2 = intent3;
                    z3 = z6;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case 860503429:
                    intent3 = intent4;
                    if (string.equals("open_constructor")) {
                        int i28 = StageConstructorActivity.R;
                        z9 = false;
                        int intExtra = startActivity2.getIntent().getIntExtra("constructor_id", 0);
                        Intent intent19 = startActivity2.getIntent();
                        intent19.getClass();
                        arrayList.add(dff.e(startActivity2, intExtra, (m2i) g7a.y(intent19, "preselected_tab", m2i.class), startActivity2.getIntent()));
                        intent2 = intent3;
                        i = z9;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    } else {
                        intent2 = intent3;
                        z3 = false;
                        intent2.putExtras(bundle);
                        i = z3;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    break;
                case 884119294:
                    if (string.equals("open_tournament")) {
                        int i29 = bundle.getInt("team_of_the_period_id", -1);
                        Integer valueOf2 = i29 >= 0 ? Integer.valueOf(i29) : null;
                        if (valueOf2 != null) {
                            y4bVar = y4b.c;
                        } else {
                            y4bVar = (y4b) gz8.M(bundle, "preselected_tab", y4b.class);
                            if (y4bVar == null) {
                                y4bVar = y4b.c;
                            }
                        }
                        arrayList.add(a99.x(LeagueActivity.h0, startActivity2, Integer.valueOf(bundle.getInt("unique_tournament_id", 0)), Integer.valueOf(bundle.getInt("unique_tournament_group_id", 0)), null, valueOf2, y4bVar, bundle.getBoolean("tournament_media", false), valueOf2 != null, startActivity2.getIntent(), (boj) gz8.M(bundle, "initial_top_stats_chip", boj.class), null, null, bundle.getString("unique_tournament_campaign"), 3080));
                        intent2 = intent4;
                        i = 0;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    intent2 = intent4;
                    z3 = false;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case 1224196173:
                    if (string.equals("open_betting_tips")) {
                        int i30 = BettingTipsActivity.Q;
                        arrayList.add(tol.w(startActivity2, null, null));
                        intent2 = intent4;
                        i = 0;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    intent2 = intent4;
                    z3 = false;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case 1322185400:
                    if (string.equals("open_manager")) {
                        int i31 = ManagerActivity.R;
                        int i33 = bundle.getInt("manager_id");
                        Intent intent20 = new Intent(startActivity2, (Class<?>) ManagerActivity.class);
                        intent20.putExtra("MANAGER_ID", i33);
                        arrayList.add(intent20);
                        intent2 = intent4;
                        i = 0;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    intent2 = intent4;
                    z3 = false;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case 1350504625:
                    if (string.equals("open_fantasy_competition")) {
                        intent4.putExtra("open_action", "select_fantasy_tab");
                        int i34 = bundle.getInt("event_id", 0);
                        boolean c = Intrinsics.c(gz8.M(bundle, "notification_type", String.class), NotificationType.FantasyRoundRevealAvailable.INSTANCE.getLabel());
                        if (u() && i34 != 0) {
                            int i35 = FantasyCompetitionActivity.R;
                            Intent intent21 = new Intent(startActivity2, (Class<?>) FantasyCompetitionActivity.class);
                            intent21.putExtra("competitionId", i34);
                            intent21.putExtra("START_FIXTURE_REVEAL", c);
                            intent21.putExtra("FANTASY_INITIAL_TAB", (Serializable) null);
                            arrayList.add(intent21);
                        }
                        Unit unit10 = Unit.a;
                        intent2 = intent4;
                        i = 0;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    intent2 = intent4;
                    z3 = false;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case 1489090782:
                    if (string.equals("open_contribution_tracker")) {
                        if (u()) {
                            int i36 = ProfileDetailsActivity.L;
                            Intent intent22 = new Intent(startActivity2, (Class<?>) ProfileDetailsActivity.class);
                            intent22.putExtra("screen_name", "contribution_performance");
                            intent22.putExtra("OPEN_PROFILE_ID", (String) null);
                            arrayList.add(intent22);
                        } else {
                            arrayList.add(wxf.o(EventActivity.h0, startActivity2, bundle.getInt("event_id", 0), null, null, null, null, startActivity2.getIntent(), false, 188));
                        }
                        intent2 = intent4;
                        i = 0;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    intent2 = intent4;
                    z3 = false;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case 1546271654:
                    if (string.equals("open_race")) {
                        if (bundle.containsKey("race_id")) {
                            fff fffVar2 = StageDetailsActivity.T;
                            arrayList.add(fff.e(startActivity2, bundle.getInt("race_id", 0), null, startActivity2.getIntent()));
                        }
                        Unit unit11 = Unit.a;
                        intent2 = intent4;
                        i = 0;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    intent2 = intent4;
                    z3 = false;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case 1546335026:
                    if (string.equals("open_team")) {
                        if (bundle.containsKey("team_id")) {
                            int i37 = TeamActivity.Z;
                            e = jle.e(startActivity2, bundle.getInt("team_id", 0), (r14 & 4) != 0 ? null : t4j.d, (r14 & 8) != 0 ? null : startActivity2.getIntent(), null, (r14 & 32) != 0 ? null : null, null);
                            arrayList.add(e);
                        }
                        Unit unit12 = Unit.a;
                        intent2 = intent4;
                        i = 0;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    intent2 = intent4;
                    z3 = false;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                case 2044646733:
                    if (string.equals("open_details")) {
                        arrayList.add(wxf.o(EventActivity.h0, startActivity2, bundle.getInt("event_id", 0), (rd6) gz8.M(bundle, "preselected_tab", rd6.class), Integer.valueOf(bundle.getInt("player_id", 0)), Integer.valueOf(bundle.getInt("player_team_side", 0)), null, startActivity2.getIntent(), bundle.getBoolean("player_of_the_match_voting", false), 32));
                        intent2 = intent4;
                        i = 0;
                        if (startActivity2.r().getBoolean("show_onboarding", true)) {
                        }
                        if (!z) {
                        }
                    }
                    intent2 = intent4;
                    z3 = false;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
                default:
                    intent2 = intent4;
                    z3 = false;
                    intent2.putExtras(bundle);
                    i = z3;
                    if (startActivity2.r().getBoolean("show_onboarding", true)) {
                    }
                    if (!z) {
                    }
                    break;
            }
            return;
        }
        intent = intent4;
        z2 = false;
        intent2 = intent;
        z3 = z2;
        intent2.putExtras(bundle);
        i = z3;
        if (startActivity2.r().getBoolean("show_onboarding", true)) {
        }
        if (!z) {
        }
    }

    public final void w() {
        Calendar calendar = ke0.a;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.getClass();
        ke0.a = calendar2;
        Set set = o84.a;
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        if (sharedPreferences.getBoolean("PREF_CURRENCY_FIRST_RUN", true)) {
            int i = ke0.c;
            String str = o84.b.contains(Integer.valueOf(i)) ? "DOLLAR" : o84.c.contains(Integer.valueOf(i)) ? "POUND" : "EURO";
            SharedPreferences sharedPreferences2 = uic.j;
            if (sharedPreferences2 == null) {
                Context applicationContext2 = getApplicationContext();
                synchronized (uic.i) {
                    sharedPreferences2 = a5f.d(applicationContext2);
                    uic.j = sharedPreferences2;
                }
                sharedPreferences2.getClass();
            }
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            edit.getClass();
            edit.putString("PREF_CURRENCY", str);
            Unit unit = Unit.a;
            edit.apply();
            SharedPreferences sharedPreferences3 = uic.j;
            if (sharedPreferences3 == null) {
                Context applicationContext3 = getApplicationContext();
                synchronized (uic.i) {
                    sharedPreferences3 = a5f.d(applicationContext3);
                    uic.j = sharedPreferences3;
                }
                sharedPreferences3.getClass();
            }
            wt3.v(sharedPreferences3, "PREF_CURRENCY_FIRST_RUN", false);
        }
        SharedPreferences sharedPreferences4 = uic.j;
        if (sharedPreferences4 == null) {
            Context applicationContext4 = getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences4 = a5f.d(applicationContext4);
                uic.j = sharedPreferences4;
            }
            sharedPreferences4.getClass();
        }
        if (sharedPreferences4.getBoolean("PREF_MEASUREMENT_UNITS_FIRST_RUN", true)) {
            int i2 = ke0.c;
            String str2 = (!zu3.a(i2) || zu3.k.hasMcc(Integer.valueOf(i2))) ? "METRIC" : "IMPERIAL";
            SharedPreferences sharedPreferences5 = uic.j;
            if (sharedPreferences5 == null) {
                Context applicationContext5 = getApplicationContext();
                synchronized (uic.i) {
                    sharedPreferences5 = a5f.d(applicationContext5);
                    uic.j = sharedPreferences5;
                }
                sharedPreferences5.getClass();
            }
            SharedPreferences.Editor edit2 = sharedPreferences5.edit();
            edit2.getClass();
            edit2.putString("PREF_MEASUREMENT_UNITS", str2);
            Unit unit2 = Unit.a;
            edit2.apply();
            v7a.G(this);
        }
        if (!r().getBoolean("PREF_UPDATE_ENGLISH_DIALECT", false)) {
            SharedPreferences.Editor edit3 = r().edit();
            edit3.getClass();
            edit3.putBoolean("PREF_UPDATE_ENGLISH_DIALECT", true);
            edit3.apply();
            String languageTag = Locale.getDefault().toLanguageTag();
            String c = kb0.b().c();
            c.getClass();
            int i3 = ke0.c;
            if (c.equals("")) {
                languageTag.getClass();
                if (c.v(languageTag, "en-US", false) && !zu3.a(i3)) {
                    fib a = fib.a("en-GB");
                    a.getClass();
                    dla.g(a);
                }
            }
        }
        if (r().getBoolean("show_onboarding", true)) {
            SharedPreferences.Editor edit4 = r().edit();
            edit4.getClass();
            edit4.putBoolean("show_onboarding", false);
            edit4.apply();
            int i4 = OnboardingActivity.L;
            Intent intent = new Intent(this, (Class<?>) OnboardingActivity.class);
            intent.addFlags(67108864);
            startActivity(intent);
        } else {
            boolean z = MainActivity.n0;
            f8h.z(this, null, 6);
        }
        overridePendingTransition(R.anim.anim_fade_in_after_splash, R.anim.anim_fade_out_after_splash);
        finish();
    }
}
