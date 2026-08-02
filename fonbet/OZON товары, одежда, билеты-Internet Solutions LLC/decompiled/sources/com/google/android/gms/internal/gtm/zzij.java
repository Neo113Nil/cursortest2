package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes9.dex */
final class zzij implements zzig {
    final /* synthetic */ zzik zza;
    private final Handler zzb;

    /* synthetic */ zzij(zzik zzikVar, zzii zziiVar) {
        Context context;
        this.zza = zzikVar;
        context = zzikVar.zzc;
        this.zzb = new zzga(context.getMainLooper(), new zzih(this));
    }

    private final Message zzd() {
        Object obj;
        Handler handler = this.zzb;
        obj = zzik.zza;
        return handler.obtainMessage(1, obj);
    }

    @Override // com.google.android.gms.internal.gtm.zzig
    public final void zza() {
        Object obj;
        Handler handler = this.zzb;
        obj = zzik.zza;
        handler.removeMessages(1, obj);
    }

    @Override // com.google.android.gms.internal.gtm.zzig
    public final void zzb() {
        Object obj;
        Handler handler = this.zzb;
        obj = zzik.zza;
        handler.removeMessages(1, obj);
        this.zzb.sendMessage(zzd());
    }

    @Override // com.google.android.gms.internal.gtm.zzig
    public final void zzc(long j11) {
        Object obj;
        Handler handler = this.zzb;
        obj = zzik.zza;
        handler.removeMessages(1, obj);
        this.zzb.sendMessageDelayed(zzd(), 1800000L);
    }
}
