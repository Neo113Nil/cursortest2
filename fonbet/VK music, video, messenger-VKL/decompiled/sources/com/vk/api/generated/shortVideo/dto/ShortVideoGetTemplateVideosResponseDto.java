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
import xsna.shy;
import xsna.zcl;

/* compiled from: ShortVideoGetTemplateVideosResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetTemplateVideosResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoGetTemplateVideosResponseDto> CREATOR = new a();

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

    /* compiled from: ShortVideoGetTemplateVideosResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetTemplateVideosResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetTemplateVideosResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = bo.b(ShortVideoGetTemplateVideosResponseDto.class, parcel, arrayList2, i2, 1);
            }
            int readInt2 = parcel.readInt();
            String readString = parcel.readString();
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(ShortVideoGetTemplateVideosResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList3 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(ShortVideoGetTemplateVideosResponseDto.class, parcel, arrayList3, i, 1);
                }
            }
            return new ShortVideoGetTemplateVideosResponseDto(arrayList2, readInt2, readString, arrayList, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetTemplateVideosResponseDto[] newArray(int i) {
            return new ShortVideoGetTemplateVideosResponseDto[i];
        }
    }

    public ShortVideoGetTemplateVideosResponseDto(List<VideoVideoFullDto> list, int i, String str, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3) {
        this.items = list;
        this.count = i;
        this.nextFrom = str;
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

    public final List<VideoVideoFullDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoGetTemplateVideosResponseDto)) {
            return false;
        }
        ShortVideoGetTemplateVideosResponseDto shortVideoGetTemplateVideosResponseDto = (ShortVideoGetTemplateVideosResponseDto) obj;
        return epx.f(this.items, shortVideoGetTemplateVideosResponseDto.items) && this.count == shortVideoGetTemplateVideosResponseDto.count && epx.f(this.nextFrom, shortVideoGetTemplateVideosResponseDto.nextFrom) && epx.f(this.profiles, shortVideoGetTemplateVideosResponseDto.profiles) && epx.f(this.groups, shortVideoGetTemplateVideosResponseDto.groups);
    }

    public final String f() {
        return this.nextFrom;
    }

    public final List<UsersUserFullDto> g() {
        return this.profiles;
    }

    public final int hashCode() {
        int a2 = shy.a(this.count, this.items.hashCode() * 31, 31);
        String str = this.nextFrom;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoGetTemplateVideosResponseDto(items=");
        sb.append(this.items);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
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
        parcel.writeInt(this.count);
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

    public /* synthetic */ ShortVideoGetTemplateVideosResponseDto(List list, int i, String str, List list2, List list3, int i2, zcl zclVar) {
        this(list, i, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? null : list3);
    }
}
