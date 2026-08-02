package com.vk.newsfeed.posting.impl.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.qoy;
import xsna.vu5;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class PostingGroupInfo implements Parcelable {
    public static final Parcelable.Creator<PostingGroupInfo> CREATOR = new a();
    public final UserId b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;

    /* compiled from: PostingViewState.kt */
    public static final class a implements Parcelable.Creator<PostingGroupInfo> {
        @Override // android.os.Parcelable.Creator
        public final PostingGroupInfo createFromParcel(Parcel parcel) {
            boolean z;
            UserId userId = (UserId) parcel.readParcelable(PostingGroupInfo.class.getClassLoader());
            boolean z2 = false;
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new PostingGroupInfo(userId, z3, z2, parcel.readInt() == 0 ? z : true, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PostingGroupInfo[] newArray(int i) {
            return new PostingGroupInfo[i];
        }
    }

    public PostingGroupInfo(UserId userId, boolean z, boolean z2, boolean z3, int i) {
        this.b = userId;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostingGroupInfo)) {
            return false;
        }
        PostingGroupInfo postingGroupInfo = (PostingGroupInfo) obj;
        return epx.f(this.b, postingGroupInfo.b) && this.c == postingGroupInfo.c && this.d == postingGroupInfo.d && this.e == postingGroupInfo.e && this.f == postingGroupInfo.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + qoy.b(qoy.b(qoy.b(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingGroupInfo(id=");
        sb.append(this.b);
        sb.append(", isBusiness=");
        sb.append(this.c);
        sb.append(", isMarketEnabled=");
        sb.append(this.d);
        sb.append(", isAdmin=");
        sb.append(this.e);
        sb.append(", adminLevel=");
        return vu5.b(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f);
    }
}
