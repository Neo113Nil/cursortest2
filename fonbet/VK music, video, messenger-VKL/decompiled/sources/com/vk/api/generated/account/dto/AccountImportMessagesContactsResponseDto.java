package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.messages.dto.MessagesContactDto;
import com.vk.api.generated.messages.dto.MessagesEmailDto;
import com.vk.api.generated.messages.dto.MessagesImportObjectDto;
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
import xsna.zcl;

/* compiled from: AccountImportMessagesContactsResponseDto.kt */
/* loaded from: classes14.dex */
public final class AccountImportMessagesContactsResponseDto implements Parcelable {
    public static final Parcelable.Creator<AccountImportMessagesContactsResponseDto> CREATOR = new a();

    @pmi0("contacts")
    private final List<MessagesContactDto> contacts;

    @pmi0("emails")
    private final List<MessagesEmailDto> emails;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final MessagesImportObjectDto items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: AccountImportMessagesContactsResponseDto.kt */
    public static final class a implements Parcelable.Creator<AccountImportMessagesContactsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountImportMessagesContactsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            MessagesImportObjectDto createFromParcel = MessagesImportObjectDto.CREATOR.createFromParcel(parcel);
            int i = 0;
            ArrayList arrayList4 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(AccountImportMessagesContactsResponseDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(AccountImportMessagesContactsResponseDto.class, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = bo.b(AccountImportMessagesContactsResponseDto.class, parcel, arrayList3, i4, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = en.a(MessagesEmailDto.CREATOR, parcel, arrayList4, i, 1);
                }
            }
            return new AccountImportMessagesContactsResponseDto(createFromParcel, arrayList, arrayList2, arrayList3, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountImportMessagesContactsResponseDto[] newArray(int i) {
            return new AccountImportMessagesContactsResponseDto[i];
        }
    }

    public AccountImportMessagesContactsResponseDto(MessagesImportObjectDto messagesImportObjectDto, List<MessagesContactDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, List<MessagesEmailDto> list4) {
        this.items = messagesImportObjectDto;
        this.contacts = list;
        this.profiles = list2;
        this.groups = list3;
        this.emails = list4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountImportMessagesContactsResponseDto)) {
            return false;
        }
        AccountImportMessagesContactsResponseDto accountImportMessagesContactsResponseDto = (AccountImportMessagesContactsResponseDto) obj;
        return epx.f(this.items, accountImportMessagesContactsResponseDto.items) && epx.f(this.contacts, accountImportMessagesContactsResponseDto.contacts) && epx.f(this.profiles, accountImportMessagesContactsResponseDto.profiles) && epx.f(this.groups, accountImportMessagesContactsResponseDto.groups) && epx.f(this.emails, accountImportMessagesContactsResponseDto.emails);
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        List<MessagesContactDto> list = this.contacts;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<UsersUserFullDto> list2 = this.profiles;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroupFullDto> list3 = this.groups;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<MessagesEmailDto> list4 = this.emails;
        return hashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountImportMessagesContactsResponseDto(items=");
        sb.append(this.items);
        sb.append(", contacts=");
        sb.append(this.contacts);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", emails=");
        return ms9.a(')', sb, this.emails);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.items.writeToParcel(parcel, i);
        List<MessagesContactDto> list = this.contacts;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
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
        List<GroupsGroupFullDto> list3 = this.groups;
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

    public /* synthetic */ AccountImportMessagesContactsResponseDto(MessagesImportObjectDto messagesImportObjectDto, List list, List list2, List list3, List list4, int i, zcl zclVar) {
        this(messagesImportObjectDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : list4);
    }
}
