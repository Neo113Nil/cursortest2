package defpackage;

import androidx.compose.runtime.e;
import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.mvvm.model.EventChanges;
import com.sofascore.model.mvvm.model.EventFunFact;
import com.sofascore.model.network.response.EventInningsResponse;
import com.sofascore.model.network.response.EventStatisticsGroup;
import com.sofascore.model.network.response.EventStatisticsItem;
import com.sofascore.model.network.response.EventStatisticsPeriod;
import com.sofascore.model.network.response.EventStatisticsResponse;
import com.sofascore.model.newNetwork.EventChildEventsResponse;
import com.sofascore.model.newNetwork.EventGraphResponse;
import com.sofascore.model.newNetwork.EventGraphSequenceResponse;
import com.sofascore.model.newNetwork.EventIdsResponse;
import com.sofascore.model.newNetwork.EventIncidentsResponse;
import com.sofascore.model.newNetwork.EventListResponse;
import com.sofascore.model.newNetwork.EventMediaNewsResponse;
import com.sofascore.model.newNetwork.EventSeriesResponse;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class qt5 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ qt5(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _childSerializers$_anonymous_9;
        KSerializer _childSerializers$_anonymous_10;
        KSerializer _childSerializers$_anonymous_11;
        KSerializer _childSerializers$_anonymous_12;
        KSerializer _childSerializers$_anonymous_13;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _childSerializers$_anonymous_14;
        KSerializer _childSerializers$_anonymous_15;
        KSerializer _childSerializers$_anonymous_16;
        KSerializer _childSerializers$_anonymous_17;
        KSerializer _childSerializers$_anonymous_$04;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_18;
        KSerializer _childSerializers$_anonymous_$05;
        KSerializer _childSerializers$_anonymous_$12;
        KSerializer _childSerializers$_anonymous_19;
        KSerializer _childSerializers$_anonymous_20;
        switch (this.a) {
            case 0:
                return new j29(Integer.valueOf(R.drawable.no_statistics), Integer.valueOf(R.string.no_statistics), Integer.valueOf(R.string.no_statistics_text), 497);
            case 1:
                _childSerializers$_anonymous_ = EventChanges._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 2:
                _childSerializers$_anonymous_2 = EventChildEventsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 3:
                _childSerializers$_anonymous_3 = EventFunFact._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 4:
                _childSerializers$_anonymous_$0 = EventFunFact._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 5:
                _childSerializers$_anonymous_4 = EventGraphResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 6:
                _childSerializers$_anonymous_5 = EventGraphSequenceResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 7:
                _childSerializers$_anonymous_6 = EventIdsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 8:
                _childSerializers$_anonymous_7 = EventIncidentsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 9:
                _childSerializers$_anonymous_$02 = EventIncidentsResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 10:
                _childSerializers$_anonymous_8 = EventInningsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 11:
                _childSerializers$_anonymous_9 = EventListResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            case 12:
                _childSerializers$_anonymous_10 = EventMediaNewsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_10;
            case 13:
                return e.c(-1);
            case 14:
                return e.c(-1);
            case 15:
                _childSerializers$_anonymous_11 = EventSeriesResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_11;
            case 16:
                _childSerializers$_anonymous_12 = EventStatisticsGroup._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_12;
            case 17:
                _childSerializers$_anonymous_13 = EventStatisticsItem._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_13;
            case 18:
                _childSerializers$_anonymous_$03 = EventStatisticsItem._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 19:
                _childSerializers$_anonymous_14 = EventStatisticsPeriod._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_14;
            case 20:
                _childSerializers$_anonymous_15 = EventStatisticsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_15;
            case 21:
                _childSerializers$_anonymous_16 = EventSuggest.FinalScoreSuggest._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_16;
            case 22:
                _childSerializers$_anonymous_17 = EventSuggest.IncidentSuggest.CardSuggest._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_17;
            case 23:
                _childSerializers$_anonymous_$04 = EventSuggest.IncidentSuggest.CardSuggest._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$04;
            case 24:
                _childSerializers$_anonymous_$1 = EventSuggest.IncidentSuggest.CardSuggest._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 25:
                _childSerializers$_anonymous_18 = EventSuggest.IncidentSuggest.GoalSuggest._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_18;
            case 26:
                _childSerializers$_anonymous_$05 = EventSuggest.IncidentSuggest.GoalSuggest._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$05;
            case 27:
                _childSerializers$_anonymous_$12 = EventSuggest.IncidentSuggest.GoalSuggest._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$12;
            case 28:
                _childSerializers$_anonymous_19 = EventSuggest.StartDateSuggest._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_19;
            default:
                _childSerializers$_anonymous_20 = EventSuggest.StatusSuggest._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_20;
        }
    }
}
