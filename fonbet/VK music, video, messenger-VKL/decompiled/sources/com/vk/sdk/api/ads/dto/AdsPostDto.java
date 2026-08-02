package com.vk.sdk.api.ads.dto;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.wall.dto.WallWallpostAttachmentDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import xsna.epx;
import xsna.l4;
import xsna.n6j;
import xsna.oq;
import xsna.pmi0;
import xsna.sq;
import xsna.wr;
import xsna.zcl;

/* compiled from: AdsPostDto.kt */
/* loaded from: classes5.dex */
public final class AdsPostDto {

    @pmi0("ads_easy_promote")
    private final AdsPostEasyPromoteDto adsEasyPromote;

    @pmi0("attachments")
    private final List<WallWallpostAttachmentDto> attachments;

    @pmi0("can_delete")
    private final Integer canDelete;

    @pmi0("can_edit")
    private final Integer canEdit;

    @pmi0("can_pin")
    private final Integer canPin;

    @pmi0("carousel_offset")
    private final Integer carouselOffset;

    @pmi0("comments")
    private final AdsPostCommentsDto comments;

    @pmi0("created_by")
    private final Integer createdBy;

    @pmi0("date")
    private final Integer date;

    @pmi0("donut")
    private final AdsPostDonutDto donut;

    @pmi0("edited")
    private final Integer edited;

    @pmi0("from_id")
    private final Integer fromId;

    @pmi0("hash")
    private final String hash;

    @pmi0("id")
    private final Integer id;

    @pmi0("is_favorite")
    private final Boolean isFavorite;

    @pmi0("is_pinned")
    private final Integer isPinned;

    @pmi0("is_promoted_post_stealth")
    private final Boolean isPromotedPostStealth;

    @pmi0("likes")
    private final AdsPostLikesDto likes;

    @pmi0("marked_as_ads")
    private final Integer markedAsAds;

    @pmi0("owner")
    private final AdsPostOwnerDto owner;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("post_type")
    private final String postType;

    @pmi0("reaction_set_id")
    private final String reactionSetId;

    @pmi0("reactions")
    private final AdsPostReactionsDto reactions;

    @pmi0("reposts")
    private final AdsPostRepostsDto reposts;

    @pmi0("short_text_rate")
    private final Float shortTextRate;

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final String type;

    @pmi0("views")
    private final AdsPostViewsDto views;

