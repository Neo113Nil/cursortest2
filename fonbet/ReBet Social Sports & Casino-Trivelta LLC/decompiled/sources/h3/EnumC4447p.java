package h3;

/* renamed from: h3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4447p {
    FALSE(20),
    TRUE(21),
    NULL(22),
    UNDEFINED(23),
    RESERVED(0),
    UNALLOCATED(0);


    /* renamed from: a, reason: collision with root package name */
    public final int f47679a;

    EnumC4447p(int i10) {
        this.f47679a = i10;
    }

    public static EnumC4447p b(int i10) {
        switch (i10 & 31) {
            case 20:
                return FALSE;
            case 21:
                return TRUE;
            case 22:
                return NULL;
            case 23:
                return UNDEFINED;
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                return RESERVED;
            default:
                return UNALLOCATED;
        }
    }

    public int a() {
        return this.f47679a;
    }
}
