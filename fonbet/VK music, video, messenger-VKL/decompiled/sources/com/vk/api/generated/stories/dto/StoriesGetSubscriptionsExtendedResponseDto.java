package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: StoriesGetSubscriptionsExtendedResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetSubscriptionsExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoriesGetSubscriptionsExtendedResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("owner_ids")
    private final List<UserId> ownerIds;

    @pmi0("profiles")
    private final List<UsersUserDto> profiles;

    /* compiled from: StoriesGetSubscriptionsExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetSubscriptionsExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetSubscriptionsExtendedResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(StoriesGetSubscriptionsExtendedResponseDto.class, parcel, arrayList2, i2, 1);
            }
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(StoriesGetSubscriptionsExtendedResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList3 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(StoriesGetSubscriptionsExtendedResponseDto.class, parcel, arrayList3, i, 1);
                }
            }
            return new StoriesGetSubscriptionsExtendedResponseDto(readInt, readString, arrayList2, arrayList, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetSubscriptionsExtendedResponseDto[] newArray(int i) {
            return new StoriesGetSubscriptionsExtendedResponseDto[i];
        }
    }

    public StoriesGetSubscriptionsExtendedResponseDto(int i, String str, List<UserId> list, List<UsersUserDto> list2, List<GroupsGroupFullDto> list3) {
        this.count = i;
        this.nextFrom = str;
        this.ownerIds = list;
        this.profiles = list2;
        this.groups = list3;
    }

    public final List<GroupsGroupFullDto> d() {
        return this.groups;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<UserId> e() {
        return this.ownerIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesGetSubscriptionsExtendedResponseDto)) {
            return false;
        }
        StoriesGetSubscriptionsExtendedResponseDto storiesGetSubscriptionsExtendedResponseDto = (StoriesGetSubscriptionsExtendedResponseDto) obj;
        return this.count == storiesGetSubscriptionsExtendedResponseDto.count && epx.f(this.nextFrom, storiesGetSubscriptionsExtendedResponseDto.nextFrom) && epx.f(this.ownerIds, storiesGetSubscriptionsExtendedResponseDto.ownerIds) && epx.f(this.profiles, storiesGetSubscriptionsExtendedResponseDto.profiles) && epx.f(this.groups, storiesGetSubscriptionsExtendedResponseDto.groups);
    }

    public final List<UsersUserDto> f() {
        return this.profiles;
    }

    public final int hashCode() {
        int a2 = fw3.a(urd0.a(Integer.hashCode(this.count) * 31, 31, this.nextFrom), 31, this.ownerIds);
        List<UsersUserDto> list = this.profiles;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesGetSubscriptionsExtendedResponseDto(count=");
        sb.append(this.count);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", ownerIds=");
        sb.append(this.ownerIds);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        parcel.writeString(this.nextFrom);
        Iterator a2 = ao.a(parcel, this.ownerIds);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        List<UsersUserDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<GroupsGroupFullDto> list2 = this.groups;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            parcel.writeParcelable((Parcelable) f2.next(), i);
        }
    }

    public /* synthetic */ StoriesGetSubscriptionsExtendedResponseDto(int i, String str, List list, List list2, List list3, int i2, zcl zclVar) {
        this(i, str, list, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? null : list3);
    }
}
