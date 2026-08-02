package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageInfo;
import com.sofascore.model.mvvm.model.StandingsBucket;
import com.sofascore.model.newNetwork.StageDriverPerformance;
import com.sofascore.model.newNetwork.StageDriverPerformanceGraphResponse;
import com.sofascore.model.newNetwork.StageFeaturedOddsResponse;
import com.sofascore.model.newNetwork.StageOddsResponse;
import com.sofascore.model.newNetwork.StageRaceResult;
import com.sofascore.model.newNetwork.StageRacesResponse;
import com.sofascore.model.newNetwork.StageSeasonsResponse;
import com.sofascore.model.newNetwork.StageSportDriverSeasonData;
import com.sofascore.model.newNetwork.StageSportDriverTeamData;
import com.sofascore.model.newNetwork.StageSportSeasonsResponse;
import com.sofascore.model.newNetwork.StageStandingsItem;
import com.sofascore.model.newNetwork.StageStandingsResponse;
import com.sofascore.model.newNetwork.StageTeamHistoryResponse;
import com.sofascore.model.newNetwork.StagesListResponse;
import com.sofascore.results.R;
import com.sofascore.results.stagesport.StageCategoryActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class b1i implements Function0 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_$2;
        KSerializer _childSerializers$_anonymous_$3;
        KSerializer _childSerializers$_anonymous_$4;
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_$1;
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
        KSerializer _childSerializers$_anonymous_12;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_$12;
        KSerializer _childSerializers$_anonymous_$22;
        KSerializer _childSerializers$_anonymous_13;
        KSerializer _childSerializers$_anonymous_14;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _childSerializers$_anonymous_15;
        KSerializer _init_$_anonymous_;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_$2 = Stage._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
            case 1:
                _childSerializers$_anonymous_$3 = Stage._childSerializers$_anonymous_$3();
                return _childSerializers$_anonymous_$3;
            case 2:
                _childSerializers$_anonymous_$4 = Stage._childSerializers$_anonymous_$4();
                return _childSerializers$_anonymous_$4;
            case 3:
                int i = StageCategoryActivity.R;
                return Unit.a;
            case 4:
                _childSerializers$_anonymous_ = StageDriverPerformance._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 5:
                _childSerializers$_anonymous_$0 = StageDriverPerformance._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 6:
                _childSerializers$_anonymous_$1 = StageDriverPerformance._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 7:
                _childSerializers$_anonymous_2 = StageDriverPerformanceGraphResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 8:
                _childSerializers$_anonymous_3 = StageFeaturedOddsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 9:
                return b.j(ServerType.EVENT, ServerType.PRACTICE, ServerType.QUALIFYING, ServerType.RACE, ServerType.SPRINT, ServerType.SPRINT_QUALIFYING, ServerType.STAGE, ServerType.AFTER_STAGE);
            case 10:
                Pair pair = new Pair(Sports.FORMULA_1, Integer.valueOf(R.color.formula_1));
                Pair pair2 = new Pair("MotoGP", Integer.valueOf(R.color.moto_gp));
                Pair pair3 = new Pair("Moto3", Integer.valueOf(R.color.moto_3));
                Pair pair4 = new Pair("Moto2", Integer.valueOf(R.color.moto_2));
                Pair pair5 = new Pair("Superbike", Integer.valueOf(R.color.superbike));
                Pair pair6 = new Pair("WRC", Integer.valueOf(R.color.wrc));
                Integer valueOf = Integer.valueOf(R.color.nascar);
                Pair pair7 = new Pair("Nascar Sprint Cup", valueOf);
                Pair pair8 = new Pair("Nascar Xfinity", valueOf);
                Pair pair9 = new Pair("Nascar Camping World", valueOf);
                Pair pair10 = new Pair("DTM", Integer.valueOf(R.color.dtm));
                Pair pair11 = new Pair("Formula E", Integer.valueOf(R.color.formula_e));
                Pair pair12 = new Pair(Sports.INDYCAR, Integer.valueOf(R.color.indycar));
                i5i[] i5iVarArr = i5i.f;
                return tub.h(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, new Pair("tour-de-france", Integer.valueOf(R.color.stay_tour_de_france)), new Pair("giro-ditalia", Integer.valueOf(R.color.stay_giro_ditalia)), new Pair("la-vuelta-ciclista-a-espana", Integer.valueOf(R.color.stay_vuelta_a_espana)));
            case 11:
                return b.j("MotoGP", "Moto2", "Moto3", "Superbike");
            case 12:
                _childSerializers$_anonymous_4 = StageInfo._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 13:
                _childSerializers$_anonymous_5 = StageOddsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 14:
                _childSerializers$_anonymous_6 = StageRaceResult._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 15:
                _childSerializers$_anonymous_7 = StageRacesResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 16:
                _childSerializers$_anonymous_8 = StageSeasonsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 17:
                int i2 = s9d.d;
                return Boolean.valueOf(zu3.V.hasMcc(Integer.valueOf(ke0.c)));
            case 18:
                _childSerializers$_anonymous_9 = StageSportDriverSeasonData._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            case 19:
                _childSerializers$_anonymous_10 = StageSportDriverTeamData._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_10;
            case 20:
                _childSerializers$_anonymous_11 = StageSportSeasonsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_11;
            case 21:
                _childSerializers$_anonymous_12 = StageStandingsItem._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_12;
            case 22:
                _childSerializers$_anonymous_$02 = StageStandingsItem._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 23:
                _childSerializers$_anonymous_$12 = StageStandingsItem._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$12;
            case 24:
                _childSerializers$_anonymous_$22 = StageStandingsItem._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$22;
            case 25:
                _childSerializers$_anonymous_13 = StageStandingsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_13;
            case 26:
                _childSerializers$_anonymous_14 = StageTeamHistoryResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_14;
            case 27:
                _childSerializers$_anonymous_$03 = StageTeamHistoryResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 28:
                _childSerializers$_anonymous_15 = StagesListResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_15;
            default:
                _init_$_anonymous_ = StandingsBucket._init_$_anonymous_();
                return _init_$_anonymous_;
        }
    }

    public /* synthetic */ b1i(int i) {
        this.a = i;
    }
}
