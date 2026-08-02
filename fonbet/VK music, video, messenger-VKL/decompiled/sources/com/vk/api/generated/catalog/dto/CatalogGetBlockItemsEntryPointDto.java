package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetBlockItemsEntryPointDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetBlockItemsEntryPointDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetBlockItemsEntryPointDto[] $VALUES;

    @pmi0("clips_player")
    public static final CatalogGetBlockItemsEntryPointDto CLIPS_PLAYER;
    public static final Parcelable.Creator<CatalogGetBlockItemsEntryPointDto> CREATOR;

    @pmi0("owner_page")
    public static final CatalogGetBlockItemsEntryPointDto OWNER_PAGE;

    @pmi0("tvchannels_player")
    public static final CatalogGetBlockItemsEntryPointDto TVCHANNELS_PLAYER;
    private final String value;

    /* compiled from: CatalogGetBlockItemsEntryPointDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetBlockItemsEntryPointDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetBlockItemsEntryPointDto createFromParcel(Parcel parcel) {
            return CatalogGetBlockItemsEntryPointDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetBlockItemsEntryPointDto[] newArray(int i) {
            return new CatalogGetBlockItemsEntryPointDto[i];
        }
    }

    static {
        CatalogGetBlockItemsEntryPointDto catalogGetBlockItemsEntryPointDto = new CatalogGetBlockItemsEntryPointDto("CLIPS_PLAYER", 0, "clips_player");
        CLIPS_PLAYER = catalogGetBlockItemsEntryPointDto;
        CatalogGetBlockItemsEntryPointDto catalogGetBlockItemsEntryPointDto2 = new CatalogGetBlockItemsEntryPointDto("OWNER_PAGE", 1, "owner_page");
        OWNER_PAGE = catalogGetBlockItemsEntryPointDto2;
        CatalogGetBlockItemsEntryPointDto catalogGetBlockItemsEntryPointDto3 = new CatalogGetBlockItemsEntryPointDto("TVCHANNELS_PLAYER", 2, "tvchannels_player");
        TVCHANNELS_PLAYER = catalogGetBlockItemsEntryPointDto3;
        CatalogGetBlockItemsEntryPointDto[] catalogGetBlockItemsEntryPointDtoArr = {catalogGetBlockItemsEntryPointDto, catalogGetBlockItemsEntryPointDto2, catalogGetBlockItemsEntryPointDto3};
        $VALUES = catalogGetBlockItemsEntryPointDtoArr;
        $ENTRIES = new asp(catalogGetBlockItemsEntryPointDtoArr);
        CREATOR = new a();
    }

    private CatalogGetBlockItemsEntryPointDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetBlockItemsEntryPointDto valueOf(String str) {
        return (CatalogGetBlockItemsEntryPointDto) Enum.valueOf(CatalogGetBlockItemsEntryPointDto.class, str);
    }

    public static CatalogGetBlockItemsEntryPointDto[] values() {
        return (CatalogGetBlockItemsEntryPointDto[]) $VALUES.clone();
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
