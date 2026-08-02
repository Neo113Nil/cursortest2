package com.vk.newsfeed.api.posting;

import com.huawei.hms.framework.common.BundleUtil;
import java.util.Iterator;
import java.util.Locale;
import xsna.asp;
import xsna.brm0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostingCreationEntryPoint.kt */
/* loaded from: classes3.dex */
public final class PostingCreationEntryPoint {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PostingCreationEntryPoint[] $VALUES;
    public static final PostingCreationEntryPoint ChannelWriteBarButton;
    public static final PostingCreationEntryPoint CommunityCreationOnboardingBlock;
    public static final a Companion;
    public static final PostingCreationEntryPoint FeedDeleteDraft;
    public static final PostingCreationEntryPoint FeedDeleteDraftThreeDots;
    public static final PostingCreationEntryPoint FeedEditDraft;
    public static final PostingCreationEntryPoint FeedEditDraftThreeDots;
    public static final PostingCreationEntryPoint FeedPlus;
    public static final PostingCreationEntryPoint GroupPostponedPosts;
    public static final PostingCreationEntryPoint GroupPostponedPostsThreePoints;
    public static final PostingCreationEntryPoint GroupWallButton;
    public static final PostingCreationEntryPoint ListDeleteDraftThreeDots;
    public static final PostingCreationEntryPoint ListEditDraft;
    public static final PostingCreationEntryPoint ListEditDraftThreeDots;
    public static final PostingCreationEntryPoint Other;
    public static final PostingCreationEntryPoint PostThreeDotMenuEditItem;
    public static final PostingCreationEntryPoint PrepareSuggestedPostButton;
    public static final PostingCreationEntryPoint ProfilePlusButton;
    public static final PostingCreationEntryPoint ProfilePostponedPosts;
    public static final PostingCreationEntryPoint ProfilePostponedPostsThreePoints;
    public static final PostingCreationEntryPoint ProfileWallButton;

