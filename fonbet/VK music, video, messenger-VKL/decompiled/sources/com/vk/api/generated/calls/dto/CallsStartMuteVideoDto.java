package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CallsStartMuteVideoDto.kt */
/* loaded from: classes14.dex */
public final class CallsStartMuteVideoDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CallsStartMuteVideoDto[] $VALUES;
    public static final Parcelable.Creator<CallsStartMuteVideoDto> CREATOR;

    @pmi0("mute")
    public static final CallsStartMuteVideoDto MUTE;

    @pmi0("mute_permanent")
    public static final CallsStartMuteVideoDto MUTE_PERMANENT;

    @pmi0("not_set")
    public static final CallsStartMuteVideoDto NOT_SET;

    @pmi0("unmute")
    public static final CallsStartMuteVideoDto UNMUTE;
    private final String value;

    /* compiled from: CallsStartMuteVideoDto.kt */
    public static final class a implements Parcelable.Creator<CallsStartMuteVideoDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsStartMuteVideoDto createFromParcel(Parcel parcel) {
            return CallsStartMuteVideoDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CallsStartMuteVideoDto[] newArray(int i) {
            return new CallsStartMuteVideoDto[i];
        }
    }

    static {
        CallsStartMuteVideoDto callsStartMuteVideoDto = new CallsStartMuteVideoDto(SignalingProtocol.MEDIA_OPTION_STATE_MUTE, 0, "mute");
        MUTE = callsStartMuteVideoDto;
        CallsStartMuteVideoDto callsStartMuteVideoDto2 = new CallsStartMuteVideoDto(SignalingProtocol.MEDIA_OPTION_STATE_MUTE_PERMANENT, 1, "mute_permanent");
        MUTE_PERMANENT = callsStartMuteVideoDto2;
        CallsStartMuteVideoDto callsStartMuteVideoDto3 = new CallsStartMuteVideoDto("NOT_SET", 2, "not_set");
        NOT_SET = callsStartMuteVideoDto3;
        CallsStartMuteVideoDto callsStartMuteVideoDto4 = new CallsStartMuteVideoDto(SignalingProtocol.MEDIA_OPTION_STATE_UNMUTE, 3, "unmute");
        UNMUTE = callsStartMuteVideoDto4;
        CallsStartMuteVideoDto[] callsStartMuteVideoDtoArr = {callsStartMuteVideoDto, callsStartMuteVideoDto2, callsStartMuteVideoDto3, callsStartMuteVideoDto4};
        $VALUES = callsStartMuteVideoDtoArr;
        $ENTRIES = new asp(callsStartMuteVideoDtoArr);
        CREATOR = new a();
    }

    private CallsStartMuteVideoDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CallsStartMuteVideoDto valueOf(String str) {
        return (CallsStartMuteVideoDto) Enum.valueOf(CallsStartMuteVideoDto.class, str);
    }

    public static CallsStartMuteVideoDto[] values() {
        return (CallsStartMuteVideoDto[]) $VALUES.clone();
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
