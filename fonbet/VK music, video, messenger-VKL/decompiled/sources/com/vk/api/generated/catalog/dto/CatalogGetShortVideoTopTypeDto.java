package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetShortVideoTopTypeDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetShortVideoTopTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetShortVideoTopTypeDto[] $VALUES;
    public static final Parcelable.Creator<CatalogGetShortVideoTopTypeDto> CREATOR;

    @pmi0("short_video_top")
    public static final CatalogGetShortVideoTopTypeDto SHORT_VIDEO_TOP;

    @pmi0("short_video_trends")
    public static final CatalogGetShortVideoTopTypeDto SHORT_VIDEO_TRENDS;
    private final String value;

    /* compiled from: CatalogGetShortVideoTopTypeDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetShortVideoTopTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetShortVideoTopTypeDto createFromParcel(Parcel parcel) {
            return CatalogGetShortVideoTopTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetShortVideoTopTypeDto[] newArray(int i) {
            return new CatalogGetShortVideoTopTypeDto[i];
        }
    }

    static {
        CatalogGetShortVideoTopTypeDto catalogGetShortVideoTopTypeDto = new CatalogGetShortVideoTopTypeDto("SHORT_VIDEO_TOP", 0, "short_video_top");
        SHORT_VIDEO_TOP = catalogGetShortVideoTopTypeDto;
        CatalogGetShortVideoTopTypeDto catalogGetShortVideoTopTypeDto2 = new CatalogGetShortVideoTopTypeDto("SHORT_VIDEO_TRENDS", 1, "short_video_trends");
        SHORT_VIDEO_TRENDS = catalogGetShortVideoTopTypeDto2;
        CatalogGetShortVideoTopTypeDto[] catalogGetShortVideoTopTypeDtoArr = {catalogGetShortVideoTopTypeDto, catalogGetShortVideoTopTypeDto2};
        $VALUES = catalogGetShortVideoTopTypeDtoArr;
        $ENTRIES = new asp(catalogGetShortVideoTopTypeDtoArr);
        CREATOR = new a();
    }

    private CatalogGetShortVideoTopTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetShortVideoTopTypeDto valueOf(String str) {
        return (CatalogGetShortVideoTopTypeDto) Enum.valueOf(CatalogGetShortVideoTopTypeDto.class, str);
    }

    public static CatalogGetShortVideoTopTypeDto[] values() {
        return (CatalogGetShortVideoTopTypeDto[]) $VALUES.clone();
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
