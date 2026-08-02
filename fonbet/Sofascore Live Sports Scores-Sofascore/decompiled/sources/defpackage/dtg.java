package defpackage;

import com.sofascore.model.branding.ServerBrandingConfig;
import com.sofascore.model.mvvm.model.Score;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.ServableEvent;
import com.sofascore.model.network.response.SearchResponse;
import com.sofascore.model.network.response.SeasonEventData;
import com.sofascore.model.network.response.SeasonPlayersData;
import com.sofascore.model.network.response.SeasonShotActionAreaResponse;
import com.sofascore.model.newNetwork.SearchManagersResponse;
import com.sofascore.model.newNetwork.SearchPlayersResponse;
import com.sofascore.model.newNetwork.SearchTeamsResponse;
import com.sofascore.model.newNetwork.SearchTournamentsResponse;
import com.sofascore.model.newNetwork.SearchVenuesResponse;
import com.sofascore.model.newNetwork.SeasonDaysWithEventsResponse;
import com.sofascore.model.newNetwork.SeasonHighlightedComparison;
import com.sofascore.model.newNetwork.SeasonInfo;
import com.sofascore.model.newNetwork.SeasonStatisticsResponse;
import com.sofascore.results.view.graph.SeasonRatingGraph;
import java.util.Calendar;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class dtg implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ dtg(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _childSerializers$_anonymous_9;
        KSerializer _childSerializers$_anonymous_10;
        KSerializer _childSerializers$_anonymous_11;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_12;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_$2;
        KSerializer _childSerializers$_anonymous_$3;
        KSerializer _childSerializers$_anonymous_$4;
        KSerializer _childSerializers$_anonymous_13;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _childSerializers$_anonymous_14;
        KSerializer _childSerializers$_anonymous_15;
        KSerializer _init_$_anonymous_;
        KSerializer _childSerializers$_anonymous_16;
        KSerializer _childSerializers$_anonymous_$04;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_ = Score._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 1:
                return new qug(0);
            case 2:
                _childSerializers$_anonymous_2 = SearchManagersResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 3:
                _childSerializers$_anonymous_3 = SearchPlayersResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 4:
                _childSerializers$_anonymous_4 = SearchResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 5:
                _childSerializers$_anonymous_5 = SearchTeamsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 6:
                _childSerializers$_anonymous_6 = SearchTournamentsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 7:
                _childSerializers$_anonymous_7 = SearchVenuesResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 8:
                _childSerializers$_anonymous_8 = Season._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 9:
                return new hyg();
            case 10:
                _childSerializers$_anonymous_9 = SeasonDaysWithEventsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            case 11:
                _childSerializers$_anonymous_10 = SeasonEventData._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_10;
            case 12:
                _childSerializers$_anonymous_11 = SeasonHighlightedComparison._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_11;
            case 13:
                _childSerializers$_anonymous_$0 = SeasonHighlightedComparison._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 14:
                _childSerializers$_anonymous_12 = SeasonInfo._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_12;
            case 15:
                _childSerializers$_anonymous_$02 = SeasonInfo._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 16:
                _childSerializers$_anonymous_$1 = SeasonInfo._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 17:
                _childSerializers$_anonymous_$2 = SeasonInfo._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
            case 18:
                _childSerializers$_anonymous_$3 = SeasonInfo._childSerializers$_anonymous_$3();
                return _childSerializers$_anonymous_$3;
            case 19:
                _childSerializers$_anonymous_$4 = SeasonInfo._childSerializers$_anonymous_$4();
                return _childSerializers$_anonymous_$4;
            case 20:
                _childSerializers$_anonymous_13 = SeasonPlayersData._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_13;
            case 21:
                _childSerializers$_anonymous_$03 = SeasonPlayersData._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 22:
                int i = SeasonRatingGraph.B;
                Calendar calendar = Calendar.getInstance();
                calendar.add(2, -11);
                calendar.set(5, calendar.getActualMinimum(5));
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                return calendar;
            case 23:
                int i2 = SeasonRatingGraph.B;
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(5, calendar2.getActualMaximum(5));
                calendar2.add(5, 1);
                calendar2.set(11, 0);
                calendar2.set(12, 0);
                calendar2.set(13, 0);
                calendar2.set(14, 0);
                return calendar2;
            case 24:
                _childSerializers$_anonymous_14 = SeasonShotActionAreaResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_14;
            case 25:
                _childSerializers$_anonymous_15 = SeasonStatisticsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_15;
            case 26:
                return null;
            case 27:
                _init_$_anonymous_ = ServableEvent._init_$_anonymous_();
                return _init_$_anonymous_;
            case 28:
                _childSerializers$_anonymous_16 = ServerBrandingConfig._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_16;
            default:
                _childSerializers$_anonymous_$04 = ServerBrandingConfig._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$04;
        }
    }
}
