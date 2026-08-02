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
/* compiled from: NewsfeedGetDiscoverCustomConnectionTypeDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetDiscoverCustomConnectionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedGetDiscoverCustomConnectionTypeDto[] $VALUES;
    public static final Parcelable.Creator<NewsfeedGetDiscoverCustomConnectionTypeDto> CREATOR;

    @pmi0(T3.e)
    public static final NewsfeedGetDiscoverCustomConnectionTypeDto ETHERNET;

    @pmi0("mobile")
    public static final NewsfeedGetDiscoverCustomConnectionTypeDto MOBILE;

    @pmi0("other")
    public static final NewsfeedGetDiscoverCustomConnectionTypeDto OTHER;

    @pmi0("unknown")
    public static final NewsfeedGetDiscoverCustomConnectionTypeDto UNKNOWN;

    @pmi0("wifi")
    public static final NewsfeedGetDiscoverCustomConnectionTypeDto WIFI;
    private final String value;

    /* compiled from: NewsfeedGetDiscoverCustomConnectionTypeDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetDiscoverCustomConnectionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetDiscoverCustomConnectionTypeDto createFromParcel(Parcel parcel) {
            return NewsfeedGetDiscoverCustomConnectionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetDiscoverCustomConnectionTypeDto[] newArray(int i) {
            return new NewsfeedGetDiscoverCustomConnectionTypeDto[i];
        }
    }

    static {
        NewsfeedGetDiscoverCustomConnectionTypeDto newsfeedGetDiscoverCustomConnectionTypeDto = new NewsfeedGetDiscoverCustomConnectionTypeDto("ETHERNET", 0, T3.e);
        ETHERNET = newsfeedGetDiscoverCustomConnectionTypeDto;
        NewsfeedGetDiscoverCustomConnectionTypeDto newsfeedGetDiscoverCustomConnectionTypeDto2 = new NewsfeedGetDiscoverCustomConnectionTypeDto("MOBILE", 1, "mobile");
        MOBILE = newsfeedGetDiscoverCustomConnectionTypeDto2;
        NewsfeedGetDiscoverCustomConnectionTypeDto newsfeedGetDiscoverCustomConnectionTypeDto3 = new NewsfeedGetDiscoverCustomConnectionTypeDto(NativeAdContent.ViewTag.OTHER, 2, "other");
        OTHER = newsfeedGetDiscoverCustomConnectionTypeDto3;
        NewsfeedGetDiscoverCustomConnectionTypeDto newsfeedGetDiscoverCustomConnectionTypeDto4 = new NewsfeedGetDiscoverCustomConnectionTypeDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, "unknown");
        UNKNOWN = newsfeedGetDiscoverCustomConnectionTypeDto4;
        NewsfeedGetDiscoverCustomConnectionTypeDto newsfeedGetDiscoverCustomConnectionTypeDto5 = new NewsfeedGetDiscoverCustomConnectionTypeDto("WIFI", 4, "wifi");
        WIFI = newsfeedGetDiscoverCustomConnectionTypeDto5;
        NewsfeedGetDiscoverCustomConnectionTypeDto[] newsfeedGetDiscoverCustomConnectionTypeDtoArr = {newsfeedGetDiscoverCustomConnectionTypeDto, newsfeedGetDiscoverCustomConnectionTypeDto2, newsfeedGetDiscoverCustomConnectionTypeDto3, newsfeedGetDiscoverCustomConnectionTypeDto4, newsfeedGetDiscoverCustomConnectionTypeDto5};
        $VALUES = newsfeedGetDiscoverCustomConnectionTypeDtoArr;
        $ENTRIES = new asp(newsfeedGetDiscoverCustomConnectionTypeDtoArr);
        CREATOR = new a();
    }

    private NewsfeedGetDiscoverCustomConnectionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedGetDiscoverCustomConnectionTypeDto valueOf(String str) {
        return (NewsfeedGetDiscoverCustomConnectionTypeDto) Enum.valueOf(NewsfeedGetDiscoverCustomConnectionTypeDto.class, str);
    }

    public static NewsfeedGetDiscoverCustomConnectionTypeDto[] values() {
        return (NewsfeedGetDiscoverCustomConnectionTypeDto[]) $VALUES.clone();
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
