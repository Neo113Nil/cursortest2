package com.vk.dto.common.filter;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FilterStrategy.kt */
/* loaded from: classes18.dex */
public final class ImageQuality {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ImageQuality[] $VALUES;
    public static final ImageQuality BEST;
    public static final ImageQuality FIT;
    public static final ImageQuality TRAFFIC_BEST;
    public static final ImageQuality TRAFFIC_FIT;
    public static final ImageQuality WORST;

    static {
        ImageQuality imageQuality = new ImageQuality("BEST", 0);
        BEST = imageQuality;
        ImageQuality imageQuality2 = new ImageQuality("FIT", 1);
        FIT = imageQuality2;
        ImageQuality imageQuality3 = new ImageQuality("WORST", 2);
        WORST = imageQuality3;
        ImageQuality imageQuality4 = new ImageQuality("TRAFFIC_FIT", 3);
        TRAFFIC_FIT = imageQuality4;
        ImageQuality imageQuality5 = new ImageQuality("TRAFFIC_BEST", 4);
        TRAFFIC_BEST = imageQuality5;
        ImageQuality[] imageQualityArr = {imageQuality, imageQuality2, imageQuality3, imageQuality4, imageQuality5};
        $VALUES = imageQualityArr;
        $ENTRIES = new asp(imageQualityArr);
    }

    public ImageQuality() {
        throw null;
    }

    public static ImageQuality valueOf(String str) {
        return (ImageQuality) Enum.valueOf(ImageQuality.class, str);
    }

    public static ImageQuality[] values() {
        return (ImageQuality[]) $VALUES.clone();
    }
}
