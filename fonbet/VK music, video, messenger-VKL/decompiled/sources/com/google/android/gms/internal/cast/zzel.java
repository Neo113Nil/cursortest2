package com.google.android.gms.internal.cast;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiMetadata;
import java.util.Objects;
import xsna.o100;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
final class zzel extends zzfa {
    final /* synthetic */ zzet zza;

    public zzel(zzet zzetVar) {
        Objects.requireNonNull(zzetVar);
        this.zza = zzetVar;
    }

    @Override // com.google.android.gms.internal.cast.zzfb
    public final void zzb(int i, @Nullable ApiMetadata apiMetadata) {
        o100 o100Var;
        o100Var = zzet.zzb;
        o100Var.a("onRemoteDisplayEnded", new Object[0]);
        this.zza.zza();
    }
}
