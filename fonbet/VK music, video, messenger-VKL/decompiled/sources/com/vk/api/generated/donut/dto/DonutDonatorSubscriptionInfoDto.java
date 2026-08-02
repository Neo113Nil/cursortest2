package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: DonutDonatorSubscriptionInfoDto.kt */
/* loaded from: classes14.dex */
public final class DonutDonatorSubscriptionInfoDto implements Parcelable {
    public static final Parcelable.Creator<DonutDonatorSubscriptionInfoDto> CREATOR = new a();

    @pmi0("amount")
    private final int amount;

    @pmi0("next_payment_date")
    private final int nextPaymentDate;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("payment_link")
    private final String paymentLink;

    @pmi0("period")
    private final DonutAllowedSubscriptionPeriodEnumDto period;

    @pmi0("status")
    private final StatusDto status;

    @pmi0("text")
    private final String text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DonutDonatorSubscriptionInfoDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0(SignalingProtocol.KEY_ACTIVE)
        public static final StatusDto ACTIVE;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("expiring")
        public static final StatusDto EXPIRING;
        private final String value;

        /* compiled from: DonutDonatorSubscriptionInfoDto.kt */
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
            StatusDto statusDto2 = new StatusDto("EXPIRING", 1, "expiring");
            EXPIRING = statusDto2;
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

    /* compiled from: DonutDonatorSubscriptionInfoDto.kt */
    public static final class a implements Parcelable.Creator<DonutDonatorSubscriptionInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutDonatorSubscriptionInfoDto createFromParcel(Parcel parcel) {
            return new DonutDonatorSubscriptionInfoDto((UserId) parcel.readParcelable(DonutDonatorSubscriptionInfoDto.class.getClassLoader()), parcel.readInt(), parcel.readInt(), StatusDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DonutAllowedSubscriptionPeriodEnumDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DonutDonatorSubscriptionInfoDto[] newArray(int i) {
            return new DonutDonatorSubscriptionInfoDto[i];
        }
    }

    public DonutDonatorSubscriptionInfoDto(UserId userId, int i, int i2, StatusDto statusDto, String str, String str2, DonutAllowedSubscriptionPeriodEnumDto donutAllowedSubscriptionPeriodEnumDto) {
        this.ownerId = userId;
        this.nextPaymentDate = i;
        this.amount = i2;
        this.status = statusDto;
        this.paymentLink = str;
        this.text = str2;
        this.period = donutAllowedSubscriptionPeriodEnumDto;
    }

    public final int d() {
        return this.nextPaymentDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.paymentLink;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutDonatorSubscriptionInfoDto)) {
            return false;
        }
        DonutDonatorSubscriptionInfoDto donutDonatorSubscriptionInfoDto = (DonutDonatorSubscriptionInfoDto) obj;
        return epx.f(this.ownerId, donutDonatorSubscriptionInfoDto.ownerId) && this.nextPaymentDate == donutDonatorSubscriptionInfoDto.nextPaymentDate && this.amount == donutDonatorSubscriptionInfoDto.amount && this.status == donutDonatorSubscriptionInfoDto.status && epx.f(this.paymentLink, donutDonatorSubscriptionInfoDto.paymentLink) && epx.f(this.text, donutDonatorSubscriptionInfoDto.text) && this.period == donutDonatorSubscriptionInfoDto.period;
    }

    public final StatusDto f() {
        return this.status;
    }

    public final String g() {
        return this.text;
    }

    public final int hashCode() {
        int hashCode = (this.status.hashCode() + shy.a(this.amount, shy.a(this.nextPaymentDate, Long.hashCode(this.ownerId.b) * 31, 31), 31)) * 31;
        String str = this.paymentLink;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DonutAllowedSubscriptionPeriodEnumDto donutAllowedSubscriptionPeriodEnumDto = this.period;
        return hashCode3 + (donutAllowedSubscriptionPeriodEnumDto != null ? donutAllowedSubscriptionPeriodEnumDto.hashCode() : 0);
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        return "DonutDonatorSubscriptionInfoDto(ownerId=" + this.ownerId + ", nextPaymentDate=" + this.nextPaymentDate + ", amount=" + this.amount + ", status=" + this.status + ", paymentLink=" + this.paymentLink + ", text=" + this.text + ", period=" + this.period + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.nextPaymentDate);
        parcel.writeInt(this.amount);
        this.status.writeToParcel(parcel, i);
        parcel.writeString(this.paymentLink);
        parcel.writeString(this.text);
        DonutAllowedSubscriptionPeriodEnumDto donutAllowedSubscriptionPeriodEnumDto = this.period;
        if (donutAllowedSubscriptionPeriodEnumDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            donutAllowedSubscriptionPeriodEnumDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ DonutDonatorSubscriptionInfoDto(UserId userId, int i, int i2, StatusDto statusDto, String str, String str2, DonutAllowedSubscriptionPeriodEnumDto donutAllowedSubscriptionPeriodEnumDto, int i3, zcl zclVar) {
        this(userId, i, i2, statusDto, (i3 & 16) != 0 ? null : str, (i3 & 32) != 0 ? null : str2, (i3 & 64) != 0 ? null : donutAllowedSubscriptionPeriodEnumDto);
    }
}
