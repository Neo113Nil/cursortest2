package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.marketIntegrations.dto.MarketIntegrationsTypeDto;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketIntegrationSettingsDto.kt */
/* loaded from: classes15.dex */
public final class MarketIntegrationSettingsDto implements Parcelable {
    public static final Parcelable.Creator<MarketIntegrationSettingsDto> CREATOR = new a();

    @pmi0("admin_banner")
    private final MarketIntegrationSettingsAdminBannerDto adminBanner;

    @pmi0("integration_status")
    private final IntegrationStatusDto integrationStatus;

    @pmi0("integration_type")
    private final MarketIntegrationsTypeDto integrationType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketIntegrationSettingsDto.kt */
    public static final class IntegrationStatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IntegrationStatusDto[] $VALUES;

        @pmi0("1")
        public static final IntegrationStatusDto CONNECTED;
        public static final Parcelable.Creator<IntegrationStatusDto> CREATOR;

        @pmi0("0")
        public static final IntegrationStatusDto DISCONNECTED;
        private final int value;

        /* compiled from: MarketIntegrationSettingsDto.kt */
        public static final class a implements Parcelable.Creator<IntegrationStatusDto> {
            @Override // android.os.Parcelable.Creator
            public final IntegrationStatusDto createFromParcel(Parcel parcel) {
                return IntegrationStatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final IntegrationStatusDto[] newArray(int i) {
                return new IntegrationStatusDto[i];
            }
        }

        static {
            IntegrationStatusDto integrationStatusDto = new IntegrationStatusDto("DISCONNECTED", 0, 0);
            DISCONNECTED = integrationStatusDto;
            IntegrationStatusDto integrationStatusDto2 = new IntegrationStatusDto("CONNECTED", 1, 1);
            CONNECTED = integrationStatusDto2;
            IntegrationStatusDto[] integrationStatusDtoArr = {integrationStatusDto, integrationStatusDto2};
            $VALUES = integrationStatusDtoArr;
            $ENTRIES = new asp(integrationStatusDtoArr);
            CREATOR = new a();
        }

        private IntegrationStatusDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static IntegrationStatusDto valueOf(String str) {
            return (IntegrationStatusDto) Enum.valueOf(IntegrationStatusDto.class, str);
        }

        public static IntegrationStatusDto[] values() {
            return (IntegrationStatusDto[]) $VALUES.clone();
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

    /* compiled from: MarketIntegrationSettingsDto.kt */
    public static final class a implements Parcelable.Creator<MarketIntegrationSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketIntegrationSettingsDto createFromParcel(Parcel parcel) {
            return new MarketIntegrationSettingsDto((MarketIntegrationsTypeDto) parcel.readParcelable(MarketIntegrationSettingsDto.class.getClassLoader()), parcel.readInt() == 0 ? null : IntegrationStatusDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MarketIntegrationSettingsAdminBannerDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketIntegrationSettingsDto[] newArray(int i) {
            return new MarketIntegrationSettingsDto[i];
        }
    }

    public MarketIntegrationSettingsDto() {
        this(null, null, null, 7, null);
    }

    public final MarketIntegrationSettingsAdminBannerDto d() {
        return this.adminBanner;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketIntegrationSettingsDto)) {
            return false;
        }
        MarketIntegrationSettingsDto marketIntegrationSettingsDto = (MarketIntegrationSettingsDto) obj;
        return this.integrationType == marketIntegrationSettingsDto.integrationType && this.integrationStatus == marketIntegrationSettingsDto.integrationStatus && epx.f(this.adminBanner, marketIntegrationSettingsDto.adminBanner);
    }

    public final int hashCode() {
        MarketIntegrationsTypeDto marketIntegrationsTypeDto = this.integrationType;
        int hashCode = (marketIntegrationsTypeDto == null ? 0 : marketIntegrationsTypeDto.hashCode()) * 31;
        IntegrationStatusDto integrationStatusDto = this.integrationStatus;
        int hashCode2 = (hashCode + (integrationStatusDto == null ? 0 : integrationStatusDto.hashCode())) * 31;
        MarketIntegrationSettingsAdminBannerDto marketIntegrationSettingsAdminBannerDto = this.adminBanner;
        return hashCode2 + (marketIntegrationSettingsAdminBannerDto != null ? marketIntegrationSettingsAdminBannerDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketIntegrationSettingsDto(integrationType=" + this.integrationType + ", integrationStatus=" + this.integrationStatus + ", adminBanner=" + this.adminBanner + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.integrationType, i);
        IntegrationStatusDto integrationStatusDto = this.integrationStatus;
        if (integrationStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            integrationStatusDto.writeToParcel(parcel, i);
        }
        MarketIntegrationSettingsAdminBannerDto marketIntegrationSettingsAdminBannerDto = this.adminBanner;
        if (marketIntegrationSettingsAdminBannerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketIntegrationSettingsAdminBannerDto.writeToParcel(parcel, i);
        }
    }

    public MarketIntegrationSettingsDto(MarketIntegrationsTypeDto marketIntegrationsTypeDto, IntegrationStatusDto integrationStatusDto, MarketIntegrationSettingsAdminBannerDto marketIntegrationSettingsAdminBannerDto) {
        this.integrationType = marketIntegrationsTypeDto;
        this.integrationStatus = integrationStatusDto;
        this.adminBanner = marketIntegrationSettingsAdminBannerDto;
    }

    public /* synthetic */ MarketIntegrationSettingsDto(MarketIntegrationsTypeDto marketIntegrationsTypeDto, IntegrationStatusDto integrationStatusDto, MarketIntegrationSettingsAdminBannerDto marketIntegrationSettingsAdminBannerDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : marketIntegrationsTypeDto, (i & 2) != 0 ? null : integrationStatusDto, (i & 4) != 0 ? null : marketIntegrationSettingsAdminBannerDto);
    }
}
