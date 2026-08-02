package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function2;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'j' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d8i {
    public static final d8i f;
    public static final d8i g;
    public static final d8i h;
    public static final d8i i;
    public static final d8i j;
    public static final d8i k;
    public static final d8i l;
    public static final d8i m;
    public static final d8i n;
    public static final d8i o;
    public static final d8i p;
    public static final d8i q;
    public static final d8i r;
    public static final d8i s;
    public static final d8i t;
    public static final d8i u;
    public static final d8i v;
    public static final d8i w;
    public static final /* synthetic */ d8i[] x;
    public final Integer a;
    public final Integer b;
    public final int c;
    public final Function2 d;
    public final boolean e;

    static {
        d8i d8iVar = new d8i("GRID", 0, Integer.valueOf(R.string.motorsport_grid_short), Integer.valueOf(R.string.motorsport_grid_position), 28, new wqg(24), false);
        f = d8iVar;
        d8i d8iVar2 = new d8i("PITS", 1, Integer.valueOf(R.string.motorsport_pit_stops_short), Integer.valueOf(R.string.motorsport_legend_pit_stops), 28, new wqg(25), true);
        g = d8iVar2;
        d8i d8iVar3 = new d8i("LAPS", 2, Integer.valueOf(R.string.motorsport_laps_short), Integer.valueOf(R.string.motorsport_legend_laps), 28, new wqg(26), true);
        h = d8iVar3;
        d8i d8iVar4 = new d8i("LAPS_LEAD", 3, Integer.valueOf(R.string.motorsport_race_laps_led_short), Integer.valueOf(R.string.laps_led), 72, new wqg(27), false);
        i = d8iVar4;
        Integer valueOf = Integer.valueOf(R.string.motorsport_race_best_lap_short);
        Integer valueOf2 = Integer.valueOf(R.string.best_lap);
        d8i d8iVar5 = new d8i("BEST_LAP", 4, valueOf, valueOf2, 72, new wqg(28), false);
        j = d8iVar5;
        d8i d8iVar6 = new d8i("STATUS", 5, Integer.valueOf(R.string.motorsport_status), null, 72, new wqg(29), false);
        k = d8iVar6;
        Integer valueOf3 = Integer.valueOf(R.string.motorsport_points_short);
        Integer valueOf4 = Integer.valueOf(R.string.motorsport_legend_points);
        d8i d8iVar7 = new d8i("POINTS", 6, valueOf3, valueOf4, 28, new c8i((byte) 0, 0), false);
        l = d8iVar7;
        d8i d8iVar8 = new d8i("POINTS_SPRINT", 7, valueOf3, valueOf4, 28, new c8i((byte) 0, 1), false);
        m = d8iVar8;
        d8i d8iVar9 = new d8i("POINTS_CLIMB", 8, valueOf3, valueOf4, 28, new c8i((byte) 0, 2), false);
        n = d8iVar9;
        d8i d8iVar10 = new d8i("GAP", 9, Integer.valueOf(R.string.motorsport_gap_short), Integer.valueOf(R.string.formula_gap), 72, new c8i((byte) 0, 3), true);
        o = d8iVar10;
        d8i d8iVar11 = new d8i("INTERVAL", 10, Integer.valueOf(R.string.motorsport_interval_short), Integer.valueOf(R.string.motorsport_legend_interval), 72, new c8i((byte) 0, 4), true);
        p = d8iVar11;
        Integer valueOf5 = Integer.valueOf(R.string.time);
        d8i d8iVar12 = new d8i("GAP_TIME", 11, valueOf5, null, 72, new c8i((byte) 0, 5), true);
        q = d8iVar12;
        d8i d8iVar13 = new d8i("TIME", 12, valueOf5, null, 72, new c8i((byte) 0, 6), true);
        d8i d8iVar14 = new d8i("TIME_YOUNG", 13, valueOf5, null, 72, new c8i((byte) 0, 7), true);
        r = d8iVar14;
        d8i d8iVar15 = new d8i("TOTAL_TIME", 14, valueOf5, null, 72, new c8i((byte) 0, 8), true);
        s = d8iVar15;
        d8i d8iVar16 = new d8i("BEST_LAP_NUMBER", 15, valueOf, valueOf2, 28, new c8i((byte) 0, 9), false);
        t = d8iVar16;
        d8i d8iVar17 = new d8i("BEST_LAP_TIME", 16, valueOf5, null, 72, new c8i((byte) 0, 10), false);
        u = d8iVar17;
        d8i d8iVar18 = new d8i("STARTING_TYRES", 17, Integer.valueOf(R.string.motorsport_starting_tyres_short), Integer.valueOf(R.string.motorsport_legend_starting_tyres), 28, new c8i((byte) 0, 11), false);
        v = d8iVar18;
        d8i d8iVar19 = new d8i("FINISH_TYRES", 18, Integer.valueOf(R.string.motorsport_finishing_tyres_short), Integer.valueOf(R.string.motorsport_legend_finishing_tyres), 28, new c8i((byte) 0, 12), false);
        w = d8iVar19;
        x = new d8i[]{d8iVar, d8iVar2, d8iVar3, d8iVar4, d8iVar5, d8iVar6, d8iVar7, d8iVar8, d8iVar9, d8iVar10, d8iVar11, d8iVar12, d8iVar13, d8iVar14, d8iVar15, d8iVar16, d8iVar17, d8iVar18, d8iVar19};
    }

    public d8i(String str, int i2, Integer num, Integer num2, int i3, Function2 function2, boolean z) {
        this.a = num;
        this.b = num2;
        this.c = i3;
        this.d = function2;
        this.e = z;
    }

    public static d8i valueOf(String str) {
        return (d8i) Enum.valueOf(d8i.class, str);
    }

    public static d8i[] values() {
        return (d8i[]) x.clone();
    }
}
