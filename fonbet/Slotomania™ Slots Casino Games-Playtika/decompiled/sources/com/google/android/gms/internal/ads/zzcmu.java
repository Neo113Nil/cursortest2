package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzcmu {
    private String zza;
    private zzihh zzb;
    private zzile zzc;
    private final ScheduledExecutorService zzd;
    private final AtomicBoolean zze = new AtomicBoolean(false);

    zzcmu(zzcmh zzcmhVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzd = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final void zze() {
        try {
            String variationsHeader = WebViewFeature.isFeatureSupported("GET_VARIATIONS_HEADER") ? WebViewCompat.getVariationsHeader() : null;
            if (variationsHeader != null && !variationsHeader.isEmpty()) {
                this.zza = variationsHeader;
                byte[] decode = Base64.decode(variationsHeader, 10);
                this.zzb = zzihh.zzc(decode, zzidb.zzb());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkg)).booleanValue()) {
                    this.zzc = zzile.zzc(decode, zzidb.zzb());
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzke)).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkd)).booleanValue()) {
                        this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmt
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzcmu.this.zze();
                            }
                        }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkf)).intValue(), TimeUnit.MINUTES);
                    }
                }
            }
        } catch (zzieg | IllegalArgumentException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "ChromeVariations");
        }
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkd)).booleanValue() && !this.zze.getAndSet(true)) {
            zze();
        }
    }

    public final String zzb() {
        zzile zzileVar = this.zzc;
        if (zzileVar != null) {
            return Base64.encodeToString(zzileVar.zzaN(), 10);
        }
        return null;
    }

    public final String zzc() {
        return this.zza;
    }

    public final zzihh zzd() {
        return this.zzb;
    }
}
