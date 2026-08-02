package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.q;

/* loaded from: classes13.dex */
public enum HashType implements q.a {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);

    public static final int SHA1_VALUE = 1;
    public static final int SHA256_VALUE = 3;
    public static final int SHA384_VALUE = 2;
    public static final int SHA512_VALUE = 4;
    public static final int UNKNOWN_HASH_VALUE = 0;
    private static final q.b<HashType> internalValueMap = new a();
    private final int value;

    public class a implements q.b<HashType> {
    }

    HashType(int i) {
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
