package com.vk.api.generated.photos.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.O6;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseLikesDto;
import com.vk.api.generated.base.dto.BaseObjectCountDto;
import com.vk.api.generated.base.dto.BasePropertyExistsDto;
import com.vk.api.generated.base.dto.BaseRepostsInfoDto;
import com.vk.api.generated.media.dto.MediaRestrictionDto;
import com.vk.api.generated.nft.dto.NftGetListItemDto;
import com.vk.api.generated.tags.dto.TagsObjectTagDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bh10;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: PhotosPhotoDto.kt */
/* loaded from: classes15.dex */
public final class PhotosPhotoDto implements Parcelable {
    public static final Parcelable.Creator<PhotosPhotoDto> CREATOR = new a();

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("album_id")
    private final int albumId;

    @pmi0("blur_mask")
    private final String blurMask;

    @pmi0("blurred_id")
    private final Integer blurredId;

    @pmi0("blurred_sizes")
    private final List<PhotosPhotoSizesDto> blurredSizes;

    @pmi0("can_be_owner_photo")
    private final BaseBoolIntDto canBeOwnerPhoto;

    @pmi0("can_comment")
    private final BaseBoolIntDto canComment;

    @pmi0("can_repost")
    private final BaseBoolIntDto canRepost;

    @pmi0("comments")
    private final BaseObjectCountDto comments;

    @pmi0("content_tags")
    private final List<TagsObjectTagDto> contentTags;

    @pmi0("crop_data")
    private final List<Integer> cropData;

    @pmi0("date")
    private final int date;

    @pmi0("feed_pinned")
    private final Boolean feedPinned;

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

    @pmi0("is_donut")
    private final Boolean isDonut;

    @pmi0(O6.s)
    private final Float lat;

    @pmi0("likes")
    private final BaseLikesDto likes;

    /* renamed from: long, reason: not valid java name */
    @pmi0("long")
    private final Float f12long;

    @pmi0("nft")
    private final NftGetListItemDto nft;

    @pmi0("orig_photo")
    private final PhotosImageDto origPhoto;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("photo_256")
    private final String photo256;

    @pmi0("photo_before_crop")
    private final PhotosImageDto photoBeforeCrop;

    @pmi0("place")
    private final String place;

    @pmi0("post_id")
    private final Integer postId;

    @pmi0("real_offset")
    private final Integer realOffset;

    @pmi0("reposts")
    private final BaseRepostsInfoDto reposts;

    @pmi0("restrictions")
    private final MediaRestrictionDto restrictions;

    @pmi0("sizes")
    private final List<PhotosPhotoSizesDto> sizes;

    @pmi0("square_crop")
    private final String squareCrop;

    @pmi0("src_big")
    private final String srcBig;

    @pmi0("src_small")
    private final String srcSmall;

    @pmi0("tags")
    private final BaseObjectCountDto tags;

    @pmi0("text")
    private final String text;

    @pmi0("thumb_hash")
    private final String thumbHash;

    @pmi0("user_id")
    private final UserId userId;

    @pmi0("vertical_align")
    private final VerticalAlignDto verticalAlign;

    @pmi0("web_view_token")
    private final String webViewToken;

    @pmi0("width")
    private final Integer width;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PhotosPhotoDto.kt */
    public static final class VerticalAlignDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VerticalAlignDto[] $VALUES;

        @pmi0("bottom")
        public static final VerticalAlignDto BOTTOM;
        public static final Parcelable.Creator<VerticalAlignDto> CREATOR;

        @pmi0("middle")
        public static final VerticalAlignDto MIDDLE;

        @pmi0("top")
        public static final VerticalAlignDto TOP;
        private final String value;

