package com.vk.newsfeed.posting.impl.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostingContext.kt */
/* loaded from: classes4.dex */
public final class PostType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PostType[] $VALUES;
    public static final PostType Regular;
    public static final PostType Suggest;

    static {
        PostType postType = new PostType("Regular", 0);
        Regular = postType;
        PostType postType2 = new PostType("Suggest", 1);
        Suggest = postType2;
        PostType[] postTypeArr = {postType, postType2};
        $VALUES = postTypeArr;
        $ENTRIES = new asp(postTypeArr);
    }

    public PostType() {
        throw null;
    }

    public static PostType valueOf(String str) {
        return (PostType) Enum.valueOf(PostType.class, str);
    }

    public static PostType[] values() {
        return (PostType[]) $VALUES.clone();
    }
}
