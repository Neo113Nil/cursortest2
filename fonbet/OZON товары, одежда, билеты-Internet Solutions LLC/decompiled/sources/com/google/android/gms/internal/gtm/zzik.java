package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;

@ShowFirstParty
@VisibleForTesting
/* loaded from: classes9.dex */
final class zzik extends zzid {
    private static final Object zza = new Object();
    private static zzik zzb;
    private Context zzc;
    private zzhd zzd;
    private zzig zzi;
    private zzhm zzj;
    private volatile zzhc zzm;
    private boolean zze = true;
    private boolean zzf = false;
    private boolean zzg = false;
    private boolean zzh = true;
    private final zzie zzl = new zzie(this);
    private boolean zzk = false;

    private zzik() {
    }

    public static zzik zzf() {
        if (zzb == null) {
            zzb = new zzik();
        }
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzn() {
        return this.zzk || !this.zzh;
    }

    @Override // com.google.android.gms.internal.gtm.zzid
    public final synchronized void zza() {
        if (zzn()) {
            return;
        }
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.gtm.zzid
    public final synchronized void zzb(boolean z11) {
        zzj(this.zzk, z11);
    }

    final synchronized zzhd zze() {
        try {
            zzii zziiVar = null;
            if (this.zzd == null) {
                Context context = this.zzc;
                if (context == null) {
                    throw new IllegalStateException("Cant get a store unless we have a context");
                }
                this.zzd = new zzhp(this.zzl, context, null);
            }
            if (this.zzi == null) {
                zzij zzijVar = new zzij(this, zziiVar);
                this.zzi = zzijVar;
                zzijVar.zzc(1800000L);
            }
            this.zzf = true;
            if (this.zze) {
                zzi();
                this.zze = false;
            }
            if (this.zzj == null) {
                zzhm zzhmVar = new zzhm(this);
                this.zzj = zzhmVar;
                Context context2 = this.zzc;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context2.registerReceiver(zzhmVar, intentFilter);
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("com.google.analytics.RADIO_POWERED");
                intentFilter2.addCategory(context2.getPackageName());
                context2.registerReceiver(zzhmVar, intentFilter2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.zzd;
    }

    public final synchronized void zzi() {
        if (!this.zzf) {
            zzhl.zzd("Dispatch call queued. Dispatch will run once initialization is complete.");
            this.zze = true;
        } else {
            if (this.zzg) {
                return;
            }
            this.zzg = true;
            this.zzm.zze(new zzif(this));
        }
    }

    @VisibleForTesting
    final synchronized void zzj(boolean z11, boolean z12) {
        boolean zzn = zzn();
        this.zzk = z11;
        this.zzh = z12;
        if (zzn() != zzn) {
            if (zzn()) {
                this.zzi.zza();
                zzhl.zzd("PowerSaveMode initiated.");
            } else {
                this.zzi.zzc(1800000L);
                zzhl.zzd("PowerSaveMode terminated.");
            }
        }
    }

    final synchronized void zzm(Context context, zzhc zzhcVar) {
        if (this.zzc != null) {
            return;
        }
        this.zzc = context.getApplicationContext();
        if (this.zzm == null) {
            this.zzm = zzhcVar;
        }
    }
}