        /* compiled from: PhotosPhotoDto.kt */
        public static final class a implements Parcelable.Creator<VerticalAlignDto> {
            @Override // android.os.Parcelable.Creator
            public final VerticalAlignDto createFromParcel(Parcel parcel) {
                return VerticalAlignDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VerticalAlignDto[] newArray(int i) {
                return new VerticalAlignDto[i];
            }
        }

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
            CREATOR = new a();
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

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: PhotosPhotoDto.kt */
    public static final class a implements Parcelable.Creator<PhotosPhotoDto> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final PhotosPhotoDto createFromParcel(Parcel parcel) {
            Class cls;
            UserId userId;
            boolean z;
            ArrayList arrayList;
            Float valueOf;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int i;
            int i2;
            ArrayList arrayList4;
            ArrayList arrayList5;
            UserId userId2;
            MediaRestrictionDto createFromParcel;
            MediaRestrictionDto mediaRestrictionDto;
            BaseLikesDto createFromParcel2;
            BaseLikesDto baseLikesDto;
            BaseObjectCountDto createFromParcel3;
            BaseObjectCountDto baseObjectCountDto;
            BaseRepostsInfoDto createFromParcel4;
            BaseRepostsInfoDto baseRepostsInfoDto;
            BaseObjectCountDto createFromParcel5;
            BaseObjectCountDto baseObjectCountDto2;
            PhotosImageDto createFromParcel6;
            PhotosImageDto photosImageDto;
            BaseBoolIntDto createFromParcel7;
            BaseBoolIntDto baseBoolIntDto;
            BaseBoolIntDto createFromParcel8;
            BaseBoolIntDto baseBoolIntDto2;
            BasePropertyExistsDto createFromParcel9;
            Boolean valueOf2;
            int i3;
            VerticalAlignDto createFromParcel10;
            VerticalAlignDto verticalAlignDto;
            PhotosImageDto createFromParcel11;
            Boolean valueOf3;
            int i4;
            ArrayList arrayList6;
            int i5;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            UserId userId3 = (UserId) parcel.readParcelable(PhotosPhotoDto.class.getClassLoader());
            if (parcel.readInt() != 0) {
                cls = PhotosPhotoDto.class;
                userId = userId3;
                z = true;
            } else {
                cls = PhotosPhotoDto.class;
                userId = userId3;
                z = false;
            }
            String readString = parcel.readString();
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList = new ArrayList(readInt4);
                int i6 = 0;
                while (i6 != readInt4) {
                    i6 = en.a(PhotosImageDto.CREATOR, parcel, arrayList, i6, 1);
                }
            }
            Float valueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() == 0) {
                valueOf = null;
                arrayList2 = null;
            } else {
                valueOf = Float.valueOf(parcel.readFloat());
                arrayList2 = null;
            }
            String readString2 = parcel.readString();
            Class cls2 = cls;
            Float f = valueOf5;
            String readString3 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto3 = (BaseBoolIntDto) (parcel.readInt() == 0 ? arrayList2 : BaseBoolIntDto.CREATOR.createFromParcel(parcel));
            ArrayList arrayList7 = arrayList;
            Integer num = valueOf4;
            Float f2 = valueOf;
            String readString4 = parcel.readString();
            Object valueOf6 = parcel.readInt() == 0 ? arrayList2 : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                arrayList3 = new ArrayList(readInt5);
                i = readInt;
                int i7 = 0;
                while (true) {
                    i2 = readInt2;
                    if (i7 == readInt5) {
                        break;
                    }
                    i7 = pm0.b(parcel, arrayList3, i7, 1);
                    readInt2 = i2;
                }
            } else {
                i = readInt;
                arrayList3 = arrayList2;
                i2 = readInt2;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt6 = parcel.readInt();
                arrayList4 = new ArrayList(readInt6);
                int i8 = 0;
                while (i8 != readInt6) {
                    i8 = en.a(PhotosPhotoSizesDto.CREATOR, parcel, arrayList4, i8, 1);
                    readInt6 = readInt6;
                    readInt3 = readInt3;
                }
            }
            int i9 = readInt3;
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt7 = parcel.readInt();
                arrayList5 = new ArrayList(readInt7);
                int i10 = 0;
                while (i10 != readInt7) {
                    i10 = en.a(PhotosPhotoSizesDto.CREATOR, parcel, arrayList5, i10, 1);
                    readInt7 = readInt7;
                    arrayList4 = arrayList4;
                }
            }
            ArrayList arrayList8 = arrayList4;
            Integer num2 = valueOf6;
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            NftGetListItemDto createFromParcel12 = parcel.readInt() == 0 ? null : NftGetListItemDto.CREATOR.createFromParcel(parcel);
            UserId userId4 = (UserId) parcel.readParcelable(cls2.getClassLoader());
            int i11 = i2;
            String readString7 = parcel.readString();
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                userId2 = userId4;
                createFromParcel = null;
            } else {
                userId2 = userId4;
                createFromParcel = MediaRestrictionDto.CREATOR.createFromParcel(parcel);
            }
            MediaRestrictionDto mediaRestrictionDto2 = createFromParcel;
            if (parcel.readInt() == 0) {
                mediaRestrictionDto = mediaRestrictionDto2;
                createFromParcel2 = null;
            } else {
                mediaRestrictionDto = mediaRestrictionDto2;
                createFromParcel2 = BaseLikesDto.CREATOR.createFromParcel(parcel);
            }
            BaseLikesDto baseLikesDto2 = createFromParcel2;
            if (parcel.readInt() == 0) {
                baseLikesDto = baseLikesDto2;
                createFromParcel3 = null;
            } else {
                baseLikesDto = baseLikesDto2;
                createFromParcel3 = BaseObjectCountDto.CREATOR.createFromParcel(parcel);
            }
            BaseObjectCountDto baseObjectCountDto3 = createFromParcel3;
            if (parcel.readInt() == 0) {
                baseObjectCountDto = baseObjectCountDto3;
                createFromParcel4 = null;
            } else {
                baseObjectCountDto = baseObjectCountDto3;
                createFromParcel4 = BaseRepostsInfoDto.CREATOR.createFromParcel(parcel);
            }
            BaseRepostsInfoDto baseRepostsInfoDto2 = createFromParcel4;
            if (parcel.readInt() == 0) {
                baseRepostsInfoDto = baseRepostsInfoDto2;
                createFromParcel5 = null;
            } else {
                baseRepostsInfoDto = baseRepostsInfoDto2;
                createFromParcel5 = BaseObjectCountDto.CREATOR.createFromParcel(parcel);
            }
            BaseObjectCountDto baseObjectCountDto4 = createFromParcel5;
            if (parcel.readInt() == 0) {
                baseObjectCountDto2 = baseObjectCountDto4;
                createFromParcel6 = null;
            } else {
                baseObjectCountDto2 = baseObjectCountDto4;
                createFromParcel6 = PhotosImageDto.CREATOR.createFromParcel(parcel);
            }
            PhotosImageDto photosImageDto2 = createFromParcel6;
            if (parcel.readInt() == 0) {
                photosImageDto = photosImageDto2;
                createFromParcel7 = null;
            } else {
                photosImageDto = photosImageDto2;
                createFromParcel7 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto4 = createFromParcel7;
            if (parcel.readInt() == 0) {
                baseBoolIntDto = baseBoolIntDto4;
                createFromParcel8 = null;
            } else {
                baseBoolIntDto = baseBoolIntDto4;
                createFromParcel8 = BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            }
            BaseBoolIntDto baseBoolIntDto5 = createFromParcel8;
            if (parcel.readInt() == 0) {
                baseBoolIntDto2 = baseBoolIntDto5;
                createFromParcel9 = null;
            } else {
                baseBoolIntDto2 = baseBoolIntDto5;
                createFromParcel9 = BasePropertyExistsDto.CREATOR.createFromParcel(parcel);
            }
            BasePropertyExistsDto basePropertyExistsDto = createFromParcel9;
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList arrayList9 = arrayList3;
            ArrayList arrayList10 = arrayList5;
            MediaRestrictionDto mediaRestrictionDto3 = mediaRestrictionDto;
            BaseObjectCountDto baseObjectCountDto5 = baseObjectCountDto2;
            int i12 = i;
            UserId userId5 = userId2;
            BaseRepostsInfoDto baseRepostsInfoDto3 = baseRepostsInfoDto;
            BaseBoolIntDto baseBoolIntDto6 = baseBoolIntDto2;
            String readString8 = parcel.readString();
            BaseLikesDto baseLikesDto3 = baseLikesDto;
            PhotosImageDto photosImageDto3 = photosImageDto;
            Boolean bool = valueOf2;
            String readString9 = parcel.readString();
            if (parcel.readInt() == 0) {
                i3 = i12;
                createFromParcel10 = null;
            } else {
                i3 = i12;
                createFromParcel10 = VerticalAlignDto.CREATOR.createFromParcel(parcel);
            }
            VerticalAlignDto verticalAlignDto2 = createFromParcel10;
            if (parcel.readInt() == 0) {
                verticalAlignDto = verticalAlignDto2;
                createFromParcel11 = null;
            } else {
                verticalAlignDto = verticalAlignDto2;
                createFromParcel11 = PhotosImageDto.CREATOR.createFromParcel(parcel);
            }
            PhotosImageDto photosImageDto4 = createFromParcel11;
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            int i13 = i3;
            String readString10 = parcel.readString();
            Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                i4 = i11;
                i5 = i9;
                arrayList6 = null;
            } else {
                int readInt8 = parcel.readInt();
                i4 = i11;
                arrayList6 = new ArrayList(readInt8);
                i5 = i9;
                int i14 = 0;
                while (i14 != readInt8) {
                    i14 = en.a(TagsObjectTagDto.CREATOR, parcel, arrayList6, i14, 1);
                    readInt8 = readInt8;
                    userId = userId;
                }
            }
            return new PhotosPhotoDto(i13, i4, i5, userId, z, readString, num, arrayList7, f, f2, readString2, readString3, baseBoolIntDto3, readString4, num2, arrayList9, arrayList8, arrayList10, readString5, readString6, createFromParcel12, userId5, readString7, valueOf7, mediaRestrictionDto3, baseLikesDto3, baseObjectCountDto, baseRepostsInfoDto3, baseObjectCountDto5, photosImageDto3, baseBoolIntDto, baseBoolIntDto6, basePropertyExistsDto, bool, valueOf8, readString8, readString9, verticalAlignDto, photosImageDto4, valueOf3, readString10, valueOf9, arrayList6);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotosPhotoDto[] newArray(int i) {
            return new PhotosPhotoDto[i];
        }
    }

    public PhotosPhotoDto(int i, int i2, int i3, UserId userId, boolean z, String str, Integer num, List<PhotosImageDto> list, Float f, Float f2, String str2, String str3, BaseBoolIntDto baseBoolIntDto, String str4, Integer num2, List<Integer> list2, List<PhotosPhotoSizesDto> list3, List<PhotosPhotoSizesDto> list4, String str5, String str6, NftGetListItemDto nftGetListItemDto, UserId userId2, String str7, Integer num3, MediaRestrictionDto mediaRestrictionDto, BaseLikesDto baseLikesDto, BaseObjectCountDto baseObjectCountDto, BaseRepostsInfoDto baseRepostsInfoDto, BaseObjectCountDto baseObjectCountDto2, PhotosImageDto photosImageDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BasePropertyExistsDto basePropertyExistsDto, Boolean bool, Integer num4, String str8, String str9, VerticalAlignDto verticalAlignDto, PhotosImageDto photosImageDto2, Boolean bool2, String str10, Integer num5, List<TagsObjectTagDto> list5) {
        this.albumId = i;
        this.date = i2;
        this.id = i3;
        this.ownerId = userId;
        this.hasTags = z;
        this.accessKey = str;
        this.height = num;
        this.images = list;
        this.lat = f;
        this.f12long = f2;
        this.photo256 = str2;
        this.thumbHash = str3;
        this.canComment = baseBoolIntDto;
        this.place = str4;
        this.postId = num2;
        this.cropData = list2;
        this.sizes = list3;
        this.blurredSizes = list4;
        this.squareCrop = str5;
        this.text = str6;
        this.nft = nftGetListItemDto;
        this.userId = userId2;
        this.webViewToken = str7;
        this.width = num3;
        this.restrictions = mediaRestrictionDto;
        this.likes = baseLikesDto;
        this.comments = baseObjectCountDto;
        this.reposts = baseRepostsInfoDto;
        this.tags = baseObjectCountDto2;
        this.origPhoto = photosImageDto;
        this.canBeOwnerPhoto = baseBoolIntDto2;
        this.canRepost = baseBoolIntDto3;
        this.hidden = basePropertyExistsDto;
        this.feedPinned = bool;
        this.realOffset = num4;
        this.srcSmall = str8;
        this.srcBig = str9;
        this.verticalAlign = verticalAlignDto;
        this.photoBeforeCrop = photosImageDto2;
        this.isDonut = bool2;
        this.blurMask = str10;
        this.blurredId = num5;
        this.contentTags = list5;
    }

    public final Float B() {
        return this.f12long;
    }

    public final PhotosImageDto C() {
        return this.origPhoto;
    }

    public final PhotosImageDto D() {
        return this.photoBeforeCrop;
    }

    public final Integer F() {
        return this.postId;
    }

    public final String F5() {
        return this.thumbHash;
    }

    public final Integer G() {
        return this.realOffset;
    }

    public final BaseRepostsInfoDto K() {
        return this.reposts;
    }

    public final MediaRestrictionDto M() {
        return this.restrictions;
    }

    public final List<PhotosPhotoSizesDto> R() {
        return this.sizes;
    }

    public final String T() {
        return this.squareCrop;
    }

    public final String W() {
        return this.srcBig;
    }

    public final BaseObjectCountDto Z() {
        return this.tags;
    }

    public final String a0() {
        return this.text;
    }

    public final String d() {
        return this.accessKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.albumId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosPhotoDto)) {
            return false;
        }
        PhotosPhotoDto photosPhotoDto = (PhotosPhotoDto) obj;
        return this.albumId == photosPhotoDto.albumId && this.date == photosPhotoDto.date && this.id == photosPhotoDto.id && epx.f(this.ownerId, photosPhotoDto.ownerId) && this.hasTags == photosPhotoDto.hasTags && epx.f(this.accessKey, photosPhotoDto.accessKey) && epx.f(this.height, photosPhotoDto.height) && epx.f(this.images, photosPhotoDto.images) && epx.f(this.lat, photosPhotoDto.lat) && epx.f(this.f12long, photosPhotoDto.f12long) && epx.f(this.photo256, photosPhotoDto.photo256) && epx.f(this.thumbHash, photosPhotoDto.thumbHash) && this.canComment == photosPhotoDto.canComment && epx.f(this.place, photosPhotoDto.place) && epx.f(this.postId, photosPhotoDto.postId) && epx.f(this.cropData, photosPhotoDto.cropData) && epx.f(this.sizes, photosPhotoDto.sizes) && epx.f(this.blurredSizes, photosPhotoDto.blurredSizes) && epx.f(this.squareCrop, photosPhotoDto.squareCrop) && epx.f(this.text, photosPhotoDto.text) && epx.f(this.nft, photosPhotoDto.nft) && epx.f(this.userId, photosPhotoDto.userId) && epx.f(this.webViewToken, photosPhotoDto.webViewToken) && epx.f(this.width, photosPhotoDto.width) && epx.f(this.restrictions, photosPhotoDto.restrictions) && epx.f(this.likes, photosPhotoDto.likes) && epx.f(this.comments, photosPhotoDto.comments) && epx.f(this.reposts, photosPhotoDto.reposts) && epx.f(this.tags, photosPhotoDto.tags) && epx.f(this.origPhoto, photosPhotoDto.origPhoto) && this.canBeOwnerPhoto == photosPhotoDto.canBeOwnerPhoto && this.canRepost == photosPhotoDto.canRepost && this.hidden == photosPhotoDto.hidden && epx.f(this.feedPinned, photosPhotoDto.feedPinned) && epx.f(this.realOffset, photosPhotoDto.realOffset) && epx.f(this.srcSmall, photosPhotoDto.srcSmall) && epx.f(this.srcBig, photosPhotoDto.srcBig) && this.verticalAlign == photosPhotoDto.verticalAlign && epx.f(this.photoBeforeCrop, photosPhotoDto.photoBeforeCrop) && epx.f(this.isDonut, photosPhotoDto.isDonut) && epx.f(this.blurMask, photosPhotoDto.blurMask) && epx.f(this.blurredId, photosPhotoDto.blurredId) && epx.f(this.contentTags, photosPhotoDto.contentTags);
    }

    public final BaseBoolIntDto f() {
        return this.canBeOwnerPhoto;
    }

    public final BaseBoolIntDto g() {
        return this.canComment;
    }

    public final int getId() {
        return this.id;
    }

    public final UserId getUserId() {
        return this.userId;
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
        Float f2 = this.f12long;
        int hashCode5 = (hashCode4 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str2 = this.photo256;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.thumbHash;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.canComment;
        int hashCode8 = (hashCode7 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        String str4 = this.place;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.postId;
        int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<Integer> list2 = this.cropData;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<PhotosPhotoSizesDto> list3 = this.sizes;
        int hashCode12 = (hashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<PhotosPhotoSizesDto> list4 = this.blurredSizes;
        int hashCode13 = (hashCode12 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str5 = this.squareCrop;
        int hashCode14 = (hashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.text;
        int hashCode15 = (hashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        NftGetListItemDto nftGetListItemDto = this.nft;
        int hashCode16 = (hashCode15 + (nftGetListItemDto == null ? 0 : nftGetListItemDto.hashCode())) * 31;
        UserId userId = this.userId;
        int hashCode17 = (hashCode16 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str7 = this.webViewToken;
        int hashCode18 = (hashCode17 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num3 = this.width;
        int hashCode19 = (hashCode18 + (num3 == null ? 0 : num3.hashCode())) * 31;
        MediaRestrictionDto mediaRestrictionDto = this.restrictions;
        int hashCode20 = (hashCode19 + (mediaRestrictionDto == null ? 0 : mediaRestrictionDto.hashCode())) * 31;
        BaseLikesDto baseLikesDto = this.likes;
        int hashCode21 = (hashCode20 + (baseLikesDto == null ? 0 : baseLikesDto.hashCode())) * 31;
        BaseObjectCountDto baseObjectCountDto = this.comments;
        int hashCode22 = (hashCode21 + (baseObjectCountDto == null ? 0 : baseObjectCountDto.hashCode())) * 31;
        BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
        int hashCode23 = (hashCode22 + (baseRepostsInfoDto == null ? 0 : baseRepostsInfoDto.hashCode())) * 31;
        BaseObjectCountDto baseObjectCountDto2 = this.tags;
        int hashCode24 = (hashCode23 + (baseObjectCountDto2 == null ? 0 : baseObjectCountDto2.hashCode())) * 31;
        PhotosImageDto photosImageDto = this.origPhoto;
        int hashCode25 = (hashCode24 + (photosImageDto == null ? 0 : photosImageDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.canBeOwnerPhoto;
        int hashCode26 = (hashCode25 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.canRepost;
        int hashCode27 = (hashCode26 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        BasePropertyExistsDto basePropertyExistsDto = this.hidden;
        int hashCode28 = (hashCode27 + (basePropertyExistsDto == null ? 0 : basePropertyExistsDto.hashCode())) * 31;
        Boolean bool = this.feedPinned;
        int hashCode29 = (hashCode28 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num4 = this.realOffset;
        int hashCode30 = (hashCode29 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str8 = this.srcSmall;
        int hashCode31 = (hashCode30 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.srcBig;
        int hashCode32 = (hashCode31 + (str9 == null ? 0 : str9.hashCode())) * 31;
        VerticalAlignDto verticalAlignDto = this.verticalAlign;
        int hashCode33 = (hashCode32 + (verticalAlignDto == null ? 0 : verticalAlignDto.hashCode())) * 31;
        PhotosImageDto photosImageDto2 = this.photoBeforeCrop;
        int hashCode34 = (hashCode33 + (photosImageDto2 == null ? 0 : photosImageDto2.hashCode())) * 31;
        Boolean bool2 = this.isDonut;
        int hashCode35 = (hashCode34 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str10 = this.blurMask;
        int hashCode36 = (hashCode35 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num5 = this.blurredId;
        int hashCode37 = (hashCode36 + (num5 == null ? 0 : num5.hashCode())) * 31;
        List<TagsObjectTagDto> list5 = this.contentTags;
        return hashCode37 + (list5 != null ? list5.hashCode() : 0);
    }

    public final BaseBoolIntDto i() {
        return this.canRepost;
    }

    public final BaseObjectCountDto j() {
        return this.comments;
    }

    public final int k() {
        return this.date;
    }

    public final Boolean l() {
        return this.feedPinned;
    }

    public final boolean n() {
        return this.hasTags;
    }

    public final BasePropertyExistsDto o() {
        return this.hidden;
    }

    public final Float p() {
        return this.lat;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotosPhotoDto(albumId=");
        sb.append(this.albumId);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", hasTags=");
        sb.append(this.hasTags);
        sb.append(", accessKey=");
        sb.append(this.accessKey);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", lat=");
        sb.append(this.lat);
        sb.append(", long=");
        sb.append(this.f12long);
        sb.append(", photo256=");
        sb.append(this.photo256);
        sb.append(", thumbHash=");
        sb.append(this.thumbHash);
        sb.append(", canComment=");
        sb.append(this.canComment);
        sb.append(", place=");
        sb.append(this.place);
        sb.append(", postId=");
        sb.append(this.postId);
        sb.append(", cropData=");
        sb.append(this.cropData);
        sb.append(", sizes=");
        sb.append(this.sizes);
        sb.append(", blurredSizes=");
        sb.append(this.blurredSizes);
        sb.append(", squareCrop=");
        sb.append(this.squareCrop);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", nft=");
        sb.append(this.nft);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", webViewToken=");
        sb.append(this.webViewToken);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", restrictions=");
        sb.append(this.restrictions);
        sb.append(", likes=");
        sb.append(this.likes);
        sb.append(", comments=");
        sb.append(this.comments);
        sb.append(", reposts=");
        sb.append(this.reposts);
        sb.append(", tags=");
        sb.append(this.tags);
        sb.append(", origPhoto=");
        sb.append(this.origPhoto);
        sb.append(", canBeOwnerPhoto=");
        sb.append(this.canBeOwnerPhoto);
        sb.append(", canRepost=");
        sb.append(this.canRepost);
        sb.append(", hidden=");
        sb.append(this.hidden);
        sb.append(", feedPinned=");
        sb.append(this.feedPinned);
        sb.append(", realOffset=");
        sb.append(this.realOffset);
        sb.append(", srcSmall=");
        sb.append(this.srcSmall);
        sb.append(", srcBig=");
        sb.append(this.srcBig);
        sb.append(", verticalAlign=");
        sb.append(this.verticalAlign);
        sb.append(", photoBeforeCrop=");
        sb.append(this.photoBeforeCrop);
        sb.append(", isDonut=");
        sb.append(this.isDonut);
        sb.append(", blurMask=");
        sb.append(this.blurMask);
        sb.append(", blurredId=");
        sb.append(this.blurredId);
        sb.append(", contentTags=");
        return ms9.a(')', sb, this.contentTags);
    }

    public final BaseLikesDto u() {
        return this.likes;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.albumId);
        parcel.writeInt(this.date);
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.hasTags ? 1 : 0);
        parcel.writeString(this.accessKey);
        Integer num = this.height;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<PhotosImageDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((PhotosImageDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Float f2 = this.lat;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
        Float f3 = this.f12long;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f3);
        }
        parcel.writeString(this.photo256);
        parcel.writeString(this.thumbHash);
        BaseBoolIntDto baseBoolIntDto = this.canComment;
        if (baseBoolIntDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.place);
        Integer num2 = this.postId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        List<Integer> list2 = this.cropData;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list2, 1);
            while (f4.hasNext()) {
                parcel.writeInt(((Number) f4.next()).intValue());
            }
        }
        List<PhotosPhotoSizesDto> list3 = this.sizes;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list3, 1);
            while (f5.hasNext()) {
                ((PhotosPhotoSizesDto) f5.next()).writeToParcel(parcel, i);
            }
        }
        List<PhotosPhotoSizesDto> list4 = this.blurredSizes;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list4, 1);
            while (f6.hasNext()) {
                ((PhotosPhotoSizesDto) f6.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.squareCrop);
        parcel.writeString(this.text);
        NftGetListItemDto nftGetListItemDto = this.nft;
        if (nftGetListItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nftGetListItemDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.userId, i);
        parcel.writeString(this.webViewToken);
        Integer num3 = this.width;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        MediaRestrictionDto mediaRestrictionDto = this.restrictions;
        if (mediaRestrictionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mediaRestrictionDto.writeToParcel(parcel, i);
        }
        BaseLikesDto baseLikesDto = this.likes;
        if (baseLikesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLikesDto.writeToParcel(parcel, i);
        }
        BaseObjectCountDto baseObjectCountDto = this.comments;
        if (baseObjectCountDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseObjectCountDto.writeToParcel(parcel, i);
        }
        BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
        if (baseRepostsInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseRepostsInfoDto.writeToParcel(parcel, i);
        }
        BaseObjectCountDto baseObjectCountDto2 = this.tags;
        if (baseObjectCountDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseObjectCountDto2.writeToParcel(parcel, i);
        }
        PhotosImageDto photosImageDto = this.origPhoto;
        if (photosImageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photosImageDto.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto2 = this.canBeOwnerPhoto;
        if (baseBoolIntDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto2.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto3 = this.canRepost;
        if (baseBoolIntDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto3.writeToParcel(parcel, i);
        }
        BasePropertyExistsDto basePropertyExistsDto = this.hidden;
        if (basePropertyExistsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basePropertyExistsDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.feedPinned;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num4 = this.realOffset;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        parcel.writeString(this.srcSmall);
        parcel.writeString(this.srcBig);
        VerticalAlignDto verticalAlignDto = this.verticalAlign;
        if (verticalAlignDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            verticalAlignDto.writeToParcel(parcel, i);
        }
        PhotosImageDto photosImageDto2 = this.photoBeforeCrop;
        if (photosImageDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photosImageDto2.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.isDonut;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.blurMask);
        Integer num5 = this.blurredId;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        List<TagsObjectTagDto> list5 = this.contentTags;
        if (list5 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f7 = dn.f(parcel, list5, 1);
        while (f7.hasNext()) {
            ((TagsObjectTagDto) f7.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ PhotosPhotoDto(int i, int i2, int i3, UserId userId, boolean z, String str, Integer num, List list, Float f, Float f2, String str2, String str3, BaseBoolIntDto baseBoolIntDto, String str4, Integer num2, List list2, List list3, List list4, String str5, String str6, NftGetListItemDto nftGetListItemDto, UserId userId2, String str7, Integer num3, MediaRestrictionDto mediaRestrictionDto, BaseLikesDto baseLikesDto, BaseObjectCountDto baseObjectCountDto, BaseRepostsInfoDto baseRepostsInfoDto, BaseObjectCountDto baseObjectCountDto2, PhotosImageDto photosImageDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BasePropertyExistsDto basePropertyExistsDto, Boolean bool, Integer num4, String str8, String str9, VerticalAlignDto verticalAlignDto, PhotosImageDto photosImageDto2, Boolean bool2, String str10, Integer num5, List list5, int i4, int i5, zcl zclVar) {
        this(i, i2, i3, userId, z, (i4 & 32) != 0 ? null : str, (i4 & 64) != 0 ? null : num, (i4 & 128) != 0 ? null : list, (i4 & 256) != 0 ? null : f, (i4 & 512) != 0 ? null : f2, (i4 & 1024) != 0 ? null : str2, (i4 & 2048) != 0 ? null : str3, (i4 & 4096) != 0 ? null : baseBoolIntDto, (i4 & 8192) != 0 ? null : str4, (i4 & 16384) != 0 ? null : num2, (32768 & i4) != 0 ? null : list2, (65536 & i4) != 0 ? null : list3, (131072 & i4) != 0 ? null : list4, (262144 & i4) != 0 ? null : str5, (524288 & i4) != 0 ? null : str6, (1048576 & i4) != 0 ? null : nftGetListItemDto, (2097152 & i4) != 0 ? null : userId2, (4194304 & i4) != 0 ? null : str7, (8388608 & i4) != 0 ? null : num3, (16777216 & i4) != 0 ? null : mediaRestrictionDto, (33554432 & i4) != 0 ? null : baseLikesDto, (67108864 & i4) != 0 ? null : baseObjectCountDto, (134217728 & i4) != 0 ? null : baseRepostsInfoDto, (268435456 & i4) != 0 ? null : baseObjectCountDto2, (536870912 & i4) != 0 ? null : photosImageDto, (1073741824 & i4) != 0 ? null : baseBoolIntDto2, (i4 & Integer.MIN_VALUE) != 0 ? null : baseBoolIntDto3, (i5 & 1) != 0 ? null : basePropertyExistsDto, (i5 & 2) != 0 ? null : bool, (i5 & 4) != 0 ? null : num4, (i5 & 8) != 0 ? null : str8, (i5 & 16) != 0 ? null : str9, (i5 & 32) != 0 ? null : verticalAlignDto, (i5 & 64) != 0 ? null : photosImageDto2, (i5 & 128) != 0 ? null : bool2, (i5 & 256) != 0 ? null : str10, (i5 & 512) != 0 ? null : num5, (i5 & 1024) != 0 ? null : list5);
    }
}
