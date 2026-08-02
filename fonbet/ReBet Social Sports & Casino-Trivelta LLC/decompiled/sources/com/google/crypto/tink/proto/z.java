package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractC3493z;

/* loaded from: classes3.dex */
public enum z implements AbstractC3493z.a {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    public static final AbstractC3493z.b f37216g = new AbstractC3493z.b() { // from class: com.google.crypto.tink.proto.z.a
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f37217a;

    z(int i10) {
        this.f37217a = i10;
    }

    public static z a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i10 == 1) {
            return ENABLED;
        }
        if (i10 == 2) {
            return DISABLED;
        }
        if (i10 != 3) {
            return null;
        }
        return DESTROYED;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f37217a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
