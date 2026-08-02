package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r27 {
    public static final r27 a;
    public static final r27 b;
    public static final /* synthetic */ r27[] c;

    static {
        r27 r27Var = new r27("RECORD", 0);
        a = r27Var;
        r27 r27Var2 = new r27("SCORE", 1);
        b = r27Var2;
        c = new r27[]{r27Var, r27Var2};
    }

    public static r27 valueOf(String str) {
        return (r27) Enum.valueOf(r27.class, str);
    }

    public static r27[] values() {
        return (r27[]) c.clone();
    }
}
