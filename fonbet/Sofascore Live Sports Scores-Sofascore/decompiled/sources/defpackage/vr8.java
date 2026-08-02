package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vr8 {
    public static final vr8 a;
    public static final vr8 b;
    public static final vr8 c;
    public static final vr8 d;
    public static final vr8 e;
    public static final /* synthetic */ vr8[] f;

    static {
        vr8 vr8Var = new vr8("ON_CONFIGURE", 0);
        a = vr8Var;
        vr8 vr8Var2 = new vr8("ON_CREATE", 1);
        b = vr8Var2;
        vr8 vr8Var3 = new vr8("ON_UPGRADE", 2);
        c = vr8Var3;
        vr8 vr8Var4 = new vr8("ON_DOWNGRADE", 3);
        d = vr8Var4;
        vr8 vr8Var5 = new vr8("ON_OPEN", 4);
        e = vr8Var5;
        f = new vr8[]{vr8Var, vr8Var2, vr8Var3, vr8Var4, vr8Var5};
    }

    public static vr8 valueOf(String str) {
        return (vr8) Enum.valueOf(vr8.class, str);
    }

    public static vr8[] values() {
        return (vr8[]) f.clone();
    }
}
