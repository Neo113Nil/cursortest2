package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzbn;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.b2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3217b2 extends zzbl implements InterfaceC3241e2 {
    public C3217b2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3241e2
    public final void E(zzbg zzbgVar, zzr zzrVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzbgVar);
        zzbn.zzc(zza, zzrVar);
        zzc(1, zza);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3241e2
    public final void F(zzr zzrVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzrVar);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3241e2
    public final List F0(String str, String str2, zzr zzrVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbn.zzc(zza, zzrVar);
        Parcel zzP = zzP(16, zza);
        ArrayList createTypedArrayList = zzP.createTypedArrayList(zzah.CREATOR);
        zzP.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3241e2
    public final void H(zzr zzrVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzrVar);
        zzc(26, zza);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3241e2
    public final byte[] J(zzbg zzbgVar, String str) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzbgVar);
        zza.writeString(str);
        Parcel zzP = zzP(9, zza);
        byte[] createByteArray = zzP.createByteArray();
        zzP.recycle();
        return createByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3241e2
    public final void K0(zzr zzrVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzrVar);
        zzc(20, zza);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3241e2
    public final void M(zzpl zzplVar, zzr zzrVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzplVar);
        zzbn.zzc(zza, zzrVar);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3241e2
    public final String S(zzr zzrVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzrVar);
        Parcel zzP = zzP(11, zza);
        String readString = zzP.readString();
        zzP.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3241e2
    public final void a0(long j10, String str, String str2, String str3) {
        Parcel zza = zza();
        zza.writeLong(j10);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeString(str3);
        zzc(10, zza);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3241e2
    public final void c0(zzr zzrVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzrVar);
        zzc(18, zza);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3241e2
    public final void d(zzr zzrVar, zzoo zzooVar, InterfaceC3289k2 interfaceC3289k2) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzrVar);
        zzbn.zzc(zza, zzooVar);
        zzbn.zzd(zza, interfaceC3289k2);
        zzc(29, zza);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3241e2
    public final void h0(zzr zzrVar, Bundle bundle, InterfaceC3265h2 interfaceC3265h2) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzrVar);
        zzbn.zzc(zza, bundle);
        zzbn.zzd(zza, interfaceC3265h2);
        zzc(31, zza);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3241e2
    public final List j(String str, String str2, String str3, boolean z10) {
        Parcel zza = zza();
        zza.writeString(null);
        zza.writeString(str2);
        zza.writeString(str3);
        int i10 = zzbn.zza;
        zza.writeInt(z10 ? 1 : 0);
        Parcel zzP = zzP(15, zza);
        ArrayList createTypedArrayList = zzP.createTypedArrayList(zzpl.CREATOR);
        zzP.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3241e2
    public final void k(zzah zzahVar, zzr zzrVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzahVar);
        zzbn.zzc(zza, zzrVar);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3241e2
    public final void l0(zzr zzrVar, zzaf zzafVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzrVar);
        zzbn.zzc(zza, zzafVar);
        zzc(30, zza);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3241e2
    public final zzao o0(zzr zzrVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzrVar);
        Parcel zzP = zzP(21, zza);
        zzao zzaoVar = (zzao) zzbn.zzb(zzP, zzao.CREATOR);
        zzP.recycle();
        return zzaoVar;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3241e2
    public final void r0(Bundle bundle, zzr zzrVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, bundle);
        zzbn.zzc(zza, zzrVar);
        zzc(19, zza);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3241e2
    public final void u0(zzr zzrVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzrVar);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3241e2
    public final List x(String str, String str2, String str3) {
        Parcel zza = zza();
        zza.writeString(null);
        zza.writeString(str2);
        zza.writeString(str3);
        Parcel zzP = zzP(17, zza);
        ArrayList createTypedArrayList = zzP.createTypedArrayList(zzah.CREATOR);
        zzP.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3241e2
    public final void x0(zzr zzrVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzrVar);
        zzc(27, zza);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3241e2
    public final List y0(String str, String str2, boolean z10, zzr zzrVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        int i10 = zzbn.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzbn.zzc(zza, zzrVar);
        Parcel zzP = zzP(14, zza);
        ArrayList createTypedArrayList = zzP.createTypedArrayList(zzpl.CREATOR);
        zzP.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3241e2
    public final void z(zzr zzrVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzrVar);
        zzc(25, zza);
    }
}
