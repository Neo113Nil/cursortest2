package com.vk.dto.stories.entities;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.vu5;

/* compiled from: StoryImSharingData.kt */
/* loaded from: classes18.dex */
public final class StoryImSharingStats implements Parcelable {
    public static final Parcelable.Creator<StoryImSharingStats> CREATOR = new a();
    public final long b;
    public final long c;

    /* compiled from: StoryImSharingData.kt */
    public static final class a implements Parcelable.Creator<StoryImSharingStats> {
        @Override // android.os.Parcelable.Creator
        public final StoryImSharingStats createFromParcel(Parcel parcel) {
            return new StoryImSharingStats(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final StoryImSharingStats[] newArray(int i) {
            return new StoryImSharingStats[i];
        }
    }

    public StoryImSharingStats(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryImSharingStats)) {
            return false;
        }
        StoryImSharingStats storyImSharingStats = (StoryImSharingStats) obj;
        return this.b == storyImSharingStats.b && this.c == storyImSharingStats.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryImSharingStats(ownerId=");
        sb.append(this.b);
        sb.append(", attachmentId=");
        return vu5.a(')', this.c, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
    }
}
