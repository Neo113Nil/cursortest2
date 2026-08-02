package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzbs;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzfr;
import java.util.HashMap;

/* loaded from: classes9.dex */
final class zzv extends zzbs {
    final /* synthetic */ Tracker zza;
    private boolean zzb;
    private int zzc;
    private long zzd;
    private boolean zze;
    private long zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected zzv(Tracker tracker, zzbv zzbvVar) {
        super(zzbvVar);
        this.zza = tracker;
        this.zzd = -1L;
    }

    private final void zzg() {
        zzv zzvVar;
        zzv zzvVar2;
        if (this.zzd >= 0 || this.zzb) {
            GoogleAnalytics zzp = zzp();
            zzvVar = this.zza.zze;
            zzp.zzk(zzvVar);
        } else {
            GoogleAnalytics zzp2 = zzp();
            zzvVar2 = this.zza.zze;
            zzp2.zzl(zzvVar2);
        }
    }

    public final void zza(Activity activity) {
        zzfr zzfrVar;
        String canonicalName;
        zzfr zzfrVar2;
        if (this.zzc == 0) {
            if (zzC().elapsedRealtime() >= Math.max(1000L, this.zzd) + this.zzf) {
                this.zze = true;
            }
        }
        this.zzc++;
        if (this.zzb) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                this.zza.setCampaignParamsOnNextHit(intent.getData());
            }
            HashMap hashMap = new HashMap();
            hashMap.put("&t", "screenview");
            Tracker tracker = this.zza;
            zzfrVar = tracker.zzg;
            if (zzfrVar != null) {
                zzfrVar2 = this.zza.zzg;
                canonicalName = activity.getClass().getCanonicalName();
                String str = zzfrVar2.zzg.get(canonicalName);
                if (str != null) {
                    canonicalName = str;
                }
            } else {
                canonicalName = activity.getClass().getCanonicalName();
            }
            tracker.set("&cd", canonicalName);
            if (TextUtils.isEmpty((CharSequence) hashMap.get("&dr"))) {
                Preconditions.checkNotNull(activity);
                Intent intent2 = activity.getIntent();
                String str2 = null;
                if (intent2 != null) {
                    String stringExtra = intent2.getStringExtra("android.intent.extra.REFERRER_NAME");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        str2 = stringExtra;
                    }
                }
                if (!TextUtils.isEmpty(str2)) {
                    hashMap.put("&dr", str2);
                }
            }
            this.zza.send(hashMap);
        }
    }

    public final void zzb(Activity activity) {
        int i11 = this.zzc - 1;
        this.zzc = i11;
        int max = Math.max(0, i11);
        this.zzc = max;
        if (max == 0) {
            this.zzf = zzC().elapsedRealtime();
        }
    }

    public final void zzc(boolean z11) {
        this.zzb = z11;
        zzg();
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
    }

    public final void zze(long j11) {
        this.zzd = j11;
        zzg();
    }

    public final synchronized boolean zzf() {
        boolean z11;
        z11 = this.zze;
        this.zze = false;
        return z11;
    }
}
