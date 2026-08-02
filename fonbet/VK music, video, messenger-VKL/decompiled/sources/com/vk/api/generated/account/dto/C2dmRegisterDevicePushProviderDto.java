package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.android.SystemUtils;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: C2dmRegisterDevicePushProviderDto.kt */
/* loaded from: classes14.dex */
public final class C2dmRegisterDevicePushProviderDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ C2dmRegisterDevicePushProviderDto[] $VALUES;

    @pmi0("apns")
    public static final C2dmRegisterDevicePushProviderDto APNS;
    public static final Parcelable.Creator<C2dmRegisterDevicePushProviderDto> CREATOR;

    @pmi0("fcm")
    public static final C2dmRegisterDevicePushProviderDto FCM;

    @pmi0("gcm")
    public static final C2dmRegisterDevicePushProviderDto GCM;

    @pmi0("huawei")
    public static final C2dmRegisterDevicePushProviderDto HUAWEI;

    @pmi0("rustore")
    public static final C2dmRegisterDevicePushProviderDto RUSTORE;

    @pmi0("wns")
    public static final C2dmRegisterDevicePushProviderDto WNS;
    private final String value;

    /* compiled from: C2dmRegisterDevicePushProviderDto.kt */
    public static final class a implements Parcelable.Creator<C2dmRegisterDevicePushProviderDto> {
        @Override // android.os.Parcelable.Creator
        public final C2dmRegisterDevicePushProviderDto createFromParcel(Parcel parcel) {
            return C2dmRegisterDevicePushProviderDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final C2dmRegisterDevicePushProviderDto[] newArray(int i) {
            return new C2dmRegisterDevicePushProviderDto[i];
        }
    }

    static {
        C2dmRegisterDevicePushProviderDto c2dmRegisterDevicePushProviderDto = new C2dmRegisterDevicePushProviderDto("APNS", 0, "apns");
        APNS = c2dmRegisterDevicePushProviderDto;
        C2dmRegisterDevicePushProviderDto c2dmRegisterDevicePushProviderDto2 = new C2dmRegisterDevicePushProviderDto("FCM", 1, "fcm");
        FCM = c2dmRegisterDevicePushProviderDto2;
        C2dmRegisterDevicePushProviderDto c2dmRegisterDevicePushProviderDto3 = new C2dmRegisterDevicePushProviderDto("GCM", 2, "gcm");
        GCM = c2dmRegisterDevicePushProviderDto3;
        C2dmRegisterDevicePushProviderDto c2dmRegisterDevicePushProviderDto4 = new C2dmRegisterDevicePushProviderDto(SystemUtils.PRODUCT_HUAWEI, 3, "huawei");
        HUAWEI = c2dmRegisterDevicePushProviderDto4;
        C2dmRegisterDevicePushProviderDto c2dmRegisterDevicePushProviderDto5 = new C2dmRegisterDevicePushProviderDto("RUSTORE", 4, "rustore");
        RUSTORE = c2dmRegisterDevicePushProviderDto5;
        C2dmRegisterDevicePushProviderDto c2dmRegisterDevicePushProviderDto6 = new C2dmRegisterDevicePushProviderDto("WNS", 5, "wns");
        WNS = c2dmRegisterDevicePushProviderDto6;
        C2dmRegisterDevicePushProviderDto[] c2dmRegisterDevicePushProviderDtoArr = {c2dmRegisterDevicePushProviderDto, c2dmRegisterDevicePushProviderDto2, c2dmRegisterDevicePushProviderDto3, c2dmRegisterDevicePushProviderDto4, c2dmRegisterDevicePushProviderDto5, c2dmRegisterDevicePushProviderDto6};
        $VALUES = c2dmRegisterDevicePushProviderDtoArr;
        $ENTRIES = new asp(c2dmRegisterDevicePushProviderDtoArr);
        CREATOR = new a();
    }

    private C2dmRegisterDevicePushProviderDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static C2dmRegisterDevicePushProviderDto valueOf(String str) {
        return (C2dmRegisterDevicePushProviderDto) Enum.valueOf(C2dmRegisterDevicePushProviderDto.class, str);
    }

    public static C2dmRegisterDevicePushProviderDto[] values() {
        return (C2dmRegisterDevicePushProviderDto[]) $VALUES.clone();
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
