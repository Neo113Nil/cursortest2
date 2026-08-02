package com.google.android.gms.internal.mlkit_vision_barcode;

import B0.A0;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes9.dex */
final class zzew extends zzef implements RunnableFuture {
    private volatile zzer zzc;

    zzew(zzxh zzxhVar) {
        this.zzc = new zzev(this, zzxhVar);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzer zzerVar = this.zzc;
        if (zzerVar != null) {
            zzerVar.run();
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz
    protected final String zzf() {
        zzer zzerVar = this.zzc;
        return zzerVar != null ? A0.b("task=[", zzerVar.toString(), "]") : super.zzf();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz
    protected final void zzm() {
        zzer zzerVar;
        if (zzp() && (zzerVar = this.zzc) != null) {
            zzerVar.zze();
        }
        this.zzc = null;
    }
}
