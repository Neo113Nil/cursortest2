package com.vk.ecomm.core.models.product;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.uqi;

/* compiled from: ProductItemBadge.kt */
/* loaded from: classes18.dex */
public interface ProductItemBadge extends Parcelable {

    /* compiled from: ProductItemBadge.kt */
    public static final class Default implements ProductItemBadge {
        public static final Parcelable.Creator<Default> CREATOR = new a();
        public final String b;

        /* compiled from: ProductItemBadge.kt */
        public static final class a implements Parcelable.Creator<Default> {
            @Override // android.os.Parcelable.Creator
            public final Default createFromParcel(Parcel parcel) {
                return new Default(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Default[] newArray(int i) {
                return new Default[i];
            }
        }

        public Default(String str) {
            this.b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Default) && epx.f(this.b, ((Default) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Default(text="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }

    /* compiled from: ProductItemBadge.kt */
    public static final class MultiIntegration implements ProductItemBadge {
        public static final Parcelable.Creator<MultiIntegration> CREATOR = new a();
        public final String b;
        public final String c;
        public final Integer d;
        public final Integer e;

        /* compiled from: ProductItemBadge.kt */
        public static final class a implements Parcelable.Creator<MultiIntegration> {
            @Override // android.os.Parcelable.Creator
            public final MultiIntegration createFromParcel(Parcel parcel) {
                return new MultiIntegration(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final MultiIntegration[] newArray(int i) {
                return new MultiIntegration[i];
            }
        }

        public MultiIntegration(String str, String str2, Integer num, Integer num2) {
            this.b = str;
            this.c = str2;
            this.d = num;
            this.e = num2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultiIntegration)) {
                return false;
            }
            MultiIntegration multiIntegration = (MultiIntegration) obj;
            return epx.f(this.b, multiIntegration.b) && epx.f(this.c, multiIntegration.c) && epx.f(this.d, multiIntegration.d) && epx.f(this.e, multiIntegration.e);
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.d;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.e;
            return hashCode3 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MultiIntegration(lightUrl=");
            sb.append(this.b);
            sb.append(", darkUrl=");
            sb.append(this.c);
            sb.append(", width=");
            sb.append(this.d);
            sb.append(", height=");
            return uqi.b(sb, this.e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            Integer num = this.d;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            Integer num2 = this.e;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
        }
    }

    /* compiled from: ProductItemBadge.kt */
    public static final class Ozon implements ProductItemBadge {
        public static final Ozon b = new Ozon();
        public static final Parcelable.Creator<Ozon> CREATOR = new a();

        /* compiled from: ProductItemBadge.kt */
        public static final class a implements Parcelable.Creator<Ozon> {
            @Override // android.os.Parcelable.Creator
            public final Ozon createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Ozon.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Ozon[] newArray(int i) {
                return new Ozon[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Ozon);
        }

        public final int hashCode() {
            return -725550342;
        }

        public final String toString() {
            return "Ozon";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }
}
