package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.bh10;
import xsna.epx;
import xsna.gp;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: PhotosPhotoUploadDto.kt */
/* loaded from: classes15.dex */
public final class PhotosPhotoUploadDto implements Parcelable {
    public static final Parcelable.Creator<PhotosPhotoUploadDto> CREATOR = new a();

    @pmi0("album_id")
    private final int albumId;

    @pmi0("fallback_upload_url")
    private final String fallbackUploadUrl;

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0(ApiProtocol.KEY_UPLOAD_URL)
    private final String uploadUrl;

    @pmi0("user_id")
    private final UserId userId;

    /* compiled from: PhotosPhotoUploadDto.kt */
    public static final class a implements Parcelable.Creator<PhotosPhotoUploadDto> {
        @Override // android.os.Parcelable.Creator
        public final PhotosPhotoUploadDto createFromParcel(Parcel parcel) {
            return new PhotosPhotoUploadDto(parcel.readInt(), parcel.readString(), (UserId) parcel.readParcelable(PhotosPhotoUploadDto.class.getClassLoader()), parcel.readString(), (UserId) parcel.readParcelable(PhotosPhotoUploadDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosPhotoUploadDto[] newArray(int i) {
            return new PhotosPhotoUploadDto[i];
        }
    }

    public PhotosPhotoUploadDto(int i, String str, UserId userId, String str2, UserId userId2) {
        this.albumId = i;
        this.uploadUrl = str;
        this.userId = userId;
        this.fallbackUploadUrl = str2;
        this.groupId = userId2;
    }

    public final String d() {
        return this.fallbackUploadUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.uploadUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosPhotoUploadDto)) {
            return false;
        }
        PhotosPhotoUploadDto photosPhotoUploadDto = (PhotosPhotoUploadDto) obj;
        return this.albumId == photosPhotoUploadDto.albumId && epx.f(this.uploadUrl, photosPhotoUploadDto.uploadUrl) && epx.f(this.userId, photosPhotoUploadDto.userId) && epx.f(this.fallbackUploadUrl, photosPhotoUploadDto.fallbackUploadUrl) && epx.f(this.groupId, photosPhotoUploadDto.groupId);
    }

    public final int hashCode() {
        int a2 = bh10.a(urd0.a(Integer.hashCode(this.albumId) * 31, 31, this.uploadUrl), 31, this.userId.b);
        String str = this.fallbackUploadUrl;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        UserId userId = this.groupId;
        return hashCode + (userId != null ? Long.hashCode(userId.b) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotosPhotoUploadDto(albumId=");
        sb.append(this.albumId);
        sb.append(", uploadUrl=");
        sb.append(this.uploadUrl);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", fallbackUploadUrl=");
        sb.append(this.fallbackUploadUrl);
        sb.append(", groupId=");
        return gp.b(sb, this.groupId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.albumId);
        parcel.writeString(this.uploadUrl);
        parcel.writeParcelable(this.userId, i);
        parcel.writeString(this.fallbackUploadUrl);
        parcel.writeParcelable(this.groupId, i);
    }

    public /* synthetic */ PhotosPhotoUploadDto(int i, String str, UserId userId, String str2, UserId userId2, int i2, zcl zclVar) {
        this(i, str, userId, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : userId2);
    }
}
