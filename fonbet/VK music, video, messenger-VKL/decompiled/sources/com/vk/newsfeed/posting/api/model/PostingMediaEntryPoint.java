package com.vk.newsfeed.posting.api.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostingMediaEntryPoint.kt */
/* loaded from: classes4.dex */
public final class PostingMediaEntryPoint {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PostingMediaEntryPoint[] $VALUES;
    public static final a Companion;
    public static final PostingMediaEntryPoint Default;
    public static final PostingMediaEntryPoint Photo;
    public static final PostingMediaEntryPoint Video;

    /* compiled from: PostingMediaEntryPoint.kt */
    public static final class a {
    }

    static {
        PostingMediaEntryPoint postingMediaEntryPoint = new PostingMediaEntryPoint("Photo", 0);
        Photo = postingMediaEntryPoint;
        PostingMediaEntryPoint postingMediaEntryPoint2 = new PostingMediaEntryPoint("Video", 1);
        Video = postingMediaEntryPoint2;
        PostingMediaEntryPoint postingMediaEntryPoint3 = new PostingMediaEntryPoint("Default", 2);
        Default = postingMediaEntryPoint3;
        PostingMediaEntryPoint[] postingMediaEntryPointArr = {postingMediaEntryPoint, postingMediaEntryPoint2, postingMediaEntryPoint3};
        $VALUES = postingMediaEntryPointArr;
        $ENTRIES = new asp(postingMediaEntryPointArr);
        Companion = new a();
    }

    public PostingMediaEntryPoint() {
        throw null;
    }

    public static zrp<PostingMediaEntryPoint> h() {
        return $ENTRIES;
    }

    public static PostingMediaEntryPoint valueOf(String str) {
        return (PostingMediaEntryPoint) Enum.valueOf(PostingMediaEntryPoint.class, str);
    }

    public static PostingMediaEntryPoint[] values() {
        return (PostingMediaEntryPoint[]) $VALUES.clone();
    }
}
