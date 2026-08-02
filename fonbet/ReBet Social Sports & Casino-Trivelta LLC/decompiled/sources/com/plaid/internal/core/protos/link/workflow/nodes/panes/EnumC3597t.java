package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC3597t implements Internal.EnumLite {
    DISCLAIMER_TEXT_PLACEMENT_UNKNOWN(0),
    DISCLAIMER_TEXT_PLACEMENT_ABOVE_ACTION_BUTTONS(1),
    DISCLAIMER_TEXT_PLACEMENT_BELOW_ACTION_BUTTONS(2),
    UNRECOGNIZED(-1);

    public static final int DISCLAIMER_TEXT_PLACEMENT_ABOVE_ACTION_BUTTONS_VALUE = 1;
    public static final int DISCLAIMER_TEXT_PLACEMENT_BELOW_ACTION_BUTTONS_VALUE = 2;
    public static final int DISCLAIMER_TEXT_PLACEMENT_UNKNOWN_VALUE = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40441b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40443a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.t$a */
    public class a implements Internal.EnumLiteMap<EnumC3597t> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final EnumC3597t findValueByNumber(int i10) {
            return EnumC3597t.forNumber(i10);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.t$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40444a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return EnumC3597t.forNumber(i10) != null;
        }
    }

    EnumC3597t(int i10) {
        this.f40443a = i10;
    }

    public static EnumC3597t forNumber(int i10) {
        if (i10 == 0) {
            return DISCLAIMER_TEXT_PLACEMENT_UNKNOWN;
        }
        if (i10 == 1) {
            return DISCLAIMER_TEXT_PLACEMENT_ABOVE_ACTION_BUTTONS;
        }
        if (i10 != 2) {
            return null;
        }
        return DISCLAIMER_TEXT_PLACEMENT_BELOW_ACTION_BUTTONS;
    }

    public static Internal.EnumLiteMap<EnumC3597t> internalGetValueMap() {
        return f40441b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40444a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40443a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC3597t valueOf(int i10) {
        return forNumber(i10);
    }
}
