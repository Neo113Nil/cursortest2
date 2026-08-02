package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum E implements Internal.EnumLite {
    NOTE_TYPE_DEFAULT(0),
    NOTE_TYPE_INFO(1),
    NOTE_TYPE_WARNING(2),
    NOTE_TYPE_ERROR(3),
    NOTE_TYPE_SUCCESS(4),
    NOTE_TYPE_PROMINENT(5),
    UNRECOGNIZED(-1);

    public static final int NOTE_TYPE_DEFAULT_VALUE = 0;
    public static final int NOTE_TYPE_ERROR_VALUE = 3;
    public static final int NOTE_TYPE_INFO_VALUE = 1;
    public static final int NOTE_TYPE_PROMINENT_VALUE = 5;
    public static final int NOTE_TYPE_SUCCESS_VALUE = 4;
    public static final int NOTE_TYPE_WARNING_VALUE = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40198b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40200a;

    public class a implements Internal.EnumLiteMap<E> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final E findValueByNumber(int i10) {
            return E.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40201a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return E.forNumber(i10) != null;
        }
    }

    E(int i10) {
        this.f40200a = i10;
    }

    public static E forNumber(int i10) {
        if (i10 == 0) {
            return NOTE_TYPE_DEFAULT;
        }
        if (i10 == 1) {
            return NOTE_TYPE_INFO;
        }
        if (i10 == 2) {
            return NOTE_TYPE_WARNING;
        }
        if (i10 == 3) {
            return NOTE_TYPE_ERROR;
        }
        if (i10 == 4) {
            return NOTE_TYPE_SUCCESS;
        }
        if (i10 != 5) {
            return null;
        }
        return NOTE_TYPE_PROMINENT;
    }

    public static Internal.EnumLiteMap<E> internalGetValueMap() {
        return f40198b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40201a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40200a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static E valueOf(int i10) {
        return forNumber(i10);
    }
}
