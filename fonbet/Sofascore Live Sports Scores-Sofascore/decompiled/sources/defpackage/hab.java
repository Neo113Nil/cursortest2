package defpackage;

import android.content.Context;
import com.sofascore.model.newNetwork.topperformance.response.AmericanFootballTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.AmericanFootballTopPlayersStatisticsItem;
import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hab implements zab {
    public static final /* synthetic */ hab[] e;
    public static final /* synthetic */ kp5 f;
    public final int a;
    public final boolean b;
    public final Function1 c;
    public final Function1 d;

    static {
        hab[] habVarArr = {new hab(0, R.string.passing_touchdowns, "PASSING_TOUCHDOWNS", new z9b(29), new gab(1), true), new hab(1, R.string.rushing_touchdowns, "RUSHING_TOUCHDOWNS", new gab(4), new gab(5), true), new hab(2, R.string.receiving_touchdowns, "RECEIVING_TOUCHDOWNS", new gab(6), new gab(7), true), new hab(3, R.string.amf_top_pass_completion_percentage, "PASS_COMPLETION", new gab(8), new gab(9), true), new hab(4, R.string.amf_top_touchdown_interception_ratio, "TD_INT_RATIO", new gab(11), new gab(12), false), new hab(5, R.string.rushing_yards_per_attempt, "RUSHING_YARDS_PER_ATT", new gab(10), new gab(13), true), new hab(6, R.string.amf_top_receiving_yards_per_catch, "YARDS_PER_CATCH", new gab(14), new gab(15), true), new hab(7, R.string.interceptions, "INTERCEPTIONS", new gab(16), new gab(17), true), new hab(8, R.string.am_football_tackles_per_game, "TACKLES_PER_GAME", new gab(18), new gab(19), true), new hab(9, R.string.sacks, "SACKS", new gab(20), new gab(0), true), new hab(10, R.string.amf_top_field_goals_made_attempts, "FG_MADE", new gab(2), new gab(3), true)};
        e = habVarArr;
        f = new kp5(habVarArr);
    }

    public hab(int i, int i2, String str, Function1 function1, Function1 function12, boolean z) {
        this.a = i2;
        this.b = z;
        this.c = function1;
        this.d = function12;
    }

    public static hab valueOf(String str) {
        return (hab) Enum.valueOf(hab.class, str);
    }

    public static hab[] values() {
        return (hab[]) e.clone();
    }

    @Override // defpackage.zab
    public final String a(Object obj) {
        AmericanFootballTopPlayersStatisticsItem americanFootballTopPlayersStatisticsItem = (AmericanFootballTopPlayersStatisticsItem) obj;
        americanFootballTopPlayersStatisticsItem.getClass();
        return (String) this.d.invoke(americanFootballTopPlayersStatisticsItem);
    }

    @Override // defpackage.zab
    public final List b(Object obj) {
        AmericanFootballTopPlayersStatistics americanFootballTopPlayersStatistics = (AmericanFootballTopPlayersStatistics) obj;
        americanFootballTopPlayersStatistics.getClass();
        return (List) this.c.invoke(americanFootballTopPlayersStatistics);
    }

    @Override // defpackage.zab
    public final boolean c(hub hubVar) {
        hubVar.getClass();
        return this.b || hubVar != hub.a;
    }

    @Override // defpackage.zab
    public final String d(Context context) {
        context.getClass();
        String string = context.getString(this.a);
        string.getClass();
        return string;
    }
}
