package com.vk.sdk.api.stories.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import com.vk.sdk.api.photos.dto.PhotosPhotoDto;
import com.vk.sdk.api.video.dto.VideoVideoFullDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.rq;
import xsna.sq;
import xsna.to;
import xsna.zcl;

/* compiled from: StoriesStoryDto.kt */
/* loaded from: classes5.dex */
public final class StoriesStoryDto {

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("can_ask")
    private final BaseBoolIntDto canAsk;

    @pmi0("can_ask_anonymous")
    private final BaseBoolIntDto canAskAnonymous;

    @pmi0("can_comment")
    private final BaseBoolIntDto canComment;

    @pmi0("can_hide")
    private final BaseBoolIntDto canHide;

    @pmi0("can_like")
    private final Boolean canLike;

    @pmi0("can_reply")
    private final BaseBoolIntDto canReply;

    @pmi0("can_see")
    private final BaseBoolIntDto canSee;

    @pmi0("can_share")
    private final BaseBoolIntDto canShare;

    @pmi0("can_use_in_narrative")
    private final Boolean canUseInNarrative;

    @pmi0("clickable_stickers")
    private final StoriesClickableStickersDto clickableStickers;

    @pmi0("date")
    private final Integer date;

    @pmi0("expires_at")
    private final Integer expiresAt;

    @pmi0("first_narrative_title")
    private final String firstNarrativeTitle;

    @pmi0("id")
    private final int id;

    @pmi0("is_deleted")
    private final Boolean isDeleted;

    @pmi0("is_expired")
    private final Boolean isExpired;

    @pmi0("link")
    private final StoriesStoryLinkDto link;

    @pmi0("narratives_count")
    private final Integer narrativesCount;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("parent_story")
    private final StoriesStoryDto parentStory;

    @pmi0("parent_story_access_key")
    private final String parentStoryAccessKey;

    @pmi0("parent_story_id")
    private final Integer parentStoryId;

    @pmi0("parent_story_owner_id")
    private final Integer parentStoryOwnerId;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("replies")
    private final StoriesRepliesDto replies;

    @pmi0("seen")
    private final BaseBoolIntDto seen;

    @pmi0("type")
    private final StoriesStoryTypeDto type;

    @pmi0("video")
    private final VideoVideoFullDto video;

    @pmi0("views")
    private final Integer views;

