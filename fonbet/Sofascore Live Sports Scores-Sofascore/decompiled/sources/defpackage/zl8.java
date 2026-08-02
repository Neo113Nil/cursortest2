package defpackage;

import android.database.sqlite.SQLiteDatabase;
import com.sofascore.model.network.response.FunFactsResponse;
import com.sofascore.model.newNetwork.topperformance.response.FootballTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.response.FutsalTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.response.FutsalTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.FootballTopTeamsStatisticsItem;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class zl8 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ zl8(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_$14;
        KSerializer _childSerializers$_anonymous_$15;
        KSerializer _childSerializers$_anonymous_$16;
        KSerializer _childSerializers$_anonymous_$17;
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_$2;
        KSerializer _childSerializers$_anonymous_4;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_$12;
        KSerializer _childSerializers$_anonymous_$22;
        KSerializer _childSerializers$_anonymous_$3;
        KSerializer _childSerializers$_anonymous_$4;
        switch (this.a) {
            case 0:
                _childSerializers$_anonymous_$14 = FootballTopTeamsStatistics._childSerializers$_anonymous_$14();
                break;
            case 1:
                _childSerializers$_anonymous_$15 = FootballTopTeamsStatistics._childSerializers$_anonymous_$15();
                break;
            case 2:
                _childSerializers$_anonymous_$16 = FootballTopTeamsStatistics._childSerializers$_anonymous_$16();
                break;
            case 3:
                _childSerializers$_anonymous_$17 = FootballTopTeamsStatistics._childSerializers$_anonymous_$17();
                break;
            case 4:
                _childSerializers$_anonymous_ = FootballTopTeamsStatisticsItem._childSerializers$_anonymous_();
                break;
            case 5:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    break;
                } catch (Throwable unused) {
                    return null;
                }
            case 6:
                try {
                    Method method = (Method) rr8.d.getValue();
                    if (method != null && (r5 = method.getReturnType()) != null) {
                        Class cls = Integer.TYPE;
                        break;
                    }
                } catch (Throwable unused2) {
                    return null;
                }
                break;
            case 9:
                _childSerializers$_anonymous_2 = FunFactsResponse._childSerializers$_anonymous_();
                break;
            case 10:
                _childSerializers$_anonymous_3 = FutsalTopPlayersStatistics._childSerializers$_anonymous_();
                break;
            case 11:
                _childSerializers$_anonymous_$0 = FutsalTopPlayersStatistics._childSerializers$_anonymous_$0();
                break;
            case 12:
                _childSerializers$_anonymous_$1 = FutsalTopPlayersStatistics._childSerializers$_anonymous_$1();
                break;
            case 13:
                _childSerializers$_anonymous_$2 = FutsalTopPlayersStatistics._childSerializers$_anonymous_$2();
                break;
            case 14:
                _childSerializers$_anonymous_4 = FutsalTopTeamsStatistics._childSerializers$_anonymous_();
                break;
            case 15:
                _childSerializers$_anonymous_$02 = FutsalTopTeamsStatistics._childSerializers$_anonymous_$0();
                break;
            case 16:
                _childSerializers$_anonymous_$12 = FutsalTopTeamsStatistics._childSerializers$_anonymous_$1();
                break;
            case 17:
                _childSerializers$_anonymous_$22 = FutsalTopTeamsStatistics._childSerializers$_anonymous_$2();
                break;
            case 18:
                _childSerializers$_anonymous_$3 = FutsalTopTeamsStatistics._childSerializers$_anonymous_$3();
                break;
            case 19:
                _childSerializers$_anonymous_$4 = FutsalTopTeamsStatistics._childSerializers$_anonymous_$4();
                break;
        }
        return Unit.a;
    }
}
