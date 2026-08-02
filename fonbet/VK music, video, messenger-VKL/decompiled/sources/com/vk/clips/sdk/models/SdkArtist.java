package com.vk.clips.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: SdkArtist.kt */
/* loaded from: classes17.dex */
public final class SdkArtist implements Parcelable {
    public static final Parcelable.Creator<SdkArtist> CREATOR = new a();
    public final String b;

    /* compiled from: SdkArtist.kt */
    public static final class a implements Parcelable.Creator<SdkArtist> {
        @Override // android.os.Parcelable.Creator
        public final SdkArtist createFromParcel(Parcel parcel) {
            return new SdkArtist(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SdkArtist[] newArray(int i) {
            return new SdkArtist[i];
        }
    }

    public SdkArtist(String str) {
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
        return (obj instanceof SdkArtist) && epx.f(this.b, ((SdkArtist) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("SdkArtist(name="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }
}
