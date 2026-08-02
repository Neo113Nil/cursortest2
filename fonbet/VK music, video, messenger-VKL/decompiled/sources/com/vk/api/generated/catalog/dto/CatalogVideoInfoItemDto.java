package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CatalogVideoInfoItemDto.kt */
/* loaded from: classes14.dex */
public final class CatalogVideoInfoItemDto implements Parcelable {
    public static final Parcelable.Creator<CatalogVideoInfoItemDto> CREATOR = new a();

    @pmi0("album_id")
    private final String albumId;

    @pmi0("video_id")
    private final String videoId;

    /* compiled from: CatalogVideoInfoItemDto.kt */
    public static final class a implements Parcelable.Creator<CatalogVideoInfoItemDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogVideoInfoItemDto createFromParcel(Parcel parcel) {
            return new CatalogVideoInfoItemDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogVideoInfoItemDto[] newArray(int i) {
            return new CatalogVideoInfoItemDto[i];
        }
    }

    public CatalogVideoInfoItemDto(String str, String str2) {
        this.videoId = str;
        this.albumId = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogVideoInfoItemDto)) {
            return false;
        }
        CatalogVideoInfoItemDto catalogVideoInfoItemDto = (CatalogVideoInfoItemDto) obj;
        return epx.f(this.videoId, catalogVideoInfoItemDto.videoId) && epx.f(this.albumId, catalogVideoInfoItemDto.albumId);
    }

    public final int hashCode() {
        int hashCode = this.videoId.hashCode() * 31;
        String str = this.albumId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogVideoInfoItemDto(videoId=");
        sb.append(this.videoId);
        sb.append(", albumId=");
        return ho8.a(sb, this.albumId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoId);
        parcel.writeString(this.albumId);
    }

    public /* synthetic */ CatalogVideoInfoItemDto(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
