package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nu3 {
    public static final nu3 a;
    public static final nu3 b;
    public static final nu3 c;
    public static final nu3 d;
    public static final /* synthetic */ nu3[] e;

    static {
        nu3 nu3Var = new nu3("DEFAULT", 0);
        a = nu3Var;
        nu3 nu3Var2 = new nu3("LAZY", 1);
        b = nu3Var2;
        nu3 nu3Var3 = new nu3("ATOMIC", 2);
        c = nu3Var3;
        nu3 nu3Var4 = new nu3("UNDISPATCHED", 3);
        d = nu3Var4;
        e = new nu3[]{nu3Var, nu3Var2, nu3Var3, nu3Var4};
    }

    public static nu3 valueOf(String str) {
        return (nu3) Enum.valueOf(nu3.class, str);
    }

    public static nu3[] values() {
        return (nu3[]) e.clone();
    }
}
