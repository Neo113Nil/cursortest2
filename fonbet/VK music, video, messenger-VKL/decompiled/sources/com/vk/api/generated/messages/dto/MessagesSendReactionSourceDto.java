package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesSendReactionSourceDto.kt */
/* loaded from: classes15.dex */
public final class MessagesSendReactionSourceDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesSendReactionSourceDto[] $VALUES;

    @pmi0("clip_fullscreen")
    public static final MessagesSendReactionSourceDto CLIP_FULLSCREEN;
    public static final Parcelable.Creator<MessagesSendReactionSourceDto> CREATOR;

    @pmi0("double_click")
    public static final MessagesSendReactionSourceDto DOUBLE_CLICK;

    @pmi0("floating_button")
    public static final MessagesSendReactionSourceDto FLOATING_BUTTON;

    @pmi0("long_click")
    public static final MessagesSendReactionSourceDto LONG_CLICK;

    @pmi0("nearby_click")
    public static final MessagesSendReactionSourceDto NEARBY_CLICK;

    @pmi0("suggest")
    public static final MessagesSendReactionSourceDto SUGGEST;
    private final String value;

    /* compiled from: MessagesSendReactionSourceDto.kt */
    public static final class a implements Parcelable.Creator<MessagesSendReactionSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesSendReactionSourceDto createFromParcel(Parcel parcel) {
            return MessagesSendReactionSourceDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesSendReactionSourceDto[] newArray(int i) {
            return new MessagesSendReactionSourceDto[i];
        }
    }

    static {
        MessagesSendReactionSourceDto messagesSendReactionSourceDto = new MessagesSendReactionSourceDto("CLIP_FULLSCREEN", 0, "clip_fullscreen");
        CLIP_FULLSCREEN = messagesSendReactionSourceDto;
        MessagesSendReactionSourceDto messagesSendReactionSourceDto2 = new MessagesSendReactionSourceDto("DOUBLE_CLICK", 1, "double_click");
        DOUBLE_CLICK = messagesSendReactionSourceDto2;
        MessagesSendReactionSourceDto messagesSendReactionSourceDto3 = new MessagesSendReactionSourceDto("FLOATING_BUTTON", 2, "floating_button");
        FLOATING_BUTTON = messagesSendReactionSourceDto3;
        MessagesSendReactionSourceDto messagesSendReactionSourceDto4 = new MessagesSendReactionSourceDto("LONG_CLICK", 3, "long_click");
        LONG_CLICK = messagesSendReactionSourceDto4;
        MessagesSendReactionSourceDto messagesSendReactionSourceDto5 = new MessagesSendReactionSourceDto("NEARBY_CLICK", 4, "nearby_click");
        NEARBY_CLICK = messagesSendReactionSourceDto5;
        MessagesSendReactionSourceDto messagesSendReactionSourceDto6 = new MessagesSendReactionSourceDto("SUGGEST", 5, "suggest");
        SUGGEST = messagesSendReactionSourceDto6;
        MessagesSendReactionSourceDto[] messagesSendReactionSourceDtoArr = {messagesSendReactionSourceDto, messagesSendReactionSourceDto2, messagesSendReactionSourceDto3, messagesSendReactionSourceDto4, messagesSendReactionSourceDto5, messagesSendReactionSourceDto6};
        $VALUES = messagesSendReactionSourceDtoArr;
        $ENTRIES = new asp(messagesSendReactionSourceDtoArr);
        CREATOR = new a();
    }

    private MessagesSendReactionSourceDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<MessagesSendReactionSourceDto> i() {
        return $ENTRIES;
    }

    public static MessagesSendReactionSourceDto valueOf(String str) {
        return (MessagesSendReactionSourceDto) Enum.valueOf(MessagesSendReactionSourceDto.class, str);
    }

    public static MessagesSendReactionSourceDto[] values() {
        return (MessagesSendReactionSourceDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String j() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
