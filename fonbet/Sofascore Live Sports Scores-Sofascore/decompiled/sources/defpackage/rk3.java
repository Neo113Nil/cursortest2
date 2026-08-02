package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rk3 {
    public static final rk3 a;
    public static final rk3 b;
    public static final rk3 c;
    public static final rk3 d;
    public static final rk3 e;
    public static final /* synthetic */ rk3[] f;

    static {
        rk3 rk3Var = new rk3("CONNECTING", 0);
        a = rk3Var;
        rk3 rk3Var2 = new rk3("READY", 1);
        b = rk3Var2;
        rk3 rk3Var3 = new rk3("TRANSIENT_FAILURE", 2);
        c = rk3Var3;
        rk3 rk3Var4 = new rk3("IDLE", 3);
        d = rk3Var4;
        rk3 rk3Var5 = new rk3("SHUTDOWN", 4);
        e = rk3Var5;
        f = new rk3[]{rk3Var, rk3Var2, rk3Var3, rk3Var4, rk3Var5};
    }

    public static rk3 valueOf(String str) {
        return (rk3) Enum.valueOf(rk3.class, str);
    }

    public static rk3[] values() {
        return (rk3[]) f.clone();
    }
}
