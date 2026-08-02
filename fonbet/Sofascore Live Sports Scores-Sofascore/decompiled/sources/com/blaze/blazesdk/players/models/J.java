package com.blaze.blazesdk.players.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.blaze.blazesdk.players.models.B;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class J extends B.b {
    public static final J b = new J();

    @NotNull
    public static final Parcelable.Creator<J> CREATOR = new e();

    public J() {
        super("App Foreground", null);
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
