package com.vk.newsfeed.posting.impl.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CropFitContainerMode.kt */
/* loaded from: classes4.dex */
public final class CropFitContainerMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CropFitContainerMode[] $VALUES;
    public static final CropFitContainerMode CROP;
    public static final CropFitContainerMode CROP_ONLY;
    public static final CropFitContainerMode FIT;

    static {
        CropFitContainerMode cropFitContainerMode = new CropFitContainerMode("CROP", 0);
        CROP = cropFitContainerMode;
        CropFitContainerMode cropFitContainerMode2 = new CropFitContainerMode("FIT", 1);
        FIT = cropFitContainerMode2;
        CropFitContainerMode cropFitContainerMode3 = new CropFitContainerMode("CROP_ONLY", 2);
        CROP_ONLY = cropFitContainerMode3;
        CropFitContainerMode[] cropFitContainerModeArr = {cropFitContainerMode, cropFitContainerMode2, cropFitContainerMode3};
        $VALUES = cropFitContainerModeArr;
        $ENTRIES = new asp(cropFitContainerModeArr);
    }

    public CropFitContainerMode() {
        throw null;
    }

    public static zrp<CropFitContainerMode> h() {
        return $ENTRIES;
    }

    public static CropFitContainerMode valueOf(String str) {
        return (CropFitContainerMode) Enum.valueOf(CropFitContainerMode.class, str);
    }

    public static CropFitContainerMode[] values() {
        return (CropFitContainerMode[]) $VALUES.clone();
    }
}
