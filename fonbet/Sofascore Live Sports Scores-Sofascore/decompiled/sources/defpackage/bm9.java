package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bm9 implements dm9 {
    public IBinder a;

    public final boolean D4(aa4 aa4Var, Uri uri) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(dm9.r7);
            obtain.writeStrongInterface(aa4Var);
            obtain.writeTypedObject(uri, 0);
            if (!this.a.transact(7, obtain, obtain2, 0)) {
                throw new RemoteException("Method requestPostMessageChannel is unimplemented.");
            }
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean E4(aa4 aa4Var, Uri uri, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(dm9.r7);
            obtain.writeStrongInterface(aa4Var);
            obtain.writeTypedObject(uri, 0);
            obtain.writeTypedObject(bundle, 0);
            if (!this.a.transact(11, obtain, obtain2, 0)) {
                throw new RemoteException("Method requestPostMessageChannelWithExtras is unimplemented.");
            }
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean F4(aa4 aa4Var, ia4 ia4Var, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(dm9.r7);
            obtain.writeStrongInterface(aa4Var);
            obtain.writeStrongBinder(ia4Var);
            obtain.writeTypedObject(bundle, 0);
            if (!this.a.transact(14, obtain, obtain2, 0)) {
                throw new RemoteException("Method setEngagementSignalsCallback is unimplemented.");
            }
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean G4() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(dm9.r7);
            obtain.writeLong(0L);
            if (!this.a.transact(2, obtain, obtain2, 0)) {
                throw new RemoteException("Method warmup is unimplemented.");
            }
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean J(aa4 aa4Var, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(dm9.r7);
            obtain.writeStrongInterface(aa4Var);
            obtain.writeTypedObject(bundle, 0);
            if (!this.a.transact(13, obtain, obtain2, 0)) {
                throw new RemoteException("Method isEngagementSignalsApiAvailable is unimplemented.");
            }
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean S1(aa4 aa4Var, Uri uri, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(dm9.r7);
            obtain.writeStrongInterface(aa4Var);
            obtain.writeTypedObject(uri, 0);
            obtain.writeTypedObject(bundle, 0);
            obtain.writeInt(-1);
            if (!this.a.transact(4, obtain, obtain2, 0)) {
                throw new RemoteException("Method mayLaunchUrl is unimplemented.");
            }
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean Z1(aa4 aa4Var) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(dm9.r7);
            obtain.writeStrongInterface(aa4Var);
            if (!this.a.transact(3, obtain, obtain2, 0)) {
                throw new RemoteException("Method newSession is unimplemented.");
            }
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

    public final int l2(aa4 aa4Var, String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(dm9.r7);
            obtain.writeStrongInterface(aa4Var);
            obtain.writeString(str);
            obtain.writeTypedObject(bundle, 0);
            if (!this.a.transact(8, obtain, obtain2, 0)) {
                throw new RemoteException("Method postMessage is unimplemented.");
            }
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
