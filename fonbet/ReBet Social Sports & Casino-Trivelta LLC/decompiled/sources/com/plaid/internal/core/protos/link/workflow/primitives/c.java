package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum c implements Internal.EnumLite {
    CARD_COLLECT_NO_ERROR(0),
    CARD_COLLECT_INTERNAL_SERVICE_ERROR(1),
    CARD_COLLECT_INVALID_CARD_DETAILS(2),
    UNRECOGNIZED(-1);

    public static final int CARD_COLLECT_INTERNAL_SERVICE_ERROR_VALUE = 1;
    public static final int CARD_COLLECT_INVALID_CARD_DETAILS_VALUE = 2;
    public static final int CARD_COLLECT_NO_ERROR_VALUE = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40491b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40493a;

    public class a implements Internal.EnumLiteMap<c> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final c findValueByNumber(int i10) {
            return c.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40494a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return c.forNumber(i10) != null;
        }
    }

    c(int i10) {
        this.f40493a = i10;
    }

    public static c forNumber(int i10) {
        if (i10 == 0) {
            return CARD_COLLECT_NO_ERROR;
        }
        if (i10 == 1) {
            return CARD_COLLECT_INTERNAL_SERVICE_ERROR;
        }
        if (i10 != 2) {
            return null;
        }
        return CARD_COLLECT_INVALID_CARD_DETAILS;
    }

    public static Internal.EnumLiteMap<c> internalGetValueMap() {
        return f40491b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40494a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40493a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static c valueOf(int i10) {
        return forNumber(i10);
    }
}
