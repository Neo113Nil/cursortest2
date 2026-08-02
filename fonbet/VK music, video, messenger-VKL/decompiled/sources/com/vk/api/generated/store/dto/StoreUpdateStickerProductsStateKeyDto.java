package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoreUpdateStickerProductsStateKeyDto.kt */
/* loaded from: classes15.dex */
public final class StoreUpdateStickerProductsStateKeyDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoreUpdateStickerProductsStateKeyDto[] $VALUES;
    public static final Parcelable.Creator<StoreUpdateStickerProductsStateKeyDto> CREATOR;

    @pmi0("is_new")
    public static final StoreUpdateStickerProductsStateKeyDto IS_NEW;
    private final String value;

    /* compiled from: StoreUpdateStickerProductsStateKeyDto.kt */
    public static final class a implements Parcelable.Creator<StoreUpdateStickerProductsStateKeyDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreUpdateStickerProductsStateKeyDto createFromParcel(Parcel parcel) {
            return StoreUpdateStickerProductsStateKeyDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoreUpdateStickerProductsStateKeyDto[] newArray(int i) {
            return new StoreUpdateStickerProductsStateKeyDto[i];
        }
    }

    static {
        StoreUpdateStickerProductsStateKeyDto storeUpdateStickerProductsStateKeyDto = new StoreUpdateStickerProductsStateKeyDto("IS_NEW", 0, "is_new");
        IS_NEW = storeUpdateStickerProductsStateKeyDto;
        StoreUpdateStickerProductsStateKeyDto[] storeUpdateStickerProductsStateKeyDtoArr = {storeUpdateStickerProductsStateKeyDto};
        $VALUES = storeUpdateStickerProductsStateKeyDtoArr;
        $ENTRIES = new asp(storeUpdateStickerProductsStateKeyDtoArr);
        CREATOR = new a();
    }

    private StoreUpdateStickerProductsStateKeyDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static StoreUpdateStickerProductsStateKeyDto valueOf(String str) {
        return (StoreUpdateStickerProductsStateKeyDto) Enum.valueOf(StoreUpdateStickerProductsStateKeyDto.class, str);
    }

    public static StoreUpdateStickerProductsStateKeyDto[] values() {
        return (StoreUpdateStickerProductsStateKeyDto[]) $VALUES.clone();
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
