package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.badges.dto.BadgesBadgeDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.likes.dto.LikesReactionSetDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: ChannelsGetCommentResponseDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsGetCommentResponseDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsGetCommentResponseDto> CREATOR = new a();

    @pmi0("badges")
    private final List<BadgesBadgeDto> badges;

    @pmi0("can_post")
    private final Boolean canPost;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("groups_can_post")
    private final Boolean groupsCanPost;

    @pmi0("items")
    private final List<ChannelsMessageCommentDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("reaction_set_id")
    private final String reactionSetId;

    @pmi0("reaction_sets")
    private final List<LikesReactionSetDto> reactionSets;

    @pmi0("show_reply_button")
    private final Boolean showReplyButton;

    /* compiled from: ChannelsGetCommentResponseDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsGetCommentResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsGetCommentResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            int readInt = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(ChannelsMessageCommentDto.CREATOR, parcel, arrayList5, i2, 1);
            }
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
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = en.a(LikesReactionSetDto.CREATOR, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = en.a(BadgesBadgeDto.CREATOR, parcel, arrayList6, i4, 1);
                }
                arrayList2 = arrayList6;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList3 = new ArrayList(readInt4);
                int i5 = 0;
                while (i5 != readInt4) {
                    i5 = bo.b(ChannelsGetCommentResponseDto.class, parcel, arrayList3, i5, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList4 = new ArrayList(readInt5);
                while (i != readInt5) {
                    i = bo.b(ChannelsGetCommentResponseDto.class, parcel, arrayList4, i, 1);
                }
            }
            return new ChannelsGetCommentResponseDto(arrayList5, valueOf, valueOf2, valueOf3, readString, arrayList, arrayList2, arrayList3, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsGetCommentResponseDto[] newArray(int i) {
            return new ChannelsGetCommentResponseDto[i];
        }
    }

    public ChannelsGetCommentResponseDto(List<ChannelsMessageCommentDto> list, Boolean bool, Boolean bool2, Boolean bool3, String str, List<LikesReactionSetDto> list2, List<BadgesBadgeDto> list3, List<UsersUserFullDto> list4, List<GroupsGroupFullDto> list5) {
        this.items = list;
        this.canPost = bool;
        this.showReplyButton = bool2;
        this.groupsCanPost = bool3;
        this.reactionSetId = str;
        this.reactionSets = list2;
        this.badges = list3;
        this.profiles = list4;
        this.groups = list5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsGetCommentResponseDto)) {
            return false;
        }
        ChannelsGetCommentResponseDto channelsGetCommentResponseDto = (ChannelsGetCommentResponseDto) obj;
        return epx.f(this.items, channelsGetCommentResponseDto.items) && epx.f(this.canPost, channelsGetCommentResponseDto.canPost) && epx.f(this.showReplyButton, channelsGetCommentResponseDto.showReplyButton) && epx.f(this.groupsCanPost, channelsGetCommentResponseDto.groupsCanPost) && epx.f(this.reactionSetId, channelsGetCommentResponseDto.reactionSetId) && epx.f(this.reactionSets, channelsGetCommentResponseDto.reactionSets) && epx.f(this.badges, channelsGetCommentResponseDto.badges) && epx.f(this.profiles, channelsGetCommentResponseDto.profiles) && epx.f(this.groups, channelsGetCommentResponseDto.groups);
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
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
        List<UsersUserFullDto> list3 = this.profiles;
        int hashCode8 = (hashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<GroupsGroupFullDto> list4 = this.groups;
        return hashCode8 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsGetCommentResponseDto(items=");
        sb.append(this.items);
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
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((ChannelsMessageCommentDto) a2.next()).writeToParcel(parcel, i);
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

    public /* synthetic */ ChannelsGetCommentResponseDto(List list, Boolean bool, Boolean bool2, Boolean bool3, String str, List list2, List list3, List list4, List list5, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : list3, (i & 128) != 0 ? null : list4, (i & 256) != 0 ? null : list5);
    }
}
