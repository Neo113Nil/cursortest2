package com.vk.ecomm.reviews.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.vu5;

/* compiled from: CommunityRepliesArgs.kt */
/* loaded from: classes18.dex */
public final class CommunityRepliesArgs implements Parcelable {
    public static final Parcelable.Creator<CommunityRepliesArgs> CREATOR = new a();
    public final UserId b;
    public final int c;

    /* compiled from: CommunityRepliesArgs.kt */
    public static final class a implements Parcelable.Creator<CommunityRepliesArgs> {
        @Override // android.os.Parcelable.Creator
        public final CommunityRepliesArgs createFromParcel(Parcel parcel) {
            return new CommunityRepliesArgs((UserId) parcel.readParcelable(CommunityRepliesArgs.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CommunityRepliesArgs[] newArray(int i) {
            return new CommunityRepliesArgs[i];
        }
    }

    public CommunityRepliesArgs(UserId userId, int i) {
        this.b = userId;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunityRepliesArgs)) {
            return false;
        }
        CommunityRepliesArgs communityRepliesArgs = (CommunityRepliesArgs) obj;
        return epx.f(this.b, communityRepliesArgs.b) && this.c == communityRepliesArgs.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityRepliesArgs(communityId=");
        sb.append(this.b);
        sb.append(", reviewId=");
        return vu5.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
    }
}
