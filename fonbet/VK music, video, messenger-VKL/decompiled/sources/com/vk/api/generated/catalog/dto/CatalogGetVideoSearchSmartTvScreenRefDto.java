package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetVideoSearchSmartTvScreenRefDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetVideoSearchSmartTvScreenRefDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetVideoSearchSmartTvScreenRefDto[] $VALUES;
    public static final Parcelable.Creator<CatalogGetVideoSearchSmartTvScreenRefDto> CREATOR;

    @pmi0("search_video_smart_tv")
    public static final CatalogGetVideoSearchSmartTvScreenRefDto SEARCH_VIDEO_SMART_TV;
    private final String value;

    /* compiled from: CatalogGetVideoSearchSmartTvScreenRefDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetVideoSearchSmartTvScreenRefDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetVideoSearchSmartTvScreenRefDto createFromParcel(Parcel parcel) {
            return CatalogGetVideoSearchSmartTvScreenRefDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetVideoSearchSmartTvScreenRefDto[] newArray(int i) {
            return new CatalogGetVideoSearchSmartTvScreenRefDto[i];
        }
    }

    static {
        CatalogGetVideoSearchSmartTvScreenRefDto catalogGetVideoSearchSmartTvScreenRefDto = new CatalogGetVideoSearchSmartTvScreenRefDto("SEARCH_VIDEO_SMART_TV", 0, "search_video_smart_tv");
        SEARCH_VIDEO_SMART_TV = catalogGetVideoSearchSmartTvScreenRefDto;
        CatalogGetVideoSearchSmartTvScreenRefDto[] catalogGetVideoSearchSmartTvScreenRefDtoArr = {catalogGetVideoSearchSmartTvScreenRefDto};
        $VALUES = catalogGetVideoSearchSmartTvScreenRefDtoArr;
        $ENTRIES = new asp(catalogGetVideoSearchSmartTvScreenRefDtoArr);
        CREATOR = new a();
    }

    private CatalogGetVideoSearchSmartTvScreenRefDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetVideoSearchSmartTvScreenRefDto valueOf(String str) {
        return (CatalogGetVideoSearchSmartTvScreenRefDto) Enum.valueOf(CatalogGetVideoSearchSmartTvScreenRefDto.class, str);
    }

    public static CatalogGetVideoSearchSmartTvScreenRefDto[] values() {
        return (CatalogGetVideoSearchSmartTvScreenRefDto[]) $VALUES.clone();
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
