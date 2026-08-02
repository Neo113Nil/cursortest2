package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z14 {
    public static final z14 a;
    public static final z14 b;
    public static final z14 c;
    public static final /* synthetic */ z14[] d;

    static {
        z14 z14Var = new z14("CROSSED", 0);
        a = z14Var;
        z14 z14Var2 = new z14("NOT_CROSSED", 1);
        b = z14Var2;
        z14 z14Var3 = new z14("COLLAPSED", 2);
        c = z14Var3;
        d = new z14[]{z14Var, z14Var2, z14Var3};
    }

    public static z14 valueOf(String str) {
        return (z14) Enum.valueOf(z14.class, str);
    }

    public static z14[] values() {
        return (z14[]) d.clone();
    }
}
