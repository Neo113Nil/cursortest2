package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.u0;

/* loaded from: classes2.dex */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new H();

    /* renamed from: a, reason: collision with root package name */
    public final String f32835a;

    /* renamed from: b, reason: collision with root package name */
    public final z f32836b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f32837c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f32838d;

    public zzt(String str, z zVar, boolean z10, boolean z11) {
        this.f32835a = str;
        this.f32836b = zVar;
        this.f32837c = z10;
        this.f32838d = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f32835a;
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 1, str, false);
        z zVar = this.f32836b;
        if (zVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            zVar = null;
        }
        E9.b.t(parcel, 2, zVar, false);
        E9.b.g(parcel, 3, this.f32837c);
        E9.b.g(parcel, 4, this.f32838d);
        E9.b.b(parcel, a10);
    }

    public zzt(String str, IBinder iBinder, boolean z10, boolean z11) {
        this.f32835a = str;
        A a10 = null;
        if (iBinder != null) {
            try {
                N9.b zzd = u0.c(iBinder).zzd();
                byte[] bArr = zzd == null ? null : (byte[]) N9.d.g(zzd);
                if (bArr != null) {
                    a10 = new A(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f32836b = a10;
        this.f32837c = z10;
        this.f32838d = z11;
    }
}
