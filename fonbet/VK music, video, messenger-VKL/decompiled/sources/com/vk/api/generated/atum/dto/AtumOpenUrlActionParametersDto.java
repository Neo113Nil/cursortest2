package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AtumOpenUrlActionParametersDto.kt */
/* loaded from: classes14.dex */
public final class AtumOpenUrlActionParametersDto implements Parcelable {
    public static final Parcelable.Creator<AtumOpenUrlActionParametersDto> CREATOR = new a();

    @pmi0("url")
    private final String url;

    /* compiled from: AtumOpenUrlActionParametersDto.kt */
    public static final class a implements Parcelable.Creator<AtumOpenUrlActionParametersDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumOpenUrlActionParametersDto createFromParcel(Parcel parcel) {
            return new AtumOpenUrlActionParametersDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumOpenUrlActionParametersDto[] newArray(int i) {
            return new AtumOpenUrlActionParametersDto[i];
        }
    }

    public AtumOpenUrlActionParametersDto(String str) {
        this.url = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AtumOpenUrlActionParametersDto) && epx.f(this.url, ((AtumOpenUrlActionParametersDto) obj).url);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("AtumOpenUrlActionParametersDto(url="), this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
    }
}
