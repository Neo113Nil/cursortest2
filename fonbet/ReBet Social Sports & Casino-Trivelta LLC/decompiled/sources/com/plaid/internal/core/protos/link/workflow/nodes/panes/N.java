package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum N implements Internal.EnumLite {
    SEARCH_BEHAVIOR_UNKNOWN(0),
    SEARCH_BEHAVIOR_FILTER_INITIAL_ITEMS(1),
    SEARCH_BEHAVIOR_PANE_SEARCH_API(2),
    SEARCH_BEHAVIOR_WORKFLOW_SEARCH_ENDPOINT(3),
    UNRECOGNIZED(-1);

    public static final int SEARCH_BEHAVIOR_FILTER_INITIAL_ITEMS_VALUE = 1;
    public static final int SEARCH_BEHAVIOR_PANE_SEARCH_API_VALUE = 2;
    public static final int SEARCH_BEHAVIOR_UNKNOWN_VALUE = 0;
    public static final int SEARCH_BEHAVIOR_WORKFLOW_SEARCH_ENDPOINT_VALUE = 3;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40247b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40249a;

    public class a implements Internal.EnumLiteMap<N> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final N findValueByNumber(int i10) {
            return N.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40250a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return N.forNumber(i10) != null;
        }
    }

    N(int i10) {
        this.f40249a = i10;
    }

    public static N forNumber(int i10) {
        if (i10 == 0) {
            return SEARCH_BEHAVIOR_UNKNOWN;
        }
        if (i10 == 1) {
            return SEARCH_BEHAVIOR_FILTER_INITIAL_ITEMS;
        }
        if (i10 == 2) {
            return SEARCH_BEHAVIOR_PANE_SEARCH_API;
        }
        if (i10 != 3) {
            return null;
        }
        return SEARCH_BEHAVIOR_WORKFLOW_SEARCH_ENDPOINT;
    }

    public static Internal.EnumLiteMap<N> internalGetValueMap() {
        return f40247b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40250a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40249a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static N valueOf(int i10) {
        return forNumber(i10);
    }
}
