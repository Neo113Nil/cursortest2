package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.calls.dto.CallsParticipantsDto;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: MessagesCallInProgressDto.kt */
/* loaded from: classes15.dex */
public final class MessagesCallInProgressDto implements Parcelable {
    public static final Parcelable.Creator<MessagesCallInProgressDto> CREATOR = new a();

    @pmi0("call_id")
    private final String callId;

    @pmi0("can_finish_call")
    private final Boolean canFinishCall;

    @pmi0("has_link")
    private final Boolean hasLink;

    @pmi0(ApiProtocol.KEY_JOIN_LINK)
    private final String joinLink;

    @pmi0(SignalingProtocol.KEY_PARTICIPANTS)
    private final CallsParticipantsDto participants;

    @pmi0("pmi_link")
    private final String pmiLink;

    @pmi0("vk_join_link")
    private final String vkJoinLink;

    /* compiled from: MessagesCallInProgressDto.kt */
    public static final class a implements Parcelable.Creator<MessagesCallInProgressDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesCallInProgressDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            CallsParticipantsDto createFromParcel = CallsParticipantsDto.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesCallInProgressDto(readString, createFromParcel, readString2, valueOf, bool, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesCallInProgressDto[] newArray(int i) {
            return new MessagesCallInProgressDto[i];
        }
    }

    public MessagesCallInProgressDto(String str, CallsParticipantsDto callsParticipantsDto, String str2, Boolean bool, Boolean bool2, String str3, String str4) {
        this.callId = str;
        this.participants = callsParticipantsDto;
        this.joinLink = str2;
        this.canFinishCall = bool;
        this.hasLink = bool2;
        this.vkJoinLink = str3;
        this.pmiLink = str4;
    }

    public final Boolean d() {
        return this.canFinishCall;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesCallInProgressDto)) {
            return false;
        }
        MessagesCallInProgressDto messagesCallInProgressDto = (MessagesCallInProgressDto) obj;
        return epx.f(this.callId, messagesCallInProgressDto.callId) && epx.f(this.participants, messagesCallInProgressDto.participants) && epx.f(this.joinLink, messagesCallInProgressDto.joinLink) && epx.f(this.canFinishCall, messagesCallInProgressDto.canFinishCall) && epx.f(this.hasLink, messagesCallInProgressDto.hasLink) && epx.f(this.vkJoinLink, messagesCallInProgressDto.vkJoinLink) && epx.f(this.pmiLink, messagesCallInProgressDto.pmiLink);
    }

    public final int hashCode() {
        int hashCode = (this.participants.hashCode() + (this.callId.hashCode() * 31)) * 31;
        String str = this.joinLink;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.canFinishCall;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasLink;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.vkJoinLink;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pmiLink;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesCallInProgressDto(callId=");
        sb.append(this.callId);
        sb.append(", participants=");
        sb.append(this.participants);
        sb.append(", joinLink=");
        sb.append(this.joinLink);
        sb.append(", canFinishCall=");
        sb.append(this.canFinishCall);
        sb.append(", hasLink=");
        sb.append(this.hasLink);
        sb.append(", vkJoinLink=");
        sb.append(this.vkJoinLink);
        sb.append(", pmiLink=");
        return ho8.a(sb, this.pmiLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.callId);
        this.participants.writeToParcel(parcel, i);
        parcel.writeString(this.joinLink);
        Boolean bool = this.canFinishCall;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.hasLink;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.vkJoinLink);
        parcel.writeString(this.pmiLink);
    }

    public /* synthetic */ MessagesCallInProgressDto(String str, CallsParticipantsDto callsParticipantsDto, String str2, Boolean bool, Boolean bool2, String str3, String str4, int i, zcl zclVar) {
        this(str, callsParticipantsDto, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
    }
}
