package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC3594p implements Internal.EnumLite {
    BUTTON_PLACEMENT_UNKNOWN(0),
    BUTTON_PLACEMENT_FOOTER(1),
    BUTTON_PLACEMENT_CONTENT_END(2),
    UNRECOGNIZED(-1);

    public static final int BUTTON_PLACEMENT_CONTENT_END_VALUE = 2;
    public static final int BUTTON_PLACEMENT_FOOTER_VALUE = 1;
    public static final int BUTTON_PLACEMENT_UNKNOWN_VALUE = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40426b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40428a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.p$a */
    public class a implements Internal.EnumLiteMap<EnumC3594p> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final EnumC3594p findValueByNumber(int i10) {
            return EnumC3594p.forNumber(i10);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.p$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40429a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return EnumC3594p.forNumber(i10) != null;
        }
    }

    EnumC3594p(int i10) {
        this.f40428a = i10;
    }

    public static EnumC3594p forNumber(int i10) {
        if (i10 == 0) {
            return BUTTON_PLACEMENT_UNKNOWN;
        }
        if (i10 == 1) {
            return BUTTON_PLACEMENT_FOOTER;
        }
        if (i10 != 2) {
            return null;
        }
        return BUTTON_PLACEMENT_CONTENT_END;
    }

    public static Internal.EnumLiteMap<EnumC3594p> internalGetValueMap() {
        return f40426b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40429a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40428a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC3594p valueOf(int i10) {
        return forNumber(i10);
    }
}
