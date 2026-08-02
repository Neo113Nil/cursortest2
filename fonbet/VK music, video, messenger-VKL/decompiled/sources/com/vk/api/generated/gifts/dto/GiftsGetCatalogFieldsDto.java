package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GiftsGetCatalogFieldsDto.kt */
/* loaded from: classes14.dex */
public final class GiftsGetCatalogFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GiftsGetCatalogFieldsDto[] $VALUES;

    @pmi0("additional_view_price_buy")
    public static final GiftsGetCatalogFieldsDto ADDITIONAL_VIEW_PRICE_BUY;
    public static final Parcelable.Creator<GiftsGetCatalogFieldsDto> CREATOR;
    private final String value;

    /* compiled from: GiftsGetCatalogFieldsDto.kt */
    public static final class a implements Parcelable.Creator<GiftsGetCatalogFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsGetCatalogFieldsDto createFromParcel(Parcel parcel) {
            return GiftsGetCatalogFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsGetCatalogFieldsDto[] newArray(int i) {
            return new GiftsGetCatalogFieldsDto[i];
        }
    }

    static {
        GiftsGetCatalogFieldsDto giftsGetCatalogFieldsDto = new GiftsGetCatalogFieldsDto("ADDITIONAL_VIEW_PRICE_BUY", 0, "additional_view_price_buy");
        ADDITIONAL_VIEW_PRICE_BUY = giftsGetCatalogFieldsDto;
        GiftsGetCatalogFieldsDto[] giftsGetCatalogFieldsDtoArr = {giftsGetCatalogFieldsDto};
        $VALUES = giftsGetCatalogFieldsDtoArr;
        $ENTRIES = new asp(giftsGetCatalogFieldsDtoArr);
        CREATOR = new a();
    }

    private GiftsGetCatalogFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GiftsGetCatalogFieldsDto valueOf(String str) {
        return (GiftsGetCatalogFieldsDto) Enum.valueOf(GiftsGetCatalogFieldsDto.class, str);
    }

    public static GiftsGetCatalogFieldsDto[] values() {
        return (GiftsGetCatalogFieldsDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
