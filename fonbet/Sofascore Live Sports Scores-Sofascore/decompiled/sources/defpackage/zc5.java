package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zc5 {
    public static final zc5 a;
    public static final zc5 b;
    public static final /* synthetic */ zc5[] c;

    static {
        zc5 zc5Var = new zc5("Start", 0);
        a = zc5Var;
        zc5 zc5Var2 = new zc5("End", 1);
        b = zc5Var2;
        c = new zc5[]{zc5Var, zc5Var2};
    }

    public static zc5 valueOf(String str) {
        return (zc5) Enum.valueOf(zc5.class, str);
    }

    public static zc5[] values() {
        return (zc5[]) c.clone();
    }
}
