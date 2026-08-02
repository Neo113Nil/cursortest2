package com.vk.clips.viewer.edit.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;

/* compiled from: OrdVS.kt */
/* loaded from: classes17.dex */
public interface OrdVS extends Parcelable {

    /* compiled from: OrdVS.kt */
    public static final class Hidden implements OrdVS {
        public static final Hidden b = new Hidden();
        public static final Parcelable.Creator<Hidden> CREATOR = new a();

        /* compiled from: OrdVS.kt */
        public static final class a implements Parcelable.Creator<Hidden> {
            @Override // android.os.Parcelable.Creator
            public final Hidden createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Hidden.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Hidden[] newArray(int i) {
                return new Hidden[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: OrdVS.kt */
    public static final class Shown implements OrdVS {
        public static final Parcelable.Creator<Shown> CREATOR = new a();
        public final boolean b;

        /* compiled from: OrdVS.kt */
        public static final class a implements Parcelable.Creator<Shown> {
            @Override // android.os.Parcelable.Creator
            public final Shown createFromParcel(Parcel parcel) {
                return new Shown(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Shown[] newArray(int i) {
                return new Shown[i];
            }
        }

        public Shown(boolean z) {
            this.b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Shown) && this.b == ((Shown) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("Shown(isAdded="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b ? 1 : 0);
        }
    }
}
