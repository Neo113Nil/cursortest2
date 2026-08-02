package defpackage;

import com.sofascore.model.TvType;
import com.sofascore.model.mvvm.model.UniqueTournamentDetails;
import com.sofascore.model.network.response.Tweet;
import com.sofascore.model.network.response.TweetsResponse;
import com.sofascore.model.network.response.bettingtips.TrendingOddsResponse;
import com.sofascore.model.newNetwork.TrendingGridTile;
import com.sofascore.model.newNetwork.TrendingGridTileSize;
import com.sofascore.model.newNetwork.TrendingGridTileType;
import com.sofascore.model.newNetwork.TrendingGridTilesResponse;
import com.sofascore.model.newNetwork.TvChannelScheduleResponse;
import com.sofascore.model.newNetwork.TvChannelsResponse;
import com.sofascore.model.newNetwork.TvCountryChannelsResponse;
import com.sofascore.model.newNetwork.TyrePeriod;
import com.sofascore.model.newNetwork.UniqueTournamentAwardsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentChampionsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentConference;
import com.sofascore.model.newNetwork.UniqueTournamentDivisionsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentDraftPicksResponse;
import com.sofascore.model.newNetwork.UniqueTournamentDraftYear;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class uzj implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ uzj(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _init_$_anonymous_;
        KSerializer _init_$_anonymous_2;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _init_$_anonymous_3;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _childSerializers$_anonymous_9;
        KSerializer _childSerializers$_anonymous_10;
        KSerializer _childSerializers$_anonymous_11;
        KSerializer _childSerializers$_anonymous_12;
        KSerializer _childSerializers$_anonymous_13;
        KSerializer _childSerializers$_anonymous_$04;
        KSerializer _childSerializers$_anonymous_$12;
        KSerializer _childSerializers$_anonymous_$2;
        KSerializer _childSerializers$_anonymous_$3;
        KSerializer _childSerializers$_anonymous_14;
        KSerializer _childSerializers$_anonymous_15;
        KSerializer _childSerializers$_anonymous_$05;
        KSerializer _childSerializers$_anonymous_16;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_ = TrendingGridTile._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 1:
                _childSerializers$_anonymous_$0 = TrendingGridTile._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 2:
                _init_$_anonymous_ = TrendingGridTileSize._init_$_anonymous_();
                return _init_$_anonymous_;
            case 3:
                _init_$_anonymous_2 = TrendingGridTileType._init_$_anonymous_();
                return _init_$_anonymous_2;
            case 4:
                _childSerializers$_anonymous_2 = TrendingGridTilesResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 5:
                _childSerializers$_anonymous_3 = TrendingOddsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 6:
                _childSerializers$_anonymous_$02 = TrendingOddsResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 7:
                _childSerializers$_anonymous_$1 = TrendingOddsResponse._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 8:
                _childSerializers$_anonymous_4 = TvChannelScheduleResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 9:
                _childSerializers$_anonymous_$03 = TvChannelScheduleResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 10:
                _childSerializers$_anonymous_5 = TvChannelsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 11:
                _childSerializers$_anonymous_6 = TvCountryChannelsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 12:
                _init_$_anonymous_3 = TvType._init_$_anonymous_();
                return _init_$_anonymous_3;
            case 13:
                _childSerializers$_anonymous_7 = Tweet._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 14:
                _childSerializers$_anonymous_8 = TweetsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 15:
                return new a7k();
            case 16:
                return new b7k(null, 16383);
            case 17:
                _childSerializers$_anonymous_9 = TyrePeriod._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            case 18:
                _childSerializers$_anonymous_10 = UniqueTournamentAwardsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_10;
            case 19:
                _childSerializers$_anonymous_11 = UniqueTournamentChampionsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_11;
            case 20:
                _childSerializers$_anonymous_12 = UniqueTournamentConference._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_12;
            case 21:
                _childSerializers$_anonymous_13 = UniqueTournamentDetails._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_13;
            case 22:
                _childSerializers$_anonymous_$04 = UniqueTournamentDetails._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$04;
            case 23:
                _childSerializers$_anonymous_$12 = UniqueTournamentDetails._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$12;
            case 24:
                _childSerializers$_anonymous_$2 = UniqueTournamentDetails._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
            case 25:
                _childSerializers$_anonymous_$3 = UniqueTournamentDetails._childSerializers$_anonymous_$3();
                return _childSerializers$_anonymous_$3;
            case 26:
                _childSerializers$_anonymous_14 = UniqueTournamentDivisionsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_14;
            case 27:
                _childSerializers$_anonymous_15 = UniqueTournamentDraftPicksResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_15;
            case 28:
                _childSerializers$_anonymous_$05 = UniqueTournamentDraftPicksResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$05;
            default:
                _childSerializers$_anonymous_16 = UniqueTournamentDraftYear._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_16;
        }
    }
}
