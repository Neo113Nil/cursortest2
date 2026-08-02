package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: AppsGamesCatalogPromoBannerDto.kt */
/* loaded from: classes14.dex */
public final class AppsGamesCatalogPromoBannerDto implements Parcelable {
    public static final Parcelable.Creator<AppsGamesCatalogPromoBannerDto> CREATOR = new a();

    @pmi0("background_images")
    private final List<BaseImageDto> backgroundImages;

    @pmi0("button")
    private final AppsCatalogPromoBannerButtonDto button;

    @pmi0("description")
    private final String description;

    @pmi0("title")
    private final String title;

    /* compiled from: AppsGamesCatalogPromoBannerDto.kt */
    public static final class a implements Parcelable.Creator<AppsGamesCatalogPromoBannerDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGamesCatalogPromoBannerDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(AppsGamesCatalogPromoBannerDto.class, parcel, arrayList, i, 1);
            }
            return new AppsGamesCatalogPromoBannerDto(readString, readString2, arrayList, AppsCatalogPromoBannerButtonDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGamesCatalogPromoBannerDto[] newArray(int i) {
            return new AppsGamesCatalogPromoBannerDto[i];
        }
    }

    public AppsGamesCatalogPromoBannerDto(String str, String str2, List<BaseImageDto> list, AppsCatalogPromoBannerButtonDto appsCatalogPromoBannerButtonDto) {
        this.title = str;
        this.description = str2;
        this.backgroundImages = list;
        this.button = appsCatalogPromoBannerButtonDto;
    }

    public final List<BaseImageDto> d() {
        return this.backgroundImages;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final AppsCatalogPromoBannerButtonDto e() {
        return this.button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGamesCatalogPromoBannerDto)) {
            return false;
        }
        AppsGamesCatalogPromoBannerDto appsGamesCatalogPromoBannerDto = (AppsGamesCatalogPromoBannerDto) obj;
        return epx.f(this.title, appsGamesCatalogPromoBannerDto.title) && epx.f(this.description, appsGamesCatalogPromoBannerDto.description) && epx.f(this.backgroundImages, appsGamesCatalogPromoBannerDto.backgroundImages) && epx.f(this.button, appsGamesCatalogPromoBannerDto.button);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.button.hashCode() + fw3.a(urd0.a(this.title.hashCode() * 31, 31, this.description), 31, this.backgroundImages);
    }

    public final String toString() {
        return "AppsGamesCatalogPromoBannerDto(title=" + this.title + ", description=" + this.description + ", backgroundImages=" + this.backgroundImages + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        Iterator a2 = ao.a(parcel, this.backgroundImages);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        this.button.writeToParcel(parcel, i);
    }
}
