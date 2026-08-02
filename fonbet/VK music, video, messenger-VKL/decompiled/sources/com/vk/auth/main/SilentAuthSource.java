package com.vk.auth.main;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SilentAuthSource.kt */
/* loaded from: classes.dex */
public final class SilentAuthSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SilentAuthSource[] $VALUES;
    public static final SilentAuthSource ADDITIONAL_OAUTH;
    public static final SilentAuthSource AUTOLOGIN;
    public static final SilentAuthSource BUTTON;
    public static final SilentAuthSource BY_ECOSYSTEM_PUSH;
    public static final SilentAuthSource BY_EMAIL;
    public static final SilentAuthSource BY_GRAY_LINK;
    public static final SilentAuthSource BY_LOGIN;
    public static final SilentAuthSource BY_MAX_CODE;
    public static final SilentAuthSource BY_MAX_MESSENGER;
    public static final SilentAuthSource BY_OAUTH;
    public static final SilentAuthSource BY_OFFICIAL_MESSENGER;
    public static final SilentAuthSource BY_PASSKEY;
    public static final SilentAuthSource BY_PHONE;
    public static final SilentAuthSource BY_VKID;
    public static final SilentAuthSource BY_WHITE_LINK;
    public static final SilentAuthSource FAST_LOGIN;
    public static final SilentAuthSource INTERNAL;
    public static final SilentAuthSource QR_APP_TO_APP;
    public static final SilentAuthSource QR_WEB_TO_APP;
    public static final SilentAuthSource REGISTRATION;
    public static final SilentAuthSource SILENT_LOGIN;

    static {
        SilentAuthSource silentAuthSource = new SilentAuthSource("FAST_LOGIN", 0);
        FAST_LOGIN = silentAuthSource;
        SilentAuthSource silentAuthSource2 = new SilentAuthSource("SILENT_LOGIN", 1);
        SILENT_LOGIN = silentAuthSource2;
        SilentAuthSource silentAuthSource3 = new SilentAuthSource("BY_GRAY_LINK", 2);
        BY_GRAY_LINK = silentAuthSource3;
        SilentAuthSource silentAuthSource4 = new SilentAuthSource("BY_WHITE_LINK", 3);
        BY_WHITE_LINK = silentAuthSource4;
        SilentAuthSource silentAuthSource5 = new SilentAuthSource("BY_VKID", 4);
        BY_VKID = silentAuthSource5;
        SilentAuthSource silentAuthSource6 = new SilentAuthSource("INTERNAL", 5);
        INTERNAL = silentAuthSource6;
        SilentAuthSource silentAuthSource7 = new SilentAuthSource("BY_LOGIN", 6);
        BY_LOGIN = silentAuthSource7;
        SilentAuthSource silentAuthSource8 = new SilentAuthSource("BY_OAUTH", 7);
        BY_OAUTH = silentAuthSource8;
        SilentAuthSource silentAuthSource9 = new SilentAuthSource("BY_EMAIL", 8);
        BY_EMAIL = silentAuthSource9;
        SilentAuthSource silentAuthSource10 = new SilentAuthSource("BY_ECOSYSTEM_PUSH", 9);
        BY_ECOSYSTEM_PUSH = silentAuthSource10;
        SilentAuthSource silentAuthSource11 = new SilentAuthSource("ADDITIONAL_OAUTH", 10);
        ADDITIONAL_OAUTH = silentAuthSource11;
        SilentAuthSource silentAuthSource12 = new SilentAuthSource("BY_PHONE", 11);
        BY_PHONE = silentAuthSource12;
        SilentAuthSource silentAuthSource13 = new SilentAuthSource("REGISTRATION", 12);
        REGISTRATION = silentAuthSource13;
        SilentAuthSource silentAuthSource14 = new SilentAuthSource("BUTTON", 13);
        BUTTON = silentAuthSource14;
        SilentAuthSource silentAuthSource15 = new SilentAuthSource("BY_PASSKEY", 14);
        BY_PASSKEY = silentAuthSource15;
        SilentAuthSource silentAuthSource16 = new SilentAuthSource("AUTOLOGIN", 15);
        AUTOLOGIN = silentAuthSource16;
        SilentAuthSource silentAuthSource17 = new SilentAuthSource("QR_APP_TO_APP", 16);
        QR_APP_TO_APP = silentAuthSource17;
        SilentAuthSource silentAuthSource18 = new SilentAuthSource("QR_WEB_TO_APP", 17);
        QR_WEB_TO_APP = silentAuthSource18;
        SilentAuthSource silentAuthSource19 = new SilentAuthSource("BY_MAX_MESSENGER", 18);
        BY_MAX_MESSENGER = silentAuthSource19;
        SilentAuthSource silentAuthSource20 = new SilentAuthSource("BY_OFFICIAL_MESSENGER", 19);
        BY_OFFICIAL_MESSENGER = silentAuthSource20;
        SilentAuthSource silentAuthSource21 = new SilentAuthSource("BY_MAX_CODE", 20);
        BY_MAX_CODE = silentAuthSource21;
        SilentAuthSource[] silentAuthSourceArr = {silentAuthSource, silentAuthSource2, silentAuthSource3, silentAuthSource4, silentAuthSource5, silentAuthSource6, silentAuthSource7, silentAuthSource8, silentAuthSource9, silentAuthSource10, silentAuthSource11, silentAuthSource12, silentAuthSource13, silentAuthSource14, silentAuthSource15, silentAuthSource16, silentAuthSource17, silentAuthSource18, silentAuthSource19, silentAuthSource20, silentAuthSource21};
        $VALUES = silentAuthSourceArr;
        $ENTRIES = new asp(silentAuthSourceArr);
    }

    public SilentAuthSource() {
        throw null;
    }

    public static zrp<SilentAuthSource> h() {
        return $ENTRIES;
    }

    public static SilentAuthSource valueOf(String str) {
        return (SilentAuthSource) Enum.valueOf(SilentAuthSource.class, str);
    }

    public static SilentAuthSource[] values() {
        return (SilentAuthSource[]) $VALUES.clone();
    }
}
