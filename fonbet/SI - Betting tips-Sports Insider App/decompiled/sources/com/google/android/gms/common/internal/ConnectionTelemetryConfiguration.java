package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.j;
import h8.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new j(11);

    /* renamed from: a, reason: collision with root package name */
    public final RootTelemetryConfiguration f4497a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4498b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4499c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f4500d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4501e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f4502f;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z5, boolean z7, int[] iArr, int i5, int[] iArr2) {
        this.f4497a = rootTelemetryConfiguration;
        this.f4498b = z5;
        this.f4499c = z7;
        this.f4500d = iArr;
        this.f4501e = i5;
        this.f4502f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.N(parcel, 1, this.f4497a, i5, false);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f4498b ? 1 : 0);
        b.U(parcel, 3, 4);
        parcel.writeInt(this.f4499c ? 1 : 0);
        b.J(parcel, 4, this.f4500d);
        b.U(parcel, 5, 4);
        parcel.writeInt(this.f4501e);
        b.J(parcel, 6, this.f4502f);
        b.W(parcel, V);
    }
}
