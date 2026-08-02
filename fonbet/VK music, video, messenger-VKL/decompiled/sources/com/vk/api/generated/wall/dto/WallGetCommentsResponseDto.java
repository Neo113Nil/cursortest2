package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4504q2;
import com.vk.api.generated.badges.dto.BadgesBadgeDto;
import com.vk.api.generated.likes.dto.LikesReactionSetDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: WallGetCommentsResponseDto.kt */
/* loaded from: classes15.dex */
public final class WallGetCommentsResponseDto implements Parcelable {
    public static final Parcelable.Creator<WallGetCommentsResponseDto> CREATOR = new a();

    @pmi0("badges")
    private final List<BadgesBadgeDto> badges;

    @pmi0("can_post")
    private final Boolean canPost;

    @pmi0("count")
    private final int count;

    @pmi0("current_level_count")
    private final Integer currentLevelCount;

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

    @pmi0("prev_from")
    private final String prevFrom;

    @pmi0("reaction_set_id")
    private final String reactionSetId;

    @pmi0("reaction_sets")
    private final List<LikesReactionSetDto> reactionSets;

    @pmi0("real_offset")
    private final Integer realOffset;

    @pmi0("show_reply_button")
    private final Boolean showReplyButton;

    /* compiled from: WallGetCommentsResponseDto.kt */
    public static final class a implements Parcelable.Creator<WallGetCommentsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final WallGetCommentsResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            ArrayList arrayList;
            ArrayList arrayList2;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(WallGetCommentsResponseDto.class, parcel, arrayList3, i2, 1);
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
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = en.a(LikesReactionSetDto.CREATOR, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList2 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = en.a(BadgesBadgeDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new WallGetCommentsResponseDto(readInt, arrayList3, valueOf4, valueOf, valueOf2, valueOf3, readString, arrayList, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (WallNegativeRepliesPlaceholderDto) parcel.readParcelable(WallGetCommentsResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final WallGetCommentsResponseDto[] newArray(int i) {
            return new WallGetCommentsResponseDto[i];
        }
    }

    public WallGetCommentsResponseDto(int i, List<WallWallCommentDto> list, Integer num, Boolean bool, Boolean bool2, Boolean bool3, String str, List<LikesReactionSetDto> list2, List<BadgesBadgeDto> list3, String str2, String str3, String str4, Integer num2, WallNegativeRepliesPlaceholderDto wallNegativeRepliesPlaceholderDto) {
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
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallGetCommentsResponseDto)) {
            return false;
        }
        WallGetCommentsResponseDto wallGetCommentsResponseDto = (WallGetCommentsResponseDto) obj;
        return this.count == wallGetCommentsResponseDto.count && epx.f(this.items, wallGetCommentsResponseDto.items) && epx.f(this.currentLevelCount, wallGetCommentsResponseDto.currentLevelCount) && epx.f(this.canPost, wallGetCommentsResponseDto.canPost) && epx.f(this.showReplyButton, wallGetCommentsResponseDto.showReplyButton) && epx.f(this.groupsCanPost, wallGetCommentsResponseDto.groupsCanPost) && epx.f(this.reactionSetId, wallGetCommentsResponseDto.reactionSetId) && epx.f(this.reactionSets, wallGetCommentsResponseDto.reactionSets) && epx.f(this.badges, wallGetCommentsResponseDto.badges) && epx.f(this.nextFrom, wallGetCommentsResponseDto.nextFrom) && epx.f(this.prevFrom, wallGetCommentsResponseDto.prevFrom) && epx.f(this.order, wallGetCommentsResponseDto.order) && epx.f(this.realOffset, wallGetCommentsResponseDto.realOffset) && epx.f(this.negativeRepliesPlaceholder, wallGetCommentsResponseDto.negativeRepliesPlaceholder);
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
        return hashCode11 + (wallNegativeRepliesPlaceholderDto != null ? wallNegativeRepliesPlaceholderDto.hashCode() : 0);
    }

    public final String toString() {
        return "WallGetCommentsResponseDto(count=" + this.count + ", items=" + this.items + ", currentLevelCount=" + this.currentLevelCount + ", canPost=" + this.canPost + ", showReplyButton=" + this.showReplyButton + ", groupsCanPost=" + this.groupsCanPost + ", reactionSetId=" + this.reactionSetId + ", reactionSets=" + this.reactionSets + ", badges=" + this.badges + ", nextFrom=" + this.nextFrom + ", prevFrom=" + this.prevFrom + ", order=" + this.order + ", realOffset=" + this.realOffset + ", negativeRepliesPlaceholder=" + this.negativeRepliesPlaceholder + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
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
    }

    public /* synthetic */ WallGetCommentsResponseDto(int i, List list, Integer num, Boolean bool, Boolean bool2, Boolean bool3, String str, List list2, List list3, String str2, String str3, String str4, Integer num2, WallNegativeRepliesPlaceholderDto wallNegativeRepliesPlaceholderDto, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : bool, (i2 & 16) != 0 ? null : bool2, (i2 & 32) != 0 ? null : bool3, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? null : list2, (i2 & 256) != 0 ? null : list3, (i2 & 512) != 0 ? null : str2, (i2 & 1024) != 0 ? null : str3, (i2 & 2048) != 0 ? null : str4, (i2 & 4096) != 0 ? null : num2, (i2 & 8192) != 0 ? null : wallNegativeRepliesPlaceholderDto);
    }
}
