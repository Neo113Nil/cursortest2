package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum D implements Internal.EnumLite {
    NOTE_SIZE_32(0),
    NOTE_SIZE_24(1),
    NOTE_SIZE_20(2),
    UNRECOGNIZED(-1);

    public static final int NOTE_SIZE_20_VALUE = 2;
    public static final int NOTE_SIZE_24_VALUE = 1;
    public static final int NOTE_SIZE_32_VALUE = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40194b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40196a;

    public class a implements Internal.EnumLiteMap<D> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final D findValueByNumber(int i10) {
            return D.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40197a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return D.forNumber(i10) != null;
        }
    }

    D(int i10) {
        this.f40196a = i10;
    }

    public static D forNumber(int i10) {
        if (i10 == 0) {
            return NOTE_SIZE_32;
        }
        if (i10 == 1) {
            return NOTE_SIZE_24;
        }
        if (i10 != 2) {
            return null;
        }
        return NOTE_SIZE_20;
    }

    public static Internal.EnumLiteMap<D> internalGetValueMap() {
        return f40194b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40197a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40196a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static D valueOf(int i10) {
        return forNumber(i10);
    }
}
