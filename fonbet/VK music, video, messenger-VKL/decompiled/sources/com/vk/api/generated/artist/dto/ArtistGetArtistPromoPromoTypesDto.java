package com.vk.api.generated.artist.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ArtistGetArtistPromoPromoTypesDto.kt */
/* loaded from: classes14.dex */
public final class ArtistGetArtistPromoPromoTypesDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ArtistGetArtistPromoPromoTypesDto[] $VALUES;

    @pmi0("concert")
    public static final ArtistGetArtistPromoPromoTypesDto CONCERT;
    public static final Parcelable.Creator<ArtistGetArtistPromoPromoTypesDto> CREATOR;

    @pmi0("merch")
    public static final ArtistGetArtistPromoPromoTypesDto MERCH;
    private final String value;

    /* compiled from: ArtistGetArtistPromoPromoTypesDto.kt */
    public static final class a implements Parcelable.Creator<ArtistGetArtistPromoPromoTypesDto> {
        @Override // android.os.Parcelable.Creator
        public final ArtistGetArtistPromoPromoTypesDto createFromParcel(Parcel parcel) {
            return ArtistGetArtistPromoPromoTypesDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ArtistGetArtistPromoPromoTypesDto[] newArray(int i) {
            return new ArtistGetArtistPromoPromoTypesDto[i];
        }
    }

    static {
        ArtistGetArtistPromoPromoTypesDto artistGetArtistPromoPromoTypesDto = new ArtistGetArtistPromoPromoTypesDto("CONCERT", 0, "concert");
        CONCERT = artistGetArtistPromoPromoTypesDto;
        ArtistGetArtistPromoPromoTypesDto artistGetArtistPromoPromoTypesDto2 = new ArtistGetArtistPromoPromoTypesDto("MERCH", 1, "merch");
        MERCH = artistGetArtistPromoPromoTypesDto2;
        ArtistGetArtistPromoPromoTypesDto[] artistGetArtistPromoPromoTypesDtoArr = {artistGetArtistPromoPromoTypesDto, artistGetArtistPromoPromoTypesDto2};
        $VALUES = artistGetArtistPromoPromoTypesDtoArr;
        $ENTRIES = new asp(artistGetArtistPromoPromoTypesDtoArr);
        CREATOR = new a();
    }

    private ArtistGetArtistPromoPromoTypesDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ArtistGetArtistPromoPromoTypesDto valueOf(String str) {
        return (ArtistGetArtistPromoPromoTypesDto) Enum.valueOf(ArtistGetArtistPromoPromoTypesDto.class, str);
    }

    public static ArtistGetArtistPromoPromoTypesDto[] values() {
        return (ArtistGetArtistPromoPromoTypesDto[]) $VALUES.clone();
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
