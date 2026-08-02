package com.vk.photogallery;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GallerySelectionStrategy.kt */
/* loaded from: classes4.dex */
public final class GallerySelectionStrategy {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GallerySelectionStrategy[] $VALUES;
    public static final GallerySelectionStrategy MULTIPLE;
    public static final GallerySelectionStrategy SINGLE_IMMEDIATELY;
    public static final GallerySelectionStrategy SINGLE_WITH_PREVIEW;

    static {
        GallerySelectionStrategy gallerySelectionStrategy = new GallerySelectionStrategy("SINGLE_IMMEDIATELY", 0);
        SINGLE_IMMEDIATELY = gallerySelectionStrategy;
        GallerySelectionStrategy gallerySelectionStrategy2 = new GallerySelectionStrategy("SINGLE_WITH_PREVIEW", 1);
        SINGLE_WITH_PREVIEW = gallerySelectionStrategy2;
        GallerySelectionStrategy gallerySelectionStrategy3 = new GallerySelectionStrategy("MULTIPLE", 2);
        MULTIPLE = gallerySelectionStrategy3;
        GallerySelectionStrategy[] gallerySelectionStrategyArr = {gallerySelectionStrategy, gallerySelectionStrategy2, gallerySelectionStrategy3};
        $VALUES = gallerySelectionStrategyArr;
        $ENTRIES = new asp(gallerySelectionStrategyArr);
    }

    public GallerySelectionStrategy() {
        throw null;
    }

    public static GallerySelectionStrategy valueOf(String str) {
        return (GallerySelectionStrategy) Enum.valueOf(GallerySelectionStrategy.class, str);
    }

    public static GallerySelectionStrategy[] values() {
        return (GallerySelectionStrategy[]) $VALUES.clone();
    }
}
