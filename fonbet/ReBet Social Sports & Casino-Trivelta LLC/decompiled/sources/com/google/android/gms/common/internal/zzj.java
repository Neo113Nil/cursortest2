package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new i0();

    /* renamed from: a, reason: collision with root package name */
    public Bundle f32770a;

    /* renamed from: b, reason: collision with root package name */
    public int f32771b;

    /* renamed from: c, reason: collision with root package name */
    public ConnectionTelemetryConfiguration f32772c;
    Feature[] zzb;

    public zzj(Bundle bundle, Feature[] featureArr, int i10, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f32770a = bundle;
        this.zzb = featureArr;
        this.f32771b = i10;
        this.f32772c = connectionTelemetryConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.j(parcel, 1, this.f32770a, false);
        E9.b.I(parcel, 2, this.zzb, i10, false);
        E9.b.u(parcel, 3, this.f32771b);
        E9.b.D(parcel, 4, this.f32772c, i10, false);
        E9.b.b(parcel, a10);
    }
}
