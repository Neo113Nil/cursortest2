package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.internal.zzf;
import com.google.android.gms.cast.framework.media.internal.zzg;
import com.google.android.gms.cast.framework.zzaj;
import com.google.android.gms.cast.framework.zzak;
import com.google.android.gms.cast.framework.zzap;
import com.google.android.gms.cast.framework.zzaq;
import com.google.android.gms.cast.framework.zzar;
import com.google.android.gms.cast.framework.zzas;
import com.google.android.gms.cast.framework.zzat;
import com.google.android.gms.cast.framework.zzau;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import defpackage.kmn;
import defpackage.wqn;
import defpackage.x7p;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbb extends zza implements zzbc {
    @Override // com.google.android.gms.internal.cast.zzbc
    public final zzar Q2(ObjectWrapper objectWrapper, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        zzar zzapVar;
        Parcel J = J();
        zzc.c(J, objectWrapper);
        zzc.c(J, iObjectWrapper);
        zzc.c(J, iObjectWrapper2);
        Parcel S1 = S1(J, 5);
        IBinder readStrongBinder = S1.readStrongBinder();
        int i = zzaq.a;
        if (readStrongBinder == null) {
            zzapVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            zzapVar = queryLocalInterface instanceof zzar ? (zzar) queryLocalInterface : new zzap(readStrongBinder, "com.google.android.gms.cast.framework.IReconnectionService");
        }
        S1.recycle();
        return zzapVar;
    }

    @Override // com.google.android.gms.internal.cast.zzbc
    public final zzau S0(String str, String str2, kmn kmnVar) {
        zzau zzasVar;
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        zzc.c(J, kmnVar);
        Parcel S1 = S1(J, 2);
        IBinder readStrongBinder = S1.readStrongBinder();
        int i = zzat.a;
        if (readStrongBinder == null) {
            zzasVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            zzasVar = queryLocalInterface instanceof zzau ? (zzau) queryLocalInterface : new zzas(readStrongBinder, "com.google.android.gms.cast.framework.ISession");
        }
        S1.recycle();
        return zzasVar;
    }

    @Override // com.google.android.gms.internal.cast.zzbc
    public final zzak V1(CastOptions castOptions, IObjectWrapper iObjectWrapper, x7p x7pVar) {
        zzak zzaiVar;
        Parcel J = J();
        zzc.b(J, castOptions);
        zzc.c(J, iObjectWrapper);
        zzc.c(J, x7pVar);
        Parcel S1 = S1(J, 3);
        IBinder readStrongBinder = S1.readStrongBinder();
        int i = zzaj.a;
        if (readStrongBinder == null) {
            zzaiVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            zzaiVar = queryLocalInterface instanceof zzak ? (zzak) queryLocalInterface : new com.google.android.gms.cast.framework.zzai(readStrongBinder, "com.google.android.gms.cast.framework.ICastSession");
        }
        S1.recycle();
        return zzaiVar;
    }

    @Override // com.google.android.gms.internal.cast.zzbc
    public final zzg b1(ObjectWrapper objectWrapper, ObjectWrapper objectWrapper2, wqn wqnVar, int i, int i2) {
        zzg zzeVar;
        Parcel J = J();
        zzc.c(J, objectWrapper);
        zzc.c(J, objectWrapper2);
        zzc.c(J, wqnVar);
        J.writeInt(i);
        J.writeInt(i2);
        J.writeInt(0);
        J.writeLong(CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE);
        J.writeInt(5);
        J.writeInt(333);
        J.writeInt(10000);
        Parcel S1 = S1(J, 7);
        IBinder readStrongBinder = S1.readStrongBinder();
        int i3 = zzf.a;
        if (readStrongBinder == null) {
            zzeVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            zzeVar = queryLocalInterface instanceof zzg ? (zzg) queryLocalInterface : new com.google.android.gms.cast.framework.media.internal.zze(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
        }
        S1.recycle();
        return zzeVar;
    }

    @Override // com.google.android.gms.internal.cast.zzbc
    public final zzg d4(ObjectWrapper objectWrapper, wqn wqnVar, int i, int i2) {
        zzg zzeVar;
        Parcel J = J();
        zzc.c(J, objectWrapper);
        zzc.c(J, wqnVar);
        J.writeInt(i);
        J.writeInt(i2);
        J.writeInt(0);
        J.writeLong(CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE);
        J.writeInt(5);
        J.writeInt(333);
        J.writeInt(10000);
        Parcel S1 = S1(J, 6);
        IBinder readStrongBinder = S1.readStrongBinder();
        int i3 = zzf.a;
        if (readStrongBinder == null) {
            zzeVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            zzeVar = queryLocalInterface instanceof zzg ? (zzg) queryLocalInterface : new com.google.android.gms.cast.framework.media.internal.zze(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
        }
        S1.recycle();
        return zzeVar;
    }

    @Override // com.google.android.gms.internal.cast.zzbc
    public final com.google.android.gms.cast.framework.zzah x0(ObjectWrapper objectWrapper, CastOptions castOptions, zzbe zzbeVar, HashMap hashMap) {
        com.google.android.gms.cast.framework.zzah zzafVar;
        Parcel J = J();
        zzc.c(J, objectWrapper);
        zzc.b(J, castOptions);
        zzc.c(J, zzbeVar);
        J.writeMap(hashMap);
        Parcel S1 = S1(J, 1);
        IBinder readStrongBinder = S1.readStrongBinder();
        int i = com.google.android.gms.cast.framework.zzag.a;
        if (readStrongBinder == null) {
            zzafVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            zzafVar = queryLocalInterface instanceof com.google.android.gms.cast.framework.zzah ? (com.google.android.gms.cast.framework.zzah) queryLocalInterface : new com.google.android.gms.cast.framework.zzaf(readStrongBinder, "com.google.android.gms.cast.framework.ICastContext");
        }
        S1.recycle();
        return zzafVar;
    }

    @Override // com.google.android.gms.internal.cast.zzbc
    public final int zze() {
        Parcel S1 = S1(J(), 8);
        int readInt = S1.readInt();
        S1.recycle();
        return readInt;
    }
}
