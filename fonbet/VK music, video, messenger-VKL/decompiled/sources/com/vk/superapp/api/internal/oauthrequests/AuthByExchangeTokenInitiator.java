package com.vk.superapp.api.internal.oauthrequests;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthByExchangeTokenInitiator.kt */
/* loaded from: classes6.dex */
public final class AuthByExchangeTokenInitiator {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AuthByExchangeTokenInitiator[] $VALUES;
    public static final AuthByExchangeTokenInitiator ADD_EDU_PROFILE;
    public static final AuthByExchangeTokenInitiator AUTHORIZATION;
    public static final AuthByExchangeTokenInitiator EXPIRED_TOKEN;
    public static final AuthByExchangeTokenInitiator NO_INITIATOR;
    public static final AuthByExchangeTokenInitiator SILENT_AUTHORIZATION;
    public static final AuthByExchangeTokenInitiator WEB_HANDLER_AUTHORIZATION;
    private final String value;

    static {
        AuthByExchangeTokenInitiator authByExchangeTokenInitiator = new AuthByExchangeTokenInitiator("NO_INITIATOR", 0, null);
        NO_INITIATOR = authByExchangeTokenInitiator;
        AuthByExchangeTokenInitiator authByExchangeTokenInitiator2 = new AuthByExchangeTokenInitiator("EXPIRED_TOKEN", 1, "expired_token");
        EXPIRED_TOKEN = authByExchangeTokenInitiator2;
        AuthByExchangeTokenInitiator authByExchangeTokenInitiator3 = new AuthByExchangeTokenInitiator("ADD_EDU_PROFILE", 2, "add_edu_profile");
        ADD_EDU_PROFILE = authByExchangeTokenInitiator3;
        AuthByExchangeTokenInitiator authByExchangeTokenInitiator4 = new AuthByExchangeTokenInitiator("AUTHORIZATION", 3, "authorization");
        AUTHORIZATION = authByExchangeTokenInitiator4;
        AuthByExchangeTokenInitiator authByExchangeTokenInitiator5 = new AuthByExchangeTokenInitiator("SILENT_AUTHORIZATION", 4, "silent_authorization");
        SILENT_AUTHORIZATION = authByExchangeTokenInitiator5;
        AuthByExchangeTokenInitiator authByExchangeTokenInitiator6 = new AuthByExchangeTokenInitiator("WEB_HANDLER_AUTHORIZATION", 5, "web_handler_authorization");
        WEB_HANDLER_AUTHORIZATION = authByExchangeTokenInitiator6;
        AuthByExchangeTokenInitiator[] authByExchangeTokenInitiatorArr = {authByExchangeTokenInitiator, authByExchangeTokenInitiator2, authByExchangeTokenInitiator3, authByExchangeTokenInitiator4, authByExchangeTokenInitiator5, authByExchangeTokenInitiator6};
        $VALUES = authByExchangeTokenInitiatorArr;
        $ENTRIES = new asp(authByExchangeTokenInitiatorArr);
    }

    public AuthByExchangeTokenInitiator(String str, int i, String str2) {
        this.value = str2;
    }

    public static AuthByExchangeTokenInitiator valueOf(String str) {
        return (AuthByExchangeTokenInitiator) Enum.valueOf(AuthByExchangeTokenInitiator.class, str);
    }

    public static AuthByExchangeTokenInitiator[] values() {
        return (AuthByExchangeTokenInitiator[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
