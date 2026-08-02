package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetSectionEntryPointDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetSectionEntryPointDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetSectionEntryPointDto[] $VALUES;

    @pmi0("clips_player")
    public static final CatalogGetSectionEntryPointDto CLIPS_PLAYER;
    public static final Parcelable.Creator<CatalogGetSectionEntryPointDto> CREATOR;

    @pmi0("owner_page")
    public static final CatalogGetSectionEntryPointDto OWNER_PAGE;
    private final String value;

    /* compiled from: CatalogGetSectionEntryPointDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetSectionEntryPointDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetSectionEntryPointDto createFromParcel(Parcel parcel) {
            return CatalogGetSectionEntryPointDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetSectionEntryPointDto[] newArray(int i) {
            return new CatalogGetSectionEntryPointDto[i];
        }
    }

    static {
        CatalogGetSectionEntryPointDto catalogGetSectionEntryPointDto = new CatalogGetSectionEntryPointDto("CLIPS_PLAYER", 0, "clips_player");
        CLIPS_PLAYER = catalogGetSectionEntryPointDto;
        CatalogGetSectionEntryPointDto catalogGetSectionEntryPointDto2 = new CatalogGetSectionEntryPointDto("OWNER_PAGE", 1, "owner_page");
        OWNER_PAGE = catalogGetSectionEntryPointDto2;
        CatalogGetSectionEntryPointDto[] catalogGetSectionEntryPointDtoArr = {catalogGetSectionEntryPointDto, catalogGetSectionEntryPointDto2};
        $VALUES = catalogGetSectionEntryPointDtoArr;
        $ENTRIES = new asp(catalogGetSectionEntryPointDtoArr);
        CREATOR = new a();
    }

    private CatalogGetSectionEntryPointDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetSectionEntryPointDto valueOf(String str) {
        return (CatalogGetSectionEntryPointDto) Enum.valueOf(CatalogGetSectionEntryPointDto.class, str);
    }

    public static CatalogGetSectionEntryPointDto[] values() {
        return (CatalogGetSectionEntryPointDto[]) $VALUES.clone();
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
