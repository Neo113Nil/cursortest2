package com.vk.profile.community.impl.livecover;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LiveCoverType.kt */
/* loaded from: classes5.dex */
public final class LiveCoverType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LiveCoverType[] $VALUES;
    public static final LiveCoverType PHOTO;
    public static final LiveCoverType VIDEO;
    public static final LiveCoverType VIDEO_PREVIEW;

    static {
        LiveCoverType liveCoverType = new LiveCoverType("PHOTO", 0);
        PHOTO = liveCoverType;
        LiveCoverType liveCoverType2 = new LiveCoverType(SignalingProtocol.MEDIA_OPTION_VIDEO, 1);
        VIDEO = liveCoverType2;
        LiveCoverType liveCoverType3 = new LiveCoverType("VIDEO_PREVIEW", 2);
        VIDEO_PREVIEW = liveCoverType3;
        LiveCoverType[] liveCoverTypeArr = {liveCoverType, liveCoverType2, liveCoverType3};
        $VALUES = liveCoverTypeArr;
        $ENTRIES = new asp(liveCoverTypeArr);
    }

    public LiveCoverType() {
        throw null;
    }

    public static LiveCoverType valueOf(String str) {
        return (LiveCoverType) Enum.valueOf(LiveCoverType.class, str);
    }

    public static LiveCoverType[] values() {
        return (LiveCoverType[]) $VALUES.clone();
    }
}
