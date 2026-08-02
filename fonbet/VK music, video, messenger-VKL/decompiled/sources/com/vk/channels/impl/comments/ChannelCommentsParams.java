package com.vk.channels.impl.comments;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.shy;
import xsna.uqi;

/* compiled from: ChannelCommentsParams.kt */
/* loaded from: classes16.dex */
public final class ChannelCommentsParams implements Parcelable {
    public static final Parcelable.Creator<ChannelCommentsParams> CREATOR = new a();
    public final long b;
    public final int c;
    public final Integer d;

    /* compiled from: ChannelCommentsParams.kt */
    public static final class a implements Parcelable.Creator<ChannelCommentsParams> {
        @Override // android.os.Parcelable.Creator
        public final ChannelCommentsParams createFromParcel(Parcel parcel) {
            return new ChannelCommentsParams(parcel.readLong(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelCommentsParams[] newArray(int i) {
            return new ChannelCommentsParams[i];
        }
    }

    public ChannelCommentsParams(long j, int i, Integer num) {
        this.b = j;
        this.c = i;
        this.d = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelCommentsParams)) {
            return false;
        }
        ChannelCommentsParams channelCommentsParams = (ChannelCommentsParams) obj;
        return this.b == channelCommentsParams.b && this.c == channelCommentsParams.c && epx.f(this.d, channelCommentsParams.d);
    }

    public final int hashCode() {
        int a2 = shy.a(this.c, Long.hashCode(this.b) * 31, 31);
        Integer num = this.d;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelCommentsParams(channelId=");
        sb.append(this.b);
        sb.append(", cnvMsgId=");
        sb.append(this.c);
        sb.append(", commentId=");
        return uqi.b(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }
}
