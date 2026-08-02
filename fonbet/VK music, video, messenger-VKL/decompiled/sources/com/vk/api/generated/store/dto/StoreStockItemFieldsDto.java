package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoreStockItemFieldsDto.kt */
/* loaded from: classes15.dex */
public final class StoreStockItemFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoreStockItemFieldsDto[] $VALUES;
    public static final Parcelable.Creator<StoreStockItemFieldsDto> CREATOR;

    @pmi0("stickers_author_subscription")
    public static final StoreStockItemFieldsDto STICKERS_AUTHOR_SUBSCRIPTION;

    @pmi0("wishlists_status")
    public static final StoreStockItemFieldsDto WISHLISTS_STATUS;
    private final String value;

    /* compiled from: StoreStockItemFieldsDto.kt */
    public static final class a implements Parcelable.Creator<StoreStockItemFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreStockItemFieldsDto createFromParcel(Parcel parcel) {
            return StoreStockItemFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoreStockItemFieldsDto[] newArray(int i) {
            return new StoreStockItemFieldsDto[i];
        }
    }

    static {
        StoreStockItemFieldsDto storeStockItemFieldsDto = new StoreStockItemFieldsDto("WISHLISTS_STATUS", 0, "wishlists_status");
        WISHLISTS_STATUS = storeStockItemFieldsDto;
        StoreStockItemFieldsDto storeStockItemFieldsDto2 = new StoreStockItemFieldsDto("STICKERS_AUTHOR_SUBSCRIPTION", 1, "stickers_author_subscription");
        STICKERS_AUTHOR_SUBSCRIPTION = storeStockItemFieldsDto2;
        StoreStockItemFieldsDto[] storeStockItemFieldsDtoArr = {storeStockItemFieldsDto, storeStockItemFieldsDto2};
        $VALUES = storeStockItemFieldsDtoArr;
        $ENTRIES = new asp(storeStockItemFieldsDtoArr);
        CREATOR = new a();
    }

    private StoreStockItemFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static StoreStockItemFieldsDto valueOf(String str) {
        return (StoreStockItemFieldsDto) Enum.valueOf(StoreStockItemFieldsDto.class, str);
    }

    public static StoreStockItemFieldsDto[] values() {
        return (StoreStockItemFieldsDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
