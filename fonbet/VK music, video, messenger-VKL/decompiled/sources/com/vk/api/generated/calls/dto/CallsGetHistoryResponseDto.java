package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.messages.dto.MessagesContactDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: CallsGetHistoryResponseDto.kt */
/* loaded from: classes14.dex */
public final class CallsGetHistoryResponseDto implements Parcelable {
    public static final Parcelable.Creator<CallsGetHistoryResponseDto> CREATOR = new a();

    @pmi0("contacts")
    private final List<MessagesContactDto> contacts;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("has_more")
    private final boolean hasMore;

    @pmi0("items")
    private final List<CallsHistoryRecordDto> items;

    @pmi0("next_page_pagination_marker")
    private final Long nextPagePaginationMarker;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: CallsGetHistoryResponseDto.kt */
    public static final class a implements Parcelable.Creator<CallsGetHistoryResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsGetHistoryResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int readInt = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = bo.b(CallsGetHistoryResponseDto.class, parcel, arrayList4, i2, 1);
            }
            boolean z = parcel.readInt() != 0;
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(CallsGetHistoryResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = bo.b(CallsGetHistoryResponseDto.class, parcel, arrayList2, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList3 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(CallsGetHistoryResponseDto.class, parcel, arrayList3, i, 1);
                }
            }
            return new CallsGetHistoryResponseDto(arrayList4, z, valueOf, arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final CallsGetHistoryResponseDto[] newArray(int i) {
            return new CallsGetHistoryResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CallsGetHistoryResponseDto(List<? extends CallsHistoryRecordDto> list, boolean z, Long l, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, List<MessagesContactDto> list4) {
        this.items = list;
        this.hasMore = z;
        this.nextPagePaginationMarker = l;
        this.profiles = list2;
        this.groups = list3;
        this.contacts = list4;
    }

    public final List<MessagesContactDto> d() {
        return this.contacts;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<GroupsGroupFullDto> e() {
        return this.groups;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallsGetHistoryResponseDto)) {
            return false;
        }
        CallsGetHistoryResponseDto callsGetHistoryResponseDto = (CallsGetHistoryResponseDto) obj;
        return epx.f(this.items, callsGetHistoryResponseDto.items) && this.hasMore == callsGetHistoryResponseDto.hasMore && epx.f(this.nextPagePaginationMarker, callsGetHistoryResponseDto.nextPagePaginationMarker) && epx.f(this.profiles, callsGetHistoryResponseDto.profiles) && epx.f(this.groups, callsGetHistoryResponseDto.groups) && epx.f(this.contacts, callsGetHistoryResponseDto.contacts);
    }

    public final boolean f() {
        return this.hasMore;
    }

    public final List<CallsHistoryRecordDto> g() {
        return this.items;
    }

    public final int hashCode() {
        int b = qoy.b(this.items.hashCode() * 31, 31, this.hasMore);
        Long l = this.nextPagePaginationMarker;
        int hashCode = (b + (l == null ? 0 : l.hashCode())) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MessagesContactDto> list3 = this.contacts;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final Long i() {
        return this.nextPagePaginationMarker;
    }

    public final List<UsersUserFullDto> j() {
        return this.profiles;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallsGetHistoryResponseDto(items=");
        sb.append(this.items);
        sb.append(", hasMore=");
        sb.append(this.hasMore);
        sb.append(", nextPagePaginationMarker=");
        sb.append(this.nextPagePaginationMarker);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", contacts=");
        return ms9.a(')', sb, this.contacts);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeInt(this.hasMore ? 1 : 0);
        Long l = this.nextPagePaginationMarker;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
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
        List<MessagesContactDto> list3 = this.contacts;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            parcel.writeParcelable((Parcelable) f3.next(), i);
        }
    }

    public /* synthetic */ CallsGetHistoryResponseDto(List list, boolean z, Long l, List list2, List list3, List list4, int i, zcl zclVar) {
        this(list, z, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : list4);
    }
}
