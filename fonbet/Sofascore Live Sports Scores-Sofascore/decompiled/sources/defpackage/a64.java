package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class a64 {
    public static final a64 a;
    public static final a64 b;
    public static final a64 c;
    public static final /* synthetic */ a64[] d;

    static {
        a64 a64Var = new a64("SCORER", 0);
        a = a64Var;
        a64 a64Var2 = new a64("ASSIST", 1);
        b = a64Var2;
        a64 a64Var3 = new a64("CARDED_PLAYER", 2);
        c = a64Var3;
        d = new a64[]{a64Var, a64Var2, a64Var3};
    }

    public static a64 valueOf(String str) {
        return (a64) Enum.valueOf(a64.class, str);
    }

    public static a64[] values() {
        return (a64[]) d.clone();
    }
}
