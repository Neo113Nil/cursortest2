package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nf6 {
    public static final nf6 a;
    public static final nf6 b;
    public static final nf6 c;
    public static final nf6 d;
    public static final /* synthetic */ nf6[] e;

    static {
        nf6 nf6Var = new nf6("REPLACE", 0);
        a = nf6Var;
        nf6 nf6Var2 = new nf6("KEEP", 1);
        b = nf6Var2;
        nf6 nf6Var3 = new nf6("APPEND", 2);
        c = nf6Var3;
        nf6 nf6Var4 = new nf6("APPEND_OR_REPLACE", 3);
        d = nf6Var4;
        e = new nf6[]{nf6Var, nf6Var2, nf6Var3, nf6Var4};
    }

    public static nf6 valueOf(String str) {
        return (nf6) Enum.valueOf(nf6.class, str);
    }

    public static nf6[] values() {
        return (nf6[]) e.clone();
    }
}
