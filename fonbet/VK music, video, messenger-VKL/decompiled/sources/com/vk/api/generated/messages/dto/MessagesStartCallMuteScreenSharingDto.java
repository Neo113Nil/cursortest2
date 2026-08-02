package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesStartCallMuteScreenSharingDto.kt */
/* loaded from: classes15.dex */
public final class MessagesStartCallMuteScreenSharingDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesStartCallMuteScreenSharingDto[] $VALUES;
    public static final Parcelable.Creator<MessagesStartCallMuteScreenSharingDto> CREATOR;

    @pmi0("mute")
    public static final MessagesStartCallMuteScreenSharingDto MUTE;

    @pmi0("mute_permanent")
    public static final MessagesStartCallMuteScreenSharingDto MUTE_PERMANENT;

    @pmi0("not_set")
    public static final MessagesStartCallMuteScreenSharingDto NOT_SET;

    @pmi0("unmute")
    public static final MessagesStartCallMuteScreenSharingDto UNMUTE;
    private final String value;

    /* compiled from: MessagesStartCallMuteScreenSharingDto.kt */
    public static final class a implements Parcelable.Creator<MessagesStartCallMuteScreenSharingDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesStartCallMuteScreenSharingDto createFromParcel(Parcel parcel) {
            return MessagesStartCallMuteScreenSharingDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesStartCallMuteScreenSharingDto[] newArray(int i) {
            return new MessagesStartCallMuteScreenSharingDto[i];
        }
    }

    static {
        MessagesStartCallMuteScreenSharingDto messagesStartCallMuteScreenSharingDto = new MessagesStartCallMuteScreenSharingDto(SignalingProtocol.MEDIA_OPTION_STATE_MUTE, 0, "mute");
        MUTE = messagesStartCallMuteScreenSharingDto;
        MessagesStartCallMuteScreenSharingDto messagesStartCallMuteScreenSharingDto2 = new MessagesStartCallMuteScreenSharingDto(SignalingProtocol.MEDIA_OPTION_STATE_MUTE_PERMANENT, 1, "mute_permanent");
        MUTE_PERMANENT = messagesStartCallMuteScreenSharingDto2;
        MessagesStartCallMuteScreenSharingDto messagesStartCallMuteScreenSharingDto3 = new MessagesStartCallMuteScreenSharingDto("NOT_SET", 2, "not_set");
        NOT_SET = messagesStartCallMuteScreenSharingDto3;
        MessagesStartCallMuteScreenSharingDto messagesStartCallMuteScreenSharingDto4 = new MessagesStartCallMuteScreenSharingDto(SignalingProtocol.MEDIA_OPTION_STATE_UNMUTE, 3, "unmute");
        UNMUTE = messagesStartCallMuteScreenSharingDto4;
        MessagesStartCallMuteScreenSharingDto[] messagesStartCallMuteScreenSharingDtoArr = {messagesStartCallMuteScreenSharingDto, messagesStartCallMuteScreenSharingDto2, messagesStartCallMuteScreenSharingDto3, messagesStartCallMuteScreenSharingDto4};
        $VALUES = messagesStartCallMuteScreenSharingDtoArr;
        $ENTRIES = new asp(messagesStartCallMuteScreenSharingDtoArr);
        CREATOR = new a();
    }

    private MessagesStartCallMuteScreenSharingDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesStartCallMuteScreenSharingDto valueOf(String str) {
        return (MessagesStartCallMuteScreenSharingDto) Enum.valueOf(MessagesStartCallMuteScreenSharingDto.class, str);
    }

    public static MessagesStartCallMuteScreenSharingDto[] values() {
        return (MessagesStartCallMuteScreenSharingDto[]) $VALUES.clone();
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
