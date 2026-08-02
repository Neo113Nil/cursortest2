package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzb extends Thread {
    public final WeakReference a;
    public final long b;
    public final CountDownLatch c;

    public zzb(AdvertisingIdClient advertisingIdClient, long j) {
        super("AdIdClientAutoDisconnectThread");
        this.a = new WeakReference(advertisingIdClient);
        this.b = j;
        this.c = new CountDownLatch(1);
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        WeakReference weakReference = this.a;
        try {
            if (this.c.await(this.b, TimeUnit.MILLISECONDS) || (advertisingIdClient = (AdvertisingIdClient) weakReference.get()) == null) {
                return;
            }
            advertisingIdClient.zza();
        } catch (InterruptedException unused) {
            AdvertisingIdClient advertisingIdClient2 = (AdvertisingIdClient) weakReference.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.zza();
            }
        }
    }
}
