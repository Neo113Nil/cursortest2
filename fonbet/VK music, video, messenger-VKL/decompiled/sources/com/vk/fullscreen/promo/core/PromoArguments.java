package com.vk.fullscreen.promo.core;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.zcl;

/* compiled from: PromoArguments.kt */
/* loaded from: classes16.dex */
public abstract class PromoArguments implements Parcelable {

    /* compiled from: PromoArguments.kt */
    public static final class SignUp extends PromoArguments {
        public static final Parcelable.Creator<SignUp> CREATOR = new a();
        public final boolean b;

        /* compiled from: PromoArguments.kt */
        public static final class a implements Parcelable.Creator<SignUp> {
            @Override // android.os.Parcelable.Creator
            public final SignUp createFromParcel(Parcel parcel) {
                return new SignUp(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final SignUp[] newArray(int i) {
                return new SignUp[i];
            }
        }

        public SignUp(boolean z) {
            super(null);
            this.b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b ? 1 : 0);
        }
    }

    public /* synthetic */ PromoArguments(zcl zclVar) {
        this();
    }

    public PromoArguments() {
    }
}
