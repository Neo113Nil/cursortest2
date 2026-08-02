package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzet;
import com.google.android.gms.internal.gtm.zzeu;
import com.google.android.gms.internal.gtm.zzfa;
import com.google.android.gms.internal.gtm.zzfq;
import com.google.android.gms.internal.gtm.zzfr;
import com.google.android.gms.internal.gtm.zzft;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@VisibleForTesting
/* loaded from: classes9.dex */
public final class GoogleAnalytics extends zza {
    private static List<Runnable> zzb = new ArrayList();
    private boolean zzc;
    private Set<zzv> zzd;
    private boolean zze;
    private boolean zzf;
    private volatile boolean zzg;
    private boolean zzh;

    @VisibleForTesting
    public GoogleAnalytics(zzbv zzbvVar) {
        super(zzbvVar);
        this.zzd = new HashSet();
    }

    @RecentlyNonNull
    public static GoogleAnalytics getInstance(@RecentlyNonNull Context context) {
        return zzbv.zzg(context).zzc();
    }

    public static void zzf() {
        synchronized (GoogleAnalytics.class) {
            try {
                List<Runnable> list = zzb;
                if (list != null) {
                    Iterator<Runnable> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().run();
                    }
                    zzb = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void dispatchLocalHits() {
        zzb().zzf().zzc();
    }

    @TargetApi(14)
    public void enableAutoActivityReports(@RecentlyNonNull Application application) {
        if (this.zze) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new zze(this));
        this.zze = true;
    }

    public boolean getAppOptOut() {
        return this.zzg;
    }

    @RecentlyNonNull
    @Deprecated
    public Logger getLogger() {
        return zzfa.zza();
    }

    public boolean isDryRunEnabled() {
        return this.zzf;
    }

    @RecentlyNonNull
    public Tracker newTracker(int i11) {
        Tracker tracker;
        zzfr zza;
        synchronized (this) {
            try {
                tracker = new Tracker(zzb(), null, null);
                if (i11 > 0 && (zza = new zzfq(zzb()).zza(i11)) != null) {
                    tracker.zzm(zza);
                }
                tracker.zzX();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tracker;
    }

    public void reportActivityStart(@RecentlyNonNull Activity activity) {
        if (this.zze) {
            return;
        }
        zzh(activity);
    }

    public void reportActivityStop(@RecentlyNonNull Activity activity) {
        if (this.zze) {
            return;
        }
        zzi(activity);
    }

    public void setAppOptOut(boolean z11) {
        this.zzg = z11;
        if (this.zzg) {
            zzb().zzf().zzg();
        }
    }

    public void setDryRun(boolean z11) {
        this.zzf = z11;
    }

    public void setLocalDispatchPeriod(int i11) {
        zzb().zzf().zzl(i11);
    }

    @Deprecated
    public void setLogger(@RecentlyNonNull Logger logger) {
        zzfa.zzc(logger);
        if (this.zzh) {
            return;
        }
        zzet<String> zzetVar = zzeu.zzc;
        String zzb2 = zzetVar.zzb();
        String zzb3 = zzetVar.zzb();
        StringBuilder sb2 = new StringBuilder(zzb3.length() + 112);
        sb2.append("GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.");
        sb2.append(zzb3);
        sb2.append(" DEBUG");
        Log.i(zzb2, sb2.toString());
        this.zzh = true;
    }

    public final void zzg() {
        zzft zzq = zzb().zzq();
        zzq.zzf();
        if (zzq.zze()) {
            setDryRun(zzq.zzc());
        }
        zzq.zzf();
        this.zzc = true;
    }

    @VisibleForTesting
    final void zzh(Activity activity) {
        Iterator<zzv> it = this.zzd.iterator();
        while (it.hasNext()) {
            it.next().zza(activity);
        }
    }

    @VisibleForTesting
    final void zzi(Activity activity) {
        Iterator<zzv> it = this.zzd.iterator();
        while (it.hasNext()) {
            it.next().zzb(activity);
        }
    }

    public final boolean zzj() {
        return this.zzc;
    }

    final void zzk(zzv zzvVar) {
        this.zzd.add(zzvVar);
        Context zza = zzb().zza();
        if (zza instanceof Application) {
            enableAutoActivityReports((Application) zza);
        }
    }

    final void zzl(zzv zzvVar) {
        this.zzd.remove(zzvVar);
    }

    @RecentlyNonNull
    public Tracker newTracker(@RecentlyNonNull String str) {
        Tracker tracker;
        synchronized (this) {
            tracker = new Tracker(zzb(), str, null);
            tracker.zzX();
        }
        return tracker;
    }
}
