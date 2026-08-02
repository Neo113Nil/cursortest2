package com.vk.libvideo.live.api.base;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RecorderStatus.kt */
/* loaded from: classes3.dex */
public final class RecorderStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RecorderStatus[] $VALUES;
    public static final RecorderStatus RECORDER_INFO_STREAMING_CONNECTED;
    public static final RecorderStatus RECORDER_INFO_STREAMING_DISCONNECTED;

    static {
        RecorderStatus recorderStatus = new RecorderStatus("RECORDER_INFO_STREAMING_CONNECTED", 0);
        RECORDER_INFO_STREAMING_CONNECTED = recorderStatus;
        RecorderStatus recorderStatus2 = new RecorderStatus("RECORDER_INFO_STREAMING_DISCONNECTED", 1);
        RECORDER_INFO_STREAMING_DISCONNECTED = recorderStatus2;
        RecorderStatus[] recorderStatusArr = {recorderStatus, recorderStatus2};
        $VALUES = recorderStatusArr;
        $ENTRIES = new asp(recorderStatusArr);
    }

    public RecorderStatus() {
        throw null;
    }

    public static RecorderStatus valueOf(String str) {
        return (RecorderStatus) Enum.valueOf(RecorderStatus.class, str);
    }

    public static RecorderStatus[] values() {
        return (RecorderStatus[]) $VALUES.clone();
    }
}
