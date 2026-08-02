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
import com.appsflyer.sdk_base.logger.LogTag;
import defpackage.a70;
import defpackage.is8;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes.dex */
public final class AFb1lSDK {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class AFa1tSDK implements IInterface {
        private final IBinder unregisterClient;

        public AFa1tSDK(IBinder iBinder) {
            this.unregisterClient = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.unregisterClient;
        }

        public final boolean d() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.unregisterClient.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final String unregisterClient() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.unregisterClient.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class AFa1zSDK {
        public final boolean AFKeystoreWrapper;
        public final String unregisterClient;

        public AFa1zSDK(String str, boolean z) {
            this.unregisterClient = str;
            this.AFKeystoreWrapper = z;
        }
    }

    public static AFa1zSDK registerClient(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a70.r("Cannot be called from the main thread");
            return null;
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        AFa1vSDK aFa1vSDK = new AFa1vSDK();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, aFa1vSDK, 1)) {
                context.unbindService(aFa1vSDK);
                is8.e("Google Play connection failed");
                return null;
            }
            if (aFa1vSDK.AFLogger) {
                throw new IllegalStateException("Cannot call get on this connection more than once");
            }
            aFa1vSDK.AFLogger = true;
            IBinder poll = aFa1vSDK.unregisterClient.poll(10L, TimeUnit.SECONDS);
            if (poll == null) {
                throw new TimeoutException("Timed out waiting for the service connection");
            }
            AFa1tSDK aFa1tSDK = new AFa1tSDK(poll);
            return new AFa1zSDK(aFa1tSDK.unregisterClient(), aFa1tSDK.d());
        } finally {
            context.unbindService(aFa1vSDK);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class AFa1vSDK implements ServiceConnection {
        final LinkedBlockingQueue<IBinder> unregisterClient = new LinkedBlockingQueue<>(1);
        boolean AFLogger = false;

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.unregisterClient.put(iBinder);
            } catch (InterruptedException e) {
                AFLogger.INSTANCE.e(LogTag.ADVERTISING_ID, "onServiceConnected Interrupted", e, false, false);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
