package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC3591m implements Internal.EnumLite {
    BACKGROUND_DISPLAY_MODE_UNKNOWN(0),
    BACKGROUND_DISPLAY_MODE_SHIMMER(1),
    UNRECOGNIZED(-1);

    public static final int BACKGROUND_DISPLAY_MODE_SHIMMER_VALUE = 1;
    public static final int BACKGROUND_DISPLAY_MODE_UNKNOWN_VALUE = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40409b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40411a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.m$a */
    public class a implements Internal.EnumLiteMap<EnumC3591m> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final EnumC3591m findValueByNumber(int i10) {
            return EnumC3591m.forNumber(i10);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.m$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40412a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return EnumC3591m.forNumber(i10) != null;
        }
    }

    EnumC3591m(int i10) {
        this.f40411a = i10;
    }

    public static EnumC3591m forNumber(int i10) {
        if (i10 == 0) {
            return BACKGROUND_DISPLAY_MODE_UNKNOWN;
        }
        if (i10 != 1) {
            return null;
        }
        return BACKGROUND_DISPLAY_MODE_SHIMMER;
    }

    public static Internal.EnumLiteMap<EnumC3591m> internalGetValueMap() {
        return f40409b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40412a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40411a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC3591m valueOf(int i10) {
        return forNumber(i10);
    }
}
