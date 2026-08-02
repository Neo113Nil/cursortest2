package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesScheduledCallSingleItemDto.kt */
/* loaded from: classes15.dex */
public final class MessagesScheduledCallSingleItemDto implements Parcelable {
    public static final Parcelable.Creator<MessagesScheduledCallSingleItemDto> CREATOR = new a();

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final MessagesScheduledCallItemDto item;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: MessagesScheduledCallSingleItemDto.kt */
    public static final class a implements Parcelable.Creator<MessagesScheduledCallSingleItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesScheduledCallSingleItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            MessagesScheduledCallItemDto createFromParcel = MessagesScheduledCallItemDto.CREATOR.createFromParcel(parcel);
            int i = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(MessagesScheduledCallSingleItemDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(MessagesScheduledCallSingleItemDto.class, parcel, arrayList2, i, 1);
                }
            }
            return new MessagesScheduledCallSingleItemDto(createFromParcel, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesScheduledCallSingleItemDto[] newArray(int i) {
            return new MessagesScheduledCallSingleItemDto[i];
        }
    }

    public MessagesScheduledCallSingleItemDto(MessagesScheduledCallItemDto messagesScheduledCallItemDto, List<UsersUserFullDto> list, List<GroupsGroupFullDto> list2) {
        this.item = messagesScheduledCallItemDto;
        this.profiles = list;
        this.groups = list2;
    }

    public final MessagesScheduledCallItemDto d() {
        return this.item;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesScheduledCallSingleItemDto)) {
            return false;
        }
        MessagesScheduledCallSingleItemDto messagesScheduledCallSingleItemDto = (MessagesScheduledCallSingleItemDto) obj;
        return epx.f(this.item, messagesScheduledCallSingleItemDto.item) && epx.f(this.profiles, messagesScheduledCallSingleItemDto.profiles) && epx.f(this.groups, messagesScheduledCallSingleItemDto.groups);
    }

    public final int hashCode() {
        int hashCode = this.item.hashCode() * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesScheduledCallSingleItemDto(item=");
        sb.append(this.item);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.item.writeToParcel(parcel, i);
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

    public /* synthetic */ MessagesScheduledCallSingleItemDto(MessagesScheduledCallItemDto messagesScheduledCallItemDto, List list, List list2, int i, zcl zclVar) {
        this(messagesScheduledCallItemDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
