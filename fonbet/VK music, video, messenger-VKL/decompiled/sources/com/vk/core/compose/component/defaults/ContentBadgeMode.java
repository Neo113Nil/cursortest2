package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkContentBadgeDefaults.kt */
/* loaded from: classes17.dex */
public final class ContentBadgeMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ContentBadgeMode[] $VALUES;
    public static final ContentBadgeMode Outline;
    public static final ContentBadgeMode Primary;
    public static final ContentBadgeMode Secondary;

    static {
        ContentBadgeMode contentBadgeMode = new ContentBadgeMode("Primary", 0);
        Primary = contentBadgeMode;
        ContentBadgeMode contentBadgeMode2 = new ContentBadgeMode("Secondary", 1);
        Secondary = contentBadgeMode2;
        ContentBadgeMode contentBadgeMode3 = new ContentBadgeMode("Outline", 2);
        Outline = contentBadgeMode3;
        ContentBadgeMode[] contentBadgeModeArr = {contentBadgeMode, contentBadgeMode2, contentBadgeMode3};
        $VALUES = contentBadgeModeArr;
        $ENTRIES = new asp(contentBadgeModeArr);
    }

    public ContentBadgeMode() {
        throw null;
    }

    public static zrp<ContentBadgeMode> h() {
        return $ENTRIES;
    }

    public static ContentBadgeMode valueOf(String str) {
        return (ContentBadgeMode) Enum.valueOf(ContentBadgeMode.class, str);
    }

    public static ContentBadgeMode[] values() {
        return (ContentBadgeMode[]) $VALUES.clone();
    }
}
