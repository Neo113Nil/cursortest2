package defpackage;

import androidx.compose.runtime.e;
import com.sofascore.model.fantasy.FantasyCompetitionPlayersResponse;
import com.sofascore.model.fantasy.FantasyCompetitionPriceChangesResponse;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.fantasy.FantasyCompetitionsResponse;
import com.sofascore.model.fantasy.FantasyCreateTeamPostBody;
import com.sofascore.model.fantasy.FantasyEventsResponse;
import com.sofascore.model.fantasy.FantasyFilterOptions;
import com.sofascore.model.fantasy.FantasyFixtureDifficultyResponse;
import com.sofascore.model.fantasy.FantasyLeague;
import com.sofascore.model.fantasy.FantasyLeagueConfig;
import com.sofascore.model.fantasy.FantasyLeagueGameType;
import com.sofascore.model.fantasy.FantasyLeagueLeaderboardResponse;
import com.sofascore.model.fantasy.FantasyLeagueMatchupSquad;
import com.sofascore.model.fantasy.FantasyLeagueMatchupsResponse;
import com.sofascore.model.fantasy.FantasyLeagueParticipantsResponse;
import com.sofascore.model.fantasy.FantasyLeagueRoundSquadsResponse;
import com.sofascore.model.fantasy.FantasyLeagueType;
import com.sofascore.model.fantasy.FantasyNewsArticlesResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class au6 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ au6(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _init_$_anonymous_;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _childSerializers$_anonymous_9;
        KSerializer _init_$_anonymous_2;
        KSerializer _childSerializers$_anonymous_10;
        KSerializer _childSerializers$_anonymous_11;
        KSerializer _childSerializers$_anonymous_12;
        KSerializer _childSerializers$_anonymous_13;
        KSerializer _childSerializers$_anonymous_14;
        KSerializer _init_$_anonymous_3;
        KSerializer _childSerializers$_anonymous_15;
        switch (this.a) {
            case 0:
                return Unit.a;
            case 1:
                _childSerializers$_anonymous_ = FantasyCompetitionPlayersResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 2:
                _childSerializers$_anonymous_2 = FantasyCompetitionPriceChangesResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 3:
                return "popular_competitions_title";
            case 4:
                return "popular_competitions_row";
            case 5:
                return Unit.a;
            case 6:
                _init_$_anonymous_ = FantasyCompetitionType._init_$_anonymous_();
                return _init_$_anonymous_;
            case 7:
                _childSerializers$_anonymous_3 = FantasyCompetitionsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 8:
                _childSerializers$_anonymous_4 = FantasyCreateTeamPostBody._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 9:
                return Unit.a;
            case 10:
                _childSerializers$_anonymous_5 = FantasyEventsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 11:
                _childSerializers$_anonymous_6 = FantasyFilterOptions._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 12:
                _childSerializers$_anonymous_$0 = FantasyFilterOptions._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 13:
                _childSerializers$_anonymous_7 = FantasyFixtureDifficultyResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 14:
                _childSerializers$_anonymous_$02 = FantasyFixtureDifficultyResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 15:
                _childSerializers$_anonymous_$1 = FantasyFixtureDifficultyResponse._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 16:
                return Unit.a;
            case 17:
                return Unit.a;
            case 18:
                return e.f(r27.a);
            case 19:
                _childSerializers$_anonymous_8 = FantasyLeague._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 20:
                _childSerializers$_anonymous_$03 = FantasyLeague._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 21:
                _childSerializers$_anonymous_9 = FantasyLeagueConfig._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            case 22:
                _init_$_anonymous_2 = FantasyLeagueGameType._init_$_anonymous_();
                return _init_$_anonymous_2;
            case 23:
                _childSerializers$_anonymous_10 = FantasyLeagueLeaderboardResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_10;
            case 24:
                _childSerializers$_anonymous_11 = FantasyLeagueMatchupSquad._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_11;
            case 25:
                _childSerializers$_anonymous_12 = FantasyLeagueMatchupsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_12;
            case 26:
                _childSerializers$_anonymous_13 = FantasyLeagueParticipantsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_13;
            case 27:
                _childSerializers$_anonymous_14 = FantasyLeagueRoundSquadsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_14;
            case 28:
                _init_$_anonymous_3 = FantasyLeagueType._init_$_anonymous_();
                return _init_$_anonymous_3;
            default:
                _childSerializers$_anonymous_15 = FantasyNewsArticlesResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_15;
        }
    }
}
