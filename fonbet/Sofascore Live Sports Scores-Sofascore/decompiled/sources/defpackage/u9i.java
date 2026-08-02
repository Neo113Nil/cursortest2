package defpackage;

import com.blaze.blazesdk.features.stories.repos.StoriesRecommendationStrategy;
import com.blaze.blazesdk.features.stories.repos.StoriesRepositoryImpl;
import com.sofascore.model.mvvm.model.StandingsFormEvent;
import com.sofascore.model.mvvm.model.StandingsTable;
import com.sofascore.model.mvvm.model.StandingsTableRow;
import com.sofascore.model.newNetwork.StandingsFormMultipleTournamentsResponse;
import com.sofascore.model.newNetwork.StandingsFormResponse;
import com.sofascore.model.newNetwork.StandingsResponse;
import com.sofascore.model.newNetwork.StatisticsSeasonsResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class u9i implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ u9i(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _childSerializers$_anonymous_$12;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_$04;
        switch (this.a) {
            case 0:
                return new xg0(uhi.a, 0);
            case 1:
                return new xg0(dai.a, 0);
            case 2:
                t9i[] values = t9i.values();
                values.getClass();
                return new xg0(new qq3("com.sofascore.results.league.adapter.StandingsColumn", (Enum[]) values), 0);
            case 3:
                t9i[] values2 = t9i.values();
                values2.getClass();
                return new xg0(new qq3("com.sofascore.results.league.adapter.StandingsColumn", (Enum[]) values2), 0);
            case 4:
                t9i[] values3 = t9i.values();
                values3.getClass();
                return new xg0(new qq3("com.sofascore.results.league.adapter.StandingsColumn", (Enum[]) values3), 0);
            case 5:
                cai[] values4 = cai.values();
                values4.getClass();
                return new qq3("com.sofascore.results.league.adapter.StandingsMode", (Enum[]) values4);
            case 6:
                _childSerializers$_anonymous_ = StandingsFormEvent._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 7:
                _childSerializers$_anonymous_$0 = StandingsFormEvent._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 8:
                _childSerializers$_anonymous_2 = StandingsFormMultipleTournamentsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 9:
                _childSerializers$_anonymous_3 = StandingsFormResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 10:
                _childSerializers$_anonymous_4 = StandingsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 11:
                return new xg0(uhi.a, 0);
            case 12:
                _childSerializers$_anonymous_5 = StandingsTable._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 13:
                _childSerializers$_anonymous_$02 = StandingsTable._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 14:
                _childSerializers$_anonymous_$1 = StandingsTable._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 15:
                cai[] values5 = cai.values();
                values5.getClass();
                return new qq3("com.sofascore.results.league.adapter.StandingsMode", (Enum[]) values5);
            case 16:
                t9i[] values6 = t9i.values();
                values6.getClass();
                return new xg0(new qq3("com.sofascore.results.league.adapter.StandingsColumn", (Enum[]) values6), 0);
            case 17:
                t9i[] values7 = t9i.values();
                values7.getClass();
                return new xg0(new qq3("com.sofascore.results.league.adapter.StandingsColumn", (Enum[]) values7), 0);
            case 18:
                _childSerializers$_anonymous_6 = StandingsTableRow._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 19:
                _childSerializers$_anonymous_$03 = StandingsTableRow._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 20:
                _childSerializers$_anonymous_$12 = StandingsTableRow._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$12;
            case 21:
                abi[] values8 = abi.values();
                values8.getClass();
                return new qq3("com.sofascore.results.league.adapter.StandingsTeamRow.TeamIndicator", (Enum[]) values8);
            case 22:
                cai[] values9 = cai.values();
                values9.getClass();
                return new qq3("com.sofascore.results.league.adapter.StandingsMode", (Enum[]) values9);
            case 23:
                t9i[] values10 = t9i.values();
                values10.getClass();
                return new xg0(new qq3("com.sofascore.results.league.adapter.StandingsColumn", (Enum[]) values10), 0);
            case 24:
                t9i[] values11 = t9i.values();
                values11.getClass();
                return new xg0(new qq3("com.sofascore.results.league.adapter.StandingsColumn", (Enum[]) values11), 0);
            case 25:
                _childSerializers$_anonymous_7 = StatisticsSeasonsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 26:
                _childSerializers$_anonymous_$04 = StatisticsSeasonsResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$04;
            case 27:
                StoriesRepositoryImpl storiesRepositoryImpl = StoriesRepositoryImpl.a;
                return new StoriesRecommendationStrategy(tsl.d);
            case 28:
                return sfi.a;
            default:
                return Unit.a;
        }
    }
}
