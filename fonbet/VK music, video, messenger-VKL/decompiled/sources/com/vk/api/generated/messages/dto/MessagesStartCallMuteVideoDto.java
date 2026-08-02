package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesStartCallMuteVideoDto.kt */
/* loaded from: classes15.dex */
public final class MessagesStartCallMuteVideoDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesStartCallMuteVideoDto[] $VALUES;
    public static final Parcelable.Creator<MessagesStartCallMuteVideoDto> CREATOR;

    @pmi0("mute")
    public static final MessagesStartCallMuteVideoDto MUTE;

    @pmi0("mute_permanent")
    public static final MessagesStartCallMuteVideoDto MUTE_PERMANENT;

    @pmi0("not_set")
    public static final MessagesStartCallMuteVideoDto NOT_SET;

    @pmi0("unmute")
    public static final MessagesStartCallMuteVideoDto UNMUTE;
    private final String value;

    /* compiled from: MessagesStartCallMuteVideoDto.kt */
    public static final class a implements Parcelable.Creator<MessagesStartCallMuteVideoDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesStartCallMuteVideoDto createFromParcel(Parcel parcel) {
            return MessagesStartCallMuteVideoDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesStartCallMuteVideoDto[] newArray(int i) {
            return new MessagesStartCallMuteVideoDto[i];
        }
    }

    static {
        MessagesStartCallMuteVideoDto messagesStartCallMuteVideoDto = new MessagesStartCallMuteVideoDto(SignalingProtocol.MEDIA_OPTION_STATE_MUTE, 0, "mute");
        MUTE = messagesStartCallMuteVideoDto;
        MessagesStartCallMuteVideoDto messagesStartCallMuteVideoDto2 = new MessagesStartCallMuteVideoDto(SignalingProtocol.MEDIA_OPTION_STATE_MUTE_PERMANENT, 1, "mute_permanent");
        MUTE_PERMANENT = messagesStartCallMuteVideoDto2;
        MessagesStartCallMuteVideoDto messagesStartCallMuteVideoDto3 = new MessagesStartCallMuteVideoDto("NOT_SET", 2, "not_set");
        NOT_SET = messagesStartCallMuteVideoDto3;
        MessagesStartCallMuteVideoDto messagesStartCallMuteVideoDto4 = new MessagesStartCallMuteVideoDto(SignalingProtocol.MEDIA_OPTION_STATE_UNMUTE, 3, "unmute");
        UNMUTE = messagesStartCallMuteVideoDto4;
        MessagesStartCallMuteVideoDto[] messagesStartCallMuteVideoDtoArr = {messagesStartCallMuteVideoDto, messagesStartCallMuteVideoDto2, messagesStartCallMuteVideoDto3, messagesStartCallMuteVideoDto4};
        $VALUES = messagesStartCallMuteVideoDtoArr;
        $ENTRIES = new asp(messagesStartCallMuteVideoDtoArr);
        CREATOR = new a();
    }

    private MessagesStartCallMuteVideoDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesStartCallMuteVideoDto valueOf(String str) {
        return (MessagesStartCallMuteVideoDto) Enum.valueOf(MessagesStartCallMuteVideoDto.class, str);
    }

    public static MessagesStartCallMuteVideoDto[] values() {
        return (MessagesStartCallMuteVideoDto[]) $VALUES.clone();
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
