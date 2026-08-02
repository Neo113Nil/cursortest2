package com.vk.ecomm.products_multipicker.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.qoy;
import xsna.urd0;
import xsna.vu5;

/* compiled from: MultipickerProduct.kt */
/* loaded from: classes18.dex */
public final class MultipickerProduct implements Parcelable {
    public static final Parcelable.Creator<MultipickerProduct> CREATOR = new a();
    public final MultipickerProductId b;
    public final String c;
    public final Price d;
    public final Moderation e;
    public final Image f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final String j;
    public final Owner k;
    public final Rating l;

    /* compiled from: MultipickerProduct.kt */
    public static final class Moderation implements Parcelable {
        public static final Parcelable.Creator<Moderation> CREATOR = new a();
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final Integer e;
        public final Image f;
        public final Reject g;

        /* compiled from: MultipickerProduct.kt */
        public static final class Reject implements Parcelable {
            public static final Parcelable.Creator<Reject> CREATOR = new a();
            public final String b;
            public final String c;
            public final String d;
            public final boolean e;

            /* compiled from: MultipickerProduct.kt */
            public static final class a implements Parcelable.Creator<Reject> {
                @Override // android.os.Parcelable.Creator
                public final Reject createFromParcel(Parcel parcel) {
                    return new Reject(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Reject[] newArray(int i) {
                    return new Reject[i];
                }
            }

            public Reject(String str, String str2, String str3, boolean z) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Reject)) {
                    return false;
                }
                Reject reject = (Reject) obj;
                return epx.f(this.b, reject.b) && epx.f(this.c, reject.c) && epx.f(this.d, reject.d) && this.e == reject.e;
            }

            public final int hashCode() {
                String str = this.b;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.c;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.d;
                return Boolean.hashCode(this.e) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Reject(description=");
                sb.append(this.b);
                sb.append(", infoLink=");
                sb.append(this.c);
                sb.append(", supportLink=");
                sb.append(this.d);
                sb.append(", inProgress=");
                return q0.a(sb, this.e, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b);
                parcel.writeString(this.c);
                parcel.writeString(this.d);
                parcel.writeInt(this.e ? 1 : 0);
            }
        }

        /* compiled from: MultipickerProduct.kt */
        public static final class a implements Parcelable.Creator<Moderation> {
            @Override // android.os.Parcelable.Creator
            public final Moderation createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2 = false;
                boolean z3 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                }
                return new Moderation(z3, z2, parcel.readInt() == 0 ? z : true, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (Image) parcel.readValue(Moderation.class.getClassLoader()), parcel.readInt() != 0 ? Reject.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Moderation[] newArray(int i) {
                return new Moderation[i];
            }
        }

