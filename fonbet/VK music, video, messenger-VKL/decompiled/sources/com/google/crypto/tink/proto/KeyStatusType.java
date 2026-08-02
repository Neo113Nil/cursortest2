package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.q;

/* loaded from: classes.dex */
public enum KeyStatusType implements q.a {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    private static final q.b<KeyStatusType> internalValueMap = new a();
    private final int value;

    public class a implements q.b<KeyStatusType> {
    }

    KeyStatusType(int i) {
        this.value = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q.a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
