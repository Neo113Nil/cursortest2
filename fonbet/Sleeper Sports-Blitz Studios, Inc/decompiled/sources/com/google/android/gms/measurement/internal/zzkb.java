package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
final class zzkb implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdd zza;
    private final /* synthetic */ zziz zzb;

    zzkb(zziz zzizVar, com.google.android.gms.internal.measurement.zzdd zzddVar) {
        this.zza = zzddVar;
        this.zzb = zzizVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Long valueOf;
        zzml zzp = this.zzb.zzp();
        if (!zzp.zzk().zzn().zzj()) {
            zzp.zzj().zzv().zza("Analytics storage consent denied; will not get session id");
        } else if (!zzp.zzk().zza(zzp.zzb().currentTimeMillis()) && zzp.zzk().zzl.zza() != 0) {
            valueOf = Long.valueOf(zzp.zzk().zzl.zza());
            if (valueOf == null) {
                this.zzb.zzu.zzt().zza(this.zza, valueOf.longValue());
                return;
            }
            try {
                this.zza.zza(null);
                return;
            } catch (RemoteException e) {
                this.zzb.zzu.zzj().zzg().zza("getSessionId failed with exception", e);
                return;
            }
        }
        valueOf = null;
        if (valueOf == null) {
        }
    }
}
