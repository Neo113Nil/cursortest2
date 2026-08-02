package com.vk.media.pipeline.model.quality;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MediaQuality.kt */
/* loaded from: classes3.dex */
public final class MediaQuality {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MediaQuality[] $VALUES;
    public static final MediaQuality HIGH;
    public static final MediaQuality LOW;
    public static final MediaQuality MEDIUM;

    static {
        MediaQuality mediaQuality = new MediaQuality("HIGH", 0);
        HIGH = mediaQuality;
        MediaQuality mediaQuality2 = new MediaQuality("MEDIUM", 1);
        MEDIUM = mediaQuality2;
        MediaQuality mediaQuality3 = new MediaQuality("LOW", 2);
        LOW = mediaQuality3;
        MediaQuality[] mediaQualityArr = {mediaQuality, mediaQuality2, mediaQuality3};
        $VALUES = mediaQualityArr;
        $ENTRIES = new asp(mediaQualityArr);
    }

    public MediaQuality() {
        throw null;
    }

    public static MediaQuality valueOf(String str) {
        return (MediaQuality) Enum.valueOf(MediaQuality.class, str);
    }

    public static MediaQuality[] values() {
        return (MediaQuality[]) $VALUES.clone();
    }
}
