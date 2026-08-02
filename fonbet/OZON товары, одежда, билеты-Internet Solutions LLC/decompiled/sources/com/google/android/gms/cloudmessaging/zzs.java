package com.google.android.gms.cloudmessaging;

import Pk0.a;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
abstract class zzs {
    final int zza;
    final TaskCompletionSource zzb = new TaskCompletionSource();
    final int zzc;
    final Bundle zzd;

    zzs(int i11, int i12, Bundle bundle) {
        this.zza = i11;
        this.zzc = i12;
        this.zzd = bundle;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request { what=");
        sb2.append(this.zzc);
        sb2.append(" id=");
        sb2.append(this.zza);
        sb2.append(" oneWay=");
        return a.a("}", sb2, zzb());
    }

    abstract void zza(Bundle bundle);

    abstract boolean zzb();

    final void zzc(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + zztVar.toString());
        }
        this.zzb.setException(zztVar);
    }

    final void zzd(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(obj));
        }
        this.zzb.setResult(obj);
    }
}
