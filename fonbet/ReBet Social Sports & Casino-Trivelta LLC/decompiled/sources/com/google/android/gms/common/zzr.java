package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new G();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f32830a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32831b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32832c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32833d;

    /* renamed from: e, reason: collision with root package name */
    public final long f32834e;

    public zzr(boolean z10, String str, int i10, int i11, long j10) {
        this.f32830a = z10;
        this.f32831b = str;
        this.f32832c = M.a(i10) - 1;
        this.f32833d = s.a(i11) - 1;
        this.f32834e = j10;
    }

    public final String g() {
        return this.f32831b;
    }

    public final long h() {
        return this.f32834e;
    }

    public final int i() {
        return M.a(this.f32832c);
    }

    public final int j() {
        return s.a(this.f32833d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.g(parcel, 1, this.f32830a);
        E9.b.F(parcel, 2, this.f32831b, false);
        E9.b.u(parcel, 3, this.f32832c);
        E9.b.u(parcel, 4, this.f32833d);
        E9.b.y(parcel, 5, this.f32834e);
        E9.b.b(parcel, a10);
    }

    public final boolean zza() {
        return this.f32830a;
    }
}
