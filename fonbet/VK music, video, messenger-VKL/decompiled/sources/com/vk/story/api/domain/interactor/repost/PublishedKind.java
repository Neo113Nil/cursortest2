package com.vk.story.api.domain.interactor.repost;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoryPublishProcessNotifier.kt */
/* loaded from: classes6.dex */
public final class PublishedKind {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PublishedKind[] $VALUES;
    public static final PublishedKind CLIP;
    public static final PublishedKind STORY;

    static {
        PublishedKind publishedKind = new PublishedKind("CLIP", 0);
        CLIP = publishedKind;
        PublishedKind publishedKind2 = new PublishedKind("STORY", 1);
        STORY = publishedKind2;
        PublishedKind[] publishedKindArr = {publishedKind, publishedKind2};
        $VALUES = publishedKindArr;
        $ENTRIES = new asp(publishedKindArr);
    }

    public PublishedKind() {
        throw null;
    }

    public static PublishedKind valueOf(String str) {
        return (PublishedKind) Enum.valueOf(PublishedKind.class, str);
    }

    public static PublishedKind[] values() {
        return (PublishedKind[]) $VALUES.clone();
    }
}
