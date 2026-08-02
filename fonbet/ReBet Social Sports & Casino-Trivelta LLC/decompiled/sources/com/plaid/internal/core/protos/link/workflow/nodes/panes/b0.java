package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum b0 implements Internal.EnumLite {
    WEBVIEW_FALLBACK_MODE_UNKNOWN(0),
    WEBVIEW_FALLBACK_MODE_IN_PROCESS(1),
    WEBVIEW_FALLBACK_MODE_OUT_OF_PROCESS(2),
    UNRECOGNIZED(-1);

    public static final int WEBVIEW_FALLBACK_MODE_IN_PROCESS_VALUE = 1;
    public static final int WEBVIEW_FALLBACK_MODE_OUT_OF_PROCESS_VALUE = 2;
    public static final int WEBVIEW_FALLBACK_MODE_UNKNOWN_VALUE = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40387b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40389a;

    public class a implements Internal.EnumLiteMap<b0> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final b0 findValueByNumber(int i10) {
            return b0.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40390a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return b0.forNumber(i10) != null;
        }
    }

    b0(int i10) {
        this.f40389a = i10;
    }

    public static b0 forNumber(int i10) {
        if (i10 == 0) {
            return WEBVIEW_FALLBACK_MODE_UNKNOWN;
        }
        if (i10 == 1) {
            return WEBVIEW_FALLBACK_MODE_IN_PROCESS;
        }
        if (i10 != 2) {
            return null;
        }
        return WEBVIEW_FALLBACK_MODE_OUT_OF_PROCESS;
    }

    public static Internal.EnumLiteMap<b0> internalGetValueMap() {
        return f40387b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40390a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40389a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static b0 valueOf(int i10) {
        return forNumber(i10);
    }
}
