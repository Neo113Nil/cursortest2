package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v55 {
    public static final v55 a;
    public static final v55 b;
    public static final v55 c;
    public static final /* synthetic */ v55[] d;

    static {
        v55 v55Var = new v55("Start", 0);
        a = v55Var;
        v55 v55Var2 = new v55("Center", 1);
        b = v55Var2;
        v55 v55Var3 = new v55("End", 2);
        c = v55Var3;
        d = new v55[]{v55Var, v55Var2, v55Var3};
    }

    public static v55 valueOf(String str) {
        return (v55) Enum.valueOf(v55.class, str);
    }

    public static v55[] values() {
        return (v55[]) d.clone();
    }
}
