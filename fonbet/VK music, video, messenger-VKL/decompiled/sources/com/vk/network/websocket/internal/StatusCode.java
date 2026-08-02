package com.vk.network.websocket.internal;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StatusCode.kt */
/* loaded from: classes3.dex */
public final class StatusCode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StatusCode[] $VALUES;
    public static final StatusCode ACCESS_TOKEN_EXPIRED;
    public static final StatusCode AUTHENTICATION_FAILED;
    public static final StatusCode BAD_REQUEST;
    public static final StatusCode CLOSED_ABNORMALLY;
    public static final a Companion;
    public static final StatusCode EXTENSIONS_MISMATCH;
    public static final StatusCode FLOOD_CONTROL;
    public static final StatusCode GOING_AWAY;
    public static final StatusCode HANDSHAKE_FAILURE;
    public static final StatusCode INCONSISTENT_MESSAGE_TYPE;
    public static final StatusCode INVALID_ACCESS_TOKEN;
    public static final StatusCode INVALID_SAT_TOKEN;
    public static final StatusCode NORMAL_CLOSURE;
    public static final StatusCode NO_STATUS_CODE;
    public static final StatusCode PROTOCOL_ERROR;
    public static final StatusCode RESERVED;
    public static final StatusCode SERVER_OVERLOADED;
    public static final StatusCode TOKEN_EXPIRED;
    public static final StatusCode TOO_BIG_MESSAGE;
    public static final StatusCode UNACCEPTABLE_DATA;
    public static final StatusCode UNEXPECTED_CONDITION;
    public static final StatusCode UNKNOWN;
    public static final StatusCode VIOLATED_POLICY;
    private final int code;

    /* compiled from: StatusCode.kt */
    public static final class a {
    }

    static {
        StatusCode statusCode = new StatusCode("NORMAL_CLOSURE", 0, 1000);
        NORMAL_CLOSURE = statusCode;
        StatusCode statusCode2 = new StatusCode("GOING_AWAY", 1, 1001);
        GOING_AWAY = statusCode2;
        StatusCode statusCode3 = new StatusCode("PROTOCOL_ERROR", 2, 1002);
        PROTOCOL_ERROR = statusCode3;
        StatusCode statusCode4 = new StatusCode("UNACCEPTABLE_DATA", 3, 1003);
        UNACCEPTABLE_DATA = statusCode4;
        StatusCode statusCode5 = new StatusCode("RESERVED", 4, 1004);
        RESERVED = statusCode5;
        StatusCode statusCode6 = new StatusCode("NO_STATUS_CODE", 5, 1005);
        NO_STATUS_CODE = statusCode6;
        StatusCode statusCode7 = new StatusCode("CLOSED_ABNORMALLY", 6, 1006);
        CLOSED_ABNORMALLY = statusCode7;
        StatusCode statusCode8 = new StatusCode("INCONSISTENT_MESSAGE_TYPE", 7, 1007);
        INCONSISTENT_MESSAGE_TYPE = statusCode8;
        StatusCode statusCode9 = new StatusCode("VIOLATED_POLICY", 8, 1008);
        VIOLATED_POLICY = statusCode9;
        StatusCode statusCode10 = new StatusCode("TOO_BIG_MESSAGE", 9, 1009);
        TOO_BIG_MESSAGE = statusCode10;
        StatusCode statusCode11 = new StatusCode("EXTENSIONS_MISMATCH", 10, 1010);
        EXTENSIONS_MISMATCH = statusCode11;
        StatusCode statusCode12 = new StatusCode("UNEXPECTED_CONDITION", 11, 1011);
        UNEXPECTED_CONDITION = statusCode12;
        StatusCode statusCode13 = new StatusCode("HANDSHAKE_FAILURE", 12, 1015);
        HANDSHAKE_FAILURE = statusCode13;
        StatusCode statusCode14 = new StatusCode(GrsBaseInfo.CountryCodeSource.UNKNOWN, 13, 0);
        UNKNOWN = statusCode14;
        StatusCode statusCode15 = new StatusCode("BAD_REQUEST", 14, 4000);
        BAD_REQUEST = statusCode15;
        StatusCode statusCode16 = new StatusCode("INVALID_ACCESS_TOKEN", 15, 4001);
        INVALID_ACCESS_TOKEN = statusCode16;
        StatusCode statusCode17 = new StatusCode("FLOOD_CONTROL", 16, 4002);
        FLOOD_CONTROL = statusCode17;
        StatusCode statusCode18 = new StatusCode("AUTHENTICATION_FAILED", 17, 4003);
        AUTHENTICATION_FAILED = statusCode18;
        StatusCode statusCode19 = new StatusCode("SERVER_OVERLOADED", 18, 4004);
        SERVER_OVERLOADED = statusCode19;
        StatusCode statusCode20 = new StatusCode("ACCESS_TOKEN_EXPIRED", 19, 4006);
        ACCESS_TOKEN_EXPIRED = statusCode20;
        StatusCode statusCode21 = new StatusCode("TOKEN_EXPIRED", 20, 4100);
        TOKEN_EXPIRED = statusCode21;
        StatusCode statusCode22 = new StatusCode("INVALID_SAT_TOKEN", 21, 4102);
        INVALID_SAT_TOKEN = statusCode22;
        StatusCode[] statusCodeArr = {statusCode, statusCode2, statusCode3, statusCode4, statusCode5, statusCode6, statusCode7, statusCode8, statusCode9, statusCode10, statusCode11, statusCode12, statusCode13, statusCode14, statusCode15, statusCode16, statusCode17, statusCode18, statusCode19, statusCode20, statusCode21, statusCode22};
        $VALUES = statusCodeArr;
        $ENTRIES = new asp(statusCodeArr);
        Companion = new a();
    }

    public StatusCode(String str, int i, int i2) {
        this.code = i2;
    }

    public static zrp<StatusCode> i() {
        return $ENTRIES;
    }

    public static StatusCode valueOf(String str) {
        return (StatusCode) Enum.valueOf(StatusCode.class, str);
    }

    public static StatusCode[] values() {
        return (StatusCode[]) $VALUES.clone();
    }

    public final int h() {
        return this.code;
    }
}
