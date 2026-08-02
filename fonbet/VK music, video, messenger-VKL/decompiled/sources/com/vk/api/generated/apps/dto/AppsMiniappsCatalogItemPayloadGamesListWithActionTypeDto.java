package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsMiniappsCatalogItemPayloadGamesListWithActionTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadGamesListWithActionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsMiniappsCatalogItemPayloadGamesListWithActionTypeDto[] $VALUES;

    @pmi0("app_and_action")
    public static final AppsMiniappsCatalogItemPayloadGamesListWithActionTypeDto APP_AND_ACTION;
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesListWithActionTypeDto> CREATOR;
    private final String value;

    /* compiled from: AppsMiniappsCatalogItemPayloadGamesListWithActionTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesListWithActionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadGamesListWithActionTypeDto createFromParcel(Parcel parcel) {
            return AppsMiniappsCatalogItemPayloadGamesListWithActionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadGamesListWithActionTypeDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadGamesListWithActionTypeDto[i];
        }
    }

    static {
        AppsMiniappsCatalogItemPayloadGamesListWithActionTypeDto appsMiniappsCatalogItemPayloadGamesListWithActionTypeDto = new AppsMiniappsCatalogItemPayloadGamesListWithActionTypeDto("APP_AND_ACTION", 0, "app_and_action");
        APP_AND_ACTION = appsMiniappsCatalogItemPayloadGamesListWithActionTypeDto;
        AppsMiniappsCatalogItemPayloadGamesListWithActionTypeDto[] appsMiniappsCatalogItemPayloadGamesListWithActionTypeDtoArr = {appsMiniappsCatalogItemPayloadGamesListWithActionTypeDto};
        $VALUES = appsMiniappsCatalogItemPayloadGamesListWithActionTypeDtoArr;
        $ENTRIES = new asp(appsMiniappsCatalogItemPayloadGamesListWithActionTypeDtoArr);
        CREATOR = new a();
    }

    private AppsMiniappsCatalogItemPayloadGamesListWithActionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsMiniappsCatalogItemPayloadGamesListWithActionTypeDto valueOf(String str) {
        return (AppsMiniappsCatalogItemPayloadGamesListWithActionTypeDto) Enum.valueOf(AppsMiniappsCatalogItemPayloadGamesListWithActionTypeDto.class, str);
    }

    public static AppsMiniappsCatalogItemPayloadGamesListWithActionTypeDto[] values() {
        return (AppsMiniappsCatalogItemPayloadGamesListWithActionTypeDto[]) $VALUES.clone();
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
