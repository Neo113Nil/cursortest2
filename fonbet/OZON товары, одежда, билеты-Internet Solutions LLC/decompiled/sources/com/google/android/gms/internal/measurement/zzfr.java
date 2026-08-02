package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class zzfr extends zzjy implements zzlk {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzfr() {
        super(r0);
        zzfs zzfsVar;
        zzfsVar = zzfs.zza;
    }

    public final int zza() {
        return ((zzfs) this.zza).zzb();
    }

    public final long zzb() {
        return ((zzfs) this.zza).zzc();
    }

    public final long zzc() {
        return ((zzfs) this.zza).zzd();
    }

    public final zzfr zzd(Iterable iterable) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzfs.zzm((zzfs) this.zza, iterable);
        return this;
    }

    public final zzfr zze(zzfv zzfvVar) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzfs.zzk((zzfs) this.zza, (zzfw) zzfvVar.zzaE());
        return this;
    }

    public final zzfr zzf(zzfw zzfwVar) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzfs.zzk((zzfs) this.zza, zzfwVar);
        return this;
    }

    public final zzfr zzg() {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        ((zzfs) this.zza).zzf = zzkc.zzbG();
        return this;
    }

    public final zzfr zzh(int i11) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzfs.zzo((zzfs) this.zza, i11);
        return this;
    }

    public final zzfr zzi(String str) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzfs.zzp((zzfs) this.zza, str);
        return this;
    }

    public final zzfr zzj(int i11, zzfv zzfvVar) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzfs.zzj((zzfs) this.zza, i11, (zzfw) zzfvVar.zzaE());
        return this;
    }

    public final zzfr zzk(int i11, zzfw zzfwVar) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzfs.zzj((zzfs) this.zza, i11, zzfwVar);
        return this;
    }

    public final zzfr zzl(long j11) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzfs.zzr((zzfs) this.zza, j11);
        return this;
    }

    public final zzfr zzm(long j11) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzfs.zzq((zzfs) this.zza, j11);
        return this;
    }

    public final zzfw zzn(int i11) {
        return ((zzfs) this.zza).zzg(i11);
    }

    public final String zzo() {
        return ((zzfs) this.zza).zzh();
    }

    public final List zzp() {
        return Collections.unmodifiableList(((zzfs) this.zza).zzi());
    }

    public final boolean zzq() {
        return ((zzfs) this.zza).zzu();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    /* synthetic */ zzfr(zzfj zzfjVar) {
        super(r1);
        zzfs zzfsVar;
        zzfsVar = zzfs.zza;
    }
}
