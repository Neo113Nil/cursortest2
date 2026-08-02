package com.vk.dto.stories.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoryUploadType.kt */
/* loaded from: classes18.dex */
public final class StoryUploadType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoryUploadType[] $VALUES;
    public static final StoryUploadType PUBLISH_NOW;
    public static final StoryUploadType PUBLISH_TO_DIALOG;
    public static final StoryUploadType PUBLISH_WITH_RECEIVERS;

    static {
        StoryUploadType storyUploadType = new StoryUploadType("PUBLISH_WITH_RECEIVERS", 0);
        PUBLISH_WITH_RECEIVERS = storyUploadType;
        StoryUploadType storyUploadType2 = new StoryUploadType("PUBLISH_NOW", 1);
        PUBLISH_NOW = storyUploadType2;
        StoryUploadType storyUploadType3 = new StoryUploadType("PUBLISH_TO_DIALOG", 2);
        PUBLISH_TO_DIALOG = storyUploadType3;
        StoryUploadType[] storyUploadTypeArr = {storyUploadType, storyUploadType2, storyUploadType3};
        $VALUES = storyUploadTypeArr;
        $ENTRIES = new asp(storyUploadTypeArr);
    }

    public StoryUploadType() {
        throw null;
    }

    public static StoryUploadType valueOf(String str) {
        return (StoryUploadType) Enum.valueOf(StoryUploadType.class, str);
    }

    public static StoryUploadType[] values() {
        return (StoryUploadType[]) $VALUES.clone();
    }
}
