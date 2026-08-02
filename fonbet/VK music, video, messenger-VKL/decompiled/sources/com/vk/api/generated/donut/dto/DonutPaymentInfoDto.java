package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: DonutPaymentInfoDto.kt */
/* loaded from: classes14.dex */
public final class DonutPaymentInfoDto implements Parcelable {
    public static final Parcelable.Creator<DonutPaymentInfoDto> CREATOR = new a();

    @pmi0("change_amount_preset_prices")
    private final List<Integer> changeAmountPresetPrices;

    @pmi0("current_period")
    private final Integer currentPeriod;

    @pmi0("forbidden_reason")
    private final DonutPaymentInfoForbiddenReasonDto forbiddenReason;

    @pmi0("is_active")
    private final Boolean isActive;

    @pmi0("is_active_trial")
    private final Boolean isActiveTrial;

    @pmi0("is_trial_subscription_available")
    private final Boolean isTrialSubscriptionAvailable;

    @pmi0("is_unsubscribe_reasons_available")
    private final Boolean isUnsubscribeReasonsAvailable;

    @pmi0("is_year_subscription_available")
    private final Boolean isYearSubscriptionAvailable;

    @pmi0("max_price")
    private final Integer maxPrice;

    @pmi0("min_price")
    private final Integer minPrice;

    @pmi0("next_payment_date")
    private final Integer nextPaymentDate;

    @pmi0("price_for_user")
    private final Integer priceForUser;

    @pmi0("status")
    private final StatusDto status;

    @pmi0("subscription_expire_description")
    private final String subscriptionExpireDescription;

    @pmi0("subscription_expire_title")
    private final String subscriptionExpireTitle;

    @pmi0("subscription_method_info")
    private final DonutSubscriptionMethodInfoDto subscriptionMethodInfo;

    @pmi0("user_donut_settings")
    private final DonutUserDonutSettingsDto userDonutSettings;

    @pmi0("year_subscription_price")
    private final Integer yearSubscriptionPrice;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DonutPaymentInfoDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0("can_change_amount")
        public static final StatusDto CAN_CHANGE_AMOUNT;

        @pmi0("can_resubscribe")
        public static final StatusDto CAN_RESUBSCRIBE;

        @pmi0("can_subscribe")
        public static final StatusDto CAN_SUBSCRIBE;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("forbidden")
        public static final StatusDto FORBIDDEN;
        private final String value;

