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
/* compiled from: NewsfeedGetBreakingNewsFeedConnectionTypeDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetBreakingNewsFeedConnectionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedGetBreakingNewsFeedConnectionTypeDto[] $VALUES;
    public static final Parcelable.Creator<NewsfeedGetBreakingNewsFeedConnectionTypeDto> CREATOR;

    @pmi0(T3.e)
    public static final NewsfeedGetBreakingNewsFeedConnectionTypeDto ETHERNET;

    @pmi0("mobile")
    public static final NewsfeedGetBreakingNewsFeedConnectionTypeDto MOBILE;

    @pmi0("other")
    public static final NewsfeedGetBreakingNewsFeedConnectionTypeDto OTHER;

    @pmi0("unknown")
    public static final NewsfeedGetBreakingNewsFeedConnectionTypeDto UNKNOWN;

    @pmi0("wifi")
    public static final NewsfeedGetBreakingNewsFeedConnectionTypeDto WIFI;
    private final String value;

    /* compiled from: NewsfeedGetBreakingNewsFeedConnectionTypeDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetBreakingNewsFeedConnectionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetBreakingNewsFeedConnectionTypeDto createFromParcel(Parcel parcel) {
            return NewsfeedGetBreakingNewsFeedConnectionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetBreakingNewsFeedConnectionTypeDto[] newArray(int i) {
            return new NewsfeedGetBreakingNewsFeedConnectionTypeDto[i];
        }
    }

    static {
        NewsfeedGetBreakingNewsFeedConnectionTypeDto newsfeedGetBreakingNewsFeedConnectionTypeDto = new NewsfeedGetBreakingNewsFeedConnectionTypeDto("ETHERNET", 0, T3.e);
        ETHERNET = newsfeedGetBreakingNewsFeedConnectionTypeDto;
        NewsfeedGetBreakingNewsFeedConnectionTypeDto newsfeedGetBreakingNewsFeedConnectionTypeDto2 = new NewsfeedGetBreakingNewsFeedConnectionTypeDto("MOBILE", 1, "mobile");
        MOBILE = newsfeedGetBreakingNewsFeedConnectionTypeDto2;
        NewsfeedGetBreakingNewsFeedConnectionTypeDto newsfeedGetBreakingNewsFeedConnectionTypeDto3 = new NewsfeedGetBreakingNewsFeedConnectionTypeDto(NativeAdContent.ViewTag.OTHER, 2, "other");
        OTHER = newsfeedGetBreakingNewsFeedConnectionTypeDto3;
        NewsfeedGetBreakingNewsFeedConnectionTypeDto newsfeedGetBreakingNewsFeedConnectionTypeDto4 = new NewsfeedGetBreakingNewsFeedConnectionTypeDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, "unknown");
        UNKNOWN = newsfeedGetBreakingNewsFeedConnectionTypeDto4;
        NewsfeedGetBreakingNewsFeedConnectionTypeDto newsfeedGetBreakingNewsFeedConnectionTypeDto5 = new NewsfeedGetBreakingNewsFeedConnectionTypeDto("WIFI", 4, "wifi");
        WIFI = newsfeedGetBreakingNewsFeedConnectionTypeDto5;
        NewsfeedGetBreakingNewsFeedConnectionTypeDto[] newsfeedGetBreakingNewsFeedConnectionTypeDtoArr = {newsfeedGetBreakingNewsFeedConnectionTypeDto, newsfeedGetBreakingNewsFeedConnectionTypeDto2, newsfeedGetBreakingNewsFeedConnectionTypeDto3, newsfeedGetBreakingNewsFeedConnectionTypeDto4, newsfeedGetBreakingNewsFeedConnectionTypeDto5};
        $VALUES = newsfeedGetBreakingNewsFeedConnectionTypeDtoArr;
        $ENTRIES = new asp(newsfeedGetBreakingNewsFeedConnectionTypeDtoArr);
        CREATOR = new a();
    }

    private NewsfeedGetBreakingNewsFeedConnectionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<NewsfeedGetBreakingNewsFeedConnectionTypeDto> i() {
        return $ENTRIES;
    }

    public static NewsfeedGetBreakingNewsFeedConnectionTypeDto valueOf(String str) {
        return (NewsfeedGetBreakingNewsFeedConnectionTypeDto) Enum.valueOf(NewsfeedGetBreakingNewsFeedConnectionTypeDto.class, str);
    }

    public static NewsfeedGetBreakingNewsFeedConnectionTypeDto[] values() {
        return (NewsfeedGetBreakingNewsFeedConnectionTypeDto[]) $VALUES.clone();
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
