package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CallsGroupCallInProgressDto.kt */
/* loaded from: classes14.dex */
public final class CallsGroupCallInProgressDto implements Parcelable {
    public static final Parcelable.Creator<CallsGroupCallInProgressDto> CREATOR = new a();

    @pmi0("initiator_id")
    private final long initiatorId;

    @pmi0(ApiProtocol.KEY_JOIN_LINK)
    private final String joinLink;

    @pmi0(SignalingProtocol.KEY_PARTICIPANTS)
    private final CallsParticipantsDto participants;

    @pmi0("pmi_link")
    private final String pmiLink;

    @pmi0("vk_join_link")
    private final String vkJoinLink;

    /* compiled from: CallsGroupCallInProgressDto.kt */
    public static final class a implements Parcelable.Creator<CallsGroupCallInProgressDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsGroupCallInProgressDto createFromParcel(Parcel parcel) {
            return new CallsGroupCallInProgressDto(parcel.readLong(), CallsParticipantsDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CallsGroupCallInProgressDto[] newArray(int i) {
            return new CallsGroupCallInProgressDto[i];
        }
    }

    public CallsGroupCallInProgressDto(long j, CallsParticipantsDto callsParticipantsDto, String str, String str2, String str3) {
        this.initiatorId = j;
        this.participants = callsParticipantsDto;
        this.joinLink = str;
        this.vkJoinLink = str2;
        this.pmiLink = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallsGroupCallInProgressDto)) {
            return false;
        }
        CallsGroupCallInProgressDto callsGroupCallInProgressDto = (CallsGroupCallInProgressDto) obj;
        return this.initiatorId == callsGroupCallInProgressDto.initiatorId && epx.f(this.participants, callsGroupCallInProgressDto.participants) && epx.f(this.joinLink, callsGroupCallInProgressDto.joinLink) && epx.f(this.vkJoinLink, callsGroupCallInProgressDto.vkJoinLink) && epx.f(this.pmiLink, callsGroupCallInProgressDto.pmiLink);
    }

    public final int hashCode() {
        int hashCode = (this.participants.hashCode() + (Long.hashCode(this.initiatorId) * 31)) * 31;
        String str = this.joinLink;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.vkJoinLink;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pmiLink;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallsGroupCallInProgressDto(initiatorId=");
        sb.append(this.initiatorId);
        sb.append(", participants=");
        sb.append(this.participants);
        sb.append(", joinLink=");
        sb.append(this.joinLink);
        sb.append(", vkJoinLink=");
        sb.append(this.vkJoinLink);
        sb.append(", pmiLink=");
        return ho8.a(sb, this.pmiLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.initiatorId);
        this.participants.writeToParcel(parcel, i);
        parcel.writeString(this.joinLink);
        parcel.writeString(this.vkJoinLink);
        parcel.writeString(this.pmiLink);
    }

    public /* synthetic */ CallsGroupCallInProgressDto(long j, CallsParticipantsDto callsParticipantsDto, String str, String str2, String str3, int i, zcl zclVar) {
        this(j, callsParticipantsDto, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
