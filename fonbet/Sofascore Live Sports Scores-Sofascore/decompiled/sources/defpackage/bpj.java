package defpackage;

import com.sofascore.model.newNetwork.topperformance.response.HandballTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.HandballTopTeamsStatisticsItem;
import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bpj implements ipj {
    public static final /* synthetic */ bpj[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final Function1 b;
    public final Function1 c;

    static {
        bpj[] bpjVarArr = {new bpj("GOALS_SCORED", 0, R.string.handball_goals_scored, new xoj(13), new apj(0)), new bpj("GOALS_CONCEDED", 1, R.string.handball_goals_conceded, new xoj(14), new xoj(15)), new bpj("SHOOTING_EFFICIENCY", 2, R.string.shooting_efficiency, new xoj(16), new xoj(17)), new bpj("FASTBREAK_GOALS", 3, R.string.fastbreak_goals, new xoj(18), new xoj(19)), new bpj("SEVEN_METERS", 4, R.string.seven_meters, new xoj(20), new xoj(21)), new bpj("STEALS", 5, R.string.steals, new xoj(22), new xoj(23)), new bpj("TWO_MIN_PENALTY", 6, R.string.two_min_penalty, new xoj(24), new xoj(25)), new bpj("GOALS_IN_POWERPLAY", 7, R.string.goals_in_powerplay, new xoj(26), new xoj(27)), new bpj("SHORT_HANDED_GOALS", 8, R.string.short_handed_goals, new xoj(28), new xoj(29))};
        d = bpjVarArr;
        e = new kp5(bpjVarArr);
    }

    public bpj(String str, int i, int i2, Function1 function1, Function1 function12) {
        this.a = i2;
        this.b = function1;
        this.c = function12;
    }

    public static bpj valueOf(String str) {
        return (bpj) Enum.valueOf(bpj.class, str);
    }

    public static bpj[] values() {
        return (bpj[]) d.clone();
    }

    @Override // defpackage.ipj
    public final /* bridge */ String a(Object obj) {
        return super.a((HandballTopTeamsStatisticsItem) obj);
    }

    @Override // defpackage.ipj
    public final /* bridge */ List b(Object obj) {
        return super.b((HandballTopTeamsStatistics) obj);
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
