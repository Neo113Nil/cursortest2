package com.vk.metrics.performance.images;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.X3;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageCacheSource.kt */
/* loaded from: classes.dex */
public final class ImageCacheSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ImageCacheSource[] $VALUES;
    public static final a Companion;
    public static final ImageCacheSource IMAGES;
    public static final ImageCacheSource OTHER;
    public static final ImageCacheSource STICKERS;
    public static final ImageCacheSource WEB_VIEW;
    private final String sourceName;

    /* compiled from: ImageCacheSource.kt */
    public static final class a {
    }

    static {
        ImageCacheSource imageCacheSource = new ImageCacheSource("IMAGES", 0, "images");
        IMAGES = imageCacheSource;
        ImageCacheSource imageCacheSource2 = new ImageCacheSource("STICKERS", 1, "stickers");
        STICKERS = imageCacheSource2;
        ImageCacheSource imageCacheSource3 = new ImageCacheSource("WEB_VIEW", 2, X3.i.K);
        WEB_VIEW = imageCacheSource3;
        ImageCacheSource imageCacheSource4 = new ImageCacheSource(NativeAdContent.ViewTag.OTHER, 3, "other");
        OTHER = imageCacheSource4;
        ImageCacheSource[] imageCacheSourceArr = {imageCacheSource, imageCacheSource2, imageCacheSource3, imageCacheSource4};
        $VALUES = imageCacheSourceArr;
        $ENTRIES = new asp(imageCacheSourceArr);
        Companion = new a();
    }

    public ImageCacheSource(String str, int i, String str2) {
        this.sourceName = str2;
    }

    public static ImageCacheSource valueOf(String str) {
        return (ImageCacheSource) Enum.valueOf(ImageCacheSource.class, str);
    }

    public static ImageCacheSource[] values() {
        return (ImageCacheSource[]) $VALUES.clone();
    }

    public final String h() {
        return this.sourceName;
    }
}
