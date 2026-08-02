package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CallsUpdateCallSettingsMuteAudioDto.kt */
/* loaded from: classes14.dex */
public final class CallsUpdateCallSettingsMuteAudioDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CallsUpdateCallSettingsMuteAudioDto[] $VALUES;
    public static final Parcelable.Creator<CallsUpdateCallSettingsMuteAudioDto> CREATOR;

    @pmi0("mute")
    public static final CallsUpdateCallSettingsMuteAudioDto MUTE;

    @pmi0("mute_permanent")
    public static final CallsUpdateCallSettingsMuteAudioDto MUTE_PERMANENT;

    @pmi0("not_set")
    public static final CallsUpdateCallSettingsMuteAudioDto NOT_SET;

    @pmi0("unmute")
    public static final CallsUpdateCallSettingsMuteAudioDto UNMUTE;
    private final String value;

    /* compiled from: CallsUpdateCallSettingsMuteAudioDto.kt */
    public static final class a implements Parcelable.Creator<CallsUpdateCallSettingsMuteAudioDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsUpdateCallSettingsMuteAudioDto createFromParcel(Parcel parcel) {
            return CallsUpdateCallSettingsMuteAudioDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CallsUpdateCallSettingsMuteAudioDto[] newArray(int i) {
            return new CallsUpdateCallSettingsMuteAudioDto[i];
        }
    }

    static {
        CallsUpdateCallSettingsMuteAudioDto callsUpdateCallSettingsMuteAudioDto = new CallsUpdateCallSettingsMuteAudioDto(SignalingProtocol.MEDIA_OPTION_STATE_MUTE, 0, "mute");
        MUTE = callsUpdateCallSettingsMuteAudioDto;
        CallsUpdateCallSettingsMuteAudioDto callsUpdateCallSettingsMuteAudioDto2 = new CallsUpdateCallSettingsMuteAudioDto(SignalingProtocol.MEDIA_OPTION_STATE_MUTE_PERMANENT, 1, "mute_permanent");
        MUTE_PERMANENT = callsUpdateCallSettingsMuteAudioDto2;
        CallsUpdateCallSettingsMuteAudioDto callsUpdateCallSettingsMuteAudioDto3 = new CallsUpdateCallSettingsMuteAudioDto("NOT_SET", 2, "not_set");
        NOT_SET = callsUpdateCallSettingsMuteAudioDto3;
        CallsUpdateCallSettingsMuteAudioDto callsUpdateCallSettingsMuteAudioDto4 = new CallsUpdateCallSettingsMuteAudioDto(SignalingProtocol.MEDIA_OPTION_STATE_UNMUTE, 3, "unmute");
        UNMUTE = callsUpdateCallSettingsMuteAudioDto4;
        CallsUpdateCallSettingsMuteAudioDto[] callsUpdateCallSettingsMuteAudioDtoArr = {callsUpdateCallSettingsMuteAudioDto, callsUpdateCallSettingsMuteAudioDto2, callsUpdateCallSettingsMuteAudioDto3, callsUpdateCallSettingsMuteAudioDto4};
        $VALUES = callsUpdateCallSettingsMuteAudioDtoArr;
        $ENTRIES = new asp(callsUpdateCallSettingsMuteAudioDtoArr);
        CREATOR = new a();
    }

    private CallsUpdateCallSettingsMuteAudioDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CallsUpdateCallSettingsMuteAudioDto valueOf(String str) {
        return (CallsUpdateCallSettingsMuteAudioDto) Enum.valueOf(CallsUpdateCallSettingsMuteAudioDto.class, str);
    }

    public static CallsUpdateCallSettingsMuteAudioDto[] values() {
        return (CallsUpdateCallSettingsMuteAudioDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
