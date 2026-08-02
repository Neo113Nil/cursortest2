package com.vk.clips.upload.vk.ui.impl.fragment.entity.type;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;

/* compiled from: DisableableFeature.kt */
/* loaded from: classes17.dex */
public final class DisableableFeature<T extends Parcelable> implements Parcelable {
    public static final Parcelable.Creator<DisableableFeature<?>> CREATOR = new a();
    public final T b;
    public final boolean c;

    /* compiled from: DisableableFeature.kt */
    public static final class a implements Parcelable.Creator<DisableableFeature<?>> {
        @Override // android.os.Parcelable.Creator
        public final DisableableFeature<?> createFromParcel(Parcel parcel) {
            return new DisableableFeature<>(parcel.readParcelable(DisableableFeature.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final DisableableFeature<?>[] newArray(int i) {
            return new DisableableFeature[i];
        }
    }

    public DisableableFeature(T t, boolean z) {
        this.b = t;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisableableFeature)) {
            return false;
        }
        DisableableFeature disableableFeature = (DisableableFeature) obj;
        return epx.f(this.b, disableableFeature.b) && this.c == disableableFeature.c;
    }

    public final int hashCode() {
        T t = this.b;
        return Boolean.hashCode(this.c) + ((t == null ? 0 : t.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisableableFeature(data=");
        sb.append(this.b);
        sb.append(", enabled=");
        return q0.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
