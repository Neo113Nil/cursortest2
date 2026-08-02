package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class iu3 {
    public static final iu3 a;
    public static final iu3 b;
    public static final iu3 c;
    public static final iu3 d;
    public static final iu3 e;
    public static final /* synthetic */ iu3[] f;

    static {
        iu3 iu3Var = new iu3("CPU_ACQUIRED", 0);
        a = iu3Var;
        iu3 iu3Var2 = new iu3("BLOCKING", 1);
        b = iu3Var2;
        iu3 iu3Var3 = new iu3("PARKING", 2);
        c = iu3Var3;
        iu3 iu3Var4 = new iu3("DORMANT", 3);
        d = iu3Var4;
        iu3 iu3Var5 = new iu3("TERMINATED", 4);
        e = iu3Var5;
        f = new iu3[]{iu3Var, iu3Var2, iu3Var3, iu3Var4, iu3Var5};
    }

    public static iu3 valueOf(String str) {
        return (iu3) Enum.valueOf(iu3.class, str);
    }

    public static iu3[] values() {
        return (iu3[]) f.clone();
    }
}
