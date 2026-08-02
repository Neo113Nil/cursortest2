package com.vk.media.pipeline.model.stat;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransformSessionStat.kt */
/* loaded from: classes3.dex */
public final class TranscodeType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TranscodeType[] $VALUES;
    public static final TranscodeType ALL;
    public static final TranscodeType AUDIO_ONLY;
    public static final TranscodeType NONE;
    public static final TranscodeType VIDEO_ONLY;
    private final String description;

    static {
        TranscodeType transcodeType = new TranscodeType("ALL", 0, "all");
        ALL = transcodeType;
        TranscodeType transcodeType2 = new TranscodeType("AUDIO_ONLY", 1, "audio_only");
        AUDIO_ONLY = transcodeType2;
        TranscodeType transcodeType3 = new TranscodeType("VIDEO_ONLY", 2, "video_only");
        VIDEO_ONLY = transcodeType3;
        TranscodeType transcodeType4 = new TranscodeType("NONE", 3, "none");
        NONE = transcodeType4;
        TranscodeType[] transcodeTypeArr = {transcodeType, transcodeType2, transcodeType3, transcodeType4};
        $VALUES = transcodeTypeArr;
        $ENTRIES = new asp(transcodeTypeArr);
    }

    public TranscodeType(String str, int i, String str2) {
        this.description = str2;
    }

    public static TranscodeType valueOf(String str) {
        return (TranscodeType) Enum.valueOf(TranscodeType.class, str);
    }

    public static TranscodeType[] values() {
        return (TranscodeType[]) $VALUES.clone();
    }

    public final String getDescription() {
        return this.description;
    }
}