    public StoriesStoryDto(int i, UserId userId, String str, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Boolean bool, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, Integer num, Integer num2, Boolean bool2, Boolean bool3, StoriesStoryLinkDto storiesStoryLinkDto, StoriesStoryDto storiesStoryDto, String str2, Integer num3, Integer num4, PhotosPhotoDto photosPhotoDto, StoriesRepliesDto storiesRepliesDto, BaseBoolIntDto baseBoolIntDto6, StoriesStoryTypeDto storiesStoryTypeDto, StoriesClickableStickersDto storiesClickableStickersDto, VideoVideoFullDto videoVideoFullDto, Integer num5, BaseBoolIntDto baseBoolIntDto7, BaseBoolIntDto baseBoolIntDto8, Integer num6, String str3, Boolean bool4) {
        this.id = i;
        this.ownerId = userId;
        this.accessKey = str;
        this.canComment = baseBoolIntDto;
        this.canReply = baseBoolIntDto2;
        this.canSee = baseBoolIntDto3;
        this.canLike = bool;
        this.canShare = baseBoolIntDto4;
        this.canHide = baseBoolIntDto5;
        this.date = num;
        this.expiresAt = num2;
        this.isDeleted = bool2;
        this.isExpired = bool3;
        this.link = storiesStoryLinkDto;
        this.parentStory = storiesStoryDto;
        this.parentStoryAccessKey = str2;
        this.parentStoryId = num3;
        this.parentStoryOwnerId = num4;
        this.photo = photosPhotoDto;
        this.replies = storiesRepliesDto;
        this.seen = baseBoolIntDto6;
        this.type = storiesStoryTypeDto;
        this.clickableStickers = storiesClickableStickersDto;
        this.video = videoVideoFullDto;
        this.views = num5;
        this.canAsk = baseBoolIntDto7;
        this.canAskAnonymous = baseBoolIntDto8;
        this.narrativesCount = num6;
        this.firstNarrativeTitle = str3;
        this.canUseInNarrative = bool4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesStoryDto)) {
            return false;
        }
        StoriesStoryDto storiesStoryDto = (StoriesStoryDto) obj;
        return this.id == storiesStoryDto.id && epx.f(this.ownerId, storiesStoryDto.ownerId) && epx.f(this.accessKey, storiesStoryDto.accessKey) && this.canComment == storiesStoryDto.canComment && this.canReply == storiesStoryDto.canReply && this.canSee == storiesStoryDto.canSee && epx.f(this.canLike, storiesStoryDto.canLike) && this.canShare == storiesStoryDto.canShare && this.canHide == storiesStoryDto.canHide && epx.f(this.date, storiesStoryDto.date) && epx.f(this.expiresAt, storiesStoryDto.expiresAt) && epx.f(this.isDeleted, storiesStoryDto.isDeleted) && epx.f(this.isExpired, storiesStoryDto.isExpired) && epx.f(this.link, storiesStoryDto.link) && epx.f(this.parentStory, storiesStoryDto.parentStory) && epx.f(this.parentStoryAccessKey, storiesStoryDto.parentStoryAccessKey) && epx.f(this.parentStoryId, storiesStoryDto.parentStoryId) && epx.f(this.parentStoryOwnerId, storiesStoryDto.parentStoryOwnerId) && epx.f(this.photo, storiesStoryDto.photo) && epx.f(this.replies, storiesStoryDto.replies) && this.seen == storiesStoryDto.seen && this.type == storiesStoryDto.type && epx.f(this.clickableStickers, storiesStoryDto.clickableStickers) && epx.f(this.video, storiesStoryDto.video) && epx.f(this.views, storiesStoryDto.views) && this.canAsk == storiesStoryDto.canAsk && this.canAskAnonymous == storiesStoryDto.canAskAnonymous && epx.f(this.narrativesCount, storiesStoryDto.narrativesCount) && epx.f(this.firstNarrativeTitle, storiesStoryDto.firstNarrativeTitle) && epx.f(this.canUseInNarrative, storiesStoryDto.canUseInNarrative);
    }

    public final int hashCode() {
        int a = bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b);
        String str = this.accessKey;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.canComment;
        int hashCode2 = (hashCode + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.canReply;
        int hashCode3 = (hashCode2 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.canSee;
        int hashCode4 = (hashCode3 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        Boolean bool = this.canLike;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.canShare;
        int hashCode6 = (hashCode5 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto5 = this.canHide;
        int hashCode7 = (hashCode6 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
        Integer num = this.date;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.expiresAt;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.isDeleted;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isExpired;
        int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        StoriesStoryLinkDto storiesStoryLinkDto = this.link;
        int hashCode12 = (hashCode11 + (storiesStoryLinkDto == null ? 0 : storiesStoryLinkDto.hashCode())) * 31;
        StoriesStoryDto storiesStoryDto = this.parentStory;
        int hashCode13 = (hashCode12 + (storiesStoryDto == null ? 0 : storiesStoryDto.hashCode())) * 31;
        String str2 = this.parentStoryAccessKey;
        int hashCode14 = (hashCode13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.parentStoryId;
        int hashCode15 = (hashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.parentStoryOwnerId;
        int hashCode16 = (hashCode15 + (num4 == null ? 0 : num4.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode17 = (hashCode16 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        StoriesRepliesDto storiesRepliesDto = this.replies;
        int hashCode18 = (hashCode17 + (storiesRepliesDto == null ? 0 : storiesRepliesDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto6 = this.seen;
        int hashCode19 = (hashCode18 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
        StoriesStoryTypeDto storiesStoryTypeDto = this.type;
        int hashCode20 = (hashCode19 + (storiesStoryTypeDto == null ? 0 : storiesStoryTypeDto.hashCode())) * 31;
        StoriesClickableStickersDto storiesClickableStickersDto = this.clickableStickers;
        int hashCode21 = (hashCode20 + (storiesClickableStickersDto == null ? 0 : storiesClickableStickersDto.hashCode())) * 31;
        VideoVideoFullDto videoVideoFullDto = this.video;
        int hashCode22 = (hashCode21 + (videoVideoFullDto == null ? 0 : videoVideoFullDto.hashCode())) * 31;
        Integer num5 = this.views;
        int hashCode23 = (hashCode22 + (num5 == null ? 0 : num5.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto7 = this.canAsk;
        int hashCode24 = (hashCode23 + (baseBoolIntDto7 == null ? 0 : baseBoolIntDto7.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto8 = this.canAskAnonymous;
        int hashCode25 = (hashCode24 + (baseBoolIntDto8 == null ? 0 : baseBoolIntDto8.hashCode())) * 31;
        Integer num6 = this.narrativesCount;
        int hashCode26 = (hashCode25 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str3 = this.firstNarrativeTitle;
        int hashCode27 = (hashCode26 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool4 = this.canUseInNarrative;
        return hashCode27 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        UserId userId = this.ownerId;
        String str = this.accessKey;
        BaseBoolIntDto baseBoolIntDto = this.canComment;
        BaseBoolIntDto baseBoolIntDto2 = this.canReply;
        BaseBoolIntDto baseBoolIntDto3 = this.canSee;
        Boolean bool = this.canLike;
        BaseBoolIntDto baseBoolIntDto4 = this.canShare;
        BaseBoolIntDto baseBoolIntDto5 = this.canHide;
        Integer num = this.date;
        Integer num2 = this.expiresAt;
        Boolean bool2 = this.isDeleted;
        Boolean bool3 = this.isExpired;
        StoriesStoryLinkDto storiesStoryLinkDto = this.link;
        StoriesStoryDto storiesStoryDto = this.parentStory;
        String str2 = this.parentStoryAccessKey;
        Integer num3 = this.parentStoryId;
        Integer num4 = this.parentStoryOwnerId;
        PhotosPhotoDto photosPhotoDto = this.photo;
        StoriesRepliesDto storiesRepliesDto = this.replies;
        BaseBoolIntDto baseBoolIntDto6 = this.seen;
        StoriesStoryTypeDto storiesStoryTypeDto = this.type;
        StoriesClickableStickersDto storiesClickableStickersDto = this.clickableStickers;
        VideoVideoFullDto videoVideoFullDto = this.video;
        Integer num5 = this.views;
        BaseBoolIntDto baseBoolIntDto7 = this.canAsk;
        BaseBoolIntDto baseBoolIntDto8 = this.canAskAnonymous;
        Integer num6 = this.narrativesCount;
        String str3 = this.firstNarrativeTitle;
        Boolean bool4 = this.canUseInNarrative;
        StringBuilder sb = new StringBuilder("StoriesStoryDto(id=");
        sb.append(i);
        sb.append(", ownerId=");
        sb.append(userId);
        sb.append(", accessKey=");
        sb.append(str);
        sb.append(", canComment=");
        sb.append(baseBoolIntDto);
        sb.append(", canReply=");
        to.b(sb, baseBoolIntDto2, ", canSee=", baseBoolIntDto3, ", canLike=");
        sb.append(bool);
        sb.append(", canShare=");
        sb.append(baseBoolIntDto4);
        sb.append(", canHide=");
        sb.append(baseBoolIntDto5);
        sb.append(", date=");
        sb.append(num);
        sb.append(", expiresAt=");
        rq.h(sb, num2, ", isDeleted=", bool2, ", isExpired=");
        sb.append(bool3);
        sb.append(", link=");
        sb.append(storiesStoryLinkDto);
        sb.append(", parentStory=");
        sb.append(storiesStoryDto);
        sb.append(", parentStoryAccessKey=");
        sb.append(str2);
        sb.append(", parentStoryId=");
        sq.b(sb, num3, ", parentStoryOwnerId=", num4, ", photo=");
        sb.append(photosPhotoDto);
        sb.append(", replies=");
        sb.append(storiesRepliesDto);
        sb.append(", seen=");
        sb.append(baseBoolIntDto6);
        sb.append(", type=");
        sb.append(storiesStoryTypeDto);
        sb.append(", clickableStickers=");
        sb.append(storiesClickableStickersDto);
        sb.append(", video=");
        sb.append(videoVideoFullDto);
        sb.append(", views=");
        sb.append(num5);
        sb.append(", canAsk=");
        sb.append(baseBoolIntDto7);
        sb.append(", canAskAnonymous=");
        sb.append(baseBoolIntDto8);
        sb.append(", narrativesCount=");
        sb.append(num6);
        sb.append(", firstNarrativeTitle=");
        sb.append(str3);
        sb.append(", canUseInNarrative=");
        sb.append(bool4);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ StoriesStoryDto(int i, UserId userId, String str, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, Boolean bool, BaseBoolIntDto baseBoolIntDto4, BaseBoolIntDto baseBoolIntDto5, Integer num, Integer num2, Boolean bool2, Boolean bool3, StoriesStoryLinkDto storiesStoryLinkDto, StoriesStoryDto storiesStoryDto, String str2, Integer num3, Integer num4, PhotosPhotoDto photosPhotoDto, StoriesRepliesDto storiesRepliesDto, BaseBoolIntDto baseBoolIntDto6, StoriesStoryTypeDto storiesStoryTypeDto, StoriesClickableStickersDto storiesClickableStickersDto, VideoVideoFullDto videoVideoFullDto, Integer num5, BaseBoolIntDto baseBoolIntDto7, BaseBoolIntDto baseBoolIntDto8, Integer num6, String str3, Boolean bool4, int i2, zcl zclVar) {
        this(i, userId, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : baseBoolIntDto, (i2 & 16) != 0 ? null : baseBoolIntDto2, (i2 & 32) != 0 ? null : baseBoolIntDto3, (i2 & 64) != 0 ? null : bool, (i2 & 128) != 0 ? null : baseBoolIntDto4, (i2 & 256) != 0 ? null : baseBoolIntDto5, (i2 & 512) != 0 ? null : num, (i2 & 1024) != 0 ? null : num2, (i2 & 2048) != 0 ? null : bool2, (i2 & 4096) != 0 ? null : bool3, (i2 & 8192) != 0 ? null : storiesStoryLinkDto, (i2 & 16384) != 0 ? null : storiesStoryDto, (32768 & i2) != 0 ? null : str2, (65536 & i2) != 0 ? null : num3, (131072 & i2) != 0 ? null : num4, (262144 & i2) != 0 ? null : photosPhotoDto, (524288 & i2) != 0 ? null : storiesRepliesDto, (1048576 & i2) != 0 ? null : baseBoolIntDto6, (2097152 & i2) != 0 ? null : storiesStoryTypeDto, (4194304 & i2) != 0 ? null : storiesClickableStickersDto, (8388608 & i2) != 0 ? null : videoVideoFullDto, (16777216 & i2) != 0 ? null : num5, (33554432 & i2) != 0 ? null : baseBoolIntDto7, (67108864 & i2) != 0 ? null : baseBoolIntDto8, (134217728 & i2) != 0 ? null : num6, (268435456 & i2) != 0 ? null : str3, (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool4);
    }
}
