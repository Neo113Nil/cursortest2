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

/* compiled from: MessagesEduUserSearchDto.kt */
/* loaded from: classes15.dex */
public final class MessagesEduUserSearchDto implements Parcelable {
    public static final Parcelable.Creator<MessagesEduUserSearchDto> CREATOR = new a();

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

    @pmi0("total_count")
    private final int totalCount;

    /* compiled from: MessagesEduUserSearchDto.kt */
    public static final class a implements Parcelable.Creator<MessagesEduUserSearchDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesEduUserSearchDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            int readInt = parcel.readInt();
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(MessagesEduContactListSectionDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(MessagesEduUserSearchDto.class, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList3 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = bo.b(MessagesEduUserSearchDto.class, parcel, arrayList3, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList4 = new ArrayList(readInt5);
                while (i != readInt5) {
                    i = bo.b(MessagesEduUserSearchDto.class, parcel, arrayList4, i, 1);
                }
            }
            return new MessagesEduUserSearchDto(readInt, arrayList, arrayList2, arrayList3, arrayList4, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesEduUserSearchDto[] newArray(int i) {
            return new MessagesEduUserSearchDto[i];
        }
    }

    public MessagesEduUserSearchDto(int i, List<MessagesEduContactListSectionDto> list, List<UsersUserFullDto> list2, List<MessagesEduEduRolesDto> list3, List<MessagesContactDto> list4, Long l) {
        this.totalCount = i;
        this.sections = list;
        this.profiles = list2;
        this.eduRoles = list3;
        this.contacts = list4;
        this.contactsLastUpdate = l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesEduUserSearchDto)) {
            return false;
        }
        MessagesEduUserSearchDto messagesEduUserSearchDto = (MessagesEduUserSearchDto) obj;
        return this.totalCount == messagesEduUserSearchDto.totalCount && epx.f(this.sections, messagesEduUserSearchDto.sections) && epx.f(this.profiles, messagesEduUserSearchDto.profiles) && epx.f(this.eduRoles, messagesEduUserSearchDto.eduRoles) && epx.f(this.contacts, messagesEduUserSearchDto.contacts) && epx.f(this.contactsLastUpdate, messagesEduUserSearchDto.contactsLastUpdate);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.totalCount) * 31;
        List<MessagesEduContactListSectionDto> list = this.sections;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<UsersUserFullDto> list2 = this.profiles;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MessagesEduEduRolesDto> list3 = this.eduRoles;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<MessagesContactDto> list4 = this.contacts;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Long l = this.contactsLastUpdate;
        return hashCode5 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesEduUserSearchDto(totalCount=");
        sb.append(this.totalCount);
        sb.append(", sections=");
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
        parcel.writeInt(this.totalCount);
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

    public /* synthetic */ MessagesEduUserSearchDto(int i, List list, List list2, List list3, List list4, Long l, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3, (i2 & 16) != 0 ? null : list4, (i2 & 32) != 0 ? null : l);
    }
}
