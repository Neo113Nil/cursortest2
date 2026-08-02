package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ad7 {
    public static final zic a;
    public static final ad7 b;
    public static final ad7 c;
    public static final ad7 d;
    public static final /* synthetic */ ad7[] e;

    static {
        ad7 ad7Var = new ad7("STARTER", 0);
        b = ad7Var;
        ad7 ad7Var2 = new ad7("SUBSTITUTE", 1);
        c = ad7Var2;
        ad7 ad7Var3 = new ad7("NOT_IN_SQUAD", 2);
        d = ad7Var3;
        e = new ad7[]{ad7Var, ad7Var2, ad7Var3};
        a = new zic(23);
    }

    public static ad7 valueOf(String str) {
        return (ad7) Enum.valueOf(ad7.class, str);
    }

    public static ad7[] values() {
        return (ad7[]) e.clone();
    }
}
