package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AppsMiniappsCatalogItemPayloadCategoriesHorizontalListItemDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadCategoriesHorizontalListItemDto implements Parcelable {
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadCategoriesHorizontalListItemDto> CREATOR = new a();

    @pmi0("section_id")
    private final String sectionId;

    @pmi0("title")
    private final String title;

    /* compiled from: AppsMiniappsCatalogItemPayloadCategoriesHorizontalListItemDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadCategoriesHorizontalListItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadCategoriesHorizontalListItemDto createFromParcel(Parcel parcel) {
            return new AppsMiniappsCatalogItemPayloadCategoriesHorizontalListItemDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadCategoriesHorizontalListItemDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadCategoriesHorizontalListItemDto[i];
        }
    }

    public AppsMiniappsCatalogItemPayloadCategoriesHorizontalListItemDto(String str, String str2) {
        this.title = str;
        this.sectionId = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsMiniappsCatalogItemPayloadCategoriesHorizontalListItemDto)) {
            return false;
        }
        AppsMiniappsCatalogItemPayloadCategoriesHorizontalListItemDto appsMiniappsCatalogItemPayloadCategoriesHorizontalListItemDto = (AppsMiniappsCatalogItemPayloadCategoriesHorizontalListItemDto) obj;
        return epx.f(this.title, appsMiniappsCatalogItemPayloadCategoriesHorizontalListItemDto.title) && epx.f(this.sectionId, appsMiniappsCatalogItemPayloadCategoriesHorizontalListItemDto.sectionId);
    }

    public final int hashCode() {
        return this.sectionId.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadCategoriesHorizontalListItemDto(title=");
        sb.append(this.title);
        sb.append(", sectionId=");
        return ho8.a(sb, this.sectionId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.sectionId);
    }
}
