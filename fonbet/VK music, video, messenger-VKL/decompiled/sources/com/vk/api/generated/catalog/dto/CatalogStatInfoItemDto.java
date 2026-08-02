package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: CatalogStatInfoItemDto.kt */
/* loaded from: classes14.dex */
public final class CatalogStatInfoItemDto implements Parcelable {
    public static final Parcelable.Creator<CatalogStatInfoItemDto> CREATOR = new a();

    @pmi0("item_id")
    private final String itemId;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: CatalogStatInfoItemDto.kt */
    public static final class a implements Parcelable.Creator<CatalogStatInfoItemDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogStatInfoItemDto createFromParcel(Parcel parcel) {
            return new CatalogStatInfoItemDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogStatInfoItemDto[] newArray(int i) {
            return new CatalogStatInfoItemDto[i];
        }
    }

    public CatalogStatInfoItemDto(String str, String str2) {
        this.itemId = str;
        this.trackCode = str2;
    }

    public final String d() {
        return this.itemId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogStatInfoItemDto)) {
            return false;
        }
        CatalogStatInfoItemDto catalogStatInfoItemDto = (CatalogStatInfoItemDto) obj;
        return epx.f(this.itemId, catalogStatInfoItemDto.itemId) && epx.f(this.trackCode, catalogStatInfoItemDto.trackCode);
    }

    public final int hashCode() {
        return this.trackCode.hashCode() + (this.itemId.hashCode() * 31);
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogStatInfoItemDto(itemId=");
        sb.append(this.itemId);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.itemId);
        parcel.writeString(this.trackCode);
    }
}
