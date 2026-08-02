package com.vk.api.generated.orders.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: OrdersBuyItemResponseDto.kt */
/* loaded from: classes15.dex */
public final class OrdersBuyItemResponseDto implements Parcelable {
    public static final Parcelable.Creator<OrdersBuyItemResponseDto> CREATOR = new a();

    @pmi0("order_id")
    private final int orderId;

    @pmi0("price")
    private final int price;

    @pmi0("status")
    private final StatusDto status;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OrdersBuyItemResponseDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0("charged")
        public static final StatusDto CHARGED;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("wait")
        public static final StatusDto WAIT;
        private final String value;

        /* compiled from: OrdersBuyItemResponseDto.kt */
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
            StatusDto statusDto = new StatusDto("CHARGED", 0, "charged");
            CHARGED = statusDto;
            StatusDto statusDto2 = new StatusDto("WAIT", 1, "wait");
            WAIT = statusDto2;
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

    /* compiled from: OrdersBuyItemResponseDto.kt */
    public static final class a implements Parcelable.Creator<OrdersBuyItemResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final OrdersBuyItemResponseDto createFromParcel(Parcel parcel) {
            return new OrdersBuyItemResponseDto(parcel.readInt(), parcel.readString(), parcel.readInt(), StatusDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final OrdersBuyItemResponseDto[] newArray(int i) {
            return new OrdersBuyItemResponseDto[i];
        }
    }

    public OrdersBuyItemResponseDto(int i, String str, int i2, StatusDto statusDto) {
        this.orderId = i;
        this.title = str;
        this.price = i2;
        this.status = statusDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersBuyItemResponseDto)) {
            return false;
        }
        OrdersBuyItemResponseDto ordersBuyItemResponseDto = (OrdersBuyItemResponseDto) obj;
        return this.orderId == ordersBuyItemResponseDto.orderId && epx.f(this.title, ordersBuyItemResponseDto.title) && this.price == ordersBuyItemResponseDto.price && this.status == ordersBuyItemResponseDto.status;
    }

    public final int hashCode() {
        return this.status.hashCode() + shy.a(this.price, urd0.a(Integer.hashCode(this.orderId) * 31, 31, this.title), 31);
    }

    public final String toString() {
        return "OrdersBuyItemResponseDto(orderId=" + this.orderId + ", title=" + this.title + ", price=" + this.price + ", status=" + this.status + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.orderId);
        parcel.writeString(this.title);
        parcel.writeInt(this.price);
        this.status.writeToParcel(parcel, i);
    }
}
