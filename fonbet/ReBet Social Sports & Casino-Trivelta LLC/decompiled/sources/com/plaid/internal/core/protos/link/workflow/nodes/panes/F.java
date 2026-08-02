package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum F implements Internal.EnumLite {
    OAUTH_SUBMISSION_METHOD_UNKNOWN(0),
    OAUTH_SUBMISSION_METHOD_POLLING(1),
    OAUTH_SUBMISSION_METHOD_REDIRECT(2),
    UNRECOGNIZED(-1);

    public static final int OAUTH_SUBMISSION_METHOD_POLLING_VALUE = 1;
    public static final int OAUTH_SUBMISSION_METHOD_REDIRECT_VALUE = 2;
    public static final int OAUTH_SUBMISSION_METHOD_UNKNOWN_VALUE = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40204b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40206a;

    public class a implements Internal.EnumLiteMap<F> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final F findValueByNumber(int i10) {
            return F.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40207a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return F.forNumber(i10) != null;
        }
    }

    F(int i10) {
        this.f40206a = i10;
    }

    public static F forNumber(int i10) {
        if (i10 == 0) {
            return OAUTH_SUBMISSION_METHOD_UNKNOWN;
        }
        if (i10 == 1) {
            return OAUTH_SUBMISSION_METHOD_POLLING;
        }
        if (i10 != 2) {
            return null;
        }
        return OAUTH_SUBMISSION_METHOD_REDIRECT;
    }

    public static Internal.EnumLiteMap<F> internalGetValueMap() {
        return f40204b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40207a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40206a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static F valueOf(int i10) {
        return forNumber(i10);
    }
}
