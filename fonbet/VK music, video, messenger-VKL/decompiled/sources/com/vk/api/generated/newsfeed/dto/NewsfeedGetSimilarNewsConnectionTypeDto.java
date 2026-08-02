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
/* compiled from: NewsfeedGetSimilarNewsConnectionTypeDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetSimilarNewsConnectionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedGetSimilarNewsConnectionTypeDto[] $VALUES;
    public static final Parcelable.Creator<NewsfeedGetSimilarNewsConnectionTypeDto> CREATOR;

    @pmi0(T3.e)
    public static final NewsfeedGetSimilarNewsConnectionTypeDto ETHERNET;

    @pmi0("mobile")
    public static final NewsfeedGetSimilarNewsConnectionTypeDto MOBILE;

    @pmi0("other")
    public static final NewsfeedGetSimilarNewsConnectionTypeDto OTHER;

    @pmi0("unknown")
    public static final NewsfeedGetSimilarNewsConnectionTypeDto UNKNOWN;

    @pmi0("wifi")
    public static final NewsfeedGetSimilarNewsConnectionTypeDto WIFI;
    private final String value;

    /* compiled from: NewsfeedGetSimilarNewsConnectionTypeDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetSimilarNewsConnectionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetSimilarNewsConnectionTypeDto createFromParcel(Parcel parcel) {
            return NewsfeedGetSimilarNewsConnectionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetSimilarNewsConnectionTypeDto[] newArray(int i) {
            return new NewsfeedGetSimilarNewsConnectionTypeDto[i];
        }
    }

    static {
        NewsfeedGetSimilarNewsConnectionTypeDto newsfeedGetSimilarNewsConnectionTypeDto = new NewsfeedGetSimilarNewsConnectionTypeDto("ETHERNET", 0, T3.e);
        ETHERNET = newsfeedGetSimilarNewsConnectionTypeDto;
        NewsfeedGetSimilarNewsConnectionTypeDto newsfeedGetSimilarNewsConnectionTypeDto2 = new NewsfeedGetSimilarNewsConnectionTypeDto("MOBILE", 1, "mobile");
        MOBILE = newsfeedGetSimilarNewsConnectionTypeDto2;
        NewsfeedGetSimilarNewsConnectionTypeDto newsfeedGetSimilarNewsConnectionTypeDto3 = new NewsfeedGetSimilarNewsConnectionTypeDto(NativeAdContent.ViewTag.OTHER, 2, "other");
        OTHER = newsfeedGetSimilarNewsConnectionTypeDto3;
        NewsfeedGetSimilarNewsConnectionTypeDto newsfeedGetSimilarNewsConnectionTypeDto4 = new NewsfeedGetSimilarNewsConnectionTypeDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, "unknown");
        UNKNOWN = newsfeedGetSimilarNewsConnectionTypeDto4;
        NewsfeedGetSimilarNewsConnectionTypeDto newsfeedGetSimilarNewsConnectionTypeDto5 = new NewsfeedGetSimilarNewsConnectionTypeDto("WIFI", 4, "wifi");
        WIFI = newsfeedGetSimilarNewsConnectionTypeDto5;
        NewsfeedGetSimilarNewsConnectionTypeDto[] newsfeedGetSimilarNewsConnectionTypeDtoArr = {newsfeedGetSimilarNewsConnectionTypeDto, newsfeedGetSimilarNewsConnectionTypeDto2, newsfeedGetSimilarNewsConnectionTypeDto3, newsfeedGetSimilarNewsConnectionTypeDto4, newsfeedGetSimilarNewsConnectionTypeDto5};
        $VALUES = newsfeedGetSimilarNewsConnectionTypeDtoArr;
        $ENTRIES = new asp(newsfeedGetSimilarNewsConnectionTypeDtoArr);
        CREATOR = new a();
    }

    private NewsfeedGetSimilarNewsConnectionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<NewsfeedGetSimilarNewsConnectionTypeDto> i() {
        return $ENTRIES;
    }

    public static NewsfeedGetSimilarNewsConnectionTypeDto valueOf(String str) {
        return (NewsfeedGetSimilarNewsConnectionTypeDto) Enum.valueOf(NewsfeedGetSimilarNewsConnectionTypeDto.class, str);
    }

    public static NewsfeedGetSimilarNewsConnectionTypeDto[] values() {
        return (NewsfeedGetSimilarNewsConnectionTypeDto[]) $VALUES.clone();
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
