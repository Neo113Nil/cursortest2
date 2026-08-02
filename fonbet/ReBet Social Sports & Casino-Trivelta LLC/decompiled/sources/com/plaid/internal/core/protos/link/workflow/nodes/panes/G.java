package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum G implements Internal.EnumLite {
    UI_EXPERIENCE_DEFAULT(0),
    UI_EXPERIENCE_SPINNER_ONLY(1),
    UNRECOGNIZED(-1);

    public static final int UI_EXPERIENCE_DEFAULT_VALUE = 0;
    public static final int UI_EXPERIENCE_SPINNER_ONLY_VALUE = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40223b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40225a;

    public class a implements Internal.EnumLiteMap<G> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final G findValueByNumber(int i10) {
            return G.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40226a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return G.forNumber(i10) != null;
        }
    }

    G(int i10) {
        this.f40225a = i10;
    }

    public static G forNumber(int i10) {
        if (i10 == 0) {
            return UI_EXPERIENCE_DEFAULT;
        }
        if (i10 != 1) {
            return null;
        }
        return UI_EXPERIENCE_SPINNER_ONLY;
    }

    public static Internal.EnumLiteMap<G> internalGetValueMap() {
        return f40223b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40226a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40225a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static G valueOf(int i10) {
        return forNumber(i10);
    }
}
