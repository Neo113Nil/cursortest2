package defpackage;

import androidx.compose.runtime.e;
import com.inmobi.media.Oi;
import com.inmobi.media.P2;
import com.sofascore.model.mvvm.model.OffersBannerResponse;
import com.sofascore.model.mvvm.model.OtherEvent;
import com.sofascore.model.network.response.OtherPlayerEventStatistics;
import com.sofascore.model.network.response.playerOfTheSeason.POTSHighestRatedPlayersAvailableYears;
import com.sofascore.model.network.response.playerOfTheSeason.POTSHighestRatedPlayersResponse;
import com.sofascore.model.network.response.playerOfTheSeason.POTSLeagueTopPlayersResponse;
import com.sofascore.model.network.response.playerOfTheSeason.POTSMostAwardsResponse;
import com.sofascore.model.network.response.playerOfTheSeason.POTSNetworkPlayer;
import com.sofascore.model.network.response.playerOfTheSeason.POTSPlayerAwardsResponse;
import com.sofascore.model.network.response.playerOfTheSeason.POTSTopCompetitionNetworkItem;
import com.sofascore.model.newNetwork.OddsProvidersResponse;
import com.sofascore.model.newNetwork.OrderedSportsResponse;
import com.sofascore.model.odds.OddsCountryProvider;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ild implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ild(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_$2;
        KSerializer _childSerializers$_anonymous_$3;
        KSerializer _childSerializers$_anonymous_$4;
        KSerializer _init_$_anonymous_;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _childSerializers$_anonymous_9;
        KSerializer _childSerializers$_anonymous_10;
        KSerializer _childSerializers$_anonymous_11;
        KSerializer _childSerializers$_anonymous_12;
        switch (this.a) {
            case 0:
                return l6g.K(new dld(false, new m9k("1"), 1, "1/5", "https://www.sofascore.com", null), new dld(false, new m9k("X"), -1, "3/20", "https://www.sofascore.com", null), new dld(false, new m9k("2"), 0, "4/50", "https://www.sofascore.com", null));
            case 1:
                _childSerializers$_anonymous_ = OddsCountryProvider._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 2:
                _childSerializers$_anonymous_2 = OddsProvidersResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 3:
                _childSerializers$_anonymous_3 = OffersBannerResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 4:
                return Oi.a();
            case 5:
                return new gh2(new jod());
            case 6:
                return e.f(Boolean.TRUE);
            case 7:
                xsd.c.getClass();
                return Integer.valueOf(((xsd) CollectionsKt.h0(xsd.f)).a);
            case 8:
                return new qq3("com.sofascore.results.onboarding.navigation.OnboardingRoute.Intro", hsd.INSTANCE, new Annotation[0]);
            case 9:
                return new qq3("com.sofascore.results.onboarding.navigation.OnboardingRoute.Notifications", isd.INSTANCE, new Annotation[0]);
            case 10:
                return new qq3("com.sofascore.results.onboarding.navigation.OnboardingRoute.SelectFavorites", jsd.INSTANCE, new Annotation[0]);
            case 11:
                return Unit.a;
            case 12:
                return e.f(Boolean.FALSE);
            case 13:
                _childSerializers$_anonymous_4 = OrderedSportsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 14:
                _childSerializers$_anonymous_5 = OtherEvent._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 15:
                _childSerializers$_anonymous_$0 = OtherEvent._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 16:
                _childSerializers$_anonymous_$1 = OtherEvent._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 17:
                _childSerializers$_anonymous_$2 = OtherEvent._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
            case 18:
                _childSerializers$_anonymous_$3 = OtherEvent._childSerializers$_anonymous_$3();
                return _childSerializers$_anonymous_$3;
            case 19:
                _childSerializers$_anonymous_$4 = OtherEvent._childSerializers$_anonymous_$4();
                return _childSerializers$_anonymous_$4;
            case 20:
                _init_$_anonymous_ = OtherPlayerEventStatistics._init_$_anonymous_();
                return _init_$_anonymous_;
            case 21:
                return new kyd();
            case 22:
                return P2.b();
            case 23:
                _childSerializers$_anonymous_6 = POTSHighestRatedPlayersAvailableYears._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 24:
                _childSerializers$_anonymous_7 = POTSHighestRatedPlayersResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 25:
                _childSerializers$_anonymous_8 = POTSLeagueTopPlayersResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 26:
                _childSerializers$_anonymous_9 = POTSMostAwardsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            case 27:
                _childSerializers$_anonymous_10 = POTSNetworkPlayer._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_10;
            case 28:
                _childSerializers$_anonymous_11 = POTSPlayerAwardsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_11;
            default:
                _childSerializers$_anonymous_12 = POTSTopCompetitionNetworkItem._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_12;
        }
    }
}
