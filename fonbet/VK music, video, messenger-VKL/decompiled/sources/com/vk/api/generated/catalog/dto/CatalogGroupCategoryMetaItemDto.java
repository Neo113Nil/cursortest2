package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CatalogGroupCategoryMetaItemDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGroupCategoryMetaItemDto implements Parcelable {
    public static final Parcelable.Creator<CatalogGroupCategoryMetaItemDto> CREATOR = new a();

    @pmi0("click_action")
    private final CatalogButtonDto clickAction;

    @pmi0("id")
    private final String id;

    /* compiled from: CatalogGroupCategoryMetaItemDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGroupCategoryMetaItemDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGroupCategoryMetaItemDto createFromParcel(Parcel parcel) {
            return new CatalogGroupCategoryMetaItemDto(parcel.readString(), parcel.readInt() == 0 ? null : CatalogButtonDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGroupCategoryMetaItemDto[] newArray(int i) {
            return new CatalogGroupCategoryMetaItemDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogGroupCategoryMetaItemDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final CatalogButtonDto d() {
        return this.clickAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogGroupCategoryMetaItemDto)) {
            return false;
        }
        CatalogGroupCategoryMetaItemDto catalogGroupCategoryMetaItemDto = (CatalogGroupCategoryMetaItemDto) obj;
        return epx.f(this.id, catalogGroupCategoryMetaItemDto.id) && epx.f(this.clickAction, catalogGroupCategoryMetaItemDto.clickAction);
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        CatalogButtonDto catalogButtonDto = this.clickAction;
        return hashCode + (catalogButtonDto != null ? catalogButtonDto.hashCode() : 0);
    }

    public final String toString() {
        return "CatalogGroupCategoryMetaItemDto(id=" + this.id + ", clickAction=" + this.clickAction + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        CatalogButtonDto catalogButtonDto = this.clickAction;
        if (catalogButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogButtonDto.writeToParcel(parcel, i);
        }
    }

    public CatalogGroupCategoryMetaItemDto(String str, CatalogButtonDto catalogButtonDto) {
        this.id = str;
        this.clickAction = catalogButtonDto;
    }

    public /* synthetic */ CatalogGroupCategoryMetaItemDto(String str, CatalogButtonDto catalogButtonDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : catalogButtonDto);
    }
}
