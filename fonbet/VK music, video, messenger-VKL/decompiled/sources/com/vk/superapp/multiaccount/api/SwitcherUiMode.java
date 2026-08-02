package com.vk.superapp.multiaccount.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: SwitcherUiMode.kt */
/* loaded from: classes6.dex */
public interface SwitcherUiMode extends Parcelable {

    /* compiled from: SwitcherUiMode.kt */
    public static final class Ecoplate implements SwitcherUiMode {
        public static final Ecoplate b = new Ecoplate();
        public static final Parcelable.Creator<Ecoplate> CREATOR = new a();

        /* compiled from: SwitcherUiMode.kt */
        public static final class a implements Parcelable.Creator<Ecoplate> {
            @Override // android.os.Parcelable.Creator
            public final Ecoplate createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Ecoplate.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Ecoplate[] newArray(int i) {
                return new Ecoplate[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Ecoplate);
        }

        public final int hashCode() {
            return 352304713;
        }

        public final String toString() {
            return "Ecoplate";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: SwitcherUiMode.kt */
    public static final class EcoplateLK implements SwitcherUiMode {
        public static final EcoplateLK b = new EcoplateLK();
        public static final Parcelable.Creator<EcoplateLK> CREATOR = new a();

        /* compiled from: SwitcherUiMode.kt */
        public static final class a implements Parcelable.Creator<EcoplateLK> {
            @Override // android.os.Parcelable.Creator
            public final EcoplateLK createFromParcel(Parcel parcel) {
                parcel.readInt();
                return EcoplateLK.b;
            }

            @Override // android.os.Parcelable.Creator
            public final EcoplateLK[] newArray(int i) {
                return new EcoplateLK[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EcoplateLK);
        }

        public final int hashCode() {
            return -737584760;
        }

        public final String toString() {
            return "EcoplateLK";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: SwitcherUiMode.kt */
    public static final class EcoplateRestricted implements SwitcherUiMode {
        public static final EcoplateRestricted b = new EcoplateRestricted();
        public static final Parcelable.Creator<EcoplateRestricted> CREATOR = new a();

        /* compiled from: SwitcherUiMode.kt */
        public static final class a implements Parcelable.Creator<EcoplateRestricted> {
            @Override // android.os.Parcelable.Creator
            public final EcoplateRestricted createFromParcel(Parcel parcel) {
                parcel.readInt();
                return EcoplateRestricted.b;
            }

            @Override // android.os.Parcelable.Creator
            public final EcoplateRestricted[] newArray(int i) {
                return new EcoplateRestricted[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EcoplateRestricted);
        }

        public final int hashCode() {
            return 2107644804;
        }

        public final String toString() {
            return "EcoplateRestricted";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }
}
