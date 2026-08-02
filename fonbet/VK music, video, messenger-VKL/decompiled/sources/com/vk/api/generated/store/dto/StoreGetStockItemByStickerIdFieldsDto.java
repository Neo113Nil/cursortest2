package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoreGetStockItemByStickerIdFieldsDto.kt */
/* loaded from: classes15.dex */
public final class StoreGetStockItemByStickerIdFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoreGetStockItemByStickerIdFieldsDto[] $VALUES;
    public static final Parcelable.Creator<StoreGetStockItemByStickerIdFieldsDto> CREATOR;

    @pmi0("stickers_author_subscription")
    public static final StoreGetStockItemByStickerIdFieldsDto STICKERS_AUTHOR_SUBSCRIPTION;

    @pmi0("wishlists_status")
    public static final StoreGetStockItemByStickerIdFieldsDto WISHLISTS_STATUS;
    private final String value;

    /* compiled from: StoreGetStockItemByStickerIdFieldsDto.kt */
    public static final class a implements Parcelable.Creator<StoreGetStockItemByStickerIdFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreGetStockItemByStickerIdFieldsDto createFromParcel(Parcel parcel) {
            return StoreGetStockItemByStickerIdFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoreGetStockItemByStickerIdFieldsDto[] newArray(int i) {
            return new StoreGetStockItemByStickerIdFieldsDto[i];
        }
    }

    static {
        StoreGetStockItemByStickerIdFieldsDto storeGetStockItemByStickerIdFieldsDto = new StoreGetStockItemByStickerIdFieldsDto("STICKERS_AUTHOR_SUBSCRIPTION", 0, "stickers_author_subscription");
        STICKERS_AUTHOR_SUBSCRIPTION = storeGetStockItemByStickerIdFieldsDto;
        StoreGetStockItemByStickerIdFieldsDto storeGetStockItemByStickerIdFieldsDto2 = new StoreGetStockItemByStickerIdFieldsDto("WISHLISTS_STATUS", 1, "wishlists_status");
        WISHLISTS_STATUS = storeGetStockItemByStickerIdFieldsDto2;
        StoreGetStockItemByStickerIdFieldsDto[] storeGetStockItemByStickerIdFieldsDtoArr = {storeGetStockItemByStickerIdFieldsDto, storeGetStockItemByStickerIdFieldsDto2};
        $VALUES = storeGetStockItemByStickerIdFieldsDtoArr;
        $ENTRIES = new asp(storeGetStockItemByStickerIdFieldsDtoArr);
        CREATOR = new a();
    }

    private StoreGetStockItemByStickerIdFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static StoreGetStockItemByStickerIdFieldsDto valueOf(String str) {
        return (StoreGetStockItemByStickerIdFieldsDto) Enum.valueOf(StoreGetStockItemByStickerIdFieldsDto.class, str);
    }

    public static StoreGetStockItemByStickerIdFieldsDto[] values() {
        return (StoreGetStockItemByStickerIdFieldsDto[]) $VALUES.clone();
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
