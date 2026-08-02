package com.vk.clips.upload.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: TrendingHashtagData.kt */
/* loaded from: classes17.dex */
public final class TrendingHashtagData implements Parcelable {
    public static final Parcelable.Creator<TrendingHashtagData> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: TrendingHashtagData.kt */
    public static final class a implements Parcelable.Creator<TrendingHashtagData> {
        @Override // android.os.Parcelable.Creator
        public final TrendingHashtagData createFromParcel(Parcel parcel) {
            return new TrendingHashtagData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TrendingHashtagData[] newArray(int i) {
            return new TrendingHashtagData[i];
        }
    }

    public TrendingHashtagData(String str, String str2) {
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
        if (!(obj instanceof TrendingHashtagData)) {
            return false;
        }
        TrendingHashtagData trendingHashtagData = (TrendingHashtagData) obj;
        return epx.f(this.b, trendingHashtagData.b) && epx.f(this.c, trendingHashtagData.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrendingHashtagData(hashtag=");
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
