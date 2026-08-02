package com.vk.ecomm.reviews.impl.reviewfriends.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.urd0;
import xsna.vu5;

/* compiled from: ReviewFriendsItem.kt */
/* loaded from: classes18.dex */
public final class ReviewFriendsItem implements Parcelable {
    public static final Parcelable.Creator<ReviewFriendsItem> CREATOR = new a();
    public final UserId b;
    public final String c;
    public final String d;
    public final int e;

    /* compiled from: ReviewFriendsItem.kt */
    public static final class a implements Parcelable.Creator<ReviewFriendsItem> {
        @Override // android.os.Parcelable.Creator
        public final ReviewFriendsItem createFromParcel(Parcel parcel) {
            return new ReviewFriendsItem((UserId) parcel.readParcelable(ReviewFriendsItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ReviewFriendsItem[] newArray(int i) {
            return new ReviewFriendsItem[i];
        }
    }

    public ReviewFriendsItem(UserId userId, String str, String str2, int i) {
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewFriendsItem)) {
            return false;
        }
        ReviewFriendsItem reviewFriendsItem = (ReviewFriendsItem) obj;
        return epx.f(this.b, reviewFriendsItem.b) && epx.f(this.c, reviewFriendsItem.c) && epx.f(this.d, reviewFriendsItem.d) && this.e == reviewFriendsItem.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + urd0.a(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewFriendsItem(userId=");
        sb.append(this.b);
        sb.append(", avatarUrl=");
        sb.append(this.c);
        sb.append(", username=");
        sb.append(this.d);
        sb.append(", rating=");
        return vu5.b(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
    }
}
