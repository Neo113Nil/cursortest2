package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.BillingClient;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetVideoStandaloneCatalogIdDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGetVideoStandaloneCatalogIdDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogGetVideoStandaloneCatalogIdDto[] $VALUES;

    @pmi0("all_subscriptions")
    public static final CatalogGetVideoStandaloneCatalogIdDto ALL_SUBSCRIPTIONS;
    public static final Parcelable.Creator<CatalogGetVideoStandaloneCatalogIdDto> CREATOR;

    @pmi0("for_kids")
    public static final CatalogGetVideoStandaloneCatalogIdDto FOR_KIDS;

    @pmi0("home")
    public static final CatalogGetVideoStandaloneCatalogIdDto HOME;

    @pmi0("home_tablet")
    public static final CatalogGetVideoStandaloneCatalogIdDto HOME_TABLET;

    @pmi0("library")
    public static final CatalogGetVideoStandaloneCatalogIdDto LIBRARY;

    @pmi0("library_tablet")
    public static final CatalogGetVideoStandaloneCatalogIdDto LIBRARY_TABLET;

    @pmi0("lives")
    public static final CatalogGetVideoStandaloneCatalogIdDto LIVES;

    @pmi0("meta_channel")
    public static final CatalogGetVideoStandaloneCatalogIdDto META_CHANNEL;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    public static final CatalogGetVideoStandaloneCatalogIdDto PROFILE;

    @pmi0("profile_tablet")
    public static final CatalogGetVideoStandaloneCatalogIdDto PROFILE_TABLET;

    @pmi0(BillingClient.FeatureType.SUBSCRIPTIONS)
    public static final CatalogGetVideoStandaloneCatalogIdDto SUBSCRIPTIONS;

    @pmi0("subscriptions_tablet")
    public static final CatalogGetVideoStandaloneCatalogIdDto SUBSCRIPTIONS_TABLET;

    @pmi0("tv_feed")
    public static final CatalogGetVideoStandaloneCatalogIdDto TV_FEED;

    @pmi0("viewing_history")
    public static final CatalogGetVideoStandaloneCatalogIdDto VIEWING_HISTORY;
    private final String value;

    /* compiled from: CatalogGetVideoStandaloneCatalogIdDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGetVideoStandaloneCatalogIdDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGetVideoStandaloneCatalogIdDto createFromParcel(Parcel parcel) {
            return CatalogGetVideoStandaloneCatalogIdDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGetVideoStandaloneCatalogIdDto[] newArray(int i) {
            return new CatalogGetVideoStandaloneCatalogIdDto[i];
        }
    }

    static {
        CatalogGetVideoStandaloneCatalogIdDto catalogGetVideoStandaloneCatalogIdDto = new CatalogGetVideoStandaloneCatalogIdDto("ALL_SUBSCRIPTIONS", 0, "all_subscriptions");
        ALL_SUBSCRIPTIONS = catalogGetVideoStandaloneCatalogIdDto;
        CatalogGetVideoStandaloneCatalogIdDto catalogGetVideoStandaloneCatalogIdDto2 = new CatalogGetVideoStandaloneCatalogIdDto("FOR_KIDS", 1, "for_kids");
        FOR_KIDS = catalogGetVideoStandaloneCatalogIdDto2;
        CatalogGetVideoStandaloneCatalogIdDto catalogGetVideoStandaloneCatalogIdDto3 = new CatalogGetVideoStandaloneCatalogIdDto("HOME", 2, "home");
        HOME = catalogGetVideoStandaloneCatalogIdDto3;
        CatalogGetVideoStandaloneCatalogIdDto catalogGetVideoStandaloneCatalogIdDto4 = new CatalogGetVideoStandaloneCatalogIdDto("HOME_TABLET", 3, "home_tablet");
        HOME_TABLET = catalogGetVideoStandaloneCatalogIdDto4;
        CatalogGetVideoStandaloneCatalogIdDto catalogGetVideoStandaloneCatalogIdDto5 = new CatalogGetVideoStandaloneCatalogIdDto("LIBRARY", 4, "library");
        LIBRARY = catalogGetVideoStandaloneCatalogIdDto5;
        CatalogGetVideoStandaloneCatalogIdDto catalogGetVideoStandaloneCatalogIdDto6 = new CatalogGetVideoStandaloneCatalogIdDto("LIBRARY_TABLET", 5, "library_tablet");
        LIBRARY_TABLET = catalogGetVideoStandaloneCatalogIdDto6;
        CatalogGetVideoStandaloneCatalogIdDto catalogGetVideoStandaloneCatalogIdDto7 = new CatalogGetVideoStandaloneCatalogIdDto("LIVES", 6, "lives");
        LIVES = catalogGetVideoStandaloneCatalogIdDto7;
        CatalogGetVideoStandaloneCatalogIdDto catalogGetVideoStandaloneCatalogIdDto8 = new CatalogGetVideoStandaloneCatalogIdDto("PROFILE", 7, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        PROFILE = catalogGetVideoStandaloneCatalogIdDto8;
        CatalogGetVideoStandaloneCatalogIdDto catalogGetVideoStandaloneCatalogIdDto9 = new CatalogGetVideoStandaloneCatalogIdDto("PROFILE_TABLET", 8, "profile_tablet");
        PROFILE_TABLET = catalogGetVideoStandaloneCatalogIdDto9;
        CatalogGetVideoStandaloneCatalogIdDto catalogGetVideoStandaloneCatalogIdDto10 = new CatalogGetVideoStandaloneCatalogIdDto("SUBSCRIPTIONS", 9, BillingClient.FeatureType.SUBSCRIPTIONS);
        SUBSCRIPTIONS = catalogGetVideoStandaloneCatalogIdDto10;
        CatalogGetVideoStandaloneCatalogIdDto catalogGetVideoStandaloneCatalogIdDto11 = new CatalogGetVideoStandaloneCatalogIdDto("SUBSCRIPTIONS_TABLET", 10, "subscriptions_tablet");
        SUBSCRIPTIONS_TABLET = catalogGetVideoStandaloneCatalogIdDto11;
        CatalogGetVideoStandaloneCatalogIdDto catalogGetVideoStandaloneCatalogIdDto12 = new CatalogGetVideoStandaloneCatalogIdDto("TV_FEED", 11, "tv_feed");
        TV_FEED = catalogGetVideoStandaloneCatalogIdDto12;
        CatalogGetVideoStandaloneCatalogIdDto catalogGetVideoStandaloneCatalogIdDto13 = new CatalogGetVideoStandaloneCatalogIdDto("VIEWING_HISTORY", 12, "viewing_history");
        VIEWING_HISTORY = catalogGetVideoStandaloneCatalogIdDto13;
        CatalogGetVideoStandaloneCatalogIdDto catalogGetVideoStandaloneCatalogIdDto14 = new CatalogGetVideoStandaloneCatalogIdDto("META_CHANNEL", 13, "meta_channel");
        META_CHANNEL = catalogGetVideoStandaloneCatalogIdDto14;
        CatalogGetVideoStandaloneCatalogIdDto[] catalogGetVideoStandaloneCatalogIdDtoArr = {catalogGetVideoStandaloneCatalogIdDto, catalogGetVideoStandaloneCatalogIdDto2, catalogGetVideoStandaloneCatalogIdDto3, catalogGetVideoStandaloneCatalogIdDto4, catalogGetVideoStandaloneCatalogIdDto5, catalogGetVideoStandaloneCatalogIdDto6, catalogGetVideoStandaloneCatalogIdDto7, catalogGetVideoStandaloneCatalogIdDto8, catalogGetVideoStandaloneCatalogIdDto9, catalogGetVideoStandaloneCatalogIdDto10, catalogGetVideoStandaloneCatalogIdDto11, catalogGetVideoStandaloneCatalogIdDto12, catalogGetVideoStandaloneCatalogIdDto13, catalogGetVideoStandaloneCatalogIdDto14};
        $VALUES = catalogGetVideoStandaloneCatalogIdDtoArr;
        $ENTRIES = new asp(catalogGetVideoStandaloneCatalogIdDtoArr);
        CREATOR = new a();
    }

    private CatalogGetVideoStandaloneCatalogIdDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static CatalogGetVideoStandaloneCatalogIdDto valueOf(String str) {
        return (CatalogGetVideoStandaloneCatalogIdDto) Enum.valueOf(CatalogGetVideoStandaloneCatalogIdDto.class, str);
    }

    public static CatalogGetVideoStandaloneCatalogIdDto[] values() {
        return (CatalogGetVideoStandaloneCatalogIdDto[]) $VALUES.clone();
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
