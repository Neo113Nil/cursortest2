package com.vk.sdk.api.photos.dto;

import com.vk.dto.common.id.UserId;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.bh10;
import xsna.epx;
import xsna.kh10;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: PhotosPhotoUploadDto.kt */
/* loaded from: classes5.dex */
public final class PhotosPhotoUploadDto {

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

    public PhotosPhotoUploadDto(int i, String str, UserId userId, String str2, UserId userId2) {
        this.albumId = i;
        this.uploadUrl = str;
        this.userId = userId;
        this.fallbackUploadUrl = str2;
        this.groupId = userId2;
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
        int a = bh10.a(urd0.a(Integer.hashCode(this.albumId) * 31, 31, this.uploadUrl), 31, this.userId.b);
        String str = this.fallbackUploadUrl;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        UserId userId = this.groupId;
        return hashCode + (userId != null ? Long.hashCode(userId.b) : 0);
    }

    public final String toString() {
        int i = this.albumId;
        String str = this.uploadUrl;
        UserId userId = this.userId;
        String str2 = this.fallbackUploadUrl;
        UserId userId2 = this.groupId;
        StringBuilder a = kh10.a(i, "PhotosPhotoUploadDto(albumId=", ", uploadUrl=", str, ", userId=");
        a.append(userId);
        a.append(", fallbackUploadUrl=");
        a.append(str2);
        a.append(", groupId=");
        a.append(userId2);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ PhotosPhotoUploadDto(int i, String str, UserId userId, String str2, UserId userId2, int i2, zcl zclVar) {
        this(i, str, userId, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : userId2);
    }
}
