package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetVideoSearchSmartTvContentTypeDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetVideoSearchSmartTvContentTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetVideoSearchSmartTvContentTypeDto[] $VALUES;

    @pmi0("all")
    public static final CatalogGetVideoSearchSmartTvContentTypeDto ALL;

    @pmi0("author")
    public static final CatalogGetVideoSearchSmartTvContentTypeDto AUTHOR;

    @pmi0("clip")
    public static final CatalogGetVideoSearchSmartTvContentTypeDto CLIP;
    public static final Parcelable.Creator<CatalogGetVideoSearchSmartTvContentTypeDto> CREATOR;

    @pmi0("live")
    public static final CatalogGetVideoSearchSmartTvContentTypeDto LIVE;

    @pmi0("video")
    public static final CatalogGetVideoSearchSmartTvContentTypeDto VIDEO;
    private final String value;

    /* compiled from: CatalogGetVideoSearchSmartTvContentTypeDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetVideoSearchSmartTvContentTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetVideoSearchSmartTvContentTypeDto createFromParcel(Parcel parcel) {
            return CatalogGetVideoSearchSmartTvContentTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetVideoSearchSmartTvContentTypeDto[] newArray(int i) {
            return new CatalogGetVideoSearchSmartTvContentTypeDto[i];
        }
    }

    static {
        CatalogGetVideoSearchSmartTvContentTypeDto catalogGetVideoSearchSmartTvContentTypeDto = new CatalogGetVideoSearchSmartTvContentTypeDto("CLIP", 0, "clip");
        CLIP = catalogGetVideoSearchSmartTvContentTypeDto;
        CatalogGetVideoSearchSmartTvContentTypeDto catalogGetVideoSearchSmartTvContentTypeDto2 = new CatalogGetVideoSearchSmartTvContentTypeDto("LIVE", 1, "live");
        LIVE = catalogGetVideoSearchSmartTvContentTypeDto2;
        CatalogGetVideoSearchSmartTvContentTypeDto catalogGetVideoSearchSmartTvContentTypeDto3 = new CatalogGetVideoSearchSmartTvContentTypeDto("AUTHOR", 2, "author");
        AUTHOR = catalogGetVideoSearchSmartTvContentTypeDto3;
        CatalogGetVideoSearchSmartTvContentTypeDto catalogGetVideoSearchSmartTvContentTypeDto4 = new CatalogGetVideoSearchSmartTvContentTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 3, "video");
        VIDEO = catalogGetVideoSearchSmartTvContentTypeDto4;
        CatalogGetVideoSearchSmartTvContentTypeDto catalogGetVideoSearchSmartTvContentTypeDto5 = new CatalogGetVideoSearchSmartTvContentTypeDto("ALL", 4, "all");
        ALL = catalogGetVideoSearchSmartTvContentTypeDto5;
        CatalogGetVideoSearchSmartTvContentTypeDto[] catalogGetVideoSearchSmartTvContentTypeDtoArr = {catalogGetVideoSearchSmartTvContentTypeDto, catalogGetVideoSearchSmartTvContentTypeDto2, catalogGetVideoSearchSmartTvContentTypeDto3, catalogGetVideoSearchSmartTvContentTypeDto4, catalogGetVideoSearchSmartTvContentTypeDto5};
        $VALUES = catalogGetVideoSearchSmartTvContentTypeDtoArr;
        $ENTRIES = new asp(catalogGetVideoSearchSmartTvContentTypeDtoArr);
        CREATOR = new a();
    }

    private CatalogGetVideoSearchSmartTvContentTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetVideoSearchSmartTvContentTypeDto valueOf(String str) {
        return (CatalogGetVideoSearchSmartTvContentTypeDto) Enum.valueOf(CatalogGetVideoSearchSmartTvContentTypeDto.class, str);
    }

    public static CatalogGetVideoSearchSmartTvContentTypeDto[] values() {
        return (CatalogGetVideoSearchSmartTvContentTypeDto[]) $VALUES.clone();
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
