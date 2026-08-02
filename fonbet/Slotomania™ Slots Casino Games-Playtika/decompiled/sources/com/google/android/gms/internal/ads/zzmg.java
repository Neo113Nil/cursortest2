package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzmg implements zzxn, zzub {
    final /* synthetic */ zzml zza;
    private final zzmi zzb;

    public zzmg(zzml zzmlVar, zzmi zzmiVar) {
        Objects.requireNonNull(zzmlVar);
        this.zza = zzmlVar;
        this.zzb = zzmiVar;
    }

    private final Pair zzf(int i, zzxc zzxcVar) {
        zzxc zzxcVar2;
        zzxc zzxcVar3 = null;
        if (zzxcVar != null) {
            zzmi zzmiVar = this.zzb;
            int i2 = 0;
            while (true) {
                List list = zzmiVar.zzc;
                if (i2 >= list.size()) {
                    zzxcVar2 = null;
                    break;
                }
                if (((zzxc) list.get(i2)).zzd == zzxcVar.zzd) {
                    Object obj = zzxcVar.zza;
                    Object obj2 = zzmiVar.zzb;
                    int i3 = zzms.zzb;
                    zzxcVar2 = zzxcVar.zza(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (zzxcVar2 == null) {
                return null;
            }
            zzxcVar3 = zzxcVar2;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzxcVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzai(int i, zzxc zzxcVar, final zzwt zzwtVar, final zzwy zzwyVar, final int i2) {
        final Pair zzf = zzf(0, zzxcVar);
        if (zzf != null) {
            zzml zzmlVar = this.zza;
            zzmlVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = zzf;
                    zzmg.this.zza.zzj().zzai(((Integer) pair.first).intValue(), (zzxc) pair.second, zzwtVar, zzwyVar, i2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzaj(int i, zzxc zzxcVar, final zzwt zzwtVar, final zzwy zzwyVar) {
        final Pair zzf = zzf(0, zzxcVar);
        if (zzf != null) {
            zzml zzmlVar = this.zza;
            zzmlVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = zzf;
                    zzmg.this.zza.zzj().zzaj(((Integer) pair.first).intValue(), (zzxc) pair.second, zzwtVar, zzwyVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzak(int i, zzxc zzxcVar, final zzwt zzwtVar, final zzwy zzwyVar) {
        final Pair zzf = zzf(0, zzxcVar);
        if (zzf != null) {
            zzml zzmlVar = this.zza;
            zzmlVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = zzf;
                    zzmg.this.zza.zzj().zzak(((Integer) pair.first).intValue(), (zzxc) pair.second, zzwtVar, zzwyVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzal(int i, zzxc zzxcVar, final zzwt zzwtVar, final zzwy zzwyVar, final IOException iOException, final boolean z) {
        final Pair zzf = zzf(0, zzxcVar);
        if (zzf != null) {
            zzml zzmlVar = this.zza;
            zzmlVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = zzf;
                    zzmg.this.zza.zzj().zzal(((Integer) pair.first).intValue(), (zzxc) pair.second, zzwtVar, zzwyVar, iOException, z);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzam(int i, zzxc zzxcVar, final zzwy zzwyVar) {
        final Pair zzf = zzf(0, zzxcVar);
        if (zzf != null) {
            zzml zzmlVar = this.zza;
            zzmlVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzme
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = zzf;
                    zzmg.this.zza.zzj().zzam(((Integer) pair.first).intValue(), (zzxc) pair.second, zzwyVar);
                }
            });
        }
    }
}
