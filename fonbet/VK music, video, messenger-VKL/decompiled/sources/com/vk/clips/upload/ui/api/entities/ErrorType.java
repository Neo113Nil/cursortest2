package com.vk.clips.upload.ui.api.entities;

import com.huawei.hms.hihealth.data.DeviceInfo;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ErrorType.kt */
/* loaded from: classes17.dex */
public final class ErrorType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ErrorType[] $VALUES;
    public static final ErrorType Network;
    public static final ErrorType Unknown;

    static {
        ErrorType errorType = new ErrorType(AndroidInitializeBoldSDK.MSG_NETWORK, 0);
        Network = errorType;
        ErrorType errorType2 = new ErrorType(DeviceInfo.STR_TYPE_UNKNOWN, 1);
        Unknown = errorType2;
        ErrorType[] errorTypeArr = {errorType, errorType2};
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
