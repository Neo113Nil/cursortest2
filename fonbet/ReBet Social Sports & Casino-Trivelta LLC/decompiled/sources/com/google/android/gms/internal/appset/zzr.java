package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.common.C3171d;
import com.google.android.gms.common.api.b;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import u9.InterfaceC6532b;
import u9.c;

/* loaded from: classes2.dex */
public final class zzr implements InterfaceC6532b {
    private final InterfaceC6532b zza;
    private final InterfaceC6532b zzb;

    public zzr(Context context) {
        this.zza = new zzp(context, C3171d.h());
        this.zzb = zzl.zzc(context);
    }

    public static /* synthetic */ Task zza(zzr zzrVar, Task task) {
        if (!task.isSuccessful() && !task.isCanceled()) {
            Exception exception = task.getException();
            if (exception instanceof b) {
                int statusCode = ((b) exception).getStatusCode();
                if (statusCode == 43001 || statusCode == 43002 || statusCode == 43003 || statusCode == 17) {
                    return zzrVar.zzb.getAppSetIdInfo();
                }
                if (statusCode == 43000) {
                    return Tasks.forException(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                }
                if (statusCode == 15) {
                    return Tasks.forException(new Exception("The operation to get app set ID timed out. Please try again later."));
                }
            }
        }
        return task;
    }

    @Override // u9.InterfaceC6532b
    public final Task<c> getAppSetIdInfo() {
        return this.zza.getAppSetIdInfo().continueWithTask(new Continuation() { // from class: com.google.android.gms.internal.appset.zzq
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return zzr.zza(zzr.this, task);
            }
        });
    }
}
