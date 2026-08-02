package com.vk.clips.sdk.facade.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MyTargetVideoPlaybackErrorType.kt */
/* loaded from: classes17.dex */
public final class MyTargetVideoPlaybackErrorType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MyTargetVideoPlaybackErrorType[] $VALUES;
    public static final MyTargetVideoPlaybackErrorType TIMEOUT;
    public static final MyTargetVideoPlaybackErrorType UNKNOWN_ERROR;

    static {
        MyTargetVideoPlaybackErrorType myTargetVideoPlaybackErrorType = new MyTargetVideoPlaybackErrorType("TIMEOUT", 0);
        TIMEOUT = myTargetVideoPlaybackErrorType;
        MyTargetVideoPlaybackErrorType myTargetVideoPlaybackErrorType2 = new MyTargetVideoPlaybackErrorType("UNKNOWN_ERROR", 1);
        UNKNOWN_ERROR = myTargetVideoPlaybackErrorType2;
        MyTargetVideoPlaybackErrorType[] myTargetVideoPlaybackErrorTypeArr = {myTargetVideoPlaybackErrorType, myTargetVideoPlaybackErrorType2};
        $VALUES = myTargetVideoPlaybackErrorTypeArr;
        $ENTRIES = new asp(myTargetVideoPlaybackErrorTypeArr);
    }

    public MyTargetVideoPlaybackErrorType() {
        throw null;
    }

    public static MyTargetVideoPlaybackErrorType valueOf(String str) {
        return (MyTargetVideoPlaybackErrorType) Enum.valueOf(MyTargetVideoPlaybackErrorType.class, str);
    }

    public static MyTargetVideoPlaybackErrorType[] values() {
        return (MyTargetVideoPlaybackErrorType[]) $VALUES.clone();
    }
}
