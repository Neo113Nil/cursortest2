package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhotosGetCommentsExtendedSortDto.kt */
/* loaded from: classes15.dex */
public final class PhotosGetCommentsExtendedSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PhotosGetCommentsExtendedSortDto[] $VALUES;
    public static final Parcelable.Creator<PhotosGetCommentsExtendedSortDto> CREATOR;

    @pmi0(CampaignEx.JSON_KEY_DESC)
    public static final PhotosGetCommentsExtendedSortDto NEW_FIRST;

    @pmi0("asc")
    public static final PhotosGetCommentsExtendedSortDto OLD_FIRST;
    private final String value;

    /* compiled from: PhotosGetCommentsExtendedSortDto.kt */
    public static final class a implements Parcelable.Creator<PhotosGetCommentsExtendedSortDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosGetCommentsExtendedSortDto createFromParcel(Parcel parcel) {
            return PhotosGetCommentsExtendedSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosGetCommentsExtendedSortDto[] newArray(int i) {
            return new PhotosGetCommentsExtendedSortDto[i];
        }
    }

    static {
        PhotosGetCommentsExtendedSortDto photosGetCommentsExtendedSortDto = new PhotosGetCommentsExtendedSortDto("OLD_FIRST", 0, "asc");
        OLD_FIRST = photosGetCommentsExtendedSortDto;
        PhotosGetCommentsExtendedSortDto photosGetCommentsExtendedSortDto2 = new PhotosGetCommentsExtendedSortDto("NEW_FIRST", 1, CampaignEx.JSON_KEY_DESC);
        NEW_FIRST = photosGetCommentsExtendedSortDto2;
        PhotosGetCommentsExtendedSortDto[] photosGetCommentsExtendedSortDtoArr = {photosGetCommentsExtendedSortDto, photosGetCommentsExtendedSortDto2};
        $VALUES = photosGetCommentsExtendedSortDtoArr;
        $ENTRIES = new asp(photosGetCommentsExtendedSortDtoArr);
        CREATOR = new a();
    }

    private PhotosGetCommentsExtendedSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static PhotosGetCommentsExtendedSortDto valueOf(String str) {
        return (PhotosGetCommentsExtendedSortDto) Enum.valueOf(PhotosGetCommentsExtendedSortDto.class, str);
    }

    public static PhotosGetCommentsExtendedSortDto[] values() {
        return (PhotosGetCommentsExtendedSortDto[]) $VALUES.clone();
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
