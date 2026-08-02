package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzdxs;
import com.google.android.gms.internal.ads.zzgbp;
import com.google.android.gms.internal.ads.zzgdh;
import com.google.android.gms.internal.ads.zzgtp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class pmn implements Application.ActivityLifecycleCallbacks {
    public Activity a;
    public Application b;
    public f2n h;
    public long j;
    public final Object c = new Object();
    public final AtomicBoolean d = new AtomicBoolean(true);
    public boolean e = false;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public boolean i = false;

    public final void a(Activity activity) {
        synchronized (this.c) {
            try {
                if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                    this.a = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.c) {
            try {
                Activity activity2 = this.a;
                if (activity2 == null) {
                    return;
                }
                boolean equals = activity2.equals(activity);
                rq3 rq3Var = null;
                if (equals) {
                    this.a = null;
                }
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    zzdxs zzdxsVar = (zzdxs) it.next();
                    try {
                        if (zzdxsVar.b.getAndSet(false)) {
                            zzgdh zzgdhVar = zzdxsVar.a;
                            zzgtp.a(zzgdhVar.a, zzgdhVar.b, new wbo(zzgdhVar, rq3Var, 4));
                        }
                    } catch (Exception e) {
                        zzt.zzh().d("AppActivityTracker.ActivityListener.onActivityDestroyed", e);
                        int i = zze.zza;
                        zzo.zzg("", e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(activity);
        synchronized (this.c) {
            try {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    zzdxs zzdxsVar = (zzdxs) it.next();
                    try {
                        if (zzdxsVar.b.get()) {
                            zzgdh zzgdhVar = zzdxsVar.a;
                            zzgtp.a(zzgdhVar.a, zzgdhVar.b, new wbo(zzgdhVar, null, 0));
                        }
                    } catch (Exception e) {
                        zzt.zzh().d("AppActivityTracker.ActivityListener.onActivityPaused", e);
                        int i = zze.zza;
                        zzo.zzg("", e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e = true;
        f2n f2nVar = this.h;
        if (f2nVar != null) {
            zzs.zza.removeCallbacks(f2nVar);
        }
        zzgbp zzgbpVar = zzs.zza;
        f2n f2nVar2 = new f2n(this, 16);
        this.h = f2nVar2;
        zzgbpVar.postDelayed(f2nVar2, this.j);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(activity);
        this.e = false;
        boolean andSet = this.d.getAndSet(true);
        f2n f2nVar = this.h;
        if (f2nVar != null) {
            zzs.zza.removeCallbacks(f2nVar);
        }
        synchronized (this.c) {
            try {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    zzdxs zzdxsVar = (zzdxs) it.next();
                    try {
                        if (zzdxsVar.b.get()) {
                            zzgdh zzgdhVar = zzdxsVar.a;
                            zzgtp.a(zzgdhVar.a, zzgdhVar.b, new wbo(zzgdhVar, null, 5));
                        }
                    } catch (Exception e) {
                        zzt.zzh().d("AppActivityTracker.ActivityListener.onActivityResumed", e);
                        int i = zze.zza;
                        zzo.zzg("", e);
                    }
                }
                if (andSet) {
                    int i2 = zze.zza;
                    zzo.zzd("App is still foreground.");
                } else {
                    Iterator it2 = this.f.iterator();
                    while (it2.hasNext()) {
                        try {
                            ((zzbga) it2.next()).zza(true);
                        } catch (Exception e2) {
                            int i3 = zze.zza;
                            zzo.zzg("", e2);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
