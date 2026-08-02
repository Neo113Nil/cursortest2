package defpackage;

import com.sofascore.model.newNetwork.topperformance.response.TennisTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.TennisTopTeamsStatisticsItem;
import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bqj implements cqj {
    public static final /* synthetic */ bqj[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final Function1 b;
    public final Function1 c;

    static {
        bqj[] bqjVarArr = {new bqj("FIRST_SERVE", 0, R.string.tennis_first_serve, new ypj(21), new aqj(8)), new bqj("FIRST_SERVE_POINTS_WON", 1, R.string.tennis_first_serve_points_won, new ypj(22), new ypj(23)), new bqj("SECOND_SERVE", 2, R.string.tennis_second_serve, new ypj(24), new ypj(25)), new bqj("SECOND_SERVE_POINTS", 3, R.string.tennis_second_serve_points, new ypj(26), new ypj(27)), new bqj("AVERAGE_ACES", 4, R.string.tennis_average_aces_per_match, new ypj(28), new ypj(29)), new bqj("AVERAGE_DOUBLE_FAULTS", 5, R.string.tennis_average_double_faults_per_match, new aqj(0), new aqj(1)), new bqj("BREAK_POINTS_SAVED", 6, R.string.break_points_saved, new aqj(2), new aqj(3)), new bqj("BREAK_POINTS_CONVERTED", 7, R.string.break_points_converted, new aqj(4), new aqj(5)), new bqj("TIEBREAKS_WON", 8, R.string.tennis_tiebreaks_won, new aqj(6), new aqj(7))};
        d = bqjVarArr;
        e = new kp5(bqjVarArr);
    }

    public bqj(String str, int i, int i2, Function1 function1, Function1 function12) {
        this.a = i2;
        this.b = function1;
        this.c = function12;
    }

    public static bqj valueOf(String str) {
        return (bqj) Enum.valueOf(bqj.class, str);
    }

    public static bqj[] values() {
        return (bqj[]) d.clone();
    }

    @Override // defpackage.cqj
    public final /* bridge */ String a(Object obj) {
        return super.a((TennisTopTeamsStatisticsItem) obj);
    }

    @Override // defpackage.cqj
    public final /* bridge */ List b(Object obj) {
        return super.b((TennisTopTeamsStatistics) obj);
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
