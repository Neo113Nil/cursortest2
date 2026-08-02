package defpackage;

import com.sofascore.model.fantasy.FantasyRoundPlayer;
import com.sofascore.model.fantasy.FantasyRoundPlayerEvent;
import com.sofascore.model.fantasy.FantasyRoundPlayerStatistics;
import com.sofascore.model.fantasy.FantasyRoundPlayerStatisticsResponse;
import com.sofascore.model.fantasy.FantasyRoundTransfers;
import com.sofascore.model.fantasy.FantasyRoundsResponse;
import com.sofascore.model.fantasy.FantasySubstitutionsPostBody;
import com.sofascore.model.fantasy.FantasyTeamOfTheRoundResponse;
import com.sofascore.model.fantasy.FantasyTopPlayersPerRoundResponse;
import com.sofascore.model.fantasy.FantasyTopPlayersResponse;
import com.sofascore.model.fantasy.FantasyTransfersPostBody;
import com.sofascore.model.fantasy.FantasyTransfersResponse;
import com.sofascore.model.fantasy.FantasyUniqueTournamentCompetitionMapping;
import com.sofascore.model.fantasy.FantasyUpcomingCompetition;
import com.sofascore.model.fantasy.FantasyUpdateTeamPostBody;
import com.sofascore.model.fantasy.FantasyUserCompetitionsResponse;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncement;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class jf7 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ jf7(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_$2;
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_$12;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _childSerializers$_anonymous_9;
        KSerializer _childSerializers$_anonymous_10;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _childSerializers$_anonymous_11;
        KSerializer _childSerializers$_anonymous_12;
        KSerializer _childSerializers$_anonymous_13;
        KSerializer _childSerializers$_anonymous_14;
        KSerializer _childSerializers$_anonymous_$04;
        KSerializer _childSerializers$_anonymous_15;
        KSerializer _childSerializers$_anonymous_16;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_$0 = FantasyRemoteAnnouncement._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 1:
                _childSerializers$_anonymous_$1 = FantasyRemoteAnnouncement._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 2:
                _childSerializers$_anonymous_$2 = FantasyRemoteAnnouncement._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
            case 3:
                _childSerializers$_anonymous_ = FantasyRoundPlayer._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 4:
                _childSerializers$_anonymous_$02 = FantasyRoundPlayer._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 5:
                _childSerializers$_anonymous_$12 = FantasyRoundPlayer._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$12;
            case 6:
                _childSerializers$_anonymous_2 = FantasyRoundPlayerEvent._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 7:
                _childSerializers$_anonymous_3 = FantasyRoundPlayerStatistics._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 8:
                _childSerializers$_anonymous_4 = FantasyRoundPlayerStatisticsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 9:
                dj7 dj7Var = FantasyRoundPlayerUiModel.Companion;
                rz6[] values = rz6.values();
                values.getClass();
                return new qq3("com.sofascore.results.fantasy.ui.model.FantasyFootballPlayerPosition", (Enum[]) values);
            case 10:
                dj7 dj7Var2 = FantasyRoundPlayerUiModel.Companion;
                yy6[] values2 = yy6.values();
                values2.getClass();
                return new qq3("com.sofascore.results.fantasy.ui.model.FantasyFootballPlayerActionState", (Enum[]) values2);
            case 11:
                dj7 dj7Var3 = FantasyRoundPlayerUiModel.Companion;
                return new xg0(ed7.a, 0);
            case 12:
                dj7 dj7Var4 = FantasyRoundPlayerUiModel.Companion;
                return new q79(a7a.a, cd7.a, 1);
            case 13:
                dj7 dj7Var5 = FantasyRoundPlayerUiModel.Companion;
                return new xg0(c88.a, 0);
            case 14:
                _childSerializers$_anonymous_5 = FantasyRoundTransfers._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 15:
                _childSerializers$_anonymous_6 = FantasyRoundsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 16:
                return Unit.a;
            case 17:
                _childSerializers$_anonymous_7 = FantasySubstitutionsPostBody._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 18:
                return Unit.a;
            case 19:
                _childSerializers$_anonymous_8 = FantasyTeamOfTheRoundResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 20:
                _childSerializers$_anonymous_9 = FantasyTopPlayersPerRoundResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            case 21:
                _childSerializers$_anonymous_10 = FantasyTopPlayersResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_10;
            case 22:
                _childSerializers$_anonymous_$03 = FantasyTopPlayersResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 23:
                _childSerializers$_anonymous_11 = FantasyTransfersPostBody._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_11;
            case 24:
                _childSerializers$_anonymous_12 = FantasyTransfersResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_12;
            case 25:
                _childSerializers$_anonymous_13 = FantasyUniqueTournamentCompetitionMapping._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_13;
            case 26:
                _childSerializers$_anonymous_14 = FantasyUpcomingCompetition._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_14;
            case 27:
                _childSerializers$_anonymous_$04 = FantasyUpcomingCompetition._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$04;
            case 28:
                _childSerializers$_anonymous_15 = FantasyUpdateTeamPostBody._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_15;
            default:
                _childSerializers$_anonymous_16 = FantasyUserCompetitionsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_16;
        }
    }
}
