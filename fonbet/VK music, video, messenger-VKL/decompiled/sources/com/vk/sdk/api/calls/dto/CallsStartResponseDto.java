package com.vk.sdk.api.calls.dto;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.epx;
import xsna.h5s;
import xsna.pmi0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: CallsStartResponseDto.kt */
/* loaded from: classes5.dex */
public final class CallsStartResponseDto {

    @pmi0("broadcast_ov_id")
    private final String broadcastOvId;

    @pmi0("broadcast_video_id")
    private final String broadcastVideoId;

    @pmi0("call_id")
    private final String callId;

    @pmi0(ApiProtocol.KEY_JOIN_LINK)
    private final String joinLink;

    public CallsStartResponseDto(String str, String str2, String str3, String str4) {
        this.joinLink = str;
        this.callId = str2;
        this.broadcastVideoId = str3;
        this.broadcastOvId = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallsStartResponseDto)) {
            return false;
        }
        CallsStartResponseDto callsStartResponseDto = (CallsStartResponseDto) obj;
        return epx.f(this.joinLink, callsStartResponseDto.joinLink) && epx.f(this.callId, callsStartResponseDto.callId) && epx.f(this.broadcastVideoId, callsStartResponseDto.broadcastVideoId) && epx.f(this.broadcastOvId, callsStartResponseDto.broadcastOvId);
    }

    public final int hashCode() {
        int hashCode = this.joinLink.hashCode() * 31;
        String str = this.callId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.broadcastVideoId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.broadcastOvId;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.joinLink;
        String str2 = this.callId;
        return h5s.d(xe9.a("CallsStartResponseDto(joinLink=", str, ", callId=", str2, ", broadcastVideoId="), this.broadcastVideoId, ", broadcastOvId=", this.broadcastOvId, ")");
    }

    public /* synthetic */ CallsStartResponseDto(String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
