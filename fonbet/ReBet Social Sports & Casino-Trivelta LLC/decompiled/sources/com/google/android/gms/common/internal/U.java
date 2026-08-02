package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class U implements InterfaceC3187k {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f32676a;

    public U(IBinder iBinder) {
        this.f32676a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f32676a;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3187k
    public final void b0(InterfaceC3186j interfaceC3186j, GetServiceRequest getServiceRequest) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(interfaceC3186j != null ? interfaceC3186j.asBinder() : null);
            if (getServiceRequest != null) {
                obtain.writeInt(1);
                k0.a(getServiceRequest, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f32676a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th2) {
            obtain2.recycle();
            obtain.recycle();
            throw th2;
        }
    }
}
