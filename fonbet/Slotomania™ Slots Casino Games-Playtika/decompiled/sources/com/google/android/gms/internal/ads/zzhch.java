package com.google.android.gms.internal.ads;

import com.ironsource.X3;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzhch extends zzhaz implements RunnableFuture {
    private volatile zzhbp zza;

    zzhch(zzhap zzhapVar) {
        this.zza = new zzhcf(this, zzhapVar);
    }

    static zzhch zze(Runnable runnable, Object obj) {
        return new zzhch(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzhbp zzhbpVar = this.zza;
        if (zzhbpVar != null) {
            zzhbpVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhab
    protected final void zzc() {
        zzhbp zzhbpVar;
        if (zzj() && (zzhbpVar = this.zza) != null) {
            zzhbpVar.zzh();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhab
    protected final String zzd() {
        zzhbp zzhbpVar = this.zza;
        if (zzhbpVar == null) {
            return super.zzd();
        }
        String obj = zzhbpVar.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 7);
        sb.append("task=[");
        sb.append(obj);
        sb.append(X3.j.e);
        return sb.toString();
    }

    zzhch(Callable callable) {
        this.zza = new zzhcg(this, callable);
    }
}
