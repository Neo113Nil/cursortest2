package com.vk.reefton.dto;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReefContentType.kt */
/* loaded from: classes5.dex */
public final class ReefContentType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ReefContentType[] $VALUES;
    public static final ReefContentType CLIP;
    public static final ReefContentType GIF;
    public static final ReefContentType LIVE;
    public static final ReefContentType STORY;
    public static final ReefContentType UNDEFINED;
    public static final ReefContentType VIDEO;

    static {
        ReefContentType reefContentType = new ReefContentType("UNDEFINED", 0);
        UNDEFINED = reefContentType;
        ReefContentType reefContentType2 = new ReefContentType(SignalingProtocol.MEDIA_OPTION_VIDEO, 1);
        VIDEO = reefContentType2;
        ReefContentType reefContentType3 = new ReefContentType("GIF", 2);
        GIF = reefContentType3;
        ReefContentType reefContentType4 = new ReefContentType("LIVE", 3);
        LIVE = reefContentType4;
        ReefContentType reefContentType5 = new ReefContentType("CLIP", 4);
        CLIP = reefContentType5;
        ReefContentType reefContentType6 = new ReefContentType("STORY", 5);
        STORY = reefContentType6;
        ReefContentType[] reefContentTypeArr = {reefContentType, reefContentType2, reefContentType3, reefContentType4, reefContentType5, reefContentType6};
        $VALUES = reefContentTypeArr;
        $ENTRIES = new asp(reefContentTypeArr);
    }

    public ReefContentType() {
        throw null;
    }

    public static ReefContentType valueOf(String str) {
        return (ReefContentType) Enum.valueOf(ReefContentType.class, str);
    }

    public static ReefContentType[] values() {
        return (ReefContentType[]) $VALUES.clone();
    }
}
