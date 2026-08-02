package com.google.android.gms.internal.gtm;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes9.dex */
final class zzih implements Handler.Callback {
    final /* synthetic */ zzij zza;

    zzih(zzij zzijVar) {
        this.zza = zzijVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object obj;
        boolean zzn;
        if (message.what == 1) {
            obj = zzik.zza;
            if (obj.equals(message.obj)) {
                this.zza.zza.zzi();
                zzn = this.zza.zza.zzn();
                if (!zzn) {
                    this.zza.zzc(1800000L);
                }
            }
        }
        return true;
    }
}
