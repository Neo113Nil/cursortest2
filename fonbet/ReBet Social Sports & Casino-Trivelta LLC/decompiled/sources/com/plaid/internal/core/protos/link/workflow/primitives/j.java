package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum j implements Internal.EnumLite {
    NULLABLE_BOOL_UNKNOWN(0),
    NULLABLE_BOOL_UNDEFINED(1),
    NULLABLE_BOOL_TRUE(2),
    NULLABLE_BOOL_FALSE(3),
    UNRECOGNIZED(-1);

    public static final int NULLABLE_BOOL_FALSE_VALUE = 3;
    public static final int NULLABLE_BOOL_TRUE_VALUE = 2;
    public static final int NULLABLE_BOOL_UNDEFINED_VALUE = 1;
    public static final int NULLABLE_BOOL_UNKNOWN_VALUE = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40516b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40518a;

    public class a implements Internal.EnumLiteMap<j> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final j findValueByNumber(int i10) {
            return j.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40519a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return j.forNumber(i10) != null;
        }
    }

    j(int i10) {
        this.f40518a = i10;
    }

    public static j forNumber(int i10) {
        if (i10 == 0) {
            return NULLABLE_BOOL_UNKNOWN;
        }
        if (i10 == 1) {
            return NULLABLE_BOOL_UNDEFINED;
        }
        if (i10 == 2) {
            return NULLABLE_BOOL_TRUE;
        }
        if (i10 != 3) {
            return null;
        }
        return NULLABLE_BOOL_FALSE;
    }

    public static Internal.EnumLiteMap<j> internalGetValueMap() {
        return f40516b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40519a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40518a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static j valueOf(int i10) {
        return forNumber(i10);
    }
}
