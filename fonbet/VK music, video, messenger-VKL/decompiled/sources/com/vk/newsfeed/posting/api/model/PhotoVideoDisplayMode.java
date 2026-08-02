package com.vk.newsfeed.posting.api.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhotoVideoDisplayMode.kt */
/* loaded from: classes4.dex */
public final class PhotoVideoDisplayMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PhotoVideoDisplayMode[] $VALUES;
    public static final PhotoVideoDisplayMode Carousel;
    public static final PhotoVideoDisplayMode Grid;

    static {
        PhotoVideoDisplayMode photoVideoDisplayMode = new PhotoVideoDisplayMode("Grid", 0);
        Grid = photoVideoDisplayMode;
        PhotoVideoDisplayMode photoVideoDisplayMode2 = new PhotoVideoDisplayMode("Carousel", 1);
        Carousel = photoVideoDisplayMode2;
        PhotoVideoDisplayMode[] photoVideoDisplayModeArr = {photoVideoDisplayMode, photoVideoDisplayMode2};
        $VALUES = photoVideoDisplayModeArr;
        $ENTRIES = new asp(photoVideoDisplayModeArr);
    }

    public PhotoVideoDisplayMode() {
        throw null;
    }

    public static zrp<PhotoVideoDisplayMode> h() {
        return $ENTRIES;
    }

    public static PhotoVideoDisplayMode valueOf(String str) {
        return (PhotoVideoDisplayMode) Enum.valueOf(PhotoVideoDisplayMode.class, str);
    }

    public static PhotoVideoDisplayMode[] values() {
        return (PhotoVideoDisplayMode[]) $VALUES.clone();
    }
}
