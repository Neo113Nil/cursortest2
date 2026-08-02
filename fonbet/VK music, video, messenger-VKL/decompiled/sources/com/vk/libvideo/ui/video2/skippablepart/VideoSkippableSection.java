package com.vk.libvideo.ui.video2.skippablepart;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoSkippableSection.kt */
/* loaded from: classes3.dex */
public final class VideoSkippableSection {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoSkippableSection[] $VALUES;
    public static final VideoSkippableSection ENDING;
    public static final VideoSkippableSection OPENING;
    public static final VideoSkippableSection UNSKIPPABLE;

    static {
        VideoSkippableSection videoSkippableSection = new VideoSkippableSection("OPENING", 0);
        OPENING = videoSkippableSection;
        VideoSkippableSection videoSkippableSection2 = new VideoSkippableSection("ENDING", 1);
        ENDING = videoSkippableSection2;
        VideoSkippableSection videoSkippableSection3 = new VideoSkippableSection("UNSKIPPABLE", 2);
        UNSKIPPABLE = videoSkippableSection3;
        VideoSkippableSection[] videoSkippableSectionArr = {videoSkippableSection, videoSkippableSection2, videoSkippableSection3};
        $VALUES = videoSkippableSectionArr;
        $ENTRIES = new asp(videoSkippableSectionArr);
    }

    public VideoSkippableSection() {
        throw null;
    }

    public static VideoSkippableSection valueOf(String str) {
        return (VideoSkippableSection) Enum.valueOf(VideoSkippableSection.class, str);
    }

    public static VideoSkippableSection[] values() {
        return (VideoSkippableSection[]) $VALUES.clone();
    }
}
