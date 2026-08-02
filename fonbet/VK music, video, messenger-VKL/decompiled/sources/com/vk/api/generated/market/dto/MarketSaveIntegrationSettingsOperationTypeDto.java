package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSaveIntegrationSettingsOperationTypeDto.kt */
/* loaded from: classes15.dex */
public final class MarketSaveIntegrationSettingsOperationTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSaveIntegrationSettingsOperationTypeDto[] $VALUES;

    @pmi0("allow_vk_products")
    public static final MarketSaveIntegrationSettingsOperationTypeDto ALLOW_VK_PRODUCTS;
    public static final Parcelable.Creator<MarketSaveIntegrationSettingsOperationTypeDto> CREATOR;

    @pmi0("do_not_restore_vk_products")
    public static final MarketSaveIntegrationSettingsOperationTypeDto DO_NOT_RESTORE_VK_PRODUCTS;

    @pmi0("hide_admin_banner")
    public static final MarketSaveIntegrationSettingsOperationTypeDto HIDE_ADMIN_BANNER;

    @pmi0("hide_admin_limit_banner")
    public static final MarketSaveIntegrationSettingsOperationTypeDto HIDE_ADMIN_LIMIT_BANNER;

    @pmi0("hide_vk_products")
    public static final MarketSaveIntegrationSettingsOperationTypeDto HIDE_VK_PRODUCTS;

    @pmi0("restore_vk_products")
    public static final MarketSaveIntegrationSettingsOperationTypeDto RESTORE_VK_PRODUCTS;
    private final String value;

    /* compiled from: MarketSaveIntegrationSettingsOperationTypeDto.kt */
    public static final class a implements Parcelable.Creator<MarketSaveIntegrationSettingsOperationTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSaveIntegrationSettingsOperationTypeDto createFromParcel(Parcel parcel) {
            return MarketSaveIntegrationSettingsOperationTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSaveIntegrationSettingsOperationTypeDto[] newArray(int i) {
            return new MarketSaveIntegrationSettingsOperationTypeDto[i];
        }
    }

    static {
        MarketSaveIntegrationSettingsOperationTypeDto marketSaveIntegrationSettingsOperationTypeDto = new MarketSaveIntegrationSettingsOperationTypeDto("ALLOW_VK_PRODUCTS", 0, "allow_vk_products");
        ALLOW_VK_PRODUCTS = marketSaveIntegrationSettingsOperationTypeDto;
        MarketSaveIntegrationSettingsOperationTypeDto marketSaveIntegrationSettingsOperationTypeDto2 = new MarketSaveIntegrationSettingsOperationTypeDto("DO_NOT_RESTORE_VK_PRODUCTS", 1, "do_not_restore_vk_products");
        DO_NOT_RESTORE_VK_PRODUCTS = marketSaveIntegrationSettingsOperationTypeDto2;
        MarketSaveIntegrationSettingsOperationTypeDto marketSaveIntegrationSettingsOperationTypeDto3 = new MarketSaveIntegrationSettingsOperationTypeDto("HIDE_ADMIN_BANNER", 2, "hide_admin_banner");
        HIDE_ADMIN_BANNER = marketSaveIntegrationSettingsOperationTypeDto3;
        MarketSaveIntegrationSettingsOperationTypeDto marketSaveIntegrationSettingsOperationTypeDto4 = new MarketSaveIntegrationSettingsOperationTypeDto("HIDE_ADMIN_LIMIT_BANNER", 3, "hide_admin_limit_banner");
        HIDE_ADMIN_LIMIT_BANNER = marketSaveIntegrationSettingsOperationTypeDto4;
        MarketSaveIntegrationSettingsOperationTypeDto marketSaveIntegrationSettingsOperationTypeDto5 = new MarketSaveIntegrationSettingsOperationTypeDto("HIDE_VK_PRODUCTS", 4, "hide_vk_products");
        HIDE_VK_PRODUCTS = marketSaveIntegrationSettingsOperationTypeDto5;
        MarketSaveIntegrationSettingsOperationTypeDto marketSaveIntegrationSettingsOperationTypeDto6 = new MarketSaveIntegrationSettingsOperationTypeDto("RESTORE_VK_PRODUCTS", 5, "restore_vk_products");
        RESTORE_VK_PRODUCTS = marketSaveIntegrationSettingsOperationTypeDto6;
        MarketSaveIntegrationSettingsOperationTypeDto[] marketSaveIntegrationSettingsOperationTypeDtoArr = {marketSaveIntegrationSettingsOperationTypeDto, marketSaveIntegrationSettingsOperationTypeDto2, marketSaveIntegrationSettingsOperationTypeDto3, marketSaveIntegrationSettingsOperationTypeDto4, marketSaveIntegrationSettingsOperationTypeDto5, marketSaveIntegrationSettingsOperationTypeDto6};
        $VALUES = marketSaveIntegrationSettingsOperationTypeDtoArr;
        $ENTRIES = new asp(marketSaveIntegrationSettingsOperationTypeDtoArr);
        CREATOR = new a();
    }

    private MarketSaveIntegrationSettingsOperationTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketSaveIntegrationSettingsOperationTypeDto valueOf(String str) {
        return (MarketSaveIntegrationSettingsOperationTypeDto) Enum.valueOf(MarketSaveIntegrationSettingsOperationTypeDto.class, str);
    }

    public static MarketSaveIntegrationSettingsOperationTypeDto[] values() {
        return (MarketSaveIntegrationSettingsOperationTypeDto[]) $VALUES.clone();
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
