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

/* compiled from: OrdersAppSubscriptionItemDto.kt */
/* loaded from: classes15.dex */
public final class OrdersAppSubscriptionItemDto implements Parcelable {
    public static final Parcelable.Creator<OrdersAppSubscriptionItemDto> CREATOR = new a();

    @pmi0("balance")
    private final Integer balance;

    @pmi0("confirm_hash")
    private final String confirmHash;

    @pmi0("description")
    private final String description;

    @pmi0("expire_time")
    private final Integer expireTime;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("is_auto_buy_checked")
    private final Boolean isAutoBuyChecked;

    @pmi0("is_auto_buy_enabled")
    private final Boolean isAutoBuyEnabled;

    @pmi0("item_id")
    private final String itemId;

    @pmi0("name")
    private final String name;

    @pmi0("order_id")
    private final int orderId;

    @pmi0("period")
    private final Integer period;

    @pmi0("price")
    private final Integer price;

    @pmi0("status")
    private final StatusDto status;

    @pmi0("trial_duration")
    private final Integer trialDuration;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OrdersAppSubscriptionItemDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0(X3.i.r)
        public static final StatusDto LOADED;

        @pmi0("waiting")
        public static final StatusDto WAITING;
        private final String value;

        /* compiled from: OrdersAppSubscriptionItemDto.kt */
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

    /* compiled from: OrdersAppSubscriptionItemDto.kt */
    public static final class a implements Parcelable.Creator<OrdersAppSubscriptionItemDto> {
        @Override // android.os.Parcelable.Creator
        public final OrdersAppSubscriptionItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            StatusDto createFromParcel = StatusDto.CREATOR.createFromParcel(parcel);
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = bo.b(OrdersAppSubscriptionItemDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z = false;
            Integer num = valueOf4;
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            return new OrdersAppSubscriptionItemDto(readInt, readString, createFromParcel, arrayList, readString2, readString3, valueOf2, valueOf3, num, valueOf5, valueOf6, readString4, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final OrdersAppSubscriptionItemDto[] newArray(int i) {
            return new OrdersAppSubscriptionItemDto[i];
        }
    }

    public OrdersAppSubscriptionItemDto(int i, String str, StatusDto statusDto, List<BaseImageDto> list, String str2, String str3, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str4, Boolean bool, Boolean bool2) {
        this.orderId = i;
        this.itemId = str;
        this.status = statusDto;
        this.images = list;
        this.name = str2;
        this.description = str3;
        this.balance = num;
        this.price = num2;
        this.period = num3;
        this.trialDuration = num4;
        this.expireTime = num5;
        this.confirmHash = str4;
        this.isAutoBuyEnabled = bool;
        this.isAutoBuyChecked = bool2;
    }

    public final Boolean B() {
        return this.isAutoBuyEnabled;
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
        if (!(obj instanceof OrdersAppSubscriptionItemDto)) {
            return false;
        }
        OrdersAppSubscriptionItemDto ordersAppSubscriptionItemDto = (OrdersAppSubscriptionItemDto) obj;
        return this.orderId == ordersAppSubscriptionItemDto.orderId && epx.f(this.itemId, ordersAppSubscriptionItemDto.itemId) && this.status == ordersAppSubscriptionItemDto.status && epx.f(this.images, ordersAppSubscriptionItemDto.images) && epx.f(this.name, ordersAppSubscriptionItemDto.name) && epx.f(this.description, ordersAppSubscriptionItemDto.description) && epx.f(this.balance, ordersAppSubscriptionItemDto.balance) && epx.f(this.price, ordersAppSubscriptionItemDto.price) && epx.f(this.period, ordersAppSubscriptionItemDto.period) && epx.f(this.trialDuration, ordersAppSubscriptionItemDto.trialDuration) && epx.f(this.expireTime, ordersAppSubscriptionItemDto.expireTime) && epx.f(this.confirmHash, ordersAppSubscriptionItemDto.confirmHash) && epx.f(this.isAutoBuyEnabled, ordersAppSubscriptionItemDto.isAutoBuyEnabled) && epx.f(this.isAutoBuyChecked, ordersAppSubscriptionItemDto.isAutoBuyChecked);
    }

    public final Integer f() {
        return this.expireTime;
    }

    public final List<BaseImageDto> g() {
        return this.images;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int hashCode() {
        int hashCode = (this.status.hashCode() + urd0.a(Integer.hashCode(this.orderId) * 31, 31, this.itemId)) * 31;
        List<BaseImageDto> list = this.images;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.name;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.balance;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.price;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.period;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.trialDuration;
        int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.expireTime;
        int hashCode9 = (hashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str3 = this.confirmHash;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isAutoBuyEnabled;
        int hashCode11 = (hashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isAutoBuyChecked;
        return hashCode11 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String i() {
        return this.itemId;
    }

    public final String j() {
        return this.name;
    }

    public final int k() {
        return this.orderId;
    }

    public final Integer l() {
        return this.period;
    }

    public final Integer n() {
        return this.price;
    }

    public final StatusDto o() {
        return this.status;
    }

    public final Integer p() {
        return this.trialDuration;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrdersAppSubscriptionItemDto(orderId=");
        sb.append(this.orderId);
        sb.append(", itemId=");
        sb.append(this.itemId);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", balance=");
        sb.append(this.balance);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", period=");
        sb.append(this.period);
        sb.append(", trialDuration=");
        sb.append(this.trialDuration);
        sb.append(", expireTime=");
        sb.append(this.expireTime);
        sb.append(", confirmHash=");
        sb.append(this.confirmHash);
        sb.append(", isAutoBuyEnabled=");
        sb.append(this.isAutoBuyEnabled);
        sb.append(", isAutoBuyChecked=");
        return tn.a(sb, this.isAutoBuyChecked, ')');
    }

    public final Boolean u() {
        return this.isAutoBuyChecked;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.orderId);
        parcel.writeString(this.itemId);
        this.status.writeToParcel(parcel, i);
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
        parcel.writeString(this.description);
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
        Integer num3 = this.period;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.trialDuration;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Integer num5 = this.expireTime;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
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
    }

    public /* synthetic */ OrdersAppSubscriptionItemDto(int i, String str, StatusDto statusDto, List list, String str2, String str3, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str4, Boolean bool, Boolean bool2, int i2, zcl zclVar) {
        this(i, str, statusDto, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : num2, (i2 & 256) != 0 ? null : num3, (i2 & 512) != 0 ? null : num4, (i2 & 1024) != 0 ? null : num5, (i2 & 2048) != 0 ? null : str4, (i2 & 4096) != 0 ? null : bool, (i2 & 8192) != 0 ? null : bool2);
    }
}
