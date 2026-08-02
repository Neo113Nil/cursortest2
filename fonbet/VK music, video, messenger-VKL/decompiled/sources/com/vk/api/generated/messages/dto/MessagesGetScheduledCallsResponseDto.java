package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: MessagesGetScheduledCallsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetScheduledCallsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetScheduledCallsResponseDto> CREATOR = new a();

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("has_more")
    private final Boolean hasMore;

    @pmi0("items")
    private final List<MessagesScheduledCallItemDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: MessagesGetScheduledCallsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetScheduledCallsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetScheduledCallsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            ArrayList arrayList2;
            int i = 0;
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(MessagesScheduledCallItemDto.CREATOR, parcel, arrayList4, i2, 1);
                }
                arrayList = arrayList4;
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(MessagesGetScheduledCallsResponseDto.class, parcel, arrayList5, i3, 1);
                }
                arrayList2 = arrayList5;
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(MessagesGetScheduledCallsResponseDto.class, parcel, arrayList3, i, 1);
                }
            }
            return new MessagesGetScheduledCallsResponseDto(arrayList, readString, valueOf, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetScheduledCallsResponseDto[] newArray(int i) {
            return new MessagesGetScheduledCallsResponseDto[i];
        }
    }

    public MessagesGetScheduledCallsResponseDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final List<GroupsGroupFullDto> d() {
        return this.groups;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.hasMore;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetScheduledCallsResponseDto)) {
            return false;
        }
        MessagesGetScheduledCallsResponseDto messagesGetScheduledCallsResponseDto = (MessagesGetScheduledCallsResponseDto) obj;
        return epx.f(this.items, messagesGetScheduledCallsResponseDto.items) && epx.f(this.nextFrom, messagesGetScheduledCallsResponseDto.nextFrom) && epx.f(this.hasMore, messagesGetScheduledCallsResponseDto.hasMore) && epx.f(this.profiles, messagesGetScheduledCallsResponseDto.profiles) && epx.f(this.groups, messagesGetScheduledCallsResponseDto.groups);
    }

    public final List<MessagesScheduledCallItemDto> f() {
        return this.items;
    }

    public final String g() {
        return this.nextFrom;
    }

    public final int hashCode() {
        List<MessagesScheduledCallItemDto> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.nextFrom;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.hasMore;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<UsersUserFullDto> list2 = this.profiles;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroupFullDto> list3 = this.groups;
        return hashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    public final List<UsersUserFullDto> i() {
        return this.profiles;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetScheduledCallsResponseDto(items=");
        sb.append(this.items);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", hasMore=");
        sb.append(this.hasMore);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MessagesScheduledCallItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MessagesScheduledCallItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.nextFrom);
        Boolean bool = this.hasMore;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<UsersUserFullDto> list2 = this.profiles;
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

    public MessagesGetScheduledCallsResponseDto(List<MessagesScheduledCallItemDto> list, String str, Boolean bool, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3) {
        this.items = list;
        this.nextFrom = str;
        this.hasMore = bool;
        this.profiles = list2;
        this.groups = list3;
    }

    public /* synthetic */ MessagesGetScheduledCallsResponseDto(List list, String str, Boolean bool, List list2, List list3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : list3);
    }
}
