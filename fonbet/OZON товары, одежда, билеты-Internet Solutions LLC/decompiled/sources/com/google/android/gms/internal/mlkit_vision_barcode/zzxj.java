package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.GmsLogger;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
final class zzxj implements zzeh {
    final /* synthetic */ zzrc zza;
    final /* synthetic */ float zzb;
    final /* synthetic */ zzxn zzc;
    final /* synthetic */ float zzd;
    final /* synthetic */ zzxk zze;

    zzxj(zzxk zzxkVar, zzrc zzrcVar, float f7, zzxn zzxnVar, float f11) {
        this.zza = zzrcVar;
        this.zzb = f7;
        this.zzc = zzxnVar;
        this.zzd = f11;
        this.zze = zzxkVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeh
    public final void zza(Throwable th2) {
        GmsLogger gmsLogger;
        AtomicBoolean atomicBoolean;
        gmsLogger = zzxk.zzf;
        gmsLogger.w("AutoZoom", "Unable to set zoom to " + this.zzd, th2);
        atomicBoolean = this.zze.zzg;
        atomicBoolean.set(false);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeh
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AtomicBoolean atomicBoolean;
        Float f7 = (Float) obj;
        if (f7.floatValue() >= 1.0f) {
            zzxk.zzg(this.zze, f7.floatValue());
            this.zze.zzq(this.zza, this.zzb, f7.floatValue(), this.zzc);
        }
        atomicBoolean = this.zze.zzg;
        atomicBoolean.set(false);
    }
}
