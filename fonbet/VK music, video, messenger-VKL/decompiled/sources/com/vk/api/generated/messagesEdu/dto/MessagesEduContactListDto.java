package com.vk.api.generated.messagesEdu.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.messages.dto.MessagesContactDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesEduContactListDto.kt */
/* loaded from: classes15.dex */
public final class MessagesEduContactListDto implements Parcelable {
    public static final Parcelable.Creator<MessagesEduContactListDto> CREATOR = new a();

    @pmi0("contacts")
    private final List<MessagesContactDto> contacts;

    @pmi0("contacts_last_update")
    private final Long contactsLastUpdate;

    @pmi0("edu_roles")
    private final List<MessagesEduEduRolesDto> eduRoles;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("sections")
    private final List<MessagesEduContactListSectionDto> sections;

    /* compiled from: MessagesEduContactListDto.kt */
    public static final class a implements Parcelable.Creator<MessagesEduContactListDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesEduContactListDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(MessagesEduContactListSectionDto.CREATOR, parcel, arrayList5, i2, 1);
                }
                arrayList = arrayList5;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(MessagesEduContactListDto.class, parcel, arrayList6, i3, 1);
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
                    i4 = bo.b(MessagesEduContactListDto.class, parcel, arrayList7, i4, 1);
                }
                arrayList3 = arrayList7;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(MessagesEduContactListDto.class, parcel, arrayList8, i, 1);
                }
                arrayList4 = arrayList8;
            }
            return new MessagesEduContactListDto(arrayList, arrayList2, arrayList3, arrayList4, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesEduContactListDto[] newArray(int i) {
            return new MessagesEduContactListDto[i];
        }
    }

    public MessagesEduContactListDto() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesEduContactListDto)) {
            return false;
        }
        MessagesEduContactListDto messagesEduContactListDto = (MessagesEduContactListDto) obj;
        return epx.f(this.sections, messagesEduContactListDto.sections) && epx.f(this.profiles, messagesEduContactListDto.profiles) && epx.f(this.eduRoles, messagesEduContactListDto.eduRoles) && epx.f(this.contacts, messagesEduContactListDto.contacts) && epx.f(this.contactsLastUpdate, messagesEduContactListDto.contactsLastUpdate);
    }

    public final int hashCode() {
        List<MessagesEduContactListSectionDto> list = this.sections;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<UsersUserFullDto> list2 = this.profiles;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MessagesEduEduRolesDto> list3 = this.eduRoles;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<MessagesContactDto> list4 = this.contacts;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Long l = this.contactsLastUpdate;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesEduContactListDto(sections=");
        sb.append(this.sections);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", eduRoles=");
        sb.append(this.eduRoles);
        sb.append(", contacts=");
        sb.append(this.contacts);
        sb.append(", contactsLastUpdate=");
        return iq.b(sb, this.contactsLastUpdate, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MessagesEduContactListSectionDto> list = this.sections;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MessagesEduContactListSectionDto) f.next()).writeToParcel(parcel, i);
            }
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
        List<MessagesEduEduRolesDto> list3 = this.eduRoles;
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
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                parcel.writeParcelable((Parcelable) f4.next(), i);
            }
        }
        Long l = this.contactsLastUpdate;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
    }

    public MessagesEduContactListDto(List<MessagesEduContactListSectionDto> list, List<UsersUserFullDto> list2, List<MessagesEduEduRolesDto> list3, List<MessagesContactDto> list4, Long l) {
        this.sections = list;
        this.profiles = list2;
        this.eduRoles = list3;
        this.contacts = list4;
        this.contactsLastUpdate = l;
    }

    public /* synthetic */ MessagesEduContactListDto(List list, List list2, List list3, List list4, Long l, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4, (i & 16) != 0 ? null : l);
    }
}
