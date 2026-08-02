package com.vk.clips.upload.ui.impl.compose.state.viewstate;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: TrendingHashtagUiDto.kt */
/* loaded from: classes17.dex */
public final class TrendingHashtagUiDto implements Parcelable {
    public static final Parcelable.Creator<TrendingHashtagUiDto> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: TrendingHashtagUiDto.kt */
    public static final class a implements Parcelable.Creator<TrendingHashtagUiDto> {
        @Override // android.os.Parcelable.Creator
        public final TrendingHashtagUiDto createFromParcel(Parcel parcel) {
            return new TrendingHashtagUiDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TrendingHashtagUiDto[] newArray(int i) {
            return new TrendingHashtagUiDto[i];
        }
    }

    public TrendingHashtagUiDto(String str, String str2) {
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
        if (!(obj instanceof TrendingHashtagUiDto)) {
            return false;
        }
        TrendingHashtagUiDto trendingHashtagUiDto = (TrendingHashtagUiDto) obj;
        return epx.f(this.b, trendingHashtagUiDto.b) && epx.f(this.c, trendingHashtagUiDto.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrendingHashtagUiDto(hashtag=");
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
