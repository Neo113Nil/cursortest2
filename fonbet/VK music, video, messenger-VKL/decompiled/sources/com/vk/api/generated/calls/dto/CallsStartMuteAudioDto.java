package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CallsStartMuteAudioDto.kt */
/* loaded from: classes14.dex */
public final class CallsStartMuteAudioDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CallsStartMuteAudioDto[] $VALUES;
    public static final Parcelable.Creator<CallsStartMuteAudioDto> CREATOR;

    @pmi0("mute")
    public static final CallsStartMuteAudioDto MUTE;

    @pmi0("mute_permanent")
    public static final CallsStartMuteAudioDto MUTE_PERMANENT;

    @pmi0("not_set")
    public static final CallsStartMuteAudioDto NOT_SET;

    @pmi0("unmute")
    public static final CallsStartMuteAudioDto UNMUTE;
    private final String value;

    /* compiled from: CallsStartMuteAudioDto.kt */
    public static final class a implements Parcelable.Creator<CallsStartMuteAudioDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsStartMuteAudioDto createFromParcel(Parcel parcel) {
            return CallsStartMuteAudioDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CallsStartMuteAudioDto[] newArray(int i) {
            return new CallsStartMuteAudioDto[i];
        }
    }

    static {
        CallsStartMuteAudioDto callsStartMuteAudioDto = new CallsStartMuteAudioDto(SignalingProtocol.MEDIA_OPTION_STATE_MUTE, 0, "mute");
        MUTE = callsStartMuteAudioDto;
        CallsStartMuteAudioDto callsStartMuteAudioDto2 = new CallsStartMuteAudioDto(SignalingProtocol.MEDIA_OPTION_STATE_MUTE_PERMANENT, 1, "mute_permanent");
        MUTE_PERMANENT = callsStartMuteAudioDto2;
        CallsStartMuteAudioDto callsStartMuteAudioDto3 = new CallsStartMuteAudioDto("NOT_SET", 2, "not_set");
        NOT_SET = callsStartMuteAudioDto3;
        CallsStartMuteAudioDto callsStartMuteAudioDto4 = new CallsStartMuteAudioDto(SignalingProtocol.MEDIA_OPTION_STATE_UNMUTE, 3, "unmute");
        UNMUTE = callsStartMuteAudioDto4;
        CallsStartMuteAudioDto[] callsStartMuteAudioDtoArr = {callsStartMuteAudioDto, callsStartMuteAudioDto2, callsStartMuteAudioDto3, callsStartMuteAudioDto4};
        $VALUES = callsStartMuteAudioDtoArr;
        $ENTRIES = new asp(callsStartMuteAudioDtoArr);
        CREATOR = new a();
    }

    private CallsStartMuteAudioDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CallsStartMuteAudioDto valueOf(String str) {
        return (CallsStartMuteAudioDto) Enum.valueOf(CallsStartMuteAudioDto.class, str);
    }

    public static CallsStartMuteAudioDto[] values() {
        return (CallsStartMuteAudioDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
