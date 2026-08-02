package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.Internal;

/* loaded from: classes10.dex */
public enum TombstoneProtos$Architecture implements Internal.a {
    ARM32(0),
    ARM64(1),
    X86(2),
    X86_64(3),
    RISCV64(4),
    NONE(5),
    UNRECOGNIZED(-1);

    public static final int ARM32_VALUE = 0;
    public static final int ARM64_VALUE = 1;
    public static final int NONE_VALUE = 5;
    public static final int RISCV64_VALUE = 4;
    public static final int X86_64_VALUE = 3;
    public static final int X86_VALUE = 2;
    private static final Internal.b<TombstoneProtos$Architecture> internalValueMap = new Internal.b<TombstoneProtos$Architecture>() { // from class: io.sentry.android.core.internal.tombstone.TombstoneProtos$Architecture.1
        @Override // com.google.protobuf.Internal.b
        public TombstoneProtos$Architecture findValueByNumber(int i11) {
            return TombstoneProtos$Architecture.forNumber(i11);
        }
    };
    private final int value;

    private static final class ArchitectureVerifier implements Internal.c {
        static final Internal.c INSTANCE = new ArchitectureVerifier();

        private ArchitectureVerifier() {
        }

        @Override // com.google.protobuf.Internal.c
        public boolean isInRange(int i11) {
            return TombstoneProtos$Architecture.forNumber(i11) != null;
        }
    }

    TombstoneProtos$Architecture(int i11) {
        this.value = i11;
    }

    public static TombstoneProtos$Architecture forNumber(int i11) {
        if (i11 == 0) {
            return ARM32;
        }
        if (i11 == 1) {
            return ARM64;
        }
        if (i11 == 2) {
            return X86;
        }
        if (i11 == 3) {
            return X86_64;
        }
        if (i11 == 4) {
            return RISCV64;
        }
        if (i11 != 5) {
            return null;
        }
        return NONE;
    }

    public static Internal.b<TombstoneProtos$Architecture> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.c internalGetVerifier() {
        return ArchitectureVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static TombstoneProtos$Architecture valueOf(int i11) {
        return forNumber(i11);
    }
}
