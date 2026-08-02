package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum a0 implements Internal.EnumLite {
    WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_UNKNOWN(0),
    WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_DEFAULT_BROWSER(1),
    WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL(2),
    WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT(3),
    WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK(4),
    WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK(5),
    UNRECOGNIZED(-1);

    public static final int WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK_VALUE = 4;
    public static final int WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_VALUE = 2;
    public static final int WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK_VALUE = 5;
    public static final int WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_VALUE = 3;
    public static final int WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_DEFAULT_BROWSER_VALUE = 1;
    public static final int WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_UNKNOWN_VALUE = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40382b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40384a;

    public class a implements Internal.EnumLiteMap<a0> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final a0 findValueByNumber(int i10) {
            return a0.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40385a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return a0.forNumber(i10) != null;
        }
    }

    a0(int i10) {
        this.f40384a = i10;
    }

    public static a0 forNumber(int i10) {
        if (i10 == 0) {
            return WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_UNKNOWN;
        }
        if (i10 == 1) {
            return WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_DEFAULT_BROWSER;
        }
        if (i10 == 2) {
            return WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL;
        }
        if (i10 == 3) {
            return WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT;
        }
        if (i10 == 4) {
            return WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK;
        }
        if (i10 != 5) {
            return null;
        }
        return WEBVIEW_FALLBACK_IOS_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK;
    }

    public static Internal.EnumLiteMap<a0> internalGetValueMap() {
        return f40382b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40385a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40384a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static a0 valueOf(int i10) {
        return forNumber(i10);
    }
}
