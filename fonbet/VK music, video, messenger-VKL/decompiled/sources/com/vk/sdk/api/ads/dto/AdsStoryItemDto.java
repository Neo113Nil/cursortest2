package com.vk.sdk.api.ads.dto;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.epx;
import xsna.i5s;
import xsna.l4;
import xsna.mq;
import xsna.n6j;
import xsna.pmi0;
import xsna.tq;
import xsna.uq;
import xsna.zcl;

/* compiled from: AdsStoryItemDto.kt */
/* loaded from: classes5.dex */
public final class AdsStoryItemDto {

    @pmi0("can_ask")
    private final Boolean canAsk;

    @pmi0("can_ask_anonymous")
    private final Boolean canAskAnonymous;

    @pmi0("can_comment")
    private final Boolean canComment;

    @pmi0("canLike")
    private final Boolean canLike;

    @pmi0("can_manage")
    private final Boolean canManage;

    @pmi0("can_remove")
    private final Boolean canRemove;

    @pmi0("can_share")
    private final Boolean canShare;

    @pmi0("date")
    private final String date;

    @pmi0("first_frame")
    private final String firstFrame;

    @pmi0("id")
    private final Integer id;

    @pmi0("isAds")
    private final Boolean isAds;

    @pmi0("isLiked")
    private final Boolean isLiked;

    @pmi0("isPartOfNarrative")
    private final Boolean isPartOfNarrative;

    @pmi0("isProfileQuestion")
    private final Boolean isProfileQuestion;

    @pmi0("likeHash")
    private final String likeHash;

    @pmi0("link")
    private final AdsStoryItemLinkDto link;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("photo_url")
    private final String photoUrl;

    @pmi0("preview_url")
    private final String previewUrl;

    @pmi0("raw_id")
    private final String rawId;

    @pmi0("reaction_set_id")
    private final String reactionSetId;

    @pmi0("report_hash")
    private final String reportHash;

    @pmi0("small_preview")
    private final String smallPreview;

    @pmi0("stats")
    private final AdsStoryItemStatsDto stats;

    @pmi0("time")
    private final Integer time;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final String type;

    @pmi0("unread")
    private final Boolean unread;

    @pmi0("video_url")
    private final String videoUrl;

