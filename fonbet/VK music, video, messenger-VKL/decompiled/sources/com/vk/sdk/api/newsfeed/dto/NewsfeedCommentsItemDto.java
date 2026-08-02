package com.vk.sdk.api.newsfeed.dto;

import com.google.gson.internal.bind.TreeTypeAdapter;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.Gc;
import com.ironsource.O6;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.model.history.b;
import com.vk.sdk.api.audio.dto.AudioArtistDto;
import com.vk.sdk.api.audio.dto.AudioGenreDto;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import com.vk.sdk.api.base.dto.BaseLikesDto;
import com.vk.sdk.api.base.dto.BaseLikesInfoDto;
import com.vk.sdk.api.base.dto.BaseObjectCountDto;
import com.vk.sdk.api.base.dto.BasePropertyExistsDto;
import com.vk.sdk.api.base.dto.BaseRepostsInfoDto;
import com.vk.sdk.api.market.dto.MarketMarketCategoryDto;
import com.vk.sdk.api.market.dto.MarketMarketItemAvailabilityDto;
import com.vk.sdk.api.market.dto.MarketPriceDto;
import com.vk.sdk.api.photos.dto.PhotosImageDto;
import com.vk.sdk.api.photos.dto.PhotosPhotoSizesDto;
import com.vk.sdk.api.video.dto.VideoVideoImageDto;
import com.vk.sdk.api.wall.dto.WallGeoDto;
import com.vk.sdk.api.wall.dto.WallPostCopyrightDto;
import com.vk.sdk.api.wall.dto.WallPostSourceDto;
import com.vk.sdk.api.wall.dto.WallPostTypeDto;
import com.vk.sdk.api.wall.dto.WallViewsDto;
import com.vk.sdk.api.wall.dto.WallWallpostAttachmentDto;
import com.vk.sdk.api.wall.dto.WallWallpostDonutDto;
import com.vk.sdk.api.wall.dto.WallWallpostFullDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.bh10;
import xsna.epx;
import xsna.go9;
import xsna.kr;
import xsna.l4;
import xsna.mq;
import xsna.n6j;
import xsna.nyh0;
import xsna.odj;
import xsna.oq;
import xsna.pmi0;
import xsna.qoy;
import xsna.rq;
import xsna.shy;
import xsna.sq;
import xsna.to;
import xsna.tq;
import xsna.up;
import xsna.uq;
import xsna.urd0;
import xsna.vq;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NewsfeedCommentsItemDto.kt */
/* loaded from: classes5.dex */
public abstract class NewsfeedCommentsItemDto {

