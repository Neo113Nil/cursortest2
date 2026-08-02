package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoGetCollectionResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetCollectionResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoGetCollectionResponseDto> CREATOR = new a();

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<VideoVideoFullDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("title")
    private final String title;

    /* compiled from: ShortVideoGetCollectionResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetCollectionResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetCollectionResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = bo.b(ShortVideoGetCollectionResponseDto.class, parcel, arrayList2, i2, 1);
            }
            String readString = parcel.readString();
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(ShortVideoGetCollectionResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(ShortVideoGetCollectionResponseDto.class, parcel, arrayList3, i, 1);
                }
            }
            return new ShortVideoGetCollectionResponseDto(arrayList2, readString, arrayList, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetCollectionResponseDto[] newArray(int i) {
            return new ShortVideoGetCollectionResponseDto[i];
        }
    }

    public ShortVideoGetCollectionResponseDto(List<VideoVideoFullDto> list, String str, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3) {
        this.items = list;
        this.title = str;
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
        if (!(obj instanceof ShortVideoGetCollectionResponseDto)) {
            return false;
        }
        ShortVideoGetCollectionResponseDto shortVideoGetCollectionResponseDto = (ShortVideoGetCollectionResponseDto) obj;
        return epx.f(this.items, shortVideoGetCollectionResponseDto.items) && epx.f(this.title, shortVideoGetCollectionResponseDto.title) && epx.f(this.profiles, shortVideoGetCollectionResponseDto.profiles) && epx.f(this.groups, shortVideoGetCollectionResponseDto.groups);
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoGetCollectionResponseDto(items=");
        sb.append(this.items);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.title);
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

    public /* synthetic */ ShortVideoGetCollectionResponseDto(List list, String str, List list2, List list3, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }
}
