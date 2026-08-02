package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum n implements Internal.EnumLite {
    IOS_SDK_POPUP_BEHAVIOR_UNKNOWN(0),
    IOS_SDK_POPUP_BEHAVIOR_DEFAULT_BROWSER(1),
    IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL(2),
    IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT(3),
    IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK(4),
    IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK(5),
    UNRECOGNIZED(-1);

    public static final int IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK_VALUE = 4;
    public static final int IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_VALUE = 2;
    public static final int IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK_VALUE = 5;
    public static final int IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_VALUE = 3;
    public static final int IOS_SDK_POPUP_BEHAVIOR_DEFAULT_BROWSER_VALUE = 1;
    public static final int IOS_SDK_POPUP_BEHAVIOR_UNKNOWN_VALUE = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40526b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40528a;

    public class a implements Internal.EnumLiteMap<n> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final n findValueByNumber(int i10) {
            return n.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40529a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return n.forNumber(i10) != null;
        }
    }

    n(int i10) {
        this.f40528a = i10;
    }

    public static n forNumber(int i10) {
        if (i10 == 0) {
            return IOS_SDK_POPUP_BEHAVIOR_UNKNOWN;
        }
        if (i10 == 1) {
            return IOS_SDK_POPUP_BEHAVIOR_DEFAULT_BROWSER;
        }
        if (i10 == 2) {
            return IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL;
        }
        if (i10 == 3) {
            return IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT;
        }
        if (i10 == 4) {
            return IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK;
        }
        if (i10 != 5) {
            return null;
        }
        return IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK;
    }

    public static Internal.EnumLiteMap<n> internalGetValueMap() {
        return f40526b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40529a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40528a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static n valueOf(int i10) {
        return forNumber(i10);
    }
}
