package com.vk.api.generated.esia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EsiaGetEsiaUserInfoFlowDto.kt */
/* loaded from: classes14.dex */
public final class EsiaGetEsiaUserInfoFlowDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EsiaGetEsiaUserInfoFlowDto[] $VALUES;
    public static final Parcelable.Creator<EsiaGetEsiaUserInfoFlowDto> CREATOR;

    @pmi0("login")
    public static final EsiaGetEsiaUserInfoFlowDto LOGIN;

    @pmi0("verify")
    public static final EsiaGetEsiaUserInfoFlowDto VERIFY;
    private final String value;

    /* compiled from: EsiaGetEsiaUserInfoFlowDto.kt */
    public static final class a implements Parcelable.Creator<EsiaGetEsiaUserInfoFlowDto> {
        @Override // android.os.Parcelable.Creator
        public final EsiaGetEsiaUserInfoFlowDto createFromParcel(Parcel parcel) {
            return EsiaGetEsiaUserInfoFlowDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EsiaGetEsiaUserInfoFlowDto[] newArray(int i) {
            return new EsiaGetEsiaUserInfoFlowDto[i];
        }
    }

    static {
        EsiaGetEsiaUserInfoFlowDto esiaGetEsiaUserInfoFlowDto = new EsiaGetEsiaUserInfoFlowDto("LOGIN", 0, "login");
        LOGIN = esiaGetEsiaUserInfoFlowDto;
        EsiaGetEsiaUserInfoFlowDto esiaGetEsiaUserInfoFlowDto2 = new EsiaGetEsiaUserInfoFlowDto("VERIFY", 1, "verify");
        VERIFY = esiaGetEsiaUserInfoFlowDto2;
        EsiaGetEsiaUserInfoFlowDto[] esiaGetEsiaUserInfoFlowDtoArr = {esiaGetEsiaUserInfoFlowDto, esiaGetEsiaUserInfoFlowDto2};
        $VALUES = esiaGetEsiaUserInfoFlowDtoArr;
        $ENTRIES = new asp(esiaGetEsiaUserInfoFlowDtoArr);
        CREATOR = new a();
    }

    private EsiaGetEsiaUserInfoFlowDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static EsiaGetEsiaUserInfoFlowDto valueOf(String str) {
        return (EsiaGetEsiaUserInfoFlowDto) Enum.valueOf(EsiaGetEsiaUserInfoFlowDto.class, str);
    }

    public static EsiaGetEsiaUserInfoFlowDto[] values() {
        return (EsiaGetEsiaUserInfoFlowDto[]) $VALUES.clone();
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
