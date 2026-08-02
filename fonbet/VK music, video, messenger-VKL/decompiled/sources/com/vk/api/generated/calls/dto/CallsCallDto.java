package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.bh10;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: CallsCallDto.kt */
/* loaded from: classes14.dex */
public final class CallsCallDto implements Parcelable {
    public static final Parcelable.Creator<CallsCallDto> CREATOR = new a();

    @pmi0("duration")
    private final Integer duration;

    @pmi0("has_social_connection")
    private final Boolean hasSocialConnection;

    @pmi0("initiator_id")
    private final long initiatorId;

    @pmi0(SignalingProtocol.KEY_PARTICIPANTS)
    private final CallsParticipantsDto participants;

    @pmi0("receiver_id")
    private final long receiverId;

    @pmi0("state")
    private final CallsEndStateDto state;

    @pmi0("time")
    private final int time;

    @pmi0("video")
    private final Boolean video;

    /* compiled from: CallsCallDto.kt */
    public static final class a implements Parcelable.Creator<CallsCallDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsCallDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            CallsEndStateDto createFromParcel = CallsEndStateDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            Boolean bool = null;
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            CallsParticipantsDto createFromParcel2 = parcel.readInt() == 0 ? null : CallsParticipantsDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CallsCallDto(readLong, readLong2, createFromParcel, readInt, valueOf2, valueOf, createFromParcel2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final CallsCallDto[] newArray(int i) {
            return new CallsCallDto[i];
        }
    }

    public CallsCallDto(long j, long j2, CallsEndStateDto callsEndStateDto, int i, Integer num, Boolean bool, CallsParticipantsDto callsParticipantsDto, Boolean bool2) {
        this.initiatorId = j;
        this.receiverId = j2;
        this.state = callsEndStateDto;
        this.time = i;
        this.duration = num;
        this.video = bool;
        this.participants = callsParticipantsDto;
        this.hasSocialConnection = bool2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallsCallDto)) {
            return false;
        }
        CallsCallDto callsCallDto = (CallsCallDto) obj;
        return this.initiatorId == callsCallDto.initiatorId && this.receiverId == callsCallDto.receiverId && this.state == callsCallDto.state && this.time == callsCallDto.time && epx.f(this.duration, callsCallDto.duration) && epx.f(this.video, callsCallDto.video) && epx.f(this.participants, callsCallDto.participants) && epx.f(this.hasSocialConnection, callsCallDto.hasSocialConnection);
    }

    public final int hashCode() {
        int a2 = shy.a(this.time, (this.state.hashCode() + bh10.a(Long.hashCode(this.initiatorId) * 31, 31, this.receiverId)) * 31, 31);
        Integer num = this.duration;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.video;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        CallsParticipantsDto callsParticipantsDto = this.participants;
        int hashCode3 = (hashCode2 + (callsParticipantsDto == null ? 0 : callsParticipantsDto.hashCode())) * 31;
        Boolean bool2 = this.hasSocialConnection;
        return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallsCallDto(initiatorId=");
        sb.append(this.initiatorId);
        sb.append(", receiverId=");
        sb.append(this.receiverId);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", time=");
        sb.append(this.time);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", video=");
        sb.append(this.video);
        sb.append(", participants=");
        sb.append(this.participants);
        sb.append(", hasSocialConnection=");
        return tn.a(sb, this.hasSocialConnection, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.initiatorId);
        parcel.writeLong(this.receiverId);
        this.state.writeToParcel(parcel, i);
        parcel.writeInt(this.time);
        Integer num = this.duration;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.video;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        CallsParticipantsDto callsParticipantsDto = this.participants;
        if (callsParticipantsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            callsParticipantsDto.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.hasSocialConnection;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public /* synthetic */ CallsCallDto(long j, long j2, CallsEndStateDto callsEndStateDto, int i, Integer num, Boolean bool, CallsParticipantsDto callsParticipantsDto, Boolean bool2, int i2, zcl zclVar) {
        this(j, j2, callsEndStateDto, i, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? null : callsParticipantsDto, (i2 & 128) != 0 ? null : bool2);
    }
}
