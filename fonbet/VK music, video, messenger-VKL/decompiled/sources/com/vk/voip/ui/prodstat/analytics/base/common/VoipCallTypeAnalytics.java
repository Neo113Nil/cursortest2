package com.vk.voip.ui.prodstat.analytics.base.common;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VoipCallTypeAnalytics.kt */
/* loaded from: classes7.dex */
public final class VoipCallTypeAnalytics {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VoipCallTypeAnalytics[] $VALUES;
    public static final VoipCallTypeAnalytics CONTACT;
    public static final VoipCallTypeAnalytics GROUP;
    public static final VoipCallTypeAnalytics USER;

    static {
        VoipCallTypeAnalytics voipCallTypeAnalytics = new VoipCallTypeAnalytics("USER", 0);
        USER = voipCallTypeAnalytics;
        VoipCallTypeAnalytics voipCallTypeAnalytics2 = new VoipCallTypeAnalytics("GROUP", 1);
        GROUP = voipCallTypeAnalytics2;
        VoipCallTypeAnalytics voipCallTypeAnalytics3 = new VoipCallTypeAnalytics("CONTACT", 2);
        CONTACT = voipCallTypeAnalytics3;
        VoipCallTypeAnalytics[] voipCallTypeAnalyticsArr = {voipCallTypeAnalytics, voipCallTypeAnalytics2, voipCallTypeAnalytics3};
        $VALUES = voipCallTypeAnalyticsArr;
        $ENTRIES = new asp(voipCallTypeAnalyticsArr);
    }

    public VoipCallTypeAnalytics() {
        throw null;
    }

    public static VoipCallTypeAnalytics valueOf(String str) {
        return (VoipCallTypeAnalytics) Enum.valueOf(VoipCallTypeAnalytics.class, str);
    }

    public static VoipCallTypeAnalytics[] values() {
        return (VoipCallTypeAnalytics[]) $VALUES.clone();
    }
}
