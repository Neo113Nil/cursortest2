package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import xsna.vu5;

/* compiled from: PostingAction.kt */
/* loaded from: classes4.dex */
public final class PostingAction$TechStats$Posting$SaveCreateTime implements PostingAction.TechStats {
    public static final Parcelable.Creator<PostingAction$TechStats$Posting$SaveCreateTime> CREATOR = new a();
    public final long b;

    /* compiled from: PostingAction.kt */
    public static final class a implements Parcelable.Creator<PostingAction$TechStats$Posting$SaveCreateTime> {
        @Override // android.os.Parcelable.Creator
        public final PostingAction$TechStats$Posting$SaveCreateTime createFromParcel(Parcel parcel) {
            return new PostingAction$TechStats$Posting$SaveCreateTime(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final PostingAction$TechStats$Posting$SaveCreateTime[] newArray(int i) {
            return new PostingAction$TechStats$Posting$SaveCreateTime[i];
        }
    }

    public PostingAction$TechStats$Posting$SaveCreateTime(long j) {
        this.b = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PostingAction$TechStats$Posting$SaveCreateTime) && this.b == ((PostingAction$TechStats$Posting$SaveCreateTime) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return vu5.a(')', this.b, new StringBuilder("SaveCreateTime(elapsedTime="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
    }
}
