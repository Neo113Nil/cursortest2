package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CallsUpdateCallSettingsMuteVideoDto.kt */
/* loaded from: classes14.dex */
public final class CallsUpdateCallSettingsMuteVideoDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CallsUpdateCallSettingsMuteVideoDto[] $VALUES;
    public static final Parcelable.Creator<CallsUpdateCallSettingsMuteVideoDto> CREATOR;

    @pmi0("mute")
    public static final CallsUpdateCallSettingsMuteVideoDto MUTE;

    @pmi0("mute_permanent")
    public static final CallsUpdateCallSettingsMuteVideoDto MUTE_PERMANENT;

    @pmi0("not_set")
    public static final CallsUpdateCallSettingsMuteVideoDto NOT_SET;

    @pmi0("unmute")
    public static final CallsUpdateCallSettingsMuteVideoDto UNMUTE;
    private final String value;

    /* compiled from: CallsUpdateCallSettingsMuteVideoDto.kt */
    public static final class a implements Parcelable.Creator<CallsUpdateCallSettingsMuteVideoDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsUpdateCallSettingsMuteVideoDto createFromParcel(Parcel parcel) {
            return CallsUpdateCallSettingsMuteVideoDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CallsUpdateCallSettingsMuteVideoDto[] newArray(int i) {
            return new CallsUpdateCallSettingsMuteVideoDto[i];
        }
    }

    static {
        CallsUpdateCallSettingsMuteVideoDto callsUpdateCallSettingsMuteVideoDto = new CallsUpdateCallSettingsMuteVideoDto(SignalingProtocol.MEDIA_OPTION_STATE_MUTE, 0, "mute");
        MUTE = callsUpdateCallSettingsMuteVideoDto;
        CallsUpdateCallSettingsMuteVideoDto callsUpdateCallSettingsMuteVideoDto2 = new CallsUpdateCallSettingsMuteVideoDto(SignalingProtocol.MEDIA_OPTION_STATE_MUTE_PERMANENT, 1, "mute_permanent");
        MUTE_PERMANENT = callsUpdateCallSettingsMuteVideoDto2;
        CallsUpdateCallSettingsMuteVideoDto callsUpdateCallSettingsMuteVideoDto3 = new CallsUpdateCallSettingsMuteVideoDto("NOT_SET", 2, "not_set");
        NOT_SET = callsUpdateCallSettingsMuteVideoDto3;
        CallsUpdateCallSettingsMuteVideoDto callsUpdateCallSettingsMuteVideoDto4 = new CallsUpdateCallSettingsMuteVideoDto(SignalingProtocol.MEDIA_OPTION_STATE_UNMUTE, 3, "unmute");
        UNMUTE = callsUpdateCallSettingsMuteVideoDto4;
        CallsUpdateCallSettingsMuteVideoDto[] callsUpdateCallSettingsMuteVideoDtoArr = {callsUpdateCallSettingsMuteVideoDto, callsUpdateCallSettingsMuteVideoDto2, callsUpdateCallSettingsMuteVideoDto3, callsUpdateCallSettingsMuteVideoDto4};
        $VALUES = callsUpdateCallSettingsMuteVideoDtoArr;
        $ENTRIES = new asp(callsUpdateCallSettingsMuteVideoDtoArr);
        CREATOR = new a();
    }

    private CallsUpdateCallSettingsMuteVideoDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CallsUpdateCallSettingsMuteVideoDto valueOf(String str) {
        return (CallsUpdateCallSettingsMuteVideoDto) Enum.valueOf(CallsUpdateCallSettingsMuteVideoDto.class, str);
    }

    public static CallsUpdateCallSettingsMuteVideoDto[] values() {
        return (CallsUpdateCallSettingsMuteVideoDto[]) $VALUES.clone();
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
