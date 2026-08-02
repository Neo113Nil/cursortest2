package com.vk.api.generated.newsfeed.dto;

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
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: NewsfeedGetUserTopicSourcesResponseDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetUserTopicSourcesResponseDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedGetUserTopicSourcesResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<NewsfeedUserTopicSourceDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: NewsfeedGetUserTopicSourcesResponseDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetUserTopicSourcesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetUserTopicSourcesResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(NewsfeedUserTopicSourceDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(NewsfeedGetUserTopicSourcesResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList3 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(NewsfeedGetUserTopicSourcesResponseDto.class, parcel, arrayList3, i, 1);
                }
            }
            return new NewsfeedGetUserTopicSourcesResponseDto(arrayList2, readInt2, arrayList, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetUserTopicSourcesResponseDto[] newArray(int i) {
            return new NewsfeedGetUserTopicSourcesResponseDto[i];
        }
    }

    public NewsfeedGetUserTopicSourcesResponseDto(List<NewsfeedUserTopicSourceDto> list, int i, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3) {
        this.items = list;
        this.count = i;
        this.profiles = list2;
        this.groups = list3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedGetUserTopicSourcesResponseDto)) {
            return false;
        }
        NewsfeedGetUserTopicSourcesResponseDto newsfeedGetUserTopicSourcesResponseDto = (NewsfeedGetUserTopicSourcesResponseDto) obj;
        return epx.f(this.items, newsfeedGetUserTopicSourcesResponseDto.items) && this.count == newsfeedGetUserTopicSourcesResponseDto.count && epx.f(this.profiles, newsfeedGetUserTopicSourcesResponseDto.profiles) && epx.f(this.groups, newsfeedGetUserTopicSourcesResponseDto.groups);
    }

    public final int hashCode() {
        int a2 = shy.a(this.count, this.items.hashCode() * 31, 31);
        List<UsersUserFullDto> list = this.profiles;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedGetUserTopicSourcesResponseDto(items=");
        sb.append(this.items);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((NewsfeedUserTopicSourceDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.count);
        List<UsersUserFullDto> list = this.profiles;
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

    public /* synthetic */ NewsfeedGetUserTopicSourcesResponseDto(List list, int i, List list2, List list3, int i2, zcl zclVar) {
        this(list, i, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3);
    }
}
