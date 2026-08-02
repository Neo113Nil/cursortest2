package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import io.reactivex.rxjava3.subjects.b;
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

/* compiled from: MessagesGetCallHistoryResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetCallHistoryResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetCallHistoryResponseDto> CREATOR = new a();

    @pmi0("contacts")
    private final List<MessagesContactDto> contacts;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("has_more")
    private final Boolean hasMore;

    @pmi0("items")
    private final List<MessagesCallHistoryItemDto> items;

    @pmi0("next_from")
    private final Long nextFrom;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: MessagesGetCallHistoryResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetCallHistoryResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetCallHistoryResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
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
                    i2 = en.a(MessagesCallHistoryItemDto.CREATOR, parcel, arrayList5, i2, 1);
                }
                arrayList = arrayList5;
            }
            Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(MessagesGetCallHistoryResponseDto.class, parcel, arrayList6, i3, 1);
                }
                arrayList2 = arrayList6;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = bo.b(MessagesGetCallHistoryResponseDto.class, parcel, arrayList7, i4, 1);
                }
                arrayList3 = arrayList7;
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(MessagesGetCallHistoryResponseDto.class, parcel, arrayList4, i, 1);
                }
            }
            return new MessagesGetCallHistoryResponseDto(arrayList, valueOf2, valueOf, arrayList2, arrayList3, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetCallHistoryResponseDto[] newArray(int i) {
            return new MessagesGetCallHistoryResponseDto[i];
        }
    }

    public MessagesGetCallHistoryResponseDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetCallHistoryResponseDto)) {
            return false;
        }
        MessagesGetCallHistoryResponseDto messagesGetCallHistoryResponseDto = (MessagesGetCallHistoryResponseDto) obj;
        return epx.f(this.items, messagesGetCallHistoryResponseDto.items) && epx.f(this.nextFrom, messagesGetCallHistoryResponseDto.nextFrom) && epx.f(this.hasMore, messagesGetCallHistoryResponseDto.hasMore) && epx.f(this.profiles, messagesGetCallHistoryResponseDto.profiles) && epx.f(this.groups, messagesGetCallHistoryResponseDto.groups) && epx.f(this.contacts, messagesGetCallHistoryResponseDto.contacts);
    }

    public final int hashCode() {
        List<MessagesCallHistoryItemDto> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.nextFrom;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.hasMore;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<UsersUserFullDto> list2 = this.profiles;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroupFullDto> list3 = this.groups;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<MessagesContactDto> list4 = this.contacts;
        return hashCode5 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetCallHistoryResponseDto(items=");
        sb.append(this.items);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", hasMore=");
        sb.append(this.hasMore);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", contacts=");
        return ms9.a(')', sb, this.contacts);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MessagesCallHistoryItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MessagesCallHistoryItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Long l = this.nextFrom;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
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
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        List<MessagesContactDto> list4 = this.contacts;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f4 = dn.f(parcel, list4, 1);
        while (f4.hasNext()) {
            parcel.writeParcelable((Parcelable) f4.next(), i);
        }
    }

    public MessagesGetCallHistoryResponseDto(List<MessagesCallHistoryItemDto> list, Long l, Boolean bool, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, List<MessagesContactDto> list4) {
        this.items = list;
        this.nextFrom = l;
        this.hasMore = bool;
        this.profiles = list2;
        this.groups = list3;
        this.contacts = list4;
    }

    public /* synthetic */ MessagesGetCallHistoryResponseDto(List list, Long l, Boolean bool, List list2, List list3, List list4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : list4);
    }
}
