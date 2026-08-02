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
/* loaded from: classes4.dex */
public final class AFb1tSDK {
    public static AFa1zSDK getRevenue(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        AFa1ySDK aFa1ySDK = new AFa1ySDK();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, aFa1ySDK, 1)) {
                if (context != null) {
                    context.unbindService(aFa1ySDK);
                }
                throw new IOException("Google Play connection failed");
            }
            if (aFa1ySDK.getRevenue) {
                throw new IllegalStateException("Cannot call get on this connection more than once");
            }
            aFa1ySDK.getRevenue = true;
            IBinder poll = aFa1ySDK.getMediationNetwork.poll(10L, TimeUnit.SECONDS);
            if (poll != null) {
                AFa1vSDK aFa1vSDK = new AFa1vSDK(poll);
                return new AFa1zSDK(aFa1vSDK.getMediationNetwork(), aFa1vSDK.getMonetizationNetwork());
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        } finally {
            if (context != null) {
                context.unbindService(aFa1ySDK);
            }
        }
    }

    public static final class AFa1zSDK {
        public final String getCurrencyIso4217Code;
        private final boolean getRevenue;

        AFa1zSDK(String str, boolean z) {
            this.getCurrencyIso4217Code = str;
            this.getRevenue = z;
        }

        public final boolean AFAdRevenueData() {
            return this.getRevenue;
        }
    }

    static final class AFa1ySDK implements ServiceConnection {
        final LinkedBlockingQueue<IBinder> getMediationNetwork = new LinkedBlockingQueue<>(1);
        boolean getRevenue = false;

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        AFa1ySDK() {
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
        private final IBinder getCurrencyIso4217Code;

        AFa1vSDK(IBinder iBinder) {
            this.getCurrencyIso4217Code = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.getCurrencyIso4217Code;
        }

        public final String getMediationNetwork() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.getCurrencyIso4217Code.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        final boolean getMonetizationNetwork() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.getCurrencyIso4217Code.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }
}
