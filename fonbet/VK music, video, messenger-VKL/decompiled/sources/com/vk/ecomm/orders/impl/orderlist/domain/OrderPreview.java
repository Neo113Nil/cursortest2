package com.vk.ecomm.orders.impl.orderlist.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.orders.impl.common.model.OrderSource;
import com.vk.ecomm.orders.impl.common.model.OrderStatus;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.bh10;
import xsna.en;
import xsna.epx;
import xsna.er;
import xsna.fw3;
import xsna.gp;
import xsna.qoy;
import xsna.shy;
import xsna.zrp;

/* compiled from: OrderPreview.kt */
/* loaded from: classes18.dex */
public final class OrderPreview implements Parcelable {
    public static final Parcelable.Creator<OrderPreview> CREATOR = new a();
    public final UserId b;
    public final int c;
    public final String d;
    public final OrderStatus e;
    public final boolean f;
    public final Long g;
    public final String h;
    public final OrderSeller i;
    public final String j;
    public final ActionType k;
    public final List<Product> l;
    public final int m;
    public final OrderSource n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OrderPreview.kt */
    public static final class ActionType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;
        public static final ActionType Payment;
        public static final ActionType Review;

        static {
            ActionType actionType = new ActionType("Payment", 0);
            Payment = actionType;
            ActionType actionType2 = new ActionType("Review", 1);
            Review = actionType2;
            ActionType[] actionTypeArr = {actionType, actionType2};
            $VALUES = actionTypeArr;
            $ENTRIES = new asp(actionTypeArr);
        }

