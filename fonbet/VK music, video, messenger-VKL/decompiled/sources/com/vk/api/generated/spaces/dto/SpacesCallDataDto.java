package com.vk.api.generated.spaces.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.calls.dto.CallsParticipantsDto;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: SpacesCallDataDto.kt */
/* loaded from: classes15.dex */
public final class SpacesCallDataDto implements Parcelable {
    public static final Parcelable.Creator<SpacesCallDataDto> CREATOR = new a();

    @pmi0("broadcast")
    private final SpacesCallBroadcastDto broadcast;

    @pmi0("call_id")
    private final String callId;

    @pmi0("can_finish_call")
    private final Boolean canFinishCall;

    @pmi0(ApiProtocol.KEY_JOIN_LINK)
    private final String joinLink;

    @pmi0(SignalingProtocol.KEY_LIMIT)
    private final Integer limit;

    @pmi0("ok_join_link")
    private final String okJoinLink;

    @pmi0(SignalingProtocol.KEY_PARTICIPANTS)
    private final CallsParticipantsDto participants;

    @pmi0("preview_participants")
    private final SpacesCallPreviewParticipantsDto previewParticipants;

    /* compiled from: SpacesCallDataDto.kt */
    public static final class a implements Parcelable.Creator<SpacesCallDataDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesCallDataDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            CallsParticipantsDto createFromParcel = CallsParticipantsDto.CREATOR.createFromParcel(parcel);
            SpacesCallPreviewParticipantsDto createFromParcel2 = SpacesCallPreviewParticipantsDto.CREATOR.createFromParcel(parcel);
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SpacesCallDataDto(readString, readString2, readString3, createFromParcel, createFromParcel2, valueOf2, valueOf, parcel.readInt() != 0 ? SpacesCallBroadcastDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesCallDataDto[] newArray(int i) {
            return new SpacesCallDataDto[i];
        }
    }

    public SpacesCallDataDto(String str, String str2, String str3, CallsParticipantsDto callsParticipantsDto, SpacesCallPreviewParticipantsDto spacesCallPreviewParticipantsDto, Integer num, Boolean bool, SpacesCallBroadcastDto spacesCallBroadcastDto) {
        this.callId = str;
        this.joinLink = str2;
        this.okJoinLink = str3;
        this.participants = callsParticipantsDto;
        this.previewParticipants = spacesCallPreviewParticipantsDto;
        this.limit = num;
        this.canFinishCall = bool;
        this.broadcast = spacesCallBroadcastDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpacesCallDataDto)) {
            return false;
        }
        SpacesCallDataDto spacesCallDataDto = (SpacesCallDataDto) obj;
        return epx.f(this.callId, spacesCallDataDto.callId) && epx.f(this.joinLink, spacesCallDataDto.joinLink) && epx.f(this.okJoinLink, spacesCallDataDto.okJoinLink) && epx.f(this.participants, spacesCallDataDto.participants) && epx.f(this.previewParticipants, spacesCallDataDto.previewParticipants) && epx.f(this.limit, spacesCallDataDto.limit) && epx.f(this.canFinishCall, spacesCallDataDto.canFinishCall) && epx.f(this.broadcast, spacesCallDataDto.broadcast);
    }

    public final int hashCode() {
        int hashCode = (this.previewParticipants.hashCode() + ((this.participants.hashCode() + urd0.a(urd0.a(this.callId.hashCode() * 31, 31, this.joinLink), 31, this.okJoinLink)) * 31)) * 31;
        Integer num = this.limit;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.canFinishCall;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        SpacesCallBroadcastDto spacesCallBroadcastDto = this.broadcast;
        return hashCode3 + (spacesCallBroadcastDto != null ? spacesCallBroadcastDto.hashCode() : 0);
    }

    public final String toString() {
        return "SpacesCallDataDto(callId=" + this.callId + ", joinLink=" + this.joinLink + ", okJoinLink=" + this.okJoinLink + ", participants=" + this.participants + ", previewParticipants=" + this.previewParticipants + ", limit=" + this.limit + ", canFinishCall=" + this.canFinishCall + ", broadcast=" + this.broadcast + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.callId);
        parcel.writeString(this.joinLink);
        parcel.writeString(this.okJoinLink);
        this.participants.writeToParcel(parcel, i);
        this.previewParticipants.writeToParcel(parcel, i);
        Integer num = this.limit;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.canFinishCall;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        SpacesCallBroadcastDto spacesCallBroadcastDto = this.broadcast;
        if (spacesCallBroadcastDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            spacesCallBroadcastDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SpacesCallDataDto(String str, String str2, String str3, CallsParticipantsDto callsParticipantsDto, SpacesCallPreviewParticipantsDto spacesCallPreviewParticipantsDto, Integer num, Boolean bool, SpacesCallBroadcastDto spacesCallBroadcastDto, int i, zcl zclVar) {
        this(str, str2, str3, callsParticipantsDto, spacesCallPreviewParticipantsDto, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : spacesCallBroadcastDto);
    }
}
