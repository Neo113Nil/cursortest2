package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesGetContactCallTokenEnvDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetContactCallTokenEnvDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesGetContactCallTokenEnvDto[] $VALUES;
    public static final Parcelable.Creator<MessagesGetContactCallTokenEnvDto> CREATOR;

    @pmi0("development")
    public static final MessagesGetContactCallTokenEnvDto DEVELOPMENT;

    @pmi0("production")
    public static final MessagesGetContactCallTokenEnvDto PRODUCTION;
    private final String value;

    /* compiled from: MessagesGetContactCallTokenEnvDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetContactCallTokenEnvDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetContactCallTokenEnvDto createFromParcel(Parcel parcel) {
            return MessagesGetContactCallTokenEnvDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetContactCallTokenEnvDto[] newArray(int i) {
            return new MessagesGetContactCallTokenEnvDto[i];
        }
    }

    static {
        MessagesGetContactCallTokenEnvDto messagesGetContactCallTokenEnvDto = new MessagesGetContactCallTokenEnvDto("DEVELOPMENT", 0, "development");
        DEVELOPMENT = messagesGetContactCallTokenEnvDto;
        MessagesGetContactCallTokenEnvDto messagesGetContactCallTokenEnvDto2 = new MessagesGetContactCallTokenEnvDto("PRODUCTION", 1, "production");
        PRODUCTION = messagesGetContactCallTokenEnvDto2;
        MessagesGetContactCallTokenEnvDto[] messagesGetContactCallTokenEnvDtoArr = {messagesGetContactCallTokenEnvDto, messagesGetContactCallTokenEnvDto2};
        $VALUES = messagesGetContactCallTokenEnvDtoArr;
        $ENTRIES = new asp(messagesGetContactCallTokenEnvDtoArr);
        CREATOR = new a();
    }

    private MessagesGetContactCallTokenEnvDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesGetContactCallTokenEnvDto valueOf(String str) {
        return (MessagesGetContactCallTokenEnvDto) Enum.valueOf(MessagesGetContactCallTokenEnvDto.class, str);
    }

    public static MessagesGetContactCallTokenEnvDto[] values() {
        return (MessagesGetContactCallTokenEnvDto[]) $VALUES.clone();
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
