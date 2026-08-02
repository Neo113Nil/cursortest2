package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetShortVideoSearchScreenRefDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetShortVideoSearchScreenRefDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetShortVideoSearchScreenRefDto[] $VALUES;
    public static final Parcelable.Creator<CatalogGetShortVideoSearchScreenRefDto> CREATOR;

    @pmi0("search_clips")
    public static final CatalogGetShortVideoSearchScreenRefDto SEARCH_CLIPS;

    @pmi0("search_clips_service")
    public static final CatalogGetShortVideoSearchScreenRefDto SEARCH_CLIPS_SERVICE;
    private final String value;

    /* compiled from: CatalogGetShortVideoSearchScreenRefDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetShortVideoSearchScreenRefDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetShortVideoSearchScreenRefDto createFromParcel(Parcel parcel) {
            return CatalogGetShortVideoSearchScreenRefDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetShortVideoSearchScreenRefDto[] newArray(int i) {
            return new CatalogGetShortVideoSearchScreenRefDto[i];
        }
    }

    static {
        CatalogGetShortVideoSearchScreenRefDto catalogGetShortVideoSearchScreenRefDto = new CatalogGetShortVideoSearchScreenRefDto("SEARCH_CLIPS", 0, "search_clips");
        SEARCH_CLIPS = catalogGetShortVideoSearchScreenRefDto;
        CatalogGetShortVideoSearchScreenRefDto catalogGetShortVideoSearchScreenRefDto2 = new CatalogGetShortVideoSearchScreenRefDto("SEARCH_CLIPS_SERVICE", 1, "search_clips_service");
        SEARCH_CLIPS_SERVICE = catalogGetShortVideoSearchScreenRefDto2;
        CatalogGetShortVideoSearchScreenRefDto[] catalogGetShortVideoSearchScreenRefDtoArr = {catalogGetShortVideoSearchScreenRefDto, catalogGetShortVideoSearchScreenRefDto2};
        $VALUES = catalogGetShortVideoSearchScreenRefDtoArr;
        $ENTRIES = new asp(catalogGetShortVideoSearchScreenRefDtoArr);
        CREATOR = new a();
    }

    private CatalogGetShortVideoSearchScreenRefDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetShortVideoSearchScreenRefDto valueOf(String str) {
        return (CatalogGetShortVideoSearchScreenRefDto) Enum.valueOf(CatalogGetShortVideoSearchScreenRefDto.class, str);
    }

    public static CatalogGetShortVideoSearchScreenRefDto[] values() {
        return (CatalogGetShortVideoSearchScreenRefDto[]) $VALUES.clone();
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
