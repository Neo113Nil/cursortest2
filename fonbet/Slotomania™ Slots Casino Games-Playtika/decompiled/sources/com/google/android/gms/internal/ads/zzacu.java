package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzacu {
    private final Context zza;
    private boolean zzb;
    private zzvn zzc = zzvn.zzb;
    private final zzuz zzd;
    private Handler zze;
    private zzaeh zzf;

    public zzacu(Context context) {
        this.zza = context;
        this.zzd = new zzut(context, null, null);
    }

    public final zzacu zza(zzvn zzvnVar) {
        this.zzc = zzvnVar;
        return this;
    }

    public final zzacu zzb(Handler handler) {
        this.zze = handler;
        return this;
    }

    public final zzacu zzc(zzaeh zzaehVar) {
        this.zzf = zzaehVar;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r3.zzf != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzacw zzd() {
        boolean z;
        zzgsw.zzi(!this.zzb);
        Handler handler = this.zze;
        if (handler != null || this.zzf != null) {
            z = false;
            if (handler != null) {
            }
            zzgsw.zzi(z);
            this.zzb = true;
            return new zzacw(this);
        }
        z = true;
        zzgsw.zzi(z);
        this.zzb = true;
        return new zzacw(this);
    }

    final /* synthetic */ Context zze() {
        return this.zza;
    }

    final /* synthetic */ zzvn zzf() {
        return this.zzc;
    }

    final /* synthetic */ zzuz zzg() {
        return this.zzd;
    }

    final /* synthetic */ Handler zzh() {
        return this.zze;
    }

    final /* synthetic */ zzaeh zzi() {
        return this.zzf;
    }
}
