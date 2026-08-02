package com.vk.ecomm.reviews.api.model.communityreviews;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: CreateCommunityReviewErrorResult.kt */
/* loaded from: classes18.dex */
public final class CreateCommunityReviewErrorResult implements Parcelable {
    public static final Parcelable.Creator<CreateCommunityReviewErrorResult> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: CreateCommunityReviewErrorResult.kt */
    public static final class a implements Parcelable.Creator<CreateCommunityReviewErrorResult> {
        @Override // android.os.Parcelable.Creator
        public final CreateCommunityReviewErrorResult createFromParcel(Parcel parcel) {
            return new CreateCommunityReviewErrorResult(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CreateCommunityReviewErrorResult[] newArray(int i) {
            return new CreateCommunityReviewErrorResult[i];
        }
    }

    public CreateCommunityReviewErrorResult(String str, String str2) {
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
