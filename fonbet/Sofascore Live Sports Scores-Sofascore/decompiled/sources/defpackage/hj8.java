package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class hj8 implements nk2 {
    public static final zi8 b;
    public static final fj8 c;
    public static final bj8 d;
    public static final ej8 e;
    public static final gj8 f;
    public static final dj8 g;
    public static final aj8 h;
    public static final wi8 i;
    public static final cj8 j;
    public static final yi8 k;
    public static final xi8 l;
    public static final /* synthetic */ hj8[] m;
    public final int a;

    static {
        fj8 fj8Var = new fj8();
        c = fj8Var;
        bj8 bj8Var = new bj8();
        d = bj8Var;
        ej8 ej8Var = new ej8();
        e = ej8Var;
        gj8 gj8Var = new gj8();
        f = gj8Var;
        dj8 dj8Var = new dj8();
        g = dj8Var;
        aj8 aj8Var = new aj8();
        h = aj8Var;
        wi8 wi8Var = new wi8();
        i = wi8Var;
        cj8 cj8Var = new cj8();
        j = cj8Var;
        yi8 yi8Var = new yi8();
        k = yi8Var;
        xi8 xi8Var = new xi8();
        l = xi8Var;
        m = new hj8[]{fj8Var, bj8Var, ej8Var, gj8Var, dj8Var, aj8Var, wi8Var, cj8Var, yi8Var, xi8Var};
        b = new zi8();
    }

    public hj8(String str, int i2, int i3) {
        this.a = i3;
    }

    public static hj8 valueOf(String str) {
        return (hj8) Enum.valueOf(hj8.class, str);
    }

    public static hj8[] values() {
        return (hj8[]) m.clone();
    }

    @Override // defpackage.nk2
    public final int d() {
        return this.a;
    }
}
