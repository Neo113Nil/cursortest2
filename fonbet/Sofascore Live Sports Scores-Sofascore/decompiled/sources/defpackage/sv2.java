package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class sv2 {
    public static final sv2 a;
    public static final sv2 b;
    public static final sv2 c;
    public static final /* synthetic */ sv2[] d;

    static {
        sv2 sv2Var = new sv2("NONE", 0);
        a = sv2Var;
        sv2 sv2Var2 = new sv2("ALL_JSON_OBJECTS", 1);
        b = sv2Var2;
        sv2 sv2Var3 = new sv2("POLYMORPHIC", 2);
        c = sv2Var3;
        d = new sv2[]{sv2Var, sv2Var2, sv2Var3};
    }

    public static sv2 valueOf(String str) {
        return (sv2) Enum.valueOf(sv2.class, str);
    }

    public static sv2[] values() {
        return (sv2[]) d.clone();
    }
}