        public ActionType() {
            throw null;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }
    }

    /* compiled from: OrderPreview.kt */
    public static final class OrderSeller implements Parcelable {
        public static final Parcelable.Creator<OrderSeller> CREATOR = new a();
        public final String b;
        public final UserId c;

        /* compiled from: OrderPreview.kt */
        public static final class a implements Parcelable.Creator<OrderSeller> {
            @Override // android.os.Parcelable.Creator
            public final OrderSeller createFromParcel(Parcel parcel) {
                return new OrderSeller(parcel.readString(), (UserId) parcel.readParcelable(OrderSeller.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final OrderSeller[] newArray(int i) {
                return new OrderSeller[i];
            }
        }

        public OrderSeller(String str, UserId userId) {
            this.b = str;
            this.c = userId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderSeller)) {
                return false;
            }
            OrderSeller orderSeller = (OrderSeller) obj;
            return epx.f(this.b, orderSeller.b) && epx.f(this.c, orderSeller.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            UserId userId = this.c;
            return hashCode + (userId == null ? 0 : Long.hashCode(userId.b));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OrderSeller(name=");
            sb.append(this.b);
            sb.append(", groupId=");
            return gp.b(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeParcelable(this.c, i);
        }
    }

    /* compiled from: OrderPreview.kt */
    public static final class Product implements Parcelable {
        public static final Parcelable.Creator<Product> CREATOR = new a();
        public final long b;
        public final UserId c;
        public final String d;
        public final Image e;

        /* compiled from: OrderPreview.kt */
        public static final class a implements Parcelable.Creator<Product> {
            @Override // android.os.Parcelable.Creator
            public final Product createFromParcel(Parcel parcel) {
                return new Product(parcel.readLong(), (UserId) parcel.readParcelable(Product.class.getClassLoader()), parcel.readString(), (Image) parcel.readParcelable(Product.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Product[] newArray(int i) {
                return new Product[i];
            }
        }

        public Product(long j, UserId userId, String str, Image image) {
            this.b = j;
            this.c = userId;
            this.d = str;
            this.e = image;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return this.b == product.b && epx.f(this.c, product.c) && epx.f(this.d, product.d) && epx.f(this.e, product.e);
        }

        public final int hashCode() {
            int a2 = bh10.a(Long.hashCode(this.b) * 31, 31, this.c.b);
            String str = this.d;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            Image image = this.e;
            return hashCode + (image != null ? image.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Product(productId=");
            sb.append(this.b);
            sb.append(", groupId=");
            sb.append(this.c);
            sb.append(", title=");
            sb.append(this.d);
            sb.append(", image=");
            return er.d(sb, this.e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.b);
            parcel.writeParcelable(this.c, i);
            parcel.writeString(this.d);
            parcel.writeParcelable(this.e, i);
        }
    }

    /* compiled from: OrderPreview.kt */
    public static final class a implements Parcelable.Creator<OrderPreview> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final OrderPreview createFromParcel(Parcel parcel) {
            Long valueOf;
            OrderSeller orderSeller;
            Class<OrderPreview> cls = OrderPreview.class;
            UserId userId = (UserId) parcel.readParcelable(cls.getClassLoader());
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            OrderStatus valueOf2 = OrderStatus.valueOf(parcel.readString());
            int i = 0;
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
                orderSeller = null;
            } else {
                valueOf = Long.valueOf(parcel.readLong());
                orderSeller = null;
            }
            String readString2 = parcel.readString();
            OrderSeller createFromParcel = parcel.readInt() == 0 ? orderSeller : OrderSeller.CREATOR.createFromParcel(parcel);
            ActionType actionType = orderSeller;
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                actionType = ActionType.valueOf(parcel.readString());
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            while (true) {
                Class<OrderPreview> cls2 = cls;
                if (i == readInt2) {
                    return new OrderPreview(userId, readInt, readString, valueOf2, z, valueOf, readString2, createFromParcel, readString3, actionType, arrayList, parcel.readInt(), (OrderSource) parcel.readParcelable(cls2.getClassLoader()));
                }
                i = en.a(Product.CREATOR, parcel, arrayList, i, 1);
                cls = cls2;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final OrderPreview[] newArray(int i) {
            return new OrderPreview[i];
        }
    }

    public OrderPreview(UserId userId, int i, String str, OrderStatus orderStatus, boolean z, Long l, String str2, OrderSeller orderSeller, String str3, ActionType actionType, List<Product> list, int i2, OrderSource orderSource) {
        this.b = userId;
        this.c = i;
        this.d = str;
        this.e = orderStatus;
        this.f = z;
        this.g = l;
        this.h = str2;
        this.i = orderSeller;
        this.j = str3;
        this.k = actionType;
        this.l = list;
        this.m = i2;
        this.n = orderSource;
    }

    public static OrderPreview a(OrderPreview orderPreview, int i) {
        return new OrderPreview(orderPreview.b, orderPreview.c, orderPreview.d, orderPreview.e, (i & 16) != 0 ? orderPreview.f : true, orderPreview.g, orderPreview.h, orderPreview.i, orderPreview.j, (i & 512) != 0 ? orderPreview.k : null, orderPreview.l, orderPreview.m, orderPreview.n);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderPreview)) {
            return false;
        }
        OrderPreview orderPreview = (OrderPreview) obj;
        return epx.f(this.b, orderPreview.b) && this.c == orderPreview.c && epx.f(this.d, orderPreview.d) && this.e == orderPreview.e && this.f == orderPreview.f && epx.f(this.g, orderPreview.g) && epx.f(this.h, orderPreview.h) && epx.f(this.i, orderPreview.i) && epx.f(this.j, orderPreview.j) && this.k == orderPreview.k && epx.f(this.l, orderPreview.l) && this.m == orderPreview.m && epx.f(this.n, orderPreview.n);
    }

    public final int hashCode() {
        int a2 = shy.a(this.c, Long.hashCode(this.b.b) * 31, 31);
        String str = this.d;
        int b = qoy.b((this.e.hashCode() + ((a2 + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f);
        Long l = this.g;
        int hashCode = (b + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.h;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        OrderSeller orderSeller = this.i;
        int hashCode3 = (hashCode2 + (orderSeller == null ? 0 : orderSeller.hashCode())) * 31;
        String str3 = this.j;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ActionType actionType = this.k;
        return this.n.hashCode() + shy.a(this.m, fw3.a((hashCode4 + (actionType != null ? actionType.hashCode() : 0)) * 31, 31, this.l), 31);
    }

    public final String toString() {
        return "OrderPreview(userId=" + this.b + ", orderId=" + this.c + ", displayedId=" + this.d + ", status=" + this.e + ", isViewed=" + this.f + ", date=" + this.g + ", priceText=" + this.h + ", seller=" + this.i + ", sellerComment=" + this.j + ", action=" + this.k + ", products=" + this.l + ", totalProducts=" + this.m + ", source=" + this.n + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e.name());
        parcel.writeInt(this.f ? 1 : 0);
        Long l = this.g;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        parcel.writeString(this.h);
        OrderSeller orderSeller = this.i;
        if (orderSeller == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            orderSeller.writeToParcel(parcel, i);
        }
        parcel.writeString(this.j);
        ActionType actionType = this.k;
        if (actionType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(actionType.name());
        }
        Iterator a2 = ao.a(parcel, this.l);
        while (a2.hasNext()) {
            ((Product) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.m);
        parcel.writeParcelable(this.n, i);
    }
}
