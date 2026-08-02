package com.vk.api.generated.wall.dto;

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
/* compiled from: WallGetExtendedConnectionTypeDto.kt */
/* loaded from: classes15.dex */
public final class WallGetExtendedConnectionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallGetExtendedConnectionTypeDto[] $VALUES;
    public static final Parcelable.Creator<WallGetExtendedConnectionTypeDto> CREATOR;

    @pmi0(T3.e)
    public static final WallGetExtendedConnectionTypeDto ETHERNET;

    @pmi0("mobile")
    public static final WallGetExtendedConnectionTypeDto MOBILE;

    @pmi0("other")
    public static final WallGetExtendedConnectionTypeDto OTHER;

    @pmi0("unknown")
    public static final WallGetExtendedConnectionTypeDto UNKNOWN;

    @pmi0("wifi")
    public static final WallGetExtendedConnectionTypeDto WIFI;
    private final String value;

    /* compiled from: WallGetExtendedConnectionTypeDto.kt */
    public static final class a implements Parcelable.Creator<WallGetExtendedConnectionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final WallGetExtendedConnectionTypeDto createFromParcel(Parcel parcel) {
            return WallGetExtendedConnectionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallGetExtendedConnectionTypeDto[] newArray(int i) {
            return new WallGetExtendedConnectionTypeDto[i];
        }
    }

    static {
        WallGetExtendedConnectionTypeDto wallGetExtendedConnectionTypeDto = new WallGetExtendedConnectionTypeDto("ETHERNET", 0, T3.e);
        ETHERNET = wallGetExtendedConnectionTypeDto;
        WallGetExtendedConnectionTypeDto wallGetExtendedConnectionTypeDto2 = new WallGetExtendedConnectionTypeDto("MOBILE", 1, "mobile");
        MOBILE = wallGetExtendedConnectionTypeDto2;
        WallGetExtendedConnectionTypeDto wallGetExtendedConnectionTypeDto3 = new WallGetExtendedConnectionTypeDto(NativeAdContent.ViewTag.OTHER, 2, "other");
        OTHER = wallGetExtendedConnectionTypeDto3;
        WallGetExtendedConnectionTypeDto wallGetExtendedConnectionTypeDto4 = new WallGetExtendedConnectionTypeDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, "unknown");
        UNKNOWN = wallGetExtendedConnectionTypeDto4;
        WallGetExtendedConnectionTypeDto wallGetExtendedConnectionTypeDto5 = new WallGetExtendedConnectionTypeDto("WIFI", 4, "wifi");
        WIFI = wallGetExtendedConnectionTypeDto5;
        WallGetExtendedConnectionTypeDto[] wallGetExtendedConnectionTypeDtoArr = {wallGetExtendedConnectionTypeDto, wallGetExtendedConnectionTypeDto2, wallGetExtendedConnectionTypeDto3, wallGetExtendedConnectionTypeDto4, wallGetExtendedConnectionTypeDto5};
        $VALUES = wallGetExtendedConnectionTypeDtoArr;
        $ENTRIES = new asp(wallGetExtendedConnectionTypeDtoArr);
        CREATOR = new a();
    }

    private WallGetExtendedConnectionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static WallGetExtendedConnectionTypeDto valueOf(String str) {
        return (WallGetExtendedConnectionTypeDto) Enum.valueOf(WallGetExtendedConnectionTypeDto.class, str);
    }

    public static WallGetExtendedConnectionTypeDto[] values() {
        return (WallGetExtendedConnectionTypeDto[]) $VALUES.clone();
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
