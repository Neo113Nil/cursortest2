package com.mbridge.msdk.foundation.tools;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.a70;
import defpackage.is8;
import defpackage.zzl;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class c {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class b {
        private final String a;
        private final boolean b;

        public b(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public String a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* loaded from: classes3.dex */
    public final class d implements IInterface {
        private IBinder a;

        public d(IBinder iBinder) {
            this.a = iBinder;
        }

        public boolean a(boolean z) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(z ? 1 : 0);
                this.a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } catch (Throwable th) {
                try {
                    q0.b("AdvertisingIdClient", th.getMessage());
                    return false;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.a;
        }

        public String getId() throws RemoteException {
            String str;
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                str = obtain2.readString();
            } catch (Throwable th) {
                try {
                    q0.b("AdvertisingIdClient", th.getMessage());
                    str = null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            return str;
        }
    }

    public b a(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a70.r("Cannot be called from the main thread");
            return null;
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        ServiceConnectionC1261c serviceConnectionC1261c = new ServiceConnectionC1261c();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (!context.bindService(intent, serviceConnectionC1261c, 1)) {
            is8.e("Google Play connection failed");
            return null;
        }
        try {
            try {
                d dVar = new d(serviceConnectionC1261c.a());
                return new b(dVar.getId(), dVar.a(true));
            } catch (Exception e) {
                throw e;
            }
        } finally {
            context.unbindService(serviceConnectionC1261c);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.mbridge.msdk.foundation.tools.c$c, reason: collision with other inner class name */
    public final class ServiceConnectionC1261c implements ServiceConnection {
        private final LinkedBlockingQueue<IBinder> a;
        boolean b;

        private ServiceConnectionC1261c() {
            this.a = new LinkedBlockingQueue<>(1);
            this.b = false;
        }

        public IBinder a() throws InterruptedException {
            if (this.b) {
                zzl.s();
                return null;
            }
            this.b = true;
            return this.a.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.a.put(iBinder);
            } catch (InterruptedException e) {
                q0.b("AdvertisingIdClient", e.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
