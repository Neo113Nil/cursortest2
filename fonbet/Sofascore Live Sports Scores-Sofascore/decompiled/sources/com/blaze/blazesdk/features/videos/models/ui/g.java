package com.blaze.blazesdk.features.videos.models.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.blaze.blazesdk.features.videos.models.ui.a;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g extends a.d {
    public static final g a = new g();

    @NotNull
    public static final Parcelable.Creator<g> CREATOR = new f();

    public g() {
        super(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof g);
    }

    public final int hashCode() {
        return -1025209533;
    }

    public final String toString() {
        return "Minimized";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
