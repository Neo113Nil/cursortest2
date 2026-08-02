package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsAddToMainScreenDeviceShownTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsAddToMainScreenDeviceShownTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsAddToMainScreenDeviceShownTypeDto[] $VALUES;
    public static final Parcelable.Creator<AppsAddToMainScreenDeviceShownTypeDto> CREATOR;

    @pmi0("on_close")
    public static final AppsAddToMainScreenDeviceShownTypeDto ON_CLOSE;

    @pmi0("on_start")
    public static final AppsAddToMainScreenDeviceShownTypeDto ON_START;
    private final String value;

    /* compiled from: AppsAddToMainScreenDeviceShownTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsAddToMainScreenDeviceShownTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAddToMainScreenDeviceShownTypeDto createFromParcel(Parcel parcel) {
            return AppsAddToMainScreenDeviceShownTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAddToMainScreenDeviceShownTypeDto[] newArray(int i) {
            return new AppsAddToMainScreenDeviceShownTypeDto[i];
        }
    }

    static {
        AppsAddToMainScreenDeviceShownTypeDto appsAddToMainScreenDeviceShownTypeDto = new AppsAddToMainScreenDeviceShownTypeDto("ON_CLOSE", 0, "on_close");
        ON_CLOSE = appsAddToMainScreenDeviceShownTypeDto;
        AppsAddToMainScreenDeviceShownTypeDto appsAddToMainScreenDeviceShownTypeDto2 = new AppsAddToMainScreenDeviceShownTypeDto("ON_START", 1, "on_start");
        ON_START = appsAddToMainScreenDeviceShownTypeDto2;
        AppsAddToMainScreenDeviceShownTypeDto[] appsAddToMainScreenDeviceShownTypeDtoArr = {appsAddToMainScreenDeviceShownTypeDto, appsAddToMainScreenDeviceShownTypeDto2};
        $VALUES = appsAddToMainScreenDeviceShownTypeDtoArr;
        $ENTRIES = new asp(appsAddToMainScreenDeviceShownTypeDtoArr);
        CREATOR = new a();
    }

    private AppsAddToMainScreenDeviceShownTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsAddToMainScreenDeviceShownTypeDto valueOf(String str) {
        return (AppsAddToMainScreenDeviceShownTypeDto) Enum.valueOf(AppsAddToMainScreenDeviceShownTypeDto.class, str);
    }

    public static AppsAddToMainScreenDeviceShownTypeDto[] values() {
        return (AppsAddToMainScreenDeviceShownTypeDto[]) $VALUES.clone();
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
