package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzwe implements zzxv {
    private final zzafv zza;
    private zzafp zzb;
    private zzafq zzc;

    public zzwe(zzafv zzafvVar) {
        this.zza = zzafvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r1.zzn() != r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        if (r1.zzn() != r11) goto L38;
     */
    @Override // com.google.android.gms.internal.ads.zzxv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzj zzjVar, Uri uri, Map map, long j, long j2, zzafs zzafsVar) throws IOException {
        zzafg zzafgVar = new zzafg(zzjVar, j, j2);
        this.zzc = zzafgVar;
        if (this.zzb != null) {
            return;
        }
        zzafp[] zzb = this.zza.zzb(uri, map);
        int length = zzb.length;
        zzgvw zzv = zzgvz.zzv(length);
        if (length == 1) {
            this.zzb = zzb[0];
        } else {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                zzafp zzafpVar = zzb[i];
                try {
                } catch (EOFException unused) {
                    if (this.zzb == null) {
                    }
                } catch (Throwable th) {
                    zzgsw.zzi(this.zzb != null || zzafgVar.zzn() == j);
                    zzafgVar.zzl();
                    throw th;
                }
                if (zzafpVar.zza(zzafgVar)) {
                    this.zzb = zzafpVar;
                    zzgsw.zzi(zzafpVar != null || zzafgVar.zzn() == j);
                    zzafgVar.zzl();
                } else {
                    zzv.zzh(zzafpVar.zzb());
                    if (this.zzb == null) {
                    }
                    boolean z = true;
                    zzgsw.zzi(z);
                    zzafgVar.zzl();
                    i++;
                }
            }
            if (this.zzb == null) {
                String zzd = zzgsq.zzd(zzgwz.zzc(zzgvz.zzr(zzb), zzwd.zza), ", ");
                StringBuilder sb = new StringBuilder(zzd.length() + 58);
                sb.append("None of the available extractors (");
                sb.append(zzd);
                sb.append(") could read the stream.");
                throw new zzzg(sb.toString(), uri, zzv.zzi());
            }
        }
        this.zzb.zzc(zzafsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void zzb() {
        zzafp zzafpVar = this.zzb;
        if (zzafpVar != null) {
            zzafpVar.zzf();
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void zzc() {
        zzafp zzafpVar = this.zzb;
        if (zzafpVar != null && (zzafpVar instanceof zzakj)) {
            ((zzakj) zzafpVar).zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final long zzd() {
        zzafq zzafqVar = this.zzc;
        if (zzafqVar != null) {
            return zzafqVar.zzn();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void zze(long j, long j2) {
        zzafp zzafpVar = this.zzb;
        zzafpVar.getClass();
        zzafpVar.zze(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final int zzf(zzagp zzagpVar) throws IOException {
        zzafq zzafqVar;
        zzafp zzafpVar = this.zzb;
        if (zzafpVar == null || (zzafqVar = this.zzc) == null) {
            throw null;
        }
        return zzafpVar.zzd(zzafqVar, zzagpVar);
    }
}
