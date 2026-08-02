package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesEditCallMuteVideoDto.kt */
/* loaded from: classes15.dex */
public final class MessagesEditCallMuteVideoDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesEditCallMuteVideoDto[] $VALUES;
    public static final Parcelable.Creator<MessagesEditCallMuteVideoDto> CREATOR;

    @pmi0("mute")
    public static final MessagesEditCallMuteVideoDto MUTE;

    @pmi0("mute_permanent")
    public static final MessagesEditCallMuteVideoDto MUTE_PERMANENT;

    @pmi0("not_set")
    public static final MessagesEditCallMuteVideoDto NOT_SET;

    @pmi0("unmute")
    public static final MessagesEditCallMuteVideoDto UNMUTE;
    private final String value;

    /* compiled from: MessagesEditCallMuteVideoDto.kt */
    public static final class a implements Parcelable.Creator<MessagesEditCallMuteVideoDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesEditCallMuteVideoDto createFromParcel(Parcel parcel) {
            return MessagesEditCallMuteVideoDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesEditCallMuteVideoDto[] newArray(int i) {
            return new MessagesEditCallMuteVideoDto[i];
        }
    }

    static {
        MessagesEditCallMuteVideoDto messagesEditCallMuteVideoDto = new MessagesEditCallMuteVideoDto(SignalingProtocol.MEDIA_OPTION_STATE_MUTE, 0, "mute");
        MUTE = messagesEditCallMuteVideoDto;
        MessagesEditCallMuteVideoDto messagesEditCallMuteVideoDto2 = new MessagesEditCallMuteVideoDto(SignalingProtocol.MEDIA_OPTION_STATE_MUTE_PERMANENT, 1, "mute_permanent");
        MUTE_PERMANENT = messagesEditCallMuteVideoDto2;
        MessagesEditCallMuteVideoDto messagesEditCallMuteVideoDto3 = new MessagesEditCallMuteVideoDto("NOT_SET", 2, "not_set");
        NOT_SET = messagesEditCallMuteVideoDto3;
        MessagesEditCallMuteVideoDto messagesEditCallMuteVideoDto4 = new MessagesEditCallMuteVideoDto(SignalingProtocol.MEDIA_OPTION_STATE_UNMUTE, 3, "unmute");
        UNMUTE = messagesEditCallMuteVideoDto4;
        MessagesEditCallMuteVideoDto[] messagesEditCallMuteVideoDtoArr = {messagesEditCallMuteVideoDto, messagesEditCallMuteVideoDto2, messagesEditCallMuteVideoDto3, messagesEditCallMuteVideoDto4};
        $VALUES = messagesEditCallMuteVideoDtoArr;
        $ENTRIES = new asp(messagesEditCallMuteVideoDtoArr);
        CREATOR = new a();
    }

    private MessagesEditCallMuteVideoDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesEditCallMuteVideoDto valueOf(String str) {
        return (MessagesEditCallMuteVideoDto) Enum.valueOf(MessagesEditCallMuteVideoDto.class, str);
    }

    public static MessagesEditCallMuteVideoDto[] values() {
        return (MessagesEditCallMuteVideoDto[]) $VALUES.clone();
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
