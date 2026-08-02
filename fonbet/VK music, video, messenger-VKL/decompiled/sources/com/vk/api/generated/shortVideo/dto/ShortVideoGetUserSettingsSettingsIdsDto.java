package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShortVideoGetUserSettingsSettingsIdsDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetUserSettingsSettingsIdsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShortVideoGetUserSettingsSettingsIdsDto[] $VALUES;

    @pmi0("available_attaches")
    public static final ShortVideoGetUserSettingsSettingsIdsDto AVAILABLE_ATTACHES;

    @pmi0("can_attach_products")
    public static final ShortVideoGetUserSettingsSettingsIdsDto CAN_ATTACH_PRODUCTS;

    @pmi0("clips_app_onboarding_finished")
    public static final ShortVideoGetUserSettingsSettingsIdsDto CLIPS_APP_ONBOARDING_FINISHED;
    public static final Parcelable.Creator<ShortVideoGetUserSettingsSettingsIdsDto> CREATOR;

    @pmi0("license_agreement_2022_agree")
    public static final ShortVideoGetUserSettingsSettingsIdsDto LICENSE_AGREEMENT_2022_AGREE;

    @pmi0("owner_can_attach_link")
    public static final ShortVideoGetUserSettingsSettingsIdsDto OWNER_CAN_ATTACH_LINK;

    @pmi0("post_ad_banner_interval")
    public static final ShortVideoGetUserSettingsSettingsIdsDto POST_AD_BANNER_INTERVAL;

    @pmi0("ugc_sounds_agreement_2022_agree")
    public static final ShortVideoGetUserSettingsSettingsIdsDto UGC_SOUNDS_AGREEMENT_2022_AGREE;
    private final String value;

    /* compiled from: ShortVideoGetUserSettingsSettingsIdsDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetUserSettingsSettingsIdsDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetUserSettingsSettingsIdsDto createFromParcel(Parcel parcel) {
            return ShortVideoGetUserSettingsSettingsIdsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetUserSettingsSettingsIdsDto[] newArray(int i) {
            return new ShortVideoGetUserSettingsSettingsIdsDto[i];
        }
    }

    static {
        ShortVideoGetUserSettingsSettingsIdsDto shortVideoGetUserSettingsSettingsIdsDto = new ShortVideoGetUserSettingsSettingsIdsDto("LICENSE_AGREEMENT_2022_AGREE", 0, "license_agreement_2022_agree");
        LICENSE_AGREEMENT_2022_AGREE = shortVideoGetUserSettingsSettingsIdsDto;
        ShortVideoGetUserSettingsSettingsIdsDto shortVideoGetUserSettingsSettingsIdsDto2 = new ShortVideoGetUserSettingsSettingsIdsDto("UGC_SOUNDS_AGREEMENT_2022_AGREE", 1, "ugc_sounds_agreement_2022_agree");
        UGC_SOUNDS_AGREEMENT_2022_AGREE = shortVideoGetUserSettingsSettingsIdsDto2;
        ShortVideoGetUserSettingsSettingsIdsDto shortVideoGetUserSettingsSettingsIdsDto3 = new ShortVideoGetUserSettingsSettingsIdsDto("OWNER_CAN_ATTACH_LINK", 2, "owner_can_attach_link");
        OWNER_CAN_ATTACH_LINK = shortVideoGetUserSettingsSettingsIdsDto3;
        ShortVideoGetUserSettingsSettingsIdsDto shortVideoGetUserSettingsSettingsIdsDto4 = new ShortVideoGetUserSettingsSettingsIdsDto("CLIPS_APP_ONBOARDING_FINISHED", 3, "clips_app_onboarding_finished");
        CLIPS_APP_ONBOARDING_FINISHED = shortVideoGetUserSettingsSettingsIdsDto4;
        ShortVideoGetUserSettingsSettingsIdsDto shortVideoGetUserSettingsSettingsIdsDto5 = new ShortVideoGetUserSettingsSettingsIdsDto("POST_AD_BANNER_INTERVAL", 4, "post_ad_banner_interval");
        POST_AD_BANNER_INTERVAL = shortVideoGetUserSettingsSettingsIdsDto5;
        ShortVideoGetUserSettingsSettingsIdsDto shortVideoGetUserSettingsSettingsIdsDto6 = new ShortVideoGetUserSettingsSettingsIdsDto("AVAILABLE_ATTACHES", 5, "available_attaches");
        AVAILABLE_ATTACHES = shortVideoGetUserSettingsSettingsIdsDto6;
        ShortVideoGetUserSettingsSettingsIdsDto shortVideoGetUserSettingsSettingsIdsDto7 = new ShortVideoGetUserSettingsSettingsIdsDto("CAN_ATTACH_PRODUCTS", 6, "can_attach_products");
        CAN_ATTACH_PRODUCTS = shortVideoGetUserSettingsSettingsIdsDto7;
        ShortVideoGetUserSettingsSettingsIdsDto[] shortVideoGetUserSettingsSettingsIdsDtoArr = {shortVideoGetUserSettingsSettingsIdsDto, shortVideoGetUserSettingsSettingsIdsDto2, shortVideoGetUserSettingsSettingsIdsDto3, shortVideoGetUserSettingsSettingsIdsDto4, shortVideoGetUserSettingsSettingsIdsDto5, shortVideoGetUserSettingsSettingsIdsDto6, shortVideoGetUserSettingsSettingsIdsDto7};
        $VALUES = shortVideoGetUserSettingsSettingsIdsDtoArr;
        $ENTRIES = new asp(shortVideoGetUserSettingsSettingsIdsDtoArr);
        CREATOR = new a();
    }

    private ShortVideoGetUserSettingsSettingsIdsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ShortVideoGetUserSettingsSettingsIdsDto valueOf(String str) {
        return (ShortVideoGetUserSettingsSettingsIdsDto) Enum.valueOf(ShortVideoGetUserSettingsSettingsIdsDto.class, str);
    }

    public static ShortVideoGetUserSettingsSettingsIdsDto[] values() {
        return (ShortVideoGetUserSettingsSettingsIdsDto[]) $VALUES.clone();
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
