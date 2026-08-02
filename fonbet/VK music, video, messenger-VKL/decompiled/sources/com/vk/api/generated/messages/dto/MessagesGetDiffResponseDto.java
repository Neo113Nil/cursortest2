package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MessagesGetDiffResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetDiffResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetDiffResponseDto> CREATOR = new a();

    @pmi0("changed_objects")
    private final MessagesChangedObjectsDto changedObjects;

    @pmi0("contacts")
    private final List<MessagesContactDto> contacts;

    @pmi0("conversations_banner")
    private final MessagesConversationBarDto conversationsBanner;

    @pmi0("conversations_info")
    private final List<MessagesConversationInfoDto> conversationsInfo;

    @pmi0("conversations_source")
    private final String conversationsSource;

    @pmi0("counters")
    private final MessagesCountersDto counters;

    @pmi0("credentials")
    private final MessagesCredentialsDto credentials;

    @pmi0("folders")
    private final MessagesFoldersInfoDto folders;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("invalidate_all")
    private final Boolean invalidateAll;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("server_time")
    private final Long serverTime;

    @pmi0("server_version")
    private final Long serverVersion;

    /* compiled from: MessagesGetDiffResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetDiffResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetDiffResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MessagesConversationInfoDto.CREATOR, parcel, arrayList5, i, 1);
                }
                arrayList = arrayList5;
            }
            MessagesFoldersInfoDto createFromParcel = parcel.readInt() == 0 ? null : MessagesFoldersInfoDto.CREATOR.createFromParcel(parcel);
            MessagesCountersDto createFromParcel2 = parcel.readInt() == 0 ? null : MessagesCountersDto.CREATOR.createFromParcel(parcel);
            MessagesConversationBarDto messagesConversationBarDto = (MessagesConversationBarDto) parcel.readParcelable(MessagesGetDiffResponseDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(MessagesGetDiffResponseDto.class, parcel, arrayList6, i2, 1);
                }
                arrayList2 = arrayList6;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(MessagesGetDiffResponseDto.class, parcel, arrayList7, i3, 1);
                }
                arrayList3 = arrayList7;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = bo.b(MessagesGetDiffResponseDto.class, parcel, arrayList8, i4, 1);
                }
                arrayList4 = arrayList8;
            }
            MessagesChangedObjectsDto createFromParcel3 = parcel.readInt() == 0 ? null : MessagesChangedObjectsDto.CREATOR.createFromParcel(parcel);
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            MessagesCredentialsDto createFromParcel4 = parcel.readInt() == 0 ? null : MessagesCredentialsDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesGetDiffResponseDto(arrayList, createFromParcel, createFromParcel2, messagesConversationBarDto, arrayList2, arrayList3, arrayList4, createFromParcel3, valueOf, valueOf2, createFromParcel4, readString, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetDiffResponseDto[] newArray(int i) {
            return new MessagesGetDiffResponseDto[i];
        }
    }

    public MessagesGetDiffResponseDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetDiffResponseDto)) {
            return false;
        }
        MessagesGetDiffResponseDto messagesGetDiffResponseDto = (MessagesGetDiffResponseDto) obj;
        return epx.f(this.conversationsInfo, messagesGetDiffResponseDto.conversationsInfo) && epx.f(this.folders, messagesGetDiffResponseDto.folders) && epx.f(this.counters, messagesGetDiffResponseDto.counters) && epx.f(this.conversationsBanner, messagesGetDiffResponseDto.conversationsBanner) && epx.f(this.profiles, messagesGetDiffResponseDto.profiles) && epx.f(this.groups, messagesGetDiffResponseDto.groups) && epx.f(this.contacts, messagesGetDiffResponseDto.contacts) && epx.f(this.changedObjects, messagesGetDiffResponseDto.changedObjects) && epx.f(this.serverVersion, messagesGetDiffResponseDto.serverVersion) && epx.f(this.serverTime, messagesGetDiffResponseDto.serverTime) && epx.f(this.credentials, messagesGetDiffResponseDto.credentials) && epx.f(this.conversationsSource, messagesGetDiffResponseDto.conversationsSource) && epx.f(this.invalidateAll, messagesGetDiffResponseDto.invalidateAll);
    }

    public final int hashCode() {
        List<MessagesConversationInfoDto> list = this.conversationsInfo;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        MessagesFoldersInfoDto messagesFoldersInfoDto = this.folders;
        int hashCode2 = (hashCode + (messagesFoldersInfoDto == null ? 0 : messagesFoldersInfoDto.hashCode())) * 31;
        MessagesCountersDto messagesCountersDto = this.counters;
        int hashCode3 = (hashCode2 + (messagesCountersDto == null ? 0 : messagesCountersDto.hashCode())) * 31;
        MessagesConversationBarDto messagesConversationBarDto = this.conversationsBanner;
        int hashCode4 = (hashCode3 + (messagesConversationBarDto == null ? 0 : messagesConversationBarDto.hashCode())) * 31;
        List<UsersUserFullDto> list2 = this.profiles;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroupFullDto> list3 = this.groups;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<MessagesContactDto> list4 = this.contacts;
        int hashCode7 = (hashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        MessagesChangedObjectsDto messagesChangedObjectsDto = this.changedObjects;
        int hashCode8 = (hashCode7 + (messagesChangedObjectsDto == null ? 0 : messagesChangedObjectsDto.hashCode())) * 31;
        Long l = this.serverVersion;
        int hashCode9 = (hashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.serverTime;
        int hashCode10 = (hashCode9 + (l2 == null ? 0 : l2.hashCode())) * 31;
        MessagesCredentialsDto messagesCredentialsDto = this.credentials;
        int hashCode11 = (hashCode10 + (messagesCredentialsDto == null ? 0 : messagesCredentialsDto.hashCode())) * 31;
        String str = this.conversationsSource;
        int hashCode12 = (hashCode11 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.invalidateAll;
        return hashCode12 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetDiffResponseDto(conversationsInfo=");
        sb.append(this.conversationsInfo);
        sb.append(", folders=");
        sb.append(this.folders);
        sb.append(", counters=");
        sb.append(this.counters);
        sb.append(", conversationsBanner=");
        sb.append(this.conversationsBanner);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", contacts=");
        sb.append(this.contacts);
        sb.append(", changedObjects=");
        sb.append(this.changedObjects);
        sb.append(", serverVersion=");
        sb.append(this.serverVersion);
        sb.append(", serverTime=");
        sb.append(this.serverTime);
        sb.append(", credentials=");
        sb.append(this.credentials);
        sb.append(", conversationsSource=");
        sb.append(this.conversationsSource);
        sb.append(", invalidateAll=");
        return tn.a(sb, this.invalidateAll, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MessagesConversationInfoDto> list = this.conversationsInfo;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MessagesConversationInfoDto) f.next()).writeToParcel(parcel, i);
            }
        }
        MessagesFoldersInfoDto messagesFoldersInfoDto = this.folders;
        if (messagesFoldersInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesFoldersInfoDto.writeToParcel(parcel, i);
        }
        MessagesCountersDto messagesCountersDto = this.counters;
        if (messagesCountersDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesCountersDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.conversationsBanner, i);
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
        List<MessagesContactDto> list4 = this.contacts;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                parcel.writeParcelable((Parcelable) f4.next(), i);
            }
        }
        MessagesChangedObjectsDto messagesChangedObjectsDto = this.changedObjects;
        if (messagesChangedObjectsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesChangedObjectsDto.writeToParcel(parcel, i);
        }
        Long l = this.serverVersion;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        Long l2 = this.serverTime;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l2);
        }
        MessagesCredentialsDto messagesCredentialsDto = this.credentials;
        if (messagesCredentialsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesCredentialsDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.conversationsSource);
        Boolean bool = this.invalidateAll;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public MessagesGetDiffResponseDto(List<MessagesConversationInfoDto> list, MessagesFoldersInfoDto messagesFoldersInfoDto, MessagesCountersDto messagesCountersDto, MessagesConversationBarDto messagesConversationBarDto, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, List<MessagesContactDto> list4, MessagesChangedObjectsDto messagesChangedObjectsDto, Long l, Long l2, MessagesCredentialsDto messagesCredentialsDto, String str, Boolean bool) {
        this.conversationsInfo = list;
        this.folders = messagesFoldersInfoDto;
        this.counters = messagesCountersDto;
        this.conversationsBanner = messagesConversationBarDto;
        this.profiles = list2;
        this.groups = list3;
        this.contacts = list4;
        this.changedObjects = messagesChangedObjectsDto;
        this.serverVersion = l;
        this.serverTime = l2;
        this.credentials = messagesCredentialsDto;
        this.conversationsSource = str;
        this.invalidateAll = bool;
    }

    public /* synthetic */ MessagesGetDiffResponseDto(List list, MessagesFoldersInfoDto messagesFoldersInfoDto, MessagesCountersDto messagesCountersDto, MessagesConversationBarDto messagesConversationBarDto, List list2, List list3, List list4, MessagesChangedObjectsDto messagesChangedObjectsDto, Long l, Long l2, MessagesCredentialsDto messagesCredentialsDto, String str, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : messagesFoldersInfoDto, (i & 4) != 0 ? null : messagesCountersDto, (i & 8) != 0 ? null : messagesConversationBarDto, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : list3, (i & 64) != 0 ? null : list4, (i & 128) != 0 ? null : messagesChangedObjectsDto, (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : l2, (i & 1024) != 0 ? null : messagesCredentialsDto, (i & 2048) != 0 ? null : str, (i & 4096) != 0 ? null : bool);
    }
}