    public AdsStoryItemDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870911, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsStoryItemDto)) {
            return false;
        }
        AdsStoryItemDto adsStoryItemDto = (AdsStoryItemDto) obj;
        return epx.f(this.id, adsStoryItemDto.id) && epx.f(this.ownerId, adsStoryItemDto.ownerId) && epx.f(this.rawId, adsStoryItemDto.rawId) && epx.f(this.date, adsStoryItemDto.date) && epx.f(this.time, adsStoryItemDto.time) && epx.f(this.type, adsStoryItemDto.type) && epx.f(this.unread, adsStoryItemDto.unread) && epx.f(this.canLike, adsStoryItemDto.canLike) && epx.f(this.canComment, adsStoryItemDto.canComment) && epx.f(this.canShare, adsStoryItemDto.canShare) && epx.f(this.canRemove, adsStoryItemDto.canRemove) && epx.f(this.canManage, adsStoryItemDto.canManage) && epx.f(this.canAsk, adsStoryItemDto.canAsk) && epx.f(this.canAskAnonymous, adsStoryItemDto.canAskAnonymous) && epx.f(this.reactionSetId, adsStoryItemDto.reactionSetId) && epx.f(this.isProfileQuestion, adsStoryItemDto.isProfileQuestion) && epx.f(this.stats, adsStoryItemDto.stats) && epx.f(this.link, adsStoryItemDto.link) && epx.f(this.photoUrl, adsStoryItemDto.photoUrl) && epx.f(this.previewUrl, adsStoryItemDto.previewUrl) && epx.f(this.trackCode, adsStoryItemDto.trackCode) && epx.f(this.isPartOfNarrative, adsStoryItemDto.isPartOfNarrative) && epx.f(this.isAds, adsStoryItemDto.isAds) && epx.f(this.videoUrl, adsStoryItemDto.videoUrl) && epx.f(this.firstFrame, adsStoryItemDto.firstFrame) && epx.f(this.smallPreview, adsStoryItemDto.smallPreview) && epx.f(this.isLiked, adsStoryItemDto.isLiked) && epx.f(this.likeHash, adsStoryItemDto.likeHash) && epx.f(this.reportHash, adsStoryItemDto.reportHash);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        UserId userId = this.ownerId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str = this.rawId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.date;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.time;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.type;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.unread;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canLike;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.canComment;
        int hashCode9 = (hashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.canShare;
        int hashCode10 = (hashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.canRemove;
        int hashCode11 = (hashCode10 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.canManage;
        int hashCode12 = (hashCode11 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.canAsk;
        int hashCode13 = (hashCode12 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.canAskAnonymous;
        int hashCode14 = (hashCode13 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        String str4 = this.reactionSetId;
        int hashCode15 = (hashCode14 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool9 = this.isProfileQuestion;
        int hashCode16 = (hashCode15 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        AdsStoryItemStatsDto adsStoryItemStatsDto = this.stats;
        int hashCode17 = (hashCode16 + (adsStoryItemStatsDto == null ? 0 : adsStoryItemStatsDto.hashCode())) * 31;
        AdsStoryItemLinkDto adsStoryItemLinkDto = this.link;
        int hashCode18 = (hashCode17 + (adsStoryItemLinkDto == null ? 0 : adsStoryItemLinkDto.hashCode())) * 31;
        String str5 = this.photoUrl;
        int hashCode19 = (hashCode18 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.previewUrl;
        int hashCode20 = (hashCode19 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.trackCode;
        int hashCode21 = (hashCode20 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool10 = this.isPartOfNarrative;
        int hashCode22 = (hashCode21 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.isAds;
        int hashCode23 = (hashCode22 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        String str8 = this.videoUrl;
        int hashCode24 = (hashCode23 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.firstFrame;
        int hashCode25 = (hashCode24 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.smallPreview;
        int hashCode26 = (hashCode25 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool12 = this.isLiked;
        int hashCode27 = (hashCode26 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        String str11 = this.likeHash;
        int hashCode28 = (hashCode27 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.reportHash;
        return hashCode28 + (str12 != null ? str12.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.id;
        UserId userId = this.ownerId;
        String str = this.rawId;
        String str2 = this.date;
        Integer num2 = this.time;
        String str3 = this.type;
        Boolean bool = this.unread;
        Boolean bool2 = this.canLike;
        Boolean bool3 = this.canComment;
        Boolean bool4 = this.canShare;
        Boolean bool5 = this.canRemove;
        Boolean bool6 = this.canManage;
        Boolean bool7 = this.canAsk;
        Boolean bool8 = this.canAskAnonymous;
        String str4 = this.reactionSetId;
        Boolean bool9 = this.isProfileQuestion;
        AdsStoryItemStatsDto adsStoryItemStatsDto = this.stats;
        AdsStoryItemLinkDto adsStoryItemLinkDto = this.link;
        String str5 = this.photoUrl;
        String str6 = this.previewUrl;
        String str7 = this.trackCode;
        Boolean bool10 = this.isPartOfNarrative;
        Boolean bool11 = this.isAds;
        String str8 = this.videoUrl;
        String str9 = this.firstFrame;
        String str10 = this.smallPreview;
        Boolean bool12 = this.isLiked;
        String str11 = this.likeHash;
        String str12 = this.reportHash;
        StringBuilder sb = new StringBuilder("AdsStoryItemDto(id=");
        sb.append(num);
        sb.append(", ownerId=");
        sb.append(userId);
        sb.append(", rawId=");
        n6j.b(sb, str, ", date=", str2, ", time=");
        mq.b(num2, ", type=", str3, ", unread=", sb);
        tq.i(sb, bool, ", canLike=", bool2, ", canComment=");
        tq.i(sb, bool3, ", canShare=", bool4, ", canRemove=");
        tq.i(sb, bool5, ", canManage=", bool6, ", canAsk=");
        tq.i(sb, bool7, ", canAskAnonymous=", bool8, ", reactionSetId=");
        uq.c(bool9, str4, ", isProfileQuestion=", ", stats=", sb);
        sb.append(adsStoryItemStatsDto);
        sb.append(", link=");
        sb.append(adsStoryItemLinkDto);
        sb.append(", photoUrl=");
        n6j.b(sb, str5, ", previewUrl=", str6, ", trackCode=");
        uq.c(bool10, str7, ", isPartOfNarrative=", ", isAds=", sb);
        l4.i(bool11, ", videoUrl=", str8, ", firstFrame=", sb);
        n6j.b(sb, str9, ", smallPreview=", str10, ", isLiked=");
        l4.i(bool12, ", likeHash=", str11, ", reportHash=", sb);
        return i5s.a(sb, str12, ")");
    }

    public AdsStoryItemDto(Integer num, UserId userId, String str, String str2, Integer num2, String str3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, String str4, Boolean bool9, AdsStoryItemStatsDto adsStoryItemStatsDto, AdsStoryItemLinkDto adsStoryItemLinkDto, String str5, String str6, String str7, Boolean bool10, Boolean bool11, String str8, String str9, String str10, Boolean bool12, String str11, String str12) {
        this.id = num;
        this.ownerId = userId;
        this.rawId = str;
        this.date = str2;
        this.time = num2;
        this.type = str3;
        this.unread = bool;
        this.canLike = bool2;
        this.canComment = bool3;
        this.canShare = bool4;
        this.canRemove = bool5;
        this.canManage = bool6;
        this.canAsk = bool7;
        this.canAskAnonymous = bool8;
        this.reactionSetId = str4;
        this.isProfileQuestion = bool9;
        this.stats = adsStoryItemStatsDto;
        this.link = adsStoryItemLinkDto;
        this.photoUrl = str5;
        this.previewUrl = str6;
        this.trackCode = str7;
        this.isPartOfNarrative = bool10;
        this.isAds = bool11;
        this.videoUrl = str8;
        this.firstFrame = str9;
        this.smallPreview = str10;
        this.isLiked = bool12;
        this.likeHash = str11;
        this.reportHash = str12;
    }

    public /* synthetic */ AdsStoryItemDto(Integer num, UserId userId, String str, String str2, Integer num2, String str3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, String str4, Boolean bool9, AdsStoryItemStatsDto adsStoryItemStatsDto, AdsStoryItemLinkDto adsStoryItemLinkDto, String str5, String str6, String str7, Boolean bool10, Boolean bool11, String str8, String str9, String str10, Boolean bool12, String str11, String str12, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : bool3, (i & 512) != 0 ? null : bool4, (i & 1024) != 0 ? null : bool5, (i & 2048) != 0 ? null : bool6, (i & 4096) != 0 ? null : bool7, (i & 8192) != 0 ? null : bool8, (i & 16384) != 0 ? null : str4, (i & 32768) != 0 ? null : bool9, (i & 65536) != 0 ? null : adsStoryItemStatsDto, (i & 131072) != 0 ? null : adsStoryItemLinkDto, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str5, (i & 524288) != 0 ? null : str6, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str7, (i & 2097152) != 0 ? null : bool10, (i & 4194304) != 0 ? null : bool11, (i & 8388608) != 0 ? null : str8, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str9, (i & 33554432) != 0 ? null : str10, (i & 67108864) != 0 ? null : bool12, (i & 134217728) != 0 ? null : str11, (i & 268435456) != 0 ? null : str12);
    }
}
