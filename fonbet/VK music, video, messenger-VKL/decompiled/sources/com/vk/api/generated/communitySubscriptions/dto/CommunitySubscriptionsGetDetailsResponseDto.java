package com.vk.api.generated.communitySubscriptions.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommunitySubscriptionsGetDetailsResponseDto.kt */
/* loaded from: classes14.dex */
public final class CommunitySubscriptionsGetDetailsResponseDto implements Parcelable {
    public static final Parcelable.Creator<CommunitySubscriptionsGetDetailsResponseDto> CREATOR = new a();

    @pmi0("additional_info")
    private final CommunitySubscriptionsAdditionalInfoDto additionalInfo;

    @pmi0("next_action")
    private final NextActionDto nextAction;

    @pmi0("next_paid_at")
    private final int nextPaidAt;

    @pmi0("payer_id")
    private final int payerId;

    @pmi0("payment_method")
    private final CommunitySubscriptionsPaymentCardDto paymentMethod;

    @pmi0("price")
    private final CommunitySubscriptionsPriceDto price;

    @pmi0("status")
    private final StatusDto status;

    @pmi0("subscription_title")
    private final String subscriptionTitle;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommunitySubscriptionsGetDetailsResponseDto.kt */
    public static final class NextActionDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NextActionDto[] $VALUES;
        public static final Parcelable.Creator<NextActionDto> CREATOR;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_RESUME)
        public static final NextActionDto RESUME;

        @pmi0("suspend")
        public static final NextActionDto SUSPEND;
        private final String value;

        /* compiled from: CommunitySubscriptionsGetDetailsResponseDto.kt */
        public static final class a implements Parcelable.Creator<NextActionDto> {
            @Override // android.os.Parcelable.Creator
            public final NextActionDto createFromParcel(Parcel parcel) {
                return NextActionDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NextActionDto[] newArray(int i) {
                return new NextActionDto[i];
            }
        }

        static {
            NextActionDto nextActionDto = new NextActionDto("SUSPEND", 0, "suspend");
            SUSPEND = nextActionDto;
            NextActionDto nextActionDto2 = new NextActionDto("RESUME", 1, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
            RESUME = nextActionDto2;
            NextActionDto[] nextActionDtoArr = {nextActionDto, nextActionDto2};
            $VALUES = nextActionDtoArr;
            $ENTRIES = new asp(nextActionDtoArr);
            CREATOR = new a();
        }

        private NextActionDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static NextActionDto valueOf(String str) {
            return (NextActionDto) Enum.valueOf(NextActionDto.class, str);
        }

        public static NextActionDto[] values() {
            return (NextActionDto[]) $VALUES.clone();
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
    /* compiled from: CommunitySubscriptionsGetDetailsResponseDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0(SignalingProtocol.KEY_ACTIVE)
        public static final StatusDto ACTIVE;

        @pmi0("canceled")
        public static final StatusDto CANCELED;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("suspended")
        public static final StatusDto SUSPENDED;
        private final String value;

        /* compiled from: CommunitySubscriptionsGetDetailsResponseDto.kt */
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
            StatusDto statusDto2 = new StatusDto("SUSPENDED", 1, "suspended");
            SUSPENDED = statusDto2;
            StatusDto statusDto3 = new StatusDto(SignalingProtocol.HUNGUP_REASON_CANCELED, 2, "canceled");
            CANCELED = statusDto3;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3};
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

    /* compiled from: CommunitySubscriptionsGetDetailsResponseDto.kt */
    public static final class a implements Parcelable.Creator<CommunitySubscriptionsGetDetailsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsGetDetailsResponseDto createFromParcel(Parcel parcel) {
            return new CommunitySubscriptionsGetDetailsResponseDto(parcel.readInt(), StatusDto.CREATOR.createFromParcel(parcel), CommunitySubscriptionsPriceDto.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : CommunitySubscriptionsPaymentCardDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : NextActionDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CommunitySubscriptionsAdditionalInfoDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CommunitySubscriptionsGetDetailsResponseDto[] newArray(int i) {
            return new CommunitySubscriptionsGetDetailsResponseDto[i];
        }
    }

    public CommunitySubscriptionsGetDetailsResponseDto(int i, StatusDto statusDto, CommunitySubscriptionsPriceDto communitySubscriptionsPriceDto, int i2, String str, CommunitySubscriptionsPaymentCardDto communitySubscriptionsPaymentCardDto, NextActionDto nextActionDto, CommunitySubscriptionsAdditionalInfoDto communitySubscriptionsAdditionalInfoDto) {
        this.payerId = i;
        this.status = statusDto;
        this.price = communitySubscriptionsPriceDto;
        this.nextPaidAt = i2;
        this.subscriptionTitle = str;
        this.paymentMethod = communitySubscriptionsPaymentCardDto;
        this.nextAction = nextActionDto;
        this.additionalInfo = communitySubscriptionsAdditionalInfoDto;
    }

    public final CommunitySubscriptionsAdditionalInfoDto d() {
        return this.additionalInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final NextActionDto e() {
        return this.nextAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunitySubscriptionsGetDetailsResponseDto)) {
            return false;
        }
        CommunitySubscriptionsGetDetailsResponseDto communitySubscriptionsGetDetailsResponseDto = (CommunitySubscriptionsGetDetailsResponseDto) obj;
        return this.payerId == communitySubscriptionsGetDetailsResponseDto.payerId && this.status == communitySubscriptionsGetDetailsResponseDto.status && epx.f(this.price, communitySubscriptionsGetDetailsResponseDto.price) && this.nextPaidAt == communitySubscriptionsGetDetailsResponseDto.nextPaidAt && epx.f(this.subscriptionTitle, communitySubscriptionsGetDetailsResponseDto.subscriptionTitle) && epx.f(this.paymentMethod, communitySubscriptionsGetDetailsResponseDto.paymentMethod) && this.nextAction == communitySubscriptionsGetDetailsResponseDto.nextAction && epx.f(this.additionalInfo, communitySubscriptionsGetDetailsResponseDto.additionalInfo);
    }

    public final int f() {
        return this.nextPaidAt;
    }

    public final int g() {
        return this.payerId;
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.nextPaidAt, (this.price.hashCode() + ((this.status.hashCode() + (Integer.hashCode(this.payerId) * 31)) * 31)) * 31, 31), 31, this.subscriptionTitle);
        CommunitySubscriptionsPaymentCardDto communitySubscriptionsPaymentCardDto = this.paymentMethod;
        int hashCode = (a2 + (communitySubscriptionsPaymentCardDto == null ? 0 : communitySubscriptionsPaymentCardDto.hashCode())) * 31;
        NextActionDto nextActionDto = this.nextAction;
        int hashCode2 = (hashCode + (nextActionDto == null ? 0 : nextActionDto.hashCode())) * 31;
        CommunitySubscriptionsAdditionalInfoDto communitySubscriptionsAdditionalInfoDto = this.additionalInfo;
        return hashCode2 + (communitySubscriptionsAdditionalInfoDto != null ? communitySubscriptionsAdditionalInfoDto.hashCode() : 0);
    }

    public final CommunitySubscriptionsPaymentCardDto i() {
        return this.paymentMethod;
    }

    public final CommunitySubscriptionsPriceDto j() {
        return this.price;
    }

    public final StatusDto k() {
        return this.status;
    }

    public final String l() {
        return this.subscriptionTitle;
    }

    public final String toString() {
        return "CommunitySubscriptionsGetDetailsResponseDto(payerId=" + this.payerId + ", status=" + this.status + ", price=" + this.price + ", nextPaidAt=" + this.nextPaidAt + ", subscriptionTitle=" + this.subscriptionTitle + ", paymentMethod=" + this.paymentMethod + ", nextAction=" + this.nextAction + ", additionalInfo=" + this.additionalInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.payerId);
        this.status.writeToParcel(parcel, i);
        this.price.writeToParcel(parcel, i);
        parcel.writeInt(this.nextPaidAt);
        parcel.writeString(this.subscriptionTitle);
        CommunitySubscriptionsPaymentCardDto communitySubscriptionsPaymentCardDto = this.paymentMethod;
        if (communitySubscriptionsPaymentCardDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            communitySubscriptionsPaymentCardDto.writeToParcel(parcel, i);
        }
        NextActionDto nextActionDto = this.nextAction;
        if (nextActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nextActionDto.writeToParcel(parcel, i);
        }
        CommunitySubscriptionsAdditionalInfoDto communitySubscriptionsAdditionalInfoDto = this.additionalInfo;
        if (communitySubscriptionsAdditionalInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            communitySubscriptionsAdditionalInfoDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ CommunitySubscriptionsGetDetailsResponseDto(int i, StatusDto statusDto, CommunitySubscriptionsPriceDto communitySubscriptionsPriceDto, int i2, String str, CommunitySubscriptionsPaymentCardDto communitySubscriptionsPaymentCardDto, NextActionDto nextActionDto, CommunitySubscriptionsAdditionalInfoDto communitySubscriptionsAdditionalInfoDto, int i3, zcl zclVar) {
        this(i, statusDto, communitySubscriptionsPriceDto, i2, str, (i3 & 32) != 0 ? null : communitySubscriptionsPaymentCardDto, (i3 & 64) != 0 ? null : nextActionDto, (i3 & 128) != 0 ? null : communitySubscriptionsAdditionalInfoDto);
    }
}
