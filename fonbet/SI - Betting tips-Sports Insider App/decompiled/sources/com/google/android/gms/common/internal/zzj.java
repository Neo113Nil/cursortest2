package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.j;
import h8.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new j(10);

    /* renamed from: a, reason: collision with root package name */
    public Bundle f4553a;

    /* renamed from: b, reason: collision with root package name */
    public Feature[] f4554b;

    /* renamed from: c, reason: collision with root package name */
    public int f4555c;

    /* renamed from: d, reason: collision with root package name */
    public ConnectionTelemetryConfiguration f4556d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.F(parcel, 1, this.f4553a);
        b.Q(parcel, 2, this.f4554b, i5);
        int i10 = this.f4555c;
        b.U(parcel, 3, 4);
        parcel.writeInt(i10);
        b.N(parcel, 4, this.f4556d, i5, false);
        b.W(parcel, V);
    }
}
