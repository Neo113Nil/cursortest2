package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesGetConversationStylesSizeDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetConversationStylesSizeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesGetConversationStylesSizeDto[] $VALUES;
    public static final Parcelable.Creator<MessagesGetConversationStylesSizeDto> CREATOR;

    @pmi0("hdpi")
    public static final MessagesGetConversationStylesSizeDto HDPI;

    @pmi0("ihdpi")
    public static final MessagesGetConversationStylesSizeDto IHDPI;

    @pmi0("ixhdpi")
    public static final MessagesGetConversationStylesSizeDto IXHDPI;

    @pmi0("ixxhdpi")
    public static final MessagesGetConversationStylesSizeDto IXXHDPI;

    @pmi0("ixxxhdpi")
    public static final MessagesGetConversationStylesSizeDto IXXXHDPI;

    @pmi0("xhdpi")
    public static final MessagesGetConversationStylesSizeDto XHDPI;

    @pmi0("xxhdpi")
    public static final MessagesGetConversationStylesSizeDto XXHDPI;

    @pmi0("xxxhdpi")
    public static final MessagesGetConversationStylesSizeDto XXXHDPI;

    @pmi0("xxxxhdpi")
    public static final MessagesGetConversationStylesSizeDto XXXXHDPI;
    private final String value;

    /* compiled from: MessagesGetConversationStylesSizeDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetConversationStylesSizeDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetConversationStylesSizeDto createFromParcel(Parcel parcel) {
            return MessagesGetConversationStylesSizeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetConversationStylesSizeDto[] newArray(int i) {
            return new MessagesGetConversationStylesSizeDto[i];
        }
    }

    static {
        MessagesGetConversationStylesSizeDto messagesGetConversationStylesSizeDto = new MessagesGetConversationStylesSizeDto("HDPI", 0, "hdpi");
        HDPI = messagesGetConversationStylesSizeDto;
        MessagesGetConversationStylesSizeDto messagesGetConversationStylesSizeDto2 = new MessagesGetConversationStylesSizeDto("IHDPI", 1, "ihdpi");
        IHDPI = messagesGetConversationStylesSizeDto2;
        MessagesGetConversationStylesSizeDto messagesGetConversationStylesSizeDto3 = new MessagesGetConversationStylesSizeDto("IXHDPI", 2, "ixhdpi");
        IXHDPI = messagesGetConversationStylesSizeDto3;
        MessagesGetConversationStylesSizeDto messagesGetConversationStylesSizeDto4 = new MessagesGetConversationStylesSizeDto("IXXHDPI", 3, "ixxhdpi");
        IXXHDPI = messagesGetConversationStylesSizeDto4;
        MessagesGetConversationStylesSizeDto messagesGetConversationStylesSizeDto5 = new MessagesGetConversationStylesSizeDto("IXXXHDPI", 4, "ixxxhdpi");
        IXXXHDPI = messagesGetConversationStylesSizeDto5;
        MessagesGetConversationStylesSizeDto messagesGetConversationStylesSizeDto6 = new MessagesGetConversationStylesSizeDto("XHDPI", 5, "xhdpi");
        XHDPI = messagesGetConversationStylesSizeDto6;
        MessagesGetConversationStylesSizeDto messagesGetConversationStylesSizeDto7 = new MessagesGetConversationStylesSizeDto("XXHDPI", 6, "xxhdpi");
        XXHDPI = messagesGetConversationStylesSizeDto7;
        MessagesGetConversationStylesSizeDto messagesGetConversationStylesSizeDto8 = new MessagesGetConversationStylesSizeDto("XXXHDPI", 7, "xxxhdpi");
        XXXHDPI = messagesGetConversationStylesSizeDto8;
        MessagesGetConversationStylesSizeDto messagesGetConversationStylesSizeDto9 = new MessagesGetConversationStylesSizeDto("XXXXHDPI", 8, "xxxxhdpi");
        XXXXHDPI = messagesGetConversationStylesSizeDto9;
        MessagesGetConversationStylesSizeDto[] messagesGetConversationStylesSizeDtoArr = {messagesGetConversationStylesSizeDto, messagesGetConversationStylesSizeDto2, messagesGetConversationStylesSizeDto3, messagesGetConversationStylesSizeDto4, messagesGetConversationStylesSizeDto5, messagesGetConversationStylesSizeDto6, messagesGetConversationStylesSizeDto7, messagesGetConversationStylesSizeDto8, messagesGetConversationStylesSizeDto9};
        $VALUES = messagesGetConversationStylesSizeDtoArr;
        $ENTRIES = new asp(messagesGetConversationStylesSizeDtoArr);
        CREATOR = new a();
    }

    private MessagesGetConversationStylesSizeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesGetConversationStylesSizeDto valueOf(String str) {
        return (MessagesGetConversationStylesSizeDto) Enum.valueOf(MessagesGetConversationStylesSizeDto.class, str);
    }

    public static MessagesGetConversationStylesSizeDto[] values() {
        return (MessagesGetConversationStylesSizeDto[]) $VALUES.clone();
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
