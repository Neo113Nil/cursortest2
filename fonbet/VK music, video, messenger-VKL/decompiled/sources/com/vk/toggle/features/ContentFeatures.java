package com.vk.toggle.features;

import com.vk.toggle.b;
import xsna.asp;
import xsna.gd6;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContentFeatures.kt */
/* loaded from: classes11.dex */
public final class ContentFeatures implements gd6 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ContentFeatures[] $VALUES;
    public static final ContentFeatures STORY_GIF;
    public static final ContentFeatures STORY_TECH_METRICS_DOWNLOAD;
    public static final ContentFeatures STORY_VIEWER_SKIP_PREVIEW;
    private final String key;

    static {
        ContentFeatures contentFeatures = new ContentFeatures("STORY_GIF", 0, "con_story_gif");
        STORY_GIF = contentFeatures;
        ContentFeatures contentFeatures2 = new ContentFeatures("STORY_TECH_METRICS_DOWNLOAD", 1, "con_tech_metrics_download");
        STORY_TECH_METRICS_DOWNLOAD = contentFeatures2;
        ContentFeatures contentFeatures3 = new ContentFeatures("STORY_VIEWER_SKIP_PREVIEW", 2, "con_story_viewer_skip_preview");
        STORY_VIEWER_SKIP_PREVIEW = contentFeatures3;
        ContentFeatures[] contentFeaturesArr = {contentFeatures, contentFeatures2, contentFeatures3};
        $VALUES = contentFeaturesArr;
        $ENTRIES = new asp(contentFeaturesArr);
    }

    public ContentFeatures(String str, int i, String str2) {
        this.key = str2;
    }

    public static zrp<ContentFeatures> i() {
        return $ENTRIES;
    }

    public static ContentFeatures valueOf(String str) {
        return (ContentFeatures) Enum.valueOf(ContentFeatures.class, str);
    }

    public static ContentFeatures[] values() {
        return (ContentFeatures[]) $VALUES.clone();
    }

    @Override // com.vk.toggle.b.a
    public final String getKey() {
        return this.key;
    }

    @Override // xsna.gd6, com.vk.toggle.b.a
    public final boolean h() {
        return b.A.a(this);
    }
}
