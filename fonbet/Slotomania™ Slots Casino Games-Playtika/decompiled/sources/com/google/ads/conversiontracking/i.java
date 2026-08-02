package com.google.ads.conversiontracking;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.util.Log;
import com.google.ads.conversiontracking.q;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class i {

    public static final class a {
        private final String a;
        private final boolean b;

        public a(String str, boolean z) {
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

    public static a a(Context context) throws IOException, IllegalStateException, j, k {
        p.a("Calling this from your main thread can lead to deadlock");
        return a(context, b(context));
    }

    static a a(Context context, n nVar) throws IOException {
        try {
            try {
                q a2 = q.a.a(nVar.a());
                a aVar = new a(a2.a(), a2.a(true));
                try {
                    return aVar;
                } catch (IllegalArgumentException e) {
                    return aVar;
                }
            } finally {
                try {
                    context.unbindService(nVar);
                } catch (IllegalArgumentException e2) {
                    Log.i("AdvertisingIdClient", "getAdvertisingIdInfo unbindService failed.", e2);
                }
            }
        } catch (RemoteException e3) {
            Log.i("AdvertisingIdClient", "GMS remote exception ", e3);
            throw new IOException("Remote exception");
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        }
    }

    private static n b(Context context) throws IOException, j, k {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            try {
                l.b(context);
                n nVar = new n();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (context.bindService(intent, nVar, 1)) {
                    return nVar;
                }
                throw new IOException("Connection failure");
            } catch (j e) {
                throw new IOException(e);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new j(9);
        }
    }
}
