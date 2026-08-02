package h9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class g {
    private static final /* synthetic */ g[] $VALUES;
    public static final g AZTEC_LAYERS;
    public static final g CHARACTER_SET;
    public static final g DATA_MATRIX_SHAPE;
    public static final g ERROR_CORRECTION;
    public static final g GS1_FORMAT;
    public static final g MARGIN;

    @Deprecated
    public static final g MAX_SIZE;

    @Deprecated
    public static final g MIN_SIZE;
    public static final g PDF417_COMPACT;
    public static final g PDF417_COMPACTION;
    public static final g PDF417_DIMENSIONS;
    public static final g QR_MASK_PATTERN;
    public static final g QR_VERSION;

    static {
        g gVar = new g("ERROR_CORRECTION", 0);
        ERROR_CORRECTION = gVar;
        g gVar2 = new g("CHARACTER_SET", 1);
        CHARACTER_SET = gVar2;
        g gVar3 = new g("DATA_MATRIX_SHAPE", 2);
        DATA_MATRIX_SHAPE = gVar3;
        g gVar4 = new g("MIN_SIZE", 3);
        MIN_SIZE = gVar4;
        g gVar5 = new g("MAX_SIZE", 4);
        MAX_SIZE = gVar5;
        g gVar6 = new g("MARGIN", 5);
        MARGIN = gVar6;
        g gVar7 = new g("PDF417_COMPACT", 6);
        PDF417_COMPACT = gVar7;
        g gVar8 = new g("PDF417_COMPACTION", 7);
        PDF417_COMPACTION = gVar8;
        g gVar9 = new g("PDF417_DIMENSIONS", 8);
        PDF417_DIMENSIONS = gVar9;
        g gVar10 = new g("AZTEC_LAYERS", 9);
        AZTEC_LAYERS = gVar10;
        g gVar11 = new g("QR_VERSION", 10);
        QR_VERSION = gVar11;
        g gVar12 = new g("QR_MASK_PATTERN", 11);
        QR_MASK_PATTERN = gVar12;
        g gVar13 = new g("GS1_FORMAT", 12);
        GS1_FORMAT = gVar13;
        $VALUES = new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, gVar12, gVar13};
    }

    private g() {
        throw null;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
