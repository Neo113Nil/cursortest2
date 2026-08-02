package com.vk.api.generated.ecosystem.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EcosystemSendOtpMessengerMessengerDto.kt */
/* loaded from: classes14.dex */
public final class EcosystemSendOtpMessengerMessengerDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EcosystemSendOtpMessengerMessengerDto[] $VALUES;
    public static final Parcelable.Creator<EcosystemSendOtpMessengerMessengerDto> CREATOR;

    @pmi0("telegram")
    public static final EcosystemSendOtpMessengerMessengerDto TELEGRAM;

    @pmi0("viber")
    public static final EcosystemSendOtpMessengerMessengerDto VIBER;

    @pmi0("whatsapp")
    public static final EcosystemSendOtpMessengerMessengerDto WHATSAPP;
    private final String value;

    /* compiled from: EcosystemSendOtpMessengerMessengerDto.kt */
    public static final class a implements Parcelable.Creator<EcosystemSendOtpMessengerMessengerDto> {
        @Override // android.os.Parcelable.Creator
        public final EcosystemSendOtpMessengerMessengerDto createFromParcel(Parcel parcel) {
            return EcosystemSendOtpMessengerMessengerDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EcosystemSendOtpMessengerMessengerDto[] newArray(int i) {
            return new EcosystemSendOtpMessengerMessengerDto[i];
        }
    }

    static {
        EcosystemSendOtpMessengerMessengerDto ecosystemSendOtpMessengerMessengerDto = new EcosystemSendOtpMessengerMessengerDto("TELEGRAM", 0, "telegram");
        TELEGRAM = ecosystemSendOtpMessengerMessengerDto;
        EcosystemSendOtpMessengerMessengerDto ecosystemSendOtpMessengerMessengerDto2 = new EcosystemSendOtpMessengerMessengerDto("VIBER", 1, "viber");
        VIBER = ecosystemSendOtpMessengerMessengerDto2;
        EcosystemSendOtpMessengerMessengerDto ecosystemSendOtpMessengerMessengerDto3 = new EcosystemSendOtpMessengerMessengerDto("WHATSAPP", 2, "whatsapp");
        WHATSAPP = ecosystemSendOtpMessengerMessengerDto3;
        EcosystemSendOtpMessengerMessengerDto[] ecosystemSendOtpMessengerMessengerDtoArr = {ecosystemSendOtpMessengerMessengerDto, ecosystemSendOtpMessengerMessengerDto2, ecosystemSendOtpMessengerMessengerDto3};
        $VALUES = ecosystemSendOtpMessengerMessengerDtoArr;
        $ENTRIES = new asp(ecosystemSendOtpMessengerMessengerDtoArr);
        CREATOR = new a();
    }

    private EcosystemSendOtpMessengerMessengerDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static EcosystemSendOtpMessengerMessengerDto valueOf(String str) {
        return (EcosystemSendOtpMessengerMessengerDto) Enum.valueOf(EcosystemSendOtpMessengerMessengerDto.class, str);
    }

    public static EcosystemSendOtpMessengerMessengerDto[] values() {
        return (EcosystemSendOtpMessengerMessengerDto[]) $VALUES.clone();
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
