package com.google.protobuf;

import com.google.protobuf.Internal;

/* loaded from: classes9.dex */
public enum NullValue implements Internal.a {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    private static final Internal.b<NullValue> internalValueMap = new Internal.b<NullValue>() { // from class: com.google.protobuf.NullValue.1
        @Override // com.google.protobuf.Internal.b
        public NullValue findValueByNumber(int i11) {
            return NullValue.forNumber(i11);
        }
    };
    private final int value;

    private static final class NullValueVerifier implements Internal.c {
        static final Internal.c INSTANCE = new NullValueVerifier();

        private NullValueVerifier() {
        }

        @Override // com.google.protobuf.Internal.c
        public boolean isInRange(int i11) {
            return NullValue.forNumber(i11) != null;
        }
    }

    NullValue(int i11) {
        this.value = i11;
    }

    public static NullValue forNumber(int i11) {
        if (i11 != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static Internal.b<NullValue> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.c internalGetVerifier() {
        return NullValueVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static NullValue valueOf(int i11) {
        return forNumber(i11);
    }
}
