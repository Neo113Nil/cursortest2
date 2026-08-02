package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
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
import xsna.ms9;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: WallGetCommentResponseDto.kt */
/* loaded from: classes15.dex */
public final class WallGetCommentResponseDto implements Parcelable {
    public static final Parcelable.Creator<WallGetCommentResponseDto> CREATOR = new a();

    @pmi0("badges")
    private final List<BadgesBadgeDto> badges;

    @pmi0("can_post")
    private final Boolean canPost;

    @pmi0("groups_can_post")
    private final Boolean groupsCanPost;

    @pmi0("items")
    private final List<WallWallCommentDto> items;

    @pmi0("reaction_set_id")
    private final String reactionSetId;

    @pmi0("reaction_sets")
    private final List<LikesReactionSetDto> reactionSets;

    @pmi0("show_reply_button")
    private final Boolean showReplyButton;

    /* compiled from: WallGetCommentResponseDto.kt */
    public static final class a implements Parcelable.Creator<WallGetCommentResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final WallGetCommentResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            ArrayList arrayList;
            ArrayList arrayList2;
            int readInt = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = bo.b(WallGetCommentResponseDto.class, parcel, arrayList3, i2, 1);
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
                arrayList2 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(BadgesBadgeDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new WallGetCommentResponseDto(arrayList3, valueOf, valueOf2, valueOf3, readString, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final WallGetCommentResponseDto[] newArray(int i) {
            return new WallGetCommentResponseDto[i];
        }
    }

    public WallGetCommentResponseDto(List<WallWallCommentDto> list, Boolean bool, Boolean bool2, Boolean bool3, String str, List<LikesReactionSetDto> list2, List<BadgesBadgeDto> list3) {
        this.items = list;
        this.canPost = bool;
        this.showReplyButton = bool2;
        this.groupsCanPost = bool3;
        this.reactionSetId = str;
        this.reactionSets = list2;
        this.badges = list3;
    }

    public final List<WallWallCommentDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<LikesReactionSetDto> e() {
        return this.reactionSets;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallGetCommentResponseDto)) {
            return false;
        }
        WallGetCommentResponseDto wallGetCommentResponseDto = (WallGetCommentResponseDto) obj;
        return epx.f(this.items, wallGetCommentResponseDto.items) && epx.f(this.canPost, wallGetCommentResponseDto.canPost) && epx.f(this.showReplyButton, wallGetCommentResponseDto.showReplyButton) && epx.f(this.groupsCanPost, wallGetCommentResponseDto.groupsCanPost) && epx.f(this.reactionSetId, wallGetCommentResponseDto.reactionSetId) && epx.f(this.reactionSets, wallGetCommentResponseDto.reactionSets) && epx.f(this.badges, wallGetCommentResponseDto.badges);
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
        return hashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallGetCommentResponseDto(items=");
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
        return ms9.a(')', sb, this.badges);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
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
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((BadgesBadgeDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ WallGetCommentResponseDto(List list, Boolean bool, Boolean bool2, Boolean bool3, String str, List list2, List list3, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : list3);
    }
}
