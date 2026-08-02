package com.vk.api.generated.orders.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: OrdersGetAutoBuyStatusResponseDto.kt */
/* loaded from: classes15.dex */
public final class OrdersGetAutoBuyStatusResponseDto implements Parcelable {
    public static final Parcelable.Creator<OrdersGetAutoBuyStatusResponseDto> CREATOR = new a();

    @pmi0("is_auto_buy_enabled")
    private final boolean isAutoBuyEnabled;

    @pmi0("is_mini_apps_auto_buy_enabled")
    private final boolean isMiniAppsAutoBuyEnabled;

    /* compiled from: OrdersGetAutoBuyStatusResponseDto.kt */
    public static final class a implements Parcelable.Creator<OrdersGetAutoBuyStatusResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final OrdersGetAutoBuyStatusResponseDto createFromParcel(Parcel parcel) {
            return new OrdersGetAutoBuyStatusResponseDto(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final OrdersGetAutoBuyStatusResponseDto[] newArray(int i) {
            return new OrdersGetAutoBuyStatusResponseDto[i];
        }
    }

    public OrdersGetAutoBuyStatusResponseDto(boolean z, boolean z2) {
        this.isAutoBuyEnabled = z;
        this.isMiniAppsAutoBuyEnabled = z2;
    }

    public final boolean d() {
        return this.isAutoBuyEnabled;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.isMiniAppsAutoBuyEnabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersGetAutoBuyStatusResponseDto)) {
            return false;
        }
        OrdersGetAutoBuyStatusResponseDto ordersGetAutoBuyStatusResponseDto = (OrdersGetAutoBuyStatusResponseDto) obj;
        return this.isAutoBuyEnabled == ordersGetAutoBuyStatusResponseDto.isAutoBuyEnabled && this.isMiniAppsAutoBuyEnabled == ordersGetAutoBuyStatusResponseDto.isMiniAppsAutoBuyEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isMiniAppsAutoBuyEnabled) + (Boolean.hashCode(this.isAutoBuyEnabled) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrdersGetAutoBuyStatusResponseDto(isAutoBuyEnabled=");
        sb.append(this.isAutoBuyEnabled);
        sb.append(", isMiniAppsAutoBuyEnabled=");
        return q0.a(sb, this.isMiniAppsAutoBuyEnabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isAutoBuyEnabled ? 1 : 0);
        parcel.writeInt(this.isMiniAppsAutoBuyEnabled ? 1 : 0);
    }
}
