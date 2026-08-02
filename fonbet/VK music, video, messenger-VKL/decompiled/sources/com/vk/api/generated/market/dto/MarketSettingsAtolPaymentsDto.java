package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zrp;

/* compiled from: MarketSettingsAtolPaymentsDto.kt */
/* loaded from: classes15.dex */
public final class MarketSettingsAtolPaymentsDto implements Parcelable {
    public static final Parcelable.Creator<MarketSettingsAtolPaymentsDto> CREATOR = new a();

    @pmi0("email")
    private final String email;

    @pmi0("fiscal_enabled")
    private final boolean fiscalEnabled;

    @pmi0("group_code")
    private final String groupCode;

    @pmi0("login")
    private final String login;

    @pmi0("tax_rate")
    private final TaxRateDto taxRate;

    @pmi0("taxation_method")
    private final TaxationMethodDto taxationMethod;

    @pmi0("taxpayer_number")
    private final String taxpayerNumber;

    @pmi0("website")
    private final String website;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketSettingsAtolPaymentsDto.kt */
    public static final class TaxRateDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TaxRateDto[] $VALUES;
        public static final Parcelable.Creator<TaxRateDto> CREATOR;

        @pmi0("0")
        public static final TaxRateDto TAX_0;

        @pmi0("10")
        public static final TaxRateDto TAX_10;

        @pmi0("22")
        public static final TaxRateDto TAX_22;

        @pmi0(CampaignEx.CLICKMODE_ON)
        public static final TaxRateDto TAX_5;

        @pmi0(Gc.e)
        public static final TaxRateDto TAX_7;

        @pmi0("1000")
        public static final TaxRateDto TAX_NO;
        private final int value;

        /* compiled from: MarketSettingsAtolPaymentsDto.kt */
        public static final class a implements Parcelable.Creator<TaxRateDto> {
            @Override // android.os.Parcelable.Creator
            public final TaxRateDto createFromParcel(Parcel parcel) {
                return TaxRateDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TaxRateDto[] newArray(int i) {
                return new TaxRateDto[i];
            }
        }

        static {
            TaxRateDto taxRateDto = new TaxRateDto("TAX_0", 0, 0);
            TAX_0 = taxRateDto;
            TaxRateDto taxRateDto2 = new TaxRateDto("TAX_5", 1, 5);
            TAX_5 = taxRateDto2;
            TaxRateDto taxRateDto3 = new TaxRateDto("TAX_7", 2, 7);
            TAX_7 = taxRateDto3;
            TaxRateDto taxRateDto4 = new TaxRateDto("TAX_10", 3, 10);
            TAX_10 = taxRateDto4;
            TaxRateDto taxRateDto5 = new TaxRateDto("TAX_22", 4, 22);
            TAX_22 = taxRateDto5;
            TaxRateDto taxRateDto6 = new TaxRateDto("TAX_NO", 5, 1000);
            TAX_NO = taxRateDto6;
            TaxRateDto[] taxRateDtoArr = {taxRateDto, taxRateDto2, taxRateDto3, taxRateDto4, taxRateDto5, taxRateDto6};
            $VALUES = taxRateDtoArr;
            $ENTRIES = new asp(taxRateDtoArr);
            CREATOR = new a();
        }

        private TaxRateDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static TaxRateDto valueOf(String str) {
            return (TaxRateDto) Enum.valueOf(TaxRateDto.class, str);
        }

