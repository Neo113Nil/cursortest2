package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class r21 {
    public static final r21 a;
    public static final r21 b;
    public static final r21 c;
    public static final r21 d;
    public static final r21 e;
    public static final r21 f;
    public static final /* synthetic */ r21[] g;

    static {
        r21 r21Var = new r21("RESULTS_TENNIS", 0);
        a = r21Var;
        r21 r21Var2 = new r21("RESULTS_CRICKET", 1);
        b = r21Var2;
        r21 r21Var3 = new r21("RESULTS_MMA", 2);
        c = r21Var3;
        r21 r21Var4 = new r21("RESULTS_BASEBALL", 3);
        d = r21Var4;
        r21 r21Var5 = new r21("RESULTS", 4);
        e = r21Var5;
        r21 r21Var6 = new r21("OTHER_STATUSES", 5);
        f = r21Var6;
        g = new r21[]{r21Var, r21Var2, r21Var3, r21Var4, r21Var5, r21Var6};
    }

    public static r21 valueOf(String str) {
        return (r21) Enum.valueOf(r21.class, str);
    }

    public static r21[] values() {
        return (r21[]) g.clone();
    }
}
