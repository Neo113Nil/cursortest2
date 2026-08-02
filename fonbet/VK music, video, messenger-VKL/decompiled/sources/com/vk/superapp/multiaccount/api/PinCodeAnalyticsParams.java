package com.vk.superapp.multiaccount.api;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: PinCodeAnalyticsParams.kt */
/* loaded from: classes6.dex */
public final class PinCodeAnalyticsParams implements Parcelable {
    public static final Parcelable.Creator<PinCodeAnalyticsParams> CREATOR = new a();
    public final String b;

    /* compiled from: PinCodeAnalyticsParams.kt */
    public static final class a implements Parcelable.Creator<PinCodeAnalyticsParams> {
        @Override // android.os.Parcelable.Creator
        public final PinCodeAnalyticsParams createFromParcel(Parcel parcel) {
            return new PinCodeAnalyticsParams(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PinCodeAnalyticsParams[] newArray(int i) {
            return new PinCodeAnalyticsParams[i];
        }
    }

    public PinCodeAnalyticsParams(String str) {
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
        return (obj instanceof PinCodeAnalyticsParams) && epx.f(this.b, ((PinCodeAnalyticsParams) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("PinCodeAnalyticsParams(flowService="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }
}
