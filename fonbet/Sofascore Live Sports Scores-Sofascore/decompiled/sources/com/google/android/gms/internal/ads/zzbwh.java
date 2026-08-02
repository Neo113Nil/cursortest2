package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.x5n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbwh extends zzbeu implements zzbwj {
    public zzbwh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void B(IObjectWrapper iObjectWrapper) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        Z1(J, 20);
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void M2(IObjectWrapper iObjectWrapper) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        Z1(J, 22);
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void e() {
        Z1(J(), 26);
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void e2() {
        Z1(J(), 19);
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void f0(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        zzbew.e(J, iObjectWrapper2);
        zzbew.e(J, iObjectWrapper3);
        Z1(J, 21);
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final float zzA() {
        Parcel S1 = S1(J(), 24);
        float readFloat = S1.readFloat();
        S1.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final float zzB() {
        Parcel S1 = S1(J(), 25);
        float readFloat = S1.readFloat();
        S1.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final String zze() {
        Parcel S1 = S1(J(), 2);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final List zzf() {
        Parcel S1 = S1(J(), 3);
        ArrayList readArrayList = S1.readArrayList(zzbew.a);
        S1.recycle();
        return readArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final String zzg() {
        Parcel S1 = S1(J(), 4);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final zzbmv zzh() {
        Parcel S1 = S1(J(), 5);
        zzbmv E4 = zzbmu.E4(S1.readStrongBinder());
        S1.recycle();
        return E4;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final String zzi() {
        Parcel S1 = S1(J(), 6);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final String zzj() {
        Parcel S1 = S1(J(), 7);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final double zzk() {
        Parcel S1 = S1(J(), 8);
        double readDouble = S1.readDouble();
        S1.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final String zzl() {
        Parcel S1 = S1(J(), 9);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final String zzm() {
        Parcel S1 = S1(J(), 10);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final com.google.android.gms.ads.internal.client.zzea zzn() {
        Parcel S1 = S1(J(), 11);
        com.google.android.gms.ads.internal.client.zzea zza = com.google.android.gms.ads.internal.client.zzdz.zza(S1.readStrongBinder());
        S1.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final zzbmo zzo() {
        Parcel S1 = S1(J(), 12);
        zzbmo E4 = zzbmn.E4(S1.readStrongBinder());
        S1.recycle();
        return E4;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final IObjectWrapper zzp() {
        return x5n.i(S1(J(), 13));
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final IObjectWrapper zzq() {
        return x5n.i(S1(J(), 14));
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final IObjectWrapper zzr() {
        return x5n.i(S1(J(), 15));
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final Bundle zzs() {
        Parcel S1 = S1(J(), 16);
        Bundle bundle = (Bundle) zzbew.b(S1, Bundle.CREATOR);
        S1.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final boolean zzt() {
        Parcel S1 = S1(J(), 17);
        ClassLoader classLoader = zzbew.a;
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final boolean zzu() {
        Parcel S1 = S1(J(), 18);
        ClassLoader classLoader = zzbew.a;
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final float zzz() {
        Parcel S1 = S1(J(), 23);
        float readFloat = S1.readFloat();
        S1.recycle();
        return readFloat;
    }
}
