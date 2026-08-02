package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cg0 {
    public static final cg0 a;
    public static final cg0 b;
    public static final cg0 c;
    public static final /* synthetic */ cg0[] d;

    static {
        cg0 cg0Var = new cg0("Pending", 0);
        a = cg0Var;
        cg0 cg0Var2 = new cg0("Subscribed", 1);
        b = cg0Var2;
        cg0 cg0Var3 = new cg0("Disabled", 2);
        c = cg0Var3;
        d = new cg0[]{cg0Var, cg0Var2, cg0Var3};
    }

    public static cg0 valueOf(String str) {
        return (cg0) Enum.valueOf(cg0.class, str);
    }

    public static cg0[] values() {
        return (cg0[]) d.clone();
    }
}
