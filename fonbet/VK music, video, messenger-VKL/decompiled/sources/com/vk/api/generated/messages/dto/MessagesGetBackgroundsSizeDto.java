package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesGetBackgroundsSizeDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetBackgroundsSizeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesGetBackgroundsSizeDto[] $VALUES;
    public static final Parcelable.Creator<MessagesGetBackgroundsSizeDto> CREATOR;

    @pmi0("hdpi")
    public static final MessagesGetBackgroundsSizeDto HDPI;

    @pmi0("ihdpi")
    public static final MessagesGetBackgroundsSizeDto IHDPI;

    @pmi0("ixhdpi")
    public static final MessagesGetBackgroundsSizeDto IXHDPI;

    @pmi0("ixxhdpi")
    public static final MessagesGetBackgroundsSizeDto IXXHDPI;

    @pmi0("ixxxhdpi")
    public static final MessagesGetBackgroundsSizeDto IXXXHDPI;

    @pmi0("xhdpi")
    public static final MessagesGetBackgroundsSizeDto XHDPI;

    @pmi0("xxhdpi")
    public static final MessagesGetBackgroundsSizeDto XXHDPI;

    @pmi0("xxxhdpi")
    public static final MessagesGetBackgroundsSizeDto XXXHDPI;

    @pmi0("xxxxhdpi")
    public static final MessagesGetBackgroundsSizeDto XXXXHDPI;
    private final String value;

    /* compiled from: MessagesGetBackgroundsSizeDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetBackgroundsSizeDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetBackgroundsSizeDto createFromParcel(Parcel parcel) {
            return MessagesGetBackgroundsSizeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetBackgroundsSizeDto[] newArray(int i) {
            return new MessagesGetBackgroundsSizeDto[i];
        }
    }

    static {
        MessagesGetBackgroundsSizeDto messagesGetBackgroundsSizeDto = new MessagesGetBackgroundsSizeDto("HDPI", 0, "hdpi");
        HDPI = messagesGetBackgroundsSizeDto;
        MessagesGetBackgroundsSizeDto messagesGetBackgroundsSizeDto2 = new MessagesGetBackgroundsSizeDto("IHDPI", 1, "ihdpi");
        IHDPI = messagesGetBackgroundsSizeDto2;
        MessagesGetBackgroundsSizeDto messagesGetBackgroundsSizeDto3 = new MessagesGetBackgroundsSizeDto("IXHDPI", 2, "ixhdpi");
        IXHDPI = messagesGetBackgroundsSizeDto3;
        MessagesGetBackgroundsSizeDto messagesGetBackgroundsSizeDto4 = new MessagesGetBackgroundsSizeDto("IXXHDPI", 3, "ixxhdpi");
        IXXHDPI = messagesGetBackgroundsSizeDto4;
        MessagesGetBackgroundsSizeDto messagesGetBackgroundsSizeDto5 = new MessagesGetBackgroundsSizeDto("IXXXHDPI", 4, "ixxxhdpi");
        IXXXHDPI = messagesGetBackgroundsSizeDto5;
        MessagesGetBackgroundsSizeDto messagesGetBackgroundsSizeDto6 = new MessagesGetBackgroundsSizeDto("XHDPI", 5, "xhdpi");
        XHDPI = messagesGetBackgroundsSizeDto6;
        MessagesGetBackgroundsSizeDto messagesGetBackgroundsSizeDto7 = new MessagesGetBackgroundsSizeDto("XXHDPI", 6, "xxhdpi");
        XXHDPI = messagesGetBackgroundsSizeDto7;
        MessagesGetBackgroundsSizeDto messagesGetBackgroundsSizeDto8 = new MessagesGetBackgroundsSizeDto("XXXHDPI", 7, "xxxhdpi");
        XXXHDPI = messagesGetBackgroundsSizeDto8;
        MessagesGetBackgroundsSizeDto messagesGetBackgroundsSizeDto9 = new MessagesGetBackgroundsSizeDto("XXXXHDPI", 8, "xxxxhdpi");
        XXXXHDPI = messagesGetBackgroundsSizeDto9;
        MessagesGetBackgroundsSizeDto[] messagesGetBackgroundsSizeDtoArr = {messagesGetBackgroundsSizeDto, messagesGetBackgroundsSizeDto2, messagesGetBackgroundsSizeDto3, messagesGetBackgroundsSizeDto4, messagesGetBackgroundsSizeDto5, messagesGetBackgroundsSizeDto6, messagesGetBackgroundsSizeDto7, messagesGetBackgroundsSizeDto8, messagesGetBackgroundsSizeDto9};
        $VALUES = messagesGetBackgroundsSizeDtoArr;
        $ENTRIES = new asp(messagesGetBackgroundsSizeDtoArr);
        CREATOR = new a();
    }

    private MessagesGetBackgroundsSizeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesGetBackgroundsSizeDto valueOf(String str) {
        return (MessagesGetBackgroundsSizeDto) Enum.valueOf(MessagesGetBackgroundsSizeDto.class, str);
    }

    public static MessagesGetBackgroundsSizeDto[] values() {
        return (MessagesGetBackgroundsSizeDto[]) $VALUES.clone();
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
