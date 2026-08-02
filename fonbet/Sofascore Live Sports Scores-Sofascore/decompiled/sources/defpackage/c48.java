package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class c48 {
    public static final c48 a;
    public static final c48 b;
    public static final c48 c;
    public static final c48 d;
    public static final /* synthetic */ c48[] e;

    static {
        c48 c48Var = new c48("UNKNOWN_DISMISS_TYPE", 0);
        a = c48Var;
        c48 c48Var2 = new c48("AUTO", 1);
        b = c48Var2;
        c48 c48Var3 = new c48("CLICK", 2);
        c = c48Var3;
        c48 c48Var4 = new c48("SWIPE", 3);
        d = c48Var4;
        e = new c48[]{c48Var, c48Var2, c48Var3, c48Var4};
    }

    public static c48 valueOf(String str) {
        return (c48) Enum.valueOf(c48.class, str);
    }

    public static c48[] values() {
        return (c48[]) e.clone();
    }
}
