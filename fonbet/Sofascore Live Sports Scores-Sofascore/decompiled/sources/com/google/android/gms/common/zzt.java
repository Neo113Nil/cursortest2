package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.pto;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new zzu();
    public final String a;
    public final pto b;
    public final boolean c;
    public final boolean d;

    public zzt(String str, IBinder iBinder, boolean z, boolean z2) {
        this.a = str;
        pto ptoVar = null;
        if (iBinder != null) {
            try {
                int i = zzw.a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                IObjectWrapper zzd = (queryLocalInterface instanceof zzx ? (zzx) queryLocalInterface : new zzv(iBinder, "com.google.android.gms.common.internal.ICertData")).zzd();
                byte[] bArr = zzd == null ? null : (byte[]) ObjectWrapper.Z1(zzd);
                if (bArr != null) {
                    ptoVar = new pto(bArr);
                }
            } catch (RemoteException unused) {
            }
        }
        this.b = ptoVar;
        this.c = z;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 1, this.a, false);
        pto ptoVar = this.b;
        if (ptoVar == null) {
            ptoVar = null;
        }
        SafeParcelWriter.f(parcel, 2, ptoVar);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        SafeParcelWriter.t(parcel, s);
    }

    public zzt(String str, pto ptoVar, boolean z, boolean z2) {
        this.a = str;
        this.b = ptoVar;
        this.c = z;
        this.d = z2;
    }
}
