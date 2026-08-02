package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xk2 {
    public static final xk2 a;
    public static final xk2 b;
    public static final xk2 c;
    public static final /* synthetic */ xk2[] d;

    static {
        xk2 xk2Var = new xk2("ALL", 0);
        a = xk2Var;
        xk2 xk2Var2 = new xk2("CLUB", 1);
        b = xk2Var2;
        xk2 xk2Var3 = new xk2("NATIONAL", 2);
        c = xk2Var3;
        d = new xk2[]{xk2Var, xk2Var2, xk2Var3};
    }

    public static xk2 valueOf(String str) {
        return (xk2) Enum.valueOf(xk2.class, str);
    }

    public static xk2[] values() {
        return (xk2[]) d.clone();
    }
}
