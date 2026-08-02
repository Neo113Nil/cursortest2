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
/* compiled from: NewsfeedGetRecommendedLiveVideosConnectionTypeDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetRecommendedLiveVideosConnectionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedGetRecommendedLiveVideosConnectionTypeDto[] $VALUES;
    public static final Parcelable.Creator<NewsfeedGetRecommendedLiveVideosConnectionTypeDto> CREATOR;

    @pmi0(T3.e)
    public static final NewsfeedGetRecommendedLiveVideosConnectionTypeDto ETHERNET;

    @pmi0("mobile")
    public static final NewsfeedGetRecommendedLiveVideosConnectionTypeDto MOBILE;

    @pmi0("other")
    public static final NewsfeedGetRecommendedLiveVideosConnectionTypeDto OTHER;

    @pmi0("unknown")
    public static final NewsfeedGetRecommendedLiveVideosConnectionTypeDto UNKNOWN;

    @pmi0("wifi")
    public static final NewsfeedGetRecommendedLiveVideosConnectionTypeDto WIFI;
    private final String value;

    /* compiled from: NewsfeedGetRecommendedLiveVideosConnectionTypeDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetRecommendedLiveVideosConnectionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetRecommendedLiveVideosConnectionTypeDto createFromParcel(Parcel parcel) {
            return NewsfeedGetRecommendedLiveVideosConnectionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetRecommendedLiveVideosConnectionTypeDto[] newArray(int i) {
            return new NewsfeedGetRecommendedLiveVideosConnectionTypeDto[i];
        }
    }

    static {
        NewsfeedGetRecommendedLiveVideosConnectionTypeDto newsfeedGetRecommendedLiveVideosConnectionTypeDto = new NewsfeedGetRecommendedLiveVideosConnectionTypeDto("ETHERNET", 0, T3.e);
        ETHERNET = newsfeedGetRecommendedLiveVideosConnectionTypeDto;
        NewsfeedGetRecommendedLiveVideosConnectionTypeDto newsfeedGetRecommendedLiveVideosConnectionTypeDto2 = new NewsfeedGetRecommendedLiveVideosConnectionTypeDto("MOBILE", 1, "mobile");
        MOBILE = newsfeedGetRecommendedLiveVideosConnectionTypeDto2;
        NewsfeedGetRecommendedLiveVideosConnectionTypeDto newsfeedGetRecommendedLiveVideosConnectionTypeDto3 = new NewsfeedGetRecommendedLiveVideosConnectionTypeDto(NativeAdContent.ViewTag.OTHER, 2, "other");
        OTHER = newsfeedGetRecommendedLiveVideosConnectionTypeDto3;
        NewsfeedGetRecommendedLiveVideosConnectionTypeDto newsfeedGetRecommendedLiveVideosConnectionTypeDto4 = new NewsfeedGetRecommendedLiveVideosConnectionTypeDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, "unknown");
        UNKNOWN = newsfeedGetRecommendedLiveVideosConnectionTypeDto4;
        NewsfeedGetRecommendedLiveVideosConnectionTypeDto newsfeedGetRecommendedLiveVideosConnectionTypeDto5 = new NewsfeedGetRecommendedLiveVideosConnectionTypeDto("WIFI", 4, "wifi");
        WIFI = newsfeedGetRecommendedLiveVideosConnectionTypeDto5;
        NewsfeedGetRecommendedLiveVideosConnectionTypeDto[] newsfeedGetRecommendedLiveVideosConnectionTypeDtoArr = {newsfeedGetRecommendedLiveVideosConnectionTypeDto, newsfeedGetRecommendedLiveVideosConnectionTypeDto2, newsfeedGetRecommendedLiveVideosConnectionTypeDto3, newsfeedGetRecommendedLiveVideosConnectionTypeDto4, newsfeedGetRecommendedLiveVideosConnectionTypeDto5};
        $VALUES = newsfeedGetRecommendedLiveVideosConnectionTypeDtoArr;
        $ENTRIES = new asp(newsfeedGetRecommendedLiveVideosConnectionTypeDtoArr);
        CREATOR = new a();
    }

    private NewsfeedGetRecommendedLiveVideosConnectionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedGetRecommendedLiveVideosConnectionTypeDto valueOf(String str) {
        return (NewsfeedGetRecommendedLiveVideosConnectionTypeDto) Enum.valueOf(NewsfeedGetRecommendedLiveVideosConnectionTypeDto.class, str);
    }

    public static NewsfeedGetRecommendedLiveVideosConnectionTypeDto[] values() {
        return (NewsfeedGetRecommendedLiveVideosConnectionTypeDto[]) $VALUES.clone();
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
