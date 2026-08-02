package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.x5n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbnk extends zzbeu implements zzbnm {
    public zzbnk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void I0(IObjectWrapper iObjectWrapper) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        Z1(J, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final boolean r(IObjectWrapper iObjectWrapper) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        Parcel S1 = S1(J, 17);
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final boolean w0(IObjectWrapper iObjectWrapper) {
        Parcel J = J();
        zzbew.e(J, iObjectWrapper);
        Parcel S1 = S1(J, 10);
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final String zze(String str) {
        Parcel J = J();
        J.writeString(str);
        Parcel S1 = S1(J, 1);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final zzbmv zzf(String str) {
        zzbmv zzbmtVar;
        Parcel J = J();
        J.writeString(str);
        Parcel S1 = S1(J, 2);
        IBinder readStrongBinder = S1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbmtVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbmtVar = queryLocalInterface instanceof zzbmv ? (zzbmv) queryLocalInterface : new zzbmt(readStrongBinder);
        }
        S1.recycle();
        return zzbmtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final List zzg() {
        Parcel S1 = S1(J(), 3);
        ArrayList<String> createStringArrayList = S1.createStringArrayList();
        S1.recycle();
        return createStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final String zzh() {
        Parcel S1 = S1(J(), 4);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzi(String str) {
        Parcel J = J();
        J.writeString(str);
        Z1(J, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzj() {
        Z1(J(), 6);
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzl() {
        Z1(J(), 8);
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final IObjectWrapper zzm() {
        return x5n.i(S1(J(), 9));
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final boolean zzo() {
        Parcel S1 = S1(J(), 12);
        ClassLoader classLoader = zzbew.a;
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final boolean zzp() {
        Parcel S1 = S1(J(), 13);
        ClassLoader classLoader = zzbew.a;
        boolean z = S1.readInt() != 0;
        S1.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzr() {
        Z1(J(), 15);
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final zzbms zzs() {
        zzbms zzbmqVar;
        Parcel S1 = S1(J(), 16);
        IBinder readStrongBinder = S1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbmqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbmqVar = queryLocalInterface instanceof zzbms ? (zzbms) queryLocalInterface : new zzbmq(readStrongBinder);
        }
        S1.recycle();
        return zzbmqVar;
    }
}
