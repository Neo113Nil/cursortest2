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
/* compiled from: NewsfeedGetFeedExpConnectionTypeDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetFeedExpConnectionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedGetFeedExpConnectionTypeDto[] $VALUES;
    public static final Parcelable.Creator<NewsfeedGetFeedExpConnectionTypeDto> CREATOR;

    @pmi0(T3.e)
    public static final NewsfeedGetFeedExpConnectionTypeDto ETHERNET;

    @pmi0("mobile")
    public static final NewsfeedGetFeedExpConnectionTypeDto MOBILE;

    @pmi0("other")
    public static final NewsfeedGetFeedExpConnectionTypeDto OTHER;

    @pmi0("unknown")
    public static final NewsfeedGetFeedExpConnectionTypeDto UNKNOWN;

    @pmi0("wifi")
    public static final NewsfeedGetFeedExpConnectionTypeDto WIFI;
    private final String value;

    /* compiled from: NewsfeedGetFeedExpConnectionTypeDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetFeedExpConnectionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetFeedExpConnectionTypeDto createFromParcel(Parcel parcel) {
            return NewsfeedGetFeedExpConnectionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetFeedExpConnectionTypeDto[] newArray(int i) {
            return new NewsfeedGetFeedExpConnectionTypeDto[i];
        }
    }

    static {
        NewsfeedGetFeedExpConnectionTypeDto newsfeedGetFeedExpConnectionTypeDto = new NewsfeedGetFeedExpConnectionTypeDto("ETHERNET", 0, T3.e);
        ETHERNET = newsfeedGetFeedExpConnectionTypeDto;
        NewsfeedGetFeedExpConnectionTypeDto newsfeedGetFeedExpConnectionTypeDto2 = new NewsfeedGetFeedExpConnectionTypeDto("MOBILE", 1, "mobile");
        MOBILE = newsfeedGetFeedExpConnectionTypeDto2;
        NewsfeedGetFeedExpConnectionTypeDto newsfeedGetFeedExpConnectionTypeDto3 = new NewsfeedGetFeedExpConnectionTypeDto(NativeAdContent.ViewTag.OTHER, 2, "other");
        OTHER = newsfeedGetFeedExpConnectionTypeDto3;
        NewsfeedGetFeedExpConnectionTypeDto newsfeedGetFeedExpConnectionTypeDto4 = new NewsfeedGetFeedExpConnectionTypeDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, "unknown");
        UNKNOWN = newsfeedGetFeedExpConnectionTypeDto4;
        NewsfeedGetFeedExpConnectionTypeDto newsfeedGetFeedExpConnectionTypeDto5 = new NewsfeedGetFeedExpConnectionTypeDto("WIFI", 4, "wifi");
        WIFI = newsfeedGetFeedExpConnectionTypeDto5;
        NewsfeedGetFeedExpConnectionTypeDto[] newsfeedGetFeedExpConnectionTypeDtoArr = {newsfeedGetFeedExpConnectionTypeDto, newsfeedGetFeedExpConnectionTypeDto2, newsfeedGetFeedExpConnectionTypeDto3, newsfeedGetFeedExpConnectionTypeDto4, newsfeedGetFeedExpConnectionTypeDto5};
        $VALUES = newsfeedGetFeedExpConnectionTypeDtoArr;
        $ENTRIES = new asp(newsfeedGetFeedExpConnectionTypeDtoArr);
        CREATOR = new a();
    }

    private NewsfeedGetFeedExpConnectionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedGetFeedExpConnectionTypeDto valueOf(String str) {
        return (NewsfeedGetFeedExpConnectionTypeDto) Enum.valueOf(NewsfeedGetFeedExpConnectionTypeDto.class, str);
    }

    public static NewsfeedGetFeedExpConnectionTypeDto[] values() {
        return (NewsfeedGetFeedExpConnectionTypeDto[]) $VALUES.clone();
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
