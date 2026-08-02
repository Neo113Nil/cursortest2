package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qm0 {
    public static final qm0 a;
    public static final qm0 b;
    public static final qm0 c;
    public static final /* synthetic */ qm0[] d;

    static {
        qm0 qm0Var = new qm0("CURRENT", 0);
        a = qm0Var;
        qm0 qm0Var2 = new qm0("HISTORY", 1);
        b = qm0Var2;
        qm0 qm0Var3 = new qm0("COMPARE", 2);
        c = qm0Var3;
        d = new qm0[]{qm0Var, qm0Var2, qm0Var3};
    }

    public static qm0 valueOf(String str) {
        return (qm0) Enum.valueOf(qm0.class, str);
    }

    public static qm0[] values() {
        return (qm0[]) d.clone();
    }
}
