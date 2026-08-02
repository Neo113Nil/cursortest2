package defpackage;

import com.sofascore.model.crowdsourcing.CrowdsourcingContribution;
import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.model.crowdsourcing.CrowdsourcingSuggestRequest;
import com.sofascore.model.cuptree.CupTree;
import com.sofascore.model.cuptree.CupTreeBlock;
import com.sofascore.model.cuptree.CupTreeParticipant;
import com.sofascore.model.cuptree.CupTreeRound;
import com.sofascore.model.cuptree.CupTreesResponse;
import com.sofascore.model.mvvm.model.DartsEvent;
import com.sofascore.model.newNetwork.DailyStages;
import com.sofascore.model.newNetwork.topperformance.response.CricketTopPlayerStatistics;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class g14 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ g14(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_$5;
        KSerializer _childSerializers$_anonymous_$6;
        KSerializer _childSerializers$_anonymous_$7;
        KSerializer _childSerializers$_anonymous_$8;
        KSerializer _childSerializers$_anonymous_$9;
        KSerializer _childSerializers$_anonymous_$10;
        KSerializer _childSerializers$_anonymous_$11;
        KSerializer _childSerializers$_anonymous_$12;
        KSerializer _childSerializers$_anonymous_$13;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_$2;
        KSerializer _childSerializers$_anonymous_$3;
        KSerializer _childSerializers$_anonymous_;
        KSerializer _init_$_anonymous_;
        KSerializer _init_$_anonymous_2;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _childSerializers$_anonymous_9;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _childSerializers$_anonymous_$14;
        KSerializer _childSerializers$_anonymous_$22;
        KSerializer _childSerializers$_anonymous_$32;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_$5 = CricketTopPlayerStatistics._childSerializers$_anonymous_$5();
                return _childSerializers$_anonymous_$5;
            case 1:
                _childSerializers$_anonymous_$6 = CricketTopPlayerStatistics._childSerializers$_anonymous_$6();
                return _childSerializers$_anonymous_$6;
            case 2:
                _childSerializers$_anonymous_$7 = CricketTopPlayerStatistics._childSerializers$_anonymous_$7();
                return _childSerializers$_anonymous_$7;
            case 3:
                _childSerializers$_anonymous_$8 = CricketTopPlayerStatistics._childSerializers$_anonymous_$8();
                return _childSerializers$_anonymous_$8;
            case 4:
                _childSerializers$_anonymous_$9 = CricketTopPlayerStatistics._childSerializers$_anonymous_$9();
                return _childSerializers$_anonymous_$9;
            case 5:
                _childSerializers$_anonymous_$10 = CricketTopPlayerStatistics._childSerializers$_anonymous_$10();
                return _childSerializers$_anonymous_$10;
            case 6:
                _childSerializers$_anonymous_$11 = CricketTopPlayerStatistics._childSerializers$_anonymous_$11();
                return _childSerializers$_anonymous_$11;
            case 7:
                _childSerializers$_anonymous_$12 = CricketTopPlayerStatistics._childSerializers$_anonymous_$12();
                return _childSerializers$_anonymous_$12;
            case 8:
                _childSerializers$_anonymous_$13 = CricketTopPlayerStatistics._childSerializers$_anonymous_$13();
                return _childSerializers$_anonymous_$13;
            case 9:
                _childSerializers$_anonymous_$0 = CricketTopPlayerStatistics._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 10:
                _childSerializers$_anonymous_$1 = CricketTopPlayerStatistics._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 11:
                _childSerializers$_anonymous_$2 = CricketTopPlayerStatistics._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
            case 12:
                _childSerializers$_anonymous_$3 = CricketTopPlayerStatistics._childSerializers$_anonymous_$3();
                return _childSerializers$_anonymous_$3;
            case 13:
                _childSerializers$_anonymous_ = CrowdsourcingContribution._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 14:
                _init_$_anonymous_ = CrowdsourcingIncidentType.Card._init_$_anonymous_();
                return _init_$_anonymous_;
            case 15:
                _init_$_anonymous_2 = CrowdsourcingIncidentType.Goal._init_$_anonymous_();
                return _init_$_anonymous_2;
            case 16:
                _childSerializers$_anonymous_2 = CrowdsourcingSuggestRequest._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 17:
                _childSerializers$_anonymous_3 = CupTree._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 18:
                _childSerializers$_anonymous_4 = CupTreeBlock._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 19:
                _childSerializers$_anonymous_$02 = CupTreeBlock._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 20:
                return new gj5(0, "Barcelona", "Real Madrid Sociedad de Espana", 2817, 2829, "2", "1", 1, false, false, true, true, false, null, null, null, null, null, null, null, l6g.K(14083562), "10.5.2025.", false, false, false, 63959041);
            case 21:
                _childSerializers$_anonymous_5 = CupTreeParticipant._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 22:
                _childSerializers$_anonymous_6 = CupTreeRound._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 23:
                _childSerializers$_anonymous_7 = CupTreesResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 24:
                _childSerializers$_anonymous_8 = DailyStages._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 25:
                _childSerializers$_anonymous_9 = DartsEvent._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            case 26:
                _childSerializers$_anonymous_$03 = DartsEvent._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 27:
                _childSerializers$_anonymous_$14 = DartsEvent._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$14;
            case 28:
                _childSerializers$_anonymous_$22 = DartsEvent._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$22;
            default:
                _childSerializers$_anonymous_$32 = DartsEvent._childSerializers$_anonymous_$3();
                return _childSerializers$_anonymous_$32;
        }
    }
}
