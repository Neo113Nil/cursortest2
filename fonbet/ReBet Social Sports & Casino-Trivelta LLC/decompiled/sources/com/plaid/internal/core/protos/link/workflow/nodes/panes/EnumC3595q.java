package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC3595q implements Internal.EnumLite {
    BUTTON_WEIGHT_UNKNOWN(0),
    BUTTON_WEIGHT_PRIMARY(1),
    BUTTON_WEIGHT_SECONDARY(2),
    BUTTON_WEIGHT_TERTIARY(3),
    UNRECOGNIZED(-1);

    public static final int BUTTON_WEIGHT_PRIMARY_VALUE = 1;
    public static final int BUTTON_WEIGHT_SECONDARY_VALUE = 2;
    public static final int BUTTON_WEIGHT_TERTIARY_VALUE = 3;
    public static final int BUTTON_WEIGHT_UNKNOWN_VALUE = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40430b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40432a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.q$a */
    public class a implements Internal.EnumLiteMap<EnumC3595q> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final EnumC3595q findValueByNumber(int i10) {
            return EnumC3595q.forNumber(i10);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.q$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40433a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return EnumC3595q.forNumber(i10) != null;
        }
    }

    EnumC3595q(int i10) {
        this.f40432a = i10;
    }

    public static EnumC3595q forNumber(int i10) {
        if (i10 == 0) {
            return BUTTON_WEIGHT_UNKNOWN;
        }
        if (i10 == 1) {
            return BUTTON_WEIGHT_PRIMARY;
        }
        if (i10 == 2) {
            return BUTTON_WEIGHT_SECONDARY;
        }
        if (i10 != 3) {
            return null;
        }
        return BUTTON_WEIGHT_TERTIARY;
    }

    public static Internal.EnumLiteMap<EnumC3595q> internalGetValueMap() {
        return f40430b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40433a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40432a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC3595q valueOf(int i10) {
        return forNumber(i10);
    }
}
