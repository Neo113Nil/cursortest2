package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum I implements Internal.EnumLite {
    PANE_BRANDING_UNKNOWN(0),
    PANE_BRANDING_DEFAULT(1),
    PANE_BRANDING_PLAID_AS_FIRST_PARTY(2),
    UNRECOGNIZED(-1);

    public static final int PANE_BRANDING_DEFAULT_VALUE = 1;
    public static final int PANE_BRANDING_PLAID_AS_FIRST_PARTY_VALUE = 2;
    public static final int PANE_BRANDING_UNKNOWN_VALUE = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40231b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40233a;

    public class a implements Internal.EnumLiteMap<I> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final I findValueByNumber(int i10) {
            return I.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40234a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return I.forNumber(i10) != null;
        }
    }

    I(int i10) {
        this.f40233a = i10;
    }

    public static I forNumber(int i10) {
        if (i10 == 0) {
            return PANE_BRANDING_UNKNOWN;
        }
        if (i10 == 1) {
            return PANE_BRANDING_DEFAULT;
        }
        if (i10 != 2) {
            return null;
        }
        return PANE_BRANDING_PLAID_AS_FIRST_PARTY;
    }

    public static Internal.EnumLiteMap<I> internalGetValueMap() {
        return f40231b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40234a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40233a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static I valueOf(int i10) {
        return forNumber(i10);
    }
}
