package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiMetadata;
import java.util.Objects;
import xsna.o100;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
final class zzev extends zzfa {
    final /* synthetic */ zzfb zza;
    final /* synthetic */ zzew zzb;

    public zzev(zzew zzewVar, zzfb zzfbVar) {
        this.zza = zzfbVar;
        Objects.requireNonNull(zzewVar);
        this.zzb = zzewVar;
    }

    @Override // com.google.android.gms.internal.cast.zzfb
    public final void zzb(int i, @Nullable ApiMetadata apiMetadata) throws RemoteException {
        o100 o100Var;
        o100Var = zzew.zze;
        o100Var.a("onRemoteDisplayEnded", new Object[0]);
        zzfb zzfbVar = this.zza;
        if (zzfbVar != null) {
            zzfbVar.zzb(i, apiMetadata);
        }
        this.zzb.zzs();
    }
}
