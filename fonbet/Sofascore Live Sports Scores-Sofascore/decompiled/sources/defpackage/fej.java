package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Parcelable;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.platform.ComposeView;
import androidx.work.impl.WorkDatabase;
import com.blaze.blazesdk.widgets.ui.WidgetItemCustomView;
import com.blaze.blazesdk.widgets.ui.WidgetTimeElementCustomView;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import com.sofascore.model.newNetwork.TrendingGridTile;
import com.sofascore.model.newNetwork.TrendingGridTileSize;
import com.sofascore.model.profile.ProfileData;
import com.sofascore.model.profile.UserBadge;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.event.details.view.tv.model.TvChannelData;
import com.sofascore.results.profile.ProfileActivity;
import com.sofascore.results.profile.UserProfileActivity;
import com.sofascore.results.profile.view.ProfileBadgesExplanationModal;
import com.sofascore.results.profile.view.UserBadgesGridView;
import com.sofascore.results.profile.view.WeeklyStreaksExplanationModal;
import com.sofascore.results.referral.ReferralActivity;
import com.sofascore.results.tv.TVScheduleActivity;
import com.sofascore.results.venue.summary.VenueSummaryFragment;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeUserDailyBonusModal;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import com.sofascore.results.weeklyChallenge.leaderboard.WeeklyLeaderboardFragment;
import com.sofascore.results.weeklyChallenge.predictions.WeeklyPredictionsActivity;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class fej implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fej(hej hejVar, p80 p80Var, p40 p40Var) {
        this.a = 0;
        this.b = p80Var;
        this.c = p40Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int O;
        int y;
        SharedPreferences d;
        nym binding_delegate$lambda$0;
        uvm binding_delegate$lambda$02;
        final boolean z;
        int i = 0;
        int i2 = 3;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        switch (this.a) {
            case 0:
                p80 p80Var = (p80) this.b;
                p40 p40Var = (p40) this.c;
                gbb gbbVar = (gbb) p80Var.a;
                if (gbbVar instanceof fbb) {
                    try {
                        String str = ((fbb) gbbVar).a;
                        p40Var.getClass();
                        try {
                            p40Var.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        } catch (ActivityNotFoundException e) {
                            throw new IllegalArgumentException(dmi.j('.', "Can't open ", str), e);
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
                return Unit.a;
            case 1:
                jwj jwjVar = (jwj) this.b;
                wxf wxfVar = (wxf) this.c;
                m9j c = jwjVar.a.c();
                j3h j3hVar = (j3h) ((eoh) jwjVar.e).getValue();
                e7a e7aVar = new e7a(2, false);
                StringBuilder sb = new StringBuilder();
                boolean z5 = false;
                while (i < c.c.length()) {
                    int codePointAt = Character.codePointAt(c, i);
                    wxfVar.getClass();
                    int i3 = codePointAt == 10 ? 32 : codePointAt == 13 ? 65279 : codePointAt;
                    int charCount = Character.charCount(codePointAt);
                    if (i3 != codePointAt) {
                        e7aVar.i(sb.length(), sb.length() + charCount, Character.charCount(i3));
                        z5 = true;
                    }
                    sb.appendCodePoint(i3);
                    i += charCount;
                    z5 = z5;
                }
                CharSequence sb2 = z5 ? sb.toString() : c;
                if (sb2 == c) {
                    return null;
                }
                long A = aba.A(c.d, e7aVar, j3hVar);
                pej pejVar = c.e;
                return new hwj(new m9j(sb2, A, pejVar != null ? new pej(aba.A(pejVar.a, e7aVar, j3hVar)) : null, null, null, null, 56), e7aVar);
            case 2:
                ((Function2) this.b).invoke(Integer.valueOf(((ryj) ((s8g) this.c).a).a), TrendingGridTileSize.LARGE);
                return Unit.a;
            case 3:
                Function1 function1 = (Function1) this.b;
                uyj uyjVar = ((s8g) this.c).a;
                syj syjVar = (syj) uyjVar;
                o0k N = bea.N(syjVar.a, syjVar.b);
                TrendingGridTile trendingGridTile = ((syj) uyjVar).b;
                function1.invoke(new jzj(N, trendingGridTile.getType(), trendingGridTile.getActionValue()));
                return Unit.a;
            case 4:
                yyj yyjVar = (yyj) this.b;
                Function1 function12 = (Function1) this.c;
                if (yyjVar instanceof wyj) {
                    wyj wyjVar = (wyj) yyjVar;
                    TrendingGridTile trendingGridTile2 = wyjVar.b;
                    function12.invoke(new jzj(bea.N(wyjVar.a, trendingGridTile2), trendingGridTile2.getType(), trendingGridTile2.getActionValue()));
                }
                return Unit.a;
            case 5:
                ((Function2) this.b).invoke(Integer.valueOf(((yyj) this.c).a()), TrendingGridTileSize.MEDIUM);
                return Unit.a;
            case 6:
                k3k k3kVar = (k3k) this.b;
                String str2 = (String) this.c;
                Function2 function2 = k3kVar.s;
                if (function2 != null) {
                    TvChannelData tvChannelData = k3kVar.m;
                    if (tvChannelData == null) {
                        Intrinsics.i("tvChannelData");
                        throw null;
                    }
                    function2.invoke(str2, tvChannelData);
                }
                return Unit.a;
            case 7:
                Context context = (Context) this.b;
                i3k i3kVar = (i3k) this.c;
                nv.z0(context, kv.IMPRESSION, "banner_channel_" + i3kVar.a, "event_details");
                return Unit.a;
            case 8:
                h4k h4kVar = (h4k) this.b;
                return new osi(h4kVar.k, h4kVar.j, new ow9(15, h4kVar, (TVScheduleActivity) this.c));
            case 9:
                ArrayList arrayList = (ArrayList) this.b;
                lek lekVar = (lek) this.c;
                String str3 = lekVar.f;
                if (arrayList.isEmpty() || (O = StringsKt.O(str3, '/', lekVar.h.a.length() + 3, 4)) == -1) {
                    return "";
                }
                y = StringsKt__StringsKt.y(str3, new char[]{'?', '#'}, O, false);
                return y == -1 ? str3.substring(O) : str3.substring(O, y);
            case 10:
                y8f y8fVar = (y8f) this.b;
                UserBadge userBadge = (UserBadge) this.c;
                int i4 = UserBadgesGridView.a;
                y8fVar.invoke(userBadge);
                return Unit.a;
            case 11:
                UserProfileActivity userProfileActivity = (UserProfileActivity) this.b;
                ProfileData profileData = (ProfileData) this.c;
                int i5 = UserProfileActivity.S;
                ProfileBadgesExplanationModal profileBadgesExplanationModal = new ProfileBadgesExplanationModal();
                profileBadgesExplanationModal.setArguments(fz8.C(fz8.G("PROFILE_DATA", profileData)));
                userProfileActivity.getClass();
                UserProfileActivity userProfileActivity2 = userProfileActivity instanceof AppCompatActivity ? userProfileActivity : null;
                if (userProfileActivity2 != null) {
                    wca.x(userProfileActivity2.getLifecycle()).b(new r1(profileBadgesExplanationModal, userProfileActivity2, z2 ? 1 : 0, i2));
                }
                return Unit.a;
            case 12:
                Context context2 = (Context) this.b;
                UserProfileActivity userProfileActivity3 = (UserProfileActivity) this.c;
                int i6 = UserProfileActivity.S;
                nv.m0(context2, "referral", "own_profile");
                de deVar = userProfileActivity3.Q;
                Intent intent = new Intent(context2, (Class<?>) ReferralActivity.class);
                intent.putExtra("extra_referral", (Parcelable) null);
                deVar.a(intent, null);
                return Unit.a;
            case 13:
                UserProfileActivity userProfileActivity4 = (UserProfileActivity) this.b;
                zsk zskVar = (zsk) this.c;
                userProfileActivity4.P = true;
                nv.z0(userProfileActivity4, kv.IMPRESSION, TeamOfTheWeekRoundsResponseKt.TOTW_SEASON, "user_profile");
                zskVar.a();
                return Unit.a;
            case 14:
                slf slfVar = (slf) this.b;
                Context context3 = (Context) this.c;
                if (slfVar.g) {
                    int i7 = WeeklyPredictionsActivity.O;
                    context3.getClass();
                    context3.startActivity(new Intent(context3, (Class<?>) WeeklyPredictionsActivity.class));
                } else {
                    nv.n0(context3, ev.WEEKLY_CHALLENGE);
                    int i8 = ProfileActivity.Q;
                    v8a.H(context3, slfVar.a, null);
                }
                return Unit.a;
            case 15:
                ((Function1) this.b).invoke(new kw7(((fnk) this.c).i.a));
                return Unit.a;
            case 16:
                VenueSummaryFragment venueSummaryFragment = (VenueSummaryFragment) this.b;
                Event event = (Event) this.c;
                wxf wxfVar2 = EventActivity.h0;
                Context requireContext = venueSummaryFragment.requireContext();
                requireContext.getClass();
                wxf.B(requireContext, event.getId(), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return Unit.a;
            case 17:
                Function1 function13 = (Function1) this.b;
                Activity activity = (Activity) this.c;
                function13.invoke(Boolean.FALSE);
                if (activity != null) {
                    activity.setRequestedOrientation(1);
                }
                return Unit.a;
            case 18:
                WeeklyChallengeUserDailyBonusModal weeklyChallengeUserDailyBonusModal = (WeeklyChallengeUserDailyBonusModal) this.b;
                Event event2 = (Event) this.c;
                Context requireContext2 = weeklyChallengeUserDailyBonusModal.requireContext();
                requireContext2.getClass();
                nv.R(event2.getId(), 1, lv.WEEKLY_CHALLENGE, requireContext2, "who_will_win_daily_10x");
                return Unit.a;
            case 19:
                ComposeView composeView = (ComposeView) this.b;
                WeeklyLeaderboardFragment weeklyLeaderboardFragment = (WeeklyLeaderboardFragment) this.c;
                Context context4 = composeView.getContext();
                context4.getClass();
                WeeklyStreaksExplanationModal weeklyStreaksExplanationModal = new WeeklyStreaksExplanationModal();
                if (context4 instanceof csk) {
                    context4 = ((csk) context4).getBaseContext();
                }
                AppCompatActivity appCompatActivity = context4 instanceof AppCompatActivity ? (AppCompatActivity) context4 : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(weeklyStreaksExplanationModal, appCompatActivity, z3 ? 1 : 0, i2));
                }
                LinearLayout linearLayout = (LinearLayout) weeklyLeaderboardFragment.u.getValue();
                if (linearLayout != null) {
                    Context context5 = composeView.getContext();
                    context5.getClass();
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = context5.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences = d;
                    }
                    SharedPreferences.Editor i9 = dmi.i(sharedPreferences, "PREF_SHOW_WEEKLY_STREAK_TOOLTIP", false);
                    Unit unit = Unit.a;
                    i9.apply();
                    linearLayout.setVisibility(8);
                }
                return Unit.a;
            case 20:
                Function0 function0 = (Function0) this.b;
                WeeklyChallengeViewModel weeklyChallengeViewModel = (WeeklyChallengeViewModel) this.c;
                function0.invoke();
                weeklyChallengeViewModel.getClass();
                xw3.L(un0.z(weeklyChallengeViewModel), null, null, new i3l(weeklyChallengeViewModel, z4 ? 1 : 0, i2), 3);
                return Unit.a;
            case 21:
                String str4 = (String) this.b;
                Function1 function14 = (Function1) this.c;
                if (str4 != null) {
                    function14.invoke(str4);
                }
                return Unit.a;
            case 22:
                binding_delegate$lambda$0 = WidgetItemCustomView.binding_delegate$lambda$0((Context) this.b, (WidgetItemCustomView) this.c);
                return binding_delegate$lambda$0;
            case 23:
                binding_delegate$lambda$02 = WidgetTimeElementCustomView.binding_delegate$lambda$0((Context) this.b, (WidgetTimeElementCustomView) this.c);
                return binding_delegate$lambda$02;
            case 24:
                ((k8l) ((e3c) this.b).b).b((vn8) this.c);
                return Unit.a;
            case 25:
                xbl xblVar = (xbl) this.b;
                yde ydeVar = (yde) this.c;
                qcl g = xblVar.c.g();
                List f = g.f("widget_periodic_refresh");
                if (f.size() > 1) {
                    a70.m("Can't apply UPDATE policy to the chains of work.");
                    return null;
                }
                jcl jclVar = (jcl) CollectionsKt.firstOrNull(f);
                if (jclVar == null) {
                    no5.a(new lbl(xblVar, "widget_periodic_refresh", nf6.b, a.c(ydeVar), 0));
                    Unit unit2 = Unit.a;
                    return Unit.a;
                }
                String str5 = jclVar.a;
                lcl e2 = g.e(str5);
                if (e2 == null) {
                    a70.r(lnb.o("WorkSpec with ", str5, ", that matches a name \"widget_periodic_refresh\", wasn't found"));
                    return null;
                }
                if (!e2.c()) {
                    a70.m("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                    return null;
                }
                if (jclVar.b == sbl.f) {
                    g.c(str5);
                    no5.a(new lbl(xblVar, "widget_periodic_refresh", nf6.b, a.c(ydeVar), 0));
                    Unit unit3 = Unit.a;
                    return Unit.a;
                }
                final lcl b = lcl.b(ydeVar.b, jclVar.a, null, null, 0, 0L, 0, 0, 0L, 0, 33554430);
                g8f g8fVar = xblVar.f;
                g8fVar.getClass();
                final WorkDatabase workDatabase = xblVar.c;
                workDatabase.getClass();
                ti3 ti3Var = xblVar.b;
                ti3Var.getClass();
                final List list = xblVar.e;
                list.getClass();
                final Set set = ydeVar.c;
                final String str6 = b.a;
                final lcl e3 = workDatabase.g().e(str6);
                if (e3 == null) {
                    a70.p(lnb.o("Worker with ", str6, " doesn't exist"));
                    return null;
                }
                if (e3.b.d()) {
                    vbl[] vblVarArr = vbl.a;
                } else {
                    if (e3.c() ^ b.c()) {
                        StringBuilder sb3 = new StringBuilder("Can't update ");
                        sb3.append(e3.c() ? "Periodic" : "OneTime");
                        sb3.append(" Worker to ");
                        throw new UnsupportedOperationException(mz1.o(sb3, b.c() ? "Periodic" : "OneTime", " Worker. Update operation must preserve worker's type."));
                    }
                    synchronized (g8fVar.k) {
                        z = g8fVar.c(str6) != null;
                    }
                    if (!z) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((hsg) it.next()).b(str6);
                        }
                    }
                    workDatabase.runInTransaction(new Runnable() { // from class: xcl
                        @Override // java.lang.Runnable
                        public final void run() {
                            WorkDatabase workDatabase2 = WorkDatabase.this;
                            qcl g2 = workDatabase2.g();
                            scl h = workDatabase2.h();
                            lcl lclVar = e3;
                            sbl sblVar = lclVar.b;
                            int i10 = lclVar.k;
                            long j = lclVar.n;
                            int i11 = 1;
                            int i12 = lclVar.t + 1;
                            int i13 = lclVar.s;
                            long j2 = lclVar.u;
                            int i14 = lclVar.v;
                            lcl lclVar2 = b;
                            lcl b2 = lcl.b(lclVar2, null, sblVar, null, i10, j, i13, i12, j2, i14, 29613053);
                            if (lclVar2.v == 1) {
                                b2.u = lclVar2.u;
                                b2.v++;
                            }
                            lcl S = xw3.S(list, b2);
                            g2.getClass();
                            gz8.S(g2.a, false, true, new ncl(g2, S, i11));
                            h.getClass();
                            String str7 = str6;
                            str7.getClass();
                            gz8.S(h.a, false, true, new cfi(str7, 21));
                            h.a(str7, set);
                            if (z) {
                                return;
                            }
                            g2.g(-1L, str7);
                            ecl f2 = workDatabase2.f();
                            f2.getClass();
                            gz8.S(f2.a, false, true, new cfi(str7, 9));
                        }
                    });
                    if (!z) {
                        ssg.b(ti3Var, workDatabase, list);
                    }
                    vbl[] vblVarArr2 = vbl.a;
                }
                return Unit.a;
            case 26:
                Context context6 = (Context) this.b;
                old oldVar = (old) this.c;
                nv.b0(context6, "Full time", oldVar.a.c, "featured", null, vmd.FEATURED_TOURNAMENT, "affiliate_button", oldVar.f);
                bea.G(context6, oldVar.g);
                return Unit.a;
            case 27:
                ((Function1) this.b).invoke(new ghl(((afl) this.c).a));
                return Unit.a;
            case 28:
                ((Function1) this.b).invoke(new mgl(((a6e) this.c).k()));
                return Unit.a;
            default:
                ((Function1) this.b).invoke(new qhl(((zil) this.c).a));
                return Unit.a;
        }
    }

    public /* synthetic */ fej(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
