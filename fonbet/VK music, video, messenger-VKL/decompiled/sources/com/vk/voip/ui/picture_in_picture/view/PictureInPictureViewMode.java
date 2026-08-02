package com.vk.voip.ui.picture_in_picture.view;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PictureInPictureViewMode.kt */
/* loaded from: classes7.dex */
public final class PictureInPictureViewMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PictureInPictureViewMode[] $VALUES;
    public static final PictureInPictureViewMode OVERLAY;
    public static final PictureInPictureViewMode PICTURE_IN_PICTURE;

    static {
        PictureInPictureViewMode pictureInPictureViewMode = new PictureInPictureViewMode("PICTURE_IN_PICTURE", 0);
        PICTURE_IN_PICTURE = pictureInPictureViewMode;
        PictureInPictureViewMode pictureInPictureViewMode2 = new PictureInPictureViewMode("OVERLAY", 1);
        OVERLAY = pictureInPictureViewMode2;
        PictureInPictureViewMode[] pictureInPictureViewModeArr = {pictureInPictureViewMode, pictureInPictureViewMode2};
        $VALUES = pictureInPictureViewModeArr;
        $ENTRIES = new asp(pictureInPictureViewModeArr);
    }

    public PictureInPictureViewMode() {
        throw null;
    }

    public static PictureInPictureViewMode valueOf(String str) {
        return (PictureInPictureViewMode) Enum.valueOf(PictureInPictureViewMode.class, str);
    }

    public static PictureInPictureViewMode[] values() {
        return (PictureInPictureViewMode[]) $VALUES.clone();
    }
}
