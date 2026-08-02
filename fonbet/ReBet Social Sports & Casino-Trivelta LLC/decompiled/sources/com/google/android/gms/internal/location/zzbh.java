package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.internal.InterfaceC3153s;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzbh implements InterfaceC3153s {
    public final /* synthetic */ CurrentLocationRequest zza;
    public final /* synthetic */ CancellationToken zzb;

    public /* synthetic */ zzbh(CurrentLocationRequest currentLocationRequest, CancellationToken cancellationToken) {
        this.zza = currentLocationRequest;
        this.zzb = cancellationToken;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
    public final void accept(Object obj, Object obj2) {
        C3117a c3117a = zzbp.zzb;
        ((zzda) obj).zzs(this.zza, this.zzb, (TaskCompletionSource) obj2);
    }
}
