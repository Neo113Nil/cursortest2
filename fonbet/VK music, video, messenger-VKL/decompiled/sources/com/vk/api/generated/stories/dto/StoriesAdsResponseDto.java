package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoriesAdsResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoriesAdsResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoriesAdsResponseDto> CREATOR = new a();

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<StoriesFeedItemDto> items;

    @pmi0("profiles")
    private final List<UsersUserDto> profiles;

    /* compiled from: StoriesAdsResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoriesAdsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesAdsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int i = 0;
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(StoriesFeedItemDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(StoriesAdsResponseDto.class, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(StoriesAdsResponseDto.class, parcel, arrayList3, i, 1);
                }
            }
            return new StoriesAdsResponseDto(arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesAdsResponseDto[] newArray(int i) {
            return new StoriesAdsResponseDto[i];
        }
    }

    public StoriesAdsResponseDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesAdsResponseDto)) {
            return false;
        }
        StoriesAdsResponseDto storiesAdsResponseDto = (StoriesAdsResponseDto) obj;
        return epx.f(this.items, storiesAdsResponseDto.items) && epx.f(this.profiles, storiesAdsResponseDto.profiles) && epx.f(this.groups, storiesAdsResponseDto.groups);
    }

    public final int hashCode() {
        List<StoriesFeedItemDto> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<UsersUserDto> list2 = this.profiles;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroupFullDto> list3 = this.groups;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesAdsResponseDto(items=");
        sb.append(this.items);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<StoriesFeedItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((StoriesFeedItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<UsersUserDto> list2 = this.profiles;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<GroupsGroupFullDto> list3 = this.groups;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            parcel.writeParcelable((Parcelable) f3.next(), i);
        }
    }

    public StoriesAdsResponseDto(List<StoriesFeedItemDto> list, List<UsersUserDto> list2, List<GroupsGroupFullDto> list3) {
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
    }

    public /* synthetic */ StoriesAdsResponseDto(List list, List list2, List list3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3);
    }
}
