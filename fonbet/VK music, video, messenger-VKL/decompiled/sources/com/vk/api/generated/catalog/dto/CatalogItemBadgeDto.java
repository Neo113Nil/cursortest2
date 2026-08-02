package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: CatalogItemBadgeDto.kt */
/* loaded from: classes14.dex */
public final class CatalogItemBadgeDto implements Parcelable {
    public static final Parcelable.Creator<CatalogItemBadgeDto> CREATOR = new a();

    @pmi0("badge")
    private final CatalogBadgeDto badge;

    @pmi0("item_id")
    private final String itemId;

    /* compiled from: CatalogItemBadgeDto.kt */
    public static final class a implements Parcelable.Creator<CatalogItemBadgeDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogItemBadgeDto createFromParcel(Parcel parcel) {
            return new CatalogItemBadgeDto(parcel.readString(), CatalogBadgeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogItemBadgeDto[] newArray(int i) {
            return new CatalogItemBadgeDto[i];
        }
    }

    public CatalogItemBadgeDto(String str, CatalogBadgeDto catalogBadgeDto) {
        this.itemId = str;
        this.badge = catalogBadgeDto;
    }

    public final CatalogBadgeDto d() {
        return this.badge;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.itemId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogItemBadgeDto)) {
            return false;
        }
        CatalogItemBadgeDto catalogItemBadgeDto = (CatalogItemBadgeDto) obj;
        return epx.f(this.itemId, catalogItemBadgeDto.itemId) && epx.f(this.badge, catalogItemBadgeDto.badge);
    }

    public final int hashCode() {
        return this.badge.hashCode() + (this.itemId.hashCode() * 31);
    }

    public final String toString() {
        return "CatalogItemBadgeDto(itemId=" + this.itemId + ", badge=" + this.badge + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.itemId);
        this.badge.writeToParcel(parcel, i);
    }
}
