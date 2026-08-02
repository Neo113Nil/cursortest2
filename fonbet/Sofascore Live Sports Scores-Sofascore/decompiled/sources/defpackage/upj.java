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
public final class upj implements cqj {
    public static final /* synthetic */ upj[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final Function1 b;
    public final Function1 c;

    static {
        upj[] upjVarArr = {new upj("GOALS_SCORED", 0, R.string.handball_goals_scored, new spj(5), new spj(22)), new upj("GOALS_CONCEDED", 1, R.string.handball_goals_conceded, new spj(6), new spj(7)), new upj("SHOOTING_EFFICIENCY", 2, R.string.shooting_efficiency, new spj(8), new spj(9)), new upj("FASTBREAK_GOALS", 3, R.string.fastbreak_goals, new spj(10), new spj(11)), new upj("SEVEN_METERS", 4, R.string.seven_meters, new spj(12), new spj(13)), new upj("STEALS", 5, R.string.steals, new spj(14), new spj(15)), new upj("TWO_MIN_PENALTY", 6, R.string.two_min_penalty, new spj(16), new spj(17)), new upj("GOALS_IN_POWERPLAY", 7, R.string.goals_in_powerplay, new spj(18), new spj(19)), new upj("SHORT_HANDED_GOALS", 8, R.string.short_handed_goals, new spj(20), new spj(21))};
        d = upjVarArr;
        e = new kp5(upjVarArr);
    }

    public upj(String str, int i, int i2, Function1 function1, Function1 function12) {
        this.a = i2;
        this.b = function1;
        this.c = function12;
    }

    public static upj valueOf(String str) {
        return (upj) Enum.valueOf(upj.class, str);
    }

    public static upj[] values() {
        return (upj[]) d.clone();
    }

    @Override // defpackage.cqj
    public final /* bridge */ String a(Object obj) {
        return super.a((HandballTopTeamsStatisticsItem) obj);
    }

    @Override // defpackage.cqj
    public final /* bridge */ List b(Object obj) {
        return super.b((HandballTopTeamsStatistics) obj);
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
