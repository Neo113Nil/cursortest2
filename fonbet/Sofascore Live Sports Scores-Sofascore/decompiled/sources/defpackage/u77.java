package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class u77 {
    public static final u77 a;
    public static final u77 b;
    public static final u77 c;
    public static final /* synthetic */ u77[] d;

    static {
        u77 u77Var = new u77("SQUAD_CONTROLS", 0);
        a = u77Var;
        u77 u77Var2 = new u77("HIGHLIGHTS_AVAILABLE", 1);
        b = u77Var2;
        u77 u77Var3 = new u77("HIGHLIGHTS_UNAVAILABLE", 2);
        c = u77Var3;
        d = new u77[]{u77Var, u77Var2, u77Var3};
    }

    public static u77 valueOf(String str) {
        return (u77) Enum.valueOf(u77.class, str);
    }

    public static u77[] values() {
        return (u77[]) d.clone();
    }
}
