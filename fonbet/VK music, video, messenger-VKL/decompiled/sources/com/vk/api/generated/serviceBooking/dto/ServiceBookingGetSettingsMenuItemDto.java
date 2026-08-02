package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ServiceBookingGetSettingsMenuItemDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingGetSettingsMenuItemDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ServiceBookingGetSettingsMenuItemDto[] $VALUES;

    @pmi0("activity")
    public static final ServiceBookingGetSettingsMenuItemDto ACTIVITY;
    public static final Parcelable.Creator<ServiceBookingGetSettingsMenuItemDto> CREATOR;

    @pmi0("individual")
    public static final ServiceBookingGetSettingsMenuItemDto INDIVIDUAL;
    private final String value;

    /* compiled from: ServiceBookingGetSettingsMenuItemDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingGetSettingsMenuItemDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingGetSettingsMenuItemDto createFromParcel(Parcel parcel) {
            return ServiceBookingGetSettingsMenuItemDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingGetSettingsMenuItemDto[] newArray(int i) {
            return new ServiceBookingGetSettingsMenuItemDto[i];
        }
    }

    static {
        ServiceBookingGetSettingsMenuItemDto serviceBookingGetSettingsMenuItemDto = new ServiceBookingGetSettingsMenuItemDto("INDIVIDUAL", 0, "individual");
        INDIVIDUAL = serviceBookingGetSettingsMenuItemDto;
        ServiceBookingGetSettingsMenuItemDto serviceBookingGetSettingsMenuItemDto2 = new ServiceBookingGetSettingsMenuItemDto("ACTIVITY", 1, "activity");
        ACTIVITY = serviceBookingGetSettingsMenuItemDto2;
        ServiceBookingGetSettingsMenuItemDto[] serviceBookingGetSettingsMenuItemDtoArr = {serviceBookingGetSettingsMenuItemDto, serviceBookingGetSettingsMenuItemDto2};
        $VALUES = serviceBookingGetSettingsMenuItemDtoArr;
        $ENTRIES = new asp(serviceBookingGetSettingsMenuItemDtoArr);
        CREATOR = new a();
    }

    private ServiceBookingGetSettingsMenuItemDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ServiceBookingGetSettingsMenuItemDto valueOf(String str) {
        return (ServiceBookingGetSettingsMenuItemDto) Enum.valueOf(ServiceBookingGetSettingsMenuItemDto.class, str);
    }

    public static ServiceBookingGetSettingsMenuItemDto[] values() {
        return (ServiceBookingGetSettingsMenuItemDto[]) $VALUES.clone();
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
