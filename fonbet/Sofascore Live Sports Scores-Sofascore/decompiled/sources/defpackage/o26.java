package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.network.response.Duel;
import com.sofascore.model.network.response.EventManagersResponse;
import com.sofascore.model.network.response.GoalDistributionsResponse;
import com.sofascore.model.network.response.Head2HeadResponse;
import com.sofascore.model.network.response.Streak;
import com.sofascore.model.network.response.TeamStreaksResponse;
import com.sofascore.model.network.response.WinningOddsResponse;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.odds.FeaturedOddsView;
import com.sofascore.results.event.details.view.odds.GambleRegulationFooterView;
import com.sofascore.results.event.matches.EventMatchesFragment;
import com.sofascore.results.event.matches.view.WinningOddsView;
import com.sofascore.results.manager.ManagerActivity;
import com.sofascore.results.team.TeamActivity;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class o26 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventMatchesFragment b;

    public /* synthetic */ o26(EventMatchesFragment eventMatchesFragment, int i) {
        this.a = i;
        this.b = eventMatchesFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x03cc, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r4.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18"), "25_or_older") != false) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0281  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        WinningOddsResponse winningOddsResponse;
        SharedPreferences d;
        final sd5 sd5Var;
        Duel teamDuel;
        final sd5 sd5Var2;
        final int i;
        EventManagersResponse eventManagersResponse;
        int i2 = this.a;
        EventMatchesFragment eventMatchesFragment = this.b;
        switch (i2) {
            case 0:
                obj.getClass();
                eventMatchesFragment.I();
                return Unit.a;
            case 1:
                u26 u26Var = (u26) obj;
                kda.p(wca.x(eventMatchesFragment.getLifecycle()), new n50(eventMatchesFragment, u26Var, null, 3), new xw5(7, eventMatchesFragment, u26Var));
                return Unit.a;
            default:
                d36 d36Var = (d36) obj;
                final int i3 = 0;
                kda.p(wca.x(eventMatchesFragment.getLifecycle()), new n50(eventMatchesFragment, d36Var, null, 4), new o26(eventMatchesFragment, i3));
                TeamStreaksResponse teamStreaksResponse = d36Var.a;
                final int i4 = 1;
                if (teamStreaksResponse != null) {
                    List<Streak> generalPerLastX = teamStreaksResponse.getGeneralPerLastX();
                    List<Streak> generalTotal = teamStreaksResponse.getGeneralTotal();
                    if (generalTotal == null && ((generalTotal = teamStreaksResponse.getGeneral()) == null || (generalPerLastX != null && !generalPerLastX.isEmpty()))) {
                        generalTotal = null;
                    }
                    if (generalTotal != null || generalPerLastX != null) {
                        if (!eventMatchesFragment.D) {
                            r10.p(eventMatchesFragment.E().g.size(), (hgi) eventMatchesFragment.F.getValue());
                        }
                        ((hgi) eventMatchesFragment.F.getValue()).l(ok3.s(eventMatchesFragment.F()), generalTotal, generalPerLastX, true);
                    }
                    List<Streak> head2HeadPerLastX = teamStreaksResponse.getHead2HeadPerLastX();
                    List<Streak> head2HeadTotal = teamStreaksResponse.getHead2HeadTotal();
                    if (head2HeadTotal == null && ((head2HeadTotal = teamStreaksResponse.getHead2head()) == null || (head2HeadPerLastX != null && !head2HeadPerLastX.isEmpty()))) {
                        head2HeadTotal = null;
                    }
                    if (head2HeadTotal != null || head2HeadPerLastX != null) {
                        if (!eventMatchesFragment.D) {
                            r5.p(eventMatchesFragment.E().g.size(), (hgi) eventMatchesFragment.G.getValue());
                        }
                        ((hgi) eventMatchesFragment.G.getValue()).l(ok3.s(eventMatchesFragment.F()), head2HeadTotal, head2HeadPerLastX, false);
                    }
                }
                if (!eventMatchesFragment.D) {
                    r5.p(eventMatchesFragment.E().g.size(), (q09) eventMatchesFragment.H.getValue());
                }
                q09 q09Var = (q09) eventMatchesFragment.H.getValue();
                GoalDistributionsResponse goalDistributionsResponse = d36Var.e;
                GoalDistributionsResponse goalDistributionsResponse2 = d36Var.f;
                q09Var.getClass();
                if (goalDistributionsResponse != null && goalDistributionsResponse2 != null) {
                    q09Var.setVisibility(0);
                    q09Var.x = goalDistributionsResponse;
                    q09Var.y = goalDistributionsResponse2;
                    q09Var.l(q09Var.w);
                }
                Head2HeadResponse head2HeadResponse = d36Var.b;
                if (head2HeadResponse != null) {
                    Duel managerDuel = head2HeadResponse.getManagerDuel();
                    if (managerDuel != null) {
                        if (managerDuel.getDraws() + Duel.getAwayWins$default(managerDuel, null, 1, null) + Duel.getHomeWins$default(managerDuel, null, 1, null) > 0 && (eventManagersResponse = d36Var.c) != null) {
                            Manager homeManager$default = EventManagersResponse.getHomeManager$default(eventManagersResponse, null, 1, null);
                            Manager awayManager$default = EventManagersResponse.getAwayManager$default(eventManagersResponse, null, 1, null);
                            if (homeManager$default != null && awayManager$default != null) {
                                sd5Var = new sd5(Duel.getHomeWins$default(managerDuel, null, 1, null), Duel.getAwayWins$default(managerDuel, null, 1, null), managerDuel.getDraws(), new pd5(homeManager$default.getId(), tba.s(homeManager$default), false), new pd5(awayManager$default.getId(), tba.s(awayManager$default), false), eventMatchesFragment.F().getTournament());
                                teamDuel = head2HeadResponse.getTeamDuel();
                                if (teamDuel != null) {
                                    if (teamDuel.getDraws() + Duel.getAwayWins$default(teamDuel, null, 1, null) + Duel.getHomeWins$default(teamDuel, null, 1, null) > 0) {
                                        Team homeTeam$default = Event.getHomeTeam$default(eventMatchesFragment.F(), null, 1, null);
                                        Team awayTeam$default = Event.getAwayTeam$default(eventMatchesFragment.F(), null, 1, null);
                                        int homeWins$default = Duel.getHomeWins$default(teamDuel, null, 1, null);
                                        int awayWins$default = Duel.getAwayWins$default(teamDuel, null, 1, null);
                                        int draws = teamDuel.getDraws();
                                        int id = homeTeam$default.getId();
                                        Context requireContext = eventMatchesFragment.requireContext();
                                        requireContext.getClass();
                                        String A = tba.A(requireContext, homeTeam$default);
                                        if (A == null) {
                                            A = "";
                                        }
                                        pd5 pd5Var = new pd5(id, A, homeTeam$default.getDisabled());
                                        int id2 = awayTeam$default.getId();
                                        Context requireContext2 = eventMatchesFragment.requireContext();
                                        requireContext2.getClass();
                                        String A2 = tba.A(requireContext2, awayTeam$default);
                                        sd5Var2 = new sd5(homeWins$default, awayWins$default, draws, pd5Var, new pd5(id2, A2 != null ? A2 : "", awayTeam$default.getDisabled()), eventMatchesFragment.F().getTournament());
                                        if (sd5Var == null || sd5Var2 != null) {
                                            if (!eventMatchesFragment.D) {
                                                r2.p(eventMatchesFragment.E().g.size(), (rd5) eventMatchesFragment.I.getValue());
                                            }
                                            final rd5 rd5Var = (rd5) eventMatchesFragment.I.getValue();
                                            z82 z82Var = rd5Var.d;
                                            if (sd5Var != null) {
                                                int i5 = sd5Var.c;
                                                pd5 pd5Var2 = sd5Var.e;
                                                pd5 pd5Var3 = sd5Var.d;
                                                rd5Var.setVisibility(0);
                                                TextView textView = (TextView) z82Var.e;
                                                u79 u79Var = (u79) z82Var.f;
                                                textView.setText(rd5Var.getContext().getString(R.string.manager_h2h));
                                                as9.g(u79Var.e, pd5Var3.a);
                                                as9.g(u79Var.f, pd5Var2.a);
                                                if (!pd5Var3.c) {
                                                    aba.y(u79Var.c, 0, 3);
                                                    u79Var.c.setOnClickListener(new View.OnClickListener() { // from class: qd5
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            int i6 = i3;
                                                            sd5 sd5Var3 = sd5Var;
                                                            rd5 rd5Var2 = rd5Var;
                                                            switch (i6) {
                                                                case 0:
                                                                    int i7 = ManagerActivity.R;
                                                                    Context context = rd5Var2.getContext();
                                                                    context.getClass();
                                                                    bea.M(sd5Var3.d.a, context);
                                                                    break;
                                                                case 1:
                                                                    int i8 = ManagerActivity.R;
                                                                    Context context2 = rd5Var2.getContext();
                                                                    context2.getClass();
                                                                    bea.M(sd5Var3.e.a, context2);
                                                                    break;
                                                                case 2:
                                                                    int i9 = TeamActivity.Z;
                                                                    Context context3 = rd5Var2.getContext();
                                                                    context3.getClass();
                                                                    jle.r(context3, sd5Var3.d.a, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                                                    break;
                                                                default:
                                                                    int i10 = TeamActivity.Z;
                                                                    Context context4 = rd5Var2.getContext();
                                                                    context4.getClass();
                                                                    jle.r(context4, sd5Var3.e.a, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                }
                                                if (!pd5Var2.c) {
                                                    aba.y(u79Var.d, 0, 3);
                                                    u79Var.d.setOnClickListener(new View.OnClickListener() { // from class: qd5
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            int i6 = i4;
                                                            sd5 sd5Var3 = sd5Var;
                                                            rd5 rd5Var2 = rd5Var;
                                                            switch (i6) {
                                                                case 0:
                                                                    int i7 = ManagerActivity.R;
                                                                    Context context = rd5Var2.getContext();
                                                                    context.getClass();
                                                                    bea.M(sd5Var3.d.a, context);
                                                                    break;
                                                                case 1:
                                                                    int i8 = ManagerActivity.R;
                                                                    Context context2 = rd5Var2.getContext();
                                                                    context2.getClass();
                                                                    bea.M(sd5Var3.e.a, context2);
                                                                    break;
                                                                case 2:
                                                                    int i9 = TeamActivity.Z;
                                                                    Context context3 = rd5Var2.getContext();
                                                                    context3.getClass();
                                                                    jle.r(context3, sd5Var3.d.a, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                                                    break;
                                                                default:
                                                                    int i10 = TeamActivity.Z;
                                                                    Context context4 = rd5Var2.getContext();
                                                                    context4.getClass();
                                                                    jle.r(context4, sd5Var3.e.a, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                }
                                                u79Var.g.setText(pd5Var3.b);
                                                u79Var.h.setText(pd5Var2.b);
                                                u79Var.i.setText(String.valueOf(sd5Var.a));
                                                u79Var.j.setText(String.valueOf(sd5Var.b));
                                                Set set = wyh.a;
                                                if (wyh.j(sd5Var.f) && i5 == 0) {
                                                    u79Var.k.setVisibility(8);
                                                } else {
                                                    u79Var.k.setVisibility(0);
                                                    u79Var.k.setText(String.valueOf(i5));
                                                }
                                            } else {
                                                ((TextView) z82Var.e).setVisibility(8);
                                                ((u79) z82Var.f).b.setVisibility(8);
                                            }
                                            if (sd5Var2 != null) {
                                                Tournament tournament = sd5Var2.f;
                                                int i6 = sd5Var2.b;
                                                int i7 = sd5Var2.a;
                                                pd5 pd5Var4 = sd5Var2.e;
                                                pd5 pd5Var5 = sd5Var2.d;
                                                int i8 = sd5Var2.c;
                                                rd5Var.setVisibility(0);
                                                TextView textView2 = (TextView) z82Var.g;
                                                u79 u79Var2 = (u79) z82Var.c;
                                                textView2.setText(rd5Var.getContext().getString(R.string.team_head_to_head));
                                                TextView textView3 = (TextView) z82Var.d;
                                                mqi mqiVar = qhi.a;
                                                Context context = rd5Var.getContext();
                                                context.getClass();
                                                textView3.setText(qhi.b(context, i7 + i8 + i6, tournament.getCategory().getSport().getSlug()));
                                                as9.o(u79Var2.e, pd5Var5.a);
                                                as9.o(u79Var2.f, pd5Var4.a);
                                                if (pd5Var5.c) {
                                                    i = 3;
                                                } else {
                                                    i = 3;
                                                    aba.y(u79Var2.c, 0, 3);
                                                    final int i9 = 2;
                                                    u79Var2.c.setOnClickListener(new View.OnClickListener() { // from class: qd5
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            int i62 = i9;
                                                            sd5 sd5Var3 = sd5Var2;
                                                            rd5 rd5Var2 = rd5Var;
                                                            switch (i62) {
                                                                case 0:
                                                                    int i72 = ManagerActivity.R;
                                                                    Context context2 = rd5Var2.getContext();
                                                                    context2.getClass();
                                                                    bea.M(sd5Var3.d.a, context2);
                                                                    break;
                                                                case 1:
                                                                    int i82 = ManagerActivity.R;
                                                                    Context context22 = rd5Var2.getContext();
                                                                    context22.getClass();
                                                                    bea.M(sd5Var3.e.a, context22);
                                                                    break;
                                                                case 2:
                                                                    int i92 = TeamActivity.Z;
                                                                    Context context3 = rd5Var2.getContext();
                                                                    context3.getClass();
                                                                    jle.r(context3, sd5Var3.d.a, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                                                    break;
                                                                default:
                                                                    int i10 = TeamActivity.Z;
                                                                    Context context4 = rd5Var2.getContext();
                                                                    context4.getClass();
                                                                    jle.r(context4, sd5Var3.e.a, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                }
                                                if (!pd5Var4.c) {
                                                    aba.y(u79Var2.d, 0, i);
                                                    u79Var2.d.setOnClickListener(new View.OnClickListener() { // from class: qd5
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            int i62 = i;
                                                            sd5 sd5Var3 = sd5Var2;
                                                            rd5 rd5Var2 = rd5Var;
                                                            switch (i62) {
                                                                case 0:
                                                                    int i72 = ManagerActivity.R;
                                                                    Context context2 = rd5Var2.getContext();
                                                                    context2.getClass();
                                                                    bea.M(sd5Var3.d.a, context2);
                                                                    break;
                                                                case 1:
                                                                    int i82 = ManagerActivity.R;
                                                                    Context context22 = rd5Var2.getContext();
                                                                    context22.getClass();
                                                                    bea.M(sd5Var3.e.a, context22);
                                                                    break;
                                                                case 2:
                                                                    int i92 = TeamActivity.Z;
                                                                    Context context3 = rd5Var2.getContext();
                                                                    context3.getClass();
                                                                    jle.r(context3, sd5Var3.d.a, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                                                    break;
                                                                default:
                                                                    int i10 = TeamActivity.Z;
                                                                    Context context4 = rd5Var2.getContext();
                                                                    context4.getClass();
                                                                    jle.r(context4, sd5Var3.e.a, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                }
                                                u79Var2.g.setText(pd5Var5.b);
                                                u79Var2.h.setText(pd5Var4.b);
                                                u79Var2.i.setText(String.valueOf(i7));
                                                u79Var2.j.setText(String.valueOf(i6));
                                                if (wyh.j(tournament) && i8 == 0) {
                                                    u79Var2.k.setVisibility(8);
                                                } else {
                                                    u79Var2.k.setVisibility(0);
                                                    u79Var2.k.setText(String.valueOf(i8));
                                                }
                                            } else {
                                                ((TextView) z82Var.g).setVisibility(8);
                                                ((TextView) z82Var.d).setVisibility(8);
                                                ((u79) z82Var.c).b.setVisibility(8);
                                            }
                                        }
                                    }
                                }
                                sd5Var2 = null;
                                if (sd5Var == null) {
                                }
                                if (!eventMatchesFragment.D) {
                                }
                                final rd5 rd5Var2 = (rd5) eventMatchesFragment.I.getValue();
                                z82 z82Var2 = rd5Var2.d;
                                if (sd5Var != null) {
                                }
                                if (sd5Var2 != null) {
                                }
                            }
                        }
                    }
                    sd5Var = null;
                    teamDuel = head2HeadResponse.getTeamDuel();
                    if (teamDuel != null) {
                    }
                    sd5Var2 = null;
                    if (sd5Var == null) {
                    }
                    if (!eventMatchesFragment.D) {
                    }
                    final rd5 rd5Var22 = (rd5) eventMatchesFragment.I.getValue();
                    z82 z82Var22 = rd5Var22.d;
                    if (sd5Var != null) {
                    }
                    if (sd5Var2 != null) {
                    }
                }
                WinningOddsView winningOddsView = (WinningOddsView) eventMatchesFragment.J.getValue();
                if (winningOddsView != null && (winningOddsResponse = d36Var.d) != null && (WinningOddsResponse.getHome$default(winningOddsResponse, null, 1, null) != null || WinningOddsResponse.getAway$default(winningOddsResponse, null, 1, null) != null)) {
                    if (!eventMatchesFragment.D) {
                        Context requireContext3 = eventMatchesFragment.requireContext();
                        requireContext3.getClass();
                        if (zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
                            SharedPreferences sharedPreferences = uic.j;
                            if (sharedPreferences == null) {
                                Context applicationContext = requireContext3.getApplicationContext();
                                synchronized (uic.i) {
                                    d = a5f.d(applicationContext);
                                    uic.j = d;
                                }
                                d.getClass();
                                sharedPreferences = d;
                            }
                            ccd ccdVar = vl.b;
                            break;
                        }
                        r3.p(eventMatchesFragment.E().g.size(), winningOddsView);
                    }
                    Event F = eventMatchesFragment.F();
                    if (((LinearLayout) winningOddsView.d.d).getChildCount() == 0) {
                        winningOddsView.j(winningOddsResponse, F, false, false);
                    }
                    xmd oddsState = ((FeaturedOddsView) ((hgi) eventMatchesFragment.F.getValue()).g.c).getOddsState();
                    gv9 gv9Var = oddsState != null ? oddsState.a : null;
                    if (gv9Var == null || gv9Var.isEmpty()) {
                        xmd oddsState2 = ((FeaturedOddsView) ((hgi) eventMatchesFragment.G.getValue()).g.c).getOddsState();
                        gv9 gv9Var2 = oddsState2 != null ? oddsState2.a : null;
                        if (gv9Var2 == null || gv9Var2.isEmpty()) {
                            EventMatchesFragment.G(eventMatchesFragment, false, 1);
                        }
                    }
                }
                if (!eventMatchesFragment.D) {
                    r1.p(eventMatchesFragment.E().g.size(), (t79) eventMatchesFragment.K.getValue());
                    g7.o(eventMatchesFragment.E(), (GambleRegulationFooterView) eventMatchesFragment.L.getValue(), 6);
                    eventMatchesFragment.D = true;
                }
                return Unit.a;
        }
    }
}
