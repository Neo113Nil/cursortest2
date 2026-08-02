package com.vk.voip.call_effects.beauty;

import com.unity3d.services.UnityAdsConstants;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeautyFilterIntensity.kt */
/* loaded from: classes11.dex */
public final class BeautyFilterIntensity {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BeautyFilterIntensity[] $VALUES;
    public static final BeautyFilterIntensity DISABLED;
    public static final BeautyFilterIntensity HIGH;
    public static final BeautyFilterIntensity LOW;
    public static final BeautyFilterIntensity MEDIUM;
    private final int id;
    private final float intensityValue;
    private final int orderIndex;

    static {
        BeautyFilterIntensity beautyFilterIntensity = new BeautyFilterIntensity(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, 0, "DISABLED");
        DISABLED = beautyFilterIntensity;
        BeautyFilterIntensity beautyFilterIntensity2 = new BeautyFilterIntensity(0.3f, 1, 1, 1, "LOW");
        LOW = beautyFilterIntensity2;
        BeautyFilterIntensity beautyFilterIntensity3 = new BeautyFilterIntensity(0.7f, 2, 2, 2, "MEDIUM");
        MEDIUM = beautyFilterIntensity3;
        BeautyFilterIntensity beautyFilterIntensity4 = new BeautyFilterIntensity(1.0f, 3, 3, 3, "HIGH");
        HIGH = beautyFilterIntensity4;
        BeautyFilterIntensity[] beautyFilterIntensityArr = {beautyFilterIntensity, beautyFilterIntensity2, beautyFilterIntensity3, beautyFilterIntensity4};
        $VALUES = beautyFilterIntensityArr;
        $ENTRIES = new asp(beautyFilterIntensityArr);
    }

    public BeautyFilterIntensity(float f, int i, int i2, int i3, String str) {
        this.intensityValue = f;
        this.id = i2;
        this.orderIndex = i3;
    }

    public static BeautyFilterIntensity valueOf(String str) {
        return (BeautyFilterIntensity) Enum.valueOf(BeautyFilterIntensity.class, str);
    }

    public static BeautyFilterIntensity[] values() {
        return (BeautyFilterIntensity[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }

    public final float i() {
        return this.intensityValue;
    }

    public final int j() {
        return this.orderIndex;
    }
}
