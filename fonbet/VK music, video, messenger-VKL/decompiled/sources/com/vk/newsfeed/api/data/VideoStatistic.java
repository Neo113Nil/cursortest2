package com.vk.newsfeed.api.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.qoy;
import xsna.shy;

/* compiled from: VideoStatistic.kt */
/* loaded from: classes3.dex */
public final class VideoStatistic implements Parcelable {
    public static final Parcelable.Creator<VideoStatistic> CREATOR = new a();
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    /* compiled from: VideoStatistic.kt */
    public static final class a implements Parcelable.Creator<VideoStatistic> {
        @Override // android.os.Parcelable.Creator
        public final VideoStatistic createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            boolean z4 = false;
            boolean z5 = true;
            boolean z6 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z5 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z;
                z = z2;
            } else {
                z3 = z;
            }
            if (parcel.readInt() == 0) {
                z2 = z3;
            }
            return new VideoStatistic(readInt, readInt2, readInt3, z6, z4, z5, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoStatistic[] newArray(int i) {
            return new VideoStatistic[i];
        }
    }

    public VideoStatistic(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoStatistic)) {
            return false;
        }
        VideoStatistic videoStatistic = (VideoStatistic) obj;
        return this.b == videoStatistic.b && this.c == videoStatistic.c && this.d == videoStatistic.d && this.e == videoStatistic.e && this.f == videoStatistic.f && this.g == videoStatistic.g && this.h == videoStatistic.h && this.i == videoStatistic.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + qoy.b(qoy.b(qoy.b(qoy.b(shy.a(this.d, shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoStatistic(totalVideoLikes=");
        sb.append(this.b);
        sb.append(", totalVideoReposts=");
        sb.append(this.c);
        sb.append(", totalVideoViews=");
        sb.append(this.d);
        sb.append(", liked=");
        sb.append(this.e);
        sb.append(", reposted=");
        sb.append(this.f);
        sb.append(", canLike=");
        sb.append(this.g);
        sb.append(", canRepost=");
        sb.append(this.h);
        sb.append(", canComment=");
        return q0.a(sb, this.i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
    }
}
