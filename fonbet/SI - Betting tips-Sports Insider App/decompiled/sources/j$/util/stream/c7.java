package j$.util.stream;

import j$.util.Map;
import j$.util.Spliterator;
import java.util.EnumMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class c7 {
    public static final c7 DISTINCT;
    public static final c7 ORDERED;
    public static final c7 SHORT_CIRCUIT;
    public static final c7 SIZED;
    public static final c7 SORTED;

    /* renamed from: f, reason: collision with root package name */
    public static final int f17827f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f17828g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f17829h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f17830i;
    public static final int j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f17831k;

    /* renamed from: l, reason: collision with root package name */
    public static final int f17832l;

    /* renamed from: m, reason: collision with root package name */
    public static final int f17833m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f17834n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f17835o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f17836p;
    public static final int q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f17837r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f17838s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f17839t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f17840u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ c7[] f17841v;

    /* renamed from: a, reason: collision with root package name */
    public final Map f17842a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17843b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17844c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17845d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17846e;

    public static c7 valueOf(String str) {
        return (c7) Enum.valueOf(c7.class, str);
    }

    public static c7[] values() {
        return (c7[]) f17841v.clone();
    }

    static {
        b7 b7Var = b7.SPLITERATOR;
        j$.util.p x10 = x(b7Var);
        b7 b7Var2 = b7.STREAM;
        x10.a(b7Var2);
        b7 b7Var3 = b7.OP;
        ((EnumMap) ((Map) x10.f17766b)).put((EnumMap) b7Var3, (b7) 3);
        c7 c7Var = new c7("DISTINCT", 0, 0, x10);
        DISTINCT = c7Var;
        j$.util.p x11 = x(b7Var);
        x11.a(b7Var2);
        ((EnumMap) ((Map) x11.f17766b)).put((EnumMap) b7Var3, (b7) 3);
        c7 c7Var2 = new c7("SORTED", 1, 1, x11);
        SORTED = c7Var2;
        j$.util.p x12 = x(b7Var);
        x12.a(b7Var2);
        ((EnumMap) ((Map) x12.f17766b)).put((EnumMap) b7Var3, (b7) 3);
        b7 b7Var4 = b7.TERMINAL_OP;
        ((EnumMap) ((Map) x12.f17766b)).put((EnumMap) b7Var4, (b7) 2);
        b7 b7Var5 = b7.UPSTREAM_TERMINAL_OP;
        ((EnumMap) ((Map) x12.f17766b)).put((EnumMap) b7Var5, (b7) 2);
        c7 c7Var3 = new c7("ORDERED", 2, 2, x12);
        ORDERED = c7Var3;
        j$.util.p x13 = x(b7Var);
        x13.a(b7Var2);
        ((EnumMap) ((Map) x13.f17766b)).put((EnumMap) b7Var3, (b7) 2);
        c7 c7Var4 = new c7("SIZED", 3, 3, x13);
        SIZED = c7Var4;
        j$.util.p x14 = x(b7Var3);
        x14.a(b7Var4);
        int i5 = 0;
        c7 c7Var5 = new c7("SHORT_CIRCUIT", 4, 12, x14);
        SHORT_CIRCUIT = c7Var5;
        f17841v = new c7[]{c7Var, c7Var2, c7Var3, c7Var4, c7Var5};
        f17827f = j(b7Var);
        f17828g = j(b7Var2);
        f17829h = j(b7Var3);
        j(b7Var4);
        j(b7Var5);
        for (c7 c7Var6 : values()) {
            i5 |= c7Var6.f17846e;
        }
        f17830i = i5;
        int i10 = f17828g;
        j = i10;
        int i11 = i10 << 1;
        f17831k = i11;
        f17832l = i10 | i11;
        c7 c7Var7 = DISTINCT;
        f17833m = c7Var7.f17844c;
        f17834n = c7Var7.f17845d;
        c7 c7Var8 = SORTED;
        f17835o = c7Var8.f17844c;
        f17836p = c7Var8.f17845d;
        c7 c7Var9 = ORDERED;
        q = c7Var9.f17844c;
        f17837r = c7Var9.f17845d;
        c7 c7Var10 = SIZED;
        f17838s = c7Var10.f17844c;
        f17839t = c7Var10.f17845d;
        f17840u = SHORT_CIRCUIT.f17844c;
    }

    public static j$.util.p x(b7 b7Var) {
        j$.util.p pVar = new j$.util.p(7, new EnumMap(b7.class));
        pVar.a(b7Var);
        return pVar;
    }

    public c7(String str, int i5, int i10, j$.util.p pVar) {
        for (b7 b7Var : b7.values()) {
            Map.EL.b((java.util.Map) pVar.f17766b, b7Var, 0);
        }
        this.f17842a = (java.util.Map) pVar.f17766b;
        int i11 = i10 * 2;
        this.f17843b = i11;
        this.f17844c = 1 << i11;
        this.f17845d = 2 << i11;
        this.f17846e = 3 << i11;
    }

    public final boolean n(int i5) {
        return (i5 & this.f17846e) == this.f17844c;
    }

    public static int j(b7 b7Var) {
        int i5 = 0;
        for (c7 c7Var : values()) {
            i5 |= ((Integer) c7Var.f17842a.get(b7Var)).intValue() << c7Var.f17843b;
        }
        return i5;
    }

    public static int i(int i5, int i10) {
        int i11;
        if (i5 == 0) {
            i11 = f17830i;
        } else {
            i11 = ~(((j & i5) << 1) | i5 | ((f17831k & i5) >> 1));
        }
        return i5 | (i10 & i11);
    }

    public static int k(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        int i5 = characteristics & 4;
        int i10 = f17827f;
        return (i5 == 0 || spliterator.getComparator() == null) ? characteristics & i10 : characteristics & i10 & (-5);
    }
}
