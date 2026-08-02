package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC3493z;

/* loaded from: classes3.dex */
public enum I implements AbstractC3493z.a {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    public static final AbstractC3493z.b f37192h = new AbstractC3493z.b() { // from class: com.google.crypto.tink.proto.I.a
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f37193a;

    I(int i10) {
        this.f37193a = i10;
    }

    public static I a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i10 == 1) {
            return TINK;
        }
        if (i10 == 2) {
            return LEGACY;
        }
        if (i10 == 3) {
            return RAW;
        }
        if (i10 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f37193a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
