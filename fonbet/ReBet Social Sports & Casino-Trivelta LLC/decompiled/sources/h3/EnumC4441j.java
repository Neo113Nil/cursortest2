package h3;

/* renamed from: h3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4441j {
    INVALID(-1),
    UNSIGNED_INTEGER(0),
    NEGATIVE_INTEGER(1),
    BYTE_STRING(2),
    UNICODE_STRING(3),
    ARRAY(4),
    MAP(5),
    TAG(6),
    SPECIAL(7);


    /* renamed from: a, reason: collision with root package name */
    public final int f47663a;

    EnumC4441j(int i10) {
        this.f47663a = i10;
    }

    public static EnumC4441j a(int i10) {
        switch (i10 >> 5) {
            case 0:
                return UNSIGNED_INTEGER;
            case 1:
                return NEGATIVE_INTEGER;
            case 2:
                return BYTE_STRING;
            case 3:
                return UNICODE_STRING;
            case 4:
                return ARRAY;
            case 5:
                return MAP;
            case 6:
                return TAG;
            case 7:
                return SPECIAL;
            default:
                return INVALID;
        }
    }
}
