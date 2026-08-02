package com.vk.video.profile.analytics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoProfileContentWarningAnalytics.kt */
/* loaded from: classes6.dex */
public final class ContentWarningModalClick {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ContentWarningModalClick[] $VALUES;
    public static final ContentWarningModalClick Article;
    public static final ContentWarningModalClick Hide;
    public static final ContentWarningModalClick Leave;

    static {
        ContentWarningModalClick contentWarningModalClick = new ContentWarningModalClick("Leave", 0);
        Leave = contentWarningModalClick;
        ContentWarningModalClick contentWarningModalClick2 = new ContentWarningModalClick("Hide", 1);
        Hide = contentWarningModalClick2;
        ContentWarningModalClick contentWarningModalClick3 = new ContentWarningModalClick("Article", 2);
        Article = contentWarningModalClick3;
        ContentWarningModalClick[] contentWarningModalClickArr = {contentWarningModalClick, contentWarningModalClick2, contentWarningModalClick3};
        $VALUES = contentWarningModalClickArr;
        $ENTRIES = new asp(contentWarningModalClickArr);
    }

    public ContentWarningModalClick() {
        throw null;
    }

    public static ContentWarningModalClick valueOf(String str) {
        return (ContentWarningModalClick) Enum.valueOf(ContentWarningModalClick.class, str);
    }

    public static ContentWarningModalClick[] values() {
        return (ContentWarningModalClick[]) $VALUES.clone();
    }
}
