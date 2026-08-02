package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetSearchGamesScreenRefDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetSearchGamesScreenRefDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetSearchGamesScreenRefDto[] $VALUES;
    public static final Parcelable.Creator<CatalogGetSearchGamesScreenRefDto> CREATOR;

    @pmi0("search_games")
    public static final CatalogGetSearchGamesScreenRefDto SEARCH_GAMES;

    @pmi0("search_games_service")
    public static final CatalogGetSearchGamesScreenRefDto SEARCH_GAMES_SERVICE;
    private final String value;

    /* compiled from: CatalogGetSearchGamesScreenRefDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetSearchGamesScreenRefDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchGamesScreenRefDto createFromParcel(Parcel parcel) {
            return CatalogGetSearchGamesScreenRefDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetSearchGamesScreenRefDto[] newArray(int i) {
            return new CatalogGetSearchGamesScreenRefDto[i];
        }
    }

    static {
        CatalogGetSearchGamesScreenRefDto catalogGetSearchGamesScreenRefDto = new CatalogGetSearchGamesScreenRefDto("SEARCH_GAMES", 0, "search_games");
        SEARCH_GAMES = catalogGetSearchGamesScreenRefDto;
        CatalogGetSearchGamesScreenRefDto catalogGetSearchGamesScreenRefDto2 = new CatalogGetSearchGamesScreenRefDto("SEARCH_GAMES_SERVICE", 1, "search_games_service");
        SEARCH_GAMES_SERVICE = catalogGetSearchGamesScreenRefDto2;
        CatalogGetSearchGamesScreenRefDto[] catalogGetSearchGamesScreenRefDtoArr = {catalogGetSearchGamesScreenRefDto, catalogGetSearchGamesScreenRefDto2};
        $VALUES = catalogGetSearchGamesScreenRefDtoArr;
        $ENTRIES = new asp(catalogGetSearchGamesScreenRefDtoArr);
        CREATOR = new a();
    }

    private CatalogGetSearchGamesScreenRefDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetSearchGamesScreenRefDto valueOf(String str) {
        return (CatalogGetSearchGamesScreenRefDto) Enum.valueOf(CatalogGetSearchGamesScreenRefDto.class, str);
    }

    public static CatalogGetSearchGamesScreenRefDto[] values() {
        return (CatalogGetSearchGamesScreenRefDto[]) $VALUES.clone();
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
