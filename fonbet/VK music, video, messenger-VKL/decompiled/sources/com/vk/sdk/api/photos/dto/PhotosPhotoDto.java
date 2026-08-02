package com.vk.sdk.api.photos.dto;

import com.ironsource.O6;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import com.vk.sdk.api.base.dto.BaseLikesDto;
import com.vk.sdk.api.base.dto.BaseObjectCountDto;
import com.vk.sdk.api.base.dto.BasePropertyExistsDto;
import com.vk.sdk.api.base.dto.BaseRepostsInfoDto;
import java.util.List;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.kr;
import xsna.odj;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.vr;
import xsna.zcl;
import xsna.zrp;

/* compiled from: PhotosPhotoDto.kt */
/* loaded from: classes5.dex */
public final class PhotosPhotoDto {

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("album_id")
    private final int albumId;

    @pmi0("can_comment")
    private final BaseBoolIntDto canComment;

    @pmi0("comments")
    private final BaseObjectCountDto comments;

    @pmi0("date")
    private final int date;

    @pmi0("has_tags")
    private final boolean hasTags;

    @pmi0("height")
    private final Integer height;

    @pmi0("hidden")
    private final BasePropertyExistsDto hidden;

    @pmi0("id")
    private final int id;

    @pmi0("images")
    private final List<PhotosImageDto> images;

    @pmi0(O6.s)
    private final Float lat;

    @pmi0("likes")
    private final BaseLikesDto likes;

    /* renamed from: long, reason: not valid java name */
    @pmi0("long")
    private final Float f36long;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("photo_256")
    private final String photo256;

    @pmi0("place")
    private final String place;

    @pmi0("post_id")
    private final Integer postId;

    @pmi0("real_offset")
    private final Integer realOffset;

    @pmi0("reposts")
    private final BaseRepostsInfoDto reposts;

    @pmi0("sizes")
    private final List<PhotosPhotoSizesDto> sizes;

    @pmi0("square_crop")
    private final String squareCrop;

    @pmi0("tags")
    private final BaseObjectCountDto tags;

    @pmi0("text")
    private final String text;

    @pmi0("user_id")
    private final UserId userId;

    @pmi0("vertical_align")
    private final VerticalAlignDto verticalAlign;

    @pmi0("width")
    private final Integer width;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PhotosPhotoDto.kt */
    public static final class VerticalAlignDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VerticalAlignDto[] $VALUES;

        @pmi0("bottom")
        public static final VerticalAlignDto BOTTOM;

        @pmi0("middle")
        public static final VerticalAlignDto MIDDLE;

        @pmi0("top")
        public static final VerticalAlignDto TOP;
        private final String value;

        static {
            VerticalAlignDto verticalAlignDto = new VerticalAlignDto("TOP", 0, "top");
            TOP = verticalAlignDto;
            VerticalAlignDto verticalAlignDto2 = new VerticalAlignDto("MIDDLE", 1, "middle");
            MIDDLE = verticalAlignDto2;
            VerticalAlignDto verticalAlignDto3 = new VerticalAlignDto("BOTTOM", 2, "bottom");
            BOTTOM = verticalAlignDto3;
            VerticalAlignDto[] verticalAlignDtoArr = {verticalAlignDto, verticalAlignDto2, verticalAlignDto3};
            $VALUES = verticalAlignDtoArr;
            $ENTRIES = new asp(verticalAlignDtoArr);
        }

        private VerticalAlignDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static VerticalAlignDto valueOf(String str) {
            return (VerticalAlignDto) Enum.valueOf(VerticalAlignDto.class, str);
        }

