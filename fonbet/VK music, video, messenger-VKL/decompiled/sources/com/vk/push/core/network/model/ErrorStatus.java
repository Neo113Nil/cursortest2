package com.vk.push.core.network.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ErrorStatus.kt */
/* loaded from: classes5.dex */
public final class ErrorStatus {
    private static final /* synthetic */ ErrorStatus[] $VALUES;
    public static final ErrorStatus INTERNAL;
    public static final ErrorStatus INVALID_ARGUMENT;
    public static final ErrorStatus NOT_FOUND;
    public static final ErrorStatus PERMISSION_DENIED;
    public static final ErrorStatus QUOTA_EXCEEDED;
    public static final ErrorStatus SENDER_ID_MISMATCH;
    public static final ErrorStatus THIRD_PARTY_AUTH_ERROR;
    public static final ErrorStatus UNAVAILABLE;
    public static final ErrorStatus UNREGISTERED;
    public static final ErrorStatus UNSPECIFIED_ERROR;

    static {
        ErrorStatus errorStatus = new ErrorStatus("UNSPECIFIED_ERROR", 0);
        UNSPECIFIED_ERROR = errorStatus;
        ErrorStatus errorStatus2 = new ErrorStatus("INVALID_ARGUMENT", 1);
        INVALID_ARGUMENT = errorStatus2;
        ErrorStatus errorStatus3 = new ErrorStatus("UNREGISTERED", 2);
        UNREGISTERED = errorStatus3;
        ErrorStatus errorStatus4 = new ErrorStatus("SENDER_ID_MISMATCH", 3);
        SENDER_ID_MISMATCH = errorStatus4;
        ErrorStatus errorStatus5 = new ErrorStatus("QUOTA_EXCEEDED", 4);
        QUOTA_EXCEEDED = errorStatus5;
        ErrorStatus errorStatus6 = new ErrorStatus("UNAVAILABLE", 5);
        UNAVAILABLE = errorStatus6;
        ErrorStatus errorStatus7 = new ErrorStatus("INTERNAL", 6);
        INTERNAL = errorStatus7;
        ErrorStatus errorStatus8 = new ErrorStatus("THIRD_PARTY_AUTH_ERROR", 7);
        THIRD_PARTY_AUTH_ERROR = errorStatus8;
        ErrorStatus errorStatus9 = new ErrorStatus("PERMISSION_DENIED", 8);
        PERMISSION_DENIED = errorStatus9;
        ErrorStatus errorStatus10 = new ErrorStatus("NOT_FOUND", 9);
        NOT_FOUND = errorStatus10;
        $VALUES = new ErrorStatus[]{errorStatus, errorStatus2, errorStatus3, errorStatus4, errorStatus5, errorStatus6, errorStatus7, errorStatus8, errorStatus9, errorStatus10};
    }

    public ErrorStatus() {
        throw null;
    }

    public static ErrorStatus valueOf(String str) {
        return (ErrorStatus) Enum.valueOf(ErrorStatus.class, str);
    }

    public static ErrorStatus[] values() {
        return (ErrorStatus[]) $VALUES.clone();
    }
}
