package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetVideoAlbumCatalogTypeDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetVideoAlbumCatalogTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetVideoAlbumCatalogTypeDto[] $VALUES;
    public static final Parcelable.Creator<CatalogGetVideoAlbumCatalogTypeDto> CREATOR;

    @pmi0("video")
    public static final CatalogGetVideoAlbumCatalogTypeDto VIDEO;

    @pmi0("video_standalone_profile")
    public static final CatalogGetVideoAlbumCatalogTypeDto VIDEO_STANDALONE_PROFILE;
    private final String value;

    /* compiled from: CatalogGetVideoAlbumCatalogTypeDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetVideoAlbumCatalogTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetVideoAlbumCatalogTypeDto createFromParcel(Parcel parcel) {
            return CatalogGetVideoAlbumCatalogTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetVideoAlbumCatalogTypeDto[] newArray(int i) {
            return new CatalogGetVideoAlbumCatalogTypeDto[i];
        }
    }

    static {
        CatalogGetVideoAlbumCatalogTypeDto catalogGetVideoAlbumCatalogTypeDto = new CatalogGetVideoAlbumCatalogTypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 0, "video");
        VIDEO = catalogGetVideoAlbumCatalogTypeDto;
        CatalogGetVideoAlbumCatalogTypeDto catalogGetVideoAlbumCatalogTypeDto2 = new CatalogGetVideoAlbumCatalogTypeDto("VIDEO_STANDALONE_PROFILE", 1, "video_standalone_profile");
        VIDEO_STANDALONE_PROFILE = catalogGetVideoAlbumCatalogTypeDto2;
        CatalogGetVideoAlbumCatalogTypeDto[] catalogGetVideoAlbumCatalogTypeDtoArr = {catalogGetVideoAlbumCatalogTypeDto, catalogGetVideoAlbumCatalogTypeDto2};
        $VALUES = catalogGetVideoAlbumCatalogTypeDtoArr;
        $ENTRIES = new asp(catalogGetVideoAlbumCatalogTypeDtoArr);
        CREATOR = new a();
    }

    private CatalogGetVideoAlbumCatalogTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetVideoAlbumCatalogTypeDto valueOf(String str) {
        return (CatalogGetVideoAlbumCatalogTypeDto) Enum.valueOf(CatalogGetVideoAlbumCatalogTypeDto.class, str);
    }

    public static CatalogGetVideoAlbumCatalogTypeDto[] values() {
        return (CatalogGetVideoAlbumCatalogTypeDto[]) $VALUES.clone();
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
