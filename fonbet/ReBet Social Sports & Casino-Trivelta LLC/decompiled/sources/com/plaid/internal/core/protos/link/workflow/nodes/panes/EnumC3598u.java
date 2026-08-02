package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC3598u implements Internal.EnumLite {
    FLEX_DIRECTION_ROW(0),
    FLEX_DIRECTION_COLUMN(1),
    FLEX_DIRECTION_ROW_REVERSE(2),
    FLEX_DIRECTION_COLUMN_REVERSE(3),
    UNRECOGNIZED(-1);

    public static final int FLEX_DIRECTION_COLUMN_REVERSE_VALUE = 3;
    public static final int FLEX_DIRECTION_COLUMN_VALUE = 1;
    public static final int FLEX_DIRECTION_ROW_REVERSE_VALUE = 2;
    public static final int FLEX_DIRECTION_ROW_VALUE = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40446b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40448a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.u$a */
    public class a implements Internal.EnumLiteMap<EnumC3598u> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final EnumC3598u findValueByNumber(int i10) {
            return EnumC3598u.forNumber(i10);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.u$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40449a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return EnumC3598u.forNumber(i10) != null;
        }
    }

    EnumC3598u(int i10) {
        this.f40448a = i10;
    }

    public static EnumC3598u forNumber(int i10) {
        if (i10 == 0) {
            return FLEX_DIRECTION_ROW;
        }
        if (i10 == 1) {
            return FLEX_DIRECTION_COLUMN;
        }
        if (i10 == 2) {
            return FLEX_DIRECTION_ROW_REVERSE;
        }
        if (i10 != 3) {
            return null;
        }
        return FLEX_DIRECTION_COLUMN_REVERSE;
    }

    public static Internal.EnumLiteMap<EnumC3598u> internalGetValueMap() {
        return f40446b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40449a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40448a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC3598u valueOf(int i10) {
        return forNumber(i10);
    }
}
