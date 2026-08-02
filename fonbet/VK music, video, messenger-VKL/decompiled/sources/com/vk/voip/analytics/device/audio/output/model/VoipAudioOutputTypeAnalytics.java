package com.vk.voip.analytics.device.audio.output.model;

import com.huawei.hms.hihealth.data.DeviceInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VoipAudioOutputTypeAnalytics.kt */
/* loaded from: classes7.dex */
public final class VoipAudioOutputTypeAnalytics {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VoipAudioOutputTypeAnalytics[] $VALUES;
    public static final VoipAudioOutputTypeAnalytics DYNAMIC;
    public static final VoipAudioOutputTypeAnalytics HEADPHONES;
    public static final VoipAudioOutputTypeAnalytics PHONE;
    private final String device;

    static {
        VoipAudioOutputTypeAnalytics voipAudioOutputTypeAnalytics = new VoipAudioOutputTypeAnalytics("PHONE", 0, DeviceInfo.STR_TYPE_PHONE);
        PHONE = voipAudioOutputTypeAnalytics;
        VoipAudioOutputTypeAnalytics voipAudioOutputTypeAnalytics2 = new VoipAudioOutputTypeAnalytics("DYNAMIC", 1, "Dynamic");
        DYNAMIC = voipAudioOutputTypeAnalytics2;
        VoipAudioOutputTypeAnalytics voipAudioOutputTypeAnalytics3 = new VoipAudioOutputTypeAnalytics("HEADPHONES", 2, "Headphones");
        HEADPHONES = voipAudioOutputTypeAnalytics3;
        VoipAudioOutputTypeAnalytics[] voipAudioOutputTypeAnalyticsArr = {voipAudioOutputTypeAnalytics, voipAudioOutputTypeAnalytics2, voipAudioOutputTypeAnalytics3};
        $VALUES = voipAudioOutputTypeAnalyticsArr;
        $ENTRIES = new asp(voipAudioOutputTypeAnalyticsArr);
    }

    public VoipAudioOutputTypeAnalytics(String str, int i, String str2) {
        this.device = str2;
    }

    public static VoipAudioOutputTypeAnalytics valueOf(String str) {
        return (VoipAudioOutputTypeAnalytics) Enum.valueOf(VoipAudioOutputTypeAnalytics.class, str);
    }

    public static VoipAudioOutputTypeAnalytics[] values() {
        return (VoipAudioOutputTypeAnalytics[]) $VALUES.clone();
    }

    public final String h() {
        return this.device;
    }
}
