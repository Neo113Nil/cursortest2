package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfrg implements Runnable {
    public final zzfrj b;
    public String c;
    public String e;
    public zzfln f;
    public com.google.android.gms.ads.internal.client.zze g;
    public ScheduledFuture h;
    public final ArrayList a = new ArrayList();
    public int i = 2;
    public zzfrl d = zzfrl.SCAR_REQUEST_TYPE_UNSPECIFIED;

    public zzfrg(zzfrj zzfrjVar) {
        this.b = zzfrjVar;
    }

    public final synchronized void a(zzfqw zzfqwVar) {
        try {
            if (((Boolean) zzbla.c.c()).booleanValue()) {
                ArrayList arrayList = this.a;
                zzfqwVar.zzc();
                arrayList.add(zzfqwVar);
                ScheduledFuture scheduledFuture = this.h;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.h = zzcgj.d.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ha)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(ArrayList arrayList) {
        try {
            if (((Boolean) zzbla.c.c()).booleanValue()) {
                if (!arrayList.contains("banner") && !arrayList.contains(AdFormat.BANNER.name())) {
                    if (!arrayList.contains("interstitial") && !arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                        if (!arrayList.contains(IronSourceConstants.EVENTS_NATIVE) && !arrayList.contains(AdFormat.NATIVE.name())) {
                            if (!arrayList.contains("rewarded") && !arrayList.contains(AdFormat.REWARDED.name())) {
                                if (arrayList.contains("app_open_ad")) {
                                    this.i = 7;
                                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                                    this.i = 6;
                                }
                            }
                            this.i = 5;
                        }
                        this.i = 8;
                    }
                    this.i = 4;
                }
                this.i = 3;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(String str) {
        boolean matches;
        if (((Boolean) zzbla.c.c()).booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                matches = false;
            } else {
                matches = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ia), str);
            }
            if (matches) {
                this.c = str;
            }
        }
    }

    public final synchronized void d(Bundle bundle) {
        if (((Boolean) zzbla.c.c()).booleanValue()) {
            this.d = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzd(bundle);
        }
    }

    public final synchronized void e(zzfln zzflnVar) {
        if (((Boolean) zzbla.c.c()).booleanValue()) {
            this.f = zzflnVar;
        }
    }

    public final synchronized void f(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbla.c.c()).booleanValue()) {
            this.g = zzeVar;
        }
    }

    public final synchronized void g(String str) {
        if (((Boolean) zzbla.c.c()).booleanValue()) {
            this.e = str;
        }
    }

    public final synchronized void h() {
        try {
            if (((Boolean) zzbla.c.c()).booleanValue()) {
                ScheduledFuture scheduledFuture = this.h;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ArrayList arrayList = this.a;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzfqw zzfqwVar = (zzfqw) it.next();
                    int i = this.i;
                    if (i != 2) {
                        zzfqwVar.g(i);
                    }
                    if (!TextUtils.isEmpty(this.c)) {
                        zzfqwVar.zze(this.c);
                    }
                    if (!TextUtils.isEmpty(this.e) && !zzfqwVar.zzl()) {
                        zzfqwVar.zzi(this.e);
                    }
                    zzfln zzflnVar = this.f;
                    if (zzflnVar != null) {
                        zzfqwVar.f(zzflnVar);
                    } else {
                        com.google.android.gms.ads.internal.client.zze zzeVar = this.g;
                        if (zzeVar != null) {
                            zzfqwVar.b(zzeVar);
                        }
                    }
                    zzfqwVar.d(this.d);
                    this.b.b(zzfqwVar.zzm());
                }
                arrayList.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void i(int i) {
        if (((Boolean) zzbla.c.c()).booleanValue()) {
            this.i = i;
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        h();
    }
}
