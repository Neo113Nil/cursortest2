package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: ShortVideoShortVideoOrdAdvertiserDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoShortVideoOrdAdvertiserDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoShortVideoOrdAdvertiserDto> CREATOR = new a();

    @pmi0("er_id")
    private final String erId;

    @pmi0("url")
    private final String url;

    /* compiled from: ShortVideoShortVideoOrdAdvertiserDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoShortVideoOrdAdvertiserDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoOrdAdvertiserDto createFromParcel(Parcel parcel) {
            return new ShortVideoShortVideoOrdAdvertiserDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoOrdAdvertiserDto[] newArray(int i) {
            return new ShortVideoShortVideoOrdAdvertiserDto[i];
        }
    }

    public ShortVideoShortVideoOrdAdvertiserDto(String str, String str2) {
        this.url = str;
        this.erId = str2;
    }

    public final String d() {
        return this.erId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoShortVideoOrdAdvertiserDto)) {
            return false;
        }
        ShortVideoShortVideoOrdAdvertiserDto shortVideoShortVideoOrdAdvertiserDto = (ShortVideoShortVideoOrdAdvertiserDto) obj;
        return epx.f(this.url, shortVideoShortVideoOrdAdvertiserDto.url) && epx.f(this.erId, shortVideoShortVideoOrdAdvertiserDto.erId);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        return this.erId.hashCode() + (this.url.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoShortVideoOrdAdvertiserDto(url=");
        sb.append(this.url);
        sb.append(", erId=");
        return ho8.a(sb, this.erId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeString(this.erId);
    }
}
