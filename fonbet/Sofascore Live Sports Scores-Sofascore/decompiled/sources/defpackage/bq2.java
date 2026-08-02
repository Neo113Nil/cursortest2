package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bq2 {
    public static final bq2 a;
    public static final bq2 b;
    public static final bq2 c;
    public static final bq2 d;
    public static final bq2 e;
    public static final /* synthetic */ bq2[] f;

    static {
        bq2 bq2Var = new bq2("REPORT", 0);
        a = bq2Var;
        bq2 bq2Var2 = new bq2("REMOVE", 1);
        b = bq2Var2;
        bq2 bq2Var3 = new bq2("WARN", 2);
        c = bq2Var3;
        bq2 bq2Var4 = new bq2("BAN", 3);
        d = bq2Var4;
        bq2 bq2Var5 = new bq2("PERMANENTLY_BAN", 4);
        e = bq2Var5;
        f = new bq2[]{bq2Var, bq2Var2, bq2Var3, bq2Var4, bq2Var5};
    }

    public static bq2 valueOf(String str) {
        return (bq2) Enum.valueOf(bq2.class, str);
    }

    public static bq2[] values() {
        return (bq2[]) f.clone();
    }
}
