package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CallsUpdateCallSettingsMuteScreenSharingDto.kt */
/* loaded from: classes14.dex */
public final class CallsUpdateCallSettingsMuteScreenSharingDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CallsUpdateCallSettingsMuteScreenSharingDto[] $VALUES;
    public static final Parcelable.Creator<CallsUpdateCallSettingsMuteScreenSharingDto> CREATOR;

    @pmi0("mute")
    public static final CallsUpdateCallSettingsMuteScreenSharingDto MUTE;

    @pmi0("mute_permanent")
    public static final CallsUpdateCallSettingsMuteScreenSharingDto MUTE_PERMANENT;

    @pmi0("not_set")
    public static final CallsUpdateCallSettingsMuteScreenSharingDto NOT_SET;

    @pmi0("unmute")
    public static final CallsUpdateCallSettingsMuteScreenSharingDto UNMUTE;
    private final String value;

    /* compiled from: CallsUpdateCallSettingsMuteScreenSharingDto.kt */
    public static final class a implements Parcelable.Creator<CallsUpdateCallSettingsMuteScreenSharingDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsUpdateCallSettingsMuteScreenSharingDto createFromParcel(Parcel parcel) {
            return CallsUpdateCallSettingsMuteScreenSharingDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CallsUpdateCallSettingsMuteScreenSharingDto[] newArray(int i) {
            return new CallsUpdateCallSettingsMuteScreenSharingDto[i];
        }
    }

    static {
        CallsUpdateCallSettingsMuteScreenSharingDto callsUpdateCallSettingsMuteScreenSharingDto = new CallsUpdateCallSettingsMuteScreenSharingDto(SignalingProtocol.MEDIA_OPTION_STATE_MUTE, 0, "mute");
        MUTE = callsUpdateCallSettingsMuteScreenSharingDto;
        CallsUpdateCallSettingsMuteScreenSharingDto callsUpdateCallSettingsMuteScreenSharingDto2 = new CallsUpdateCallSettingsMuteScreenSharingDto(SignalingProtocol.MEDIA_OPTION_STATE_MUTE_PERMANENT, 1, "mute_permanent");
        MUTE_PERMANENT = callsUpdateCallSettingsMuteScreenSharingDto2;
        CallsUpdateCallSettingsMuteScreenSharingDto callsUpdateCallSettingsMuteScreenSharingDto3 = new CallsUpdateCallSettingsMuteScreenSharingDto("NOT_SET", 2, "not_set");
        NOT_SET = callsUpdateCallSettingsMuteScreenSharingDto3;
        CallsUpdateCallSettingsMuteScreenSharingDto callsUpdateCallSettingsMuteScreenSharingDto4 = new CallsUpdateCallSettingsMuteScreenSharingDto(SignalingProtocol.MEDIA_OPTION_STATE_UNMUTE, 3, "unmute");
        UNMUTE = callsUpdateCallSettingsMuteScreenSharingDto4;
        CallsUpdateCallSettingsMuteScreenSharingDto[] callsUpdateCallSettingsMuteScreenSharingDtoArr = {callsUpdateCallSettingsMuteScreenSharingDto, callsUpdateCallSettingsMuteScreenSharingDto2, callsUpdateCallSettingsMuteScreenSharingDto3, callsUpdateCallSettingsMuteScreenSharingDto4};
        $VALUES = callsUpdateCallSettingsMuteScreenSharingDtoArr;
        $ENTRIES = new asp(callsUpdateCallSettingsMuteScreenSharingDtoArr);
        CREATOR = new a();
    }

    private CallsUpdateCallSettingsMuteScreenSharingDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CallsUpdateCallSettingsMuteScreenSharingDto valueOf(String str) {
        return (CallsUpdateCallSettingsMuteScreenSharingDto) Enum.valueOf(CallsUpdateCallSettingsMuteScreenSharingDto.class, str);
    }

    public static CallsUpdateCallSettingsMuteScreenSharingDto[] values() {
        return (CallsUpdateCallSettingsMuteScreenSharingDto[]) $VALUES.clone();
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
