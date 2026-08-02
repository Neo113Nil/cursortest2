package com.google.android.gms.internal.gtm;

import java.util.List;

/* loaded from: classes9.dex */
public final class zzae extends zzuz<zzae, zzad> implements zzwl {
    public static final zzux<zzak, zzae> zza;
    private static final zzae zze;
    private int zzf;
    private int zzj;
    private int zzl;
    private int zzm;
    private zzve zzg = zzuz.zzaf();
    private zzve zzh = zzuz.zzaf();
    private zzve zzi = zzuz.zzaf();
    private zzve zzk = zzuz.zzaf();

    static {
        zzae zzaeVar = new zzae();
        zze = zzaeVar;
        zzuz.zzak(zzae.class, zzaeVar);
        zza = zzuz.zzaa(zzak.zzi(), zzaeVar, zzaeVar, null, 101, zzye.zzk, zzae.class);
    }

    private zzae() {
    }

    public final int zza() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.gtm.zzuz
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzuz.zzaj(zze, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001\u0016\u0002\u0016\u0003\u0016\u0004င\u0000\u0005\u0016\u0006င\u0001\u0007င\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i12 == 3) {
            return new zzae();
        }
        zzn zznVar = null;
        if (i12 == 4) {
            return new zzad(zznVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zze;
    }

    public final int zzc() {
        return this.zzh.size();
    }

    public final int zzd() {
        return this.zzi.size();
    }

    public final List<Integer> zzf() {
        return this.zzg;
    }

    public final List<Integer> zzg() {
        return this.zzh;
    }

    public final List<Integer> zzh() {
        return this.zzi;
    }

    public final List<Integer> zzi() {
        return this.zzk;
    }
}