        public static TaxRateDto[] values() {
            return (TaxRateDto[]) $VALUES.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketSettingsAtolPaymentsDto.kt */
    public static final class TaxationMethodDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TaxationMethodDto[] $VALUES;

        @pmi0("0")
        public static final TaxationMethodDto COMMON;
        public static final Parcelable.Creator<TaxationMethodDto> CREATOR;

        @pmi0("3")
        public static final TaxationMethodDto ENVD;

        @pmi0("4")
        public static final TaxationMethodDto ESHD;

        @pmi0(CampaignEx.CLICKMODE_ON)
        public static final TaxationMethodDto PATENT;

        @pmi0("1")
        public static final TaxationMethodDto USN;

        @pmi0("2")
        public static final TaxationMethodDto USN_INCOME_EXPENSE;
        private final int value;

        /* compiled from: MarketSettingsAtolPaymentsDto.kt */
        public static final class a implements Parcelable.Creator<TaxationMethodDto> {
            @Override // android.os.Parcelable.Creator
            public final TaxationMethodDto createFromParcel(Parcel parcel) {
                return TaxationMethodDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TaxationMethodDto[] newArray(int i) {
                return new TaxationMethodDto[i];
            }
        }

        static {
            TaxationMethodDto taxationMethodDto = new TaxationMethodDto("COMMON", 0, 0);
            COMMON = taxationMethodDto;
            TaxationMethodDto taxationMethodDto2 = new TaxationMethodDto("USN", 1, 1);
            USN = taxationMethodDto2;
            TaxationMethodDto taxationMethodDto3 = new TaxationMethodDto("USN_INCOME_EXPENSE", 2, 2);
            USN_INCOME_EXPENSE = taxationMethodDto3;
            TaxationMethodDto taxationMethodDto4 = new TaxationMethodDto("ENVD", 3, 3);
            ENVD = taxationMethodDto4;
            TaxationMethodDto taxationMethodDto5 = new TaxationMethodDto("ESHD", 4, 4);
            ESHD = taxationMethodDto5;
            TaxationMethodDto taxationMethodDto6 = new TaxationMethodDto("PATENT", 5, 5);
            PATENT = taxationMethodDto6;
            TaxationMethodDto[] taxationMethodDtoArr = {taxationMethodDto, taxationMethodDto2, taxationMethodDto3, taxationMethodDto4, taxationMethodDto5, taxationMethodDto6};
            $VALUES = taxationMethodDtoArr;
            $ENTRIES = new asp(taxationMethodDtoArr);
            CREATOR = new a();
        }

        private TaxationMethodDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static TaxationMethodDto valueOf(String str) {
            return (TaxationMethodDto) Enum.valueOf(TaxationMethodDto.class, str);
        }

        public static TaxationMethodDto[] values() {
            return (TaxationMethodDto[]) $VALUES.clone();
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

    /* compiled from: MarketSettingsAtolPaymentsDto.kt */
    public static final class a implements Parcelable.Creator<MarketSettingsAtolPaymentsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSettingsAtolPaymentsDto createFromParcel(Parcel parcel) {
            return new MarketSettingsAtolPaymentsDto(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), TaxationMethodDto.CREATOR.createFromParcel(parcel), TaxRateDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSettingsAtolPaymentsDto[] newArray(int i) {
            return new MarketSettingsAtolPaymentsDto[i];
        }
    }

    public MarketSettingsAtolPaymentsDto(boolean z, String str, String str2, String str3, String str4, String str5, TaxationMethodDto taxationMethodDto, TaxRateDto taxRateDto) {
        this.fiscalEnabled = z;
        this.groupCode = str;
        this.login = str2;
        this.website = str3;
        this.email = str4;
        this.taxpayerNumber = str5;
        this.taxationMethod = taxationMethodDto;
        this.taxRate = taxRateDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketSettingsAtolPaymentsDto)) {
            return false;
        }
        MarketSettingsAtolPaymentsDto marketSettingsAtolPaymentsDto = (MarketSettingsAtolPaymentsDto) obj;
        return this.fiscalEnabled == marketSettingsAtolPaymentsDto.fiscalEnabled && epx.f(this.groupCode, marketSettingsAtolPaymentsDto.groupCode) && epx.f(this.login, marketSettingsAtolPaymentsDto.login) && epx.f(this.website, marketSettingsAtolPaymentsDto.website) && epx.f(this.email, marketSettingsAtolPaymentsDto.email) && epx.f(this.taxpayerNumber, marketSettingsAtolPaymentsDto.taxpayerNumber) && this.taxationMethod == marketSettingsAtolPaymentsDto.taxationMethod && this.taxRate == marketSettingsAtolPaymentsDto.taxRate;
    }

    public final int hashCode() {
        return this.taxRate.hashCode() + ((this.taxationMethod.hashCode() + urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(Boolean.hashCode(this.fiscalEnabled) * 31, 31, this.groupCode), 31, this.login), 31, this.website), 31, this.email), 31, this.taxpayerNumber)) * 31);
    }

    public final String toString() {
        return "MarketSettingsAtolPaymentsDto(fiscalEnabled=" + this.fiscalEnabled + ", groupCode=" + this.groupCode + ", login=" + this.login + ", website=" + this.website + ", email=" + this.email + ", taxpayerNumber=" + this.taxpayerNumber + ", taxationMethod=" + this.taxationMethod + ", taxRate=" + this.taxRate + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.fiscalEnabled ? 1 : 0);
        parcel.writeString(this.groupCode);
        parcel.writeString(this.login);
        parcel.writeString(this.website);
        parcel.writeString(this.email);
        parcel.writeString(this.taxpayerNumber);
        this.taxationMethod.writeToParcel(parcel, i);
        this.taxRate.writeToParcel(parcel, i);
    }
}
