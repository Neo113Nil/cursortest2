package com.vk.ecomm.cart.impl.checkout.feature.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: CheckoutSettingsDeliveryPointIdDto.kt */
/* loaded from: classes18.dex */
public final class CheckoutSettingsDeliveryPointIdDto implements Parcelable {
    public static final Parcelable.Creator<CheckoutSettingsDeliveryPointIdDto> CREATOR = new a();

    @pmi0("external_id")
    private final String externalId;

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("service_delivery_point_id")
    private final int serviceDeliveryPointId;

    /* compiled from: CheckoutSettingsDeliveryPointIdDto.kt */
    public static final class a implements Parcelable.Creator<CheckoutSettingsDeliveryPointIdDto> {
        @Override // android.os.Parcelable.Creator
        public final CheckoutSettingsDeliveryPointIdDto createFromParcel(Parcel parcel) {
            return new CheckoutSettingsDeliveryPointIdDto(parcel.readInt(), (UserId) parcel.readParcelable(CheckoutSettingsDeliveryPointIdDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CheckoutSettingsDeliveryPointIdDto[] newArray(int i) {
            return new CheckoutSettingsDeliveryPointIdDto[i];
        }
    }

    public CheckoutSettingsDeliveryPointIdDto(int i, UserId userId, String str) {
        this.serviceDeliveryPointId = i;
        this.groupId = userId;
        this.externalId = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutSettingsDeliveryPointIdDto)) {
            return false;
        }
        CheckoutSettingsDeliveryPointIdDto checkoutSettingsDeliveryPointIdDto = (CheckoutSettingsDeliveryPointIdDto) obj;
        return this.serviceDeliveryPointId == checkoutSettingsDeliveryPointIdDto.serviceDeliveryPointId && epx.f(this.groupId, checkoutSettingsDeliveryPointIdDto.groupId) && epx.f(this.externalId, checkoutSettingsDeliveryPointIdDto.externalId);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.serviceDeliveryPointId) * 31;
        UserId userId = this.groupId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str = this.externalId;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckoutSettingsDeliveryPointIdDto(serviceDeliveryPointId=");
        sb.append(this.serviceDeliveryPointId);
        sb.append(", groupId=");
        sb.append(this.groupId);
        sb.append(", externalId=");
        return ho8.a(sb, this.externalId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.serviceDeliveryPointId);
        parcel.writeParcelable(this.groupId, i);
        parcel.writeString(this.externalId);
    }
}
