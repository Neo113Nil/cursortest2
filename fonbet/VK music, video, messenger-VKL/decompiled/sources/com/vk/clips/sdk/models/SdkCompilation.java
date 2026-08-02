package com.vk.clips.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;

/* compiled from: SdkCompilation.kt */
/* loaded from: classes17.dex */
public final class SdkCompilation implements Parcelable {
    public static final Parcelable.Creator<SdkCompilation> CREATOR = new a();
    public final String b;
    public final Parcelable c;

    /* compiled from: SdkCompilation.kt */
    public static final class a implements Parcelable.Creator<SdkCompilation> {
        @Override // android.os.Parcelable.Creator
        public final SdkCompilation createFromParcel(Parcel parcel) {
            return new SdkCompilation(parcel.readString(), parcel.readParcelable(SdkCompilation.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SdkCompilation[] newArray(int i) {
            return new SdkCompilation[i];
        }
    }

    public SdkCompilation(String str, Parcelable parcelable) {
        this.b = str;
        this.c = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkCompilation)) {
            return false;
        }
        SdkCompilation sdkCompilation = (SdkCompilation) obj;
        return epx.f(this.b, sdkCompilation.b) && epx.f(this.c, sdkCompilation.c);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Parcelable parcelable = this.c;
        return hashCode + (parcelable != null ? parcelable.hashCode() : 0);
    }

    public final String toString() {
        return "SdkCompilation(name=" + this.b + ", extendedModel=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
