package io.agora.rtc2.video;

/* loaded from: classes3.dex */
public class ColorEnhanceOptions {
    public float skinProtectLevel;
    public float strengthLevel;

    public ColorEnhanceOptions() {
        this.strengthLevel = 0.5f;
        this.skinProtectLevel = 1.0f;
    }

    public ColorEnhanceOptions(float f10, float f11) {
        this.strengthLevel = f10;
        this.skinProtectLevel = f11;
    }
}
