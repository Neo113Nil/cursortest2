package com.vk.video.channel.aboutchannel;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;

/* compiled from: AboutChannelArguments.kt */
/* loaded from: classes5.dex */
public final class AboutChannelArguments implements Parcelable {
    public static final Parcelable.Creator<AboutChannelArguments> CREATOR = new a();
    public final ChannelInfo b;

    /* compiled from: AboutChannelArguments.kt */
    public static final class a implements Parcelable.Creator<AboutChannelArguments> {
        @Override // android.os.Parcelable.Creator
        public final AboutChannelArguments createFromParcel(Parcel parcel) {
            return new AboutChannelArguments((ChannelInfo) parcel.readParcelable(AboutChannelArguments.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AboutChannelArguments[] newArray(int i) {
            return new AboutChannelArguments[i];
        }
    }

    public AboutChannelArguments(ChannelInfo channelInfo) {
        this.b = channelInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AboutChannelArguments) && epx.f(this.b, ((AboutChannelArguments) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "AboutChannelArguments(channelInfo=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
