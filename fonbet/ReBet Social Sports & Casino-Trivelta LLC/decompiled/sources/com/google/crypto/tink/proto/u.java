package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC3493z;

/* loaded from: classes3.dex */
public enum u implements AbstractC3493z.a {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    public static final AbstractC3493z.b f37201i = new AbstractC3493z.b() { // from class: com.google.crypto.tink.proto.u.a
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f37202a;

    u(int i10) {
        this.f37202a = i10;
    }

    public static u a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_HASH;
        }
        if (i10 == 1) {
            return SHA1;
        }
        if (i10 == 2) {
            return SHA384;
        }
        if (i10 == 3) {
            return SHA256;
        }
        if (i10 == 4) {
            return SHA512;
        }
        if (i10 != 5) {
            return null;
        }
        return SHA224;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f37202a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
