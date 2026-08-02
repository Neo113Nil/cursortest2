package com.vk.clips.sdk.shared.api.nps.api.condition;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SdkExternalNpsCondition.kt */
/* loaded from: classes17.dex */
public final class SdkExternalNpsCondition {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SdkExternalNpsCondition[] $VALUES;
    public static final SdkExternalNpsCondition CLIP_COMMENTED;
    public static final SdkExternalNpsCondition CLIP_CREATE;
    public static final SdkExternalNpsCondition CLIP_CREATE_AUDIO_ATTACHMENT;
    public static final SdkExternalNpsCondition CLIP_DOWNLOADED;
    public static final SdkExternalNpsCondition CLIP_LIKED;
    public static final SdkExternalNpsCondition CLIP_SHARED;
    public static final SdkExternalNpsCondition CLIP_STARTED;
    private final String key;
    private final String npsValue;

    static {
        SdkExternalNpsCondition sdkExternalNpsCondition = new SdkExternalNpsCondition("CLIP_STARTED", 0, "condition_clip_started", "clips_view");
        CLIP_STARTED = sdkExternalNpsCondition;
        SdkExternalNpsCondition sdkExternalNpsCondition2 = new SdkExternalNpsCondition("CLIP_LIKED", 1, "condition_clip_liked", "clips_action");
        CLIP_LIKED = sdkExternalNpsCondition2;
        SdkExternalNpsCondition sdkExternalNpsCondition3 = new SdkExternalNpsCondition("CLIP_SHARED", 2, "condition_clip_shared", "clips_action");
        CLIP_SHARED = sdkExternalNpsCondition3;
        SdkExternalNpsCondition sdkExternalNpsCondition4 = new SdkExternalNpsCondition("CLIP_COMMENTED", 3, "condition_clip_commented", "clips_action");
        CLIP_COMMENTED = sdkExternalNpsCondition4;
        SdkExternalNpsCondition sdkExternalNpsCondition5 = new SdkExternalNpsCondition("CLIP_DOWNLOADED", 4, "condition_clip_download", "clips_download");
        CLIP_DOWNLOADED = sdkExternalNpsCondition5;
        SdkExternalNpsCondition sdkExternalNpsCondition6 = new SdkExternalNpsCondition("CLIP_CREATE", 5, "condition_clips_create", "clips_create");
        CLIP_CREATE = sdkExternalNpsCondition6;
        SdkExternalNpsCondition sdkExternalNpsCondition7 = new SdkExternalNpsCondition("CLIP_CREATE_AUDIO_ATTACHMENT", 6, "condition_clips_create_audio_attachment", "clips_create_audio_attachment");
        CLIP_CREATE_AUDIO_ATTACHMENT = sdkExternalNpsCondition7;
        SdkExternalNpsCondition[] sdkExternalNpsConditionArr = {sdkExternalNpsCondition, sdkExternalNpsCondition2, sdkExternalNpsCondition3, sdkExternalNpsCondition4, sdkExternalNpsCondition5, sdkExternalNpsCondition6, sdkExternalNpsCondition7};
        $VALUES = sdkExternalNpsConditionArr;
        $ENTRIES = new asp(sdkExternalNpsConditionArr);
    }

    public SdkExternalNpsCondition(String str, int i, String str2, String str3) {
        this.key = str2;
        this.npsValue = str3;
    }

    public static SdkExternalNpsCondition valueOf(String str) {
        return (SdkExternalNpsCondition) Enum.valueOf(SdkExternalNpsCondition.class, str);
    }

    public static SdkExternalNpsCondition[] values() {
        return (SdkExternalNpsCondition[]) $VALUES.clone();
    }

    public final String h() {
        return this.key;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "condition: " + this.key + ", nps value: " + this.npsValue;
    }
}
