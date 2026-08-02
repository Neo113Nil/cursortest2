package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesStartCallMuteAudioDto.kt */
/* loaded from: classes15.dex */
public final class MessagesStartCallMuteAudioDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesStartCallMuteAudioDto[] $VALUES;
    public static final Parcelable.Creator<MessagesStartCallMuteAudioDto> CREATOR;

    @pmi0("mute")
    public static final MessagesStartCallMuteAudioDto MUTE;

    @pmi0("mute_permanent")
    public static final MessagesStartCallMuteAudioDto MUTE_PERMANENT;

    @pmi0("not_set")
    public static final MessagesStartCallMuteAudioDto NOT_SET;

    @pmi0("unmute")
    public static final MessagesStartCallMuteAudioDto UNMUTE;
    private final String value;

    /* compiled from: MessagesStartCallMuteAudioDto.kt */
    public static final class a implements Parcelable.Creator<MessagesStartCallMuteAudioDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesStartCallMuteAudioDto createFromParcel(Parcel parcel) {
            return MessagesStartCallMuteAudioDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesStartCallMuteAudioDto[] newArray(int i) {
            return new MessagesStartCallMuteAudioDto[i];
        }
    }

    static {
        MessagesStartCallMuteAudioDto messagesStartCallMuteAudioDto = new MessagesStartCallMuteAudioDto(SignalingProtocol.MEDIA_OPTION_STATE_MUTE, 0, "mute");
        MUTE = messagesStartCallMuteAudioDto;
        MessagesStartCallMuteAudioDto messagesStartCallMuteAudioDto2 = new MessagesStartCallMuteAudioDto(SignalingProtocol.MEDIA_OPTION_STATE_MUTE_PERMANENT, 1, "mute_permanent");
        MUTE_PERMANENT = messagesStartCallMuteAudioDto2;
        MessagesStartCallMuteAudioDto messagesStartCallMuteAudioDto3 = new MessagesStartCallMuteAudioDto("NOT_SET", 2, "not_set");
        NOT_SET = messagesStartCallMuteAudioDto3;
        MessagesStartCallMuteAudioDto messagesStartCallMuteAudioDto4 = new MessagesStartCallMuteAudioDto(SignalingProtocol.MEDIA_OPTION_STATE_UNMUTE, 3, "unmute");
        UNMUTE = messagesStartCallMuteAudioDto4;
        MessagesStartCallMuteAudioDto[] messagesStartCallMuteAudioDtoArr = {messagesStartCallMuteAudioDto, messagesStartCallMuteAudioDto2, messagesStartCallMuteAudioDto3, messagesStartCallMuteAudioDto4};
        $VALUES = messagesStartCallMuteAudioDtoArr;
        $ENTRIES = new asp(messagesStartCallMuteAudioDtoArr);
        CREATOR = new a();
    }

    private MessagesStartCallMuteAudioDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesStartCallMuteAudioDto valueOf(String str) {
        return (MessagesStartCallMuteAudioDto) Enum.valueOf(MessagesStartCallMuteAudioDto.class, str);
    }

    public static MessagesStartCallMuteAudioDto[] values() {
        return (MessagesStartCallMuteAudioDto[]) $VALUES.clone();
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
