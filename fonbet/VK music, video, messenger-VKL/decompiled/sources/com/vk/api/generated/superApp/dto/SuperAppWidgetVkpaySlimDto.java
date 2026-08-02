package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import io.reactivex.rxjava3.subjects.b;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.ly80;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppWidgetVkpaySlimDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppWidgetVkpaySlimDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppWidgetVkpaySlimDto> CREATOR = new a();

    @pmi0("accessibility")
    private final SuperAppAccessibilityDto accessibility;

    @pmi0("additional_header_icon")
    private final SuperAppUniversalWidgetAdditionalHeaderIconDto additionalHeaderIcon;

    @pmi0("balance")
    private final Float balance;

    @pmi0(InAppPurchaseMetaData.KEY_CURRENCY)
    private final CurrencyDto currency;

    @pmi0("header_right_type")
    private final SuperAppUniversalWidgetHeaderRightTypeDto headerRightType;

    @pmi0("is_hidden")
    private final Boolean isHidden;

    @pmi0("status")
    private final StatusDto status;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final SuperAppWidgetPayloadTypesDto type;

    @pmi0("weight")
    private final Float weight;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperAppWidgetVkpaySlimDto.kt */
    public static final class CurrencyDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CurrencyDto[] $VALUES;
        public static final Parcelable.Creator<CurrencyDto> CREATOR;

        @pmi0("RUB")
        public static final CurrencyDto RUB;
        private final String value;

        /* compiled from: SuperAppWidgetVkpaySlimDto.kt */
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
    /* compiled from: SuperAppWidgetVkpaySlimDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0(SignalingProtocol.KEY_ACTIVE)
        public static final StatusDto ACTIVE;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("inactive")
        public static final StatusDto INACTIVE;
        private final String value;

        /* compiled from: SuperAppWidgetVkpaySlimDto.kt */
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

    /* compiled from: SuperAppWidgetVkpaySlimDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppWidgetVkpaySlimDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetVkpaySlimDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            StatusDto createFromParcel = parcel.readInt() == 0 ? null : StatusDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SuperAppWidgetVkpaySlimDto(createFromParcel, valueOf, parcel.readInt() == 0 ? null : CurrencyDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : SuperAppAccessibilityDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetAdditionalHeaderIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetHeaderRightTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : SuperAppWidgetPayloadTypesDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetVkpaySlimDto[] newArray(int i) {
            return new SuperAppWidgetVkpaySlimDto[i];
        }
    }

    public SuperAppWidgetVkpaySlimDto() {
        this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppWidgetVkpaySlimDto)) {
            return false;
        }
        SuperAppWidgetVkpaySlimDto superAppWidgetVkpaySlimDto = (SuperAppWidgetVkpaySlimDto) obj;
        return this.status == superAppWidgetVkpaySlimDto.status && epx.f(this.isHidden, superAppWidgetVkpaySlimDto.isHidden) && this.currency == superAppWidgetVkpaySlimDto.currency && epx.f(this.trackCode, superAppWidgetVkpaySlimDto.trackCode) && epx.f(this.balance, superAppWidgetVkpaySlimDto.balance) && epx.f(this.accessibility, superAppWidgetVkpaySlimDto.accessibility) && epx.f(this.additionalHeaderIcon, superAppWidgetVkpaySlimDto.additionalHeaderIcon) && this.headerRightType == superAppWidgetVkpaySlimDto.headerRightType && epx.f(this.weight, superAppWidgetVkpaySlimDto.weight) && this.type == superAppWidgetVkpaySlimDto.type;
    }

    public final int hashCode() {
        StatusDto statusDto = this.status;
        int hashCode = (statusDto == null ? 0 : statusDto.hashCode()) * 31;
        Boolean bool = this.isHidden;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        CurrencyDto currencyDto = this.currency;
        int hashCode3 = (hashCode2 + (currencyDto == null ? 0 : currencyDto.hashCode())) * 31;
        String str = this.trackCode;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.balance;
        int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
        int hashCode6 = (hashCode5 + (superAppAccessibilityDto == null ? 0 : superAppAccessibilityDto.hashCode())) * 31;
        SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
        int hashCode7 = (hashCode6 + (superAppUniversalWidgetAdditionalHeaderIconDto == null ? 0 : superAppUniversalWidgetAdditionalHeaderIconDto.hashCode())) * 31;
        SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
        int hashCode8 = (hashCode7 + (superAppUniversalWidgetHeaderRightTypeDto == null ? 0 : superAppUniversalWidgetHeaderRightTypeDto.hashCode())) * 31;
        Float f2 = this.weight;
        int hashCode9 = (hashCode8 + (f2 == null ? 0 : f2.hashCode())) * 31;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
        return hashCode9 + (superAppWidgetPayloadTypesDto != null ? superAppWidgetPayloadTypesDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppWidgetVkpaySlimDto(status=");
        sb.append(this.status);
        sb.append(", isHidden=");
        sb.append(this.isHidden);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", balance=");
        sb.append(this.balance);
        sb.append(", accessibility=");
        sb.append(this.accessibility);
        sb.append(", additionalHeaderIcon=");
        sb.append(this.additionalHeaderIcon);
        sb.append(", headerRightType=");
        sb.append(this.headerRightType);
        sb.append(", weight=");
        sb.append(this.weight);
        sb.append(", type=");
        return ly80.b(sb, this.type, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        StatusDto statusDto = this.status;
        if (statusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            statusDto.writeToParcel(parcel, i);
        }
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
        parcel.writeString(this.trackCode);
        Float f = this.balance;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        SuperAppAccessibilityDto superAppAccessibilityDto = this.accessibility;
        if (superAppAccessibilityDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppAccessibilityDto.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto = this.additionalHeaderIcon;
        if (superAppUniversalWidgetAdditionalHeaderIconDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetAdditionalHeaderIconDto.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto = this.headerRightType;
        if (superAppUniversalWidgetHeaderRightTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetHeaderRightTypeDto.writeToParcel(parcel, i);
        }
        Float f2 = this.weight;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = this.type;
        if (superAppWidgetPayloadTypesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppWidgetPayloadTypesDto.writeToParcel(parcel, i);
        }
    }

    public SuperAppWidgetVkpaySlimDto(StatusDto statusDto, Boolean bool, CurrencyDto currencyDto, String str, Float f, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f2, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto) {
        this.status = statusDto;
        this.isHidden = bool;
        this.currency = currencyDto;
        this.trackCode = str;
        this.balance = f;
        this.accessibility = superAppAccessibilityDto;
        this.additionalHeaderIcon = superAppUniversalWidgetAdditionalHeaderIconDto;
        this.headerRightType = superAppUniversalWidgetHeaderRightTypeDto;
        this.weight = f2;
        this.type = superAppWidgetPayloadTypesDto;
    }

    public /* synthetic */ SuperAppWidgetVkpaySlimDto(StatusDto statusDto, Boolean bool, CurrencyDto currencyDto, String str, Float f, SuperAppAccessibilityDto superAppAccessibilityDto, SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto, Float f2, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : statusDto, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : currencyDto, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : f, (i & 32) != 0 ? null : superAppAccessibilityDto, (i & 64) != 0 ? null : superAppUniversalWidgetAdditionalHeaderIconDto, (i & 128) != 0 ? null : superAppUniversalWidgetHeaderRightTypeDto, (i & 256) != 0 ? null : f2, (i & 512) != 0 ? null : superAppWidgetPayloadTypesDto);
    }
}
