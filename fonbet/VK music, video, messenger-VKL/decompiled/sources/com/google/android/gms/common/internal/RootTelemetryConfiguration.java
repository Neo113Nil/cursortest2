package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.gwz0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new gwz0();
    public final int b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;

    public RootTelemetryConfiguration(int i, boolean z, boolean z2, int i2, int i3) {
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = i2;
        this.f = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.d ? 1 : 0);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.e);
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(this.f);
        ozg0.x(w, parcel);
    }
}
