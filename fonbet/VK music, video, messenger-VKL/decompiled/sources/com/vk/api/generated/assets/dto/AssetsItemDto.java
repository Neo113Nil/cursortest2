package com.vk.api.generated.assets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AssetsItemDto.kt */
/* loaded from: classes14.dex */
public final class AssetsItemDto implements Parcelable {
    public static final Parcelable.Creator<AssetsItemDto> CREATOR = new a();

    @pmi0("asset_id")
    private final String assetId;

    @pmi0("url")
    private final String url;

    /* compiled from: AssetsItemDto.kt */
    public static final class a implements Parcelable.Creator<AssetsItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AssetsItemDto createFromParcel(Parcel parcel) {
            return new AssetsItemDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AssetsItemDto[] newArray(int i) {
            return new AssetsItemDto[i];
        }
    }

    public AssetsItemDto(String str, String str2) {
        this.assetId = str;
        this.url = str2;
    }

    public final String d() {
        return this.assetId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetsItemDto)) {
            return false;
        }
        AssetsItemDto assetsItemDto = (AssetsItemDto) obj;
        return epx.f(this.assetId, assetsItemDto.assetId) && epx.f(this.url, assetsItemDto.url);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        return this.url.hashCode() + (this.assetId.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssetsItemDto(assetId=");
        sb.append(this.assetId);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.assetId);
        parcel.writeString(this.url);
    }
}
