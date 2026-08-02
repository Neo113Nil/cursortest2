package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
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
import xsna.qoy;
import xsna.zcl;

/* compiled from: MarketReviewCommentsDto.kt */
/* loaded from: classes15.dex */
public final class MarketReviewCommentsDto implements Parcelable {
    public static final Parcelable.Creator<MarketReviewCommentsDto> CREATOR = new a();

    @pmi0("can_comment")
    private final boolean canComment;

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<MarketReviewCommentDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: MarketReviewCommentsDto.kt */
    public static final class a implements Parcelable.Creator<MarketReviewCommentsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketReviewCommentsDto createFromParcel(Parcel parcel) {
            int i;
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(MarketReviewCommentDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            int readInt3 = parcel.readInt();
            boolean z = false;
            ArrayList arrayList3 = new ArrayList(readInt3);
            int i3 = 0;
            while (i3 != readInt3) {
                i3 = bo.b(MarketReviewCommentsDto.class, parcel, arrayList3, i3, 1);
            }
            if (parcel.readInt() != 0) {
                i = 0;
                z = true;
            } else {
                i = 0;
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(MarketReviewCommentsDto.class, parcel, arrayList4, i, 1);
                }
                arrayList = arrayList4;
            }
            return new MarketReviewCommentsDto(readInt, arrayList2, arrayList3, z, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketReviewCommentsDto[] newArray(int i) {
            return new MarketReviewCommentsDto[i];
        }
    }

    public MarketReviewCommentsDto(int i, List<MarketReviewCommentDto> list, List<UsersUserFullDto> list2, boolean z, List<GroupsGroupFullDto> list3) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.canComment = z;
        this.groups = list3;
    }

    public final boolean c0() {
        return this.canComment;
    }

    public final List<GroupsGroupFullDto> d() {
        return this.groups;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<MarketReviewCommentDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketReviewCommentsDto)) {
            return false;
        }
        MarketReviewCommentsDto marketReviewCommentsDto = (MarketReviewCommentsDto) obj;
        return this.count == marketReviewCommentsDto.count && epx.f(this.items, marketReviewCommentsDto.items) && epx.f(this.profiles, marketReviewCommentsDto.profiles) && this.canComment == marketReviewCommentsDto.canComment && epx.f(this.groups, marketReviewCommentsDto.groups);
    }

    public final List<UsersUserFullDto> f() {
        return this.profiles;
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int b = qoy.b(fw3.a(fw3.a(Integer.hashCode(this.count) * 31, 31, this.items), 31, this.profiles), 31, this.canComment);
        List<GroupsGroupFullDto> list = this.groups;
        return b + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketReviewCommentsDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", canComment=");
        sb.append(this.canComment);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MarketReviewCommentDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.profiles);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
        parcel.writeInt(this.canComment ? 1 : 0);
        List<GroupsGroupFullDto> list = this.groups;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ MarketReviewCommentsDto(int i, List list, List list2, boolean z, List list3, int i2, zcl zclVar) {
        this(i, list, list2, z, (i2 & 16) != 0 ? null : list3);
    }
}
