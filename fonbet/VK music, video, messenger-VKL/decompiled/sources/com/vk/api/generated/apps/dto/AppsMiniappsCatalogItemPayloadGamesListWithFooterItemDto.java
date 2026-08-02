package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: AppsMiniappsCatalogItemPayloadGamesListWithFooterItemDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadGamesListWithFooterItemDto implements Parcelable {
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesListWithFooterItemDto> CREATOR = new a();

    @pmi0("footer")
    private final AppsMiniappsCatalogItemPayloadGamesUserStackDto footer;

    @pmi0("payload")
    private final AppsMiniappsCatalogGameDto payload;

    /* compiled from: AppsMiniappsCatalogItemPayloadGamesListWithFooterItemDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesListWithFooterItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadGamesListWithFooterItemDto createFromParcel(Parcel parcel) {
            return new AppsMiniappsCatalogItemPayloadGamesListWithFooterItemDto(AppsMiniappsCatalogItemPayloadGamesUserStackDto.CREATOR.createFromParcel(parcel), AppsMiniappsCatalogGameDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadGamesListWithFooterItemDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadGamesListWithFooterItemDto[i];
        }
    }

    public AppsMiniappsCatalogItemPayloadGamesListWithFooterItemDto(AppsMiniappsCatalogItemPayloadGamesUserStackDto appsMiniappsCatalogItemPayloadGamesUserStackDto, AppsMiniappsCatalogGameDto appsMiniappsCatalogGameDto) {
        this.footer = appsMiniappsCatalogItemPayloadGamesUserStackDto;
        this.payload = appsMiniappsCatalogGameDto;
    }

    public final AppsMiniappsCatalogGameDto d() {
        return this.payload;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsMiniappsCatalogItemPayloadGamesListWithFooterItemDto)) {
            return false;
        }
        AppsMiniappsCatalogItemPayloadGamesListWithFooterItemDto appsMiniappsCatalogItemPayloadGamesListWithFooterItemDto = (AppsMiniappsCatalogItemPayloadGamesListWithFooterItemDto) obj;
        return epx.f(this.footer, appsMiniappsCatalogItemPayloadGamesListWithFooterItemDto.footer) && epx.f(this.payload, appsMiniappsCatalogItemPayloadGamesListWithFooterItemDto.payload);
    }

    public final int hashCode() {
        return this.payload.hashCode() + (this.footer.hashCode() * 31);
    }

    public final String toString() {
        return "AppsMiniappsCatalogItemPayloadGamesListWithFooterItemDto(footer=" + this.footer + ", payload=" + this.payload + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.footer.writeToParcel(parcel, i);
        this.payload.writeToParcel(parcel, i);
    }
}
