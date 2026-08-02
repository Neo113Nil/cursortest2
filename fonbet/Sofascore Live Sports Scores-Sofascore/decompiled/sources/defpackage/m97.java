package defpackage;

import com.sofascore.model.fantasy.FantasyPlayer;
import com.sofascore.model.fantasy.FantasyPlayerCompetitionsResponse;
import com.sofascore.model.fantasy.FantasyPlayerEventStatistics;
import com.sofascore.model.fantasy.FantasyPlayerFormAndFixturesResponse;
import com.sofascore.model.fantasy.FantasyPlayerPointsBreakdown;
import com.sofascore.model.fantasy.FantasyPlayerPriceChanges;
import com.sofascore.model.fantasy.FantasyPlayerPriceHistoryResponse;
import com.sofascore.model.fantasy.FantasyPointsCalculatorItem;
import com.sofascore.model.fantasy.FantasyPointsForEventResponse;
import com.sofascore.model.fantasy.FantasyPointsMap;
import com.sofascore.results.fantasy.onboarding.steps.FantasyOnboardingStepsNavigation;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureData;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerMissingData;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel;
import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncement;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class m97 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ m97(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_5;
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_7;
        KSerializer _childSerializers$_anonymous_8;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_9;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _childSerializers$_anonymous_10;
        KSerializer _childSerializers$_anonymous_11;
        switch (this.a) {
            case 0:
                return Unit.a;
            case 1:
                return Unit.a;
            case 2:
                return new qq3("com.sofascore.results.fantasy.onboarding.FantasyOnboardingRootNavigation.Onboarding", xa7.INSTANCE, new Annotation[0]);
            case 3:
                return new qq3("com.sofascore.results.fantasy.onboarding.steps.FantasyOnboardingStepsNavigation.CreateTeam", FantasyOnboardingStepsNavigation.CreateTeam.INSTANCE, new Annotation[0]);
            case 4:
                return new qq3("com.sofascore.results.fantasy.onboarding.steps.FantasyOnboardingStepsNavigation.SelectCompetition", FantasyOnboardingStepsNavigation.SelectCompetition.INSTANCE, new Annotation[0]);
            case 5:
                _childSerializers$_anonymous_ = FantasyPlayer._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 6:
                _childSerializers$_anonymous_2 = FantasyPlayerCompetitionsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 7:
                _childSerializers$_anonymous_3 = FantasyPlayerEventStatistics._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 8:
                dd7 dd7Var = FantasyPlayerFixtureData.Companion;
                sd7[] values = sd7.values();
                values.getClass();
                return new qq3("com.sofascore.results.fantasy.ui.model.FantasyPlayerMissingType", (Enum[]) values);
            case 9:
                dd7 dd7Var2 = FantasyPlayerFixtureData.Companion;
                rd7[] values2 = rd7.values();
                values2.getClass();
                return new qq3("com.sofascore.results.fantasy.ui.model.FantasyPlayerMissingReason", (Enum[]) values2);
            case 10:
                dd7 dd7Var3 = FantasyPlayerFixtureData.Companion;
                ad7[] values3 = ad7.values();
                values3.getClass();
                return new qq3("com.sofascore.results.fantasy.ui.model.FantasyPlayerEventStatus", (Enum[]) values3);
            case 11:
                fd7 fd7Var = FantasyPlayerFixtureUiModel.Companion;
                p68[] values4 = p68.values();
                values4.getClass();
                return new qq3("com.sofascore.results.fantasy.ui.model.FixtureLocationType", (Enum[]) values4);
            case 12:
                fd7 fd7Var2 = FantasyPlayerFixtureUiModel.Companion;
                o68[] values5 = o68.values();
                values5.getClass();
                return new qq3("com.sofascore.results.fantasy.ui.model.FixtureDifficulty", (Enum[]) values5);
            case 13:
                fd7 fd7Var3 = FantasyPlayerFixtureUiModel.Companion;
                sd7[] values6 = sd7.values();
                values6.getClass();
                return new qq3("com.sofascore.results.fantasy.ui.model.FantasyPlayerMissingType", (Enum[]) values6);
            case 14:
                fd7 fd7Var4 = FantasyPlayerFixtureUiModel.Companion;
                rd7[] values7 = rd7.values();
                values7.getClass();
                return new qq3("com.sofascore.results.fantasy.ui.model.FantasyPlayerMissingReason", (Enum[]) values7);
            case 15:
                fd7 fd7Var5 = FantasyPlayerFixtureUiModel.Companion;
                ad7[] values8 = ad7.values();
                values8.getClass();
                return new qq3("com.sofascore.results.fantasy.ui.model.FantasyPlayerEventStatus", (Enum[]) values8);
            case 16:
                _childSerializers$_anonymous_4 = FantasyPlayerFormAndFixturesResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 17:
                _childSerializers$_anonymous_$0 = FantasyPlayerFormAndFixturesResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 18:
                qd7 qd7Var = FantasyPlayerMissingData.Companion;
                sd7[] values9 = sd7.values();
                values9.getClass();
                return new qq3("com.sofascore.results.fantasy.ui.model.FantasyPlayerMissingType", (Enum[]) values9);
            case 19:
                qd7 qd7Var2 = FantasyPlayerMissingData.Companion;
                rd7[] values10 = rd7.values();
                values10.getClass();
                return new qq3("com.sofascore.results.fantasy.ui.model.FantasyPlayerMissingReason", (Enum[]) values10);
            case 20:
                _childSerializers$_anonymous_5 = FantasyPlayerPointsBreakdown._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 21:
                _childSerializers$_anonymous_6 = FantasyPlayerPriceChanges._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 22:
                _childSerializers$_anonymous_7 = FantasyPlayerPriceHistoryResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
            case 23:
                je7 je7Var = FantasyPlayerUiModel.Companion;
                rz6[] values11 = rz6.values();
                values11.getClass();
                return new qq3("com.sofascore.results.fantasy.ui.model.FantasyFootballPlayerPosition", (Enum[]) values11);
            case 24:
                _childSerializers$_anonymous_8 = FantasyPointsCalculatorItem._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_8;
            case 25:
                _childSerializers$_anonymous_$02 = FantasyPointsCalculatorItem._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 26:
                _childSerializers$_anonymous_9 = FantasyPointsForEventResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_9;
            case 27:
                _childSerializers$_anonymous_$03 = FantasyPointsForEventResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 28:
                _childSerializers$_anonymous_10 = FantasyPointsMap._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_10;
            default:
                _childSerializers$_anonymous_11 = FantasyRemoteAnnouncement._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_11;
        }
    }
}
