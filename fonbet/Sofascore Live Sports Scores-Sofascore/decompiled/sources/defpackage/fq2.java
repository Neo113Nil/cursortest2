package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fq2 {
    public static final fq2 a;
    public static final fq2 b;
    public static final /* synthetic */ fq2[] c;

    static {
        fq2 fq2Var = new fq2("RISKY", 0);
        a = fq2Var;
        fq2 fq2Var2 = new fq2("REMOVE", 1);
        b = fq2Var2;
        c = new fq2[]{fq2Var, fq2Var2};
    }

    public static fq2 valueOf(String str) {
        return (fq2) Enum.valueOf(fq2.class, str);
    }

    public static fq2[] values() {
        return (fq2[]) c.clone();
    }
}