    public AdsPostDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870911, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsPostDto)) {
            return false;
        }
        AdsPostDto adsPostDto = (AdsPostDto) obj;
        return epx.f(this.id, adsPostDto.id) && epx.f(this.fromId, adsPostDto.fromId) && epx.f(this.ownerId, adsPostDto.ownerId) && epx.f(this.date, adsPostDto.date) && epx.f(this.edited, adsPostDto.edited) && epx.f(this.isPinned, adsPostDto.isPinned) && epx.f(this.markedAsAds, adsPostDto.markedAsAds) && epx.f(this.adsEasyPromote, adsPostDto.adsEasyPromote) && epx.f(this.donut, adsPostDto.donut) && epx.f(this.comments, adsPostDto.comments) && epx.f(this.shortTextRate, adsPostDto.shortTextRate) && epx.f(this.type, adsPostDto.type) && epx.f(this.isFavorite, adsPostDto.isFavorite) && epx.f(this.likes, adsPostDto.likes) && epx.f(this.views, adsPostDto.views) && epx.f(this.reactions, adsPostDto.reactions) && epx.f(this.reactionSetId, adsPostDto.reactionSetId) && epx.f(this.postType, adsPostDto.postType) && epx.f(this.reposts, adsPostDto.reposts) && epx.f(this.text, adsPostDto.text) && epx.f(this.isPromotedPostStealth, adsPostDto.isPromotedPostStealth) && epx.f(this.hash, adsPostDto.hash) && epx.f(this.owner, adsPostDto.owner) && epx.f(this.attachments, adsPostDto.attachments) && epx.f(this.createdBy, adsPostDto.createdBy) && epx.f(this.carouselOffset, adsPostDto.carouselOffset) && epx.f(this.canEdit, adsPostDto.canEdit) && epx.f(this.canDelete, adsPostDto.canDelete) && epx.f(this.canPin, adsPostDto.canPin);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.fromId;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        UserId userId = this.ownerId;
        int hashCode3 = (hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num3 = this.date;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.edited;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.isPinned;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.markedAsAds;
        int hashCode7 = (hashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        AdsPostEasyPromoteDto adsPostEasyPromoteDto = this.adsEasyPromote;
        int hashCode8 = (hashCode7 + (adsPostEasyPromoteDto == null ? 0 : adsPostEasyPromoteDto.hashCode())) * 31;
        AdsPostDonutDto adsPostDonutDto = this.donut;
        int hashCode9 = (hashCode8 + (adsPostDonutDto == null ? 0 : adsPostDonutDto.hashCode())) * 31;
        AdsPostCommentsDto adsPostCommentsDto = this.comments;
        int hashCode10 = (hashCode9 + (adsPostCommentsDto == null ? 0 : adsPostCommentsDto.hashCode())) * 31;
        Float f = this.shortTextRate;
        int hashCode11 = (hashCode10 + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.type;
        int hashCode12 = (hashCode11 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isFavorite;
        int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        AdsPostLikesDto adsPostLikesDto = this.likes;
        int hashCode14 = (hashCode13 + (adsPostLikesDto == null ? 0 : adsPostLikesDto.hashCode())) * 31;
        AdsPostViewsDto adsPostViewsDto = this.views;
        int hashCode15 = (hashCode14 + (adsPostViewsDto == null ? 0 : adsPostViewsDto.hashCode())) * 31;
        AdsPostReactionsDto adsPostReactionsDto = this.reactions;
        int hashCode16 = (hashCode15 + (adsPostReactionsDto == null ? 0 : adsPostReactionsDto.hashCode())) * 31;
        String str2 = this.reactionSetId;
        int hashCode17 = (hashCode16 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.postType;
        int hashCode18 = (hashCode17 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AdsPostRepostsDto adsPostRepostsDto = this.reposts;
        int hashCode19 = (hashCode18 + (adsPostRepostsDto == null ? 0 : adsPostRepostsDto.hashCode())) * 31;
        String str4 = this.text;
        int hashCode20 = (hashCode19 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.isPromotedPostStealth;
        int hashCode21 = (hashCode20 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.hash;
        int hashCode22 = (hashCode21 + (str5 == null ? 0 : str5.hashCode())) * 31;
        AdsPostOwnerDto adsPostOwnerDto = this.owner;
        int hashCode23 = (hashCode22 + (adsPostOwnerDto == null ? 0 : adsPostOwnerDto.hashCode())) * 31;
        List<WallWallpostAttachmentDto> list = this.attachments;
        int hashCode24 = (hashCode23 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num7 = this.createdBy;
        int hashCode25 = (hashCode24 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.carouselOffset;
        int hashCode26 = (hashCode25 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.canEdit;
        int hashCode27 = (hashCode26 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.canDelete;
        int hashCode28 = (hashCode27 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.canPin;
        return hashCode28 + (num11 != null ? num11.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.id;
        Integer num2 = this.fromId;
        UserId userId = this.ownerId;
        Integer num3 = this.date;
        Integer num4 = this.edited;
        Integer num5 = this.isPinned;
        Integer num6 = this.markedAsAds;
        AdsPostEasyPromoteDto adsPostEasyPromoteDto = this.adsEasyPromote;
        AdsPostDonutDto adsPostDonutDto = this.donut;
        AdsPostCommentsDto adsPostCommentsDto = this.comments;
        Float f = this.shortTextRate;
        String str = this.type;
        Boolean bool = this.isFavorite;
        AdsPostLikesDto adsPostLikesDto = this.likes;
        AdsPostViewsDto adsPostViewsDto = this.views;
        AdsPostReactionsDto adsPostReactionsDto = this.reactions;
        String str2 = this.reactionSetId;
        String str3 = this.postType;
        AdsPostRepostsDto adsPostRepostsDto = this.reposts;
        String str4 = this.text;
        Boolean bool2 = this.isPromotedPostStealth;
        String str5 = this.hash;
        AdsPostOwnerDto adsPostOwnerDto = this.owner;
        List<WallWallpostAttachmentDto> list = this.attachments;
        Integer num7 = this.createdBy;
        Integer num8 = this.carouselOffset;
        Integer num9 = this.canEdit;
        Integer num10 = this.canDelete;
        Integer num11 = this.canPin;
        StringBuilder a = wr.a(num, "AdsPostDto(id=", num2, ", fromId=", ", ownerId=");
        a.append(userId);
        a.append(", date=");
        a.append(num3);
        a.append(", edited=");
        sq.b(a, num4, ", isPinned=", num5, ", markedAsAds=");
        a.append(num6);
        a.append(", adsEasyPromote=");
        a.append(adsPostEasyPromoteDto);
        a.append(", donut=");
        a.append(adsPostDonutDto);
        a.append(", comments=");
        a.append(adsPostCommentsDto);
        a.append(", shortTextRate=");
        a.append(f);
        a.append(", type=");
        a.append(str);
        a.append(", isFavorite=");
        a.append(bool);
        a.append(", likes=");
        a.append(adsPostLikesDto);
        a.append(", views=");
        a.append(adsPostViewsDto);
        a.append(", reactions=");
        a.append(adsPostReactionsDto);
        a.append(", reactionSetId=");
        n6j.b(a, str2, ", postType=", str3, ", reposts=");
        a.append(adsPostRepostsDto);
        a.append(", text=");
        a.append(str4);
        a.append(", isPromotedPostStealth=");
        l4.i(bool2, ", hash=", str5, ", owner=", a);
        a.append(adsPostOwnerDto);
        a.append(", attachments=");
        a.append(list);
        a.append(", createdBy=");
        sq.b(a, num7, ", carouselOffset=", num8, ", canEdit=");
        sq.b(a, num9, ", canDelete=", num10, ", canPin=");
        return oq.b(a, num11, ")");
    }

    public AdsPostDto(Integer num, Integer num2, UserId userId, Integer num3, Integer num4, Integer num5, Integer num6, AdsPostEasyPromoteDto adsPostEasyPromoteDto, AdsPostDonutDto adsPostDonutDto, AdsPostCommentsDto adsPostCommentsDto, Float f, String str, Boolean bool, AdsPostLikesDto adsPostLikesDto, AdsPostViewsDto adsPostViewsDto, AdsPostReactionsDto adsPostReactionsDto, String str2, String str3, AdsPostRepostsDto adsPostRepostsDto, String str4, Boolean bool2, String str5, AdsPostOwnerDto adsPostOwnerDto, List<WallWallpostAttachmentDto> list, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11) {
        this.id = num;
        this.fromId = num2;
        this.ownerId = userId;
        this.date = num3;
        this.edited = num4;
        this.isPinned = num5;
        this.markedAsAds = num6;
        this.adsEasyPromote = adsPostEasyPromoteDto;
        this.donut = adsPostDonutDto;
        this.comments = adsPostCommentsDto;
        this.shortTextRate = f;
        this.type = str;
        this.isFavorite = bool;
        this.likes = adsPostLikesDto;
        this.views = adsPostViewsDto;
        this.reactions = adsPostReactionsDto;
        this.reactionSetId = str2;
        this.postType = str3;
        this.reposts = adsPostRepostsDto;
        this.text = str4;
        this.isPromotedPostStealth = bool2;
        this.hash = str5;
        this.owner = adsPostOwnerDto;
        this.attachments = list;
        this.createdBy = num7;
        this.carouselOffset = num8;
        this.canEdit = num9;
        this.canDelete = num10;
        this.canPin = num11;
    }

    public /* synthetic */ AdsPostDto(Integer num, Integer num2, UserId userId, Integer num3, Integer num4, Integer num5, Integer num6, AdsPostEasyPromoteDto adsPostEasyPromoteDto, AdsPostDonutDto adsPostDonutDto, AdsPostCommentsDto adsPostCommentsDto, Float f, String str, Boolean bool, AdsPostLikesDto adsPostLikesDto, AdsPostViewsDto adsPostViewsDto, AdsPostReactionsDto adsPostReactionsDto, String str2, String str3, AdsPostRepostsDto adsPostRepostsDto, String str4, Boolean bool2, String str5, AdsPostOwnerDto adsPostOwnerDto, List list, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : userId, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4, (i & 32) != 0 ? null : num5, (i & 64) != 0 ? null : num6, (i & 128) != 0 ? null : adsPostEasyPromoteDto, (i & 256) != 0 ? null : adsPostDonutDto, (i & 512) != 0 ? null : adsPostCommentsDto, (i & 1024) != 0 ? null : f, (i & 2048) != 0 ? null : str, (i & 4096) != 0 ? null : bool, (i & 8192) != 0 ? null : adsPostLikesDto, (i & 16384) != 0 ? null : adsPostViewsDto, (i & 32768) != 0 ? null : adsPostReactionsDto, (i & 65536) != 0 ? null : str2, (i & 131072) != 0 ? null : str3, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : adsPostRepostsDto, (i & 524288) != 0 ? null : str4, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool2, (i & 2097152) != 0 ? null : str5, (i & 4194304) != 0 ? null : adsPostOwnerDto, (i & 8388608) != 0 ? null : list, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : num7, (i & 33554432) != 0 ? null : num8, (i & 67108864) != 0 ? null : num9, (i & 134217728) != 0 ? null : num10, (i & 268435456) != 0 ? null : num11);
    }
}
