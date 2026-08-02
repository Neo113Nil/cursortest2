package com.vk.libvideo.api;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExtendedDownloadState.kt */
/* loaded from: classes2.dex */
public final class ExtendedDownloadState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ExtendedDownloadState[] $VALUES;
    public static final ExtendedDownloadState COMPLETED;
    public static final ExtendedDownloadState DOWNLOADING;
    public static final ExtendedDownloadState FAILED;
    public static final ExtendedDownloadState PAUSED;
    public static final ExtendedDownloadState QUEUED;
    public static final ExtendedDownloadState REMOVING;
    public static final ExtendedDownloadState WAITING_NETWORK;
    public static final ExtendedDownloadState WAITING_WIFI;

    static {
        ExtendedDownloadState extendedDownloadState = new ExtendedDownloadState("QUEUED", 0);
        QUEUED = extendedDownloadState;
        ExtendedDownloadState extendedDownloadState2 = new ExtendedDownloadState("WAITING_WIFI", 1);
        WAITING_WIFI = extendedDownloadState2;
        ExtendedDownloadState extendedDownloadState3 = new ExtendedDownloadState("WAITING_NETWORK", 2);
        WAITING_NETWORK = extendedDownloadState3;
        ExtendedDownloadState extendedDownloadState4 = new ExtendedDownloadState("DOWNLOADING", 3);
        DOWNLOADING = extendedDownloadState4;
        ExtendedDownloadState extendedDownloadState5 = new ExtendedDownloadState("COMPLETED", 4);
        COMPLETED = extendedDownloadState5;
        ExtendedDownloadState extendedDownloadState6 = new ExtendedDownloadState(SignalingProtocol.HUNGUP_REASON_FAILED, 5);
        FAILED = extendedDownloadState6;
        ExtendedDownloadState extendedDownloadState7 = new ExtendedDownloadState("REMOVING", 6);
        REMOVING = extendedDownloadState7;
        ExtendedDownloadState extendedDownloadState8 = new ExtendedDownloadState("PAUSED", 7);
        PAUSED = extendedDownloadState8;
        ExtendedDownloadState[] extendedDownloadStateArr = {extendedDownloadState, extendedDownloadState2, extendedDownloadState3, extendedDownloadState4, extendedDownloadState5, extendedDownloadState6, extendedDownloadState7, extendedDownloadState8};
        $VALUES = extendedDownloadStateArr;
        $ENTRIES = new asp(extendedDownloadStateArr);
    }

    public ExtendedDownloadState() {
        throw null;
    }

    public static ExtendedDownloadState valueOf(String str) {
        return (ExtendedDownloadState) Enum.valueOf(ExtendedDownloadState.class, str);
    }

    public static ExtendedDownloadState[] values() {
        return (ExtendedDownloadState[]) $VALUES.clone();
    }
}
