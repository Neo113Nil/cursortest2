package ru.ozon.app.android.geo;

import com.google.protobuf.Internal;

/* loaded from: classes12.dex */
public enum PinsProto$PinStyleType implements Internal.a {
    DEFAULT(0),
    UNRECOGNIZED(-1);

    public static final int DEFAULT_VALUE = 0;
    private static final Internal.b<PinsProto$PinStyleType> internalValueMap = new Internal.b<PinsProto$PinStyleType>() { // from class: ru.ozon.app.android.geo.PinsProto$PinStyleType.1
        @Override // com.google.protobuf.Internal.b
        public PinsProto$PinStyleType findValueByNumber(int i11) {
            return PinsProto$PinStyleType.forNumber(i11);
        }
    };
    private final int value;

    private static final class PinStyleTypeVerifier implements Internal.c {
        static final Internal.c INSTANCE = new PinStyleTypeVerifier();

        private PinStyleTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.c
        public boolean isInRange(int i11) {
            return PinsProto$PinStyleType.forNumber(i11) != null;
        }
    }

    PinsProto$PinStyleType(int i11) {
        this.value = i11;
    }

    public static PinsProto$PinStyleType forNumber(int i11) {
        if (i11 != 0) {
            return null;
        }
        return DEFAULT;
    }

    public static Internal.b<PinsProto$PinStyleType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.c internalGetVerifier() {
        return PinStyleTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static PinsProto$PinStyleType valueOf(int i11) {
        return forNumber(i11);
    }
}
