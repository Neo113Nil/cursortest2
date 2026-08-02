package com.vk.newsfeed.posting.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostingMetricsEntryPoint.kt */
/* loaded from: classes4.dex */
public final class PostingMetricsEntryPoint implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PostingMetricsEntryPoint[] $VALUES;
    public static final Parcelable.Creator<PostingMetricsEntryPoint> CREATOR;
    public static final PostingMetricsEntryPoint ChannelWriteBarButton;
    public static final PostingMetricsEntryPoint CommunityCreationOnboardingBlock;
    public static final a Companion;
    public static final PostingMetricsEntryPoint FeedDeleteDraft;
    public static final PostingMetricsEntryPoint FeedDeleteDraftThreeDots;
    public static final PostingMetricsEntryPoint FeedEditDraft;
    public static final PostingMetricsEntryPoint FeedEditDraftThreeDots;
    public static final PostingMetricsEntryPoint FeedPlus;
    public static final PostingMetricsEntryPoint GroupPostponedPosts;
    public static final PostingMetricsEntryPoint GroupPostponedPostsThreePoints;
    public static final PostingMetricsEntryPoint GroupWallButton;
    public static final PostingMetricsEntryPoint ListDeleteDraftThreeDots;
    public static final PostingMetricsEntryPoint ListEditDraft;
    public static final PostingMetricsEntryPoint ListEditDraftThreeDots;
    public static final PostingMetricsEntryPoint Other;
    public static final PostingMetricsEntryPoint PostThreeDotMenuEditItem;
    public static final PostingMetricsEntryPoint PrepareSuggestedPostButton;
    public static final PostingMetricsEntryPoint ProfilePlusButton;
    public static final PostingMetricsEntryPoint ProfilePostponedPosts;
    public static final PostingMetricsEntryPoint ProfilePostponedPostsThreePoints;
    public static final PostingMetricsEntryPoint ProfileWallButton;

    /* compiled from: PostingMetricsEntryPoint.kt */
    public static final class a {
    }

    /* compiled from: PostingMetricsEntryPoint.kt */
    public static final class b implements Parcelable.Creator<PostingMetricsEntryPoint> {
        @Override // android.os.Parcelable.Creator
        public final PostingMetricsEntryPoint createFromParcel(Parcel parcel) {
            return PostingMetricsEntryPoint.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PostingMetricsEntryPoint[] newArray(int i) {
            return new PostingMetricsEntryPoint[i];
        }
    }

    static {
        PostingMetricsEntryPoint postingMetricsEntryPoint = new PostingMetricsEntryPoint("FeedPlus", 0);
        FeedPlus = postingMetricsEntryPoint;
        PostingMetricsEntryPoint postingMetricsEntryPoint2 = new PostingMetricsEntryPoint("GroupWallButton", 1);
        GroupWallButton = postingMetricsEntryPoint2;
        PostingMetricsEntryPoint postingMetricsEntryPoint3 = new PostingMetricsEntryPoint("ProfilePlusButton", 2);
        ProfilePlusButton = postingMetricsEntryPoint3;
        PostingMetricsEntryPoint postingMetricsEntryPoint4 = new PostingMetricsEntryPoint("ProfileWallButton", 3);
        ProfileWallButton = postingMetricsEntryPoint4;
        PostingMetricsEntryPoint postingMetricsEntryPoint5 = new PostingMetricsEntryPoint("ChannelWriteBarButton", 4);
        ChannelWriteBarButton = postingMetricsEntryPoint5;
        PostingMetricsEntryPoint postingMetricsEntryPoint6 = new PostingMetricsEntryPoint("PostThreeDotMenuEditItem", 5);
        PostThreeDotMenuEditItem = postingMetricsEntryPoint6;
        PostingMetricsEntryPoint postingMetricsEntryPoint7 = new PostingMetricsEntryPoint("PrepareSuggestedPostButton", 6);
        PrepareSuggestedPostButton = postingMetricsEntryPoint7;
        PostingMetricsEntryPoint postingMetricsEntryPoint8 = new PostingMetricsEntryPoint("ProfilePostponedPosts", 7);
        ProfilePostponedPosts = postingMetricsEntryPoint8;
        PostingMetricsEntryPoint postingMetricsEntryPoint9 = new PostingMetricsEntryPoint("ProfilePostponedPostsThreePoints", 8);
        ProfilePostponedPostsThreePoints = postingMetricsEntryPoint9;
        PostingMetricsEntryPoint postingMetricsEntryPoint10 = new PostingMetricsEntryPoint("GroupPostponedPosts", 9);
        GroupPostponedPosts = postingMetricsEntryPoint10;
        PostingMetricsEntryPoint postingMetricsEntryPoint11 = new PostingMetricsEntryPoint("GroupPostponedPostsThreePoints", 10);
        GroupPostponedPostsThreePoints = postingMetricsEntryPoint11;
        PostingMetricsEntryPoint postingMetricsEntryPoint12 = new PostingMetricsEntryPoint("FeedEditDraft", 11);
        FeedEditDraft = postingMetricsEntryPoint12;
        PostingMetricsEntryPoint postingMetricsEntryPoint13 = new PostingMetricsEntryPoint("FeedEditDraftThreeDots", 12);
        FeedEditDraftThreeDots = postingMetricsEntryPoint13;
        PostingMetricsEntryPoint postingMetricsEntryPoint14 = new PostingMetricsEntryPoint("FeedDeleteDraft", 13);
        FeedDeleteDraft = postingMetricsEntryPoint14;
        PostingMetricsEntryPoint postingMetricsEntryPoint15 = new PostingMetricsEntryPoint("FeedDeleteDraftThreeDots", 14);
        FeedDeleteDraftThreeDots = postingMetricsEntryPoint15;
        PostingMetricsEntryPoint postingMetricsEntryPoint16 = new PostingMetricsEntryPoint("ListEditDraft", 15);
        ListEditDraft = postingMetricsEntryPoint16;
        PostingMetricsEntryPoint postingMetricsEntryPoint17 = new PostingMetricsEntryPoint("ListEditDraftThreeDots", 16);
        ListEditDraftThreeDots = postingMetricsEntryPoint17;
        PostingMetricsEntryPoint postingMetricsEntryPoint18 = new PostingMetricsEntryPoint("ListDeleteDraftThreeDots", 17);
        ListDeleteDraftThreeDots = postingMetricsEntryPoint18;
        PostingMetricsEntryPoint postingMetricsEntryPoint19 = new PostingMetricsEntryPoint("CommunityCreationOnboardingBlock", 18);
        CommunityCreationOnboardingBlock = postingMetricsEntryPoint19;
        PostingMetricsEntryPoint postingMetricsEntryPoint20 = new PostingMetricsEntryPoint("Other", 19);
        Other = postingMetricsEntryPoint20;
        PostingMetricsEntryPoint[] postingMetricsEntryPointArr = {postingMetricsEntryPoint, postingMetricsEntryPoint2, postingMetricsEntryPoint3, postingMetricsEntryPoint4, postingMetricsEntryPoint5, postingMetricsEntryPoint6, postingMetricsEntryPoint7, postingMetricsEntryPoint8, postingMetricsEntryPoint9, postingMetricsEntryPoint10, postingMetricsEntryPoint11, postingMetricsEntryPoint12, postingMetricsEntryPoint13, postingMetricsEntryPoint14, postingMetricsEntryPoint15, postingMetricsEntryPoint16, postingMetricsEntryPoint17, postingMetricsEntryPoint18, postingMetricsEntryPoint19, postingMetricsEntryPoint20};
        $VALUES = postingMetricsEntryPointArr;
        $ENTRIES = new asp(postingMetricsEntryPointArr);
        Companion = new a();
        CREATOR = new b();
    }

    public PostingMetricsEntryPoint() {
        throw null;
    }

    public static PostingMetricsEntryPoint valueOf(String str) {
        return (PostingMetricsEntryPoint) Enum.valueOf(PostingMetricsEntryPoint.class, str);
    }

    public static PostingMetricsEntryPoint[] values() {
        return (PostingMetricsEntryPoint[]) $VALUES.clone();
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
