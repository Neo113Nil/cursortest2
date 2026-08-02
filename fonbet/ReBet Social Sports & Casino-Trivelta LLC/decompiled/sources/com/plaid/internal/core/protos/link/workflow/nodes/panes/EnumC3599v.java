package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC3599v implements Internal.EnumLite {
    NONE(0),
    BUTTON_ONE_TAP(1),
    BUTTON_TWO_TAP(2),
    BUTTON_THREE_TAP(3),
    UNRECOGNIZED(-1);

    public static final int BUTTON_ONE_TAP_VALUE = 1;
    public static final int BUTTON_THREE_TAP_VALUE = 3;
    public static final int BUTTON_TWO_TAP_VALUE = 2;
    public static final int NONE_VALUE = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40451b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40453a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.v$a */
    public class a implements Internal.EnumLiteMap<EnumC3599v> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final EnumC3599v findValueByNumber(int i10) {
            return EnumC3599v.forNumber(i10);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.v$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40454a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return EnumC3599v.forNumber(i10) != null;
        }
    }

    EnumC3599v(int i10) {
        this.f40453a = i10;
    }

    public static EnumC3599v forNumber(int i10) {
        if (i10 == 0) {
            return NONE;
        }
        if (i10 == 1) {
            return BUTTON_ONE_TAP;
        }
        if (i10 == 2) {
            return BUTTON_TWO_TAP;
        }
        if (i10 != 3) {
            return null;
        }
        return BUTTON_THREE_TAP;
    }

    public static Internal.EnumLiteMap<EnumC3599v> internalGetValueMap() {
        return f40451b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40454a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40453a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC3599v valueOf(int i10) {
        return forNumber(i10);
    }
}
