package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import xsna.epx;
import xsna.iq;

/* compiled from: PostingAction.kt */
/* loaded from: classes4.dex */
public final class PostingAction$TechStats$Posting$SaveStartTime implements PostingAction.TechStats {
    public static final Parcelable.Creator<PostingAction$TechStats$Posting$SaveStartTime> CREATOR = new a();
    public final Long b;
    public final Long c;

    /* compiled from: PostingAction.kt */
    public static final class a implements Parcelable.Creator<PostingAction$TechStats$Posting$SaveStartTime> {
        @Override // android.os.Parcelable.Creator
        public final PostingAction$TechStats$Posting$SaveStartTime createFromParcel(Parcel parcel) {
            return new PostingAction$TechStats$Posting$SaveStartTime(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final PostingAction$TechStats$Posting$SaveStartTime[] newArray(int i) {
            return new PostingAction$TechStats$Posting$SaveStartTime[i];
        }
    }

    public PostingAction$TechStats$Posting$SaveStartTime(Long l, Long l2) {
        this.b = l;
        this.c = l2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostingAction$TechStats$Posting$SaveStartTime)) {
            return false;
        }
        PostingAction$TechStats$Posting$SaveStartTime postingAction$TechStats$Posting$SaveStartTime = (PostingAction$TechStats$Posting$SaveStartTime) obj;
        return epx.f(this.b, postingAction$TechStats$Posting$SaveStartTime.b) && epx.f(this.c, postingAction$TechStats$Posting$SaveStartTime.c);
    }

    public final int hashCode() {
        Long l = this.b;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.c;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SaveStartTime(startScreenTime=");
        sb.append(this.b);
        sb.append(", startScreenElapsedTime=");
        return iq.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.b;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            io.reactivex.rxjava3.subjects.b.f(parcel, 1, l);
        }
        Long l2 = this.c;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            io.reactivex.rxjava3.subjects.b.f(parcel, 1, l2);
        }
    }
}
