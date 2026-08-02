package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkContentBadgeDefaults.kt */
/* loaded from: classes17.dex */
public final class ContentBadgeSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ContentBadgeSize[] $VALUES;
    public static final ContentBadgeSize Large;
    public static final ContentBadgeSize Medium;
    public static final ContentBadgeSize Small;

    static {
        ContentBadgeSize contentBadgeSize = new ContentBadgeSize("Small", 0);
        Small = contentBadgeSize;
        ContentBadgeSize contentBadgeSize2 = new ContentBadgeSize("Medium", 1);
        Medium = contentBadgeSize2;
        ContentBadgeSize contentBadgeSize3 = new ContentBadgeSize("Large", 2);
        Large = contentBadgeSize3;
        ContentBadgeSize[] contentBadgeSizeArr = {contentBadgeSize, contentBadgeSize2, contentBadgeSize3};
        $VALUES = contentBadgeSizeArr;
        $ENTRIES = new asp(contentBadgeSizeArr);
    }

    public ContentBadgeSize() {
        throw null;
    }

    public static zrp<ContentBadgeSize> h() {
        return $ENTRIES;
    }

    public static ContentBadgeSize valueOf(String str) {
        return (ContentBadgeSize) Enum.valueOf(ContentBadgeSize.class, str);
    }

    public static ContentBadgeSize[] values() {
        return (ContentBadgeSize[]) $VALUES.clone();
    }
}
