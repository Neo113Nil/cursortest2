package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.badges.dto.BadgesCommentInfoDto;
import com.vk.api.generated.badges.dto.BadgesDonutInfoDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseLikesInfoDto;
import com.vk.api.generated.comment.dto.CommentThreadDto;
import com.vk.api.generated.likes.dto.LikesItemReactionsDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bh10;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: WallWallCommentDto.kt */
/* loaded from: classes15.dex */
public final class WallWallCommentDto implements Parcelable {
    public static final Parcelable.Creator<WallWallCommentDto> CREATOR = new a();

    @pmi0("attachments")
    private final List<WallWallpostAttachmentDto> attachments;

    @pmi0("attachments_meta")
    private final WallWallpostAttachmentsMetaDto attachmentsMeta;

    @pmi0("attachments_placeholder")
    private final String attachmentsPlaceholder;

    @pmi0("badge_id")
    private final Integer badgeId;

    @pmi0("badge_info")
    private final BadgesCommentInfoDto badgeInfo;

    @pmi0("can_delete")
    private final BaseBoolIntDto canDelete;

    @pmi0("can_edit")
    private final BaseBoolIntDto canEdit;

    @pmi0("content_layout")
    private final List<WallWallpostContentLayoutItemDto> contentLayout;

    @pmi0("date")
    private final int date;

    @pmi0("deleted")
    private final Boolean deleted;

    @pmi0("donut")
    private final WallWallCommentDonutDto donut;

    @pmi0("donut_badge_info")
    private final BadgesDonutInfoDto donutBadgeInfo;

    @pmi0("from_id")
    private final UserId fromId;

    @pmi0("id")
    private final int id;

    @pmi0("is_blacklisted")
    private final Boolean isBlacklisted;

    @pmi0("is_from_post_author")
    private final Boolean isFromPostAuthor;

    @pmi0("is_negative")
    private final Boolean isNegative;

    @pmi0("is_pinned")
    private final Boolean isPinned;

    @pmi0("likes")
    private final BaseLikesInfoDto likes;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("parents_stack")
    private final List<Integer> parentsStack;

    @pmi0("photo_id")
    private final Integer photoId;

    @pmi0("pid")
    private final Integer pid;

    @pmi0("post_id")
    private final Integer postId;

    @pmi0("reactions")
    private final LikesItemReactionsDto reactions;

    @pmi0("real_offset")
    private final Integer realOffset;

    @pmi0("reply_to_comment")
    private final Integer replyToComment;

    @pmi0("reply_to_user")
    private final UserId replyToUser;

    @pmi0("text")
    private final String text;

    @pmi0("thread")
    private final CommentThreadDto thread;

    @pmi0("video_id")
    private final Integer videoId;

