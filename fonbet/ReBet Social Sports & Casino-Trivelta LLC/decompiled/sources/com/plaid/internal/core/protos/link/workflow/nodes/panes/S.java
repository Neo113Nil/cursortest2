package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum S implements Internal.EnumLite {
    TABLE_ROW_STYLE_UNKNOWN(0),
    TABLE_ROW_STYLE_LEADING_LABEL(1),
    TABLE_ROW_STYLE_TRAILING_LABEL(2),
    UNRECOGNIZED(-1);

    public static final int TABLE_ROW_STYLE_LEADING_LABEL_VALUE = 1;
    public static final int TABLE_ROW_STYLE_TRAILING_LABEL_VALUE = 2;
    public static final int TABLE_ROW_STYLE_UNKNOWN_VALUE = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40307b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40309a;

    public class a implements Internal.EnumLiteMap<S> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final S findValueByNumber(int i10) {
            return S.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40310a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return S.forNumber(i10) != null;
        }
    }

    S(int i10) {
        this.f40309a = i10;
    }

    public static S forNumber(int i10) {
        if (i10 == 0) {
            return TABLE_ROW_STYLE_UNKNOWN;
        }
        if (i10 == 1) {
            return TABLE_ROW_STYLE_LEADING_LABEL;
        }
        if (i10 != 2) {
            return null;
        }
        return TABLE_ROW_STYLE_TRAILING_LABEL;
    }

    public static Internal.EnumLiteMap<S> internalGetValueMap() {
        return f40307b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40310a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40309a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static S valueOf(int i10) {
        return forNumber(i10);
    }
}
