package com.vk.ecomm.reviews.api.model.friendsreview;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;

/* compiled from: ReviewFriendsDialogArgs.kt */
/* loaded from: classes18.dex */
public final class ReviewFriendsDialogArgs implements Parcelable {
    public static final Parcelable.Creator<ReviewFriendsDialogArgs> CREATOR = new a();
    public final UserId b;

    /* compiled from: ReviewFriendsDialogArgs.kt */
    public static final class a implements Parcelable.Creator<ReviewFriendsDialogArgs> {
        @Override // android.os.Parcelable.Creator
        public final ReviewFriendsDialogArgs createFromParcel(Parcel parcel) {
            return new ReviewFriendsDialogArgs((UserId) parcel.readParcelable(ReviewFriendsDialogArgs.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ReviewFriendsDialogArgs[] newArray(int i) {
            return new ReviewFriendsDialogArgs[i];
        }
    }

    public ReviewFriendsDialogArgs(UserId userId) {
        this.b = userId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReviewFriendsDialogArgs) && epx.f(this.b, ((ReviewFriendsDialogArgs) obj).b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("ReviewFriendsDialogArgs(communityId="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
