package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new C3254g();

    /* renamed from: a, reason: collision with root package name */
    public final long f34419a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34420b;

    /* renamed from: c, reason: collision with root package name */
    public final long f34421c;

    public zzaf(long j10, int i10, long j11) {
        this.f34419a = j10;
        this.f34420b = i10;
        this.f34421c = j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f34419a;
        int a10 = E9.b.a(parcel);
        E9.b.y(parcel, 1, j10);
        E9.b.u(parcel, 2, this.f34420b);
        E9.b.y(parcel, 3, this.f34421c);
        E9.b.b(parcel, a10);
    }
}
