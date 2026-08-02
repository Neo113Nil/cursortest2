package defpackage;

import com.sofascore.model.newNetwork.topperformance.response.FutsalTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.FutsalTopTeamsStatisticsItem;
import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tpj implements cqj {
    public static final /* synthetic */ tpj[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final Function1 b;
    public final Function1 c;

    static {
        tpj[] tpjVarArr = {new tpj("GOALS_SCORED", 0, R.string.futsal_goals_scored, new qpj(23), new qpj(28)), new tpj("GOALS_CONCEDED", 1, R.string.futsal_goals_conceded, new qpj(29), new spj(0)), new tpj("CLEAN_SHEETS", 2, R.string.football_clean_sheets, new spj(1), new spj(2)), new tpj("YELLOW_CARDS", 3, R.string.football_yellow_cards, new spj(3), new spj(4)), new tpj("RED_CARDS", 4, R.string.futsal_red_cards, new qpj(24), new qpj(25)), new tpj("PENALTY_GOALS", 5, R.string.football_penalty_goals, new qpj(26), new qpj(27))};
        d = tpjVarArr;
        e = new kp5(tpjVarArr);
    }

    public tpj(String str, int i, int i2, Function1 function1, Function1 function12) {
        this.a = i2;
        this.b = function1;
        this.c = function12;
    }

    public static tpj valueOf(String str) {
        return (tpj) Enum.valueOf(tpj.class, str);
    }

    public static tpj[] values() {
        return (tpj[]) d.clone();
    }

    @Override // defpackage.cqj
    public final /* bridge */ String a(Object obj) {
        return super.a((FutsalTopTeamsStatisticsItem) obj);
    }

    @Override // defpackage.cqj
    public final /* bridge */ List b(Object obj) {
        return super.b((FutsalTopTeamsStatistics) obj);
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
