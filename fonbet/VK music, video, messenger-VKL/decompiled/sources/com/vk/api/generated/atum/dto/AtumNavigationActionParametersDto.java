package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AtumNavigationActionParametersDto.kt */
/* loaded from: classes14.dex */
public final class AtumNavigationActionParametersDto implements Parcelable {
    public static final Parcelable.Creator<AtumNavigationActionParametersDto> CREATOR = new a();

    @pmi0("request_url")
    private final String requestUrl;

    @pmi0("title")
    private final String title;

    /* compiled from: AtumNavigationActionParametersDto.kt */
    public static final class a implements Parcelable.Creator<AtumNavigationActionParametersDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumNavigationActionParametersDto createFromParcel(Parcel parcel) {
            return new AtumNavigationActionParametersDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumNavigationActionParametersDto[] newArray(int i) {
            return new AtumNavigationActionParametersDto[i];
        }
    }

    public AtumNavigationActionParametersDto(String str, String str2) {
        this.title = str;
        this.requestUrl = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumNavigationActionParametersDto)) {
            return false;
        }
        AtumNavigationActionParametersDto atumNavigationActionParametersDto = (AtumNavigationActionParametersDto) obj;
        return epx.f(this.title, atumNavigationActionParametersDto.title) && epx.f(this.requestUrl, atumNavigationActionParametersDto.requestUrl);
    }

    public final int hashCode() {
        return this.requestUrl.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AtumNavigationActionParametersDto(title=");
        sb.append(this.title);
        sb.append(", requestUrl=");
        return ho8.a(sb, this.requestUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.requestUrl);
    }
}
