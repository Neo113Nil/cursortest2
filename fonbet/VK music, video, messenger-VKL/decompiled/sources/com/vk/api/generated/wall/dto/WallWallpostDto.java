package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.badges.dto.BadgesCommentInfoDto;
import com.vk.api.generated.badges.dto.BadgesDonutInfoDto;
import com.vk.api.generated.badges.dto.BadgesObjectInfoDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseLikesInfoDto;
import com.vk.api.generated.base.dto.BaseRepostsInfoDto;
import com.vk.api.generated.likes.dto.LikesItemReactionsDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.sn;
import xsna.zrp;

/* compiled from: WallWallpostDto.kt */
/* loaded from: classes15.dex */
public final class WallWallpostDto implements Parcelable {
    public static final Parcelable.Creator<WallWallpostDto> CREATOR = new a();

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("attachments")
    private final List<WallWallpostAttachmentDto> attachments;

    @pmi0("attachments_meta")
    private final WallWallpostAttachmentsMetaDto attachmentsMeta;

    @pmi0("badge_id")
    private final Integer badgeId;

    @pmi0("badge_info")
    private final BadgesCommentInfoDto badgeInfo;

    @pmi0("badges")
    private final BadgesObjectInfoDto badges;

    @pmi0("can_archive")
    private final Boolean canArchive;

    @pmi0("can_view_stats")
    private final BaseBoolIntDto canViewStats;

    @pmi0("content_layout")
    private final List<WallWallpostContentLayoutItemDto> contentLayout;

    @pmi0("copyright")
    private final WallPostCopyrightDto copyright;

    @pmi0("date")
    private final Integer date;

    @pmi0("deleted_details")
    private final String deletedDetails;

    @pmi0("deleted_reason")
    private final String deletedReason;

    @pmi0("donut_badge_info")
    private final BadgesDonutInfoDto donutBadgeInfo;

    @pmi0("donut_miniapp_url")
    private final String donutMiniappUrl;

    @pmi0("edited")
    private final Integer edited;

    @pmi0("from_id")
    private final UserId fromId;

    @pmi0("geo")
    private final WallGeoDto geo;

    @pmi0("header")
    private final NewsfeedNewsfeedItemHeaderDto header;

    @pmi0("id")
    private final Integer id;

    @pmi0("inner_type")
    private final InnerTypeDto innerType;

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

    @pmi0("poster")
    private final WallPosterDto poster;

    @pmi0("reaction_set_id")
    private final String reactionSetId;

    @pmi0("reactions")
    private final LikesItemReactionsDto reactions;

    @pmi0("reply_count")
    private final Integer replyCount;

    @pmi0("reply_owner_id")
    private final UserId replyOwnerId;

    @pmi0("reply_post_id")
    private final Integer replyPostId;

    @pmi0("reply_to")
    private final UserId replyTo;

    @pmi0("reposts")
    private final BaseRepostsInfoDto reposts;

    @pmi0("sharing")
    private final WallSharingDto sharing;

    @pmi0("signer_id")
    private final UserId signerId;

    @pmi0("text")
    private final String text;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("views")
    private final WallViewsDto views;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WallWallpostDto.kt */
    public static final class InnerTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InnerTypeDto[] $VALUES;
        public static final Parcelable.Creator<InnerTypeDto> CREATOR;

        @pmi0("wall_wallpost")
        public static final InnerTypeDto WALL_WALLPOST;
        private final String value;

        /* compiled from: WallWallpostDto.kt */
        public static final class a implements Parcelable.Creator<InnerTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final InnerTypeDto createFromParcel(Parcel parcel) {
                return InnerTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final InnerTypeDto[] newArray(int i) {
                return new InnerTypeDto[i];
            }
        }

        static {
            InnerTypeDto innerTypeDto = new InnerTypeDto("WALL_WALLPOST", 0, "wall_wallpost");
            WALL_WALLPOST = innerTypeDto;
            InnerTypeDto[] innerTypeDtoArr = {innerTypeDto};
            $VALUES = innerTypeDtoArr;
            $ENTRIES = new asp(innerTypeDtoArr);
            CREATOR = new a();
        }

        private InnerTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static InnerTypeDto valueOf(String str) {
            return (InnerTypeDto) Enum.valueOf(InnerTypeDto.class, str);
        }

