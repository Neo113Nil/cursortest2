package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsMiniappsCatalogItemPayloadGamesProfileTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadGamesProfileTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsMiniappsCatalogItemPayloadGamesProfileTypeDto[] $VALUES;
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesProfileTypeDto> CREATOR;

    @pmi0("games_profile")
    public static final AppsMiniappsCatalogItemPayloadGamesProfileTypeDto GAMES_PROFILE;
    private final String value;

    /* compiled from: AppsMiniappsCatalogItemPayloadGamesProfileTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesProfileTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadGamesProfileTypeDto createFromParcel(Parcel parcel) {
            return AppsMiniappsCatalogItemPayloadGamesProfileTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadGamesProfileTypeDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadGamesProfileTypeDto[i];
        }
    }

    static {
        AppsMiniappsCatalogItemPayloadGamesProfileTypeDto appsMiniappsCatalogItemPayloadGamesProfileTypeDto = new AppsMiniappsCatalogItemPayloadGamesProfileTypeDto("GAMES_PROFILE", 0, "games_profile");
        GAMES_PROFILE = appsMiniappsCatalogItemPayloadGamesProfileTypeDto;
        AppsMiniappsCatalogItemPayloadGamesProfileTypeDto[] appsMiniappsCatalogItemPayloadGamesProfileTypeDtoArr = {appsMiniappsCatalogItemPayloadGamesProfileTypeDto};
        $VALUES = appsMiniappsCatalogItemPayloadGamesProfileTypeDtoArr;
        $ENTRIES = new asp(appsMiniappsCatalogItemPayloadGamesProfileTypeDtoArr);
        CREATOR = new a();
    }

    private AppsMiniappsCatalogItemPayloadGamesProfileTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsMiniappsCatalogItemPayloadGamesProfileTypeDto valueOf(String str) {
        return (AppsMiniappsCatalogItemPayloadGamesProfileTypeDto) Enum.valueOf(AppsMiniappsCatalogItemPayloadGamesProfileTypeDto.class, str);
    }

    public static AppsMiniappsCatalogItemPayloadGamesProfileTypeDto[] values() {
        return (AppsMiniappsCatalogItemPayloadGamesProfileTypeDto[]) $VALUES.clone();
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
