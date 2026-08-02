package h9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class r {
    private static final /* synthetic */ r[] $VALUES;
    public static final r BYTE_SEGMENTS;
    public static final r ERROR_CORRECTION_LEVEL;
    public static final r ISSUE_NUMBER;
    public static final r ORIENTATION;
    public static final r OTHER;
    public static final r PDF417_EXTRA_METADATA;
    public static final r POSSIBLE_COUNTRY;
    public static final r STRUCTURED_APPEND_PARITY;
    public static final r STRUCTURED_APPEND_SEQUENCE;
    public static final r SUGGESTED_PRICE;
    public static final r UPC_EAN_EXTENSION;

    static {
        r rVar = new r("OTHER", 0);
        OTHER = rVar;
        r rVar2 = new r("ORIENTATION", 1);
        ORIENTATION = rVar2;
        r rVar3 = new r("BYTE_SEGMENTS", 2);
        BYTE_SEGMENTS = rVar3;
        r rVar4 = new r("ERROR_CORRECTION_LEVEL", 3);
        ERROR_CORRECTION_LEVEL = rVar4;
        r rVar5 = new r("ISSUE_NUMBER", 4);
        ISSUE_NUMBER = rVar5;
        r rVar6 = new r("SUGGESTED_PRICE", 5);
        SUGGESTED_PRICE = rVar6;
        r rVar7 = new r("POSSIBLE_COUNTRY", 6);
        POSSIBLE_COUNTRY = rVar7;
        r rVar8 = new r("UPC_EAN_EXTENSION", 7);
        UPC_EAN_EXTENSION = rVar8;
        r rVar9 = new r("PDF417_EXTRA_METADATA", 8);
        PDF417_EXTRA_METADATA = rVar9;
        r rVar10 = new r("STRUCTURED_APPEND_SEQUENCE", 9);
        STRUCTURED_APPEND_SEQUENCE = rVar10;
        r rVar11 = new r("STRUCTURED_APPEND_PARITY", 10);
        STRUCTURED_APPEND_PARITY = rVar11;
        $VALUES = new r[]{rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9, rVar10, rVar11};
    }

    private r() {
        throw null;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
