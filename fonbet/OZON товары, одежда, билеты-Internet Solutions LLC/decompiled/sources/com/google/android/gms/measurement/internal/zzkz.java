package com.google.android.gms.measurement.internal;

/* loaded from: classes9.dex */
abstract class zzkz extends zzky {
    private boolean zza;

    zzkz(zzll zzllVar) {
        super(zzllVar);
        this.zzf.zzL();
    }

    protected final void zzW() {
        if (!zzY()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzX() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzb();
        this.zzf.zzG();
        this.zza = true;
    }

    final boolean zzY() {
        return this.zza;
    }

    protected abstract boolean zzb();
}
