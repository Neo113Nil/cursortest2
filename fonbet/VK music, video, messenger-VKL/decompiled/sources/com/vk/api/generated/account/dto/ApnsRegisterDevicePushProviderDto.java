package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.android.SystemUtils;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ApnsRegisterDevicePushProviderDto.kt */
/* loaded from: classes14.dex */
public final class ApnsRegisterDevicePushProviderDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ApnsRegisterDevicePushProviderDto[] $VALUES;

    @pmi0("apns")
    public static final ApnsRegisterDevicePushProviderDto APNS;
    public static final Parcelable.Creator<ApnsRegisterDevicePushProviderDto> CREATOR;

    @pmi0("fcm")
    public static final ApnsRegisterDevicePushProviderDto FCM;

    @pmi0("gcm")
    public static final ApnsRegisterDevicePushProviderDto GCM;

    @pmi0("huawei")
    public static final ApnsRegisterDevicePushProviderDto HUAWEI;

    @pmi0("rustore")
    public static final ApnsRegisterDevicePushProviderDto RUSTORE;

    @pmi0("wns")
    public static final ApnsRegisterDevicePushProviderDto WNS;
    private final String value;

    /* compiled from: ApnsRegisterDevicePushProviderDto.kt */
    public static final class a implements Parcelable.Creator<ApnsRegisterDevicePushProviderDto> {
        @Override // android.os.Parcelable.Creator
        public final ApnsRegisterDevicePushProviderDto createFromParcel(Parcel parcel) {
            return ApnsRegisterDevicePushProviderDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ApnsRegisterDevicePushProviderDto[] newArray(int i) {
            return new ApnsRegisterDevicePushProviderDto[i];
        }
    }

    static {
        ApnsRegisterDevicePushProviderDto apnsRegisterDevicePushProviderDto = new ApnsRegisterDevicePushProviderDto("APNS", 0, "apns");
        APNS = apnsRegisterDevicePushProviderDto;
        ApnsRegisterDevicePushProviderDto apnsRegisterDevicePushProviderDto2 = new ApnsRegisterDevicePushProviderDto("FCM", 1, "fcm");
        FCM = apnsRegisterDevicePushProviderDto2;
        ApnsRegisterDevicePushProviderDto apnsRegisterDevicePushProviderDto3 = new ApnsRegisterDevicePushProviderDto("GCM", 2, "gcm");
        GCM = apnsRegisterDevicePushProviderDto3;
        ApnsRegisterDevicePushProviderDto apnsRegisterDevicePushProviderDto4 = new ApnsRegisterDevicePushProviderDto(SystemUtils.PRODUCT_HUAWEI, 3, "huawei");
        HUAWEI = apnsRegisterDevicePushProviderDto4;
        ApnsRegisterDevicePushProviderDto apnsRegisterDevicePushProviderDto5 = new ApnsRegisterDevicePushProviderDto("RUSTORE", 4, "rustore");
        RUSTORE = apnsRegisterDevicePushProviderDto5;
        ApnsRegisterDevicePushProviderDto apnsRegisterDevicePushProviderDto6 = new ApnsRegisterDevicePushProviderDto("WNS", 5, "wns");
        WNS = apnsRegisterDevicePushProviderDto6;
        ApnsRegisterDevicePushProviderDto[] apnsRegisterDevicePushProviderDtoArr = {apnsRegisterDevicePushProviderDto, apnsRegisterDevicePushProviderDto2, apnsRegisterDevicePushProviderDto3, apnsRegisterDevicePushProviderDto4, apnsRegisterDevicePushProviderDto5, apnsRegisterDevicePushProviderDto6};
        $VALUES = apnsRegisterDevicePushProviderDtoArr;
        $ENTRIES = new asp(apnsRegisterDevicePushProviderDtoArr);
        CREATOR = new a();
    }

    private ApnsRegisterDevicePushProviderDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ApnsRegisterDevicePushProviderDto valueOf(String str) {
        return (ApnsRegisterDevicePushProviderDto) Enum.valueOf(ApnsRegisterDevicePushProviderDto.class, str);
    }

    public static ApnsRegisterDevicePushProviderDto[] values() {
        return (ApnsRegisterDevicePushProviderDto[]) $VALUES.clone();
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
