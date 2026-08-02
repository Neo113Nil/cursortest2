package com.vk.api.generated.money.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MoneyGetWalletStatusResponseDto.kt */
/* loaded from: classes15.dex */
public final class MoneyGetWalletStatusResponseDto implements Parcelable {
    public static final Parcelable.Creator<MoneyGetWalletStatusResponseDto> CREATOR = new a();

    @pmi0("balance")
    private final String balance;

    @pmi0(InAppPurchaseMetaData.KEY_CURRENCY)
    private final CurrencyDto currency;

    @pmi0("is_hidden")
    private final Boolean isHidden;

    @pmi0("status")
    private final StatusDto status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MoneyGetWalletStatusResponseDto.kt */
    public static final class CurrencyDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CurrencyDto[] $VALUES;
        public static final Parcelable.Creator<CurrencyDto> CREATOR;

        @pmi0("RUB")
        public static final CurrencyDto RUB;
        private final String value;

        /* compiled from: MoneyGetWalletStatusResponseDto.kt */
        public static final class a implements Parcelable.Creator<CurrencyDto> {
            @Override // android.os.Parcelable.Creator
            public final CurrencyDto createFromParcel(Parcel parcel) {
                return CurrencyDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CurrencyDto[] newArray(int i) {
                return new CurrencyDto[i];
            }
        }

        static {
            CurrencyDto currencyDto = new CurrencyDto("RUB", 0, "RUB");
            RUB = currencyDto;
            CurrencyDto[] currencyDtoArr = {currencyDto};
            $VALUES = currencyDtoArr;
            $ENTRIES = new asp(currencyDtoArr);
            CREATOR = new a();
        }

        private CurrencyDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static CurrencyDto valueOf(String str) {
            return (CurrencyDto) Enum.valueOf(CurrencyDto.class, str);
        }

        public static CurrencyDto[] values() {
            return (CurrencyDto[]) $VALUES.clone();
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
    /* compiled from: MoneyGetWalletStatusResponseDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0(SignalingProtocol.KEY_ACTIVE)
        public static final StatusDto ACTIVE;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("inactive")
        public static final StatusDto INACTIVE;
        private final String value;

        /* compiled from: MoneyGetWalletStatusResponseDto.kt */
        public static final class a implements Parcelable.Creator<StatusDto> {
            @Override // android.os.Parcelable.Creator
            public final StatusDto createFromParcel(Parcel parcel) {
                return StatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StatusDto[] newArray(int i) {
                return new StatusDto[i];
            }
        }

        static {
            StatusDto statusDto = new StatusDto(SignalingProtocol.STATE_ACTIVE, 0, SignalingProtocol.KEY_ACTIVE);
            ACTIVE = statusDto;
            StatusDto statusDto2 = new StatusDto("INACTIVE", 1, "inactive");
            INACTIVE = statusDto2;
            StatusDto[] statusDtoArr = {statusDto, statusDto2};
            $VALUES = statusDtoArr;
            $ENTRIES = new asp(statusDtoArr);
            CREATOR = new a();
        }

        private StatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StatusDto valueOf(String str) {
            return (StatusDto) Enum.valueOf(StatusDto.class, str);
        }

        public static StatusDto[] values() {
            return (StatusDto[]) $VALUES.clone();
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

    /* compiled from: MoneyGetWalletStatusResponseDto.kt */
    public static final class a implements Parcelable.Creator<MoneyGetWalletStatusResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MoneyGetWalletStatusResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MoneyGetWalletStatusResponseDto(readString, valueOf, parcel.readInt() == 0 ? null : CurrencyDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StatusDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MoneyGetWalletStatusResponseDto[] newArray(int i) {
            return new MoneyGetWalletStatusResponseDto[i];
        }
    }

    public MoneyGetWalletStatusResponseDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyGetWalletStatusResponseDto)) {
            return false;
        }
        MoneyGetWalletStatusResponseDto moneyGetWalletStatusResponseDto = (MoneyGetWalletStatusResponseDto) obj;
        return epx.f(this.balance, moneyGetWalletStatusResponseDto.balance) && epx.f(this.isHidden, moneyGetWalletStatusResponseDto.isHidden) && this.currency == moneyGetWalletStatusResponseDto.currency && this.status == moneyGetWalletStatusResponseDto.status;
    }

    public final int hashCode() {
        String str = this.balance;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isHidden;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        CurrencyDto currencyDto = this.currency;
        int hashCode3 = (hashCode2 + (currencyDto == null ? 0 : currencyDto.hashCode())) * 31;
        StatusDto statusDto = this.status;
        return hashCode3 + (statusDto != null ? statusDto.hashCode() : 0);
    }

    public final String toString() {
        return "MoneyGetWalletStatusResponseDto(balance=" + this.balance + ", isHidden=" + this.isHidden + ", currency=" + this.currency + ", status=" + this.status + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.balance);
        Boolean bool = this.isHidden;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        CurrencyDto currencyDto = this.currency;
        if (currencyDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            currencyDto.writeToParcel(parcel, i);
        }
        StatusDto statusDto = this.status;
        if (statusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            statusDto.writeToParcel(parcel, i);
        }
    }

    public MoneyGetWalletStatusResponseDto(String str, Boolean bool, CurrencyDto currencyDto, StatusDto statusDto) {
        this.balance = str;
        this.isHidden = bool;
        this.currency = currencyDto;
        this.status = statusDto;
    }

    public /* synthetic */ MoneyGetWalletStatusResponseDto(String str, Boolean bool, CurrencyDto currencyDto, StatusDto statusDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : currencyDto, (i & 8) != 0 ? null : statusDto);
    }
}