    /* compiled from: PostingCreationEntryPoint.kt */
    public static final class a {
        public static PostingCreationEntryPoint a(String str) {
            Object obj;
            if (str == null) {
                return PostingCreationEntryPoint.Other;
            }
            String y = brm0.y(str.toLowerCase(Locale.ROOT), BundleUtil.UNDERLINE_TAG, "");
            Iterator<E> it = PostingCreationEntryPoint.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                a aVar = PostingCreationEntryPoint.Companion;
                String name = ((PostingCreationEntryPoint) obj).name();
                aVar.getClass();
                if (brm0.y(name.toLowerCase(Locale.ROOT), BundleUtil.UNDERLINE_TAG, "").equals(y)) {
                    break;
                }
            }
            PostingCreationEntryPoint postingCreationEntryPoint = (PostingCreationEntryPoint) obj;
            return postingCreationEntryPoint == null ? PostingCreationEntryPoint.Other : postingCreationEntryPoint;
        }
    }

    static {
        PostingCreationEntryPoint postingCreationEntryPoint = new PostingCreationEntryPoint("FeedPlus", 0);
        FeedPlus = postingCreationEntryPoint;
        PostingCreationEntryPoint postingCreationEntryPoint2 = new PostingCreationEntryPoint("GroupWallButton", 1);
        GroupWallButton = postingCreationEntryPoint2;
        PostingCreationEntryPoint postingCreationEntryPoint3 = new PostingCreationEntryPoint("ProfilePlusButton", 2);
        ProfilePlusButton = postingCreationEntryPoint3;
        PostingCreationEntryPoint postingCreationEntryPoint4 = new PostingCreationEntryPoint("ProfileWallButton", 3);
        ProfileWallButton = postingCreationEntryPoint4;
        PostingCreationEntryPoint postingCreationEntryPoint5 = new PostingCreationEntryPoint("ChannelWriteBarButton", 4);
        ChannelWriteBarButton = postingCreationEntryPoint5;
        PostingCreationEntryPoint postingCreationEntryPoint6 = new PostingCreationEntryPoint("PostThreeDotMenuEditItem", 5);
        PostThreeDotMenuEditItem = postingCreationEntryPoint6;
        PostingCreationEntryPoint postingCreationEntryPoint7 = new PostingCreationEntryPoint("PrepareSuggestedPostButton", 6);
        PrepareSuggestedPostButton = postingCreationEntryPoint7;
        PostingCreationEntryPoint postingCreationEntryPoint8 = new PostingCreationEntryPoint("ProfilePostponedPosts", 7);
        ProfilePostponedPosts = postingCreationEntryPoint8;
        PostingCreationEntryPoint postingCreationEntryPoint9 = new PostingCreationEntryPoint("ProfilePostponedPostsThreePoints", 8);
        ProfilePostponedPostsThreePoints = postingCreationEntryPoint9;
        PostingCreationEntryPoint postingCreationEntryPoint10 = new PostingCreationEntryPoint("GroupPostponedPosts", 9);
        GroupPostponedPosts = postingCreationEntryPoint10;
        PostingCreationEntryPoint postingCreationEntryPoint11 = new PostingCreationEntryPoint("GroupPostponedPostsThreePoints", 10);
        GroupPostponedPostsThreePoints = postingCreationEntryPoint11;
        PostingCreationEntryPoint postingCreationEntryPoint12 = new PostingCreationEntryPoint("FeedEditDraft", 11);
        FeedEditDraft = postingCreationEntryPoint12;
        PostingCreationEntryPoint postingCreationEntryPoint13 = new PostingCreationEntryPoint("FeedEditDraftThreeDots", 12);
        FeedEditDraftThreeDots = postingCreationEntryPoint13;
        PostingCreationEntryPoint postingCreationEntryPoint14 = new PostingCreationEntryPoint("FeedDeleteDraft", 13);
        FeedDeleteDraft = postingCreationEntryPoint14;
        PostingCreationEntryPoint postingCreationEntryPoint15 = new PostingCreationEntryPoint("FeedDeleteDraftThreeDots", 14);
        FeedDeleteDraftThreeDots = postingCreationEntryPoint15;
        PostingCreationEntryPoint postingCreationEntryPoint16 = new PostingCreationEntryPoint("ListEditDraft", 15);
        ListEditDraft = postingCreationEntryPoint16;
        PostingCreationEntryPoint postingCreationEntryPoint17 = new PostingCreationEntryPoint("ListEditDraftThreeDots", 16);
        ListEditDraftThreeDots = postingCreationEntryPoint17;
        PostingCreationEntryPoint postingCreationEntryPoint18 = new PostingCreationEntryPoint("ListDeleteDraftThreeDots", 17);
        ListDeleteDraftThreeDots = postingCreationEntryPoint18;
        PostingCreationEntryPoint postingCreationEntryPoint19 = new PostingCreationEntryPoint("CommunityCreationOnboardingBlock", 18);
        CommunityCreationOnboardingBlock = postingCreationEntryPoint19;
        PostingCreationEntryPoint postingCreationEntryPoint20 = new PostingCreationEntryPoint("Other", 19);
        Other = postingCreationEntryPoint20;
        PostingCreationEntryPoint[] postingCreationEntryPointArr = {postingCreationEntryPoint, postingCreationEntryPoint2, postingCreationEntryPoint3, postingCreationEntryPoint4, postingCreationEntryPoint5, postingCreationEntryPoint6, postingCreationEntryPoint7, postingCreationEntryPoint8, postingCreationEntryPoint9, postingCreationEntryPoint10, postingCreationEntryPoint11, postingCreationEntryPoint12, postingCreationEntryPoint13, postingCreationEntryPoint14, postingCreationEntryPoint15, postingCreationEntryPoint16, postingCreationEntryPoint17, postingCreationEntryPoint18, postingCreationEntryPoint19, postingCreationEntryPoint20};
        $VALUES = postingCreationEntryPointArr;
        $ENTRIES = new asp(postingCreationEntryPointArr);
        Companion = new a();
    }

    public PostingCreationEntryPoint() {
        throw null;
    }

    public static zrp<PostingCreationEntryPoint> h() {
        return $ENTRIES;
    }

    public static PostingCreationEntryPoint valueOf(String str) {
        return (PostingCreationEntryPoint) Enum.valueOf(PostingCreationEntryPoint.class, str);
    }

    public static PostingCreationEntryPoint[] values() {
        return (PostingCreationEntryPoint[]) $VALUES.clone();
    }
}
