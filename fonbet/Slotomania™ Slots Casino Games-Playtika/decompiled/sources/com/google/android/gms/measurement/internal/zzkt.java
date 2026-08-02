package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes8.dex */
abstract class zzkt extends zzks {
    private boolean zza;

    zzkt(zzlg zzlgVar) {
        super(zzlgVar);
        this.zzf.zzM();
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
        this.zzf.zzH();
        this.zza = true;
    }

    final boolean zzY() {
        return this.zza;
    }

    protected abstract boolean zzb();
}
