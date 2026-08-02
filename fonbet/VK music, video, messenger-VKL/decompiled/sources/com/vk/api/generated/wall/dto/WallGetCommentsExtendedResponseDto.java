package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4504q2;
import com.vk.api.generated.badges.dto.BadgesBadgeDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.likes.dto.LikesReactionSetDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.gp;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: WallGetCommentsExtendedResponseDto.kt */
/* loaded from: classes15.dex */
public final class WallGetCommentsExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<WallGetCommentsExtendedResponseDto> CREATOR = new a();

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
    private final List<WallWallCommentDto> items;

    @pmi0("negative_replies_placeholder")
    private final WallNegativeRepliesPlaceholderDto negativeRepliesPlaceholder;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0(C4504q2.u)
    private final String order;

    @pmi0("post_author_id")
    private final UserId postAuthorId;

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

    /* compiled from: WallGetCommentsExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<WallGetCommentsExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final WallGetCommentsExtendedResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int i;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(WallGetCommentsExtendedResponseDto.class, parcel, arrayList4, i2, 1);
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(readInt3);
            int i3 = 0;
            while (i3 != readInt3) {
                i3 = bo.b(WallGetCommentsExtendedResponseDto.class, parcel, arrayList5, i3, 1);
            }
            int readInt4 = parcel.readInt();
            int i4 = 0;
            ArrayList arrayList6 = new ArrayList(readInt4);
            int i5 = 0;
            while (i5 != readInt4) {
                i5 = bo.b(WallGetCommentsExtendedResponseDto.class, parcel, arrayList6, i5, 1);
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
                arrayList = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                arrayList = null;
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = arrayList;
            } else {
                int readInt5 = parcel.readInt();
                arrayList2 = new ArrayList(readInt5);
                while (i4 != readInt5) {
                    i4 = en.a(LikesReactionSetDto.CREATOR, parcel, arrayList2, i4, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt6 = parcel.readInt();
                arrayList3 = new ArrayList(readInt6);
                int i6 = 0;
                while (true) {
                    i = readInt;
                    if (i6 == readInt6) {
                        break;
                    }
                    i6 = en.a(BadgesBadgeDto.CREATOR, parcel, arrayList3, i6, 1);
                    readInt = i;
                }
            } else {
                arrayList3 = null;
                i = readInt;
            }
            return new WallGetCommentsExtendedResponseDto(i, arrayList4, arrayList5, arrayList6, valueOf4, valueOf, valueOf2, valueOf3, readString, arrayList2, arrayList3, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (WallNegativeRepliesPlaceholderDto) parcel.readParcelable(WallGetCommentsExtendedResponseDto.class.getClassLoader()), (UserId) parcel.readParcelable(WallGetCommentsExtendedResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final WallGetCommentsExtendedResponseDto[] newArray(int i) {
            return new WallGetCommentsExtendedResponseDto[i];
        }
    }

    public WallGetCommentsExtendedResponseDto(int i, List<WallWallCommentDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, Integer num, Boolean bool, Boolean bool2, Boolean bool3, String str, List<LikesReactionSetDto> list4, List<BadgesBadgeDto> list5, String str2, String str3, String str4, Integer num2, WallNegativeRepliesPlaceholderDto wallNegativeRepliesPlaceholderDto, UserId userId) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
        this.currentLevelCount = num;
        this.canPost = bool;
        this.showReplyButton = bool2;
        this.groupsCanPost = bool3;
        this.reactionSetId = str;
        this.reactionSets = list4;
        this.badges = list5;
        this.nextFrom = str2;
        this.prevFrom = str3;
        this.order = str4;
        this.realOffset = num2;
        this.negativeRepliesPlaceholder = wallNegativeRepliesPlaceholderDto;
        this.postAuthorId = userId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallGetCommentsExtendedResponseDto)) {
            return false;
        }
        WallGetCommentsExtendedResponseDto wallGetCommentsExtendedResponseDto = (WallGetCommentsExtendedResponseDto) obj;
        return this.count == wallGetCommentsExtendedResponseDto.count && epx.f(this.items, wallGetCommentsExtendedResponseDto.items) && epx.f(this.profiles, wallGetCommentsExtendedResponseDto.profiles) && epx.f(this.groups, wallGetCommentsExtendedResponseDto.groups) && epx.f(this.currentLevelCount, wallGetCommentsExtendedResponseDto.currentLevelCount) && epx.f(this.canPost, wallGetCommentsExtendedResponseDto.canPost) && epx.f(this.showReplyButton, wallGetCommentsExtendedResponseDto.showReplyButton) && epx.f(this.groupsCanPost, wallGetCommentsExtendedResponseDto.groupsCanPost) && epx.f(this.reactionSetId, wallGetCommentsExtendedResponseDto.reactionSetId) && epx.f(this.reactionSets, wallGetCommentsExtendedResponseDto.reactionSets) && epx.f(this.badges, wallGetCommentsExtendedResponseDto.badges) && epx.f(this.nextFrom, wallGetCommentsExtendedResponseDto.nextFrom) && epx.f(this.prevFrom, wallGetCommentsExtendedResponseDto.prevFrom) && epx.f(this.order, wallGetCommentsExtendedResponseDto.order) && epx.f(this.realOffset, wallGetCommentsExtendedResponseDto.realOffset) && epx.f(this.negativeRepliesPlaceholder, wallGetCommentsExtendedResponseDto.negativeRepliesPlaceholder) && epx.f(this.postAuthorId, wallGetCommentsExtendedResponseDto.postAuthorId);
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
        UserId userId = this.postAuthorId;
        return hashCode12 + (userId != null ? Long.hashCode(userId.b) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallGetCommentsExtendedResponseDto(count=");
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
        sb.append(", postAuthorId=");
        return gp.b(sb, this.postAuthorId, ')');
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
        parcel.writeParcelable(this.postAuthorId, i);
    }

    public /* synthetic */ WallGetCommentsExtendedResponseDto(int i, List list, List list2, List list3, Integer num, Boolean bool, Boolean bool2, Boolean bool3, String str, List list4, List list5, String str2, String str3, String str4, Integer num2, WallNegativeRepliesPlaceholderDto wallNegativeRepliesPlaceholderDto, UserId userId, int i2, zcl zclVar) {
        this(i, list, list2, list3, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? null : bool2, (i2 & 128) != 0 ? null : bool3, (i2 & 256) != 0 ? null : str, (i2 & 512) != 0 ? null : list4, (i2 & 1024) != 0 ? null : list5, (i2 & 2048) != 0 ? null : str2, (i2 & 4096) != 0 ? null : str3, (i2 & 8192) != 0 ? null : str4, (i2 & 16384) != 0 ? null : num2, (32768 & i2) != 0 ? null : wallNegativeRepliesPlaceholderDto, (i2 & 65536) != 0 ? null : userId);
    }
}
