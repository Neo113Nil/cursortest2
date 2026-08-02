package com.vk.sdk.api.photos.dto;

import xsna.epx;
import xsna.n6j;
import xsna.pmi0;
import xsna.urd0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: PhotosSaveOwnerPhotoResponseDto.kt */
/* loaded from: classes5.dex */
public final class PhotosSaveOwnerPhotoResponseDto {

    @pmi0("photo_hash")
    private final String photoHash;

    @pmi0("photo_src")
    private final String photoSrc;

    @pmi0("photo_src_big")
    private final String photoSrcBig;

    @pmi0("photo_src_small")
    private final String photoSrcSmall;

    @pmi0("post_id")
    private final Integer postId;

    @pmi0("saved")
    private final Integer saved;

    public PhotosSaveOwnerPhotoResponseDto(String str, String str2, String str3, String str4, Integer num, Integer num2) {
        this.photoHash = str;
        this.photoSrc = str2;
        this.photoSrcBig = str3;
        this.photoSrcSmall = str4;
        this.saved = num;
        this.postId = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosSaveOwnerPhotoResponseDto)) {
            return false;
        }
        PhotosSaveOwnerPhotoResponseDto photosSaveOwnerPhotoResponseDto = (PhotosSaveOwnerPhotoResponseDto) obj;
        return epx.f(this.photoHash, photosSaveOwnerPhotoResponseDto.photoHash) && epx.f(this.photoSrc, photosSaveOwnerPhotoResponseDto.photoSrc) && epx.f(this.photoSrcBig, photosSaveOwnerPhotoResponseDto.photoSrcBig) && epx.f(this.photoSrcSmall, photosSaveOwnerPhotoResponseDto.photoSrcSmall) && epx.f(this.saved, photosSaveOwnerPhotoResponseDto.saved) && epx.f(this.postId, photosSaveOwnerPhotoResponseDto.postId);
    }

    public final int hashCode() {
        int a = urd0.a(this.photoHash.hashCode() * 31, 31, this.photoSrc);
        String str = this.photoSrcBig;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photoSrcSmall;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.saved;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.postId;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.photoHash;
        String str2 = this.photoSrc;
        String str3 = this.photoSrcBig;
        String str4 = this.photoSrcSmall;
        Integer num = this.saved;
        Integer num2 = this.postId;
        StringBuilder a = xe9.a("PhotosSaveOwnerPhotoResponseDto(photoHash=", str, ", photoSrc=", str2, ", photoSrcBig=");
        n6j.b(a, str3, ", photoSrcSmall=", str4, ", saved=");
        a.append(num);
        a.append(", postId=");
        a.append(num2);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ PhotosSaveOwnerPhotoResponseDto(String str, String str2, String str3, String str4, Integer num, Integer num2, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2);
    }
}
