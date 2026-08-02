package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class d48 {
    public static final d48 a;
    public static final d48 b;
    public static final d48 c;
    public static final d48 d;
    public static final /* synthetic */ d48[] e;

    static {
        d48 d48Var = new d48("UNSPECIFIED_RENDER_ERROR", 0);
        a = d48Var;
        d48 d48Var2 = new d48("IMAGE_FETCH_ERROR", 1);
        b = d48Var2;
        d48 d48Var3 = new d48("IMAGE_DISPLAY_ERROR", 2);
        c = d48Var3;
        d48 d48Var4 = new d48("IMAGE_UNSUPPORTED_FORMAT", 3);
        d = d48Var4;
        e = new d48[]{d48Var, d48Var2, d48Var3, d48Var4};
    }

    public static d48 valueOf(String str) {
        return (d48) Enum.valueOf(d48.class, str);
    }

    public static d48[] values() {
        return (d48[]) e.clone();
    }
}
