package com.vk.sdk.api.calls.dto;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.odj;
import xsna.pmi0;
import xsna.rq;
import xsna.shy;
import xsna.zcl;

/* compiled from: CallsCallDto.kt */
/* loaded from: classes5.dex */
public final class CallsCallDto {

    @pmi0("duration")
    private final Integer duration;

    @pmi0("initiator_id")
    private final int initiatorId;

    @pmi0(SignalingProtocol.KEY_PARTICIPANTS)
    private final CallsParticipantsDto participants;

    @pmi0("receiver_id")
    private final int receiverId;

    @pmi0("state")
    private final CallsEndStateDto state;

    @pmi0("time")
    private final int time;

    @pmi0("video")
    private final Boolean video;

    public CallsCallDto(int i, int i2, CallsEndStateDto callsEndStateDto, int i3, Integer num, Boolean bool, CallsParticipantsDto callsParticipantsDto) {
        this.initiatorId = i;
        this.receiverId = i2;
        this.state = callsEndStateDto;
        this.time = i3;
        this.duration = num;
        this.video = bool;
        this.participants = callsParticipantsDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallsCallDto)) {
            return false;
        }
        CallsCallDto callsCallDto = (CallsCallDto) obj;
        return this.initiatorId == callsCallDto.initiatorId && this.receiverId == callsCallDto.receiverId && this.state == callsCallDto.state && this.time == callsCallDto.time && epx.f(this.duration, callsCallDto.duration) && epx.f(this.video, callsCallDto.video) && epx.f(this.participants, callsCallDto.participants);
    }

    public final int hashCode() {
        int a = shy.a(this.time, (this.state.hashCode() + shy.a(this.receiverId, Integer.hashCode(this.initiatorId) * 31, 31)) * 31, 31);
        Integer num = this.duration;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.video;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        CallsParticipantsDto callsParticipantsDto = this.participants;
        return hashCode2 + (callsParticipantsDto != null ? callsParticipantsDto.hashCode() : 0);
    }

    public final String toString() {
        int i = this.initiatorId;
        int i2 = this.receiverId;
        CallsEndStateDto callsEndStateDto = this.state;
        int i3 = this.time;
        Integer num = this.duration;
        Boolean bool = this.video;
        CallsParticipantsDto callsParticipantsDto = this.participants;
        StringBuilder a = odj.a(i, i2, "CallsCallDto(initiatorId=", ", receiverId=", ", state=");
        a.append(callsEndStateDto);
        a.append(", time=");
        a.append(i3);
        a.append(", duration=");
        rq.h(a, num, ", video=", bool, ", participants=");
        a.append(callsParticipantsDto);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ CallsCallDto(int i, int i2, CallsEndStateDto callsEndStateDto, int i3, Integer num, Boolean bool, CallsParticipantsDto callsParticipantsDto, int i4, zcl zclVar) {
        this(i, i2, callsEndStateDto, i3, (i4 & 16) != 0 ? null : num, (i4 & 32) != 0 ? null : bool, (i4 & 64) != 0 ? null : callsParticipantsDto);
    }
}
