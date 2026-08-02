package com.vk.newsfeed.posting.api.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostingMetricEntryPoint.kt */
/* loaded from: classes4.dex */
public final class PostingMetricEntryPoint implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PostingMetricEntryPoint[] $VALUES;
    public static final Parcelable.Creator<PostingMetricEntryPoint> CREATOR;
    public static final PostingMetricEntryPoint ChannelWriteBarButton;
    public static final PostingMetricEntryPoint CommunityCreationOnboardingBlock;
    public static final a Companion;
    public static final PostingMetricEntryPoint FeedDeleteDraft;
    public static final PostingMetricEntryPoint FeedDeleteDraftThreeDots;
    public static final PostingMetricEntryPoint FeedEditDraft;
    public static final PostingMetricEntryPoint FeedEditDraftThreeDots;
    public static final PostingMetricEntryPoint FeedPlus;
    public static final PostingMetricEntryPoint GroupPostponedPosts;
    public static final PostingMetricEntryPoint GroupPostponedPostsThreePoints;
    public static final PostingMetricEntryPoint GroupWallButton;
    public static final PostingMetricEntryPoint ListDeleteDraftThreeDots;
    public static final PostingMetricEntryPoint ListEditDraft;
    public static final PostingMetricEntryPoint ListEditDraftThreeDots;
    public static final PostingMetricEntryPoint Other;
    public static final PostingMetricEntryPoint PostThreeDotMenuEditItem;
    public static final PostingMetricEntryPoint PrepareSuggestedPostButton;
    public static final PostingMetricEntryPoint ProfilePlusButton;
    public static final PostingMetricEntryPoint ProfilePostponedPosts;
    public static final PostingMetricEntryPoint ProfilePostponedPostsThreePoints;
    public static final PostingMetricEntryPoint ProfileWallButton;

    /* compiled from: PostingMetricEntryPoint.kt */
    public static final class a {
    }

    /* compiled from: PostingMetricEntryPoint.kt */
    public static final class b implements Parcelable.Creator<PostingMetricEntryPoint> {
        @Override // android.os.Parcelable.Creator
        public final PostingMetricEntryPoint createFromParcel(Parcel parcel) {
            return PostingMetricEntryPoint.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PostingMetricEntryPoint[] newArray(int i) {
            return new PostingMetricEntryPoint[i];
        }
    }

    static {
        PostingMetricEntryPoint postingMetricEntryPoint = new PostingMetricEntryPoint("FeedPlus", 0);
        FeedPlus = postingMetricEntryPoint;
        PostingMetricEntryPoint postingMetricEntryPoint2 = new PostingMetricEntryPoint("GroupWallButton", 1);
        GroupWallButton = postingMetricEntryPoint2;
        PostingMetricEntryPoint postingMetricEntryPoint3 = new PostingMetricEntryPoint("ProfilePlusButton", 2);
        ProfilePlusButton = postingMetricEntryPoint3;
        PostingMetricEntryPoint postingMetricEntryPoint4 = new PostingMetricEntryPoint("ProfileWallButton", 3);
        ProfileWallButton = postingMetricEntryPoint4;
        PostingMetricEntryPoint postingMetricEntryPoint5 = new PostingMetricEntryPoint("ChannelWriteBarButton", 4);
        ChannelWriteBarButton = postingMetricEntryPoint5;
        PostingMetricEntryPoint postingMetricEntryPoint6 = new PostingMetricEntryPoint("PostThreeDotMenuEditItem", 5);
        PostThreeDotMenuEditItem = postingMetricEntryPoint6;
        PostingMetricEntryPoint postingMetricEntryPoint7 = new PostingMetricEntryPoint("PrepareSuggestedPostButton", 6);
        PrepareSuggestedPostButton = postingMetricEntryPoint7;
        PostingMetricEntryPoint postingMetricEntryPoint8 = new PostingMetricEntryPoint("ProfilePostponedPosts", 7);
        ProfilePostponedPosts = postingMetricEntryPoint8;
        PostingMetricEntryPoint postingMetricEntryPoint9 = new PostingMetricEntryPoint("ProfilePostponedPostsThreePoints", 8);
        ProfilePostponedPostsThreePoints = postingMetricEntryPoint9;
        PostingMetricEntryPoint postingMetricEntryPoint10 = new PostingMetricEntryPoint("GroupPostponedPosts", 9);
        GroupPostponedPosts = postingMetricEntryPoint10;
        PostingMetricEntryPoint postingMetricEntryPoint11 = new PostingMetricEntryPoint("GroupPostponedPostsThreePoints", 10);
        GroupPostponedPostsThreePoints = postingMetricEntryPoint11;
        PostingMetricEntryPoint postingMetricEntryPoint12 = new PostingMetricEntryPoint("FeedEditDraft", 11);
        FeedEditDraft = postingMetricEntryPoint12;
        PostingMetricEntryPoint postingMetricEntryPoint13 = new PostingMetricEntryPoint("FeedEditDraftThreeDots", 12);
        FeedEditDraftThreeDots = postingMetricEntryPoint13;
        PostingMetricEntryPoint postingMetricEntryPoint14 = new PostingMetricEntryPoint("FeedDeleteDraft", 13);
        FeedDeleteDraft = postingMetricEntryPoint14;
        PostingMetricEntryPoint postingMetricEntryPoint15 = new PostingMetricEntryPoint("FeedDeleteDraftThreeDots", 14);
        FeedDeleteDraftThreeDots = postingMetricEntryPoint15;
        PostingMetricEntryPoint postingMetricEntryPoint16 = new PostingMetricEntryPoint("ListEditDraft", 15);
        ListEditDraft = postingMetricEntryPoint16;
        PostingMetricEntryPoint postingMetricEntryPoint17 = new PostingMetricEntryPoint("ListEditDraftThreeDots", 16);
        ListEditDraftThreeDots = postingMetricEntryPoint17;
        PostingMetricEntryPoint postingMetricEntryPoint18 = new PostingMetricEntryPoint("ListDeleteDraftThreeDots", 17);
        ListDeleteDraftThreeDots = postingMetricEntryPoint18;
        PostingMetricEntryPoint postingMetricEntryPoint19 = new PostingMetricEntryPoint("CommunityCreationOnboardingBlock", 18);
        CommunityCreationOnboardingBlock = postingMetricEntryPoint19;
        PostingMetricEntryPoint postingMetricEntryPoint20 = new PostingMetricEntryPoint("Other", 19);
        Other = postingMetricEntryPoint20;
        PostingMetricEntryPoint[] postingMetricEntryPointArr = {postingMetricEntryPoint, postingMetricEntryPoint2, postingMetricEntryPoint3, postingMetricEntryPoint4, postingMetricEntryPoint5, postingMetricEntryPoint6, postingMetricEntryPoint7, postingMetricEntryPoint8, postingMetricEntryPoint9, postingMetricEntryPoint10, postingMetricEntryPoint11, postingMetricEntryPoint12, postingMetricEntryPoint13, postingMetricEntryPoint14, postingMetricEntryPoint15, postingMetricEntryPoint16, postingMetricEntryPoint17, postingMetricEntryPoint18, postingMetricEntryPoint19, postingMetricEntryPoint20};
        $VALUES = postingMetricEntryPointArr;
        $ENTRIES = new asp(postingMetricEntryPointArr);
        Companion = new a();
        CREATOR = new b();
    }

    public PostingMetricEntryPoint() {
        throw null;
    }

    public static zrp<PostingMetricEntryPoint> i() {
        return $ENTRIES;
    }

    public static PostingMetricEntryPoint valueOf(String str) {
        return (PostingMetricEntryPoint) Enum.valueOf(PostingMetricEntryPoint.class, str);
    }

    public static PostingMetricEntryPoint[] values() {
        return (PostingMetricEntryPoint[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
