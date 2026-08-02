package com.vk.newsfeed.posting.impl.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MediaViewerOpenPoint.kt */
/* loaded from: classes4.dex */
public final class MediaViewerOpenPoint {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MediaViewerOpenPoint[] $VALUES;
    public static final MediaViewerOpenPoint LOCAL_MEDIA_PICKER;
    public static final MediaViewerOpenPoint MEDIA_PREVIEW;
    public static final MediaViewerOpenPoint MINI_MEDIA_PREVIEW;
    public static final MediaViewerOpenPoint VK_PHOTO_PICKER;

    static {
        MediaViewerOpenPoint mediaViewerOpenPoint = new MediaViewerOpenPoint("LOCAL_MEDIA_PICKER", 0);
        LOCAL_MEDIA_PICKER = mediaViewerOpenPoint;
        MediaViewerOpenPoint mediaViewerOpenPoint2 = new MediaViewerOpenPoint("VK_PHOTO_PICKER", 1);
        VK_PHOTO_PICKER = mediaViewerOpenPoint2;
        MediaViewerOpenPoint mediaViewerOpenPoint3 = new MediaViewerOpenPoint("MEDIA_PREVIEW", 2);
        MEDIA_PREVIEW = mediaViewerOpenPoint3;
        MediaViewerOpenPoint mediaViewerOpenPoint4 = new MediaViewerOpenPoint("MINI_MEDIA_PREVIEW", 3);
        MINI_MEDIA_PREVIEW = mediaViewerOpenPoint4;
        MediaViewerOpenPoint[] mediaViewerOpenPointArr = {mediaViewerOpenPoint, mediaViewerOpenPoint2, mediaViewerOpenPoint3, mediaViewerOpenPoint4};
        $VALUES = mediaViewerOpenPointArr;
        $ENTRIES = new asp(mediaViewerOpenPointArr);
    }

    public MediaViewerOpenPoint() {
        throw null;
    }

    public static MediaViewerOpenPoint valueOf(String str) {
        return (MediaViewerOpenPoint) Enum.valueOf(MediaViewerOpenPoint.class, str);
    }

    public static MediaViewerOpenPoint[] values() {
        return (MediaViewerOpenPoint[]) $VALUES.clone();
    }
}
