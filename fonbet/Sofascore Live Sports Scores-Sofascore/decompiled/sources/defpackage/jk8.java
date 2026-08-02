package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jk8 {
    public static final jk8 a;
    public static final jk8 b;
    public static final jk8 c;
    public static final /* synthetic */ jk8[] d;

    static {
        jk8 jk8Var = new jk8("FIRST_TEAM", 0);
        a = jk8Var;
        jk8 jk8Var2 = new jk8("SECOND_TEAM", 1);
        b = jk8Var2;
        jk8 jk8Var3 = new jk8("TOTAL", 2);
        c = jk8Var3;
        d = new jk8[]{jk8Var, jk8Var2, jk8Var3};
    }

    public static jk8 valueOf(String str) {
        return (jk8) Enum.valueOf(jk8.class, str);
    }

    public static jk8[] values() {
        return (jk8[]) d.clone();
    }
}
