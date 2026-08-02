package com.vk.video.ui.share.api;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoShareArguments.kt */
/* loaded from: classes7.dex */
public final class ShareItemType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShareItemType[] $VALUES;
    public static final ShareItemType CLIP;
    public static final ShareItemType EPISODE;
    public static final ShareItemType LINK;
    public static final ShareItemType VIDEO;
    public static final ShareItemType VIDEO_PLAYLIST;

    static {
        ShareItemType shareItemType = new ShareItemType(SignalingProtocol.MEDIA_OPTION_VIDEO, 0);
        VIDEO = shareItemType;
        ShareItemType shareItemType2 = new ShareItemType("CLIP", 1);
        CLIP = shareItemType2;
        ShareItemType shareItemType3 = new ShareItemType("VIDEO_PLAYLIST", 2);
        VIDEO_PLAYLIST = shareItemType3;
        ShareItemType shareItemType4 = new ShareItemType("EPISODE", 3);
        EPISODE = shareItemType4;
        ShareItemType shareItemType5 = new ShareItemType("LINK", 4);
        LINK = shareItemType5;
        ShareItemType[] shareItemTypeArr = {shareItemType, shareItemType2, shareItemType3, shareItemType4, shareItemType5};
        $VALUES = shareItemTypeArr;
        $ENTRIES = new asp(shareItemTypeArr);
    }

    public ShareItemType() {
        throw null;
    }

    public static ShareItemType valueOf(String str) {
        return (ShareItemType) Enum.valueOf(ShareItemType.class, str);
    }

    public static ShareItemType[] values() {
        return (ShareItemType[]) $VALUES.clone();
    }
}
