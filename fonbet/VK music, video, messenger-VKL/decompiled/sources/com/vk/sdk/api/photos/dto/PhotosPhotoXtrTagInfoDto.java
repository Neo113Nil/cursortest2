package com.vk.sdk.api.photos.dto;

import com.ironsource.O6;
import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.kr;
import xsna.mq;
import xsna.n6j;
import xsna.odj;
import xsna.pmi0;
import xsna.shy;
import xsna.sq;
import xsna.xq;
import xsna.zcl;

/* compiled from: PhotosPhotoXtrTagInfoDto.kt */
/* loaded from: classes5.dex */
public final class PhotosPhotoXtrTagInfoDto {

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("album_id")
    private final int albumId;

    @pmi0("date")
    private final int date;

    @pmi0("has_tags")
    private final Boolean hasTags;

    @pmi0("height")
    private final Integer height;

    @pmi0("id")
    private final int id;

    @pmi0(O6.s)
    private final Float lat;

    /* renamed from: long, reason: not valid java name */
    @pmi0("long")
    private final Float f37long;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("photo_1280")
    private final String photo1280;

    @pmi0("photo_130")
    private final String photo130;

    @pmi0("photo_2560")
    private final String photo2560;

    @pmi0("photo_604")
    private final String photo604;

    @pmi0("photo_75")
    private final String photo75;

    @pmi0("photo_807")
    private final String photo807;

    @pmi0("placer_id")
    private final Integer placerId;

    @pmi0("post_id")
    private final Integer postId;

    @pmi0("sizes")
    private final List<PhotosPhotoSizesDto> sizes;

    @pmi0("tag_created")
    private final Integer tagCreated;

    @pmi0("tag_id")
    private final Integer tagId;

    @pmi0("text")
    private final String text;

    @pmi0("user_id")
    private final UserId userId;

    @pmi0("width")
    private final Integer width;

