package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.FootballPlayerHighlightedStatistics;
import com.sofascore.model.newNetwork.FootballTeamHighlightedStatistics;
import com.sofascore.model.newNetwork.PlayerTeam;
import com.sofascore.model.newNetwork.SeasonHighlightedComparison;
import com.sofascore.results.R;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.player.statistics.compare.SeasonComparisonActivity;
import com.sofascore.results.team.TeamActivity;
import com.sofascore.results.view.SofascoreRatingView;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mb9 extends p8 {
    public final xk8 c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mb9(xk8 xk8Var) {
        super(r0);
        FrameLayout frameLayout = (FrameLayout) xk8Var.g;
        frameLayout.getClass();
        this.c = xk8Var;
        this.d = ao2.s(24, this.b);
        this.e = this.b.getColor(R.color.secondary_default);
        this.f = this.b.getColor(R.color.primary_default);
    }

    public static void e(e92 e92Var, Double d, Double d2) {
        ConstraintLayout constraintLayout = (ConstraintLayout) e92Var.e;
        if (d == null || d2 == null) {
            constraintLayout.setVisibility(8);
            return;
        }
        constraintLayout.setVisibility(0);
        joa joaVar = iyg.a;
        SofascoreRatingView sofascoreRatingView = (SofascoreRatingView) e92Var.d;
        double doubleValue = d.doubleValue();
        sofascoreRatingView.m(doubleValue, doubleValue > 0.0d);
        SofascoreRatingView sofascoreRatingView2 = (SofascoreRatingView) e92Var.c;
        double doubleValue2 = d2.doubleValue();
        sofascoreRatingView2.m(doubleValue2, doubleValue2 > 0.0d);
        jtd.a(constraintLayout, new vlo(21, constraintLayout, e92Var));
        Context context = constraintLayout.getContext();
        context.getClass();
        int s = ao2.s(36, context);
        Context context2 = constraintLayout.getContext();
        context2.getClass();
        int s2 = ao2.s(4, context2);
        Context context3 = constraintLayout.getContext();
        context3.getClass();
        ao2.s(8, context3);
        constraintLayout.setMinHeight(s);
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), s2);
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        TextView textView;
        String str;
        TextView textView2;
        String str2;
        Integer bigChancesMissed;
        Integer bigChancesMissed2;
        Integer goalsConceded;
        Integer goalsConceded2;
        Integer goalsScored;
        Integer goalsScored2;
        Integer matches;
        Integer matches2;
        int i3;
        Integer totalDuelsWon;
        Integer totalDuelsWon2;
        Integer assists;
        Integer assists2;
        Integer goals;
        Integer goals2;
        qb9 qb9Var = (qb9) obj;
        qb9Var.getClass();
        Season season = qb9Var.d;
        final SeasonHighlightedComparison seasonHighlightedComparison = qb9Var.e;
        Context context = this.b;
        String C = w3a.C(season, context);
        xk8 xk8Var = this.c;
        TextView textView3 = (TextView) xk8Var.p;
        TextView textView4 = xk8Var.b;
        z82 z82Var = (z82) xk8Var.n;
        z82 z82Var2 = (z82) xk8Var.m;
        z82 z82Var3 = (z82) xk8Var.l;
        z82 z82Var4 = (z82) xk8Var.k;
        e92 e92Var = (e92) xk8Var.i;
        TextView textView5 = xk8Var.f;
        TextView textView6 = (TextView) xk8Var.q;
        t22 t22Var = (t22) xk8Var.j;
        LinearLayout linearLayout = t22Var.b;
        FrameLayout frameLayout = (FrameLayout) xk8Var.g;
        ImageView imageView = (ImageView) xk8Var.d;
        ImageView imageView2 = (ImageView) xk8Var.c;
        TextView textView7 = (TextView) xk8Var.r;
        ImageView imageView3 = (ImageView) xk8Var.e;
        ImageView imageView4 = (ImageView) xk8Var.h;
        textView3.setText(C);
        TextView textView8 = (TextView) xk8Var.o;
        textView8.setText(C);
        int i4 = qb9Var.c;
        f(textView3, i4);
        f(textView8, i4);
        int i5 = qb9Var.b;
        final int i6 = qb9Var.c;
        final int i7 = 0;
        if (i5 != 3) {
            textView7.setText(context.getString(R.string.compare_team_stats));
            final Team homeTeam = seasonHighlightedComparison.getHomeTeam();
            final Team awayTeam = seasonHighlightedComparison.getAwayTeam();
            if (homeTeam == null || awayTeam == null) {
                frameLayout.getClass();
                frameLayout.setVisibility(8);
                return;
            }
            frameLayout.getClass();
            frameLayout.setVisibility(0);
            as9.o(imageView, homeTeam.getId());
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: jb9
                public final /* synthetic */ mb9 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i8 = i7;
                    Team team = homeTeam;
                    mb9 mb9Var = this.b;
                    switch (i8) {
                        case 0:
                            int i9 = TeamActivity.Z;
                            jle.r(mb9Var.b, team.getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                            break;
                        default:
                            int i10 = TeamActivity.Z;
                            jle.r(mb9Var.b, team.getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                            break;
                    }
                }
            });
            as9.o(imageView2, awayTeam.getId());
            final int i8 = 1;
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: jb9
                public final /* synthetic */ mb9 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i82 = i8;
                    Team team = awayTeam;
                    mb9 mb9Var = this.b;
                    switch (i82) {
                        case 0:
                            int i9 = TeamActivity.Z;
                            jle.r(mb9Var.b, team.getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                            break;
                        default:
                            int i10 = TeamActivity.Z;
                            jle.r(mb9Var.b, team.getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                            break;
                    }
                }
            });
            imageView4.setVisibility(8);
            imageView3.setVisibility(8);
            textView6.setText(v8a.w(context, homeTeam));
            textView5.setText(v8a.w(context, awayTeam));
            linearLayout.setVisibility(8);
            FootballTeamHighlightedStatistics homeTeamStatistics = seasonHighlightedComparison.getHomeTeamStatistics();
            FootballTeamHighlightedStatistics awayTeamStatistics = seasonHighlightedComparison.getAwayTeamStatistics();
            e(e92Var, homeTeamStatistics != null ? homeTeamStatistics.getAvgRating() : null, awayTeamStatistics != null ? awayTeamStatistics.getAvgRating() : null);
            q9k q9kVar = new q9k(R.string.matches);
            if (homeTeamStatistics == null || (matches2 = homeTeamStatistics.getMatches()) == null) {
                textView = textView4;
                str = null;
            } else {
                String valueOf = String.valueOf(matches2.intValue());
                textView = textView4;
                str = valueOf;
            }
            if (awayTeamStatistics == null || (matches = awayTeamStatistics.getMatches()) == null) {
                textView2 = textView;
                str2 = null;
            } else {
                String valueOf2 = String.valueOf(matches.intValue());
                textView2 = textView;
                str2 = valueOf2;
            }
            TextView textView9 = textView2;
            d(z82Var4, q9kVar, str, str2, Intrinsics.d(yid.m(homeTeamStatistics != null ? homeTeamStatistics.getMatches() : null), yid.m(awayTeamStatistics != null ? awayTeamStatistics.getMatches() : null)), true);
            d(z82Var3, new q9k(R.string.football_goals_scored), (homeTeamStatistics == null || (goalsScored2 = homeTeamStatistics.getGoalsScored()) == null) ? null : String.valueOf(goalsScored2.intValue()), (awayTeamStatistics == null || (goalsScored = awayTeamStatistics.getGoalsScored()) == null) ? null : String.valueOf(goalsScored.intValue()), Intrinsics.d(yid.m(homeTeamStatistics != null ? homeTeamStatistics.getGoalsScored() : null), yid.m(awayTeamStatistics != null ? awayTeamStatistics.getGoalsScored() : null)), true);
            d(z82Var2, new q9k(R.string.football_goals_conceded), (homeTeamStatistics == null || (goalsConceded2 = homeTeamStatistics.getGoalsConceded()) == null) ? null : String.valueOf(goalsConceded2.intValue()), (awayTeamStatistics == null || (goalsConceded = awayTeamStatistics.getGoalsConceded()) == null) ? null : String.valueOf(goalsConceded.intValue()), -Intrinsics.d(yid.m(homeTeamStatistics != null ? homeTeamStatistics.getGoalsConceded() : null), yid.m(awayTeamStatistics != null ? awayTeamStatistics.getGoalsConceded() : null)), true);
            final int i9 = 0;
            d(z82Var, new q9k(R.string.football_big_chances_missed), (homeTeamStatistics == null || (bigChancesMissed2 = homeTeamStatistics.getBigChancesMissed()) == null) ? null : String.valueOf(bigChancesMissed2.intValue()), (awayTeamStatistics == null || (bigChancesMissed = awayTeamStatistics.getBigChancesMissed()) == null) ? null : String.valueOf(bigChancesMissed.intValue()), -Intrinsics.d(yid.m(homeTeamStatistics != null ? homeTeamStatistics.getBigChancesMissed() : null), yid.m(awayTeamStatistics != null ? awayTeamStatistics.getBigChancesMissed() : null)), false);
            textView9.setOnClickListener(new View.OnClickListener(this) { // from class: kb9
                public final /* synthetic */ mb9 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str3;
                    Team team;
                    int i10 = i9;
                    SeasonHighlightedComparison seasonHighlightedComparison2 = seasonHighlightedComparison;
                    int i11 = i6;
                    Object obj2 = awayTeam;
                    Object obj3 = homeTeam;
                    mb9 mb9Var = this.b;
                    switch (i10) {
                        case 0:
                            Team team2 = (Team) obj3;
                            int i12 = SeasonComparisonActivity.L;
                            pxg.d(mb9Var.b, team2.getId(), Integer.valueOf(((Team) obj2).getId()), Integer.valueOf(i11), Integer.valueOf(seasonHighlightedComparison2.getSeason().getId()), null, team2.getSportSlug(), "historical_data");
                            break;
                        default:
                            int i13 = SeasonComparisonActivity.L;
                            Context context2 = mb9Var.b;
                            int id = ((Player) obj3).getId();
                            Integer valueOf3 = Integer.valueOf(((Player) obj2).getId());
                            Integer valueOf4 = Integer.valueOf(i11);
                            Integer valueOf5 = Integer.valueOf(seasonHighlightedComparison2.getSeason().getId());
                            String label = Season.SubSeasonType.OVERALL.getLabel();
                            PlayerTeam player1 = seasonHighlightedComparison2.getPlayer1();
                            if (player1 == null || (team = player1.getTeam()) == null || (str3 = team.getSportSlug()) == null) {
                                str3 = Sports.FOOTBALL;
                            }
                            pxg.c(context2, id, valueOf3, valueOf4, valueOf5, label, str3, "historical_data");
                            break;
                    }
                }
            });
            return;
        }
        textView7.setText(context.getString(R.string.compare_player_stats));
        PlayerTeam player1 = seasonHighlightedComparison.getPlayer1();
        final Player player = player1 != null ? player1.getPlayer() : null;
        PlayerTeam player2 = seasonHighlightedComparison.getPlayer2();
        final Player player3 = player2 != null ? player2.getPlayer() : null;
        if (player == null || player3 == null) {
            frameLayout.getClass();
            frameLayout.setVisibility(8);
            return;
        }
        frameLayout.getClass();
        frameLayout.setVisibility(0);
        as9.l(imageView, player.getId(), null);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: lb9
            public final /* synthetic */ mb9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = i7;
                Player player4 = player;
                mb9 mb9Var = this.b;
                switch (i10) {
                    case 0:
                        int i11 = PlayerActivity.Z;
                        jle.q(mb9Var.b, player4.getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                        break;
                    default:
                        int i12 = PlayerActivity.Z;
                        jle.q(mb9Var.b, player4.getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                        break;
                }
            }
        });
        as9.l(imageView2, player3.getId(), null);
        final int i10 = 1;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: lb9
            public final /* synthetic */ mb9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i102 = i10;
                Player player4 = player3;
                mb9 mb9Var = this.b;
                switch (i102) {
                    case 0:
                        int i11 = PlayerActivity.Z;
                        jle.q(mb9Var.b, player4.getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                        break;
                    default:
                        int i12 = PlayerActivity.Z;
                        jle.q(mb9Var.b, player4.getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                        break;
                }
            }
        });
        imageView4.setVisibility(0);
        Country country = player.getCountry();
        as9.c(imageView4, country != null ? country.getAlpha2() : null, true, null, 4);
        imageView3.setVisibility(0);
        Country country2 = player3.getCountry();
        as9.c(imageView3, country2 != null ? country2.getAlpha2() : null, true, null, 4);
        textView6.setText(tba.t(player));
        textView5.setText(tba.t(player3));
        PlayerTeam player12 = seasonHighlightedComparison.getPlayer1();
        Team team = player12 != null ? player12.getTeam() : null;
        PlayerTeam player22 = seasonHighlightedComparison.getPlayer2();
        Team team2 = player22 != null ? player22.getTeam() : null;
        if (seasonHighlightedComparison.getSeason().isAllTimeSeason() || team == null || team2 == null) {
            i3 = 8;
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            joa joaVar = iyg.a;
            iyg.c(t22Var.c, team, ua5.a);
            iyg.c(t22Var.d, team2, ua5.b);
            i3 = 8;
        }
        FootballPlayerHighlightedStatistics player1Statistics = seasonHighlightedComparison.getPlayer1Statistics();
        FootballPlayerHighlightedStatistics player2Statistics = seasonHighlightedComparison.getPlayer2Statistics();
        e(e92Var, player1Statistics != null ? player1Statistics.getRating() : null, player2Statistics != null ? player2Statistics.getRating() : null);
        final Player player4 = player3;
        int i11 = i3;
        d(z82Var4, new q9k(R.string.goals), (player1Statistics == null || (goals2 = player1Statistics.getGoals()) == null) ? null : String.valueOf(goals2.intValue()), (player2Statistics == null || (goals = player2Statistics.getGoals()) == null) ? null : String.valueOf(goals.intValue()), Intrinsics.d(yid.m(player1Statistics != null ? player1Statistics.getGoals() : null), yid.m(player2Statistics != null ? player2Statistics.getGoals() : null)), true);
        d(z82Var3, new q9k(R.string.football_assists), (player1Statistics == null || (assists2 = player1Statistics.getAssists()) == null) ? null : String.valueOf(assists2.intValue()), (player2Statistics == null || (assists = player2Statistics.getAssists()) == null) ? null : String.valueOf(assists.intValue()), Intrinsics.d(yid.m(player1Statistics != null ? player1Statistics.getAssists() : null), yid.m(player2Statistics != null ? player2Statistics.getAssists() : null)), true);
        d(z82Var2, new q9k(R.string.football_total_duels_won), (player1Statistics == null || (totalDuelsWon2 = player1Statistics.getTotalDuelsWon()) == null) ? null : String.valueOf(totalDuelsWon2.intValue()), (player2Statistics == null || (totalDuelsWon = player2Statistics.getTotalDuelsWon()) == null) ? null : String.valueOf(totalDuelsWon.intValue()), Intrinsics.d(yid.m(player1Statistics != null ? player1Statistics.getTotalDuelsWon() : null), yid.m(player2Statistics != null ? player2Statistics.getTotalDuelsWon() : null)), false);
        ConstraintLayout constraintLayout = (ConstraintLayout) z82Var.b;
        constraintLayout.getClass();
        constraintLayout.setVisibility(i11);
        final int i12 = 1;
        final Player player5 = player;
        textView4.setOnClickListener(new View.OnClickListener(this) { // from class: kb9
            public final /* synthetic */ mb9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str3;
                Team team3;
                int i102 = i12;
                SeasonHighlightedComparison seasonHighlightedComparison2 = seasonHighlightedComparison;
                int i112 = i6;
                Object obj2 = player4;
                Object obj3 = player5;
                mb9 mb9Var = this.b;
                switch (i102) {
                    case 0:
                        Team team22 = (Team) obj3;
                        int i122 = SeasonComparisonActivity.L;
                        pxg.d(mb9Var.b, team22.getId(), Integer.valueOf(((Team) obj2).getId()), Integer.valueOf(i112), Integer.valueOf(seasonHighlightedComparison2.getSeason().getId()), null, team22.getSportSlug(), "historical_data");
                        break;
                    default:
                        int i13 = SeasonComparisonActivity.L;
                        Context context2 = mb9Var.b;
                        int id = ((Player) obj3).getId();
                        Integer valueOf3 = Integer.valueOf(((Player) obj2).getId());
                        Integer valueOf4 = Integer.valueOf(i112);
                        Integer valueOf5 = Integer.valueOf(seasonHighlightedComparison2.getSeason().getId());
                        String label = Season.SubSeasonType.OVERALL.getLabel();
                        PlayerTeam player13 = seasonHighlightedComparison2.getPlayer1();
                        if (player13 == null || (team3 = player13.getTeam()) == null || (str3 = team3.getSportSlug()) == null) {
                            str3 = Sports.FOOTBALL;
                        }
                        pxg.c(context2, id, valueOf3, valueOf4, valueOf5, label, str3, "historical_data");
                        break;
                }
            }
        });
    }

    public final void d(z82 z82Var, q9k q9kVar, String str, String str2, int i, boolean z) {
        if (str == null || str2 == null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) z82Var.b;
            constraintLayout.getClass();
            constraintLayout.setVisibility(8);
        } else {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) z82Var.b;
            constraintLayout2.getClass();
            constraintLayout2.setVisibility(0);
            joa joaVar = iyg.a;
            iyg.a(z82Var, q9kVar, str, str2, i, this.e, this.f, z ? Boolean.FALSE : null);
        }
    }

    public final void f(TextView textView, int i) {
        Integer valueOf = Integer.valueOf(i);
        Context context = textView.getContext();
        context.getClass();
        String I = pco.I(0, valueOf, hkg.b0(context));
        ua5 ua5Var = ua5.a;
        Integer valueOf2 = Integer.valueOf(this.d);
        Context context2 = textView.getContext();
        context2.getClass();
        apf a = ajh.a(context2);
        Context context3 = textView.getContext();
        context3.getClass();
        ht9 ht9Var = new ht9(context3);
        ht9Var.c = I;
        ht9Var.d = new pfj(textView, ua5Var, valueOf2);
        vt9.e(ht9Var, R.drawable.cup_logo_placeholder);
        vt9.a(ht9Var, R.drawable.cup_logo_placeholder);
        a.a(ht9Var.a());
    }
}
