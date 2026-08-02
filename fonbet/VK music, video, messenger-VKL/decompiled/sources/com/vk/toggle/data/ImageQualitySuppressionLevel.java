package com.vk.toggle.data;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageQualitySuppressionLevel.kt */
/* loaded from: classes6.dex */
public final class ImageQualitySuppressionLevel {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ImageQualitySuppressionLevel[] $VALUES;
    public static final ImageQualitySuppressionLevel HIGH;
    public static final ImageQualitySuppressionLevel LOW;
    public static final ImageQualitySuppressionLevel MEDIUM;
    public static final ImageQualitySuppressionLevel NONE;
    private final double suppressionCoefficient;

    static {
        ImageQualitySuppressionLevel imageQualitySuppressionLevel = new ImageQualitySuppressionLevel("NONE", 0, -1.0d);
        NONE = imageQualitySuppressionLevel;
        ImageQualitySuppressionLevel imageQualitySuppressionLevel2 = new ImageQualitySuppressionLevel("LOW", 1, 0.8d);
        LOW = imageQualitySuppressionLevel2;
        ImageQualitySuppressionLevel imageQualitySuppressionLevel3 = new ImageQualitySuppressionLevel("MEDIUM", 2, 0.5d);
        MEDIUM = imageQualitySuppressionLevel3;
        ImageQualitySuppressionLevel imageQualitySuppressionLevel4 = new ImageQualitySuppressionLevel("HIGH", 3, 0.3d);
        HIGH = imageQualitySuppressionLevel4;
        ImageQualitySuppressionLevel[] imageQualitySuppressionLevelArr = {imageQualitySuppressionLevel, imageQualitySuppressionLevel2, imageQualitySuppressionLevel3, imageQualitySuppressionLevel4};
        $VALUES = imageQualitySuppressionLevelArr;
        $ENTRIES = new asp(imageQualitySuppressionLevelArr);
    }

    public ImageQualitySuppressionLevel(String str, int i, double d) {
        this.suppressionCoefficient = d;
    }

    public static ImageQualitySuppressionLevel valueOf(String str) {
        return (ImageQualitySuppressionLevel) Enum.valueOf(ImageQualitySuppressionLevel.class, str);
    }

    public static ImageQualitySuppressionLevel[] values() {
        return (ImageQualitySuppressionLevel[]) $VALUES.clone();
    }

    public final double h() {
        return this.suppressionCoefficient;
    }
}
