package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ie8 {
    public static final ie8 a;
    public static final ie8 b;
    public static final ie8 c;
    public static final ie8 d;
    public static final /* synthetic */ ie8[] e;

    static {
        ie8 ie8Var = new ie8("Active", 0);
        a = ie8Var;
        ie8 ie8Var2 = new ie8("ActiveParent", 1);
        b = ie8Var2;
        ie8 ie8Var3 = new ie8("Captured", 2);
        c = ie8Var3;
        ie8 ie8Var4 = new ie8("Inactive", 3);
        d = ie8Var4;
        e = new ie8[]{ie8Var, ie8Var2, ie8Var3, ie8Var4};
    }

    public static ie8 valueOf(String str) {
        return (ie8) Enum.valueOf(ie8.class, str);
    }

    public static ie8[] values() {
        return (ie8[]) e.clone();
    }

    public final boolean d() {
        int ordinal = ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return true;
        }
        if (ordinal == 3) {
            return false;
        }
        zzl.b();
        return false;
    }

    public final boolean g() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return false;
                }
                zzl.b();
                return false;
            }
        }
        return true;
    }
}
