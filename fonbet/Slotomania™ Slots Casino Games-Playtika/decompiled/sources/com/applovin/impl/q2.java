package com.applovin.impl;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.q2;
import java.security.SecureRandom;

/* loaded from: classes3.dex */
public class q2 {
    private final com.applovin.impl.sdk.l a;
    private final com.applovin.impl.sdk.p b;

    /* JADX INFO: Access modifiers changed from: private */
    static class a implements ServiceConnection {
        private final com.applovin.impl.sdk.p a;
        private final u4 b;

        public a(com.applovin.impl.sdk.p pVar, u4 u4Var) {
            this.a = pVar;
            this.b = u4Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            try {
                com.applovin.impl.sdk.l.p().unbindService(this);
            } catch (Exception e) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.a.d("LicenseVerificationManager", "Failed to unbind license service", e);
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (com.applovin.impl.sdk.p.a()) {
                this.a.a("LicenseVerificationManager", "License service connected: " + componentName);
            }
            int nextInt = new SecureRandom().nextInt();
            b bVar = new b(this.a, this.b, nextInt, new Runnable() { // from class: com.applovin.impl.q2$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    q2.a.this.a();
                }
            });
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
                obtain.writeLong(nextInt);
                obtain.writeString(com.applovin.impl.sdk.l.p().getPackageName());
                obtain.writeStrongBinder(bVar);
                if (iBinder.transact(1, obtain, null, 1)) {
                } else {
                    throw new RemoteException("transact() returned false");
                }
            } catch (Exception e) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.a.a("LicenseVerificationManager", "Failed to check license", e);
                }
                a();
                this.b.a((Object) e);
            } finally {
                obtain.recycle();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IllegalStateException illegalStateException = new IllegalStateException("License service disconnected");
            if (com.applovin.impl.sdk.p.a()) {
                this.a.k("LicenseVerificationManager", illegalStateException.getMessage());
            }
            this.b.a((Object) illegalStateException);
        }
    }

    private static final class b extends Binder {
        private final com.applovin.impl.sdk.p a;
        private final u4 b;
        private final int c;
        private final Runnable d;

        public b(com.applovin.impl.sdk.p pVar, u4 u4Var, int i, Runnable runnable) {
            this.a = pVar;
            this.b = u4Var;
            this.c = i;
            this.d = runnable;
        }

        @Override // android.os.Binder, android.os.IBinder
        public String getInterfaceDescriptor() {
            return "com.android.vending.licensing.ILicenseResultListener";
        }

        @Override // android.os.Binder
        protected boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            try {
                parcel.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (com.applovin.impl.sdk.p.a()) {
                    this.a.a("LicenseVerificationManager", "Verified with code " + readInt);
                }
                this.b.b(r2.a().b(readString).a(readString2).b(readInt).a(this.c).a());
                if (parcel2 != null) {
                    parcel2.writeNoException();
                }
                return true;
            } catch (Throwable th) {
                try {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.a.a("LicenseVerificationManager", "Exception handling verifyLicense callback", th);
                    }
                    this.b.a((Object) new Exception(th));
                    this.d.run();
                    return false;
                } finally {
                    this.d.run();
                }
            }
        }
    }

    public q2(com.applovin.impl.sdk.l lVar) {
        this.a = lVar;
        this.b = lVar.Q();
    }

    public u4 a(long j) {
        u4 u4Var = new u4("verify_license");
        if (j > 0) {
            l6.a(j, u4Var, new Exception("License Verification Timed Out"), "verify_license_timeout", this.a);
        }
        try {
            if (!com.applovin.impl.sdk.l.p().bindService(new Intent("com.android.vending.licensing.ILicensingService").setPackage("com.android.vending"), new a(this.b, u4Var), 1)) {
                Exception exc = new Exception("Failed to bind to license service");
                if (com.applovin.impl.sdk.p.a()) {
                    this.b.k("LicenseVerificationManager", exc.getMessage());
                }
                u4Var.a((Object) exc);
                return u4Var;
            }
        } catch (Exception e) {
            if (com.applovin.impl.sdk.p.a()) {
                this.b.a("LicenseVerificationManager", "Failed to verify license", e);
            }
            u4Var.a((Object) e);
        }
        return u4Var;
    }
}