    public PhotosPhotoXtrTagInfoDto(int i, int i2, int i3, UserId userId, String str, Integer num, Float f, Float f2, String str2, String str3, String str4, String str5, String str6, String str7, Integer num2, Integer num3, List<PhotosPhotoSizesDto> list, Integer num4, Integer num5, String str8, UserId userId2, Integer num6, Boolean bool) {
        this.albumId = i;
        this.date = i2;
        this.id = i3;
        this.ownerId = userId;
        this.accessKey = str;
        this.height = num;
        this.lat = f;
        this.f37long = f2;
        this.photo1280 = str2;
        this.photo130 = str3;
        this.photo2560 = str4;
        this.photo604 = str5;
        this.photo75 = str6;
        this.photo807 = str7;
        this.placerId = num2;
        this.postId = num3;
        this.sizes = list;
        this.tagCreated = num4;
        this.tagId = num5;
        this.text = str8;
        this.userId = userId2;
        this.width = num6;
        this.hasTags = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosPhotoXtrTagInfoDto)) {
            return false;
        }
        PhotosPhotoXtrTagInfoDto photosPhotoXtrTagInfoDto = (PhotosPhotoXtrTagInfoDto) obj;
        return this.albumId == photosPhotoXtrTagInfoDto.albumId && this.date == photosPhotoXtrTagInfoDto.date && this.id == photosPhotoXtrTagInfoDto.id && epx.f(this.ownerId, photosPhotoXtrTagInfoDto.ownerId) && epx.f(this.accessKey, photosPhotoXtrTagInfoDto.accessKey) && epx.f(this.height, photosPhotoXtrTagInfoDto.height) && epx.f(this.lat, photosPhotoXtrTagInfoDto.lat) && epx.f(this.f37long, photosPhotoXtrTagInfoDto.f37long) && epx.f(this.photo1280, photosPhotoXtrTagInfoDto.photo1280) && epx.f(this.photo130, photosPhotoXtrTagInfoDto.photo130) && epx.f(this.photo2560, photosPhotoXtrTagInfoDto.photo2560) && epx.f(this.photo604, photosPhotoXtrTagInfoDto.photo604) && epx.f(this.photo75, photosPhotoXtrTagInfoDto.photo75) && epx.f(this.photo807, photosPhotoXtrTagInfoDto.photo807) && epx.f(this.placerId, photosPhotoXtrTagInfoDto.placerId) && epx.f(this.postId, photosPhotoXtrTagInfoDto.postId) && epx.f(this.sizes, photosPhotoXtrTagInfoDto.sizes) && epx.f(this.tagCreated, photosPhotoXtrTagInfoDto.tagCreated) && epx.f(this.tagId, photosPhotoXtrTagInfoDto.tagId) && epx.f(this.text, photosPhotoXtrTagInfoDto.text) && epx.f(this.userId, photosPhotoXtrTagInfoDto.userId) && epx.f(this.width, photosPhotoXtrTagInfoDto.width) && epx.f(this.hasTags, photosPhotoXtrTagInfoDto.hasTags);
    }

    public final int hashCode() {
        int a = bh10.a(shy.a(this.id, shy.a(this.date, Integer.hashCode(this.albumId) * 31, 31), 31), 31, this.ownerId.b);
        String str = this.accessKey;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.height;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.lat;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f37long;
        int hashCode4 = (hashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str2 = this.photo1280;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo130;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photo2560;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.photo604;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.photo75;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.photo807;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num2 = this.placerId;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.postId;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<PhotosPhotoSizesDto> list = this.sizes;
        int hashCode13 = (hashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num4 = this.tagCreated;
        int hashCode14 = (hashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.tagId;
        int hashCode15 = (hashCode14 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str8 = this.text;
        int hashCode16 = (hashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
        UserId userId = this.userId;
        int hashCode17 = (hashCode16 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num6 = this.width;
        int hashCode18 = (hashCode17 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Boolean bool = this.hasTags;
        return hashCode18 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        int i = this.albumId;
        int i2 = this.date;
        int i3 = this.id;
        UserId userId = this.ownerId;
        String str = this.accessKey;
        Integer num = this.height;
        Float f = this.lat;
        Float f2 = this.f37long;
        String str2 = this.photo1280;
        String str3 = this.photo130;
        String str4 = this.photo2560;
        String str5 = this.photo604;
        String str6 = this.photo75;
        String str7 = this.photo807;
        Integer num2 = this.placerId;
        Integer num3 = this.postId;
        List<PhotosPhotoSizesDto> list = this.sizes;
        Integer num4 = this.tagCreated;
        Integer num5 = this.tagId;
        String str8 = this.text;
        UserId userId2 = this.userId;
        Integer num6 = this.width;
        Boolean bool = this.hasTags;
        StringBuilder a = odj.a(i, i2, "PhotosPhotoXtrTagInfoDto(albumId=", ", date=", ", id=");
        a.append(i3);
        a.append(", ownerId=");
        a.append(userId);
        a.append(", accessKey=");
        kr.b(num, str, ", height=", ", lat=", a);
        a.append(f);
        a.append(", long=");
        a.append(f2);
        a.append(", photo1280=");
        n6j.b(a, str2, ", photo130=", str3, ", photo2560=");
        n6j.b(a, str4, ", photo604=", str5, ", photo75=");
        n6j.b(a, str6, ", photo807=", str7, ", placerId=");
        sq.b(a, num2, ", postId=", num3, ", sizes=");
        a.append(list);
        a.append(", tagCreated=");
        a.append(num4);
        a.append(", tagId=");
        mq.b(num5, ", text=", str8, ", userId=", a);
        a.append(userId2);
        a.append(", width=");
        a.append(num6);
        a.append(", hasTags=");
        return xq.d(a, bool, ")");
    }

    public /* synthetic */ PhotosPhotoXtrTagInfoDto(int i, int i2, int i3, UserId userId, String str, Integer num, Float f, Float f2, String str2, String str3, String str4, String str5, String str6, String str7, Integer num2, Integer num3, List list, Integer num4, Integer num5, String str8, UserId userId2, Integer num6, Boolean bool, int i4, zcl zclVar) {
        this(i, i2, i3, userId, (i4 & 16) != 0 ? null : str, (i4 & 32) != 0 ? null : num, (i4 & 64) != 0 ? null : f, (i4 & 128) != 0 ? null : f2, (i4 & 256) != 0 ? null : str2, (i4 & 512) != 0 ? null : str3, (i4 & 1024) != 0 ? null : str4, (i4 & 2048) != 0 ? null : str5, (i4 & 4096) != 0 ? null : str6, (i4 & 8192) != 0 ? null : str7, (i4 & 16384) != 0 ? null : num2, (32768 & i4) != 0 ? null : num3, (65536 & i4) != 0 ? null : list, (131072 & i4) != 0 ? null : num4, (262144 & i4) != 0 ? null : num5, (524288 & i4) != 0 ? null : str8, (1048576 & i4) != 0 ? null : userId2, (2097152 & i4) != 0 ? null : num6, (i4 & 4194304) != 0 ? null : bool);
    }
}
