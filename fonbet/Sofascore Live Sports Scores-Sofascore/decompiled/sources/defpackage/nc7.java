package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nc7 {
    public static final nc7 a;
    public static final nc7 b;
    public static final /* synthetic */ nc7[] c;

    static {
        nc7 nc7Var = new nc7("FIRST", 0);
        a = nc7Var;
        nc7 nc7Var2 = new nc7("SECOND", 1);
        b = nc7Var2;
        c = new nc7[]{nc7Var, nc7Var2};
    }

    public static nc7 valueOf(String str) {
        return (nc7) Enum.valueOf(nc7.class, str);
    }

    public static nc7[] values() {
        return (nc7[]) c.clone();
    }
}
