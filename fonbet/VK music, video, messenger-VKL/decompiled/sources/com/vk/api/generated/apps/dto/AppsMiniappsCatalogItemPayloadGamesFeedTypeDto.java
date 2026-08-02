package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsMiniappsCatalogItemPayloadGamesFeedTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadGamesFeedTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsMiniappsCatalogItemPayloadGamesFeedTypeDto[] $VALUES;
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesFeedTypeDto> CREATOR;

    @pmi0("games_feed")
    public static final AppsMiniappsCatalogItemPayloadGamesFeedTypeDto GAMES_FEED;
    private final String value;

    /* compiled from: AppsMiniappsCatalogItemPayloadGamesFeedTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesFeedTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadGamesFeedTypeDto createFromParcel(Parcel parcel) {
            return AppsMiniappsCatalogItemPayloadGamesFeedTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadGamesFeedTypeDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadGamesFeedTypeDto[i];
        }
    }

    static {
        AppsMiniappsCatalogItemPayloadGamesFeedTypeDto appsMiniappsCatalogItemPayloadGamesFeedTypeDto = new AppsMiniappsCatalogItemPayloadGamesFeedTypeDto("GAMES_FEED", 0, "games_feed");
        GAMES_FEED = appsMiniappsCatalogItemPayloadGamesFeedTypeDto;
        AppsMiniappsCatalogItemPayloadGamesFeedTypeDto[] appsMiniappsCatalogItemPayloadGamesFeedTypeDtoArr = {appsMiniappsCatalogItemPayloadGamesFeedTypeDto};
        $VALUES = appsMiniappsCatalogItemPayloadGamesFeedTypeDtoArr;
        $ENTRIES = new asp(appsMiniappsCatalogItemPayloadGamesFeedTypeDtoArr);
        CREATOR = new a();
    }

    private AppsMiniappsCatalogItemPayloadGamesFeedTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsMiniappsCatalogItemPayloadGamesFeedTypeDto valueOf(String str) {
        return (AppsMiniappsCatalogItemPayloadGamesFeedTypeDto) Enum.valueOf(AppsMiniappsCatalogItemPayloadGamesFeedTypeDto.class, str);
    }

    public static AppsMiniappsCatalogItemPayloadGamesFeedTypeDto[] values() {
        return (AppsMiniappsCatalogItemPayloadGamesFeedTypeDto[]) $VALUES.clone();
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
