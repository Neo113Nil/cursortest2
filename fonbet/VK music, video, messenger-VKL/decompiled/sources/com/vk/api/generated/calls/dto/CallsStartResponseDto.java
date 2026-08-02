package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CallsStartResponseDto.kt */
/* loaded from: classes14.dex */
public final class CallsStartResponseDto implements Parcelable {
    public static final Parcelable.Creator<CallsStartResponseDto> CREATOR = new a();

    @pmi0("broadcast_ov_id")
    private final String broadcastOvId;

    @pmi0("broadcast_video_id")
    private final String broadcastVideoId;

    @pmi0("call_id")
    private final String callId;

    @pmi0(ApiProtocol.KEY_JOIN_LINK)
    private final String joinLink;

    @pmi0("ok_join_link")
    private final String okJoinLink;

    @pmi0("short_credentials")
    private final CallsShortCredentialsDto shortCredentials;

    /* compiled from: CallsStartResponseDto.kt */
    public static final class a implements Parcelable.Creator<CallsStartResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsStartResponseDto createFromParcel(Parcel parcel) {
            return new CallsStartResponseDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CallsShortCredentialsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CallsStartResponseDto[] newArray(int i) {
            return new CallsStartResponseDto[i];
        }
    }

    public CallsStartResponseDto(String str, String str2, String str3, String str4, String str5, CallsShortCredentialsDto callsShortCredentialsDto) {
        this.joinLink = str;
        this.okJoinLink = str2;
        this.callId = str3;
        this.broadcastVideoId = str4;
        this.broadcastOvId = str5;
        this.shortCredentials = callsShortCredentialsDto;
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
        if (!(obj instanceof CallsStartResponseDto)) {
            return false;
        }
        CallsStartResponseDto callsStartResponseDto = (CallsStartResponseDto) obj;
        return epx.f(this.joinLink, callsStartResponseDto.joinLink) && epx.f(this.okJoinLink, callsStartResponseDto.okJoinLink) && epx.f(this.callId, callsStartResponseDto.callId) && epx.f(this.broadcastVideoId, callsStartResponseDto.broadcastVideoId) && epx.f(this.broadcastOvId, callsStartResponseDto.broadcastOvId) && epx.f(this.shortCredentials, callsStartResponseDto.shortCredentials);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.joinLink.hashCode() * 31, 31, this.okJoinLink);
        String str = this.callId;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.broadcastVideoId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.broadcastOvId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CallsShortCredentialsDto callsShortCredentialsDto = this.shortCredentials;
        return hashCode3 + (callsShortCredentialsDto != null ? callsShortCredentialsDto.hashCode() : 0);
    }

    public final String toString() {
        return "CallsStartResponseDto(joinLink=" + this.joinLink + ", okJoinLink=" + this.okJoinLink + ", callId=" + this.callId + ", broadcastVideoId=" + this.broadcastVideoId + ", broadcastOvId=" + this.broadcastOvId + ", shortCredentials=" + this.shortCredentials + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.joinLink);
        parcel.writeString(this.okJoinLink);
        parcel.writeString(this.callId);
        parcel.writeString(this.broadcastVideoId);
        parcel.writeString(this.broadcastOvId);
        CallsShortCredentialsDto callsShortCredentialsDto = this.shortCredentials;
        if (callsShortCredentialsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            callsShortCredentialsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ CallsStartResponseDto(String str, String str2, String str3, String str4, String str5, CallsShortCredentialsDto callsShortCredentialsDto, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : callsShortCredentialsDto);
    }
}
