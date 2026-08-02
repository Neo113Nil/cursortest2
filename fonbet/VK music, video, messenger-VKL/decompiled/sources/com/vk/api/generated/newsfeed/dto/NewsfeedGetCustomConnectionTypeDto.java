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
/* compiled from: NewsfeedGetCustomConnectionTypeDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetCustomConnectionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedGetCustomConnectionTypeDto[] $VALUES;
    public static final Parcelable.Creator<NewsfeedGetCustomConnectionTypeDto> CREATOR;

    @pmi0(T3.e)
    public static final NewsfeedGetCustomConnectionTypeDto ETHERNET;

    @pmi0("mobile")
    public static final NewsfeedGetCustomConnectionTypeDto MOBILE;

    @pmi0("other")
    public static final NewsfeedGetCustomConnectionTypeDto OTHER;

    @pmi0("unknown")
    public static final NewsfeedGetCustomConnectionTypeDto UNKNOWN;

    @pmi0("wifi")
    public static final NewsfeedGetCustomConnectionTypeDto WIFI;
    private final String value;

    /* compiled from: NewsfeedGetCustomConnectionTypeDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetCustomConnectionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetCustomConnectionTypeDto createFromParcel(Parcel parcel) {
            return NewsfeedGetCustomConnectionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetCustomConnectionTypeDto[] newArray(int i) {
            return new NewsfeedGetCustomConnectionTypeDto[i];
        }
    }

    static {
        NewsfeedGetCustomConnectionTypeDto newsfeedGetCustomConnectionTypeDto = new NewsfeedGetCustomConnectionTypeDto("ETHERNET", 0, T3.e);
        ETHERNET = newsfeedGetCustomConnectionTypeDto;
        NewsfeedGetCustomConnectionTypeDto newsfeedGetCustomConnectionTypeDto2 = new NewsfeedGetCustomConnectionTypeDto("MOBILE", 1, "mobile");
        MOBILE = newsfeedGetCustomConnectionTypeDto2;
        NewsfeedGetCustomConnectionTypeDto newsfeedGetCustomConnectionTypeDto3 = new NewsfeedGetCustomConnectionTypeDto(NativeAdContent.ViewTag.OTHER, 2, "other");
        OTHER = newsfeedGetCustomConnectionTypeDto3;
        NewsfeedGetCustomConnectionTypeDto newsfeedGetCustomConnectionTypeDto4 = new NewsfeedGetCustomConnectionTypeDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, "unknown");
        UNKNOWN = newsfeedGetCustomConnectionTypeDto4;
        NewsfeedGetCustomConnectionTypeDto newsfeedGetCustomConnectionTypeDto5 = new NewsfeedGetCustomConnectionTypeDto("WIFI", 4, "wifi");
        WIFI = newsfeedGetCustomConnectionTypeDto5;
        NewsfeedGetCustomConnectionTypeDto[] newsfeedGetCustomConnectionTypeDtoArr = {newsfeedGetCustomConnectionTypeDto, newsfeedGetCustomConnectionTypeDto2, newsfeedGetCustomConnectionTypeDto3, newsfeedGetCustomConnectionTypeDto4, newsfeedGetCustomConnectionTypeDto5};
        $VALUES = newsfeedGetCustomConnectionTypeDtoArr;
        $ENTRIES = new asp(newsfeedGetCustomConnectionTypeDtoArr);
        CREATOR = new a();
    }

    private NewsfeedGetCustomConnectionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<NewsfeedGetCustomConnectionTypeDto> i() {
        return $ENTRIES;
    }

    public static NewsfeedGetCustomConnectionTypeDto valueOf(String str) {
        return (NewsfeedGetCustomConnectionTypeDto) Enum.valueOf(NewsfeedGetCustomConnectionTypeDto.class, str);
    }

    public static NewsfeedGetCustomConnectionTypeDto[] values() {
        return (NewsfeedGetCustomConnectionTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String j() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
