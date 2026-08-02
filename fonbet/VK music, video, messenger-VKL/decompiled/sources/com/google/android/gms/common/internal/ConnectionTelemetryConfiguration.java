package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.nk01;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new nk01();
    public final RootTelemetryConfiguration b;
    public final boolean c;
    public final boolean d;

    @Nullable
    public final int[] e;
    public final int f;

    @Nullable
    public final int[] g;

    public ConnectionTelemetryConfiguration(@NonNull RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, @Nullable int[] iArr, int i, @Nullable int[] iArr2) {
        this.b = rootTelemetryConfiguration;
        this.c = z;
        this.d = z2;
        this.e = iArr;
        this.f = i;
        this.g = iArr2;
    }

    public final int i() {
        return this.f;
    }

    @Nullable
    public final int[] j() {
        return this.e;
    }

    @Nullable
    public final int[] k() {
        return this.g;
    }

    public final boolean l() {
        return this.c;
    }

    public final boolean n() {
        return this.d;
    }

    @NonNull
    public final RootTelemetryConfiguration o() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.b, i, false);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.d ? 1 : 0);
        ozg0.i(parcel, 4, this.e, false);
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(this.f);
        ozg0.i(parcel, 6, this.g, false);
        ozg0.x(w, parcel);
    }
}
