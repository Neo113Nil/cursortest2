package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: WallConvertLinkExtendedDto.kt */
/* loaded from: classes15.dex */
public final class WallConvertLinkExtendedDto implements Parcelable {
    public static final Parcelable.Creator<WallConvertLinkExtendedDto> CREATOR = new a();

    @pmi0("data")
    private final List<WallWallpostAttachmentDto> data;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: WallConvertLinkExtendedDto.kt */
    public static final class a implements Parcelable.Creator<WallConvertLinkExtendedDto> {
        @Override // android.os.Parcelable.Creator
        public final WallConvertLinkExtendedDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = bo.b(WallConvertLinkExtendedDto.class, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i3 = 0;
            while (i3 != readInt2) {
                i3 = bo.b(WallConvertLinkExtendedDto.class, parcel, arrayList2, i3, 1);
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            while (i != readInt3) {
                i = bo.b(WallConvertLinkExtendedDto.class, parcel, arrayList3, i, 1);
            }
            return new WallConvertLinkExtendedDto(arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final WallConvertLinkExtendedDto[] newArray(int i) {
            return new WallConvertLinkExtendedDto[i];
        }
    }

    public WallConvertLinkExtendedDto(List<GroupsGroupFullDto> list, List<UsersUserFullDto> list2, List<WallWallpostAttachmentDto> list3) {
        this.groups = list;
        this.profiles = list2;
        this.data = list3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallConvertLinkExtendedDto)) {
            return false;
        }
        WallConvertLinkExtendedDto wallConvertLinkExtendedDto = (WallConvertLinkExtendedDto) obj;
        return epx.f(this.groups, wallConvertLinkExtendedDto.groups) && epx.f(this.profiles, wallConvertLinkExtendedDto.profiles) && epx.f(this.data, wallConvertLinkExtendedDto.data);
    }

    public final int hashCode() {
        return this.data.hashCode() + fw3.a(this.groups.hashCode() * 31, 31, this.profiles);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallConvertLinkExtendedDto(groups=");
        sb.append(this.groups);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", data=");
        return ms9.a(')', sb, this.data);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.groups);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Iterator a3 = ao.a(parcel, this.profiles);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
        Iterator a4 = ao.a(parcel, this.data);
        while (a4.hasNext()) {
            parcel.writeParcelable((Parcelable) a4.next(), i);
        }
    }
}
