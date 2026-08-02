package com.vk.api.generated.esia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EsiaCheckEsiaLinkFlowDto.kt */
/* loaded from: classes14.dex */
public final class EsiaCheckEsiaLinkFlowDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EsiaCheckEsiaLinkFlowDto[] $VALUES;
    public static final Parcelable.Creator<EsiaCheckEsiaLinkFlowDto> CREATOR;

    @pmi0("login")
    public static final EsiaCheckEsiaLinkFlowDto LOGIN;

    @pmi0("verify")
    public static final EsiaCheckEsiaLinkFlowDto VERIFY;
    private final String value;

    /* compiled from: EsiaCheckEsiaLinkFlowDto.kt */
    public static final class a implements Parcelable.Creator<EsiaCheckEsiaLinkFlowDto> {
        @Override // android.os.Parcelable.Creator
        public final EsiaCheckEsiaLinkFlowDto createFromParcel(Parcel parcel) {
            return EsiaCheckEsiaLinkFlowDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EsiaCheckEsiaLinkFlowDto[] newArray(int i) {
            return new EsiaCheckEsiaLinkFlowDto[i];
        }
    }

    static {
        EsiaCheckEsiaLinkFlowDto esiaCheckEsiaLinkFlowDto = new EsiaCheckEsiaLinkFlowDto("LOGIN", 0, "login");
        LOGIN = esiaCheckEsiaLinkFlowDto;
        EsiaCheckEsiaLinkFlowDto esiaCheckEsiaLinkFlowDto2 = new EsiaCheckEsiaLinkFlowDto("VERIFY", 1, "verify");
        VERIFY = esiaCheckEsiaLinkFlowDto2;
        EsiaCheckEsiaLinkFlowDto[] esiaCheckEsiaLinkFlowDtoArr = {esiaCheckEsiaLinkFlowDto, esiaCheckEsiaLinkFlowDto2};
        $VALUES = esiaCheckEsiaLinkFlowDtoArr;
        $ENTRIES = new asp(esiaCheckEsiaLinkFlowDtoArr);
        CREATOR = new a();
    }

    private EsiaCheckEsiaLinkFlowDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static EsiaCheckEsiaLinkFlowDto valueOf(String str) {
        return (EsiaCheckEsiaLinkFlowDto) Enum.valueOf(EsiaCheckEsiaLinkFlowDto.class, str);
    }

    public static EsiaCheckEsiaLinkFlowDto[] values() {
        return (EsiaCheckEsiaLinkFlowDto[]) $VALUES.clone();
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
