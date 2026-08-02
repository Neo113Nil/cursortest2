package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzbn;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfz extends zzbl implements zzgb {
    public zzfz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List A0(String str, String str2, String str3) {
        Parcel S1 = S1();
        S1.writeString(null);
        S1.writeString(str2);
        S1.writeString(str3);
        Parcel J = J(S1, 17);
        ArrayList createTypedArrayList = J.createTypedArrayList(zzah.CREATOR);
        J.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void B2(zzr zzrVar) {
        Parcel S1 = S1();
        zzbn.b(S1, zzrVar);
        Z1(S1, 18);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final byte[] H0(zzbh zzbhVar, String str) {
        Parcel S1 = S1();
        zzbn.b(S1, zzbhVar);
        S1.writeString(str);
        Parcel J = J(S1, 9);
        byte[] createByteArray = J.createByteArray();
        J.recycle();
        return createByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void K0(zzr zzrVar) {
        Parcel S1 = S1();
        zzbn.b(S1, zzrVar);
        Z1(S1, 25);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void L(zzr zzrVar, zzoo zzooVar, zzgh zzghVar) {
        Parcel S1 = S1();
        zzbn.b(S1, zzrVar);
        zzbn.b(S1, zzooVar);
        zzbn.c(S1, zzghVar);
        Z1(S1, 29);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void L3(zzr zzrVar) {
        Parcel S1 = S1();
        zzbn.b(S1, zzrVar);
        Z1(S1, 4);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List O(String str, String str2, String str3, boolean z) {
        Parcel S1 = S1();
        S1.writeString(null);
        S1.writeString(str2);
        S1.writeString(str3);
        ClassLoader classLoader = zzbn.a;
        S1.writeInt(z ? 1 : 0);
        Parcel J = J(S1, 15);
        ArrayList createTypedArrayList = J.createTypedArrayList(zzpl.CREATOR);
        J.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final String O1(zzr zzrVar) {
        Parcel S1 = S1();
        zzbn.b(S1, zzrVar);
        Parcel J = J(S1, 11);
        String readString = J.readString();
        J.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void P(zzah zzahVar, zzr zzrVar) {
        Parcel S1 = S1();
        zzbn.b(S1, zzahVar);
        zzbn.b(S1, zzrVar);
        Z1(S1, 12);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void U0(zzr zzrVar) {
        Parcel S1 = S1();
        zzbn.b(S1, zzrVar);
        Z1(S1, 6);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void X0(zzr zzrVar) {
        Parcel S1 = S1();
        zzbn.b(S1, zzrVar);
        Z1(S1, 26);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void b4(zzr zzrVar) {
        Parcel S1 = S1();
        zzbn.b(S1, zzrVar);
        Z1(S1, 27);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void c3(zzr zzrVar, Bundle bundle, zzge zzgeVar) {
        Parcel S1 = S1();
        zzbn.b(S1, zzrVar);
        zzbn.b(S1, bundle);
        zzbn.c(S1, zzgeVar);
        Z1(S1, 31);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List i4(String str, String str2, boolean z, zzr zzrVar) {
        Parcel S1 = S1();
        S1.writeString(str);
        S1.writeString(str2);
        ClassLoader classLoader = zzbn.a;
        S1.writeInt(z ? 1 : 0);
        zzbn.b(S1, zzrVar);
        Parcel J = J(S1, 14);
        ArrayList createTypedArrayList = J.createTypedArrayList(zzpl.CREATOR);
        J.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void j1(zzpl zzplVar, zzr zzrVar) {
        Parcel S1 = S1();
        zzbn.b(S1, zzplVar);
        zzbn.b(S1, zzrVar);
        Z1(S1, 2);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void k3(zzr zzrVar, zzaf zzafVar) {
        Parcel S1 = S1();
        zzbn.b(S1, zzrVar);
        zzbn.b(S1, zzafVar);
        Z1(S1, 30);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void o4(zzbh zzbhVar, zzr zzrVar) {
        Parcel S1 = S1();
        zzbn.b(S1, zzbhVar);
        zzbn.b(S1, zzrVar);
        Z1(S1, 1);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List r4(String str, String str2, zzr zzrVar) {
        Parcel S1 = S1();
        S1.writeString(str);
        S1.writeString(str2);
        zzbn.b(S1, zzrVar);
        Parcel J = J(S1, 16);
        ArrayList createTypedArrayList = J.createTypedArrayList(zzah.CREATOR);
        J.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final zzao w3(zzr zzrVar) {
        Parcel S1 = S1();
        zzbn.b(S1, zzrVar);
        Parcel J = J(S1, 21);
        zzao zzaoVar = (zzao) zzbn.a(J, zzao.CREATOR);
        J.recycle();
        return zzaoVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void x3(Bundle bundle, zzr zzrVar) {
        Parcel S1 = S1();
        zzbn.b(S1, bundle);
        zzbn.b(S1, zzrVar);
        Z1(S1, 19);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void y2(long j, String str, String str2, String str3) {
        Parcel S1 = S1();
        S1.writeLong(j);
        S1.writeString(str);
        S1.writeString(str2);
        S1.writeString(str3);
        Z1(S1, 10);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void y4(zzr zzrVar) {
        Parcel S1 = S1();
        zzbn.b(S1, zzrVar);
        Z1(S1, 20);
    }
}
