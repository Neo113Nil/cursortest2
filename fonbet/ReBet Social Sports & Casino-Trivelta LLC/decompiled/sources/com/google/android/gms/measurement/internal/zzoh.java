package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zzoh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoh> CREATOR = new C3388w6();

    /* renamed from: a, reason: collision with root package name */
    public final String f34439a;

    /* renamed from: b, reason: collision with root package name */
    public final long f34440b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34441c;

    public zzoh(String str, long j10, int i10) {
        this.f34439a = str;
        this.f34440b = j10;
        this.f34441c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f34439a;
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 1, str, false);
        E9.b.y(parcel, 2, this.f34440b);
        E9.b.u(parcel, 3, this.f34441c);
        E9.b.b(parcel, a10);
    }
}