        /* compiled from: DonutPaymentInfoDto.kt */
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
            StatusDto statusDto = new StatusDto("CAN_SUBSCRIBE", 0, "can_subscribe");
            CAN_SUBSCRIBE = statusDto;
            StatusDto statusDto2 = new StatusDto("CAN_RESUBSCRIBE", 1, "can_resubscribe");
            CAN_RESUBSCRIBE = statusDto2;
            StatusDto statusDto3 = new StatusDto("CAN_CHANGE_AMOUNT", 2, "can_change_amount");
            CAN_CHANGE_AMOUNT = statusDto3;
            StatusDto statusDto4 = new StatusDto("FORBIDDEN", 3, "forbidden");
            FORBIDDEN = statusDto4;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3, statusDto4};
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

    /* compiled from: DonutPaymentInfoDto.kt */
    public static final class a implements Parcelable.Creator<DonutPaymentInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutPaymentInfoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            ArrayList arrayList;
            Boolean bool;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            StatusDto createFromParcel = StatusDto.CREATOR.createFromParcel(parcel);
            DonutPaymentInfoForbiddenReasonDto createFromParcel2 = parcel.readInt() == 0 ? null : DonutPaymentInfoForbiddenReasonDto.CREATOR.createFromParcel(parcel);
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf11 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool = valueOf;
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                bool = valueOf;
                int i = 0;
                while (i != readInt) {
                    i = pm0.b(parcel, arrayList, i, 1);
                }
            }
            DonutSubscriptionMethodInfoDto donutSubscriptionMethodInfoDto = (DonutSubscriptionMethodInfoDto) parcel.readParcelable(DonutPaymentInfoDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Boolean bool2 = valueOf2;
            ArrayList arrayList2 = arrayList;
            return new DonutPaymentInfoDto(createFromParcel, createFromParcel2, valueOf6, valueOf7, valueOf8, readString, readString2, valueOf9, valueOf10, bool, valueOf11, bool2, arrayList2, donutSubscriptionMethodInfoDto, valueOf3, valueOf4, valueOf5, parcel.readInt() == 0 ? null : DonutUserDonutSettingsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DonutPaymentInfoDto[] newArray(int i) {
            return new DonutPaymentInfoDto[i];
        }
    }

    public DonutPaymentInfoDto(StatusDto statusDto, DonutPaymentInfoForbiddenReasonDto donutPaymentInfoForbiddenReasonDto, Integer num, Integer num2, Integer num3, String str, String str2, Integer num4, Integer num5, Boolean bool, Integer num6, Boolean bool2, List<Integer> list, DonutSubscriptionMethodInfoDto donutSubscriptionMethodInfoDto, Boolean bool3, Boolean bool4, Boolean bool5, DonutUserDonutSettingsDto donutUserDonutSettingsDto) {
        this.status = statusDto;
        this.forbiddenReason = donutPaymentInfoForbiddenReasonDto;
        this.maxPrice = num;
        this.priceForUser = num2;
        this.nextPaymentDate = num3;
        this.subscriptionExpireTitle = str;
        this.subscriptionExpireDescription = str2;
        this.minPrice = num4;
        this.currentPeriod = num5;
        this.isYearSubscriptionAvailable = bool;
        this.yearSubscriptionPrice = num6;
        this.isTrialSubscriptionAvailable = bool2;
        this.changeAmountPresetPrices = list;
        this.subscriptionMethodInfo = donutSubscriptionMethodInfoDto;
        this.isUnsubscribeReasonsAvailable = bool3;
        this.isActive = bool4;
        this.isActiveTrial = bool5;
        this.userDonutSettings = donutUserDonutSettingsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutPaymentInfoDto)) {
            return false;
        }
        DonutPaymentInfoDto donutPaymentInfoDto = (DonutPaymentInfoDto) obj;
        return this.status == donutPaymentInfoDto.status && epx.f(this.forbiddenReason, donutPaymentInfoDto.forbiddenReason) && epx.f(this.maxPrice, donutPaymentInfoDto.maxPrice) && epx.f(this.priceForUser, donutPaymentInfoDto.priceForUser) && epx.f(this.nextPaymentDate, donutPaymentInfoDto.nextPaymentDate) && epx.f(this.subscriptionExpireTitle, donutPaymentInfoDto.subscriptionExpireTitle) && epx.f(this.subscriptionExpireDescription, donutPaymentInfoDto.subscriptionExpireDescription) && epx.f(this.minPrice, donutPaymentInfoDto.minPrice) && epx.f(this.currentPeriod, donutPaymentInfoDto.currentPeriod) && epx.f(this.isYearSubscriptionAvailable, donutPaymentInfoDto.isYearSubscriptionAvailable) && epx.f(this.yearSubscriptionPrice, donutPaymentInfoDto.yearSubscriptionPrice) && epx.f(this.isTrialSubscriptionAvailable, donutPaymentInfoDto.isTrialSubscriptionAvailable) && epx.f(this.changeAmountPresetPrices, donutPaymentInfoDto.changeAmountPresetPrices) && epx.f(this.subscriptionMethodInfo, donutPaymentInfoDto.subscriptionMethodInfo) && epx.f(this.isUnsubscribeReasonsAvailable, donutPaymentInfoDto.isUnsubscribeReasonsAvailable) && epx.f(this.isActive, donutPaymentInfoDto.isActive) && epx.f(this.isActiveTrial, donutPaymentInfoDto.isActiveTrial) && epx.f(this.userDonutSettings, donutPaymentInfoDto.userDonutSettings);
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        DonutPaymentInfoForbiddenReasonDto donutPaymentInfoForbiddenReasonDto = this.forbiddenReason;
        int hashCode2 = (hashCode + (donutPaymentInfoForbiddenReasonDto == null ? 0 : donutPaymentInfoForbiddenReasonDto.hashCode())) * 31;
        Integer num = this.maxPrice;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.priceForUser;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.nextPaymentDate;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.subscriptionExpireTitle;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subscriptionExpireDescription;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num4 = this.minPrice;
        int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.currentPeriod;
        int hashCode9 = (hashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool = this.isYearSubscriptionAvailable;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num6 = this.yearSubscriptionPrice;
        int hashCode11 = (hashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Boolean bool2 = this.isTrialSubscriptionAvailable;
        int hashCode12 = (hashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<Integer> list = this.changeAmountPresetPrices;
        int hashCode13 = (hashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        DonutSubscriptionMethodInfoDto donutSubscriptionMethodInfoDto = this.subscriptionMethodInfo;
        int hashCode14 = (hashCode13 + (donutSubscriptionMethodInfoDto == null ? 0 : donutSubscriptionMethodInfoDto.hashCode())) * 31;
        Boolean bool3 = this.isUnsubscribeReasonsAvailable;
        int hashCode15 = (hashCode14 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isActive;
        int hashCode16 = (hashCode15 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isActiveTrial;
        int hashCode17 = (hashCode16 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        DonutUserDonutSettingsDto donutUserDonutSettingsDto = this.userDonutSettings;
        return hashCode17 + (donutUserDonutSettingsDto != null ? donutUserDonutSettingsDto.hashCode() : 0);
    }

    public final String toString() {
        return "DonutPaymentInfoDto(status=" + this.status + ", forbiddenReason=" + this.forbiddenReason + ", maxPrice=" + this.maxPrice + ", priceForUser=" + this.priceForUser + ", nextPaymentDate=" + this.nextPaymentDate + ", subscriptionExpireTitle=" + this.subscriptionExpireTitle + ", subscriptionExpireDescription=" + this.subscriptionExpireDescription + ", minPrice=" + this.minPrice + ", currentPeriod=" + this.currentPeriod + ", isYearSubscriptionAvailable=" + this.isYearSubscriptionAvailable + ", yearSubscriptionPrice=" + this.yearSubscriptionPrice + ", isTrialSubscriptionAvailable=" + this.isTrialSubscriptionAvailable + ", changeAmountPresetPrices=" + this.changeAmountPresetPrices + ", subscriptionMethodInfo=" + this.subscriptionMethodInfo + ", isUnsubscribeReasonsAvailable=" + this.isUnsubscribeReasonsAvailable + ", isActive=" + this.isActive + ", isActiveTrial=" + this.isActiveTrial + ", userDonutSettings=" + this.userDonutSettings + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.status.writeToParcel(parcel, i);
        DonutPaymentInfoForbiddenReasonDto donutPaymentInfoForbiddenReasonDto = this.forbiddenReason;
        if (donutPaymentInfoForbiddenReasonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            donutPaymentInfoForbiddenReasonDto.writeToParcel(parcel, i);
        }
        Integer num = this.maxPrice;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.priceForUser;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.nextPaymentDate;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.subscriptionExpireTitle);
        parcel.writeString(this.subscriptionExpireDescription);
        Integer num4 = this.minPrice;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Integer num5 = this.currentPeriod;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        Boolean bool = this.isYearSubscriptionAvailable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num6 = this.yearSubscriptionPrice;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        Boolean bool2 = this.isTrialSubscriptionAvailable;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        List<Integer> list = this.changeAmountPresetPrices;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        parcel.writeParcelable(this.subscriptionMethodInfo, i);
        Boolean bool3 = this.isUnsubscribeReasonsAvailable;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.isActive;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.isActiveTrial;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        DonutUserDonutSettingsDto donutUserDonutSettingsDto = this.userDonutSettings;
        if (donutUserDonutSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            donutUserDonutSettingsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ DonutPaymentInfoDto(StatusDto statusDto, DonutPaymentInfoForbiddenReasonDto donutPaymentInfoForbiddenReasonDto, Integer num, Integer num2, Integer num3, String str, String str2, Integer num4, Integer num5, Boolean bool, Integer num6, Boolean bool2, List list, DonutSubscriptionMethodInfoDto donutSubscriptionMethodInfoDto, Boolean bool3, Boolean bool4, Boolean bool5, DonutUserDonutSettingsDto donutUserDonutSettingsDto, int i, zcl zclVar) {
        this(statusDto, (i & 2) != 0 ? null : donutPaymentInfoForbiddenReasonDto, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : num4, (i & 256) != 0 ? null : num5, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : num6, (i & 2048) != 0 ? null : bool2, (i & 4096) != 0 ? null : list, (i & 8192) != 0 ? null : donutSubscriptionMethodInfoDto, (i & 16384) != 0 ? null : bool3, (i & 32768) != 0 ? null : bool4, (i & 65536) != 0 ? null : bool5, (i & 131072) != 0 ? null : donutUserDonutSettingsDto);
    }
}