    /* compiled from: NewsfeedCommentsItemDto.kt */
    public static final class Deserializer implements a9y<NewsfeedCommentsItemDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                switch (f.hashCode()) {
                    case -1081306052:
                        if (f.equals("market")) {
                            return (NewsfeedCommentsItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedCommentsItemTypeMarketDto.class);
                        }
                        break;
                    case 3446944:
                        if (f.equals("post")) {
                            return (NewsfeedCommentsItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedCommentsItemTypePostDto.class);
                        }
                        break;
                    case 105008833:
                        if (f.equals("notes")) {
                            return (NewsfeedCommentsItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedCommentsItemTypeNotesDto.class);
                        }
                        break;
                    case 106642994:
                        if (f.equals("photo")) {
                            return (NewsfeedCommentsItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedCommentsItemTypePhotoDto.class);
                        }
                        break;
                    case 110546223:
                        if (f.equals("topic")) {
                            return (NewsfeedCommentsItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedCommentsItemTypeTopicDto.class);
                        }
                        break;
                    case 112202875:
                        if (f.equals("video")) {
                            return (NewsfeedCommentsItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedCommentsItemTypeVideoDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: NewsfeedCommentsItemDto.kt */
    public static final class NewsfeedCommentsItemTypeMarketDto extends NewsfeedCommentsItemDto {

        @pmi0("access_key")
        private final String accessKey;

        @pmi0("availability")
        private final MarketMarketItemAvailabilityDto availability;

        @pmi0("button_title")
        private final String buttonTitle;

        @pmi0("category")
        private final MarketMarketCategoryDto category;

        @pmi0("category_v2")
        private final MarketMarketCategoryDto categoryV2;

        @pmi0("comments")
        private final NewsfeedCommentsBaseDto comments;

        @pmi0("date")
        private final Integer date;

        @pmi0("description")
        private final String description;

        @pmi0("external_id")
        private final String externalId;

        @pmi0("id")
        private final int id;

        @pmi0("is_adult")
        private final Boolean isAdult;

        @pmi0("is_favorite")
        private final Boolean isFavorite;

        @pmi0("is_main_variant")
        private final Boolean isMainVariant;

        @pmi0("is_owner")
        private final Boolean isOwner;

        @pmi0("likes")
        private final BaseLikesDto likes;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("post_id")
        private final Integer postId;

        @pmi0("post_owner_id")
        private final UserId postOwnerId;

        @pmi0("price")
        private final MarketPriceDto price;

        @pmi0("sku")
        private final String sku;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("thumb_photo")
        private final String thumbPhoto;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        @pmi0("url")
        private final String url;

        @pmi0("variants_grouping_id")
        private final Integer variantsGroupingId;

        public /* synthetic */ NewsfeedCommentsItemTypeMarketDto(MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto, MarketMarketCategoryDto marketMarketCategoryDto, String str, int i, UserId userId, MarketPriceDto marketPriceDto, String str2, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, NewsfeedCommentsBaseDto newsfeedCommentsBaseDto, BaseLikesDto baseLikesDto, String str3, String str4, MarketMarketCategoryDto marketMarketCategoryDto2, Integer num, String str5, Boolean bool, Boolean bool2, Boolean bool3, String str6, String str7, Integer num2, Boolean bool4, String str8, Integer num3, UserId userId2, UserId userId3, int i2, zcl zclVar) {
            this(marketMarketItemAvailabilityDto, marketMarketCategoryDto, str, i, userId, marketPriceDto, str2, newsfeedNewsfeedItemTypeDto, (i2 & 256) != 0 ? null : newsfeedCommentsBaseDto, (i2 & 512) != 0 ? null : baseLikesDto, (i2 & 1024) != 0 ? null : str3, (i2 & 2048) != 0 ? null : str4, (i2 & 4096) != 0 ? null : marketMarketCategoryDto2, (i2 & 8192) != 0 ? null : num, (i2 & 16384) != 0 ? null : str5, (32768 & i2) != 0 ? null : bool, (65536 & i2) != 0 ? null : bool2, (131072 & i2) != 0 ? null : bool3, (262144 & i2) != 0 ? null : str6, (524288 & i2) != 0 ? null : str7, (1048576 & i2) != 0 ? null : num2, (2097152 & i2) != 0 ? null : bool4, (4194304 & i2) != 0 ? null : str8, (8388608 & i2) != 0 ? null : num3, (16777216 & i2) != 0 ? null : userId2, (i2 & 33554432) != 0 ? null : userId3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedCommentsItemTypeMarketDto)) {
                return false;
            }
            NewsfeedCommentsItemTypeMarketDto newsfeedCommentsItemTypeMarketDto = (NewsfeedCommentsItemTypeMarketDto) obj;
            return this.availability == newsfeedCommentsItemTypeMarketDto.availability && epx.f(this.category, newsfeedCommentsItemTypeMarketDto.category) && epx.f(this.description, newsfeedCommentsItemTypeMarketDto.description) && this.id == newsfeedCommentsItemTypeMarketDto.id && epx.f(this.ownerId, newsfeedCommentsItemTypeMarketDto.ownerId) && epx.f(this.price, newsfeedCommentsItemTypeMarketDto.price) && epx.f(this.title, newsfeedCommentsItemTypeMarketDto.title) && this.type == newsfeedCommentsItemTypeMarketDto.type && epx.f(this.comments, newsfeedCommentsItemTypeMarketDto.comments) && epx.f(this.likes, newsfeedCommentsItemTypeMarketDto.likes) && epx.f(this.accessKey, newsfeedCommentsItemTypeMarketDto.accessKey) && epx.f(this.buttonTitle, newsfeedCommentsItemTypeMarketDto.buttonTitle) && epx.f(this.categoryV2, newsfeedCommentsItemTypeMarketDto.categoryV2) && epx.f(this.date, newsfeedCommentsItemTypeMarketDto.date) && epx.f(this.externalId, newsfeedCommentsItemTypeMarketDto.externalId) && epx.f(this.isFavorite, newsfeedCommentsItemTypeMarketDto.isFavorite) && epx.f(this.isOwner, newsfeedCommentsItemTypeMarketDto.isOwner) && epx.f(this.isAdult, newsfeedCommentsItemTypeMarketDto.isAdult) && epx.f(this.thumbPhoto, newsfeedCommentsItemTypeMarketDto.thumbPhoto) && epx.f(this.url, newsfeedCommentsItemTypeMarketDto.url) && epx.f(this.variantsGroupingId, newsfeedCommentsItemTypeMarketDto.variantsGroupingId) && epx.f(this.isMainVariant, newsfeedCommentsItemTypeMarketDto.isMainVariant) && epx.f(this.sku, newsfeedCommentsItemTypeMarketDto.sku) && epx.f(this.postId, newsfeedCommentsItemTypeMarketDto.postId) && epx.f(this.postOwnerId, newsfeedCommentsItemTypeMarketDto.postOwnerId) && epx.f(this.sourceId, newsfeedCommentsItemTypeMarketDto.sourceId);
        }

        public final int hashCode() {
            int hashCode = (this.type.hashCode() + urd0.a((this.price.hashCode() + bh10.a(shy.a(this.id, urd0.a((this.category.hashCode() + (this.availability.hashCode() * 31)) * 31, 31, this.description), 31), 31, this.ownerId.b)) * 31, 31, this.title)) * 31;
            NewsfeedCommentsBaseDto newsfeedCommentsBaseDto = this.comments;
            int hashCode2 = (hashCode + (newsfeedCommentsBaseDto == null ? 0 : newsfeedCommentsBaseDto.hashCode())) * 31;
            BaseLikesDto baseLikesDto = this.likes;
            int hashCode3 = (hashCode2 + (baseLikesDto == null ? 0 : baseLikesDto.hashCode())) * 31;
            String str = this.accessKey;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.buttonTitle;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            MarketMarketCategoryDto marketMarketCategoryDto = this.categoryV2;
            int hashCode6 = (hashCode5 + (marketMarketCategoryDto == null ? 0 : marketMarketCategoryDto.hashCode())) * 31;
            Integer num = this.date;
            int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.externalId;
            int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool = this.isFavorite;
            int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isOwner;
            int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.isAdult;
            int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str4 = this.thumbPhoto;
            int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.url;
            int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num2 = this.variantsGroupingId;
            int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Boolean bool4 = this.isMainVariant;
            int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            String str6 = this.sku;
            int hashCode16 = (hashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num3 = this.postId;
            int hashCode17 = (hashCode16 + (num3 == null ? 0 : num3.hashCode())) * 31;
            UserId userId = this.postOwnerId;
            int hashCode18 = (hashCode17 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            UserId userId2 = this.sourceId;
            return hashCode18 + (userId2 != null ? Long.hashCode(userId2.b) : 0);
        }

        public final String toString() {
            MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto = this.availability;
            MarketMarketCategoryDto marketMarketCategoryDto = this.category;
            String str = this.description;
            int i = this.id;
            UserId userId = this.ownerId;
            MarketPriceDto marketPriceDto = this.price;
            String str2 = this.title;
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            NewsfeedCommentsBaseDto newsfeedCommentsBaseDto = this.comments;
            BaseLikesDto baseLikesDto = this.likes;
            String str3 = this.accessKey;
            String str4 = this.buttonTitle;
            MarketMarketCategoryDto marketMarketCategoryDto2 = this.categoryV2;
            Integer num = this.date;
            String str5 = this.externalId;
            Boolean bool = this.isFavorite;
            Boolean bool2 = this.isOwner;
            Boolean bool3 = this.isAdult;
            String str6 = this.thumbPhoto;
            String str7 = this.url;
            Integer num2 = this.variantsGroupingId;
            Boolean bool4 = this.isMainVariant;
            String str8 = this.sku;
            Integer num3 = this.postId;
            UserId userId2 = this.postOwnerId;
            UserId userId3 = this.sourceId;
            StringBuilder sb = new StringBuilder("NewsfeedCommentsItemTypeMarketDto(availability=");
            sb.append(marketMarketItemAvailabilityDto);
            sb.append(", category=");
            sb.append(marketMarketCategoryDto);
            sb.append(", description=");
            nyh0.a(i, str, ", id=", ", ownerId=", sb);
            sb.append(userId);
            sb.append(", price=");
            sb.append(marketPriceDto);
            sb.append(", title=");
            sb.append(str2);
            sb.append(", type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", comments=");
            sb.append(newsfeedCommentsBaseDto);
            sb.append(", likes=");
            sb.append(baseLikesDto);
            sb.append(", accessKey=");
            n6j.b(sb, str3, ", buttonTitle=", str4, ", categoryV2=");
            sb.append(marketMarketCategoryDto2);
            sb.append(", date=");
            sb.append(num);
            sb.append(", externalId=");
            uq.c(bool, str5, ", isFavorite=", ", isOwner=", sb);
            tq.i(sb, bool2, ", isAdult=", bool3, ", thumbPhoto=");
            n6j.b(sb, str6, ", url=", str7, ", variantsGroupingId=");
            rq.h(sb, num2, ", isMainVariant=", bool4, ", sku=");
            kr.b(num3, str8, ", postId=", ", postOwnerId=", sb);
            sb.append(userId2);
            sb.append(", sourceId=");
            sb.append(userId3);
            sb.append(")");
            return sb.toString();
        }

        public NewsfeedCommentsItemTypeMarketDto(MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto, MarketMarketCategoryDto marketMarketCategoryDto, String str, int i, UserId userId, MarketPriceDto marketPriceDto, String str2, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, NewsfeedCommentsBaseDto newsfeedCommentsBaseDto, BaseLikesDto baseLikesDto, String str3, String str4, MarketMarketCategoryDto marketMarketCategoryDto2, Integer num, String str5, Boolean bool, Boolean bool2, Boolean bool3, String str6, String str7, Integer num2, Boolean bool4, String str8, Integer num3, UserId userId2, UserId userId3) {
            super(null);
            this.availability = marketMarketItemAvailabilityDto;
            this.category = marketMarketCategoryDto;
            this.description = str;
            this.id = i;
            this.ownerId = userId;
            this.price = marketPriceDto;
            this.title = str2;
            this.type = newsfeedNewsfeedItemTypeDto;
            this.comments = newsfeedCommentsBaseDto;
            this.likes = baseLikesDto;
            this.accessKey = str3;
            this.buttonTitle = str4;
            this.categoryV2 = marketMarketCategoryDto2;
            this.date = num;
            this.externalId = str5;
            this.isFavorite = bool;
            this.isOwner = bool2;
            this.isAdult = bool3;
            this.thumbPhoto = str6;
            this.url = str7;
            this.variantsGroupingId = num2;
            this.isMainVariant = bool4;
            this.sku = str8;
            this.postId = num3;
            this.postOwnerId = userId2;
            this.sourceId = userId3;
        }
    }

    /* compiled from: NewsfeedCommentsItemDto.kt */
    public static final class NewsfeedCommentsItemTypeNotesDto extends NewsfeedCommentsItemDto {

        @pmi0("comments")
        private final NewsfeedCommentsBaseDto comments;

        @pmi0("date")
        private final Integer date;

        @pmi0("likes")
        private final BaseLikesDto likes;

        @pmi0("post_id")
        private final Integer postId;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("text")
        private final String text;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        public /* synthetic */ NewsfeedCommentsItemTypeNotesDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, String str, NewsfeedCommentsBaseDto newsfeedCommentsBaseDto, BaseLikesDto baseLikesDto, UserId userId, Integer num, Integer num2, int i, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : newsfeedCommentsBaseDto, (i & 8) != 0 ? null : baseLikesDto, (i & 16) != 0 ? null : userId, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedCommentsItemTypeNotesDto)) {
                return false;
            }
            NewsfeedCommentsItemTypeNotesDto newsfeedCommentsItemTypeNotesDto = (NewsfeedCommentsItemTypeNotesDto) obj;
            return this.type == newsfeedCommentsItemTypeNotesDto.type && epx.f(this.text, newsfeedCommentsItemTypeNotesDto.text) && epx.f(this.comments, newsfeedCommentsItemTypeNotesDto.comments) && epx.f(this.likes, newsfeedCommentsItemTypeNotesDto.likes) && epx.f(this.sourceId, newsfeedCommentsItemTypeNotesDto.sourceId) && epx.f(this.date, newsfeedCommentsItemTypeNotesDto.date) && epx.f(this.postId, newsfeedCommentsItemTypeNotesDto.postId);
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            String str = this.text;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            NewsfeedCommentsBaseDto newsfeedCommentsBaseDto = this.comments;
            int hashCode3 = (hashCode2 + (newsfeedCommentsBaseDto == null ? 0 : newsfeedCommentsBaseDto.hashCode())) * 31;
            BaseLikesDto baseLikesDto = this.likes;
            int hashCode4 = (hashCode3 + (baseLikesDto == null ? 0 : baseLikesDto.hashCode())) * 31;
            UserId userId = this.sourceId;
            int hashCode5 = (hashCode4 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            Integer num = this.date;
            int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.postId;
            return hashCode6 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            String str = this.text;
            NewsfeedCommentsBaseDto newsfeedCommentsBaseDto = this.comments;
            BaseLikesDto baseLikesDto = this.likes;
            UserId userId = this.sourceId;
            Integer num = this.date;
            Integer num2 = this.postId;
            StringBuilder sb = new StringBuilder("NewsfeedCommentsItemTypeNotesDto(type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", text=");
            sb.append(str);
            sb.append(", comments=");
            sb.append(newsfeedCommentsBaseDto);
            sb.append(", likes=");
            sb.append(baseLikesDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            sb.append(num);
            sb.append(", postId=");
            return oq.b(sb, num2, ")");
        }

        public NewsfeedCommentsItemTypeNotesDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, String str, NewsfeedCommentsBaseDto newsfeedCommentsBaseDto, BaseLikesDto baseLikesDto, UserId userId, Integer num, Integer num2) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.text = str;
            this.comments = newsfeedCommentsBaseDto;
            this.likes = baseLikesDto;
            this.sourceId = userId;
            this.date = num;
            this.postId = num2;
        }
    }

    /* compiled from: NewsfeedCommentsItemDto.kt */
    public static final class NewsfeedCommentsItemTypePhotoDto extends NewsfeedCommentsItemDto {

        @pmi0("access_key")
        private final String accessKey;

        @pmi0("album_id")
        private final int albumId;

        @pmi0("can_comment")
        private final BaseBoolIntDto canComment;

        @pmi0("comments")
        private final NewsfeedCommentsBaseDto comments;

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
        private final Float f35long;

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

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("square_crop")
        private final String squareCrop;

        @pmi0("tags")
        private final BaseObjectCountDto tags;

        @pmi0("text")
        private final String text;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        @pmi0("user_id")
        private final UserId userId;

        @pmi0("vertical_align")
        private final VerticalAlignDto verticalAlign;

        @pmi0("width")
        private final Integer width;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedCommentsItemDto.kt */
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

        public /* synthetic */ NewsfeedCommentsItemTypePhotoDto(int i, int i2, int i3, UserId userId, boolean z, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, NewsfeedCommentsBaseDto newsfeedCommentsBaseDto, BaseLikesDto baseLikesDto, String str, Integer num, List list, Float f, Float f2, String str2, BaseBoolIntDto baseBoolIntDto, String str3, Integer num2, List list2, String str4, String str5, UserId userId2, Integer num3, BaseRepostsInfoDto baseRepostsInfoDto, BaseObjectCountDto baseObjectCountDto, BasePropertyExistsDto basePropertyExistsDto, Integer num4, VerticalAlignDto verticalAlignDto, UserId userId3, int i4, zcl zclVar) {
            this(i, i2, i3, userId, z, newsfeedNewsfeedItemTypeDto, (i4 & 64) != 0 ? null : newsfeedCommentsBaseDto, (i4 & 128) != 0 ? null : baseLikesDto, (i4 & 256) != 0 ? null : str, (i4 & 512) != 0 ? null : num, (i4 & 1024) != 0 ? null : list, (i4 & 2048) != 0 ? null : f, (i4 & 4096) != 0 ? null : f2, (i4 & 8192) != 0 ? null : str2, (i4 & 16384) != 0 ? null : baseBoolIntDto, (32768 & i4) != 0 ? null : str3, (65536 & i4) != 0 ? null : num2, (131072 & i4) != 0 ? null : list2, (262144 & i4) != 0 ? null : str4, (524288 & i4) != 0 ? null : str5, (1048576 & i4) != 0 ? null : userId2, (2097152 & i4) != 0 ? null : num3, (4194304 & i4) != 0 ? null : baseRepostsInfoDto, (8388608 & i4) != 0 ? null : baseObjectCountDto, (16777216 & i4) != 0 ? null : basePropertyExistsDto, (33554432 & i4) != 0 ? null : num4, (67108864 & i4) != 0 ? null : verticalAlignDto, (i4 & 134217728) != 0 ? null : userId3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedCommentsItemTypePhotoDto)) {
                return false;
            }
            NewsfeedCommentsItemTypePhotoDto newsfeedCommentsItemTypePhotoDto = (NewsfeedCommentsItemTypePhotoDto) obj;
            return this.albumId == newsfeedCommentsItemTypePhotoDto.albumId && this.date == newsfeedCommentsItemTypePhotoDto.date && this.id == newsfeedCommentsItemTypePhotoDto.id && epx.f(this.ownerId, newsfeedCommentsItemTypePhotoDto.ownerId) && this.hasTags == newsfeedCommentsItemTypePhotoDto.hasTags && this.type == newsfeedCommentsItemTypePhotoDto.type && epx.f(this.comments, newsfeedCommentsItemTypePhotoDto.comments) && epx.f(this.likes, newsfeedCommentsItemTypePhotoDto.likes) && epx.f(this.accessKey, newsfeedCommentsItemTypePhotoDto.accessKey) && epx.f(this.height, newsfeedCommentsItemTypePhotoDto.height) && epx.f(this.images, newsfeedCommentsItemTypePhotoDto.images) && epx.f(this.lat, newsfeedCommentsItemTypePhotoDto.lat) && epx.f(this.f35long, newsfeedCommentsItemTypePhotoDto.f35long) && epx.f(this.photo256, newsfeedCommentsItemTypePhotoDto.photo256) && this.canComment == newsfeedCommentsItemTypePhotoDto.canComment && epx.f(this.place, newsfeedCommentsItemTypePhotoDto.place) && epx.f(this.postId, newsfeedCommentsItemTypePhotoDto.postId) && epx.f(this.sizes, newsfeedCommentsItemTypePhotoDto.sizes) && epx.f(this.squareCrop, newsfeedCommentsItemTypePhotoDto.squareCrop) && epx.f(this.text, newsfeedCommentsItemTypePhotoDto.text) && epx.f(this.userId, newsfeedCommentsItemTypePhotoDto.userId) && epx.f(this.width, newsfeedCommentsItemTypePhotoDto.width) && epx.f(this.reposts, newsfeedCommentsItemTypePhotoDto.reposts) && epx.f(this.tags, newsfeedCommentsItemTypePhotoDto.tags) && this.hidden == newsfeedCommentsItemTypePhotoDto.hidden && epx.f(this.realOffset, newsfeedCommentsItemTypePhotoDto.realOffset) && this.verticalAlign == newsfeedCommentsItemTypePhotoDto.verticalAlign && epx.f(this.sourceId, newsfeedCommentsItemTypePhotoDto.sourceId);
        }

        public final int hashCode() {
            int hashCode = (this.type.hashCode() + qoy.b(bh10.a(shy.a(this.id, shy.a(this.date, Integer.hashCode(this.albumId) * 31, 31), 31), 31, this.ownerId.b), 31, this.hasTags)) * 31;
            NewsfeedCommentsBaseDto newsfeedCommentsBaseDto = this.comments;
            int hashCode2 = (hashCode + (newsfeedCommentsBaseDto == null ? 0 : newsfeedCommentsBaseDto.hashCode())) * 31;
            BaseLikesDto baseLikesDto = this.likes;
            int hashCode3 = (hashCode2 + (baseLikesDto == null ? 0 : baseLikesDto.hashCode())) * 31;
            String str = this.accessKey;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.height;
            int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            List<PhotosImageDto> list = this.images;
            int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            Float f = this.lat;
            int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
            Float f2 = this.f35long;
            int hashCode8 = (hashCode7 + (f2 == null ? 0 : f2.hashCode())) * 31;
            String str2 = this.photo256;
            int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto = this.canComment;
            int hashCode10 = (hashCode9 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
            String str3 = this.place;
            int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num2 = this.postId;
            int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
            List<PhotosPhotoSizesDto> list2 = this.sizes;
            int hashCode13 = (hashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str4 = this.squareCrop;
            int hashCode14 = (hashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.text;
            int hashCode15 = (hashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
            UserId userId = this.userId;
            int hashCode16 = (hashCode15 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            Integer num3 = this.width;
            int hashCode17 = (hashCode16 + (num3 == null ? 0 : num3.hashCode())) * 31;
            BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
            int hashCode18 = (hashCode17 + (baseRepostsInfoDto == null ? 0 : baseRepostsInfoDto.hashCode())) * 31;
            BaseObjectCountDto baseObjectCountDto = this.tags;
            int hashCode19 = (hashCode18 + (baseObjectCountDto == null ? 0 : baseObjectCountDto.hashCode())) * 31;
            BasePropertyExistsDto basePropertyExistsDto = this.hidden;
            int hashCode20 = (hashCode19 + (basePropertyExistsDto == null ? 0 : basePropertyExistsDto.hashCode())) * 31;
            Integer num4 = this.realOffset;
            int hashCode21 = (hashCode20 + (num4 == null ? 0 : num4.hashCode())) * 31;
            VerticalAlignDto verticalAlignDto = this.verticalAlign;
            int hashCode22 = (hashCode21 + (verticalAlignDto == null ? 0 : verticalAlignDto.hashCode())) * 31;
            UserId userId2 = this.sourceId;
            return hashCode22 + (userId2 != null ? Long.hashCode(userId2.b) : 0);
        }

        public final String toString() {
            int i = this.albumId;
            int i2 = this.date;
            int i3 = this.id;
            UserId userId = this.ownerId;
            boolean z = this.hasTags;
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            NewsfeedCommentsBaseDto newsfeedCommentsBaseDto = this.comments;
            BaseLikesDto baseLikesDto = this.likes;
            String str = this.accessKey;
            Integer num = this.height;
            List<PhotosImageDto> list = this.images;
            Float f = this.lat;
            Float f2 = this.f35long;
            String str2 = this.photo256;
            BaseBoolIntDto baseBoolIntDto = this.canComment;
            String str3 = this.place;
            Integer num2 = this.postId;
            List<PhotosPhotoSizesDto> list2 = this.sizes;
            String str4 = this.squareCrop;
            String str5 = this.text;
            UserId userId2 = this.userId;
            Integer num3 = this.width;
            BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
            BaseObjectCountDto baseObjectCountDto = this.tags;
            BasePropertyExistsDto basePropertyExistsDto = this.hidden;
            Integer num4 = this.realOffset;
            VerticalAlignDto verticalAlignDto = this.verticalAlign;
            UserId userId3 = this.sourceId;
            StringBuilder a = odj.a(i, i2, "NewsfeedCommentsItemTypePhotoDto(albumId=", ", date=", ", id=");
            a.append(i3);
            a.append(", ownerId=");
            a.append(userId);
            a.append(", hasTags=");
            a.append(z);
            a.append(", type=");
            a.append(newsfeedNewsfeedItemTypeDto);
            a.append(", comments=");
            a.append(newsfeedCommentsBaseDto);
            a.append(", likes=");
            a.append(baseLikesDto);
            a.append(", accessKey=");
            kr.b(num, str, ", height=", ", images=", a);
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
            a.append(str3);
            a.append(", postId=");
            a.append(num2);
            a.append(", sizes=");
            a.append(list2);
            a.append(", squareCrop=");
            n6j.b(a, str4, ", text=", str5, ", userId=");
            a.append(userId2);
            a.append(", width=");
            a.append(num3);
            a.append(", reposts=");
            a.append(baseRepostsInfoDto);
            a.append(", tags=");
            a.append(baseObjectCountDto);
            a.append(", hidden=");
            a.append(basePropertyExistsDto);
            a.append(", realOffset=");
            a.append(num4);
            a.append(", verticalAlign=");
            a.append(verticalAlignDto);
            a.append(", sourceId=");
            a.append(userId3);
            a.append(")");
            return a.toString();
        }

        public NewsfeedCommentsItemTypePhotoDto(int i, int i2, int i3, UserId userId, boolean z, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, NewsfeedCommentsBaseDto newsfeedCommentsBaseDto, BaseLikesDto baseLikesDto, String str, Integer num, List<PhotosImageDto> list, Float f, Float f2, String str2, BaseBoolIntDto baseBoolIntDto, String str3, Integer num2, List<PhotosPhotoSizesDto> list2, String str4, String str5, UserId userId2, Integer num3, BaseRepostsInfoDto baseRepostsInfoDto, BaseObjectCountDto baseObjectCountDto, BasePropertyExistsDto basePropertyExistsDto, Integer num4, VerticalAlignDto verticalAlignDto, UserId userId3) {
            super(null);
            this.albumId = i;
            this.date = i2;
            this.id = i3;
            this.ownerId = userId;
            this.hasTags = z;
            this.type = newsfeedNewsfeedItemTypeDto;
            this.comments = newsfeedCommentsBaseDto;
            this.likes = baseLikesDto;
            this.accessKey = str;
            this.height = num;
            this.images = list;
            this.lat = f;
            this.f35long = f2;
            this.photo256 = str2;
            this.canComment = baseBoolIntDto;
            this.place = str3;
            this.postId = num2;
            this.sizes = list2;
            this.squareCrop = str4;
            this.text = str5;
            this.userId = userId2;
            this.width = num3;
            this.reposts = baseRepostsInfoDto;
            this.tags = baseObjectCountDto;
            this.hidden = basePropertyExistsDto;
            this.realOffset = num4;
            this.verticalAlign = verticalAlignDto;
            this.sourceId = userId3;
        }
    }

    /* compiled from: NewsfeedCommentsItemDto.kt */
    public static final class NewsfeedCommentsItemTypePostDto extends NewsfeedCommentsItemDto {

        @pmi0("access_key")
        private final String accessKey;

        @pmi0("attachments")
        private final List<WallWallpostAttachmentDto> attachments;

        @pmi0("can_delete")
        private final BaseBoolIntDto canDelete;

        @pmi0("can_edit")
        private final BaseBoolIntDto canEdit;

        @pmi0("can_pin")
        private final BaseBoolIntDto canPin;

        @pmi0("carousel_offset")
        private final Integer carouselOffset;

        @pmi0("comments")
        private final NewsfeedCommentsBaseDto comments;

        @pmi0("copy_history")
        private final List<WallWallpostFullDto> copyHistory;

        @pmi0("copyright")
        private final WallPostCopyrightDto copyright;

        @pmi0("created_by")
        private final UserId createdBy;

        @pmi0("date")
        private final Integer date;

        @pmi0("deleted_details")
        private final String deletedDetails;

        @pmi0("deleted_reason")
        private final String deletedReason;

        @pmi0("donut")
        private final WallWallpostDonutDto donut;

        @pmi0("edited")
        private final Integer edited;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("from_id")
        private final UserId fromId;

        @pmi0("geo")
        private final WallGeoDto geo;

        @pmi0("hash")
        private final String hash;

        @pmi0("id")
        private final Integer id;

        @pmi0("is_archived")
        private final Boolean isArchived;

        @pmi0("is_deleted")
        private final Boolean isDeleted;

        @pmi0("is_favorite")
        private final Boolean isFavorite;

        @pmi0("is_pinned")
        private final BaseBoolIntDto isPinned;

        @pmi0("likes")
        private final BaseLikesInfoDto likes;

        @pmi0("marked_as_ads")
        private final BaseBoolIntDto markedAsAds;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("parents_stack")
        private final List<Integer> parentsStack;

        @pmi0("post_id")
        private final Integer postId;

        @pmi0("post_source")
        private final WallPostSourceDto postSource;

        @pmi0("post_type")
        private final WallPostTypeDto postType;

        @pmi0("reposts")
        private final BaseRepostsInfoDto reposts;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("signer_id")
        private final UserId signerId;

        @pmi0("text")
        private final String text;

        @pmi0("to_id")
        private final UserId toId;

        @pmi0("topic_id")
        private final TopicIdDto topicId;

        @pmi0("type")
        private final WallPostTypeDto type;

        @pmi0("views")
        private final WallViewsDto views;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedCommentsItemDto.kt */
        public static final class TopicIdDto {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TopicIdDto[] $VALUES;

            @pmi0("1")
            public static final TopicIdDto ART;

            @pmi0("0")
            public static final TopicIdDto EMPTY_TOPIC;

            @pmi0("43")
            public static final TopicIdDto FASHION;

            @pmi0("12")
            public static final TopicIdDto GAMES;

            @pmi0("32")
            public static final TopicIdDto HUMOR;

            @pmi0(Gc.e)
            public static final TopicIdDto IT;

            @pmi0("16")
            public static final TopicIdDto MUSIC;

            @pmi0("19")
            public static final TopicIdDto PHOTO;

            @pmi0("21")
            public static final TopicIdDto SCIENCE_AND_TECH;

            @pmi0("23")
            public static final TopicIdDto SPORT;

            @pmi0("25")
            public static final TopicIdDto TRAVEL;

            @pmi0("26")
            public static final TopicIdDto TV_AND_CINEMA;
            private final int value;

            static {
                TopicIdDto topicIdDto = new TopicIdDto("EMPTY_TOPIC", 0, 0);
                EMPTY_TOPIC = topicIdDto;
                TopicIdDto topicIdDto2 = new TopicIdDto("ART", 1, 1);
                ART = topicIdDto2;
                TopicIdDto topicIdDto3 = new TopicIdDto("IT", 2, 7);
                IT = topicIdDto3;
                TopicIdDto topicIdDto4 = new TopicIdDto("GAMES", 3, 12);
                GAMES = topicIdDto4;
                TopicIdDto topicIdDto5 = new TopicIdDto("MUSIC", 4, 16);
                MUSIC = topicIdDto5;
                TopicIdDto topicIdDto6 = new TopicIdDto("PHOTO", 5, 19);
                PHOTO = topicIdDto6;
                TopicIdDto topicIdDto7 = new TopicIdDto("SCIENCE_AND_TECH", 6, 21);
                SCIENCE_AND_TECH = topicIdDto7;
                TopicIdDto topicIdDto8 = new TopicIdDto("SPORT", 7, 23);
                SPORT = topicIdDto8;
                TopicIdDto topicIdDto9 = new TopicIdDto("TRAVEL", 8, 25);
                TRAVEL = topicIdDto9;
                TopicIdDto topicIdDto10 = new TopicIdDto("TV_AND_CINEMA", 9, 26);
                TV_AND_CINEMA = topicIdDto10;
                TopicIdDto topicIdDto11 = new TopicIdDto("HUMOR", 10, 32);
                HUMOR = topicIdDto11;
                TopicIdDto topicIdDto12 = new TopicIdDto("FASHION", 11, 43);
                FASHION = topicIdDto12;
                TopicIdDto[] topicIdDtoArr = {topicIdDto, topicIdDto2, topicIdDto3, topicIdDto4, topicIdDto5, topicIdDto6, topicIdDto7, topicIdDto8, topicIdDto9, topicIdDto10, topicIdDto11, topicIdDto12};
                $VALUES = topicIdDtoArr;
                $ENTRIES = new asp(topicIdDtoArr);
            }

            private TopicIdDto(String str, int i, int i2) {
                this.value = i2;
            }

            public static TopicIdDto valueOf(String str) {
                return (TopicIdDto) Enum.valueOf(TopicIdDto.class, str);
            }

            public static TopicIdDto[] values() {
                return (TopicIdDto[]) $VALUES.clone();
            }
        }

        public NewsfeedCommentsItemTypePostDto() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 127, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedCommentsItemTypePostDto)) {
                return false;
            }
            NewsfeedCommentsItemTypePostDto newsfeedCommentsItemTypePostDto = (NewsfeedCommentsItemTypePostDto) obj;
            return epx.f(this.fromId, newsfeedCommentsItemTypePostDto.fromId) && epx.f(this.comments, newsfeedCommentsItemTypePostDto.comments) && epx.f(this.copyHistory, newsfeedCommentsItemTypePostDto.copyHistory) && this.canEdit == newsfeedCommentsItemTypePostDto.canEdit && epx.f(this.createdBy, newsfeedCommentsItemTypePostDto.createdBy) && this.canDelete == newsfeedCommentsItemTypePostDto.canDelete && this.canPin == newsfeedCommentsItemTypePostDto.canPin && epx.f(this.donut, newsfeedCommentsItemTypePostDto.donut) && this.isPinned == newsfeedCommentsItemTypePostDto.isPinned && this.markedAsAds == newsfeedCommentsItemTypePostDto.markedAsAds && this.topicId == newsfeedCommentsItemTypePostDto.topicId && epx.f(this.shortTextRate, newsfeedCommentsItemTypePostDto.shortTextRate) && epx.f(this.hash, newsfeedCommentsItemTypePostDto.hash) && this.type == newsfeedCommentsItemTypePostDto.type && epx.f(this.feedback, newsfeedCommentsItemTypePostDto.feedback) && epx.f(this.toId, newsfeedCommentsItemTypePostDto.toId) && epx.f(this.carouselOffset, newsfeedCommentsItemTypePostDto.carouselOffset) && epx.f(this.accessKey, newsfeedCommentsItemTypePostDto.accessKey) && epx.f(this.isDeleted, newsfeedCommentsItemTypePostDto.isDeleted) && epx.f(this.deletedReason, newsfeedCommentsItemTypePostDto.deletedReason) && epx.f(this.deletedDetails, newsfeedCommentsItemTypePostDto.deletedDetails) && epx.f(this.attachments, newsfeedCommentsItemTypePostDto.attachments) && epx.f(this.copyright, newsfeedCommentsItemTypePostDto.copyright) && epx.f(this.date, newsfeedCommentsItemTypePostDto.date) && epx.f(this.edited, newsfeedCommentsItemTypePostDto.edited) && epx.f(this.geo, newsfeedCommentsItemTypePostDto.geo) && epx.f(this.id, newsfeedCommentsItemTypePostDto.id) && epx.f(this.isArchived, newsfeedCommentsItemTypePostDto.isArchived) && epx.f(this.isFavorite, newsfeedCommentsItemTypePostDto.isFavorite) && epx.f(this.likes, newsfeedCommentsItemTypePostDto.likes) && epx.f(this.ownerId, newsfeedCommentsItemTypePostDto.ownerId) && epx.f(this.postId, newsfeedCommentsItemTypePostDto.postId) && epx.f(this.parentsStack, newsfeedCommentsItemTypePostDto.parentsStack) && epx.f(this.postSource, newsfeedCommentsItemTypePostDto.postSource) && this.postType == newsfeedCommentsItemTypePostDto.postType && epx.f(this.reposts, newsfeedCommentsItemTypePostDto.reposts) && epx.f(this.signerId, newsfeedCommentsItemTypePostDto.signerId) && epx.f(this.text, newsfeedCommentsItemTypePostDto.text) && epx.f(this.views, newsfeedCommentsItemTypePostDto.views);
        }

        public final int hashCode() {
            UserId userId = this.fromId;
            int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
            NewsfeedCommentsBaseDto newsfeedCommentsBaseDto = this.comments;
            int hashCode2 = (hashCode + (newsfeedCommentsBaseDto == null ? 0 : newsfeedCommentsBaseDto.hashCode())) * 31;
            List<WallWallpostFullDto> list = this.copyHistory;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto = this.canEdit;
            int hashCode4 = (hashCode3 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
            UserId userId2 = this.createdBy;
            int hashCode5 = (hashCode4 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
            BaseBoolIntDto baseBoolIntDto2 = this.canDelete;
            int hashCode6 = (hashCode5 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto3 = this.canPin;
            int hashCode7 = (hashCode6 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
            WallWallpostDonutDto wallWallpostDonutDto = this.donut;
            int hashCode8 = (hashCode7 + (wallWallpostDonutDto == null ? 0 : wallWallpostDonutDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto4 = this.isPinned;
            int hashCode9 = (hashCode8 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto5 = this.markedAsAds;
            int hashCode10 = (hashCode9 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
            TopicIdDto topicIdDto = this.topicId;
            int hashCode11 = (hashCode10 + (topicIdDto == null ? 0 : topicIdDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode12 = (hashCode11 + (f == null ? 0 : f.hashCode())) * 31;
            String str = this.hash;
            int hashCode13 = (hashCode12 + (str == null ? 0 : str.hashCode())) * 31;
            WallPostTypeDto wallPostTypeDto = this.type;
            int hashCode14 = (hashCode13 + (wallPostTypeDto == null ? 0 : wallPostTypeDto.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode15 = (hashCode14 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            UserId userId3 = this.toId;
            int hashCode16 = (hashCode15 + (userId3 == null ? 0 : Long.hashCode(userId3.b))) * 31;
            Integer num = this.carouselOffset;
            int hashCode17 = (hashCode16 + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.accessKey;
            int hashCode18 = (hashCode17 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.isDeleted;
            int hashCode19 = (hashCode18 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str3 = this.deletedReason;
            int hashCode20 = (hashCode19 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.deletedDetails;
            int hashCode21 = (hashCode20 + (str4 == null ? 0 : str4.hashCode())) * 31;
            List<WallWallpostAttachmentDto> list2 = this.attachments;
            int hashCode22 = (hashCode21 + (list2 == null ? 0 : list2.hashCode())) * 31;
            WallPostCopyrightDto wallPostCopyrightDto = this.copyright;
            int hashCode23 = (hashCode22 + (wallPostCopyrightDto == null ? 0 : wallPostCopyrightDto.hashCode())) * 31;
            Integer num2 = this.date;
            int hashCode24 = (hashCode23 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.edited;
            int hashCode25 = (hashCode24 + (num3 == null ? 0 : num3.hashCode())) * 31;
            WallGeoDto wallGeoDto = this.geo;
            int hashCode26 = (hashCode25 + (wallGeoDto == null ? 0 : wallGeoDto.hashCode())) * 31;
            Integer num4 = this.id;
            int hashCode27 = (hashCode26 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Boolean bool2 = this.isArchived;
            int hashCode28 = (hashCode27 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.isFavorite;
            int hashCode29 = (hashCode28 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            BaseLikesInfoDto baseLikesInfoDto = this.likes;
            int hashCode30 = (hashCode29 + (baseLikesInfoDto == null ? 0 : baseLikesInfoDto.hashCode())) * 31;
            UserId userId4 = this.ownerId;
            int hashCode31 = (hashCode30 + (userId4 == null ? 0 : Long.hashCode(userId4.b))) * 31;
            Integer num5 = this.postId;
            int hashCode32 = (hashCode31 + (num5 == null ? 0 : num5.hashCode())) * 31;
            List<Integer> list3 = this.parentsStack;
            int hashCode33 = (hashCode32 + (list3 == null ? 0 : list3.hashCode())) * 31;
            WallPostSourceDto wallPostSourceDto = this.postSource;
            int hashCode34 = (hashCode33 + (wallPostSourceDto == null ? 0 : wallPostSourceDto.hashCode())) * 31;
            WallPostTypeDto wallPostTypeDto2 = this.postType;
            int hashCode35 = (hashCode34 + (wallPostTypeDto2 == null ? 0 : wallPostTypeDto2.hashCode())) * 31;
            BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
            int hashCode36 = (hashCode35 + (baseRepostsInfoDto == null ? 0 : baseRepostsInfoDto.hashCode())) * 31;
            UserId userId5 = this.signerId;
            int hashCode37 = (hashCode36 + (userId5 == null ? 0 : Long.hashCode(userId5.b))) * 31;
            String str5 = this.text;
            int hashCode38 = (hashCode37 + (str5 == null ? 0 : str5.hashCode())) * 31;
            WallViewsDto wallViewsDto = this.views;
            return hashCode38 + (wallViewsDto != null ? wallViewsDto.hashCode() : 0);
        }

        public final String toString() {
            UserId userId = this.fromId;
            NewsfeedCommentsBaseDto newsfeedCommentsBaseDto = this.comments;
            List<WallWallpostFullDto> list = this.copyHistory;
            BaseBoolIntDto baseBoolIntDto = this.canEdit;
            UserId userId2 = this.createdBy;
            BaseBoolIntDto baseBoolIntDto2 = this.canDelete;
            BaseBoolIntDto baseBoolIntDto3 = this.canPin;
            WallWallpostDonutDto wallWallpostDonutDto = this.donut;
            BaseBoolIntDto baseBoolIntDto4 = this.isPinned;
            BaseBoolIntDto baseBoolIntDto5 = this.markedAsAds;
            TopicIdDto topicIdDto = this.topicId;
            Float f = this.shortTextRate;
            String str = this.hash;
            WallPostTypeDto wallPostTypeDto = this.type;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            UserId userId3 = this.toId;
            Integer num = this.carouselOffset;
            String str2 = this.accessKey;
            Boolean bool = this.isDeleted;
            String str3 = this.deletedReason;
            String str4 = this.deletedDetails;
            List<WallWallpostAttachmentDto> list2 = this.attachments;
            WallPostCopyrightDto wallPostCopyrightDto = this.copyright;
            Integer num2 = this.date;
            Integer num3 = this.edited;
            WallGeoDto wallGeoDto = this.geo;
            Integer num4 = this.id;
            Boolean bool2 = this.isArchived;
            Boolean bool3 = this.isFavorite;
            BaseLikesInfoDto baseLikesInfoDto = this.likes;
            UserId userId4 = this.ownerId;
            Integer num5 = this.postId;
            List<Integer> list3 = this.parentsStack;
            WallPostSourceDto wallPostSourceDto = this.postSource;
            WallPostTypeDto wallPostTypeDto2 = this.postType;
            BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
            UserId userId5 = this.signerId;
            String str5 = this.text;
            WallViewsDto wallViewsDto = this.views;
            StringBuilder sb = new StringBuilder("NewsfeedCommentsItemTypePostDto(fromId=");
            sb.append(userId);
            sb.append(", comments=");
            sb.append(newsfeedCommentsBaseDto);
            sb.append(", copyHistory=");
            sb.append(list);
            sb.append(", canEdit=");
            sb.append(baseBoolIntDto);
            sb.append(", createdBy=");
            sb.append(userId2);
            sb.append(", canDelete=");
            sb.append(baseBoolIntDto2);
            sb.append(", canPin=");
            sb.append(baseBoolIntDto3);
            sb.append(", donut=");
            sb.append(wallWallpostDonutDto);
            sb.append(", isPinned=");
            to.b(sb, baseBoolIntDto4, ", markedAsAds=", baseBoolIntDto5, ", topicId=");
            sb.append(topicIdDto);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", hash=");
            sb.append(str);
            sb.append(", type=");
            sb.append(wallPostTypeDto);
            sb.append(", feedback=");
            sb.append(newsfeedItemWallpostFeedbackDto);
            sb.append(", toId=");
            sb.append(userId3);
            sb.append(", carouselOffset=");
            mq.b(num, ", accessKey=", str2, ", isDeleted=", sb);
            l4.i(bool, ", deletedReason=", str3, ", deletedDetails=", sb);
            b.c(str4, ", attachments=", ", copyright=", sb, list2);
            sb.append(wallPostCopyrightDto);
            sb.append(", date=");
            sb.append(num2);
            sb.append(", edited=");
            sb.append(num3);
            sb.append(", geo=");
            sb.append(wallGeoDto);
            sb.append(", id=");
            rq.h(sb, num4, ", isArchived=", bool2, ", isFavorite=");
            sb.append(bool3);
            sb.append(", likes=");
            sb.append(baseLikesInfoDto);
            sb.append(", ownerId=");
            sb.append(userId4);
            sb.append(", postId=");
            sb.append(num5);
            sb.append(", parentsStack=");
            sb.append(list3);
            sb.append(", postSource=");
            sb.append(wallPostSourceDto);
            sb.append(", postType=");
            sb.append(wallPostTypeDto2);
            sb.append(", reposts=");
            sb.append(baseRepostsInfoDto);
            sb.append(", signerId=");
            sb.append(userId5);
            sb.append(", text=");
            sb.append(str5);
            sb.append(", views=");
            sb.append(wallViewsDto);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ NewsfeedCommentsItemTypePostDto(UserId userId, NewsfeedCommentsBaseDto newsfeedCommentsBaseDto, List list, BaseBoolIntDto baseBoolIntDto, UserId userId2, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, WallWallpostDonutDto wallWallpostDonutDto, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, TopicIdDto topicIdDto, Float f, String str, WallPostTypeDto wallPostTypeDto, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, UserId userId3, Integer num, String str2, Boolean bool, String str3, String str4, List list2, WallPostCopyrightDto wallPostCopyrightDto, Integer num2, Integer num3, WallGeoDto wallGeoDto, Integer num4, Boolean bool2, Boolean bool3, BaseLikesInfoDto baseLikesInfoDto, UserId userId4, Integer num5, List list3, WallPostSourceDto wallPostSourceDto, WallPostTypeDto wallPostTypeDto2, BaseRepostsInfoDto baseRepostsInfoDto, UserId userId5, String str5, WallViewsDto wallViewsDto, int i, int i2, zcl zclVar) {
            this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : newsfeedCommentsBaseDto, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : baseBoolIntDto, (i & 16) != 0 ? null : userId2, (i & 32) != 0 ? null : baseBoolIntDto2, (i & 64) != 0 ? null : baseBoolIntDto3, (i & 128) != 0 ? null : wallWallpostDonutDto, (i & 256) != 0 ? null : baseBoolIntDto4, (i & 512) != 0 ? null : baseBoolIntDto5, (i & 1024) != 0 ? null : topicIdDto, (i & 2048) != 0 ? null : f, (i & 4096) != 0 ? null : str, (i & 8192) != 0 ? null : wallPostTypeDto, (i & 16384) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i & 32768) != 0 ? null : userId3, (i & 65536) != 0 ? null : num, (i & 131072) != 0 ? null : str2, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool, (i & 524288) != 0 ? null : str3, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str4, (i & 2097152) != 0 ? null : list2, (i & 4194304) != 0 ? null : wallPostCopyrightDto, (i & 8388608) != 0 ? null : num2, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : num3, (i & 33554432) != 0 ? null : wallGeoDto, (i & 67108864) != 0 ? null : num4, (i & 134217728) != 0 ? null : bool2, (i & 268435456) != 0 ? null : bool3, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : baseLikesInfoDto, (i & 1073741824) != 0 ? null : userId4, (i & Integer.MIN_VALUE) != 0 ? null : num5, (i2 & 1) != 0 ? null : list3, (i2 & 2) != 0 ? null : wallPostSourceDto, (i2 & 4) != 0 ? null : wallPostTypeDto2, (i2 & 8) != 0 ? null : baseRepostsInfoDto, (i2 & 16) != 0 ? null : userId5, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : wallViewsDto);
        }

        public NewsfeedCommentsItemTypePostDto(UserId userId, NewsfeedCommentsBaseDto newsfeedCommentsBaseDto, List<WallWallpostFullDto> list, BaseBoolIntDto baseBoolIntDto, UserId userId2, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, WallWallpostDonutDto wallWallpostDonutDto, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, TopicIdDto topicIdDto, Float f, String str, WallPostTypeDto wallPostTypeDto, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, UserId userId3, Integer num, String str2, Boolean bool, String str3, String str4, List<WallWallpostAttachmentDto> list2, WallPostCopyrightDto wallPostCopyrightDto, Integer num2, Integer num3, WallGeoDto wallGeoDto, Integer num4, Boolean bool2, Boolean bool3, BaseLikesInfoDto baseLikesInfoDto, UserId userId4, Integer num5, List<Integer> list3, WallPostSourceDto wallPostSourceDto, WallPostTypeDto wallPostTypeDto2, BaseRepostsInfoDto baseRepostsInfoDto, UserId userId5, String str5, WallViewsDto wallViewsDto) {
            super(null);
            this.fromId = userId;
            this.comments = newsfeedCommentsBaseDto;
            this.copyHistory = list;
            this.canEdit = baseBoolIntDto;
            this.createdBy = userId2;
            this.canDelete = baseBoolIntDto2;
            this.canPin = baseBoolIntDto3;
            this.donut = wallWallpostDonutDto;
            this.isPinned = baseBoolIntDto4;
            this.markedAsAds = baseBoolIntDto5;
            this.topicId = topicIdDto;
            this.shortTextRate = f;
            this.hash = str;
            this.type = wallPostTypeDto;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.toId = userId3;
            this.carouselOffset = num;
            this.accessKey = str2;
            this.isDeleted = bool;
            this.deletedReason = str3;
            this.deletedDetails = str4;
            this.attachments = list2;
            this.copyright = wallPostCopyrightDto;
            this.date = num2;
            this.edited = num3;
            this.geo = wallGeoDto;
            this.id = num4;
            this.isArchived = bool2;
            this.isFavorite = bool3;
            this.likes = baseLikesInfoDto;
            this.ownerId = userId4;
            this.postId = num5;
            this.parentsStack = list3;
            this.postSource = wallPostSourceDto;
            this.postType = wallPostTypeDto2;
            this.reposts = baseRepostsInfoDto;
            this.signerId = userId5;
            this.text = str5;
            this.views = wallViewsDto;
        }
    }

    /* compiled from: NewsfeedCommentsItemDto.kt */
    public static final class NewsfeedCommentsItemTypeTopicDto extends NewsfeedCommentsItemDto {

        @pmi0("comments")
        private final NewsfeedCommentsBaseDto comments;

        @pmi0("date")
        private final Integer date;

        @pmi0("likes")
        private final BaseLikesDto likes;

        @pmi0("post_id")
        private final Integer postId;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("text")
        private final String text;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        public /* synthetic */ NewsfeedCommentsItemTypeTopicDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, String str, NewsfeedCommentsBaseDto newsfeedCommentsBaseDto, BaseLikesDto baseLikesDto, UserId userId, Integer num, Integer num2, int i, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : newsfeedCommentsBaseDto, (i & 8) != 0 ? null : baseLikesDto, (i & 16) != 0 ? null : userId, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedCommentsItemTypeTopicDto)) {
                return false;
            }
            NewsfeedCommentsItemTypeTopicDto newsfeedCommentsItemTypeTopicDto = (NewsfeedCommentsItemTypeTopicDto) obj;
            return this.type == newsfeedCommentsItemTypeTopicDto.type && epx.f(this.text, newsfeedCommentsItemTypeTopicDto.text) && epx.f(this.comments, newsfeedCommentsItemTypeTopicDto.comments) && epx.f(this.likes, newsfeedCommentsItemTypeTopicDto.likes) && epx.f(this.sourceId, newsfeedCommentsItemTypeTopicDto.sourceId) && epx.f(this.date, newsfeedCommentsItemTypeTopicDto.date) && epx.f(this.postId, newsfeedCommentsItemTypeTopicDto.postId);
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            String str = this.text;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            NewsfeedCommentsBaseDto newsfeedCommentsBaseDto = this.comments;
            int hashCode3 = (hashCode2 + (newsfeedCommentsBaseDto == null ? 0 : newsfeedCommentsBaseDto.hashCode())) * 31;
            BaseLikesDto baseLikesDto = this.likes;
            int hashCode4 = (hashCode3 + (baseLikesDto == null ? 0 : baseLikesDto.hashCode())) * 31;
            UserId userId = this.sourceId;
            int hashCode5 = (hashCode4 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            Integer num = this.date;
            int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.postId;
            return hashCode6 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            String str = this.text;
            NewsfeedCommentsBaseDto newsfeedCommentsBaseDto = this.comments;
            BaseLikesDto baseLikesDto = this.likes;
            UserId userId = this.sourceId;
            Integer num = this.date;
            Integer num2 = this.postId;
            StringBuilder sb = new StringBuilder("NewsfeedCommentsItemTypeTopicDto(type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", text=");
            sb.append(str);
            sb.append(", comments=");
            sb.append(newsfeedCommentsBaseDto);
            sb.append(", likes=");
            sb.append(baseLikesDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            sb.append(num);
            sb.append(", postId=");
            return oq.b(sb, num2, ")");
        }

        public NewsfeedCommentsItemTypeTopicDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, String str, NewsfeedCommentsBaseDto newsfeedCommentsBaseDto, BaseLikesDto baseLikesDto, UserId userId, Integer num, Integer num2) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.text = str;
            this.comments = newsfeedCommentsBaseDto;
            this.likes = baseLikesDto;
            this.sourceId = userId;
            this.date = num;
            this.postId = num2;
        }
    }

    /* compiled from: NewsfeedCommentsItemDto.kt */
    public static final class NewsfeedCommentsItemTypeVideoDto extends NewsfeedCommentsItemDto {

        @pmi0("access_key")
        private final String accessKey;

        @pmi0("added")
        private final BaseBoolIntDto added;

        @pmi0("adding_date")
        private final Integer addingDate;

        @pmi0("balance")
        private final Integer balance;

        @pmi0("can_add")
        private final BaseBoolIntDto canAdd;

        @pmi0("can_add_to_faves")
        private final BaseBoolIntDto canAddToFaves;

        @pmi0("can_attach_link")
        private final BaseBoolIntDto canAttachLink;

        @pmi0("can_comment")
        private final BaseBoolIntDto canComment;

        @pmi0("can_delete")
        private final BaseBoolIntDto canDelete;

        @pmi0("can_edit")
        private final BaseBoolIntDto canEdit;

        @pmi0("can_edit_privacy")
        private final BaseBoolIntDto canEditPrivacy;

        @pmi0("can_like")
        private final BaseBoolIntDto canLike;

        @pmi0("can_repost")
        private final Integer canRepost;

        @pmi0("can_subscribe")
        private final BaseBoolIntDto canSubscribe;

        @pmi0("comments")
        private final NewsfeedCommentsBaseDto comments;

        @pmi0("content_restricted")
        private final Integer contentRestricted;

        @pmi0("content_restricted_message")
        private final String contentRestrictedMessage;

        @pmi0("converting")
        private final BaseBoolIntDto converting;

        @pmi0("date")
        private final Integer date;

        @pmi0("description")
        private final String description;

        @pmi0("duration")
        private final Integer duration;

        @pmi0("featured_artists")
        private final List<AudioArtistDto> featuredArtists;

        @pmi0("first_frame")
        private final List<VideoVideoImageDto> firstFrame;

        @pmi0("genres")
        private final List<AudioGenreDto> genres;

        @pmi0("height")
        private final Integer height;

        @pmi0("id")
        private final Integer id;

        @pmi0("image")
        private final List<VideoVideoImageDto> image;

        @pmi0("is_explicit")
        private final BaseBoolIntDto isExplicit;

        @pmi0("is_favorite")
        private final Boolean isFavorite;

        @pmi0("is_private")
        private final BaseBoolIntDto isPrivate;

        @pmi0("is_subscribed")
        private final BaseBoolIntDto isSubscribed;

        @pmi0("likes")
        private final BaseLikesDto likes;

        @pmi0("live")
        private final BasePropertyExistsDto live;

        @pmi0("live_notify")
        private final BaseBoolIntDto liveNotify;

        @pmi0("live_start_time")
        private final Integer liveStartTime;

        @pmi0("local_views")
        private final Integer localViews;

        @pmi0("main_artists")
        private final List<AudioArtistDto> mainArtists;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("platform")
        private final String platform;

        @pmi0("player")
        private final String player;

        @pmi0("post_id")
        private final Integer postId;

        @pmi0("processing")
        private final BasePropertyExistsDto processing;

        @pmi0("release_date")
        private final Integer releaseDate;

        @pmi0("repeat")
        private final BasePropertyExistsDto repeat;

        @pmi0("reposts")
        private final BaseRepostsInfoDto reposts;

        @pmi0(CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE)
        private final ResponseTypeDto responseType;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("spectators")
        private final Integer spectators;

        @pmi0("subtitle")
        private final String subtitle;

        @pmi0("text")
        private final String text;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("upcoming")
        private final BasePropertyExistsDto upcoming;

        @pmi0("user_id")
        private final UserId userId;

        @pmi0("views")
        private final Integer views;

        @pmi0("width")
        private final Integer width;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedCommentsItemDto.kt */
        public static final class ResponseTypeDto {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ResponseTypeDto[] $VALUES;

            @pmi0("full")
            public static final ResponseTypeDto FULL;

            @pmi0(UcumUtils.UCUM_MINUTES)
            public static final ResponseTypeDto MIN;
            private final String value;

            static {
                ResponseTypeDto responseTypeDto = new ResponseTypeDto("MIN", 0, UcumUtils.UCUM_MINUTES);
                MIN = responseTypeDto;
                ResponseTypeDto responseTypeDto2 = new ResponseTypeDto("FULL", 1, "full");
                FULL = responseTypeDto2;
                ResponseTypeDto[] responseTypeDtoArr = {responseTypeDto, responseTypeDto2};
                $VALUES = responseTypeDtoArr;
                $ENTRIES = new asp(responseTypeDtoArr);
            }

            private ResponseTypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static ResponseTypeDto valueOf(String str) {
                return (ResponseTypeDto) Enum.valueOf(ResponseTypeDto.class, str);
            }

            public static ResponseTypeDto[] values() {
                return (ResponseTypeDto[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedCommentsItemDto.kt */
        public static final class TypeDto {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("live")
            public static final TypeDto LIVE;

            @pmi0("movie")
            public static final TypeDto MOVIE;

            @pmi0("music_video")
            public static final TypeDto MUSIC_VIDEO;

            @pmi0("short_video")
            public static final TypeDto SHORT_VIDEO;

            @pmi0("video")
            public static final TypeDto VIDEO;
            private final String value;

            static {
                TypeDto typeDto = new TypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 0, "video");
                VIDEO = typeDto;
                TypeDto typeDto2 = new TypeDto("MUSIC_VIDEO", 1, "music_video");
                MUSIC_VIDEO = typeDto2;
                TypeDto typeDto3 = new TypeDto(SignalingProtocol.KEY_STREAM_TYPE_MOVIE, 2, "movie");
                MOVIE = typeDto3;
                TypeDto typeDto4 = new TypeDto("LIVE", 3, "live");
                LIVE = typeDto4;
                TypeDto typeDto5 = new TypeDto("SHORT_VIDEO", 4, "short_video");
                SHORT_VIDEO = typeDto5;
                TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5};
                $VALUES = typeDtoArr;
                $ENTRIES = new asp(typeDtoArr);
            }

            private TypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
            }
        }

        public NewsfeedCommentsItemTypeVideoDto() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 33554431, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedCommentsItemTypeVideoDto)) {
                return false;
            }
            NewsfeedCommentsItemTypeVideoDto newsfeedCommentsItemTypeVideoDto = (NewsfeedCommentsItemTypeVideoDto) obj;
            return epx.f(this.text, newsfeedCommentsItemTypeVideoDto.text) && epx.f(this.comments, newsfeedCommentsItemTypeVideoDto.comments) && epx.f(this.likes, newsfeedCommentsItemTypeVideoDto.likes) && this.type == newsfeedCommentsItemTypeVideoDto.type && this.responseType == newsfeedCommentsItemTypeVideoDto.responseType && epx.f(this.accessKey, newsfeedCommentsItemTypeVideoDto.accessKey) && epx.f(this.addingDate, newsfeedCommentsItemTypeVideoDto.addingDate) && this.canComment == newsfeedCommentsItemTypeVideoDto.canComment && this.canEdit == newsfeedCommentsItemTypeVideoDto.canEdit && this.canDelete == newsfeedCommentsItemTypeVideoDto.canDelete && this.canLike == newsfeedCommentsItemTypeVideoDto.canLike && epx.f(this.canRepost, newsfeedCommentsItemTypeVideoDto.canRepost) && this.canSubscribe == newsfeedCommentsItemTypeVideoDto.canSubscribe && this.canAddToFaves == newsfeedCommentsItemTypeVideoDto.canAddToFaves && this.canAdd == newsfeedCommentsItemTypeVideoDto.canAdd && this.canAttachLink == newsfeedCommentsItemTypeVideoDto.canAttachLink && this.canEditPrivacy == newsfeedCommentsItemTypeVideoDto.canEditPrivacy && this.isPrivate == newsfeedCommentsItemTypeVideoDto.isPrivate && epx.f(this.date, newsfeedCommentsItemTypeVideoDto.date) && epx.f(this.description, newsfeedCommentsItemTypeVideoDto.description) && epx.f(this.duration, newsfeedCommentsItemTypeVideoDto.duration) && epx.f(this.image, newsfeedCommentsItemTypeVideoDto.image) && epx.f(this.firstFrame, newsfeedCommentsItemTypeVideoDto.firstFrame) && epx.f(this.width, newsfeedCommentsItemTypeVideoDto.width) && epx.f(this.height, newsfeedCommentsItemTypeVideoDto.height) && epx.f(this.id, newsfeedCommentsItemTypeVideoDto.id) && epx.f(this.ownerId, newsfeedCommentsItemTypeVideoDto.ownerId) && epx.f(this.userId, newsfeedCommentsItemTypeVideoDto.userId) && epx.f(this.title, newsfeedCommentsItemTypeVideoDto.title) && epx.f(this.isFavorite, newsfeedCommentsItemTypeVideoDto.isFavorite) && epx.f(this.player, newsfeedCommentsItemTypeVideoDto.player) && this.processing == newsfeedCommentsItemTypeVideoDto.processing && this.converting == newsfeedCommentsItemTypeVideoDto.converting && this.added == newsfeedCommentsItemTypeVideoDto.added && this.isSubscribed == newsfeedCommentsItemTypeVideoDto.isSubscribed && epx.f(this.trackCode, newsfeedCommentsItemTypeVideoDto.trackCode) && this.repeat == newsfeedCommentsItemTypeVideoDto.repeat && epx.f(this.views, newsfeedCommentsItemTypeVideoDto.views) && epx.f(this.localViews, newsfeedCommentsItemTypeVideoDto.localViews) && epx.f(this.contentRestricted, newsfeedCommentsItemTypeVideoDto.contentRestricted) && epx.f(this.contentRestrictedMessage, newsfeedCommentsItemTypeVideoDto.contentRestrictedMessage) && epx.f(this.balance, newsfeedCommentsItemTypeVideoDto.balance) && this.live == newsfeedCommentsItemTypeVideoDto.live && this.upcoming == newsfeedCommentsItemTypeVideoDto.upcoming && epx.f(this.liveStartTime, newsfeedCommentsItemTypeVideoDto.liveStartTime) && this.liveNotify == newsfeedCommentsItemTypeVideoDto.liveNotify && epx.f(this.spectators, newsfeedCommentsItemTypeVideoDto.spectators) && epx.f(this.platform, newsfeedCommentsItemTypeVideoDto.platform) && epx.f(this.reposts, newsfeedCommentsItemTypeVideoDto.reposts) && this.isExplicit == newsfeedCommentsItemTypeVideoDto.isExplicit && epx.f(this.mainArtists, newsfeedCommentsItemTypeVideoDto.mainArtists) && epx.f(this.featuredArtists, newsfeedCommentsItemTypeVideoDto.featuredArtists) && epx.f(this.subtitle, newsfeedCommentsItemTypeVideoDto.subtitle) && epx.f(this.releaseDate, newsfeedCommentsItemTypeVideoDto.releaseDate) && epx.f(this.genres, newsfeedCommentsItemTypeVideoDto.genres) && epx.f(this.sourceId, newsfeedCommentsItemTypeVideoDto.sourceId) && epx.f(this.postId, newsfeedCommentsItemTypeVideoDto.postId);
        }

        public final int hashCode() {
            String str = this.text;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            NewsfeedCommentsBaseDto newsfeedCommentsBaseDto = this.comments;
            int hashCode2 = (hashCode + (newsfeedCommentsBaseDto == null ? 0 : newsfeedCommentsBaseDto.hashCode())) * 31;
            BaseLikesDto baseLikesDto = this.likes;
            int hashCode3 = (hashCode2 + (baseLikesDto == null ? 0 : baseLikesDto.hashCode())) * 31;
            TypeDto typeDto = this.type;
            int hashCode4 = (hashCode3 + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
            ResponseTypeDto responseTypeDto = this.responseType;
            int hashCode5 = (hashCode4 + (responseTypeDto == null ? 0 : responseTypeDto.hashCode())) * 31;
            String str2 = this.accessKey;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.addingDate;
            int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto = this.canComment;
            int hashCode8 = (hashCode7 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto2 = this.canEdit;
            int hashCode9 = (hashCode8 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto3 = this.canDelete;
            int hashCode10 = (hashCode9 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto4 = this.canLike;
            int hashCode11 = (hashCode10 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
            Integer num2 = this.canRepost;
            int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto5 = this.canSubscribe;
            int hashCode13 = (hashCode12 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto6 = this.canAddToFaves;
            int hashCode14 = (hashCode13 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto7 = this.canAdd;
            int hashCode15 = (hashCode14 + (baseBoolIntDto7 == null ? 0 : baseBoolIntDto7.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto8 = this.canAttachLink;
            int hashCode16 = (hashCode15 + (baseBoolIntDto8 == null ? 0 : baseBoolIntDto8.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto9 = this.canEditPrivacy;
            int hashCode17 = (hashCode16 + (baseBoolIntDto9 == null ? 0 : baseBoolIntDto9.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto10 = this.isPrivate;
            int hashCode18 = (hashCode17 + (baseBoolIntDto10 == null ? 0 : baseBoolIntDto10.hashCode())) * 31;
            Integer num3 = this.date;
            int hashCode19 = (hashCode18 + (num3 == null ? 0 : num3.hashCode())) * 31;
            String str3 = this.description;
            int hashCode20 = (hashCode19 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num4 = this.duration;
            int hashCode21 = (hashCode20 + (num4 == null ? 0 : num4.hashCode())) * 31;
            List<VideoVideoImageDto> list = this.image;
            int hashCode22 = (hashCode21 + (list == null ? 0 : list.hashCode())) * 31;
            List<VideoVideoImageDto> list2 = this.firstFrame;
            int hashCode23 = (hashCode22 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Integer num5 = this.width;
            int hashCode24 = (hashCode23 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.height;
            int hashCode25 = (hashCode24 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.id;
            int hashCode26 = (hashCode25 + (num7 == null ? 0 : num7.hashCode())) * 31;
            UserId userId = this.ownerId;
            int hashCode27 = (hashCode26 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            UserId userId2 = this.userId;
            int hashCode28 = (hashCode27 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
            String str4 = this.title;
            int hashCode29 = (hashCode28 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.isFavorite;
            int hashCode30 = (hashCode29 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str5 = this.player;
            int hashCode31 = (hashCode30 + (str5 == null ? 0 : str5.hashCode())) * 31;
            BasePropertyExistsDto basePropertyExistsDto = this.processing;
            int hashCode32 = (hashCode31 + (basePropertyExistsDto == null ? 0 : basePropertyExistsDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto11 = this.converting;
            int hashCode33 = (hashCode32 + (baseBoolIntDto11 == null ? 0 : baseBoolIntDto11.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto12 = this.added;
            int hashCode34 = (hashCode33 + (baseBoolIntDto12 == null ? 0 : baseBoolIntDto12.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto13 = this.isSubscribed;
            int hashCode35 = (hashCode34 + (baseBoolIntDto13 == null ? 0 : baseBoolIntDto13.hashCode())) * 31;
            String str6 = this.trackCode;
            int hashCode36 = (hashCode35 + (str6 == null ? 0 : str6.hashCode())) * 31;
            BasePropertyExistsDto basePropertyExistsDto2 = this.repeat;
            int hashCode37 = (hashCode36 + (basePropertyExistsDto2 == null ? 0 : basePropertyExistsDto2.hashCode())) * 31;
            Integer num8 = this.views;
            int hashCode38 = (hashCode37 + (num8 == null ? 0 : num8.hashCode())) * 31;
            Integer num9 = this.localViews;
            int hashCode39 = (hashCode38 + (num9 == null ? 0 : num9.hashCode())) * 31;
            Integer num10 = this.contentRestricted;
            int hashCode40 = (hashCode39 + (num10 == null ? 0 : num10.hashCode())) * 31;
            String str7 = this.contentRestrictedMessage;
            int hashCode41 = (hashCode40 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Integer num11 = this.balance;
            int hashCode42 = (hashCode41 + (num11 == null ? 0 : num11.hashCode())) * 31;
            BasePropertyExistsDto basePropertyExistsDto3 = this.live;
            int hashCode43 = (hashCode42 + (basePropertyExistsDto3 == null ? 0 : basePropertyExistsDto3.hashCode())) * 31;
            BasePropertyExistsDto basePropertyExistsDto4 = this.upcoming;
            int hashCode44 = (hashCode43 + (basePropertyExistsDto4 == null ? 0 : basePropertyExistsDto4.hashCode())) * 31;
            Integer num12 = this.liveStartTime;
            int hashCode45 = (hashCode44 + (num12 == null ? 0 : num12.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto14 = this.liveNotify;
            int hashCode46 = (hashCode45 + (baseBoolIntDto14 == null ? 0 : baseBoolIntDto14.hashCode())) * 31;
            Integer num13 = this.spectators;
            int hashCode47 = (hashCode46 + (num13 == null ? 0 : num13.hashCode())) * 31;
            String str8 = this.platform;
            int hashCode48 = (hashCode47 + (str8 == null ? 0 : str8.hashCode())) * 31;
            BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
            int hashCode49 = (hashCode48 + (baseRepostsInfoDto == null ? 0 : baseRepostsInfoDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto15 = this.isExplicit;
            int hashCode50 = (hashCode49 + (baseBoolIntDto15 == null ? 0 : baseBoolIntDto15.hashCode())) * 31;
            List<AudioArtistDto> list3 = this.mainArtists;
            int hashCode51 = (hashCode50 + (list3 == null ? 0 : list3.hashCode())) * 31;
            List<AudioArtistDto> list4 = this.featuredArtists;
            int hashCode52 = (hashCode51 + (list4 == null ? 0 : list4.hashCode())) * 31;
            String str9 = this.subtitle;
            int hashCode53 = (hashCode52 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Integer num14 = this.releaseDate;
            int hashCode54 = (hashCode53 + (num14 == null ? 0 : num14.hashCode())) * 31;
            List<AudioGenreDto> list5 = this.genres;
            int hashCode55 = (hashCode54 + (list5 == null ? 0 : list5.hashCode())) * 31;
            UserId userId3 = this.sourceId;
            int hashCode56 = (hashCode55 + (userId3 == null ? 0 : Long.hashCode(userId3.b))) * 31;
            Integer num15 = this.postId;
            return hashCode56 + (num15 != null ? num15.hashCode() : 0);
        }

        public final String toString() {
            String str = this.text;
            NewsfeedCommentsBaseDto newsfeedCommentsBaseDto = this.comments;
            BaseLikesDto baseLikesDto = this.likes;
            TypeDto typeDto = this.type;
            ResponseTypeDto responseTypeDto = this.responseType;
            String str2 = this.accessKey;
            Integer num = this.addingDate;
            BaseBoolIntDto baseBoolIntDto = this.canComment;
            BaseBoolIntDto baseBoolIntDto2 = this.canEdit;
            BaseBoolIntDto baseBoolIntDto3 = this.canDelete;
            BaseBoolIntDto baseBoolIntDto4 = this.canLike;
            Integer num2 = this.canRepost;
            BaseBoolIntDto baseBoolIntDto5 = this.canSubscribe;
            BaseBoolIntDto baseBoolIntDto6 = this.canAddToFaves;
            BaseBoolIntDto baseBoolIntDto7 = this.canAdd;
            BaseBoolIntDto baseBoolIntDto8 = this.canAttachLink;
            BaseBoolIntDto baseBoolIntDto9 = this.canEditPrivacy;
            BaseBoolIntDto baseBoolIntDto10 = this.isPrivate;
            Integer num3 = this.date;
            String str3 = this.description;
            Integer num4 = this.duration;
            List<VideoVideoImageDto> list = this.image;
            List<VideoVideoImageDto> list2 = this.firstFrame;
            Integer num5 = this.width;
            Integer num6 = this.height;
            Integer num7 = this.id;
            UserId userId = this.ownerId;
            UserId userId2 = this.userId;
            String str4 = this.title;
            Boolean bool = this.isFavorite;
            String str5 = this.player;
            BasePropertyExistsDto basePropertyExistsDto = this.processing;
            BaseBoolIntDto baseBoolIntDto11 = this.converting;
            BaseBoolIntDto baseBoolIntDto12 = this.added;
            BaseBoolIntDto baseBoolIntDto13 = this.isSubscribed;
            String str6 = this.trackCode;
            BasePropertyExistsDto basePropertyExistsDto2 = this.repeat;
            Integer num8 = this.views;
            Integer num9 = this.localViews;
            Integer num10 = this.contentRestricted;
            String str7 = this.contentRestrictedMessage;
            Integer num11 = this.balance;
            BasePropertyExistsDto basePropertyExistsDto3 = this.live;
            BasePropertyExistsDto basePropertyExistsDto4 = this.upcoming;
            Integer num12 = this.liveStartTime;
            BaseBoolIntDto baseBoolIntDto14 = this.liveNotify;
            Integer num13 = this.spectators;
            String str8 = this.platform;
            BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
            BaseBoolIntDto baseBoolIntDto15 = this.isExplicit;
            List<AudioArtistDto> list3 = this.mainArtists;
            List<AudioArtistDto> list4 = this.featuredArtists;
            String str9 = this.subtitle;
            Integer num14 = this.releaseDate;
            List<AudioGenreDto> list5 = this.genres;
            UserId userId3 = this.sourceId;
            Integer num15 = this.postId;
            StringBuilder sb = new StringBuilder("NewsfeedCommentsItemTypeVideoDto(text=");
            sb.append(str);
            sb.append(", comments=");
            sb.append(newsfeedCommentsBaseDto);
            sb.append(", likes=");
            sb.append(baseLikesDto);
            sb.append(", type=");
            sb.append(typeDto);
            sb.append(", responseType=");
            sb.append(responseTypeDto);
            sb.append(", accessKey=");
            sb.append(str2);
            sb.append(", addingDate=");
            sb.append(num);
            sb.append(", canComment=");
            sb.append(baseBoolIntDto);
            sb.append(", canEdit=");
            to.b(sb, baseBoolIntDto2, ", canDelete=", baseBoolIntDto3, ", canLike=");
            sb.append(baseBoolIntDto4);
            sb.append(", canRepost=");
            sb.append(num2);
            sb.append(", canSubscribe=");
            to.b(sb, baseBoolIntDto5, ", canAddToFaves=", baseBoolIntDto6, ", canAdd=");
            to.b(sb, baseBoolIntDto7, ", canAttachLink=", baseBoolIntDto8, ", canEditPrivacy=");
            to.b(sb, baseBoolIntDto9, ", isPrivate=", baseBoolIntDto10, ", date=");
            mq.b(num3, ", description=", str3, ", duration=", sb);
            sb.append(num4);
            sb.append(", image=");
            sb.append(list);
            sb.append(", firstFrame=");
            sb.append(list2);
            sb.append(", width=");
            sb.append(num5);
            sb.append(", height=");
            sq.b(sb, num6, ", id=", num7, ", ownerId=");
            sb.append(userId);
            sb.append(", userId=");
            sb.append(userId2);
            sb.append(", title=");
            uq.c(bool, str4, ", isFavorite=", ", player=", sb);
            sb.append(str5);
            sb.append(", processing=");
            sb.append(basePropertyExistsDto);
            sb.append(", converting=");
            to.b(sb, baseBoolIntDto11, ", added=", baseBoolIntDto12, ", isSubscribed=");
            sb.append(baseBoolIntDto13);
            sb.append(", trackCode=");
            sb.append(str6);
            sb.append(", repeat=");
            sb.append(basePropertyExistsDto2);
            sb.append(", views=");
            sb.append(num8);
            sb.append(", localViews=");
            sq.b(sb, num9, ", contentRestricted=", num10, ", contentRestrictedMessage=");
            kr.b(num11, str7, ", balance=", ", live=", sb);
            sb.append(basePropertyExistsDto3);
            sb.append(", upcoming=");
            sb.append(basePropertyExistsDto4);
            sb.append(", liveStartTime=");
            sb.append(num12);
            sb.append(", liveNotify=");
            sb.append(baseBoolIntDto14);
            sb.append(", spectators=");
            mq.b(num13, ", platform=", str8, ", reposts=", sb);
            sb.append(baseRepostsInfoDto);
            sb.append(", isExplicit=");
            sb.append(baseBoolIntDto15);
            sb.append(", mainArtists=");
            vq.d(sb, list3, ", featuredArtists=", list4, ", subtitle=");
            kr.b(num14, str9, ", releaseDate=", ", genres=", sb);
            sb.append(list5);
            sb.append(", sourceId=");
            sb.append(userId3);
            sb.append(", postId=");
            return oq.b(sb, num15, ")");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ NewsfeedCommentsItemTypeVideoDto(String str, NewsfeedCommentsBaseDto newsfeedCommentsBaseDto, BaseLikesDto baseLikesDto, TypeDto typeDto, ResponseTypeDto responseTypeDto, String str2, Integer num, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, Integer num2, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, BaseBoolIntDto baseBoolIntDto10, Integer num3, String str3, Integer num4, List list, List list2, Integer num5, Integer num6, Integer num7, UserId userId, UserId userId2, String str4, Boolean bool, String str5, BasePropertyExistsDto basePropertyExistsDto, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, BaseBoolIntDto baseBoolIntDto13, String str6, BasePropertyExistsDto basePropertyExistsDto2, Integer num8, Integer num9, Integer num10, String str7, Integer num11, BasePropertyExistsDto basePropertyExistsDto3, BasePropertyExistsDto basePropertyExistsDto4, Integer num12, BaseBoolIntDto baseBoolIntDto14, Integer num13, String str8, BaseRepostsInfoDto baseRepostsInfoDto, BaseBoolIntDto baseBoolIntDto15, List list3, List list4, String str9, Integer num14, List list5, UserId userId3, Integer num15, int i, int i2, zcl zclVar) {
            this(r2, (i & 2) != 0 ? null : newsfeedCommentsBaseDto, (i & 4) != 0 ? null : baseLikesDto, (i & 8) != 0 ? null : typeDto, (i & 16) != 0 ? null : responseTypeDto, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : baseBoolIntDto, (i & 256) != 0 ? null : baseBoolIntDto2, (i & 512) != 0 ? null : baseBoolIntDto3, (i & 1024) != 0 ? null : baseBoolIntDto4, (i & 2048) != 0 ? null : num2, (i & 4096) != 0 ? null : baseBoolIntDto5, (i & 8192) != 0 ? null : baseBoolIntDto6, (i & 16384) != 0 ? null : baseBoolIntDto7, (i & 32768) != 0 ? null : baseBoolIntDto8, (i & 65536) != 0 ? null : baseBoolIntDto9, (i & 131072) != 0 ? null : baseBoolIntDto10, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num3, (i & 524288) != 0 ? null : str3, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num4, (i & 2097152) != 0 ? null : list, (i & 4194304) != 0 ? null : list2, (i & 8388608) != 0 ? null : num5, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : num6, (i & 33554432) != 0 ? null : num7, (i & 67108864) != 0 ? null : userId, (i & 134217728) != 0 ? null : userId2, (i & 268435456) != 0 ? null : str4, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool, (i & 1073741824) != 0 ? null : str5, (i & Integer.MIN_VALUE) != 0 ? null : basePropertyExistsDto, (i2 & 1) != 0 ? null : baseBoolIntDto11, (i2 & 2) != 0 ? null : baseBoolIntDto12, (i2 & 4) != 0 ? null : baseBoolIntDto13, (i2 & 8) != 0 ? null : str6, (i2 & 16) != 0 ? null : basePropertyExistsDto2, (i2 & 32) != 0 ? null : num8, (i2 & 64) != 0 ? null : num9, (i2 & 128) != 0 ? null : num10, (i2 & 256) != 0 ? null : str7, (i2 & 512) != 0 ? null : num11, (i2 & 1024) != 0 ? null : basePropertyExistsDto3, (i2 & 2048) != 0 ? null : basePropertyExistsDto4, (i2 & 4096) != 0 ? null : num12, (i2 & 8192) != 0 ? null : baseBoolIntDto14, (i2 & 16384) != 0 ? null : num13, (i2 & 32768) != 0 ? null : str8, (i2 & 65536) != 0 ? null : baseRepostsInfoDto, (i2 & 131072) != 0 ? null : baseBoolIntDto15, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list3, (i2 & 524288) != 0 ? null : list4, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str9, (i2 & 2097152) != 0 ? null : num14, (i2 & 4194304) != 0 ? null : list5, (i2 & 8388608) != 0 ? null : userId3, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : num15);
            String str10 = (i & 1) != 0 ? null : str;
        }

        public NewsfeedCommentsItemTypeVideoDto(String str, NewsfeedCommentsBaseDto newsfeedCommentsBaseDto, BaseLikesDto baseLikesDto, TypeDto typeDto, ResponseTypeDto responseTypeDto, String str2, Integer num, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, Integer num2, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, BaseBoolIntDto baseBoolIntDto8, BaseBoolIntDto baseBoolIntDto9, BaseBoolIntDto baseBoolIntDto10, Integer num3, String str3, Integer num4, List<VideoVideoImageDto> list, List<VideoVideoImageDto> list2, Integer num5, Integer num6, Integer num7, UserId userId, UserId userId2, String str4, Boolean bool, String str5, BasePropertyExistsDto basePropertyExistsDto, BaseBoolIntDto baseBoolIntDto11, BaseBoolIntDto baseBoolIntDto12, BaseBoolIntDto baseBoolIntDto13, String str6, BasePropertyExistsDto basePropertyExistsDto2, Integer num8, Integer num9, Integer num10, String str7, Integer num11, BasePropertyExistsDto basePropertyExistsDto3, BasePropertyExistsDto basePropertyExistsDto4, Integer num12, BaseBoolIntDto baseBoolIntDto14, Integer num13, String str8, BaseRepostsInfoDto baseRepostsInfoDto, BaseBoolIntDto baseBoolIntDto15, List<AudioArtistDto> list3, List<AudioArtistDto> list4, String str9, Integer num14, List<AudioGenreDto> list5, UserId userId3, Integer num15) {
            super(null);
            this.text = str;
            this.comments = newsfeedCommentsBaseDto;
            this.likes = baseLikesDto;
            this.type = typeDto;
            this.responseType = responseTypeDto;
            this.accessKey = str2;
            this.addingDate = num;
            this.canComment = baseBoolIntDto;
            this.canEdit = baseBoolIntDto2;
            this.canDelete = baseBoolIntDto3;
            this.canLike = baseBoolIntDto4;
            this.canRepost = num2;
            this.canSubscribe = baseBoolIntDto5;
            this.canAddToFaves = baseBoolIntDto6;
            this.canAdd = baseBoolIntDto7;
            this.canAttachLink = baseBoolIntDto8;
            this.canEditPrivacy = baseBoolIntDto9;
            this.isPrivate = baseBoolIntDto10;
            this.date = num3;
            this.description = str3;
            this.duration = num4;
            this.image = list;
            this.firstFrame = list2;
            this.width = num5;
            this.height = num6;
            this.id = num7;
            this.ownerId = userId;
            this.userId = userId2;
            this.title = str4;
            this.isFavorite = bool;
            this.player = str5;
            this.processing = basePropertyExistsDto;
            this.converting = baseBoolIntDto11;
            this.added = baseBoolIntDto12;
            this.isSubscribed = baseBoolIntDto13;
            this.trackCode = str6;
            this.repeat = basePropertyExistsDto2;
            this.views = num8;
            this.localViews = num9;
            this.contentRestricted = num10;
            this.contentRestrictedMessage = str7;
            this.balance = num11;
            this.live = basePropertyExistsDto3;
            this.upcoming = basePropertyExistsDto4;
            this.liveStartTime = num12;
            this.liveNotify = baseBoolIntDto14;
            this.spectators = num13;
            this.platform = str8;
            this.reposts = baseRepostsInfoDto;
            this.isExplicit = baseBoolIntDto15;
            this.mainArtists = list3;
            this.featuredArtists = list4;
            this.subtitle = str9;
            this.releaseDate = num14;
            this.genres = list5;
            this.sourceId = userId3;
            this.postId = num15;
        }
    }

    public /* synthetic */ NewsfeedCommentsItemDto(zcl zclVar) {
        this();
    }

    private NewsfeedCommentsItemDto() {
    }
}
