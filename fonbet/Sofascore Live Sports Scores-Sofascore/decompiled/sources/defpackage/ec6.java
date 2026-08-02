package defpackage;

import com.inmobi.media.F0;
import com.inmobi.media.F5;
import com.sofascore.model.ExperimentsRemoteConfig;
import com.sofascore.model.crowdsourcing.EventSuggestRequest;
import com.sofascore.model.fantasy.FantasyBasicCompetitionsResponse;
import com.sofascore.model.fantasy.FantasyCompetition;
import com.sofascore.model.fantasy.FantasyCompetitionAgeGroupsResponse;
import com.sofascore.model.network.response.EventTeamHeatmapResponse;
import com.sofascore.model.network.response.EventUmpiresResponse;
import com.sofascore.model.network.response.EventWeatherCondition;
import com.sofascore.model.network.response.EventWeatherResponse;
import com.sofascore.model.newNetwork.EventTennisAiInsightsResponse;
import com.sofascore.model.newNetwork.EventsByMonthResponse;
import com.sofascore.model.newNetwork.FanPlayerOfTheMatchOption;
import com.sofascore.model.newNetwork.FanPlayerOfTheMatchResponse;
import com.sofascore.model.newNetwork.FanPlayerOfTheMatchStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ec6 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ec6(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _childSerializers$_anonymous_9;
        KSerializer _childSerializers$_anonymous_$04;
        KSerializer _childSerializers$_anonymous_10;
        KSerializer _childSerializers$_anonymous_11;
        KSerializer _childSerializers$_anonymous_$05;
        KSerializer _init_$_anonymous_;
        KSerializer _childSerializers$_anonymous_12;
        KSerializer _childSerializers$_anonymous_13;
        KSerializer _childSerializers$_anonymous_$06;
        KSerializer _childSerializers$_anonymous_14;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_ = EventSuggestRequest.CardSuggest._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 1:
                _childSerializers$_anonymous_$0 = EventSuggestRequest.CardSuggest._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 2:
                _childSerializers$_anonymous_2 = EventSuggestRequest.GoalSuggest._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 3:
                _childSerializers$_anonymous_$02 = EventSuggestRequest.GoalSuggest._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 4:
                _childSerializers$_anonymous_3 = EventTeamHeatmapResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 5:
                _childSerializers$_anonymous_$03 = EventTeamHeatmapResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 6:
                _childSerializers$_anonymous_4 = EventTennisAiInsightsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 7:
                _childSerializers$_anonymous_5 = EventUmpiresResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 8:
                _childSerializers$_anonymous_6 = EventWeatherCondition._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 9:
                _childSerializers$_anonymous_7 = EventWeatherResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 10:
                _childSerializers$_anonymous_8 = EventsByMonthResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 11:
                _childSerializers$_anonymous_9 = ExperimentsRemoteConfig._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            case 12:
                _childSerializers$_anonymous_$04 = ExperimentsRemoteConfig._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$04;
            case 13:
                return F0.a();
            case 14:
                return F0.b();
            case 15:
                return Boolean.valueOf(F5.d());
            case 16:
                return F5.b();
            case 17:
                return Integer.valueOf(F5.C());
            case 18:
                return Integer.valueOf(F5.c());
            case 19:
                return F5.a();
            case 20:
                return F5.D();
            case 21:
                _childSerializers$_anonymous_10 = FanPlayerOfTheMatchOption._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_10;
            case 22:
                _childSerializers$_anonymous_11 = FanPlayerOfTheMatchResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_11;
            case 23:
                _childSerializers$_anonymous_$05 = FanPlayerOfTheMatchResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$05;
            case 24:
                _init_$_anonymous_ = FanPlayerOfTheMatchStatus._init_$_anonymous_();
                return _init_$_anonymous_;
            case 25:
                _childSerializers$_anonymous_12 = FantasyBasicCompetitionsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_12;
            case 26:
                return Unit.a;
            case 27:
                _childSerializers$_anonymous_13 = FantasyCompetition._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_13;
            case 28:
                _childSerializers$_anonymous_$06 = FantasyCompetition._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$06;
            default:
                _childSerializers$_anonymous_14 = FantasyCompetitionAgeGroupsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_14;
        }
    }
}
