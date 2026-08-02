package com.unity3d.ads.adplayer.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ErrorReason.kt */
/* loaded from: classes14.dex */
public final class ErrorReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ErrorReason[] $VALUES;
    private final int code;
    public static final ErrorReason REASON_UNKNOWN = new ErrorReason("REASON_UNKNOWN", 0, 0);
    public static final ErrorReason REASON_WEB_BLANK = new ErrorReason("REASON_WEB_BLANK", 1, 1);
    public static final ErrorReason REASON_WEB_ERROR_UNKNOWN = new ErrorReason("REASON_WEB_ERROR_UNKNOWN", 2, 2);
    public static final ErrorReason REASON_WEB_ERROR_HOST_LOOKUP = new ErrorReason("REASON_WEB_ERROR_HOST_LOOKUP", 3, 3);
    public static final ErrorReason REASON_WEB_ERROR_UNSUPPORTED_AUTH_SCHEME = new ErrorReason("REASON_WEB_ERROR_UNSUPPORTED_AUTH_SCHEME", 4, 4);
    public static final ErrorReason REASON_WEB_ERROR_AUTHENTICATION = new ErrorReason("REASON_WEB_ERROR_AUTHENTICATION", 5, 5);
    public static final ErrorReason REASON_WEB_ERROR_PROXY_AUTHENTICATION = new ErrorReason("REASON_WEB_ERROR_PROXY_AUTHENTICATION", 6, 6);
    public static final ErrorReason REASON_WEB_ERROR_CONNECT = new ErrorReason("REASON_WEB_ERROR_CONNECT", 7, 7);
    public static final ErrorReason REASON_WEB_ERROR_IO = new ErrorReason("REASON_WEB_ERROR_IO", 8, 8);
    public static final ErrorReason REASON_WEB_ERROR_TIMEOUT = new ErrorReason("REASON_WEB_ERROR_TIMEOUT", 9, 9);
    public static final ErrorReason REASON_WEB_ERROR_REDIRECT_LOOP = new ErrorReason("REASON_WEB_ERROR_REDIRECT_LOOP", 10, 10);
    public static final ErrorReason REASON_WEB_ERROR_UNSUPPORTED_SCHEME = new ErrorReason("REASON_WEB_ERROR_UNSUPPORTED_SCHEME", 11, 11);
    public static final ErrorReason REASON_WEB_ERROR_FAILED_SSL_HANDSHAKE = new ErrorReason("REASON_WEB_ERROR_FAILED_SSL_HANDSHAKE", 12, 12);
    public static final ErrorReason REASON_WEB_ERROR_BAD_URL = new ErrorReason("REASON_WEB_ERROR_BAD_URL", 13, 13);
    public static final ErrorReason REASON_WEB_ERROR_FILE = new ErrorReason("REASON_WEB_ERROR_FILE", 14, 14);
    public static final ErrorReason REASON_WEB_ERROR_FILE_NOT_FOUND = new ErrorReason("REASON_WEB_ERROR_FILE_NOT_FOUND", 15, 15);
    public static final ErrorReason REASON_WEB_ERROR_TOO_MANY_REQUESTS = new ErrorReason("REASON_WEB_ERROR_TOO_MANY_REQUESTS", 16, 16);
    public static final ErrorReason REASON_WEB_ERROR_UNSAFE_RESOURCE = new ErrorReason("REASON_WEB_ERROR_UNSAFE_RESOURCE", 17, 17);
    public static final ErrorReason REASON_WEB_ERROR_RECEIVED_HTTP = new ErrorReason("REASON_WEB_ERROR_RECEIVED_HTTP", 18, 18);
    public static final ErrorReason REASON_WEBVIEW_RENDER_PROCESS_GONE = new ErrorReason("REASON_WEBVIEW_RENDER_PROCESS_GONE", 19, 19);

    private static final /* synthetic */ ErrorReason[] $values() {
        return new ErrorReason[]{REASON_UNKNOWN, REASON_WEB_BLANK, REASON_WEB_ERROR_UNKNOWN, REASON_WEB_ERROR_HOST_LOOKUP, REASON_WEB_ERROR_UNSUPPORTED_AUTH_SCHEME, REASON_WEB_ERROR_AUTHENTICATION, REASON_WEB_ERROR_PROXY_AUTHENTICATION, REASON_WEB_ERROR_CONNECT, REASON_WEB_ERROR_IO, REASON_WEB_ERROR_TIMEOUT, REASON_WEB_ERROR_REDIRECT_LOOP, REASON_WEB_ERROR_UNSUPPORTED_SCHEME, REASON_WEB_ERROR_FAILED_SSL_HANDSHAKE, REASON_WEB_ERROR_BAD_URL, REASON_WEB_ERROR_FILE, REASON_WEB_ERROR_FILE_NOT_FOUND, REASON_WEB_ERROR_TOO_MANY_REQUESTS, REASON_WEB_ERROR_UNSAFE_RESOURCE, REASON_WEB_ERROR_RECEIVED_HTTP, REASON_WEBVIEW_RENDER_PROCESS_GONE};
    }

    static {
        ErrorReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private ErrorReason(String str, int i, int i2) {
        this.code = i2;
    }

    public static zrp<ErrorReason> getEntries() {
        return $ENTRIES;
    }

    public static ErrorReason valueOf(String str) {
        return (ErrorReason) Enum.valueOf(ErrorReason.class, str);
    }

    public static ErrorReason[] values() {
        return (ErrorReason[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
