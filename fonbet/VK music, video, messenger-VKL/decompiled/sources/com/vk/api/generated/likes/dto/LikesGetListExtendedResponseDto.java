package com.vk.api.generated.likes.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersSubscriptionsItemDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pm0;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: LikesGetListExtendedResponseDto.kt */
/* loaded from: classes14.dex */
public final class LikesGetListExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<LikesGetListExtendedResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UsersSubscriptionsItemDto> items;

    @pmi0("liked_by_author")
    private final UsersSubscriptionsItemDto likedByAuthor;

    @pmi0("liked_by_group")
    private final UsersSubscriptionsItemDto likedByGroup;

    @pmi0("reaction_set_id")
    private final String reactionSetId;

    @pmi0("reaction_sets")
    private final List<LikesReactionSetDto> reactionSets;

    @pmi0("reactions")
    private final List<Integer> reactions;

    /* compiled from: LikesGetListExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<LikesGetListExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final LikesGetListExtendedResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(LikesGetListExtendedResponseDto.class, parcel, arrayList4, i2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = pm0.b(parcel, arrayList, i3, 1);
                }
                arrayList2 = null;
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList3 = arrayList2;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = en.a(LikesReactionSetDto.CREATOR, parcel, arrayList5, i, 1);
                }
                arrayList3 = arrayList5;
            }
            return new LikesGetListExtendedResponseDto(readInt, arrayList4, arrayList, readString, arrayList3, (UsersSubscriptionsItemDto) parcel.readParcelable(LikesGetListExtendedResponseDto.class.getClassLoader()), (UsersSubscriptionsItemDto) parcel.readParcelable(LikesGetListExtendedResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final LikesGetListExtendedResponseDto[] newArray(int i) {
            return new LikesGetListExtendedResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LikesGetListExtendedResponseDto(int i, List<? extends UsersSubscriptionsItemDto> list, List<Integer> list2, String str, List<LikesReactionSetDto> list3, UsersSubscriptionsItemDto usersSubscriptionsItemDto, UsersSubscriptionsItemDto usersSubscriptionsItemDto2) {
        this.count = i;
        this.items = list;
        this.reactions = list2;
        this.reactionSetId = str;
        this.reactionSets = list3;
        this.likedByAuthor = usersSubscriptionsItemDto;
        this.likedByGroup = usersSubscriptionsItemDto2;
    }

    public final List<UsersSubscriptionsItemDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikesGetListExtendedResponseDto)) {
            return false;
        }
        LikesGetListExtendedResponseDto likesGetListExtendedResponseDto = (LikesGetListExtendedResponseDto) obj;
        return this.count == likesGetListExtendedResponseDto.count && epx.f(this.items, likesGetListExtendedResponseDto.items) && epx.f(this.reactions, likesGetListExtendedResponseDto.reactions) && epx.f(this.reactionSetId, likesGetListExtendedResponseDto.reactionSetId) && epx.f(this.reactionSets, likesGetListExtendedResponseDto.reactionSets) && epx.f(this.likedByAuthor, likesGetListExtendedResponseDto.likedByAuthor) && epx.f(this.likedByGroup, likesGetListExtendedResponseDto.likedByGroup);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<Integer> list = this.reactions;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.reactionSetId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<LikesReactionSetDto> list2 = this.reactionSets;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        UsersSubscriptionsItemDto usersSubscriptionsItemDto = this.likedByAuthor;
        int hashCode4 = (hashCode3 + (usersSubscriptionsItemDto == null ? 0 : usersSubscriptionsItemDto.hashCode())) * 31;
        UsersSubscriptionsItemDto usersSubscriptionsItemDto2 = this.likedByGroup;
        return hashCode4 + (usersSubscriptionsItemDto2 != null ? usersSubscriptionsItemDto2.hashCode() : 0);
    }

    public final String toString() {
        return "LikesGetListExtendedResponseDto(count=" + this.count + ", items=" + this.items + ", reactions=" + this.reactions + ", reactionSetId=" + this.reactionSetId + ", reactionSets=" + this.reactionSets + ", likedByAuthor=" + this.likedByAuthor + ", likedByGroup=" + this.likedByGroup + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        List<Integer> list = this.reactions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        parcel.writeString(this.reactionSetId);
        List<LikesReactionSetDto> list2 = this.reactionSets;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((LikesReactionSetDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeParcelable(this.likedByAuthor, i);
        parcel.writeParcelable(this.likedByGroup, i);
    }

    public /* synthetic */ LikesGetListExtendedResponseDto(int i, List list, List list2, String str, List list3, UsersSubscriptionsItemDto usersSubscriptionsItemDto, UsersSubscriptionsItemDto usersSubscriptionsItemDto2, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : list3, (i2 & 32) != 0 ? null : usersSubscriptionsItemDto, (i2 & 64) != 0 ? null : usersSubscriptionsItemDto2);
    }
}
