package com.vk.api.generated.ecosystem.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EcosystemAddLibverifyEventEventTypeDto.kt */
/* loaded from: classes14.dex */
public final class EcosystemAddLibverifyEventEventTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EcosystemAddLibverifyEventEventTypeDto[] $VALUES;

    @pmi0("auth_phone_requested")
    public static final EcosystemAddLibverifyEventEventTypeDto AUTH_PHONE_REQUESTED;
    public static final Parcelable.Creator<EcosystemAddLibverifyEventEventTypeDto> CREATOR;
    private final String value;

    /* compiled from: EcosystemAddLibverifyEventEventTypeDto.kt */
    public static final class a implements Parcelable.Creator<EcosystemAddLibverifyEventEventTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final EcosystemAddLibverifyEventEventTypeDto createFromParcel(Parcel parcel) {
            return EcosystemAddLibverifyEventEventTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EcosystemAddLibverifyEventEventTypeDto[] newArray(int i) {
            return new EcosystemAddLibverifyEventEventTypeDto[i];
        }
    }

    static {
        EcosystemAddLibverifyEventEventTypeDto ecosystemAddLibverifyEventEventTypeDto = new EcosystemAddLibverifyEventEventTypeDto("AUTH_PHONE_REQUESTED", 0, "auth_phone_requested");
        AUTH_PHONE_REQUESTED = ecosystemAddLibverifyEventEventTypeDto;
        EcosystemAddLibverifyEventEventTypeDto[] ecosystemAddLibverifyEventEventTypeDtoArr = {ecosystemAddLibverifyEventEventTypeDto};
        $VALUES = ecosystemAddLibverifyEventEventTypeDtoArr;
        $ENTRIES = new asp(ecosystemAddLibverifyEventEventTypeDtoArr);
        CREATOR = new a();
    }

    private EcosystemAddLibverifyEventEventTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static EcosystemAddLibverifyEventEventTypeDto valueOf(String str) {
        return (EcosystemAddLibverifyEventEventTypeDto) Enum.valueOf(EcosystemAddLibverifyEventEventTypeDto.class, str);
    }

    public static EcosystemAddLibverifyEventEventTypeDto[] values() {
        return (EcosystemAddLibverifyEventEventTypeDto[]) $VALUES.clone();
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
