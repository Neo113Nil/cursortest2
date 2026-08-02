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
/* compiled from: WallGetConnectionTypeDto.kt */
/* loaded from: classes15.dex */
public final class WallGetConnectionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WallGetConnectionTypeDto[] $VALUES;
    public static final Parcelable.Creator<WallGetConnectionTypeDto> CREATOR;

    @pmi0(T3.e)
    public static final WallGetConnectionTypeDto ETHERNET;

    @pmi0("mobile")
    public static final WallGetConnectionTypeDto MOBILE;

    @pmi0("other")
    public static final WallGetConnectionTypeDto OTHER;

    @pmi0("unknown")
    public static final WallGetConnectionTypeDto UNKNOWN;

    @pmi0("wifi")
    public static final WallGetConnectionTypeDto WIFI;
    private final String value;

    /* compiled from: WallGetConnectionTypeDto.kt */
    public static final class a implements Parcelable.Creator<WallGetConnectionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final WallGetConnectionTypeDto createFromParcel(Parcel parcel) {
            return WallGetConnectionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallGetConnectionTypeDto[] newArray(int i) {
            return new WallGetConnectionTypeDto[i];
        }
    }

    static {
        WallGetConnectionTypeDto wallGetConnectionTypeDto = new WallGetConnectionTypeDto("ETHERNET", 0, T3.e);
        ETHERNET = wallGetConnectionTypeDto;
        WallGetConnectionTypeDto wallGetConnectionTypeDto2 = new WallGetConnectionTypeDto("MOBILE", 1, "mobile");
        MOBILE = wallGetConnectionTypeDto2;
        WallGetConnectionTypeDto wallGetConnectionTypeDto3 = new WallGetConnectionTypeDto(NativeAdContent.ViewTag.OTHER, 2, "other");
        OTHER = wallGetConnectionTypeDto3;
        WallGetConnectionTypeDto wallGetConnectionTypeDto4 = new WallGetConnectionTypeDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, "unknown");
        UNKNOWN = wallGetConnectionTypeDto4;
        WallGetConnectionTypeDto wallGetConnectionTypeDto5 = new WallGetConnectionTypeDto("WIFI", 4, "wifi");
        WIFI = wallGetConnectionTypeDto5;
        WallGetConnectionTypeDto[] wallGetConnectionTypeDtoArr = {wallGetConnectionTypeDto, wallGetConnectionTypeDto2, wallGetConnectionTypeDto3, wallGetConnectionTypeDto4, wallGetConnectionTypeDto5};
        $VALUES = wallGetConnectionTypeDtoArr;
        $ENTRIES = new asp(wallGetConnectionTypeDtoArr);
        CREATOR = new a();
    }

    private WallGetConnectionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static WallGetConnectionTypeDto valueOf(String str) {
        return (WallGetConnectionTypeDto) Enum.valueOf(WallGetConnectionTypeDto.class, str);
    }

    public static WallGetConnectionTypeDto[] values() {
        return (WallGetConnectionTypeDto[]) $VALUES.clone();
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
