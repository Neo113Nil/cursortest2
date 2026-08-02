package com.vk.core.compose.component.cell.content;

import xsna.asp;
import xsna.ozl;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContentSize.kt */
@ozl
/* loaded from: classes17.dex */
public final class ContentSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ContentSize[] $VALUES;
    public static final ContentSize Big;
    public static final ContentSize Medium;
    public static final ContentSize Small;
    private final float size;

    static {
        ContentSize contentSize = new ContentSize("Small", 0, 40);
        Small = contentSize;
        ContentSize contentSize2 = new ContentSize("Medium", 1, 48);
        Medium = contentSize2;
        ContentSize contentSize3 = new ContentSize("Big", 2, 56);
        Big = contentSize3;
        ContentSize[] contentSizeArr = {contentSize, contentSize2, contentSize3};
        $VALUES = contentSizeArr;
        $ENTRIES = new asp(contentSizeArr);
    }

    public ContentSize(String str, int i, float f) {
        this.size = f;
    }

    public static ContentSize valueOf(String str) {
        return (ContentSize) Enum.valueOf(ContentSize.class, str);
    }

    public static ContentSize[] values() {
        return (ContentSize[]) $VALUES.clone();
    }

    public final float h() {
        return this.size;
    }
}
