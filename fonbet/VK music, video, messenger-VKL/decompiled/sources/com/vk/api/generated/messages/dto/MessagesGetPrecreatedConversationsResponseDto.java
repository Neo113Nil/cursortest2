package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.fw3;
import xsna.k73;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesGetPrecreatedConversationsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetPrecreatedConversationsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetPrecreatedConversationsResponseDto> CREATOR = new a();

    @pmi0("contacts")
    private final List<MessagesContactDto> contacts;

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<Long> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: MessagesGetPrecreatedConversationsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetPrecreatedConversationsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetPrecreatedConversationsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = k73.b(parcel, arrayList2, i2, 1);
            }
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(MessagesGetPrecreatedConversationsResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList3 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(MessagesGetPrecreatedConversationsResponseDto.class, parcel, arrayList3, i, 1);
                }
            }
            return new MessagesGetPrecreatedConversationsResponseDto(readInt, arrayList2, arrayList, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetPrecreatedConversationsResponseDto[] newArray(int i) {
            return new MessagesGetPrecreatedConversationsResponseDto[i];
        }
    }

    public MessagesGetPrecreatedConversationsResponseDto(int i, List<Long> list, List<UsersUserFullDto> list2, List<MessagesContactDto> list3) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.contacts = list3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetPrecreatedConversationsResponseDto)) {
            return false;
        }
        MessagesGetPrecreatedConversationsResponseDto messagesGetPrecreatedConversationsResponseDto = (MessagesGetPrecreatedConversationsResponseDto) obj;
        return this.count == messagesGetPrecreatedConversationsResponseDto.count && epx.f(this.items, messagesGetPrecreatedConversationsResponseDto.items) && epx.f(this.profiles, messagesGetPrecreatedConversationsResponseDto.profiles) && epx.f(this.contacts, messagesGetPrecreatedConversationsResponseDto.contacts);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<UsersUserFullDto> list = this.profiles;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<MessagesContactDto> list2 = this.contacts;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetPrecreatedConversationsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", contacts=");
        return ms9.a(')', sb, this.contacts);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeLong(((Number) a2.next()).longValue());
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
        List<MessagesContactDto> list2 = this.contacts;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            parcel.writeParcelable((Parcelable) f2.next(), i);
        }
    }

    public /* synthetic */ MessagesGetPrecreatedConversationsResponseDto(int i, List list, List list2, List list3, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3);
    }
}
