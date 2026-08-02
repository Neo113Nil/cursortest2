package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC3596s implements Internal.EnumLite {
    CONTENT_JUSTIFY_UNKNOWN(0),
    CONTENT_JUSTIFY_CENTER(1),
    CONTENT_JUSTIFY_SPACE_BETWEEN(2),
    CONTENT_JUSTIFY_SPACE_AROUND(3),
    CONTENT_JUSTIFY_SPACE_EVENLY(4),
    CONTENT_JUSTIFY_START(5),
    UNRECOGNIZED(-1);

    public static final int CONTENT_JUSTIFY_CENTER_VALUE = 1;
    public static final int CONTENT_JUSTIFY_SPACE_AROUND_VALUE = 3;
    public static final int CONTENT_JUSTIFY_SPACE_BETWEEN_VALUE = 2;
    public static final int CONTENT_JUSTIFY_SPACE_EVENLY_VALUE = 4;
    public static final int CONTENT_JUSTIFY_START_VALUE = 5;
    public static final int CONTENT_JUSTIFY_UNKNOWN_VALUE = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40436b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40438a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.s$a */
    public class a implements Internal.EnumLiteMap<EnumC3596s> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final EnumC3596s findValueByNumber(int i10) {
            return EnumC3596s.forNumber(i10);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.s$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40439a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return EnumC3596s.forNumber(i10) != null;
        }
    }

    EnumC3596s(int i10) {
        this.f40438a = i10;
    }

    public static EnumC3596s forNumber(int i10) {
        if (i10 == 0) {
            return CONTENT_JUSTIFY_UNKNOWN;
        }
        if (i10 == 1) {
            return CONTENT_JUSTIFY_CENTER;
        }
        if (i10 == 2) {
            return CONTENT_JUSTIFY_SPACE_BETWEEN;
        }
        if (i10 == 3) {
            return CONTENT_JUSTIFY_SPACE_AROUND;
        }
        if (i10 == 4) {
            return CONTENT_JUSTIFY_SPACE_EVENLY;
        }
        if (i10 != 5) {
            return null;
        }
        return CONTENT_JUSTIFY_START;
    }

    public static Internal.EnumLiteMap<EnumC3596s> internalGetValueMap() {
        return f40436b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40439a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40438a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC3596s valueOf(int i10) {
        return forNumber(i10);
    }
}
