package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class kl1 {
    public static final kl1 a;
    public static final kl1 b;
    public static final kl1 c;
    public static final kl1 d;
    public static final kl1 e;
    public static final /* synthetic */ kl1[] f;

    static {
        kl1 kl1Var = new kl1("Table", 0);
        a = kl1Var;
        kl1 kl1Var2 = new kl1("PitchGraph", 1);
        b = kl1Var2;
        kl1 kl1Var3 = new kl1("SprayGraph", 2);
        c = kl1Var3;
        kl1 kl1Var4 = new kl1("ZoneGraphPercent", 3);
        d = kl1Var4;
        kl1 kl1Var5 = new kl1("ZoneGraphAbsolute", 4);
        e = kl1Var5;
        f = new kl1[]{kl1Var, kl1Var2, kl1Var3, kl1Var4, kl1Var5};
    }

    public static kl1 valueOf(String str) {
        return (kl1) Enum.valueOf(kl1.class, str);
    }

    public static kl1[] values() {
        return (kl1[]) f.clone();
    }
}
