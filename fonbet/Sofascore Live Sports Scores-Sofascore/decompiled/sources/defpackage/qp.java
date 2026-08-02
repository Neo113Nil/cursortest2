package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qp implements e1 {
    public static final /* synthetic */ qp[] f;
    public static final /* synthetic */ kp5 g;
    public final int a;
    public final int b;
    public final Function1 c;
    public final Function1 d;
    public final Function1 e;

    static {
        qp[] qpVarArr = {new qp("INTERCEPTIONS", 0, R.string.am_football_lineups_interceptions, R.string.legend_am_foot_interceptions, new op(4), new op(15), new op(16)), new qp("YARDS", 1, R.string.am_football_lineups_yards, R.string.legend_am_foot_interception_yards, new op(17), new op(18), new op(5)), new qp("TOUCHDOWNS", 2, R.string.am_football_lineups_touchdowns, R.string.am_football_interception_touchdowns, new op(6), new op(7), new op(8)), new qp("RETURNS_AVERAGE_YARDS", 3, R.string.am_football_int_return_avg_yds, R.string.legend_am_foot_avg_return_yards, new op(9), new op(10), new op(11)), new qp("RETURNS_YARDS", 4, R.string.am_football_longest_interception_return_short, R.string.legend_am_foot_intrcptn_longest_return, new op(12), new op(13), new op(14))};
        f = qpVarArr;
        g = new kp5(qpVarArr);
    }

    public qp(String str, int i, int i2, int i3, Function1 function1, Function1 function12, Function1 function13) {
        this.a = i2;
        this.b = i3;
        this.c = function1;
        this.d = function12;
        this.e = function13;
    }

    public static qp valueOf(String str) {
        return (qp) Enum.valueOf(qp.class, str);
    }

    public static qp[] values() {
        return (qp[]) f.clone();
    }

    @Override // defpackage.e1
    public final Function1 d() {
        return this.c;
    }

    @Override // defpackage.e1
    public final int g() {
        return this.a;
    }

    @Override // defpackage.e1
    public final Function1 h() {
        return this.d;
    }

    @Override // defpackage.e1
    public final boolean i() {
        return false;
    }

    @Override // defpackage.e1
    public final boolean j() {
        return false;
    }

    @Override // defpackage.e1
    public final boolean k() {
        return false;
    }

    @Override // defpackage.e1
    public final int l() {
        return this.b;
    }

    @Override // defpackage.e1
    public final Function1 m() {
        return this.e;
    }
}
