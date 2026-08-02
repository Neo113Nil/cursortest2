package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesEditCallMuteAudioDto.kt */
/* loaded from: classes15.dex */
public final class MessagesEditCallMuteAudioDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesEditCallMuteAudioDto[] $VALUES;
    public static final Parcelable.Creator<MessagesEditCallMuteAudioDto> CREATOR;

    @pmi0("mute")
    public static final MessagesEditCallMuteAudioDto MUTE;

    @pmi0("mute_permanent")
    public static final MessagesEditCallMuteAudioDto MUTE_PERMANENT;

    @pmi0("not_set")
    public static final MessagesEditCallMuteAudioDto NOT_SET;

    @pmi0("unmute")
    public static final MessagesEditCallMuteAudioDto UNMUTE;
    private final String value;

    /* compiled from: MessagesEditCallMuteAudioDto.kt */
    public static final class a implements Parcelable.Creator<MessagesEditCallMuteAudioDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesEditCallMuteAudioDto createFromParcel(Parcel parcel) {
            return MessagesEditCallMuteAudioDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesEditCallMuteAudioDto[] newArray(int i) {
            return new MessagesEditCallMuteAudioDto[i];
        }
    }

    static {
        MessagesEditCallMuteAudioDto messagesEditCallMuteAudioDto = new MessagesEditCallMuteAudioDto(SignalingProtocol.MEDIA_OPTION_STATE_MUTE, 0, "mute");
        MUTE = messagesEditCallMuteAudioDto;
        MessagesEditCallMuteAudioDto messagesEditCallMuteAudioDto2 = new MessagesEditCallMuteAudioDto(SignalingProtocol.MEDIA_OPTION_STATE_MUTE_PERMANENT, 1, "mute_permanent");
        MUTE_PERMANENT = messagesEditCallMuteAudioDto2;
        MessagesEditCallMuteAudioDto messagesEditCallMuteAudioDto3 = new MessagesEditCallMuteAudioDto("NOT_SET", 2, "not_set");
        NOT_SET = messagesEditCallMuteAudioDto3;
        MessagesEditCallMuteAudioDto messagesEditCallMuteAudioDto4 = new MessagesEditCallMuteAudioDto(SignalingProtocol.MEDIA_OPTION_STATE_UNMUTE, 3, "unmute");
        UNMUTE = messagesEditCallMuteAudioDto4;
        MessagesEditCallMuteAudioDto[] messagesEditCallMuteAudioDtoArr = {messagesEditCallMuteAudioDto, messagesEditCallMuteAudioDto2, messagesEditCallMuteAudioDto3, messagesEditCallMuteAudioDto4};
        $VALUES = messagesEditCallMuteAudioDtoArr;
        $ENTRIES = new asp(messagesEditCallMuteAudioDtoArr);
        CREATOR = new a();
    }

    private MessagesEditCallMuteAudioDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesEditCallMuteAudioDto valueOf(String str) {
        return (MessagesEditCallMuteAudioDto) Enum.valueOf(MessagesEditCallMuteAudioDto.class, str);
    }

    public static MessagesEditCallMuteAudioDto[] values() {
        return (MessagesEditCallMuteAudioDto[]) $VALUES.clone();
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
