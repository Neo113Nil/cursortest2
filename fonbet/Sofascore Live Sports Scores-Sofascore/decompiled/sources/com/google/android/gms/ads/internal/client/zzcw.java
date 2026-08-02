package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbsh;
import com.google.android.gms.internal.ads.zzbso;
import com.google.android.gms.internal.ads.zzbvu;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcw extends zzbeu implements zzcy {
    public zzcw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zze() throws RemoteException {
        Z1(J(), 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzf(float f) throws RemoteException {
        Parcel J = J();
        J.writeFloat(f);
        Z1(J, 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzg(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzh(boolean z) throws RemoteException {
        Parcel J = J();
        ClassLoader classLoader = zzbew.a;
        J.writeInt(z ? 1 : 0);
        Z1(J, 4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzi(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        J.writeString(str);
        Z1(J, 5);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzj(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel J = J();
        J.writeString(null);
        zzbew.e(J, iObjectWrapper);
        Z1(J, 6);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final float zzk() throws RemoteException {
        Parcel S1 = S1(J(), 7);
        float readFloat = S1.readFloat();
        S1.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final boolean zzl() throws RemoteException {
        Parcel S1 = S1(J(), 8);
        ClassLoader classLoader = zzbew.a;
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final String zzm() throws RemoteException {
        Parcel S1 = S1(J(), 9);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzn(String str) throws RemoteException {
        Parcel J = J();
        J.writeString(str);
        Z1(J, 10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzo(zzbvu zzbvuVar) throws RemoteException {
        Parcel J = J();
        zzbew.e(J, zzbvuVar);
        Z1(J, 11);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzp(zzbso zzbsoVar) throws RemoteException {
        Parcel J = J();
        zzbew.e(J, zzbsoVar);
        Z1(J, 12);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final List zzq() throws RemoteException {
        Parcel S1 = S1(J(), 13);
        ArrayList createTypedArrayList = S1.createTypedArrayList(zzbsh.CREATOR);
        S1.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzr(zzfr zzfrVar) throws RemoteException {
        Parcel J = J();
        zzbew.c(J, zzfrVar);
        Z1(J, 14);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzs() throws RemoteException {
        Z1(J(), 15);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzt(zzdk zzdkVar) throws RemoteException {
        Parcel J = J();
        zzbew.e(J, zzdkVar);
        Z1(J, 16);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzu(boolean z) throws RemoteException {
        Parcel J = J();
        ClassLoader classLoader = zzbew.a;
        J.writeInt(z ? 1 : 0);
        Z1(J, 17);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzv(String str) throws RemoteException {
        Parcel J = J();
        J.writeString(str);
        Z1(J, 18);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzw() throws RemoteException {
        Z1(J(), 19);
    }
}
