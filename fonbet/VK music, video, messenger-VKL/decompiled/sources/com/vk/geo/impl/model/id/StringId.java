package com.vk.geo.impl.model.id;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.vby;
import xsna.zr;

/* compiled from: Id.kt */
@vby
/* loaded from: classes2.dex */
public final class StringId implements Comparable<StringId>, Parcelable {
    public static final Parcelable.Creator<StringId> CREATOR = new a();
    public final String b;

    /* compiled from: Id.kt */
    public static final class a implements Parcelable.Creator<StringId> {
        @Override // android.os.Parcelable.Creator
        public final StringId createFromParcel(Parcel parcel) {
            return new StringId(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StringId[] newArray(int i) {
            return new StringId[i];
        }
    }

    public /* synthetic */ StringId(String str) {
        this.b = str;
    }

    public static String a(String str) {
        return zr.a("Id(\"", str, "\")");
    }

    @Override // java.lang.Comparable
    public final int compareTo(StringId stringId) {
        return this.b.compareTo(stringId.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof StringId) {
            return epx.f(this.b, ((StringId) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return a(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }
}
