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
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesGetCallParticipantsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetCallParticipantsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetCallParticipantsResponseDto> CREATOR = new a();

    @pmi0("anonyms")
    private final List<MessagesAnonymDto> anonyms;

    @pmi0("contacts")
    private final List<MessagesContactDto> contacts;

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("secret")
    private final String secret;

    /* compiled from: MessagesGetCallParticipantsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetCallParticipantsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetCallParticipantsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int readInt = parcel.readInt();
            int i = 0;
            ArrayList arrayList4 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(MessagesGetCallParticipantsResponseDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = en.a(MessagesAnonymDto.CREATOR, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList3 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = bo.b(MessagesGetCallParticipantsResponseDto.class, parcel, arrayList3, i4, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                arrayList4 = new ArrayList(readInt5);
                while (i != readInt5) {
                    i = bo.b(MessagesGetCallParticipantsResponseDto.class, parcel, arrayList4, i, 1);
                }
            }
            return new MessagesGetCallParticipantsResponseDto(readInt, arrayList, arrayList2, arrayList3, arrayList4, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetCallParticipantsResponseDto[] newArray(int i) {
            return new MessagesGetCallParticipantsResponseDto[i];
        }
    }

    public MessagesGetCallParticipantsResponseDto(int i, List<UsersUserFullDto> list, List<MessagesAnonymDto> list2, List<GroupsGroupFullDto> list3, List<MessagesContactDto> list4, String str) {
        this.count = i;
        this.profiles = list;
        this.anonyms = list2;
        this.groups = list3;
        this.contacts = list4;
        this.secret = str;
    }

    public final List<MessagesAnonymDto> d() {
        return this.anonyms;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<MessagesContactDto> e() {
        return this.contacts;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetCallParticipantsResponseDto)) {
            return false;
        }
        MessagesGetCallParticipantsResponseDto messagesGetCallParticipantsResponseDto = (MessagesGetCallParticipantsResponseDto) obj;
        return this.count == messagesGetCallParticipantsResponseDto.count && epx.f(this.profiles, messagesGetCallParticipantsResponseDto.profiles) && epx.f(this.anonyms, messagesGetCallParticipantsResponseDto.anonyms) && epx.f(this.groups, messagesGetCallParticipantsResponseDto.groups) && epx.f(this.contacts, messagesGetCallParticipantsResponseDto.contacts) && epx.f(this.secret, messagesGetCallParticipantsResponseDto.secret);
    }

    public final List<GroupsGroupFullDto> f() {
        return this.groups;
    }

    public final List<UsersUserFullDto> g() {
        return this.profiles;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.count) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<MessagesAnonymDto> list2 = this.anonyms;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroupFullDto> list3 = this.groups;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<MessagesContactDto> list4 = this.contacts;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str = this.secret;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final String i() {
        return this.secret;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetCallParticipantsResponseDto(count=");
        sb.append(this.count);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", anonyms=");
        sb.append(this.anonyms);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", contacts=");
        sb.append(this.contacts);
        sb.append(", secret=");
        return ho8.a(sb, this.secret, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        List<UsersUserFullDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<MessagesAnonymDto> list2 = this.anonyms;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((MessagesAnonymDto) f2.next()).writeToParcel(parcel, i);
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
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                parcel.writeParcelable((Parcelable) f4.next(), i);
            }
        }
        parcel.writeString(this.secret);
    }

    public /* synthetic */ MessagesGetCallParticipantsResponseDto(int i, List list, List list2, List list3, List list4, String str, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3, (i2 & 16) != 0 ? null : list4, (i2 & 32) != 0 ? null : str);
    }
}
