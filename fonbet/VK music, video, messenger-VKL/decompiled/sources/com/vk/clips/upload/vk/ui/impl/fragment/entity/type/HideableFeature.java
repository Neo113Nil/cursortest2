package com.vk.clips.upload.vk.ui.impl.fragment.entity.type;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;

/* compiled from: HideableFeature.kt */
/* loaded from: classes17.dex */
public final class HideableFeature<T extends Parcelable> implements Parcelable {
    public static final Parcelable.Creator<HideableFeature<?>> CREATOR = new a();
    public final T b;
    public final boolean c;

    /* compiled from: HideableFeature.kt */
    public static final class a implements Parcelable.Creator<HideableFeature<?>> {
        @Override // android.os.Parcelable.Creator
        public final HideableFeature<?> createFromParcel(Parcel parcel) {
            return new HideableFeature<>(parcel.readParcelable(HideableFeature.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final HideableFeature<?>[] newArray(int i) {
            return new HideableFeature[i];
        }
    }

    public HideableFeature(T t, boolean z) {
        this.b = t;
        this.c = z;
    }

    public static HideableFeature a(HideableFeature hideableFeature, Parcelable parcelable, boolean z, int i) {
        if ((i & 1) != 0) {
            parcelable = hideableFeature.b;
        }
        if ((i & 2) != 0) {
            z = hideableFeature.c;
        }
        return new HideableFeature(parcelable, z);
    }

    public final T d() {
        if (this.c) {
            return this.b;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HideableFeature)) {
            return false;
        }
        HideableFeature hideableFeature = (HideableFeature) obj;
        return epx.f(this.b, hideableFeature.b) && this.c == hideableFeature.c;
    }

    public final int hashCode() {
        T t = this.b;
        return Boolean.hashCode(this.c) + ((t == null ? 0 : t.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HideableFeature(data=");
        sb.append(this.b);
        sb.append(", show=");
        return q0.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
