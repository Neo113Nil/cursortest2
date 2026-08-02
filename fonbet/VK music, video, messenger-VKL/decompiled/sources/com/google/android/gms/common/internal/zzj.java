package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;
import xsna.zi01;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zi01();
    public Bundle b;
    public Feature[] c;
    public int d;

    @Nullable
    public ConnectionTelemetryConfiguration e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.d(parcel, 1, this.b, false);
        ozg0.t(parcel, 2, this.c, i);
        int i2 = this.d;
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(i2);
        ozg0.p(parcel, 4, this.e, i, false);
        ozg0.x(w, parcel);
    }
}
