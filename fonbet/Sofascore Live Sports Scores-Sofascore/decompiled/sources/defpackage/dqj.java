package defpackage;

import com.sofascore.model.newNetwork.topperformance.response.VolleyballTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.VolleyballTopTeamsStatisticsItem;
import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dqj implements cqj {
    public static final /* synthetic */ dqj[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final Function1 b;
    public final Function1 c;

    static {
        dqj[] dqjVarArr = {new dqj("POINTS_TOTAL", 0, R.string.volleyball_points, new aqj(9), new aqj(11)), new dqj("ACES", 1, R.string.volleyball_aces, new aqj(12), new aqj(13)), new dqj("SERVE_EFFICIENCY", 2, R.string.volleyball_serve_efficiency_percentage, new aqj(14), new aqj(15)), new dqj("BLOCK_POINTS", 3, R.string.volleyball_block_points, new aqj(16), new aqj(17)), new dqj("ATTACK_POINTS", 4, R.string.volleyball_attack_points, new aqj(18), new aqj(19)), new dqj("ATTACKS_EFFICIENCY", 5, R.string.volleyball_attack_efficiency_percentage, new aqj(20), new aqj(21)), new dqj("ATTACK_ERRORS", 6, R.string.volleyball_attack_errors, new aqj(22), new aqj(23)), new dqj("SERVE_ERRORS", 7, R.string.volleyball_serve_errors, new aqj(24), new aqj(25)), new dqj("RECEPTION_ERRORS", 8, R.string.volleyball_reception_errors, new aqj(26), new aqj(27)), new dqj("ATTACKS_BLOCKED", 9, R.string.volleyball_attacks_blocked, new aqj(28), new aqj(10))};
        d = dqjVarArr;
        e = new kp5(dqjVarArr);
    }

    public dqj(String str, int i, int i2, Function1 function1, Function1 function12) {
        this.a = i2;
        this.b = function1;
        this.c = function12;
    }

    public static dqj valueOf(String str) {
        return (dqj) Enum.valueOf(dqj.class, str);
    }

    public static dqj[] values() {
        return (dqj[]) d.clone();
    }

    @Override // defpackage.cqj
    public final /* bridge */ String a(Object obj) {
        return super.a((VolleyballTopTeamsStatisticsItem) obj);
    }

    @Override // defpackage.cqj
    public final /* bridge */ List b(Object obj) {
        return super.b((VolleyballTopTeamsStatistics) obj);
    }

    @Override // defpackage.cqj
    public final int d() {
        return this.a;
    }

    @Override // defpackage.cqj
    public final Function1 g() {
        return this.c;
    }

    @Override // defpackage.cqj
    public final Function1 h() {
        return this.b;
    }
}
