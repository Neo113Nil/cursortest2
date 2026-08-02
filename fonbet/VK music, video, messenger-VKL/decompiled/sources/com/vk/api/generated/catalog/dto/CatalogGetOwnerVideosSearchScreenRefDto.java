package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetOwnerVideosSearchScreenRefDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetOwnerVideosSearchScreenRefDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetOwnerVideosSearchScreenRefDto[] $VALUES;
    public static final Parcelable.Creator<CatalogGetOwnerVideosSearchScreenRefDto> CREATOR;

    @pmi0("search_owner_videos")
    public static final CatalogGetOwnerVideosSearchScreenRefDto SEARCH_OWNER_VIDEOS;
    private final String value;

    /* compiled from: CatalogGetOwnerVideosSearchScreenRefDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetOwnerVideosSearchScreenRefDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetOwnerVideosSearchScreenRefDto createFromParcel(Parcel parcel) {
            return CatalogGetOwnerVideosSearchScreenRefDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetOwnerVideosSearchScreenRefDto[] newArray(int i) {
            return new CatalogGetOwnerVideosSearchScreenRefDto[i];
        }
    }

    static {
        CatalogGetOwnerVideosSearchScreenRefDto catalogGetOwnerVideosSearchScreenRefDto = new CatalogGetOwnerVideosSearchScreenRefDto("SEARCH_OWNER_VIDEOS", 0, "search_owner_videos");
        SEARCH_OWNER_VIDEOS = catalogGetOwnerVideosSearchScreenRefDto;
        CatalogGetOwnerVideosSearchScreenRefDto[] catalogGetOwnerVideosSearchScreenRefDtoArr = {catalogGetOwnerVideosSearchScreenRefDto};
        $VALUES = catalogGetOwnerVideosSearchScreenRefDtoArr;
        $ENTRIES = new asp(catalogGetOwnerVideosSearchScreenRefDtoArr);
        CREATOR = new a();
    }

    private CatalogGetOwnerVideosSearchScreenRefDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetOwnerVideosSearchScreenRefDto valueOf(String str) {
        return (CatalogGetOwnerVideosSearchScreenRefDto) Enum.valueOf(CatalogGetOwnerVideosSearchScreenRefDto.class, str);
    }

    public static CatalogGetOwnerVideosSearchScreenRefDto[] values() {
        return (CatalogGetOwnerVideosSearchScreenRefDto[]) $VALUES.clone();
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
