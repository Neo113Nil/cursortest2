package com.vk.api.generated.newsfeed.dto;

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
/* compiled from: NewsfeedGetByTypeConnectionTypeDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetByTypeConnectionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedGetByTypeConnectionTypeDto[] $VALUES;
    public static final Parcelable.Creator<NewsfeedGetByTypeConnectionTypeDto> CREATOR;

    @pmi0(T3.e)
    public static final NewsfeedGetByTypeConnectionTypeDto ETHERNET;

    @pmi0("mobile")
    public static final NewsfeedGetByTypeConnectionTypeDto MOBILE;

    @pmi0("other")
    public static final NewsfeedGetByTypeConnectionTypeDto OTHER;

    @pmi0("unknown")
    public static final NewsfeedGetByTypeConnectionTypeDto UNKNOWN;

    @pmi0("wifi")
    public static final NewsfeedGetByTypeConnectionTypeDto WIFI;
    private final String value;

    /* compiled from: NewsfeedGetByTypeConnectionTypeDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetByTypeConnectionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetByTypeConnectionTypeDto createFromParcel(Parcel parcel) {
            return NewsfeedGetByTypeConnectionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetByTypeConnectionTypeDto[] newArray(int i) {
            return new NewsfeedGetByTypeConnectionTypeDto[i];
        }
    }

    static {
        NewsfeedGetByTypeConnectionTypeDto newsfeedGetByTypeConnectionTypeDto = new NewsfeedGetByTypeConnectionTypeDto("ETHERNET", 0, T3.e);
        ETHERNET = newsfeedGetByTypeConnectionTypeDto;
        NewsfeedGetByTypeConnectionTypeDto newsfeedGetByTypeConnectionTypeDto2 = new NewsfeedGetByTypeConnectionTypeDto("MOBILE", 1, "mobile");
        MOBILE = newsfeedGetByTypeConnectionTypeDto2;
        NewsfeedGetByTypeConnectionTypeDto newsfeedGetByTypeConnectionTypeDto3 = new NewsfeedGetByTypeConnectionTypeDto(NativeAdContent.ViewTag.OTHER, 2, "other");
        OTHER = newsfeedGetByTypeConnectionTypeDto3;
        NewsfeedGetByTypeConnectionTypeDto newsfeedGetByTypeConnectionTypeDto4 = new NewsfeedGetByTypeConnectionTypeDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, "unknown");
        UNKNOWN = newsfeedGetByTypeConnectionTypeDto4;
        NewsfeedGetByTypeConnectionTypeDto newsfeedGetByTypeConnectionTypeDto5 = new NewsfeedGetByTypeConnectionTypeDto("WIFI", 4, "wifi");
        WIFI = newsfeedGetByTypeConnectionTypeDto5;
        NewsfeedGetByTypeConnectionTypeDto[] newsfeedGetByTypeConnectionTypeDtoArr = {newsfeedGetByTypeConnectionTypeDto, newsfeedGetByTypeConnectionTypeDto2, newsfeedGetByTypeConnectionTypeDto3, newsfeedGetByTypeConnectionTypeDto4, newsfeedGetByTypeConnectionTypeDto5};
        $VALUES = newsfeedGetByTypeConnectionTypeDtoArr;
        $ENTRIES = new asp(newsfeedGetByTypeConnectionTypeDtoArr);
        CREATOR = new a();
    }

    private NewsfeedGetByTypeConnectionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedGetByTypeConnectionTypeDto valueOf(String str) {
        return (NewsfeedGetByTypeConnectionTypeDto) Enum.valueOf(NewsfeedGetByTypeConnectionTypeDto.class, str);
    }

    public static NewsfeedGetByTypeConnectionTypeDto[] values() {
        return (NewsfeedGetByTypeConnectionTypeDto[]) $VALUES.clone();
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
