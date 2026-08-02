package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class gl1 {
    public static final gl1 a;
    public static final gl1 b;
    public static final /* synthetic */ gl1[] c;

    static {
        gl1 gl1Var = new gl1("SeasonStats", 0);
        a = gl1Var;
        gl1 gl1Var2 = new gl1("EventStats", 1);
        b = gl1Var2;
        c = new gl1[]{gl1Var, gl1Var2};
    }

    public static gl1 valueOf(String str) {
        return (gl1) Enum.valueOf(gl1.class, str);
    }

    public static gl1[] values() {
        return (gl1[]) c.clone();
    }
}
