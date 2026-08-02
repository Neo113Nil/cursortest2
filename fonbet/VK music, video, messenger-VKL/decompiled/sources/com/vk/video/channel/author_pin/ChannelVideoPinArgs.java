package com.vk.video.channel.author_pin;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;

/* compiled from: ChannelVideoPinArgs.kt */
/* loaded from: classes5.dex */
public final class ChannelVideoPinArgs implements Parcelable {
    public static final Parcelable.Creator<ChannelVideoPinArgs> CREATOR = new a();
    public final String b;
    public final UserId c;

    /* compiled from: ChannelVideoPinArgs.kt */
    public static final class a implements Parcelable.Creator<ChannelVideoPinArgs> {
        @Override // android.os.Parcelable.Creator
        public final ChannelVideoPinArgs createFromParcel(Parcel parcel) {
            return new ChannelVideoPinArgs(parcel.readString(), (UserId) parcel.readParcelable(ChannelVideoPinArgs.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelVideoPinArgs[] newArray(int i) {
            return new ChannelVideoPinArgs[i];
        }
    }

    public ChannelVideoPinArgs(String str, UserId userId) {
        this.b = str;
        this.c = userId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelVideoPinArgs)) {
            return false;
        }
        ChannelVideoPinArgs channelVideoPinArgs = (ChannelVideoPinArgs) obj;
        return epx.f(this.b, channelVideoPinArgs.b) && epx.f(this.c, channelVideoPinArgs.c);
    }

    public final int hashCode() {
        return Long.hashCode(this.c.b) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelVideoPinArgs(videoId=");
        sb.append(this.b);
        sb.append(", channelId=");
        return gp.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
