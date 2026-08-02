package com.vk.feed.design.compose.posting.preview.spinner;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostingVkSpinnerDefault.kt */
/* loaded from: classes18.dex */
public final class PostingSpinnerSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PostingSpinnerSize[] $VALUES;
    public static final PostingSpinnerSize Large;
    public static final PostingSpinnerSize Medium;
    public static final PostingSpinnerSize Regular;
    public static final PostingSpinnerSize Small;

    static {
        PostingSpinnerSize postingSpinnerSize = new PostingSpinnerSize("Small", 0);
        Small = postingSpinnerSize;
        PostingSpinnerSize postingSpinnerSize2 = new PostingSpinnerSize("Regular", 1);
        Regular = postingSpinnerSize2;
        PostingSpinnerSize postingSpinnerSize3 = new PostingSpinnerSize("Medium", 2);
        Medium = postingSpinnerSize3;
        PostingSpinnerSize postingSpinnerSize4 = new PostingSpinnerSize("Large", 3);
        Large = postingSpinnerSize4;
        PostingSpinnerSize[] postingSpinnerSizeArr = {postingSpinnerSize, postingSpinnerSize2, postingSpinnerSize3, postingSpinnerSize4};
        $VALUES = postingSpinnerSizeArr;
        $ENTRIES = new asp(postingSpinnerSizeArr);
    }

    public PostingSpinnerSize() {
        throw null;
    }

    public static PostingSpinnerSize valueOf(String str) {
        return (PostingSpinnerSize) Enum.valueOf(PostingSpinnerSize.class, str);
    }

    public static PostingSpinnerSize[] values() {
        return (PostingSpinnerSize[]) $VALUES.clone();
    }
}
