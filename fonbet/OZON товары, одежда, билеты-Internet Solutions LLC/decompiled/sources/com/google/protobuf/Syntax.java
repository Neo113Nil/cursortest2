package com.google.protobuf;

import com.google.protobuf.Internal;

/* loaded from: classes9.dex */
public enum Syntax implements Internal.a {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_EDITIONS_VALUE = 2;
    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final Internal.b<Syntax> internalValueMap = new Internal.b<Syntax>() { // from class: com.google.protobuf.Syntax.1
        @Override // com.google.protobuf.Internal.b
        public Syntax findValueByNumber(int i11) {
            return Syntax.forNumber(i11);
        }
    };
    private final int value;

    private static final class SyntaxVerifier implements Internal.c {
        static final Internal.c INSTANCE = new SyntaxVerifier();

        private SyntaxVerifier() {
        }

        @Override // com.google.protobuf.Internal.c
        public boolean isInRange(int i11) {
            return Syntax.forNumber(i11) != null;
        }
    }

    Syntax(int i11) {
        this.value = i11;
    }

    public static Syntax forNumber(int i11) {
        if (i11 == 0) {
            return SYNTAX_PROTO2;
        }
        if (i11 == 1) {
            return SYNTAX_PROTO3;
        }
        if (i11 != 2) {
            return null;
        }
        return SYNTAX_EDITIONS;
    }

    public static Internal.b<Syntax> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.c internalGetVerifier() {
        return SyntaxVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Syntax valueOf(int i11) {
        return forNumber(i11);
    }
}
