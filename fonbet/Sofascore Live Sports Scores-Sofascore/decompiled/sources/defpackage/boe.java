package defpackage;

import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.network.response.PlayerEventStatisticsResponse;
import com.sofascore.model.network.response.PlayerOrTeam;
import com.sofascore.model.network.response.PlayerSeasonShotActionsResponse;
import com.sofascore.model.newNetwork.PlayerEventsListResponse;
import com.sofascore.model.newNetwork.PlayerHeatmapResponse;
import com.sofascore.model.newNetwork.PlayerHistoricalRating;
import com.sofascore.model.newNetwork.PlayerInjuryUpdatePayload;
import com.sofascore.model.newNetwork.PlayerLastRatingsResponse;
import com.sofascore.model.newNetwork.PlayerOfTheSeasonResponse;
import com.sofascore.model.newNetwork.PlayerPenaltyHistoryResponse;
import com.sofascore.model.newNetwork.PlayerSeasonHeatMapResponse;
import com.sofascore.model.newNetwork.PlayerSeasonRatingsResponse;
import com.sofascore.model.newNetwork.PlayerShotmapResponse;
import com.sofascore.model.newNetwork.statistics.PlayerHand;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerSeasonStatisticsInfo;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerSeasonStatisticsResponse;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class boe implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ boe(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_$2;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _childSerializers$_anonymous_$12;
        KSerializer _childSerializers$_anonymous_$22;
        KSerializer _childSerializers$_anonymous_$3;
        KSerializer _init_$_anonymous_;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _childSerializers$_anonymous_9;
        KSerializer _childSerializers$_anonymous_10;
        KSerializer _childSerializers$_anonymous_11;
        KSerializer _childSerializers$_anonymous_12;
        KSerializer _childSerializers$_anonymous_13;
        KSerializer _childSerializers$_anonymous_14;
        KSerializer _childSerializers$_anonymous_$04;
        KSerializer _childSerializers$_anonymous_15;
        KSerializer _childSerializers$_anonymous_$05;
        KSerializer _childSerializers$_anonymous_16;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_ = PlayerData._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 1:
                _childSerializers$_anonymous_$0 = PlayerData._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 2:
                _childSerializers$_anonymous_$1 = PlayerData._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 3:
                _childSerializers$_anonymous_$2 = PlayerData._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
            case 4:
                return c5n.C();
            case 5:
                _childSerializers$_anonymous_2 = PlayerEventStatisticsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 6:
                _childSerializers$_anonymous_$02 = PlayerEventStatisticsResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 7:
                yzd yzdVar = fqe.B;
                return new ozd();
            case 8:
                _childSerializers$_anonymous_3 = PlayerEventsListResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 9:
                _childSerializers$_anonymous_$03 = PlayerEventsListResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 10:
                _childSerializers$_anonymous_$12 = PlayerEventsListResponse._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$12;
            case 11:
                _childSerializers$_anonymous_$22 = PlayerEventsListResponse._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$22;
            case 12:
                _childSerializers$_anonymous_$3 = PlayerEventsListResponse._childSerializers$_anonymous_$3();
                return _childSerializers$_anonymous_$3;
            case 13:
                _init_$_anonymous_ = PlayerHand._init_$_anonymous_();
                return _init_$_anonymous_;
            case 14:
                _childSerializers$_anonymous_4 = PlayerHeatmapResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 15:
                _childSerializers$_anonymous_5 = PlayerHistoricalRating._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 16:
                _childSerializers$_anonymous_6 = PlayerInjuryUpdatePayload._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 17:
                _childSerializers$_anonymous_7 = PlayerLastRatingsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 18:
                _childSerializers$_anonymous_8 = PlayerOfTheSeasonResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 19:
                _childSerializers$_anonymous_9 = PlayerOrTeam._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            case 20:
                _childSerializers$_anonymous_10 = PlayerPenaltyHistoryResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_10;
            case 21:
                _childSerializers$_anonymous_11 = PlayerSeasonHeatMapResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_11;
            case 22:
                return c5n.C();
            case 23:
                _childSerializers$_anonymous_12 = PlayerSeasonRatingsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_12;
            case 24:
                _childSerializers$_anonymous_13 = PlayerSeasonShotActionsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_13;
            case 25:
                _childSerializers$_anonymous_14 = PlayerSeasonStatisticsInfo._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_14;
            case 26:
                _childSerializers$_anonymous_$04 = PlayerSeasonStatisticsInfo._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$04;
            case 27:
                _childSerializers$_anonymous_15 = PlayerSeasonStatisticsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_15;
            case 28:
                _childSerializers$_anonymous_$05 = PlayerSeasonStatisticsResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$05;
            default:
                _childSerializers$_anonymous_16 = PlayerShotmapResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_16;
        }
    }
}
