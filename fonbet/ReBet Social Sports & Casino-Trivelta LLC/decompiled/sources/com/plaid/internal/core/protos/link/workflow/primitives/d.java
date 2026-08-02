package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum d implements Internal.EnumLite {
    VAULT_NONE(0),
    VAULT_VGS(1),
    UNRECOGNIZED(-1);

    public static final int VAULT_NONE_VALUE = 0;
    public static final int VAULT_VGS_VALUE = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40495b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40497a;

    public class a implements Internal.EnumLiteMap<d> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final d findValueByNumber(int i10) {
            return d.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40498a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return d.forNumber(i10) != null;
        }
    }

    d(int i10) {
        this.f40497a = i10;
    }

    public static d forNumber(int i10) {
        if (i10 == 0) {
            return VAULT_NONE;
        }
        if (i10 != 1) {
            return null;
        }
        return VAULT_VGS;
    }

    public static Internal.EnumLiteMap<d> internalGetValueMap() {
        return f40495b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40498a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40497a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static d valueOf(int i10) {
        return forNumber(i10);
    }
}
