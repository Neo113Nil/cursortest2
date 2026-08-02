package com.vk.com.vk.donut.popup.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: VideoPopupArgs.kt */
/* loaded from: classes17.dex */
public final class VideoPopupArgs implements Parcelable {
    public static final Parcelable.Creator<VideoPopupArgs> CREATOR = new a();
    public final int b;
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: VideoPopupArgs.kt */
    public static final class a implements Parcelable.Creator<VideoPopupArgs> {
        @Override // android.os.Parcelable.Creator
        public final VideoPopupArgs createFromParcel(Parcel parcel) {
            return new VideoPopupArgs(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoPopupArgs[] newArray(int i) {
            return new VideoPopupArgs[i];
        }
    }

    public VideoPopupArgs(int i, String str, String str2, String str3) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoPopupArgs)) {
            return false;
        }
        VideoPopupArgs videoPopupArgs = (VideoPopupArgs) obj;
        return this.b == videoPopupArgs.b && epx.f(this.c, videoPopupArgs.c) && epx.f(this.d, videoPopupArgs.d) && epx.f(this.e, videoPopupArgs.e);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoPopupArgs(imageResId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append(this.d);
        sb.append(", buttonText=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
