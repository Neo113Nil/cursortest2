package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class yd0 {
    public static final yd0 a;
    public static final yd0 b;
    public static final /* synthetic */ yd0[] c;

    static {
        yd0 yd0Var = new yd0("MOBILE_INSTALL_EVENT", 0);
        a = yd0Var;
        yd0 yd0Var2 = new yd0("CUSTOM_APP_EVENTS", 1);
        b = yd0Var2;
        c = new yd0[]{yd0Var, yd0Var2};
    }

    public static yd0 valueOf(String str) {
        return (yd0) Enum.valueOf(yd0.class, str);
    }

    public static yd0[] values() {
        return (yd0[]) c.clone();
    }
}
