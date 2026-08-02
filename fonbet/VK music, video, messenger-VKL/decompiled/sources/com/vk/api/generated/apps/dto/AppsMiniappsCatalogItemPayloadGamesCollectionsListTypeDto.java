package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto[] $VALUES;

    @pmi0("apps_collections_list")
    public static final AppsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto APPS_COLLECTIONS_LIST;
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto> CREATOR;
    private final String value;

    /* compiled from: AppsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto createFromParcel(Parcel parcel) {
            return AppsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto[i];
        }
    }

    static {
        AppsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto appsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto = new AppsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto("APPS_COLLECTIONS_LIST", 0, "apps_collections_list");
        APPS_COLLECTIONS_LIST = appsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto;
        AppsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto[] appsMiniappsCatalogItemPayloadGamesCollectionsListTypeDtoArr = {appsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto};
        $VALUES = appsMiniappsCatalogItemPayloadGamesCollectionsListTypeDtoArr;
        $ENTRIES = new asp(appsMiniappsCatalogItemPayloadGamesCollectionsListTypeDtoArr);
        CREATOR = new a();
    }

    private AppsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto valueOf(String str) {
        return (AppsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto) Enum.valueOf(AppsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto.class, str);
    }

    public static AppsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto[] values() {
        return (AppsMiniappsCatalogItemPayloadGamesCollectionsListTypeDto[]) $VALUES.clone();
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