        public Moderation(boolean z, boolean z2, boolean z3, Integer num, Image image, Reject reject) {
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = num;
            this.f = image;
            this.g = reject;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Moderation)) {
                return false;
            }
            Moderation moderation = (Moderation) obj;
            return this.b == moderation.b && this.c == moderation.c && this.d == moderation.d && epx.f(this.e, moderation.e) && epx.f(this.f, moderation.f) && epx.f(this.g, moderation.g);
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d);
            Integer num = this.e;
            int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
            Image image = this.f;
            int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
            Reject reject = this.g;
            return hashCode2 + (reject != null ? reject.hashCode() : 0);
        }

        public final String toString() {
            return "Moderation(isAdult=" + this.b + ", isOwner=" + this.c + ", isHardBlocked=" + this.d + ", position=" + this.e + ", image=" + this.f + ", reject=" + this.g + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b ? 1 : 0);
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeInt(this.d ? 1 : 0);
            Integer num = this.e;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeValue(this.f);
            Reject reject = this.g;
            if (reject == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                reject.writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: MultipickerProduct.kt */
    public static final class Owner implements Parcelable {
        public static final Parcelable.Creator<Owner> CREATOR = new a();
        public final UserId b;
        public final String c;
        public final boolean d;

        /* compiled from: MultipickerProduct.kt */
        public static final class a implements Parcelable.Creator<Owner> {
            @Override // android.os.Parcelable.Creator
            public final Owner createFromParcel(Parcel parcel) {
                return new Owner((UserId) parcel.readParcelable(Owner.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Owner[] newArray(int i) {
                return new Owner[i];
            }
        }

        public Owner(UserId userId, String str, boolean z) {
            this.b = userId;
            this.c = str;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Owner)) {
                return false;
            }
            Owner owner = (Owner) obj;
            return epx.f(this.b, owner.b) && epx.f(this.c, owner.c) && this.d == owner.d;
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.b.b) * 31;
            String str = this.c;
            return Boolean.hashCode(this.d) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Owner(id=");
            sb.append(this.b);
            sb.append(", name=");
            sb.append(this.c);
            sb.append(", isVerified=");
            return q0.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeString(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }
    }

    /* compiled from: MultipickerProduct.kt */
    public static final class Price implements Parcelable {
        public static final Parcelable.Creator<Price> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;
        public final int e;

        /* compiled from: MultipickerProduct.kt */
        public static final class a implements Parcelable.Creator<Price> {
            @Override // android.os.Parcelable.Creator
            public final Price createFromParcel(Parcel parcel) {
                return new Price(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Price[] newArray(int i) {
                return new Price[i];
            }
        }

        public Price(String str, String str2, String str3, int i) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Price)) {
                return false;
            }
            Price price = (Price) obj;
            return epx.f(this.b, price.b) && epx.f(this.c, price.c) && epx.f(this.d, price.d) && this.e == price.e;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return Integer.hashCode(this.e) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Price(amount=");
            sb.append(this.b);
            sb.append(", oldAmount=");
            sb.append(this.c);
            sb.append(", loyaltyAmount=");
            sb.append(this.d);
            sb.append(", discountRate=");
            return vu5.b(sb, this.e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeInt(this.e);
        }
    }

    /* compiled from: MultipickerProduct.kt */
    public static final class Rating implements Parcelable {
        public static final Parcelable.Creator<Rating> CREATOR = new a();
        public final Float b;
        public final Integer c;
        public final String d;

        /* compiled from: MultipickerProduct.kt */
        public static final class a implements Parcelable.Creator<Rating> {
            @Override // android.os.Parcelable.Creator
            public final Rating createFromParcel(Parcel parcel) {
                return new Rating(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Rating[] newArray(int i) {
                return new Rating[i];
            }
        }

        public Rating(Float f, Integer num, String str) {
            this.b = f;
            this.c = num;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Rating)) {
                return false;
            }
            Rating rating = (Rating) obj;
            return epx.f(this.b, rating.b) && epx.f(this.c, rating.c) && epx.f(this.d, rating.d);
        }

        public final int hashCode() {
            Float f = this.b;
            int hashCode = (f == null ? 0 : f.hashCode()) * 31;
            Integer num = this.c;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.d;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Rating(rating=");
            sb.append(this.b);
            sb.append(", reviewsCount=");
            sb.append(this.c);
            sb.append(", reviewsCountText=");
            return ho8.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Float f = this.b;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f);
            }
            Integer num = this.c;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeString(this.d);
        }
    }

    /* compiled from: MultipickerProduct.kt */
    public static final class a implements Parcelable.Creator<MultipickerProduct> {
        @Override // android.os.Parcelable.Creator
        public final MultipickerProduct createFromParcel(Parcel parcel) {
            return new MultipickerProduct(MultipickerProductId.CREATOR.createFromParcel(parcel), parcel.readString(), Price.CREATOR.createFromParcel(parcel), Moderation.CREATOR.createFromParcel(parcel), (Image) parcel.readValue(MultipickerProduct.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Owner.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Rating.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MultipickerProduct[] newArray(int i) {
            return new MultipickerProduct[i];
        }
    }

    public MultipickerProduct(MultipickerProductId multipickerProductId, String str, Price price, Moderation moderation, Image image, boolean z, boolean z2, String str2, String str3, Owner owner, Rating rating) {
        this.b = multipickerProductId;
        this.c = str;
        this.d = price;
        this.e = moderation;
        this.f = image;
        this.g = z;
        this.h = z2;
        this.i = str2;
        this.j = str3;
        this.k = owner;
        this.l = rating;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultipickerProduct)) {
            return false;
        }
        MultipickerProduct multipickerProduct = (MultipickerProduct) obj;
        return epx.f(this.b, multipickerProduct.b) && epx.f(this.c, multipickerProduct.c) && epx.f(this.d, multipickerProduct.d) && epx.f(this.e, multipickerProduct.e) && epx.f(this.f, multipickerProduct.f) && this.g == multipickerProduct.g && this.h == multipickerProduct.h && epx.f(this.i, multipickerProduct.i) && epx.f(this.j, multipickerProduct.j) && epx.f(this.k, multipickerProduct.k) && epx.f(this.l, multipickerProduct.l);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31)) * 31;
        Image image = this.f;
        int b = qoy.b(qoy.b((hashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.g), 31, this.h);
        String str = this.i;
        int hashCode2 = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Owner owner = this.k;
        int hashCode4 = (hashCode3 + (owner == null ? 0 : owner.hashCode())) * 31;
        Rating rating = this.l;
        return hashCode4 + (rating != null ? rating.hashCode() : 0);
    }

    public final String toString() {
        return "MultipickerProduct(id=" + this.b + ", title=" + this.c + ", price=" + this.d + ", moderation=" + this.e + ", thumbImage=" + this.f + ", isFave=" + this.g + ", isAvailable=" + this.h + ", link=" + this.i + ", trackCode=" + this.j + ", owner=" + this.k + ", itemRating=" + this.l + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
        parcel.writeString(this.c);
        this.d.writeToParcel(parcel, i);
        this.e.writeToParcel(parcel, i);
        parcel.writeValue(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        Owner owner = this.k;
        if (owner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            owner.writeToParcel(parcel, i);
        }
        Rating rating = this.l;
        if (rating == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rating.writeToParcel(parcel, i);
        }
    }
}
