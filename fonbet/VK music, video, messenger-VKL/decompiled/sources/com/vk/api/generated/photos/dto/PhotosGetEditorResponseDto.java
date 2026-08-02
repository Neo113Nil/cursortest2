package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: PhotosGetEditorResponseDto.kt */
/* loaded from: classes15.dex */
public final class PhotosGetEditorResponseDto implements Parcelable {
    public static final Parcelable.Creator<PhotosGetEditorResponseDto> CREATOR = new a();

    @pmi0("can_edited")
    private final boolean canEdited;

    @pmi0("disable_crop")
    private final boolean disableCrop;

    @pmi0("edited")
    private final boolean edited;

    @pmi0("max_photo_size_letter")
    private final String maxPhotoSizeLetter;

    @pmi0("max_photo_url")
    private final String maxPhotoUrl;

    @pmi0("photo_id")
    private final String photoId;

    @pmi0(ApiProtocol.KEY_UPLOAD_URL)
    private final String uploadUrl;

    /* compiled from: PhotosGetEditorResponseDto.kt */
    public static final class a implements Parcelable.Creator<PhotosGetEditorResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosGetEditorResponseDto createFromParcel(Parcel parcel) {
            boolean z;
            String readString = parcel.readString();
            boolean z2 = false;
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new PhotosGetEditorResponseDto(readString, z3, z2, parcel.readInt() == 0 ? z : true, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosGetEditorResponseDto[] newArray(int i) {
            return new PhotosGetEditorResponseDto[i];
        }
    }

    public PhotosGetEditorResponseDto(String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4) {
        this.uploadUrl = str;
        this.edited = z;
        this.canEdited = z2;
        this.disableCrop = z3;
        this.photoId = str2;
        this.maxPhotoUrl = str3;
        this.maxPhotoSizeLetter = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosGetEditorResponseDto)) {
            return false;
        }
        PhotosGetEditorResponseDto photosGetEditorResponseDto = (PhotosGetEditorResponseDto) obj;
        return epx.f(this.uploadUrl, photosGetEditorResponseDto.uploadUrl) && this.edited == photosGetEditorResponseDto.edited && this.canEdited == photosGetEditorResponseDto.canEdited && this.disableCrop == photosGetEditorResponseDto.disableCrop && epx.f(this.photoId, photosGetEditorResponseDto.photoId) && epx.f(this.maxPhotoUrl, photosGetEditorResponseDto.maxPhotoUrl) && epx.f(this.maxPhotoSizeLetter, photosGetEditorResponseDto.maxPhotoSizeLetter);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(this.uploadUrl.hashCode() * 31, 31, this.edited), 31, this.canEdited), 31, this.disableCrop);
        String str = this.photoId;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.maxPhotoUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.maxPhotoSizeLetter;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotosGetEditorResponseDto(uploadUrl=");
        sb.append(this.uploadUrl);
        sb.append(", edited=");
        sb.append(this.edited);
        sb.append(", canEdited=");
        sb.append(this.canEdited);
        sb.append(", disableCrop=");
        sb.append(this.disableCrop);
        sb.append(", photoId=");
        sb.append(this.photoId);
        sb.append(", maxPhotoUrl=");
        sb.append(this.maxPhotoUrl);
        sb.append(", maxPhotoSizeLetter=");
        return ho8.a(sb, this.maxPhotoSizeLetter, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uploadUrl);
        parcel.writeInt(this.edited ? 1 : 0);
        parcel.writeInt(this.canEdited ? 1 : 0);
        parcel.writeInt(this.disableCrop ? 1 : 0);
        parcel.writeString(this.photoId);
        parcel.writeString(this.maxPhotoUrl);
        parcel.writeString(this.maxPhotoSizeLetter);
    }

    public /* synthetic */ PhotosGetEditorResponseDto(String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, int i, zcl zclVar) {
        this(str, z, z2, z3, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
    }
}
