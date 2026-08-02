package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C3140l;
import com.google.android.gms.common.api.internal.InterfaceC3153s;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzbo implements InterfaceC3153s, zzcs {
    final /* synthetic */ zzbp zza;
    private final zzbn zzb;
    private C3140l zzc;
    private boolean zzd = true;

    public zzbo(zzbp zzbpVar, C3140l c3140l, zzbn zzbnVar) {
        this.zza = zzbpVar;
        this.zzc = c3140l;
        this.zzb = zzbnVar;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
    public final /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) {
        C3140l.a b10;
        boolean z10;
        zzda zzdaVar = (zzda) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        synchronized (this) {
            b10 = this.zzc.b();
            z10 = this.zzd;
            this.zzc.a();
        }
        if (b10 == null) {
            taskCompletionSource.setResult(Boolean.FALSE);
        } else {
            this.zzb.zza(zzdaVar, b10, z10, taskCompletionSource);
        }
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final synchronized C3140l zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final void zzb() {
        C3140l.a b10;
        synchronized (this) {
            this.zzd = false;
            b10 = this.zzc.b();
        }
        if (b10 != null) {
            this.zza.doUnregisterEventListener(b10, 2441);
        }
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final synchronized void zzc(C3140l c3140l) {
        C3140l c3140l2 = this.zzc;
        if (c3140l2 != c3140l) {
            c3140l2.a();
            this.zzc = c3140l;
        }
    }
}
