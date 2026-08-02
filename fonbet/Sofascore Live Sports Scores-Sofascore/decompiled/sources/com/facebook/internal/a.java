package com.facebook.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a implements IInterface {
    public final IBinder a;

    public a(IBinder iBinder) {
        iBinder.getClass();
        this.a = iBinder;
    }

    public final String J() {
        Parcel obtain = Parcel.obtain();
        obtain.getClass();
        Parcel obtain2 = Parcel.obtain();
        obtain2.getClass();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean S1() {
        Parcel obtain = Parcel.obtain();
        obtain.getClass();
        Parcel obtain2 = Parcel.obtain();
        obtain2.getClass();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            obtain.writeInt(1);
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
