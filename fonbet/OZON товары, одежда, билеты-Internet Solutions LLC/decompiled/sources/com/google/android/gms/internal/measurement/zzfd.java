package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class zzfd extends zzjy implements zzlk {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzfd() {
        super(r0);
        zzfe zzfeVar;
        zzfeVar = zzfe.zza;
    }

    public final int zza() {
        return ((zzfe) this.zza).zzb();
    }

    public final zzfc zzb(int i11) {
        return ((zzfe) this.zza).zzd(i11);
    }

    public final zzfd zzc() {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        ((zzfe) this.zza).zzk = zzkc.zzbG();
        return this;
    }

    public final zzfd zzd(int i11, zzfb zzfbVar) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzfe.zzo((zzfe) this.zza, i11, (zzfc) zzfbVar.zzaE());
        return this;
    }

    public final String zze() {
        return ((zzfe) this.zza).zzi();
    }

    public final List zzf() {
        return Collections.unmodifiableList(((zzfe) this.zza).zzj());
    }

    public final List zzg() {
        return Collections.unmodifiableList(((zzfe) this.zza).zzk());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    /* synthetic */ zzfd(zzey zzeyVar) {
        super(r1);
        zzfe zzfeVar;
        zzfeVar = zzfe.zza;
    }
}
