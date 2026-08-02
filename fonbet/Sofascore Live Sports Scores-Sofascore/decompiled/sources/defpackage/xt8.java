package defpackage;

import com.inmobi.media.G9;
import com.sofascore.model.GoogleTranslate;
import com.sofascore.model.GoogleTranslateResult;
import com.sofascore.model.network.response.GoalDistributionsResponse;
import com.sofascore.model.network.response.bettingtips.H2HStreaksResponse;
import com.sofascore.model.newNetwork.GamePP;
import com.sofascore.model.newNetwork.topperformance.response.HandballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.HandballTopStatsPerGameStatistics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class xt8 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ xt8(int i) {
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
        KSerializer _childSerializers$_anonymous_6;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_$2;
        KSerializer _childSerializers$_anonymous_$3;
        KSerializer _childSerializers$_anonymous_$4;
        KSerializer _childSerializers$_anonymous_$5;
        KSerializer _childSerializers$_anonymous_$6;
        KSerializer _childSerializers$_anonymous_7;
        switch (this.a) {
            case 0:
                return Unit.a;
            case 1:
                return Unit.a;
            case 2:
                return Unit.a;
            case 3:
                return Unit.a;
            case 4:
                return Unit.a;
            case 5:
                return Unit.a;
            case 6:
                return Unit.a;
            case 7:
                return Unit.a;
            case 8:
                return Unit.a;
            case 9:
                return Unit.a;
            case 10:
                return Unit.a;
            case 11:
                return G9.b();
            case 12:
                m2l[] values = m2l.values();
                values.getClass();
                return new qq3("io.ktor.util.date.WeekDay", (Enum[]) values);
            case 13:
                zuc[] values2 = zuc.values();
                values2.getClass();
                return new qq3("io.ktor.util.date.Month", (Enum[]) values2);
            case 14:
                _childSerializers$_anonymous_ = GamePP._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 15:
                _childSerializers$_anonymous_2 = GoalDistributionsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 16:
                _childSerializers$_anonymous_3 = GoogleTranslate._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 17:
                _childSerializers$_anonymous_4 = GoogleTranslateResult._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 18:
                return Unit.a;
            case 19:
                _childSerializers$_anonymous_5 = H2HStreaksResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_5;
            case 20:
                _childSerializers$_anonymous_$0 = H2HStreaksResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 21:
                _childSerializers$_anonymous_6 = HandballTopPlayersStatistics._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_6;
            case 22:
                _childSerializers$_anonymous_$02 = HandballTopPlayersStatistics._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 23:
                _childSerializers$_anonymous_$1 = HandballTopPlayersStatistics._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 24:
                _childSerializers$_anonymous_$2 = HandballTopPlayersStatistics._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
            case 25:
                _childSerializers$_anonymous_$3 = HandballTopPlayersStatistics._childSerializers$_anonymous_$3();
                return _childSerializers$_anonymous_$3;
            case 26:
                _childSerializers$_anonymous_$4 = HandballTopPlayersStatistics._childSerializers$_anonymous_$4();
                return _childSerializers$_anonymous_$4;
            case 27:
                _childSerializers$_anonymous_$5 = HandballTopPlayersStatistics._childSerializers$_anonymous_$5();
                return _childSerializers$_anonymous_$5;
            case 28:
                _childSerializers$_anonymous_$6 = HandballTopPlayersStatistics._childSerializers$_anonymous_$6();
                return _childSerializers$_anonymous_$6;
            default:
                _childSerializers$_anonymous_7 = HandballTopStatsPerGameStatistics._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_7;
        }
    }
}
