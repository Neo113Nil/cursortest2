package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedGetBannedExtendedResponseDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetBannedExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedGetBannedExtendedResponseDto> CREATOR = new a();

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("total_count")
    private final Integer totalCount;

    /* compiled from: NewsfeedGetBannedExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetBannedExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetBannedExtendedResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2 = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(NewsfeedGetBannedExtendedResponseDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(NewsfeedGetBannedExtendedResponseDto.class, parcel, arrayList3, i, 1);
                }
                arrayList2 = arrayList3;
            }
            return new NewsfeedGetBannedExtendedResponseDto(valueOf, readString, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetBannedExtendedResponseDto[] newArray(int i) {
            return new NewsfeedGetBannedExtendedResponseDto[i];
        }
    }

    public NewsfeedGetBannedExtendedResponseDto() {
        this(null, null, null, null, 15, null);
    }

    public final List<GroupsGroupFullDto> d() {
        return this.groups;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.nextFrom;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedGetBannedExtendedResponseDto)) {
            return false;
        }
        NewsfeedGetBannedExtendedResponseDto newsfeedGetBannedExtendedResponseDto = (NewsfeedGetBannedExtendedResponseDto) obj;
        return epx.f(this.totalCount, newsfeedGetBannedExtendedResponseDto.totalCount) && epx.f(this.nextFrom, newsfeedGetBannedExtendedResponseDto.nextFrom) && epx.f(this.profiles, newsfeedGetBannedExtendedResponseDto.profiles) && epx.f(this.groups, newsfeedGetBannedExtendedResponseDto.groups);
    }

    public final List<UsersUserFullDto> f() {
        return this.profiles;
    }

    public final Integer g() {
        return this.totalCount;
    }

    public final int hashCode() {
        Integer num = this.totalCount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.nextFrom;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedGetBannedExtendedResponseDto(totalCount=");
        sb.append(this.totalCount);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.totalCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
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

    public NewsfeedGetBannedExtendedResponseDto(Integer num, String str, List<UsersUserFullDto> list, List<GroupsGroupFullDto> list2) {
        this.totalCount = num;
        this.nextFrom = str;
        this.profiles = list;
        this.groups = list2;
    }

    public /* synthetic */ NewsfeedGetBannedExtendedResponseDto(Integer num, String str, List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
    }
}
