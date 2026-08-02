package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoGetOwnerVideosResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetOwnerVideosResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoGetOwnerVideosResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("external_owners")
    private final List<ShortVideoExternalOwnerDto> externalOwners;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<VideoVideoFullDto> items;

    @pmi0("likes_count")
    private final Integer likesCount;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0(SignalingProtocol.KEY_OFFSET)
    private final Integer offset;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("views_count")
    private final Integer viewsCount;

    /* compiled from: ShortVideoGetOwnerVideosResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetOwnerVideosResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetOwnerVideosResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(ShortVideoGetOwnerVideosResponseDto.class, parcel, arrayList4, i2, 1);
            }
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(ShortVideoGetOwnerVideosResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList2 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = bo.b(ShortVideoGetOwnerVideosResponseDto.class, parcel, arrayList2, i4, 1);
                }
            }
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList3 = new ArrayList(readInt5);
                while (i != readInt5) {
                    i = en.a(ShortVideoExternalOwnerDto.CREATOR, parcel, arrayList3, i, 1);
                }
            }
            return new ShortVideoGetOwnerVideosResponseDto(readInt, arrayList4, valueOf, valueOf2, readString, arrayList, arrayList2, valueOf3, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetOwnerVideosResponseDto[] newArray(int i) {
            return new ShortVideoGetOwnerVideosResponseDto[i];
        }
    }

    public ShortVideoGetOwnerVideosResponseDto(int i, List<VideoVideoFullDto> list, Integer num, Integer num2, String str, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, Integer num3, List<ShortVideoExternalOwnerDto> list4) {
        this.count = i;
        this.items = list;
        this.viewsCount = num;
        this.likesCount = num2;
        this.nextFrom = str;
        this.profiles = list2;
        this.groups = list3;
        this.offset = num3;
        this.externalOwners = list4;
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
        if (!(obj instanceof ShortVideoGetOwnerVideosResponseDto)) {
            return false;
        }
        ShortVideoGetOwnerVideosResponseDto shortVideoGetOwnerVideosResponseDto = (ShortVideoGetOwnerVideosResponseDto) obj;
        return this.count == shortVideoGetOwnerVideosResponseDto.count && epx.f(this.items, shortVideoGetOwnerVideosResponseDto.items) && epx.f(this.viewsCount, shortVideoGetOwnerVideosResponseDto.viewsCount) && epx.f(this.likesCount, shortVideoGetOwnerVideosResponseDto.likesCount) && epx.f(this.nextFrom, shortVideoGetOwnerVideosResponseDto.nextFrom) && epx.f(this.profiles, shortVideoGetOwnerVideosResponseDto.profiles) && epx.f(this.groups, shortVideoGetOwnerVideosResponseDto.groups) && epx.f(this.offset, shortVideoGetOwnerVideosResponseDto.offset) && epx.f(this.externalOwners, shortVideoGetOwnerVideosResponseDto.externalOwners);
    }

    public final Integer f() {
        return this.likesCount;
    }

    public final String g() {
        return this.nextFrom;
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        Integer num = this.viewsCount;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.likesCount;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.nextFrom;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num3 = this.offset;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<ShortVideoExternalOwnerDto> list3 = this.externalOwners;
        return hashCode6 + (list3 != null ? list3.hashCode() : 0);
    }

    public final Integer i() {
        return this.offset;
    }

    public final List<UsersUserFullDto> j() {
        return this.profiles;
    }

    public final Integer k() {
        return this.viewsCount;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoGetOwnerVideosResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", viewsCount=");
        sb.append(this.viewsCount);
        sb.append(", likesCount=");
        sb.append(this.likesCount);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", offset=");
        sb.append(this.offset);
        sb.append(", externalOwners=");
        return ms9.a(')', sb, this.externalOwners);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Integer num = this.viewsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.likesCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
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
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        Integer num3 = this.offset;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        List<ShortVideoExternalOwnerDto> list3 = this.externalOwners;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            ((ShortVideoExternalOwnerDto) f3.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ShortVideoGetOwnerVideosResponseDto(int i, List list, Integer num, Integer num2, String str, List list2, List list3, Integer num3, List list4, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : num2, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : list2, (i2 & 64) != 0 ? null : list3, (i2 & 128) != 0 ? null : num3, (i2 & 256) != 0 ? null : list4);
    }
}
