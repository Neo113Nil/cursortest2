package com.blaze.blazesdk.closed_captions.models.ui;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.yyl;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d implements e {
    public static final d a = new d();

    @NotNull
    public static final Parcelable.Creator<d> CREATOR = new yyl();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof d);
    }

    public final int hashCode() {
        return -1647825237;
    }

    public final String toString() {
        return "UnknownLanguage";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
