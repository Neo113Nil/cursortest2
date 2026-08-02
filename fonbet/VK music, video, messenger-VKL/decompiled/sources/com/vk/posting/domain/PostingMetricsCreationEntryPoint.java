package com.vk.posting.domain;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostingMetricsCreationEntryPoint.kt */
/* loaded from: classes18.dex */
public final class PostingMetricsCreationEntryPoint implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PostingMetricsCreationEntryPoint[] $VALUES;
    public static final Parcelable.Creator<PostingMetricsCreationEntryPoint> CREATOR;
    public static final PostingMetricsCreationEntryPoint ChannelWriteBarButton;
    public static final PostingMetricsCreationEntryPoint CommunityCreationOnboarding;
    public static final a Companion;
    public static final PostingMetricsCreationEntryPoint FeedDeleteDraft;
    public static final PostingMetricsCreationEntryPoint FeedDeleteDraftThreeDots;
    public static final PostingMetricsCreationEntryPoint FeedEditDraft;
    public static final PostingMetricsCreationEntryPoint FeedEditDraftThreeDots;
    public static final PostingMetricsCreationEntryPoint FeedPlus;
    public static final PostingMetricsCreationEntryPoint GroupWallButton;
    public static final PostingMetricsCreationEntryPoint ListDeleteDraftThreeDots;
    public static final PostingMetricsCreationEntryPoint ListEditDraft;
    public static final PostingMetricsCreationEntryPoint ListEditDraftThreeDots;
    public static final PostingMetricsCreationEntryPoint Other;
    public static final PostingMetricsCreationEntryPoint PostThreeDotMenuEditItem;
    public static final PostingMetricsCreationEntryPoint ProfilePlusButton;
    public static final PostingMetricsCreationEntryPoint ProfileWallButton;

    /* compiled from: PostingMetricsCreationEntryPoint.kt */
    public static final class a {
    }

    /* compiled from: PostingMetricsCreationEntryPoint.kt */
    public static final class b implements Parcelable.Creator<PostingMetricsCreationEntryPoint> {
        @Override // android.os.Parcelable.Creator
        public final PostingMetricsCreationEntryPoint createFromParcel(Parcel parcel) {
            return PostingMetricsCreationEntryPoint.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PostingMetricsCreationEntryPoint[] newArray(int i) {
            return new PostingMetricsCreationEntryPoint[i];
        }
    }

    static {
        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint = new PostingMetricsCreationEntryPoint("FeedPlus", 0);
        FeedPlus = postingMetricsCreationEntryPoint;
        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint2 = new PostingMetricsCreationEntryPoint("GroupWallButton", 1);
        GroupWallButton = postingMetricsCreationEntryPoint2;
        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint3 = new PostingMetricsCreationEntryPoint("ProfilePlusButton", 2);
        ProfilePlusButton = postingMetricsCreationEntryPoint3;
        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint4 = new PostingMetricsCreationEntryPoint("ProfileWallButton", 3);
        ProfileWallButton = postingMetricsCreationEntryPoint4;
        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint5 = new PostingMetricsCreationEntryPoint("ChannelWriteBarButton", 4);
        ChannelWriteBarButton = postingMetricsCreationEntryPoint5;
        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint6 = new PostingMetricsCreationEntryPoint("PostThreeDotMenuEditItem", 5);
        PostThreeDotMenuEditItem = postingMetricsCreationEntryPoint6;
        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint7 = new PostingMetricsCreationEntryPoint("FeedEditDraft", 6);
        FeedEditDraft = postingMetricsCreationEntryPoint7;
        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint8 = new PostingMetricsCreationEntryPoint("FeedEditDraftThreeDots", 7);
        FeedEditDraftThreeDots = postingMetricsCreationEntryPoint8;
        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint9 = new PostingMetricsCreationEntryPoint("FeedDeleteDraft", 8);
        FeedDeleteDraft = postingMetricsCreationEntryPoint9;
        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint10 = new PostingMetricsCreationEntryPoint("FeedDeleteDraftThreeDots", 9);
        FeedDeleteDraftThreeDots = postingMetricsCreationEntryPoint10;
        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint11 = new PostingMetricsCreationEntryPoint("ListEditDraft", 10);
        ListEditDraft = postingMetricsCreationEntryPoint11;
        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint12 = new PostingMetricsCreationEntryPoint("ListEditDraftThreeDots", 11);
        ListEditDraftThreeDots = postingMetricsCreationEntryPoint12;
        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint13 = new PostingMetricsCreationEntryPoint("ListDeleteDraftThreeDots", 12);
        ListDeleteDraftThreeDots = postingMetricsCreationEntryPoint13;
        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint14 = new PostingMetricsCreationEntryPoint("CommunityCreationOnboarding", 13);
        CommunityCreationOnboarding = postingMetricsCreationEntryPoint14;
        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint15 = new PostingMetricsCreationEntryPoint("Other", 14);
        Other = postingMetricsCreationEntryPoint15;
        PostingMetricsCreationEntryPoint[] postingMetricsCreationEntryPointArr = {postingMetricsCreationEntryPoint, postingMetricsCreationEntryPoint2, postingMetricsCreationEntryPoint3, postingMetricsCreationEntryPoint4, postingMetricsCreationEntryPoint5, postingMetricsCreationEntryPoint6, postingMetricsCreationEntryPoint7, postingMetricsCreationEntryPoint8, postingMetricsCreationEntryPoint9, postingMetricsCreationEntryPoint10, postingMetricsCreationEntryPoint11, postingMetricsCreationEntryPoint12, postingMetricsCreationEntryPoint13, postingMetricsCreationEntryPoint14, postingMetricsCreationEntryPoint15};
        $VALUES = postingMetricsCreationEntryPointArr;
        $ENTRIES = new asp(postingMetricsCreationEntryPointArr);
        Companion = new a();
        CREATOR = new b();
    }

    public PostingMetricsCreationEntryPoint() {
        throw null;
    }

    public static zrp<PostingMetricsCreationEntryPoint> i() {
        return $ENTRIES;
    }

    public static PostingMetricsCreationEntryPoint valueOf(String str) {
        return (PostingMetricsCreationEntryPoint) Enum.valueOf(PostingMetricsCreationEntryPoint.class, str);
    }

    public static PostingMetricsCreationEntryPoint[] values() {
        return (PostingMetricsCreationEntryPoint[]) $VALUES.clone();
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
