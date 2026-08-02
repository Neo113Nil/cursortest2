package com.vk.voip.ui.assessment;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BadAssessmentReason.kt */
/* loaded from: classes7.dex */
public final class BadAssessmentReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BadAssessmentReason[] $VALUES;
    public static final BadAssessmentReason CALL_INTERRUPTION;
    public static final BadAssessmentReason OTHER;
    public static final BadAssessmentReason VIDEO_FREEZES;
    public static final BadAssessmentReason VOICE_COMMUNICATION_PROBLEM;
    private final String statValue;
    private final int stringRes;

    static {
        BadAssessmentReason badAssessmentReason = new BadAssessmentReason("VIDEO_FREEZES", 0, R.string.voip_call_quality_bad_assessment_reason_video_freezes, "VIDEO_FREEZES");
        VIDEO_FREEZES = badAssessmentReason;
        BadAssessmentReason badAssessmentReason2 = new BadAssessmentReason("CALL_INTERRUPTION", 1, R.string.voip_call_quality_bad_assessment_reason_call_interruption, "CALL_INTERRUPTION");
        CALL_INTERRUPTION = badAssessmentReason2;
        BadAssessmentReason badAssessmentReason3 = new BadAssessmentReason("VOICE_COMMUNICATION_PROBLEM", 2, R.string.voip_call_quality_bad_assessment_reason_voice_communication_problem, "VOICE_COMMUNICATION_PROBLEM");
        VOICE_COMMUNICATION_PROBLEM = badAssessmentReason3;
        BadAssessmentReason badAssessmentReason4 = new BadAssessmentReason(NativeAdContent.ViewTag.OTHER, 3, R.string.voip_call_quality_bad_assessment_reason_other, NativeAdContent.ViewTag.OTHER);
        OTHER = badAssessmentReason4;
        BadAssessmentReason[] badAssessmentReasonArr = {badAssessmentReason, badAssessmentReason2, badAssessmentReason3, badAssessmentReason4};
        $VALUES = badAssessmentReasonArr;
        $ENTRIES = new asp(badAssessmentReasonArr);
    }

    public BadAssessmentReason(String str, int i, int i2, String str2) {
        this.stringRes = i2;
        this.statValue = str2;
    }

    public static BadAssessmentReason valueOf(String str) {
        return (BadAssessmentReason) Enum.valueOf(BadAssessmentReason.class, str);
    }

    public static BadAssessmentReason[] values() {
        return (BadAssessmentReason[]) $VALUES.clone();
    }

    public final String h() {
        return this.statValue;
    }

    public final int i() {
        return this.stringRes;
    }
}
