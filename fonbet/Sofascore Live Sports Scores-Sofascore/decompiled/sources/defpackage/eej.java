package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.model.newNetwork.TimezoneEventsInfo;
import com.sofascore.model.newNetwork.TopFollowedPlayerInfo;
import com.sofascore.model.newNetwork.TopFollowedPlayersResponse;
import com.sofascore.model.newNetwork.TopPerformerData;
import com.sofascore.model.newNetwork.TournamentSeasonsResponse;
import com.sofascore.model.newNetwork.TournamentsForDateResponse;
import com.sofascore.model.newNetwork.TransferHistoryResponse;
import com.sofascore.model.newNetwork.TransfersResponse;
import com.sofascore.model.newNetwork.topperformance.response.TopPerformanceStatistics;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.TopPlayersStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.TopTeamsStatisticsItem;
import com.sofascore.results.R;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class eej implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ eej(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _init_$_anonymous_;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _childSerializers$_anonymous_9;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _childSerializers$_anonymous_10;
        KSerializer _childSerializers$_anonymous_11;
        switch (this.a) {
            case 0:
                return new r6a(0L);
            case 1:
                return new a0f(duf.a.getOrCreateKotlinClass(r9k.class), new Annotation[0]);
            case 2:
                return gt4.a;
            case 3:
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
                if (StringsKt.R("kotlinx.datetime.TimeBased")) {
                    a70.p("Blank serial names are prohibited");
                    return null;
                }
                vv2 vv2Var = new vv2("kotlinx.datetime.TimeBased");
                km5 km5Var = km5.a;
                lkb lkbVar = lkb.a;
                vv2Var.a("nanoseconds", lkb.b, km5Var, false);
                Unit unit = Unit.a;
                return new m5h("kotlinx.datetime.TimeBased", nii.f, vv2Var.c.size(), ph0.X(serialDescriptorArr), vv2Var);
            case 4:
                _childSerializers$_anonymous_ = TimezoneEventsInfo._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 5:
                _childSerializers$_anonymous_$0 = TimezoneEventsInfo._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 6:
                _childSerializers$_anonymous_2 = TopFollowedPlayerInfo._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 7:
                _childSerializers$_anonymous_3 = TopFollowedPlayersResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 8:
                _init_$_anonymous_ = TopPerformanceStatistics._init_$_anonymous_();
                return _init_$_anonymous_;
            case 9:
                _childSerializers$_anonymous_4 = TopPerformerData._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 10:
                _childSerializers$_anonymous_5 = TopPlayersStatisticsItem._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 11:
                _childSerializers$_anonymous_$02 = TopPlayersStatisticsItem._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 12:
                return Unit.a;
            case 13:
                return Unit.a;
            case 14:
                return Unit.a;
            case 15:
                return Unit.a;
            case 16:
                _childSerializers$_anonymous_6 = TopTeamsStatisticsItem._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 17:
                Gender gender = Gender.Male;
                return new prj(l6g.K(new xrj(1234, "Novak Djokovic", gender, "2025", null, R.string.basketball_title_holder, R.plurals.tennis_number_of_titles, 16), new xrj(1234, "Carlos Alcaraz", gender, "2024", null, R.string.basketball_title_holder, R.plurals.tennis_number_of_titles, 16), new xrj(1234, "Goran Ivanisevic", gender, "2023", null, R.string.basketball_title_holder, R.plurals.tennis_number_of_titles, 16), new xrj(1234, "Roger Federer", gender, "2022", null, R.string.basketball_title_holder, R.plurals.tennis_number_of_titles, 16)), l6g.K(new xrj(1234, "Novak Djokovic", gender, null, 8, R.string.basketball_title_holder, R.plurals.tennis_number_of_titles, 8), new xrj(1234, "Roger Federer", gender, null, 8, R.string.basketball_title_holder, R.plurals.tennis_number_of_titles, 8)), R.string.basketball_titles, R.string.basketball_most_titles);
            case 18:
                return Unit.a;
            case 19:
                _childSerializers$_anonymous_7 = TournamentSeasonsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 20:
                _childSerializers$_anonymous_8 = TournamentsForDateResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 21:
                return l6g.K(new huj(1, "Manchester City"), new huj(2, "Real Madrid"), new huj(3, "Bayern Munich"), new huj(4, "FC Barcelona"));
            case 22:
                return l6g.K(new k0j(new huj(1, "Manchester City"), l6g.W(b.j(3, 2, 1, 1, 1, 2, 1)), 2, l6g.K(new wtj(1, new huj(1, "Manchester City"), new huj(5, "Liverpool"), StatusKt.STATUS_FINISHED, 2, 1, 1, Sports.FOOTBALL)), false), new k0j(new huj(2, "Real Madrid"), l6g.W(b.j(1, 1, 2, 3, 4, 3, 2)), 3, l6g.K(new wtj(2, new huj(2, "Real Madrid"), new huj(6, "Atletico Madrid"), StatusKt.STATUS_FINISHED, 1, 0, 1, Sports.FOOTBALL)), false));
            case 23:
                return l6g.K(new k0j(new huj(1, "Manchester City"), l6g.W(b.j(3, 2, 1, 1, 1, 2, 1)), 2, l6g.K(new wtj(1, new huj(1, "Manchester City"), new huj(5, "Liverpool"), StatusKt.STATUS_FINISHED, 2, 1, 1, Sports.FOOTBALL)), false), new k0j(new huj(2, "Real Madrid"), l6g.W(b.j(1, 1, 2, 3, 4, 3, 2)), 3, l6g.K(new wtj(2, new huj(2, "Real Madrid"), new huj(6, "Atletico Madrid"), StatusKt.STATUS_FINISHED, 1, 0, 1, Sports.FOOTBALL)), false));
            case 24:
                return l6g.K(new huj(1, "Manchester City"), new huj(2, "Real Madrid"), new huj(3, "Bayern Munich"), new huj(4, "FC Barcelona"));
            case 25:
                huj hujVar = new huj(1, "Manchester City");
                gv9 W = l6g.W(b.j(3, 2, 1, 1, 1, 2, 1));
                rlh rlhVar = rlh.b;
                return l6g.K(new k0j(hujVar, W, 2, rlhVar, false), new k0j(new huj(2, "Real Madrid"), l6g.W(b.j(1, 1, 2, 3, 4, 3, 2)), 3, rlhVar, false));
            case 26:
                _childSerializers$_anonymous_9 = Transfer._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            case 27:
                _childSerializers$_anonymous_$03 = Transfer._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 28:
                _childSerializers$_anonymous_10 = TransferHistoryResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_10;
            default:
                _childSerializers$_anonymous_11 = TransfersResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_11;
        }
    }
}
