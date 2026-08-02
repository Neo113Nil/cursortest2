package com.vk.api.generated.wall.dto;

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
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallGetPostPreviewExtendedResponseDto.kt */
/* loaded from: classes15.dex */
public final class WallGetPostPreviewExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<WallGetPostPreviewExtendedResponseDto> CREATOR = new a();

    @pmi0("badges")
    private final List<BadgesBadgeDto> badges;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("post")
    private final WallWallItemDto post;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("reaction_sets")
    private final List<LikesReactionSetDto> reactionSets;

    /* compiled from: WallGetPostPreviewExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<WallGetPostPreviewExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final WallGetPostPreviewExtendedResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            WallWallItemDto wallWallItemDto = (WallWallItemDto) parcel.readParcelable(WallGetPostPreviewExtendedResponseDto.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = bo.b(WallGetPostPreviewExtendedResponseDto.class, parcel, arrayList2, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i3 = 0;
            while (i3 != readInt2) {
                i3 = bo.b(WallGetPostPreviewExtendedResponseDto.class, parcel, arrayList3, i3, 1);
            }
            ArrayList arrayList4 = null;
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
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = en.a(BadgesBadgeDto.CREATOR, parcel, arrayList4, i, 1);
                }
            }
            return new WallGetPostPreviewExtendedResponseDto(wallWallItemDto, arrayList2, arrayList3, arrayList, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final WallGetPostPreviewExtendedResponseDto[] newArray(int i) {
            return new WallGetPostPreviewExtendedResponseDto[i];
        }
    }

    public WallGetPostPreviewExtendedResponseDto(WallWallItemDto wallWallItemDto, List<UsersUserFullDto> list, List<GroupsGroupFullDto> list2, List<LikesReactionSetDto> list3, List<BadgesBadgeDto> list4) {
        this.post = wallWallItemDto;
        this.profiles = list;
        this.groups = list2;
        this.reactionSets = list3;
        this.badges = list4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallGetPostPreviewExtendedResponseDto)) {
            return false;
        }
        WallGetPostPreviewExtendedResponseDto wallGetPostPreviewExtendedResponseDto = (WallGetPostPreviewExtendedResponseDto) obj;
        return epx.f(this.post, wallGetPostPreviewExtendedResponseDto.post) && epx.f(this.profiles, wallGetPostPreviewExtendedResponseDto.profiles) && epx.f(this.groups, wallGetPostPreviewExtendedResponseDto.groups) && epx.f(this.reactionSets, wallGetPostPreviewExtendedResponseDto.reactionSets) && epx.f(this.badges, wallGetPostPreviewExtendedResponseDto.badges);
    }

    public final int hashCode() {
        int a2 = fw3.a(fw3.a(this.post.hashCode() * 31, 31, this.profiles), 31, this.groups);
        List<LikesReactionSetDto> list = this.reactionSets;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<BadgesBadgeDto> list2 = this.badges;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallGetPostPreviewExtendedResponseDto(post=");
        sb.append(this.post);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", reactionSets=");
        sb.append(this.reactionSets);
        sb.append(", badges=");
        return ms9.a(')', sb, this.badges);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.post, i);
        Iterator a2 = ao.a(parcel, this.profiles);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Iterator a3 = ao.a(parcel, this.groups);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
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

    public /* synthetic */ WallGetPostPreviewExtendedResponseDto(WallWallItemDto wallWallItemDto, List list, List list2, List list3, List list4, int i, zcl zclVar) {
        this(wallWallItemDto, list, list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : list4);
    }
}
