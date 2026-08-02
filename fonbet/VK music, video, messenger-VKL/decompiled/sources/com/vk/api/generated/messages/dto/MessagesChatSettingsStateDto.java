package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesChatSettingsStateDto.kt */
/* loaded from: classes15.dex */
public final class MessagesChatSettingsStateDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesChatSettingsStateDto[] $VALUES;
    public static final Parcelable.Creator<MessagesChatSettingsStateDto> CREATOR;

    @pmi0("in")
    public static final MessagesChatSettingsStateDto IN;

    @pmi0("kicked")
    public static final MessagesChatSettingsStateDto KICKED;

    @pmi0(TtmlNode.LEFT)
    public static final MessagesChatSettingsStateDto LEFT;

    @pmi0("out")
    public static final MessagesChatSettingsStateDto OUT;
    private final String value;

    /* compiled from: MessagesChatSettingsStateDto.kt */
    public static final class a implements Parcelable.Creator<MessagesChatSettingsStateDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesChatSettingsStateDto createFromParcel(Parcel parcel) {
            return MessagesChatSettingsStateDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesChatSettingsStateDto[] newArray(int i) {
            return new MessagesChatSettingsStateDto[i];
        }
    }

    static {
        MessagesChatSettingsStateDto messagesChatSettingsStateDto = new MessagesChatSettingsStateDto("IN", 0, "in");
        IN = messagesChatSettingsStateDto;
        MessagesChatSettingsStateDto messagesChatSettingsStateDto2 = new MessagesChatSettingsStateDto("KICKED", 1, "kicked");
        KICKED = messagesChatSettingsStateDto2;
        MessagesChatSettingsStateDto messagesChatSettingsStateDto3 = new MessagesChatSettingsStateDto("LEFT", 2, TtmlNode.LEFT);
        LEFT = messagesChatSettingsStateDto3;
        MessagesChatSettingsStateDto messagesChatSettingsStateDto4 = new MessagesChatSettingsStateDto("OUT", 3, "out");
        OUT = messagesChatSettingsStateDto4;
        MessagesChatSettingsStateDto[] messagesChatSettingsStateDtoArr = {messagesChatSettingsStateDto, messagesChatSettingsStateDto2, messagesChatSettingsStateDto3, messagesChatSettingsStateDto4};
        $VALUES = messagesChatSettingsStateDtoArr;
        $ENTRIES = new asp(messagesChatSettingsStateDtoArr);
        CREATOR = new a();
    }

    private MessagesChatSettingsStateDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesChatSettingsStateDto valueOf(String str) {
        return (MessagesChatSettingsStateDto) Enum.valueOf(MessagesChatSettingsStateDto.class, str);
    }

    public static MessagesChatSettingsStateDto[] values() {
        return (MessagesChatSettingsStateDto[]) $VALUES.clone();
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
