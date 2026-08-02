package com.vk.voip.ui.onboarding.features;

import com.vk.dto.hints.HintId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FeatureId.kt */
/* loaded from: classes7.dex */
public final class FeatureId {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FeatureId[] $VALUES;
    public static final FeatureId ASR;
    public static final a Companion;
    public static final FeatureId GESTURE_FEEDBACK;
    public static final FeatureId REACTIONS;
    public static final FeatureId VMOJI;
    public static final FeatureId WATCH_TOGETHER;
    private final String key;

    /* compiled from: FeatureId.kt */
    public static final class a {
    }

    static {
        FeatureId featureId = new FeatureId("WATCH_TOGETHER", 0, HintId.VOIP_CALL_FEATURE_ONBOARDING_WATCH_TOGETHER.getId());
        WATCH_TOGETHER = featureId;
        FeatureId featureId2 = new FeatureId("REACTIONS", 1, HintId.VOIP_CALL_FEATURE_ONBOARDING_REACTIONS.getId());
        REACTIONS = featureId2;
        FeatureId featureId3 = new FeatureId("VMOJI", 2, HintId.VOIP_CALL_FEATURE_ONBOARDING_VMOJI.getId());
        VMOJI = featureId3;
        FeatureId featureId4 = new FeatureId("GESTURE_FEEDBACK", 3, HintId.VOIP_CALL_FEATURE_ONBOARDING_GESTURE_REACTIONS.getId());
        GESTURE_FEEDBACK = featureId4;
        FeatureId featureId5 = new FeatureId(SignalingProtocol.KEY_FEATURE_ASR_RECORD, 4, HintId.VOIP_CALL_FEATURE_ONBOARDING_ASR.getId());
        ASR = featureId5;
        FeatureId[] featureIdArr = {featureId, featureId2, featureId3, featureId4, featureId5};
        $VALUES = featureIdArr;
        $ENTRIES = new asp(featureIdArr);
        Companion = new a();
    }

    public FeatureId(String str, int i, String str2) {
        this.key = str2;
    }

    public static FeatureId valueOf(String str) {
        return (FeatureId) Enum.valueOf(FeatureId.class, str);
    }

    public static FeatureId[] values() {
        return (FeatureId[]) $VALUES.clone();
    }

    public final String h() {
        return this.key;
    }
}
