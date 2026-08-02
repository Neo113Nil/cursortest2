package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetVideoSearchContentTypeDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetVideoSearchContentTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetVideoSearchContentTypeDto[] $VALUES;

    @pmi0("all")
    public static final CatalogGetVideoSearchContentTypeDto ALL;

    @pmi0("author")
    public static final CatalogGetVideoSearchContentTypeDto AUTHOR;

    @pmi0("clip")
    public static final CatalogGetVideoSearchContentTypeDto CLIP;
    public static final Parcelable.Creator<CatalogGetVideoSearchContentTypeDto> CREATOR;

    @pmi0("live")
    public static final CatalogGetVideoSearchContentTypeDto LIVE;

    @pmi0("video")
    public static final CatalogGetVideoSearchContentTypeDto VIDEO;
    private final String value;

    /* compiled from: CatalogGetVideoSearchContentTypeDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetVideoSearchContentTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetVideoSearchContentTypeDto createFromParcel(Parcel parcel) {
            return CatalogGetVideoSearchContentTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetVideoSearchContentTypeDto[] newArray(int i) {
            return new CatalogGetVideoSearchContentTypeDto[i];
        }
    }

    static {
        CatalogGetVideoSearchContentTypeDto catalogGetVideoSearchContentTypeDto = new CatalogGetVideoSearchContentTypeDto("CLIP", 0, "clip");
        CLIP = catalogGetVideoSearchContentTypeDto;
        CatalogGetVideoSearchContentTypeDto catalogGetVideoSearchContentTypeDto2 = new CatalogGetVideoSearchContentTypeDto("LIVE", 1, "live");
        LIVE = catalogGetVideoSearchContentTypeDto2;
        CatalogGetVideoSearchContentTypeDto catalogGetVideoSearchContentTypeDto3 = new CatalogGetVideoSearchContentTypeDto("AUTHOR", 2, "author");
        AUTHOR = catalogGetVideoSearchContentTypeDto3;
        CatalogGetVideoSearchContentTypeDto catalogGetVideoSearchContentTypeDto4 = new CatalogGetVideoSearchContentTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 3, "video");
        VIDEO = catalogGetVideoSearchContentTypeDto4;
        CatalogGetVideoSearchContentTypeDto catalogGetVideoSearchContentTypeDto5 = new CatalogGetVideoSearchContentTypeDto("ALL", 4, "all");
        ALL = catalogGetVideoSearchContentTypeDto5;
        CatalogGetVideoSearchContentTypeDto[] catalogGetVideoSearchContentTypeDtoArr = {catalogGetVideoSearchContentTypeDto, catalogGetVideoSearchContentTypeDto2, catalogGetVideoSearchContentTypeDto3, catalogGetVideoSearchContentTypeDto4, catalogGetVideoSearchContentTypeDto5};
        $VALUES = catalogGetVideoSearchContentTypeDtoArr;
        $ENTRIES = new asp(catalogGetVideoSearchContentTypeDtoArr);
        CREATOR = new a();
    }

    private CatalogGetVideoSearchContentTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetVideoSearchContentTypeDto valueOf(String str) {
        return (CatalogGetVideoSearchContentTypeDto) Enum.valueOf(CatalogGetVideoSearchContentTypeDto.class, str);
    }

    public static CatalogGetVideoSearchContentTypeDto[] values() {
        return (CatalogGetVideoSearchContentTypeDto[]) $VALUES.clone();
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
