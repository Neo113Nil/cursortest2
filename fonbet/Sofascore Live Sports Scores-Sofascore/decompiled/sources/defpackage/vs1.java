package defpackage;

import android.graphics.BlurMaskFilter;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerButtonsStyle;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerButtonsStyle;
import com.sofascore.local_persistance.Brand$Companion$ADAPTER$1;
import com.sofascore.local_persistance.BrandingConfig$Companion$ADAPTER$1;
import com.sofascore.model.buzzer.BuzzerTilesResponse;
import com.sofascore.model.mvvm.model.bettingtips.BetBoost;
import com.sofascore.model.network.response.bettingtips.BetBoostsResponse;
import com.sofascore.model.newNetwork.CareerHistory;
import com.sofascore.model.newNetwork.CareerHistoryResponse;
import com.sofascore.model.newNetwork.topperformance.response.BasketballTopTeamsStatistics;
import com.squareup.wire.ProtoAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class vs1 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ vs1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_$6;
        KSerializer _childSerializers$_anonymous_$7;
        KSerializer _childSerializers$_anonymous_$8;
        KSerializer _childSerializers$_anonymous_$10;
        KSerializer _childSerializers$_anonymous_$11;
        KSerializer _childSerializers$_anonymous_$12;
        KSerializer _childSerializers$_anonymous_$13;
        KSerializer _childSerializers$_anonymous_$14;
        KSerializer _childSerializers$_anonymous_$15;
        KSerializer _childSerializers$_anonymous_$16;
        KSerializer _childSerializers$_anonymous_$17;
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        Object bottomStackOrder$lambda$1;
        Object _init_$lambda$0;
        Unit unit;
        Object _init_$lambda$02;
        Object topStackOrder$lambda$1;
        ProtoAdapter standingsTextAdapter_delegate$lambda$0;
        ProtoAdapter teamsAdapter_delegate$lambda$0;
        ProtoAdapter uniqueTournamentsAdapter_delegate$lambda$1;
        ProtoAdapter oddsTabAdapter_delegate$lambda$2;
        ProtoAdapter fantasyCompetitionsAdapter_delegate$lambda$3;
        ProtoAdapter featuredUniqueTournamentsAdapter_delegate$lambda$4;
        ProtoAdapter boostedOddsEventsAdapter_delegate$lambda$5;
        ProtoAdapter partnerEventsAdapter_delegate$lambda$6;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_$6 = BasketballTopTeamsStatistics._childSerializers$_anonymous_$6();
                return _childSerializers$_anonymous_$6;
            case 1:
                _childSerializers$_anonymous_$7 = BasketballTopTeamsStatistics._childSerializers$_anonymous_$7();
                return _childSerializers$_anonymous_$7;
            case 2:
                _childSerializers$_anonymous_$8 = BasketballTopTeamsStatistics._childSerializers$_anonymous_$8();
                return _childSerializers$_anonymous_$8;
            case 3:
                _childSerializers$_anonymous_$10 = BasketballTopTeamsStatistics._childSerializers$_anonymous_$10();
                return _childSerializers$_anonymous_$10;
            case 4:
                _childSerializers$_anonymous_$11 = BasketballTopTeamsStatistics._childSerializers$_anonymous_$11();
                return _childSerializers$_anonymous_$11;
            case 5:
                _childSerializers$_anonymous_$12 = BasketballTopTeamsStatistics._childSerializers$_anonymous_$12();
                return _childSerializers$_anonymous_$12;
            case 6:
                _childSerializers$_anonymous_$13 = BasketballTopTeamsStatistics._childSerializers$_anonymous_$13();
                return _childSerializers$_anonymous_$13;
            case 7:
                _childSerializers$_anonymous_$14 = BasketballTopTeamsStatistics._childSerializers$_anonymous_$14();
                return _childSerializers$_anonymous_$14;
            case 8:
                _childSerializers$_anonymous_$15 = BasketballTopTeamsStatistics._childSerializers$_anonymous_$15();
                return _childSerializers$_anonymous_$15;
            case 9:
                _childSerializers$_anonymous_$16 = BasketballTopTeamsStatistics._childSerializers$_anonymous_$16();
                return _childSerializers$_anonymous_$16;
            case 10:
                _childSerializers$_anonymous_$17 = BasketballTopTeamsStatistics._childSerializers$_anonymous_$17();
                return _childSerializers$_anonymous_$17;
            case 11:
                _childSerializers$_anonymous_ = BetBoost._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 12:
                _childSerializers$_anonymous_2 = BetBoostsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 13:
                bottomStackOrder$lambda$1 = BlazeMomentsPlayerButtonsStyle.setBottomStackOrder$lambda$1();
                return bottomStackOrder$lambda$1;
            case 14:
                _init_$lambda$0 = BlazeMomentsPlayerButtonsStyle._init_$lambda$0();
                return _init_$lambda$0;
            case 15:
                unit = Unit.a;
                return unit;
            case 16:
                _init_$lambda$02 = BlazeStoryPlayerButtonsStyle._init_$lambda$0();
                return _init_$lambda$02;
            case 17:
                topStackOrder$lambda$1 = BlazeStoryPlayerButtonsStyle.setTopStackOrder$lambda$1();
                return topStackOrder$lambda$1;
            case 18:
                return new BlurMaskFilter(25.0f, BlurMaskFilter.Blur.NORMAL);
            case 19:
                standingsTextAdapter_delegate$lambda$0 = Brand$Companion$ADAPTER$1.standingsTextAdapter_delegate$lambda$0();
                return standingsTextAdapter_delegate$lambda$0;
            case 20:
                teamsAdapter_delegate$lambda$0 = BrandingConfig$Companion$ADAPTER$1.teamsAdapter_delegate$lambda$0();
                return teamsAdapter_delegate$lambda$0;
            case 21:
                uniqueTournamentsAdapter_delegate$lambda$1 = BrandingConfig$Companion$ADAPTER$1.uniqueTournamentsAdapter_delegate$lambda$1();
                return uniqueTournamentsAdapter_delegate$lambda$1;
            case 22:
                oddsTabAdapter_delegate$lambda$2 = BrandingConfig$Companion$ADAPTER$1.oddsTabAdapter_delegate$lambda$2();
                return oddsTabAdapter_delegate$lambda$2;
            case 23:
                fantasyCompetitionsAdapter_delegate$lambda$3 = BrandingConfig$Companion$ADAPTER$1.fantasyCompetitionsAdapter_delegate$lambda$3();
                return fantasyCompetitionsAdapter_delegate$lambda$3;
            case 24:
                featuredUniqueTournamentsAdapter_delegate$lambda$4 = BrandingConfig$Companion$ADAPTER$1.featuredUniqueTournamentsAdapter_delegate$lambda$4();
                return featuredUniqueTournamentsAdapter_delegate$lambda$4;
            case 25:
                boostedOddsEventsAdapter_delegate$lambda$5 = BrandingConfig$Companion$ADAPTER$1.boostedOddsEventsAdapter_delegate$lambda$5();
                return boostedOddsEventsAdapter_delegate$lambda$5;
            case 26:
                partnerEventsAdapter_delegate$lambda$6 = BrandingConfig$Companion$ADAPTER$1.partnerEventsAdapter_delegate$lambda$6();
                return partnerEventsAdapter_delegate$lambda$6;
            case 27:
                _childSerializers$_anonymous_3 = BuzzerTilesResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 28:
                _childSerializers$_anonymous_4 = CareerHistory._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            default:
                _childSerializers$_anonymous_5 = CareerHistoryResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
        }
    }
}
