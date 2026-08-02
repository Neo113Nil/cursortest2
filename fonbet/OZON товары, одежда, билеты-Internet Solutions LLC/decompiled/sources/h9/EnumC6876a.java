package h9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h9.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC6876a {
    private static final /* synthetic */ EnumC6876a[] $VALUES;
    public static final EnumC6876a AZTEC;
    public static final EnumC6876a CODABAR;
    public static final EnumC6876a CODE_128;
    public static final EnumC6876a CODE_39;
    public static final EnumC6876a CODE_93;
    public static final EnumC6876a DATA_MATRIX;
    public static final EnumC6876a EAN_13;
    public static final EnumC6876a EAN_8;
    public static final EnumC6876a ITF;
    public static final EnumC6876a MAXICODE;
    public static final EnumC6876a PDF_417;
    public static final EnumC6876a QR_CODE;
    public static final EnumC6876a RSS_14;
    public static final EnumC6876a RSS_EXPANDED;
    public static final EnumC6876a UPC_A;
    public static final EnumC6876a UPC_E;
    public static final EnumC6876a UPC_EAN_EXTENSION;

    static {
        EnumC6876a enumC6876a = new EnumC6876a("AZTEC", 0);
        AZTEC = enumC6876a;
        EnumC6876a enumC6876a2 = new EnumC6876a("CODABAR", 1);
        CODABAR = enumC6876a2;
        EnumC6876a enumC6876a3 = new EnumC6876a("CODE_39", 2);
        CODE_39 = enumC6876a3;
        EnumC6876a enumC6876a4 = new EnumC6876a("CODE_93", 3);
        CODE_93 = enumC6876a4;
        EnumC6876a enumC6876a5 = new EnumC6876a("CODE_128", 4);
        CODE_128 = enumC6876a5;
        EnumC6876a enumC6876a6 = new EnumC6876a("DATA_MATRIX", 5);
        DATA_MATRIX = enumC6876a6;
        EnumC6876a enumC6876a7 = new EnumC6876a("EAN_8", 6);
        EAN_8 = enumC6876a7;
        EnumC6876a enumC6876a8 = new EnumC6876a("EAN_13", 7);
        EAN_13 = enumC6876a8;
        EnumC6876a enumC6876a9 = new EnumC6876a("ITF", 8);
        ITF = enumC6876a9;
        EnumC6876a enumC6876a10 = new EnumC6876a("MAXICODE", 9);
        MAXICODE = enumC6876a10;
        EnumC6876a enumC6876a11 = new EnumC6876a("PDF_417", 10);
        PDF_417 = enumC6876a11;
        EnumC6876a enumC6876a12 = new EnumC6876a("QR_CODE", 11);
        QR_CODE = enumC6876a12;
        EnumC6876a enumC6876a13 = new EnumC6876a("RSS_14", 12);
        RSS_14 = enumC6876a13;
        EnumC6876a enumC6876a14 = new EnumC6876a("RSS_EXPANDED", 13);
        RSS_EXPANDED = enumC6876a14;
        EnumC6876a enumC6876a15 = new EnumC6876a("UPC_A", 14);
        UPC_A = enumC6876a15;
        EnumC6876a enumC6876a16 = new EnumC6876a("UPC_E", 15);
        UPC_E = enumC6876a16;
        EnumC6876a enumC6876a17 = new EnumC6876a("UPC_EAN_EXTENSION", 16);
        UPC_EAN_EXTENSION = enumC6876a17;
        $VALUES = new EnumC6876a[]{enumC6876a, enumC6876a2, enumC6876a3, enumC6876a4, enumC6876a5, enumC6876a6, enumC6876a7, enumC6876a8, enumC6876a9, enumC6876a10, enumC6876a11, enumC6876a12, enumC6876a13, enumC6876a14, enumC6876a15, enumC6876a16, enumC6876a17};
    }

    private EnumC6876a() {
        throw null;
    }

    public static EnumC6876a valueOf(String str) {
        return (EnumC6876a) Enum.valueOf(EnumC6876a.class, str);
    }

    public static EnumC6876a[] values() {
        return (EnumC6876a[]) $VALUES.clone();
    }
}
