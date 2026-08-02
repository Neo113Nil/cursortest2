package f8;

import com.google.crypto.tink.shaded.protobuf.C5919z;

/* loaded from: classes.dex */
public enum F implements C5919z.a {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    private static final C5919z.b<F> internalValueMap = new a();
    private final int value;

    final class a implements C5919z.b<F> {
    }

    F(int i11) {
        this.value = i11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C5919z.a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
