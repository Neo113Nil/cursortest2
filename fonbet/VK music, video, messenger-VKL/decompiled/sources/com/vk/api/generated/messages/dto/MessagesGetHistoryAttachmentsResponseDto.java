package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesGetHistoryAttachmentsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetHistoryAttachmentsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetHistoryAttachmentsResponseDto> CREATOR = new a();

    @pmi0("cmid_next_from")
    private final String cmidNextFrom;

    @pmi0("contacts")
    private final List<MessagesContactDto> contacts;

    @pmi0("emails")
    private final List<MessagesEmailDto> emails;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<MessagesHistoryAttachmentDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: MessagesGetHistoryAttachmentsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetHistoryAttachmentsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetHistoryAttachmentsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int readInt = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(MessagesHistoryAttachmentDto.CREATOR, parcel, arrayList4, i2, 1);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ArrayList arrayList5 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(MessagesGetHistoryAttachmentsResponseDto.class, parcel, arrayList6, i3, 1);
                }
                arrayList = arrayList6;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = bo.b(MessagesGetHistoryAttachmentsResponseDto.class, parcel, arrayList2, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList3 = new ArrayList(readInt4);
                int i5 = 0;
                while (i5 != readInt4) {
                    i5 = bo.b(MessagesGetHistoryAttachmentsResponseDto.class, parcel, arrayList3, i5, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                arrayList5 = new ArrayList(readInt5);
                while (i != readInt5) {
                    i = en.a(MessagesEmailDto.CREATOR, parcel, arrayList5, i, 1);
                }
            }
            return new MessagesGetHistoryAttachmentsResponseDto(arrayList4, readString, readString2, arrayList, arrayList2, arrayList3, arrayList5);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetHistoryAttachmentsResponseDto[] newArray(int i) {
            return new MessagesGetHistoryAttachmentsResponseDto[i];
        }
    }

    public MessagesGetHistoryAttachmentsResponseDto(List<MessagesHistoryAttachmentDto> list, String str, String str2, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, List<MessagesContactDto> list4, List<MessagesEmailDto> list5) {
        this.items = list;
        this.nextFrom = str;
        this.cmidNextFrom = str2;
        this.profiles = list2;
        this.groups = list3;
        this.contacts = list4;
        this.emails = list5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetHistoryAttachmentsResponseDto)) {
            return false;
        }
        MessagesGetHistoryAttachmentsResponseDto messagesGetHistoryAttachmentsResponseDto = (MessagesGetHistoryAttachmentsResponseDto) obj;
        return epx.f(this.items, messagesGetHistoryAttachmentsResponseDto.items) && epx.f(this.nextFrom, messagesGetHistoryAttachmentsResponseDto.nextFrom) && epx.f(this.cmidNextFrom, messagesGetHistoryAttachmentsResponseDto.cmidNextFrom) && epx.f(this.profiles, messagesGetHistoryAttachmentsResponseDto.profiles) && epx.f(this.groups, messagesGetHistoryAttachmentsResponseDto.groups) && epx.f(this.contacts, messagesGetHistoryAttachmentsResponseDto.contacts) && epx.f(this.emails, messagesGetHistoryAttachmentsResponseDto.emails);
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        String str = this.nextFrom;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cmidNextFrom;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MessagesContactDto> list3 = this.contacts;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<MessagesEmailDto> list4 = this.emails;
        return hashCode6 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetHistoryAttachmentsResponseDto(items=");
        sb.append(this.items);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", cmidNextFrom=");
        sb.append(this.cmidNextFrom);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", contacts=");
        sb.append(this.contacts);
        sb.append(", emails=");
        return ms9.a(')', sb, this.emails);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MessagesHistoryAttachmentDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.nextFrom);
        parcel.writeString(this.cmidNextFrom);
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
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        List<MessagesEmailDto> list4 = this.emails;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f4 = dn.f(parcel, list4, 1);
        while (f4.hasNext()) {
            ((MessagesEmailDto) f4.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MessagesGetHistoryAttachmentsResponseDto(List list, String str, String str2, List list2, List list3, List list4, List list5, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : list4, (i & 64) != 0 ? null : list5);
    }
}
