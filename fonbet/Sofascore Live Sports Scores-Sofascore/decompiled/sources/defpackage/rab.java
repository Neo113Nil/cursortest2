package defpackage;

import android.content.Context;
import com.sofascore.model.newNetwork.topperformance.response.FutsalTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.FutsalTopPlayersStatisticsItem;
import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rab implements zab {
    public static final /* synthetic */ rab[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final Function1 b;
    public final Function1 c;

    static {
        rab[] rabVarArr = {new rab("GOALS", 0, R.string.goals, new pab(9), new pab(10)), new rab("ASSISTS", 1, R.string.football_assists, new pab(11), new pab(12)), new rab("YELLOW_CARDS", 2, R.string.football_yellow_cards, new pab(13), new pab(14)), new rab("RED_CARDS", 3, R.string.futsal_red_cards, new pab(15), new pab(16))};
        d = rabVarArr;
        e = new kp5(rabVarArr);
    }

    public rab(String str, int i, int i2, Function1 function1, Function1 function12) {
        this.a = i2;
        this.b = function1;
        this.c = function12;
    }

    public static rab valueOf(String str) {
        return (rab) Enum.valueOf(rab.class, str);
    }

    public static rab[] values() {
        return (rab[]) d.clone();
    }

    @Override // defpackage.zab
    public final String a(Object obj) {
        FutsalTopPlayersStatisticsItem futsalTopPlayersStatisticsItem = (FutsalTopPlayersStatisticsItem) obj;
        futsalTopPlayersStatisticsItem.getClass();
        return (String) this.c.invoke(futsalTopPlayersStatisticsItem);
    }

    @Override // defpackage.zab
    public final List b(Object obj) {
        FutsalTopPlayersStatistics futsalTopPlayersStatistics = (FutsalTopPlayersStatistics) obj;
        futsalTopPlayersStatistics.getClass();
        return (List) this.b.invoke(futsalTopPlayersStatistics);
    }

    @Override // defpackage.zab
    public final boolean c(hub hubVar) {
        hubVar.getClass();
        return true;
    }

    @Override // defpackage.zab
    public final String d(Context context) {
        context.getClass();
        String string = context.getString(this.a);
        string.getClass();
        return string;
    }
}
