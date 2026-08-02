package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.appsflyer.AFLogger;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Deprecated
/* loaded from: classes6.dex */
public final class AFa1bSDK {
    public static AFa1ySDK getRevenue(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        AFa1tSDK aFa1tSDK = new AFa1tSDK();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, aFa1tSDK, 1)) {
                if (context != null) {
                    context.unbindService(aFa1tSDK);
                }
                throw new IOException("Google Play connection failed");
            }
            if (aFa1tSDK.AFAdRevenueData) {
                throw new IllegalStateException("Cannot call get on this connection more than once");
            }
            aFa1tSDK.AFAdRevenueData = true;
            IBinder poll = aFa1tSDK.getMediationNetwork.poll(10L, TimeUnit.SECONDS);
            if (poll != null) {
                AFa1vSDK aFa1vSDK = new AFa1vSDK(poll);
                return new AFa1ySDK(aFa1vSDK.getMonetizationNetwork(), aFa1vSDK.AFAdRevenueData());
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        } finally {
            if (context != null) {
                context.unbindService(aFa1tSDK);
            }
        }
    }

    public static final class AFa1ySDK {
        public final String getMediationNetwork;
        private final boolean getMonetizationNetwork;

        AFa1ySDK(String str, boolean z) {
            this.getMediationNetwork = str;
            this.getMonetizationNetwork = z;
        }

        public final boolean getRevenue() {
            return this.getMonetizationNetwork;
        }
    }

    static final class AFa1tSDK implements ServiceConnection {
        final LinkedBlockingQueue<IBinder> getMediationNetwork = new LinkedBlockingQueue<>(1);
        boolean AFAdRevenueData = false;

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        AFa1tSDK() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.getMediationNetwork.put(iBinder);
            } catch (InterruptedException e) {
                AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", e);
            }
        }
    }

    static final class AFa1vSDK implements IInterface {
        private final IBinder getRevenue;

        AFa1vSDK(IBinder iBinder) {
            this.getRevenue = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.getRevenue;
        }

        public final String getMonetizationNetwork() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.getRevenue.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        final boolean AFAdRevenueData() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.getRevenue.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }
}
