package defpackage;

import android.content.Context;
import com.sofascore.model.newNetwork.topperformance.response.IceHockeyTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.IceHockeyTopPlayersStatisticsItem;
import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vab implements zab {
    public static final /* synthetic */ vab[] g;
    public static final /* synthetic */ kp5 h;
    public final int a;
    public final boolean b;
    public final Function1 c;
    public final Function1 d;
    public final boolean e;
    public final Integer f;

    static {
        int i = 3;
        int i2 = 5;
        vab vabVar = new vab("POINTS", 0, R.string.points, true, new sab(i), new sab(i2), 48);
        int i3 = 48;
        boolean z = true;
        vab vabVar2 = new vab("GOALS", 1, R.string.goals, z, new sab(17), new sab(29), i3);
        vab vabVar3 = new vab("ASSISTS", 2, R.string.ice_hockey_assists, z, new uab(2), new uab(i), i3);
        int i4 = 4;
        vab vabVar4 = new vab("PP_GOALS", 3, R.string.hockey_powerplay_goals, false, new uab(i4), new uab(i2), i3);
        int i5 = 7;
        int i6 = 8;
        vab vabVar5 = new vab("SH_GOALS", 4, R.string.hockey_shorthanded_goals, false, new uab(i5), new uab(i6), 48);
        int i7 = 14;
        int i8 = 48;
        boolean z2 = false;
        vab vabVar6 = new vab("PP_ASSISTS", 5, R.string.hockey_powerplay_assists, z2, new sab(i7), new sab(25), i8);
        int i9 = 6;
        vab vabVar7 = new vab("SH_ASSISTS", 6, R.string.hockey_shorthanded_assists, z2, new uab(i9), new uab(9), i8);
        vab vabVar8 = new vab("SHOT_PERCENTAGE", 7, R.string.shot_percentage, z2, new uab(10), new uab(11), i8);
        int i10 = 13;
        vab vabVar9 = new vab("FACEOFF_PERCENTAGE", 8, R.string.face_off_percentage, false, new uab(12), new uab(i10), 48);
        vab vabVar10 = new vab("PLUS_MINUS", 9, R.string.plus_minus, true, new uab(i7), new sab(i4), 48);
        vab vabVar11 = new vab("TIME_ON_ICE", 10, R.string.time_on_ice_per_game, true, new sab(i9), new sab(i5), 48);
        vab vabVar12 = new vab("BLOCKS", 11, R.string.blocks, true, new sab(i6), new sab(9), 48);
        vab vabVar13 = new vab("HITS", 12, R.string.hits, true, new sab(10), new sab(11), 48);
        vab vabVar14 = new vab("PENALTY_MINUTES_PER_GAME", 13, R.string.penalty_minutes_per_game, false, new sab(12), new sab(i10), 48);
        sab sabVar = new sab(15);
        sab sabVar2 = new sab(16);
        Integer valueOf = Integer.valueOf(R.string.hockey_top_players_goalkeepers_criteria);
        int i11 = 32;
        vab[] vabVarArr = {vabVar, vabVar2, vabVar3, vabVar4, vabVar5, vabVar6, vabVar7, vabVar8, vabVar9, vabVar10, vabVar11, vabVar12, vabVar13, vabVar14, new vab("SAVE_PERCENTAGE", 14, R.string.save_percentage, true, sabVar, sabVar2, true, valueOf), new vab("GOALS_AGAINST_AVERAGE", 15, R.string.goals_against_average, true, new sab(18), new sab(19), true, valueOf), new vab("WINS", 16, R.string.wins, false, new sab(20), new sab(21), i11), new vab("SHUTOUTS", 17, R.string.hockey_shutouts, true, new sab(22), new sab(23), i11), new vab("EVEN_SAVE_PERCENTAGE", 18, R.string.hockey_even_save_percentage, false, new sab(24), new sab(26), true, valueOf), new vab("SH_SAVE_PERCENTAGE", 19, R.string.hockey_shorthanded_save_pct, false, new sab(27), new sab(28), true, valueOf), new vab("PP_SAVE_PERCENTAGE", 20, R.string.hockey_power_play_save_pct, false, new uab(0), new uab(1), true, valueOf)};
        g = vabVarArr;
        h = new kp5(vabVarArr);
    }

    public /* synthetic */ vab(String str, int i, int i2, boolean z, Function1 function1, Function1 function12, int i3) {
        this(str, i, i2, z, function1, function12, (i3 & 16) == 0, null);
    }

    public static vab valueOf(String str) {
        return (vab) Enum.valueOf(vab.class, str);
    }

    public static vab[] values() {
        return (vab[]) g.clone();
    }

    @Override // defpackage.zab
    public final String a(Object obj) {
        IceHockeyTopPlayersStatisticsItem iceHockeyTopPlayersStatisticsItem = (IceHockeyTopPlayersStatisticsItem) obj;
        iceHockeyTopPlayersStatisticsItem.getClass();
        return (String) this.d.invoke(iceHockeyTopPlayersStatisticsItem);
    }

    @Override // defpackage.zab
    public final List b(Object obj) {
        IceHockeyTopPlayersStatistics iceHockeyTopPlayersStatistics = (IceHockeyTopPlayersStatistics) obj;
        iceHockeyTopPlayersStatistics.getClass();
        return (List) this.c.invoke(iceHockeyTopPlayersStatistics);
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

    @Override // defpackage.zab
    public final Integer h() {
        return this.f;
    }

    public vab(String str, int i, int i2, boolean z, Function1 function1, Function1 function12, boolean z2, Integer num) {
        this.a = i2;
        this.b = z;
        this.c = function1;
        this.d = function12;
        this.e = z2;
        this.f = num;
    }
}
