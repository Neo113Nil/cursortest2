package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.android.SystemUtils;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthRegisterDevicePushProviderDto.kt */
/* loaded from: classes14.dex */
public final class AuthRegisterDevicePushProviderDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AuthRegisterDevicePushProviderDto[] $VALUES;

    @pmi0("apns")
    public static final AuthRegisterDevicePushProviderDto APNS;
    public static final Parcelable.Creator<AuthRegisterDevicePushProviderDto> CREATOR;

    @pmi0("fcm")
    public static final AuthRegisterDevicePushProviderDto FCM;

    @pmi0("gcm")
    public static final AuthRegisterDevicePushProviderDto GCM;

    @pmi0("huawei")
    public static final AuthRegisterDevicePushProviderDto HUAWEI;

    @pmi0("rustore")
    public static final AuthRegisterDevicePushProviderDto RUSTORE;

    @pmi0("wns")
    public static final AuthRegisterDevicePushProviderDto WNS;
    private final String value;

    /* compiled from: AuthRegisterDevicePushProviderDto.kt */
    public static final class a implements Parcelable.Creator<AuthRegisterDevicePushProviderDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthRegisterDevicePushProviderDto createFromParcel(Parcel parcel) {
            return AuthRegisterDevicePushProviderDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthRegisterDevicePushProviderDto[] newArray(int i) {
            return new AuthRegisterDevicePushProviderDto[i];
        }
    }

    static {
        AuthRegisterDevicePushProviderDto authRegisterDevicePushProviderDto = new AuthRegisterDevicePushProviderDto("APNS", 0, "apns");
        APNS = authRegisterDevicePushProviderDto;
        AuthRegisterDevicePushProviderDto authRegisterDevicePushProviderDto2 = new AuthRegisterDevicePushProviderDto("FCM", 1, "fcm");
        FCM = authRegisterDevicePushProviderDto2;
        AuthRegisterDevicePushProviderDto authRegisterDevicePushProviderDto3 = new AuthRegisterDevicePushProviderDto("GCM", 2, "gcm");
        GCM = authRegisterDevicePushProviderDto3;
        AuthRegisterDevicePushProviderDto authRegisterDevicePushProviderDto4 = new AuthRegisterDevicePushProviderDto(SystemUtils.PRODUCT_HUAWEI, 3, "huawei");
        HUAWEI = authRegisterDevicePushProviderDto4;
        AuthRegisterDevicePushProviderDto authRegisterDevicePushProviderDto5 = new AuthRegisterDevicePushProviderDto("RUSTORE", 4, "rustore");
        RUSTORE = authRegisterDevicePushProviderDto5;
        AuthRegisterDevicePushProviderDto authRegisterDevicePushProviderDto6 = new AuthRegisterDevicePushProviderDto("WNS", 5, "wns");
        WNS = authRegisterDevicePushProviderDto6;
        AuthRegisterDevicePushProviderDto[] authRegisterDevicePushProviderDtoArr = {authRegisterDevicePushProviderDto, authRegisterDevicePushProviderDto2, authRegisterDevicePushProviderDto3, authRegisterDevicePushProviderDto4, authRegisterDevicePushProviderDto5, authRegisterDevicePushProviderDto6};
        $VALUES = authRegisterDevicePushProviderDtoArr;
        $ENTRIES = new asp(authRegisterDevicePushProviderDtoArr);
        CREATOR = new a();
    }

    private AuthRegisterDevicePushProviderDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AuthRegisterDevicePushProviderDto valueOf(String str) {
        return (AuthRegisterDevicePushProviderDto) Enum.valueOf(AuthRegisterDevicePushProviderDto.class, str);
    }

    public static AuthRegisterDevicePushProviderDto[] values() {
        return (AuthRegisterDevicePushProviderDto[]) $VALUES.clone();
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
