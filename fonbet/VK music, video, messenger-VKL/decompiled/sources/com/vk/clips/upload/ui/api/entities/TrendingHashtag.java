package com.vk.clips.upload.ui.api.entities;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: TrendingHashtag.kt */
/* loaded from: classes17.dex */
public final class TrendingHashtag implements Parcelable {
    public static final Parcelable.Creator<TrendingHashtag> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: TrendingHashtag.kt */
    public static final class a implements Parcelable.Creator<TrendingHashtag> {
        @Override // android.os.Parcelable.Creator
        public final TrendingHashtag createFromParcel(Parcel parcel) {
            return new TrendingHashtag(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TrendingHashtag[] newArray(int i) {
            return new TrendingHashtag[i];
        }
    }

    public TrendingHashtag(String str, String str2) {
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
        if (!(obj instanceof TrendingHashtag)) {
            return false;
        }
        TrendingHashtag trendingHashtag = (TrendingHashtag) obj;
        return epx.f(this.b, trendingHashtag.b) && epx.f(this.c, trendingHashtag.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrendingHashtag(hashtag=");
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
