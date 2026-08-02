package com.vk.accountmanager;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: VideoAccountStrikeInfo.kt */
/* loaded from: classes14.dex */
public final class VideoAccountStrikeInfo implements Parcelable {
    public static final Parcelable.Creator<VideoAccountStrikeInfo> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: VideoAccountStrikeInfo.kt */
    public static final class a implements Parcelable.Creator<VideoAccountStrikeInfo> {
        @Override // android.os.Parcelable.Creator
        public final VideoAccountStrikeInfo createFromParcel(Parcel parcel) {
            return new VideoAccountStrikeInfo(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAccountStrikeInfo[] newArray(int i) {
            return new VideoAccountStrikeInfo[i];
        }
    }

    public VideoAccountStrikeInfo(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAccountStrikeInfo)) {
            return false;
        }
        VideoAccountStrikeInfo videoAccountStrikeInfo = (VideoAccountStrikeInfo) obj;
        return epx.f(this.b, videoAccountStrikeInfo.b) && epx.f(this.c, videoAccountStrikeInfo.c);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAccountStrikeInfo(title=");
        sb.append(this.b);
        sb.append(", description=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
