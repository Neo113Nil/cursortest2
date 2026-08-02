package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.badges.dto.BadgesBadgeDto;
import com.vk.api.generated.likes.dto.LikesReactionSetDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallGetPostPreviewResponseDto.kt */
/* loaded from: classes15.dex */
public final class WallGetPostPreviewResponseDto implements Parcelable {
    public static final Parcelable.Creator<WallGetPostPreviewResponseDto> CREATOR = new a();

    @pmi0("badges")
    private final List<BadgesBadgeDto> badges;

    @pmi0("post")
    private final WallWallItemDto post;

    @pmi0("reaction_sets")
    private final List<LikesReactionSetDto> reactionSets;

    /* compiled from: WallGetPostPreviewResponseDto.kt */
    public static final class a implements Parcelable.Creator<WallGetPostPreviewResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final WallGetPostPreviewResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            WallWallItemDto wallWallItemDto = (WallWallItemDto) parcel.readParcelable(WallGetPostPreviewResponseDto.class.getClassLoader());
            int i = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(LikesReactionSetDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(BadgesBadgeDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new WallGetPostPreviewResponseDto(wallWallItemDto, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final WallGetPostPreviewResponseDto[] newArray(int i) {
            return new WallGetPostPreviewResponseDto[i];
        }
    }

    public WallGetPostPreviewResponseDto(WallWallItemDto wallWallItemDto, List<LikesReactionSetDto> list, List<BadgesBadgeDto> list2) {
        this.post = wallWallItemDto;
        this.reactionSets = list;
        this.badges = list2;
    }

    public final WallWallItemDto d() {
        return this.post;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallGetPostPreviewResponseDto)) {
            return false;
        }
        WallGetPostPreviewResponseDto wallGetPostPreviewResponseDto = (WallGetPostPreviewResponseDto) obj;
        return epx.f(this.post, wallGetPostPreviewResponseDto.post) && epx.f(this.reactionSets, wallGetPostPreviewResponseDto.reactionSets) && epx.f(this.badges, wallGetPostPreviewResponseDto.badges);
    }

    public final int hashCode() {
        int hashCode = this.post.hashCode() * 31;
        List<LikesReactionSetDto> list = this.reactionSets;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<BadgesBadgeDto> list2 = this.badges;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallGetPostPreviewResponseDto(post=");
        sb.append(this.post);
        sb.append(", reactionSets=");
        sb.append(this.reactionSets);
        sb.append(", badges=");
        return ms9.a(')', sb, this.badges);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.post, i);
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

    public /* synthetic */ WallGetPostPreviewResponseDto(WallWallItemDto wallWallItemDto, List list, List list2, int i, zcl zclVar) {
        this(wallWallItemDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
