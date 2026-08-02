package defpackage;

import android.content.Context;
import com.sofascore.model.newNetwork.topperformance.response.VolleyballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.VolleyballTopPlayersStatisticsItem;
import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bbb implements zab {
    public static final /* synthetic */ bbb[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final Function1 b;
    public final Function1 c;

    static {
        bbb[] bbbVarArr = {new bbb("POINTS_TOTAL", 0, R.string.volleyball_points, new xab(13), new xab(15)), new bbb("ACES", 1, R.string.volleyball_aces, new xab(16), new xab(17)), new bbb("SERVE_EFFICIENCY", 2, R.string.volleyball_serve_efficiency_percentage, new xab(18), new xab(19)), new bbb("BLOCK_POINTS", 3, R.string.volleyball_block_points, new xab(20), new xab(21)), new bbb("ATTACK_POINTS", 4, R.string.volleyball_attack_points, new xab(22), new xab(23)), new bbb("ATTACKS_EFFICIENCY", 5, R.string.volleyball_attack_efficiency_percentage, new xab(24), new xab(25)), new bbb("ATTACK_ERRORS", 6, R.string.volleyball_attack_errors, new xab(26), new xab(27)), new bbb("SERVE_ERRORS", 7, R.string.volleyball_serve_errors, new xab(28), new xab(29)), new bbb("RECEPTION_ERRORS", 8, R.string.volleyball_reception_errors, new abb(0), new abb(1)), new bbb("ATTACKS_BLOCKED", 9, R.string.volleyball_attacks_blocked, new abb(2), new xab(14))};
        d = bbbVarArr;
        e = new kp5(bbbVarArr);
    }

    public bbb(String str, int i, int i2, Function1 function1, Function1 function12) {
        this.a = i2;
        this.b = function1;
        this.c = function12;
    }

    public static bbb valueOf(String str) {
        return (bbb) Enum.valueOf(bbb.class, str);
    }

    public static bbb[] values() {
        return (bbb[]) d.clone();
    }

    @Override // defpackage.zab
    public final String a(Object obj) {
        VolleyballTopPlayersStatisticsItem volleyballTopPlayersStatisticsItem = (VolleyballTopPlayersStatisticsItem) obj;
        volleyballTopPlayersStatisticsItem.getClass();
        return (String) this.c.invoke(volleyballTopPlayersStatisticsItem);
    }

    @Override // defpackage.zab
    public final List b(Object obj) {
        VolleyballTopPlayersStatistics volleyballTopPlayersStatistics = (VolleyballTopPlayersStatistics) obj;
        volleyballTopPlayersStatistics.getClass();
        return (List) this.b.invoke(volleyballTopPlayersStatistics);
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
