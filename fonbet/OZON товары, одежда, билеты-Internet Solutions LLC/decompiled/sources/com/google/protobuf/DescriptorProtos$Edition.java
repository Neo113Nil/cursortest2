package com.google.protobuf;

import com.google.protobuf.Internal;

/* loaded from: classes9.dex */
public enum DescriptorProtos$Edition implements Internal.a {
    EDITION_UNKNOWN(0),
    EDITION_LEGACY(EDITION_LEGACY_VALUE),
    EDITION_PROTO2(EDITION_PROTO2_VALUE),
    EDITION_PROTO3(999),
    EDITION_2023(1000),
    EDITION_2024(1001),
    EDITION_UNSTABLE(EDITION_UNSTABLE_VALUE),
    EDITION_1_TEST_ONLY(1),
    EDITION_2_TEST_ONLY(2),
    EDITION_99997_TEST_ONLY(EDITION_99997_TEST_ONLY_VALUE),
    EDITION_99998_TEST_ONLY(EDITION_99998_TEST_ONLY_VALUE),
    EDITION_99999_TEST_ONLY(EDITION_99999_TEST_ONLY_VALUE),
    EDITION_MAX(Integer.MAX_VALUE);

    public static final int EDITION_1_TEST_ONLY_VALUE = 1;
    public static final int EDITION_2023_VALUE = 1000;
    public static final int EDITION_2024_VALUE = 1001;
    public static final int EDITION_2_TEST_ONLY_VALUE = 2;
    public static final int EDITION_99997_TEST_ONLY_VALUE = 99997;
    public static final int EDITION_99998_TEST_ONLY_VALUE = 99998;
    public static final int EDITION_99999_TEST_ONLY_VALUE = 99999;
    public static final int EDITION_LEGACY_VALUE = 900;
    public static final int EDITION_MAX_VALUE = Integer.MAX_VALUE;
    public static final int EDITION_PROTO2_VALUE = 998;
    public static final int EDITION_PROTO3_VALUE = 999;
    public static final int EDITION_UNKNOWN_VALUE = 0;
    public static final int EDITION_UNSTABLE_VALUE = 9999;
    private static final Internal.b<DescriptorProtos$Edition> internalValueMap = new Internal.b<DescriptorProtos$Edition>() { // from class: com.google.protobuf.DescriptorProtos$Edition.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.b
        public DescriptorProtos$Edition findValueByNumber(int i11) {
            return DescriptorProtos$Edition.forNumber(i11);
        }
    };
    private final int value;

    private static final class EditionVerifier implements Internal.c {
        static final Internal.c INSTANCE = new EditionVerifier();

        private EditionVerifier() {
        }

        @Override // com.google.protobuf.Internal.c
        public boolean isInRange(int i11) {
            return DescriptorProtos$Edition.forNumber(i11) != null;
        }
    }

    DescriptorProtos$Edition(int i11) {
        this.value = i11;
    }

    public static DescriptorProtos$Edition forNumber(int i11) {
        if (i11 == 0) {
            return EDITION_UNKNOWN;
        }
        if (i11 == 1) {
            return EDITION_1_TEST_ONLY;
        }
        if (i11 == 2) {
            return EDITION_2_TEST_ONLY;
        }
        if (i11 == 900) {
            return EDITION_LEGACY;
        }
        if (i11 == 9999) {
            return EDITION_UNSTABLE;
        }
        if (i11 == Integer.MAX_VALUE) {
            return EDITION_MAX;
        }
        switch (i11) {
            case EDITION_PROTO2_VALUE:
                return EDITION_PROTO2;
            case 999:
                return EDITION_PROTO3;
            case 1000:
                return EDITION_2023;
            case 1001:
                return EDITION_2024;
            default:
                switch (i11) {
                    case EDITION_99997_TEST_ONLY_VALUE:
                        return EDITION_99997_TEST_ONLY;
                    case EDITION_99998_TEST_ONLY_VALUE:
                        return EDITION_99998_TEST_ONLY;
                    case EDITION_99999_TEST_ONLY_VALUE:
                        return EDITION_99999_TEST_ONLY;
                    default:
                        return null;
                }
        }
    }

    public static Internal.b<DescriptorProtos$Edition> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.c internalGetVerifier() {
        return EditionVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.a
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static DescriptorProtos$Edition valueOf(int i11) {
        return forNumber(i11);
    }
}
