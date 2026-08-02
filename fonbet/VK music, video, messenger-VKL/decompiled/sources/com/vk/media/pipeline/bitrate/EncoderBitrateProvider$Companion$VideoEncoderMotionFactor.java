package com.vk.media.pipeline.bitrate;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EncoderBitrateProvider.kt */
/* loaded from: classes3.dex */
public final class EncoderBitrateProvider$Companion$VideoEncoderMotionFactor {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EncoderBitrateProvider$Companion$VideoEncoderMotionFactor[] $VALUES;
    public static final EncoderBitrateProvider$Companion$VideoEncoderMotionFactor HIGH;
    public static final EncoderBitrateProvider$Companion$VideoEncoderMotionFactor LOW;
    public static final EncoderBitrateProvider$Companion$VideoEncoderMotionFactor MEDIUM;
    private final float value;

    static {
        EncoderBitrateProvider$Companion$VideoEncoderMotionFactor encoderBitrateProvider$Companion$VideoEncoderMotionFactor = new EncoderBitrateProvider$Companion$VideoEncoderMotionFactor("LOW", 0, 0.07f);
        LOW = encoderBitrateProvider$Companion$VideoEncoderMotionFactor;
        EncoderBitrateProvider$Companion$VideoEncoderMotionFactor encoderBitrateProvider$Companion$VideoEncoderMotionFactor2 = new EncoderBitrateProvider$Companion$VideoEncoderMotionFactor("MEDIUM", 1, 0.14f);
        MEDIUM = encoderBitrateProvider$Companion$VideoEncoderMotionFactor2;
        EncoderBitrateProvider$Companion$VideoEncoderMotionFactor encoderBitrateProvider$Companion$VideoEncoderMotionFactor3 = new EncoderBitrateProvider$Companion$VideoEncoderMotionFactor("HIGH", 2, 0.28f);
        HIGH = encoderBitrateProvider$Companion$VideoEncoderMotionFactor3;
        EncoderBitrateProvider$Companion$VideoEncoderMotionFactor[] encoderBitrateProvider$Companion$VideoEncoderMotionFactorArr = {encoderBitrateProvider$Companion$VideoEncoderMotionFactor, encoderBitrateProvider$Companion$VideoEncoderMotionFactor2, encoderBitrateProvider$Companion$VideoEncoderMotionFactor3};
        $VALUES = encoderBitrateProvider$Companion$VideoEncoderMotionFactorArr;
        $ENTRIES = new asp(encoderBitrateProvider$Companion$VideoEncoderMotionFactorArr);
    }

    public EncoderBitrateProvider$Companion$VideoEncoderMotionFactor(String str, int i, float f) {
        this.value = f;
    }

    public static EncoderBitrateProvider$Companion$VideoEncoderMotionFactor valueOf(String str) {
        return (EncoderBitrateProvider$Companion$VideoEncoderMotionFactor) Enum.valueOf(EncoderBitrateProvider$Companion$VideoEncoderMotionFactor.class, str);
    }

    public static EncoderBitrateProvider$Companion$VideoEncoderMotionFactor[] values() {
        return (EncoderBitrateProvider$Companion$VideoEncoderMotionFactor[]) $VALUES.clone();
    }

    public final float h() {
        return this.value;
    }
}
