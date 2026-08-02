package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zx2 {
    public static final zx2 a;
    public static final zx2 b;
    public static final zx2 c;
    public static final zx2 d;
    public static final /* synthetic */ zx2[] e;

    static {
        zx2 zx2Var = new zx2("PROCESSED", 0);
        a = zx2Var;
        zx2 zx2Var2 = new zx2("REFUSED", 1);
        b = zx2Var2;
        zx2 zx2Var3 = new zx2("DROPPED", 2);
        c = zx2Var3;
        zx2 zx2Var4 = new zx2("MISCARRIED", 3);
        d = zx2Var4;
        e = new zx2[]{zx2Var, zx2Var2, zx2Var3, zx2Var4};
    }

    public static zx2 valueOf(String str) {
        return (zx2) Enum.valueOf(zx2.class, str);
    }

    public static zx2[] values() {
        return (zx2[]) e.clone();
    }
}
