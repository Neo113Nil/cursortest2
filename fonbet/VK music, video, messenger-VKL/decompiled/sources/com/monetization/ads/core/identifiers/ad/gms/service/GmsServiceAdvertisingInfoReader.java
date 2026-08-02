package com.monetization.ads.core.identifiers.ad.gms.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import yads.ce;

/* loaded from: classes14.dex */
public final class GmsServiceAdvertisingInfoReader implements ce, IInterface {
    private final IBinder a;

    public GmsServiceAdvertisingInfoReader(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.a;
    }

    @Override // yads.ce
    public Boolean readAdTrackingLimited() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            boolean z = true;
            obtain.writeInt(1);
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            obtain2.recycle();
            obtain.recycle();
            return valueOf;
        } catch (Throwable unused) {
            obtain2.recycle();
            obtain.recycle();
            return null;
        }
    }

    @Override // yads.ce
    public String readAdvertisingId() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (Throwable unused) {
            obtain2.recycle();
            obtain.recycle();
            return null;
        }
    }
}
