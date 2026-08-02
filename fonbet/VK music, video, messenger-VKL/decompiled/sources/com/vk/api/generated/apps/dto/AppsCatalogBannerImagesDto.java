package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsCatalogBannerImagesDto.kt */
/* loaded from: classes14.dex */
public final class AppsCatalogBannerImagesDto implements Parcelable {
    public static final Parcelable.Creator<AppsCatalogBannerImagesDto> CREATOR = new a();

    @pmi0("banner_240")
    private final String banner240;

    @pmi0("banner_480")
    private final String banner480;

    @pmi0("banner_960")
    private final String banner960;

    /* compiled from: AppsCatalogBannerImagesDto.kt */
    public static final class a implements Parcelable.Creator<AppsCatalogBannerImagesDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsCatalogBannerImagesDto createFromParcel(Parcel parcel) {
            return new AppsCatalogBannerImagesDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsCatalogBannerImagesDto[] newArray(int i) {
            return new AppsCatalogBannerImagesDto[i];
        }
    }

    public AppsCatalogBannerImagesDto() {
        this(null, null, null, 7, null);
    }

    public final String d() {
        return this.banner240;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.banner480;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsCatalogBannerImagesDto)) {
            return false;
        }
        AppsCatalogBannerImagesDto appsCatalogBannerImagesDto = (AppsCatalogBannerImagesDto) obj;
        return epx.f(this.banner240, appsCatalogBannerImagesDto.banner240) && epx.f(this.banner480, appsCatalogBannerImagesDto.banner480) && epx.f(this.banner960, appsCatalogBannerImagesDto.banner960);
    }

    public final String f() {
        return this.banner960;
    }

    public final int hashCode() {
        String str = this.banner240;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.banner480;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.banner960;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsCatalogBannerImagesDto(banner240=");
        sb.append(this.banner240);
        sb.append(", banner480=");
        sb.append(this.banner480);
        sb.append(", banner960=");
        return ho8.a(sb, this.banner960, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.banner240);
        parcel.writeString(this.banner480);
        parcel.writeString(this.banner960);
    }

    public AppsCatalogBannerImagesDto(String str, String str2, String str3) {
        this.banner240 = str;
        this.banner480 = str2;
        this.banner960 = str3;
    }

    public /* synthetic */ AppsCatalogBannerImagesDto(String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
