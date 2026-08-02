package com.google.android.gms.location;

import E9.b;
import V9.x;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new x();

    /* renamed from: a, reason: collision with root package name */
    public final long f33156a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33157b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkSource f33158c;

    /* renamed from: d, reason: collision with root package name */
    public final String f33159d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f33160e;

    /* renamed from: f, reason: collision with root package name */
    public final String f33161f;

    /* renamed from: g, reason: collision with root package name */
    public final long f33162g;

    /* renamed from: h, reason: collision with root package name */
    public String f33163h;
    private final int[] zze;

    public zzb(long j10, boolean z10, WorkSource workSource, String str, int[] iArr, boolean z11, String str2, long j11, String str3) {
        this.f33156a = j10;
        this.f33157b = z10;
        this.f33158c = workSource;
        this.f33159d = str;
        this.zze = iArr;
        this.f33160e = z11;
        this.f33161f = str2;
        this.f33162g = j11;
        this.f33163h = str3;
    }

    public final zzb g(String str) {
        this.f33163h = str;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        AbstractC3191o.m(parcel);
        int a10 = b.a(parcel);
        b.y(parcel, 1, this.f33156a);
        b.g(parcel, 2, this.f33157b);
        b.D(parcel, 3, this.f33158c, i10, false);
        b.F(parcel, 4, this.f33159d, false);
        b.v(parcel, 5, this.zze, false);
        b.g(parcel, 6, this.f33160e);
        b.F(parcel, 7, this.f33161f, false);
        b.y(parcel, 8, this.f33162g);
        b.F(parcel, 9, this.f33163h, false);
        b.b(parcel, a10);
    }
}
