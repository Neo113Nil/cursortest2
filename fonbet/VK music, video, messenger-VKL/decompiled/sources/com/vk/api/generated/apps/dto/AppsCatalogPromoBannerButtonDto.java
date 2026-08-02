package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: AppsCatalogPromoBannerButtonDto.kt */
/* loaded from: classes14.dex */
public final class AppsCatalogPromoBannerButtonDto implements Parcelable {
    public static final Parcelable.Creator<AppsCatalogPromoBannerButtonDto> CREATOR = new a();

    @pmi0("action")
    private final AppsCatalogBaseActionDto action;

    @pmi0("title")
    private final String title;

    /* compiled from: AppsCatalogPromoBannerButtonDto.kt */
    public static final class a implements Parcelable.Creator<AppsCatalogPromoBannerButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsCatalogPromoBannerButtonDto createFromParcel(Parcel parcel) {
            return new AppsCatalogPromoBannerButtonDto(parcel.readString(), AppsCatalogBaseActionDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsCatalogPromoBannerButtonDto[] newArray(int i) {
            return new AppsCatalogPromoBannerButtonDto[i];
        }
    }

    public AppsCatalogPromoBannerButtonDto(String str, AppsCatalogBaseActionDto appsCatalogBaseActionDto) {
        this.title = str;
        this.action = appsCatalogBaseActionDto;
    }

    public final AppsCatalogBaseActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsCatalogPromoBannerButtonDto)) {
            return false;
        }
        AppsCatalogPromoBannerButtonDto appsCatalogPromoBannerButtonDto = (AppsCatalogPromoBannerButtonDto) obj;
        return epx.f(this.title, appsCatalogPromoBannerButtonDto.title) && epx.f(this.action, appsCatalogPromoBannerButtonDto.action);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.action.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return "AppsCatalogPromoBannerButtonDto(title=" + this.title + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        this.action.writeToParcel(parcel, i);
    }
}
