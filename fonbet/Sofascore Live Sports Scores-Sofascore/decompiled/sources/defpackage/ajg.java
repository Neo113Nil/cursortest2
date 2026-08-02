package defpackage;

import android.content.Context;
import com.equativ.displaysdk.coresdkdisplay.util.SCSGoogleServicesApiProxy;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.internal.identity.zzbi;
import com.google.android.gms.location.LocationServices;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ajg implements Runnable {
    public final /* synthetic */ a8p a;

    public ajg(a8p a8pVar) {
        this.a = a8pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            synchronized (((SCSGoogleServicesApiProxy) this.a.c)) {
                System.currentTimeMillis();
                try {
                    SCSGoogleServicesApiProxy.a = AdvertisingIdClient.getAdvertisingIdInfo((Context) this.a.b);
                    fjg c = fjg.c();
                    System.currentTimeMillis();
                    c.f(1);
                } catch (Exception e) {
                    fjg c2 = fjg.c();
                    e.getMessage();
                    c2.f(3);
                }
                Context applicationContext = ((Context) this.a.b).getApplicationContext();
                Api api = LocationServices.a;
                SCSGoogleServicesApiProxy.c = new zzbi(applicationContext, zzbi.l, Api.ApiOptions.E7, GoogleApi.Settings.c);
                ((SCSGoogleServicesApiProxy) this.a.c).getPlatformLocation();
            }
        } catch (NoClassDefFoundError e2) {
            String message = e2.getMessage();
            fjg c3 = fjg.c();
            if (message == null) {
                e2.toString();
            }
            c3.f(3);
        } catch (Throwable th) {
            fjg c4 = fjg.c();
            th.toString();
            c4.f(3);
        }
    }
}
