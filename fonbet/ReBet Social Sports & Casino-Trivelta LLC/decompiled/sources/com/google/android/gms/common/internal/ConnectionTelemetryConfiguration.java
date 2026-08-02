package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new j0();

    /* renamed from: a, reason: collision with root package name */
    public final RootTelemetryConfiguration f32624a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f32625b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f32626c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32627d;
    private final int[] zzd;
    private final int[] zzf;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f32624a = rootTelemetryConfiguration;
        this.f32625b = z10;
        this.f32626c = z11;
        this.zzd = iArr;
        this.f32627d = i10;
        this.zzf = iArr2;
    }

    public int g() {
        return this.f32627d;
    }

    public int[] h() {
        return this.zzd;
    }

    public int[] i() {
        return this.zzf;
    }

    public boolean j() {
        return this.f32625b;
    }

    public boolean k() {
        return this.f32626c;
    }

    public final RootTelemetryConfiguration l() {
        return this.f32624a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.D(parcel, 1, this.f32624a, i10, false);
        E9.b.g(parcel, 2, j());
        E9.b.g(parcel, 3, k());
        E9.b.v(parcel, 4, h(), false);
        E9.b.u(parcel, 5, g());
        E9.b.v(parcel, 6, i(), false);
        E9.b.b(parcel, a10);
    }
}
