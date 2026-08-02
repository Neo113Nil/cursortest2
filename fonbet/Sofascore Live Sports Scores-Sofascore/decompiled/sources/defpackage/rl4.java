package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class rl4 {
    public static final rl4 a;
    public static final rl4 b;
    public static final rl4 c;
    public static final /* synthetic */ rl4[] d;

    static {
        rl4 rl4Var = new rl4("PREFER_ARGB_8888", 0);
        a = rl4Var;
        rl4 rl4Var2 = new rl4("PREFER_RGB_565", 1);
        b = rl4Var2;
        d = new rl4[]{rl4Var, rl4Var2};
        c = rl4Var;
    }

    public static rl4 valueOf(String str) {
        return (rl4) Enum.valueOf(rl4.class, str);
    }

    public static rl4[] values() {
        return (rl4[]) d.clone();
    }
}
