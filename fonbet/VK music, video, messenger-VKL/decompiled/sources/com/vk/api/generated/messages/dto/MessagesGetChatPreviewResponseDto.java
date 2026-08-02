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
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesGetChatPreviewResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetChatPreviewResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetChatPreviewResponseDto> CREATOR = new a();

    @pmi0("contacts")
    private final List<MessagesContactDto> contacts;

    @pmi0("emails")
    private final List<MessagesEmailDto> emails;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("preview")
    private final MessagesChatPreviewDto preview;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: MessagesGetChatPreviewResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetChatPreviewResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetChatPreviewResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            MessagesChatPreviewDto createFromParcel = MessagesChatPreviewDto.CREATOR.createFromParcel(parcel);
            int i = 0;
            ArrayList arrayList4 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(MessagesGetChatPreviewResponseDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(MessagesGetChatPreviewResponseDto.class, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = bo.b(MessagesGetChatPreviewResponseDto.class, parcel, arrayList3, i4, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = en.a(MessagesEmailDto.CREATOR, parcel, arrayList4, i, 1);
                }
            }
            return new MessagesGetChatPreviewResponseDto(createFromParcel, arrayList, arrayList2, arrayList3, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetChatPreviewResponseDto[] newArray(int i) {
            return new MessagesGetChatPreviewResponseDto[i];
        }
    }

    public MessagesGetChatPreviewResponseDto(MessagesChatPreviewDto messagesChatPreviewDto, List<UsersUserFullDto> list, List<GroupsGroupFullDto> list2, List<MessagesContactDto> list3, List<MessagesEmailDto> list4) {
        this.preview = messagesChatPreviewDto;
        this.profiles = list;
        this.groups = list2;
        this.contacts = list3;
        this.emails = list4;
    }

    public final MessagesChatPreviewDto d() {
        return this.preview;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetChatPreviewResponseDto)) {
            return false;
        }
        MessagesGetChatPreviewResponseDto messagesGetChatPreviewResponseDto = (MessagesGetChatPreviewResponseDto) obj;
        return epx.f(this.preview, messagesGetChatPreviewResponseDto.preview) && epx.f(this.profiles, messagesGetChatPreviewResponseDto.profiles) && epx.f(this.groups, messagesGetChatPreviewResponseDto.groups) && epx.f(this.contacts, messagesGetChatPreviewResponseDto.contacts) && epx.f(this.emails, messagesGetChatPreviewResponseDto.emails);
    }

    public final int hashCode() {
        int hashCode = this.preview.hashCode() * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MessagesContactDto> list3 = this.contacts;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<MessagesEmailDto> list4 = this.emails;
        return hashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetChatPreviewResponseDto(preview=");
        sb.append(this.preview);
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
        this.preview.writeToParcel(parcel, i);
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

    public /* synthetic */ MessagesGetChatPreviewResponseDto(MessagesChatPreviewDto messagesChatPreviewDto, List list, List list2, List list3, List list4, int i, zcl zclVar) {
        this(messagesChatPreviewDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : list4);
    }
}
