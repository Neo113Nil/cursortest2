package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkPictureDefault.kt */
/* loaded from: classes17.dex */
public final class PictureRadius {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PictureRadius[] $VALUES;
    public static final PictureRadius Large;
    public static final PictureRadius Medium;
    public static final PictureRadius Small;

    static {
        PictureRadius pictureRadius = new PictureRadius("Small", 0);
        Small = pictureRadius;
        PictureRadius pictureRadius2 = new PictureRadius("Medium", 1);
        Medium = pictureRadius2;
        PictureRadius pictureRadius3 = new PictureRadius("Large", 2);
        Large = pictureRadius3;
        PictureRadius[] pictureRadiusArr = {pictureRadius, pictureRadius2, pictureRadius3};
        $VALUES = pictureRadiusArr;
        $ENTRIES = new asp(pictureRadiusArr);
    }

    public PictureRadius() {
        throw null;
    }

    public static zrp<PictureRadius> h() {
        return $ENTRIES;
    }

    public static PictureRadius valueOf(String str) {
        return (PictureRadius) Enum.valueOf(PictureRadius.class, str);
    }

    public static PictureRadius[] values() {
        return (PictureRadius[]) $VALUES.clone();
    }
}
