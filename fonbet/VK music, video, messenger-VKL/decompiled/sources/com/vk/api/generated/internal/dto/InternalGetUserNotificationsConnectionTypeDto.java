package com.vk.api.generated.internal.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ironsource.T3;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InternalGetUserNotificationsConnectionTypeDto.kt */
/* loaded from: classes14.dex */
public final class InternalGetUserNotificationsConnectionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ InternalGetUserNotificationsConnectionTypeDto[] $VALUES;
    public static final Parcelable.Creator<InternalGetUserNotificationsConnectionTypeDto> CREATOR;

    @pmi0(T3.e)
    public static final InternalGetUserNotificationsConnectionTypeDto ETHERNET;

    @pmi0("mobile")
    public static final InternalGetUserNotificationsConnectionTypeDto MOBILE;

    @pmi0("other")
    public static final InternalGetUserNotificationsConnectionTypeDto OTHER;

    @pmi0("unknown")
    public static final InternalGetUserNotificationsConnectionTypeDto UNKNOWN;

    @pmi0("wifi")
    public static final InternalGetUserNotificationsConnectionTypeDto WIFI;
    private final String value;

    /* compiled from: InternalGetUserNotificationsConnectionTypeDto.kt */
    public static final class a implements Parcelable.Creator<InternalGetUserNotificationsConnectionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final InternalGetUserNotificationsConnectionTypeDto createFromParcel(Parcel parcel) {
            return InternalGetUserNotificationsConnectionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InternalGetUserNotificationsConnectionTypeDto[] newArray(int i) {
            return new InternalGetUserNotificationsConnectionTypeDto[i];
        }
    }

    static {
        InternalGetUserNotificationsConnectionTypeDto internalGetUserNotificationsConnectionTypeDto = new InternalGetUserNotificationsConnectionTypeDto("ETHERNET", 0, T3.e);
        ETHERNET = internalGetUserNotificationsConnectionTypeDto;
        InternalGetUserNotificationsConnectionTypeDto internalGetUserNotificationsConnectionTypeDto2 = new InternalGetUserNotificationsConnectionTypeDto("MOBILE", 1, "mobile");
        MOBILE = internalGetUserNotificationsConnectionTypeDto2;
        InternalGetUserNotificationsConnectionTypeDto internalGetUserNotificationsConnectionTypeDto3 = new InternalGetUserNotificationsConnectionTypeDto(NativeAdContent.ViewTag.OTHER, 2, "other");
        OTHER = internalGetUserNotificationsConnectionTypeDto3;
        InternalGetUserNotificationsConnectionTypeDto internalGetUserNotificationsConnectionTypeDto4 = new InternalGetUserNotificationsConnectionTypeDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, "unknown");
        UNKNOWN = internalGetUserNotificationsConnectionTypeDto4;
        InternalGetUserNotificationsConnectionTypeDto internalGetUserNotificationsConnectionTypeDto5 = new InternalGetUserNotificationsConnectionTypeDto("WIFI", 4, "wifi");
        WIFI = internalGetUserNotificationsConnectionTypeDto5;
        InternalGetUserNotificationsConnectionTypeDto[] internalGetUserNotificationsConnectionTypeDtoArr = {internalGetUserNotificationsConnectionTypeDto, internalGetUserNotificationsConnectionTypeDto2, internalGetUserNotificationsConnectionTypeDto3, internalGetUserNotificationsConnectionTypeDto4, internalGetUserNotificationsConnectionTypeDto5};
        $VALUES = internalGetUserNotificationsConnectionTypeDtoArr;
        $ENTRIES = new asp(internalGetUserNotificationsConnectionTypeDtoArr);
        CREATOR = new a();
    }

    private InternalGetUserNotificationsConnectionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static InternalGetUserNotificationsConnectionTypeDto valueOf(String str) {
        return (InternalGetUserNotificationsConnectionTypeDto) Enum.valueOf(InternalGetUserNotificationsConnectionTypeDto.class, str);
    }

    public static InternalGetUserNotificationsConnectionTypeDto[] values() {
        return (InternalGetUserNotificationsConnectionTypeDto[]) $VALUES.clone();
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
