package com.vk.story.viewer.api.models;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoryReporter.kt */
/* loaded from: classes6.dex */
public final class AttachType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AttachType[] $VALUES;
    public static final AttachType PHOTO;
    public static final AttachType STORY;
    public static final AttachType VIDEO;

    static {
        AttachType attachType = new AttachType("PHOTO", 0);
        PHOTO = attachType;
        AttachType attachType2 = new AttachType(SignalingProtocol.MEDIA_OPTION_VIDEO, 1);
        VIDEO = attachType2;
        AttachType attachType3 = new AttachType("STORY", 2);
        STORY = attachType3;
        AttachType[] attachTypeArr = {attachType, attachType2, attachType3};
        $VALUES = attachTypeArr;
        $ENTRIES = new asp(attachTypeArr);
    }

    public AttachType() {
        throw null;
    }

    public static AttachType valueOf(String str) {
        return (AttachType) Enum.valueOf(AttachType.class, str);
    }

    public static AttachType[] values() {
        return (AttachType[]) $VALUES.clone();
    }
}
