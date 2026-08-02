package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhotosGetCommentsSortDto.kt */
/* loaded from: classes15.dex */
public final class PhotosGetCommentsSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PhotosGetCommentsSortDto[] $VALUES;
    public static final Parcelable.Creator<PhotosGetCommentsSortDto> CREATOR;

    @pmi0(CampaignEx.JSON_KEY_DESC)
    public static final PhotosGetCommentsSortDto NEW_FIRST;

    @pmi0("asc")
    public static final PhotosGetCommentsSortDto OLD_FIRST;
    private final String value;

    /* compiled from: PhotosGetCommentsSortDto.kt */
    public static final class a implements Parcelable.Creator<PhotosGetCommentsSortDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosGetCommentsSortDto createFromParcel(Parcel parcel) {
            return PhotosGetCommentsSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosGetCommentsSortDto[] newArray(int i) {
            return new PhotosGetCommentsSortDto[i];
        }
    }

    static {
        PhotosGetCommentsSortDto photosGetCommentsSortDto = new PhotosGetCommentsSortDto("OLD_FIRST", 0, "asc");
        OLD_FIRST = photosGetCommentsSortDto;
        PhotosGetCommentsSortDto photosGetCommentsSortDto2 = new PhotosGetCommentsSortDto("NEW_FIRST", 1, CampaignEx.JSON_KEY_DESC);
        NEW_FIRST = photosGetCommentsSortDto2;
        PhotosGetCommentsSortDto[] photosGetCommentsSortDtoArr = {photosGetCommentsSortDto, photosGetCommentsSortDto2};
        $VALUES = photosGetCommentsSortDtoArr;
        $ENTRIES = new asp(photosGetCommentsSortDtoArr);
        CREATOR = new a();
    }

    private PhotosGetCommentsSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static PhotosGetCommentsSortDto valueOf(String str) {
        return (PhotosGetCommentsSortDto) Enum.valueOf(PhotosGetCommentsSortDto.class, str);
    }

    public static PhotosGetCommentsSortDto[] values() {
        return (PhotosGetCommentsSortDto[]) $VALUES.clone();
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
