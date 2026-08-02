package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cn5 {
    public static final cn5 a;
    public static final cn5 b;
    public static final cn5 c;
    public static final cn5 d;
    public static final cn5 e;
    public static final cn5 f;
    public static final cn5 g;
    public static final cn5 h;
    public static final cn5 i;
    public static final cn5 j;
    public static final cn5 k;
    public static final cn5 l;
    public static final /* synthetic */ cn5[] m;

    static {
        cn5 cn5Var = new cn5("ERROR_CORRECTION", 0);
        a = cn5Var;
        cn5 cn5Var2 = new cn5("CHARACTER_SET", 1);
        b = cn5Var2;
        cn5 cn5Var3 = new cn5("DATA_MATRIX_SHAPE", 2);
        c = cn5Var3;
        cn5 cn5Var4 = new cn5("MIN_SIZE", 3);
        d = cn5Var4;
        cn5 cn5Var5 = new cn5("MAX_SIZE", 4);
        e = cn5Var5;
        cn5 cn5Var6 = new cn5("MARGIN", 5);
        f = cn5Var6;
        cn5 cn5Var7 = new cn5("PDF417_COMPACT", 6);
        g = cn5Var7;
        cn5 cn5Var8 = new cn5("PDF417_COMPACTION", 7);
        h = cn5Var8;
        cn5 cn5Var9 = new cn5("PDF417_DIMENSIONS", 8);
        i = cn5Var9;
        cn5 cn5Var10 = new cn5("AZTEC_LAYERS", 9);
        j = cn5Var10;
        cn5 cn5Var11 = new cn5("QR_VERSION", 10);
        k = cn5Var11;
        cn5 cn5Var12 = new cn5("GS1_FORMAT", 11);
        l = cn5Var12;
        m = new cn5[]{cn5Var, cn5Var2, cn5Var3, cn5Var4, cn5Var5, cn5Var6, cn5Var7, cn5Var8, cn5Var9, cn5Var10, cn5Var11, cn5Var12};
    }

    public static cn5 valueOf(String str) {
        return (cn5) Enum.valueOf(cn5.class, str);
    }

    public static cn5[] values() {
        return (cn5[]) m.clone();
    }
}
