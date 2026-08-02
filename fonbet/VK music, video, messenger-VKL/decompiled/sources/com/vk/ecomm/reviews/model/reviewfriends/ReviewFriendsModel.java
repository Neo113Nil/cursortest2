package com.vk.ecomm.reviews.model.reviewfriends;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.shy;
import xsna.uqi;
import xsna.urd0;

/* compiled from: ReviewFriendsModel.kt */
/* loaded from: classes18.dex */
public final class ReviewFriendsModel implements Parcelable {
    public static final Parcelable.Creator<ReviewFriendsModel> CREATOR = new a();
    public final UserId b;
    public final String c;
    public final int d;
    public final String e;
    public final Integer f;

    /* compiled from: ReviewFriendsModel.kt */
    public static final class a implements Parcelable.Creator<ReviewFriendsModel> {
        @Override // android.os.Parcelable.Creator
        public final ReviewFriendsModel createFromParcel(Parcel parcel) {
            return new ReviewFriendsModel((UserId) parcel.readParcelable(ReviewFriendsModel.class.getClassLoader()), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final ReviewFriendsModel[] newArray(int i) {
            return new ReviewFriendsModel[i];
        }
    }

    public ReviewFriendsModel(UserId userId, String str, int i, String str2, Integer num) {
        this.b = userId;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewFriendsModel)) {
            return false;
        }
        ReviewFriendsModel reviewFriendsModel = (ReviewFriendsModel) obj;
        return epx.f(this.b, reviewFriendsModel.b) && epx.f(this.c, reviewFriendsModel.c) && this.d == reviewFriendsModel.d && epx.f(this.e, reviewFriendsModel.e) && epx.f(this.f, reviewFriendsModel.f);
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.d, urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31), 31, this.e);
        Integer num = this.f;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewFriendsModel(userdId=");
        sb.append(this.b);
        sb.append(", userName=");
        sb.append(this.c);
        sb.append(", rating=");
        sb.append(this.d);
        sb.append(", imageUrl=");
        sb.append(this.e);
        sb.append(", reviewId=");
        return uqi.b(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        Integer num = this.f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }
}
