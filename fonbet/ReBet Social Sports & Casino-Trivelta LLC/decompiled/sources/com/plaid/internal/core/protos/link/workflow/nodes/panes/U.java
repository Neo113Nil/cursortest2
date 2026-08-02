package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum U implements Internal.EnumLite {
    TEXT_ALIGNMENT_UNKNOWN(0),
    TEXT_ALIGNMENT_LEFT(1),
    TEXT_ALIGNMENT_CENTER(2),
    TEXT_ALIGNMENT_RIGHT(3),
    TEXT_ALIGNMENT_JUSTIFIED(4),
    UNRECOGNIZED(-1);

    public static final int TEXT_ALIGNMENT_CENTER_VALUE = 2;
    public static final int TEXT_ALIGNMENT_JUSTIFIED_VALUE = 4;
    public static final int TEXT_ALIGNMENT_LEFT_VALUE = 1;
    public static final int TEXT_ALIGNMENT_RIGHT_VALUE = 3;
    public static final int TEXT_ALIGNMENT_UNKNOWN_VALUE = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40327b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40329a;

    public class a implements Internal.EnumLiteMap<U> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final U findValueByNumber(int i10) {
            return U.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40330a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return U.forNumber(i10) != null;
        }
    }

    U(int i10) {
        this.f40329a = i10;
    }

    public static U forNumber(int i10) {
        if (i10 == 0) {
            return TEXT_ALIGNMENT_UNKNOWN;
        }
        if (i10 == 1) {
            return TEXT_ALIGNMENT_LEFT;
        }
        if (i10 == 2) {
            return TEXT_ALIGNMENT_CENTER;
        }
        if (i10 == 3) {
            return TEXT_ALIGNMENT_RIGHT;
        }
        if (i10 != 4) {
            return null;
        }
        return TEXT_ALIGNMENT_JUSTIFIED;
    }

    public static Internal.EnumLiteMap<U> internalGetValueMap() {
        return f40327b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40330a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40329a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static U valueOf(int i10) {
        return forNumber(i10);
    }
}
