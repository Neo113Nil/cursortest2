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
/* compiled from: NewsfeedGetConnectionTypeDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetConnectionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedGetConnectionTypeDto[] $VALUES;
    public static final Parcelable.Creator<NewsfeedGetConnectionTypeDto> CREATOR;

    @pmi0(T3.e)
    public static final NewsfeedGetConnectionTypeDto ETHERNET;

    @pmi0("mobile")
    public static final NewsfeedGetConnectionTypeDto MOBILE;

    @pmi0("other")
    public static final NewsfeedGetConnectionTypeDto OTHER;

    @pmi0("unknown")
    public static final NewsfeedGetConnectionTypeDto UNKNOWN;

    @pmi0("wifi")
    public static final NewsfeedGetConnectionTypeDto WIFI;
    private final String value;

    /* compiled from: NewsfeedGetConnectionTypeDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetConnectionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetConnectionTypeDto createFromParcel(Parcel parcel) {
            return NewsfeedGetConnectionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetConnectionTypeDto[] newArray(int i) {
            return new NewsfeedGetConnectionTypeDto[i];
        }
    }

    static {
        NewsfeedGetConnectionTypeDto newsfeedGetConnectionTypeDto = new NewsfeedGetConnectionTypeDto("ETHERNET", 0, T3.e);
        ETHERNET = newsfeedGetConnectionTypeDto;
        NewsfeedGetConnectionTypeDto newsfeedGetConnectionTypeDto2 = new NewsfeedGetConnectionTypeDto("MOBILE", 1, "mobile");
        MOBILE = newsfeedGetConnectionTypeDto2;
        NewsfeedGetConnectionTypeDto newsfeedGetConnectionTypeDto3 = new NewsfeedGetConnectionTypeDto(NativeAdContent.ViewTag.OTHER, 2, "other");
        OTHER = newsfeedGetConnectionTypeDto3;
        NewsfeedGetConnectionTypeDto newsfeedGetConnectionTypeDto4 = new NewsfeedGetConnectionTypeDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, "unknown");
        UNKNOWN = newsfeedGetConnectionTypeDto4;
        NewsfeedGetConnectionTypeDto newsfeedGetConnectionTypeDto5 = new NewsfeedGetConnectionTypeDto("WIFI", 4, "wifi");
        WIFI = newsfeedGetConnectionTypeDto5;
        NewsfeedGetConnectionTypeDto[] newsfeedGetConnectionTypeDtoArr = {newsfeedGetConnectionTypeDto, newsfeedGetConnectionTypeDto2, newsfeedGetConnectionTypeDto3, newsfeedGetConnectionTypeDto4, newsfeedGetConnectionTypeDto5};
        $VALUES = newsfeedGetConnectionTypeDtoArr;
        $ENTRIES = new asp(newsfeedGetConnectionTypeDtoArr);
        CREATOR = new a();
    }

    private NewsfeedGetConnectionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedGetConnectionTypeDto valueOf(String str) {
        return (NewsfeedGetConnectionTypeDto) Enum.valueOf(NewsfeedGetConnectionTypeDto.class, str);
    }

    public static NewsfeedGetConnectionTypeDto[] values() {
        return (NewsfeedGetConnectionTypeDto[]) $VALUES.clone();
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
