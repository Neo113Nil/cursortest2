package com.vk.music.player.error;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ErrorType.kt */
/* loaded from: classes3.dex */
public final class ErrorType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ErrorType[] $VALUES;
    public static final ErrorType offline_keys_missing;
    public static final ErrorType source_error;
    public static final ErrorType timeout;
    public static final ErrorType unknown;
    public static final ErrorType unsupported;

    static {
        ErrorType errorType = new ErrorType("timeout", 0);
        timeout = errorType;
        ErrorType errorType2 = new ErrorType("unsupported", 1);
        unsupported = errorType2;
        ErrorType errorType3 = new ErrorType("offline_keys_missing", 2);
        offline_keys_missing = errorType3;
        ErrorType errorType4 = new ErrorType("source_error", 3);
        source_error = errorType4;
        ErrorType errorType5 = new ErrorType("unknown", 4);
        unknown = errorType5;
        ErrorType[] errorTypeArr = {errorType, errorType2, errorType3, errorType4, errorType5};
        $VALUES = errorTypeArr;
        $ENTRIES = new asp(errorTypeArr);
    }

    public ErrorType() {
        throw null;
    }

    public static ErrorType valueOf(String str) {
        return (ErrorType) Enum.valueOf(ErrorType.class, str);
    }

    public static ErrorType[] values() {
        return (ErrorType[]) $VALUES.clone();
    }
}
