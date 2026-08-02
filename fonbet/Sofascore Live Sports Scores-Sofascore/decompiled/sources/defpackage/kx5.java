package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.database.VoteType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.FirstTeamToScoreVote;
import com.sofascore.model.network.response.Vote;
import com.sofascore.model.network.response.VotesResponseKt;
import com.sofascore.model.network.response.WillBothTeamsScoreVote;
import com.sofascore.model.newNetwork.FirstTeamToScoreOptions;
import com.sofascore.model.newNetwork.WhoWillWinOptions;
import com.sofascore.model.newNetwork.WillBothTeamsScoreOptions;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.event.details.EventDetailsFragment;
import com.sofascore.results.event.details.view.predictions.PredictionsLoginModal;
import com.sofascore.results.event.details.view.tv.dialog.TvChannelContributionDialog;
import com.sofascore.results.event.details.view.tv.model.TvChannelData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class kx5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventDetailsFragment b;

    public /* synthetic */ kx5(EventDetailsFragment eventDetailsFragment, int i) {
        this.a = i;
        this.b = eventDetailsFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x008a, code lost:
    
        if (defpackage.nwb.a(r3, r1.q, r1.j, r1.k) != null) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02a8  */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean, int] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        ?? r5;
        SharedPreferences d;
        Application application;
        w3f w3fVar;
        ArrayList arrayList;
        w3f w3fVar2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i = this.a;
        int i2 = 3;
        EventDetailsFragment eventDetailsFragment = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                w3f w3fVar3 = (w3f) obj2;
                str.getClass();
                w3fVar3.getClass();
                Context requireContext = eventDetailsFragment.requireContext();
                requireContext.getClass();
                n9e.x(requireContext, new b1f(11));
                rq3 rq3Var = null;
                if (w3fVar3.b == y3f.e) {
                    Context requireContext2 = eventDetailsFragment.requireContext();
                    requireContext2.getClass();
                    break;
                }
                Context requireContext3 = eventDetailsFragment.requireContext();
                requireContext3.getClass();
                ia0 ia0Var = ia0.q;
                if (ok3.p().e().getIsLoggedIn() ? false : ((Boolean) n9e.x(requireContext3, new b1f(10))).booleanValue()) {
                    FragmentActivity requireActivity = eventDetailsFragment.requireActivity();
                    requireActivity.getClass();
                    PredictionsLoginModal predictionsLoginModal = new PredictionsLoginModal();
                    AppCompatActivity appCompatActivity = requireActivity instanceof AppCompatActivity ? (AppCompatActivity) requireActivity : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(predictionsLoginModal, appCompatActivity, rq3Var, i2));
                    }
                }
                dz5 E = eventDetailsFragment.E();
                Event F = eventDetailsFragment.F();
                yzc yzcVar = E.f;
                Application application2 = E.b;
                List list = (List) E.g.d();
                if (list != null) {
                    Iterator it = list.iterator();
                    int i3 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            w3f w3fVar4 = (w3f) it.next();
                            w3fVar4.getClass();
                            if (w3fVar4.b != w3fVar3.b) {
                                i3++;
                            }
                        } else {
                            i3 = -1;
                        }
                    }
                    Integer valueOf = i3 == -1 ? null : Integer.valueOf(i3);
                    if (valueOf != null) {
                        int intValue = valueOf.intValue();
                        y3f y3fVar = w3fVar3.b;
                        String str2 = w3fVar3.g;
                        int ordinal = y3fVar.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                w3fVar2 = w3fVar3;
                                application = application2;
                                WillBothTeamsScoreVote willBothTeamsScoreVote = w3fVar2.f;
                                if (willBothTeamsScoreVote == null) {
                                    willBothTeamsScoreVote = new WillBothTeamsScoreVote(0, 0);
                                }
                                WillBothTeamsScoreVote willBothTeamsScoreVote2 = willBothTeamsScoreVote;
                                WillBothTeamsScoreOptions.Companion companion = WillBothTeamsScoreOptions.INSTANCE;
                                WillBothTeamsScoreOptions fromChoice = companion.getFromChoice(str2);
                                WillBothTeamsScoreOptions fromChoice2 = companion.getFromChoice(str);
                                if (fromChoice2 == null) {
                                    fromChoice2 = WillBothTeamsScoreOptions.YES;
                                }
                                WillBothTeamsScoreOptions willBothTeamsScoreOptions = fromChoice2;
                                if (str2 == null || fromChoice == null) {
                                    application.getClass();
                                    z1a.i(application, F.getId(), F.getStartTimestamp(), str, VoteType.WILL_BOTH_TEAMS_SCORE);
                                    VotesResponseKt.addVote(willBothTeamsScoreVote2, willBothTeamsScoreOptions);
                                } else {
                                    application.getClass();
                                    z1a.k(application, F.getId(), w3fVar2.g, str, VoteType.WILL_BOTH_TEAMS_SCORE);
                                    VotesResponseKt.changeVote(willBothTeamsScoreVote2, fromChoice, willBothTeamsScoreOptions);
                                }
                                List list2 = (List) yzcVar.d();
                                if (list2 != null) {
                                    w3f a = w3f.a(w3fVar2, null, null, willBothTeamsScoreVote2, str, false, null, false, 255903);
                                    w3fVar2 = w3fVar2;
                                    arrayList2 = yso.t(list2, intValue, a);
                                } else {
                                    arrayList2 = null;
                                }
                                yzcVar.j(arrayList2);
                            } else {
                                if (ordinal != 2) {
                                    zzl.b();
                                    return null;
                                }
                                FirstTeamToScoreVote firstTeamToScoreVote = w3fVar3.e;
                                if (firstTeamToScoreVote == null) {
                                    firstTeamToScoreVote = new FirstTeamToScoreVote(0, 0, 0);
                                }
                                FirstTeamToScoreVote firstTeamToScoreVote2 = firstTeamToScoreVote;
                                FirstTeamToScoreOptions.Companion companion2 = FirstTeamToScoreOptions.INSTANCE;
                                FirstTeamToScoreOptions fromChoice3 = companion2.getFromChoice(str2);
                                FirstTeamToScoreOptions fromChoice4 = companion2.getFromChoice(str);
                                if (fromChoice4 == null) {
                                    fromChoice4 = FirstTeamToScoreOptions.HOME_TEAM_SCORE_FIRST;
                                }
                                if (str2 == null || fromChoice3 == null) {
                                    application2.getClass();
                                    z1a.i(application2, F.getId(), F.getStartTimestamp(), str, VoteType.FIRST_TEAM_TO_SCORE);
                                    VotesResponseKt.addVote(firstTeamToScoreVote2, fromChoice4);
                                } else {
                                    application2.getClass();
                                    z1a.k(application2, F.getId(), w3fVar3.g, str, VoteType.FIRST_TEAM_TO_SCORE);
                                    VotesResponseKt.changeVote(firstTeamToScoreVote2, fromChoice3, fromChoice4);
                                }
                                List list3 = (List) yzcVar.d();
                                if (list3 != null) {
                                    application = application2;
                                    w3fVar2 = w3fVar3;
                                    arrayList3 = yso.t(list3, intValue, w3f.a(w3fVar3, null, firstTeamToScoreVote2, null, str, false, null, false, 255919));
                                } else {
                                    w3fVar2 = w3fVar3;
                                    application = application2;
                                    arrayList3 = null;
                                }
                                yzcVar.j(arrayList3);
                            }
                            w3fVar = w3fVar2;
                        } else {
                            application = application2;
                            Vote vote = w3fVar3.d;
                            if (vote == null) {
                                vote = new Vote(0, 0, 0);
                            }
                            Vote vote2 = vote;
                            WhoWillWinOptions.Companion companion3 = WhoWillWinOptions.INSTANCE;
                            WhoWillWinOptions fromChoice5 = companion3.getFromChoice(str2);
                            WhoWillWinOptions fromChoice6 = companion3.getFromChoice(str);
                            if (fromChoice6 == null) {
                                fromChoice6 = WhoWillWinOptions.HOME_TEAM_WIN;
                            }
                            WhoWillWinOptions whoWillWinOptions = fromChoice6;
                            if (str2 == null || fromChoice5 == null) {
                                application.getClass();
                                z1a.i(application, F.getId(), F.getStartTimestamp(), str, VoteType.WHO_WILL_WIN);
                                VotesResponseKt.addVote(vote2, whoWillWinOptions);
                            } else {
                                application.getClass();
                                z1a.k(application, F.getId(), w3fVar3.g, str, VoteType.WHO_WILL_WIN);
                                VotesResponseKt.changeVote(vote2, fromChoice5, whoWillWinOptions);
                            }
                            List list4 = (List) yzcVar.d();
                            if (list4 != null) {
                                w3fVar = w3fVar3;
                                arrayList = yso.t(list4, intValue, w3f.a(w3fVar, vote2, null, null, str, false, null, false, 255927));
                            } else {
                                w3fVar = w3fVar3;
                                arrayList = null;
                            }
                            yzcVar.j(arrayList);
                        }
                        application.getClass();
                        r5 = 1;
                        nv.C0(F.getId(), intValue + 1, lv.EVENT_DETAILS, application, w3fVar.b.b);
                        r4a.M(eventDetailsFragment.D().A);
                        eventDetailsFragment.s = false;
                        eventDetailsFragment.F = false;
                        if (eventDetailsFragment.requireActivity() instanceof BaseActivity) {
                            FragmentActivity requireActivity2 = eventDetailsFragment.requireActivity();
                            requireActivity2.getClass();
                            BaseActivity baseActivity = (BaseActivity) requireActivity2;
                            SharedPreferences sharedPreferences = uic.j;
                            if (sharedPreferences == null) {
                                Context applicationContext = baseActivity.getApplicationContext();
                                synchronized (uic.i) {
                                    sharedPreferences = a5f.d(applicationContext);
                                    uic.j = sharedPreferences;
                                }
                                sharedPreferences.getClass();
                            }
                            if (!sharedPreferences.getBoolean("PREF_PREDICTIONS_NOTIFICATION_PERMISSION", false)) {
                                p4h.t(baseActivity, false, new h01(baseActivity, 2), new k01(baseActivity, r5), 48);
                            } else if (eq3.b(baseActivity, "android.permission.POST_NOTIFICATIONS") == 0) {
                                SharedPreferences sharedPreferences2 = uic.j;
                                SharedPreferences sharedPreferences3 = sharedPreferences2;
                                if (sharedPreferences2 == null) {
                                    Context applicationContext2 = baseActivity.getApplicationContext();
                                    synchronized (uic.i) {
                                        d = a5f.d(applicationContext2);
                                        uic.j = d;
                                    }
                                    d.getClass();
                                    sharedPreferences3 = d;
                                }
                                if (sharedPreferences3.getBoolean("PREF_SHOW_PREDICTION_DIALOG", r5)) {
                                    if (zic.B(baseActivity)) {
                                        zic.E(baseActivity, new mn(baseActivity, 9));
                                    } else {
                                        zic.J(baseActivity);
                                    }
                                }
                            }
                        }
                        return Unit.a;
                    }
                }
                r5 = 1;
                r4a.M(eventDetailsFragment.D().A);
                eventDetailsFragment.s = false;
                eventDetailsFragment.F = false;
                if (eventDetailsFragment.requireActivity() instanceof BaseActivity) {
                }
                return Unit.a;
            default:
                String str3 = (String) obj;
                TvChannelData tvChannelData = (TvChannelData) obj2;
                str3.getClass();
                tvChannelData.getClass();
                String str4 = tvChannelData.d;
                str4.getClass();
                TvChannelContributionDialog tvChannelContributionDialog = new TvChannelContributionDialog();
                tvChannelContributionDialog.setArguments(fz8.C(fz8.H("ARG_COUNTRY_CODE", str3), fz8.H("ARG_TV_CHANNEL_NAME", str4)));
                tvChannelContributionDialog.H = new xw5(i2, eventDetailsFragment, tvChannelData);
                tvChannelContributionDialog.p(eventDetailsFragment.requireActivity().k(), tvChannelContributionDialog.getTag());
                return Unit.a;
        }
    }
}
