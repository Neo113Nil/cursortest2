package com.digitalturbine.ignite.cl.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public interface IIgniteServiceCallback extends IInterface {
    void onError(String str) throws RemoteException;

    void onProgress(String str) throws RemoteException;

    void onScheduled(String str) throws RemoteException;

    void onStart(String str) throws RemoteException;

    void onSuccess(String str) throws RemoteException;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Stub extends Binder implements IIgniteServiceCallback {
        public Stub() {
            attachInterface(this, "com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback");
                return true;
            }
            if (i == 1) {
                onScheduled(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                onStart(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                onProgress(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i == 4) {
                onSuccess(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i != 5) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onError(parcel.readString());
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
