package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.badges.dto.BadgesCommentInfoDto;
import com.vk.api.generated.badges.dto.BadgesDonutInfoDto;
import com.vk.api.generated.base.dto.BaseLikesInfoDto;
import com.vk.api.generated.likes.dto.LikesItemReactionsDto;
import com.vk.api.generated.wall.dto.WallWallCommentDonutDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentsMetaDto;
import com.vk.api.generated.wall.dto.WallWallpostContentLayoutItemDto;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ChannelsMessageCommentDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsMessageCommentDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsMessageCommentDto> CREATOR = new a();

    @pmi0("attachments")
    private final List<WallWallpostAttachmentDto> attachments;

    @pmi0("attachments_meta")
    private final WallWallpostAttachmentsMetaDto attachmentsMeta;

    @pmi0("badge_id")
    private final Integer badgeId;

    @pmi0("badge_info")
    private final BadgesCommentInfoDto badgeInfo;

    @pmi0("can_delete")
    private final Boolean canDelete;

    @pmi0("can_edit")
    private final Boolean canEdit;

    @pmi0("channel_id")
    private final UserId channelId;

    @pmi0("channel_type")
    private final ChannelsChannelTypeDto channelType;

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

    @pmi0("is_from_post_author")
    private final Boolean isFromPostAuthor;

    @pmi0("is_negative")
    private final Boolean isNegative;

    @pmi0("likes")
    private final BaseLikesInfoDto likes;

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
    private final ChannelsCommentThreadDto thread;

    @pmi0("update_time")
    private final Integer updateTime;

    @pmi0("video_id")
    private final Integer videoId;

    /* compiled from: ChannelsMessageCommentDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsMessageCommentDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsMessageCommentDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            ArrayList arrayList;
            int i;
            ArrayList arrayList2;
            UserId userId;
            int i2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto;
            WallWallCommentDonutDto wallWallCommentDonutDto;
            ChannelsCommentThreadDto createFromParcel;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            int readInt = parcel.readInt();
            UserId userId2 = (UserId) parcel.readParcelable(ChannelsMessageCommentDto.class.getClassLoader());
            UserId userId3 = (UserId) parcel.readParcelable(ChannelsMessageCommentDto.class.getClassLoader());
            int readInt2 = parcel.readInt();
            String readString = parcel.readString();
            ChannelsChannelTypeDto channelsChannelTypeDto = (ChannelsChannelTypeDto) parcel.readParcelable(ChannelsMessageCommentDto.class.getClassLoader());
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
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = pm0.b(parcel, arrayList, i3, 1);
                }
            }
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            LikesItemReactionsDto likesItemReactionsDto = (LikesItemReactionsDto) parcel.readParcelable(ChannelsMessageCommentDto.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                i = readInt;
                arrayList2 = new ArrayList(readInt4);
                userId = userId3;
                int i4 = 0;
                while (true) {
                    i2 = readInt2;
                    if (i4 == readInt4) {
                        break;
                    }
                    i4 = bo.b(ChannelsMessageCommentDto.class, parcel, arrayList2, i4, 1);
                    readInt2 = i2;
                }
            } else {
                i = readInt;
                userId = userId3;
                arrayList2 = null;
                i2 = readInt2;
            }
            WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto2 = (WallWallpostAttachmentsMetaDto) parcel.readParcelable(ChannelsMessageCommentDto.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                arrayList3 = new ArrayList(readInt5);
                arrayList4 = arrayList2;
                int i5 = 0;
                while (true) {
                    wallWallpostAttachmentsMetaDto = wallWallpostAttachmentsMetaDto2;
                    if (i5 == readInt5) {
                        break;
                    }
                    i5 = bo.b(ChannelsMessageCommentDto.class, parcel, arrayList3, i5, 1);
                    wallWallpostAttachmentsMetaDto2 = wallWallpostAttachmentsMetaDto;
                }
            } else {
                arrayList4 = arrayList2;
                arrayList3 = null;
                wallWallpostAttachmentsMetaDto = wallWallpostAttachmentsMetaDto2;
            }
            WallWallCommentDonutDto wallWallCommentDonutDto2 = (WallWallCommentDonutDto) parcel.readParcelable(ChannelsMessageCommentDto.class.getClassLoader());
            BaseLikesInfoDto baseLikesInfoDto = (BaseLikesInfoDto) parcel.readParcelable(ChannelsMessageCommentDto.class.getClassLoader());
            Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            UserId userId4 = (UserId) parcel.readParcelable(ChannelsMessageCommentDto.class.getClassLoader());
            Integer valueOf11 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                wallWallCommentDonutDto = wallWallCommentDonutDto2;
                createFromParcel = null;
            } else {
                wallWallCommentDonutDto = wallWallCommentDonutDto2;
                createFromParcel = ChannelsCommentThreadDto.CREATOR.createFromParcel(parcel);
            }
            ChannelsCommentThreadDto channelsCommentThreadDto = createFromParcel;
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
            Integer valueOf12 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf13 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BadgesCommentInfoDto badgesCommentInfoDto = (BadgesCommentInfoDto) parcel.readParcelable(ChannelsMessageCommentDto.class.getClassLoader());
            BadgesDonutInfoDto badgesDonutInfoDto = (BadgesDonutInfoDto) parcel.readParcelable(ChannelsMessageCommentDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer num = valueOf7;
            return new ChannelsMessageCommentDto(i, userId2, userId, i2, readString, channelsChannelTypeDto, valueOf, valueOf2, valueOf6, arrayList, num, valueOf8, valueOf9, likesItemReactionsDto, arrayList4, wallWallpostAttachmentsMetaDto, arrayList3, wallWallCommentDonutDto, baseLikesInfoDto, valueOf10, userId4, valueOf11, channelsCommentThreadDto, valueOf3, valueOf4, valueOf12, valueOf13, badgesCommentInfoDto, badgesDonutInfoDto, valueOf5);
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsMessageCommentDto[] newArray(int i) {
            return new ChannelsMessageCommentDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsMessageCommentDto(int i, UserId userId, UserId userId2, int i2, String str, ChannelsChannelTypeDto channelsChannelTypeDto, Boolean bool, Boolean bool2, Integer num, List<Integer> list, Integer num2, Integer num3, Integer num4, LikesItemReactionsDto likesItemReactionsDto, List<WallWallpostAttachmentDto> list2, WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto, List<? extends WallWallpostContentLayoutItemDto> list3, WallWallCommentDonutDto wallWallCommentDonutDto, BaseLikesInfoDto baseLikesInfoDto, Integer num5, UserId userId3, Integer num6, ChannelsCommentThreadDto channelsCommentThreadDto, Boolean bool3, Boolean bool4, Integer num7, Integer num8, BadgesCommentInfoDto badgesCommentInfoDto, BadgesDonutInfoDto badgesDonutInfoDto, Boolean bool5) {
        this.id = i;
        this.channelId = userId;
        this.fromId = userId2;
        this.date = i2;
        this.text = str;
        this.channelType = channelsChannelTypeDto;
        this.canEdit = bool;
        this.canDelete = bool2;
        this.postId = num;
        this.parentsStack = list;
        this.photoId = num2;
        this.videoId = num3;
        this.updateTime = num4;
        this.reactions = likesItemReactionsDto;
        this.attachments = list2;
        this.attachmentsMeta = wallWallpostAttachmentsMetaDto;
        this.contentLayout = list3;
        this.donut = wallWallCommentDonutDto;
        this.likes = baseLikesInfoDto;
        this.realOffset = num5;
        this.replyToUser = userId3;
        this.replyToComment = num6;
        this.thread = channelsCommentThreadDto;
        this.isFromPostAuthor = bool3;
        this.deleted = bool4;
        this.pid = num7;
        this.badgeId = num8;
        this.badgeInfo = badgesCommentInfoDto;
        this.donutBadgeInfo = badgesDonutInfoDto;
        this.isNegative = bool5;
    }

    public final List<WallWallpostAttachmentDto> d() {
        return this.attachments;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.canDelete;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsMessageCommentDto)) {
            return false;
        }
        ChannelsMessageCommentDto channelsMessageCommentDto = (ChannelsMessageCommentDto) obj;
        return this.id == channelsMessageCommentDto.id && epx.f(this.channelId, channelsMessageCommentDto.channelId) && epx.f(this.fromId, channelsMessageCommentDto.fromId) && this.date == channelsMessageCommentDto.date && epx.f(this.text, channelsMessageCommentDto.text) && this.channelType == channelsMessageCommentDto.channelType && epx.f(this.canEdit, channelsMessageCommentDto.canEdit) && epx.f(this.canDelete, channelsMessageCommentDto.canDelete) && epx.f(this.postId, channelsMessageCommentDto.postId) && epx.f(this.parentsStack, channelsMessageCommentDto.parentsStack) && epx.f(this.photoId, channelsMessageCommentDto.photoId) && epx.f(this.videoId, channelsMessageCommentDto.videoId) && epx.f(this.updateTime, channelsMessageCommentDto.updateTime) && epx.f(this.reactions, channelsMessageCommentDto.reactions) && epx.f(this.attachments, channelsMessageCommentDto.attachments) && epx.f(this.attachmentsMeta, channelsMessageCommentDto.attachmentsMeta) && epx.f(this.contentLayout, channelsMessageCommentDto.contentLayout) && epx.f(this.donut, channelsMessageCommentDto.donut) && epx.f(this.likes, channelsMessageCommentDto.likes) && epx.f(this.realOffset, channelsMessageCommentDto.realOffset) && epx.f(this.replyToUser, channelsMessageCommentDto.replyToUser) && epx.f(this.replyToComment, channelsMessageCommentDto.replyToComment) && epx.f(this.thread, channelsMessageCommentDto.thread) && epx.f(this.isFromPostAuthor, channelsMessageCommentDto.isFromPostAuthor) && epx.f(this.deleted, channelsMessageCommentDto.deleted) && epx.f(this.pid, channelsMessageCommentDto.pid) && epx.f(this.badgeId, channelsMessageCommentDto.badgeId) && epx.f(this.badgeInfo, channelsMessageCommentDto.badgeInfo) && epx.f(this.donutBadgeInfo, channelsMessageCommentDto.donutBadgeInfo) && epx.f(this.isNegative, channelsMessageCommentDto.isNegative);
    }

    public final int f() {
        return this.date;
    }

    public final Boolean g() {
        return this.deleted;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.date, bh10.a(bh10.a(Integer.hashCode(this.id) * 31, 31, this.channelId.b), 31, this.fromId.b), 31), 31, this.text);
        ChannelsChannelTypeDto channelsChannelTypeDto = this.channelType;
        int hashCode = (a2 + (channelsChannelTypeDto == null ? 0 : channelsChannelTypeDto.hashCode())) * 31;
        Boolean bool = this.canEdit;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canDelete;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.postId;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<Integer> list = this.parentsStack;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.photoId;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.videoId;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.updateTime;
        int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        LikesItemReactionsDto likesItemReactionsDto = this.reactions;
        int hashCode9 = (hashCode8 + (likesItemReactionsDto == null ? 0 : likesItemReactionsDto.hashCode())) * 31;
        List<WallWallpostAttachmentDto> list2 = this.attachments;
        int hashCode10 = (hashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto = this.attachmentsMeta;
        int hashCode11 = (hashCode10 + (wallWallpostAttachmentsMetaDto == null ? 0 : wallWallpostAttachmentsMetaDto.hashCode())) * 31;
        List<WallWallpostContentLayoutItemDto> list3 = this.contentLayout;
        int hashCode12 = (hashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        WallWallCommentDonutDto wallWallCommentDonutDto = this.donut;
        int hashCode13 = (hashCode12 + (wallWallCommentDonutDto == null ? 0 : wallWallCommentDonutDto.hashCode())) * 31;
        BaseLikesInfoDto baseLikesInfoDto = this.likes;
        int hashCode14 = (hashCode13 + (baseLikesInfoDto == null ? 0 : baseLikesInfoDto.hashCode())) * 31;
        Integer num5 = this.realOffset;
        int hashCode15 = (hashCode14 + (num5 == null ? 0 : num5.hashCode())) * 31;
        UserId userId = this.replyToUser;
        int hashCode16 = (hashCode15 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num6 = this.replyToComment;
        int hashCode17 = (hashCode16 + (num6 == null ? 0 : num6.hashCode())) * 31;
        ChannelsCommentThreadDto channelsCommentThreadDto = this.thread;
        int hashCode18 = (hashCode17 + (channelsCommentThreadDto == null ? 0 : channelsCommentThreadDto.hashCode())) * 31;
        Boolean bool3 = this.isFromPostAuthor;
        int hashCode19 = (hashCode18 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.deleted;
        int hashCode20 = (hashCode19 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num7 = this.pid;
        int hashCode21 = (hashCode20 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.badgeId;
        int hashCode22 = (hashCode21 + (num8 == null ? 0 : num8.hashCode())) * 31;
        BadgesCommentInfoDto badgesCommentInfoDto = this.badgeInfo;
        int hashCode23 = (hashCode22 + (badgesCommentInfoDto == null ? 0 : badgesCommentInfoDto.hashCode())) * 31;
        BadgesDonutInfoDto badgesDonutInfoDto = this.donutBadgeInfo;
        int hashCode24 = (hashCode23 + (badgesDonutInfoDto == null ? 0 : badgesDonutInfoDto.hashCode())) * 31;
        Boolean bool5 = this.isNegative;
        return hashCode24 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final UserId i() {
        return this.fromId;
    }

    public final List<Integer> j() {
        return this.parentsStack;
    }

    public final LikesItemReactionsDto k() {
        return this.reactions;
    }

    public final Integer l() {
        return this.replyToComment;
    }

    public final UserId n() {
        return this.replyToUser;
    }

    public final String o() {
        return this.text;
    }

    public final ChannelsCommentThreadDto p() {
        return this.thread;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsMessageCommentDto(id=");
        sb.append(this.id);
        sb.append(", channelId=");
        sb.append(this.channelId);
        sb.append(", fromId=");
        sb.append(this.fromId);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", channelType=");
        sb.append(this.channelType);
        sb.append(", canEdit=");
        sb.append(this.canEdit);
        sb.append(", canDelete=");
        sb.append(this.canDelete);
        sb.append(", postId=");
        sb.append(this.postId);
        sb.append(", parentsStack=");
        sb.append(this.parentsStack);
        sb.append(", photoId=");
        sb.append(this.photoId);
        sb.append(", videoId=");
        sb.append(this.videoId);
        sb.append(", updateTime=");
        sb.append(this.updateTime);
        sb.append(", reactions=");
        sb.append(this.reactions);
        sb.append(", attachments=");
        sb.append(this.attachments);
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
        return tn.a(sb, this.isNegative, ')');
    }

    public final Integer u() {
        return this.updateTime;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.channelId, i);
        parcel.writeParcelable(this.fromId, i);
        parcel.writeInt(this.date);
        parcel.writeString(this.text);
        parcel.writeParcelable(this.channelType, i);
        Boolean bool = this.canEdit;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.canDelete;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Integer num = this.postId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
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
        Integer num4 = this.updateTime;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        parcel.writeParcelable(this.reactions, i);
        List<WallWallpostAttachmentDto> list2 = this.attachments;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        parcel.writeParcelable(this.attachmentsMeta, i);
        List<WallWallpostContentLayoutItemDto> list3 = this.contentLayout;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        parcel.writeParcelable(this.donut, i);
        parcel.writeParcelable(this.likes, i);
        Integer num5 = this.realOffset;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        parcel.writeParcelable(this.replyToUser, i);
        Integer num6 = this.replyToComment;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        ChannelsCommentThreadDto channelsCommentThreadDto = this.thread;
        if (channelsCommentThreadDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channelsCommentThreadDto.writeToParcel(parcel, i);
        }
        Boolean bool3 = this.isFromPostAuthor;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.deleted;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Integer num7 = this.pid;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        Integer num8 = this.badgeId;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num8);
        }
        parcel.writeParcelable(this.badgeInfo, i);
        parcel.writeParcelable(this.donutBadgeInfo, i);
        Boolean bool5 = this.isNegative;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
    }

    public /* synthetic */ ChannelsMessageCommentDto(int i, UserId userId, UserId userId2, int i2, String str, ChannelsChannelTypeDto channelsChannelTypeDto, Boolean bool, Boolean bool2, Integer num, List list, Integer num2, Integer num3, Integer num4, LikesItemReactionsDto likesItemReactionsDto, List list2, WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto, List list3, WallWallCommentDonutDto wallWallCommentDonutDto, BaseLikesInfoDto baseLikesInfoDto, Integer num5, UserId userId3, Integer num6, ChannelsCommentThreadDto channelsCommentThreadDto, Boolean bool3, Boolean bool4, Integer num7, Integer num8, BadgesCommentInfoDto badgesCommentInfoDto, BadgesDonutInfoDto badgesDonutInfoDto, Boolean bool5, int i3, zcl zclVar) {
        this(i, userId, userId2, i2, str, (i3 & 32) != 0 ? null : channelsChannelTypeDto, (i3 & 64) != 0 ? null : bool, (i3 & 128) != 0 ? null : bool2, (i3 & 256) != 0 ? null : num, (i3 & 512) != 0 ? null : list, (i3 & 1024) != 0 ? null : num2, (i3 & 2048) != 0 ? null : num3, (i3 & 4096) != 0 ? null : num4, (i3 & 8192) != 0 ? null : likesItemReactionsDto, (i3 & 16384) != 0 ? null : list2, (32768 & i3) != 0 ? null : wallWallpostAttachmentsMetaDto, (65536 & i3) != 0 ? null : list3, (131072 & i3) != 0 ? null : wallWallCommentDonutDto, (262144 & i3) != 0 ? null : baseLikesInfoDto, (524288 & i3) != 0 ? null : num5, (1048576 & i3) != 0 ? null : userId3, (2097152 & i3) != 0 ? null : num6, (4194304 & i3) != 0 ? null : channelsCommentThreadDto, (8388608 & i3) != 0 ? null : bool3, (16777216 & i3) != 0 ? null : bool4, (33554432 & i3) != 0 ? null : num7, (67108864 & i3) != 0 ? null : num8, (134217728 & i3) != 0 ? null : badgesCommentInfoDto, (268435456 & i3) != 0 ? null : badgesDonutInfoDto, (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool5);
    }
}
