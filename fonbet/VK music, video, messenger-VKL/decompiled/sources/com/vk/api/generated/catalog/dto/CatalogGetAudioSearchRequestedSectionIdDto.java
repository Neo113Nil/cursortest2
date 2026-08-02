package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetAudioSearchRequestedSectionIdDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetAudioSearchRequestedSectionIdDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetAudioSearchRequestedSectionIdDto[] $VALUES;

    @pmi0("audio_search_radios")
    public static final CatalogGetAudioSearchRequestedSectionIdDto AUDIO_SEARCH_RADIOS;
    public static final Parcelable.Creator<CatalogGetAudioSearchRequestedSectionIdDto> CREATOR;

    @pmi0("hidden_search_results")
    public static final CatalogGetAudioSearchRequestedSectionIdDto HIDDEN_SEARCH_RESULTS;

    @pmi0("search_download_history")
    public static final CatalogGetAudioSearchRequestedSectionIdDto SEARCH_DOWNLOAD_HISTORY;

    @pmi0("search_owned_albums")
    public static final CatalogGetAudioSearchRequestedSectionIdDto SEARCH_OWNED_ALBUMS;

    @pmi0("search_owned_audios")
    public static final CatalogGetAudioSearchRequestedSectionIdDto SEARCH_OWNED_AUDIOS;

    @pmi0("search_owned_audio_friends")
    public static final CatalogGetAudioSearchRequestedSectionIdDto SEARCH_OWNED_AUDIO_FRIENDS;

    @pmi0("search_owned_playlists")
    public static final CatalogGetAudioSearchRequestedSectionIdDto SEARCH_OWNED_PLAYLISTS;

    @pmi0("search_owned_radiostations")
    public static final CatalogGetAudioSearchRequestedSectionIdDto SEARCH_OWNED_RADIOSTATIONS;

    @pmi0("zero_screen")
    public static final CatalogGetAudioSearchRequestedSectionIdDto ZERO_SCREEN;
    private final String value;

    /* compiled from: CatalogGetAudioSearchRequestedSectionIdDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetAudioSearchRequestedSectionIdDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetAudioSearchRequestedSectionIdDto createFromParcel(Parcel parcel) {
            return CatalogGetAudioSearchRequestedSectionIdDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetAudioSearchRequestedSectionIdDto[] newArray(int i) {
            return new CatalogGetAudioSearchRequestedSectionIdDto[i];
        }
    }

    static {
        CatalogGetAudioSearchRequestedSectionIdDto catalogGetAudioSearchRequestedSectionIdDto = new CatalogGetAudioSearchRequestedSectionIdDto("AUDIO_SEARCH_RADIOS", 0, "audio_search_radios");
        AUDIO_SEARCH_RADIOS = catalogGetAudioSearchRequestedSectionIdDto;
        CatalogGetAudioSearchRequestedSectionIdDto catalogGetAudioSearchRequestedSectionIdDto2 = new CatalogGetAudioSearchRequestedSectionIdDto("HIDDEN_SEARCH_RESULTS", 1, "hidden_search_results");
        HIDDEN_SEARCH_RESULTS = catalogGetAudioSearchRequestedSectionIdDto2;
        CatalogGetAudioSearchRequestedSectionIdDto catalogGetAudioSearchRequestedSectionIdDto3 = new CatalogGetAudioSearchRequestedSectionIdDto("SEARCH_DOWNLOAD_HISTORY", 2, "search_download_history");
        SEARCH_DOWNLOAD_HISTORY = catalogGetAudioSearchRequestedSectionIdDto3;
        CatalogGetAudioSearchRequestedSectionIdDto catalogGetAudioSearchRequestedSectionIdDto4 = new CatalogGetAudioSearchRequestedSectionIdDto("SEARCH_OWNED_ALBUMS", 3, "search_owned_albums");
        SEARCH_OWNED_ALBUMS = catalogGetAudioSearchRequestedSectionIdDto4;
        CatalogGetAudioSearchRequestedSectionIdDto catalogGetAudioSearchRequestedSectionIdDto5 = new CatalogGetAudioSearchRequestedSectionIdDto("SEARCH_OWNED_AUDIO_FRIENDS", 4, "search_owned_audio_friends");
        SEARCH_OWNED_AUDIO_FRIENDS = catalogGetAudioSearchRequestedSectionIdDto5;
        CatalogGetAudioSearchRequestedSectionIdDto catalogGetAudioSearchRequestedSectionIdDto6 = new CatalogGetAudioSearchRequestedSectionIdDto("SEARCH_OWNED_AUDIOS", 5, "search_owned_audios");
        SEARCH_OWNED_AUDIOS = catalogGetAudioSearchRequestedSectionIdDto6;
        CatalogGetAudioSearchRequestedSectionIdDto catalogGetAudioSearchRequestedSectionIdDto7 = new CatalogGetAudioSearchRequestedSectionIdDto("SEARCH_OWNED_PLAYLISTS", 6, "search_owned_playlists");
        SEARCH_OWNED_PLAYLISTS = catalogGetAudioSearchRequestedSectionIdDto7;
        CatalogGetAudioSearchRequestedSectionIdDto catalogGetAudioSearchRequestedSectionIdDto8 = new CatalogGetAudioSearchRequestedSectionIdDto("SEARCH_OWNED_RADIOSTATIONS", 7, "search_owned_radiostations");
        SEARCH_OWNED_RADIOSTATIONS = catalogGetAudioSearchRequestedSectionIdDto8;
        CatalogGetAudioSearchRequestedSectionIdDto catalogGetAudioSearchRequestedSectionIdDto9 = new CatalogGetAudioSearchRequestedSectionIdDto("ZERO_SCREEN", 8, "zero_screen");
        ZERO_SCREEN = catalogGetAudioSearchRequestedSectionIdDto9;
        CatalogGetAudioSearchRequestedSectionIdDto[] catalogGetAudioSearchRequestedSectionIdDtoArr = {catalogGetAudioSearchRequestedSectionIdDto, catalogGetAudioSearchRequestedSectionIdDto2, catalogGetAudioSearchRequestedSectionIdDto3, catalogGetAudioSearchRequestedSectionIdDto4, catalogGetAudioSearchRequestedSectionIdDto5, catalogGetAudioSearchRequestedSectionIdDto6, catalogGetAudioSearchRequestedSectionIdDto7, catalogGetAudioSearchRequestedSectionIdDto8, catalogGetAudioSearchRequestedSectionIdDto9};
        $VALUES = catalogGetAudioSearchRequestedSectionIdDtoArr;
        $ENTRIES = new asp(catalogGetAudioSearchRequestedSectionIdDtoArr);
        CREATOR = new a();
    }

    private CatalogGetAudioSearchRequestedSectionIdDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<CatalogGetAudioSearchRequestedSectionIdDto> i() {
        return $ENTRIES;
    }

    public static CatalogGetAudioSearchRequestedSectionIdDto valueOf(String str) {
        return (CatalogGetAudioSearchRequestedSectionIdDto) Enum.valueOf(CatalogGetAudioSearchRequestedSectionIdDto.class, str);
    }

    public static CatalogGetAudioSearchRequestedSectionIdDto[] values() {
        return (CatalogGetAudioSearchRequestedSectionIdDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String j() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