        public static VerticalAlignDto[] values() {
            return (VerticalAlignDto[]) $VALUES.clone();
        }
    }

    public PhotosPhotoDto(int i, int i2, int i3, UserId userId, boolean z, String str, Integer num, List<PhotosImageDto> list, Float f, Float f2, String str2, BaseBoolIntDto baseBoolIntDto, String str3, Integer num2, List<PhotosPhotoSizesDto> list2, String str4, String str5, UserId userId2, Integer num3, BaseLikesDto baseLikesDto, BaseObjectCountDto baseObjectCountDto, BaseRepostsInfoDto baseRepostsInfoDto, BaseObjectCountDto baseObjectCountDto2, BasePropertyExistsDto basePropertyExistsDto, Integer num4, VerticalAlignDto verticalAlignDto) {
        this.albumId = i;
        this.date = i2;
        this.id = i3;
        this.ownerId = userId;
        this.hasTags = z;
        this.accessKey = str;
        this.height = num;
        this.images = list;
        this.lat = f;
        this.f36long = f2;
        this.photo256 = str2;
        this.canComment = baseBoolIntDto;
        this.place = str3;
        this.postId = num2;
        this.sizes = list2;
        this.squareCrop = str4;
        this.text = str5;
        this.userId = userId2;
        this.width = num3;
        this.likes = baseLikesDto;
        this.comments = baseObjectCountDto;
        this.reposts = baseRepostsInfoDto;
        this.tags = baseObjectCountDto2;
        this.hidden = basePropertyExistsDto;
        this.realOffset = num4;
        this.verticalAlign = verticalAlignDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosPhotoDto)) {
            return false;
        }
        PhotosPhotoDto photosPhotoDto = (PhotosPhotoDto) obj;
        return this.albumId == photosPhotoDto.albumId && this.date == photosPhotoDto.date && this.id == photosPhotoDto.id && epx.f(this.ownerId, photosPhotoDto.ownerId) && this.hasTags == photosPhotoDto.hasTags && epx.f(this.accessKey, photosPhotoDto.accessKey) && epx.f(this.height, photosPhotoDto.height) && epx.f(this.images, photosPhotoDto.images) && epx.f(this.lat, photosPhotoDto.lat) && epx.f(this.f36long, photosPhotoDto.f36long) && epx.f(this.photo256, photosPhotoDto.photo256) && this.canComment == photosPhotoDto.canComment && epx.f(this.place, photosPhotoDto.place) && epx.f(this.postId, photosPhotoDto.postId) && epx.f(this.sizes, photosPhotoDto.sizes) && epx.f(this.squareCrop, photosPhotoDto.squareCrop) && epx.f(this.text, photosPhotoDto.text) && epx.f(this.userId, photosPhotoDto.userId) && epx.f(this.width, photosPhotoDto.width) && epx.f(this.likes, photosPhotoDto.likes) && epx.f(this.comments, photosPhotoDto.comments) && epx.f(this.reposts, photosPhotoDto.reposts) && epx.f(this.tags, photosPhotoDto.tags) && this.hidden == photosPhotoDto.hidden && epx.f(this.realOffset, photosPhotoDto.realOffset) && this.verticalAlign == photosPhotoDto.verticalAlign;
    }

    public final int hashCode() {
        int b = qoy.b(bh10.a(shy.a(this.id, shy.a(this.date, Integer.hashCode(this.albumId) * 31, 31), 31), 31, this.ownerId.b), 31, this.hasTags);
        String str = this.accessKey;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.height;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<PhotosImageDto> list = this.images;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Float f = this.lat;
        int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f36long;
        int hashCode5 = (hashCode4 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str2 = this.photo256;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.canComment;
        int hashCode7 = (hashCode6 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        String str3 = this.place;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.postId;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<PhotosPhotoSizesDto> list2 = this.sizes;
        int hashCode10 = (hashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.squareCrop;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.text;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        UserId userId = this.userId;
        int hashCode13 = (hashCode12 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num3 = this.width;
        int hashCode14 = (hashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        BaseLikesDto baseLikesDto = this.likes;
        int hashCode15 = (hashCode14 + (baseLikesDto == null ? 0 : baseLikesDto.hashCode())) * 31;
        BaseObjectCountDto baseObjectCountDto = this.comments;
        int hashCode16 = (hashCode15 + (baseObjectCountDto == null ? 0 : baseObjectCountDto.hashCode())) * 31;
        BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
        int hashCode17 = (hashCode16 + (baseRepostsInfoDto == null ? 0 : baseRepostsInfoDto.hashCode())) * 31;
        BaseObjectCountDto baseObjectCountDto2 = this.tags;
        int hashCode18 = (hashCode17 + (baseObjectCountDto2 == null ? 0 : baseObjectCountDto2.hashCode())) * 31;
        BasePropertyExistsDto basePropertyExistsDto = this.hidden;
        int hashCode19 = (hashCode18 + (basePropertyExistsDto == null ? 0 : basePropertyExistsDto.hashCode())) * 31;
        Integer num4 = this.realOffset;
        int hashCode20 = (hashCode19 + (num4 == null ? 0 : num4.hashCode())) * 31;
        VerticalAlignDto verticalAlignDto = this.verticalAlign;
        return hashCode20 + (verticalAlignDto != null ? verticalAlignDto.hashCode() : 0);
    }

    public final String toString() {
        int i = this.albumId;
        int i2 = this.date;
        int i3 = this.id;
        UserId userId = this.ownerId;
        boolean z = this.hasTags;
        String str = this.accessKey;
        Integer num = this.height;
        List<PhotosImageDto> list = this.images;
        Float f = this.lat;
        Float f2 = this.f36long;
        String str2 = this.photo256;
        BaseBoolIntDto baseBoolIntDto = this.canComment;
        String str3 = this.place;
        Integer num2 = this.postId;
        List<PhotosPhotoSizesDto> list2 = this.sizes;
        String str4 = this.squareCrop;
        String str5 = this.text;
        UserId userId2 = this.userId;
        Integer num3 = this.width;
        BaseLikesDto baseLikesDto = this.likes;
        BaseObjectCountDto baseObjectCountDto = this.comments;
        BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
        BaseObjectCountDto baseObjectCountDto2 = this.tags;
        BasePropertyExistsDto basePropertyExistsDto = this.hidden;
        Integer num4 = this.realOffset;
        VerticalAlignDto verticalAlignDto = this.verticalAlign;
        StringBuilder a = odj.a(i, i2, "PhotosPhotoDto(albumId=", ", date=", ", id=");
        a.append(i3);
        a.append(", ownerId=");
        a.append(userId);
        a.append(", hasTags=");
        a.append(z);
        a.append(", accessKey=");
        a.append(str);
        a.append(", height=");
        a.append(num);
        a.append(", images=");
        a.append(list);
        a.append(", lat=");
        a.append(f);
        a.append(", long=");
        a.append(f2);
        a.append(", photo256=");
        a.append(str2);
        a.append(", canComment=");
        a.append(baseBoolIntDto);
        a.append(", place=");
        kr.b(num2, str3, ", postId=", ", sizes=", a);
        vr.c(", squareCrop=", str4, ", text=", a, list2);
        a.append(str5);
        a.append(", userId=");
        a.append(userId2);
        a.append(", width=");
        a.append(num3);
        a.append(", likes=");
        a.append(baseLikesDto);
        a.append(", comments=");
        a.append(baseObjectCountDto);
        a.append(", reposts=");
        a.append(baseRepostsInfoDto);
        a.append(", tags=");
        a.append(baseObjectCountDto2);
        a.append(", hidden=");
        a.append(basePropertyExistsDto);
        a.append(", realOffset=");
        a.append(num4);
        a.append(", verticalAlign=");
        a.append(verticalAlignDto);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ PhotosPhotoDto(int i, int i2, int i3, UserId userId, boolean z, String str, Integer num, List list, Float f, Float f2, String str2, BaseBoolIntDto baseBoolIntDto, String str3, Integer num2, List list2, String str4, String str5, UserId userId2, Integer num3, BaseLikesDto baseLikesDto, BaseObjectCountDto baseObjectCountDto, BaseRepostsInfoDto baseRepostsInfoDto, BaseObjectCountDto baseObjectCountDto2, BasePropertyExistsDto basePropertyExistsDto, Integer num4, VerticalAlignDto verticalAlignDto, int i4, zcl zclVar) {
        this(i, i2, i3, userId, z, (i4 & 32) != 0 ? null : str, (i4 & 64) != 0 ? null : num, (i4 & 128) != 0 ? null : list, (i4 & 256) != 0 ? null : f, (i4 & 512) != 0 ? null : f2, (i4 & 1024) != 0 ? null : str2, (i4 & 2048) != 0 ? null : baseBoolIntDto, (i4 & 4096) != 0 ? null : str3, (i4 & 8192) != 0 ? null : num2, (i4 & 16384) != 0 ? null : list2, (32768 & i4) != 0 ? null : str4, (65536 & i4) != 0 ? null : str5, (131072 & i4) != 0 ? null : userId2, (262144 & i4) != 0 ? null : num3, (524288 & i4) != 0 ? null : baseLikesDto, (1048576 & i4) != 0 ? null : baseObjectCountDto, (2097152 & i4) != 0 ? null : baseRepostsInfoDto, (4194304 & i4) != 0 ? null : baseObjectCountDto2, (8388608 & i4) != 0 ? null : basePropertyExistsDto, (16777216 & i4) != 0 ? null : num4, (i4 & 33554432) != 0 ? null : verticalAlignDto);
    }
}
