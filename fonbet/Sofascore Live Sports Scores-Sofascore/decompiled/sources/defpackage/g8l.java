package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class g8l {
    public static final jle e;
    public static final g8l f;
    public static final g8l g;
    public static final g8l h;
    public static final g8l i;
    public static final g8l j;
    public static final g8l k;
    public static final /* synthetic */ g8l[] l;
    public static final /* synthetic */ kp5 m;
    public final Function1 a;
    public final Function1 b;
    public final int c;
    public final int d;

    static {
        g8l g8lVar = new g8l(0, 0, R.string.all, "ALL", new nxk(7), new nxk(7));
        f = g8lVar;
        g8l g8lVar2 = new g8l(1, 0, R.string.quarter_1_short, "QUARTER1", new nxk(11), new nxk(12));
        g = g8lVar2;
        g8l g8lVar3 = new g8l(2, 15, R.string.quarter_2_short, "QUARTER2", new nxk(13), new nxk(14));
        h = g8lVar3;
        g8l g8lVar4 = new g8l(3, 30, R.string.quarter_3_short, "QUARTER3", new nxk(15), new nxk(16));
        i = g8lVar4;
        g8l g8lVar5 = new g8l(4, 45, R.string.quarter_4_short, "QUARTER4", new nxk(17), new nxk(8));
        j = g8lVar5;
        g8l g8lVar6 = new g8l(5, 60, R.string.overtime_short, "OVERTIME", new nxk(9), new nxk(10));
        k = g8lVar6;
        g8l[] g8lVarArr = {g8lVar, g8lVar2, g8lVar3, g8lVar4, g8lVar5, g8lVar6};
        l = g8lVarArr;
        m = new kp5(g8lVarArr);
        e = new jle(6);
    }

    public g8l(int i2, int i3, int i4, String str, Function1 function1, Function1 function12) {
        this.a = function1;
        this.b = function12;
        this.c = i3;
        this.d = i4;
    }

    public static g8l valueOf(String str) {
        return (g8l) Enum.valueOf(g8l.class, str);
    }

    public static g8l[] values() {
        return (g8l[]) l.clone();
    }
}
