package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC3593o implements Internal.EnumLite {
    BANNER_TYPE_DEFAULT(0),
    BANNER_TYPE_NEUTRAL(1),
    BANNER_TYPE_POSITIVE(2),
    BANNER_TYPE_WARNING(3),
    BANNER_TYPE_NEGATIVE(4),
    BANNER_TYPE_INFO(5),
    BANNER_TYPE_PROMINENT(6),
    UNRECOGNIZED(-1);

    public static final int BANNER_TYPE_DEFAULT_VALUE = 0;
    public static final int BANNER_TYPE_INFO_VALUE = 5;
    public static final int BANNER_TYPE_NEGATIVE_VALUE = 4;
    public static final int BANNER_TYPE_NEUTRAL_VALUE = 1;
    public static final int BANNER_TYPE_POSITIVE_VALUE = 2;
    public static final int BANNER_TYPE_PROMINENT_VALUE = 6;
    public static final int BANNER_TYPE_WARNING_VALUE = 3;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40422b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40424a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.o$a */
    public class a implements Internal.EnumLiteMap<EnumC3593o> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final EnumC3593o findValueByNumber(int i10) {
            return EnumC3593o.forNumber(i10);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.o$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40425a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return EnumC3593o.forNumber(i10) != null;
        }
    }

    EnumC3593o(int i10) {
        this.f40424a = i10;
    }

    public static EnumC3593o forNumber(int i10) {
        switch (i10) {
            case 0:
                return BANNER_TYPE_DEFAULT;
            case 1:
                return BANNER_TYPE_NEUTRAL;
            case 2:
                return BANNER_TYPE_POSITIVE;
            case 3:
                return BANNER_TYPE_WARNING;
            case 4:
                return BANNER_TYPE_NEGATIVE;
            case 5:
                return BANNER_TYPE_INFO;
            case 6:
                return BANNER_TYPE_PROMINENT;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<EnumC3593o> internalGetValueMap() {
        return f40422b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40425a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40424a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC3593o valueOf(int i10) {
        return forNumber(i10);
    }
}
