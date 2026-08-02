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
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoInterClipBlockPopularAuthorsDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoInterClipBlockPopularAuthorsDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoInterClipBlockPopularAuthorsDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<VideoVideoFullDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: ShortVideoInterClipBlockPopularAuthorsDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoInterClipBlockPopularAuthorsDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoInterClipBlockPopularAuthorsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(ShortVideoInterClipBlockPopularAuthorsDto.class, parcel, arrayList3, i2, 1);
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(ShortVideoInterClipBlockPopularAuthorsDto.class, parcel, arrayList4, i3, 1);
                }
                arrayList = arrayList4;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(ShortVideoInterClipBlockPopularAuthorsDto.class, parcel, arrayList5, i, 1);
                }
                arrayList2 = arrayList5;
            }
            return new ShortVideoInterClipBlockPopularAuthorsDto(readInt, arrayList3, readString, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoInterClipBlockPopularAuthorsDto[] newArray(int i) {
            return new ShortVideoInterClipBlockPopularAuthorsDto[i];
        }
    }

    public ShortVideoInterClipBlockPopularAuthorsDto(int i, List<VideoVideoFullDto> list, String str, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3) {
        this.count = i;
        this.items = list;
        this.nextFrom = str;
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
        if (!(obj instanceof ShortVideoInterClipBlockPopularAuthorsDto)) {
            return false;
        }
        ShortVideoInterClipBlockPopularAuthorsDto shortVideoInterClipBlockPopularAuthorsDto = (ShortVideoInterClipBlockPopularAuthorsDto) obj;
        return this.count == shortVideoInterClipBlockPopularAuthorsDto.count && epx.f(this.items, shortVideoInterClipBlockPopularAuthorsDto.items) && epx.f(this.nextFrom, shortVideoInterClipBlockPopularAuthorsDto.nextFrom) && epx.f(this.profiles, shortVideoInterClipBlockPopularAuthorsDto.profiles) && epx.f(this.groups, shortVideoInterClipBlockPopularAuthorsDto.groups);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        String str = this.nextFrom;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoInterClipBlockPopularAuthorsDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.nextFrom);
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

    public /* synthetic */ ShortVideoInterClipBlockPopularAuthorsDto(int i, List list, String str, List list2, List list3, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? null : list3);
    }
}
