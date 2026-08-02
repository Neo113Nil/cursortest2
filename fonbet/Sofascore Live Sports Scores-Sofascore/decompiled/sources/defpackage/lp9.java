package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class lp9 implements nk2 {
    public static final bp9 b;
    public static final kp9 c;
    public static final ip9 d;
    public static final jp9 e;
    public static final gp9 f;
    public static final ep9 g;
    public static final dp9 h;
    public static final fp9 i;
    public static final cp9 j;
    public static final hp9 k;
    public static final /* synthetic */ lp9[] l;
    public final int a;

    static {
        kp9 kp9Var = new kp9();
        c = kp9Var;
        ip9 ip9Var = new ip9();
        d = ip9Var;
        jp9 jp9Var = new jp9();
        e = jp9Var;
        gp9 gp9Var = new gp9();
        f = gp9Var;
        ep9 ep9Var = new ep9();
        g = ep9Var;
        dp9 dp9Var = new dp9();
        h = dp9Var;
        fp9 fp9Var = new fp9();
        i = fp9Var;
        cp9 cp9Var = new cp9();
        j = cp9Var;
        hp9 hp9Var = new hp9();
        k = hp9Var;
        l = new lp9[]{kp9Var, ip9Var, jp9Var, gp9Var, ep9Var, dp9Var, fp9Var, cp9Var, hp9Var};
        b = new bp9();
    }

    public lp9(String str, int i2, int i3) {
        this.a = i3;
    }

    public static lp9 valueOf(String str) {
        return (lp9) Enum.valueOf(lp9.class, str);
    }

    public static lp9[] values() {
        return (lp9[]) l.clone();
    }

    @Override // defpackage.nk2
    public final int d() {
        return this.a;
    }
}
