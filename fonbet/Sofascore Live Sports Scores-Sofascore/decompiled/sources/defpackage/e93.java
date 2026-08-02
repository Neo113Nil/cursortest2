package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class e93 {
    public static final e93 a;
    public static final e93 b;
    public static final /* synthetic */ e93[] c;
    public static final /* synthetic */ kp5 d;

    static {
        e93 e93Var = new e93("First", 0);
        a = e93Var;
        e93 e93Var2 = new e93("Second", 1);
        b = e93Var2;
        e93[] e93VarArr = {e93Var, e93Var2, new e93("Third", 2), new e93("Fourth", 3)};
        c = e93VarArr;
        d = new kp5(e93VarArr);
    }

    public static e93 valueOf(String str) {
        return (e93) Enum.valueOf(e93.class, str);
    }

    public static e93[] values() {
        return (e93[]) c.clone();
    }
}
