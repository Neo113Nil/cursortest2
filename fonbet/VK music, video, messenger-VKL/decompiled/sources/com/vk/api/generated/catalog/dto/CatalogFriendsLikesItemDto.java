package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: CatalogFriendsLikesItemDto.kt */
/* loaded from: classes14.dex */
public final class CatalogFriendsLikesItemDto implements Parcelable {
    public static final Parcelable.Creator<CatalogFriendsLikesItemDto> CREATOR = new a();

    @pmi0("friends_count")
    private final Integer friendsCount;

    @pmi0("friends_ids")
    private final List<Integer> friendsIds;

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("is_liked")
    private final Boolean isLiked;

    /* compiled from: CatalogFriendsLikesItemDto.kt */
    public static final class a implements Parcelable.Creator<CatalogFriendsLikesItemDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogFriendsLikesItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            UserId userId = (UserId) parcel.readParcelable(CatalogFriendsLikesItemDto.class.getClassLoader());
            Boolean bool = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = pm0.b(parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CatalogFriendsLikesItemDto(userId, valueOf, arrayList, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogFriendsLikesItemDto[] newArray(int i) {
            return new CatalogFriendsLikesItemDto[i];
        }
    }

    public CatalogFriendsLikesItemDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogFriendsLikesItemDto)) {
            return false;
        }
        CatalogFriendsLikesItemDto catalogFriendsLikesItemDto = (CatalogFriendsLikesItemDto) obj;
        return epx.f(this.groupId, catalogFriendsLikesItemDto.groupId) && epx.f(this.friendsCount, catalogFriendsLikesItemDto.friendsCount) && epx.f(this.friendsIds, catalogFriendsLikesItemDto.friendsIds) && epx.f(this.isLiked, catalogFriendsLikesItemDto.isLiked);
    }

    public final int hashCode() {
        UserId userId = this.groupId;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        Integer num = this.friendsCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<Integer> list = this.friendsIds;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isLiked;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogFriendsLikesItemDto(groupId=");
        sb.append(this.groupId);
        sb.append(", friendsCount=");
        sb.append(this.friendsCount);
        sb.append(", friendsIds=");
        sb.append(this.friendsIds);
        sb.append(", isLiked=");
        return tn.a(sb, this.isLiked, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.groupId, i);
        Integer num = this.friendsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<Integer> list = this.friendsIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        Boolean bool = this.isLiked;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public CatalogFriendsLikesItemDto(UserId userId, Integer num, List<Integer> list, Boolean bool) {
        this.groupId = userId;
        this.friendsCount = num;
        this.friendsIds = list;
        this.isLiked = bool;
    }

    public /* synthetic */ CatalogFriendsLikesItemDto(UserId userId, Integer num, List list, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : bool);
    }
}
