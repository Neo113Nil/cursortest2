package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zp8 {
    public static final zp8 a;
    public static final zp8 b;
    public static final zp8 c;
    public static final zp8 d;
    public static final zp8 e;
    public static final zp8 f;
    public static final zp8 g;
    public static final zp8 h;
    public static final zp8 i;
    public static final /* synthetic */ zp8[] j;

    static {
        zp8 zp8Var = new zp8("PENALTY_LOG", 0);
        a = zp8Var;
        zp8 zp8Var2 = new zp8("PENALTY_DEATH", 1);
        b = zp8Var2;
        zp8 zp8Var3 = new zp8("DETECT_FRAGMENT_REUSE", 2);
        c = zp8Var3;
        zp8 zp8Var4 = new zp8("DETECT_FRAGMENT_TAG_USAGE", 3);
        d = zp8Var4;
        zp8 zp8Var5 = new zp8("DETECT_WRONG_NESTED_HIERARCHY", 4);
        e = zp8Var5;
        zp8 zp8Var6 = new zp8("DETECT_RETAIN_INSTANCE_USAGE", 5);
        f = zp8Var6;
        zp8 zp8Var7 = new zp8("DETECT_SET_USER_VISIBLE_HINT", 6);
        g = zp8Var7;
        zp8 zp8Var8 = new zp8("DETECT_TARGET_FRAGMENT_USAGE", 7);
        h = zp8Var8;
        zp8 zp8Var9 = new zp8("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        i = zp8Var9;
        j = new zp8[]{zp8Var, zp8Var2, zp8Var3, zp8Var4, zp8Var5, zp8Var6, zp8Var7, zp8Var8, zp8Var9};
    }

    public static zp8 valueOf(String str) {
        return (zp8) Enum.valueOf(zp8.class, str);
    }

    public static zp8[] values() {
        return (zp8[]) j.clone();
    }
}
