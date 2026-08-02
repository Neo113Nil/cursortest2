package defpackage;

import com.sofascore.model.crowdsourcing.TeamSide;
import com.sofascore.model.mvvm.model.TeamLinkedRound;
import com.sofascore.model.mvvm.model.bettingtips.TeamStreak;
import com.sofascore.model.network.response.TeamRssFeedResponse;
import com.sofascore.model.network.response.bettingtips.TeamStreaksResponse;
import com.sofascore.model.newNetwork.TeamForm;
import com.sofascore.model.newNetwork.TeamOfThePeriodRoundsResponse;
import com.sofascore.model.newNetwork.TeamOfTheWeekPlayer;
import com.sofascore.model.newNetwork.TeamOfTheWeekResponse;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponse;
import com.sofascore.model.newNetwork.TeamPlayerSeasonStatisticsResponse;
import com.sofascore.model.newNetwork.TeamPlayersResponse;
import com.sofascore.model.newNetwork.TeamStreakBettingOddsResponse;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class bxi implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ bxi(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _init_$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_$12;
        KSerializer _childSerializers$_anonymous_$2;
        KSerializer _childSerializers$_anonymous_$3;
        KSerializer _childSerializers$_anonymous_$4;
        KSerializer _childSerializers$_anonymous_$5;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _init_$_anonymous_2;
        KSerializer _childSerializers$_anonymous_9;
        KSerializer _childSerializers$_anonymous_10;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _childSerializers$_anonymous_11;
        KSerializer _childSerializers$_anonymous_12;
        KSerializer _childSerializers$_anonymous_$04;
        KSerializer _childSerializers$_anonymous_$13;
        KSerializer _childSerializers$_anonymous_$22;
        KSerializer _childSerializers$_anonymous_$32;
        KSerializer _childSerializers$_anonymous_$42;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_ = TeamForm._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 1:
                _childSerializers$_anonymous_$0 = TeamForm._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 2:
                _childSerializers$_anonymous_$1 = TeamForm._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 3:
                _init_$_anonymous_ = TeamLinkedRound.UnknownTeamLinkedRound._init_$_anonymous_();
                return _init_$_anonymous_;
            case 4:
                _childSerializers$_anonymous_2 = TeamOfThePeriodRoundsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 5:
                _childSerializers$_anonymous_3 = TeamOfTheWeekPlayer._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 6:
                _childSerializers$_anonymous_4 = TeamOfTheWeekResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 7:
                _childSerializers$_anonymous_5 = TeamOfTheWeekRoundsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 8:
                _childSerializers$_anonymous_6 = TeamPlayerSeasonStatisticsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 9:
                return new tug();
            case 10:
                _childSerializers$_anonymous_7 = TeamPlayersResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 11:
                _childSerializers$_anonymous_$02 = TeamPlayersResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 12:
                _childSerializers$_anonymous_$12 = TeamPlayersResponse._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$12;
            case 13:
                _childSerializers$_anonymous_$2 = TeamPlayersResponse._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
            case 14:
                _childSerializers$_anonymous_$3 = TeamPlayersResponse._childSerializers$_anonymous_$3();
                return _childSerializers$_anonymous_$3;
            case 15:
                _childSerializers$_anonymous_$4 = TeamPlayersResponse._childSerializers$_anonymous_$4();
                return _childSerializers$_anonymous_$4;
            case 16:
                _childSerializers$_anonymous_$5 = TeamPlayersResponse._childSerializers$_anonymous_$5();
                return _childSerializers$_anonymous_$5;
            case 17:
                _childSerializers$_anonymous_8 = TeamRssFeedResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 18:
                _init_$_anonymous_2 = TeamSide._init_$_anonymous_();
                return _init_$_anonymous_2;
            case 19:
                _childSerializers$_anonymous_9 = TeamStreak._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            case 20:
                _childSerializers$_anonymous_10 = TeamStreakBettingOddsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_10;
            case 21:
                _childSerializers$_anonymous_$03 = TeamStreakBettingOddsResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 22:
                return tub.h(new Pair(zu1.c, b.j(new m2j("wins", "Wins"), new m2j("loses", "Losses"), new m2j("draws", "Draws"), new m2j("noLoses", "No losses"), new m2j("noWins", "No wins"))), new Pair(zu1.d, b.j(new m2j("noGoalsConceded", "No goals conceded"), new m2j("noGoalsScored", "No goals scored"), new m2j("withoutCleanSheet", "Without clean sheet"), new m2j("moreThan2.5", "More than 2.5 goals"), new m2j("lessThan2.5", "Less than 2.5 goals"), new m2j("bothScoring", "Both teams scoring"), new m2j("firstScorer", "First to score"), new m2j("firstConceded", "First to concede"), new m2j("firstHalfWinner", "First half winner"), new m2j("firstHalfLoser", "First half loser"))), new Pair(zu1.e, b.j(new m2j("firstQuarterWinner", "First quarter winner"), new m2j("firstQuarterLoser", "First quarter loser"), new m2j("pointsAverage", "Scored points average (Last 10)"), new m2j("gameTotalPointsAverage", "Game points average (Last 10)"))), new Pair(zu1.g, b.j(new m2j("firstThirdWinner", "First period winner"), new m2j("firstThirdLoser", "First period loser"), new m2j("firstThirdBothScoring", "First period both scoring"), new m2j("moreThan5.5", "More than 5.5 goals"), new m2j("moreThan1.5", "More than 1.5 goals in first period"))), new Pair(zu1.h, b.j(new m2j("firstSetWinner", "First set winner"), new m2j("firstSetLoser", "First set loser"))), new Pair(zu1.f, b.j(new m2j("winsOnClay", "Wins (clay)"), new m2j("winsOnGrass", "Wins (grass)"), new m2j("winsOnHard", "Wins (hard)"), new m2j("winsOnCarpetIndoor", "Wins (carpet indoor)"), new m2j("winsOnHardcourtIndoor", "Wins (hardcourt indoor)"), new m2j("winsOnHardcourtOutdoor", "Wins (hardcourt outdoor)"), new m2j("winsOnSyntheticOutdoor", "Wins (synthetic outdoor)"), new m2j("losesOnClay", "Losses (clay)"), new m2j("losesOnGrass", "Losses (grass)"), new m2j("losesOnHard", "Losses (hard)"), new m2j("losesOnCarpetIndoor", "Losses (carpet indoor)"), new m2j("losesOnHardcourtIndoor", "Losses (hardcourt indoor)"), new m2j("losesOnHardcourtOutdoor", "Losses (hardcourt outdoor)"), new m2j("losesOnSyntheticOutdoor", "Losses (synthetic outdoor)"), new m2j("setsWon", "Sets won"))));
            case 23:
                _childSerializers$_anonymous_11 = TeamStreaksResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_11;
            case 24:
                _childSerializers$_anonymous_12 = com.sofascore.model.network.response.TeamStreaksResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_12;
            case 25:
                _childSerializers$_anonymous_$04 = com.sofascore.model.network.response.TeamStreaksResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$04;
            case 26:
                _childSerializers$_anonymous_$13 = com.sofascore.model.network.response.TeamStreaksResponse._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$13;
            case 27:
                _childSerializers$_anonymous_$22 = com.sofascore.model.network.response.TeamStreaksResponse._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$22;
            case 28:
                _childSerializers$_anonymous_$32 = com.sofascore.model.network.response.TeamStreaksResponse._childSerializers$_anonymous_$3();
                return _childSerializers$_anonymous_$32;
            default:
                _childSerializers$_anonymous_$42 = com.sofascore.model.network.response.TeamStreaksResponse._childSerializers$_anonymous_$4();
                return _childSerializers$_anonymous_$42;
        }
    }
}
