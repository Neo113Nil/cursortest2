package com.blaze.blazesdk.players.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.blaze.blazesdk.players.models.B;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class L extends B.b {
    public static final L b = new L();

    @NotNull
    public static final Parcelable.Creator<L> CREATOR = new g();

    public L() {
        super("Skip", null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
