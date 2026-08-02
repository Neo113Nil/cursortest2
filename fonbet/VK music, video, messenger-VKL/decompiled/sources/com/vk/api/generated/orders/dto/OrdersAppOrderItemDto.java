package com.vk.api.generated.orders.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: OrdersAppOrderItemDto.kt */
/* loaded from: classes15.dex */
public final class OrdersAppOrderItemDto implements Parcelable {
    public static final Parcelable.Creator<OrdersAppOrderItemDto> CREATOR = new a();

    @pmi0("balance")
    private final Integer balance;

    @pmi0("confirm_hash")
    private final String confirmHash;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("is_auto_buy_checkbox_visible")
    private final Boolean isAutoBuyCheckboxVisible;

    @pmi0("is_auto_buy_checked")
    private final Boolean isAutoBuyChecked;

    @pmi0("is_auto_buy_enabled")
    private final Boolean isAutoBuyEnabled;

    @pmi0("item_id")
    private final String itemId;

    @pmi0("name")
    private final String name;

    @pmi0("order_description")
    private final String orderDescription;

    @pmi0("order_id")
    private final int orderId;

    @pmi0("price")
    private final Integer price;

    @pmi0("status")
    private final StatusDto status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OrdersAppOrderItemDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0(X3.i.r)
        public static final StatusDto LOADED;

        @pmi0("waiting")
        public static final StatusDto WAITING;
        private final String value;

        /* compiled from: OrdersAppOrderItemDto.kt */
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
            StatusDto statusDto = new StatusDto("WAITING", 0, "waiting");
            WAITING = statusDto;
            StatusDto statusDto2 = new StatusDto("LOADED", 1, X3.i.r);
            LOADED = statusDto2;
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

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: OrdersAppOrderItemDto.kt */
    public static final class a implements Parcelable.Creator<OrdersAppOrderItemDto> {
        @Override // android.os.Parcelable.Creator
        public final OrdersAppOrderItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            Boolean valueOf2;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            StatusDto createFromParcel = StatusDto.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = bo.b(OrdersAppOrderItemDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            String readString3 = parcel.readString();
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new OrdersAppOrderItemDto(readInt, readString, createFromParcel, readString2, arrayList, readString3, valueOf3, valueOf4, readString4, valueOf, valueOf2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final OrdersAppOrderItemDto[] newArray(int i) {
            return new OrdersAppOrderItemDto[i];
        }
    }

    public OrdersAppOrderItemDto(int i, String str, StatusDto statusDto, String str2, List<BaseImageDto> list, String str3, Integer num, Integer num2, String str4, Boolean bool, Boolean bool2, Boolean bool3) {
        this.orderId = i;
        this.itemId = str;
        this.status = statusDto;
        this.orderDescription = str2;
        this.images = list;
        this.name = str3;
        this.balance = num;
        this.price = num2;
        this.confirmHash = str4;
        this.isAutoBuyEnabled = bool;
        this.isAutoBuyChecked = bool2;
        this.isAutoBuyCheckboxVisible = bool3;
    }

    public final Integer d() {
        return this.balance;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.confirmHash;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersAppOrderItemDto)) {
            return false;
        }
        OrdersAppOrderItemDto ordersAppOrderItemDto = (OrdersAppOrderItemDto) obj;
        return this.orderId == ordersAppOrderItemDto.orderId && epx.f(this.itemId, ordersAppOrderItemDto.itemId) && this.status == ordersAppOrderItemDto.status && epx.f(this.orderDescription, ordersAppOrderItemDto.orderDescription) && epx.f(this.images, ordersAppOrderItemDto.images) && epx.f(this.name, ordersAppOrderItemDto.name) && epx.f(this.balance, ordersAppOrderItemDto.balance) && epx.f(this.price, ordersAppOrderItemDto.price) && epx.f(this.confirmHash, ordersAppOrderItemDto.confirmHash) && epx.f(this.isAutoBuyEnabled, ordersAppOrderItemDto.isAutoBuyEnabled) && epx.f(this.isAutoBuyChecked, ordersAppOrderItemDto.isAutoBuyChecked) && epx.f(this.isAutoBuyCheckboxVisible, ordersAppOrderItemDto.isAutoBuyCheckboxVisible);
    }

    public final List<BaseImageDto> f() {
        return this.images;
    }

    public final String g() {
        return this.name;
    }

    public final int hashCode() {
        int hashCode = (this.status.hashCode() + urd0.a(Integer.hashCode(this.orderId) * 31, 31, this.itemId)) * 31;
        String str = this.orderDescription;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<BaseImageDto> list = this.images;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.name;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.balance;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.price;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.confirmHash;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isAutoBuyEnabled;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isAutoBuyChecked;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isAutoBuyCheckboxVisible;
        return hashCode9 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String i() {
        return this.orderDescription;
    }

    public final int j() {
        return this.orderId;
    }

    public final Integer k() {
        return this.price;
    }

    public final StatusDto l() {
        return this.status;
    }

    public final Boolean n() {
        return this.isAutoBuyCheckboxVisible;
    }

    public final Boolean o() {
        return this.isAutoBuyChecked;
    }

    public final Boolean p() {
        return this.isAutoBuyEnabled;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrdersAppOrderItemDto(orderId=");
        sb.append(this.orderId);
        sb.append(", itemId=");
        sb.append(this.itemId);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", orderDescription=");
        sb.append(this.orderDescription);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", balance=");
        sb.append(this.balance);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", confirmHash=");
        sb.append(this.confirmHash);
        sb.append(", isAutoBuyEnabled=");
        sb.append(this.isAutoBuyEnabled);
        sb.append(", isAutoBuyChecked=");
        sb.append(this.isAutoBuyChecked);
        sb.append(", isAutoBuyCheckboxVisible=");
        return tn.a(sb, this.isAutoBuyCheckboxVisible, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.orderId);
        parcel.writeString(this.itemId);
        this.status.writeToParcel(parcel, i);
        parcel.writeString(this.orderDescription);
        List<BaseImageDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.name);
        Integer num = this.balance;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.price;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.confirmHash);
        Boolean bool = this.isAutoBuyEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isAutoBuyChecked;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isAutoBuyCheckboxVisible;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
    }

    public /* synthetic */ OrdersAppOrderItemDto(int i, String str, StatusDto statusDto, String str2, List list, String str3, Integer num, Integer num2, String str4, Boolean bool, Boolean bool2, Boolean bool3, int i2, zcl zclVar) {
        this(i, str, statusDto, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : num2, (i2 & 256) != 0 ? null : str4, (i2 & 512) != 0 ? null : bool, (i2 & 1024) != 0 ? null : bool2, (i2 & 2048) != 0 ? null : bool3);
    }
}
