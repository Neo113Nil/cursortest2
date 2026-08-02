package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhotosSavePhotoEditorActionTypeDto.kt */
/* loaded from: classes15.dex */
public final class PhotosSavePhotoEditorActionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PhotosSavePhotoEditorActionTypeDto[] $VALUES;

    @pmi0("copy")
    public static final PhotosSavePhotoEditorActionTypeDto COPY;
    public static final Parcelable.Creator<PhotosSavePhotoEditorActionTypeDto> CREATOR;

    @pmi0("saved")
    public static final PhotosSavePhotoEditorActionTypeDto SAVED;

    @pmi0("swap")
    public static final PhotosSavePhotoEditorActionTypeDto SWAP;
    private final String value;

    /* compiled from: PhotosSavePhotoEditorActionTypeDto.kt */
    public static final class a implements Parcelable.Creator<PhotosSavePhotoEditorActionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosSavePhotoEditorActionTypeDto createFromParcel(Parcel parcel) {
            return PhotosSavePhotoEditorActionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosSavePhotoEditorActionTypeDto[] newArray(int i) {
            return new PhotosSavePhotoEditorActionTypeDto[i];
        }
    }

    static {
        PhotosSavePhotoEditorActionTypeDto photosSavePhotoEditorActionTypeDto = new PhotosSavePhotoEditorActionTypeDto("COPY", 0, "copy");
        COPY = photosSavePhotoEditorActionTypeDto;
        PhotosSavePhotoEditorActionTypeDto photosSavePhotoEditorActionTypeDto2 = new PhotosSavePhotoEditorActionTypeDto("SAVED", 1, "saved");
        SAVED = photosSavePhotoEditorActionTypeDto2;
        PhotosSavePhotoEditorActionTypeDto photosSavePhotoEditorActionTypeDto3 = new PhotosSavePhotoEditorActionTypeDto("SWAP", 2, "swap");
        SWAP = photosSavePhotoEditorActionTypeDto3;
        PhotosSavePhotoEditorActionTypeDto[] photosSavePhotoEditorActionTypeDtoArr = {photosSavePhotoEditorActionTypeDto, photosSavePhotoEditorActionTypeDto2, photosSavePhotoEditorActionTypeDto3};
        $VALUES = photosSavePhotoEditorActionTypeDtoArr;
        $ENTRIES = new asp(photosSavePhotoEditorActionTypeDtoArr);
        CREATOR = new a();
    }

    private PhotosSavePhotoEditorActionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static PhotosSavePhotoEditorActionTypeDto valueOf(String str) {
        return (PhotosSavePhotoEditorActionTypeDto) Enum.valueOf(PhotosSavePhotoEditorActionTypeDto.class, str);
    }

    public static PhotosSavePhotoEditorActionTypeDto[] values() {
        return (PhotosSavePhotoEditorActionTypeDto[]) $VALUES.clone();
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