    /* compiled from: WallWallCommentDto.kt */
    public static final class a implements Parcelable.Creator<WallWallCommentDto> {
        @Override // android.os.Parcelable.Creator
        public final WallWallCommentDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i;
            ArrayList arrayList2;
            ArrayList arrayList3;
            WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto;
            Boolean valueOf;
            Boolean valueOf2;
            WallWallCommentDonutDto wallWallCommentDonutDto;
            BadgesCommentInfoDto createFromParcel;
            BadgesCommentInfoDto badgesCommentInfoDto;
            BadgesDonutInfoDto createFromParcel2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            int readInt = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(WallWallCommentDto.class.getClassLoader());
            int readInt2 = parcel.readInt();
            String readString = parcel.readString();
            BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) parcel.readParcelable(WallWallCommentDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto2 = (BaseBoolIntDto) parcel.readParcelable(WallWallCommentDto.class.getClassLoader());
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            UserId userId2 = (UserId) parcel.readParcelable(WallWallCommentDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i2 = 0;
                while (i2 != readInt3) {
                    i2 = pm0.b(parcel, arrayList, i2, 1);
                }
            }
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            LikesItemReactionsDto createFromParcel3 = parcel.readInt() == 0 ? null : LikesItemReactionsDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                i = readInt;
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt4);
                i = readInt;
                int i3 = 0;
                while (i3 != readInt4) {
                    i3 = en.a(WallWallpostAttachmentDto.CREATOR, parcel, arrayList4, i3, 1);
                    userId = userId;
                    readInt2 = readInt2;
                }
                arrayList2 = arrayList4;
            }
            UserId userId3 = userId;
            int i4 = readInt2;
            ArrayList arrayList5 = arrayList;
            String readString2 = parcel.readString();
            WallWallpostAttachmentsMetaDto createFromParcel4 = parcel.readInt() == 0 ? null : WallWallpostAttachmentsMetaDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                wallWallpostAttachmentsMetaDto = createFromParcel4;
                arrayList3 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList3 = new ArrayList(readInt5);
                wallWallpostAttachmentsMetaDto = createFromParcel4;
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = en.a(WallWallpostContentLayoutItemDto.CREATOR, parcel, arrayList3, i5, 1);
                    readInt5 = readInt5;
                    readString = readString;
                }
            }
            String str = readString;
            WallWallCommentDonutDto createFromParcel5 = parcel.readInt() == 0 ? null : WallWallCommentDonutDto.CREATOR.createFromParcel(parcel);
            BaseLikesInfoDto createFromParcel6 = parcel.readInt() == 0 ? null : BaseLikesInfoDto.CREATOR.createFromParcel(parcel);
            Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            UserId userId4 = (UserId) parcel.readParcelable(WallWallCommentDto.class.getClassLoader());
            Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            CommentThreadDto createFromParcel7 = parcel.readInt() == 0 ? null : CommentThreadDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf11 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf12 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                wallWallCommentDonutDto = createFromParcel5;
                createFromParcel = null;
            } else {
                wallWallCommentDonutDto = createFromParcel5;
                createFromParcel = BadgesCommentInfoDto.CREATOR.createFromParcel(parcel);
            }
            BadgesCommentInfoDto badgesCommentInfoDto2 = createFromParcel;
            if (parcel.readInt() == 0) {
                badgesCommentInfoDto = badgesCommentInfoDto2;
                createFromParcel2 = null;
            } else {
                badgesCommentInfoDto = badgesCommentInfoDto2;
                createFromParcel2 = BadgesDonutInfoDto.CREATOR.createFromParcel(parcel);
            }
            BadgesDonutInfoDto badgesDonutInfoDto = createFromParcel2;
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new WallWallCommentDto(i, userId3, i4, str, baseBoolIntDto, baseBoolIntDto2, valueOf6, userId2, arrayList5, valueOf7, valueOf8, createFromParcel3, arrayList2, readString2, wallWallpostAttachmentsMetaDto, arrayList3, wallWallCommentDonutDto, createFromParcel6, valueOf9, userId4, valueOf10, createFromParcel7, valueOf, valueOf2, valueOf11, valueOf12, badgesCommentInfoDto, badgesDonutInfoDto, valueOf3, valueOf4, valueOf5);
        }

        @Override // android.os.Parcelable.Creator
        public final WallWallCommentDto[] newArray(int i) {
            return new WallWallCommentDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WallWallCommentDto(int i, UserId userId, int i2, String str, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, Integer num, UserId userId2, List<Integer> list, Integer num2, Integer num3, LikesItemReactionsDto likesItemReactionsDto, List<WallWallpostAttachmentDto> list2, String str2, WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto, List<? extends WallWallpostContentLayoutItemDto> list3, WallWallCommentDonutDto wallWallCommentDonutDto, BaseLikesInfoDto baseLikesInfoDto, Integer num4, UserId userId3, Integer num5, CommentThreadDto commentThreadDto, Boolean bool, Boolean bool2, Integer num6, Integer num7, BadgesCommentInfoDto badgesCommentInfoDto, BadgesDonutInfoDto badgesDonutInfoDto, Boolean bool3, Boolean bool4, Boolean bool5) {
        this.id = i;
        this.fromId = userId;
        this.date = i2;
        this.text = str;
        this.canEdit = baseBoolIntDto;
        this.canDelete = baseBoolIntDto2;
        this.postId = num;
        this.ownerId = userId2;
        this.parentsStack = list;
        this.photoId = num2;
        this.videoId = num3;
        this.reactions = likesItemReactionsDto;
        this.attachments = list2;
        this.attachmentsPlaceholder = str2;
        this.attachmentsMeta = wallWallpostAttachmentsMetaDto;
        this.contentLayout = list3;
        this.donut = wallWallCommentDonutDto;
        this.likes = baseLikesInfoDto;
        this.realOffset = num4;
        this.replyToUser = userId3;
        this.replyToComment = num5;
        this.thread = commentThreadDto;
        this.isFromPostAuthor = bool;
        this.deleted = bool2;
        this.pid = num6;
        this.badgeId = num7;
        this.badgeInfo = badgesCommentInfoDto;
        this.donutBadgeInfo = badgesDonutInfoDto;
        this.isNegative = bool3;
        this.isBlacklisted = bool4;
        this.isPinned = bool5;
    }

    public final UserId B() {
        return this.replyToUser;
    }

    public final String C() {
        return this.text;
    }

    public final CommentThreadDto D() {
        return this.thread;
    }

    public final Boolean F() {
        return this.isFromPostAuthor;
    }

    public final Boolean Q() {
        return this.isPinned;
    }

    public final List<WallWallpostAttachmentDto> d() {
        return this.attachments;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseBoolIntDto e() {
        return this.canDelete;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallWallCommentDto)) {
            return false;
        }
        WallWallCommentDto wallWallCommentDto = (WallWallCommentDto) obj;
        return this.id == wallWallCommentDto.id && epx.f(this.fromId, wallWallCommentDto.fromId) && this.date == wallWallCommentDto.date && epx.f(this.text, wallWallCommentDto.text) && this.canEdit == wallWallCommentDto.canEdit && this.canDelete == wallWallCommentDto.canDelete && epx.f(this.postId, wallWallCommentDto.postId) && epx.f(this.ownerId, wallWallCommentDto.ownerId) && epx.f(this.parentsStack, wallWallCommentDto.parentsStack) && epx.f(this.photoId, wallWallCommentDto.photoId) && epx.f(this.videoId, wallWallCommentDto.videoId) && epx.f(this.reactions, wallWallCommentDto.reactions) && epx.f(this.attachments, wallWallCommentDto.attachments) && epx.f(this.attachmentsPlaceholder, wallWallCommentDto.attachmentsPlaceholder) && epx.f(this.attachmentsMeta, wallWallCommentDto.attachmentsMeta) && epx.f(this.contentLayout, wallWallCommentDto.contentLayout) && epx.f(this.donut, wallWallCommentDto.donut) && epx.f(this.likes, wallWallCommentDto.likes) && epx.f(this.realOffset, wallWallCommentDto.realOffset) && epx.f(this.replyToUser, wallWallCommentDto.replyToUser) && epx.f(this.replyToComment, wallWallCommentDto.replyToComment) && epx.f(this.thread, wallWallCommentDto.thread) && epx.f(this.isFromPostAuthor, wallWallCommentDto.isFromPostAuthor) && epx.f(this.deleted, wallWallCommentDto.deleted) && epx.f(this.pid, wallWallCommentDto.pid) && epx.f(this.badgeId, wallWallCommentDto.badgeId) && epx.f(this.badgeInfo, wallWallCommentDto.badgeInfo) && epx.f(this.donutBadgeInfo, wallWallCommentDto.donutBadgeInfo) && epx.f(this.isNegative, wallWallCommentDto.isNegative) && epx.f(this.isBlacklisted, wallWallCommentDto.isBlacklisted) && epx.f(this.isPinned, wallWallCommentDto.isPinned);
    }

    public final BaseBoolIntDto f() {
        return this.canEdit;
    }

    public final int g() {
        return this.date;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.date, bh10.a(Integer.hashCode(this.id) * 31, 31, this.fromId.b), 31), 31, this.text);
        BaseBoolIntDto baseBoolIntDto = this.canEdit;
        int hashCode = (a2 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.canDelete;
        int hashCode2 = (hashCode + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        Integer num = this.postId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        UserId userId = this.ownerId;
        int hashCode4 = (hashCode3 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        List<Integer> list = this.parentsStack;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.photoId;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.videoId;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        LikesItemReactionsDto likesItemReactionsDto = this.reactions;
        int hashCode8 = (hashCode7 + (likesItemReactionsDto == null ? 0 : likesItemReactionsDto.hashCode())) * 31;
        List<WallWallpostAttachmentDto> list2 = this.attachments;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.attachmentsPlaceholder;
        int hashCode10 = (hashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto = this.attachmentsMeta;
        int hashCode11 = (hashCode10 + (wallWallpostAttachmentsMetaDto == null ? 0 : wallWallpostAttachmentsMetaDto.hashCode())) * 31;
        List<WallWallpostContentLayoutItemDto> list3 = this.contentLayout;
        int hashCode12 = (hashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        WallWallCommentDonutDto wallWallCommentDonutDto = this.donut;
        int hashCode13 = (hashCode12 + (wallWallCommentDonutDto == null ? 0 : wallWallCommentDonutDto.hashCode())) * 31;
        BaseLikesInfoDto baseLikesInfoDto = this.likes;
        int hashCode14 = (hashCode13 + (baseLikesInfoDto == null ? 0 : baseLikesInfoDto.hashCode())) * 31;
        Integer num4 = this.realOffset;
        int hashCode15 = (hashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
        UserId userId2 = this.replyToUser;
        int hashCode16 = (hashCode15 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        Integer num5 = this.replyToComment;
        int hashCode17 = (hashCode16 + (num5 == null ? 0 : num5.hashCode())) * 31;
        CommentThreadDto commentThreadDto = this.thread;
        int hashCode18 = (hashCode17 + (commentThreadDto == null ? 0 : commentThreadDto.hashCode())) * 31;
        Boolean bool = this.isFromPostAuthor;
        int hashCode19 = (hashCode18 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.deleted;
        int hashCode20 = (hashCode19 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num6 = this.pid;
        int hashCode21 = (hashCode20 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.badgeId;
        int hashCode22 = (hashCode21 + (num7 == null ? 0 : num7.hashCode())) * 31;
        BadgesCommentInfoDto badgesCommentInfoDto = this.badgeInfo;
        int hashCode23 = (hashCode22 + (badgesCommentInfoDto == null ? 0 : badgesCommentInfoDto.hashCode())) * 31;
        BadgesDonutInfoDto badgesDonutInfoDto = this.donutBadgeInfo;
        int hashCode24 = (hashCode23 + (badgesDonutInfoDto == null ? 0 : badgesDonutInfoDto.hashCode())) * 31;
        Boolean bool3 = this.isNegative;
        int hashCode25 = (hashCode24 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isBlacklisted;
        int hashCode26 = (hashCode25 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isPinned;
        return hashCode26 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final Boolean i() {
        return this.deleted;
    }

    public final WallWallCommentDonutDto j() {
        return this.donut;
    }

    public final UserId k() {
        return this.fromId;
    }

    public final BaseLikesInfoDto l() {
        return this.likes;
    }

    public final List<Integer> n() {
        return this.parentsStack;
    }

    public final LikesItemReactionsDto o() {
        return this.reactions;
    }

    public final Integer p() {
        return this.realOffset;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallWallCommentDto(id=");
        sb.append(this.id);
        sb.append(", fromId=");
        sb.append(this.fromId);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", canEdit=");
        sb.append(this.canEdit);
        sb.append(", canDelete=");
        sb.append(this.canDelete);
        sb.append(", postId=");
        sb.append(this.postId);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", parentsStack=");
        sb.append(this.parentsStack);
        sb.append(", photoId=");
        sb.append(this.photoId);
        sb.append(", videoId=");
        sb.append(this.videoId);
        sb.append(", reactions=");
        sb.append(this.reactions);
        sb.append(", attachments=");
        sb.append(this.attachments);
        sb.append(", attachmentsPlaceholder=");
        sb.append(this.attachmentsPlaceholder);
        sb.append(", attachmentsMeta=");
        sb.append(this.attachmentsMeta);
        sb.append(", contentLayout=");
        sb.append(this.contentLayout);
        sb.append(", donut=");
        sb.append(this.donut);
        sb.append(", likes=");
        sb.append(this.likes);
        sb.append(", realOffset=");
        sb.append(this.realOffset);
        sb.append(", replyToUser=");
        sb.append(this.replyToUser);
        sb.append(", replyToComment=");
        sb.append(this.replyToComment);
        sb.append(", thread=");
        sb.append(this.thread);
        sb.append(", isFromPostAuthor=");
        sb.append(this.isFromPostAuthor);
        sb.append(", deleted=");
        sb.append(this.deleted);
        sb.append(", pid=");
        sb.append(this.pid);
        sb.append(", badgeId=");
        sb.append(this.badgeId);
        sb.append(", badgeInfo=");
        sb.append(this.badgeInfo);
        sb.append(", donutBadgeInfo=");
        sb.append(this.donutBadgeInfo);
        sb.append(", isNegative=");
        sb.append(this.isNegative);
        sb.append(", isBlacklisted=");
        sb.append(this.isBlacklisted);
        sb.append(", isPinned=");
        return tn.a(sb, this.isPinned, ')');
    }

    public final Integer u() {
        return this.replyToComment;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.fromId, i);
        parcel.writeInt(this.date);
        parcel.writeString(this.text);
        parcel.writeParcelable(this.canEdit, i);
        parcel.writeParcelable(this.canDelete, i);
        Integer num = this.postId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.ownerId, i);
        List<Integer> list = this.parentsStack;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        Integer num2 = this.photoId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.videoId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        LikesItemReactionsDto likesItemReactionsDto = this.reactions;
        if (likesItemReactionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            likesItemReactionsDto.writeToParcel(parcel, i);
        }
        List<WallWallpostAttachmentDto> list2 = this.attachments;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((WallWallpostAttachmentDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.attachmentsPlaceholder);
        WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto = this.attachmentsMeta;
        if (wallWallpostAttachmentsMetaDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallWallpostAttachmentsMetaDto.writeToParcel(parcel, i);
        }
        List<WallWallpostContentLayoutItemDto> list3 = this.contentLayout;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((WallWallpostContentLayoutItemDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        WallWallCommentDonutDto wallWallCommentDonutDto = this.donut;
        if (wallWallCommentDonutDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallWallCommentDonutDto.writeToParcel(parcel, i);
        }
        BaseLikesInfoDto baseLikesInfoDto = this.likes;
        if (baseLikesInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLikesInfoDto.writeToParcel(parcel, i);
        }
        Integer num4 = this.realOffset;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        parcel.writeParcelable(this.replyToUser, i);
        Integer num5 = this.replyToComment;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        CommentThreadDto commentThreadDto = this.thread;
        if (commentThreadDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commentThreadDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isFromPostAuthor;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.deleted;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Integer num6 = this.pid;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        Integer num7 = this.badgeId;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        BadgesCommentInfoDto badgesCommentInfoDto = this.badgeInfo;
        if (badgesCommentInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badgesCommentInfoDto.writeToParcel(parcel, i);
        }
        BadgesDonutInfoDto badgesDonutInfoDto = this.donutBadgeInfo;
        if (badgesDonutInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badgesDonutInfoDto.writeToParcel(parcel, i);
        }
        Boolean bool3 = this.isNegative;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.isBlacklisted;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.isPinned;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
    }

    public /* synthetic */ WallWallCommentDto(int i, UserId userId, int i2, String str, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, Integer num, UserId userId2, List list, Integer num2, Integer num3, LikesItemReactionsDto likesItemReactionsDto, List list2, String str2, WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto, List list3, WallWallCommentDonutDto wallWallCommentDonutDto, BaseLikesInfoDto baseLikesInfoDto, Integer num4, UserId userId3, Integer num5, CommentThreadDto commentThreadDto, Boolean bool, Boolean bool2, Integer num6, Integer num7, BadgesCommentInfoDto badgesCommentInfoDto, BadgesDonutInfoDto badgesDonutInfoDto, Boolean bool3, Boolean bool4, Boolean bool5, int i3, zcl zclVar) {
        this(i, userId, i2, str, (i3 & 16) != 0 ? null : baseBoolIntDto, (i3 & 32) != 0 ? null : baseBoolIntDto2, (i3 & 64) != 0 ? null : num, (i3 & 128) != 0 ? null : userId2, (i3 & 256) != 0 ? null : list, (i3 & 512) != 0 ? null : num2, (i3 & 1024) != 0 ? null : num3, (i3 & 2048) != 0 ? null : likesItemReactionsDto, (i3 & 4096) != 0 ? null : list2, (i3 & 8192) != 0 ? null : str2, (i3 & 16384) != 0 ? null : wallWallpostAttachmentsMetaDto, (32768 & i3) != 0 ? null : list3, (65536 & i3) != 0 ? null : wallWallCommentDonutDto, (131072 & i3) != 0 ? null : baseLikesInfoDto, (262144 & i3) != 0 ? null : num4, (524288 & i3) != 0 ? null : userId3, (1048576 & i3) != 0 ? null : num5, (2097152 & i3) != 0 ? null : commentThreadDto, (4194304 & i3) != 0 ? null : bool, (8388608 & i3) != 0 ? null : bool2, (16777216 & i3) != 0 ? null : num6, (33554432 & i3) != 0 ? null : num7, (67108864 & i3) != 0 ? null : badgesCommentInfoDto, (134217728 & i3) != 0 ? null : badgesDonutInfoDto, (268435456 & i3) != 0 ? null : bool3, (536870912 & i3) != 0 ? null : bool4, (i3 & 1073741824) != 0 ? null : bool5);
    }
}
