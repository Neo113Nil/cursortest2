package com.vk.geo.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.io.Serializable;
import xsna.vby;

/* compiled from: Units.kt */
@vby
/* loaded from: classes2.dex */
public final class Degrees implements Parcelable, Comparable<Degrees>, Serializable {
    public static final Parcelable.Creator<Degrees> CREATOR = new a();

    @Keep
    public static final long serialVersionUID = -4847557103562636714L;
    private final float value;

    /* compiled from: Units.kt */
    public static final class a implements Parcelable.Creator<Degrees> {
        @Override // android.os.Parcelable.Creator
        public final Degrees createFromParcel(Parcel parcel) {
            return new Degrees(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final Degrees[] newArray(int i) {
            return new Degrees[i];
        }
    }

    public /* synthetic */ Degrees(float f) {
        this.value = f;
    }

    public static final boolean a(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Degrees degrees) {
        return Float.compare(this.value, degrees.value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Degrees) && Float.compare(this.value, ((Degrees) obj).value) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.value);
    }

    public final String toString() {
        return String.valueOf(this.value);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.value);
    }
}
