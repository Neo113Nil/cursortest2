package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum O implements Internal.EnumLite {
    SELECTION_LIST_BEHAVIOR_UNKNOWN(0),
    SELECTION_LIST_BEHAVIOR_SINGLE_SELECT(1),
    SELECTION_LIST_BEHAVIOR_SINGLE_SELECT_IMMEDIATE(2),
    SELECTION_LIST_BEHAVIOR_MULTI_SELECT(3),
    SELECTION_LIST_BEHAVIOR_MULTI_SELECT_NO_RESPONSES_REQUIRED(4),
    SELECTION_LIST_BEHAVIOR_NO_SELECTION(5),
    UNRECOGNIZED(-1);

    public static final int SELECTION_LIST_BEHAVIOR_MULTI_SELECT_NO_RESPONSES_REQUIRED_VALUE = 4;
    public static final int SELECTION_LIST_BEHAVIOR_MULTI_SELECT_VALUE = 3;
    public static final int SELECTION_LIST_BEHAVIOR_NO_SELECTION_VALUE = 5;
    public static final int SELECTION_LIST_BEHAVIOR_SINGLE_SELECT_IMMEDIATE_VALUE = 2;
    public static final int SELECTION_LIST_BEHAVIOR_SINGLE_SELECT_VALUE = 1;
    public static final int SELECTION_LIST_BEHAVIOR_UNKNOWN_VALUE = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40251b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40253a;

    public class a implements Internal.EnumLiteMap<O> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final O findValueByNumber(int i10) {
            return O.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40254a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return O.forNumber(i10) != null;
        }
    }

    O(int i10) {
        this.f40253a = i10;
    }

    public static O forNumber(int i10) {
        if (i10 == 0) {
            return SELECTION_LIST_BEHAVIOR_UNKNOWN;
        }
        if (i10 == 1) {
            return SELECTION_LIST_BEHAVIOR_SINGLE_SELECT;
        }
        if (i10 == 2) {
            return SELECTION_LIST_BEHAVIOR_SINGLE_SELECT_IMMEDIATE;
        }
        if (i10 == 3) {
            return SELECTION_LIST_BEHAVIOR_MULTI_SELECT;
        }
        if (i10 == 4) {
            return SELECTION_LIST_BEHAVIOR_MULTI_SELECT_NO_RESPONSES_REQUIRED;
        }
        if (i10 != 5) {
            return null;
        }
        return SELECTION_LIST_BEHAVIOR_NO_SELECTION;
    }

    public static Internal.EnumLiteMap<O> internalGetValueMap() {
        return f40251b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40254a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40253a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static O valueOf(int i10) {
        return forNumber(i10);
    }
}
