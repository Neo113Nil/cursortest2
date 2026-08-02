package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4504q2;
import com.vk.api.generated.badges.dto.BadgesBadgeDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.likes.dto.LikesReactionSetDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.wall.dto.WallNegativeRepliesPlaceholderDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: ChannelsGetCommentsResponseDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsGetCommentsResponseDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsGetCommentsResponseDto> CREATOR = new a();

    @pmi0("badges")
    private final List<BadgesBadgeDto> badges;

    @pmi0("can_post")
    private final Boolean canPost;

    @pmi0("count")
    private final int count;

    @pmi0("current_level_count")
    private final Integer currentLevelCount;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("groups_can_post")
    private final Boolean groupsCanPost;

    @pmi0("items")
    private final List<ChannelsMessageCommentDto> items;

    @pmi0("negative_replies_placeholder")
    private final WallNegativeRepliesPlaceholderDto negativeRepliesPlaceholder;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0(C4504q2.u)
    private final String order;

    @pmi0("prev_from")
    private final String prevFrom;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("reaction_set_id")
    private final String reactionSetId;

    @pmi0("reaction_sets")
    private final List<LikesReactionSetDto> reactionSets;

    @pmi0("real_offset")
    private final Integer realOffset;

    @pmi0("show_reply_button")
    private final Boolean showReplyButton;

    /* compiled from: ChannelsGetCommentsResponseDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsGetCommentsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsGetCommentsResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            ArrayList arrayList;
            ArrayList arrayList2;
            int i;
            ArrayList arrayList3;
            Integer num;
            ArrayList arrayList4;
            int i2;
            ArrayList arrayList5;
            ArrayList arrayList6;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(readInt2);
            int i3 = 0;
            while (i3 != readInt2) {
                i3 = en.a(ChannelsMessageCommentDto.CREATOR, parcel, arrayList7, i3, 1);
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
            Boolean bool = valueOf;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = en.a(LikesReactionSetDto.CREATOR, parcel, arrayList, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList2 = new ArrayList(readInt4);
                int i5 = 0;
                while (i5 != readInt4) {
                    i5 = en.a(BadgesBadgeDto.CREATOR, parcel, arrayList2, i5, 1);
                }
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Boolean bool2 = valueOf2;
            ArrayList arrayList8 = arrayList;
            String readString4 = parcel.readString();
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            WallNegativeRepliesPlaceholderDto wallNegativeRepliesPlaceholderDto = (WallNegativeRepliesPlaceholderDto) parcel.readParcelable(ChannelsGetCommentsResponseDto.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                i = readInt;
                arrayList3 = new ArrayList(readInt5);
                num = valueOf4;
                int i6 = 0;
                while (true) {
                    arrayList4 = arrayList7;
                    i2 = 1;
                    if (i6 == readInt5) {
                        break;
                    }
                    i6 = bo.b(ChannelsGetCommentsResponseDto.class, parcel, arrayList3, i6, 1);
                    arrayList7 = arrayList4;
                }
            } else {
                i = readInt;
                num = valueOf4;
                arrayList4 = arrayList7;
                i2 = 1;
                arrayList3 = null;
            }
            if (parcel.readInt() == 0) {
                arrayList6 = arrayList3;
                arrayList5 = null;
            } else {
                int readInt6 = parcel.readInt();
                arrayList5 = new ArrayList(readInt6);
                arrayList6 = arrayList3;
                int i7 = 0;
                while (i7 != readInt6) {
                    i7 = bo.b(ChannelsGetCommentsResponseDto.class, parcel, arrayList5, i7, i2);
                }
            }
            return new ChannelsGetCommentsResponseDto(i, arrayList4, num, bool, bool2, valueOf3, readString, arrayList8, arrayList2, readString2, readString3, readString4, valueOf5, wallNegativeRepliesPlaceholderDto, arrayList6, arrayList5);
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsGetCommentsResponseDto[] newArray(int i) {
            return new ChannelsGetCommentsResponseDto[i];
        }
    }

    public ChannelsGetCommentsResponseDto(int i, List<ChannelsMessageCommentDto> list, Integer num, Boolean bool, Boolean bool2, Boolean bool3, String str, List<LikesReactionSetDto> list2, List<BadgesBadgeDto> list3, String str2, String str3, String str4, Integer num2, WallNegativeRepliesPlaceholderDto wallNegativeRepliesPlaceholderDto, List<UsersUserFullDto> list4, List<GroupsGroupFullDto> list5) {
        this.count = i;
        this.items = list;
        this.currentLevelCount = num;
        this.canPost = bool;
        this.showReplyButton = bool2;
        this.groupsCanPost = bool3;
        this.reactionSetId = str;
        this.reactionSets = list2;
        this.badges = list3;
        this.nextFrom = str2;
        this.prevFrom = str3;
        this.order = str4;
        this.realOffset = num2;
        this.negativeRepliesPlaceholder = wallNegativeRepliesPlaceholderDto;
        this.profiles = list4;
        this.groups = list5;
    }

    public final Integer d() {
        return this.currentLevelCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<ChannelsMessageCommentDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsGetCommentsResponseDto)) {
            return false;
        }
        ChannelsGetCommentsResponseDto channelsGetCommentsResponseDto = (ChannelsGetCommentsResponseDto) obj;
        return this.count == channelsGetCommentsResponseDto.count && epx.f(this.items, channelsGetCommentsResponseDto.items) && epx.f(this.currentLevelCount, channelsGetCommentsResponseDto.currentLevelCount) && epx.f(this.canPost, channelsGetCommentsResponseDto.canPost) && epx.f(this.showReplyButton, channelsGetCommentsResponseDto.showReplyButton) && epx.f(this.groupsCanPost, channelsGetCommentsResponseDto.groupsCanPost) && epx.f(this.reactionSetId, channelsGetCommentsResponseDto.reactionSetId) && epx.f(this.reactionSets, channelsGetCommentsResponseDto.reactionSets) && epx.f(this.badges, channelsGetCommentsResponseDto.badges) && epx.f(this.nextFrom, channelsGetCommentsResponseDto.nextFrom) && epx.f(this.prevFrom, channelsGetCommentsResponseDto.prevFrom) && epx.f(this.order, channelsGetCommentsResponseDto.order) && epx.f(this.realOffset, channelsGetCommentsResponseDto.realOffset) && epx.f(this.negativeRepliesPlaceholder, channelsGetCommentsResponseDto.negativeRepliesPlaceholder) && epx.f(this.profiles, channelsGetCommentsResponseDto.profiles) && epx.f(this.groups, channelsGetCommentsResponseDto.groups);
    }

    public final WallNegativeRepliesPlaceholderDto f() {
        return this.negativeRepliesPlaceholder;
    }

    public final String g() {
        return this.nextFrom;
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        Integer num = this.currentLevelCount;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.canPost;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showReplyButton;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.groupsCanPost;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.reactionSetId;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        List<LikesReactionSetDto> list = this.reactionSets;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<BadgesBadgeDto> list2 = this.badges;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.nextFrom;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.prevFrom;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.order;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.realOffset;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        WallNegativeRepliesPlaceholderDto wallNegativeRepliesPlaceholderDto = this.negativeRepliesPlaceholder;
        int hashCode12 = (hashCode11 + (wallNegativeRepliesPlaceholderDto == null ? 0 : wallNegativeRepliesPlaceholderDto.hashCode())) * 31;
        List<UsersUserFullDto> list3 = this.profiles;
        int hashCode13 = (hashCode12 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<GroupsGroupFullDto> list4 = this.groups;
        return hashCode13 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String i() {
        return this.order;
    }

    public final String j() {
        return this.prevFrom;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsGetCommentsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", currentLevelCount=");
        sb.append(this.currentLevelCount);
        sb.append(", canPost=");
        sb.append(this.canPost);
        sb.append(", showReplyButton=");
        sb.append(this.showReplyButton);
        sb.append(", groupsCanPost=");
        sb.append(this.groupsCanPost);
        sb.append(", reactionSetId=");
        sb.append(this.reactionSetId);
        sb.append(", reactionSets=");
        sb.append(this.reactionSets);
        sb.append(", badges=");
        sb.append(this.badges);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", prevFrom=");
        sb.append(this.prevFrom);
        sb.append(", order=");
        sb.append(this.order);
        sb.append(", realOffset=");
        sb.append(this.realOffset);
        sb.append(", negativeRepliesPlaceholder=");
        sb.append(this.negativeRepliesPlaceholder);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((ChannelsMessageCommentDto) a2.next()).writeToParcel(parcel, i);
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
        parcel.writeString(this.reactionSetId);
        List<LikesReactionSetDto> list = this.reactionSets;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((LikesReactionSetDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<BadgesBadgeDto> list2 = this.badges;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((BadgesBadgeDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.nextFrom);
        parcel.writeString(this.prevFrom);
        parcel.writeString(this.order);
        Integer num2 = this.realOffset;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeParcelable(this.negativeRepliesPlaceholder, i);
        List<UsersUserFullDto> list3 = this.profiles;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        List<GroupsGroupFullDto> list4 = this.groups;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f4 = dn.f(parcel, list4, 1);
        while (f4.hasNext()) {
            parcel.writeParcelable((Parcelable) f4.next(), i);
        }
    }

    public /* synthetic */ ChannelsGetCommentsResponseDto(int i, List list, Integer num, Boolean bool, Boolean bool2, Boolean bool3, String str, List list2, List list3, String str2, String str3, String str4, Integer num2, WallNegativeRepliesPlaceholderDto wallNegativeRepliesPlaceholderDto, List list4, List list5, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : bool, (i2 & 16) != 0 ? null : bool2, (i2 & 32) != 0 ? null : bool3, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? null : list2, (i2 & 256) != 0 ? null : list3, (i2 & 512) != 0 ? null : str2, (i2 & 1024) != 0 ? null : str3, (i2 & 2048) != 0 ? null : str4, (i2 & 4096) != 0 ? null : num2, (i2 & 8192) != 0 ? null : wallNegativeRepliesPlaceholderDto, (i2 & 16384) != 0 ? null : list4, (i2 & 32768) != 0 ? null : list5);
    }
}
