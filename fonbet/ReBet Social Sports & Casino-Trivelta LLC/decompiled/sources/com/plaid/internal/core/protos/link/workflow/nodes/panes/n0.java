package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum n0 implements Internal.EnumLite {
    BACK_STACK_BEHAVIOR_UNKNOWN(0),
    BACK_STACK_BEHAVIOR_PERSISTENT(1),
    BACK_STACK_BEHAVIOR_TRANSIENT(2),
    UNRECOGNIZED(-1);

    public static final int BACK_STACK_BEHAVIOR_PERSISTENT_VALUE = 1;
    public static final int BACK_STACK_BEHAVIOR_TRANSIENT_VALUE = 2;
    public static final int BACK_STACK_BEHAVIOR_UNKNOWN_VALUE = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40418b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40420a;

    public class a implements Internal.EnumLiteMap<n0> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final n0 findValueByNumber(int i10) {
            return n0.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40421a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return n0.forNumber(i10) != null;
        }
    }

    n0(int i10) {
        this.f40420a = i10;
    }

    public static n0 forNumber(int i10) {
        if (i10 == 0) {
            return BACK_STACK_BEHAVIOR_UNKNOWN;
        }
        if (i10 == 1) {
            return BACK_STACK_BEHAVIOR_PERSISTENT;
        }
        if (i10 != 2) {
            return null;
        }
        return BACK_STACK_BEHAVIOR_TRANSIENT;
    }

    public static Internal.EnumLiteMap<n0> internalGetValueMap() {
        return f40418b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40421a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40420a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static n0 valueOf(int i10) {
        return forNumber(i10);
    }
}
