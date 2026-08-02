package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.calls.dto.CallsShortCredentialsDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.voicerooms.dto.VoiceroomsRoomDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: MessagesGetCallPreviewResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetCallPreviewResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetCallPreviewResponseDto> CREATOR = new a();

    @pmi0("anonyms")
    private final List<MessagesAnonymDto> anonyms;

    @pmi0("call_id")
    private final String callId;

    @pmi0("can_join")
    private final Boolean canJoin;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("is_edu")
    private final Boolean isEdu;

    @pmi0(ApiProtocol.KEY_JOIN_LINK)
    private final String joinLink;

    @pmi0("payload")
    private final MessagesConversationPayloadDto payload;

    @pmi0("pmi_link")
    private final String pmiLink;

    @pmi0("preview")
    private final MessagesCallPreviewDto preview;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0(SignalingProtocol.KEY_ROOM)
    private final VoiceroomsRoomDto room;

    @pmi0("secret")
    private final String secret;

    @pmi0("short_credentials")
    private final CallsShortCredentialsDto shortCredentials;

    @pmi0("user_id")
    private final UserId userId;

    @pmi0("vk_join_link")
    private final String vkJoinLink;

    /* compiled from: MessagesGetCallPreviewResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetCallPreviewResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetCallPreviewResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Boolean valueOf;
            Boolean valueOf2;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            CallsShortCredentialsDto createFromParcel = parcel.readInt() == 0 ? null : CallsShortCredentialsDto.CREATOR.createFromParcel(parcel);
            MessagesCallPreviewDto createFromParcel2 = parcel.readInt() == 0 ? null : MessagesCallPreviewDto.CREATOR.createFromParcel(parcel);
            MessagesConversationPayloadDto createFromParcel3 = parcel.readInt() == 0 ? null : MessagesConversationPayloadDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(MessagesGetCallPreviewResponseDto.class, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(MessagesGetCallPreviewResponseDto.class, parcel, arrayList4, i2, 1);
                }
                arrayList2 = arrayList4;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = en.a(MessagesAnonymDto.CREATOR, parcel, arrayList3, i3, 1);
                }
            }
            UserId userId = (UserId) parcel.readParcelable(MessagesGetCallPreviewResponseDto.class.getClassLoader());
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            VoiceroomsRoomDto voiceroomsRoomDto = (VoiceroomsRoomDto) parcel.readParcelable(MessagesGetCallPreviewResponseDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesGetCallPreviewResponseDto(readString, readString2, readString3, createFromParcel, createFromParcel2, createFromParcel3, arrayList, arrayList2, arrayList3, userId, readString4, valueOf, voiceroomsRoomDto, valueOf2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetCallPreviewResponseDto[] newArray(int i) {
            return new MessagesGetCallPreviewResponseDto[i];
        }
    }

    public MessagesGetCallPreviewResponseDto(String str, String str2, String str3, CallsShortCredentialsDto callsShortCredentialsDto, MessagesCallPreviewDto messagesCallPreviewDto, MessagesConversationPayloadDto messagesConversationPayloadDto, List<UsersUserFullDto> list, List<GroupsGroupFullDto> list2, List<MessagesAnonymDto> list3, UserId userId, String str4, Boolean bool, VoiceroomsRoomDto voiceroomsRoomDto, Boolean bool2, String str5) {
        this.callId = str;
        this.joinLink = str2;
        this.vkJoinLink = str3;
        this.shortCredentials = callsShortCredentialsDto;
        this.preview = messagesCallPreviewDto;
        this.payload = messagesConversationPayloadDto;
        this.profiles = list;
        this.groups = list2;
        this.anonyms = list3;
        this.userId = userId;
        this.secret = str4;
        this.canJoin = bool;
        this.room = voiceroomsRoomDto;
        this.isEdu = bool2;
        this.pmiLink = str5;
    }

    public final String d() {
        return this.callId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.joinLink;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetCallPreviewResponseDto)) {
            return false;
        }
        MessagesGetCallPreviewResponseDto messagesGetCallPreviewResponseDto = (MessagesGetCallPreviewResponseDto) obj;
        return epx.f(this.callId, messagesGetCallPreviewResponseDto.callId) && epx.f(this.joinLink, messagesGetCallPreviewResponseDto.joinLink) && epx.f(this.vkJoinLink, messagesGetCallPreviewResponseDto.vkJoinLink) && epx.f(this.shortCredentials, messagesGetCallPreviewResponseDto.shortCredentials) && epx.f(this.preview, messagesGetCallPreviewResponseDto.preview) && epx.f(this.payload, messagesGetCallPreviewResponseDto.payload) && epx.f(this.profiles, messagesGetCallPreviewResponseDto.profiles) && epx.f(this.groups, messagesGetCallPreviewResponseDto.groups) && epx.f(this.anonyms, messagesGetCallPreviewResponseDto.anonyms) && epx.f(this.userId, messagesGetCallPreviewResponseDto.userId) && epx.f(this.secret, messagesGetCallPreviewResponseDto.secret) && epx.f(this.canJoin, messagesGetCallPreviewResponseDto.canJoin) && epx.f(this.room, messagesGetCallPreviewResponseDto.room) && epx.f(this.isEdu, messagesGetCallPreviewResponseDto.isEdu) && epx.f(this.pmiLink, messagesGetCallPreviewResponseDto.pmiLink);
    }

    public final MessagesCallPreviewDto f() {
        return this.preview;
    }

    public final String g() {
        return this.secret;
    }

    public final UserId getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        int hashCode = this.callId.hashCode() * 31;
        String str = this.joinLink;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.vkJoinLink;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CallsShortCredentialsDto callsShortCredentialsDto = this.shortCredentials;
        int hashCode4 = (hashCode3 + (callsShortCredentialsDto == null ? 0 : callsShortCredentialsDto.hashCode())) * 31;
        MessagesCallPreviewDto messagesCallPreviewDto = this.preview;
        int hashCode5 = (hashCode4 + (messagesCallPreviewDto == null ? 0 : messagesCallPreviewDto.hashCode())) * 31;
        MessagesConversationPayloadDto messagesConversationPayloadDto = this.payload;
        int hashCode6 = (hashCode5 + (messagesConversationPayloadDto == null ? 0 : messagesConversationPayloadDto.hashCode())) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MessagesAnonymDto> list3 = this.anonyms;
        int hashCode9 = (hashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        UserId userId = this.userId;
        int hashCode10 = (hashCode9 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str3 = this.secret;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.canJoin;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        VoiceroomsRoomDto voiceroomsRoomDto = this.room;
        int hashCode13 = (hashCode12 + (voiceroomsRoomDto == null ? 0 : voiceroomsRoomDto.hashCode())) * 31;
        Boolean bool2 = this.isEdu;
        int hashCode14 = (hashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.pmiLink;
        return hashCode14 + (str4 != null ? str4.hashCode() : 0);
    }

    public final CallsShortCredentialsDto i() {
        return this.shortCredentials;
    }

    public final String j() {
        return this.vkJoinLink;
    }

    public final Boolean k() {
        return this.isEdu;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetCallPreviewResponseDto(callId=");
        sb.append(this.callId);
        sb.append(", joinLink=");
        sb.append(this.joinLink);
        sb.append(", vkJoinLink=");
        sb.append(this.vkJoinLink);
        sb.append(", shortCredentials=");
        sb.append(this.shortCredentials);
        sb.append(", preview=");
        sb.append(this.preview);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", anonyms=");
        sb.append(this.anonyms);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", secret=");
        sb.append(this.secret);
        sb.append(", canJoin=");
        sb.append(this.canJoin);
        sb.append(", room=");
        sb.append(this.room);
        sb.append(", isEdu=");
        sb.append(this.isEdu);
        sb.append(", pmiLink=");
        return ho8.a(sb, this.pmiLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.callId);
        parcel.writeString(this.joinLink);
        parcel.writeString(this.vkJoinLink);
        CallsShortCredentialsDto callsShortCredentialsDto = this.shortCredentials;
        if (callsShortCredentialsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            callsShortCredentialsDto.writeToParcel(parcel, i);
        }
        MessagesCallPreviewDto messagesCallPreviewDto = this.preview;
        if (messagesCallPreviewDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesCallPreviewDto.writeToParcel(parcel, i);
        }
        MessagesConversationPayloadDto messagesConversationPayloadDto = this.payload;
        if (messagesConversationPayloadDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesConversationPayloadDto.writeToParcel(parcel, i);
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
        List<GroupsGroupFullDto> list2 = this.groups;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<MessagesAnonymDto> list3 = this.anonyms;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((MessagesAnonymDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeParcelable(this.userId, i);
        parcel.writeString(this.secret);
        Boolean bool = this.canJoin;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeParcelable(this.room, i);
        Boolean bool2 = this.isEdu;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.pmiLink);
    }

    public /* synthetic */ MessagesGetCallPreviewResponseDto(String str, String str2, String str3, CallsShortCredentialsDto callsShortCredentialsDto, MessagesCallPreviewDto messagesCallPreviewDto, MessagesConversationPayloadDto messagesConversationPayloadDto, List list, List list2, List list3, UserId userId, String str4, Boolean bool, VoiceroomsRoomDto voiceroomsRoomDto, Boolean bool2, String str5, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : callsShortCredentialsDto, (i & 16) != 0 ? null : messagesCallPreviewDto, (i & 32) != 0 ? null : messagesConversationPayloadDto, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : list3, (i & 512) != 0 ? null : userId, (i & 1024) != 0 ? null : str4, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : voiceroomsRoomDto, (i & 8192) != 0 ? null : bool2, (i & 16384) != 0 ? null : str5);
    }
}
