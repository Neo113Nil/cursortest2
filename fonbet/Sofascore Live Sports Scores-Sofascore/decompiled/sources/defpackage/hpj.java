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
public final class hpj implements ipj {
    public static final /* synthetic */ hpj[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final Function1 b;
    public final Function1 c;

    static {
        hpj[] hpjVarArr = {new hpj("FIRST_SERVE", 0, R.string.tennis_first_serve, new epj(29), new gpj(16)), new hpj("FIRST_SERVE_POINTS_WON", 1, R.string.tennis_first_serve_points_won, new gpj(0), new gpj(1)), new hpj("SECOND_SERVE", 2, R.string.tennis_second_serve, new gpj(2), new gpj(3)), new hpj("SECOND_SERVE_POINTS", 3, R.string.tennis_second_serve_points, new gpj(4), new gpj(5)), new hpj("AVERAGE_ACES", 4, R.string.tennis_average_aces_per_match, new gpj(6), new gpj(7)), new hpj("AVERAGE_DOUBLE_FAULTS", 5, R.string.tennis_average_double_faults_per_match, new gpj(8), new gpj(9)), new hpj("BREAK_POINTS_SAVED", 6, R.string.break_points_saved, new gpj(10), new gpj(11)), new hpj("BREAK_POINTS_CONVERTED", 7, R.string.break_points_converted, new gpj(12), new gpj(13)), new hpj("TIEBREAKS_WON", 8, R.string.tennis_tiebreaks_won, new gpj(14), new gpj(15))};
        d = hpjVarArr;
        e = new kp5(hpjVarArr);
    }

    public hpj(String str, int i, int i2, Function1 function1, Function1 function12) {
        this.a = i2;
        this.b = function1;
        this.c = function12;
    }

    public static hpj valueOf(String str) {
        return (hpj) Enum.valueOf(hpj.class, str);
    }

    public static hpj[] values() {
        return (hpj[]) d.clone();
    }

    @Override // defpackage.ipj
    public final /* bridge */ String a(Object obj) {
        return super.a((TennisTopTeamsStatisticsItem) obj);
    }

    @Override // defpackage.ipj
    public final /* bridge */ List b(Object obj) {
        return super.b((TennisTopTeamsStatistics) obj);
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
