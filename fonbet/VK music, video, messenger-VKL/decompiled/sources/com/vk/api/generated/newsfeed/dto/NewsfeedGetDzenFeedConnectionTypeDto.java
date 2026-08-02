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
/* compiled from: NewsfeedGetDzenFeedConnectionTypeDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetDzenFeedConnectionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedGetDzenFeedConnectionTypeDto[] $VALUES;
    public static final Parcelable.Creator<NewsfeedGetDzenFeedConnectionTypeDto> CREATOR;

    @pmi0(T3.e)
    public static final NewsfeedGetDzenFeedConnectionTypeDto ETHERNET;

    @pmi0("mobile")
    public static final NewsfeedGetDzenFeedConnectionTypeDto MOBILE;

    @pmi0("other")
    public static final NewsfeedGetDzenFeedConnectionTypeDto OTHER;

    @pmi0("unknown")
    public static final NewsfeedGetDzenFeedConnectionTypeDto UNKNOWN;

    @pmi0("wifi")
    public static final NewsfeedGetDzenFeedConnectionTypeDto WIFI;
    private final String value;

    /* compiled from: NewsfeedGetDzenFeedConnectionTypeDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetDzenFeedConnectionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetDzenFeedConnectionTypeDto createFromParcel(Parcel parcel) {
            return NewsfeedGetDzenFeedConnectionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetDzenFeedConnectionTypeDto[] newArray(int i) {
            return new NewsfeedGetDzenFeedConnectionTypeDto[i];
        }
    }

    static {
        NewsfeedGetDzenFeedConnectionTypeDto newsfeedGetDzenFeedConnectionTypeDto = new NewsfeedGetDzenFeedConnectionTypeDto("ETHERNET", 0, T3.e);
        ETHERNET = newsfeedGetDzenFeedConnectionTypeDto;
        NewsfeedGetDzenFeedConnectionTypeDto newsfeedGetDzenFeedConnectionTypeDto2 = new NewsfeedGetDzenFeedConnectionTypeDto("MOBILE", 1, "mobile");
        MOBILE = newsfeedGetDzenFeedConnectionTypeDto2;
        NewsfeedGetDzenFeedConnectionTypeDto newsfeedGetDzenFeedConnectionTypeDto3 = new NewsfeedGetDzenFeedConnectionTypeDto(NativeAdContent.ViewTag.OTHER, 2, "other");
        OTHER = newsfeedGetDzenFeedConnectionTypeDto3;
        NewsfeedGetDzenFeedConnectionTypeDto newsfeedGetDzenFeedConnectionTypeDto4 = new NewsfeedGetDzenFeedConnectionTypeDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, "unknown");
        UNKNOWN = newsfeedGetDzenFeedConnectionTypeDto4;
        NewsfeedGetDzenFeedConnectionTypeDto newsfeedGetDzenFeedConnectionTypeDto5 = new NewsfeedGetDzenFeedConnectionTypeDto("WIFI", 4, "wifi");
        WIFI = newsfeedGetDzenFeedConnectionTypeDto5;
        NewsfeedGetDzenFeedConnectionTypeDto[] newsfeedGetDzenFeedConnectionTypeDtoArr = {newsfeedGetDzenFeedConnectionTypeDto, newsfeedGetDzenFeedConnectionTypeDto2, newsfeedGetDzenFeedConnectionTypeDto3, newsfeedGetDzenFeedConnectionTypeDto4, newsfeedGetDzenFeedConnectionTypeDto5};
        $VALUES = newsfeedGetDzenFeedConnectionTypeDtoArr;
        $ENTRIES = new asp(newsfeedGetDzenFeedConnectionTypeDtoArr);
        CREATOR = new a();
    }

    private NewsfeedGetDzenFeedConnectionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<NewsfeedGetDzenFeedConnectionTypeDto> i() {
        return $ENTRIES;
    }

    public static NewsfeedGetDzenFeedConnectionTypeDto valueOf(String str) {
        return (NewsfeedGetDzenFeedConnectionTypeDto) Enum.valueOf(NewsfeedGetDzenFeedConnectionTypeDto.class, str);
    }

    public static NewsfeedGetDzenFeedConnectionTypeDto[] values() {
        return (NewsfeedGetDzenFeedConnectionTypeDto[]) $VALUES.clone();
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
