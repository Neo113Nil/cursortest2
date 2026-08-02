package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.badges.dto.BadgesBadgeDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.wall.dto.WallNegativeRepliesPlaceholderDto;
import com.vk.api.generated.wall.dto.WallWallCommentDto;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.iq;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: VideoGetCommentsExtendedResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetCommentsExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetCommentsExtendedResponseDto> CREATOR = new a();

    @pmi0("badges")
    private final List<BadgesBadgeDto> badges;

    @pmi0("can_post")
    private final Boolean canPost;

    @pmi0("count")
    private final int count;

    @pmi0("current_level_count")
    private final Integer currentLevelCount;

    @pmi0("generation_id")
    private final Long generationId;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("groups_can_post")
    private final Boolean groupsCanPost;

    @pmi0("items")
    private final List<WallWallCommentDto> items;

    @pmi0("negative_replies_placeholder")
    private final WallNegativeRepliesPlaceholderDto negativeRepliesPlaceholder;

    @pmi0("next_from_toxic")
    private final Integer nextFromToxic;

    @pmi0("orders")
    private final VideoCommentOrdersDto orders;

    @pmi0("pinned_comments")
    private final List<WallWallCommentDto> pinnedComments;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("real_offset")
    private final Integer realOffset;

    @pmi0("show_reply_button")
    private final Boolean showReplyButton;

    /* compiled from: VideoGetCommentsExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetCommentsExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetCommentsExtendedResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            ArrayList arrayList;
            ArrayList arrayList2;
            int i;
            Integer num;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(VideoGetCommentsExtendedResponseDto.class, parcel, arrayList3, i2, 1);
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt3);
            int i3 = 0;
            while (i3 != readInt3) {
                i3 = bo.b(VideoGetCommentsExtendedResponseDto.class, parcel, arrayList4, i3, 1);
            }
            int readInt4 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(readInt4);
            int i4 = 0;
            while (i4 != readInt4) {
                i4 = bo.b(VideoGetCommentsExtendedResponseDto.class, parcel, arrayList5, i4, 1);
            }
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList = new ArrayList(readInt5);
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = en.a(BadgesBadgeDto.CREATOR, parcel, arrayList, i5, 1);
                }
            }
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            WallNegativeRepliesPlaceholderDto wallNegativeRepliesPlaceholderDto = (WallNegativeRepliesPlaceholderDto) parcel.readParcelable(VideoGetCommentsExtendedResponseDto.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int readInt6 = parcel.readInt();
                arrayList2 = new ArrayList(readInt6);
                i = readInt;
                int i6 = 0;
                while (true) {
                    num = valueOf4;
                    if (i6 == readInt6) {
                        break;
                    }
                    i6 = bo.b(VideoGetCommentsExtendedResponseDto.class, parcel, arrayList2, i6, 1);
                    valueOf4 = num;
                }
            } else {
                i = readInt;
                arrayList2 = null;
                num = valueOf4;
            }
            return new VideoGetCommentsExtendedResponseDto(i, arrayList3, arrayList4, arrayList5, num, valueOf, valueOf2, valueOf3, arrayList, valueOf5, valueOf6, wallNegativeRepliesPlaceholderDto, arrayList2, parcel.readInt() == 0 ? null : VideoCommentOrdersDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetCommentsExtendedResponseDto[] newArray(int i) {
            return new VideoGetCommentsExtendedResponseDto[i];
        }
    }

    public VideoGetCommentsExtendedResponseDto(int i, List<WallWallCommentDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, Integer num, Boolean bool, Boolean bool2, Boolean bool3, List<BadgesBadgeDto> list4, Integer num2, Integer num3, WallNegativeRepliesPlaceholderDto wallNegativeRepliesPlaceholderDto, List<WallWallCommentDto> list5, VideoCommentOrdersDto videoCommentOrdersDto, Long l) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
        this.currentLevelCount = num;
        this.canPost = bool;
        this.showReplyButton = bool2;
        this.groupsCanPost = bool3;
        this.badges = list4;
        this.realOffset = num2;
        this.nextFromToxic = num3;
        this.negativeRepliesPlaceholder = wallNegativeRepliesPlaceholderDto;
        this.pinnedComments = list5;
        this.orders = videoCommentOrdersDto;
        this.generationId = l;
    }

    public final Integer d() {
        return this.currentLevelCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<GroupsGroupFullDto> e() {
        return this.groups;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGetCommentsExtendedResponseDto)) {
            return false;
        }
        VideoGetCommentsExtendedResponseDto videoGetCommentsExtendedResponseDto = (VideoGetCommentsExtendedResponseDto) obj;
        return this.count == videoGetCommentsExtendedResponseDto.count && epx.f(this.items, videoGetCommentsExtendedResponseDto.items) && epx.f(this.profiles, videoGetCommentsExtendedResponseDto.profiles) && epx.f(this.groups, videoGetCommentsExtendedResponseDto.groups) && epx.f(this.currentLevelCount, videoGetCommentsExtendedResponseDto.currentLevelCount) && epx.f(this.canPost, videoGetCommentsExtendedResponseDto.canPost) && epx.f(this.showReplyButton, videoGetCommentsExtendedResponseDto.showReplyButton) && epx.f(this.groupsCanPost, videoGetCommentsExtendedResponseDto.groupsCanPost) && epx.f(this.badges, videoGetCommentsExtendedResponseDto.badges) && epx.f(this.realOffset, videoGetCommentsExtendedResponseDto.realOffset) && epx.f(this.nextFromToxic, videoGetCommentsExtendedResponseDto.nextFromToxic) && epx.f(this.negativeRepliesPlaceholder, videoGetCommentsExtendedResponseDto.negativeRepliesPlaceholder) && epx.f(this.pinnedComments, videoGetCommentsExtendedResponseDto.pinnedComments) && epx.f(this.orders, videoGetCommentsExtendedResponseDto.orders) && epx.f(this.generationId, videoGetCommentsExtendedResponseDto.generationId);
    }

    public final List<WallWallCommentDto> f() {
        return this.items;
    }

    public final Integer g() {
        return this.nextFromToxic;
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int a2 = fw3.a(fw3.a(fw3.a(Integer.hashCode(this.count) * 31, 31, this.items), 31, this.profiles), 31, this.groups);
        Integer num = this.currentLevelCount;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.canPost;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showReplyButton;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.groupsCanPost;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<BadgesBadgeDto> list = this.badges;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.realOffset;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.nextFromToxic;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        WallNegativeRepliesPlaceholderDto wallNegativeRepliesPlaceholderDto = this.negativeRepliesPlaceholder;
        int hashCode8 = (hashCode7 + (wallNegativeRepliesPlaceholderDto == null ? 0 : wallNegativeRepliesPlaceholderDto.hashCode())) * 31;
        List<WallWallCommentDto> list2 = this.pinnedComments;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        VideoCommentOrdersDto videoCommentOrdersDto = this.orders;
        int hashCode10 = (hashCode9 + (videoCommentOrdersDto == null ? 0 : videoCommentOrdersDto.hashCode())) * 31;
        Long l = this.generationId;
        return hashCode10 + (l != null ? l.hashCode() : 0);
    }

    public final VideoCommentOrdersDto i() {
        return this.orders;
    }

    public final List<WallWallCommentDto> j() {
        return this.pinnedComments;
    }

    public final List<UsersUserFullDto> k() {
        return this.profiles;
    }

    public final Integer l() {
        return this.realOffset;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGetCommentsExtendedResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", currentLevelCount=");
        sb.append(this.currentLevelCount);
        sb.append(", canPost=");
        sb.append(this.canPost);
        sb.append(", showReplyButton=");
        sb.append(this.showReplyButton);
        sb.append(", groupsCanPost=");
        sb.append(this.groupsCanPost);
        sb.append(", badges=");
        sb.append(this.badges);
        sb.append(", realOffset=");
        sb.append(this.realOffset);
        sb.append(", nextFromToxic=");
        sb.append(this.nextFromToxic);
        sb.append(", negativeRepliesPlaceholder=");
        sb.append(this.negativeRepliesPlaceholder);
        sb.append(", pinnedComments=");
        sb.append(this.pinnedComments);
        sb.append(", orders=");
        sb.append(this.orders);
        sb.append(", generationId=");
        return iq.b(sb, this.generationId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Iterator a3 = ao.a(parcel, this.profiles);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
        Iterator a4 = ao.a(parcel, this.groups);
        while (a4.hasNext()) {
            parcel.writeParcelable((Parcelable) a4.next(), i);
        }
        Integer num = this.currentLevelCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.canPost;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.showReplyButton;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.groupsCanPost;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        List<BadgesBadgeDto> list = this.badges;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((BadgesBadgeDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Integer num2 = this.realOffset;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.nextFromToxic;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeParcelable(this.negativeRepliesPlaceholder, i);
        List<WallWallCommentDto> list2 = this.pinnedComments;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        VideoCommentOrdersDto videoCommentOrdersDto = this.orders;
        if (videoCommentOrdersDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoCommentOrdersDto.writeToParcel(parcel, i);
        }
        Long l = this.generationId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
    }

    public /* synthetic */ VideoGetCommentsExtendedResponseDto(int i, List list, List list2, List list3, Integer num, Boolean bool, Boolean bool2, Boolean bool3, List list4, Integer num2, Integer num3, WallNegativeRepliesPlaceholderDto wallNegativeRepliesPlaceholderDto, List list5, VideoCommentOrdersDto videoCommentOrdersDto, Long l, int i2, zcl zclVar) {
        this(i, list, list2, list3, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? null : bool2, (i2 & 128) != 0 ? null : bool3, (i2 & 256) != 0 ? null : list4, (i2 & 512) != 0 ? null : num2, (i2 & 1024) != 0 ? null : num3, (i2 & 2048) != 0 ? null : wallNegativeRepliesPlaceholderDto, (i2 & 4096) != 0 ? null : list5, (i2 & 8192) != 0 ? null : videoCommentOrdersDto, (i2 & 16384) != 0 ? null : l);
    }
}
