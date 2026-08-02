package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC3601x implements Internal.EnumLite {
    GRID_SELECTION_BEHAVIOR_UNKNOWN(0),
    GRID_SELECTION_BEHAVIOR_SINGLE_SELECT(1),
    UNRECOGNIZED(-1);

    public static final int GRID_SELECTION_BEHAVIOR_SINGLE_SELECT_VALUE = 1;
    public static final int GRID_SELECTION_BEHAVIOR_UNKNOWN_VALUE = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40457b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40459a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.x$a */
    public class a implements Internal.EnumLiteMap<EnumC3601x> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final EnumC3601x findValueByNumber(int i10) {
            return EnumC3601x.forNumber(i10);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.x$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40460a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return EnumC3601x.forNumber(i10) != null;
        }
    }

    EnumC3601x(int i10) {
        this.f40459a = i10;
    }

    public static EnumC3601x forNumber(int i10) {
        if (i10 == 0) {
            return GRID_SELECTION_BEHAVIOR_UNKNOWN;
        }
        if (i10 != 1) {
            return null;
        }
        return GRID_SELECTION_BEHAVIOR_SINGLE_SELECT;
    }

    public static Internal.EnumLiteMap<EnumC3601x> internalGetValueMap() {
        return f40457b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40460a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40459a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC3601x valueOf(int i10) {
        return forNumber(i10);
    }
}
