package defpackage;

import com.sofascore.model.PlayerTransferFilterData;
import com.sofascore.model.newNetwork.PlayerTeam;
import com.sofascore.model.newNetwork.PlayerTransferUpdatePayload;
import com.sofascore.model.newNetwork.PlayerUniqueTournamentsResponse;
import com.sofascore.model.newNetwork.PlayerUpdatesItem;
import com.sofascore.model.newNetwork.PlayerWithNationalTeam;
import com.sofascore.model.newNetwork.PlayerWithPreviousTeam;
import com.sofascore.model.newNetwork.PlayerYearSummaryResponse;
import com.sofascore.model.newNetwork.PointByPointResponse;
import com.sofascore.model.newNetwork.PointPP;
import com.sofascore.model.newNetwork.PointType;
import com.sofascore.model.newNetwork.PostChatMessage;
import com.sofascore.model.newNetwork.PowerRanking;
import com.sofascore.model.newNetwork.PowerRankingResponse;
import com.sofascore.model.newNetwork.PowerRankingRoundsResponse;
import com.sofascore.model.newNetwork.PowerRankingsGraphDataResponse;
import com.sofascore.model.newNetwork.PredictedEvent;
import com.sofascore.model.profile.ProfileData;
import com.sofascore.model.weeklyChallenge.PopularEventsResponse;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class bxe implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ bxe(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _init_$_anonymous_;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _childSerializers$_anonymous_9;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _init_$_anonymous_2;
        KSerializer _childSerializers$_anonymous_10;
        KSerializer _childSerializers$_anonymous_$04;
        KSerializer _childSerializers$_anonymous_11;
        KSerializer _childSerializers$_anonymous_12;
        KSerializer _childSerializers$_anonymous_13;
        KSerializer _childSerializers$_anonymous_14;
        KSerializer _childSerializers$_anonymous_15;
        KSerializer _childSerializers$_anonymous_16;
        KSerializer _childSerializers$_anonymous_$05;
        KSerializer _childSerializers$_anonymous_17;
        KSerializer _childSerializers$_anonymous_$5;
        KSerializer _childSerializers$_anonymous_$6;
        KSerializer _childSerializers$_anonymous_$7;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_ = PlayerTeam._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 1:
                _childSerializers$_anonymous_2 = PlayerTransferFilterData._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 2:
                _childSerializers$_anonymous_$0 = PlayerTransferFilterData._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 3:
                _childSerializers$_anonymous_$1 = PlayerTransferFilterData._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 4:
                _childSerializers$_anonymous_3 = PlayerTransferUpdatePayload._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 5:
                _childSerializers$_anonymous_$02 = PlayerTransferUpdatePayload._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 6:
                _childSerializers$_anonymous_4 = PlayerUniqueTournamentsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 7:
                _init_$_anonymous_ = PlayerUpdatesItem.Unknown._init_$_anonymous_();
                return _init_$_anonymous_;
            case 8:
                _childSerializers$_anonymous_5 = PlayerWithNationalTeam._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 9:
                _childSerializers$_anonymous_6 = PlayerWithPreviousTeam._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 10:
                _childSerializers$_anonymous_7 = PlayerYearSummaryResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 11:
                return c5n.C();
            case 12:
                _childSerializers$_anonymous_8 = PointByPointResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 13:
                _childSerializers$_anonymous_9 = PointPP._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            case 14:
                _childSerializers$_anonymous_$03 = PointPP._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 15:
                _init_$_anonymous_2 = PointType._init_$_anonymous_();
                return _init_$_anonymous_2;
            case 16:
                _childSerializers$_anonymous_10 = PopularEventsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_10;
            case 17:
                _childSerializers$_anonymous_$04 = PopularEventsResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$04;
            case 18:
                _childSerializers$_anonymous_11 = PostChatMessage._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_11;
            case 19:
                _childSerializers$_anonymous_12 = PowerRanking._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_12;
            case 20:
                _childSerializers$_anonymous_13 = PowerRankingResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_13;
            case 21:
                _childSerializers$_anonymous_14 = PowerRankingRoundsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_14;
            case 22:
                return new u2f(1, "Manchester City", 1, 2236, false, 2);
            case 23:
                _childSerializers$_anonymous_15 = PowerRankingsGraphDataResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_15;
            case 24:
                _childSerializers$_anonymous_16 = PredictedEvent._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_16;
            case 25:
                _childSerializers$_anonymous_$05 = PredictedEvent._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$05;
            case 26:
                _childSerializers$_anonymous_17 = ProfileData._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_17;
            case 27:
                _childSerializers$_anonymous_$5 = ProfileData._childSerializers$_anonymous_$5();
                return _childSerializers$_anonymous_$5;
            case 28:
                _childSerializers$_anonymous_$6 = ProfileData._childSerializers$_anonymous_$6();
                return _childSerializers$_anonymous_$6;
            default:
                _childSerializers$_anonymous_$7 = ProfileData._childSerializers$_anonymous_$7();
                return _childSerializers$_anonymous_$7;
        }
    }
}
