package com.vk.sdk.api.donut.dto;

import com.vk.dto.common.id.UserId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.zrp;

/* compiled from: DonutDonatorSubscriptionInfoDto.kt */
/* loaded from: classes5.dex */
public final class DonutDonatorSubscriptionInfoDto {

    @pmi0("amount")
    private final int amount;

    @pmi0("next_payment_date")
    private final int nextPaymentDate;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("status")
    private final StatusDto status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DonutDonatorSubscriptionInfoDto.kt */
    public static final class StatusDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0(SignalingProtocol.KEY_ACTIVE)
        public static final StatusDto ACTIVE;

        @pmi0("expiring")
        public static final StatusDto EXPIRING;
        private final String value;

        static {
            StatusDto statusDto = new StatusDto(SignalingProtocol.STATE_ACTIVE, 0, SignalingProtocol.KEY_ACTIVE);
            ACTIVE = statusDto;
            StatusDto statusDto2 = new StatusDto("EXPIRING", 1, "expiring");
            EXPIRING = statusDto2;
            StatusDto[] statusDtoArr = {statusDto, statusDto2};
            $VALUES = statusDtoArr;
            $ENTRIES = new asp(statusDtoArr);
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
    }

    public DonutDonatorSubscriptionInfoDto(UserId userId, int i, int i2, StatusDto statusDto) {
        this.ownerId = userId;
        this.nextPaymentDate = i;
        this.amount = i2;
        this.status = statusDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutDonatorSubscriptionInfoDto)) {
            return false;
        }
        DonutDonatorSubscriptionInfoDto donutDonatorSubscriptionInfoDto = (DonutDonatorSubscriptionInfoDto) obj;
        return epx.f(this.ownerId, donutDonatorSubscriptionInfoDto.ownerId) && this.nextPaymentDate == donutDonatorSubscriptionInfoDto.nextPaymentDate && this.amount == donutDonatorSubscriptionInfoDto.amount && this.status == donutDonatorSubscriptionInfoDto.status;
    }

    public final int hashCode() {
        return this.status.hashCode() + shy.a(this.amount, shy.a(this.nextPaymentDate, Long.hashCode(this.ownerId.b) * 31, 31), 31);
    }

    public final String toString() {
        return "DonutDonatorSubscriptionInfoDto(ownerId=" + this.ownerId + ", nextPaymentDate=" + this.nextPaymentDate + ", amount=" + this.amount + ", status=" + this.status + ")";
    }
}
