package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ut1 implements yse {
    public static final /* synthetic */ ut1[] d;
    public static final /* synthetic */ kp5 e;
    public final q9k a;
    public final q9k b;
    public final Function1 c;

    static {
        ut1[] ut1VarArr = {new ut1("AT_BATS", 0, new q9k(R.string.baseball_at_bats_short), new q9k(R.string.baseball_at_bats), new ls1(7)), new ut1("RUNS", 1, new q9k(R.string.baseball_runs_short), new q9k(R.string.baseball_runs), new ls1(10)), new ut1("HITS", 2, new q9k(R.string.baseball_hits_short), new q9k(R.string.baseball_hits), new ls1(11)), new ut1("RBI", 3, new q9k(R.string.baseball_runs_batted_in_short), new q9k(R.string.baseball_runs_batted_in), new ls1(12)), new ut1("HOME_RUNS", 4, new q9k(R.string.baseball_home_runs_short), new q9k(R.string.baseball_home_runs), new ls1(13)), new ut1("WALKS", 5, new q9k(R.string.baseball_walks_short), new q9k(R.string.baseball_walks), new ls1(14)), new ut1("STRIKEOUTS", 6, new q9k(R.string.baseball_strikeouts_short), new q9k(R.string.baseball_strikeouts), new ls1(15)), new ut1("BATTING_AVERAGE", 7, new q9k(R.string.baseball_batting_average_short), new q9k(R.string.baseball_batting_average), new ls1(16)), new ut1("ON_BASE_PERCENTAGE", 8, new q9k(R.string.baseball_on_base_percentage_short), new q9k(R.string.baseball_on_base_percentage), new ls1(17)), new ut1("SLUGGING_PERCENTAGE", 9, new q9k(R.string.baseball_slugging_percentage_short), new q9k(R.string.baseball_slugging_percentage), new ls1(8)), new ut1("OPS", 10, new q9k(R.string.baseball_on_base_plus_slugging_short), new q9k(R.string.baseball_on_base_plus_slugging), new ls1(9))};
        d = ut1VarArr;
        e = new kp5(ut1VarArr);
    }

    public ut1(String str, int i, q9k q9kVar, q9k q9kVar2, Function1 function1) {
        this.a = q9kVar;
        this.b = q9kVar2;
        this.c = function1;
    }

    public static ut1 valueOf(String str) {
        return (ut1) Enum.valueOf(ut1.class, str);
    }

    public static ut1[] values() {
        return (ut1[]) d.clone();
    }

    @Override // defpackage.yse
    public final Function1 d() {
        return this.c;
    }

    @Override // defpackage.yse
    public final r9k g() {
        return this.a;
    }

    @Override // defpackage.yse
    public final r9k h() {
        return this.b;
    }
}
