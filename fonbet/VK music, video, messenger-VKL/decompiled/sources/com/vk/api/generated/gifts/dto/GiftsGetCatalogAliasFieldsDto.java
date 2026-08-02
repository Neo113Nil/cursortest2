package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GiftsGetCatalogAliasFieldsDto.kt */
/* loaded from: classes14.dex */
public final class GiftsGetCatalogAliasFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GiftsGetCatalogAliasFieldsDto[] $VALUES;

    @pmi0("additional_view_price_buy")
    public static final GiftsGetCatalogAliasFieldsDto ADDITIONAL_VIEW_PRICE_BUY;
    public static final Parcelable.Creator<GiftsGetCatalogAliasFieldsDto> CREATOR;
    private final String value;

    /* compiled from: GiftsGetCatalogAliasFieldsDto.kt */
    public static final class a implements Parcelable.Creator<GiftsGetCatalogAliasFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsGetCatalogAliasFieldsDto createFromParcel(Parcel parcel) {
            return GiftsGetCatalogAliasFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsGetCatalogAliasFieldsDto[] newArray(int i) {
            return new GiftsGetCatalogAliasFieldsDto[i];
        }
    }

    static {
        GiftsGetCatalogAliasFieldsDto giftsGetCatalogAliasFieldsDto = new GiftsGetCatalogAliasFieldsDto("ADDITIONAL_VIEW_PRICE_BUY", 0, "additional_view_price_buy");
        ADDITIONAL_VIEW_PRICE_BUY = giftsGetCatalogAliasFieldsDto;
        GiftsGetCatalogAliasFieldsDto[] giftsGetCatalogAliasFieldsDtoArr = {giftsGetCatalogAliasFieldsDto};
        $VALUES = giftsGetCatalogAliasFieldsDtoArr;
        $ENTRIES = new asp(giftsGetCatalogAliasFieldsDtoArr);
        CREATOR = new a();
    }

    private GiftsGetCatalogAliasFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GiftsGetCatalogAliasFieldsDto valueOf(String str) {
        return (GiftsGetCatalogAliasFieldsDto) Enum.valueOf(GiftsGetCatalogAliasFieldsDto.class, str);
    }

    public static GiftsGetCatalogAliasFieldsDto[] values() {
        return (GiftsGetCatalogAliasFieldsDto[]) $VALUES.clone();
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
