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
/* compiled from: NewsfeedGetFeedConnectionTypeDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetFeedConnectionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedGetFeedConnectionTypeDto[] $VALUES;
    public static final Parcelable.Creator<NewsfeedGetFeedConnectionTypeDto> CREATOR;

    @pmi0(T3.e)
    public static final NewsfeedGetFeedConnectionTypeDto ETHERNET;

    @pmi0("mobile")
    public static final NewsfeedGetFeedConnectionTypeDto MOBILE;

    @pmi0("other")
    public static final NewsfeedGetFeedConnectionTypeDto OTHER;

    @pmi0("unknown")
    public static final NewsfeedGetFeedConnectionTypeDto UNKNOWN;

    @pmi0("wifi")
    public static final NewsfeedGetFeedConnectionTypeDto WIFI;
    private final String value;

    /* compiled from: NewsfeedGetFeedConnectionTypeDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetFeedConnectionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetFeedConnectionTypeDto createFromParcel(Parcel parcel) {
            return NewsfeedGetFeedConnectionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetFeedConnectionTypeDto[] newArray(int i) {
            return new NewsfeedGetFeedConnectionTypeDto[i];
        }
    }

    static {
        NewsfeedGetFeedConnectionTypeDto newsfeedGetFeedConnectionTypeDto = new NewsfeedGetFeedConnectionTypeDto("ETHERNET", 0, T3.e);
        ETHERNET = newsfeedGetFeedConnectionTypeDto;
        NewsfeedGetFeedConnectionTypeDto newsfeedGetFeedConnectionTypeDto2 = new NewsfeedGetFeedConnectionTypeDto("MOBILE", 1, "mobile");
        MOBILE = newsfeedGetFeedConnectionTypeDto2;
        NewsfeedGetFeedConnectionTypeDto newsfeedGetFeedConnectionTypeDto3 = new NewsfeedGetFeedConnectionTypeDto(NativeAdContent.ViewTag.OTHER, 2, "other");
        OTHER = newsfeedGetFeedConnectionTypeDto3;
        NewsfeedGetFeedConnectionTypeDto newsfeedGetFeedConnectionTypeDto4 = new NewsfeedGetFeedConnectionTypeDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, "unknown");
        UNKNOWN = newsfeedGetFeedConnectionTypeDto4;
        NewsfeedGetFeedConnectionTypeDto newsfeedGetFeedConnectionTypeDto5 = new NewsfeedGetFeedConnectionTypeDto("WIFI", 4, "wifi");
        WIFI = newsfeedGetFeedConnectionTypeDto5;
        NewsfeedGetFeedConnectionTypeDto[] newsfeedGetFeedConnectionTypeDtoArr = {newsfeedGetFeedConnectionTypeDto, newsfeedGetFeedConnectionTypeDto2, newsfeedGetFeedConnectionTypeDto3, newsfeedGetFeedConnectionTypeDto4, newsfeedGetFeedConnectionTypeDto5};
        $VALUES = newsfeedGetFeedConnectionTypeDtoArr;
        $ENTRIES = new asp(newsfeedGetFeedConnectionTypeDtoArr);
        CREATOR = new a();
    }

    private NewsfeedGetFeedConnectionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedGetFeedConnectionTypeDto valueOf(String str) {
        return (NewsfeedGetFeedConnectionTypeDto) Enum.valueOf(NewsfeedGetFeedConnectionTypeDto.class, str);
    }

    public static NewsfeedGetFeedConnectionTypeDto[] values() {
        return (NewsfeedGetFeedConnectionTypeDto[]) $VALUES.clone();
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
