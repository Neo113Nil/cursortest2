package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC3592n implements Internal.EnumLite {
    BANNER_APPEARANCE_NEUTRAL(0),
    BANNER_APPEARANCE_ROUNDED(1),
    UNRECOGNIZED(-1);

    public static final int BANNER_APPEARANCE_NEUTRAL_VALUE = 0;
    public static final int BANNER_APPEARANCE_ROUNDED_VALUE = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40414b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40416a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.n$a */
    public class a implements Internal.EnumLiteMap<EnumC3592n> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final EnumC3592n findValueByNumber(int i10) {
            return EnumC3592n.forNumber(i10);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.n$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40417a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return EnumC3592n.forNumber(i10) != null;
        }
    }

    EnumC3592n(int i10) {
        this.f40416a = i10;
    }

    public static EnumC3592n forNumber(int i10) {
        if (i10 == 0) {
            return BANNER_APPEARANCE_NEUTRAL;
        }
        if (i10 != 1) {
            return null;
        }
        return BANNER_APPEARANCE_ROUNDED;
    }

    public static Internal.EnumLiteMap<EnumC3592n> internalGetValueMap() {
        return f40414b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40417a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40416a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC3592n valueOf(int i10) {
        return forNumber(i10);
    }
}
