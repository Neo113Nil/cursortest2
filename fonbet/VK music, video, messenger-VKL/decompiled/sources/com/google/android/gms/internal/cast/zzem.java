package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.c;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
final class zzem extends zzer {
    final /* synthetic */ String zza;
    final /* synthetic */ zzet zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzem(zzet zzetVar, c cVar, String str) {
        super(zzetVar, cVar);
        this.zza = str;
        Objects.requireNonNull(zzetVar);
        this.zzb = zzetVar;
    }

    @Override // com.google.android.gms.internal.cast.zzer, com.google.android.gms.common.api.internal.a
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void doExecute(zzew zzewVar) throws RemoteException {
        zzewVar.zzp(new zzep(this, zzewVar), this.zzb.zzf(), this.zza);
    }
}
