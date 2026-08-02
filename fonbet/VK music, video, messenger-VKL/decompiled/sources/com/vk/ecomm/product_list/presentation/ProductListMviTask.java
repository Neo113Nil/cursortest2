package com.vk.ecomm.product_list.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.hn50;
import xsna.ho8;
import xsna.ln50;
import xsna.ms9;
import xsna.on50;

/* compiled from: ProductListMviTask.kt */
/* loaded from: classes18.dex */
public interface ProductListMviTask extends hn50, Parcelable {

    /* compiled from: ProductListMviTask.kt */
    public static final class LoadProducts implements ProductListMviTask {
        public static final Parcelable.Creator<LoadProducts> CREATOR = new a();
        public final List<String> b;

        /* compiled from: ProductListMviTask.kt */
        public static final class a implements Parcelable.Creator<LoadProducts> {
            @Override // android.os.Parcelable.Creator
            public final LoadProducts createFromParcel(Parcel parcel) {
                return new LoadProducts(parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final LoadProducts[] newArray(int i) {
                return new LoadProducts[i];
            }
        }

        public LoadProducts(List<String> list) {
            this.b = list;
        }

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadProducts) && epx.f(this.b, ((LoadProducts) obj).b);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("LoadProducts(productIds="), this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeStringList(this.b);
        }
    }

    /* compiled from: ProductListMviTask.kt */
    public static final class RecalculateRestrictions implements ProductListMviTask {
        public static final RecalculateRestrictions b = new RecalculateRestrictions();
        public static final Parcelable.Creator<RecalculateRestrictions> CREATOR = new a();

        /* compiled from: ProductListMviTask.kt */
        public static final class a implements Parcelable.Creator<RecalculateRestrictions> {
            @Override // android.os.Parcelable.Creator
            public final RecalculateRestrictions createFromParcel(Parcel parcel) {
                parcel.readInt();
                return RecalculateRestrictions.b;
            }

            @Override // android.os.Parcelable.Creator
            public final RecalculateRestrictions[] newArray(int i) {
                return new RecalculateRestrictions[i];
            }
        }

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RecalculateRestrictions);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return -1906668447;
        }

        public final String toString() {
            return "RecalculateRestrictions";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ProductListMviTask.kt */
    public static final class TrackOpenProduct implements ProductListMviTask {
        public static final Parcelable.Creator<TrackOpenProduct> CREATOR = new a();
        public final String b;

        /* compiled from: ProductListMviTask.kt */
        public static final class a implements Parcelable.Creator<TrackOpenProduct> {
            @Override // android.os.Parcelable.Creator
            public final TrackOpenProduct createFromParcel(Parcel parcel) {
                return new TrackOpenProduct(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TrackOpenProduct[] newArray(int i) {
                return new TrackOpenProduct[i];
            }
        }

        public TrackOpenProduct(String str) {
            this.b = str;
        }

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TrackOpenProduct) && epx.f(this.b, ((TrackOpenProduct) obj).b);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("TrackOpenProduct(fullId="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }

    /* compiled from: ProductListMviTask.kt */
    public static final class TrackProductView implements ProductListMviTask {
        public static final Parcelable.Creator<TrackProductView> CREATOR = new a();
        public final String b;

        /* compiled from: ProductListMviTask.kt */
        public static final class a implements Parcelable.Creator<TrackProductView> {
            @Override // android.os.Parcelable.Creator
            public final TrackProductView createFromParcel(Parcel parcel) {
                return new TrackProductView(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TrackProductView[] newArray(int i) {
                return new TrackProductView[i];
            }
        }

        public TrackProductView(String str) {
            this.b = str;
        }

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TrackProductView) && epx.f(this.b, ((TrackProductView) obj).b);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("TrackProductView(fullId="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }
}
