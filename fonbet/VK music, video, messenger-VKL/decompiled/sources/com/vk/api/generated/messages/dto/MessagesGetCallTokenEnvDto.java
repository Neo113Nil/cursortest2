package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesGetCallTokenEnvDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetCallTokenEnvDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesGetCallTokenEnvDto[] $VALUES;
    public static final Parcelable.Creator<MessagesGetCallTokenEnvDto> CREATOR;

    @pmi0("development")
    public static final MessagesGetCallTokenEnvDto DEVELOPMENT;

    @pmi0("production")
    public static final MessagesGetCallTokenEnvDto PRODUCTION;
    private final String value;

    /* compiled from: MessagesGetCallTokenEnvDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetCallTokenEnvDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetCallTokenEnvDto createFromParcel(Parcel parcel) {
            return MessagesGetCallTokenEnvDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetCallTokenEnvDto[] newArray(int i) {
            return new MessagesGetCallTokenEnvDto[i];
        }
    }

    static {
        MessagesGetCallTokenEnvDto messagesGetCallTokenEnvDto = new MessagesGetCallTokenEnvDto("DEVELOPMENT", 0, "development");
        DEVELOPMENT = messagesGetCallTokenEnvDto;
        MessagesGetCallTokenEnvDto messagesGetCallTokenEnvDto2 = new MessagesGetCallTokenEnvDto("PRODUCTION", 1, "production");
        PRODUCTION = messagesGetCallTokenEnvDto2;
        MessagesGetCallTokenEnvDto[] messagesGetCallTokenEnvDtoArr = {messagesGetCallTokenEnvDto, messagesGetCallTokenEnvDto2};
        $VALUES = messagesGetCallTokenEnvDtoArr;
        $ENTRIES = new asp(messagesGetCallTokenEnvDtoArr);
        CREATOR = new a();
    }

    private MessagesGetCallTokenEnvDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesGetCallTokenEnvDto valueOf(String str) {
        return (MessagesGetCallTokenEnvDto) Enum.valueOf(MessagesGetCallTokenEnvDto.class, str);
    }

    public static MessagesGetCallTokenEnvDto[] values() {
        return (MessagesGetCallTokenEnvDto[]) $VALUES.clone();
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
