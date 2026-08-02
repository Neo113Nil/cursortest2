package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.internal.i;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.ads_identifier.zzf;
import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.U3;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class AdvertisingIdClient {
    public static final /* synthetic */ int a = 0;
    private static final Object zzg = new Object();
    private static volatile AdvertisingIdClient zzh;

    @Nullable
    BlockingServiceConnection zza;

    @Nullable
    zzf zzb;
    boolean zzc;
    final Object zzd;

    @Nullable
    zzb zze;
    final long zzf;
    private final Context zzi;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @KeepForSdkWithMembers
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

    public AdvertisingIdClient(@NonNull Context context, long j, boolean z, boolean z2) {
        this.zzd = new Object();
        Preconditions.i(context);
        this.zzi = context.getApplicationContext();
        this.zzc = false;
        this.zzf = j;
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

    @KeepForSdk
    public static boolean getIsAdIdFakeForDebugLogging(@NonNull Context context) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        boolean zzd;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzc(false);
            Preconditions.h("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                advertisingIdClient.zzd();
                Preconditions.i(advertisingIdClient.zza);
                Preconditions.i(advertisingIdClient.zzb);
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
        Preconditions.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            zzd();
            Preconditions.i(this.zza);
            Preconditions.i(this.zzb);
            try {
                info = new Info(this.zzb.zzc(), this.zzb.zze());
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
    @KeepForSdk
    public Info getInfo() throws IOException {
        return zzf(-1);
    }

    @KeepForSdk
    public void start() throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        zzc(true);
    }

    public final void zza() {
        Preconditions.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzi == null || this.zza == null) {
                    return;
                }
                try {
                    if (this.zzc) {
                        ConnectionTracker.b().c(this.zzi, this.zza);
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
                zzbVar.c.countDown();
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
        Preconditions.h("Calling this from your main thread can lead to deadlock");
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
                    int b = GoogleApiAvailabilityLight.b.b(context, 12451000);
                    if (b != 0 && b != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!ConnectionTracker.b().a(context, intent, blockingServiceConnection, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.zza = blockingServiceConnection;
                        try {
                            try {
                                IBinder l = blockingServiceConnection.l();
                                int i = com.google.android.gms.internal.ads_identifier.zze.a;
                                IInterface queryLocalInterface = l.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                this.zzb = queryLocalInterface instanceof zzf ? (zzf) queryLocalInterface : new com.google.android.gms.internal.ads_identifier.zzd(l);
                                this.zzc = true;
                            } finally {
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        }
                    } finally {
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException();
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
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap l = i.l(U3.i.L0, "1");
        if (info != null) {
            l.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? "0" : "1");
            String id = info.getId();
            if (id != null) {
                l.put("ad_id_size", Integer.toString(id.length()));
            }
        }
        if (th != null) {
            l.put("error", th.getClass().getName());
        }
        l.put("tag", "AdvertisingIdClient");
        l.put("time_spent", Long.toString(j));
        new zza(l).start();
        return true;
    }

    @KeepForSdk
    public AdvertisingIdClient(@NonNull Context context) {
        this(context, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, false, false);
    }

    @ShowFirstParty
    @KeepForSdk
    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }
}
