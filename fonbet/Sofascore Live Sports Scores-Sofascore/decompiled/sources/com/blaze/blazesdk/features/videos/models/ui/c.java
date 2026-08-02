package com.blaze.blazesdk.features.videos.models.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.blaze.blazesdk.features.videos.models.ui.a;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c extends a.c {
    public static final c a = new c();

    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new b();

    public c() {
        super(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof c);
    }

    public final int hashCode() {
        return -1168253043;
    }

    public final String toString() {
        return "FromPlayer";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
