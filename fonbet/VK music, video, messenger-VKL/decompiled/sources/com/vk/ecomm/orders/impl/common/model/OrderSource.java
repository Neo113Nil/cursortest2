package com.vk.ecomm.orders.impl.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: OrderSource.kt */
/* loaded from: classes18.dex */
public abstract class OrderSource implements Parcelable {

    /* compiled from: OrderSource.kt */
    public static final class Market extends OrderSource {
        public static final Market b = new Market(null);
        public static final Parcelable.Creator<Market> CREATOR = new a();

        /* compiled from: OrderSource.kt */
        public static final class a implements Parcelable.Creator<Market> {
            @Override // android.os.Parcelable.Creator
            public final Market createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Market.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Market[] newArray(int i) {
                return new Market[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Market);
        }

        public final int hashCode() {
            return 1243900411;
        }

        public final String toString() {
            return "Market";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: OrderSource.kt */
    public static final class Ozon extends OrderSource {
        public static final Parcelable.Creator<Ozon> CREATOR = new a();
        public final List<OrderGroupPreview> b;
        public final String c;
        public final String d;

        /* compiled from: OrderSource.kt */
        public static final class a implements Parcelable.Creator<Ozon> {
            @Override // android.os.Parcelable.Creator
            public final Ozon createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(OrderGroupPreview.CREATOR, parcel, arrayList, i, 1);
                }
                return new Ozon(arrayList, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Ozon[] newArray(int i) {
                return new Ozon[i];
            }
        }

        public Ozon(List<OrderGroupPreview> list, String str, String str2) {
            super(null);
            this.b = list;
            this.c = str;
            this.d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ozon)) {
                return false;
            }
            Ozon ozon = (Ozon) obj;
            return epx.f(this.b, ozon.b) && epx.f(this.c, ozon.c) && epx.f(this.d, ozon.d);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Ozon(groups=");
            sb.append(this.b);
            sb.append(", orderUrl=");
            sb.append(this.c);
            sb.append(", orderId=");
            return ho8.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Iterator a2 = ao.a(parcel, this.b);
            while (a2.hasNext()) {
                ((OrderGroupPreview) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeString(this.c);
            parcel.writeString(this.d);
        }
    }

    public /* synthetic */ OrderSource(zcl zclVar) {
        this();
    }

    public OrderSource() {
    }
}
