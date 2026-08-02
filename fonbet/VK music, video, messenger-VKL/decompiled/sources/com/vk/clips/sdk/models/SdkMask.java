package com.vk.clips.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;

/* compiled from: SdkMask.kt */
/* loaded from: classes17.dex */
public final class SdkMask implements Parcelable {
    public static final Parcelable.Creator<SdkMask> CREATOR = new a();
    public final int b;
    public final String c;
    public final Parcelable d;
    public final boolean e;

    /* compiled from: SdkMask.kt */
    public static final class a implements Parcelable.Creator<SdkMask> {
        @Override // android.os.Parcelable.Creator
        public final SdkMask createFromParcel(Parcel parcel) {
            return new SdkMask(parcel.readInt(), parcel.readString(), parcel.readParcelable(SdkMask.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SdkMask[] newArray(int i) {
            return new SdkMask[i];
        }
    }

    public SdkMask(int i, String str, Parcelable parcelable) {
        this.b = i;
        this.c = str;
        this.d = parcelable;
        this.e = i < 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkMask)) {
            return false;
        }
        SdkMask sdkMask = (SdkMask) obj;
        return this.b == sdkMask.b && epx.f(this.c, sdkMask.c) && epx.f(this.d, sdkMask.d);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Parcelable parcelable = this.d;
        return hashCode2 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    public final String toString() {
        return "SdkMask(id=" + this.b + ", name=" + this.c + ", extendedModel=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
    }
}
