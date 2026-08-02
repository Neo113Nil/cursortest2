package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzpo implements zzpx {
    public static final zzgto zza = zzpm.zza;
    private static final Random zzb = new Random();
    private final zzbe zzc;
    private final zzbd zzd;
    private final HashMap zze;
    private zzpw zzf;
    private zzbf zzg;
    private String zzh;
    private long zzi;

    public zzpo() {
        throw null;
    }

    public zzpo(zzgto zzgtoVar) {
        this.zzc = new zzbe();
        this.zzd = new zzbd();
        this.zze = new HashMap();
        this.zzg = zzbf.zza;
        this.zzi = -1L;
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private final void zzl(zznh zznhVar) {
        if (zznhVar.zzb.zzg()) {
            String str = this.zzh;
            if (str != null) {
                zzpn zzpnVar = (zzpn) this.zze.get(str);
                zzpnVar.getClass();
                zzm(zzpnVar);
                return;
            }
            return;
        }
        zzpn zzpnVar2 = (zzpn) this.zze.get(this.zzh);
        int i = zznhVar.zzc;
        zzxc zzxcVar = zznhVar.zzd;
        this.zzh = zzo(i, zzxcVar).zze();
        zzc(zznhVar);
        if (zzxcVar == null || !zzxcVar.zzb()) {
            return;
        }
        if (zzpnVar2 != null) {
            if (zzpnVar2.zzg() == zzxcVar.zzd && zzpnVar2.zzh() != null) {
                zzxc zzh = zzpnVar2.zzh();
                if (zzh.zzb == zzxcVar.zzb) {
                    zzxc zzh2 = zzpnVar2.zzh();
                    if (zzh2.zzc == zzxcVar.zzc) {
                        return;
                    }
                }
            }
        }
        zzo(i, new zzxc(zzxcVar.zza, zzxcVar.zzd));
    }

    private final void zzm(zzpn zzpnVar) {
        if (zzpnVar.zzg() != -1 && zzpnVar.zzi()) {
            this.zzi = zzpnVar.zzg();
        }
        this.zzh = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final long zzi() {
        zzpn zzpnVar = (zzpn) this.zze.get(this.zzh);
        return (zzpnVar == null || zzpnVar.zzg() == -1) ? this.zzi + 1 : zzpnVar.zzg();
    }

    private final zzpn zzo(int i, zzxc zzxcVar) {
        HashMap hashMap = this.zze;
        long j = Long.MAX_VALUE;
        zzpn zzpnVar = null;
        for (zzpn zzpnVar2 : hashMap.values()) {
            zzpnVar2.zzc(i, zzxcVar);
            if (zzpnVar2.zzb(i, zzxcVar)) {
                long zzg = zzpnVar2.zzg();
                if (zzg == -1 || zzg < j) {
                    zzpnVar = zzpnVar2;
                    j = zzg;
                } else if (zzg == j) {
                    String str = zzfk.zza;
                    if (zzpnVar.zzh() != null && zzpnVar2.zzh() != null) {
                        zzpnVar = zzpnVar2;
                    }
                }
            }
        }
        if (zzpnVar != null) {
            return zzpnVar;
        }
        String zzp = zzp();
        zzpn zzpnVar3 = new zzpn(this, zzp, i, zzxcVar);
        hashMap.put(zzp, zzpnVar3);
        return zzpnVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzp() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zza(zzpw zzpwVar) {
        this.zzf = zzpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final synchronized String zzb(zzbf zzbfVar, zzxc zzxcVar) {
        return zzo(zzbfVar.zzo(zzxcVar.zza, this.zzd).zzc, zzxcVar).zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
    
        if (r2 < zzn()) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r2.zzf() != r10.zzc) goto L40;
     */
    @Override // com.google.android.gms.internal.ads.zzpx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzc(zznh zznhVar) {
        if (this.zzf == null) {
            throw null;
        }
        zzbf zzbfVar = zznhVar.zzb;
        if (!zzbfVar.zzg()) {
            zzxc zzxcVar = zznhVar.zzd;
            if (zzxcVar != null) {
                long j = zzxcVar.zzd;
                if (j != -1) {
                }
                zzpn zzpnVar = (zzpn) this.zze.get(this.zzh);
                if (zzpnVar != null) {
                    if (zzpnVar.zzg() == -1) {
                    }
                }
            }
            int i = zznhVar.zzc;
            zzpn zzo = zzo(i, zzxcVar);
            if (this.zzh == null) {
                this.zzh = zzo.zze();
            }
            if (zzxcVar != null && zzxcVar.zzb()) {
                Object obj = zzxcVar.zza;
                long j2 = zzxcVar.zzd;
                int i2 = zzxcVar.zzb;
                zzpn zzo2 = zzo(i, new zzxc(obj, j2, i2));
                if (!zzo2.zzi()) {
                    zzo2.zzj(true);
                    zzbd zzbdVar = this.zzd;
                    zzbfVar.zzo(obj, zzbdVar);
                    zzbdVar.zzc(i2);
                    Math.max(0L, zzfk.zzr(0L) + zzfk.zzr(0L));
                }
            }
            if (!zzo.zzi()) {
                zzo.zzj(true);
            }
            if (zzo.zze().equals(this.zzh) && !zzo.zzk()) {
                zzo.zzl(true);
                this.zzf.zzc(zznhVar, zzo.zze());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final synchronized void zzd(zznh zznhVar) {
        if (this.zzf == null) {
            throw null;
        }
        zzbf zzbfVar = this.zzg;
        this.zzg = zznhVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzpn zzpnVar = (zzpn) it.next();
            if (!zzpnVar.zza(zzbfVar, this.zzg) || zzpnVar.zzd(zznhVar)) {
                it.remove();
                if (zzpnVar.zze().equals(this.zzh)) {
                    zzm(zzpnVar);
                }
                if (zzpnVar.zzi()) {
                    this.zzf.zzd(zznhVar, zzpnVar.zze(), false);
                }
            }
        }
        zzl(zznhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final synchronized void zze(zznh zznhVar, int i) {
        if (this.zzf == null) {
            throw null;
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzpn zzpnVar = (zzpn) it.next();
            if (zzpnVar.zzd(zznhVar)) {
                it.remove();
                boolean equals = zzpnVar.zze().equals(this.zzh);
                if (equals) {
                    zzm(zzpnVar);
                }
                if (zzpnVar.zzi()) {
                    boolean z = false;
                    if (i == 0 && equals && zzpnVar.zzk()) {
                        z = true;
                    }
                    this.zzf.zzd(zznhVar, zzpnVar.zze(), z);
                }
            }
        }
        zzl(zznhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final synchronized String zzf() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final synchronized void zzg(zznh zznhVar) {
        zzpw zzpwVar;
        String str = this.zzh;
        if (str != null) {
            zzpn zzpnVar = (zzpn) this.zze.get(str);
            if (zzpnVar == null) {
                throw null;
            }
            zzpn zzpnVar2 = zzpnVar;
            zzm(zzpnVar);
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzpn zzpnVar3 = (zzpn) it.next();
            it.remove();
            if (zzpnVar3.zzi() && (zzpwVar = this.zzf) != null) {
                zzpwVar.zzd(zznhVar, zzpnVar3.zze(), false);
            }
        }
    }

    final /* synthetic */ zzbe zzj() {
        return this.zzc;
    }

    final /* synthetic */ zzbd zzk() {
        return this.zzd;
    }
}
