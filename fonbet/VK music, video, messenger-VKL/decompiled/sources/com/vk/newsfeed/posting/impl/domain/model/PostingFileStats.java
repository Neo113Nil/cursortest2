package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingFileType;
import xsna.bh10;
import xsna.vu5;

/* compiled from: PostingTechMetrics.kt */
/* loaded from: classes4.dex */
public final class PostingFileStats implements Parcelable {
    public static final Parcelable.Creator<PostingFileStats> CREATOR = new a();
    public final MobileOfficialAppsFeedStat$PostingFileType b;
    public final long c;
    public final long d;

    /* compiled from: PostingTechMetrics.kt */
    public static final class a implements Parcelable.Creator<PostingFileStats> {
        @Override // android.os.Parcelable.Creator
        public final PostingFileStats createFromParcel(Parcel parcel) {
            return new PostingFileStats(MobileOfficialAppsFeedStat$PostingFileType.valueOf(parcel.readString()), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final PostingFileStats[] newArray(int i) {
            return new PostingFileStats[i];
        }
    }

    public PostingFileStats(MobileOfficialAppsFeedStat$PostingFileType mobileOfficialAppsFeedStat$PostingFileType, long j, long j2) {
        this.b = mobileOfficialAppsFeedStat$PostingFileType;
        this.c = j;
        this.d = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostingFileStats)) {
            return false;
        }
        PostingFileStats postingFileStats = (PostingFileStats) obj;
        return this.b == postingFileStats.b && this.c == postingFileStats.c && this.d == postingFileStats.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + bh10.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingFileStats(type=");
        sb.append(this.b);
        sb.append(", time=");
        sb.append(this.c);
        sb.append(", size=");
        return vu5.a(')', this.d, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
    }
}
