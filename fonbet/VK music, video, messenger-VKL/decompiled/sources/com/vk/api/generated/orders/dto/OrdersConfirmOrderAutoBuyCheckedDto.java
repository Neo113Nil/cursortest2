package com.vk.api.generated.orders.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4217a2;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrdersConfirmOrderAutoBuyCheckedDto.kt */
/* loaded from: classes15.dex */
public final class OrdersConfirmOrderAutoBuyCheckedDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OrdersConfirmOrderAutoBuyCheckedDto[] $VALUES;

    @pmi0("checked")
    public static final OrdersConfirmOrderAutoBuyCheckedDto CHECKED;
    public static final Parcelable.Creator<OrdersConfirmOrderAutoBuyCheckedDto> CREATOR;

    @pmi0(C4217a2.e)
    public static final OrdersConfirmOrderAutoBuyCheckedDto DISABLED;

    @pmi0("null")
    public static final OrdersConfirmOrderAutoBuyCheckedDto NULL;

    @pmi0("unchecked")
    public static final OrdersConfirmOrderAutoBuyCheckedDto UNCHECKED;
    private final String value;

    /* compiled from: OrdersConfirmOrderAutoBuyCheckedDto.kt */
    public static final class a implements Parcelable.Creator<OrdersConfirmOrderAutoBuyCheckedDto> {
        @Override // android.os.Parcelable.Creator
        public final OrdersConfirmOrderAutoBuyCheckedDto createFromParcel(Parcel parcel) {
            return OrdersConfirmOrderAutoBuyCheckedDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OrdersConfirmOrderAutoBuyCheckedDto[] newArray(int i) {
            return new OrdersConfirmOrderAutoBuyCheckedDto[i];
        }
    }

    static {
        OrdersConfirmOrderAutoBuyCheckedDto ordersConfirmOrderAutoBuyCheckedDto = new OrdersConfirmOrderAutoBuyCheckedDto("CHECKED", 0, "checked");
        CHECKED = ordersConfirmOrderAutoBuyCheckedDto;
        OrdersConfirmOrderAutoBuyCheckedDto ordersConfirmOrderAutoBuyCheckedDto2 = new OrdersConfirmOrderAutoBuyCheckedDto("DISABLED", 1, C4217a2.e);
        DISABLED = ordersConfirmOrderAutoBuyCheckedDto2;
        OrdersConfirmOrderAutoBuyCheckedDto ordersConfirmOrderAutoBuyCheckedDto3 = new OrdersConfirmOrderAutoBuyCheckedDto("NULL", 2, "null");
        NULL = ordersConfirmOrderAutoBuyCheckedDto3;
        OrdersConfirmOrderAutoBuyCheckedDto ordersConfirmOrderAutoBuyCheckedDto4 = new OrdersConfirmOrderAutoBuyCheckedDto("UNCHECKED", 3, "unchecked");
        UNCHECKED = ordersConfirmOrderAutoBuyCheckedDto4;
        OrdersConfirmOrderAutoBuyCheckedDto[] ordersConfirmOrderAutoBuyCheckedDtoArr = {ordersConfirmOrderAutoBuyCheckedDto, ordersConfirmOrderAutoBuyCheckedDto2, ordersConfirmOrderAutoBuyCheckedDto3, ordersConfirmOrderAutoBuyCheckedDto4};
        $VALUES = ordersConfirmOrderAutoBuyCheckedDtoArr;
        $ENTRIES = new asp(ordersConfirmOrderAutoBuyCheckedDtoArr);
        CREATOR = new a();
    }

    private OrdersConfirmOrderAutoBuyCheckedDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static OrdersConfirmOrderAutoBuyCheckedDto valueOf(String str) {
        return (OrdersConfirmOrderAutoBuyCheckedDto) Enum.valueOf(OrdersConfirmOrderAutoBuyCheckedDto.class, str);
    }

    public static OrdersConfirmOrderAutoBuyCheckedDto[] values() {
        return (OrdersConfirmOrderAutoBuyCheckedDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
