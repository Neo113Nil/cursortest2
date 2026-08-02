package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zzom extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzom> CREATOR = new A6();

    /* renamed from: a, reason: collision with root package name */
    public final long f34442a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34443b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f34444c;

    /* renamed from: d, reason: collision with root package name */
    public final int f34445d;

    /* renamed from: e, reason: collision with root package name */
    public final long f34446e;

    /* renamed from: f, reason: collision with root package name */
    public String f34447f;
    public byte[] zzb;

    public zzom(long j10, byte[] bArr, String str, Bundle bundle, int i10, long j11, String str2) {
        this.f34442a = j10;
        this.zzb = bArr;
        this.f34443b = str;
        this.f34444c = bundle;
        this.f34445d = i10;
        this.f34446e = j11;
        this.f34447f = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f34442a;
        int a10 = E9.b.a(parcel);
        E9.b.y(parcel, 1, j10);
        E9.b.l(parcel, 2, this.zzb, false);
        E9.b.F(parcel, 3, this.f34443b, false);
        E9.b.j(parcel, 4, this.f34444c, false);
        E9.b.u(parcel, 5, this.f34445d);
        E9.b.y(parcel, 6, this.f34446e);
        E9.b.F(parcel, 7, this.f34447f, false);
        E9.b.b(parcel, a10);
    }
}
