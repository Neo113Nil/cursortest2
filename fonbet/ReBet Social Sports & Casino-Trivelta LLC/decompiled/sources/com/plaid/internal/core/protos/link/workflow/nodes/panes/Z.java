package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum Z implements Internal.EnumLite {
    WEBVIEW_FALLBACK_BACKGROUND_DEFAULT(0),
    WEBVIEW_FALLBACK_BACKGROUND_LIGHT(1),
    WEBVIEW_FALLBACK_BACKGROUND_DARK(2),
    WEBVIEW_FALLBACK_BACKGROUND_TRANSPARENT(3),
    UNRECOGNIZED(-1);

    public static final int WEBVIEW_FALLBACK_BACKGROUND_DARK_VALUE = 2;
    public static final int WEBVIEW_FALLBACK_BACKGROUND_DEFAULT_VALUE = 0;
    public static final int WEBVIEW_FALLBACK_BACKGROUND_LIGHT_VALUE = 1;
    public static final int WEBVIEW_FALLBACK_BACKGROUND_TRANSPARENT_VALUE = 3;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40377b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40379a;

    public class a implements Internal.EnumLiteMap<Z> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Z findValueByNumber(int i10) {
            return Z.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40380a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return Z.forNumber(i10) != null;
        }
    }

    Z(int i10) {
        this.f40379a = i10;
    }

    public static Z forNumber(int i10) {
        if (i10 == 0) {
            return WEBVIEW_FALLBACK_BACKGROUND_DEFAULT;
        }
        if (i10 == 1) {
            return WEBVIEW_FALLBACK_BACKGROUND_LIGHT;
        }
        if (i10 == 2) {
            return WEBVIEW_FALLBACK_BACKGROUND_DARK;
        }
        if (i10 != 3) {
            return null;
        }
        return WEBVIEW_FALLBACK_BACKGROUND_TRANSPARENT;
    }

    public static Internal.EnumLiteMap<Z> internalGetValueMap() {
        return f40377b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40380a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40379a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Z valueOf(int i10) {
        return forNumber(i10);
    }
}
