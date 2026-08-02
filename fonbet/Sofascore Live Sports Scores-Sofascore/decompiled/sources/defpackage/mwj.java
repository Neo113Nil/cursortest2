package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.blaze.blazesdk.features.videos.players.ui.VideosPlayerActivity;
import com.blaze.blazesdk.features.videos.players.ui.a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.media.Fk;
import com.inmobi.media.Uc;
import com.sofascore.model.Country;
import com.sofascore.model.database.DbUserWeeklyLeaderboard;
import com.sofascore.model.database.DbVote;
import com.sofascore.model.database.DbWatchedVideo;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.TvChannel;
import com.sofascore.model.mvvm.model.TvChannelVote;
import com.sofascore.model.mvvm.model.UniqueStageId;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.event.details.view.tv.dialog.TvChannelContributionDialog;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.main.MainActivity;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.venue.matches.VenueMatchesFragment;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeUserDailyBonusModal;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import com.sofascore.results.weeklyChallenge.leaderboard.WeeklyLeaderboardFragment;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class mwj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mwj(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02a8, code lost:
    
        if (r7 <= r5) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Integer intOrNull;
        Integer intOrNull2;
        Integer intOrNull3;
        SharedPreferences d;
        int i = 5;
        int i2 = 18;
        int i3 = 17;
        int i4 = 2;
        int i5 = 0;
        int i6 = 1;
        int i7 = 3;
        rq3 rq3Var = null;
        switch (this.a) {
            case 0:
                xw3.L((ku3) this.c, null, nu3.d, new pv2((axj) this.b, null), 1);
                return new o20(4);
            case 1:
                axj axjVar = (axj) this.b;
                vwj vwjVar = (vwj) this.c;
                axjVar.i.add(vwjVar);
                return new vx0(i2, axjVar, vwjVar);
            case 2:
                axj axjVar2 = (axj) this.b;
                axj axjVar3 = (axj) this.c;
                axjVar2.j.add(axjVar3);
                return new vx0(16, axjVar2, axjVar3);
            case 3:
                return new vx0(i3, (axj) this.b, (pwj) this.c);
            case 4:
                t01 t01Var = (t01) this.b;
                ((o0h) t01Var).a0(new a5f(new mwj(Thread.currentThread(), (ku3) this.c, null == true ? 1 : 0, i)));
                return new le(t01Var, i2);
            case 5:
                Object obj2 = this.b;
                ku3 ku3Var = (ku3) this.c;
                Function0 function0 = (Function0) obj;
                if (obj2 == Thread.currentThread()) {
                    function0.invoke();
                } else {
                    xw3.L(ku3Var, null, null, new nea(function0, rq3Var, i4), 3);
                }
                return Unit.a;
            case 6:
                Context context = (Context) this.c;
                c0k c0kVar = (c0k) this.b;
                mzj mzjVar = (mzj) obj;
                mzjVar.getClass();
                if (mzjVar instanceof kzj) {
                    wxf wxfVar = EventActivity.h0;
                    wxf.B(context, ((kzj) mzjVar).a, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                } else if (mzjVar instanceof jzj) {
                    jzj jzjVar = (jzj) mzjVar;
                    o0k o0kVar = jzjVar.a;
                    context.getClass();
                    nv.V(context, "trending_tile_click", o0kVar);
                    switch (rzj.a[jzjVar.b.ordinal()]) {
                        case 1:
                            break;
                        case 2:
                        case 3:
                            String str = jzjVar.c;
                            if (str != null) {
                                bea.G(context, str);
                                break;
                            }
                            break;
                        case 4:
                            String str2 = jzjVar.c;
                            if (str2 != null && (intOrNull = StringsKt.toIntOrNull(str2)) != null) {
                                a99.A(LeagueActivity.h0, context, Integer.valueOf(intOrNull.intValue()), 0, null, null, null, null, 4088);
                                break;
                            }
                            break;
                        case 5:
                            SharedPreferences sharedPreferences = uic.j;
                            if (sharedPreferences == null) {
                                Context applicationContext = context.getApplicationContext();
                                synchronized (uic.i) {
                                    sharedPreferences = a5f.d(applicationContext);
                                    uic.j = sharedPreferences;
                                }
                                sharedPreferences.getClass();
                            }
                            SharedPreferences.Editor i8 = dmi.i(sharedPreferences, "PREF_IS_IN_SUPPORTED_COUNTRY", true);
                            Unit unit = Unit.a;
                            i8.apply();
                            boolean z = MainActivity.n0;
                            f8h.z(context, fz8.C(fz8.H("open_action", "select_fantasy_tab")), 4);
                            break;
                        case 6:
                            String str3 = jzjVar.c;
                            if (str3 != null && (intOrNull2 = StringsKt.toIntOrNull(str3)) != null) {
                                int intValue = intOrNull2.intValue();
                                int i9 = PlayerActivity.Z;
                                jle.q(context, intValue, 0, null, zxe.d, false, null, null, 488);
                                break;
                            }
                            break;
                        case 7:
                            String str4 = jzjVar.c;
                            if (str4 != null && (intOrNull3 = StringsKt.toIntOrNull(str4)) != null) {
                                int intValue2 = intOrNull3.intValue();
                                wxf wxfVar2 = EventActivity.h0;
                                wxf.B(context, intValue2, rd6.d, null, null, null, 120);
                                break;
                            }
                            break;
                        default:
                            zzl.b();
                            return null;
                    }
                } else {
                    c0kVar.getClass();
                    if (mzjVar instanceof lzj) {
                        ynb.m(c0kVar, new r3(c0kVar, rq3Var, 26));
                    }
                }
                return Unit.a;
            case 7:
                TvChannelContributionDialog tvChannelContributionDialog = (TvChannelContributionDialog) this.c;
                View view = (View) this.b;
                List list = (List) obj;
                dd ddVar = tvChannelContributionDialog.C;
                if (ddVar == null) {
                    Intrinsics.i("dialogBinding");
                    throw null;
                }
                ((dk2) ddVar.c).b.setVisibility(8);
                dd ddVar2 = tvChannelContributionDialog.C;
                if (ddVar2 == null) {
                    Intrinsics.i("dialogBinding");
                    throw null;
                }
                ((RecyclerView) ddVar2.d).setVisibility(0);
                ViewParent parent = view.getParent();
                parent.getClass();
                BottomSheetBehavior.C((View) parent).M(3);
                f3k f3kVar = (f3k) tvChannelContributionDialog.G.getValue();
                list.getClass();
                f3kVar.F(list);
                return Unit.a;
            case 8:
                r3k r3kVar = (r3k) this.c;
                TvChannelVote tvChannelVote = (TvChannelVote) this.b;
                glg glgVar = (glg) obj;
                glgVar.getClass();
                r3kVar.b.a0(glgVar, tvChannelVote);
                return Unit.a;
            case 9:
                Country country = (Country) this.c;
                u3k u3kVar = (u3k) this.b;
                TvChannel tvChannel = (TvChannel) obj;
                tvChannel.setCountryCode(country.getIso2Alpha());
                tvChannel.setSelected(u3kVar.k.contains(tvChannel));
                return Unit.a;
            case 10:
                y3g y3gVar = (y3g) this.c;
                f6k f6kVar = (f6k) this.b;
                i6k i6kVar = (i6k) obj;
                synchronized (((ubf) y3gVar.b)) {
                    try {
                        boolean a = i6kVar.a();
                        zmb zmbVar = (zmb) y3gVar.c;
                        if (a) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Unit.a;
            case 11:
                return Uc.a((Uc) this.c, (AdMetaInfo) this.b, (InMobiNative) obj);
            case 12:
                return Uc.a((Uc) this.c, (Fk) this.b, (InMobiNative) obj);
            case 13:
                return Uc.a((Uc) this.c, (InMobiAdRequestStatus) this.b, (InMobiNative) obj);
            case 14:
                mak makVar = (mak) this.c;
                UniqueStageId uniqueStageId = (UniqueStageId) this.b;
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                return Long.valueOf(makVar.b.b0(glgVar2, uniqueStageId));
            case 15:
                mak makVar2 = (mak) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                glg glgVar3 = (glg) obj;
                glgVar3.getClass();
                return makVar2.b.d0(glgVar3, arrayList);
            case 16:
                a4l a4lVar = (a4l) this.c;
                WeeklyChallengeViewModel weeklyChallengeViewModel = (WeeklyChallengeViewModel) this.b;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                esa.d(esaVar, null, null, n4o.g, 3);
                ArrayList arrayList2 = a4lVar.a;
                esaVar.a(arrayList2.size(), null, new do6(arrayList2, 2), new tc3(802480018, new aj(i3, arrayList2, weeklyChallengeViewModel), true));
                return Unit.a;
            case 17:
                idk idkVar = (idk) this.c;
                Function1 function1 = (Function1) this.b;
                ((Long) obj).getClass();
                float f = idkVar.e;
                idkVar.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                function1.invoke(Float.valueOf(f));
                return Unit.a;
            case 18:
                ldk ldkVar = (ldk) this.c;
                de deVar = (de) this.b;
                qe0 qe0Var = (qe0) obj;
                int i10 = qe0Var.b;
                int i11 = 11;
                if (i10 == 2) {
                    int i12 = qe0Var.a;
                    yea yeaVar = j58.a;
                    e58 f2 = e58.f();
                    f2.getClass();
                    int d2 = (int) f2.d("force_update_to_version");
                    ComponentActivity componentActivity = ldkVar.a;
                    componentActivity.getClass();
                    SharedPreferences sharedPreferences2 = uic.j;
                    if (sharedPreferences2 == null) {
                        Context applicationContext2 = componentActivity.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext2);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences2 = d;
                    }
                    if (!sharedPreferences2.getBoolean("alpha_user", false)) {
                        if ((ldk.d(i12).getTimeInMillis() / 1000) - (ldk.d(260720003).getTimeInMillis() / 1000) <= 5184000) {
                            if (260720004 <= d2) {
                            }
                        }
                    }
                    ComponentActivity componentActivity2 = ldkVar.a;
                    int intValue3 = ((Number) n9e.x(componentActivity2, new kwi(i12, 10))).intValue();
                    long longValue = ((Number) n9e.x(componentActivity2, new kwi(i12, i11))).longValue();
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    if (intValue3 < 2 && currentTimeMillis - longValue > 86400) {
                        n9e.u(componentActivity2, new nu9(i12, intValue3, i4));
                        n9e.u(componentActivity2, new we7(i12, currentTimeMillis, 2));
                        ldkVar.c(qe0Var, deVar);
                    }
                } else if (i10 == 3) {
                    if (qe0Var.c == 11) {
                        ldkVar.b();
                    } else {
                        ldkVar.c(qe0Var, deVar);
                    }
                }
                return Unit.a;
            case 19:
                ghk ghkVar = (ghk) this.c;
                List list2 = (List) this.b;
                glg glgVar4 = (glg) obj;
                glgVar4.getClass();
                ghkVar.b.Z(glgVar4, list2);
                return Unit.a;
            case 20:
                VenueMatchesFragment venueMatchesFragment = (VenueMatchesFragment) this.c;
                joa joaVar = venueMatchesFragment.v;
                List list3 = (List) this.b;
                List list4 = (List) obj;
                list4.getClass();
                venueMatchesFragment.n();
                venueMatchesFragment.C().X(list4);
                if (venueMatchesFragment.u) {
                    venueMatchesFragment.u = false;
                    ((u6e) joaVar.getValue()).e = true;
                    ((u6e) joaVar.getValue()).f = true;
                    list3.getClass();
                    if (!list3.isEmpty()) {
                        krk krkVar = venueMatchesFragment.l;
                        krkVar.getClass();
                        RecyclerView recyclerView = ((oo8) krkVar).d;
                        long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                        Iterator it = list4.iterator();
                        int i13 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                y21 y21Var = next instanceof y21 ? (y21) next : null;
                                Event d3 = y21Var != null ? y21Var.d() : null;
                                if (!StatusKt.STATUS_FINISHED.equals(d3 != null ? d3.getStatusType() : null) || d3.getStartTimestamp() >= currentTimeMillis2) {
                                    i13++;
                                }
                            } else {
                                i13 = -1;
                            }
                        }
                        if (i13 > 4) {
                            i5 = i13 - 3;
                        } else if (i13 < 0) {
                            i5 = list4.size() - 1;
                        }
                        recyclerView.scrollToPosition(i5);
                    }
                }
                return Unit.a;
            case 21:
                VenueMatchesFragment venueMatchesFragment2 = (VenueMatchesFragment) this.c;
                s6e s6eVar = (s6e) this.b;
                List list5 = (List) obj;
                list5.getClass();
                kda.p(wca.x(venueMatchesFragment2.getLifecycle()), new knk(venueMatchesFragment2, list5, rq3Var, i6), new owa(s6eVar, 5));
                return Unit.a;
            case 22:
                erk erkVar = (erk) this.c;
                DbWatchedVideo dbWatchedVideo = (DbWatchedVideo) this.b;
                glg glgVar5 = (glg) obj;
                glgVar5.getClass();
                erkVar.b.a0(glgVar5, dbWatchedVideo);
                return Unit.a;
            case 23:
                VideosPlayerActivity videosPlayerActivity = (VideosPlayerActivity) this.c;
                Bundle bundle = (Bundle) this.b;
                VideosPlayerActivity.a aVar = VideosPlayerActivity.u;
                ((Context) obj).getClass();
                if (videosPlayerActivity.m == null) {
                    FrameLayout frameLayout = ((sim) videosPlayerActivity.p()).b;
                    frameLayout.getClass();
                    a r = videosPlayerActivity.r(bundle);
                    if (r != null) {
                        frameLayout.addView(r);
                    }
                }
                return ((sim) videosPlayerActivity.p()).b;
            case 24:
                zxk zxkVar = (zxk) this.c;
                List list6 = (List) this.b;
                glg glgVar6 = (glg) obj;
                glgVar6.getClass();
                zxkVar.c.J(glgVar6, list6);
                return Unit.a;
            case 25:
                zxk zxkVar2 = (zxk) this.c;
                DbVote dbVote = (DbVote) this.b;
                glg glgVar7 = (glg) obj;
                glgVar7.getClass();
                zxkVar2.b.a0(glgVar7, dbVote);
                return Unit.a;
            case 26:
                q2l q2lVar = (q2l) this.c;
                DbUserWeeklyLeaderboard dbUserWeeklyLeaderboard = (DbUserWeeklyLeaderboard) this.b;
                glg glgVar8 = (glg) obj;
                glgVar8.getClass();
                q2lVar.b.a0(glgVar8, dbUserWeeklyLeaderboard);
                return Unit.a;
            case 27:
                g3l g3lVar = (g3l) this.c;
                Context context2 = (Context) this.b;
                esa esaVar2 = (esa) obj;
                esaVar2.getClass();
                if (g3lVar.a != null) {
                    esa.d(esaVar2, null, null, new tc3(314874064, new e6i(i3, context2, g3lVar), true), 3);
                }
                if (g3lVar.b != null) {
                    esa.d(esaVar2, null, null, new tc3(-1280782612, new uri(g3lVar, i2), true), 3);
                }
                return Unit.a;
            case 28:
                WeeklyLeaderboardFragment weeklyLeaderboardFragment = (WeeklyLeaderboardFragment) this.c;
                ComposeView composeView = (ComposeView) this.b;
                Event event = (Event) obj;
                event.getClass();
                if (ok3.D(event)) {
                    wxf wxfVar3 = EventActivity.h0;
                    Context requireContext = weeklyLeaderboardFragment.requireContext();
                    requireContext.getClass();
                    wxf.B(requireContext, event.getId(), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                } else {
                    Context context3 = composeView.getContext();
                    context3.getClass();
                    WeeklyChallengeUserDailyBonusModal weeklyChallengeUserDailyBonusModal = new WeeklyChallengeUserDailyBonusModal();
                    weeklyChallengeUserDailyBonusModal.setArguments(fz8.C(fz8.G("DAILY_BONUS_EVENT", event)));
                    if (context3 instanceof csk) {
                        context3 = ((csk) context3).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity = context3 instanceof AppCompatActivity ? (AppCompatActivity) context3 : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(weeklyChallengeUserDailyBonusModal, appCompatActivity, rq3Var, i7));
                    }
                }
                return Unit.a;
            default:
                cal calVar = (cal) this.c;
                View view2 = (View) this.b;
                calVar.a(view2);
                return new vx0(19, calVar, view2);
        }
    }

    public /* synthetic */ mwj(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
