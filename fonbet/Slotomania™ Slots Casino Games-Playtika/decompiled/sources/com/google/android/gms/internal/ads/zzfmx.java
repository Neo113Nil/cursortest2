package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfmx {
    private final zzfmb zza;
    private final zzfmu zzb;
    private final zzflx zzc;
    private zzfnd zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfmx(zzfmb zzfmbVar, zzflx zzflxVar, zzfmu zzfmuVar) {
        this.zza = zzfmbVar;
        this.zzc = zzflxVar;
        this.zzb = zzfmuVar;
        zzflxVar.zza(new zzflw() { // from class: com.google.android.gms.internal.ads.zzfmw
            @Override // com.google.android.gms.internal.ads.zzflw
            public final /* synthetic */ void zza() {
                zzfmx.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        r3 = new com.google.android.gms.internal.ads.zzfnd(r4.zza, r4.zzb, r0);
        r4.zze = r3;
        r3.zza(new com.google.android.gms.internal.ads.zzfms(r4, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        return;
     */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzd() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhk)).booleanValue() && !com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzi()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (true) {
                ArrayDeque arrayDeque = this.zzd;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                zzfmv zzfmvVar = (zzfmv) arrayDeque.pollFirst();
                if (zzfmvVar == null || (zzfmvVar.zzb() != null && this.zza.zzc(zzfmvVar.zzb()))) {
                    break;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized void zza(zzfmv zzfmvVar) {
        this.zzd.add(zzfmvVar);
    }

    public final synchronized ListenableFuture zzb(zzfmv zzfmvVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zzb(zzfmvVar);
    }

    final /* synthetic */ void zzc() {
        synchronized (this) {
            this.zzf = 1;
            zzd();
        }
    }

    final /* synthetic */ ArrayDeque zze() {
        return this.zzd;
    }

    final /* synthetic */ void zzf(zzfnd zzfndVar) {
        this.zze = null;
    }

    final /* synthetic */ int zzg() {
        return this.zzf;
    }
}
