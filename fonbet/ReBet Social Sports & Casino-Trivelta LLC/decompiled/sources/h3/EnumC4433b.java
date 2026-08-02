package h3;

/* renamed from: h3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4433b {
    DIRECT(0),
    ONE_BYTE(24),
    TWO_BYTES(25),
    FOUR_BYTES(26),
    EIGHT_BYTES(27),
    RESERVED(28),
    INDEFINITE(31);


    /* renamed from: a, reason: collision with root package name */
    public final int f47648a;

    EnumC4433b(int i10) {
        this.f47648a = i10;
    }

    public static EnumC4433b a(int i10) {
        switch (i10 & 31) {
            case 24:
                return ONE_BYTE;
            case 25:
                return TWO_BYTES;
            case 26:
                return FOUR_BYTES;
            case 27:
                return EIGHT_BYTES;
            case 28:
            case 29:
            case 30:
                return RESERVED;
            case 31:
                return INDEFINITE;
            default:
                return DIRECT;
        }
    }
}
