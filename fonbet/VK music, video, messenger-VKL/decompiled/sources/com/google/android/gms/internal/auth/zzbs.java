package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.c;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
final class zzbs extends zzbj {
    public zzbs(zzbt zzbtVar, c cVar) {
        super(cVar);
    }

    @Override // com.google.android.gms.internal.auth.zzbj
    public final void zza(Context context, zzbh zzbhVar) throws RemoteException {
        zzbhVar.zzd(new zzbr(this));
    }
}
