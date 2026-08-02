package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CallsStartMuteScreenSharingDto.kt */
/* loaded from: classes14.dex */
public final class CallsStartMuteScreenSharingDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CallsStartMuteScreenSharingDto[] $VALUES;
    public static final Parcelable.Creator<CallsStartMuteScreenSharingDto> CREATOR;

    @pmi0("mute")
    public static final CallsStartMuteScreenSharingDto MUTE;

    @pmi0("mute_permanent")
    public static final CallsStartMuteScreenSharingDto MUTE_PERMANENT;

    @pmi0("not_set")
    public static final CallsStartMuteScreenSharingDto NOT_SET;

    @pmi0("unmute")
    public static final CallsStartMuteScreenSharingDto UNMUTE;
    private final String value;

    /* compiled from: CallsStartMuteScreenSharingDto.kt */
    public static final class a implements Parcelable.Creator<CallsStartMuteScreenSharingDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsStartMuteScreenSharingDto createFromParcel(Parcel parcel) {
            return CallsStartMuteScreenSharingDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CallsStartMuteScreenSharingDto[] newArray(int i) {
            return new CallsStartMuteScreenSharingDto[i];
        }
    }

    static {
        CallsStartMuteScreenSharingDto callsStartMuteScreenSharingDto = new CallsStartMuteScreenSharingDto(SignalingProtocol.MEDIA_OPTION_STATE_MUTE, 0, "mute");
        MUTE = callsStartMuteScreenSharingDto;
        CallsStartMuteScreenSharingDto callsStartMuteScreenSharingDto2 = new CallsStartMuteScreenSharingDto(SignalingProtocol.MEDIA_OPTION_STATE_MUTE_PERMANENT, 1, "mute_permanent");
        MUTE_PERMANENT = callsStartMuteScreenSharingDto2;
        CallsStartMuteScreenSharingDto callsStartMuteScreenSharingDto3 = new CallsStartMuteScreenSharingDto("NOT_SET", 2, "not_set");
        NOT_SET = callsStartMuteScreenSharingDto3;
        CallsStartMuteScreenSharingDto callsStartMuteScreenSharingDto4 = new CallsStartMuteScreenSharingDto(SignalingProtocol.MEDIA_OPTION_STATE_UNMUTE, 3, "unmute");
        UNMUTE = callsStartMuteScreenSharingDto4;
        CallsStartMuteScreenSharingDto[] callsStartMuteScreenSharingDtoArr = {callsStartMuteScreenSharingDto, callsStartMuteScreenSharingDto2, callsStartMuteScreenSharingDto3, callsStartMuteScreenSharingDto4};
        $VALUES = callsStartMuteScreenSharingDtoArr;
        $ENTRIES = new asp(callsStartMuteScreenSharingDtoArr);
        CREATOR = new a();
    }

    private CallsStartMuteScreenSharingDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CallsStartMuteScreenSharingDto valueOf(String str) {
        return (CallsStartMuteScreenSharingDto) Enum.valueOf(CallsStartMuteScreenSharingDto.class, str);
    }

    public static CallsStartMuteScreenSharingDto[] values() {
        return (CallsStartMuteScreenSharingDto[]) $VALUES.clone();
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
