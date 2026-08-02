package com.vk.clips.sdk.drafts.api;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsDraftDirType.kt */
/* loaded from: classes17.dex */
public final class ClipsDraftDirType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsDraftDirType[] $VALUES;
    public static final ClipsDraftDirType AUDIO;
    public static final ClipsDraftDirType PREVIEW;
    public static final ClipsDraftDirType VIDEO;

    static {
        ClipsDraftDirType clipsDraftDirType = new ClipsDraftDirType("PREVIEW", 0);
        PREVIEW = clipsDraftDirType;
        ClipsDraftDirType clipsDraftDirType2 = new ClipsDraftDirType(SignalingProtocol.MEDIA_OPTION_AUDIO, 1);
        AUDIO = clipsDraftDirType2;
        ClipsDraftDirType clipsDraftDirType3 = new ClipsDraftDirType(SignalingProtocol.MEDIA_OPTION_VIDEO, 2);
        VIDEO = clipsDraftDirType3;
        ClipsDraftDirType[] clipsDraftDirTypeArr = {clipsDraftDirType, clipsDraftDirType2, clipsDraftDirType3};
        $VALUES = clipsDraftDirTypeArr;
        $ENTRIES = new asp(clipsDraftDirTypeArr);
    }

    public ClipsDraftDirType() {
        throw null;
    }

    public static ClipsDraftDirType valueOf(String str) {
        return (ClipsDraftDirType) Enum.valueOf(ClipsDraftDirType.class, str);
    }

    public static ClipsDraftDirType[] values() {
        return (ClipsDraftDirType[]) $VALUES.clone();
    }
}
