package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum h implements Internal.EnumLite {
    INCREMENTAL_CALLBACK_SUPPORT_NONE(0),
    INCREMENTAL_CALLBACK_SUPPORT_ADDITIVE_ON_RESULT(1),
    UNRECOGNIZED(-1);

    public static final int INCREMENTAL_CALLBACK_SUPPORT_ADDITIVE_ON_RESULT_VALUE = 1;
    public static final int INCREMENTAL_CALLBACK_SUPPORT_NONE_VALUE = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40508b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40510a;

    public class a implements Internal.EnumLiteMap<h> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final h findValueByNumber(int i10) {
            return h.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40511a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return h.forNumber(i10) != null;
        }
    }

    h(int i10) {
        this.f40510a = i10;
    }

    public static h forNumber(int i10) {
        if (i10 == 0) {
            return INCREMENTAL_CALLBACK_SUPPORT_NONE;
        }
        if (i10 != 1) {
            return null;
        }
        return INCREMENTAL_CALLBACK_SUPPORT_ADDITIVE_ON_RESULT;
    }

    public static Internal.EnumLiteMap<h> internalGetValueMap() {
        return f40508b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40511a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40510a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static h valueOf(int i10) {
        return forNumber(i10);
    }
}
