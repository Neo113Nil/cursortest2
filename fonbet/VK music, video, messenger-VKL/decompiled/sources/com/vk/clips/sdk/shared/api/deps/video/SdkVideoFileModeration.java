package com.vk.clips.sdk.shared.api.deps.video;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SdkVideoFileModeration.kt */
/* loaded from: classes17.dex */
public final class SdkVideoFileModeration {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SdkVideoFileModeration[] $VALUES;
    public static final SdkVideoFileModeration APPROVED;
    public static final SdkVideoFileModeration NOT_MODERATED;
    public static final SdkVideoFileModeration PENDING_MODERATION;
    public static final SdkVideoFileModeration REJECTED;
    public static final SdkVideoFileModeration UNDEFINED;

    static {
        SdkVideoFileModeration sdkVideoFileModeration = new SdkVideoFileModeration("UNDEFINED", 0);
        UNDEFINED = sdkVideoFileModeration;
        SdkVideoFileModeration sdkVideoFileModeration2 = new SdkVideoFileModeration("NOT_MODERATED", 1);
        NOT_MODERATED = sdkVideoFileModeration2;
        SdkVideoFileModeration sdkVideoFileModeration3 = new SdkVideoFileModeration("PENDING_MODERATION", 2);
        PENDING_MODERATION = sdkVideoFileModeration3;
        SdkVideoFileModeration sdkVideoFileModeration4 = new SdkVideoFileModeration("REJECTED", 3);
        REJECTED = sdkVideoFileModeration4;
        SdkVideoFileModeration sdkVideoFileModeration5 = new SdkVideoFileModeration("APPROVED", 4);
        APPROVED = sdkVideoFileModeration5;
        SdkVideoFileModeration[] sdkVideoFileModerationArr = {sdkVideoFileModeration, sdkVideoFileModeration2, sdkVideoFileModeration3, sdkVideoFileModeration4, sdkVideoFileModeration5};
        $VALUES = sdkVideoFileModerationArr;
        $ENTRIES = new asp(sdkVideoFileModerationArr);
    }

    public SdkVideoFileModeration() {
        throw null;
    }

    public static SdkVideoFileModeration valueOf(String str) {
        return (SdkVideoFileModeration) Enum.valueOf(SdkVideoFileModeration.class, str);
    }

    public static SdkVideoFileModeration[] values() {
        return (SdkVideoFileModeration[]) $VALUES.clone();
    }
}
