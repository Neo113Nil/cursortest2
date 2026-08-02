package com.google.protobuf;

import com.google.protobuf.Internal;

/* loaded from: classes9.dex */
public enum DescriptorProtos$SymbolVisibility implements Internal.a {
    VISIBILITY_UNSET(0),
    VISIBILITY_LOCAL(1),
    VISIBILITY_EXPORT(2);

    public static final int VISIBILITY_EXPORT_VALUE = 2;
    public static final int VISIBILITY_LOCAL_VALUE = 1;
    public static final int VISIBILITY_UNSET_VALUE = 0;
    private static final Internal.b<DescriptorProtos$SymbolVisibility> internalValueMap = new Internal.b<DescriptorProtos$SymbolVisibility>() { // from class: com.google.protobuf.DescriptorProtos$SymbolVisibility.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.b
        public DescriptorProtos$SymbolVisibility findValueByNumber(int i11) {
            return DescriptorProtos$SymbolVisibility.forNumber(i11);
        }
    };
    private final int value;

    private static final class SymbolVisibilityVerifier implements Internal.c {
        static final Internal.c INSTANCE = new SymbolVisibilityVerifier();

        private SymbolVisibilityVerifier() {
        }

        @Override // com.google.protobuf.Internal.c
        public boolean isInRange(int i11) {
            return DescriptorProtos$SymbolVisibility.forNumber(i11) != null;
        }
    }

    DescriptorProtos$SymbolVisibility(int i11) {
        this.value = i11;
    }

    public static DescriptorProtos$SymbolVisibility forNumber(int i11) {
        if (i11 == 0) {
            return VISIBILITY_UNSET;
        }
        if (i11 == 1) {
            return VISIBILITY_LOCAL;
        }
        if (i11 != 2) {
            return null;
        }
        return VISIBILITY_EXPORT;
    }

    public static Internal.b<DescriptorProtos$SymbolVisibility> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.c internalGetVerifier() {
        return SymbolVisibilityVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.a
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static DescriptorProtos$SymbolVisibility valueOf(int i11) {
        return forNumber(i11);
    }
}
