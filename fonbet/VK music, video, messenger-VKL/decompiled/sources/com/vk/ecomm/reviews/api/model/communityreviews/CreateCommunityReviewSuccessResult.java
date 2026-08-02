package com.vk.ecomm.reviews.api.model.communityreviews;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: CreateCommunityReviewSuccessResult.kt */
/* loaded from: classes18.dex */
public final class CreateCommunityReviewSuccessResult implements Parcelable {
    public static final Parcelable.Creator<CreateCommunityReviewSuccessResult> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: CreateCommunityReviewSuccessResult.kt */
    public static final class a implements Parcelable.Creator<CreateCommunityReviewSuccessResult> {
        @Override // android.os.Parcelable.Creator
        public final CreateCommunityReviewSuccessResult createFromParcel(Parcel parcel) {
            return new CreateCommunityReviewSuccessResult(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CreateCommunityReviewSuccessResult[] newArray(int i) {
            return new CreateCommunityReviewSuccessResult[i];
        }
    }

    public CreateCommunityReviewSuccessResult(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
