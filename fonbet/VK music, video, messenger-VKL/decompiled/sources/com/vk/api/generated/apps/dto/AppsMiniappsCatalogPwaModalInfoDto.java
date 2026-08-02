package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: AppsMiniappsCatalogPwaModalInfoDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogPwaModalInfoDto implements Parcelable {
    public static final Parcelable.Creator<AppsMiniappsCatalogPwaModalInfoDto> CREATOR = new a();

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("description")
    private final String description;

    @pmi0("icon")
    private final String icon;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    /* compiled from: AppsMiniappsCatalogPwaModalInfoDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogPwaModalInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogPwaModalInfoDto createFromParcel(Parcel parcel) {
            return new AppsMiniappsCatalogPwaModalInfoDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogPwaModalInfoDto[] newArray(int i) {
            return new AppsMiniappsCatalogPwaModalInfoDto[i];
        }
    }

    public AppsMiniappsCatalogPwaModalInfoDto(String str, String str2, String str3, String str4, String str5) {
        this.title = str;
        this.description = str2;
        this.url = str3;
        this.icon = str4;
        this.buttonText = str5;
    }

    public final String d() {
        return this.buttonText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsMiniappsCatalogPwaModalInfoDto)) {
            return false;
        }
        AppsMiniappsCatalogPwaModalInfoDto appsMiniappsCatalogPwaModalInfoDto = (AppsMiniappsCatalogPwaModalInfoDto) obj;
        return epx.f(this.title, appsMiniappsCatalogPwaModalInfoDto.title) && epx.f(this.description, appsMiniappsCatalogPwaModalInfoDto.description) && epx.f(this.url, appsMiniappsCatalogPwaModalInfoDto.url) && epx.f(this.icon, appsMiniappsCatalogPwaModalInfoDto.icon) && epx.f(this.buttonText, appsMiniappsCatalogPwaModalInfoDto.buttonText);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        return this.buttonText.hashCode() + urd0.a(urd0.a(urd0.a(this.title.hashCode() * 31, 31, this.description), 31, this.url), 31, this.icon);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsMiniappsCatalogPwaModalInfoDto(title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", buttonText=");
        return ho8.a(sb, this.buttonText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.url);
        parcel.writeString(this.icon);
        parcel.writeString(this.buttonText);
    }
}
