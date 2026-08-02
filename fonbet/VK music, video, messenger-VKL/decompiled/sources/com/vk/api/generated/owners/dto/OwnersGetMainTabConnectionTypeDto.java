package com.vk.api.generated.owners.dto;

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
/* compiled from: OwnersGetMainTabConnectionTypeDto.kt */
/* loaded from: classes15.dex */
public final class OwnersGetMainTabConnectionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OwnersGetMainTabConnectionTypeDto[] $VALUES;
    public static final Parcelable.Creator<OwnersGetMainTabConnectionTypeDto> CREATOR;

    @pmi0(T3.e)
    public static final OwnersGetMainTabConnectionTypeDto ETHERNET;

    @pmi0("mobile")
    public static final OwnersGetMainTabConnectionTypeDto MOBILE;

    @pmi0("other")
    public static final OwnersGetMainTabConnectionTypeDto OTHER;

    @pmi0("unknown")
    public static final OwnersGetMainTabConnectionTypeDto UNKNOWN;

    @pmi0("wifi")
    public static final OwnersGetMainTabConnectionTypeDto WIFI;
    private final String value;

    /* compiled from: OwnersGetMainTabConnectionTypeDto.kt */
    public static final class a implements Parcelable.Creator<OwnersGetMainTabConnectionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnersGetMainTabConnectionTypeDto createFromParcel(Parcel parcel) {
            return OwnersGetMainTabConnectionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OwnersGetMainTabConnectionTypeDto[] newArray(int i) {
            return new OwnersGetMainTabConnectionTypeDto[i];
        }
    }

    static {
        OwnersGetMainTabConnectionTypeDto ownersGetMainTabConnectionTypeDto = new OwnersGetMainTabConnectionTypeDto("ETHERNET", 0, T3.e);
        ETHERNET = ownersGetMainTabConnectionTypeDto;
        OwnersGetMainTabConnectionTypeDto ownersGetMainTabConnectionTypeDto2 = new OwnersGetMainTabConnectionTypeDto("MOBILE", 1, "mobile");
        MOBILE = ownersGetMainTabConnectionTypeDto2;
        OwnersGetMainTabConnectionTypeDto ownersGetMainTabConnectionTypeDto3 = new OwnersGetMainTabConnectionTypeDto(NativeAdContent.ViewTag.OTHER, 2, "other");
        OTHER = ownersGetMainTabConnectionTypeDto3;
        OwnersGetMainTabConnectionTypeDto ownersGetMainTabConnectionTypeDto4 = new OwnersGetMainTabConnectionTypeDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, "unknown");
        UNKNOWN = ownersGetMainTabConnectionTypeDto4;
        OwnersGetMainTabConnectionTypeDto ownersGetMainTabConnectionTypeDto5 = new OwnersGetMainTabConnectionTypeDto("WIFI", 4, "wifi");
        WIFI = ownersGetMainTabConnectionTypeDto5;
        OwnersGetMainTabConnectionTypeDto[] ownersGetMainTabConnectionTypeDtoArr = {ownersGetMainTabConnectionTypeDto, ownersGetMainTabConnectionTypeDto2, ownersGetMainTabConnectionTypeDto3, ownersGetMainTabConnectionTypeDto4, ownersGetMainTabConnectionTypeDto5};
        $VALUES = ownersGetMainTabConnectionTypeDtoArr;
        $ENTRIES = new asp(ownersGetMainTabConnectionTypeDtoArr);
        CREATOR = new a();
    }

    private OwnersGetMainTabConnectionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static OwnersGetMainTabConnectionTypeDto valueOf(String str) {
        return (OwnersGetMainTabConnectionTypeDto) Enum.valueOf(OwnersGetMainTabConnectionTypeDto.class, str);
    }

    public static OwnersGetMainTabConnectionTypeDto[] values() {
        return (OwnersGetMainTabConnectionTypeDto[]) $VALUES.clone();
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
