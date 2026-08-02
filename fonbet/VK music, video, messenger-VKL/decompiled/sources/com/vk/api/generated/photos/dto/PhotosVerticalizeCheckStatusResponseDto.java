package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: PhotosVerticalizeCheckStatusResponseDto.kt */
/* loaded from: classes15.dex */
public final class PhotosVerticalizeCheckStatusResponseDto implements Parcelable {
    public static final Parcelable.Creator<PhotosVerticalizeCheckStatusResponseDto> CREATOR = new a();

    @pmi0("error")
    private final PhotosVerticalizeErrorDto error;

    @pmi0("image_urls")
    private final List<String> imageUrls;

    @pmi0("photo_id")
    private final String photoId;

    @pmi0("status")
    private final StatusDto status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PhotosVerticalizeCheckStatusResponseDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("done")
        public static final StatusDto DONE;

        @pmi0("error")
        public static final StatusDto ERROR;

        @pmi0("pending")
        public static final StatusDto PENDING;
        private final String value;

        /* compiled from: PhotosVerticalizeCheckStatusResponseDto.kt */
        public static final class a implements Parcelable.Creator<StatusDto> {
            @Override // android.os.Parcelable.Creator
            public final StatusDto createFromParcel(Parcel parcel) {
                return StatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StatusDto[] newArray(int i) {
                return new StatusDto[i];
            }
        }

        static {
            StatusDto statusDto = new StatusDto("PENDING", 0, "pending");
            PENDING = statusDto;
            StatusDto statusDto2 = new StatusDto("DONE", 1, "done");
            DONE = statusDto2;
            StatusDto statusDto3 = new StatusDto("ERROR", 2, "error");
            ERROR = statusDto3;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3};
            $VALUES = statusDtoArr;
            $ENTRIES = new asp(statusDtoArr);
            CREATOR = new a();
        }

        private StatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StatusDto valueOf(String str) {
            return (StatusDto) Enum.valueOf(StatusDto.class, str);
        }

        public static StatusDto[] values() {
            return (StatusDto[]) $VALUES.clone();
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

    /* compiled from: PhotosVerticalizeCheckStatusResponseDto.kt */
    public static final class a implements Parcelable.Creator<PhotosVerticalizeCheckStatusResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosVerticalizeCheckStatusResponseDto createFromParcel(Parcel parcel) {
            return new PhotosVerticalizeCheckStatusResponseDto(StatusDto.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() == 0 ? null : PhotosVerticalizeErrorDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosVerticalizeCheckStatusResponseDto[] newArray(int i) {
            return new PhotosVerticalizeCheckStatusResponseDto[i];
        }
    }

    public PhotosVerticalizeCheckStatusResponseDto(StatusDto statusDto, List<String> list, String str, PhotosVerticalizeErrorDto photosVerticalizeErrorDto) {
        this.status = statusDto;
        this.imageUrls = list;
        this.photoId = str;
        this.error = photosVerticalizeErrorDto;
    }

    public final PhotosVerticalizeErrorDto d() {
        return this.error;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<String> e() {
        return this.imageUrls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosVerticalizeCheckStatusResponseDto)) {
            return false;
        }
        PhotosVerticalizeCheckStatusResponseDto photosVerticalizeCheckStatusResponseDto = (PhotosVerticalizeCheckStatusResponseDto) obj;
        return this.status == photosVerticalizeCheckStatusResponseDto.status && epx.f(this.imageUrls, photosVerticalizeCheckStatusResponseDto.imageUrls) && epx.f(this.photoId, photosVerticalizeCheckStatusResponseDto.photoId) && epx.f(this.error, photosVerticalizeCheckStatusResponseDto.error);
    }

    public final String f() {
        return this.photoId;
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        List<String> list = this.imageUrls;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.photoId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        PhotosVerticalizeErrorDto photosVerticalizeErrorDto = this.error;
        return hashCode3 + (photosVerticalizeErrorDto != null ? photosVerticalizeErrorDto.hashCode() : 0);
    }

    public final String toString() {
        return "PhotosVerticalizeCheckStatusResponseDto(status=" + this.status + ", imageUrls=" + this.imageUrls + ", photoId=" + this.photoId + ", error=" + this.error + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.status.writeToParcel(parcel, i);
        parcel.writeStringList(this.imageUrls);
        parcel.writeString(this.photoId);
        PhotosVerticalizeErrorDto photosVerticalizeErrorDto = this.error;
        if (photosVerticalizeErrorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photosVerticalizeErrorDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ PhotosVerticalizeCheckStatusResponseDto(StatusDto statusDto, List list, String str, PhotosVerticalizeErrorDto photosVerticalizeErrorDto, int i, zcl zclVar) {
        this(statusDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : photosVerticalizeErrorDto);
    }
}
