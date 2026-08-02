package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsGetFromMenuResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetFromMenuResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsGetFromMenuResponseDto> CREATOR = new a();

    @pmi0("favorites")
    private final List<AppsAppDto> favorites;

    @pmi0("featured")
    private final AppsFeaturedDto featured;

    @pmi0("groups")
    private final List<GroupsGroupDto> groups;

    @pmi0("items")
    private final List<AppsAppDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: AppsGetFromMenuResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetFromMenuResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetFromMenuResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int i = 0;
            ArrayList arrayList4 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(AppsGetFromMenuResponseDto.class, parcel, arrayList5, i2, 1);
                }
                arrayList = arrayList5;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(AppsGetFromMenuResponseDto.class, parcel, arrayList6, i3, 1);
                }
                arrayList2 = arrayList6;
            }
            AppsFeaturedDto createFromParcel = parcel.readInt() == 0 ? null : AppsFeaturedDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = bo.b(AppsGetFromMenuResponseDto.class, parcel, arrayList7, i4, 1);
                }
                arrayList3 = arrayList7;
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(AppsGetFromMenuResponseDto.class, parcel, arrayList4, i, 1);
                }
            }
            return new AppsGetFromMenuResponseDto(arrayList, arrayList2, createFromParcel, arrayList3, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetFromMenuResponseDto[] newArray(int i) {
            return new AppsGetFromMenuResponseDto[i];
        }
    }

    public AppsGetFromMenuResponseDto() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetFromMenuResponseDto)) {
            return false;
        }
        AppsGetFromMenuResponseDto appsGetFromMenuResponseDto = (AppsGetFromMenuResponseDto) obj;
        return epx.f(this.items, appsGetFromMenuResponseDto.items) && epx.f(this.favorites, appsGetFromMenuResponseDto.favorites) && epx.f(this.featured, appsGetFromMenuResponseDto.featured) && epx.f(this.profiles, appsGetFromMenuResponseDto.profiles) && epx.f(this.groups, appsGetFromMenuResponseDto.groups);
    }

    public final int hashCode() {
        List<AppsAppDto> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<AppsAppDto> list2 = this.favorites;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        AppsFeaturedDto appsFeaturedDto = this.featured;
        int hashCode3 = (hashCode2 + (appsFeaturedDto == null ? 0 : appsFeaturedDto.hashCode())) * 31;
        List<UsersUserFullDto> list3 = this.profiles;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<GroupsGroupDto> list4 = this.groups;
        return hashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsGetFromMenuResponseDto(items=");
        sb.append(this.items);
        sb.append(", favorites=");
        sb.append(this.favorites);
        sb.append(", featured=");
        sb.append(this.featured);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<AppsAppDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<AppsAppDto> list2 = this.favorites;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        AppsFeaturedDto appsFeaturedDto = this.featured;
        if (appsFeaturedDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsFeaturedDto.writeToParcel(parcel, i);
        }
        List<UsersUserFullDto> list3 = this.profiles;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        List<GroupsGroupDto> list4 = this.groups;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f4 = dn.f(parcel, list4, 1);
        while (f4.hasNext()) {
            parcel.writeParcelable((Parcelable) f4.next(), i);
        }
    }

    public AppsGetFromMenuResponseDto(List<AppsAppDto> list, List<AppsAppDto> list2, AppsFeaturedDto appsFeaturedDto, List<UsersUserFullDto> list3, List<GroupsGroupDto> list4) {
        this.items = list;
        this.favorites = list2;
        this.featured = appsFeaturedDto;
        this.profiles = list3;
        this.groups = list4;
    }

    public /* synthetic */ AppsGetFromMenuResponseDto(List list, List list2, AppsFeaturedDto appsFeaturedDto, List list3, List list4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : appsFeaturedDto, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : list4);
    }
}
