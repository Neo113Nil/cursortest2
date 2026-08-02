package com.google.android.gms.signin.internal;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;
import da.i;

/* loaded from: classes2.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    public final int f34495a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectionResult f34496b;

    /* renamed from: c, reason: collision with root package name */
    public final zav f34497c;

    public zak(int i10, ConnectionResult connectionResult, zav zavVar) {
        this.f34495a = i10;
        this.f34496b = connectionResult;
        this.f34497c = zavVar;
    }

    public final ConnectionResult g() {
        return this.f34496b;
    }

    public final zav h() {
        return this.f34497c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.u(parcel, 1, this.f34495a);
        b.D(parcel, 2, this.f34496b, i10, false);
        b.D(parcel, 3, this.f34497c, i10, false);
        b.b(parcel, a10);
    }
}
