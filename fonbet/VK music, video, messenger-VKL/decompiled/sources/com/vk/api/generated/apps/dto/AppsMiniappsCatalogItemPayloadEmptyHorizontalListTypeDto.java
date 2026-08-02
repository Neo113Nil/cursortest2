package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto[] $VALUES;
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto> CREATOR;

    @pmi0("empty_horizontal_list")
    public static final AppsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto EMPTY_HORIZONTAL_LIST;
    private final String value;

    /* compiled from: AppsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto createFromParcel(Parcel parcel) {
            return AppsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto[i];
        }
    }

    static {
        AppsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto appsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto = new AppsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto("EMPTY_HORIZONTAL_LIST", 0, "empty_horizontal_list");
        EMPTY_HORIZONTAL_LIST = appsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto;
        AppsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto[] appsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDtoArr = {appsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto};
        $VALUES = appsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDtoArr;
        $ENTRIES = new asp(appsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDtoArr);
        CREATOR = new a();
    }

    private AppsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto valueOf(String str) {
        return (AppsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto) Enum.valueOf(AppsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto.class, str);
    }

    public static AppsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto[] values() {
        return (AppsMiniappsCatalogItemPayloadEmptyHorizontalListTypeDto[]) $VALUES.clone();
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
