package com.vk.sdk.api.newsfeed.dto;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseLikesInfoDto;
import com.vk.sdk.api.base.dto.BaseRepostsInfoDto;
import com.vk.sdk.api.wall.dto.WallGeoDto;
import com.vk.sdk.api.wall.dto.WallPostCopyrightDto;
import com.vk.sdk.api.wall.dto.WallPostSourceDto;
import com.vk.sdk.api.wall.dto.WallPostTypeDto;
import com.vk.sdk.api.wall.dto.WallViewsDto;
import com.vk.sdk.api.wall.dto.WallWallpostAttachmentDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import xsna.epx;
import xsna.n6j;
import xsna.pmi0;
import xsna.rq;
import xsna.sq;
import xsna.zcl;

/* compiled from: NewsfeedItemDigestItemDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedItemDigestItemDto {

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("attachments")
    private final List<WallWallpostAttachmentDto> attachments;

    @pmi0("copyright")
    private final WallPostCopyrightDto copyright;

    @pmi0("date")
    private final Integer date;

    @pmi0("deleted_details")
    private final String deletedDetails;

    @pmi0("deleted_reason")
    private final String deletedReason;

    @pmi0("edited")
    private final Integer edited;

    @pmi0("from_id")
    private final UserId fromId;

    @pmi0("geo")
    private final WallGeoDto geo;

    @pmi0("id")
    private final Integer id;

    @pmi0("is_archived")
    private final Boolean isArchived;

    @pmi0("is_deleted")
    private final Boolean isDeleted;

    @pmi0("is_favorite")
    private final Boolean isFavorite;

    @pmi0("likes")
    private final BaseLikesInfoDto likes;

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

    @pmi0("signer_id")
    private final UserId signerId;

    @pmi0("text")
    private final String text;

    @pmi0("views")
    private final WallViewsDto views;

    public NewsfeedItemDigestItemDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemDigestItemDto)) {
            return false;
        }
        NewsfeedItemDigestItemDto newsfeedItemDigestItemDto = (NewsfeedItemDigestItemDto) obj;
        return epx.f(this.accessKey, newsfeedItemDigestItemDto.accessKey) && epx.f(this.isDeleted, newsfeedItemDigestItemDto.isDeleted) && epx.f(this.deletedReason, newsfeedItemDigestItemDto.deletedReason) && epx.f(this.deletedDetails, newsfeedItemDigestItemDto.deletedDetails) && epx.f(this.attachments, newsfeedItemDigestItemDto.attachments) && epx.f(this.copyright, newsfeedItemDigestItemDto.copyright) && epx.f(this.date, newsfeedItemDigestItemDto.date) && epx.f(this.edited, newsfeedItemDigestItemDto.edited) && epx.f(this.fromId, newsfeedItemDigestItemDto.fromId) && epx.f(this.geo, newsfeedItemDigestItemDto.geo) && epx.f(this.id, newsfeedItemDigestItemDto.id) && epx.f(this.isArchived, newsfeedItemDigestItemDto.isArchived) && epx.f(this.isFavorite, newsfeedItemDigestItemDto.isFavorite) && epx.f(this.likes, newsfeedItemDigestItemDto.likes) && epx.f(this.ownerId, newsfeedItemDigestItemDto.ownerId) && epx.f(this.postId, newsfeedItemDigestItemDto.postId) && epx.f(this.parentsStack, newsfeedItemDigestItemDto.parentsStack) && epx.f(this.postSource, newsfeedItemDigestItemDto.postSource) && this.postType == newsfeedItemDigestItemDto.postType && epx.f(this.reposts, newsfeedItemDigestItemDto.reposts) && epx.f(this.signerId, newsfeedItemDigestItemDto.signerId) && epx.f(this.text, newsfeedItemDigestItemDto.text) && epx.f(this.views, newsfeedItemDigestItemDto.views);
    }

    public final int hashCode() {
        String str = this.accessKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isDeleted;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.deletedReason;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deletedDetails;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<WallWallpostAttachmentDto> list = this.attachments;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        WallPostCopyrightDto wallPostCopyrightDto = this.copyright;
        int hashCode6 = (hashCode5 + (wallPostCopyrightDto == null ? 0 : wallPostCopyrightDto.hashCode())) * 31;
        Integer num = this.date;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.edited;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        UserId userId = this.fromId;
        int hashCode9 = (hashCode8 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        WallGeoDto wallGeoDto = this.geo;
        int hashCode10 = (hashCode9 + (wallGeoDto == null ? 0 : wallGeoDto.hashCode())) * 31;
        Integer num3 = this.id;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool2 = this.isArchived;
        int hashCode12 = (hashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isFavorite;
        int hashCode13 = (hashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        BaseLikesInfoDto baseLikesInfoDto = this.likes;
        int hashCode14 = (hashCode13 + (baseLikesInfoDto == null ? 0 : baseLikesInfoDto.hashCode())) * 31;
        UserId userId2 = this.ownerId;
        int hashCode15 = (hashCode14 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        Integer num4 = this.postId;
        int hashCode16 = (hashCode15 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<Integer> list2 = this.parentsStack;
        int hashCode17 = (hashCode16 + (list2 == null ? 0 : list2.hashCode())) * 31;
        WallPostSourceDto wallPostSourceDto = this.postSource;
        int hashCode18 = (hashCode17 + (wallPostSourceDto == null ? 0 : wallPostSourceDto.hashCode())) * 31;
        WallPostTypeDto wallPostTypeDto = this.postType;
        int hashCode19 = (hashCode18 + (wallPostTypeDto == null ? 0 : wallPostTypeDto.hashCode())) * 31;
        BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
        int hashCode20 = (hashCode19 + (baseRepostsInfoDto == null ? 0 : baseRepostsInfoDto.hashCode())) * 31;
        UserId userId3 = this.signerId;
        int hashCode21 = (hashCode20 + (userId3 == null ? 0 : Long.hashCode(userId3.b))) * 31;
        String str4 = this.text;
        int hashCode22 = (hashCode21 + (str4 == null ? 0 : str4.hashCode())) * 31;
        WallViewsDto wallViewsDto = this.views;
        return hashCode22 + (wallViewsDto != null ? wallViewsDto.hashCode() : 0);
    }

    public final String toString() {
        String str = this.accessKey;
        Boolean bool = this.isDeleted;
        String str2 = this.deletedReason;
        String str3 = this.deletedDetails;
        List<WallWallpostAttachmentDto> list = this.attachments;
        WallPostCopyrightDto wallPostCopyrightDto = this.copyright;
        Integer num = this.date;
        Integer num2 = this.edited;
        UserId userId = this.fromId;
        WallGeoDto wallGeoDto = this.geo;
        Integer num3 = this.id;
        Boolean bool2 = this.isArchived;
        Boolean bool3 = this.isFavorite;
        BaseLikesInfoDto baseLikesInfoDto = this.likes;
        UserId userId2 = this.ownerId;
        Integer num4 = this.postId;
        List<Integer> list2 = this.parentsStack;
        WallPostSourceDto wallPostSourceDto = this.postSource;
        WallPostTypeDto wallPostTypeDto = this.postType;
        BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
        UserId userId3 = this.signerId;
        String str4 = this.text;
        WallViewsDto wallViewsDto = this.views;
        StringBuilder sb = new StringBuilder("NewsfeedItemDigestItemDto(accessKey=");
        sb.append(str);
        sb.append(", isDeleted=");
        sb.append(bool);
        sb.append(", deletedReason=");
        n6j.b(sb, str2, ", deletedDetails=", str3, ", attachments=");
        sb.append(list);
        sb.append(", copyright=");
        sb.append(wallPostCopyrightDto);
        sb.append(", date=");
        sq.b(sb, num, ", edited=", num2, ", fromId=");
        sb.append(userId);
        sb.append(", geo=");
        sb.append(wallGeoDto);
        sb.append(", id=");
        rq.h(sb, num3, ", isArchived=", bool2, ", isFavorite=");
        sb.append(bool3);
        sb.append(", likes=");
        sb.append(baseLikesInfoDto);
        sb.append(", ownerId=");
        sb.append(userId2);
        sb.append(", postId=");
        sb.append(num4);
        sb.append(", parentsStack=");
        sb.append(list2);
        sb.append(", postSource=");
        sb.append(wallPostSourceDto);
        sb.append(", postType=");
        sb.append(wallPostTypeDto);
        sb.append(", reposts=");
        sb.append(baseRepostsInfoDto);
        sb.append(", signerId=");
        sb.append(userId3);
        sb.append(", text=");
        sb.append(str4);
        sb.append(", views=");
        sb.append(wallViewsDto);
        sb.append(")");
        return sb.toString();
    }

    public NewsfeedItemDigestItemDto(String str, Boolean bool, String str2, String str3, List<WallWallpostAttachmentDto> list, WallPostCopyrightDto wallPostCopyrightDto, Integer num, Integer num2, UserId userId, WallGeoDto wallGeoDto, Integer num3, Boolean bool2, Boolean bool3, BaseLikesInfoDto baseLikesInfoDto, UserId userId2, Integer num4, List<Integer> list2, WallPostSourceDto wallPostSourceDto, WallPostTypeDto wallPostTypeDto, BaseRepostsInfoDto baseRepostsInfoDto, UserId userId3, String str4, WallViewsDto wallViewsDto) {
        this.accessKey = str;
        this.isDeleted = bool;
        this.deletedReason = str2;
        this.deletedDetails = str3;
        this.attachments = list;
        this.copyright = wallPostCopyrightDto;
        this.date = num;
        this.edited = num2;
        this.fromId = userId;
        this.geo = wallGeoDto;
        this.id = num3;
        this.isArchived = bool2;
        this.isFavorite = bool3;
        this.likes = baseLikesInfoDto;
        this.ownerId = userId2;
        this.postId = num4;
        this.parentsStack = list2;
        this.postSource = wallPostSourceDto;
        this.postType = wallPostTypeDto;
        this.reposts = baseRepostsInfoDto;
        this.signerId = userId3;
        this.text = str4;
        this.views = wallViewsDto;
    }

    public /* synthetic */ NewsfeedItemDigestItemDto(String str, Boolean bool, String str2, String str3, List list, WallPostCopyrightDto wallPostCopyrightDto, Integer num, Integer num2, UserId userId, WallGeoDto wallGeoDto, Integer num3, Boolean bool2, Boolean bool3, BaseLikesInfoDto baseLikesInfoDto, UserId userId2, Integer num4, List list2, WallPostSourceDto wallPostSourceDto, WallPostTypeDto wallPostTypeDto, BaseRepostsInfoDto baseRepostsInfoDto, UserId userId3, String str4, WallViewsDto wallViewsDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : wallPostCopyrightDto, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : userId, (i & 512) != 0 ? null : wallGeoDto, (i & 1024) != 0 ? null : num3, (i & 2048) != 0 ? null : bool2, (i & 4096) != 0 ? null : bool3, (i & 8192) != 0 ? null : baseLikesInfoDto, (i & 16384) != 0 ? null : userId2, (i & 32768) != 0 ? null : num4, (i & 65536) != 0 ? null : list2, (i & 131072) != 0 ? null : wallPostSourceDto, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : wallPostTypeDto, (i & 524288) != 0 ? null : baseRepostsInfoDto, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : userId3, (i & 2097152) != 0 ? null : str4, (i & 4194304) != 0 ? null : wallViewsDto);
    }
}
