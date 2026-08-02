package com.vk.clips.sdk.models.ads;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: SdkOrdAdvertiser.kt */
/* loaded from: classes17.dex */
public final class SdkOrdAdvertiser implements Parcelable {
    public static final Parcelable.Creator<SdkOrdAdvertiser> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: SdkOrdAdvertiser.kt */
    public static final class a implements Parcelable.Creator<SdkOrdAdvertiser> {
        @Override // android.os.Parcelable.Creator
        public final SdkOrdAdvertiser createFromParcel(Parcel parcel) {
            return new SdkOrdAdvertiser(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SdkOrdAdvertiser[] newArray(int i) {
            return new SdkOrdAdvertiser[i];
        }
    }

    public SdkOrdAdvertiser(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkOrdAdvertiser)) {
            return false;
        }
        SdkOrdAdvertiser sdkOrdAdvertiser = (SdkOrdAdvertiser) obj;
        return epx.f(this.b, sdkOrdAdvertiser.b) && epx.f(this.c, sdkOrdAdvertiser.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkOrdAdvertiser(url=");
        sb.append(this.b);
        sb.append(", erId=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
