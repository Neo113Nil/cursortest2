package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsCatalogBannerDto.kt */
/* loaded from: classes14.dex */
public final class AppsCatalogBannerDto implements Parcelable {
    public static final Parcelable.Creator<AppsCatalogBannerDto> CREATOR = new a();

    @pmi0("background_color")
    private final String backgroundColor;

    @pmi0("description")
    private final String description;

    @pmi0("description_color")
    private final String descriptionColor;

    @pmi0("images")
    private final AppsCatalogBannerImagesDto images;

    @pmi0("title_color")
    private final String titleColor;

    /* compiled from: AppsCatalogBannerDto.kt */
    public static final class a implements Parcelable.Creator<AppsCatalogBannerDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsCatalogBannerDto createFromParcel(Parcel parcel) {
            return new AppsCatalogBannerDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AppsCatalogBannerImagesDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsCatalogBannerDto[] newArray(int i) {
            return new AppsCatalogBannerDto[i];
        }
    }

    public AppsCatalogBannerDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final String d() {
        return this.backgroundColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.descriptionColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsCatalogBannerDto)) {
            return false;
        }
        AppsCatalogBannerDto appsCatalogBannerDto = (AppsCatalogBannerDto) obj;
        return epx.f(this.backgroundColor, appsCatalogBannerDto.backgroundColor) && epx.f(this.description, appsCatalogBannerDto.description) && epx.f(this.descriptionColor, appsCatalogBannerDto.descriptionColor) && epx.f(this.titleColor, appsCatalogBannerDto.titleColor) && epx.f(this.images, appsCatalogBannerDto.images);
    }

    public final AppsCatalogBannerImagesDto f() {
        return this.images;
    }

    public final String g() {
        return this.titleColor;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int hashCode() {
        String str = this.backgroundColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.descriptionColor;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.titleColor;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AppsCatalogBannerImagesDto appsCatalogBannerImagesDto = this.images;
        return hashCode4 + (appsCatalogBannerImagesDto != null ? appsCatalogBannerImagesDto.hashCode() : 0);
    }

    public final String toString() {
        return "AppsCatalogBannerDto(backgroundColor=" + this.backgroundColor + ", description=" + this.description + ", descriptionColor=" + this.descriptionColor + ", titleColor=" + this.titleColor + ", images=" + this.images + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.backgroundColor);
        parcel.writeString(this.description);
        parcel.writeString(this.descriptionColor);
        parcel.writeString(this.titleColor);
        AppsCatalogBannerImagesDto appsCatalogBannerImagesDto = this.images;
        if (appsCatalogBannerImagesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsCatalogBannerImagesDto.writeToParcel(parcel, i);
        }
    }

    public AppsCatalogBannerDto(String str, String str2, String str3, String str4, AppsCatalogBannerImagesDto appsCatalogBannerImagesDto) {
        this.backgroundColor = str;
        this.description = str2;
        this.descriptionColor = str3;
        this.titleColor = str4;
        this.images = appsCatalogBannerImagesDto;
    }

    public /* synthetic */ AppsCatalogBannerDto(String str, String str2, String str3, String str4, AppsCatalogBannerImagesDto appsCatalogBannerImagesDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : appsCatalogBannerImagesDto);
    }
}
