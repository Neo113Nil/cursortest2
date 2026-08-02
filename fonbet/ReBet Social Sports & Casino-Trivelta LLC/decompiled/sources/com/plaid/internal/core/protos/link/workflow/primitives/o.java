package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum o implements Internal.EnumLite {
    IOS_URL_OPEN_BEHAVIOR_UNKNOWN(0),
    IOS_URL_OPEN_BEHAVIOR_DEFAULT_BROWSER(1),
    IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_EPHEMERAL(2),
    IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_WITH_PROMPT(3),
    IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK(4),
    IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK(5),
    UNRECOGNIZED(-1);

    public static final int IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK_VALUE = 4;
    public static final int IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_EPHEMERAL_VALUE = 2;
    public static final int IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK_VALUE = 5;
    public static final int IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_VALUE = 3;
    public static final int IOS_URL_OPEN_BEHAVIOR_DEFAULT_BROWSER_VALUE = 1;
    public static final int IOS_URL_OPEN_BEHAVIOR_UNKNOWN_VALUE = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40530b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40532a;

    public class a implements Internal.EnumLiteMap<o> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final o findValueByNumber(int i10) {
            return o.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40533a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return o.forNumber(i10) != null;
        }
    }

    o(int i10) {
        this.f40532a = i10;
    }

    public static o forNumber(int i10) {
        if (i10 == 0) {
            return IOS_URL_OPEN_BEHAVIOR_UNKNOWN;
        }
        if (i10 == 1) {
            return IOS_URL_OPEN_BEHAVIOR_DEFAULT_BROWSER;
        }
        if (i10 == 2) {
            return IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_EPHEMERAL;
        }
        if (i10 == 3) {
            return IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_WITH_PROMPT;
        }
        if (i10 == 4) {
            return IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK;
        }
        if (i10 != 5) {
            return null;
        }
        return IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK;
    }

    public static Internal.EnumLiteMap<o> internalGetValueMap() {
        return f40530b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40533a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40532a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static o valueOf(int i10) {
        return forNumber(i10);
    }
}
