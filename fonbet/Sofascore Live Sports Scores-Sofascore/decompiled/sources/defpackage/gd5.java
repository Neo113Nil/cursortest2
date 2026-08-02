package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gd5 {
    public static final gd5 a;
    public static final gd5 b;
    public static final gd5 c;
    public static final /* synthetic */ gd5[] d;

    static {
        gd5 gd5Var = new gd5("Below", 0);
        a = gd5Var;
        gd5 gd5Var2 = new gd5("Above", 1);
        b = gd5Var2;
        gd5 gd5Var3 = new gd5("Center", 2);
        c = gd5Var3;
        d = new gd5[]{gd5Var, gd5Var2, gd5Var3};
    }

    public static gd5 valueOf(String str) {
        return (gd5) Enum.valueOf(gd5.class, str);
    }

    public static gd5[] values() {
        return (gd5[]) d.clone();
    }
}
