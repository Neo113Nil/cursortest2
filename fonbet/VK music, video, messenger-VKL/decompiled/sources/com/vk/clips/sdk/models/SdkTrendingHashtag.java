package com.vk.clips.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;

/* compiled from: SdkTrendingHashtag.kt */
/* loaded from: classes17.dex */
public final class SdkTrendingHashtag implements Parcelable {
    public static final Parcelable.Creator<SdkTrendingHashtag> CREATOR = new a();
    public final String b;
    public final List<String> c;

    /* compiled from: SdkTrendingHashtag.kt */
    public static final class a implements Parcelable.Creator<SdkTrendingHashtag> {
        @Override // android.os.Parcelable.Creator
        public final SdkTrendingHashtag createFromParcel(Parcel parcel) {
            return new SdkTrendingHashtag(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final SdkTrendingHashtag[] newArray(int i) {
            return new SdkTrendingHashtag[i];
        }
    }

    public SdkTrendingHashtag(String str, List<String> list) {
        this.b = str;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkTrendingHashtag)) {
            return false;
        }
        SdkTrendingHashtag sdkTrendingHashtag = (SdkTrendingHashtag) obj;
        return epx.f(this.b, sdkTrendingHashtag.b) && epx.f(this.c, sdkTrendingHashtag.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        List<String> list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkTrendingHashtag(hashtag=");
        sb.append(this.b);
        sb.append(", background=");
        return ms9.a(')', sb, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeStringList(this.c);
    }
}
