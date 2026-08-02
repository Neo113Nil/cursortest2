package defpackage;

import android.content.Context;
import com.sofascore.model.newNetwork.topperformance.response.HandballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.HandballTopPlayersStatisticsItem;
import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tab implements zab {
    public static final /* synthetic */ tab[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final Function1 b;
    public final Function1 c;

    static {
        tab[] tabVarArr = {new tab("GOALS", 0, R.string.goals, new pab(17), new sab(0)), new tab("ASSISTS", 1, R.string.handball_assists, new sab(1), new sab(2)), new tab("GOALS_7M", 2, R.string.m7_goals, new pab(18), new pab(19)), new tab("STEALS", 3, R.string.steals, new pab(20), new pab(21)), new tab("PENALTIES_2M", 4, R.string.two_min_penalty, new pab(22), new pab(23)), new tab("SAVES", 5, R.string.handball_saves, new pab(24), new pab(25)), new tab("SAVE_PCT", 6, R.string.save_percentage, new pab(26), new pab(27)), new tab("SAVES_7M", 7, R.string.m7_saves, new pab(28), new pab(29))};
        d = tabVarArr;
        e = new kp5(tabVarArr);
    }

    public tab(String str, int i, int i2, Function1 function1, Function1 function12) {
        this.a = i2;
        this.b = function1;
        this.c = function12;
    }

    public static tab valueOf(String str) {
        return (tab) Enum.valueOf(tab.class, str);
    }

    public static tab[] values() {
        return (tab[]) d.clone();
    }

    @Override // defpackage.zab
    public final String a(Object obj) {
        HandballTopPlayersStatisticsItem handballTopPlayersStatisticsItem = (HandballTopPlayersStatisticsItem) obj;
        handballTopPlayersStatisticsItem.getClass();
        return (String) this.c.invoke(handballTopPlayersStatisticsItem);
    }

    @Override // defpackage.zab
    public final List b(Object obj) {
        HandballTopPlayersStatistics handballTopPlayersStatistics = (HandballTopPlayersStatistics) obj;
        handballTopPlayersStatistics.getClass();
        return (List) this.b.invoke(handballTopPlayersStatistics);
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