        public static InnerTypeDto[] values() {
            return (InnerTypeDto[]) $VALUES.clone();
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

    /* compiled from: WallWallpostDto.kt */
    public static final class a implements Parcelable.Creator<WallWallpostDto> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final WallWallpostDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Object obj;
            WallGeoDto wallGeoDto;
            NewsfeedNewsfeedItemHeaderDto createFromParcel;
            Boolean valueOf2;
            Boolean valueOf3;
            LikesItemReactionsDto likesItemReactionsDto;
            BadgesObjectInfoDto createFromParcel2;
            UserId userId;
            WallPosterDto createFromParcel3;
            WallPosterDto wallPosterDto;
            BadgesDonutInfoDto badgesDonutInfoDto;
            ArrayList arrayList4;
            InnerTypeDto innerTypeDto;
            BaseRepostsInfoDto baseRepostsInfoDto;
            WallViewsDto createFromParcel4;
            InnerTypeDto createFromParcel5 = InnerTypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
                arrayList = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
                arrayList = null;
            }
            String readString2 = parcel.readString();
            ArrayList arrayList5 = arrayList;
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = arrayList5;
            } else {
                int readInt = parcel.readInt();
                arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(WallWallpostDto.class, parcel, arrayList2, i, 1);
                }
            }
            WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto = (WallWallpostAttachmentsMetaDto) parcel.readParcelable(WallWallpostDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList3 = arrayList5;
            } else {
                int readInt2 = parcel.readInt();
                arrayList3 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(WallWallpostDto.class, parcel, arrayList3, i2, 1);
                }
            }
            Object valueOf4 = parcel.readInt() == 0 ? arrayList5 : Integer.valueOf(parcel.readInt());
            BadgesCommentInfoDto badgesCommentInfoDto = (BadgesCommentInfoDto) parcel.readParcelable(WallWallpostDto.class.getClassLoader());
            BadgesDonutInfoDto badgesDonutInfoDto2 = (BadgesDonutInfoDto) parcel.readParcelable(WallWallpostDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                obj = arrayList5;
            } else {
                obj = Boolean.valueOf(parcel.readInt() != 0);
            }
            BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) parcel.readParcelable(WallWallpostDto.class.getClassLoader());
            WallPostCopyrightDto createFromParcel6 = parcel.readInt() == 0 ? null : WallPostCopyrightDto.CREATOR.createFromParcel(parcel);
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Boolean bool = valueOf;
            UserId userId2 = (UserId) parcel.readParcelable(WallWallpostDto.class.getClassLoader());
            WallGeoDto wallGeoDto2 = (WallGeoDto) parcel.readParcelable(WallWallpostDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                wallGeoDto = wallGeoDto2;
                createFromParcel = null;
            } else {
                wallGeoDto = wallGeoDto2;
                createFromParcel = NewsfeedNewsfeedItemHeaderDto.CREATOR.createFromParcel(parcel);
            }
            NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = createFromParcel;
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BaseLikesInfoDto baseLikesInfoDto = (BaseLikesInfoDto) parcel.readParcelable(WallWallpostDto.class.getClassLoader());
            Integer num = valueOf5;
            Integer num2 = valueOf7;
            Boolean bool2 = valueOf3;
            String readString5 = parcel.readString();
            LikesItemReactionsDto likesItemReactionsDto2 = (LikesItemReactionsDto) parcel.readParcelable(WallWallpostDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                likesItemReactionsDto = likesItemReactionsDto2;
                createFromParcel2 = null;
            } else {
                likesItemReactionsDto = likesItemReactionsDto2;
                createFromParcel2 = BadgesObjectInfoDto.CREATOR.createFromParcel(parcel);
            }
            BadgesObjectInfoDto badgesObjectInfoDto = createFromParcel2;
            UserId userId3 = (UserId) parcel.readParcelable(WallWallpostDto.class.getClassLoader());
            UserId userId4 = (UserId) parcel.readParcelable(WallWallpostDto.class.getClassLoader());
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            UserId userId5 = (UserId) parcel.readParcelable(WallWallpostDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                userId = userId5;
                createFromParcel3 = null;
            } else {
                userId = userId5;
                createFromParcel3 = WallPosterDto.CREATOR.createFromParcel(parcel);
            }
            WallPosterDto wallPosterDto2 = createFromParcel3;
            Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                wallPosterDto = wallPosterDto2;
                badgesDonutInfoDto = badgesDonutInfoDto2;
                innerTypeDto = createFromParcel5;
                arrayList4 = null;
            } else {
                wallPosterDto = wallPosterDto2;
                int readInt3 = parcel.readInt();
                badgesDonutInfoDto = badgesDonutInfoDto2;
                arrayList4 = new ArrayList(readInt3);
                innerTypeDto = createFromParcel5;
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = pm0.b(parcel, arrayList4, i3, 1);
                    readInt3 = readInt3;
                }
            }
            WallPostSourceDto createFromParcel7 = parcel.readInt() == 0 ? null : WallPostSourceDto.CREATOR.createFromParcel(parcel);
            WallPostTypeDto createFromParcel8 = parcel.readInt() == 0 ? null : WallPostTypeDto.CREATOR.createFromParcel(parcel);
            BaseRepostsInfoDto baseRepostsInfoDto2 = (BaseRepostsInfoDto) parcel.readParcelable(WallWallpostDto.class.getClassLoader());
            UserId userId6 = (UserId) parcel.readParcelable(WallWallpostDto.class.getClassLoader());
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                baseRepostsInfoDto = baseRepostsInfoDto2;
                createFromParcel4 = null;
            } else {
                baseRepostsInfoDto = baseRepostsInfoDto2;
                createFromParcel4 = WallViewsDto.CREATOR.createFromParcel(parcel);
            }
            return new WallWallpostDto(innerTypeDto, readString, bool, readString2, readString3, readString4, arrayList2, wallWallpostAttachmentsMetaDto, arrayList3, valueOf4, badgesCommentInfoDto, badgesDonutInfoDto, obj, baseBoolIntDto, createFromParcel6, num, valueOf6, userId2, wallGeoDto, newsfeedNewsfeedItemHeaderDto, num2, valueOf2, bool2, baseLikesInfoDto, readString5, likesItemReactionsDto, badgesObjectInfoDto, userId3, userId4, valueOf8, userId, wallPosterDto, valueOf9, arrayList4, createFromParcel7, createFromParcel8, baseRepostsInfoDto, userId6, readString6, createFromParcel4, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : WallSharingDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final WallWallpostDto[] newArray(int i) {
            return new WallWallpostDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WallWallpostDto(InnerTypeDto innerTypeDto, String str, Boolean bool, String str2, String str3, String str4, List<WallWallpostAttachmentDto> list, WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto, List<? extends WallWallpostContentLayoutItemDto> list2, Integer num, BadgesCommentInfoDto badgesCommentInfoDto, BadgesDonutInfoDto badgesDonutInfoDto, Boolean bool2, BaseBoolIntDto baseBoolIntDto, WallPostCopyrightDto wallPostCopyrightDto, Integer num2, Integer num3, UserId userId, WallGeoDto wallGeoDto, NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto, Integer num4, Boolean bool3, Boolean bool4, BaseLikesInfoDto baseLikesInfoDto, String str5, LikesItemReactionsDto likesItemReactionsDto, BadgesObjectInfoDto badgesObjectInfoDto, UserId userId2, UserId userId3, Integer num5, UserId userId4, WallPosterDto wallPosterDto, Integer num6, List<Integer> list3, WallPostSourceDto wallPostSourceDto, WallPostTypeDto wallPostTypeDto, BaseRepostsInfoDto baseRepostsInfoDto, UserId userId5, String str6, WallViewsDto wallViewsDto, Integer num7, String str7, WallSharingDto wallSharingDto) {
        this.innerType = innerTypeDto;
        this.accessKey = str;
        this.isDeleted = bool;
        this.deletedReason = str2;
        this.deletedDetails = str3;
        this.donutMiniappUrl = str4;
        this.attachments = list;
        this.attachmentsMeta = wallWallpostAttachmentsMetaDto;
        this.contentLayout = list2;
        this.badgeId = num;
        this.badgeInfo = badgesCommentInfoDto;
        this.donutBadgeInfo = badgesDonutInfoDto;
        this.canArchive = bool2;
        this.canViewStats = baseBoolIntDto;
        this.copyright = wallPostCopyrightDto;
        this.date = num2;
        this.edited = num3;
        this.fromId = userId;
        this.geo = wallGeoDto;
        this.header = newsfeedNewsfeedItemHeaderDto;
        this.id = num4;
        this.isArchived = bool3;
        this.isFavorite = bool4;
        this.likes = baseLikesInfoDto;
        this.reactionSetId = str5;
        this.reactions = likesItemReactionsDto;
        this.badges = badgesObjectInfoDto;
        this.ownerId = userId2;
        this.replyOwnerId = userId3;
        this.replyPostId = num5;
        this.replyTo = userId4;
        this.poster = wallPosterDto;
        this.postId = num6;
        this.parentsStack = list3;
        this.postSource = wallPostSourceDto;
        this.postType = wallPostTypeDto;
        this.reposts = baseRepostsInfoDto;
        this.signerId = userId5;
        this.text = str6;
        this.views = wallViewsDto;
        this.replyCount = num7;
        this.trackCode = str7;
        this.sharing = wallSharingDto;
    }

    public final List<WallWallpostAttachmentDto> d() {
        return this.attachments;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallWallpostDto)) {
            return false;
        }
        WallWallpostDto wallWallpostDto = (WallWallpostDto) obj;
        return this.innerType == wallWallpostDto.innerType && epx.f(this.accessKey, wallWallpostDto.accessKey) && epx.f(this.isDeleted, wallWallpostDto.isDeleted) && epx.f(this.deletedReason, wallWallpostDto.deletedReason) && epx.f(this.deletedDetails, wallWallpostDto.deletedDetails) && epx.f(this.donutMiniappUrl, wallWallpostDto.donutMiniappUrl) && epx.f(this.attachments, wallWallpostDto.attachments) && epx.f(this.attachmentsMeta, wallWallpostDto.attachmentsMeta) && epx.f(this.contentLayout, wallWallpostDto.contentLayout) && epx.f(this.badgeId, wallWallpostDto.badgeId) && epx.f(this.badgeInfo, wallWallpostDto.badgeInfo) && epx.f(this.donutBadgeInfo, wallWallpostDto.donutBadgeInfo) && epx.f(this.canArchive, wallWallpostDto.canArchive) && this.canViewStats == wallWallpostDto.canViewStats && epx.f(this.copyright, wallWallpostDto.copyright) && epx.f(this.date, wallWallpostDto.date) && epx.f(this.edited, wallWallpostDto.edited) && epx.f(this.fromId, wallWallpostDto.fromId) && epx.f(this.geo, wallWallpostDto.geo) && epx.f(this.header, wallWallpostDto.header) && epx.f(this.id, wallWallpostDto.id) && epx.f(this.isArchived, wallWallpostDto.isArchived) && epx.f(this.isFavorite, wallWallpostDto.isFavorite) && epx.f(this.likes, wallWallpostDto.likes) && epx.f(this.reactionSetId, wallWallpostDto.reactionSetId) && epx.f(this.reactions, wallWallpostDto.reactions) && epx.f(this.badges, wallWallpostDto.badges) && epx.f(this.ownerId, wallWallpostDto.ownerId) && epx.f(this.replyOwnerId, wallWallpostDto.replyOwnerId) && epx.f(this.replyPostId, wallWallpostDto.replyPostId) && epx.f(this.replyTo, wallWallpostDto.replyTo) && epx.f(this.poster, wallWallpostDto.poster) && epx.f(this.postId, wallWallpostDto.postId) && epx.f(this.parentsStack, wallWallpostDto.parentsStack) && epx.f(this.postSource, wallWallpostDto.postSource) && this.postType == wallWallpostDto.postType && epx.f(this.reposts, wallWallpostDto.reposts) && epx.f(this.signerId, wallWallpostDto.signerId) && epx.f(this.text, wallWallpostDto.text) && epx.f(this.views, wallWallpostDto.views) && epx.f(this.replyCount, wallWallpostDto.replyCount) && epx.f(this.trackCode, wallWallpostDto.trackCode) && epx.f(this.sharing, wallWallpostDto.sharing);
    }

    public final String f() {
        return this.text;
    }

    public final int hashCode() {
        int hashCode = this.innerType.hashCode() * 31;
        String str = this.accessKey;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isDeleted;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.deletedReason;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deletedDetails;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.donutMiniappUrl;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<WallWallpostAttachmentDto> list = this.attachments;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto = this.attachmentsMeta;
        int hashCode8 = (hashCode7 + (wallWallpostAttachmentsMetaDto == null ? 0 : wallWallpostAttachmentsMetaDto.hashCode())) * 31;
        List<WallWallpostContentLayoutItemDto> list2 = this.contentLayout;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.badgeId;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        BadgesCommentInfoDto badgesCommentInfoDto = this.badgeInfo;
        int hashCode11 = (hashCode10 + (badgesCommentInfoDto == null ? 0 : badgesCommentInfoDto.hashCode())) * 31;
        BadgesDonutInfoDto badgesDonutInfoDto = this.donutBadgeInfo;
        int hashCode12 = (hashCode11 + (badgesDonutInfoDto == null ? 0 : badgesDonutInfoDto.hashCode())) * 31;
        Boolean bool2 = this.canArchive;
        int hashCode13 = (hashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.canViewStats;
        int hashCode14 = (hashCode13 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        WallPostCopyrightDto wallPostCopyrightDto = this.copyright;
        int hashCode15 = (hashCode14 + (wallPostCopyrightDto == null ? 0 : wallPostCopyrightDto.hashCode())) * 31;
        Integer num2 = this.date;
        int hashCode16 = (hashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.edited;
        int hashCode17 = (hashCode16 + (num3 == null ? 0 : num3.hashCode())) * 31;
        UserId userId = this.fromId;
        int hashCode18 = (hashCode17 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        WallGeoDto wallGeoDto = this.geo;
        int hashCode19 = (hashCode18 + (wallGeoDto == null ? 0 : wallGeoDto.hashCode())) * 31;
        NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = this.header;
        int hashCode20 = (hashCode19 + (newsfeedNewsfeedItemHeaderDto == null ? 0 : newsfeedNewsfeedItemHeaderDto.hashCode())) * 31;
        Integer num4 = this.id;
        int hashCode21 = (hashCode20 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool3 = this.isArchived;
        int hashCode22 = (hashCode21 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isFavorite;
        int hashCode23 = (hashCode22 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        BaseLikesInfoDto baseLikesInfoDto = this.likes;
        int hashCode24 = (hashCode23 + (baseLikesInfoDto == null ? 0 : baseLikesInfoDto.hashCode())) * 31;
        String str5 = this.reactionSetId;
        int hashCode25 = (hashCode24 + (str5 == null ? 0 : str5.hashCode())) * 31;
        LikesItemReactionsDto likesItemReactionsDto = this.reactions;
        int hashCode26 = (hashCode25 + (likesItemReactionsDto == null ? 0 : likesItemReactionsDto.hashCode())) * 31;
        BadgesObjectInfoDto badgesObjectInfoDto = this.badges;
        int hashCode27 = (hashCode26 + (badgesObjectInfoDto == null ? 0 : badgesObjectInfoDto.hashCode())) * 31;
        UserId userId2 = this.ownerId;
        int hashCode28 = (hashCode27 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        UserId userId3 = this.replyOwnerId;
        int hashCode29 = (hashCode28 + (userId3 == null ? 0 : Long.hashCode(userId3.b))) * 31;
        Integer num5 = this.replyPostId;
        int hashCode30 = (hashCode29 + (num5 == null ? 0 : num5.hashCode())) * 31;
        UserId userId4 = this.replyTo;
        int hashCode31 = (hashCode30 + (userId4 == null ? 0 : Long.hashCode(userId4.b))) * 31;
        WallPosterDto wallPosterDto = this.poster;
        int hashCode32 = (hashCode31 + (wallPosterDto == null ? 0 : wallPosterDto.hashCode())) * 31;
        Integer num6 = this.postId;
        int hashCode33 = (hashCode32 + (num6 == null ? 0 : num6.hashCode())) * 31;
        List<Integer> list3 = this.parentsStack;
        int hashCode34 = (hashCode33 + (list3 == null ? 0 : list3.hashCode())) * 31;
        WallPostSourceDto wallPostSourceDto = this.postSource;
        int hashCode35 = (hashCode34 + (wallPostSourceDto == null ? 0 : wallPostSourceDto.hashCode())) * 31;
        WallPostTypeDto wallPostTypeDto = this.postType;
        int hashCode36 = (hashCode35 + (wallPostTypeDto == null ? 0 : wallPostTypeDto.hashCode())) * 31;
        BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
        int hashCode37 = (hashCode36 + (baseRepostsInfoDto == null ? 0 : baseRepostsInfoDto.hashCode())) * 31;
        UserId userId5 = this.signerId;
        int hashCode38 = (hashCode37 + (userId5 == null ? 0 : Long.hashCode(userId5.b))) * 31;
        String str6 = this.text;
        int hashCode39 = (hashCode38 + (str6 == null ? 0 : str6.hashCode())) * 31;
        WallViewsDto wallViewsDto = this.views;
        int hashCode40 = (hashCode39 + (wallViewsDto == null ? 0 : wallViewsDto.hashCode())) * 31;
        Integer num7 = this.replyCount;
        int hashCode41 = (hashCode40 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str7 = this.trackCode;
        int hashCode42 = (hashCode41 + (str7 == null ? 0 : str7.hashCode())) * 31;
        WallSharingDto wallSharingDto = this.sharing;
        return hashCode42 + (wallSharingDto != null ? wallSharingDto.hashCode() : 0);
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        return "WallWallpostDto(innerType=" + this.innerType + ", accessKey=" + this.accessKey + ", isDeleted=" + this.isDeleted + ", deletedReason=" + this.deletedReason + ", deletedDetails=" + this.deletedDetails + ", donutMiniappUrl=" + this.donutMiniappUrl + ", attachments=" + this.attachments + ", attachmentsMeta=" + this.attachmentsMeta + ", contentLayout=" + this.contentLayout + ", badgeId=" + this.badgeId + ", badgeInfo=" + this.badgeInfo + ", donutBadgeInfo=" + this.donutBadgeInfo + ", canArchive=" + this.canArchive + ", canViewStats=" + this.canViewStats + ", copyright=" + this.copyright + ", date=" + this.date + ", edited=" + this.edited + ", fromId=" + this.fromId + ", geo=" + this.geo + ", header=" + this.header + ", id=" + this.id + ", isArchived=" + this.isArchived + ", isFavorite=" + this.isFavorite + ", likes=" + this.likes + ", reactionSetId=" + this.reactionSetId + ", reactions=" + this.reactions + ", badges=" + this.badges + ", ownerId=" + this.ownerId + ", replyOwnerId=" + this.replyOwnerId + ", replyPostId=" + this.replyPostId + ", replyTo=" + this.replyTo + ", poster=" + this.poster + ", postId=" + this.postId + ", parentsStack=" + this.parentsStack + ", postSource=" + this.postSource + ", postType=" + this.postType + ", reposts=" + this.reposts + ", signerId=" + this.signerId + ", text=" + this.text + ", views=" + this.views + ", replyCount=" + this.replyCount + ", trackCode=" + this.trackCode + ", sharing=" + this.sharing + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.innerType.writeToParcel(parcel, i);
        parcel.writeString(this.accessKey);
        Boolean bool = this.isDeleted;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.deletedReason);
        parcel.writeString(this.deletedDetails);
        parcel.writeString(this.donutMiniappUrl);
        List<WallWallpostAttachmentDto> list = this.attachments;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeParcelable(this.attachmentsMeta, i);
        List<WallWallpostContentLayoutItemDto> list2 = this.contentLayout;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        Integer num = this.badgeId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.badgeInfo, i);
        parcel.writeParcelable(this.donutBadgeInfo, i);
        Boolean bool2 = this.canArchive;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeParcelable(this.canViewStats, i);
        WallPostCopyrightDto wallPostCopyrightDto = this.copyright;
        if (wallPostCopyrightDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPostCopyrightDto.writeToParcel(parcel, i);
        }
        Integer num2 = this.date;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.edited;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeParcelable(this.fromId, i);
        parcel.writeParcelable(this.geo, i);
        NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = this.header;
        if (newsfeedNewsfeedItemHeaderDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedNewsfeedItemHeaderDto.writeToParcel(parcel, i);
        }
        Integer num4 = this.id;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Boolean bool3 = this.isArchived;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.isFavorite;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        parcel.writeParcelable(this.likes, i);
        parcel.writeString(this.reactionSetId);
        parcel.writeParcelable(this.reactions, i);
        BadgesObjectInfoDto badgesObjectInfoDto = this.badges;
        if (badgesObjectInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badgesObjectInfoDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeParcelable(this.replyOwnerId, i);
        Integer num5 = this.replyPostId;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        parcel.writeParcelable(this.replyTo, i);
        WallPosterDto wallPosterDto = this.poster;
        if (wallPosterDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPosterDto.writeToParcel(parcel, i);
        }
        Integer num6 = this.postId;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        List<Integer> list3 = this.parentsStack;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeInt(((Number) f3.next()).intValue());
            }
        }
        WallPostSourceDto wallPostSourceDto = this.postSource;
        if (wallPostSourceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPostSourceDto.writeToParcel(parcel, i);
        }
        WallPostTypeDto wallPostTypeDto = this.postType;
        if (wallPostTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPostTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.reposts, i);
        parcel.writeParcelable(this.signerId, i);
        parcel.writeString(this.text);
        WallViewsDto wallViewsDto = this.views;
        if (wallViewsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallViewsDto.writeToParcel(parcel, i);
        }
        Integer num7 = this.replyCount;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        parcel.writeString(this.trackCode);
        WallSharingDto wallSharingDto = this.sharing;
        if (wallSharingDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallSharingDto.writeToParcel(parcel, i);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ WallWallpostDto(com.vk.api.generated.wall.dto.WallWallpostDto.InnerTypeDto r40, java.lang.String r41, java.lang.Boolean r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.util.List r46, com.vk.api.generated.wall.dto.WallWallpostAttachmentsMetaDto r47, java.util.List r48, java.lang.Integer r49, com.vk.api.generated.badges.dto.BadgesCommentInfoDto r50, com.vk.api.generated.badges.dto.BadgesDonutInfoDto r51, java.lang.Boolean r52, com.vk.api.generated.base.dto.BaseBoolIntDto r53, com.vk.api.generated.wall.dto.WallPostCopyrightDto r54, java.lang.Integer r55, java.lang.Integer r56, com.vk.dto.common.id.UserId r57, com.vk.api.generated.wall.dto.WallGeoDto r58, com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderDto r59, java.lang.Integer r60, java.lang.Boolean r61, java.lang.Boolean r62, com.vk.api.generated.base.dto.BaseLikesInfoDto r63, java.lang.String r64, com.vk.api.generated.likes.dto.LikesItemReactionsDto r65, com.vk.api.generated.badges.dto.BadgesObjectInfoDto r66, com.vk.dto.common.id.UserId r67, com.vk.dto.common.id.UserId r68, java.lang.Integer r69, com.vk.dto.common.id.UserId r70, com.vk.api.generated.wall.dto.WallPosterDto r71, java.lang.Integer r72, java.util.List r73, com.vk.api.generated.wall.dto.WallPostSourceDto r74, com.vk.api.generated.wall.dto.WallPostTypeDto r75, com.vk.api.generated.base.dto.BaseRepostsInfoDto r76, com.vk.dto.common.id.UserId r77, java.lang.String r78, com.vk.api.generated.wall.dto.WallViewsDto r79, java.lang.Integer r80, java.lang.String r81, com.vk.api.generated.wall.dto.WallSharingDto r82, int r83, int r84, xsna.zcl r85) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.api.generated.wall.dto.WallWallpostDto.<init>(com.vk.api.generated.wall.dto.WallWallpostDto$InnerTypeDto, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.vk.api.generated.wall.dto.WallWallpostAttachmentsMetaDto, java.util.List, java.lang.Integer, com.vk.api.generated.badges.dto.BadgesCommentInfoDto, com.vk.api.generated.badges.dto.BadgesDonutInfoDto, java.lang.Boolean, com.vk.api.generated.base.dto.BaseBoolIntDto, com.vk.api.generated.wall.dto.WallPostCopyrightDto, java.lang.Integer, java.lang.Integer, com.vk.dto.common.id.UserId, com.vk.api.generated.wall.dto.WallGeoDto, com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderDto, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, com.vk.api.generated.base.dto.BaseLikesInfoDto, java.lang.String, com.vk.api.generated.likes.dto.LikesItemReactionsDto, com.vk.api.generated.badges.dto.BadgesObjectInfoDto, com.vk.dto.common.id.UserId, com.vk.dto.common.id.UserId, java.lang.Integer, com.vk.dto.common.id.UserId, com.vk.api.generated.wall.dto.WallPosterDto, java.lang.Integer, java.util.List, com.vk.api.generated.wall.dto.WallPostSourceDto, com.vk.api.generated.wall.dto.WallPostTypeDto, com.vk.api.generated.base.dto.BaseRepostsInfoDto, com.vk.dto.common.id.UserId, java.lang.String, com.vk.api.generated.wall.dto.WallViewsDto, java.lang.Integer, java.lang.String, com.vk.api.generated.wall.dto.WallSharingDto, int, int, xsna.zcl):void");
    }
}
