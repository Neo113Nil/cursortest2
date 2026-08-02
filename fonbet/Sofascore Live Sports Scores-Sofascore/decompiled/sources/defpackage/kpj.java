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
public final class kpj implements ipj {
    public static final /* synthetic */ kpj[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final Function1 b;
    public final Function1 c;

    static {
        kpj[] kpjVarArr = {new kpj("POINTS_TOTAL", 0, R.string.volleyball_points, new gpj(17), new gpj(19)), new kpj("ACES", 1, R.string.volleyball_aces, new gpj(20), new gpj(21)), new kpj("SERVE_EFFICIENCY", 2, R.string.volleyball_serve_efficiency_percentage, new gpj(22), new gpj(23)), new kpj("BLOCK_POINTS", 3, R.string.volleyball_block_points, new gpj(24), new gpj(25)), new kpj("ATTACK_POINTS", 4, R.string.volleyball_attack_points, new gpj(26), new gpj(27)), new kpj("ATTACKS_EFFICIENCY", 5, R.string.volleyball_attack_efficiency_percentage, new gpj(28), new gpj(29)), new kpj("ATTACK_ERRORS", 6, R.string.volleyball_attack_errors, new jpj(0), new jpj(1)), new kpj("SERVE_ERRORS", 7, R.string.volleyball_serve_errors, new jpj(2), new jpj(3)), new kpj("RECEPTION_ERRORS", 8, R.string.volleyball_reception_errors, new jpj(4), new jpj(5)), new kpj("ATTACKS_BLOCKED", 9, R.string.volleyball_attacks_blocked, new jpj(6), new gpj(18))};
        d = kpjVarArr;
        e = new kp5(kpjVarArr);
    }

    public kpj(String str, int i, int i2, Function1 function1, Function1 function12) {
        this.a = i2;
        this.b = function1;
        this.c = function12;
    }

    public static kpj valueOf(String str) {
        return (kpj) Enum.valueOf(kpj.class, str);
    }

    public static kpj[] values() {
        return (kpj[]) d.clone();
    }

    @Override // defpackage.ipj
    public final /* bridge */ String a(Object obj) {
        return super.a((VolleyballTopTeamsStatisticsItem) obj);
    }

    @Override // defpackage.ipj
    public final /* bridge */ List b(Object obj) {
        return super.b((VolleyballTopTeamsStatistics) obj);
    }

    @Override // defpackage.ipj
    public final int d() {
        return this.a;
    }

    @Override // defpackage.ipj
    public final Function1 g() {
        return this.c;
    }

    @Override // defpackage.ipj
    public final Function1 h() {
        return this.b;
    }
}
