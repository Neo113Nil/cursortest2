package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class uv0 {
    public static final uv0 a;
    public static final uv0 b;
    public static final /* synthetic */ uv0[] c;

    static {
        uv0 uv0Var = new uv0("MONTH_FEATURED_OFFER", 0);
        a = uv0Var;
        uv0 uv0Var2 = new uv0("MONTH_YEAR", 1);
        b = uv0Var2;
        c = new uv0[]{uv0Var, uv0Var2};
    }

    public static uv0 valueOf(String str) {
        return (uv0) Enum.valueOf(uv0.class, str);
    }

    public static uv0[] values() {
        return (uv0[]) c.clone();
    }
}
