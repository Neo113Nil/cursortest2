package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesEditCallMuteScreenSharingDto.kt */
/* loaded from: classes15.dex */
public final class MessagesEditCallMuteScreenSharingDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesEditCallMuteScreenSharingDto[] $VALUES;
    public static final Parcelable.Creator<MessagesEditCallMuteScreenSharingDto> CREATOR;

    @pmi0("mute")
    public static final MessagesEditCallMuteScreenSharingDto MUTE;

    @pmi0("mute_permanent")
    public static final MessagesEditCallMuteScreenSharingDto MUTE_PERMANENT;

    @pmi0("not_set")
    public static final MessagesEditCallMuteScreenSharingDto NOT_SET;

    @pmi0("unmute")
    public static final MessagesEditCallMuteScreenSharingDto UNMUTE;
    private final String value;

    /* compiled from: MessagesEditCallMuteScreenSharingDto.kt */
    public static final class a implements Parcelable.Creator<MessagesEditCallMuteScreenSharingDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesEditCallMuteScreenSharingDto createFromParcel(Parcel parcel) {
            return MessagesEditCallMuteScreenSharingDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesEditCallMuteScreenSharingDto[] newArray(int i) {
            return new MessagesEditCallMuteScreenSharingDto[i];
        }
    }

    static {
        MessagesEditCallMuteScreenSharingDto messagesEditCallMuteScreenSharingDto = new MessagesEditCallMuteScreenSharingDto(SignalingProtocol.MEDIA_OPTION_STATE_MUTE, 0, "mute");
        MUTE = messagesEditCallMuteScreenSharingDto;
        MessagesEditCallMuteScreenSharingDto messagesEditCallMuteScreenSharingDto2 = new MessagesEditCallMuteScreenSharingDto(SignalingProtocol.MEDIA_OPTION_STATE_MUTE_PERMANENT, 1, "mute_permanent");
        MUTE_PERMANENT = messagesEditCallMuteScreenSharingDto2;
        MessagesEditCallMuteScreenSharingDto messagesEditCallMuteScreenSharingDto3 = new MessagesEditCallMuteScreenSharingDto("NOT_SET", 2, "not_set");
        NOT_SET = messagesEditCallMuteScreenSharingDto3;
        MessagesEditCallMuteScreenSharingDto messagesEditCallMuteScreenSharingDto4 = new MessagesEditCallMuteScreenSharingDto(SignalingProtocol.MEDIA_OPTION_STATE_UNMUTE, 3, "unmute");
        UNMUTE = messagesEditCallMuteScreenSharingDto4;
        MessagesEditCallMuteScreenSharingDto[] messagesEditCallMuteScreenSharingDtoArr = {messagesEditCallMuteScreenSharingDto, messagesEditCallMuteScreenSharingDto2, messagesEditCallMuteScreenSharingDto3, messagesEditCallMuteScreenSharingDto4};
        $VALUES = messagesEditCallMuteScreenSharingDtoArr;
        $ENTRIES = new asp(messagesEditCallMuteScreenSharingDtoArr);
        CREATOR = new a();
    }

    private MessagesEditCallMuteScreenSharingDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesEditCallMuteScreenSharingDto valueOf(String str) {
        return (MessagesEditCallMuteScreenSharingDto) Enum.valueOf(MessagesEditCallMuteScreenSharingDto.class, str);
    }

    public static MessagesEditCallMuteScreenSharingDto[] values() {
        return (MessagesEditCallMuteScreenSharingDto[]) $VALUES.clone();
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
