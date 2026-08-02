package com.vk.api.generated.ecosystem.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EcosystemCheckOtpVerificationMethodDto.kt */
/* loaded from: classes14.dex */
public final class EcosystemCheckOtpVerificationMethodDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EcosystemCheckOtpVerificationMethodDto[] $VALUES;

    @pmi0("callreset")
    public static final EcosystemCheckOtpVerificationMethodDto CALLRESET;

    @pmi0("call_in")
    public static final EcosystemCheckOtpVerificationMethodDto CALL_IN;

    @pmi0("codegen")
    public static final EcosystemCheckOtpVerificationMethodDto CODEGEN;
    public static final Parcelable.Creator<EcosystemCheckOtpVerificationMethodDto> CREATOR;

    @pmi0("email")
    public static final EcosystemCheckOtpVerificationMethodDto EMAIL;

    @pmi0("max_code")
    public static final EcosystemCheckOtpVerificationMethodDto MAX_CODE;

    @pmi0("max_messenger")
    public static final EcosystemCheckOtpVerificationMethodDto MAX_MESSENGER;

    @pmi0("official_messenger")
    public static final EcosystemCheckOtpVerificationMethodDto OFFICIAL_MESSENGER;

    @pmi0("push")
    public static final EcosystemCheckOtpVerificationMethodDto PUSH;

    @pmi0("reserve_code")
    public static final EcosystemCheckOtpVerificationMethodDto RESERVE_CODE;

    @pmi0("sms")
    public static final EcosystemCheckOtpVerificationMethodDto SMS;

    @pmi0("telegram")
    public static final EcosystemCheckOtpVerificationMethodDto TELEGRAM;

    @pmi0("viber")
    public static final EcosystemCheckOtpVerificationMethodDto VIBER;

    @pmi0("whatsapp")
    public static final EcosystemCheckOtpVerificationMethodDto WHATSAPP;
    private final String value;

    /* compiled from: EcosystemCheckOtpVerificationMethodDto.kt */
    public static final class a implements Parcelable.Creator<EcosystemCheckOtpVerificationMethodDto> {
        @Override // android.os.Parcelable.Creator
        public final EcosystemCheckOtpVerificationMethodDto createFromParcel(Parcel parcel) {
            return EcosystemCheckOtpVerificationMethodDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EcosystemCheckOtpVerificationMethodDto[] newArray(int i) {
            return new EcosystemCheckOtpVerificationMethodDto[i];
        }
    }

    static {
        EcosystemCheckOtpVerificationMethodDto ecosystemCheckOtpVerificationMethodDto = new EcosystemCheckOtpVerificationMethodDto("CALL_IN", 0, "call_in");
        CALL_IN = ecosystemCheckOtpVerificationMethodDto;
        EcosystemCheckOtpVerificationMethodDto ecosystemCheckOtpVerificationMethodDto2 = new EcosystemCheckOtpVerificationMethodDto("CALLRESET", 1, "callreset");
        CALLRESET = ecosystemCheckOtpVerificationMethodDto2;
        EcosystemCheckOtpVerificationMethodDto ecosystemCheckOtpVerificationMethodDto3 = new EcosystemCheckOtpVerificationMethodDto("CODEGEN", 2, "codegen");
        CODEGEN = ecosystemCheckOtpVerificationMethodDto3;
        EcosystemCheckOtpVerificationMethodDto ecosystemCheckOtpVerificationMethodDto4 = new EcosystemCheckOtpVerificationMethodDto(CommonConstant.RETKEY.EMAIL, 3, "email");
        EMAIL = ecosystemCheckOtpVerificationMethodDto4;
        EcosystemCheckOtpVerificationMethodDto ecosystemCheckOtpVerificationMethodDto5 = new EcosystemCheckOtpVerificationMethodDto("MAX_CODE", 4, "max_code");
        MAX_CODE = ecosystemCheckOtpVerificationMethodDto5;
        EcosystemCheckOtpVerificationMethodDto ecosystemCheckOtpVerificationMethodDto6 = new EcosystemCheckOtpVerificationMethodDto("MAX_MESSENGER", 5, "max_messenger");
        MAX_MESSENGER = ecosystemCheckOtpVerificationMethodDto6;
        EcosystemCheckOtpVerificationMethodDto ecosystemCheckOtpVerificationMethodDto7 = new EcosystemCheckOtpVerificationMethodDto("OFFICIAL_MESSENGER", 6, "official_messenger");
        OFFICIAL_MESSENGER = ecosystemCheckOtpVerificationMethodDto7;
        EcosystemCheckOtpVerificationMethodDto ecosystemCheckOtpVerificationMethodDto8 = new EcosystemCheckOtpVerificationMethodDto("PUSH", 7, "push");
        PUSH = ecosystemCheckOtpVerificationMethodDto8;
        EcosystemCheckOtpVerificationMethodDto ecosystemCheckOtpVerificationMethodDto9 = new EcosystemCheckOtpVerificationMethodDto("RESERVE_CODE", 8, "reserve_code");
        RESERVE_CODE = ecosystemCheckOtpVerificationMethodDto9;
        EcosystemCheckOtpVerificationMethodDto ecosystemCheckOtpVerificationMethodDto10 = new EcosystemCheckOtpVerificationMethodDto("SMS", 9, "sms");
        SMS = ecosystemCheckOtpVerificationMethodDto10;
        EcosystemCheckOtpVerificationMethodDto ecosystemCheckOtpVerificationMethodDto11 = new EcosystemCheckOtpVerificationMethodDto("TELEGRAM", 10, "telegram");
        TELEGRAM = ecosystemCheckOtpVerificationMethodDto11;
        EcosystemCheckOtpVerificationMethodDto ecosystemCheckOtpVerificationMethodDto12 = new EcosystemCheckOtpVerificationMethodDto("VIBER", 11, "viber");
        VIBER = ecosystemCheckOtpVerificationMethodDto12;
        EcosystemCheckOtpVerificationMethodDto ecosystemCheckOtpVerificationMethodDto13 = new EcosystemCheckOtpVerificationMethodDto("WHATSAPP", 12, "whatsapp");
        WHATSAPP = ecosystemCheckOtpVerificationMethodDto13;
        EcosystemCheckOtpVerificationMethodDto[] ecosystemCheckOtpVerificationMethodDtoArr = {ecosystemCheckOtpVerificationMethodDto, ecosystemCheckOtpVerificationMethodDto2, ecosystemCheckOtpVerificationMethodDto3, ecosystemCheckOtpVerificationMethodDto4, ecosystemCheckOtpVerificationMethodDto5, ecosystemCheckOtpVerificationMethodDto6, ecosystemCheckOtpVerificationMethodDto7, ecosystemCheckOtpVerificationMethodDto8, ecosystemCheckOtpVerificationMethodDto9, ecosystemCheckOtpVerificationMethodDto10, ecosystemCheckOtpVerificationMethodDto11, ecosystemCheckOtpVerificationMethodDto12, ecosystemCheckOtpVerificationMethodDto13};
        $VALUES = ecosystemCheckOtpVerificationMethodDtoArr;
        $ENTRIES = new asp(ecosystemCheckOtpVerificationMethodDtoArr);
        CREATOR = new a();
    }

    private EcosystemCheckOtpVerificationMethodDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static EcosystemCheckOtpVerificationMethodDto valueOf(String str) {
        return (EcosystemCheckOtpVerificationMethodDto) Enum.valueOf(EcosystemCheckOtpVerificationMethodDto.class, str);
    }

    public static EcosystemCheckOtpVerificationMethodDto[] values() {
        return (EcosystemCheckOtpVerificationMethodDto[]) $VALUES.clone();
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
