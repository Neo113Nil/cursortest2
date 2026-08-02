package com.vk.ecomm.reviews.api.model.communityreviews;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.zcl;

/* compiled from: CreateCommunityReviewResult.kt */
/* loaded from: classes18.dex */
public final class CreateCommunityReviewResult implements Parcelable {
    public static final Parcelable.Creator<CreateCommunityReviewResult> CREATOR = new a();
    public final CreateCommunityReviewErrorResult b;
    public final CreateCommunityReviewSuccessResult c;
    public final ReviewSavedData d;
    public final String e;

    /* compiled from: CreateCommunityReviewResult.kt */
    public static final class a implements Parcelable.Creator<CreateCommunityReviewResult> {
        @Override // android.os.Parcelable.Creator
        public final CreateCommunityReviewResult createFromParcel(Parcel parcel) {
            return new CreateCommunityReviewResult(parcel.readInt() == 0 ? null : CreateCommunityReviewErrorResult.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CreateCommunityReviewSuccessResult.CREATOR.createFromParcel(parcel) : null, (ReviewSavedData) parcel.readParcelable(CreateCommunityReviewResult.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CreateCommunityReviewResult[] newArray(int i) {
            return new CreateCommunityReviewResult[i];
        }
    }

    public CreateCommunityReviewResult() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CreateCommunityReviewErrorResult createCommunityReviewErrorResult = this.b;
        if (createCommunityReviewErrorResult == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            createCommunityReviewErrorResult.writeToParcel(parcel, i);
        }
        CreateCommunityReviewSuccessResult createCommunityReviewSuccessResult = this.c;
        if (createCommunityReviewSuccessResult == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            createCommunityReviewSuccessResult.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
    }

    public CreateCommunityReviewResult(CreateCommunityReviewErrorResult createCommunityReviewErrorResult, CreateCommunityReviewSuccessResult createCommunityReviewSuccessResult, ReviewSavedData reviewSavedData, String str) {
        this.b = createCommunityReviewErrorResult;
        this.c = createCommunityReviewSuccessResult;
        this.d = reviewSavedData;
        this.e = str;
    }

    public /* synthetic */ CreateCommunityReviewResult(CreateCommunityReviewErrorResult createCommunityReviewErrorResult, CreateCommunityReviewSuccessResult createCommunityReviewSuccessResult, ReviewSavedData reviewSavedData, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : createCommunityReviewErrorResult, (i & 2) != 0 ? null : createCommunityReviewSuccessResult, (i & 4) != 0 ? null : reviewSavedData, (i & 8) != 0 ? null : str);
    }
}
