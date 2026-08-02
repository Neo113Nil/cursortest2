package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p25 {
    public static final p25 a;
    public static final p25 b;
    public static final p25 c;
    public static final /* synthetic */ p25[] d;

    static {
        p25 p25Var = new p25("ITEM_TO_PLACEHOLDER", 0);
        a = p25Var;
        p25 p25Var2 = new p25("PLACEHOLDER_TO_ITEM", 1);
        b = p25Var2;
        p25 p25Var3 = new p25("PLACEHOLDER_POSITION_CHANGE", 2);
        c = p25Var3;
        d = new p25[]{p25Var, p25Var2, p25Var3};
    }

    public static p25 valueOf(String str) {
        return (p25) Enum.valueOf(p25.class, str);
    }

    public static p25[] values() {
        return (p25[]) d.clone();
    }
}
