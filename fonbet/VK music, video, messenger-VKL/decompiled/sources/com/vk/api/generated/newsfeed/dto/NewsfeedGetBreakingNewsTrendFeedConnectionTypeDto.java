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
/* compiled from: NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto[] $VALUES;
    public static final Parcelable.Creator<NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto> CREATOR;

    @pmi0(T3.e)
    public static final NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto ETHERNET;

    @pmi0("mobile")
    public static final NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto MOBILE;

    @pmi0("other")
    public static final NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto OTHER;

    @pmi0("unknown")
    public static final NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto UNKNOWN;

    @pmi0("wifi")
    public static final NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto WIFI;
    private final String value;

    /* compiled from: NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto createFromParcel(Parcel parcel) {
            return NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto[] newArray(int i) {
            return new NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto[i];
        }
    }

    static {
        NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto newsfeedGetBreakingNewsTrendFeedConnectionTypeDto = new NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto("ETHERNET", 0, T3.e);
        ETHERNET = newsfeedGetBreakingNewsTrendFeedConnectionTypeDto;
        NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto newsfeedGetBreakingNewsTrendFeedConnectionTypeDto2 = new NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto("MOBILE", 1, "mobile");
        MOBILE = newsfeedGetBreakingNewsTrendFeedConnectionTypeDto2;
        NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto newsfeedGetBreakingNewsTrendFeedConnectionTypeDto3 = new NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto(NativeAdContent.ViewTag.OTHER, 2, "other");
        OTHER = newsfeedGetBreakingNewsTrendFeedConnectionTypeDto3;
        NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto newsfeedGetBreakingNewsTrendFeedConnectionTypeDto4 = new NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, "unknown");
        UNKNOWN = newsfeedGetBreakingNewsTrendFeedConnectionTypeDto4;
        NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto newsfeedGetBreakingNewsTrendFeedConnectionTypeDto5 = new NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto("WIFI", 4, "wifi");
        WIFI = newsfeedGetBreakingNewsTrendFeedConnectionTypeDto5;
        NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto[] newsfeedGetBreakingNewsTrendFeedConnectionTypeDtoArr = {newsfeedGetBreakingNewsTrendFeedConnectionTypeDto, newsfeedGetBreakingNewsTrendFeedConnectionTypeDto2, newsfeedGetBreakingNewsTrendFeedConnectionTypeDto3, newsfeedGetBreakingNewsTrendFeedConnectionTypeDto4, newsfeedGetBreakingNewsTrendFeedConnectionTypeDto5};
        $VALUES = newsfeedGetBreakingNewsTrendFeedConnectionTypeDtoArr;
        $ENTRIES = new asp(newsfeedGetBreakingNewsTrendFeedConnectionTypeDtoArr);
        CREATOR = new a();
    }

    private NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto> i() {
        return $ENTRIES;
    }

    public static NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto valueOf(String str) {
        return (NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto) Enum.valueOf(NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto.class, str);
    }

    public static NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto[] values() {
        return (NewsfeedGetBreakingNewsTrendFeedConnectionTypeDto[]) $VALUES.clone();
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
