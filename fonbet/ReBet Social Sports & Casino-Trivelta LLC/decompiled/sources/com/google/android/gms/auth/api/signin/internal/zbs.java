package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes2.dex */
public final class zbs extends com.google.android.gms.internal.p000authapi.zba implements IInterface {
    public zbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void zbc(zbr zbrVar, GoogleSignInOptions googleSignInOptions) {
        Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, zbrVar);
        com.google.android.gms.internal.p000authapi.zbc.zbb(zba, googleSignInOptions);
        zbb(101, zba);
    }

    public final void zbd(zbr zbrVar, GoogleSignInOptions googleSignInOptions) {
        Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, zbrVar);
        com.google.android.gms.internal.p000authapi.zbc.zbb(zba, googleSignInOptions);
        zbb(102, zba);
    }

    public final void zbe(zbr zbrVar, GoogleSignInOptions googleSignInOptions) {
        Parcel zba = zba();
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, zbrVar);
        com.google.android.gms.internal.p000authapi.zbc.zbb(zba, googleSignInOptions);
        zbb(103, zba);
    }
}
