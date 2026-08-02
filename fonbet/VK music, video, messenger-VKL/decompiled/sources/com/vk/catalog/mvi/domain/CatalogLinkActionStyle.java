package com.vk.catalog.mvi.domain;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: CatalogLinkButtonActionDo.kt */
/* loaded from: classes16.dex */
public interface CatalogLinkActionStyle extends Parcelable {

    /* compiled from: CatalogLinkButtonActionDo.kt */
    public static final class Default implements CatalogLinkActionStyle {
        public static final Default b = new Default();
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* compiled from: CatalogLinkButtonActionDo.kt */
        public static final class a implements Parcelable.Creator<Default> {
            @Override // android.os.Parcelable.Creator
            public final Default createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Default.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Default[] newArray(int i) {
                return new Default[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Default);
        }

        public final int hashCode() {
            return 707514454;
        }

        public final String toString() {
            return "Default";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: CatalogLinkButtonActionDo.kt */
    public static final class Primary implements CatalogLinkActionStyle {
        public static final Primary b = new Primary();
        public static final Parcelable.Creator<Primary> CREATOR = new a();

        /* compiled from: CatalogLinkButtonActionDo.kt */
        public static final class a implements Parcelable.Creator<Primary> {
            @Override // android.os.Parcelable.Creator
            public final Primary createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Primary.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Primary[] newArray(int i) {
                return new Primary[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Primary);
        }

        public final int hashCode() {
            return -1152055273;
        }

        public final String toString() {
            return "Primary";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: CatalogLinkButtonActionDo.kt */
    public static final class Secondary implements CatalogLinkActionStyle {
        public static final Secondary b = new Secondary();
        public static final Parcelable.Creator<Secondary> CREATOR = new a();

        /* compiled from: CatalogLinkButtonActionDo.kt */
        public static final class a implements Parcelable.Creator<Secondary> {
            @Override // android.os.Parcelable.Creator
            public final Secondary createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Secondary.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Secondary[] newArray(int i) {
                return new Secondary[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Secondary);
        }

        public final int hashCode() {
            return 2001091145;
        }

        public final String toString() {
            return "Secondary";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }
}
