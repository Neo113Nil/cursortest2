package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import c6.e;
import c6.f;
import c7.d;
import g6.v;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class AdvertisingIdClient {
    private static final Object zzg = new Object();
    private static volatile AdvertisingIdClient zzh;
    c6.a zza;
    d zzb;
    boolean zzc;
    final Object zzd;
    b zze;
    final long zzf;
    private final Context zzi;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static final class Info {
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(String str, boolean z5) {
            this.zza = str;
            this.zzb = z5;
        }

        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        @NonNull
        public String toString() {
            return "{" + this.zza + "}" + this.zzb;
        }
    }

    public AdvertisingIdClient(@NonNull Context context) {
        this(context, 30000L, false, false);
    }

    @NonNull
    public static Info getAdvertisingIdInfo(@NonNull Context context) throws IOException, IllegalStateException, e, f {
        Info zzf;
        long elapsedRealtime;
        AdvertisingIdClient advertisingIdClient = zzh;
        if (advertisingIdClient == null) {
            synchronized (zzg) {
                try {
                    advertisingIdClient = zzh;
                    if (advertisingIdClient == null) {
                        Log.d("AdvertisingIdClient", "Creating AdvertisingIdClient");
                        advertisingIdClient = new AdvertisingIdClient(context);
                        zzh = advertisingIdClient;
                    }
                } finally {
                }
            }
        }
        AdvertisingIdClient advertisingIdClient2 = advertisingIdClient;
        Log.d("AdvertisingIdClient", "AdvertisingIdClient already created.");
        c a7 = c.a(context);
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        int i5 = -1;
        try {
            zzf = advertisingIdClient2.zzf(-1);
            elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime2;
            advertisingIdClient2.zze(zzf, true, 0.0f, elapsedRealtime, "", null);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            a7.b(0, (int) (SystemClock.elapsedRealtime() - elapsedRealtime2), elapsedRealtime2, System.currentTimeMillis());
            Log.i("AdvertisingIdClient", "GetInfoInternal elapse " + elapsedRealtime + "ms");
            return zzf;
        } catch (Throwable th3) {
            th = th3;
            a7 = a7;
            elapsedRealtime2 = elapsedRealtime2;
            Throwable th4 = th;
            advertisingIdClient2.zze(null, true, 0.0f, -1L, "", th4);
            if (th4 instanceof IOException) {
                i5 = 1;
            } else if (th4 instanceof e) {
                i5 = 9;
            } else if (th4 instanceof IllegalStateException) {
                i5 = 8;
            }
            a7.b(i5, (int) (SystemClock.elapsedRealtime() - elapsedRealtime2), elapsedRealtime2, System.currentTimeMillis());
            throw th4;
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(@NonNull Context context) throws IOException, e, f {
        boolean z5;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzc(false);
            v.g("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                advertisingIdClient.zzd();
                v.h(advertisingIdClient.zza);
                v.h(advertisingIdClient.zzb);
                try {
                    c7.b bVar = (c7.b) advertisingIdClient.zzb;
                    bVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel a7 = bVar.a(obtain, 6);
                    int i5 = c7.a.f3695a;
                    z5 = a7.readInt() != 0;
                    a7.recycle();
                } catch (RemoteException e7) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e7);
                    throw new IOException("Remote exception", e7);
                }
            }
            advertisingIdClient.zzb();
            advertisingIdClient.zza();
            return z5;
        } catch (Throwable th2) {
            advertisingIdClient.zza();
            throw th2;
        }
    }

    private final Info zzf(int i5) throws IOException {
        Info info;
        v.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            zzd();
            v.h(this.zza);
            v.h(this.zzb);
            try {
                c7.b bVar = (c7.b) this.zzb;
                bVar.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z5 = true;
                Parcel a7 = bVar.a(obtain, 1);
                String readString = a7.readString();
                a7.recycle();
                c7.b bVar2 = (c7.b) this.zzb;
                bVar2.getClass();
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                int i10 = c7.a.f3695a;
                obtain2.writeInt(1);
                Parcel a10 = bVar2.a(obtain2, 2);
                if (a10.readInt() == 0) {
                    z5 = false;
                }
                a10.recycle();
                info = new Info(readString, z5);
            } catch (RemoteException e7) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e7);
                throw new IOException("Remote exception", e7);
            }
        }
        zzb();
        return info;
    }

    public final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    @NonNull
    public Info getInfo() throws IOException {
        return zzf(-1);
    }

    public void start() throws IOException, IllegalStateException, e, f {
        zzc(true);
    }

    public final void zza() {
        v.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzi == null || this.zza == null) {
                    return;
                }
                try {
                    if (this.zzc) {
                        p6.a.b().c(this.zzi, this.zza);
                    }
                } catch (Throwable th2) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th2);
                }
                this.zzc = false;
                this.zzb = null;
                this.zza = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void zzb() {
        synchronized (this.zzd) {
            b bVar = this.zze;
            if (bVar != null) {
                bVar.f4235c.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.zzf;
            if (j > 0) {
                this.zze = new b(this, j);
            }
        }
    }

    public final void zzc(boolean z5) throws IOException, IllegalStateException, e, f {
        IOException iOException;
        v.g("Calling this from your main thread can lead to deadlock");
        if (z5) {
            zzb();
        }
        synchronized (this) {
            try {
                if (this.zzc) {
                    return;
                }
                Context context = this.zzi;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int b10 = c6.d.f3660b.b(context, 12451000);
                    if (b10 != 0 && b10 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    c6.a aVar = new c6.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!p6.a.b().a(context, intent, aVar, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.zza = aVar;
                        try {
                            try {
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                IBinder a7 = aVar.a();
                                int i5 = c7.c.f3697a;
                                IInterface queryLocalInterface = a7.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                this.zzb = queryLocalInterface instanceof d ? (d) queryLocalInterface : new c7.b(a7);
                                this.zzc = true;
                            } finally {
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        }
                    } finally {
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void zzd() throws IOException {
        try {
            if (!this.zzc) {
                try {
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is not bounded. Starting to bind it...");
                    zzc(false);
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is bounded");
                    if (!this.zzc) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e7) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e7);
                }
            }
        } finally {
        }
    }

    public final boolean zze(Info info, boolean z5, float f6, long j, String str, Throwable th2) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_context", "1");
        if (info != null) {
            hashMap.put(CommonUrlParts.LIMIT_AD_TRACKING, true != info.isLimitAdTrackingEnabled() ? CommonUrlParts.Values.FALSE_INTEGER : "1");
            String id2 = info.getId();
            if (id2 != null) {
                hashMap.put("ad_id_size", Integer.toString(id2.length()));
            }
        }
        if (th2 != null) {
            hashMap.put("error", th2.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new a(hashMap).start();
        return true;
    }

    public AdvertisingIdClient(@NonNull Context context, long j, boolean z5, boolean z7) {
        this.zzd = new Object();
        v.h(context);
        this.zzi = context.getApplicationContext();
        this.zzc = false;
        this.zzf = j;
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z5) {
    }
}
