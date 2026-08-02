package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum L implements Internal.EnumLite {
    SDK_ENCRYPTION_SCHEME_UNKNOWN(0),
    SDK_ENCRYPTION_SCHEME_RSA_PKCS1(1),
    SDK_ENCRYPTION_SCHEME_RSA_SHA256_MGF1(2),
    UNRECOGNIZED(-1);

    public static final int SDK_ENCRYPTION_SCHEME_RSA_PKCS1_VALUE = 1;
    public static final int SDK_ENCRYPTION_SCHEME_RSA_SHA256_MGF1_VALUE = 2;
    public static final int SDK_ENCRYPTION_SCHEME_UNKNOWN_VALUE = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40239b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40241a;

    public class a implements Internal.EnumLiteMap<L> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final L findValueByNumber(int i10) {
            return L.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40242a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return L.forNumber(i10) != null;
        }
    }

    L(int i10) {
        this.f40241a = i10;
    }

    public static L forNumber(int i10) {
        if (i10 == 0) {
            return SDK_ENCRYPTION_SCHEME_UNKNOWN;
        }
        if (i10 == 1) {
            return SDK_ENCRYPTION_SCHEME_RSA_PKCS1;
        }
        if (i10 != 2) {
            return null;
        }
        return SDK_ENCRYPTION_SCHEME_RSA_SHA256_MGF1;
    }

    public static Internal.EnumLiteMap<L> internalGetValueMap() {
        return f40239b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40242a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40241a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static L valueOf(int i10) {
        return forNumber(i10);
    }
}
