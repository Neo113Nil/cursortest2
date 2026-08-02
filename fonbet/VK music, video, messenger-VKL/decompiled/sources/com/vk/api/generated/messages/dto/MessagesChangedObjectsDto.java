package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MessagesChangedObjectsDto.kt */
/* loaded from: classes15.dex */
public final class MessagesChangedObjectsDto implements Parcelable {
    public static final Parcelable.Creator<MessagesChangedObjectsDto> CREATOR = new a();

    @pmi0("contacts_last_update")
    private final int contactsLastUpdate;

    @pmi0("delete_items")
    private final List<UserId> deleteItems;

    @pmi0("drop_contacts")
    private final Boolean dropContacts;

    @pmi0("edu")
    private final MessagesEducationEventsInfoDto edu;

    @pmi0("items")
    private final List<UserId> items;

    /* compiled from: MessagesChangedObjectsDto.kt */
    public static final class a implements Parcelable.Creator<MessagesChangedObjectsDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesChangedObjectsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int readInt = parcel.readInt();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = bo.b(MessagesChangedObjectsDto.class, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                int i2 = 0;
                while (i2 != readInt3) {
                    i2 = bo.b(MessagesChangedObjectsDto.class, parcel, arrayList2, i2, 1);
                }
            }
            MessagesEducationEventsInfoDto createFromParcel = parcel.readInt() == 0 ? null : MessagesEducationEventsInfoDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesChangedObjectsDto(readInt, arrayList, arrayList2, createFromParcel, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesChangedObjectsDto[] newArray(int i) {
            return new MessagesChangedObjectsDto[i];
        }
    }

    public MessagesChangedObjectsDto(int i, List<UserId> list, List<UserId> list2, MessagesEducationEventsInfoDto messagesEducationEventsInfoDto, Boolean bool) {
        this.contactsLastUpdate = i;
        this.items = list;
        this.deleteItems = list2;
        this.edu = messagesEducationEventsInfoDto;
        this.dropContacts = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChangedObjectsDto)) {
            return false;
        }
        MessagesChangedObjectsDto messagesChangedObjectsDto = (MessagesChangedObjectsDto) obj;
        return this.contactsLastUpdate == messagesChangedObjectsDto.contactsLastUpdate && epx.f(this.items, messagesChangedObjectsDto.items) && epx.f(this.deleteItems, messagesChangedObjectsDto.deleteItems) && epx.f(this.edu, messagesChangedObjectsDto.edu) && epx.f(this.dropContacts, messagesChangedObjectsDto.dropContacts);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.contactsLastUpdate) * 31;
        List<UserId> list = this.items;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<UserId> list2 = this.deleteItems;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        MessagesEducationEventsInfoDto messagesEducationEventsInfoDto = this.edu;
        int hashCode4 = (hashCode3 + (messagesEducationEventsInfoDto == null ? 0 : messagesEducationEventsInfoDto.hashCode())) * 31;
        Boolean bool = this.dropContacts;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesChangedObjectsDto(contactsLastUpdate=");
        sb.append(this.contactsLastUpdate);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", deleteItems=");
        sb.append(this.deleteItems);
        sb.append(", edu=");
        sb.append(this.edu);
        sb.append(", dropContacts=");
        return tn.a(sb, this.dropContacts, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.contactsLastUpdate);
        List<UserId> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<UserId> list2 = this.deleteItems;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        MessagesEducationEventsInfoDto messagesEducationEventsInfoDto = this.edu;
        if (messagesEducationEventsInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesEducationEventsInfoDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.dropContacts;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ MessagesChangedObjectsDto(int i, List list, List list2, MessagesEducationEventsInfoDto messagesEducationEventsInfoDto, Boolean bool, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : messagesEducationEventsInfoDto, (i2 & 16) != 0 ? null : bool);
    }
}
