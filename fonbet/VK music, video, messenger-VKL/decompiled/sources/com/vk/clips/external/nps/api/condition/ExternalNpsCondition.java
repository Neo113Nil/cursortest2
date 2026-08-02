package com.vk.clips.external.nps.api.condition;

import com.vk.core.apps.BuildInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExternalNpsCondition.kt */
/* loaded from: classes16.dex */
public final class ExternalNpsCondition {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ExternalNpsCondition[] $VALUES;
    public static final ExternalNpsCondition CLIP_COMMENTED;
    public static final ExternalNpsCondition CLIP_CREATE;
    public static final ExternalNpsCondition CLIP_CREATE_AUDIO_ATTACHMENT;
    public static final ExternalNpsCondition CLIP_DOWNLOADED;
    public static final ExternalNpsCondition CLIP_LIKED;
    public static final ExternalNpsCondition CLIP_SHARED;
    public static final ExternalNpsCondition CLIP_STARTED;
    private final String key;
    private final String npsValue;

    static {
        ExternalNpsCondition externalNpsCondition = new ExternalNpsCondition("CLIP_STARTED", 0, "condition_clip_started", BuildInfo.s() ? "clips_view" : "sa_clips_view");
        CLIP_STARTED = externalNpsCondition;
        ExternalNpsCondition externalNpsCondition2 = new ExternalNpsCondition("CLIP_LIKED", 1, "condition_clip_liked", BuildInfo.s() ? "clips_action" : "sa_clips_action");
        CLIP_LIKED = externalNpsCondition2;
        ExternalNpsCondition externalNpsCondition3 = new ExternalNpsCondition("CLIP_SHARED", 2, "condition_clip_shared", BuildInfo.s() ? "clips_action" : "sa_clips_action");
        CLIP_SHARED = externalNpsCondition3;
        ExternalNpsCondition externalNpsCondition4 = new ExternalNpsCondition("CLIP_COMMENTED", 3, "condition_clip_commented", BuildInfo.s() ? "clips_action" : "sa_clips_action");
        CLIP_COMMENTED = externalNpsCondition4;
        ExternalNpsCondition externalNpsCondition5 = new ExternalNpsCondition("CLIP_DOWNLOADED", 4, "condition_clip_download", BuildInfo.s() ? "clips_download" : "sa_clips_download");
        CLIP_DOWNLOADED = externalNpsCondition5;
        ExternalNpsCondition externalNpsCondition6 = new ExternalNpsCondition("CLIP_CREATE", 5, "condition_clips_create", BuildInfo.s() ? "clips_create" : "sa_clips_create");
        CLIP_CREATE = externalNpsCondition6;
        ExternalNpsCondition externalNpsCondition7 = new ExternalNpsCondition("CLIP_CREATE_AUDIO_ATTACHMENT", 6, "condition_clips_create_audio_attachment", BuildInfo.s() ? "clips_create_audio_attachment" : "sa_clips_create_audio_attachment");
        CLIP_CREATE_AUDIO_ATTACHMENT = externalNpsCondition7;
        ExternalNpsCondition[] externalNpsConditionArr = {externalNpsCondition, externalNpsCondition2, externalNpsCondition3, externalNpsCondition4, externalNpsCondition5, externalNpsCondition6, externalNpsCondition7};
        $VALUES = externalNpsConditionArr;
        $ENTRIES = new asp(externalNpsConditionArr);
    }

    public ExternalNpsCondition(String str, int i, String str2, String str3) {
        this.key = str2;
        this.npsValue = str3;
    }

    public static ExternalNpsCondition valueOf(String str) {
        return (ExternalNpsCondition) Enum.valueOf(ExternalNpsCondition.class, str);
    }

    public static ExternalNpsCondition[] values() {
        return (ExternalNpsCondition[]) $VALUES.clone();
    }

    public final String h() {
        return this.npsValue;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "condition: " + this.key + ", nps value: " + this.npsValue;
    }
}
