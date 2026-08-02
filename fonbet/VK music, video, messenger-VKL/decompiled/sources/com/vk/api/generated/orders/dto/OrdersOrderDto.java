package com.vk.api.generated.orders.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.adapter.internal.CommonCode;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: OrdersOrderDto.kt */
/* loaded from: classes15.dex */
public final class OrdersOrderDto implements Parcelable {
    public static final Parcelable.Creator<OrdersOrderDto> CREATOR = new a();

    @pmi0("amount")
    private final String amount;

    @pmi0("app_order_id")
    private final String appOrderId;

    @pmi0("cancel_transaction_id")
    private final String cancelTransactionId;

    @pmi0("date")
    private final String date;

    @pmi0("id")
    private final String id;

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final String item;

    @pmi0("receiver_id")
    private final String receiverId;

    @pmi0("status")
    private final StatusDto status;

    @pmi0(CommonCode.MapKey.TRANSACTION_ID)
    private final String transactionId;

    @pmi0("user_id")
    private final String userId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OrdersOrderDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0("cancelled")
        public static final StatusDto CANCELLED;

        @pmi0("chargeable")
        public static final StatusDto CHARGEABLE;

        @pmi0("charged")
        public static final StatusDto CHARGED;

        @pmi0("created")
        public static final StatusDto CREATED;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("declined")
        public static final StatusDto DECLINED;

        @pmi0("refunded")
        public static final StatusDto REFUNDED;
        private final String value;

        /* compiled from: OrdersOrderDto.kt */
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
            StatusDto statusDto = new StatusDto("CREATED", 0, "created");
            CREATED = statusDto;
            StatusDto statusDto2 = new StatusDto("CHARGED", 1, "charged");
            CHARGED = statusDto2;
            StatusDto statusDto3 = new StatusDto("REFUNDED", 2, "refunded");
            REFUNDED = statusDto3;
            StatusDto statusDto4 = new StatusDto("CHARGEABLE", 3, "chargeable");
            CHARGEABLE = statusDto4;
            StatusDto statusDto5 = new StatusDto("CANCELLED", 4, "cancelled");
            CANCELLED = statusDto5;
            StatusDto statusDto6 = new StatusDto("DECLINED", 5, "declined");
            DECLINED = statusDto6;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3, statusDto4, statusDto5, statusDto6};
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

    /* compiled from: OrdersOrderDto.kt */
    public static final class a implements Parcelable.Creator<OrdersOrderDto> {
        @Override // android.os.Parcelable.Creator
        public final OrdersOrderDto createFromParcel(Parcel parcel) {
            return new OrdersOrderDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), StatusDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OrdersOrderDto[] newArray(int i) {
            return new OrdersOrderDto[i];
        }
    }

    public OrdersOrderDto(String str, String str2, String str3, String str4, String str5, String str6, StatusDto statusDto, String str7, String str8, String str9) {
        this.amount = str;
        this.appOrderId = str2;
        this.date = str3;
        this.id = str4;
        this.item = str5;
        this.receiverId = str6;
        this.status = statusDto;
        this.userId = str7;
        this.cancelTransactionId = str8;
        this.transactionId = str9;
    }

    public final StatusDto d() {
        return this.status;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersOrderDto)) {
            return false;
        }
        OrdersOrderDto ordersOrderDto = (OrdersOrderDto) obj;
        return epx.f(this.amount, ordersOrderDto.amount) && epx.f(this.appOrderId, ordersOrderDto.appOrderId) && epx.f(this.date, ordersOrderDto.date) && epx.f(this.id, ordersOrderDto.id) && epx.f(this.item, ordersOrderDto.item) && epx.f(this.receiverId, ordersOrderDto.receiverId) && this.status == ordersOrderDto.status && epx.f(this.userId, ordersOrderDto.userId) && epx.f(this.cancelTransactionId, ordersOrderDto.cancelTransactionId) && epx.f(this.transactionId, ordersOrderDto.transactionId);
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = urd0.a((this.status.hashCode() + urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(this.amount.hashCode() * 31, 31, this.appOrderId), 31, this.date), 31, this.id), 31, this.item), 31, this.receiverId)) * 31, 31, this.userId);
        String str = this.cancelTransactionId;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.transactionId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrdersOrderDto(amount=");
        sb.append(this.amount);
        sb.append(", appOrderId=");
        sb.append(this.appOrderId);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", item=");
        sb.append(this.item);
        sb.append(", receiverId=");
        sb.append(this.receiverId);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", cancelTransactionId=");
        sb.append(this.cancelTransactionId);
        sb.append(", transactionId=");
        return ho8.a(sb, this.transactionId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.amount);
        parcel.writeString(this.appOrderId);
        parcel.writeString(this.date);
        parcel.writeString(this.id);
        parcel.writeString(this.item);
        parcel.writeString(this.receiverId);
        this.status.writeToParcel(parcel, i);
        parcel.writeString(this.userId);
        parcel.writeString(this.cancelTransactionId);
        parcel.writeString(this.transactionId);
    }

    public /* synthetic */ OrdersOrderDto(String str, String str2, String str3, String str4, String str5, String str6, StatusDto statusDto, String str7, String str8, String str9, int i, zcl zclVar) {
        this(str, str2, str3, str4, str5, str6, statusDto, str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9);
    }
}
