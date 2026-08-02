package com.vk.newsfeed.impl.posting.viewpresenter.settings;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostingType.kt */
/* loaded from: classes4.dex */
public final class PostingType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PostingType[] $VALUES;
    public static final PostingType CLIP;
    public static final a Companion;
    public static final PostingType LIVE_RECORDING;
    public static final PostingType POST;

    /* compiled from: PostingType.kt */
    public static final class a {
    }

    static {
        PostingType postingType = new PostingType("POST", 0);
        POST = postingType;
        PostingType postingType2 = new PostingType("CLIP", 1);
        CLIP = postingType2;
        PostingType postingType3 = new PostingType("LIVE_RECORDING", 2);
        LIVE_RECORDING = postingType3;
        PostingType[] postingTypeArr = {postingType, postingType2, postingType3};
        $VALUES = postingTypeArr;
        $ENTRIES = new asp(postingTypeArr);
        Companion = new a();
    }

    public PostingType() {
        throw null;
    }

    public static PostingType valueOf(String str) {
        return (PostingType) Enum.valueOf(PostingType.class, str);
    }

    public static PostingType[] values() {
        return (PostingType[]) $VALUES.clone();
    }
}
