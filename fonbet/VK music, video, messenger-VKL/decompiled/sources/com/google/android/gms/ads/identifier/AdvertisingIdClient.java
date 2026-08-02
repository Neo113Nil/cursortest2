package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.a;
import com.google.android.gms.internal.ads_identifier.zzf;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.dez0;
import xsna.exc0;
import xsna.o4j;
import xsna.vf7;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@18.2.0 */
/* loaded from: classes.dex */
public class AdvertisingIdClient {
    public static final /* synthetic */ int a = 0;
    private static final Object zzg = new Object();
    private static volatile AdvertisingIdClient zzh;

    @Nullable
    vf7 zza;

    @Nullable
    zzf zzb;
    boolean zzc;
    final Object zzd;

    @Nullable
    zzb zze;
    final long zzf;
    private final Context zzi;

    /* compiled from: com.google.android.gms:play-services-ads-identifier@@18.2.0 */
    public static final class Info {

        @Nullable
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(@Nullable String str, boolean z) {
            this.zza = str;
            this.zzb = z;
        }

        @Nullable
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
        this(context, ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS, false, false);
    }

    @NonNull
    public static Info getAdvertisingIdInfo(@NonNull Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        Info zzf;
        AdvertisingIdClient advertisingIdClient = zzh;
        if (advertisingIdClient == null) {
            synchronized (zzg) {
                try {
                    advertisingIdClient = zzh;
                    if (advertisingIdClient == null) {
                        advertisingIdClient = new AdvertisingIdClient(context);
                        zzh = advertisingIdClient;
                    }
                } finally {
                }
            }
        }
        AdvertisingIdClient advertisingIdClient2 = advertisingIdClient;
        zzd zza = zzd.zza(context);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = -1;
        try {
            zzf = advertisingIdClient2.zzf(-1);
            advertisingIdClient2.zze(zzf, true, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
        } catch (Throwable th) {
            th = th;
        }
        try {
            zza.zzc(35401, 0, elapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - elapsedRealtime));
            return zzf;
        } catch (Throwable th2) {
            th = th2;
            zza = zza;
            elapsedRealtime = elapsedRealtime;
            Throwable th3 = th;
            advertisingIdClient2.zze(null, true, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1L, "", th3);
            if (th3 instanceof IOException) {
                i = 1;
            } else if (th3 instanceof GooglePlayServicesNotAvailableException) {
                i = 9;
            } else if (th3 instanceof GooglePlayServicesRepairableException) {
                i = 16;
            } else if (th3 instanceof IllegalStateException) {
                i = 8;
            }
            zza.zzc(35401, i, elapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - elapsedRealtime));
            throw th3;
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(@NonNull Context context) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        boolean zzd;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzc(false);
            exc0.h("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                advertisingIdClient.zzd();
                exc0.i(advertisingIdClient.zza);
                exc0.i(advertisingIdClient.zzb);
                try {
                    zzd = advertisingIdClient.zzb.zzd();
                } catch (RemoteException e) {
                    throw new IOException("Remote exception", e);
                }
            }
            advertisingIdClient.zzb();
            advertisingIdClient.zza();
            return zzd;
        } catch (Throwable th) {
            advertisingIdClient.zza();
            throw th;
        }
    }

    private final Info zzf(int i) throws IOException {
        Info info;
        exc0.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            zzd();
            exc0.i(this.zza);
            exc0.i(this.zzb);
            try {
                info = new Info(this.zzb.zzc(), this.zzb.zze(true));
            } catch (RemoteException e) {
                throw new IOException("Remote exception", e);
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

    public void start() throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        zzc(true);
    }

    public final void zza() {
        exc0.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzi == null || this.zza == null) {
                    return;
                }
                try {
                    if (this.zzc) {
                        o4j.b().c(this.zzi, this.zza);
                    }
                } catch (Throwable unused) {
                }
                this.zzc = false;
                this.zzb = null;
                this.zza = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb() {
        synchronized (this.zzd) {
            zzb zzbVar = this.zze;
            if (zzbVar != null) {
                zzbVar.zza.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.zzf;
            if (j > 0) {
                this.zze = new zzb(this, j);
            }
        }
    }

    public final void zzc(boolean z) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        IOException iOException;
        exc0.h("Calling this from your main thread can lead to deadlock");
        if (z) {
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
                    int c = a.b.c(context, 12451000);
                    if (c != 0 && c != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    vf7 vf7Var = new vf7();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!o4j.b().a(context, intent, vf7Var, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.zza = vf7Var;
                        try {
                            try {
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                this.zzb = com.google.android.gms.internal.ads_identifier.zze.zza(vf7Var.l());
                                this.zzc = true;
                            } finally {
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        }
                    } finally {
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException(9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void zzd() throws IOException {
        try {
            if (!this.zzc) {
                try {
                    zzc(false);
                    if (!this.zzc) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
        } finally {
        }
    }

    public final boolean zze(@Nullable Info info, boolean z, float f, long j, String str, @Nullable Throwable th) {
        if (Math.random() > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            return false;
        }
        HashMap a2 = dez0.a(X3.i.L0, "1");
        if (info != null) {
            a2.put(CommonUrlParts.LIMIT_AD_TRACKING, true != info.isLimitAdTrackingEnabled() ? "0" : "1");
            String id = info.getId();
            if (id != null) {
                a2.put("ad_id_size", Integer.toString(id.length()));
            }
        }
        if (th != null) {
            a2.put("error", th.getClass().getName());
        }
        a2.put("tag", "AdvertisingIdClient");
        a2.put("time_spent", Long.toString(j));
        new zza(this, a2).start();
        return true;
    }

    public AdvertisingIdClient(@NonNull Context context, long j, boolean z, boolean z2) {
        this.zzd = new Object();
        exc0.i(context);
        this.zzi = context.getApplicationContext();
        this.zzc = false;
        this.zzf = j;
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }
}
