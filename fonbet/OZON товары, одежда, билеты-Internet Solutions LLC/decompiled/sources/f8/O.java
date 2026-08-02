package f8;

import com.google.crypto.tink.shaded.protobuf.C5919z;

/* loaded from: classes.dex */
public enum O implements C5919z.a {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    WITH_ID_REQUIREMENT(5),
    UNRECOGNIZED(-1);

    public static final int CRUNCHY_VALUE = 4;
    public static final int LEGACY_VALUE = 2;
    public static final int RAW_VALUE = 3;
    public static final int TINK_VALUE = 1;
    public static final int UNKNOWN_PREFIX_VALUE = 0;
    public static final int WITH_ID_REQUIREMENT_VALUE = 5;
    private static final C5919z.b<O> internalValueMap = new a();
    private final int value;

    final class a implements C5919z.b<O> {
    }

    O(int i11) {
        this.value = i11;
    }

    public static O a(int i11) {
        if (i11 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i11 == 1) {
            return TINK;
        }
        if (i11 == 2) {
            return LEGACY;
        }
        if (i11 == 3) {
            return RAW;
        }
        if (i11 == 4) {
            return CRUNCHY;
        }
        if (i11 != 5) {
            return null;
        }
        return WITH_ID_REQUIREMENT;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C5919z.a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
