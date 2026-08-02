package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i8 {
    public static final i8 a;
    public static final i8 b;
    public static final i8 c;
    public static final /* synthetic */ i8[] d;

    static {
        i8 i8Var = new i8("NATURAL", 0);
        a = i8Var;
        i8 i8Var2 = new i8("FORCED_FORWARD", 1);
        b = i8Var2;
        i8 i8Var3 = new i8("FORCED_BACKWARD", 2);
        c = i8Var3;
        d = new i8[]{i8Var, i8Var2, i8Var3};
    }

    public static i8 valueOf(String str) {
        return (i8) Enum.valueOf(i8.class, str);
    }

    public static i8[] values() {
        return (i8[]) d.clone();
    }
}
