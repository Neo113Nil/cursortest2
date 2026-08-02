package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ut {
    public static final q1f b;
    public static final ut c;
    public static final ut d;
    public static final /* synthetic */ ut[] e;
    public static final /* synthetic */ kp5 f;
    public final int a;

    static {
        ut utVar = new ut("WIN_PROBABILITY_GRAPH", 0, R.string.am_football_win_probability);
        c = utVar;
        ut utVar2 = new ut("SCORE_GRAPH", 1, R.string.score_graph);
        d = utVar2;
        ut[] utVarArr = {utVar, utVar2};
        e = utVarArr;
        f = new kp5(utVarArr);
        b = new q1f(15);
    }

    public ut(String str, int i, int i2) {
        this.a = i2;
    }

    public static ut valueOf(String str) {
        return (ut) Enum.valueOf(ut.class, str);
    }

    public static ut[] values() {
        return (ut[]) e.clone();
    }
}
